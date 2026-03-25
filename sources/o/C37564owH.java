package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37564owH extends DiffUtil.ItemCallback<java.lang.Object> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areItemsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C34282nYe) && (obj2 instanceof C34282nYe)) {
            return Intrinsics.EZpvd((java.lang.Object) ((C34282nYe) obj).AhwBna(), (java.lang.Object) ((C34282nYe) obj2).AhwBna());
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public boolean areContentsTheSame(@NotNull java.lang.Object obj, @NotNull java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        if ((obj instanceof C34282nYe) && (obj2 instanceof C34282nYe)) {
            C34282nYe c34282nYe = (C34282nYe) obj;
            C34282nYe c34282nYe2 = (C34282nYe) obj2;
            if (Intrinsics.EZpvd((java.lang.Object) c34282nYe.AhwBna(), (java.lang.Object) c34282nYe2.AhwBna()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.OLrzqt(), (java.lang.Object) c34282nYe2.OLrzqt()) && Intrinsics.EZpvd((java.lang.Object) c34282nYe.AEQbTJ(), (java.lang.Object) c34282nYe2.AEQbTJ())) {
                return true;
            }
        }
        return false;
    }
}
