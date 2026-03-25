package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oPV extends DiffUtil.ItemCallback<oPY> {
    public static final oPV EZpvd = new oPV();

    private oPV() {
    }

    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull oPY opy, @NotNull oPY opy2) {
        Intrinsics.checkNotNullParameter(opy, "");
        Intrinsics.checkNotNullParameter(opy2, "");
        return opy.copydefault() == opy2.copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull oPY opy, @NotNull oPY opy2) {
        Intrinsics.checkNotNullParameter(opy, "");
        Intrinsics.checkNotNullParameter(opy2, "");
        return Intrinsics.EZpvd(opy, opy2);
    }

    /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object getChangePayload(@NotNull oPY opy, @NotNull oPY opy2) {
        Intrinsics.checkNotNullParameter(opy, "");
        Intrinsics.checkNotNullParameter(opy2, "");
        if (opy.copydefault() == opy2.copydefault() && Intrinsics.EZpvd((java.lang.Object) opy.EZpvd(), (java.lang.Object) opy2.EZpvd()) && Intrinsics.EZpvd(opy.AEQbTJ(), opy2.AEQbTJ()) && !Intrinsics.EZpvd((java.lang.Object) opy.KWHzl(), (java.lang.Object) opy2.KWHzl())) {
            return new oPZ(opy2.KWHzl());
        }
        return null;
    }
}
