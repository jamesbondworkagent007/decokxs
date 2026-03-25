package o;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55009xbp extends android.widget.LinearLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C55118xds AEQbTJ;
    public boolean AYXKKw;
    public C55008xbo AhwBna;
    public android.widget.PopupWindow AkhnZx;
    public Function1<? super java.lang.Boolean, Unit> DbNXlk;
    public C43316rmw EZpvd;
    public C54957xaq KWHzl;
    public java.util.List<android.text.SpannableString> copydefault;
    public C55001xbh djBIcL;
    public final android.text.TextWatcher ejfBZ;
    public Function1<? super java.lang.CharSequence, ? extends java.lang.CharSequence> fJNWhG;
    public wYC fetchVPNInfo;
    public boolean gEmmrt;
    public boolean isConnected;
    public boolean valueOf;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55009xbp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55009xbp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54957xaq AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wYC AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.CharSequence, ? extends java.lang.CharSequence>, kotlin.jvm.functions.Function1<java.lang.CharSequence, java.lang.CharSequence> */
    public final Function1<java.lang.CharSequence, java.lang.CharSequence> AkhnZx() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55001xbh EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentBinding(@NotNull C54957xaq c54957xaq) {
        Intrinsics.checkNotNullParameter(c54957xaq, "");
        this.KWHzl = c54957xaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEdtContent(C55001xbh c55001xbh) {
        this.djBIcL = c55001xbh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForceShowKeyboard(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconImage(int i) {
        setIconImage$default(this, i, 0, 0, 0, 14, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconImage(int i, int i2) {
        setIconImage$default(this, i, i2, 0, 0, 12, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconImage(int i, int i2, int i3) {
        setIconImage$default(this, i, i2, i3, 0, 8, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIvFunction$OKUILib_uilib(wYC wyc) {
        this.fetchVPNInfo = wyc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusChangeCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.DbNXlk = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidator(Function1<? super java.lang.CharSequence, ? extends java.lang.CharSequence> function1) {
        this.fJNWhG = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> */
    public final Function1<java.lang.Boolean, Unit> valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:51) call: o.xbp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55009xbp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55009xbp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new java.util.ArrayList();
        this.AYXKKw = true;
        C54957xaq c54957xaqEZpvd = C54957xaq.EZpvd(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54957xaqEZpvd, "");
        this.KWHzl = c54957xaqEZpvd;
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.xbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55009xbp.KWHzl(this.KWHzl);
            }
        });
        this.ejfBZ = new Application();
        setOrientation(0);
        setGravity(16);
        setEditText();
    }

    public final void setInterceptEvent(boolean z) {
        this.valueOf = z;
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        boolean z2 = !z;
        c55001xbh.setEnabled(z2);
        c55001xbh.setFocusable(z2);
        c55001xbh.setFocusableInTouchMode(z2);
    }

    public final void setDropItems(@NotNull java.util.List<android.text.SpannableString> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        C43316rmw c43316rmw = this.EZpvd;
        if (c43316rmw != null) {
            c43316rmw.AhwBna(list);
        }
    }

    public static final android.widget.LinearLayout KWHzl(C55009xbp c55009xbp) {
        android.widget.LinearLayout linearLayout = c55009xbp.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final android.widget.LinearLayout AhwBna() {
        return (android.widget.LinearLayout) this.values.getValue();
    }

    public final void setClearIconVisible$OKUILib_uilib(boolean z) {
        this.gEmmrt = z;
        if (z) {
            EZpvd(false);
        } else {
            setContentHorizontalPadding$default(this, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.xbp$Application */
    public static final class Application implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.CharSequence charSequenceInvoke;
            Function1<java.lang.CharSequence, java.lang.CharSequence> function1AkhnZx = C55009xbp.this.AkhnZx();
            if (function1AkhnZx != null && (charSequenceInvoke = function1AkhnZx.invoke(editable)) != null) {
                C55009xbp c55009xbp = C55009xbp.this;
                if (!android.text.TextUtils.isEmpty(charSequenceInvoke)) {
                    C55008xbo c55008xbo = c55009xbp.AhwBna;
                    if (c55008xbo != null) {
                        c55008xbo.setErrorShowing(true);
                        c55008xbo.setErrorText(charSequenceInvoke.toString());
                        c55008xbo.getFieldNames().OLrzqt.setVisibility(0);
                    }
                } else {
                    C55008xbo c55008xbo2 = c55009xbp.AhwBna;
                    if (c55008xbo2 != null) {
                        c55008xbo2.values();
                        c55008xbo2.setErrorShowing(false);
                        c55008xbo2.getFieldNames().OLrzqt.setVisibility(8);
                    }
                }
            }
            if (!C55009xbp.this.hasFocus() && android.text.TextUtils.isEmpty(editable) && android.text.TextUtils.isEmpty(C55009xbp.this.AEQbTJ().AEQbTJ.getHint())) {
                C55009xbp.this.copydefault(false);
            } else {
                C55009xbp.updateContentAppearance$OKUILib_uilib$default(C55009xbp.this, false, 1, null);
            }
            if (C55009xbp.this.isConnected) {
                return;
            }
            if (!C55009xbp.this.DbNXlk()) {
                C55009xbp.this.AEQbTJ().KWHzl.setVisibility(8);
                return;
            }
            if (android.text.TextUtils.isEmpty(editable) || !C55009xbp.this.AEQbTJ().AEQbTJ.hasFocus()) {
                android.widget.PopupWindow popupWindow = C55009xbp.this.AkhnZx;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
                C55009xbp.this.AEQbTJ().KWHzl.setVisibility(4);
                return;
            }
            C55009xbp.this.AEQbTJ().KWHzl.setVisibility(0);
        }
    }

    public final android.widget.LinearLayout djBIcL() {
        android.widget.LinearLayout linearLayout = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        copydefault(view, (java.lang.Integer) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[PHI: r9
  0x002d: PHI (r9v1 java.lang.Integer) = (r9v0 java.lang.Integer), (r9v7 java.lang.Integer) binds: [B:3:0x0014, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(@NotNull android.view.View view, java.lang.Integer num) {
        int iIntValue;
        C55012xbs c55012xbsFetchVPNInfo;
        Intrinsics.checkNotNullParameter(view, "");
        this.isConnected = true;
        android.widget.LinearLayout linearLayout = this.KWHzl.KWHzl;
        linearLayout.removeAllViews();
        linearLayout.setVisibility(0);
        if (num == null) {
            C55008xbo c55008xbo = this.AhwBna;
            num = (c55008xbo == null || (c55012xbsFetchVPNInfo = c55008xbo.fetchVPNInfo()) == null) ? null : java.lang.Integer.valueOf(c55012xbsFetchVPNInfo.OLrzqt());
            iIntValue = num != null ? num.intValue() : 0;
        }
        linearLayout.setMinimumWidth(iIntValue);
        android.view.View view2 = new android.view.View(linearLayout.getContext());
        view2.setBackgroundColor(ContextCompat.getColor(view2.getContext(), C52761wXj.Activity.aBDePw));
        android.content.Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        linearLayout.addView(view2, C55298xhM.KWHzl(4.0f, context), -1);
        linearLayout.addView(view);
        setContentHorizontalPadding$default(this, false, 1, null);
    }

    public static /* synthetic */ void replaceFunctionDrawable$default(C55009xbp c55009xbp, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 4;
        }
        c55009xbp.KWHzl(i, i2, i3, i4);
    }

    public final void KWHzl(@androidx.annotation.DrawableRes int i, int i2, int i3, int i4) {
        setIconImage(i, i2, i3, i4);
    }

    public static /* synthetic */ void replaceFunctionDrawable$default(C55009xbp c55009xbp, android.graphics.drawable.Drawable drawable, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        c55009xbp.AEQbTJ(drawable, i, i2);
    }

    public final void AEQbTJ(android.graphics.drawable.Drawable drawable, int i, int i2) {
        this.isConnected = true;
        C54957xaq c54957xaq = this.KWHzl;
        c54957xaq.AEQbTJ.removeTextChangedListener(this.ejfBZ);
        android.widget.LinearLayout linearLayout = c54957xaq.KWHzl;
        linearLayout.removeAllViews();
        linearLayout.setVisibility(0);
        setFunctionImage$default(this, drawable, true, i, i2, 0, 16, null);
    }

    public final void isConnected() {
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        c55001xbh.setTransformationMethod(Activity.Companion.EZpvd());
        android.text.Editable text = this.KWHzl.AEQbTJ.getText();
        c55001xbh.setSelection(text != null ? text.length() : 0);
    }

    public final void values() {
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        c55001xbh.setTransformationMethod(android.text.method.HideReturnsTransformationMethod.getInstance());
        android.text.Editable text = this.KWHzl.AEQbTJ.getText();
        c55001xbh.setSelection(text != null ? text.length() : 0);
    }

    public final void setPasswordChar(char c) {
        Activity activityEZpvd = Activity.Companion.EZpvd();
        if (activityEZpvd != null) {
            activityEZpvd.EZpvd(c);
        }
    }

    public final void setImageTint(int i) {
        wYC wyc = this.fetchVPNInfo;
        if (wyc != null) {
            ImageViewCompat.setImageTintList(wyc, android.content.res.ColorStateList.valueOf(i));
            wyc.setImageTintMode(PorterDuff.Mode.SRC_IN);
        }
    }

    public final void fetchVPNInfo() {
        android.widget.LinearLayout linearLayout = this.KWHzl.KWHzl;
        linearLayout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = 0;
            layoutParams.height = 0;
        }
        linearLayout.setLayoutParams(layoutParams);
        setContentHorizontalPadding$default(this, false, 1, null);
    }

    public final void copydefault() {
        this.KWHzl.AEQbTJ.addTextChangedListener(this.ejfBZ);
    }

    public final void setPopupView(android.view.View view, android.view.View view2) {
        if (view == null || view2 == null) {
            return;
        }
        android.widget.PopupWindow popupWindow = this.AkhnZx;
        if (popupWindow == null || !popupWindow.isShowing()) {
            if (this.AEQbTJ == null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C55118xds c55118xds = new C55118xds(context, null, 2, null);
                android.content.Context context2 = c55118xds.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                c55118xds.setMaxHeight(C55298xhM.OLrzqt(200, context2));
                c55118xds.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                this.AEQbTJ = c55118xds;
            }
            C55118xds c55118xds2 = this.AEQbTJ;
            if (c55118xds2 != null) {
                c55118xds2.removeAllViews();
                c55118xds2.addView(view);
            }
            if (this.AkhnZx == null) {
                this.AkhnZx = new android.widget.PopupWindow((android.view.View) this.AEQbTJ, view2.getWidth(), -2, false);
            }
            android.widget.PopupWindow popupWindow2 = this.AkhnZx;
            if (popupWindow2 != null) {
                popupWindow2.setAnimationStyle(C52761wXj.LoaderManager.UeEOUB);
                popupWindow2.setTouchable(true);
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                popupWindow2.showAsDropDown(view2, 0, C55298xhM.OLrzqt(4, context3));
            }
        }
    }

    public static /* synthetic */ void setIconImage$default(C55009xbp c55009xbp, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 4;
        }
        c55009xbp.setIconImage(i, i2, i3, i4);
    }

    public final void setIconImage(int i, int i2, int i3, int i4) {
        this.isConnected = true;
        C54957xaq c54957xaq = this.KWHzl;
        c54957xaq.AEQbTJ.removeTextChangedListener(this.ejfBZ);
        c54957xaq.KWHzl.removeAllViews();
        c54957xaq.KWHzl.setVisibility(0);
        setFunctionImage(ContextCompat.getDrawable(getContext(), i), true, i2, i3, i4);
    }

    public final void OLrzqt() {
        wYC wyc = this.fetchVPNInfo;
        if (wyc != null) {
            wyc.setEnabled(false);
        }
        C55001xbh c55001xbh = this.djBIcL;
        if (c55001xbh != null) {
            c55001xbh.setTextIsSelectable(true);
            c55001xbh.disableKeyboard();
            this.AYXKKw = false;
            setInterceptEvent(false);
            c55001xbh.setTextColor(ContextCompat.getColor(c55001xbh.getContext(), C52761wXj.Activity.svhCHd));
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.valueOf) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setEditText() {
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        this.djBIcL = c55001xbh;
        c55001xbh.addTextChangedListener(this.ejfBZ);
        c55001xbh.setOnFocusChangeListener(new ActionBar(c55001xbh));
        c55001xbh.setPaddingRelative(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: o.xbp$ActionBar */
    public static final class ActionBar implements View.OnFocusChangeListener {
        public final /* synthetic */ C55001xbh EZpvd;

        public ActionBar(C55001xbh c55001xbh) {
            this.EZpvd = c55001xbh;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            Function1<java.lang.Boolean, Unit> function1ValueOf = C55009xbp.this.valueOf();
            if (function1ValueOf != null) {
                function1ValueOf.invoke(java.lang.Boolean.valueOf(z));
            }
            int i = 0;
            if (z) {
                if (C55009xbp.this.gEmmrt()) {
                    java.lang.Object systemService = this.EZpvd.getContext().getSystemService("input_method");
                    Intrinsics.copydefault(systemService, "");
                    ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(C55009xbp.this.AEQbTJ().AEQbTJ, 1);
                }
                C55009xbp.updateContentAppearance$OKUILib_uilib$default(C55009xbp.this, false, 1, null);
            } else if (!z && !android.text.TextUtils.isEmpty(C55009xbp.this.AEQbTJ().AEQbTJ.getText())) {
                C55009xbp.updateContentAppearance$OKUILib_uilib$default(C55009xbp.this, false, 1, null);
            } else if (!z && android.text.TextUtils.isEmpty(C55009xbp.this.AEQbTJ().AEQbTJ.getText()) && !android.text.TextUtils.isEmpty(C55009xbp.this.AEQbTJ().AEQbTJ.getHint())) {
                C55009xbp.updateContentAppearance$OKUILib_uilib$default(C55009xbp.this, false, 1, null);
            } else {
                C55009xbp.this.copydefault(false);
            }
            if (C55009xbp.this.isConnected) {
                return;
            }
            android.widget.LinearLayout linearLayout = C55009xbp.this.AEQbTJ().KWHzl;
            C55009xbp c55009xbp = C55009xbp.this;
            if (!c55009xbp.DbNXlk()) {
                i = 8;
            } else if (!z || android.text.TextUtils.isEmpty(c55009xbp.AEQbTJ().AEQbTJ.getText())) {
                i = 4;
            }
            linearLayout.setVisibility(i);
        }
    }

    public static /* synthetic */ void updateContentAppearance$OKUILib_uilib$default(C55009xbp c55009xbp, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55009xbp.copydefault(z);
    }

    public final void copydefault(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        C55008xbo c55008xbo;
        C54957xaq c54957xaq = this.KWHzl;
        if (z) {
            ViewGroup.LayoutParams layoutParams2 = c54957xaq.AhwBna.getLayoutParams();
            layoutParams = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                C55008xbo c55008xbo2 = this.AhwBna;
                layoutParams.topMargin = copydefault(c55008xbo2 != null ? c55008xbo2.fARcdN() : 0);
                layoutParams.removeRule(15);
            }
        } else {
            ViewGroup.LayoutParams layoutParams3 = c54957xaq.AhwBna.getLayoutParams();
            layoutParams = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                layoutParams.addRule(15);
            }
        }
        C55008xbo c55008xbo3 = this.AhwBna;
        if (c55008xbo3 != null) {
            if (c55008xbo3.wlaJM() == 3) {
                c54957xaq.AhwBna.setTextColor(c55008xbo3.fetchVPNInfo().gHZMYf());
            } else if (z) {
                c54957xaq.AhwBna.setTextColor(c55008xbo3.fetchVPNInfo().AwvSrB());
            } else {
                c54957xaq.AhwBna.setTextColor(c55008xbo3.fetchVPNInfo().sSMYrx());
            }
        }
        android.widget.TextView textView = c54957xaq.AhwBna;
        C55008xbo c55008xbo4 = this.AhwBna;
        textView.setTextSize(((c55008xbo4 == null || c55008xbo4.fARcdN() != 40) && ((c55008xbo = this.AhwBna) == null || c55008xbo.fARcdN() != 36)) ? z ? 12.0f : 16.0f : z ? 10.0f : 14.0f);
    }

    public static /* synthetic */ void setFunctionImage$default(C55009xbp c55009xbp, android.graphics.drawable.Drawable drawable, boolean z, int i, int i2, int i3, int i4, java.lang.Object obj) {
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = 4;
        }
        c55009xbp.setFunctionImage(drawable, z, i5, i6, i3);
    }

    public final void setFunctionImage(android.graphics.drawable.Drawable drawable, boolean z, int i, int i2, int i3) {
        int color;
        C55012xbs c55012xbsFetchVPNInfo;
        C55012xbs c55012xbsFetchVPNInfo2;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.fetchVPNInfo = new wYC(context, null, 0, 6, null);
        if (i <= 0) {
            C55008xbo c55008xbo = this.AhwBna;
            i = (c55008xbo == null || (c55012xbsFetchVPNInfo2 = c55008xbo.fetchVPNInfo()) == null) ? 0 : c55012xbsFetchVPNInfo2.KWHzl();
        }
        if (i2 <= 0) {
            C55008xbo c55008xbo2 = this.AhwBna;
            i2 = (c55008xbo2 == null || (c55012xbsFetchVPNInfo = c55008xbo2.fetchVPNInfo()) == null) ? 0 : c55012xbsFetchVPNInfo.KWHzl();
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        layoutParams.setMarginStart(C55298xhM.OLrzqt(i3, context2));
        layoutParams.addRule(15, -1);
        wYC wyc = this.fetchVPNInfo;
        if (wyc != null) {
            wyc.setLayoutParams(layoutParams);
            wyc.setImageDrawable(drawable);
            if (!z) {
                wyc.setOnClickListener(new View.OnClickListener() { // from class: o.xbw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C55009xbp.setFunctionImage$lambda$27$lambda$26(this.copydefault, view);
                    }
                });
            } else {
                wyc.setImageTintMode(PorterDuff.Mode.DST);
            }
            wyc.setEnabled(this.KWHzl.KWHzl.isEnabled());
            if (wyc.isEnabled()) {
                color = ContextCompat.getColor(wyc.getContext(), C52761wXj.Activity.svhCHd);
            } else {
                color = ContextCompat.getColor(wyc.getContext(), C52761wXj.Activity.hfdhUn);
            }
            setImageTint(color);
        }
        this.KWHzl.KWHzl.addView(this.fetchVPNInfo);
    }

    public static final void setFunctionImage$lambda$27$lambda$26(C55009xbp c55009xbp, android.view.View view) {
        c55009xbp.KWHzl.AEQbTJ.setText("");
    }

    public static /* synthetic */ void setContentHorizontalPadding$default(C55009xbp c55009xbp, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55009xbp.EZpvd(z);
    }

    private final void EZpvd(boolean z) {
        C55012xbs c55012xbsFetchVPNInfo;
        C55012xbs c55012xbsFetchVPNInfo2;
        C55012xbs c55012xbsFetchVPNInfo3;
        C55012xbs c55012xbsFetchVPNInfo4;
        C55012xbs c55012xbsFetchVPNInfo5;
        C55012xbs c55012xbsFetchVPNInfo6;
        C55012xbs c55012xbsFetchVPNInfo7;
        C55012xbs c55012xbsFetchVPNInfo8;
        C55008xbo c55008xbo = this.AhwBna;
        java.lang.Integer numValueOf = c55008xbo != null ? java.lang.Integer.valueOf(c55008xbo.fARcdN()) : null;
        if (numValueOf != null && numValueOf.intValue() == 36) {
            C55008xbo c55008xbo2 = this.AhwBna;
            if (c55008xbo2 == null || !c55008xbo2.AubY()) {
                C55008xbo c55008xbo3 = this.AhwBna;
                if (c55008xbo3 == null || (c55012xbsFetchVPNInfo7 = c55008xbo3.fetchVPNInfo()) == null) {
                    return;
                }
                int iAubY = c55012xbsFetchVPNInfo7.AubY();
                setPaddingRelative(iAubY, 0, z ? iAubY : 0, 0);
                return;
            }
            C55008xbo c55008xbo4 = this.AhwBna;
            if (c55008xbo4 == null || (c55012xbsFetchVPNInfo8 = c55008xbo4.fetchVPNInfo()) == null) {
                return;
            }
            c55012xbsFetchVPNInfo8.AubY();
            setPaddingRelative(0, 0, 0, 0);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 40) {
            C55008xbo c55008xbo5 = this.AhwBna;
            if (c55008xbo5 == null || !c55008xbo5.AubY()) {
                C55008xbo c55008xbo6 = this.AhwBna;
                if (c55008xbo6 == null || (c55012xbsFetchVPNInfo5 = c55008xbo6.fetchVPNInfo()) == null) {
                    return;
                }
                int iFARcdN = c55012xbsFetchVPNInfo5.fARcdN();
                setPaddingRelative(iFARcdN, 0, z ? iFARcdN : 0, 0);
                return;
            }
            C55008xbo c55008xbo7 = this.AhwBna;
            if (c55008xbo7 == null || (c55012xbsFetchVPNInfo6 = c55008xbo7.fetchVPNInfo()) == null) {
                return;
            }
            c55012xbsFetchVPNInfo6.fARcdN();
            setPaddingRelative(0, 0, 0, 0);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 44) {
            C55008xbo c55008xbo8 = this.AhwBna;
            if (c55008xbo8 == null || !c55008xbo8.AubY()) {
                C55008xbo c55008xbo9 = this.AhwBna;
                if (c55008xbo9 == null || (c55012xbsFetchVPNInfo3 = c55008xbo9.fetchVPNInfo()) == null) {
                    return;
                }
                int iIsConnected = c55012xbsFetchVPNInfo3.isConnected();
                setPaddingRelative(iIsConnected, 0, z ? iIsConnected : 0, 0);
                return;
            }
            C55008xbo c55008xbo10 = this.AhwBna;
            if (c55008xbo10 == null || (c55012xbsFetchVPNInfo4 = c55008xbo10.fetchVPNInfo()) == null) {
                return;
            }
            c55012xbsFetchVPNInfo4.isConnected();
            setPaddingRelative(0, 0, 0, 0);
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 48) {
            C55008xbo c55008xbo11 = this.AhwBna;
            if (c55008xbo11 == null || !c55008xbo11.AubY()) {
                C55008xbo c55008xbo12 = this.AhwBna;
                if (c55008xbo12 == null || (c55012xbsFetchVPNInfo = c55008xbo12.fetchVPNInfo()) == null) {
                    return;
                }
                int iORxRYg = c55012xbsFetchVPNInfo.ORxRYg();
                setPaddingRelative(iORxRYg, 0, z ? iORxRYg : 0, 0);
                return;
            }
            C55008xbo c55008xbo13 = this.AhwBna;
            if (c55008xbo13 == null || (c55012xbsFetchVPNInfo2 = c55008xbo13.fetchVPNInfo()) == null) {
                return;
            }
            c55012xbsFetchVPNInfo2.ORxRYg();
            setPaddingRelative(0, 0, 0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setInputField$OKUILib_uilib(@NotNull final C55008xbo c55008xbo) {
        boolean z;
        C55012xbs c55012xbsFetchVPNInfo;
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        this.AhwBna = c55008xbo;
        if (c55008xbo != null && c55008xbo.getNewProxyInstance() == 0) {
            this.KWHzl.AEQbTJ.setGravity(TextAlign.RIGHT);
        }
        setOnClickListener(new View.OnClickListener() { // from class: o.xbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55009xbp.setInputField$lambda$36(this.copydefault, c55008xbo, view);
            }
        });
        this.KWHzl.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.xbx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.copydefault.performClick();
            }
        });
        this.KWHzl.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.xbt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.KWHzl.performClick();
            }
        });
        C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
        C55008xbo c55008xbo2 = this.AhwBna;
        if (c55008xbo2 == null || (c55012xbsFetchVPNInfo = c55008xbo2.fetchVPNInfo()) == null) {
            z = false;
        } else {
            z = true;
            if (!c55012xbsFetchVPNInfo.copydefault()) {
            }
        }
        c55001xbh.setAutoScale(z);
        setDefaultFunctionView();
    }

    public static final void setInputField$lambda$36(C55009xbp c55009xbp, C55008xbo c55008xbo, android.view.View view) {
        updateContentAppearance$OKUILib_uilib$default(c55009xbp, false, 1, null);
        C55001xbh c55001xbh = c55009xbp.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        C55307xhV.copydefault(c55001xbh);
        if (c55008xbo.zLjUOn()) {
            c55008xbo.setState(2);
        } else {
            c55008xbo.setState(1);
        }
    }

    public final void setDefaultFunctionView() {
        C55012xbs c55012xbsFetchVPNInfo;
        C55012xbs c55012xbsFetchVPNInfo2;
        android.content.Context context = getContext();
        C55008xbo c55008xbo = this.AhwBna;
        int iOLrzqt = 0;
        setFunctionImage$default(this, ContextCompat.getDrawable(context, (c55008xbo == null || (c55012xbsFetchVPNInfo2 = c55008xbo.fetchVPNInfo()) == null) ? 0 : c55012xbsFetchVPNInfo2.AEQbTJ()), false, 0, 0, 0, 28, null);
        android.widget.LinearLayout linearLayout = this.KWHzl.KWHzl;
        linearLayout.setVisibility(4);
        C55008xbo c55008xbo2 = this.AhwBna;
        if (c55008xbo2 != null && (c55012xbsFetchVPNInfo = c55008xbo2.fetchVPNInfo()) != null) {
            iOLrzqt = c55012xbsFetchVPNInfo.OLrzqt();
        }
        linearLayout.setMinimumWidth(iOLrzqt);
    }

    public final int copydefault(int i) {
        C55012xbs c55012xbsFetchVPNInfo;
        int iAxsJAY;
        C55008xbo c55008xbo = this.AhwBna;
        int i2 = 0;
        if (c55008xbo != null && (c55012xbsFetchVPNInfo = c55008xbo.fetchVPNInfo()) != null) {
            if (i == 36 || i == 40) {
                iAxsJAY = c55012xbsFetchVPNInfo.AxsJAY();
            } else if (i == 44) {
                iAxsJAY = c55012xbsFetchVPNInfo.zuBGHE();
            } else {
                if (i == 48) {
                    iAxsJAY = c55012xbsFetchVPNInfo.OcIXYQ();
                }
                pUU.OLrzqt("brandon marginTop=" + i2 + ", contentHeight=" + i);
            }
            i2 = iAxsJAY;
            pUU.OLrzqt("brandon marginTop=" + i2 + ", contentHeight=" + i);
        }
        return i2;
    }

    /* JADX INFO: renamed from: o.xbp$Activity */
    public static final class Activity extends android.text.method.PasswordTransformationMethod {
        public static Activity AEQbTJ;
        public static final ActionBar Companion = new ActionBar(null);
        public static final int copydefault = 8;
        public char EZpvd = '*';

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final char AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(char c) {
            this.EZpvd = c;
        }

        /* JADX INFO: renamed from: o.xbp$Activity$ActionBar */
        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbp.Activity.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final Activity EZpvd() {
                if (Activity.AEQbTJ != null) {
                    return Activity.AEQbTJ;
                }
                Activity.AEQbTJ = new Activity();
                return Activity.AEQbTJ;
            }
        }

        @Override // android.text.method.PasswordTransformationMethod, android.text.method.TransformationMethod
        public java.lang.CharSequence getTransformation(@NotNull java.lang.CharSequence charSequence, @NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(charSequence, "");
            Intrinsics.checkNotNullParameter(view, "");
            return new StateListAnimator(this, charSequence);
        }

        /* JADX INFO: renamed from: o.xbp$Activity$StateListAnimator */
        public final class StateListAnimator implements java.lang.CharSequence {
            public final /* synthetic */ Activity AEQbTJ;
            public final java.lang.CharSequence copydefault;

            public StateListAnimator(@NotNull Activity activity, java.lang.CharSequence charSequence) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                this.AEQbTJ = activity;
                this.copydefault = charSequence;
            }

            @Override // java.lang.CharSequence
            public final char charAt(int i) {
                return copydefault(i);
            }

            @Override // java.lang.CharSequence
            public final int length() {
                return copydefault();
            }

            public int copydefault() {
                return this.copydefault.length();
            }

            public char copydefault(int i) {
                return this.AEQbTJ.AEQbTJ();
            }

            @Override // java.lang.CharSequence
            public java.lang.CharSequence subSequence(int i, int i2) {
                return this.copydefault.subSequence(i, i2);
            }
        }
    }

    public final void setCursorStyleWeb3$OKUILib_uilib() {
        setClipChildren(false);
        setClipToPadding(false);
        this.KWHzl.EZpvd.setClipChildren(false);
        this.KWHzl.EZpvd.setClipToPadding(false);
        this.KWHzl.copydefault.setClipChildren(false);
        this.KWHzl.copydefault.setClipToPadding(false);
        this.KWHzl.AEQbTJ.setCursorStyleWeb3();
    }

    public final void KWHzl() {
        android.widget.RelativeLayout relativeLayout = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            android.widget.LinearLayout linearLayout = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                linearLayout.setLayoutParams(layoutParams2);
                C55001xbh c55001xbh = this.KWHzl.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
                ViewGroup.LayoutParams layoutParams3 = c55001xbh.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -1;
                    c55001xbh.setLayoutParams(layoutParams3);
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: renamed from: o.xbp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
