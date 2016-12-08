package ru.ulkowhitehorse;

import ru.ulkowhitehorse.Interfaces.AnotherClient;
import ru.ulkowhitehorse.Interfaces.Callback;
import ru.ulkowhitehorse.Interfaces.Client;

/**
 * Created by User on 08-Dec-16.
 */
public class TestIface {
    public static void main(String[] args) {
        /*Callback c = new Client();
        c.callback(42);
        */

        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob; // теперь переменная с ссылается на
                // объект типа AnotherClient
        c.callback(42);
    }
}
