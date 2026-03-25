package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pbv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38572pbv extends RecyclerView.ViewHolder {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(C38572pbv.class, "title", "getTitle()Landroid/widget/TextView;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C38572pbv.class, "content", "getContent()Landroid/widget/TextView;", 0))};
    public static final int copydefault = 8;
    public final yIO KWHzl;
    public final yIO OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38572pbv(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C33062mpP.OLrzqt(this, C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212);
        this.OLrzqt = C33062mpP.OLrzqt(this, C35964oKf.StateListAnimator.zAEkPU);
    }

    public final android.widget.TextView AEQbTJ() {
        return (android.widget.TextView) this.KWHzl.getValue(this, AEQbTJ[0]);
    }

    public final android.widget.TextView OLrzqt() {
        return (android.widget.TextView) this.OLrzqt.getValue(this, AEQbTJ[1]);
    }
}
