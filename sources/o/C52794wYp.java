package o;

import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.SimpleColorFilter;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wYp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C52794wYp extends C55281xgw implements InterfaceC55066xct {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int DbNXlk = 8;
    public final int AkhnZx;
    public int AuCTel;
    public boolean AuCTelauCTel;
    public LottieDrawable AubY;
    public float AwvSrB;
    public int AxsJAY;
    public java.lang.CharSequence ORxRYg;
    public boolean OcIXYQ;
    public final C52801wYw ejfBZ;
    public java.lang.Integer fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public int fJNWhG;
    public final int fetchVPNInfo;
    public float gHZMYf;
    public boolean getFieldNames;
    public float getNewProxyInstance;
    public android.os.Handler hDKMBd;
    public int isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public final C55060xcn sSMYrx;
    public boolean uzCIH;
    public float values;
    public float wlaJM;
    public float zLjUOn;
    public java.lang.Runnable zsXlph;
    public float zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52794wYp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52794wYp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C52801wYw fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setButtonSize$OKUILib_uilib(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomTextSize$OKUILib_uilib(float f) {
        this.getNewProxyInstance = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftBottomRadius$OKUILib_uilib(float f) {
        this.wlaJM = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftTopRadius$OKUILib_uilib(float f) {
        this.zLjUOn = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoading(boolean z) {
        this.AuCTelauCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightBottomRadius$OKUILib_uilib(float f) {
        this.zuBGHE = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightTopRadius$OKUILib_uilib(float f) {
        this.AwvSrB = f;
    }

    public final void setStyleStability(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.ActionBar.dUDNAs int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:79) call: o.wYp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52794wYp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.ActionBar.dUDNAs : i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wXm.Application.loadFromAttributes$default(o.wXm, android.util.AttributeSet, int, int, int, java.lang.Object):void */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52794wYp(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C52801wYw c52801wYw = new C52801wYw(this);
        this.ejfBZ = c52801wYw;
        this.AuCTel = -1;
        C55060xcn c55060xcn = new C55060xcn(this);
        this.sSMYrx = c55060xcn;
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.wYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52794wYp.djBIcL();
            }
        });
        this.fetchVPNInfo = C55298xhM.djBIcL(12.0f, context);
        this.AkhnZx = C55298xhM.djBIcL(2.0f, context);
        this.hDKMBd = new android.os.Handler(android.os.Looper.getMainLooper());
        this.uzCIH = true;
        this.isConnected = 17;
        this.zsXlph = new java.lang.Runnable() { // from class: o.wYy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C52794wYp.OLrzqt(this.EZpvd, context);
            }
        };
        this.OcIXYQ = true;
        c52801wYw.OLrzqt(attributeSet, i, C52761wXj.LoaderManager.RcXXUw);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.hCLrkq, i, C52761wXj.LoaderManager.RcXXUw);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.fJNWhG = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.RSDDiY, 0);
        this.AuCTel = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.DQzvGNdrmXxudrmXxu, -1);
        int integer = typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.RIuxYh, -2);
        typedArrayObtainStyledAttributes.recycle();
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55060xcn, attributeSet, i, 0, 4, null);
        if (!c52801wYw.OLrzqt() || integer != -2) {
            c55060xcn.OLrzqt(-1);
        }
        resize$default(this, 0.0f, 1, null);
        setEllipsize(TextUtils.TruncateAt.END);
        setGravity(17);
        setShouldTintImageWithTextColor(true);
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.wYv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52794wYp.gEmmrt();
            }
        });
    }

    /* JADX INFO: renamed from: o.wYp$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wYp.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final android.graphics.Rect AEQbTJ() {
        return (android.graphics.Rect) this.iwGUEr.getValue();
    }

    public static final android.graphics.Rect djBIcL() {
        return new android.graphics.Rect();
    }

    public static final void OLrzqt(C52794wYp c52794wYp, android.content.Context context) {
        LottieDrawable lottieDrawable;
        android.graphics.Rect rectKWHzl = c52794wYp.KWHzl();
        if (rectKWHzl != null && (lottieDrawable = c52794wYp.AubY) != null) {
            lottieDrawable.setBounds(rectKWHzl);
        }
        android.graphics.drawable.Drawable[] drawableArr = new android.graphics.drawable.Drawable[4];
        drawableArr[c52794wYp.ejfBZ.ejfBZ()] = c52794wYp.AubY;
        c52794wYp.setCompoundDrawablesRelative(drawableArr[0], drawableArr[1], drawableArr[2], drawableArr[3]);
        c52794wYp.setCompoundDrawablePadding(android.text.TextUtils.isEmpty(c52794wYp.getText()) ? 0 : C55298xhM.OLrzqt(8, context));
        LottieDrawable lottieDrawable2 = c52794wYp.AubY;
        if (lottieDrawable2 != null) {
            lottieDrawable2.start();
        }
    }

    public final void setShouldTintImageWithTextColor(boolean z) {
        this.OcIXYQ = z;
        if (getCompoundDrawablesRelative()[0] != null) {
            getCompoundDrawablesRelative()[0].setTintList(z ? getTextColors() : null);
        }
        if (getCompoundDrawables()[0] != null) {
            getCompoundDrawables()[0].setTintList(z ? getTextColors() : null);
        }
    }

    public final void setOKDSType(int i) {
        this.fJNWhG = i;
        AuCTel();
        invalidate();
    }

    public static /* synthetic */ void startLoading$default(C52794wYp c52794wYp, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoading");
        }
        if ((i & 1) != 0) {
            j = 500;
        }
        c52794wYp.OLrzqt(j);
    }

    public final void OLrzqt(long j) {
        setClickable(false);
        int i = this.fJNWhG;
        if ((i & 256) > 0) {
            setSelected(true);
        } else if (i == 80) {
            C55280xgv newProxyInstance = getNewProxyInstance();
            C55279xgu c55279xguFARcdN = fARcdN();
            c55279xguFARcdN.copydefault(false);
            c55279xguFARcdN.isConnected(this.AxsJAY);
            Unit unit = Unit.INSTANCE;
            newProxyInstance.KWHzl(this, c55279xguFARcdN);
            fARcdN().copydefault(true);
        }
        if (this.AuCTelauCTel) {
            return;
        }
        this.AuCTelauCTel = true;
        AEQbTJ(j);
        this.ORxRYg = getContentDescription();
        setContentDescription("buttonLoadingView");
    }

    public final void fIwbmz() {
        this.hDKMBd.removeCallbacks(this.zsXlph);
        this.AuCTelauCTel = false;
        setClickable(true);
        if (this.AubY != null) {
            this.getFieldNames = true;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        if ((this.fJNWhG & 256) > 0) {
            setSelected(false);
        } else {
            setBackgroundColor();
        }
        LottieDrawable lottieDrawable = this.AubY;
        if (lottieDrawable != null) {
            lottieDrawable.stop();
        }
        setContentDescription(this.ORxRYg);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd().add(function1);
    }

    public static /* synthetic */ void setButtonCornerRadius$default(C52794wYp c52794wYp, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setButtonCornerRadius");
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        c52794wYp.setButtonCornerRadius(f);
    }

    public final void setButtonCornerRadius(float f) {
        this.gHZMYf = f;
        AuCTel();
        invalidate();
    }

    public final void setButtonGravity(int i) {
        this.isConnected = i;
        setGravity(i);
    }

    public static /* synthetic */ void resize$default(C52794wYp c52794wYp, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resize");
        }
        if ((i & 1) != 0) {
            f = -1.0f;
        }
        c52794wYp.EZpvd(f);
    }

    public void EZpvd(float f) {
        if (f == -1.0f) {
            f = EZpvd(isConnected());
        }
        this.gHZMYf = f;
        AuCTel();
        setButtonSize$OKUILib_uilib(true);
    }

    public void setOKDSPill(int i) {
        this.sSMYrx.OLrzqt(i);
        float fEZpvd = EZpvd(i);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.gHZMYf = C55298xhM.OLrzqt(fEZpvd, context);
        invalidate();
    }

    public int isConnected() {
        return this.sSMYrx.OLrzqt();
    }

    public void setOKDSSize(int i) {
        this.AuCTel = i;
        resize$default(this, 0.0f, 1, null);
        requestLayout();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hDKMBd.removeCallbacks(this.zsXlph);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        android.content.Context context;
        int i3;
        if (AkhnZx() == -1) {
            super.onMeasure(i, i2);
            return;
        }
        C52770wXs c52770wXsDbNXlk = DbNXlk();
        if (c52770wXsDbNXlk != null) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c52770wXsDbNXlk.EZpvd(), 1073741824);
            super.onMeasure(i, iMakeMeasureSpec);
            if (getLineCount() > 1 && getMaxLines() > 1) {
                float f = this.values;
                if (f > this.fetchVPNInfo) {
                    float f2 = f - this.AkhnZx;
                    this.values = f2;
                    setTextSize(0, f2);
                    measure(i, iMakeMeasureSpec);
                }
            }
            if (AkhnZx() == 32) {
                if (getLineCount() == 2) {
                    context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    i3 = 12;
                } else {
                    context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    i3 = 14;
                }
                TextViewCompat.setLineHeight(this, C55298xhM.OLrzqt(i3, context));
            }
            java.lang.CharSequence text = getText();
            if (text != null) {
                android.graphics.drawable.Drawable drawable = getCompoundDrawables()[0];
                if (drawable == null) {
                    intrinsicWidth = 0;
                } else if (drawable.getBounds().width() != 0) {
                    intrinsicWidth = drawable.getBounds().width();
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                }
                android.graphics.drawable.Drawable drawable2 = getCompoundDrawables()[2];
                if (drawable2 == null) {
                    intrinsicWidth2 = 0;
                } else if (drawable2.getBounds().width() != 0) {
                    intrinsicWidth2 = drawable2.getBounds().width();
                } else {
                    intrinsicWidth2 = drawable2.getIntrinsicWidth();
                }
                this.uzCIH = ((((getPaint().measureText(text.toString()) + ((float) getPaddingStart())) + ((float) getPaddingEnd())) + ((float) getCompoundDrawablePadding())) + ((float) intrinsicWidth)) + ((float) intrinsicWidth2) < ((float) getMeasuredWidth());
                return;
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void dispatchSetSelected(boolean z) {
        super.dispatchSetSelected(z);
        java.util.Iterator<T> it = EZpvd().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(java.lang.Boolean.valueOf(z));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.uzCIH && getLineCount() == 1 && ((i = this.isConnected) == 17 || i == 1)) {
            C55292xhG.EZpvd.KWHzl(this, canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        C52770wXs c52770wXsDbNXlk = DbNXlk();
        if (c52770wXsDbNXlk != null) {
            setPaddingRelative(c52770wXsDbNXlk.OLrzqt().left, c52770wXsDbNXlk.OLrzqt().top, c52770wXsDbNXlk.OLrzqt().right, c52770wXsDbNXlk.OLrzqt().bottom);
        }
        post(new java.lang.Runnable() { // from class: o.wYu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C52794wYp.EZpvd(this.EZpvd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(C52794wYp c52794wYp) {
        int i;
        C52770wXs c52770wXsDbNXlk = c52794wYp.DbNXlk();
        if (c52770wXsDbNXlk != null) {
            float f = c52794wYp.getNewProxyInstance;
            if (f != 0.0f) {
                c52770wXsDbNXlk.KWHzl(f);
            }
            c52794wYp.values = c52770wXsDbNXlk.valueOf();
            c52794wYp.setTextSize(0, c52770wXsDbNXlk.valueOf());
            if (c52794wYp.AkhnZx() >= 32) {
                i = 2;
            } else {
                c52794wYp.valueOf();
                i = 1;
            }
            c52794wYp.setMaxLines(i);
        }
    }

    public void valueOf() {
        if (this.fetchVPNInfo < yII.EZpvd(this.values)) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, this.fetchVPNInfo, yII.EZpvd(this.values), this.AkhnZx, 0);
        }
    }

    public static /* synthetic */ void setButtonSize$OKUILib_uilib$default(C52794wYp c52794wYp, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setButtonSize");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        c52794wYp.setButtonSize$OKUILib_uilib(z);
    }

    public void setButtonSize$OKUILib_uilib(boolean z) {
        int i;
        C52770wXs c52770wXsDbNXlk = DbNXlk();
        if (c52770wXsDbNXlk != null) {
            if (z) {
                TextViewCompat.setTextAppearance(this, c52770wXsDbNXlk.KWHzl());
                setPaddingRelative(c52770wXsDbNXlk.OLrzqt().left, c52770wXsDbNXlk.OLrzqt().top, c52770wXsDbNXlk.OLrzqt().right, c52770wXsDbNXlk.OLrzqt().bottom);
            }
            float f = this.getNewProxyInstance;
            if (f != 0.0f) {
                c52770wXsDbNXlk.KWHzl(f);
            }
            this.values = c52770wXsDbNXlk.valueOf();
            setTextSize(0, c52770wXsDbNXlk.valueOf());
            if (AkhnZx() >= 32) {
                i = 2;
            } else {
                valueOf();
                i = 1;
            }
            setMaxLines(i);
        }
    }

    public final void setLoadingRes$OKUILib_uilib(@androidx.annotation.RawRes int i) {
        this.fARcdN = java.lang.Integer.valueOf(i);
    }

    public C52770wXs DbNXlk() {
        int iAkhnZx = AkhnZx();
        if (iAkhnZx == 24) {
            return this.ejfBZ.accept();
        }
        if (iAkhnZx == 28) {
            return this.ejfBZ.DAIeex();
        }
        if (iAkhnZx == 32) {
            return this.ejfBZ.djSkpj();
        }
        if (iAkhnZx == 36) {
            return this.ejfBZ.AuCTel();
        }
        if (iAkhnZx == 40 || iAkhnZx == 44) {
            return this.ejfBZ.fJNWhG();
        }
        if (iAkhnZx == 48) {
            return this.ejfBZ.gEmmrt();
        }
        if (iAkhnZx == 52) {
            return this.ejfBZ.RlQdEF();
        }
        if (iAkhnZx != 56) {
            return null;
        }
        return this.ejfBZ.AhwBna();
    }

    public final float EZpvd(int i) {
        C52770wXs c52770wXsDbNXlk;
        if (i == -1) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C55298xhM.AEQbTJ(60, context);
        }
        if (i == 0 || (c52770wXsDbNXlk = DbNXlk()) == null) {
            return 0.0f;
        }
        return c52770wXsDbNXlk.AEQbTJ();
    }

    public final void AuCTel() {
        C55279xgu c55279xguFARcdN = fARcdN();
        c55279xguFARcdN.zuBGHE();
        c55279xguFARcdN.OLrzqt(this.gHZMYf);
        c55279xguFARcdN.AEQbTJ(this.zLjUOn);
        c55279xguFARcdN.KWHzl(this.AwvSrB);
        c55279xguFARcdN.copydefault(this.wlaJM);
        c55279xguFARcdN.EZpvd(this.zuBGHE);
        c55279xguFARcdN.copydefault(true);
        int i = this.fJNWhG;
        if (i == 5) {
            C55279xgu c55279xguFARcdN2 = fARcdN();
            c55279xguFARcdN2.AhwBna(this.ejfBZ.QOLQEE());
            c55279xguFARcdN2.valueOf(this.ejfBZ.QKVWgx());
            c55279xguFARcdN2.AYXKKw(this.ejfBZ.QVAiDq());
            this.AxsJAY = c55279xguFARcdN2.fARcdN();
            setTextColor(this.ejfBZ.QUSxYX());
        } else if (i == 6) {
            C55279xgu c55279xguFARcdN3 = fARcdN();
            c55279xguFARcdN3.AhwBna(0);
            c55279xguFARcdN3.valueOf(0);
            c55279xguFARcdN3.AYXKKw(0);
            this.AxsJAY = c55279xguFARcdN3.fARcdN();
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.gFTCsA));
        } else if (i == 34) {
            C55279xgu c55279xguFARcdN4 = fARcdN();
            c55279xguFARcdN4.AhwBna(0);
            c55279xguFARcdN4.valueOf(0);
            c55279xguFARcdN4.KWHzl(this.ejfBZ.gHZMYf());
            c55279xguFARcdN4.fIwbmz(this.ejfBZ.AwvSrB());
            c55279xguFARcdN4.AYXKKw(this.ejfBZ.zLjUOn());
            this.AxsJAY = c55279xguFARcdN4.fARcdN();
            setTextColor(this.ejfBZ.sSMYrx());
        } else if (i == 66) {
            C55279xgu c55279xguFARcdN5 = fARcdN();
            c55279xguFARcdN5.AhwBna(0);
            c55279xguFARcdN5.valueOf(0);
            int i2 = C52761wXj.ActionBar.DBxZfM;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55279xguFARcdN5.AYXKKw(C55366xib.KWHzl(i2, context));
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.HJWChPOZOJIj));
        } else if (i == 80) {
            C55279xgu c55279xguFARcdN6 = fARcdN();
            c55279xguFARcdN6.AhwBna(this.ejfBZ.copydefault());
            c55279xguFARcdN6.valueOf(this.ejfBZ.KWHzl());
            c55279xguFARcdN6.AYXKKw(this.ejfBZ.AEQbTJ());
            this.AxsJAY = c55279xguFARcdN6.fARcdN();
            setTextColor(this.ejfBZ.EZpvd());
        } else if (i == 275) {
            C55279xgu c55279xguFARcdN7 = fARcdN();
            c55279xguFARcdN7.AhwBna(ContextCompat.getColor(getContext(), C52761wXj.Activity.sCB));
            c55279xguFARcdN7.valueOf(ContextCompat.getColor(getContext(), C52761wXj.Activity.sCB));
            c55279xguFARcdN7.AYXKKw(ContextCompat.getColor(getContext(), C52761wXj.Activity.stopBehavioSecDataCollection));
            this.AxsJAY = c55279xguFARcdN7.fARcdN();
            setTextColor(ContextCompat.getColorStateList(getContext(), C52761wXj.Activity.XW));
        } else if (i == 49) {
            C55279xgu c55279xguFARcdN8 = fARcdN();
            c55279xguFARcdN8.AhwBna(this.ejfBZ.iZzfmt());
            c55279xguFARcdN8.valueOf(this.ejfBZ.hUfVAv());
            c55279xguFARcdN8.AYXKKw(this.ejfBZ.QKudOq());
            this.AxsJAY = c55279xguFARcdN8.fARcdN();
            setTextColor(this.ejfBZ.AxsJAYsNCnLh());
        } else if (i != 50) {
            switch (i) {
                case 257:
                    C55279xgu c55279xguFARcdN9 = fARcdN();
                    c55279xguFARcdN9.AhwBna(this.ejfBZ.QbewEr());
                    c55279xguFARcdN9.valueOf(this.ejfBZ.RJOkX());
                    c55279xguFARcdN9.AYXKKw(this.ejfBZ.aKErDB());
                    c55279xguFARcdN9.djBIcL(c55279xguFARcdN9.fARcdN());
                    setTextColor(this.ejfBZ.dNCPSb());
                    break;
                case 258:
                    C55279xgu c55279xguFARcdN10 = fARcdN();
                    c55279xguFARcdN10.AhwBna(this.ejfBZ.finit());
                    c55279xguFARcdN10.valueOf(this.ejfBZ.UeEOUB());
                    c55279xguFARcdN10.AYXKKw(this.ejfBZ.dvKsVJ());
                    c55279xguFARcdN10.djBIcL(c55279xguFARcdN10.fARcdN());
                    setTextColor(this.ejfBZ.fZBcTu());
                    break;
                case 259:
                    C55279xgu c55279xguFARcdN11 = fARcdN();
                    c55279xguFARcdN11.AhwBna(this.ejfBZ.AuCTelauCTel());
                    c55279xguFARcdN11.valueOf(this.ejfBZ.AubY());
                    c55279xguFARcdN11.AYXKKw(this.ejfBZ.wlaJM());
                    c55279xguFARcdN11.djBIcL(c55279xguFARcdN11.fARcdN());
                    setTextColor(this.ejfBZ.zsXlph());
                    break;
                case 260:
                    C55279xgu c55279xguFARcdN12 = fARcdN();
                    c55279xguFARcdN12.AhwBna(this.ejfBZ.gGvvIC());
                    c55279xguFARcdN12.valueOf(this.ejfBZ.gasjUx());
                    c55279xguFARcdN12.AYXKKw(this.ejfBZ.flVtFt());
                    c55279xguFARcdN12.djBIcL(c55279xguFARcdN12.fARcdN());
                    setTextColor(this.ejfBZ.fvQaOB());
                    break;
                case 261:
                    C55279xgu c55279xguFARcdN13 = fARcdN();
                    c55279xguFARcdN13.AhwBna(this.ejfBZ.OcIXYQ());
                    c55279xguFARcdN13.valueOf(this.ejfBZ.zuBGHE());
                    c55279xguFARcdN13.AYXKKw(this.ejfBZ.ORxRYg());
                    c55279xguFARcdN13.djBIcL(c55279xguFARcdN13.fARcdN());
                    setTextColor(this.ejfBZ.DTwDnp());
                    break;
                case 262:
                    C55279xgu c55279xguFARcdN14 = fARcdN();
                    c55279xguFARcdN14.AhwBna(this.ejfBZ.getFieldNames());
                    c55279xguFARcdN14.valueOf(this.ejfBZ.iwGUEr());
                    c55279xguFARcdN14.AYXKKw(this.ejfBZ.uzCIH());
                    c55279xguFARcdN14.djBIcL(c55279xguFARcdN14.fARcdN());
                    setTextColor(this.ejfBZ.hDKMBd());
                    break;
                case 263:
                    C55279xgu c55279xguFARcdN15 = fARcdN();
                    c55279xguFARcdN15.AhwBna(this.ejfBZ.AYXKKw());
                    c55279xguFARcdN15.valueOf(this.ejfBZ.valueOf());
                    c55279xguFARcdN15.AYXKKw(this.ejfBZ.values());
                    c55279xguFARcdN15.djBIcL(c55279xguFARcdN15.fARcdN());
                    setTextColor(this.ejfBZ.isConnected());
                    break;
                case 264:
                    C55279xgu c55279xguFARcdN16 = fARcdN();
                    c55279xguFARcdN16.AhwBna(this.ejfBZ.DbNXlk());
                    c55279xguFARcdN16.valueOf(this.ejfBZ.fetchVPNInfo());
                    c55279xguFARcdN16.AYXKKw(this.ejfBZ.AkhnZx());
                    c55279xguFARcdN16.djBIcL(c55279xguFARcdN16.fARcdN());
                    setTextColor(this.ejfBZ.fIwbmz());
                    break;
            }
        } else {
            C55279xgu c55279xguFARcdN17 = fARcdN();
            c55279xguFARcdN17.AhwBna(this.ejfBZ.gkJEwt());
            c55279xguFARcdN17.valueOf(this.ejfBZ.giSNqX());
            c55279xguFARcdN17.AYXKKw(this.ejfBZ.AxsJAYaxsJAY());
            this.AxsJAY = c55279xguFARcdN17.fARcdN();
            setTextColor(this.ejfBZ.iRxXKY());
        }
        setBackgroundColor();
    }

    public final void AEQbTJ(final long j) {
        if (this.AubY == null) {
            final long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            final LottieDrawable lottieDrawable = new LottieDrawable();
            LottieCompositionFactory.fromRawRes(getContext(), OLrzqt()).addListener(new LottieListener() { // from class: o.wYx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    C52794wYp.copydefault(lottieDrawable, this, j, jCurrentTimeMillis, (LottieComposition) obj);
                }
            });
            this.AubY = lottieDrawable;
            return;
        }
        EZpvd(j);
    }

    public static final void copydefault(LottieDrawable lottieDrawable, C52794wYp c52794wYp, long j, long j2, LottieComposition lottieComposition) {
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setRepeatCount(-1);
        if (c52794wYp.ejfBZ.fARcdN()) {
            lottieDrawable.addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, (LottieValueCallback<ColorFilter>) new LottieValueCallback(new SimpleColorFilter(c52794wYp.getTextColors().getDefaultColor())));
        }
        if (c52794wYp.getFieldNames) {
            c52794wYp.getFieldNames = false;
        } else {
            c52794wYp.AubY = lottieDrawable;
            c52794wYp.EZpvd(C56548yJl.AEQbTJ(j - (java.lang.System.currentTimeMillis() - j2), j));
        }
    }

    private final void EZpvd(long j) {
        android.os.Handler handler = this.hDKMBd;
        handler.removeCallbacks(this.zsXlph);
        handler.postDelayed(this.zsXlph, j);
    }

    private final android.graphics.Rect KWHzl() {
        int iCopydefault;
        C52770wXs c52770wXsDbNXlk = DbNXlk();
        if (c52770wXsDbNXlk == null || (iCopydefault = c52770wXsDbNXlk.copydefault()) < 0) {
            return null;
        }
        android.graphics.Rect rectAEQbTJ = AEQbTJ();
        rectAEQbTJ.set(0, 0, iCopydefault, iCopydefault);
        return rectAEQbTJ;
    }

    private final int OLrzqt() {
        java.lang.Integer num = this.fARcdN;
        if (num != null) {
            return num.intValue();
        }
        int i = this.fJNWhG;
        if (i == 5) {
            return this.ejfBZ.RcXXUw();
        }
        if (i == 6) {
            return C52761wXj.PendingIntent.zLjUOn;
        }
        if (i != 34 && i != 66) {
            if (i == 80) {
                return this.ejfBZ.QfsBiF();
            }
            if (i != 275) {
                if (i != 49) {
                    if (i != 50) {
                        switch (i) {
                            case 257:
                            case 259:
                                return this.ejfBZ.QfsBiF();
                            case 258:
                                return this.ejfBZ.AxsJAY();
                            case 260:
                                return this.ejfBZ.fFgQHt();
                            case 261:
                                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                                if (c33512mxp.AhwBna().invoke().intValue() == 0) {
                                    return this.ejfBZ.RcXXUw();
                                }
                                if (c33512mxp.AkhnZx().invoke().intValue() == 1) {
                                    return this.ejfBZ.getNewProxyInstance();
                                }
                                return this.ejfBZ.AxsJAY();
                            case 262:
                                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                                if (c33512mxp2.AhwBna().invoke().intValue() == 0) {
                                    return this.ejfBZ.RcXXUw();
                                }
                                if (c33512mxp2.AkhnZx().invoke().intValue() == 1) {
                                    return this.ejfBZ.AxsJAY();
                                }
                                return this.ejfBZ.getNewProxyInstance();
                            case 263:
                                return this.ejfBZ.RcXXUw();
                            case 264:
                                return this.ejfBZ.djBIcL();
                            default:
                                return C52761wXj.PendingIntent.zLjUOn;
                        }
                    }
                }
            }
            return this.ejfBZ.dxcTrN();
        }
        return this.ejfBZ.fFgQHt();
    }

    private final java.util.ArrayList<Function1<java.lang.Boolean, Unit>> EZpvd() {
        return (java.util.ArrayList) this.fIwbmz.getValue();
    }

    public static final java.util.ArrayList gEmmrt() {
        return new java.util.ArrayList();
    }

    public final void setBackgroundColor() {
        if (this.fJNWhG != 0) {
            getNewProxyInstance().KWHzl(this, fARcdN());
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null && !(drawable instanceof LottieDrawable)) {
            if (this.OcIXYQ) {
                drawable.setTintList(getTextColors());
            } else {
                drawable.setTintList(null);
            }
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        if (drawable != null && !(drawable instanceof LottieDrawable)) {
            if (this.OcIXYQ) {
                drawable.setTintList(getTextColors());
            } else {
                drawable.setTintList(null);
            }
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }
}
