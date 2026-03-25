package com.geetest.mobinfo;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class GtMobConfig implements ConfigInterface {
    private boolean globalHelper;
    private Map<String, Object> mobConfigMap;
    private Map<String, Object> mobDataMap;
    private Map<String, Object> mobDeviceMap;
    private Map<String, Object> mobMap;

    public static class Builder {
        private boolean globalHelper = false;
        private Map<String, Object> mobMap = new HashMap();
        private Map<String, Object> mobDeviceMap = new HashMap();
        private Map<String, Object> mobDataMap = new HashMap();
        private Map<String, Object> mobConfigMap = new HashMap();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder addConfigParam(String str, Object obj) {
            this.mobConfigMap.put(str, obj);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder addDataOutParam(String str, Object obj) {
            this.mobDataMap.put(str, obj);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder addDeviceOutParam(String str, Object obj) {
            this.mobDeviceMap.put(str, obj);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Builder addParam(String str, Object obj) {
            this.mobMap.put(str, obj);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GtMobConfig build() {
            return new GtMobConfig(this);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder setGlobalHelper(boolean z) {
            this.globalHelper = z;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Builder builder() {
        return new Builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.mobinfo.ConfigInterface
    public boolean getGlobalHelper() {
        return this.globalHelper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.mobinfo.ConfigInterface
    public Map<String, Object> getMobConfigMap() {
        return this.mobConfigMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.mobinfo.ConfigInterface
    public Map<String, Object> getMobDataMap() {
        return this.mobDataMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.mobinfo.ConfigInterface
    public Map<String, Object> getMobDeviceMap() {
        return this.mobDeviceMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.mobinfo.ConfigInterface
    public Map<String, Object> getMobMap() {
        return this.mobMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private GtMobConfig(Builder builder) {
        this.mobMap = builder.mobMap;
        this.mobDeviceMap = builder.mobDeviceMap;
        this.mobDataMap = builder.mobDataMap;
        this.globalHelper = builder.globalHelper;
        this.mobConfigMap = builder.mobConfigMap;
    }
}
