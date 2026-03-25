package com.alibaba.sdk.android.oss.common.auth;

/* JADX INFO: loaded from: classes2.dex */
public class OSSStsTokenCredentialProvider implements OSSCredentialProvider {
    private String accessKeyId;
    private String secretKeyId;
    private String securityToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setAccessKeyId(String str) {
        this.accessKeyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSecretKeyId(String str) {
        this.secretKeyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSecurityToken(String str) {
        this.securityToken = str;
    }

    public OSSStsTokenCredentialProvider(String str, String str2, String str3) {
        setAccessKeyId(str.trim());
        setSecretKeyId(str2.trim());
        setSecurityToken(str3.trim());
    }

    public OSSStsTokenCredentialProvider(OSSFederationToken oSSFederationToken) {
        setAccessKeyId(oSSFederationToken.getTempAK().trim());
        setSecretKeyId(oSSFederationToken.getTempSK().trim());
        setSecurityToken(oSSFederationToken.getSecurityToken().trim());
    }

    @Override // com.alibaba.sdk.android.oss.common.auth.OSSCredentialProvider
    public OSSFederationToken getFederationToken() {
        return new OSSFederationToken(this.accessKeyId, this.secretKeyId, this.securityToken, Long.MAX_VALUE);
    }
}
