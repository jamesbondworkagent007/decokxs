package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19196fwi extends DiffUtil.ItemCallback<C18988fsm> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C18988fsm c18988fsm, @NotNull C18988fsm c18988fsm2) {
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        Intrinsics.checkNotNullParameter(c18988fsm2, "");
        return c18988fsm.OLrzqt() == c18988fsm2.OLrzqt() && Intrinsics.EZpvd((java.lang.Object) c18988fsm.fetchVPNInfo(), (java.lang.Object) c18988fsm2.fetchVPNInfo());
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C18988fsm c18988fsm, @NotNull C18988fsm c18988fsm2) {
        Intrinsics.checkNotNullParameter(c18988fsm, "");
        Intrinsics.checkNotNullParameter(c18988fsm2, "");
        return Intrinsics.EZpvd(c18988fsm, c18988fsm2);
    }
}
