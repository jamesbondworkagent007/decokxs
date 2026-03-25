package org.apache.http.message;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.Serializable;
import o.C59851zoo;
import o.C59852zop;
import o.InterfaceC59582zjk;

/* JADX INFO: loaded from: classes13.dex */
public class BasicNameValuePair implements InterfaceC59582zjk, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59582zjk
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59582zjk
    public String getValue() {
        return this.value;
    }

    public BasicNameValuePair(String str, String str2) {
        this.name = (String) C59851zoo.AEQbTJ(str, "Name");
        this.value = str2;
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb.append(this.name);
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(this.value);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC59582zjk)) {
            return false;
        }
        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
        return this.name.equals(basicNameValuePair.name) && C59852zop.OLrzqt(this.value, basicNameValuePair.value);
    }

    public int hashCode() {
        return C59852zop.EZpvd(C59852zop.EZpvd(17, this.name), this.value);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
