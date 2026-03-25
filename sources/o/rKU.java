package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ViewStatus;
import com.okinc.ok_kyc_core.presentation.views.Icon;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class rKU extends ConstraintLayout {
    public final AbstractC43877rxa AEQbTJ;
    public final C42519rVw EZpvd;
    public ViewStatus KWHzl;
    public java.lang.String OLrzqt;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rKU(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rKU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setViewStatus(@NotNull ViewStatus viewStatus) {
        Intrinsics.checkNotNullParameter(viewStatus, "");
        this.KWHzl = viewStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.rtX.FragmentManager.copydefault int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.rKU.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ rKU(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C43662rtX.FragmentManager.copydefault : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rKU(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = ViewStatus.Form;
        this.EZpvd = new C42519rVw(context, attributeSet, i);
        this.OLrzqt = "";
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C43662rtX.TaskDescription.RJOkX, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.AEQbTJ = (AbstractC43877rxa) viewDataBindingInflate;
    }

    public void AEQbTJ(@NotNull UIComponentAppModel uIComponentAppModel, @NotNull AbstractC42074rFj abstractC42074rFj, @NotNull LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        Intrinsics.checkNotNullParameter(abstractC42074rFj, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        final CardAppModel cardAppModel = uIComponentAppModel instanceof CardAppModel ? (CardAppModel) uIComponentAppModel : null;
        if (abstractC42074rFj instanceof rGL) {
            rGL rgl = (rGL) abstractC42074rFj;
            java.util.Iterator<T> it = rgl.dNCPSb().iterator();
            while (it.hasNext()) {
                rAX rax = (rAX) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) rax.OLrzqt(), (java.lang.Object) (cardAppModel != null ? cardAppModel.getId() : null))) {
                    rax.setValue(null);
                }
            }
            if (cardAppModel != null && Intrinsics.EZpvd(cardAppModel.isHidden(), java.lang.Boolean.TRUE)) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            rgl.gasjUx().observe(lifecycleOwner, new StateListAnimator(new Function1() { // from class: o.rKV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rKU.OLrzqt(cardAppModel, this, (C42156rIk) obj);
                }
            }));
            return;
        }
        if (!(abstractC42074rFj instanceof C42179rJg)) {
            if (abstractC42074rFj instanceof rIM) {
                java.util.Iterator<T> it2 = ((rIM) abstractC42074rFj).AubY().iterator();
                while (it2.hasNext()) {
                    rAX rax2 = (rAX) it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) rax2.OLrzqt(), (java.lang.Object) (cardAppModel != null ? cardAppModel.getId() : null))) {
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
            if (Intrinsics.EZpvd((java.lang.Object) rax3.OLrzqt(), (java.lang.Object) (cardAppModel != null ? cardAppModel.getId() : null))) {
                rax3.setValue(null);
            }
        }
    }

    public static final Unit OLrzqt(CardAppModel cardAppModel, rKU rku, C42156rIk c42156rIk) {
        java.util.List<java.lang.String> listCopydefault = c42156rIk.copydefault();
        if (listCopydefault != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listCopydefault), cardAppModel != null ? cardAppModel.getId() : null) && rku.getVisibility() == 8) {
                rku.setVisibility(0);
                if (cardAppModel != null) {
                    cardAppModel.setHidden(java.lang.Boolean.FALSE);
                }
            }
        }
        java.util.List<java.lang.String> listKWHzl = c42156rIk.KWHzl();
        if (listKWHzl != null) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) listKWHzl), cardAppModel != null ? cardAppModel.getId() : null) && rku.getVisibility() == 0) {
                rku.setVisibility(8);
                if (cardAppModel != null) {
                    cardAppModel.setHidden(java.lang.Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public void KWHzl(@NotNull UIComponentAppModel uIComponentAppModel) {
        Intrinsics.checkNotNullParameter(uIComponentAppModel, "");
        java.lang.Float leftMargin = uIComponentAppModel.getLeftMargin();
        float fFloatValue = leftMargin != null ? leftMargin.floatValue() : 0.0f;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(fFloatValue, context);
        rQR rqr = rQR.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        setPaddingRelative(iCopydefault, 0, 0, rqr.AEQbTJ(context2, this.KWHzl, uIComponentAppModel.getBottomMargin()));
        CardAppModel cardAppModel = uIComponentAppModel instanceof CardAppModel ? (CardAppModel) uIComponentAppModel : null;
        if (cardAppModel != null) {
            this.OLrzqt = cardAppModel.getId();
            CardAppModel cardAppModel2 = (CardAppModel) uIComponentAppModel;
            java.lang.String icon = cardAppModel2.getIcon();
            if (icon != null) {
                android.graphics.drawable.Drawable drawableEZpvd = EZpvd(icon);
                if (drawableEZpvd != null) {
                    java.lang.String title = cardAppModel2.getTitle();
                    java.lang.String subtitle = cardAppModel2.getSubtitle();
                    java.lang.String backgroundType = cardAppModel2.getBackgroundType();
                    java.lang.String fontSize = cardAppModel2.getFontSize();
                    setContent(title, subtitle, backgroundType, drawableEZpvd, fontSize == null ? "medium" : fontSize);
                    return;
                }
                java.lang.String title2 = cardAppModel2.getTitle();
                java.lang.String subtitle2 = cardAppModel2.getSubtitle();
                java.lang.String backgroundType2 = cardAppModel2.getBackgroundType();
                java.lang.String fontSize2 = cardAppModel2.getFontSize();
                setContent(title2, subtitle2, backgroundType2, null, fontSize2 == null ? "medium" : fontSize2);
                return;
            }
            java.lang.String title3 = cardAppModel2.getTitle();
            java.lang.String subtitle3 = cardAppModel2.getSubtitle();
            java.lang.String backgroundType3 = cardAppModel2.getBackgroundType();
            java.lang.String fontSize3 = cardAppModel2.getFontSize();
            setContent(title3, subtitle3, backgroundType3, null, fontSize3 == null ? "medium" : fontSize3);
        }
    }

    private final android.graphics.drawable.Drawable EZpvd(java.lang.String str) {
        for (Icon icon : Icon.values()) {
            if (Intrinsics.EZpvd((java.lang.Object) icon.getNameValue(), (java.lang.Object) str)) {
                return this.EZpvd.OLrzqt(icon.getImageId());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [148=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setContent(java.lang.String str, java.lang.String str2, java.lang.String str3, android.graphics.drawable.Drawable drawable, java.lang.String str4) {
        int i;
        int i2;
        java.lang.Integer numValueOf;
        java.lang.Integer num = null;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1106245566:
                    if (str3.equals("outline")) {
                        this.AEQbTJ.EZpvd.setBackgroundResource(C43662rtX.Activity.AhwBna);
                    }
                    numValueOf = null;
                    break;
                case 3237038:
                    if (str3.equals("info")) {
                        this.AEQbTJ.EZpvd.setBackgroundResource(C43662rtX.Activity.copydefault);
                    }
                    numValueOf = null;
                    break;
                case 270940796:
                    if (str3.equals("disabled")) {
                        this.AEQbTJ.EZpvd.setBackgroundResource(C43662rtX.Activity.AEQbTJ);
                    }
                    numValueOf = null;
                    break;
                case 1124446108:
                    if (!str3.equals("warning")) {
                        numValueOf = null;
                    } else {
                        numValueOf = java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm));
                        this.AEQbTJ.EZpvd.setBackgroundResource(C43662rtX.Activity.EZpvd);
                    }
                    break;
            }
            this.AEQbTJ.EZpvd.setPadding(C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
            num = numValueOf;
        }
        if (drawable != null) {
            if (this.EZpvd.AuCTel()) {
                DrawableCompat.setTintList(drawable, android.content.res.ColorStateList.valueOf(this.EZpvd.djBIcL()));
            }
            if (num != null) {
                num.intValue();
                DrawableCompat.setTintList(drawable, android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.HJWChPQdUnVm)));
            }
            this.AEQbTJ.AEQbTJ.setImageDrawable(drawable);
        }
        if (drawable != null) {
            this.AEQbTJ.AEQbTJ.setVisibility(0);
        } else {
            this.AEQbTJ.AEQbTJ.setVisibility(8);
        }
        if (str != null) {
            this.AEQbTJ.KWHzl.setVisibility(0);
            android.widget.TextView textView = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            int iIntValue = num != null ? num.intValue() : this.EZpvd.isConnected();
            switch (str4.hashCode()) {
                case -1078030475:
                    str4.equals("medium");
                    break;
                case 102742843:
                    i2 = !str4.equals("large") ? C52761wXj.LoaderManager.zLjUOn : C52761wXj.LoaderManager.DGOPHZ;
                    break;
                case 109548807:
                    if (str4.equals("small")) {
                        i2 = C52761wXj.LoaderManager.sSMYrx;
                        break;
                    }
                    break;
                case 729760011:
                    if (str4.equals("extraLarge")) {
                        i2 = C52761wXj.LoaderManager.zblBkD;
                        break;
                    }
                    break;
            }
            setTextStyle(textView, str, iIntValue, i2);
        } else {
            this.AEQbTJ.KWHzl.setVisibility(8);
        }
        android.widget.TextView textView2 = this.AEQbTJ.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (str2 == null) {
            str2 = "";
        }
        int iIntValue2 = num != null ? num.intValue() : C33070mpX.copydefault(C52761wXj.Activity.Dmq);
        switch (str4.hashCode()) {
            case -1078030475:
                str4.equals("medium");
                break;
            case 102742843:
                str4.equals("large");
                break;
            case 109548807:
                i = !str4.equals("small") ? C52761wXj.LoaderManager.valueOf : C52761wXj.LoaderManager.AYXKKw;
                break;
            case 729760011:
                if (str4.equals("extraLarge")) {
                    i = C52761wXj.LoaderManager.KWHzl;
                    break;
                }
                break;
        }
        setTextStyle(textView2, str2, iIntValue2, i);
    }

    public final void setTextStyle(android.widget.TextView textView, java.lang.String str, @androidx.annotation.ColorInt int i, int i2) {
        textView.setText(str);
        textView.setTextAppearance(getContext(), i2);
        textView.setTextColor(i);
    }
}
