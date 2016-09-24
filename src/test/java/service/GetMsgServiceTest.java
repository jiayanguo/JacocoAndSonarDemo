package service;

import app.entity.Message;
import app.service.GetMsgService;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

/**
 * Created by jiayanguo on 9/24/16.
 */
public class GetMsgServiceTest {

    protected GetMsgService getMsgService = new GetMsgService();

    @Test
    public void testGetMsg(){
        GetMsgService spy = spy(getMsgService);
        doReturn(12345L).when(spy).luckNumber();

        Message message =spy.getMsg("IT man", "welcome");
        message.setLuckNumber(spy.luckNumber());

        assertThat(message.getLuckNumber(), is(12345L));
        assertThat(message.getName(), is("IT man"));
        assertThat(message.getMessage(), is("welcome"));


    }
}
