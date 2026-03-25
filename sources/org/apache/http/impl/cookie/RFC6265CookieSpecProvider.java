package org.apache.http.impl.cookie;

import o.C59600zkB;
import o.C59602zkD;
import o.C59708zmD;
import o.C59711zmG;
import o.C59714zmJ;
import o.C59728zmX;
import o.C59730zmZ;
import o.C59747zmq;
import o.C59748zmr;
import o.C59750zmt;
import o.C59752zmv;
import o.C59754zmx;
import o.InterfaceC59601zkC;
import o.InterfaceC59605zkG;
import o.InterfaceC59607zkI;
import o.InterfaceC59838zob;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: loaded from: classes24.dex */
public class RFC6265CookieSpecProvider implements InterfaceC59607zkI {
    public volatile InterfaceC59605zkG EZpvd;
    public final C59600zkB KWHzl;
    public final CompatibilityLevel OLrzqt;

    public enum CompatibilityLevel {
        STRICT,
        RELAXED,
        IE_MEDIUM_SECURITY
    }

    public RFC6265CookieSpecProvider(CompatibilityLevel compatibilityLevel, C59600zkB c59600zkB) {
        this.OLrzqt = compatibilityLevel == null ? CompatibilityLevel.RELAXED : compatibilityLevel;
        this.KWHzl = c59600zkB;
    }

    public RFC6265CookieSpecProvider() {
        this(CompatibilityLevel.RELAXED, null);
    }

    @Override // o.InterfaceC59607zkI
    public InterfaceC59605zkG AEQbTJ(InterfaceC59838zob interfaceC59838zob) {
        if (this.EZpvd == null) {
            synchronized (this) {
                if (this.EZpvd == null) {
                    int i = AnonymousClass3.OLrzqt[this.OLrzqt.ordinal()];
                    if (i == 1) {
                        this.EZpvd = new C59728zmX(new C59754zmx(), C59714zmJ.KWHzl(new C59747zmq(), this.KWHzl), new C59752zmv(), new C59750zmt(), new C59748zmr(C59728zmX.gEmmrt));
                    } else if (i == 2) {
                        this.EZpvd = new C59730zmZ(new C59754zmx() { // from class: org.apache.http.impl.cookie.RFC6265CookieSpecProvider.5
                            @Override // o.C59754zmx, o.InterfaceC59603zkE
                            public void OLrzqt(InterfaceC59601zkC interfaceC59601zkC, C59602zkD c59602zkD) throws MalformedCookieException {
                            }
                        }, C59714zmJ.KWHzl(new C59747zmq(), this.KWHzl), new C59752zmv(), new C59750zmt(), new C59748zmr(C59728zmX.gEmmrt));
                    } else {
                        this.EZpvd = new C59730zmZ(new C59754zmx(), C59714zmJ.KWHzl(new C59747zmq(), this.KWHzl), new C59708zmD(), new C59750zmt(), new C59711zmG());
                    }
                }
            }
        }
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: org.apache.http.impl.cookie.RFC6265CookieSpecProvider$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[CompatibilityLevel.values().length];
            OLrzqt = iArr;
            try {
                iArr[CompatibilityLevel.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[CompatibilityLevel.IE_MEDIUM_SECURITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }
}
