package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.C35119npM;

/* JADX INFO: renamed from: o.npQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35123npQ {
    public static final ActionBar AEQbTJ = new ActionBar();

    /* JADX INFO: renamed from: o.npQ$ActionBar */
    public static final class ActionBar extends DiffUtil.ItemCallback<C35119npM.Application> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C35119npM.Application application, C35119npM.Application application2) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(application2, "");
            return Intrinsics.EZpvd((java.lang.Object) application.KWHzl().getInstId(), (java.lang.Object) application2.KWHzl().getInstId());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C35119npM.Application application, C35119npM.Application application2) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(application2, "");
            return Intrinsics.EZpvd((java.lang.Object) application.KWHzl().getInstId(), (java.lang.Object) application2.KWHzl().getInstId()) && application.OLrzqt() == application2.OLrzqt();
        }
    }
}
