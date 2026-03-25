package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.core.ktx.MatchPattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53573wnz extends ConstraintLayout {
    public int AEQbTJ;
    public uWK EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53573wnz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53573wnz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.wnz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53573wnz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53573wnz(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "";
        this.OLrzqt = "";
        this.KWHzl = "";
        int[] iArr = C48033uCm.LoaderManager.aKErDB;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.dxcTrN, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53573wnz.AEQbTJ(this.KWHzl, context, ((java.lang.Integer) obj).intValue());
            }
        });
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.dvKsVJ, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53573wnz.OLrzqt(this.AEQbTJ, context, ((java.lang.Integer) obj).intValue());
            }
        });
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.dNCPSb, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53573wnz.djBIcL(this.OLrzqt, context, ((java.lang.Integer) obj).intValue());
            }
        });
        this.AEQbTJ = typedArrayObtainStyledAttributes.getInt(C48033uCm.LoaderManager.fZBcTu, 0);
        typedArrayObtainStyledAttributes.recycle();
        gEmmrt();
    }

    private final void KWHzl(java.lang.String str) {
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.KWHzl.setText(str);
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk3;
        }
        AppCompatTextView appCompatTextView = uwk2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(str.length() > 0 ? 0 : 8);
    }

    public static final Unit AEQbTJ(C53573wnz c53573wnz, android.content.Context context, int i) {
        c53573wnz.copydefault = C33070mpX.OLrzqt(i, context);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53573wnz c53573wnz, android.content.Context context, int i) {
        c53573wnz.OLrzqt = C33070mpX.OLrzqt(i, context);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C53573wnz c53573wnz, android.content.Context context, int i) {
        c53573wnz.KWHzl = C33070mpX.OLrzqt(i, context);
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        this.EZpvd = uWK.copydefault(android.view.LayoutInflater.from(getContext()), this);
        setTitle(this.copydefault);
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatTextView appCompatTextView = uwk.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        int i = this.AEQbTJ;
        appCompatTextView.setVisibility((i == 0 || i == 2) ? 0 : 8);
        setArrowIconVisible(this.AEQbTJ == 0);
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk3;
        }
        C55239xgG c55239xgG = uwk2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55239xgG, "");
        c55239xgG.setVisibility(this.AEQbTJ == 1 ? 0 : 8);
        if (this.KWHzl.length() == 0) {
            setDefaultContent(this.OLrzqt);
        } else {
            setActiveContent(this.KWHzl);
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.copydefault.setTextValue(str);
    }

    public final void setTitleClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.copydefault.setHelperLabelType(1);
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk3;
        }
        C55258xgZ c55258xgZ = uwk2.copydefault;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, onClickListener));
    }

    public final void setDefaultContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C52761wXj.Activity.UlJrfe;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C33070mpX.OLrzqt(i, context);
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.EZpvd.setTextColor(iOLrzqt);
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
            uwk3 = null;
        }
        uwk3.EZpvd.setText(str);
        uWK uwk4 = this.EZpvd;
        if (uwk4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk4;
        }
        uwk2.OLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(iOLrzqt));
    }

    public final void setActiveContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C52761wXj.Activity.fdOvFl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C33070mpX.OLrzqt(i, context);
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.EZpvd.setTextColor(iOLrzqt);
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
            uwk3 = null;
        }
        uwk3.OLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(iOLrzqt));
        uWK uwk4 = this.EZpvd;
        if (uwk4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk4;
        }
        uwk2.EZpvd.setText(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{" | "}, 0, MatchPattern.CONTAINS, false, new Function1() { // from class: o.wnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53573wnz.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        }, 10, null));
        AhwBna();
    }

    public static final Unit AEQbTJ(C53573wnz c53573wnz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = C52761wXj.Activity.aappFQ;
        android.content.Context context = c53573wnz.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.OLrzqt(i, context)));
        return Unit.INSTANCE;
    }

    public final void setActiveContentState(boolean z) {
        int iOLrzqt;
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatTextView appCompatTextView = uwk.EZpvd;
        if (z) {
            int i = C52761wXj.Activity.DPhTBN;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iOLrzqt = C33070mpX.OLrzqt(i, context);
        } else {
            int i2 = C52761wXj.Activity.fdOvFl;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iOLrzqt = C33070mpX.OLrzqt(i2, context2);
        }
        appCompatTextView.setTextColor(iOLrzqt);
    }

    public static /* synthetic */ void setInputErrorMsg$default(C53573wnz c53573wnz, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c53573wnz.setInputErrorMsg(str);
    }

    public final void setInputErrorMsg(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        KWHzl(str);
    }

    public final boolean EZpvd() {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatTextView appCompatTextView = uwk.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView.getVisibility() == 0;
    }

    public final void KWHzl(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatTextView appCompatTextView = uwk.EZpvd;
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, onClickListener));
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk3;
        }
        AppCompatImageView appCompatImageView = uwk2.OLrzqt;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, onClickListener));
    }

    public final void setContentDisableColor(boolean z) {
        int i = z ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl;
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatTextView appCompatTextView = uwk.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView.setTextColor(C33070mpX.OLrzqt(i, context));
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk3;
        }
        AppCompatImageView appCompatImageView = uwk2.OLrzqt;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        appCompatImageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(i, context2)));
    }

    public final void setContentEnable(boolean z) {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.EZpvd.setEnabled(z);
    }

    public final void AhwBna() {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        final AppCompatTextView appCompatTextView = uwk.EZpvd;
        appCompatTextView.post(new java.lang.Runnable() { // from class: o.wnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53573wnz.KWHzl(appCompatTextView);
            }
        });
    }

    public static final void KWHzl(AppCompatTextView appCompatTextView) {
        java.lang.String string = appCompatTextView.getText().toString();
        if (appCompatTextView.getLineCount() > 1 && StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) " (", false, 2, (java.lang.Object) null) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) ")", false, 2, (java.lang.Object) null)) {
            appCompatTextView.setText(C59449zhJ.replaceFirst$default(string, " (", "\n(", false, 4, (java.lang.Object) null));
        }
    }

    public final void setSwitchEnable(boolean z) {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.gEmmrt.setEnabled(z);
    }

    public final void setOnSwitchChangeListener(@NotNull CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(onCheckedChangeListener, "");
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.gEmmrt.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setOnSwitchClickListener(View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            uWK uwk = this.EZpvd;
            if (uwk == null) {
                Intrinsics.gEmmrt("");
                uwk = null;
            }
            uwk.getRoot().setOnClickListener(onClickListener);
        }
    }

    public final void setSwitchChecked(boolean z) {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.gEmmrt.setChecked(z);
    }

    public final boolean copydefault() {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        return uwk.gEmmrt.isChecked();
    }

    public final void setArrowIconVisible(boolean z) {
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatImageView appCompatImageView = uwk.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        if (z) {
            uWK uwk3 = this.EZpvd;
            if (uwk3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                uwk2 = uwk3;
            }
            uwk2.djBIcL.setGravity(16);
            return;
        }
        uWK uwk4 = this.EZpvd;
        if (uwk4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk4;
        }
        uwk2.djBIcL.setGravity(48);
    }

    /* JADX INFO: renamed from: o.wnz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ View.OnClickListener copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, View.OnClickListener onClickListener) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.onClick((AppCompatTextView) this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.wnz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View.OnClickListener EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, View.OnClickListener onClickListener) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.onClick((C55258xgZ) this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.wnz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ View.OnClickListener OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, View.OnClickListener onClickListener) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.onClick((AppCompatImageView) this.EZpvd);
            }
        }
    }

    public final void OLrzqt() {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.OLrzqt.setImageTintList(null);
    }

    public final C55258xgZ KWHzl() {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        C55258xgZ c55258xgZ = uwk.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    public final AppCompatTextView AEQbTJ() {
        uWK uwk = this.EZpvd;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        AppCompatTextView appCompatTextView = uwk.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        return appCompatTextView;
    }

    public final void setTextAppearance(@androidx.annotation.StyleRes int i, @androidx.annotation.StyleRes int i2) {
        uWK uwk = this.EZpvd;
        uWK uwk2 = null;
        if (uwk == null) {
            Intrinsics.gEmmrt("");
            uwk = null;
        }
        uwk.copydefault.setTextAppearance(i);
        uWK uwk3 = this.EZpvd;
        if (uwk3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uwk2 = uwk3;
        }
        uwk2.EZpvd.setTextAppearance(i2);
    }
}
