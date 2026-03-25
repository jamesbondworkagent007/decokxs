package o;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import kotlin.coroutines.Continuation;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54617xP {
    public static final C5101Et AEQbTJ;
    public static final C54617xP EZpvd = new C54617xP();
    public static final C5101Et KWHzl;
    public static final C5101Et OLrzqt;
    public static final C5098Eq copydefault;

    private C54617xP() {
    }

    static {
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new C5128Fu("Message"));
        KWHzl = c5101Et;
        C5101Et c5101Et2 = new C5101Et(loaderManager, new C5128Fu("Code"));
        AEQbTJ = c5101Et2;
        C5101Et c5101Et3 = new C5101Et(loaderManager, new C5128Fu("RequestId"));
        OLrzqt = c5101Et3;
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.KWHzl(new C5128Fu("Error"));
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        copydefault = activity.KWHzl();
    }

    public final java.lang.Object OLrzqt(@NotNull InterfaceC5095En interfaceC5095En, @NotNull Continuation<? super C54671xR> continuation) {
        try {
            InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(copydefault);
            java.lang.String strFetchVPNInfo = null;
            java.lang.String strFetchVPNInfo2 = null;
            java.lang.String strFetchVPNInfo3 = null;
            while (true) {
                java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
                int iCopydefault = KWHzl.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                    strFetchVPNInfo3 = stateListAnimatorEZpvd.fetchVPNInfo();
                } else {
                    int iCopydefault2 = AEQbTJ.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                        strFetchVPNInfo2 = stateListAnimatorEZpvd.fetchVPNInfo();
                    } else {
                        int iCopydefault3 = OLrzqt.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                            strFetchVPNInfo = stateListAnimatorEZpvd.fetchVPNInfo();
                        } else if (numOLrzqt != null) {
                            stateListAnimatorEZpvd.copydefault();
                        } else {
                            return new C54671xR(strFetchVPNInfo, strFetchVPNInfo2, strFetchVPNInfo3);
                        }
                    }
                }
            }
        } catch (DeserializationException unused) {
            return null;
        }
    }
}
