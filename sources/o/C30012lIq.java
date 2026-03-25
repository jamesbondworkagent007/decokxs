package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30012lIq extends C43318rmy<SelectionRow.PaymentMethodStablecoinItem, AbstractC31515lvV> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function1<SelectionRow.PaymentMethodStablecoinItem, Unit> EZpvd;
    public final Function1<SelectionRow.PaymentMethodStablecoinItem, Unit> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodStablecoinItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodStablecoinItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30012lIq(@NotNull Function1<? super SelectionRow.PaymentMethodStablecoinItem, Unit> function1, @NotNull Function1<? super SelectionRow.PaymentMethodStablecoinItem, Unit> function12) {
        super(C31351lsQ.ActionBar.gkJEwt, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = function1;
        this.EZpvd = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31515lvV> c43312rms, @NotNull final SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(paymentMethodStablecoinItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, paymentMethodStablecoinItem);
        AbstractC31515lvV abstractC31515lvV = (AbstractC31515lvV) c43312rms.OLrzqt();
        if (abstractC31515lvV != null) {
            boolean zDbNXlk = paymentMethodStablecoinItem.DbNXlk();
            if (zDbNXlk) {
                abstractC31515lvV.getRoot().setAlpha(0.5f);
                abstractC31515lvV.getRoot().setOnClickListener(null);
                abstractC31515lvV.getRoot().setClickable(false);
            } else {
                abstractC31515lvV.getRoot().setAlpha(1.0f);
                abstractC31515lvV.getRoot().setClickable(true);
                abstractC31515lvV.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lIp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30012lIq.KWHzl(this.copydefault, paymentMethodStablecoinItem, view);
                    }
                });
            }
            if (paymentMethodStablecoinItem.AkhnZx()) {
                abstractC31515lvV.getRoot().setBackgroundResource(mDC.StateListAnimator.AEQbTJ);
            } else {
                abstractC31515lvV.getRoot().setBackgroundResource(mDC.StateListAnimator.OLrzqt);
            }
            if (paymentMethodStablecoinItem.AEQbTJ().length() > 0) {
                android.widget.ImageView imageView = abstractC31515lvV.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31515lvV.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, paymentMethodStablecoinItem.AEQbTJ(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31515lvV.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            if (paymentMethodStablecoinItem.djBIcL() != null) {
                android.widget.TextView textView = abstractC31515lvV.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31515lvV.gEmmrt.setText(paymentMethodStablecoinItem.djBIcL());
            } else {
                android.widget.TextView textView2 = abstractC31515lvV.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            abstractC31515lvV.OLrzqt.setText(paymentMethodStablecoinItem.KWHzl());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodStablecoinItem.AhwBna())) {
                C55251xgS c55251xgS = abstractC31515lvV.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                c55251xgS.setVisibility(0);
                abstractC31515lvV.djBIcL.setText(paymentMethodStablecoinItem.AhwBna());
            } else {
                C55251xgS c55251xgS2 = abstractC31515lvV.djBIcL;
                Intrinsics.checkNotNullExpressionValue(c55251xgS2, "");
                c55251xgS2.setVisibility(8);
            }
            if (paymentMethodStablecoinItem.fetchVPNInfo()) {
                ConstraintLayout constraintLayout = abstractC31515lvV.EZpvd;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                if (zDbNXlk) {
                    abstractC31515lvV.OLrzqt.setOnClickListener(null);
                    abstractC31515lvV.EZpvd.setOnClickListener(null);
                    abstractC31515lvV.EZpvd.setClickable(false);
                    return;
                }
                abstractC31515lvV.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lIn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30012lIq.EZpvd(this.copydefault, paymentMethodStablecoinItem, view);
                    }
                });
                if (C34703nhO.AEQbTJ()) {
                    android.widget.ImageView imageView4 = abstractC31515lvV.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                    return;
                } else {
                    abstractC31515lvV.EZpvd.setClickable(true);
                    abstractC31515lvV.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lIt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30012lIq.djBIcL(this.AEQbTJ, paymentMethodStablecoinItem, view);
                        }
                    });
                    return;
                }
            }
            ConstraintLayout constraintLayout2 = abstractC31515lvV.EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(paymentMethodStablecoinItem.EZpvd().length() <= 0 ? 8 : 0);
            android.widget.ImageView imageView5 = abstractC31515lvV.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(8);
        }
    }

    public static final void KWHzl(C30012lIq c30012lIq, SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem, android.view.View view) {
        c30012lIq.KWHzl.invoke(paymentMethodStablecoinItem);
    }

    public static final void EZpvd(C30012lIq c30012lIq, SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem, android.view.View view) {
        c30012lIq.EZpvd.invoke(paymentMethodStablecoinItem);
    }

    public static final void djBIcL(C30012lIq c30012lIq, SelectionRow.PaymentMethodStablecoinItem paymentMethodStablecoinItem, android.view.View view) {
        c30012lIq.EZpvd.invoke(paymentMethodStablecoinItem);
    }

    /* JADX INFO: renamed from: o.lIq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
