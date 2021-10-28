package io.honghu.singleton;


import com.sun.tools.javac.util.Assert;
import lombok.Getter;

/**
 * 多渠道单例配置类
 */
public final class Singleton_5_Stars_05_AiConfig {

    private static volatile Singleton_5_Stars_05_AiConfig singleton;

    public final Ali ali;

    private Singleton_5_Stars_05_AiConfig(Initializer initializer) {
        Assert.checkNonNull(initializer.ali, "未配置阿里相关账号");
        ali = initializer.ali;
    }

    /**
     * Get singleton instance of {@link Singleton_5_Stars_05_AiConfig}.
     *
     * @return {@link Singleton_5_Stars_05_AiConfig}
     */
    public static Singleton_5_Stars_05_AiConfig get() {
        if (singleton == null) {
            throw new RuntimeException("配置未初始化");
        }

        return singleton;
    }

    public static Initializer initializer() {
        return new Initializer();
    }

    public static class Initializer {

        private Ali ali;

        public Initializer withAli(Ali config) {
            this.ali = config;
            return this;
        }

        public void init() {
            if (null == singleton) {
                synchronized (Initializer.class) {
                    if (null == singleton) {
                        singleton = new Singleton_5_Stars_05_AiConfig(this);
                    }
                }
            }
        }
    }


    @Getter
    public final static class Ali {

        private String url;

        public Ali(String url) {
            this.url = url;
        }
    }

}

class Test {
    public static void main(String[] args) {
        Singleton_5_Stars_05_AiConfig.Ali config = new Singleton_5_Stars_05_AiConfig.Ali("url");
        Singleton_5_Stars_05_AiConfig.initializer().withAli(config).init();
        System.out.println(Singleton_5_Stars_05_AiConfig.get().ali.getUrl());
    }
}