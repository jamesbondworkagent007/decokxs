package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lHU extends C43318rmy<SelectionRow.AddPaymentMethodItem, AbstractC31501lvH> {
    public final Function1<SelectionRow.AddPaymentMethodItem, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$AddPaymentMethodItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lHU(@NotNull Function1<? super SelectionRow.AddPaymentMethodItem, Unit> function1) {
        super(C31351lsQ.ActionBar.dvKsVJ, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31501lvH> c43312rms, @NotNull final SelectionRow.AddPaymentMethodItem addPaymentMethodItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(addPaymentMethodItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, addPaymentMethodItem);
        AbstractC31501lvH abstractC31501lvH = (AbstractC31501lvH) c43312rms.OLrzqt();
        if (abstractC31501lvH != null) {
            abstractC31501lvH.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lHX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    lHU.AEQbTJ(this.EZpvd, addPaymentMethodItem, view);
                }
            });
            if (C33129mqd.OLrzqt((java.lang.CharSequence) addPaymentMethodItem.copydefault())) {
                android.widget.ImageView imageView = abstractC31501lvH.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31501lvH.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, addPaymentMethodItem.copydefault(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31501lvH.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            abstractC31501lvH.EZpvd.setText(addPaymentMethodItem.AYXKKw());
            java.lang.String strKWHzl = addPaymentMethodItem.KWHzl();
            java.lang.String strGEmmrt = addPaymentMethodItem.gEmmrt();
            if ((strKWHzl == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) && (strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt))) {
                ConstraintLayout constraintLayout = abstractC31501lvH.djBIcL;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(8);
                return;
            }
            ConstraintLayout constraintLayout2 = abstractC31501lvH.djBIcL;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strKWHzl)) {
                C55251xgS c55251xgS = abstractC31501lvH.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                c55251xgS.setVisibility(0);
                C55251xgS c55251xgS2 = abstractC31501lvH.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                java.lang.String strEZpvd = addPaymentMethodItem.EZpvd();
                if (strEZpvd == null) {
                    strEZpvd = "tier2";
                }
                KWHzl(c55251xgS2, strKWHzl, strEZpvd);
            } else {
                C55251xgS c55251xgS3 = abstractC31501lvH.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55251xgS3, "");
                c55251xgS3.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                C55251xgS c55251xgS4 = abstractC31501lvH.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS4, "");
                c55251xgS4.setVisibility(0);
                C55251xgS c55251xgS5 = abstractC31501lvH.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55251xgS5, "");
                java.lang.String str = strGEmmrt != null ? strGEmmrt : "";
                java.lang.String strAEQbTJ = addPaymentMethodItem.AEQbTJ();
                KWHzl(c55251xgS5, str, strAEQbTJ != null ? strAEQbTJ : "tier2");
                return;
            }
            C55251xgS c55251xgS6 = abstractC31501lvH.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55251xgS6, "");
            c55251xgS6.setVisibility(8);
        }
    }

    public static final void AEQbTJ(lHU lhu, SelectionRow.AddPaymentMethodItem addPaymentMethodItem, android.view.View view) {
        lhu.KWHzl.invoke(addPaymentMethodItem);
    }

    public final void KWHzl(C55251xgS c55251xgS, java.lang.String str, java.lang.String str2) {
        c55251xgS.setText(str);
        C30329lUi c30329lUi = C30329lUi.AEQbTJ;
        c55251xgS.setBackgroundTintList(c30329lUi.copydefault(str2));
        c55251xgS.setTextColor(C33070mpX.copydefault(c30329lUi.EZpvd(str2)));
    }
}
