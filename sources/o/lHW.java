package o;

import android.view.View;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lHW extends C43318rmy<SelectionRow.CardVerificationItem, AbstractC31503lvJ> {
    public final Function1<SelectionRow.CardVerificationItem, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$CardVerificationItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lHW(@NotNull Function1<? super SelectionRow.CardVerificationItem, Unit> function1) {
        super(C31351lsQ.ActionBar.fZBcTu, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31503lvJ> c43312rms, @NotNull final SelectionRow.CardVerificationItem cardVerificationItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(cardVerificationItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, cardVerificationItem);
        AbstractC31503lvJ abstractC31503lvJ = (AbstractC31503lvJ) c43312rms.OLrzqt();
        if (abstractC31503lvJ != null) {
            abstractC31503lvJ.getRoot().setBackgroundResource(mDC.StateListAnimator.OLrzqt);
            if (cardVerificationItem.KWHzl().length() > 0) {
                android.widget.ImageView imageView = abstractC31503lvJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31503lvJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, cardVerificationItem.KWHzl(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31503lvJ.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) cardVerificationItem.OLrzqt())) {
                android.widget.TextView textView = abstractC31503lvJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31503lvJ.EZpvd.setText(cardVerificationItem.OLrzqt());
            } else {
                android.widget.TextView textView2 = abstractC31503lvJ.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            android.widget.TextView textView3 = abstractC31503lvJ.OLrzqt;
            java.lang.String strCopydefault = cardVerificationItem.copydefault();
            textView3.setText(strCopydefault != null ? strCopydefault : "");
            abstractC31503lvJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lHW.AEQbTJ(this.KWHzl, cardVerificationItem, view);
                }
            });
        }
    }

    public static final void AEQbTJ(lHW lhw, SelectionRow.CardVerificationItem cardVerificationItem, android.view.View view) {
        lhw.OLrzqt.invoke(cardVerificationItem);
    }
}
