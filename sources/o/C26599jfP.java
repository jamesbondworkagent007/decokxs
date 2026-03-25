package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jfP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26599jfP {
    public static final Activity KWHzl = new Activity();

    /* JADX INFO: renamed from: o.jfP$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C26608jfY> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C26608jfY c26608jfY, C26608jfY c26608jfY2) {
            Intrinsics.checkNotNullParameter(c26608jfY, "");
            Intrinsics.checkNotNullParameter(c26608jfY2, "");
            return Intrinsics.EZpvd((java.lang.Object) c26608jfY.copydefault(), (java.lang.Object) c26608jfY2.copydefault());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C26608jfY c26608jfY, C26608jfY c26608jfY2) {
            Intrinsics.checkNotNullParameter(c26608jfY, "");
            Intrinsics.checkNotNullParameter(c26608jfY2, "");
            return Intrinsics.EZpvd(c26608jfY, c26608jfY2);
        }
    }
}
