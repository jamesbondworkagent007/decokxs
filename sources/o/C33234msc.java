package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import o.AbstractC33247msp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33234msc {
    public static final int EZpvd(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Application.KWHzl)) {
            return 1;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl) || Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl)) {
            return 2;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
            return 3;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl)) {
            return 5;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Dialog.KWHzl)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AbstractC33247msp copydefault(int i) {
        if (i == 1) {
            return AbstractC33247msp.Activity.AEQbTJ;
        }
        if (i == 2) {
            return AbstractC33247msp.StateListAnimator.AEQbTJ;
        }
        if (i == 3) {
            return AbstractC33247msp.TaskDescription.AEQbTJ;
        }
        if (i == 5) {
            return AbstractC33247msp.Application.AEQbTJ;
        }
        return AbstractC33247msp.Dialog.AEQbTJ;
    }
}
