package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.tEF;

/* JADX INFO: loaded from: classes19.dex */
public final class tEP {
    public static final Application copydefault = new Application();

    public static final class Application extends DiffUtil.ItemCallback<tEF> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(tEF tef, tEF tef2) {
            Intrinsics.checkNotNullParameter(tef, "");
            Intrinsics.checkNotNullParameter(tef2, "");
            return (tef instanceof tEF.StateListAnimator) && (tef2 instanceof tEF.StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) ((tEF.StateListAnimator) tef).EZpvd(), (java.lang.Object) ((tEF.StateListAnimator) tef2).EZpvd());
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(tEF tef, tEF tef2) {
            Intrinsics.checkNotNullParameter(tef, "");
            Intrinsics.checkNotNullParameter(tef2, "");
            return Intrinsics.EZpvd(tef, tef2);
        }
    }
}
