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

/* JADX INFO: renamed from: o.lIh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30003lIh extends C43318rmy<SelectionRow.PaymentMethodCryptoItem, AbstractC31506lvM> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final Function1<SelectionRow.PaymentMethodCryptoItem, Unit> AEQbTJ;
    public final Function1<SelectionRow.PaymentMethodCryptoItem, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodCryptoItem, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.paymentmethod.data.SelectionRow$PaymentMethodCryptoItem, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30003lIh(@NotNull Function1<? super SelectionRow.PaymentMethodCryptoItem, Unit> function1, @NotNull Function1<? super SelectionRow.PaymentMethodCryptoItem, Unit> function12) {
        super(C31351lsQ.ActionBar.flVtFt, 0);
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.AEQbTJ = function12;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31506lvM> c43312rms, @NotNull final SelectionRow.PaymentMethodCryptoItem paymentMethodCryptoItem) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(paymentMethodCryptoItem, "");
        super.onBindViewHolder((C43312rms) c43312rms, paymentMethodCryptoItem);
        AbstractC31506lvM abstractC31506lvM = (AbstractC31506lvM) c43312rms.OLrzqt();
        if (abstractC31506lvM != null) {
            boolean zDbNXlk = paymentMethodCryptoItem.DbNXlk();
            if (zDbNXlk) {
                abstractC31506lvM.getRoot().setAlpha(0.5f);
                abstractC31506lvM.getRoot().setOnClickListener(null);
                abstractC31506lvM.getRoot().setClickable(false);
            } else {
                abstractC31506lvM.getRoot().setAlpha(1.0f);
                abstractC31506lvM.getRoot().setClickable(true);
                abstractC31506lvM.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lIg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30003lIh.EZpvd(this.KWHzl, paymentMethodCryptoItem, view);
                    }
                });
            }
            if (paymentMethodCryptoItem.AkhnZx()) {
                abstractC31506lvM.getRoot().setBackgroundResource(mDC.StateListAnimator.AEQbTJ);
            } else {
                abstractC31506lvM.getRoot().setBackgroundResource(mDC.StateListAnimator.OLrzqt);
            }
            if (paymentMethodCryptoItem.OLrzqt().length() > 0) {
                android.widget.ImageView imageView = abstractC31506lvM.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = abstractC31506lvM.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C33054mpH.AEQbTJ(imageView2, paymentMethodCryptoItem.OLrzqt(), mDC.StateListAnimator.djBIcL);
            } else {
                android.widget.ImageView imageView3 = abstractC31506lvM.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
            }
            if (paymentMethodCryptoItem.djBIcL() != null) {
                android.widget.TextView textView = abstractC31506lvM.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                abstractC31506lvM.djBIcL.setText(paymentMethodCryptoItem.djBIcL());
            } else {
                android.widget.TextView textView2 = abstractC31506lvM.djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
            }
            abstractC31506lvM.copydefault.setText(paymentMethodCryptoItem.AEQbTJ());
            C55251xgS c55251xgS = abstractC31506lvM.valueOf;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
            if (paymentMethodCryptoItem.values()) {
                ConstraintLayout constraintLayout = abstractC31506lvM.KWHzl;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(0);
                if (zDbNXlk) {
                    abstractC31506lvM.KWHzl.setOnClickListener(null);
                    abstractC31506lvM.KWHzl.setClickable(false);
                    return;
                } else if (C34703nhO.AEQbTJ()) {
                    android.widget.ImageView imageView4 = abstractC31506lvM.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(imageView4, "");
                    imageView4.setVisibility(8);
                    return;
                } else {
                    abstractC31506lvM.KWHzl.setClickable(true);
                    abstractC31506lvM.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.lIl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C30003lIh.KWHzl(this.KWHzl, paymentMethodCryptoItem, view);
                        }
                    });
                    return;
                }
            }
            ConstraintLayout constraintLayout2 = abstractC31506lvM.KWHzl;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(8);
        }
    }

    public static final void EZpvd(C30003lIh c30003lIh, SelectionRow.PaymentMethodCryptoItem paymentMethodCryptoItem, android.view.View view) {
        c30003lIh.copydefault.invoke(paymentMethodCryptoItem);
    }

    public static final void KWHzl(C30003lIh c30003lIh, SelectionRow.PaymentMethodCryptoItem paymentMethodCryptoItem, android.view.View view) {
        c30003lIh.AEQbTJ.invoke(paymentMethodCryptoItem);
    }

    /* JADX INFO: renamed from: o.lIh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lIh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
