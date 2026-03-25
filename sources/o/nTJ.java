package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.nTH;
import o.nTK;
import o.nTN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nTJ {
    public static final nTH copydefault(@NotNull nTN.Activity activity) {
        nTH actionBar;
        Intrinsics.checkNotNullParameter(activity, "");
        nTK ntkKWHzl = activity.KWHzl();
        if (ntkKWHzl instanceof nTK.TaskDescription) {
            return nTH.LoaderManager.EZpvd;
        }
        if (Intrinsics.EZpvd(ntkKWHzl, nTK.FragmentManager.AEQbTJ)) {
            return nTH.StateListAnimator.OLrzqt;
        }
        if (Intrinsics.EZpvd(ntkKWHzl, nTK.ActionBar.copydefault)) {
            return nTH.Dialog.OLrzqt;
        }
        if (ntkKWHzl instanceof nTK.Dialog) {
            actionBar = new nTH.PendingIntent(((nTK.Dialog) activity.KWHzl()).EZpvd());
        } else if (ntkKWHzl instanceof nTK.PendingIntent) {
            actionBar = new nTH.PendingIntent(((nTK.PendingIntent) activity.KWHzl()).OLrzqt());
        } else {
            if (!(ntkKWHzl instanceof nTK.Application)) {
                if (Intrinsics.EZpvd(ntkKWHzl, nTK.StateListAnimator.OLrzqt)) {
                    return nTH.Activity.copydefault;
                }
                if (Intrinsics.EZpvd(ntkKWHzl, nTK.Activity.copydefault)) {
                    return nTH.Application.copydefault;
                }
                if (Intrinsics.EZpvd(ntkKWHzl, nTK.LoaderManager.copydefault)) {
                    return nTH.TaskDescription.AEQbTJ;
                }
                if (!Intrinsics.EZpvd(ntkKWHzl, nTK.Fragment.OLrzqt)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new nTH.Fragment(nTM.OLrzqt(activity.copydefault()), nTM.EZpvd(activity.copydefault()));
            }
            actionBar = new nTH.ActionBar(((nTK.Application) activity.KWHzl()).EZpvd());
        }
        return actionBar;
    }
}
