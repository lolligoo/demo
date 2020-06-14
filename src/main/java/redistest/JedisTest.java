package redistest;

import redis.clients.jedis.Jedis;

public class JedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());
        jedis.set("ruuu","ruu");
        System.out.println(jedis.get("ruuu"));
    }
}
