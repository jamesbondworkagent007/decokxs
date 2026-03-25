package o;

import com.google.common.net.HttpHeaders;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: renamed from: o.zmC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59707zmC implements InterfaceC59605zkG {
    public final C59723zmS AEQbTJ;
    public final C59717zmM EZpvd;
    public final C59713zmI KWHzl;

    @Override // o.InterfaceC59605zkG
    public InterfaceC59518ziZ OLrzqt() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "default";
    }

    public C59707zmC(C59723zmS c59723zmS, C59713zmI c59713zmI, C59717zmM c59717zmM) {
        this.AEQbTJ = c59723zmS;
        this.KWHzl = c59713zmI;
        this.EZpvd = c59717zmM;
    }

    public C59707zmC(java.lang.String[] strArr, boolean z) {
        this.AEQbTJ = new C59723zmS(z, new C59724zmT(), new C59754zmx(), new C59722zmR(), new C59727zmW(), new C59752zmv(), new C59750zmt(), new C59745zmo(), new C59721zmQ(), new C59719zmO());
        this.KWHzl = new C59713zmI(z, new C59718zmN(), new C59754zmx(), new C59715zmK(), new C59752zmv(), new C59750zmt(), new C59745zmo());
        InterfaceC59650zkz[] interfaceC59650zkzArr = new InterfaceC59650zkz[5];
        interfaceC59650zkzArr[0] = new C59747zmq();
        interfaceC59650zkzArr[1] = new C59754zmx();
        interfaceC59650zkzArr[2] = new C59750zmt();
        interfaceC59650zkzArr[3] = new C59745zmo();
        interfaceC59650zkzArr[4] = new C59748zmr(strArr != null ? (java.lang.String[]) strArr.clone() : new java.lang.String[]{"EEE, dd-MMM-yy HH:mm:ss z"});
        this.EZpvd = new C59717zmM(interfaceC59650zkzArr);
    }

    public C59707zmC() {
        this(null, false);
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59601zkC> KWHzl(InterfaceC59518ziZ interfaceC59518ziZ, C59602zkD c59602zkD) throws MalformedCookieException {
        org.apache.http.util.CharArrayBuffer charArrayBuffer;
        C59771znN c59771znN;
        C59851zoo.AEQbTJ(interfaceC59518ziZ, "Header");
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        InterfaceC59517ziY[] elements = interfaceC59518ziZ.getElements();
        boolean z = false;
        boolean z2 = false;
        for (InterfaceC59517ziY interfaceC59517ziY : elements) {
            if (interfaceC59517ziY.copydefault("version") != null) {
                z2 = true;
            }
            if (interfaceC59517ziY.copydefault("expires") != null) {
                z = true;
            }
        }
        if (z || !z2) {
            C59709zmE c59709zmE = C59709zmE.EZpvd;
            if (interfaceC59518ziZ instanceof InterfaceC59516ziX) {
                InterfaceC59516ziX interfaceC59516ziX = (InterfaceC59516ziX) interfaceC59518ziZ;
                charArrayBuffer = interfaceC59516ziX.getBuffer();
                c59771znN = new C59771znN(interfaceC59516ziX.getValuePos(), charArrayBuffer.length());
            } else {
                java.lang.String value = interfaceC59518ziZ.getValue();
                if (value == null) {
                    throw new MalformedCookieException("Header value is null");
                }
                charArrayBuffer = new org.apache.http.util.CharArrayBuffer(value.length());
                charArrayBuffer.append(value);
                c59771znN = new C59771znN(0, charArrayBuffer.length());
            }
            return this.EZpvd.OLrzqt(new InterfaceC59517ziY[]{c59709zmE.KWHzl(charArrayBuffer, c59771znN)}, c59602zkD);
        }
        if (HttpHeaders.SET_COOKIE2.equals(interfaceC59518ziZ.getName())) {
            return this.AEQbTJ.OLrzqt(elements, c59602zkD);
        }
        return this.KWHzl.OLrzqt(elements, c59602zkD);
    }

    @Override // o.InterfaceC59605zkG
    public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        if (interfaceC59601zkC.getVersion() > 0) {
            if (interfaceC59601zkC instanceof InterfaceC59609zkK) {
                this.AEQbTJ.OLrzqt(interfaceC59601zkC, c59602zkD);
                return;
            } else {
                this.KWHzl.OLrzqt(interfaceC59601zkC, c59602zkD);
                return;
            }
        }
        this.EZpvd.OLrzqt(interfaceC59601zkC, c59602zkD);
    }

    @Override // o.InterfaceC59605zkG
    public boolean KWHzl(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) {
        C59851zoo.AEQbTJ(interfaceC59601zkC, HttpHeaders.COOKIE);
        C59851zoo.AEQbTJ(c59602zkD, "Cookie origin");
        if (interfaceC59601zkC.getVersion() > 0) {
            if (interfaceC59601zkC instanceof InterfaceC59609zkK) {
                return this.AEQbTJ.KWHzl(interfaceC59601zkC, c59602zkD);
            }
            return this.KWHzl.KWHzl(interfaceC59601zkC, c59602zkD);
        }
        return this.EZpvd.KWHzl(interfaceC59601zkC, c59602zkD);
    }

    @Override // o.InterfaceC59605zkG
    public java.util.List<InterfaceC59518ziZ> KWHzl(java.util.List<InterfaceC59601zkC> list) {
        C59851zoo.AEQbTJ(list, "List of cookies");
        int version = Integer.MAX_VALUE;
        boolean z = true;
        for (InterfaceC59601zkC interfaceC59601zkC : list) {
            if (!(interfaceC59601zkC instanceof InterfaceC59609zkK)) {
                z = false;
            }
            if (interfaceC59601zkC.getVersion() < version) {
                version = interfaceC59601zkC.getVersion();
            }
        }
        if (version <= 0) {
            return this.EZpvd.KWHzl(list);
        }
        if (z) {
            return this.AEQbTJ.KWHzl(list);
        }
        return this.KWHzl.KWHzl(list);
    }

    @Override // o.InterfaceC59605zkG
    public int AEQbTJ() {
        return this.AEQbTJ.AEQbTJ();
    }
}
