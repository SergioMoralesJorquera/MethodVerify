package Methodverify.Methodverify;
import Methodverify.Methodverify.examples.Account;
import Methodverify.Methodverify.examples.Counter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MethodverifyAccountTest {

    @Mock
    Counter counter;

    @Test
    void should_verify_number_method_calls_of_Account_class(){
        //Given
        Account account = new Account(counter);

        //when
        account.incrementCounter();

        //Then
        //only](), atleastOnce()
        verify(counter, only()).increment();
        verify(counter, atLeastOnce()).increment();

        //then
        //times(x)
        for (int i=0; i< 4; i++){
            account.incrementCounter();
        }
        verify(counter, times(5)).increment();

        //then
        //times(x) using atLeast(), atMost(), never();
        for (int i=0; i< 5; i++){
            account.incrementCounter();
        }

        verify(counter, atLeast(5)).increment();
        verify(counter, atMost(10)).increment();
        verify(counter, never()).getCount();

        account.getMsg("hi");
        verify(counter).getMessage("hi");

        //verify exact argument string
    /*    counter.getMessage("account");
        verify(counter).getMessage("account");
        verify(counter).getMessage(anyString());

        //verify order interaccion
        counter.getCount();
        counter.getMessage("the account");

        verify(counter).getCount();
        verify(counter).getMessage("the account");

    */

    }
}
