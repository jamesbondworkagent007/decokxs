package o;

import android.view.View;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30008lIm extends C43318rmy<SelectionRow.PaymentMethodItem, AbstractC31508lvO> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function1<SelectionRow.PaymentMethodItem, Unit> EZpvd;
    public final Function1<SelectionRow.PaymentMethodItem, Unit> KWHzl;
    public final Function1<SelectionRow.PaymentMethodItem, Unit> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30008lIm(@NotNull Function1<? super SelectionRow.PaymentMethodItem, Unit> function1, @NotNull Function1<? super SelectionRow.PaymentMethodItem, Unit> function12, @NotNull Function1<? super SelectionRow.PaymentMethodItem, Unit> function13) {
        super(C31351lsQ.ActionBar.fvQaOB, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function13, "");
        this.EZpvd = function1;
        this.OLrzqt = function12;
        this.KWHzl = function13;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31508lvO> c43312rms, @NotNull final SelectionRow.PaymentMethodItem paymentMethodItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(paymentMethodItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, paymentMethodItem);
        AbstractC31508lvO abstractC31508lvO = (AbstractC31508lvO) c43312rms.OLrzqt();
        if (abstractC31508lvO != null) {
            boolean zFetchVPNInfo = paymentMethodItem.fetchVPNInfo();
            if (zFetchVPNInfo) {
                abstractC31508lvO.getRoot().setAlpha(0.5f);
                abstractC31508lvO.getRoot().setOnClickListener(null);
                abstractC31508lvO.getRoot().setOnLongClickListener(null);
                abstractC31508lvO.getRoot().setClickable(false);
                abstractC31508lvO.getRoot().setLongClickable(false);
            } else {
                abstractC31508lvO.getRoot().setAlpha(1.0f);
                abstractC31508lvO.getRoot().setClickable(true);
                abstractC31508lvO.getRoot().setLongClickable(true);
                abstractC31508lvO.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lIi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30008lIm.AEQbTJ(this.EZpvd, paymentMethodItem, view);
                    }
                });
                abstractC31508lvO.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: o.lIk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(android.view.View view) {
                        return C30008lIm.KWHzl(this.copydefault, paymentMethodItem, view);
                    }
                });
            }
            if (paymentMethodItem.isConnected()) {
                abstractC31508lvO.getRoot().setBackgroundResource(mDC.StateListAnimator.AEQbTJ);
            } else {
                abstractC31508lvO.getRoot().setBackgroundResource(mDC.StateListAnimator.OLrzqt);
            }
            if (paymentMethodItem.EZpvd().length() > 0) {
                android.widget.ImageView imageView = abstractC31508lvO.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31508lvO.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, paymentMethodItem.EZpvd(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31508lvO.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodItem.valueOf())) {
                android.widget.TextView textView = abstractC31508lvO.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31508lvO.djBIcL.setText(paymentMethodItem.valueOf());
            } else {
                android.widget.TextView textView2 = abstractC31508lvO.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            android.widget.TextView textView3 = abstractC31508lvO.AYXKKw;
            java.lang.String strAYXKKw = paymentMethodItem.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            textView3.setText(strAYXKKw);
            if (paymentMethodItem.AEQbTJ()) {
                abstractC31508lvO.gEmmrt.setVisibility(0);
                abstractC31508lvO.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            } else {
                abstractC31508lvO.gEmmrt.setVisibility(8);
                abstractC31508lvO.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) paymentMethodItem.AhwBna())) {
                android.widget.TextView textView4 = abstractC31508lvO.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(0);
                abstractC31508lvO.copydefault.setText(paymentMethodItem.AhwBna());
            } else {
                android.widget.TextView textView5 = abstractC31508lvO.copydefault;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                textView5.setVisibility(8);
            }
            abstractC31508lvO.AEQbTJ.setText(paymentMethodItem.OLrzqt());
            abstractC31508lvO.KWHzl.setText(paymentMethodItem.copydefault());
            if (paymentMethodItem.djBIcL()) {
                android.widget.ImageView imageView4 = abstractC31508lvO.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                imageView4.setVisibility(0);
                if (zFetchVPNInfo) {
                    abstractC31508lvO.OLrzqt.setOnClickListener(null);
                    abstractC31508lvO.OLrzqt.setClickable(false);
                    return;
                } else {
                    abstractC31508lvO.OLrzqt.setClickable(true);
                    abstractC31508lvO.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lIo
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30008lIm.valueOf(this.AEQbTJ, paymentMethodItem, view);
                        }
                    });
                    return;
                }
            }
            android.widget.ImageView imageView5 = abstractC31508lvO.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(8);
            abstractC31508lvO.OLrzqt.setOnClickListener(null);
        }
    }

    public static final void AEQbTJ(C30008lIm c30008lIm, SelectionRow.PaymentMethodItem paymentMethodItem, android.view.View view) {
        c30008lIm.EZpvd.invoke(paymentMethodItem);
    }

    public static final boolean KWHzl(C30008lIm c30008lIm, SelectionRow.PaymentMethodItem paymentMethodItem, android.view.View view) {
        c30008lIm.KWHzl.invoke(paymentMethodItem);
        return true;
    }

    public static final void valueOf(C30008lIm c30008lIm, SelectionRow.PaymentMethodItem paymentMethodItem, android.view.View view) {
        c30008lIm.OLrzqt.invoke(paymentMethodItem);
    }

    /* JADX INFO: renamed from: o.lIm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
