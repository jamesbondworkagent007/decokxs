package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C29997lIb extends C43318rmy<SelectionRow.PaymentMethodCashItem, AbstractC31502lvI> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final Function1<SelectionRow.PaymentMethodCashItem, Unit> EZpvd;
    public final Function1<SelectionRow.PaymentMethodCashItem, Unit> KWHzl;
    public final Function1<SelectionRow.PaymentMethodCashItem, Unit> OLrzqt;
    public final Function1<SelectionRow.PaymentMethodCashItem, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodCashItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodCashItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodCashItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodCashItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C29997lIb(@NotNull Function1<? super SelectionRow.PaymentMethodCashItem, Unit> function1, @NotNull Function1<? super SelectionRow.PaymentMethodCashItem, Unit> function12, @NotNull Function1<? super SelectionRow.PaymentMethodCashItem, Unit> function13, @NotNull Function1<? super SelectionRow.PaymentMethodCashItem, Unit> function14) {
        super(C31351lsQ.ActionBar.gGvvIC, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        Intrinsics.checkNotNullParameter(function14, "");
        this.KWHzl = function1;
        this.copydefault = function12;
        this.OLrzqt = function13;
        this.EZpvd = function14;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31502lvI> c43312rms, @NotNull final SelectionRow.PaymentMethodCashItem paymentMethodCashItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(paymentMethodCashItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, paymentMethodCashItem);
        AbstractC31502lvI abstractC31502lvI = (AbstractC31502lvI) c43312rms.OLrzqt();
        if (abstractC31502lvI != null) {
            boolean zValues = paymentMethodCashItem.values();
            if (zValues) {
                abstractC31502lvI.getRoot().setAlpha(0.5f);
            } else {
                abstractC31502lvI.getRoot().setAlpha(1.0f);
            }
            if (paymentMethodCashItem.isConnected()) {
                abstractC31502lvI.getRoot().setBackgroundResource(mDC.StateListAnimator.AEQbTJ);
            } else {
                abstractC31502lvI.getRoot().setBackgroundResource(mDC.StateListAnimator.OLrzqt);
            }
            if (zValues) {
                abstractC31502lvI.fetchVPNInfo.setOnClickListener(null);
                abstractC31502lvI.fetchVPNInfo.setClickable(false);
            } else {
                abstractC31502lvI.fetchVPNInfo.setClickable(true);
                abstractC31502lvI.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.lIa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C29997lIb.gEmmrt(this.KWHzl, paymentMethodCashItem, view);
                    }
                });
            }
            if (paymentMethodCashItem.EZpvd().length() > 0) {
                android.widget.ImageView imageView = abstractC31502lvI.AhwBna;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31502lvI.AhwBna;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, paymentMethodCashItem.EZpvd(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31502lvI.AhwBna;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            if (paymentMethodCashItem.valueOf() != null) {
                android.widget.TextView textView = abstractC31502lvI.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31502lvI.djBIcL.setText(paymentMethodCashItem.valueOf());
            } else {
                android.widget.TextView textView2 = abstractC31502lvI.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            abstractC31502lvI.gEmmrt.setText(paymentMethodCashItem.KWHzl());
            KWHzl(abstractC31502lvI, paymentMethodCashItem, zValues);
        }
    }

    public static final void gEmmrt(C29997lIb c29997lIb, SelectionRow.PaymentMethodCashItem paymentMethodCashItem, android.view.View view) {
        c29997lIb.KWHzl.invoke(paymentMethodCashItem);
    }

    public final void KWHzl(AbstractC31502lvI abstractC31502lvI, final SelectionRow.PaymentMethodCashItem paymentMethodCashItem, boolean z) {
        if (paymentMethodCashItem.fetchVPNInfo()) {
            ConstraintLayout constraintLayout = abstractC31502lvI.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            android.widget.TextView textView = abstractC31502lvI.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            android.widget.ImageView imageView = abstractC31502lvI.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.TextView textView2 = abstractC31502lvI.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.ImageView imageView2 = abstractC31502lvI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            ConstraintLayout constraintLayout2 = abstractC31502lvI.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
            abstractC31502lvI.KWHzl.setText(paymentMethodCashItem.copydefault());
            if (z) {
                abstractC31502lvI.AYXKKw.setOnClickListener(null);
                abstractC31502lvI.AYXKKw.setClickable(false);
                return;
            }
            abstractC31502lvI.AYXKKw.setClickable(true);
            if (C34703nhO.AEQbTJ()) {
                abstractC31502lvI.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.lIc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C29997lIb.AYXKKw(this.copydefault, paymentMethodCashItem, view);
                    }
                });
                abstractC31502lvI.valueOf.setImageResource(C52761wXj.TaskDescription.fzHEvu);
                return;
            } else {
                abstractC31502lvI.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.lHZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C29997lIb.valueOf(this.OLrzqt, paymentMethodCashItem, view);
                    }
                });
                return;
            }
        }
        if (paymentMethodCashItem.AkhnZx()) {
            if (paymentMethodCashItem.djBIcL()) {
                abstractC31502lvI.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DsL));
            } else {
                abstractC31502lvI.OLrzqt.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.DcMfJKDDUqPf));
            }
            ConstraintLayout constraintLayout3 = abstractC31502lvI.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
            constraintLayout3.setVisibility(8);
            android.widget.ImageView imageView3 = abstractC31502lvI.valueOf;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
            C52794wYp c52794wYp = abstractC31502lvI.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
            c52794wYp.setVisibility(8);
            C52794wYp c52794wYp2 = abstractC31502lvI.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c52794wYp2, "");
            c52794wYp2.setVisibility(8);
            abstractC31502lvI.KWHzl.setVisibility(4);
            android.widget.TextView textView3 = abstractC31502lvI.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(0);
            android.widget.ImageView imageView4 = abstractC31502lvI.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(0);
            if (z) {
                abstractC31502lvI.gEmmrt.setOnClickListener(null);
                abstractC31502lvI.OLrzqt.setOnClickListener(null);
                abstractC31502lvI.EZpvd.setOnClickListener(null);
                abstractC31502lvI.OLrzqt.setClickable(false);
                abstractC31502lvI.EZpvd.setClickable(false);
                return;
            }
            abstractC31502lvI.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.lIe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29997lIb.djBIcL(this.KWHzl, paymentMethodCashItem, view);
                }
            });
            abstractC31502lvI.OLrzqt.setClickable(true);
            abstractC31502lvI.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lIf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29997lIb.fetchVPNInfo(this.AEQbTJ, paymentMethodCashItem, view);
                }
            });
            abstractC31502lvI.EZpvd.setClickable(true);
            abstractC31502lvI.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.lId
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29997lIb.values(this.AEQbTJ, paymentMethodCashItem, view);
                }
            });
            return;
        }
        ConstraintLayout constraintLayout4 = abstractC31502lvI.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
        constraintLayout4.setVisibility(0);
        android.widget.TextView textView4 = abstractC31502lvI.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        android.widget.ImageView imageView5 = abstractC31502lvI.valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView5, "");
        imageView5.setVisibility(8);
        android.widget.TextView textView5 = abstractC31502lvI.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setVisibility(8);
        android.widget.ImageView imageView6 = abstractC31502lvI.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView6, "");
        imageView6.setVisibility(8);
        ConstraintLayout constraintLayout5 = abstractC31502lvI.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
        constraintLayout5.setVisibility(8);
    }

    public static final void AYXKKw(C29997lIb c29997lIb, SelectionRow.PaymentMethodCashItem paymentMethodCashItem, android.view.View view) {
        c29997lIb.copydefault.invoke(paymentMethodCashItem);
    }

    public static final void valueOf(C29997lIb c29997lIb, SelectionRow.PaymentMethodCashItem paymentMethodCashItem, android.view.View view) {
        c29997lIb.EZpvd.invoke(paymentMethodCashItem);
    }

    public static final void djBIcL(C29997lIb c29997lIb, SelectionRow.PaymentMethodCashItem paymentMethodCashItem, android.view.View view) {
        c29997lIb.copydefault.invoke(paymentMethodCashItem);
    }

    public static final void fetchVPNInfo(C29997lIb c29997lIb, SelectionRow.PaymentMethodCashItem paymentMethodCashItem, android.view.View view) {
        c29997lIb.copydefault.invoke(paymentMethodCashItem);
    }

    public static final void values(C29997lIb c29997lIb, SelectionRow.PaymentMethodCashItem paymentMethodCashItem, android.view.View view) {
        c29997lIb.copydefault.invoke(paymentMethodCashItem);
    }

    /* JADX INFO: renamed from: o.lIb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
