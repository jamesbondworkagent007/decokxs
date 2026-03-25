package o;

import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30005lIj extends C43318rmy<C31438lty, AbstractC31507lvN> {
    public C30005lIj() {
        super(C31351lsQ.ActionBar.giSNqX, 0);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31507lvN> c43312rms, @NotNull C31438lty c31438lty) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(c31438lty, "");
        super.onBindViewHolder((C43312rms) c43312rms, c31438lty);
        AbstractC31507lvN abstractC31507lvN = (AbstractC31507lvN) c43312rms.OLrzqt();
        if (abstractC31507lvN != null) {
            abstractC31507lvN.AEQbTJ.setText(c31438lty.KWHzl());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) c31438lty.EZpvd())) {
                android.widget.TextView textView = abstractC31507lvN.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31507lvN.copydefault.setText(c31438lty.EZpvd());
            } else {
                android.widget.TextView textView2 = abstractC31507lvN.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            abstractC31507lvN.EZpvd.setText(c31438lty.AEQbTJ());
        }
    }
}
