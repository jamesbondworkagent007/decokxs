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
public final class lHT extends C43318rmy<SelectionRow.AchRelinkItem, AbstractC31497lvD> {
    public final Function1<SelectionRow.AchRelinkItem, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$AchRelinkItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lHT(@NotNull Function1<? super SelectionRow.AchRelinkItem, Unit> function1) {
        super(C31351lsQ.ActionBar.fFgQHt, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31497lvD> c43312rms, @NotNull final SelectionRow.AchRelinkItem achRelinkItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(achRelinkItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, achRelinkItem);
        AbstractC31497lvD abstractC31497lvD = (AbstractC31497lvD) c43312rms.OLrzqt();
        if (abstractC31497lvD != null) {
            abstractC31497lvD.getRoot().setBackgroundResource(mDC.StateListAnimator.OLrzqt);
            if (achRelinkItem.AEQbTJ().length() > 0) {
                android.widget.ImageView imageView = abstractC31497lvD.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31497lvD.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, achRelinkItem.AEQbTJ(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31497lvD.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) achRelinkItem.copydefault())) {
                android.widget.TextView textView = abstractC31497lvD.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31497lvD.valueOf.setText(achRelinkItem.copydefault());
            } else {
                android.widget.TextView textView2 = abstractC31497lvD.valueOf;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            android.widget.TextView textView3 = abstractC31497lvD.gEmmrt;
            java.lang.String strKWHzl = achRelinkItem.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            textView3.setText(strKWHzl);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) achRelinkItem.OLrzqt())) {
                android.widget.TextView textView4 = abstractC31497lvD.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                abstractC31497lvD.AEQbTJ.setText(achRelinkItem.OLrzqt());
            } else {
                android.widget.TextView textView5 = abstractC31497lvD.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(8);
            }
            abstractC31497lvD.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lHT.EZpvd(this.OLrzqt, achRelinkItem, view);
                }
            });
        }
    }

    public static final void EZpvd(lHT lht, SelectionRow.AchRelinkItem achRelinkItem, android.view.View view) {
        lht.copydefault.invoke(achRelinkItem);
    }
}
