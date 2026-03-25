package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.assets.detail.biz.BaseItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10184bjf extends RecyclerView.ViewHolder {
    public final AbstractC16980euE KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10184bjf(@NotNull AbstractC16980euE abstractC16980euE) {
        super(abstractC16980euE.getRoot());
        Intrinsics.checkNotNullParameter(abstractC16980euE, "");
        this.KWHzl = abstractC16980euE;
    }

    public final void copydefault(@NotNull BaseItem.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.KWHzl.EZpvd.setText(actionBar.OLrzqt());
        this.KWHzl.OLrzqt.setText(actionBar.EZpvd());
        this.KWHzl.KWHzl.setText(actionBar.AEQbTJ());
    }
}
