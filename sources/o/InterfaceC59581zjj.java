package o;

import org.apache.http.ProtocolVersion;

/* JADX INFO: renamed from: o.zjj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59581zjj {
    void addHeader(java.lang.String str, java.lang.String str2);

    void addHeader(InterfaceC59518ziZ interfaceC59518ziZ);

    boolean containsHeader(java.lang.String str);

    InterfaceC59518ziZ[] getAllHeaders();

    InterfaceC59518ziZ getFirstHeader(java.lang.String str);

    InterfaceC59518ziZ[] getHeaders(java.lang.String str);

    InterfaceC59518ziZ getLastHeader(java.lang.String str);

    @java.lang.Deprecated
    InterfaceC59779znV getParams();

    ProtocolVersion getProtocolVersion();

    InterfaceC59574zjc headerIterator();

    InterfaceC59574zjc headerIterator(java.lang.String str);

    void removeHeaders(java.lang.String str);

    void setHeader(java.lang.String str, java.lang.String str2);

    void setHeaders(InterfaceC59518ziZ[] interfaceC59518ziZArr);

    @java.lang.Deprecated
    void setParams(InterfaceC59779znV interfaceC59779znV);
}
