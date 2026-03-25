package o;

import androidx.recyclerview.widget.DiffUtil;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oIM extends DiffUtil.Callback {
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;

    public oIM(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.OLrzqt = list;
        this.KWHzl = list2;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getOldListSize() {
        return this.OLrzqt.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public int getNewListSize() {
        return this.KWHzl.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areItemsTheSame(int i, int i2) {
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.get(i), (java.lang.Object) this.KWHzl.get(i2));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public boolean areContentsTheSame(int i, int i2) {
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.get(i), (java.lang.Object) this.KWHzl.get(i2));
    }
}
