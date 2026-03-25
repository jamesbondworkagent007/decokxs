package o;

import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C54427xI {
    public static final C5101Et AEQbTJ;
    public static final C5101Et EZpvd;
    public static final C5098Eq OLrzqt;
    public static final C54427xI copydefault = new C54427xI();

    private C54427xI() {
    }

    static {
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new C5128Fu("Code"));
        EZpvd = c5101Et;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new C5128Fu("Message"));
        AEQbTJ = c5101Et2;
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new C5128Fu("Error"));
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        OLrzqt = activity.KWHzl();
    }

    public final java.lang.Object AEQbTJ(@NotNull InterfaceC5095En interfaceC5095En, @NotNull Continuation<? super C54373xG> continuation) {
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(OLrzqt);
        java.lang.String strFetchVPNInfo = null;
        java.lang.String strFetchVPNInfo2 = null;
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = EZpvd.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                strFetchVPNInfo = stateListAnimatorEZpvd.fetchVPNInfo();
            } else {
                int iCopydefault2 = AEQbTJ.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    strFetchVPNInfo2 = stateListAnimatorEZpvd.fetchVPNInfo();
                } else if (numOLrzqt != null) {
                    stateListAnimatorEZpvd.copydefault();
                } else {
                    return new C54373xG(strFetchVPNInfo, strFetchVPNInfo2);
                }
            }
        }
    }
}
