package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.AccountsException;
import o.C5098Eq;
import o.InterfaceC5095En;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class BluetoothLeUtils {
    public static final AccountsException copydefault(@NotNull InterfaceC5095En interfaceC5095En) {
        Intrinsics.checkNotNullParameter(interfaceC5095En, "");
        AccountsException.ActionBar actionBar = new AccountsException.ActionBar();
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ApplicationArn"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ApplicationId"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ExternalId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("RoleArn"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("UserDataShared"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
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
                actionBar.EZpvd(stateListAnimatorEZpvd.fetchVPNInfo());
            } else {
                int iCopydefault2 = c5101Et2.copydefault();
                if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault2) {
                    actionBar.copydefault(stateListAnimatorEZpvd.fetchVPNInfo());
                } else {
                    int iCopydefault3 = c5101Et3.copydefault();
                    if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault3) {
                        actionBar.OLrzqt(stateListAnimatorEZpvd.fetchVPNInfo());
                    } else {
                        int iCopydefault4 = c5101Et4.copydefault();
                        if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault4) {
                            actionBar.AEQbTJ(stateListAnimatorEZpvd.fetchVPNInfo());
                        } else {
                            int iCopydefault5 = c5101Et5.copydefault();
                            if (numOLrzqt != null && numOLrzqt.intValue() == iCopydefault5) {
                                actionBar.copydefault(stateListAnimatorEZpvd.AEQbTJ());
                            } else if (numOLrzqt != null) {
                                stateListAnimatorEZpvd.copydefault();
                            } else {
                                actionBar.OLrzqt();
                                return actionBar.EZpvd();
                            }
                        }
                    }
                }
            }
        }
    }
}
