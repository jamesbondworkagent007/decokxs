package com.bytedance.applog.store.kv;

/* JADX INFO: loaded from: classes2.dex */
public class KVStoreConfig {
    public static final KVStoreConfig DEFAULT_CONFIG = new KVStoreConfig();
    public static final KVStoreConfig DEFAULT_SECURITY_CONFIG = new KVStoreConfig(true);
    public String aesKey;
    public boolean isSecurityMode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KVStoreConfig() {
        this.isSecurityMode = false;
        this.aesKey = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KVStoreConfig(boolean z) {
        this.aesKey = null;
        this.isSecurityMode = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KVStoreConfig(boolean z, String str) {
        this.isSecurityMode = z;
        this.aesKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static KVStoreConfig createCustomASEKeySecurityConfig(String str) {
        return new KVStoreConfig(true, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAesKey() {
        return this.aesKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSecurityMode() {
        return this.isSecurityMode;
    }
}
