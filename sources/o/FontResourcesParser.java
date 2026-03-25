package o;

import com.amplifyframework.auth.cognito.asf.BuildDataCollector;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import o.InterfaceC5095En;
import o.SuppressLint;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FontResourcesParser {
    public static final SuppressLint KWHzl(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        SuppressLint.TaskDescription taskDescription = new SuppressLint.TaskDescription();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("City"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("Country"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX(BuildDataCollector.MODEL));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("IpAddress"));
        C5101Et c5101Et5 = new C5101Et(loaderManager, new EX("Timezone"));
        C5098Eq.TaskDescription taskDescription2 = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        InterfaceC5095En.StateListAnimator stateListAnimatorEZpvd = interfaceC5095En.EZpvd(activity.KWHzl());
        while (true) {
            java.lang.Integer numOLrzqt = stateListAnimatorEZpvd.OLrzqt();
            int iCopydefault = c5101Et.copydefault();
            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault) {
                taskDescription.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    taskDescription.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        taskDescription.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            taskDescription.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                taskDescription.KWHzl(stateListAnimatorEZpvd.fetchVPNInfo());
                            } else if (numOLrzqt != null) {
                                stateListAnimatorEZpvd.copydefault();
                            } else {
                                taskDescription.EZpvd();
                                return taskDescription.OLrzqt();
                            }
                        }
                    }
                }
            }
        }
    }
}
