package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelTag;
import com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.TextColor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rMC extends android.widget.FrameLayout {
    public final AbstractC43854rxD AEQbTJ;
    public final C42519rVw KWHzl;
    public ViewStatus OLrzqt;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UIAlignment.values().length];
            try {
                iArr[UIAlignment.Center.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UIAlignment.Trailing.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

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
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMC(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rMC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.OLrzqt = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.rMC.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rMC(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rMC(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = ViewStatus.Form;
        this.KWHzl = new C42519rVw(context, attributeSet, i);
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.iRxXKY, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43854rxD) viewDataBindingInflate;
    }

    public void EZpvd(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final HelperLabelAppModel helperLabelAppModel = uIComponentAppModel instanceof HelperLabelAppModel ? (HelperLabelAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (helperLabelAppModel != null ? helperLabelAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (helperLabelAppModel != null && Intrinsics.EZpvd(helperLabelAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rMz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rMC.copydefault(helperLabelAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (helperLabelAppModel != null ? helperLabelAppModel.getId() : null))) {
                        rax2.setValue(null);
                    }
                }
                return;
            }
            return;
        }
        java.util.Iterator<T> it3 = ((C42179rJg) abstractC42074rFj).AubY().iterator();
        while (it3.hasNext()) {
            rAX rax3 = (rAX) it3.next();
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (helperLabelAppModel != null ? helperLabelAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit copydefault(HelperLabelAppModel helperLabelAppModel, rMC rmc, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), helperLabelAppModel != null ? helperLabelAppModel.getId() : null) && rmc.getVisibility() == 8) {
                rmc.setVisibility(0);
                if (helperLabelAppModel != null) {
                    helperLabelAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), helperLabelAppModel != null ? helperLabelAppModel.getId() : null) && rmc.getVisibility() == 0) {
                rmc.setVisibility(8);
                if (helperLabelAppModel != null) {
                    helperLabelAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, AbstractC42074rFj abstractC42074rFj, @NotNull UIComponentAppModel uIComponentAppModel) {
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.OLrzqt, uIComponentAppModel.getBottomMargin()));
        HelperLabelAppModel helperLabelAppModel = uIComponentAppModel instanceof HelperLabelAppModel ? (HelperLabelAppModel) uIComponentAppModel : null;
        if (helperLabelAppModel != null) {
            HelperLabelText text = helperLabelAppModel.getText();
            if (text != null) {
                if (Intrinsics.EZpvd(text.isBold(), java.lang.Boolean.TRUE) && (c55312xhaValueOf = this.AEQbTJ.OLrzqt.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                    c55320xhiKWHzl.setTextAppearance(getContext(), C52761wXj.LoaderManager.QwvEab);
                }
                C55258xgZ c55258xgZ = this.AEQbTJ.OLrzqt;
                java.lang.String content = text.getContent();
                if (content == null) {
                    content = "";
                }
                c55258xgZ.setText(content);
                java.lang.Integer fontSize = text.getFontSize();
                if (fontSize != null) {
                    this.AEQbTJ.OLrzqt.setTextSize(C33129mqd.djBIcL(java.lang.Integer.valueOf(fontSize.intValue())));
                }
                java.lang.Double lineHeight = text.getLineHeight();
                if (lineHeight != null) {
                    this.AEQbTJ.OLrzqt.setLineHeight(C33129mqd.AhwBna(java.lang.Double.valueOf(lineHeight.doubleValue())));
                }
                this.AEQbTJ.OLrzqt.setTextColor(OLrzqt(text.getColor()));
            }
            HelperLabelTag tag = helperLabelAppModel.getTag();
            if (tag != null) {
                ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.call, this.AEQbTJ.OLrzqt, false);
                Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
                AbstractC43959rzC abstractC43959rzC = (AbstractC43959rzC) viewDataBindingInflate;
                java.lang.String icon = tag.getIcon();
                android.graphics.drawable.Drawable drawableKWHzl = icon != null ? rqr.KWHzl(icon, this.KWHzl) : null;
                C55251xgS c55251xgS = abstractC43959rzC.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
                rqr.KWHzl(c55251xgS, tag, helperLabelAppModel.getTextTagGap(), drawableKWHzl);
                this.AEQbTJ.OLrzqt.setAttachingView(abstractC43959rzC.getRoot());
            }
            UIAlignment align = helperLabelAppModel.getAlign();
            int i = align == null ? -1 : ActionBar.KWHzl[align.ordinal()];
            int i2 = i != 1 ? i != 2 ? 8388611 : 8388613 : 1;
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.OLrzqt.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i2;
            this.AEQbTJ.OLrzqt.setLayoutParams(layoutParams2);
            this.AEQbTJ.OLrzqt.setGravity(i2);
        }
    }

    public final int OLrzqt(java.lang.String str) {
        for (TextColor textColor : TextColor.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) textColor.getNameValue(), (java.lang.Object) str)) {
                return this.KWHzl.EZpvd(textColor.getColorId());
            }
        }
        return this.KWHzl.EZpvd(TextColor.BLACK.getColorId());
    }
}
