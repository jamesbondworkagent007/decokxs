package org.apache.httpcore.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import o.C59819zoI;
import o.InterfaceC59858zov;
import o.InterfaceC59859zow;
import org.apache.httpcore.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes24.dex */
public class HeaderGroup implements Cloneable, Serializable {
    private static final long serialVersionUID = 2608834160639271617L;
    private final InterfaceC59858zov[] EMPTY = new InterfaceC59858zov[0];
    private final List<InterfaceC59858zov> headers = new ArrayList(16);

    public void clear() {
        this.headers.clear();
    }

    public void addHeader(InterfaceC59858zov interfaceC59858zov) {
        if (interfaceC59858zov == null) {
            return;
        }
        this.headers.add(interfaceC59858zov);
    }

    public void removeHeader(InterfaceC59858zov interfaceC59858zov) {
        if (interfaceC59858zov == null) {
            return;
        }
        this.headers.remove(interfaceC59858zov);
    }

    public void updateHeader(InterfaceC59858zov interfaceC59858zov) {
        if (interfaceC59858zov == null) {
            return;
        }
        for (int i = 0; i < this.headers.size(); i++) {
            if (this.headers.get(i).getName().equalsIgnoreCase(interfaceC59858zov.getName())) {
                this.headers.set(i, interfaceC59858zov);
                return;
            }
        }
        this.headers.add(interfaceC59858zov);
    }

    public void setHeaders(InterfaceC59858zov[] interfaceC59858zovArr) {
        clear();
        if (interfaceC59858zovArr == null) {
            return;
        }
        Collections.addAll(this.headers, interfaceC59858zovArr);
    }

    public InterfaceC59858zov getCondensedHeader(String str) {
        InterfaceC59858zov[] headers = getHeaders(str);
        if (headers.length == 0) {
            return null;
        }
        if (headers.length == 1) {
            return headers[0];
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(128);
        charArrayBuffer.append(headers[0].getValue());
        for (int i = 1; i < headers.length; i++) {
            charArrayBuffer.append(", ");
            charArrayBuffer.append(headers[i].getValue());
        }
        return new BasicHeader(str.toLowerCase(Locale.ROOT), charArrayBuffer.toString());
    }

    public InterfaceC59858zov[] getHeaders(String str) {
        ArrayList arrayList = null;
        for (int i = 0; i < this.headers.size(); i++) {
            InterfaceC59858zov interfaceC59858zov = this.headers.get(i);
            if (interfaceC59858zov.getName().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC59858zov);
            }
        }
        return arrayList != null ? (InterfaceC59858zov[]) arrayList.toArray(new InterfaceC59858zov[arrayList.size()]) : this.EMPTY;
    }

    public InterfaceC59858zov getFirstHeader(String str) {
        for (int i = 0; i < this.headers.size(); i++) {
            InterfaceC59858zov interfaceC59858zov = this.headers.get(i);
            if (interfaceC59858zov.getName().equalsIgnoreCase(str)) {
                return interfaceC59858zov;
            }
        }
        return null;
    }

    public InterfaceC59858zov getLastHeader(String str) {
        for (int size = this.headers.size() - 1; size >= 0; size--) {
            InterfaceC59858zov interfaceC59858zov = this.headers.get(size);
            if (interfaceC59858zov.getName().equalsIgnoreCase(str)) {
                return interfaceC59858zov;
            }
        }
        return null;
    }

    public InterfaceC59858zov[] getAllHeaders() {
        List<InterfaceC59858zov> list = this.headers;
        return (InterfaceC59858zov[]) list.toArray(new InterfaceC59858zov[list.size()]);
    }

    public boolean containsHeader(String str) {
        for (int i = 0; i < this.headers.size(); i++) {
            if (this.headers.get(i).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC59859zow iterator() {
        return new C59819zoI(this.headers, null);
    }

    public InterfaceC59859zow iterator(String str) {
        return new C59819zoI(this.headers, str);
    }

    public HeaderGroup copy() {
        HeaderGroup headerGroup = new HeaderGroup();
        headerGroup.headers.addAll(this.headers);
        return headerGroup;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return this.headers.toString();
    }
}
