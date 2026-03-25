package com.alibaba.sdk.android.oss.common.auth;

import com.alibaba.sdk.android.oss.common.OSSLog;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import o.yCN;

/* JADX INFO: loaded from: classes2.dex */
public class OSSFederationToken {
    private long expiration;
    private String securityToken;
    private String tempAk;
    private String tempSk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTempAK() {
        return this.tempAk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTempSK() {
        return this.tempSk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setExpiration(long j) {
        this.expiration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSecurityToken(String str) {
        this.securityToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTempAk(String str) {
        this.tempAk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTempSk(String str) {
        this.tempSk = str;
    }

    public OSSFederationToken(String str, String str2, String str3, long j) {
        setTempAk(str);
        setTempSk(str2);
        setSecurityToken(str3);
        setExpiration(j);
    }

    public OSSFederationToken(String str, String str2, String str3, String str4) {
        setTempAk(str);
        setTempSk(str2);
        setSecurityToken(str3);
        setExpirationInGMTFormat(str4);
    }

    public String toString() {
        return "OSSFederationToken [tempAk=" + this.tempAk + ", tempSk=" + this.tempSk + ", securityToken=" + this.securityToken + ", expiration=" + this.expiration + "]";
    }

    public void setExpirationInGMTFormat(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat.setTimeZone(yCN.OLrzqt("UTC"));
            this.expiration = simpleDateFormat.parse(str).getTime() / 1000;
        } catch (ParseException e) {
            if (OSSLog.isEnableLog()) {
                e.printStackTrace();
            }
            this.expiration = (DateUtil.getFixedSkewedTimeMillis() / 1000) + 30;
        }
    }
}
