package o;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CredentialsProvider;

/* JADX INFO: renamed from: o.zlu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59698zlu implements CredentialsProvider {
    public final ConcurrentHashMap<C59596zjy, InterfaceC59597zjz> KWHzl = new ConcurrentHashMap<>();

    @Override // org.apache.http.client.CredentialsProvider
    public void setCredentials(C59596zjy c59596zjy, InterfaceC59597zjz interfaceC59597zjz) {
        C59851zoo.AEQbTJ(c59596zjy, "Authentication scope");
        this.KWHzl.put(c59596zjy, interfaceC59597zjz);
    }

    public static InterfaceC59597zjz copydefault(java.util.Map<C59596zjy, InterfaceC59597zjz> map, C59596zjy c59596zjy) {
        InterfaceC59597zjz interfaceC59597zjz = map.get(c59596zjy);
        if (interfaceC59597zjz != null) {
            return interfaceC59597zjz;
        }
        int i = -1;
        C59596zjy c59596zjy2 = null;
        for (C59596zjy c59596zjy3 : map.keySet()) {
            int iEZpvd = c59596zjy.EZpvd(c59596zjy3);
            if (iEZpvd > i) {
                c59596zjy2 = c59596zjy3;
                i = iEZpvd;
            }
        }
        return c59596zjy2 != null ? map.get(c59596zjy2) : interfaceC59597zjz;
    }

    @Override // org.apache.http.client.CredentialsProvider
    public InterfaceC59597zjz getCredentials(C59596zjy c59596zjy) {
        C59851zoo.AEQbTJ(c59596zjy, "Authentication scope");
        return copydefault(this.KWHzl, c59596zjy);
    }

    @Override // org.apache.http.client.CredentialsProvider
    public void clear() {
        this.KWHzl.clear();
    }

    public java.lang.String toString() {
        return this.KWHzl.toString();
    }
}
