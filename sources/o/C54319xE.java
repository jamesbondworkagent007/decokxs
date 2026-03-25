package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54319xE {
    public static final C54319xE AEQbTJ = new C54319xE();
    public static final C5101Et AYXKKw;
    public static final C5101Et EZpvd;
    public static final C5101Et KWHzl;
    public static final C5101Et OLrzqt;
    public static final C5101Et copydefault;
    public static final C5098Eq valueOf;

    private C54319xE() {
    }

    static {
        AbstractC5105Ex.FragmentManager fragmentManager = AbstractC5105Ex.FragmentManager.AEQbTJ;
        C5101Et c5101Et = new C5101Et(fragmentManager, new EX("code"));
        OLrzqt = c5101Et;
        C5101Et c5101Et2 = new C5101Et(fragmentManager, new EX("__type"));
        copydefault = c5101Et2;
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("message"));
        KWHzl = c5101Et3;
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("Message"));
        EZpvd = c5101Et4;
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("errorMessage"));
        AYXKKw = c5101Et5;
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        valueOf = activity.KWHzl();
    }

    public final C56239xz copydefault(@NotNull InterfaceC58725zN interfaceC58725zN, byte[] bArr) {
        java.lang.String strFetchVPNInfo;
        java.lang.String strFetchVPNInfo2;
        Intrinsics.checkNotNullParameter(interfaceC58725zN, "");
        java.lang.String strCopydefault = interfaceC58725zN.copydefault("x-amzn-error-message");
        if (strCopydefault == null) {
            strCopydefault = interfaceC58725zN.copydefault(":error-message");
        }
        java.lang.String strCopydefault2 = interfaceC58725zN.copydefault("X-Amzn-Errortype");
        if (bArr != null) {
            InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = new EL(bArr).EZpvd(valueOf);
            strFetchVPNInfo = null;
            strFetchVPNInfo2 = null;
            while (true) {
                java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
                int iCopydefault = OLrzqt.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                    strFetchVPNInfo2 = stateListAnimatorEZpvd.fetchVPNInfo();
                } else {
                    int iCopydefault2 = copydefault.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                        strFetchVPNInfo = stateListAnimatorEZpvd.fetchVPNInfo();
                    } else {
                        int iCopydefault3 = KWHzl.copydefault();
                        if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault3) {
                            int iCopydefault4 = EZpvd.copydefault();
                            if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault4) {
                                int iCopydefault5 = AYXKKw.copydefault();
                                if (numOLrzqt == null || numOLrzqt.intValue() != iCopydefault5) {
                                    if (numOLrzqt == null) {
                                        break;
                                    }
                                    stateListAnimatorEZpvd.copydefault();
                                }
                            }
                        }
                        strCopydefault = stateListAnimatorEZpvd.fetchVPNInfo();
                    }
                }
            }
        } else {
            strFetchVPNInfo = null;
            strFetchVPNInfo2 = null;
        }
        if (strCopydefault2 == null) {
            strCopydefault2 = strFetchVPNInfo2 == null ? strFetchVPNInfo : strFetchVPNInfo2;
        }
        return new C56239xz(C54400xH.KWHzl(strCopydefault2), strCopydefault, null);
    }
}
