package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10162bjJ extends RecyclerView.ViewHolder {
    public final AbstractC16992euQ OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10162bjJ(@NotNull AbstractC16992euQ abstractC16992euQ) {
        super(abstractC16992euQ.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16992euQ, "");
        this.OLrzqt = abstractC16992euQ;
    }

    public final void copydefault(@NotNull BaseItem.Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "");
        this.OLrzqt.AEQbTJ.setText(dialog.KWHzl());
        this.OLrzqt.EZpvd.setText(dialog.AEQbTJ());
    }
}
