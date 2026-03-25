package o;

import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46072tGu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46044tFt {
    public static final Application KWHzl = new Application();

    /* JADX INFO: renamed from: o.tFt$Application */
    public static final class Application extends DiffUtil.ItemCallback<InterfaceC46072tGu> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(InterfaceC46072tGu interfaceC46072tGu, InterfaceC46072tGu interfaceC46072tGu2) {
            Intrinsics.checkNotNullParameter(interfaceC46072tGu, "");
            Intrinsics.checkNotNullParameter(interfaceC46072tGu2, "");
            return ((interfaceC46072tGu instanceof InterfaceC46072tGu.StateListAnimator) && (interfaceC46072tGu2 instanceof InterfaceC46072tGu.StateListAnimator)) ? Intrinsics.EZpvd(interfaceC46072tGu, interfaceC46072tGu2) : ((interfaceC46072tGu instanceof InterfaceC46072tGu.Activity) && (interfaceC46072tGu2 instanceof InterfaceC46072tGu.Activity)) ? Intrinsics.EZpvd((java.lang.Object) ((InterfaceC46072tGu.Activity) interfaceC46072tGu).ejfBZ(), (java.lang.Object) ((InterfaceC46072tGu.Activity) interfaceC46072tGu2).ejfBZ()) : (interfaceC46072tGu instanceof InterfaceC46072tGu.ActionBar) && (interfaceC46072tGu2 instanceof InterfaceC46072tGu.ActionBar);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(InterfaceC46072tGu interfaceC46072tGu, InterfaceC46072tGu interfaceC46072tGu2) {
            Intrinsics.checkNotNullParameter(interfaceC46072tGu, "");
            Intrinsics.checkNotNullParameter(interfaceC46072tGu2, "");
            return Intrinsics.EZpvd(interfaceC46072tGu, interfaceC46072tGu2);
        }
    }

    @BindingAdapter({"pos_side_color_style"})
    public static final void AEQbTJ(@NotNull C55251xgS c55251xgS, boolean z) {
        Intrinsics.checkNotNullParameter(c55251xgS, "");
        tRG.KWHzl(c55251xgS, z);
    }
}
