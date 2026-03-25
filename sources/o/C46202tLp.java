package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46202tLp extends ConstraintLayout {
    public java.lang.CharSequence AYXKKw;
    public android.content.res.Configuration AhwBna;
    public boolean AkhnZx;
    public boolean EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public int djBIcL;
    public float gEmmrt;
    public float isConnected;
    public final InterfaceC56387yDm valueOf;
    public float values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46202tLp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46202tLp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.tLp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C46202tLp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46202tLp(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AkhnZx = true;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.tLn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46202tLp.EZpvd(context);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47501trL.FragmentManager.getNewProxyInstance);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.AYXKKw = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C47501trL.FragmentManager.zsXlph, 0, 4, null);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.AuCTelauCTel, -1.0f);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C47501trL.FragmentManager.zLjUOn, -1);
        int color = typedArrayObtainStyledAttributes.getColor(C47501trL.FragmentManager.wlaJM, -1);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.zuBGHE, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.getFieldNames, -1.0f);
        int i2 = typedArrayObtainStyledAttributes.getInt(C47501trL.FragmentManager.AubY, Integer.MAX_VALUE);
        this.copydefault = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.AwvSrB, false);
        this.AkhnZx = typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.OcIXYQ, this.AkhnZx);
        int i3 = typedArrayObtainStyledAttributes.getInt(C47501trL.FragmentManager.iwGUEr, 0);
        this.values = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.AxsJAY, 0.0f);
        this.isConnected = typedArrayObtainStyledAttributes.getDimension(C47501trL.FragmentManager.gHZMYf, 0.0f);
        setChildVisible(typedArrayObtainStyledAttributes.getBoolean(C47501trL.FragmentManager.sSMYrx, this.KWHzl));
        typedArrayObtainStyledAttributes.recycle();
        addView(KWHzl(), new ConstraintLayout.LayoutParams(-1, -2));
        AppCompatTextView appCompatTextViewKWHzl = KWHzl();
        if (dimension2 != -1.0f) {
            appCompatTextViewKWHzl.setLineHeight(yII.EZpvd(dimension2));
        }
        if (dimension3 != -1.0f) {
            appCompatTextViewKWHzl.setLineSpacing(dimension3, 1.0f);
        }
        appCompatTextViewKWHzl.setText(this.AYXKKw);
        appCompatTextViewKWHzl.setTextSize(dimension);
        appCompatTextViewKWHzl.setTextAppearance(resourceId);
        appCompatTextViewKWHzl.setTextColor(color);
        appCompatTextViewKWHzl.setGravity(this.copydefault ? 1 : 8388611);
        appCompatTextViewKWHzl.setMaxLines(i2);
        if (i3 != 0) {
            appCompatTextViewKWHzl.setEllipsize(TextUtils.TruncateAt.values()[i3 - 1]);
        }
        AYXKKw();
        this.AhwBna = context.getResources().getConfiguration();
        if (ViewCompat.isLaidOut(this) && !isLayoutRequested()) {
            this.OLrzqt = true;
            OLrzqt();
        } else {
            addOnLayoutChangeListener(new ActionBar());
        }
    }

    /* JADX INFO: renamed from: o.tLp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.tLp$ActionBar */
    public static final class ActionBar implements View.OnLayoutChangeListener {
        public ActionBar() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            C46202tLp.this.OLrzqt = true;
            C46202tLp.this.OLrzqt();
        }
    }

    public final AppCompatTextView KWHzl() {
        return (AppCompatTextView) this.valueOf.getValue();
    }

    public static final AppCompatTextView EZpvd(android.content.Context context) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setId(android.view.View.generateViewId());
        return appCompatTextView;
    }

    public static final boolean KWHzl(C46202tLp c46202tLp, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.getId() != c46202tLp.KWHzl().getId();
    }

    private final android.view.View copydefault() {
        return (android.view.View) C59467zhb.zLjUOn(C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), new Function1() { // from class: o.tLt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C46202tLp.KWHzl(this.KWHzl, (android.view.View) obj));
            }
        }));
    }

    public final void setChildVisible(boolean z) {
        if (this.KWHzl == z) {
            return;
        }
        this.KWHzl = z;
        android.view.View viewCopydefault = copydefault();
        if (viewCopydefault != null) {
            viewCopydefault.setAlpha(0.0f);
            viewCopydefault.setVisibility(this.KWHzl ? 0 : 8);
        }
        if (this.KWHzl) {
            KWHzl().post(new java.lang.Runnable() { // from class: o.tLv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46202tLp.djBIcL(this.EZpvd);
                }
            });
        }
    }

    public static final void djBIcL(C46202tLp c46202tLp) {
        c46202tLp.OLrzqt();
    }

    public final void setText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        OLrzqt((java.lang.CharSequence) OLrzqt(StringsKt__StringsKt.hDKMBd(charSequence).toString()));
    }

    public final void setText(@androidx.annotation.StringRes int i) {
        OLrzqt((java.lang.CharSequence) OLrzqt(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C33070mpX.OLrzqt(i, getContext())).toString()));
    }

    public final void setText(@NotNull android.text.SpannedString spannedString) {
        Intrinsics.checkNotNullParameter(spannedString, "");
        OLrzqt(StringsKt__StringsKt.hDKMBd(spannedString));
    }

    public final void OLrzqt(java.lang.CharSequence charSequence) {
        android.view.View viewCopydefault;
        float f = this.KWHzl ? 1.0f : 0.0f;
        if (Intrinsics.EZpvd(this.AYXKKw, charSequence) && (viewCopydefault = copydefault()) != null) {
            if (this.KWHzl == (viewCopydefault.getVisibility() == 0)) {
                android.view.View viewCopydefault2 = copydefault();
                if (Intrinsics.EZpvd(viewCopydefault2 != null ? java.lang.Float.valueOf(viewCopydefault2.getAlpha()) : null, f)) {
                    return;
                }
            }
        }
        this.AYXKKw = charSequence;
        android.view.View viewCopydefault3 = copydefault();
        if (viewCopydefault3 != null) {
            viewCopydefault3.setAlpha(0.0f);
        }
        KWHzl().setText(copydefault(charSequence));
        KWHzl().setTag(C56423yEv.EZpvd(C56390yDp.OLrzqt("trailing_textview_key", this.AYXKKw)));
        AEQbTJ();
        KWHzl().post(new java.lang.Runnable() { // from class: o.tLs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46202tLp.AkhnZx(this.copydefault);
            }
        });
    }

    public static final void AkhnZx(final C46202tLp c46202tLp) {
        c46202tLp.OLrzqt();
        if (c46202tLp.OLrzqt && c46202tLp.djBIcL == 0) {
            c46202tLp.KWHzl().postDelayed(new java.lang.Runnable() { // from class: o.tLo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46202tLp.values(this.EZpvd);
                }
            }, 100L);
        }
    }

    public static final void values(C46202tLp c46202tLp) {
        if (c46202tLp.djBIcL == 0) {
            c46202tLp.EZpvd = true;
            c46202tLp.OLrzqt();
        }
    }

    private final void AYXKKw() {
        this.gEmmrt = 0.0f;
        AppCompatTextView appCompatTextViewKWHzl = KWHzl();
        ViewGroup.LayoutParams layoutParams = appCompatTextViewKWHzl.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = 0;
            layoutParams2.bottomToBottom = 0;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            layoutParams2.horizontalBias = 0.0f;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = this.copydefault ? -1 : -2;
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
            appCompatTextViewKWHzl.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void AEQbTJ() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        android.content.res.Configuration configuration2 = this.AhwBna;
        if (configuration2 != null) {
            Intrinsics.copydefault(configuration);
            if (EZpvd(configuration2, configuration)) {
                this.EZpvd = true;
                KWHzl().requestLayout();
            }
        }
        this.AhwBna = configuration;
    }

    public final boolean EZpvd(android.content.res.Configuration configuration, android.content.res.Configuration configuration2) {
        return (configuration.orientation == configuration2.orientation && configuration.fontScale == configuration2.fontScale && configuration.densityDpi == configuration2.densityDpi && configuration.screenWidthDp == configuration2.screenWidthDp && configuration.screenHeightDp == configuration2.screenHeightDp) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a A[PHI: r3
  0x005a: PHI (r3v5 java.lang.Integer) = (r3v4 java.lang.Integer), (r3v10 java.lang.Integer) binds: [B:24:0x0045, B:30:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd() {
        int iIntValue;
        if (getMeasuredWidth() > 0) {
            iIntValue = getMeasuredWidth();
        } else {
            iIntValue = this.djBIcL;
            if (iIntValue <= 0 || !this.OLrzqt) {
                if (getWidth() > 0) {
                    iIntValue = getWidth();
                } else {
                    java.lang.Object parent = getParent();
                    android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                    int iIntValue2 = 0;
                    while (view != null && iIntValue2 <= 0) {
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(view.getMeasuredWidth());
                        if (numValueOf.intValue() <= 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            iIntValue2 = numValueOf.intValue();
                        } else {
                            numValueOf = java.lang.Integer.valueOf(view.getWidth());
                            if (numValueOf.intValue() <= 0) {
                                numValueOf = null;
                            }
                            if (numValueOf == null) {
                                iIntValue2 = 0;
                            }
                        }
                        java.lang.Object parent2 = view.getParent();
                        view = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
                    }
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iIntValue2);
                    java.lang.Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
                    iIntValue = num != null ? num.intValue() : getContext().getResources().getDisplayMetrics().widthPixels;
                }
            }
        }
        if (iIntValue > 0) {
            this.djBIcL = iIntValue;
        }
        return C56548yJl.copydefault((iIntValue - getPaddingStart()) - getPaddingEnd(), 200);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        android.content.res.Configuration configuration2 = this.AhwBna;
        if (configuration2 == null || !EZpvd(configuration2, configuration)) {
            return;
        }
        this.EZpvd = true;
        this.AhwBna = configuration;
        post(new java.lang.Runnable() { // from class: o.tLu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C46202tLp.AYXKKw(this.AEQbTJ);
            }
        });
    }

    public static final void AYXKKw(C46202tLp c46202tLp) {
        if (c46202tLp.EZpvd) {
            c46202tLp.OLrzqt();
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onVisibilityChanged(view, i);
        if (i == 0 && this.OLrzqt) {
            post(new java.lang.Runnable() { // from class: o.tLr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46202tLp.AhwBna(this.EZpvd);
                }
            });
        }
    }

    public static final void AhwBna(C46202tLp c46202tLp) {
        if (c46202tLp.djBIcL == 0 || c46202tLp.EZpvd) {
            c46202tLp.EZpvd = true;
            c46202tLp.OLrzqt();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.OLrzqt) {
            post(new java.lang.Runnable() { // from class: o.tLw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C46202tLp.isConnected(this.AEQbTJ);
                }
            });
        }
    }

    public static final void isConnected(C46202tLp c46202tLp) {
        int iEZpvd = c46202tLp.EZpvd();
        if (iEZpvd == c46202tLp.djBIcL || iEZpvd <= 0) {
            return;
        }
        c46202tLp.EZpvd = true;
        c46202tLp.OLrzqt();
    }

    public final void OLrzqt() {
        int i;
        int i2;
        float f;
        float measuredWidth;
        int i3;
        android.view.View viewCopydefault = copydefault();
        if (viewCopydefault != null && this.KWHzl) {
            if (this.EZpvd || (this.OLrzqt && this.djBIcL == 0)) {
                int iEZpvd = EZpvd();
                if (iEZpvd > 0) {
                    KWHzl().measure(View.MeasureSpec.makeMeasureSpec(iEZpvd, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    KWHzl().layout(0, 0, KWHzl().getMeasuredWidth(), KWHzl().getMeasuredHeight());
                    requestLayout();
                }
                this.EZpvd = false;
            }
            if (KWHzl().getLayout() == null) {
                KWHzl().setText(this.AYXKKw);
                KWHzl().onPreDraw();
            }
            if (KWHzl().getLayout() != null) {
                java.lang.CharSequence text = KWHzl().getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                if (text.length() == 0) {
                    return;
                }
                int iEZpvd2 = EZpvd();
                if (KWHzl().getLayout().getWidth() != iEZpvd2 && iEZpvd2 > 0) {
                    pUU.EZpvd("OkPlanetTailingTextView", "Width mismatch detected: layout=" + KWHzl().getLayout().getWidth() + ", available=" + iEZpvd2 + ", text='" + ((java.lang.Object) this.AYXKKw) + "'");
                    KWHzl().measure(View.MeasureSpec.makeMeasureSpec(iEZpvd2, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    KWHzl().layout(0, 0, KWHzl().getMeasuredWidth(), KWHzl().getMeasuredHeight());
                }
                int iCopydefault = C56548yJl.copydefault(KWHzl().getLayout().getLineCount(), 1);
                int height = KWHzl().getLayout().getHeight();
                if (iCopydefault > 0) {
                    int i4 = iCopydefault - 1;
                    boolean z = KWHzl().getLayout().getEllipsisCount(i4) > 0;
                    float lineWidth = KWHzl().getLayout().getLineWidth(i4);
                    int lineBottom = KWHzl().getLayout().getLineBottom(i4);
                    if (lineBottom == 0) {
                        lineBottom = KWHzl().getMeasuredHeight();
                    }
                    boolean z2 = (((float) EZpvd()) - lineWidth) - this.values < ((float) viewCopydefault.getMeasuredWidth());
                    if ((z || z2) && (this.AkhnZx || i4 < KWHzl().getMaxLines() - 1)) {
                        f = 0.0f;
                        viewCopydefault.setTranslationX(0.0f);
                        viewCopydefault.setTranslationY(0.0f);
                        i2 = 1;
                        i = 0;
                        copydefault(viewCopydefault, 0, (int) this.isConnected, true);
                    } else {
                        if (z || z2) {
                            measuredWidth = (r5 - viewCopydefault.getMeasuredWidth()) - this.values;
                            java.lang.String strOLrzqt = OLrzqt(KWHzl().getText().toString());
                            java.lang.String string = android.text.TextUtils.ellipsize(strOLrzqt.subSequence(KWHzl().getLayout().getLineStart(i4), strOLrzqt.length()), KWHzl().getPaint(), measuredWidth, TextUtils.TruncateAt.END).toString();
                            AppCompatTextView appCompatTextViewKWHzl = KWHzl();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            if (iCopydefault > 1) {
                                int i5 = 0;
                                while (i5 < i4) {
                                    java.lang.CharSequence charSequenceSubSequence = strOLrzqt.subSequence(KWHzl().getLayout().getLineStart(i5), KWHzl().getLayout().getLineEnd(i5));
                                    java.lang.String str = strOLrzqt;
                                    int i6 = height;
                                    if (StringsKt__StringsKt.endsWith$default(charSequenceSubSequence, (java.lang.CharSequence) "\n", false, 2, (java.lang.Object) null)) {
                                        sb.append(charSequenceSubSequence);
                                    } else {
                                        sb.append(charSequenceSubSequence);
                                        sb.append('\n');
                                    }
                                    i5++;
                                    strOLrzqt = str;
                                    height = i6;
                                }
                            }
                            i3 = height;
                            sb.append(string);
                            Unit unit = Unit.INSTANCE;
                            appCompatTextViewKWHzl.setText(copydefault(sb.toString()));
                            if (this.copydefault) {
                                measuredWidth += (r5 / 2) - (measuredWidth / 2);
                            }
                        } else {
                            measuredWidth = this.values + lineWidth;
                            if (this.copydefault) {
                                measuredWidth += (r5 / 2) - (lineWidth / 2);
                            }
                            i3 = height;
                        }
                        float f2 = iCopydefault;
                        float f3 = lineBottom / f2;
                        int measuredHeight = viewCopydefault.getMeasuredHeight();
                        if (measuredHeight == 0) {
                            viewCopydefault.measure(0, 0);
                            measuredHeight = viewCopydefault.getMeasuredHeight();
                        }
                        updateConstraint$default(this, viewCopydefault, yII.EZpvd(java.lang.Math.abs(measuredWidth)), yII.EZpvd(java.lang.Math.abs((i4 * f3) - ((measuredHeight - f3) / 2.0f))), false, 4, null);
                        this.gEmmrt = (viewCopydefault.getMeasuredHeight() - (i3 / f2)) / 2.0f;
                        f = 0.0f;
                        i2 = 1;
                        i = 0;
                    }
                } else {
                    i = 0;
                    i2 = 1;
                    f = 0.0f;
                }
                java.lang.CharSequence text2 = KWHzl().getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                viewCopydefault.setAlpha((!this.KWHzl || (text2.length() > 0 ? i2 : i) == 0) ? f : 1.0f);
                viewCopydefault.setVisibility(this.KWHzl ? i : 8);
            }
        }
    }

    public final java.lang.CharSequence copydefault(java.lang.CharSequence charSequence) {
        return charSequence instanceof java.lang.String ? pTF.KWHzl.copydefault((java.lang.String) charSequence) : charSequence;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return C59449zhJ.replace$default(C59449zhJ.replace$default(str, "✅", "", false, 4, (java.lang.Object) null), " ❌", "", false, 4, (java.lang.Object) null);
    }

    public static /* synthetic */ void updateConstraint$default(C46202tLp c46202tLp, android.view.View view, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        c46202tLp.copydefault(view, i, i2, z);
    }

    public final void copydefault(android.view.View view, int i, int i2, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = KWHzl().getLayoutParams();
        Intrinsics.copydefault(layoutParams3, "");
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams2.startToStart = 0;
        layoutParams2.endToEnd = 0;
        layoutParams2.setMarginStart(i);
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, i2, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        layoutParams2.verticalChainStyle = 2;
        if (z) {
            layoutParams2.topToTop = -1;
            layoutParams2.topToBottom = KWHzl().getId();
            layoutParams4.bottomToBottom = -1;
        } else {
            layoutParams2.topToBottom = -1;
            layoutParams2.topToTop = 0;
            layoutParams4.bottomToBottom = 0;
        }
        layoutParams2.bottomToBottom = 0;
        layoutParams2.horizontalBias = 0.0f;
        layoutParams2.verticalBias = 0.0f;
        layoutParams2.validate();
        layoutParams4.validate();
        view.setLayoutParams(layoutParams2);
        KWHzl().setLayoutParams(layoutParams4);
    }
}
