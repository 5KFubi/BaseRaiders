package me.fivekfubi.api;

public class BaseRaidersAPI {
    private static BaseRaidersProvider provider;

    private BaseRaidersAPI() {}

    public static BaseRaidersProvider get() {
        if (provider == null) {
            throw new IllegalStateException("API not initialized yet");
        }
        return provider;
    }

    public static void setProvider(BaseRaidersProvider p) {
        provider = p;
    }
}
