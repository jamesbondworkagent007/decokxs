package org.apache.http.impl.cookie;

import o.C59600zkB;
import o.C59602zkD;
import o.C59707zmC;
import o.C59713zmI;
import o.C59714zmJ;
import o.C59715zmK;
import o.C59717zmM;
import o.C59718zmN;
import o.C59719zmO;
import o.C59721zmQ;
import o.C59722zmR;
import o.C59723zmS;
import o.C59724zmT;
import o.C59727zmW;
import o.C59745zmo;
import o.C59747zmq;
import o.C59748zmr;
import o.C59750zmt;
import o.C59752zmv;
import o.C59754zmx;
import o.InterfaceC59601zkC;
import o.InterfaceC59605zkG;
import o.InterfaceC59607zkI;
import o.InterfaceC59650zkz;
import o.InterfaceC59838zob;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: loaded from: classes24.dex */
public class DefaultCookieSpecProvider implements InterfaceC59607zkI {
    public volatile InterfaceC59605zkG AEQbTJ;
    public final String[] EZpvd;
    public final boolean KWHzl;
    public final C59600zkB OLrzqt;
    public final CompatibilityLevel copydefault;

    public enum CompatibilityLevel {
        DEFAULT,
        IE_MEDIUM_SECURITY
    }

    public DefaultCookieSpecProvider(CompatibilityLevel compatibilityLevel, C59600zkB c59600zkB, String[] strArr, boolean z) {
        this.copydefault = compatibilityLevel == null ? CompatibilityLevel.DEFAULT : compatibilityLevel;
        this.OLrzqt = c59600zkB;
        this.EZpvd = strArr;
        this.KWHzl = z;
    }

    public DefaultCookieSpecProvider() {
        this(CompatibilityLevel.DEFAULT, null, null, false);
    }

    @Override // o.InterfaceC59607zkI
    public InterfaceC59605zkG AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
        if (this.AEQbTJ == null) {
            synchronized (this) {
                if (this.AEQbTJ == null) {
                    C59723zmS c59723zmS = new C59723zmS(this.KWHzl, new C59724zmT(), new C59754zmx(), C59714zmJ.KWHzl(new C59722zmR(), this.OLrzqt), new C59727zmW(), new C59752zmv(), new C59750zmt(), new C59745zmo(), new C59721zmQ(), new C59719zmO());
                    C59713zmI c59713zmI = new C59713zmI(this.KWHzl, new C59718zmN(), new C59754zmx(), C59714zmJ.KWHzl(new C59715zmK(), this.OLrzqt), new C59752zmv(), new C59750zmt(), new C59745zmo());
                    InterfaceC59650zkz[] interfaceC59650zkzArr = new InterfaceC59650zkz[5];
                    interfaceC59650zkzArr[0] = C59714zmJ.KWHzl(new C59747zmq(), this.OLrzqt);
                    interfaceC59650zkzArr[1] = this.copydefault == CompatibilityLevel.IE_MEDIUM_SECURITY ? new C59754zmx() { // from class: org.apache.http.impl.cookie.DefaultCookieSpecProvider.4
                        @Override // o.C59754zmx, o.InterfaceC59603zkE
                        public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
                        }
                    } : new C59754zmx();
                    interfaceC59650zkzArr[2] = new C59750zmt();
                    interfaceC59650zkzArr[3] = new C59745zmo();
                    String[] strArr = this.EZpvd;
                    interfaceC59650zkzArr[4] = new C59748zmr(strArr != null ? (String[]) strArr.clone() : new String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
                    this.AEQbTJ = new C59707zmC(c59723zmS, c59713zmI, new C59717zmM(interfaceC59650zkzArr));
                }
            }
        }
        return this.AEQbTJ;
    }
}
