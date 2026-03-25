package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelPlatformCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C30107lMd;
import o.C31351lsQ;
import o.C52761wXj;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30155lNy extends C43318rmy<AbstractC30156lNz, AbstractC31580lwi> {
    public final SelectPaymentMethodViewModel AEQbTJ;
    public final PaymentMethodSelectionViewModel EZpvd;
    public final Function0<Unit> KWHzl;
    public final androidx.fragment.app.FragmentManager OLrzqt;
    public PaymentMethod copydefault;

    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
        onBindViewHolder((C43312rms<AbstractC31580lwi>) c43312rms, (AbstractC30156lNz) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30155lNy(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull SelectPaymentMethodViewModel selectPaymentMethodViewModel, @NotNull PaymentMethodSelectionViewModel paymentMethodSelectionViewModel, @NotNull Function0<Unit> function0) {
        super(C31351lsQ.ActionBar.RlQdEF, 0);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(selectPaymentMethodViewModel, "");
        Intrinsics.checkNotNullParameter(paymentMethodSelectionViewModel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = fragmentManager;
        this.AEQbTJ = selectPaymentMethodViewModel;
        this.EZpvd = paymentMethodSelectionViewModel;
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final C43312rms<AbstractC31580lwi> c43312rms, @NotNull final AbstractC30156lNz abstractC30156lNz) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(abstractC30156lNz, "");
        AbstractC31580lwi abstractC31580lwi = (AbstractC31580lwi) c43312rms.OLrzqt();
        android.widget.ImageView imageView = abstractC31580lwi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.widget.Space space = abstractC31580lwi.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(space, "");
        lNB.OLrzqt(abstractC30156lNz, imageView, space);
        if (abstractC30156lNz.AkhnZx() && C33129mqd.OLrzqt((java.lang.CharSequence) abstractC30156lNz.uzCIH())) {
            if (abstractC30156lNz.ejfBZ()) {
                abstractC31580lwi.AhwBna.setVisibility(8);
                abstractC31580lwi.fetchVPNInfo.setVisibility(0);
                abstractC31580lwi.fetchVPNInfo.setText(abstractC30156lNz.uzCIH());
                ViewGroup.LayoutParams layoutParams = abstractC31580lwi.valueOf.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.topToBottom = C31351lsQ.Application.DsfknC;
                abstractC31580lwi.valueOf.setLayoutParams(layoutParams2);
                ViewGroup.LayoutParams layoutParams3 = abstractC31580lwi.djBIcL.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                layoutParams4.topToBottom = C31351lsQ.Application.DsfknC;
                abstractC31580lwi.djBIcL.setLayoutParams(layoutParams4);
            } else {
                abstractC31580lwi.fetchVPNInfo.setVisibility(8);
                abstractC31580lwi.AhwBna.setVisibility(0);
                abstractC31580lwi.AhwBna.setText(abstractC30156lNz.uzCIH());
                ViewGroup.LayoutParams layoutParams5 = abstractC31580lwi.valueOf.getLayoutParams();
                Intrinsics.copydefault(layoutParams5, "");
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
                layoutParams6.topToBottom = C31351lsQ.Application.zlzhuY;
                abstractC31580lwi.valueOf.setLayoutParams(layoutParams6);
            }
        } else {
            abstractC31580lwi.AhwBna.setVisibility(8);
            abstractC31580lwi.fetchVPNInfo.setVisibility(8);
        }
        if (abstractC30156lNz.DbNXlk()) {
            abstractC31580lwi.EZpvd.setVisibility(8);
            android.widget.TextView textView = abstractC31580lwi.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            lNB.copydefault(abstractC30156lNz, textView);
        } else {
            abstractC31580lwi.valueOf.setVisibility(8);
            android.widget.TextView textView2 = abstractC31580lwi.EZpvd;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            lNB.copydefault(abstractC30156lNz, textView2);
        }
        if (abstractC30156lNz.isConnected()) {
            android.widget.TextView textView3 = abstractC31580lwi.djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            lNB.OLrzqt(abstractC30156lNz, textView3);
        }
        if (!abstractC30156lNz.AkhnZx()) {
            abstractC31580lwi.EZpvd.setMaxWidth(Integer.MAX_VALUE);
        }
        android.widget.TextView textView4 = abstractC31580lwi.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        lNB.AEQbTJ(abstractC30156lNz, textView4);
        android.widget.TextView textView5 = abstractC31580lwi.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        lNB.OLrzqt(abstractC30156lNz, textView5, abstractC30156lNz.KWHzl());
        android.widget.TextView textView6 = abstractC31580lwi.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView6, "");
        lNB.EZpvd(abstractC30156lNz, textView6, abstractC30156lNz.KWHzl());
        android.widget.TextView textView7 = abstractC31580lwi.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView7, "");
        lNB.EZpvd(abstractC30156lNz, textView7);
        android.widget.TextView textView8 = abstractC31580lwi.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        lNB.KWHzl(abstractC30156lNz, textView8);
        if (abstractC30156lNz.KWHzl()) {
            abstractC31580lwi.getRoot().setBackgroundResource(mDC.StateListAnimator.DbNXlk);
        } else {
            abstractC31580lwi.getRoot().setBackground(null);
        }
        if (abstractC30156lNz.valueOf()) {
            abstractC31580lwi.copydefault.setVisibility(abstractC30156lNz.KWHzl() ? 0 : 4);
            abstractC31580lwi.AEQbTJ.setVisibility(4);
            abstractC31580lwi.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lNA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30155lNy.copydefault(abstractC30156lNz, this, c43312rms, view);
                }
            });
        } else {
            abstractC31580lwi.copydefault.setVisibility(4);
            android.widget.ImageView imageView2 = abstractC31580lwi.AEQbTJ;
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.DcMfJKsuEgdN));
            imageView2.getDrawable().setTint(C33070mpX.copydefault(C52761wXj.Activity.RXzakW));
            abstractC31580lwi.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lNE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30155lNy.copydefault(this.AEQbTJ, abstractC30156lNz, c43312rms, view);
                }
            });
        }
        abstractC30156lNz.fJNWhG();
    }

    public static final void copydefault(AbstractC30156lNz abstractC30156lNz, C30155lNy c30155lNy, C43312rms c43312rms, android.view.View view) {
        if (abstractC30156lNz.KWHzl()) {
            return;
        }
        java.util.Iterator<T> it = c30155lNy.AEQbTJ.fARcdN().iterator();
        while (it.hasNext()) {
            ((AbstractC30156lNz) it.next()).EZpvd(false);
        }
        abstractC30156lNz.EZpvd(true);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
        if (bindingAdapter != null) {
            bindingAdapter.notifyDataSetChanged();
        }
        c30155lNy.EZpvd.KWHzl(abstractC30156lNz.iwGUEr());
    }

    public static final void copydefault(C30155lNy c30155lNy, AbstractC30156lNz abstractC30156lNz, final C43312rms c43312rms, android.view.View view) {
        c30155lNy.OLrzqt(abstractC30156lNz, new Function0() { // from class: o.lNK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30155lNy.copydefault(c43312rms);
            }
        });
    }

    public static final Unit copydefault(C43312rms c43312rms) {
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
        if (bindingAdapter != null) {
            bindingAdapter.notifyDataSetChanged();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractC30156lNz abstractC30156lNz, final Function0<Unit> function0) {
        C30107lMd c30107lMdNewInstance$default = C30107lMd.Application.newInstance$default(C30107lMd.Companion, new Function0() { // from class: o.lNC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30155lNy.KWHzl(this.EZpvd);
            }
        }, new Function1() { // from class: o.lND
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30155lNy.copydefault(this.KWHzl, (PaymentMethod) obj);
            }
        }, new Function1() { // from class: o.lNF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30155lNy.EZpvd(this.KWHzl, function0, (PaymentMethod) obj);
            }
        }, new Function0() { // from class: o.lNG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30155lNy.EZpvd(this.KWHzl);
            }
        }, !Intrinsics.EZpvd((java.lang.Object) (this.EZpvd.fARcdN() != null ? r0.getDepositPlatformCode() : null), (java.lang.Object) ChannelPlatformCode.BUY_PAYPAL.getCode()), false, null, null, 224, null);
        c30107lMdNewInstance$default.show(this.OLrzqt, C56524yIo.AEQbTJ(c30107lMdNewInstance$default.getClass()).valueOf());
        abstractC30156lNz.AuCTel();
    }

    public static final Unit KWHzl(C30155lNy c30155lNy) {
        c30155lNy.EZpvd.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30155lNy c30155lNy, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = c30155lNy.EZpvd.fARcdN();
        if (channelFARcdN != null) {
            c30155lNy.AEQbTJ.AYXKKw(channelFARcdN, paymentMethod);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C30155lNy c30155lNy, Function0 function0, PaymentMethod paymentMethod) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        if (!Intrinsics.EZpvd(paymentMethod, c30155lNy.copydefault)) {
            java.util.Iterator<T> it = c30155lNy.AEQbTJ.fARcdN().iterator();
            while (it.hasNext()) {
                ((AbstractC30156lNz) it.next()).EZpvd(false);
            }
            java.util.Iterator<T> it2 = c30155lNy.AEQbTJ.fARcdN().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd(((AbstractC30156lNz) next).iwGUEr(), paymentMethod)) {
                    break;
                }
            }
            AbstractC30156lNz abstractC30156lNz = (AbstractC30156lNz) next;
            if (abstractC30156lNz != null) {
                abstractC30156lNz.EZpvd(true);
            }
            function0.invoke();
            c30155lNy.EZpvd.KWHzl(paymentMethod);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C30155lNy c30155lNy) {
        c30155lNy.KWHzl.invoke();
        return Unit.INSTANCE;
    }
}
