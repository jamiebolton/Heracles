/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/jamiebolton/Heracles">Heracles</a> All rights reserved.
 */
package club.crazypenguin.test.web;

import club.crazypenguin.common.config.Global;
import club.crazypenguin.common.utils.StringUtils;
import club.crazypenguin.common.web.BaseController;
import club.crazypenguin.test.entity.TestTree;
import club.crazypenguin.test.service.TestTreeService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * 树结构生成Controller
 * @author crazypenguin
 * @version 2015-04-06
 */
@Controller
@RequestMapping(value = "${adminPath}/test/testTree")
public class TestTreeController extends BaseController {

	@Autowired
	private TestTreeService testTreeService;
	
	@ModelAttribute
	public TestTree get(@RequestParam(required=false) String id) {
		TestTree entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = testTreeService.get(id);
		}
		if (entity == null){
			entity = new TestTree();
		}
		return entity;
	}
	
	@RequiresPermissions("test:testTree:view")
	@RequestMapping(value = {"list", ""})
	public String list(TestTree testTree, HttpServletRequest request, HttpServletResponse response, Model model) {
		List<TestTree> list = testTreeService.findList(testTree); 
		model.addAttribute("list", list);
		return "heracles/test/testTreeList";
	}

	@RequiresPermissions("test:testTree:view")
	@RequestMapping(value = "form")
	public String form(TestTree testTree, Model model) {
		if (testTree.getParent()!=null && StringUtils.isNotBlank(testTree.getParent().getId())){
			testTree.setParent(testTreeService.get(testTree.getParent().getId()));
			// 获取排序号，最末节点排序号+30
			if (StringUtils.isBlank(testTree.getId())){
				TestTree testTreeChild = new TestTree();
				testTreeChild.setParent(new TestTree(testTree.getParent().getId()));
				List<TestTree> list = testTreeService.findList(testTree); 
				if (list.size() > 0){
					testTree.setSort(list.get(list.size()-1).getSort());
					if (testTree.getSort() != null){
						testTree.setSort(testTree.getSort() + 30);
					}
				}
			}
		}
		if (testTree.getSort() == null){
			testTree.setSort(30);
		}
		model.addAttribute("testTree", testTree);
		return "heracles/test/testTreeForm";
	}

	@RequiresPermissions("test:testTree:edit")
	@RequestMapping(value = "save")
	public String save(TestTree testTree, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, testTree)){
			return form(testTree, model);
		}
		testTreeService.save(testTree);
		addMessage(redirectAttributes, "保存树结构成功");
		return "redirect:"+Global.getAdminPath()+"/test/testTree/?repage";
	}
	
	@RequiresPermissions("test:testTree:edit")
	@RequestMapping(value = "delete")
	public String delete(TestTree testTree, RedirectAttributes redirectAttributes) {
		testTreeService.delete(testTree);
		addMessage(redirectAttributes, "删除树结构成功");
		return "redirect:"+Global.getAdminPath()+"/test/testTree/?repage";
	}

	@RequiresPermissions("user")
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Map<String, Object>> treeData(@RequestParam(required=false) String extId, HttpServletResponse response) {
		List<Map<String, Object>> mapList = Lists.newArrayList();
		List<TestTree> list = testTreeService.findList(new TestTree());
		for (int i=0; i<list.size(); i++){
			TestTree e = list.get(i);
			if (StringUtils.isBlank(extId) || (extId!=null && !extId.equals(e.getId()) && e.getParentIds().indexOf(","+extId+",")==-1)){
				Map<String, Object> map = Maps.newHashMap();
				map.put("id", e.getId());
				map.put("pId", e.getParentId());
				map.put("name", e.getName());
				mapList.add(map);
			}
		}
		return mapList;
	}
	
}