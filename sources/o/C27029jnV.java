package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.jnV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C27029jnV {
    public static final Activity EZpvd = new Activity();

    /* JADX INFO: renamed from: o.jnV$Activity */
    public static final class Activity extends DiffUtil.ItemCallback<C27090jod> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(C27090jod c27090jod, C27090jod c27090jod2) {
            Intrinsics.checkNotNullParameter(c27090jod, "");
            Intrinsics.checkNotNullParameter(c27090jod2, "");
            return c27090jod.OLrzqt() == c27090jod2.OLrzqt();
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(C27090jod c27090jod, C27090jod c27090jod2) {
            Intrinsics.checkNotNullParameter(c27090jod, "");
            Intrinsics.checkNotNullParameter(c27090jod2, "");
            return Intrinsics.EZpvd(c27090jod, c27090jod2);
        }
    }
}
