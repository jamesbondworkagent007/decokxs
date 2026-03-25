package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33244msm;
import o.AbstractC33249msr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mss, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33250mss {
    public static final AbstractC33249msr EZpvd(int i) {
        if (i == 1) {
            return AbstractC33249msr.TaskDescription.KWHzl;
        }
        if (i == 3) {
            return AbstractC33249msr.ActionBar.EZpvd;
        }
        if (i != 5) {
            return null;
        }
        return AbstractC33249msr.Application.AEQbTJ;
    }

    public static final int copydefault(AbstractC33249msr abstractC33249msr) {
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.Application.AEQbTJ)) {
            return 5;
        }
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.ActionBar.EZpvd)) {
            return 3;
        }
        return Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.TaskDescription.KWHzl) ? 1 : 0;
    }

    public static final AbstractC33249msr EZpvd(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl)) {
            return AbstractC33249msr.Application.AEQbTJ;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Application.KWHzl)) {
            return AbstractC33249msr.TaskDescription.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
            return AbstractC33249msr.ActionBar.EZpvd;
        }
        return null;
    }

    public static final AbstractC33244msm KWHzl(@NotNull AbstractC33249msr abstractC33249msr) {
        Intrinsics.checkNotNullParameter(abstractC33249msr, "");
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.Application.AEQbTJ)) {
            return AbstractC33244msm.TaskDescription.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.TaskDescription.KWHzl)) {
            return AbstractC33244msm.Application.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33249msr, AbstractC33249msr.ActionBar.EZpvd)) {
            return AbstractC33244msm.PendingIntent.KWHzl;
        }
        throw new NoWhenBranchMatchedException();
    }
}
