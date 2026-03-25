package org.apache.http.impl.cookie;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.C59851zoo;
import o.InterfaceC59606zkH;
import o.InterfaceC59648zkx;

/* JADX INFO: loaded from: classes13.dex */
public class BasicClientCookie implements InterfaceC59606zkH, InterfaceC59648zkx, Cloneable, Serializable {
    private static final long serialVersionUID = -3869795591041535538L;
    private Map<String, String> attribs;
    private String cookieComment;
    private String cookieDomain;
    private Date cookieExpiryDate;
    private String cookiePath;
    private int cookieVersion;
    private Date creationDate;
    private boolean isSecure;
    private final String name;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getComment() {
        return this.cookieComment;
    }

    public String getCommentURL() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Date getCreationDate() {
        return this.creationDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public String getDomain() {
        return this.cookieDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public Date getExpiryDate() {
        return this.cookieExpiryDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public String getPath() {
        return this.cookiePath;
    }

    @Override // o.InterfaceC59601zkC
    public int[] getPorts() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public int getVersion() {
        return this.cookieVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isPersistent() {
        return this.cookieExpiryDate != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59601zkC
    public boolean isSecure() {
        return this.isSecure;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59606zkH
    public void setComment(String str) {
        this.cookieComment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59606zkH
    public void setExpiryDate(Date date) {
        this.cookieExpiryDate = date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59606zkH
    public void setPath(String str) {
        this.cookiePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59606zkH
    public void setSecure(boolean z) {
        this.isSecure = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59606zkH
    public void setVersion(int i) {
        this.cookieVersion = i;
    }

    public BasicClientCookie(String str, String str2) {
        C59851zoo.AEQbTJ(str, "Name");
        this.name = str;
        this.attribs = new HashMap();
        this.value = str2;
    }

    @Override // o.InterfaceC59606zkH
    public void setDomain(String str) {
        this.cookieDomain = str != null ? str.toLowerCase(Locale.ROOT) : null;
    }

    @Override // o.InterfaceC59601zkC
    public boolean isExpired(Date date) {
        C59851zoo.AEQbTJ(date, "Date");
        Date date2 = this.cookieExpiryDate;
        return date2 != null && date2.getTime() <= date.getTime();
    }

    public void setAttribute(String str, String str2) {
        this.attribs.put(str, str2);
    }

    @Override // o.InterfaceC59648zkx
    public String getAttribute(String str) {
        return this.attribs.get(str);
    }

    @Override // o.InterfaceC59648zkx
    public boolean containsAttribute(String str) {
        return this.attribs.containsKey(str);
    }

    public boolean removeAttribute(String str) {
        return this.attribs.remove(str) != null;
    }

    public Object clone() throws CloneNotSupportedException {
        BasicClientCookie basicClientCookie = (BasicClientCookie) super.clone();
        basicClientCookie.attribs = new HashMap(this.attribs);
        return basicClientCookie;
    }

    public String toString() {
        return "[version: " + Integer.toString(this.cookieVersion) + "][name: " + this.name + "][value: " + this.value + "][domain: " + this.cookieDomain + "][path: " + this.cookiePath + "][expiry: " + this.cookieExpiryDate + "]";
    }
}
