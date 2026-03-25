package o;

import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C59714zmJ implements InterfaceC59650zkz {
    public final java.util.Map<java.lang.String, java.lang.Boolean> EZpvd = AEQbTJ();
    public final C59600zkB KWHzl;
    public final InterfaceC59650zkz copydefault;

    public static java.util.Map<java.lang.String, java.lang.Boolean> AEQbTJ() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        concurrentHashMap.put(".localhost.", bool);
        concurrentHashMap.put(".test.", bool);
        concurrentHashMap.put(".local.", bool);
        concurrentHashMap.put(".local", bool);
        concurrentHashMap.put(".localdomain", bool);
        return concurrentHashMap;
    }

    public C59714zmJ(InterfaceC59650zkz interfaceC59650zkz, C59600zkB c59600zkB) {
        this.copydefault = (InterfaceC59650zkz) C59851zoo.AEQbTJ(interfaceC59650zkz, "Cookie handler");
        this.KWHzl = (C59600zkB) C59851zoo.AEQbTJ(c59600zkB, "Public suffix matcher");
    }

    @Override // o.InterfaceC59603zkE
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        java.lang.String domain = interfaceC59601zkC.getDomain();
        int iIndexOf = domain.indexOf(46);
        if (iIndexOf >= 0) {
            if (!this.EZpvd.containsKey(domain.substring(iIndexOf)) && this.KWHzl.EZpvd(domain)) {
                return false;
            }
        } else if (!domain.equalsIgnoreCase(c59602zkD.copydefault()) && this.KWHzl.EZpvd(domain)) {
            return false;
        }
        return this.copydefault.KWHzl(interfaceC59601zkC, c59602zkD);
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59606zkH interfaceC59606zkH, java.lang.String str) throws MalformedCookieException {
        this.copydefault.OLrzqt(interfaceC59606zkH, str);
    }

    @Override // o.InterfaceC59603zkE
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        this.copydefault.OLrzqt(interfaceC59601zkC, c59602zkD);
    }

    @Override // o.InterfaceC59650zkz
    public java.lang.String OLrzqt() {
        return this.copydefault.OLrzqt();
    }

    public static InterfaceC59650zkz KWHzl(InterfaceC59650zkz interfaceC59650zkz, C59600zkB c59600zkB) {
        C59851zoo.AEQbTJ(interfaceC59650zkz, "Cookie attribute handler");
        return c59600zkB != null ? new C59714zmJ(interfaceC59650zkz, c59600zkB) : interfaceC59650zkz;
    }
}
