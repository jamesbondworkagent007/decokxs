package com.alibaba.sdk.android.oss.common.auth;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class OSSPlainTextAKSKCredentialProvider implements OSSCredentialProvider {
    private String accessKeyId;
    private String accessKeySecret;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    @Override // com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider
    public OSSFederationToken getFederationToken() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAccessKeySecret(String str) {
        this.accessKeySecret = str;
    }

    public OSSPlainTextAKSKCredentialProvider(String str, String str2) {
        setAccessKeyId(str.trim());
        setAccessKeySecret(str2.trim());
    }
}
