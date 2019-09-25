package cn.flower;/*
 @author flower
 @DESCRIPTION 
 @create 2019/9/24
*/

import cn.flower.mapper.TbItemMapper;
import cn.flower.pojo.TbItem;
import cn.flower.service.ItemService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={ "classpath:spring/applicationContext-dao.xml","classpath:spring/applicationContext-service.xml","classpath:spring/applicationContext-trans.xml", "classpath:spring/springmvc.xml"})
public class DemoTest {

    @Autowired
    private ItemService itemService;

    @Autowired
    private  TbItemMapper tbItemMapper;

    //@Test
    public void fn1() {

        TbItem item = itemService.getItemById(536563l);
        //TbItem item = tbItemMapper.selectByPrimaryKey(536563l);
        //TbItem item = tbItemMapper.getItemById(536563l);

        System.out.println(item.getTitle());


    }
}
