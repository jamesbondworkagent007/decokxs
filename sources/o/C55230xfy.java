package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xfy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55230xfy extends android.widget.LinearLayout implements InterfaceC55066xct {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public java.lang.Class<?> AEQbTJ;
    public Function0<Unit> AYXKKw;
    public Function0<Unit> AhwBna;
    public final C55065xcs AkhnZx;
    public int DbNXlk;
    public final C55183xfD EZpvd;
    public final C54936xaV KWHzl;
    public OKEditText.OKEditTextCursorStyle copydefault;
    public boolean djBIcL;
    public Function0<Unit> fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public boolean isConnected;
    public android.app.Activity valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55230xfy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55230xfy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalledActivity(java.lang.Class<?> cls) {
        this.AEQbTJ = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallingActivity(android.app.Activity activity) {
        this.valueOf = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelCallback(Function0<Unit> function0) {
        this.gEmmrt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClearCallback(Function0<Unit> function0) {
        this.AhwBna = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBackPressed(Function0<Unit> function0) {
        this.AYXKKw = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSearchBarClick(Function0<Unit> function0) {
        this.fetchVPNInfo = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.call int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:48) call: o.xfy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55230xfy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.call : i);
    }

    /* JADX INFO: renamed from: o.xfy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xfy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55230xfy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int iAYXKKw;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        final C54936xaV c54936xaVKWHzl = C54936xaV.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c54936xaVKWHzl, "");
        this.KWHzl = c54936xaVKWHzl;
        C55183xfD c55183xfD = new C55183xfD(this);
        this.EZpvd = c55183xfD;
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.AkhnZx = c55065xcs;
        this.djBIcL = true;
        setGravity(16);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55183xfD, attributeSet, i, 0, 4, null);
        if (c55065xcs.copydefault() <= -4) {
            iAYXKKw = c55183xfD.gEmmrt();
        } else {
            iAYXKKw = c55183xfD.AYXKKw();
        }
        this.DbNXlk = iAYXKKw;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.HJWChPRGtXKC, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.djBIcL = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.hfeTOA, true);
        setShowCancelButton(typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.gLWkOL, false));
        this.values = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.dpErvT, false);
        wYC wyc = c54936xaVKWHzl.gEmmrt;
        wyc.setImageDrawable(c55183xfD.djBIcL());
        wyc.setImageTintList(c55183xfD.valueOf());
        android.widget.ImageView imageView = c54936xaVKWHzl.EZpvd;
        imageView.setImageDrawable(c55183xfD.OLrzqt());
        imageView.setImageTintList(c55183xfD.KWHzl());
        if (c55183xfD.EZpvd() > 0) {
            ViewGroup.LayoutParams layoutParams = c54936xaVKWHzl.EZpvd.getLayoutParams();
            layoutParams.width = c55183xfD.EZpvd();
            layoutParams.height = c55183xfD.EZpvd();
        }
        if (c55183xfD.OLrzqt() != null) {
            c54936xaVKWHzl.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.xfz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C55230xfy.AEQbTJ(c54936xaVKWHzl, this, view);
                }
            });
        }
        int i2 = C52761wXj.PictureInPictureParams.iOIMNp;
        OKEditText.OKEditTextCursorStyle oKEditTextCursorStyle = OKEditText.OKEditTextCursorStyle.SYSTEM;
        int i3 = typedArrayObtainStyledAttributes.getInt(i2, oKEditTextCursorStyle.getStyleInt());
        OKEditText.OKEditTextCursorStyle oKEditTextCursorStyle2 = OKEditText.OKEditTextCursorStyle.WEB3;
        this.copydefault = i3 == oKEditTextCursorStyle2.getStyleInt() ? oKEditTextCursorStyle2 : oKEditTextCursorStyle;
        OKEditText oKEditText = c54936xaVKWHzl.KWHzl;
        oKEditText.setInputType(typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.apHBvG, 1));
        oKEditText.setHintText(C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.gdwsGQ, 0, 4, null));
        TextViewCompat.setTextAppearance(c54936xaVKWHzl.KWHzl, c55183xfD.AhwBna());
        oKEditText.setHintTextColor(c55183xfD.AEQbTJ());
        oKEditText.setTextColor(c55183xfD.values());
        if (c55183xfD.fetchVPNInfo() > 0.0f) {
            oKEditText.setTextSize(0, c55183xfD.fetchVPNInfo());
        }
        Intrinsics.copydefault(oKEditText);
        oKEditText.addTextChangedListener(new StateListAnimator(c54936xaVKWHzl));
        typedArrayObtainStyledAttributes.recycle();
        if (!this.djBIcL) {
            setOnClickListener(new View.OnClickListener() { // from class: o.xfC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C55230xfy.OLrzqt(this.AEQbTJ, view);
                }
            });
        }
        android.widget.TextView textView = c54936xaVKWHzl.OLrzqt;
        textView.setVisibility(0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: o.xfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C55230xfy.copydefault(c54936xaVKWHzl, this, view);
            }
        });
        EZpvd(this.values);
    }

    /* JADX INFO: renamed from: o.xfy$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C54936xaV OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C54936xaV c54936xaV) {
            this.OLrzqt = c54936xaV;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (C55230xfy.this.EZpvd.OLrzqt() != null) {
                this.OLrzqt.EZpvd.setVisibility(android.text.TextUtils.isEmpty(editable) ? 8 : 0);
            }
        }
    }

    public final void setShowCancelButton(boolean z) {
        this.isConnected = z;
        android.widget.TextView textView = this.KWHzl.OLrzqt;
        int iKWHzl = 0;
        textView.setVisibility(z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z) {
                android.content.Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iKWHzl = C55298xhM.KWHzl(8.0f, context);
            }
            marginLayoutParams.setMarginStart(iKWHzl);
        }
    }

    public final java.lang.CharSequence AhwBna() {
        return this.KWHzl.KWHzl.getText();
    }

    public final OKEditText KWHzl() {
        OKEditText oKEditText = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        return oKEditText;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.EditText EZpvd() {
        OKEditText oKEditText = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKEditText, "");
        return oKEditText;
    }

    public static final void AEQbTJ(C54936xaV c54936xaV, C55230xfy c55230xfy, android.view.View view) {
        c54936xaV.KWHzl.setText("");
        Function0<Unit> function0 = c55230xfy.AhwBna;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void OLrzqt(C55230xfy c55230xfy, android.view.View view) {
        c55230xfy.AYXKKw();
    }

    public static final void copydefault(C54936xaV c54936xaV, C55230xfy c55230xfy, android.view.View view) {
        c54936xaV.OLrzqt.setVisibility(8);
        c54936xaV.KWHzl.setText("");
        c55230xfy.gEmmrt();
        Function0<Unit> function0 = c55230xfy.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        Function0<Unit> function02 = c55230xfy.AYXKKw;
        if (function02 != null) {
            function02.invoke();
        }
    }

    public final void setCursorStyleWeb3() {
        this.copydefault = OKEditText.OKEditTextCursorStyle.WEB3;
        this.KWHzl.KWHzl.setCursorStyleWeb3();
        setClipChildren(false);
        setClipToPadding(false);
        this.KWHzl.getRoot().setClipChildren(false);
        this.KWHzl.getRoot().setClipToPadding(false);
        this.KWHzl.AEQbTJ.setClipChildren(false);
        this.KWHzl.AEQbTJ.setClipToPadding(false);
    }

    public final void copydefault(@NotNull android.widget.EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "");
        java.lang.Object systemService = getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 1);
    }

    public final void gEmmrt() {
        android.view.View currentFocus = C33569myt.OLrzqt(getContext()).getCurrentFocus();
        if (currentFocus == null) {
            return;
        }
        java.lang.Object systemService = getContext().getSystemService("input_method");
        Intrinsics.copydefault(systemService, "");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static /* synthetic */ void onlyShowSearchIcon$default(C55230xfy c55230xfy, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c55230xfy.EZpvd(z);
    }

    public static final void copydefault(C55230xfy c55230xfy, android.view.View view) {
        c55230xfy.AYXKKw();
    }

    public final void EZpvd(boolean z) {
        this.values = z;
        if (z) {
            setOnClickListener(new View.OnClickListener() { // from class: o.xfE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C55230xfy.copydefault(this.copydefault, view);
                }
            });
            android.widget.LinearLayout linearLayoutOLrzqt = this.KWHzl.getRoot();
            linearLayoutOLrzqt.setFocusable(true);
            linearLayoutOLrzqt.setFocusableInTouchMode(true);
            linearLayoutOLrzqt.requestFocus();
        }
        android.app.Activity activity = this.valueOf;
        android.widget.RelativeLayout relativeLayout = this.KWHzl.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
        KWHzl(activity, relativeLayout);
        if (z) {
            C54936xaV c54936xaV = this.KWHzl;
            ViewGroup.LayoutParams layoutParams = c54936xaV.getRoot().getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            ViewGroup.LayoutParams layoutParams2 = c54936xaV.AEQbTJ.getLayoutParams();
            Intrinsics.copydefault(layoutParams2, "");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.weight = 0.0f;
            layoutParams3.width = -2;
            android.widget.RelativeLayout relativeLayout2 = c54936xaV.AEQbTJ;
            relativeLayout2.setBackground(null);
            relativeLayout2.setPaddingRelative(0, 0, 0, 0);
            c54936xaV.KWHzl.setVisibility(8);
            ViewGroup.LayoutParams layoutParams4 = c54936xaV.gEmmrt.getLayoutParams();
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams4.width = C55298xhM.OLrzqt(24, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            layoutParams4.height = C55298xhM.OLrzqt(24, context2);
            return;
        }
        C54936xaV c54936xaV2 = this.KWHzl;
        ViewGroup.LayoutParams layoutParams5 = c54936xaV2.getRoot().getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams5).width = -1;
        }
        layoutParams5.height = this.DbNXlk;
        ViewGroup.LayoutParams layoutParams6 = c54936xaV2.AEQbTJ.getLayoutParams();
        Intrinsics.copydefault(layoutParams6, "");
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
        layoutParams7.weight = 1.0f;
        layoutParams7.width = 0;
        android.widget.RelativeLayout relativeLayout3 = c54936xaV2.AEQbTJ;
        relativeLayout3.setBackground(this.EZpvd.copydefault());
        android.content.Context context3 = relativeLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        int iKWHzl = C55298xhM.KWHzl(8.0f, context3);
        android.content.Context context4 = relativeLayout3.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        relativeLayout3.setPaddingRelative(iKWHzl, 0, C55298xhM.KWHzl(10.0f, context4), 0);
        c54936xaV2.KWHzl.setVisibility(0);
        ViewGroup.LayoutParams layoutParams8 = c54936xaV2.gEmmrt.getLayoutParams();
        layoutParams8.width = this.EZpvd.EZpvd();
        layoutParams8.height = this.EZpvd.EZpvd();
    }

    public static /* synthetic */ void setSearchBarEditable$default(C55230xfy c55230xfy, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c55230xfy.setSearchBarEditable(z);
    }

    public final void setSearchBarEditable(boolean z) {
        this.djBIcL = z;
        if (z) {
            OKEditText oKEditText = this.KWHzl.KWHzl;
            oKEditText.setFocusable(true);
            oKEditText.setFocusableInTouchMode(true);
            oKEditText.requestFocus();
            Intrinsics.copydefault(oKEditText);
            return;
        }
        setOnClickListener(new View.OnClickListener() { // from class: o.xfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.OLrzqt.AYXKKw();
            }
        });
        android.widget.LinearLayout linearLayoutOLrzqt = this.KWHzl.getRoot();
        linearLayoutOLrzqt.setFocusable(true);
        linearLayoutOLrzqt.setFocusableInTouchMode(true);
        linearLayoutOLrzqt.requestFocus();
        Intrinsics.copydefault(linearLayoutOLrzqt);
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        int iAYXKKw;
        if (i <= -4) {
            iAYXKKw = this.EZpvd.gEmmrt();
        } else {
            iAYXKKw = this.EZpvd.AYXKKw();
        }
        this.DbNXlk = iAYXKKw;
        this.KWHzl.getRoot().getLayoutParams().height = this.DbNXlk;
        requestLayout();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        ActionBar actionBar = new ActionBar(onClickListener);
        super.setOnClickListener(actionBar);
        if (onClickListener != null) {
            android.widget.EditText editTextEZpvd = EZpvd();
            editTextEZpvd.setFocusable(false);
            editTextEZpvd.setLongClickable(false);
            editTextEZpvd.setCursorVisible(false);
            editTextEZpvd.setClickable(false);
        } else {
            android.widget.EditText editTextEZpvd2 = EZpvd();
            editTextEZpvd2.setFocusable(true);
            editTextEZpvd2.setLongClickable(true);
            editTextEZpvd2.setCursorVisible(true);
            editTextEZpvd2.setClickable(true);
        }
        EZpvd().setOnClickListener(actionBar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.valueOf = C33569myt.OLrzqt(getContext());
        if (this.copydefault == OKEditText.OKEditTextCursorStyle.WEB3) {
            setCursorStyleWeb3();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.valueOf = null;
    }

    public final void KWHzl(android.app.Activity activity, android.view.View view) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        android.transition.Fade fade = new android.transition.Fade();
        fade.setDuration(200L);
        transitionSet.addTransition(fade);
        transitionSet.excludeTarget(view, true);
        if (activity != null) {
            activity.getWindow().setExitTransition(transitionSet);
            activity.getWindow().setEnterTransition(transitionSet);
        }
        if (this.values) {
            return;
        }
        android.transition.TransitionSet transitionSet2 = new android.transition.TransitionSet();
        android.transition.ChangeBounds changeBounds = new android.transition.ChangeBounds();
        changeBounds.setDuration(200L);
        changeBounds.addTarget(view);
        transitionSet2.addTransition(changeBounds);
        transitionSet2.addTarget(view);
        transitionSet2.addTransition(new android.transition.ChangeImageTransform());
        if (activity != null) {
            activity.getWindow().setSharedElementEnterTransition(transitionSet2);
            activity.getWindow().setSharedElementExitTransition(transitionSet2);
        }
        view.setTransitionName("shared_element_name");
    }

    public final void AYXKKw() {
        if (this.valueOf == null || this.AEQbTJ == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.valueOf, this.AEQbTJ);
        intent.putExtra("search_bar_height", this.DbNXlk);
        intent.putExtra("search_bar_hint", this.KWHzl.KWHzl.getHint());
        intent.putExtra("search_bar_only_icon", this.values);
        if (this.values) {
            android.app.Activity activity = this.valueOf;
            Intrinsics.copydefault(activity);
            ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(activity, C52761wXj.Application.EZpvd, C52761wXj.Application.copydefault);
            Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeCustomAnimation, "");
            android.app.Activity activity2 = this.valueOf;
            Intrinsics.copydefault(activity2);
            ContextCompat.startActivity(activity2, intent, activityOptionsCompatMakeCustomAnimation.toBundle());
            return;
        }
        android.app.Activity activity3 = this.valueOf;
        Intrinsics.copydefault(activity3);
        ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(activity3, this.KWHzl.AEQbTJ, "shared_element_name");
        Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeSceneTransitionAnimation, "");
        android.app.Activity activity4 = this.valueOf;
        Intrinsics.copydefault(activity4);
        ContextCompat.startActivity(activity4, intent, activityOptionsCompatMakeSceneTransitionAnimation.toBundle());
    }

    /* JADX INFO: renamed from: o.xfy$ActionBar */
    public final class ActionBar implements View.OnClickListener {
        public final View.OnClickListener KWHzl;

        public ActionBar(View.OnClickListener onClickListener) {
            this.KWHzl = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            Function0<Unit> function0AEQbTJ = C55230xfy.this.AEQbTJ();
            if (function0AEQbTJ != null) {
                function0AEQbTJ.invoke();
            }
            View.OnClickListener onClickListener = this.KWHzl;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }
}
