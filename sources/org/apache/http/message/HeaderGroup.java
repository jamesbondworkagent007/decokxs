package org.apache.http.message;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import o.C59764znG;
import o.InterfaceC59518ziZ;
import o.InterfaceC59574zjc;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class HeaderGroup implements Cloneable, Serializable {
    private static final long serialVersionUID = 2608834160639271617L;
    private final InterfaceC59518ziZ[] EMPTY = new InterfaceC59518ziZ[0];
    private final List<InterfaceC59518ziZ> headers = new ArrayList(16);

    public void clear() {
        this.headers.clear();
    }

    public void addHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        if (interfaceC59518ziZ == null) {
            return;
        }
        this.headers.add(interfaceC59518ziZ);
    }

    public void removeHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        if (interfaceC59518ziZ == null) {
            return;
        }
        this.headers.remove(interfaceC59518ziZ);
    }

    public void updateHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        if (interfaceC59518ziZ == null) {
            return;
        }
        for (int i = 0; i < this.headers.size(); i++) {
            if (this.headers.get(i).getName().equalsIgnoreCase(interfaceC59518ziZ.getName())) {
                this.headers.set(i, interfaceC59518ziZ);
                return;
            }
        }
        this.headers.add(interfaceC59518ziZ);
    }

    public void setHeaders(InterfaceC59518ziZ[] interfaceC59518ziZArr) {
        clear();
        if (interfaceC59518ziZArr == null) {
            return;
        }
        Collections.addAll(this.headers, interfaceC59518ziZArr);
    }

    public InterfaceC59518ziZ getCondensedHeader(String str) {
        InterfaceC59518ziZ[] headers = getHeaders(str);
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

    public InterfaceC59518ziZ[] getHeaders(String str) {
        ArrayList arrayList = null;
        for (int i = 0; i < this.headers.size(); i++) {
            InterfaceC59518ziZ interfaceC59518ziZ = this.headers.get(i);
            if (interfaceC59518ziZ.getName().equalsIgnoreCase(str)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(interfaceC59518ziZ);
            }
        }
        return arrayList != null ? (InterfaceC59518ziZ[]) arrayList.toArray(new InterfaceC59518ziZ[arrayList.size()]) : this.EMPTY;
    }

    public InterfaceC59518ziZ getFirstHeader(String str) {
        for (int i = 0; i < this.headers.size(); i++) {
            InterfaceC59518ziZ interfaceC59518ziZ = this.headers.get(i);
            if (interfaceC59518ziZ.getName().equalsIgnoreCase(str)) {
                return interfaceC59518ziZ;
            }
        }
        return null;
    }

    public InterfaceC59518ziZ getLastHeader(String str) {
        for (int size = this.headers.size() - 1; size >= 0; size--) {
            InterfaceC59518ziZ interfaceC59518ziZ = this.headers.get(size);
            if (interfaceC59518ziZ.getName().equalsIgnoreCase(str)) {
                return interfaceC59518ziZ;
            }
        }
        return null;
    }

    public InterfaceC59518ziZ[] getAllHeaders() {
        List<InterfaceC59518ziZ> list = this.headers;
        return (InterfaceC59518ziZ[]) list.toArray(new InterfaceC59518ziZ[list.size()]);
    }

    public boolean containsHeader(String str) {
        for (int i = 0; i < this.headers.size(); i++) {
            if (this.headers.get(i).getName().equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public InterfaceC59574zjc iterator() {
        return new C59764znG(this.headers, null);
    }

    public InterfaceC59574zjc iterator(String str) {
        return new C59764znG(this.headers, str);
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
