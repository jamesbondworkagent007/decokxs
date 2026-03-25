package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iUB extends iTL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public C25537iyb AEQbTJ;
    public iJO AhwBna;
    public final boolean KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iUH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iUB.AEQbTJ(this.KWHzl);
        }
    });
    public final boolean copydefault;
    public AbstractC23824iKr djBIcL;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull AbstractC23824iKr abstractC23824iKr) {
        Intrinsics.checkNotNullParameter(abstractC23824iKr, "");
        this.djBIcL = abstractC23824iKr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C25537iyb c25537iyb) {
        Intrinsics.checkNotNullParameter(c25537iyb, "");
        this.AEQbTJ = c25537iyb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull iJO ijo) {
        Intrinsics.checkNotNullParameter(ijo, "");
        this.AhwBna = ijo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean values() {
        return this.copydefault;
    }

    public final AbstractC23824iKr EZpvd() {
        AbstractC23824iKr abstractC23824iKr = this.djBIcL;
        if (abstractC23824iKr != null) {
            return abstractC23824iKr;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iJO KWHzl() {
        iJO ijo = this.AhwBna;
        if (ijo != null) {
            return ijo;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final iUB EZpvd(@NotNull C25537iyb c25537iyb) {
            Intrinsics.checkNotNullParameter(c25537iyb, "");
            iUB iub = new iUB();
            iub.KWHzl(c25537iyb);
            return iub;
        }
    }

    public final C25537iyb copydefault() {
        C25537iyb c25537iyb = this.AEQbTJ;
        if (c25537iyb != null) {
            return c25537iyb;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InvestSubscriptionNewViewModel OLrzqt() {
        return (InvestSubscriptionNewViewModel) this.OLrzqt.getValue();
    }

    public static final InvestSubscriptionNewViewModel AEQbTJ(iUB iub) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = iub.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (InvestSubscriptionNewViewModel) new ViewModelProvider(fragmentRequireParentFragment).get(InvestSubscriptionNewViewModel.class);
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AEQbTJ((AbstractC23824iKr) DataBindingUtil.inflate(layoutInflater, C25493ixk.Activity.sTzBva, null, false));
        android.view.View root = EZpvd().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        OLrzqt(iJO.OLrzqt(layoutInflater, null, false));
        KWHzl().AEQbTJ.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.Th));
        android.widget.LinearLayout root = KWHzl().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl().EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.iUE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                iUB.AEQbTJ(this.KWHzl, view2);
            }
        });
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        EZpvd().copydefault.removeAllViews();
        for (InvestTokenWithAmount investTokenWithAmount : copydefault().KWHzl()) {
            android.view.View root = ((iLW) DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.reset, EZpvd().copydefault, true)).getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            EZpvd(root, investTokenWithAmount, copydefault().AEQbTJ(), copydefault().EZpvd());
        }
        OLrzqt().fIwbmz().observe(this, new StateListAnimator(new Function1() { // from class: o.iUF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iUB.copydefault(this.copydefault, (C25537iyb) obj);
            }
        }));
    }

    public static final void AEQbTJ(iUB iub, android.view.View view) {
        iub.dismissAllowingStateLoss();
    }

    public static final Unit copydefault(iUB iub, C25537iyb c25537iyb) {
        android.widget.LinearLayout linearLayout = iub.EZpvd().copydefault;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = linearLayout.getChildAt(i);
            Intrinsics.copydefault(childAt);
            iub.EZpvd(childAt, c25537iyb.KWHzl().get(i), c25537iyb.AEQbTJ(), c25537iyb.EZpvd());
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.view.View view, InvestTokenWithAmount investTokenWithAmount, boolean z, boolean z2) {
        android.view.View viewFindViewById = view.findViewById(C25493ixk.ActionBar.RYPzIz);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C25493ixk.ActionBar.OBzZra);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.TextView textView2 = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C25493ixk.ActionBar.jh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C25493ixk.ActionBar.extraCommand);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        android.widget.TextView textView3 = (android.widget.TextView) viewFindViewById4;
        if (investTokenWithAmount.getTokenLogo().length() > 0) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        }
        if (investTokenWithAmount.getDataType() == InvestTokenType.TRADING_FEE) {
            imageView.setVisibility(8);
            if (textView2.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                ((ConstraintLayout.LayoutParams) layoutParams).setMarginStart(0);
            }
            textView2.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQnQnb));
            if (z) {
                textView.setText(C27492jwH.formatZeroCurrencyDataWithSymbol$default(C27492jwH.OLrzqt, false, 1, null));
                return;
            }
            if (z2) {
                textView.setText("--");
                return;
            } else if (investTokenWithAmount.getCurrencyAmount().length() > 0) {
                textView.setText(C27492jwH.OLrzqt.KWHzl(investTokenWithAmount.getCurrencyAmount()));
                return;
            } else {
                textView.setText("--");
                return;
            }
        }
        if (investTokenWithAmount.getDataType() == InvestTokenType.BONUS) {
            textView3.setVisibility(0);
            textView3.setBackground(ContextCompat.getDrawable(textView3.getContext(), C25493ixk.StateListAnimator.OLrzqt));
            textView3.setText(textView3.getContext().getString(C25493ixk.FragmentManager.QIZEnU));
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView3.getContext(), C25493ixk.StateListAnimator.valueOf);
            if (drawable != null) {
                android.content.Context context = textView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iCopydefault = C55298xhM.copydefault(10.0f, context);
                android.content.Context context2 = textView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(10.0f, context2));
                DrawableCompat.setTint(drawable, C33070mpX.copydefault(C25493ixk.TaskDescription.AYXKKw));
            }
            textView3.setCompoundDrawablesRelative(drawable, null, null, null);
            android.content.Context context3 = textView3.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            textView3.setCompoundDrawablePadding(C55298xhM.copydefault(2.0f, context3));
            textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), C25493ixk.TaskDescription.AYXKKw));
        } else {
            textView3.setVisibility(8);
        }
        imageView.setVisibility(0);
        if (textView2.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ((ConstraintLayout.LayoutParams) layoutParams2).setMarginStart(C55298xhM.copydefault(8.0f, contextRequireContext));
        }
        textView2.setText(investTokenWithAmount.getTokenSymbol());
        if (z) {
            textView.setText(C27492jwH.OLrzqt.KWHzl(false));
            return;
        }
        if (z2) {
            textView.setText("--");
        } else if (investTokenWithAmount.getCoinAmount().length() > 0) {
            textView.setText(C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
        } else {
            textView.setText("--");
        }
    }
}
