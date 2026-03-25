package org.apache.http.impl.cookie;

import java.util.Date;
import o.InterfaceC59609zkK;

/* JADX INFO: loaded from: classes13.dex */
public class BasicClientCookie2 extends BasicClientCookie implements InterfaceC59609zkK {
    private static final long serialVersionUID = -7744598295706617057L;
    private String commentURL;
    private boolean discard;
    private int[] ports;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.impl.cookie.BasicClientCookie
    public String getCommentURL() {
        return this.commentURL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.apache.http.impl.cookie.BasicClientCookie, o.InterfaceC59601zkC
    public int[] getPorts() {
        return this.ports;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59609zkK
    public void setCommentURL(String str) {
        this.commentURL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59609zkK
    public void setDiscard(boolean z) {
        this.discard = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59609zkK
    public void setPorts(int[] iArr) {
        this.ports = iArr;
    }

    public BasicClientCookie2(String str, String str2) {
        super(str, str2);
    }

    @Override // org.apache.http.impl.cookie.BasicClientCookie
    public boolean isPersistent() {
        return !this.discard && super.isPersistent();
    }

    @Override // org.apache.http.impl.cookie.BasicClientCookie, o.InterfaceC59601zkC
    public boolean isExpired(Date date) {
        return this.discard || super.isExpired(date);
    }

    @Override // org.apache.http.impl.cookie.BasicClientCookie
    public Object clone() throws CloneNotSupportedException {
        BasicClientCookie2 basicClientCookie2 = (BasicClientCookie2) super.clone();
        int[] iArr = this.ports;
        if (iArr != null) {
            basicClientCookie2.ports = (int[]) iArr.clone();
        }
        return basicClientCookie2;
    }
}
