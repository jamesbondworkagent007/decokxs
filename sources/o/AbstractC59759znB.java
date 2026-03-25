package o;

import org.apache.http.message.BasicHeader;
import org.apache.http.message.HeaderGroup;
import org.apache.http.params.BasicHttpParams;

/* JADX INFO: renamed from: o.znB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59759znB implements InterfaceC59581zjj {
    public HeaderGroup headergroup;

    @java.lang.Deprecated
    public InterfaceC59779znV params;

    @java.lang.Deprecated
    public AbstractC59759znB(InterfaceC59779znV interfaceC59779znV) {
        this.headergroup = new HeaderGroup();
        this.params = interfaceC59779znV;
    }

    public AbstractC59759znB() {
        this(null);
    }

    @Override // o.InterfaceC59581zjj
    public boolean containsHeader(java.lang.String str) {
        return this.headergroup.containsHeader(str);
    }

    @Override // o.InterfaceC59581zjj
    public InterfaceC59518ziZ[] getHeaders(java.lang.String str) {
        return this.headergroup.getHeaders(str);
    }

    @Override // o.InterfaceC59581zjj
    public InterfaceC59518ziZ getFirstHeader(java.lang.String str) {
        return this.headergroup.getFirstHeader(str);
    }

    @Override // o.InterfaceC59581zjj
    public InterfaceC59518ziZ getLastHeader(java.lang.String str) {
        return this.headergroup.getLastHeader(str);
    }

    @Override // o.InterfaceC59581zjj
    public InterfaceC59518ziZ[] getAllHeaders() {
        return this.headergroup.getAllHeaders();
    }

    @Override // o.InterfaceC59581zjj
    public void addHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        this.headergroup.addHeader(interfaceC59518ziZ);
    }

    @Override // o.InterfaceC59581zjj
    public void addHeader(java.lang.String str, java.lang.String str2) {
        C59851zoo.AEQbTJ(str, "Header name");
        this.headergroup.addHeader(new BasicHeader(str, str2));
    }

    public void setHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        this.headergroup.updateHeader(interfaceC59518ziZ);
    }

    @Override // o.InterfaceC59581zjj
    public void setHeader(java.lang.String str, java.lang.String str2) {
        C59851zoo.AEQbTJ(str, "Header name");
        this.headergroup.updateHeader(new BasicHeader(str, str2));
    }

    @Override // o.InterfaceC59581zjj
    public void setHeaders(InterfaceC59518ziZ[] interfaceC59518ziZArr) {
        this.headergroup.setHeaders(interfaceC59518ziZArr);
    }

    public void removeHeader(InterfaceC59518ziZ interfaceC59518ziZ) {
        this.headergroup.removeHeader(interfaceC59518ziZ);
    }

    @Override // o.InterfaceC59581zjj
    public void removeHeaders(java.lang.String str) {
        if (str == null) {
            return;
        }
        InterfaceC59574zjc it = this.headergroup.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.OLrzqt().getName())) {
                it.remove();
            }
        }
    }

    @Override // o.InterfaceC59581zjj
    public InterfaceC59574zjc headerIterator() {
        return this.headergroup.iterator();
    }

    @Override // o.InterfaceC59581zjj
    public InterfaceC59574zjc headerIterator(java.lang.String str) {
        return this.headergroup.iterator(str);
    }

    @Override // o.InterfaceC59581zjj
    @java.lang.Deprecated
    public InterfaceC59779znV getParams() {
        if (this.params == null) {
            this.params = new BasicHttpParams();
        }
        return this.params;
    }

    @Override // o.InterfaceC59581zjj
    @java.lang.Deprecated
    public void setParams(InterfaceC59779znV interfaceC59779znV) {
        this.params = (InterfaceC59779znV) C59851zoo.AEQbTJ(interfaceC59779znV, "HTTP parameters");
    }
}
