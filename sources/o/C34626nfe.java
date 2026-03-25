package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nfe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34626nfe extends DiffUtil.ItemCallback<InterfaceC34635nfn> {
    public static final C34626nfe EZpvd = new C34626nfe();

    private C34626nfe() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull InterfaceC34635nfn interfaceC34635nfn, @NotNull InterfaceC34635nfn interfaceC34635nfn2) {
        Intrinsics.checkNotNullParameter(interfaceC34635nfn, "");
        Intrinsics.checkNotNullParameter(interfaceC34635nfn2, "");
        return interfaceC34635nfn.AEQbTJ(interfaceC34635nfn2);
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull InterfaceC34635nfn interfaceC34635nfn, @NotNull InterfaceC34635nfn interfaceC34635nfn2) {
        Intrinsics.checkNotNullParameter(interfaceC34635nfn, "");
        Intrinsics.checkNotNullParameter(interfaceC34635nfn2, "");
        return interfaceC34635nfn.KWHzl(interfaceC34635nfn2);
    }

    /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Object getChangePayload(@NotNull InterfaceC34635nfn interfaceC34635nfn, @NotNull InterfaceC34635nfn interfaceC34635nfn2) {
        Intrinsics.checkNotNullParameter(interfaceC34635nfn, "");
        Intrinsics.checkNotNullParameter(interfaceC34635nfn2, "");
        return interfaceC34635nfn.copydefault(interfaceC34635nfn2);
    }
}
