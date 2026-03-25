package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27474jvq extends DiffUtil.ItemCallback<InterfaceC27436jvE> {
    public static final C27474jvq copydefault = new C27474jvq();

    private C27474jvq() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull InterfaceC27436jvE interfaceC27436jvE, @NotNull InterfaceC27436jvE interfaceC27436jvE2) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        Intrinsics.checkNotNullParameter(interfaceC27436jvE2, "");
        return interfaceC27436jvE.EZpvd(interfaceC27436jvE2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull InterfaceC27436jvE interfaceC27436jvE, @NotNull InterfaceC27436jvE interfaceC27436jvE2) {
        Intrinsics.checkNotNullParameter(interfaceC27436jvE, "");
        Intrinsics.checkNotNullParameter(interfaceC27436jvE2, "");
        return interfaceC27436jvE.KWHzl(interfaceC27436jvE2);
    }
}
