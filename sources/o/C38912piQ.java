package o;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38912piQ extends RecyclerView.ViewHolder {
    public final yIO KWHzl;
    public final yIO OLrzqt;
    public final yIO copydefault;
    public final yIO gEmmrt;
    public static final /* synthetic */ yJA<java.lang.Object>[] EZpvd = {C56524yIo.copydefault(new PropertyReference1Impl(C38912piQ.class, TtmlNode.TAG_HEAD, "getHead()Landroid/widget/ImageView;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C38912piQ.class, "name", "getName()Landroid/widget/TextView;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C38912piQ.class, "position", "getPosition()Landroid/widget/TextView;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C38912piQ.class, "introduce", "getIntroduce()Landroid/widget/TextView;", 0))};
    public static final int AEQbTJ = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38912piQ(@NotNull android.view.View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = C33062mpP.OLrzqt(this, C35964oKf.StateListAnimator.bindToGooglePlayService);
        this.KWHzl = C33062mpP.OLrzqt(this, C35964oKf.StateListAnimator.UimiPOhkCVbT);
        this.gEmmrt = C33062mpP.OLrzqt(this, C35964oKf.StateListAnimator.wtf);
        this.OLrzqt = C33062mpP.OLrzqt(this, C35964oKf.StateListAnimator.FYtjSf);
    }

    public final android.widget.ImageView KWHzl() {
        return (android.widget.ImageView) this.copydefault.getValue(this, EZpvd[0]);
    }

    public final android.widget.TextView AEQbTJ() {
        return (android.widget.TextView) this.KWHzl.getValue(this, EZpvd[1]);
    }

    public final android.widget.TextView copydefault() {
        return (android.widget.TextView) this.gEmmrt.getValue(this, EZpvd[2]);
    }

    public final android.widget.TextView OLrzqt() {
        return (android.widget.TextView) this.OLrzqt.getValue(this, EZpvd[3]);
    }
}
