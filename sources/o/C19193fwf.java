package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19193fwf extends DiffUtil.ItemCallback<C18987fsl> {
    /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NotNull C18987fsl c18987fsl, @NotNull C18987fsl c18987fsl2) {
        Intrinsics.checkNotNullParameter(c18987fsl, "");
        Intrinsics.checkNotNullParameter(c18987fsl2, "");
        return c18987fsl.AEQbTJ() == c18987fsl2.AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NotNull C18987fsl c18987fsl, @NotNull C18987fsl c18987fsl2) {
        Intrinsics.checkNotNullParameter(c18987fsl, "");
        Intrinsics.checkNotNullParameter(c18987fsl2, "");
        return Intrinsics.EZpvd(c18987fsl, c18987fsl2);
    }
}
