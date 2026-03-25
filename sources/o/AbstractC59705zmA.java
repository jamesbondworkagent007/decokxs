package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.impl.cookie.BasicClientCookie;

/* JADX INFO: renamed from: o.zmA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59705zmA extends AbstractC59746zmp {
    public AbstractC59705zmA() {
    }

    public AbstractC59705zmA(InterfaceC59650zkz... interfaceC59650zkzArr) {
        super(interfaceC59650zkzArr);
    }

    public static java.lang.String copydefault(C59602zkD c59602zkD) {
        java.lang.String strKWHzl = c59602zkD.KWHzl();
        int iLastIndexOf = strKWHzl.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return strKWHzl;
        }
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return strKWHzl.substring(0, iLastIndexOf);
    }

    public static java.lang.String EZpvd(C59602zkD c59602zkD) {
        return c59602zkD.copydefault();
    }

    public java.util.List<InterfaceC59601zkC> OLrzqt(InterfaceC59517ziY[] interfaceC59517ziYArr, C59602zkD c59602zkD) throws MalformedCookieException {
        java.util.ArrayList arrayList = new java.util.ArrayList(interfaceC59517ziYArr.length);
        for (InterfaceC59517ziY interfaceC59517ziY : interfaceC59517ziYArr) {
            java.lang.String strCopydefault = interfaceC59517ziY.copydefault();
            java.lang.String strKWHzl = interfaceC59517ziY.KWHzl();
            if (strCopydefault != null && !strCopydefault.isEmpty()) {
                BasicClientCookie basicClientCookie = new BasicClientCookie(strCopydefault, strKWHzl);
                basicClientCookie.setPath(copydefault(c59602zkD));
                basicClientCookie.setDomain(EZpvd(c59602zkD));
                InterfaceC59582zjk[] interfaceC59582zjkArrAEQbTJ = interfaceC59517ziY.AEQbTJ();
                for (int length = interfaceC59582zjkArrAEQbTJ.length - 1; length >= 0; length--) {
                    InterfaceC59582zjk interfaceC59582zjk = interfaceC59582zjkArrAEQbTJ[length];
                    java.lang.String lowerCase = interfaceC59582zjk.getName().toLowerCase(java.util.Locale.ROOT);
                    basicClientCookie.setAttribute(lowerCase, interfaceC59582zjk.getValue());
                    InterfaceC59603zkE interfaceC59603zkEAEQbTJ = AEQbTJ(lowerCase);
                    if (interfaceC59603zkEAEQbTJ != null) {
                        interfaceC59603zkEAEQbTJ.OLrzqt(basicClientCookie, interfaceC59582zjk.getValue());
                    }
                }
                arrayList.add(basicClientCookie);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC59605zkG
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.util.Iterator<InterfaceC59603zkE> it = copydefault().iterator();
        while (it.hasNext()) {
            it.next().OLrzqt(interfaceC59601zkC, c59602zkD);
        }
    }

    @Override // o.InterfaceC59605zkG
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        java.util.Iterator<InterfaceC59603zkE> it = copydefault().iterator();
        while (it.hasNext()) {
            if (!it.next().KWHzl(interfaceC59601zkC, c59602zkD)) {
                return false;
            }
        }
        return true;
    }
}
