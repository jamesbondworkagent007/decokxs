package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC33240msi;
import o.AbstractC33244msm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.msh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33239msh {
    public static final int KWHzl(AbstractC33240msi abstractC33240msi) {
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.ActionBar.EZpvd) || Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.Application.copydefault) || Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.Activity.OLrzqt)) {
            return 2;
        }
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.LoaderManager.EZpvd)) {
            return 3;
        }
        return Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.TaskDescription.OLrzqt) ? 5 : 0;
    }

    public static final AbstractC33240msi copydefault(@NotNull AbstractC33244msm abstractC33244msm) {
        Intrinsics.checkNotNullParameter(abstractC33244msm, "");
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Activity.KWHzl)) {
            return AbstractC33240msi.Application.copydefault;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.Fragment.KWHzl)) {
            return AbstractC33240msi.Activity.OLrzqt;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.ActionBar.KWHzl)) {
            return AbstractC33240msi.ActionBar.EZpvd;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl)) {
            return AbstractC33240msi.LoaderManager.EZpvd;
        }
        if (Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.TaskDescription.KWHzl)) {
            return AbstractC33240msi.TaskDescription.OLrzqt;
        }
        return null;
    }

    public static final AbstractC33244msm OLrzqt(@NotNull AbstractC33240msi abstractC33240msi) {
        Intrinsics.checkNotNullParameter(abstractC33240msi, "");
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.Application.copydefault)) {
            return AbstractC33244msm.Activity.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.Activity.OLrzqt)) {
            return AbstractC33244msm.Fragment.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.ActionBar.EZpvd)) {
            return AbstractC33244msm.ActionBar.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.LoaderManager.EZpvd)) {
            return AbstractC33244msm.PendingIntent.KWHzl;
        }
        if (Intrinsics.EZpvd(abstractC33240msi, AbstractC33240msi.TaskDescription.OLrzqt)) {
            return AbstractC33244msm.TaskDescription.KWHzl;
        }
        throw new NoWhenBranchMatchedException();
    }
}
