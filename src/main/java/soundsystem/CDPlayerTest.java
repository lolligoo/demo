package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)//在测试开始时自动创建Spring的应用上下文
@ContextConfiguration(classes = CDPlayerConfig.class)//在CDPlayerConfig类中加载配置
public class CDPlayerTest {

    @Autowired
    private MediaPlayer player;

    @Autowired//将CompactDisc注入到测试代码中
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void  play(){
        player.play();
        assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles\n","" );
    };
}
