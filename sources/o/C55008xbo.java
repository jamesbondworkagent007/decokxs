package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55008xbo extends android.widget.LinearLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int djBIcL = 8;
    public int AYXKKw;
    public final C55012xbs AhwBna;
    public int AkhnZx;
    public boolean AuCTel;
    public android.widget.TextView AubY;
    public C55009xbp DbNXlk;
    public ViewTreeObserver.OnGlobalFocusChangeListener ejfBZ;
    public java.lang.String fARcdN;
    public int fIwbmz;
    public C55258xgZ fJNWhG;
    public C54958xar fetchVPNInfo;
    public java.lang.String gEmmrt;
    public C55014xbu getFieldNames;
    public int getNewProxyInstance;
    public android.view.View hDKMBd;
    public java.lang.String isConnected;
    public int iwGUEr;
    public boolean uzCIH;
    public java.lang.String valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55008xbo(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55008xbo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.widget.TextView AuCTelauCTel() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55009xbp fIwbmz() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55012xbs fetchVPNInfo() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54958xar getFieldNames() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewProxyInstance() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55258xgZ hDKMBd() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentHeight$OKUILib_uilib(int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentView(C55009xbp c55009xbp) {
        this.DbNXlk = c55009xbp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorShowing(boolean z) {
        this.AuCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldBinding(@NotNull C54958xar c54958xar) {
        Intrinsics.checkNotNullParameter(c54958xar, "");
        this.fetchVPNInfo = c54958xar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFieldType$OKUILib_uilib(int i) {
        this.values = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLabel$OKUILib_uilib(C55258xgZ c55258xgZ) {
        this.fJNWhG = c55258xgZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTvError$OKUILib_uilib(android.widget.TextView textView) {
        this.AubY = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int wlaJM() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.spnCvw int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:40) call: o.xbo.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55008xbo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.spnCvw : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55008xbo(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C54958xar c54958xarCopydefault = C54958xar.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c54958xarCopydefault, "");
        this.fetchVPNInfo = c54958xarCopydefault;
        C55012xbs c55012xbs = new C55012xbs(this);
        this.AhwBna = c55012xbs;
        this.AYXKKw = 40;
        this.values = 1;
        this.fARcdN = "";
        this.valueOf = "";
        this.gEmmrt = "";
        this.isConnected = "";
        this.getNewProxyInstance = -1;
        setOrientation(1);
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55012xbs, attributeSet, C52761wXj.ActionBar.spnCvw, 0, 4, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.QFTsTN);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.values = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.RXdAnZ, 1);
        this.AkhnZx = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.QnnRaN, 0);
        java.lang.CharSequence string$default = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.DQnQnb, 0, 4, null);
        this.fARcdN = string$default != null ? string$default.toString() : null;
        java.lang.String string = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.GQzpsZ);
        this.valueOf = string;
        if (android.text.TextUtils.isEmpty(string)) {
            java.lang.CharSequence string$default2 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.zeUYeG, 0, 4, null);
            this.valueOf = string$default2 != null ? string$default2.toString() : null;
        }
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(C52761wXj.PictureInPictureParams.GPCHlQ);
        this.gEmmrt = string2;
        if (android.text.TextUtils.isEmpty(string2)) {
            java.lang.CharSequence string$default3 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.sILrnl, 0, 4, null);
            this.gEmmrt = string$default3 != null ? string$default3.toString() : null;
        }
        java.lang.CharSequence string$default4 = C55302xhQ.getString$default(typedArrayObtainStyledAttributes, context, C52761wXj.PictureInPictureParams.OgHfcT, 0, 4, null);
        this.isConnected = string$default4 != null ? string$default4.toString() : null;
        this.AYXKKw = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.OzhFjl, 40);
        this.iwGUEr = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.drbYRJ, 0);
        this.uzCIH = typedArrayObtainStyledAttributes.getBoolean(C52761wXj.PictureInPictureParams.QiTXOm, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C52761wXj.PictureInPictureParams.RLmrWm, 0);
        if (resourceId != 0) {
            this.hDKMBd = android.view.LayoutInflater.from(context).inflate(resourceId, (android.view.ViewGroup) this, false);
        }
        this.fIwbmz = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.aQtmcU, 1);
        this.getNewProxyInstance = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.OrsvgJ, -1);
        int i2 = C52761wXj.PictureInPictureParams.DBAlnt;
        OKEditText.OKEditTextCursorStyle oKEditTextCursorStyle = OKEditText.OKEditTextCursorStyle.SYSTEM;
        oKEditTextCursorStyle = typedArrayObtainStyledAttributes.getInt(i2, oKEditTextCursorStyle.getStyleInt()) == 1 ? OKEditText.OKEditTextCursorStyle.WEB3 : oKEditTextCursorStyle;
        typedArrayObtainStyledAttributes.recycle();
        java.lang.System.out.println((java.lang.Object) ("testing andre init component with contentText " + this.valueOf + " and inputType " + this.fIwbmz));
        AhwBna();
        setAllTextAppearance$OKUILib_uilib();
        setAllTextSize$OKUILib_uilib();
        setState(this.AkhnZx);
        setAllText();
        EZpvd(oKEditTextCursorStyle);
    }

    /* JADX INFO: renamed from: o.xbo$Activity */
    public static final class Activity implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C55008xbo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity(android.view.View view, C55008xbo c55008xbo) {
            this.AEQbTJ = view;
            this.OLrzqt = c55008xbo;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.AEQbTJ.removeOnAttachStateChangeListener(this);
            if (!ViewCompat.isAttachedToWindow(view)) {
                android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this.OLrzqt.ejfBZ);
                    return;
                }
                return;
            }
            view.addOnAttachStateChangeListener(new StateListAnimator(view, this.OLrzqt));
        }
    }

    /* JADX INFO: renamed from: o.xbo$StateListAnimator */
    public static final class StateListAnimator implements View.OnAttachStateChangeListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C55008xbo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public StateListAnimator(android.view.View view, C55008xbo c55008xbo) {
            this.KWHzl = view;
            this.OLrzqt = c55008xbo;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.removeOnAttachStateChangeListener(this);
            android.view.ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalFocusChangeListener(this.OLrzqt.ejfBZ);
            }
        }
    }

    public final void setCursorStyleWeb3() {
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            c55009xbp.setCursorStyleWeb3$OKUILib_uilib();
        }
    }

    public void setState(int i) {
        setFieldState(i);
    }

    public static /* synthetic */ void setTitleType$default(C55008xbo c55008xbo, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTitleType");
        }
        if ((i2 & 1) != 0) {
            i = 1;
        }
        c55008xbo.setTitleType(i);
    }

    public void setTitleType(int i) {
        if (i == this.values) {
            return;
        }
        this.values = i;
        sSMYrx();
    }

    public void setLabelText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN = str;
        sSMYrx();
    }

    public final android.view.View iwGUEr() {
        C54957xaq c54957xaqAEQbTJ;
        C54957xaq c54957xaqAEQbTJ2;
        int i = this.values;
        if (i == 0) {
            C55009xbp c55009xbp = this.DbNXlk;
            if (c55009xbp != null && (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) != null) {
                return c54957xaqAEQbTJ.OLrzqt;
            }
        } else {
            if (i == 1) {
                return this.fJNWhG;
            }
            C55009xbp c55009xbp2 = this.DbNXlk;
            if (c55009xbp2 != null && (c54957xaqAEQbTJ2 = c55009xbp2.AEQbTJ()) != null) {
                return c54957xaqAEQbTJ2.AhwBna;
            }
        }
        return null;
    }

    public static /* synthetic */ void setSizeType$default(C55008xbo c55008xbo, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSizeType");
        }
        if ((i2 & 1) != 0) {
            i = 40;
        }
        c55008xbo.setSizeType(i);
    }

    public void setSizeType(int i) {
        this.AYXKKw = i;
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            c55009xbp.setLayoutParams(isConnected());
        }
        setAllTextAppearance$OKUILib_uilib();
        setAllTextSize$OKUILib_uilib();
        setContentBackgroundType$OKUILib_uilib(this.AkhnZx);
        C55009xbp c55009xbp2 = this.DbNXlk;
        if (c55009xbp2 != null) {
            c55009xbp2.copydefault(!android.text.TextUtils.isEmpty(AkhnZx() != null ? r0.getText() : null));
        }
    }

    public static /* synthetic */ void showClearButtonWhenEditting$default(C55008xbo c55008xbo, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showClearButtonWhenEditting");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        c55008xbo.AEQbTJ(z);
    }

    public void AEQbTJ(boolean z) {
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            c55009xbp.setClearIconVisible$OKUILib_uilib(z);
            wYC wycAYXKKw = c55009xbp.AYXKKw();
            if (wycAYXKKw != null) {
                wycAYXKKw.setVisibility(z ? 0 : 8);
            }
        }
    }

    public static /* synthetic */ void showClearButtonWhenEditing$default(C55008xbo c55008xbo, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showClearButtonWhenEditing");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        c55008xbo.EZpvd(z);
    }

    public void EZpvd(boolean z) {
        AEQbTJ(z);
    }

    public boolean zsXlph() {
        C55009xbp c55009xbp = this.DbNXlk;
        return c55009xbp != null && c55009xbp.DbNXlk();
    }

    public void setLabelView(@NotNull android.view.View view) {
        C54957xaq c54957xaqAEQbTJ;
        android.widget.RelativeLayout relativeLayout;
        Intrinsics.checkNotNullParameter(view, "");
        if (this.values == 0) {
            this.fetchVPNInfo.AEQbTJ.setVisibility(8);
            C55009xbp c55009xbp = this.DbNXlk;
            if (c55009xbp == null || (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) == null || (relativeLayout = c54957xaqAEQbTJ.gEmmrt) == null) {
                return;
            }
            relativeLayout.removeAllViews();
            relativeLayout.addView(view);
            return;
        }
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.AEQbTJ;
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        linearLayout.addView(view);
    }

    public android.widget.LinearLayout uzCIH() {
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public android.widget.LinearLayout ejfBZ() {
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        return linearLayout;
    }

    public android.widget.TextView fJNWhG() {
        C54957xaq c54957xaqAEQbTJ;
        C54957xaq c54957xaqAEQbTJ2;
        if (this.values == 2) {
            C55009xbp c55009xbp = this.DbNXlk;
            if (c55009xbp != null && (c54957xaqAEQbTJ2 = c55009xbp.AEQbTJ()) != null) {
                return c54957xaqAEQbTJ2.AhwBna;
            }
        } else {
            C55009xbp c55009xbp2 = this.DbNXlk;
            if (c55009xbp2 != null && (c54957xaqAEQbTJ = c55009xbp2.AEQbTJ()) != null) {
                return c54957xaqAEQbTJ.OLrzqt;
            }
        }
        return null;
    }

    public C55001xbh AkhnZx() {
        C54957xaq c54957xaqAEQbTJ;
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp == null || (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) == null) {
            return null;
        }
        return c54957xaqAEQbTJ.AEQbTJ;
    }

    public android.widget.LinearLayout AuCTel() {
        C54957xaq c54957xaqAEQbTJ;
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp == null || (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) == null) {
            return null;
        }
        return c54957xaqAEQbTJ.KWHzl;
    }

    public void setContentView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.fetchVPNInfo.copydefault.removeAllViews();
        view.setLayoutParams(isConnected());
        if ((this.AYXKKw != 48 || this.values != 2) && !this.uzCIH) {
            C55296xhK.EZpvd(view, this.AhwBna.aKErDB());
        }
        this.fetchVPNInfo.copydefault.addView(view);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xbp.updateContentAppearance$OKUILib_uilib$default(o.xbp, boolean, int, java.lang.Object):void */
    public void setHintText(java.lang.String str) {
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setHint(str);
        }
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            C55009xbp.updateContentAppearance$OKUILib_uilib$default(c55009xbp, false, 1, null);
        }
    }

    public static /* synthetic */ void setText$default(C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setText");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        c55008xbo.setText(str);
    }

    public void setText(java.lang.String str) {
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(str);
        }
    }

    public void setSupportingView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        setHelperView(view);
    }

    public void setErrorView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.OLrzqt;
        linearLayout.removeAllViews();
        linearLayout.addView(view);
        AxsJAY();
    }

    public void setErrorText(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.AkhnZx = 2;
        this.AuCTel = true;
        this.fetchVPNInfo.OLrzqt.setVisibility(0);
        android.widget.TextView textView = this.AubY;
        if (textView != null) {
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView.setText(charSequence);
            textView.setTextColor(this.AhwBna.QUSxYX());
        }
        setContentBackgroundType$OKUILib_uilib(2);
        AxsJAY();
    }

    public void values() {
        if (this.AuCTel) {
            this.AuCTel = false;
            this.fetchVPNInfo.OLrzqt.setVisibility(8);
            android.widget.TextView textView = this.AubY;
            if (textView != null) {
                textView.setText("");
            }
            if (hasFocus()) {
                this.AkhnZx = 1;
                setContentBackgroundType$OKUILib_uilib(1);
            } else {
                this.AkhnZx = 0;
                setContentBackgroundType$OKUILib_uilib(0);
            }
            AxsJAY();
        }
    }

    public static /* synthetic */ void setSupportVisibility$default(C55008xbo c55008xbo, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSupportVisibility");
        }
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c55008xbo.setSupportVisibility(i);
    }

    public final void setSupportVisibility(int i) {
        valueOf();
    }

    public final void setOnlyBottomBorder(boolean z) {
        this.uzCIH = z;
        setContentBackgroundType$OKUILib_uilib(this.AkhnZx);
        setHorizontalPadding();
        setAllTextSize$OKUILib_uilib();
    }

    public final void gHZMYf() {
        DbNXlk();
        AhwBna();
        setAllTextAppearance$OKUILib_uilib();
        setAllTextSize$OKUILib_uilib();
        setState(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.view.ViewTreeObserver viewTreeObserver = this.fetchVPNInfo.copydefault.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this.ejfBZ);
        }
    }

    public void setFieldState(int i) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C54957xaq c54957xaqAEQbTJ2;
        C55001xbh c55001xbh2;
        C54957xaq c54957xaqAEQbTJ3;
        C55001xbh c55001xbh3;
        C54957xaq c54957xaqAEQbTJ4;
        C55001xbh c55001xbh4;
        this.AkhnZx = i;
        setInputFiledViewEnable(true);
        if (i == 0) {
            C55009xbp c55009xbp = this.DbNXlk;
            if (c55009xbp != null && (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                c55001xbh.setTextColor(this.AhwBna.AuCTelauCTel());
            }
            setContentBackgroundType$OKUILib_uilib(0);
            return;
        }
        if (i == 1) {
            C55009xbp c55009xbp2 = this.DbNXlk;
            if (c55009xbp2 != null && (c54957xaqAEQbTJ2 = c55009xbp2.AEQbTJ()) != null && (c55001xbh2 = c54957xaqAEQbTJ2.AEQbTJ) != null) {
                c55001xbh2.setTextColor(this.AhwBna.gEmmrt());
            }
            setContentBackgroundType$OKUILib_uilib(1);
            return;
        }
        if (i == 2) {
            C55009xbp c55009xbp3 = this.DbNXlk;
            if (c55009xbp3 != null && (c54957xaqAEQbTJ3 = c55009xbp3.AEQbTJ()) != null && (c55001xbh3 = c54957xaqAEQbTJ3.AEQbTJ) != null) {
                c55001xbh3.setTextColor(this.AhwBna.valueOf());
            }
            setContentBackgroundType$OKUILib_uilib(2);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            C55009xbp c55009xbp4 = this.DbNXlk;
            if (c55009xbp4 != null) {
                c55009xbp4.OLrzqt();
            }
            setContentBackgroundType$OKUILib_uilib(4);
            return;
        }
        C55009xbp c55009xbp5 = this.DbNXlk;
        if (c55009xbp5 != null && (c54957xaqAEQbTJ4 = c55009xbp5.AEQbTJ()) != null && (c55001xbh4 = c54957xaqAEQbTJ4.AEQbTJ) != null) {
            c55001xbh4.setTextColor(this.AhwBna.AhwBna());
        }
        setInputFiledViewEnable(false);
        setContentBackgroundType$OKUILib_uilib(3);
    }

    public void setInputFiledViewEnable(boolean z) {
        this.fetchVPNInfo.copydefault.setEnabled(z);
        setViewEnable(this.fetchVPNInfo.copydefault, z);
        if (z) {
            if (hasFocus()) {
                setContentBackgroundType$OKUILib_uilib(1);
            } else {
                setContentBackgroundType$OKUILib_uilib(0);
            }
        } else {
            setContentBackgroundType$OKUILib_uilib(3);
        }
        if (this.AuCTel) {
            return;
        }
        values();
    }

    public void OLrzqt(@NotNull android.text.TextWatcher textWatcher) {
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        Intrinsics.checkNotNullParameter(textWatcher, "");
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp == null || (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) == null || (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) == null) {
            return;
        }
        c55001xbh.addTextChangedListener(textWatcher);
    }

    public void setOnContentClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            c55009xbp.setOnClickListener(onClickListener);
        }
    }

    public void setInterceptEvent(boolean z) {
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            c55009xbp.setInterceptEvent(z);
        }
    }

    public void setIconView(int i) {
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null) {
            C55009xbp.replaceFunctionDrawable$default(c55009xbp, i, 0, 0, 0, 14, null);
        }
    }

    public void setOnIconClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        android.widget.LinearLayout linearLayoutAuCTel = AuCTel();
        if (linearLayoutAuCTel != null) {
            linearLayoutAuCTel.setFocusable(true);
            linearLayoutAuCTel.setOnClickListener(onClickListener);
        }
    }

    public void setHelperView(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.hDKMBd = view;
        android.widget.RelativeLayout relativeLayout = this.fetchVPNInfo.EZpvd;
        relativeLayout.removeAllViews();
        relativeLayout.setVisibility(0);
        relativeLayout.addView(view);
        AxsJAY();
    }

    public void setContentBackground$OKUILib_uilib(int i) {
        this.fetchVPNInfo.copydefault.setBackgroundResource(ContextCompat.getColor(getContext(), i));
    }

    public void setContentBackgroundType$OKUILib_uilib(int i) {
        wYC wycAYXKKw;
        wYC wycAYXKKw2;
        wYC wycAYXKKw3;
        wYC wycAYXKKw4;
        if (!this.uzCIH) {
            if (i == 0) {
                setContentLayerBackground(this.AhwBna.fJNWhG(), this.AhwBna.zLjUOn());
                C55009xbp c55009xbp = this.DbNXlk;
                if (c55009xbp == null || (wycAYXKKw = c55009xbp.AYXKKw()) == null) {
                    return;
                }
                wycAYXKKw.setEnabled(true);
                return;
            }
            if (i == 1) {
                setContentLayerBackground(this.AhwBna.fetchVPNInfo(), this.AhwBna.EZpvd());
                C55009xbp c55009xbp2 = this.DbNXlk;
                if (c55009xbp2 == null || (wycAYXKKw2 = c55009xbp2.AYXKKw()) == null) {
                    return;
                }
                wycAYXKKw2.setEnabled(true);
                return;
            }
            if (i == 2) {
                setContentLayerBackground(this.AhwBna.DbNXlk(), this.AhwBna.djBIcL());
                C55009xbp c55009xbp3 = this.DbNXlk;
                if (c55009xbp3 == null || (wycAYXKKw3 = c55009xbp3.AYXKKw()) == null) {
                    return;
                }
                wycAYXKKw3.setEnabled(true);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                setContentLayerBackground(ContextCompat.getColor(getContext(), C52761wXj.Activity.ExKek), ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
                return;
            } else {
                setContentLayerBackground(this.AhwBna.AuCTel(), this.AhwBna.AYXKKw());
                C55009xbp c55009xbp4 = this.DbNXlk;
                if (c55009xbp4 == null || (wycAYXKKw4 = c55009xbp4.AYXKKw()) == null) {
                    return;
                }
                wycAYXKKw4.setEnabled(false);
                return;
            }
        }
        C55009xbp c55009xbp5 = this.DbNXlk;
        if (c55009xbp5 != null) {
            C55296xhK.EZpvd((android.view.View) c55009xbp5, 0.0f);
        }
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        float fFvQaOB = this.AhwBna.fvQaOB();
        if (i == 0) {
            C55012xbs c55012xbs = this.AhwBna;
            c55012xbs.OLrzqt(linearLayout, c55012xbs.fIwbmz(), fFvQaOB);
            C55009xbp c55009xbp6 = this.DbNXlk;
            if (c55009xbp6 != null) {
                c55009xbp6.setBackgroundColor(this.AhwBna.getNewProxyInstance());
                return;
            }
            return;
        }
        if (i == 1) {
            C55012xbs c55012xbs2 = this.AhwBna;
            c55012xbs2.OLrzqt(linearLayout, c55012xbs2.fetchVPNInfo(), fFvQaOB);
            C55009xbp c55009xbp7 = this.DbNXlk;
            if (c55009xbp7 != null) {
                c55009xbp7.setBackgroundColor(this.AhwBna.hDKMBd());
                return;
            }
            return;
        }
        if (i == 2) {
            C55012xbs c55012xbs3 = this.AhwBna;
            c55012xbs3.OLrzqt(linearLayout, c55012xbs3.DbNXlk(), fFvQaOB);
            C55009xbp c55009xbp8 = this.DbNXlk;
            if (c55009xbp8 != null) {
                c55009xbp8.setBackgroundColor(this.AhwBna.iwGUEr());
                return;
            }
            return;
        }
        if (i == 3) {
            C55012xbs c55012xbs4 = this.AhwBna;
            c55012xbs4.OLrzqt(linearLayout, c55012xbs4.ejfBZ(), fFvQaOB);
            C55009xbp c55009xbp9 = this.DbNXlk;
            if (c55009xbp9 != null) {
                c55009xbp9.setBackgroundColor(this.AhwBna.uzCIH());
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        this.AhwBna.OLrzqt(linearLayout, ContextCompat.getColor(getContext(), C52761wXj.Activity.ExKek), C55298xhM.dp2pxFloat$default(0.2f, null, 1, null));
        C55009xbp c55009xbp10 = this.DbNXlk;
        if (c55009xbp10 != null) {
            c55009xbp10.setBackgroundColor(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
        }
    }

    public final void AhwBna() {
        AYXKKw();
        gEmmrt();
        valueOf();
        djBIcL();
        AxsJAY();
    }

    public final void AYXKKw() {
        C55320xhi c55320xhiKWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55258xgZ c55258xgZ = new C55258xgZ(context, null, 0, 6, null);
        C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextColor(this.AhwBna.AuCTelauCTel());
        }
        c55258xgZ.setHelperLabelType(2);
        c55258xgZ.setGravity(TextAlign.LEFT);
        this.fJNWhG = c55258xgZ;
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.AEQbTJ;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = TextAlign.LEFT;
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(c55258xgZ, layoutParams);
    }

    public final void gEmmrt() {
        java.lang.String str;
        if (this.fetchVPNInfo.copydefault.hasFocus()) {
            setContentBackgroundType$OKUILib_uilib(1);
        } else {
            setContentBackgroundType$OKUILib_uilib(0);
        }
        this.ejfBZ = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: o.xbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public final void onGlobalFocusChanged(android.view.View view, android.view.View view2) {
                C55008xbo.KWHzl(this.EZpvd, view, view2);
            }
        };
        android.view.ViewTreeObserver viewTreeObserver = this.fetchVPNInfo.copydefault.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalFocusChangeListener(this.ejfBZ);
        }
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        if (ViewCompat.isAttachedToWindow(linearLayout)) {
            if (!ViewCompat.isAttachedToWindow(linearLayout)) {
                android.view.ViewTreeObserver viewTreeObserver2 = linearLayout.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalFocusChangeListener(this.ejfBZ);
                }
            } else {
                linearLayout.addOnAttachStateChangeListener(new StateListAnimator(linearLayout, this));
            }
        } else {
            linearLayout.addOnAttachStateChangeListener(new Activity(linearLayout, this));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55009xbp c55009xbp = new C55009xbp(context, null, 0, 6, null);
        c55009xbp.setInputField$OKUILib_uilib(this);
        c55009xbp.setLayoutParams(isConnected());
        C55296xhK.EZpvd(c55009xbp, this.AhwBna.aKErDB());
        C55001xbh c55001xbh = c55009xbp.AEQbTJ().AEQbTJ;
        c55001xbh.setId(android.view.View.generateViewId());
        c55001xbh.setInputType(this.fIwbmz);
        c55009xbp.setPasswordChar(this.AhwBna.gasjUx());
        c55009xbp.setImageTint(this.AhwBna.flVtFt());
        this.DbNXlk = c55009xbp;
        setHorizontalPadding();
        this.fetchVPNInfo.copydefault.addView(this.DbNXlk);
        if (this.getNewProxyInstance != -1) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            C55014xbu c55014xbu = new C55014xbu(context2, null, 2, 0 == true ? 1 : 0);
            c55014xbu.setType(this.getNewProxyInstance);
            this.getFieldNames = c55014xbu;
            C55009xbp c55009xbp2 = this.DbNXlk;
            if (c55009xbp2 != null) {
                Intrinsics.copydefault(c55014xbu);
                c55009xbp2.EZpvd(c55014xbu);
            }
        }
        if (android.text.TextUtils.isEmpty(this.fARcdN) || (str = this.fARcdN) == null) {
            return;
        }
        setLabelText(str);
    }

    public static final void KWHzl(C55008xbo c55008xbo, android.view.View view, android.view.View view2) {
        if (c55008xbo.AkhnZx == 4) {
            c55008xbo.setContentBackgroundType$OKUILib_uilib(4);
            return;
        }
        if (c55008xbo.AuCTel) {
            c55008xbo.setContentBackgroundType$OKUILib_uilib(2);
            return;
        }
        if (!c55008xbo.fetchVPNInfo.copydefault.isEnabled()) {
            c55008xbo.setContentBackgroundType$OKUILib_uilib(3);
        } else if (c55008xbo.fetchVPNInfo.copydefault.hasFocus()) {
            c55008xbo.setContentBackgroundType$OKUILib_uilib(1);
        } else {
            c55008xbo.setContentBackgroundType$OKUILib_uilib(0);
        }
    }

    public final void valueOf() {
        if (this.iwGUEr == 0 || this.hDKMBd == null) {
            this.fetchVPNInfo.EZpvd.setVisibility(8);
            return;
        }
        android.widget.RelativeLayout relativeLayout = this.fetchVPNInfo.EZpvd;
        relativeLayout.removeAllViews();
        relativeLayout.addView(this.hDKMBd);
        relativeLayout.setVisibility(0);
        Intrinsics.copydefault(relativeLayout);
    }

    public final void djBIcL() {
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.AubY = textView;
        textView.setGravity(8388611);
        textView.setTextColor(this.AhwBna.QUSxYX());
        this.fetchVPNInfo.OLrzqt.addView(this.AubY);
    }

    public final void sSMYrx() {
        C54957xaq c54957xaqAEQbTJ;
        C54957xaq c54957xaqAEQbTJ2;
        C54957xaq c54957xaqAEQbTJ3;
        int i = this.values;
        if (i == 0) {
            android.widget.LinearLayout linearLayout = this.fetchVPNInfo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            C55009xbp c55009xbp = this.DbNXlk;
            if (c55009xbp != null && (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) != null) {
                android.widget.TextView textView = c54957xaqAEQbTJ.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                android.widget.TextView textView2 = c54957xaqAEQbTJ.OLrzqt;
                Intrinsics.copydefault(textView2);
                textView2.setVisibility(0);
                textView2.setText(this.fARcdN);
            }
            C55001xbh c55001xbhAkhnZx = AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setGravity(TextAlign.RIGHT);
                return;
            }
            return;
        }
        if (i == 1) {
            android.widget.LinearLayout linearLayout2 = this.fetchVPNInfo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            C55009xbp c55009xbp2 = this.DbNXlk;
            if (c55009xbp2 != null && (c54957xaqAEQbTJ2 = c55009xbp2.AEQbTJ()) != null) {
                android.widget.TextView textView3 = c54957xaqAEQbTJ2.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
                android.widget.TextView textView4 = c54957xaqAEQbTJ2.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
            }
            C55258xgZ c55258xgZ = this.fJNWhG;
            if (c55258xgZ != null) {
                c55258xgZ.setText(this.fARcdN);
            }
            C55001xbh c55001xbhAkhnZx2 = AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setGravity(TextAlign.LEFT);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout3 = this.fetchVPNInfo.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
        linearLayout3.setVisibility(8);
        C55009xbp c55009xbp3 = this.DbNXlk;
        if (c55009xbp3 != null && (c54957xaqAEQbTJ3 = c55009xbp3.AEQbTJ()) != null) {
            android.widget.TextView textView5 = c54957xaqAEQbTJ3.AhwBna;
            Intrinsics.copydefault(textView5);
            textView5.setVisibility(0);
            textView5.setText(this.fARcdN);
            android.widget.TextView textView6 = c54957xaqAEQbTJ3.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView6, "");
            textView6.setVisibility(8);
        }
        C55009xbp c55009xbp4 = this.DbNXlk;
        if (c55009xbp4 != null) {
            c55009xbp4.copydefault(!android.text.TextUtils.isEmpty(AkhnZx() != null ? r1.getText() : null));
        }
    }

    public final void setHorizontalPadding() {
        int i = this.AYXKKw;
        if (i == 36) {
            C55009xbp c55009xbp = this.DbNXlk;
            if (c55009xbp != null) {
                c55009xbp.setPaddingRelative(this.AhwBna.AubY(), 0, 0, 0);
                return;
            }
            return;
        }
        if (i == 40) {
            C55009xbp c55009xbp2 = this.DbNXlk;
            if (c55009xbp2 != null) {
                c55009xbp2.setPaddingRelative(this.AhwBna.fARcdN(), 0, 0, 0);
                return;
            }
            return;
        }
        if (i == 44) {
            C55009xbp c55009xbp3 = this.DbNXlk;
            if (c55009xbp3 != null) {
                c55009xbp3.setPaddingRelative(this.AhwBna.isConnected(), 0, 0, 0);
                return;
            }
            return;
        }
        if (i != 48) {
            C55009xbp c55009xbp4 = this.DbNXlk;
            if (c55009xbp4 != null) {
                c55009xbp4.setPaddingRelative(this.AhwBna.giSNqX(), 0, 0, 0);
            }
            updateLabelOutsideBottomMargin$default(this, 0, 1, null);
            return;
        }
        if (this.uzCIH) {
            C55009xbp c55009xbp5 = this.DbNXlk;
            if (c55009xbp5 != null) {
                c55009xbp5.setPaddingRelative(this.AhwBna.giSNqX(), 0, 0, 0);
            }
            updateLabelOutsideBottomMargin$default(this, 0, 1, null);
            return;
        }
        C55009xbp c55009xbp6 = this.DbNXlk;
        if (c55009xbp6 != null) {
            c55009xbp6.setPaddingRelative(this.AhwBna.isConnected(), 0, 0, 0);
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        KWHzl(C55298xhM.OLrzqt(8, context));
    }

    public static /* synthetic */ void updateLabelOutsideBottomMargin$default(C55008xbo c55008xbo, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLabelOutsideBottomMargin");
        }
        if ((i2 & 1) != 0) {
            android.content.Context context = c55008xbo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            i = C55298xhM.OLrzqt(4, context);
        }
        c55008xbo.KWHzl(i);
    }

    public final void KWHzl(int i) {
        ViewGroup.LayoutParams layoutParams = this.fetchVPNInfo.AEQbTJ.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        }
    }

    public ViewGroup.LayoutParams isConnected() {
        int i = this.AYXKKw;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C55298xhM.OLrzqt(i, context));
        if (this.uzCIH) {
            layoutParams.setMargins(0, 0, 0, (int) this.AhwBna.gGvvIC());
        } else {
            layoutParams.setMargins((int) this.AhwBna.gGvvIC(), (int) this.AhwBna.gGvvIC(), (int) this.AhwBna.gGvvIC(), (int) this.AhwBna.gGvvIC());
        }
        AxsJAY();
        return layoutParams;
    }

    public void setAllTextAppearance$OKUILib_uilib() {
        C54957xaq c54957xaqAEQbTJ;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C55258xgZ c55258xgZ = this.fJNWhG;
        if (c55258xgZ != null && (c55312xhaValueOf = c55258xgZ.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            TextViewCompat.setTextAppearance(c55320xhiKWHzl, this.AhwBna.finit());
            if (this.values == 1) {
                c55320xhiKWHzl.setTextColor(this.AhwBna.fFgQHt());
            }
        }
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null && (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) != null) {
            c54957xaqAEQbTJ.OLrzqt.setTextColor(this.AhwBna.dNCPSb());
            C55001xbh c55001xbh = c54957xaqAEQbTJ.AEQbTJ;
            if (this.AYXKKw == 72) {
                TextViewCompat.setTextAppearance(c55001xbh, C52761wXj.LoaderManager.fFgQHt);
            } else if (this.uzCIH) {
                TextViewCompat.setTextAppearance(c55001xbh, C52761wXj.LoaderManager.giSNqX);
            } else {
                TextViewCompat.setTextAppearance(c55001xbh, this.AhwBna.zsXlph());
            }
            if (this.AkhnZx == 3) {
                c55001xbh.setTextColor(this.AhwBna.AhwBna());
            } else {
                c55001xbh.setTextColor(this.AhwBna.AuCTelauCTel());
            }
            c55001xbh.setHintTextColor(this.AhwBna.UeEOUB());
        }
        android.widget.TextView textView = this.AubY;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, this.AhwBna.QfsBiF());
            textView.setTextColor(this.AhwBna.QUSxYX());
        }
    }

    public void setAllTextSize$OKUILib_uilib() {
        float fFZBcTu;
        float fWlaJM;
        float fRJOkX;
        C55312xha c55312xhaValueOf;
        C55320xhi c55320xhiKWHzl;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        C55312xha c55312xhaValueOf2;
        C55320xhi c55320xhiKWHzl2;
        int i = this.AYXKKw;
        if (i == 36) {
            fFZBcTu = this.AhwBna.fZBcTu();
            fWlaJM = this.AhwBna.wlaJM();
            fRJOkX = this.AhwBna.RJOkX();
        } else if (i == 40) {
            fFZBcTu = this.AhwBna.dxcTrN();
            fWlaJM = this.AhwBna.getFieldNames();
            fRJOkX = this.AhwBna.QbewEr();
        } else if (i == 44) {
            fFZBcTu = this.AhwBna.RcXXUw();
            fWlaJM = this.AhwBna.values();
            fRJOkX = this.AhwBna.DTwDnp();
        } else if (i == 48) {
            fFZBcTu = this.AhwBna.dvKsVJ();
            if (this.uzCIH) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                fWlaJM = C55298xhM.gEmmrt(24.0f, context);
            } else if (this.values == 2) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                fWlaJM = C55298xhM.gEmmrt(16.0f, context2);
            } else {
                fWlaJM = this.AhwBna.QOLQEE();
            }
            fRJOkX = this.AhwBna.QVAiDq();
        } else if (i == 72) {
            fFZBcTu = this.AhwBna.djSkpj();
            fWlaJM = this.AhwBna.AkhnZx();
            fRJOkX = this.AhwBna.QKVWgx();
        } else {
            fFZBcTu = this.AhwBna.fZBcTu();
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            fWlaJM = C55298xhM.EZpvd(10.0f, context3);
            fRJOkX = this.AhwBna.RJOkX();
        }
        if (this.values == 0) {
            C55258xgZ c55258xgZ = this.fJNWhG;
            if (c55258xgZ != null && (c55312xhaValueOf2 = c55258xgZ.valueOf()) != null && (c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl()) != null) {
                c55320xhiKWHzl2.setTextSize(0, fWlaJM);
            }
        } else {
            C55258xgZ c55258xgZ2 = this.fJNWhG;
            if (c55258xgZ2 != null && (c55312xhaValueOf = c55258xgZ2.valueOf()) != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl.setTextSize(0, fFZBcTu);
            }
        }
        C55009xbp c55009xbp = this.DbNXlk;
        if (c55009xbp != null && (c54957xaqAEQbTJ = c55009xbp.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
            c55001xbh.setTextSize(0, fWlaJM);
            android.content.Context context4 = c55001xbh.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            c55001xbh.setMaxTextSize(C55298xhM.AhwBna(fWlaJM, context4));
        }
        android.widget.TextView textView = this.AubY;
        if (textView != null) {
            textView.setTextSize(0, fRJOkX);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AxsJAY() {
        int iOLrzqt;
        ViewGroup.LayoutParams layoutParams = this.fetchVPNInfo.KWHzl.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.widget.RelativeLayout relativeLayout = this.fetchVPNInfo.EZpvd;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "");
            if (relativeLayout.getVisibility() != 0) {
                android.widget.LinearLayout linearLayout = this.fetchVPNInfo.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                if (linearLayout.getVisibility() != 0) {
                    iOLrzqt = 0;
                }
            } else if (!this.uzCIH && this.AYXKKw == 48) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt = C55298xhM.OLrzqt(8, context);
            } else {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iOLrzqt = C55298xhM.OLrzqt(4, context2);
            }
            marginLayoutParams.topMargin = iOLrzqt;
        }
    }

    public final void setAllText() {
        C55001xbh c55001xbhAkhnZx = AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(this.valueOf);
        }
        if (!android.text.TextUtils.isEmpty(this.gEmmrt)) {
            setHintText(this.gEmmrt);
        }
        if (android.text.TextUtils.isEmpty(this.isConnected)) {
            return;
        }
        java.lang.String str = this.isConnected;
        if (str != null) {
            setErrorText(str);
        }
        this.AuCTel = true;
    }

    private final void EZpvd(OKEditText.OKEditTextCursorStyle oKEditTextCursorStyle) {
        if (oKEditTextCursorStyle == OKEditText.OKEditTextCursorStyle.WEB3) {
            setCursorStyleWeb3();
        }
    }

    public final void DbNXlk() {
        C54958xar c54958xar = this.fetchVPNInfo;
        c54958xar.AEQbTJ.removeAllViews();
        c54958xar.copydefault.removeAllViews();
        c54958xar.EZpvd.removeAllViews();
        c54958xar.OLrzqt.removeAllViews();
    }

    public final void setViewEnable(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof android.view.ViewGroup) {
                    setViewEnable(viewGroup.getChildAt(i), z);
                } else {
                    childAt.setEnabled(z);
                }
            }
        }
    }

    public final void setContentLayerBackground(int i, int i2) {
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.DbNXlk(i);
        c55279xgu.isConnected(i2);
        c55279xgu.fIwbmz((int) this.AhwBna.gGvvIC());
        c55279xgu.OLrzqt(this.AhwBna.aKErDB());
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        c55280xgv.KWHzl(linearLayout, c55279xgu);
    }

    /* JADX INFO: renamed from: o.xbo$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xbo.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
