package o;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.internal.view.SupportMenu;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.npj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35142npj extends android.view.View {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public java.lang.String AhwBna;
    public float AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public int EZpvd;
    public android.graphics.Path KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public int djBIcL;
    public int ejfBZ;
    public java.lang.String fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public boolean fJNWhG;
    public int fetchVPNInfo;
    public int gEmmrt;
    public boolean getNewProxyInstance;
    public int hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public float iwGUEr;
    public final InterfaceC56387yDm valueOf;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35142npj(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35142npj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeftTextColor(int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatio(float f) {
        this.AkhnZx = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightTextColor(int i) {
        this.AuCTel = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.npj.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35142npj(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35142npj(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.npr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35142npj.copydefault(this.copydefault);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.npo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35142npj.OLrzqt(this.AEQbTJ);
            }
        });
        this.gEmmrt = -16711936;
        this.ejfBZ = SupportMenu.CATEGORY_MASK;
        this.djBIcL = C55296xhK.OLrzqt(context) ? C33512mxp.tradeFall$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33512mxp.tradeRise$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        this.AuCTel = C55296xhK.OLrzqt(context) ? C33512mxp.tradeRise$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33512mxp.tradeFall$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null);
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.npp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35142npj.AEQbTJ();
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.npn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35142npj.copydefault();
            }
        });
        this.fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.npq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35142npj.AhwBna();
            }
        });
        this.AhwBna = "";
        this.fARcdN = "";
        this.getNewProxyInstance = true;
        OLrzqt(attributeSet);
    }

    public static final Application copydefault(C35142npj c35142npj) {
        return c35142npj.KWHzl(c35142npj.EZpvd);
    }

    private final Application gEmmrt() {
        return (Application) this.OLrzqt.getValue();
    }

    public static final Application OLrzqt(C35142npj c35142npj) {
        return c35142npj.KWHzl(c35142npj.fetchVPNInfo);
    }

    private final Application valueOf() {
        return (Application) this.isConnected.getValue();
    }

    public final void setLeftColor(int i) {
        this.gEmmrt = i;
        gEmmrt().KWHzl(java.lang.Integer.valueOf(i));
        invalidate();
    }

    public final void setRightColor(int i) {
        this.ejfBZ = i;
        valueOf().KWHzl(java.lang.Integer.valueOf(i));
        invalidate();
    }

    public static final android.graphics.Paint AEQbTJ() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setAntiAlias(true);
        paint.setTypeface(C55051xce.OLrzqt.valueOf());
        return paint;
    }

    private final android.graphics.Paint djBIcL() {
        return (android.graphics.Paint) this.AYXKKw.getValue();
    }

    private final android.graphics.Rect AYXKKw() {
        return (android.graphics.Rect) this.valueOf.getValue();
    }

    public static final android.graphics.Rect copydefault() {
        return new android.graphics.Rect();
    }

    public static final android.graphics.Rect AhwBna() {
        return new android.graphics.Rect();
    }

    private final android.graphics.Rect values() {
        return (android.graphics.Rect) this.fIwbmz.getValue();
    }

    private final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
        if (z) {
            android.content.Context context = getContext();
            if (context != null && C55296xhK.OLrzqt(context)) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                setLeftColor(C33512mxp.tradeFallGraph$default(c33512mxp, context2, 0.0f, 2, null));
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                setRightColor(C33512mxp.tradeRiseGraph$default(c33512mxp, context3, 0.0f, 2, null));
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                this.djBIcL = C33512mxp.tradeFall$default(c33512mxp, context4, 0.0f, 2, null);
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                this.AuCTel = C33512mxp.tradeRise$default(c33512mxp, context5, 0.0f, 2, null);
                return;
            }
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            setLeftColor(C33512mxp.tradeRiseGraph$default(c33512mxp2, context6, 0.0f, 2, null));
            android.content.Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            setRightColor(C33512mxp.tradeFallGraph$default(c33512mxp2, context7, 0.0f, 2, null));
            android.content.Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            this.djBIcL = C33512mxp.tradeRise$default(c33512mxp2, context8, 0.0f, 2, null);
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            this.AuCTel = C33512mxp.tradeFall$default(c33512mxp2, context9, 0.0f, 2, null);
        }
    }

    public final void setLeftText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
        invalidate();
    }

    public final void setRightText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN = str;
        invalidate();
    }

    public final void setShowText(boolean z) {
        this.getNewProxyInstance = z;
        requestLayout();
    }

    public final void setRoundedCorner(boolean z) {
        this.fJNWhG = z;
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingTop;
        int i3;
        int size;
        int size2 = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            if (this.getNewProxyInstance) {
                paddingTop = getPaddingTop() + getPaddingBottom() + this.values + this.hDKMBd;
                i3 = (int) this.iwGUEr;
            } else {
                paddingTop = getPaddingTop() + getPaddingBottom();
                i3 = this.values;
            }
            size = paddingTop + i3;
        }
        setMeasuredDimension(size2, size);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setBoundsInternal();
    }

    public final void setBoundsInternal() {
        int i = this.values;
        int width = getWidth();
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int i2 = this.DbNXlk;
        int paddingStart2 = getPaddingStart();
        int paddingStart3 = getPaddingStart();
        float f = ((width - paddingStart) - paddingEnd) - i2;
        float f2 = this.AkhnZx;
        int i3 = paddingStart3 + ((int) (f * f2));
        int i4 = this.DbNXlk + i3;
        int i5 = ((int) (f * (1 - f2))) + i4;
        AYXKKw().set(paddingStart2, 0, i3, i);
        gEmmrt().KWHzl(paddingStart2, 0, i3, i);
        values().set(i4, 0, i5, i);
        valueOf().KWHzl(i4, 0, i5, i);
        if (!this.fJNWhG) {
            this.KWHzl = null;
            return;
        }
        android.graphics.Path path = this.KWHzl;
        if (path != null) {
            path.reset();
        } else {
            path = new android.graphics.Path();
        }
        this.KWHzl = path;
        float fHeight = AYXKKw().height() / 2.0f;
        android.graphics.Path path2 = this.KWHzl;
        if (path2 != null) {
            path2.addRoundRect(AYXKKw().left, AYXKKw().top, values().right, AYXKKw().bottom, fHeight, fHeight, Path.Direction.CW);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        int iSave = canvas.save();
        android.graphics.Path path = this.KWHzl;
        if (path != null) {
            canvas.clipPath(path);
        }
        gEmmrt().AEQbTJ(canvas);
        valueOf().AEQbTJ(canvas);
        canvas.restoreToCount(iSave);
        if (this.getNewProxyInstance) {
            copydefault(canvas, djBIcL(), this.AhwBna, AYXKKw().left, AYXKKw().top + (this.values * 2) + this.hDKMBd, this.djBIcL, Paint.Align.LEFT, this.iwGUEr);
            copydefault(canvas, djBIcL(), this.fARcdN, values().right, values().top + (this.values * 2) + this.hDKMBd, this.AuCTel, Paint.Align.RIGHT, this.iwGUEr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0008 A[PHI: r0
  0x0008: PHI (r0v4 int) = (r0v1 int), (r0v0 int) binds: [B:9:0x000d, B:5:0x0006] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPercentage(int i) {
        int i2 = 97;
        if (i <= 97 || i >= 100) {
            i2 = 3;
            if (i < 3 && i > 0) {
                i = i2;
            }
        }
        android.content.Context context = getContext();
        if (context != null) {
            C55296xhK.OLrzqt(context);
        }
        this.AkhnZx = i / 100.0f;
        requestLayout();
    }

    public final void OLrzqt(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qZH.Fragment.wlaJM);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setPercentage(typedArrayObtainStyledAttributes.getInteger(qZH.Fragment.AxsJAY, 50));
        this.EZpvd = typedArrayObtainStyledAttributes.getResourceId(qZH.Fragment.gHZMYf, qZH.Activity.AYXKKw);
        this.fetchVPNInfo = typedArrayObtainStyledAttributes.getResourceId(qZH.Fragment.gHZMYf, qZH.Activity.KWHzl);
        int i = qZH.Fragment.AuCTelauCTel;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.values = typedArrayObtainStyledAttributes.getDimensionPixelSize(i, C33052mpF.EZpvd(6.0f, context));
        this.DbNXlk = typedArrayObtainStyledAttributes.getDimensionPixelSize(qZH.Fragment.zLjUOn, 0);
        int i2 = qZH.Fragment.OcIXYQ;
        Intrinsics.checkNotNullExpressionValue(getContext(), "");
        this.iwGUEr = typedArrayObtainStyledAttributes.getDimensionPixelSize(i2, C33052mpF.AYXKKw(10.0f, r4));
        int i3 = qZH.Fragment.DTwDnp;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.hDKMBd = typedArrayObtainStyledAttributes.getDimensionPixelSize(i3, C33052mpF.EZpvd(6.0f, context2));
        java.lang.String string = typedArrayObtainStyledAttributes.getString(qZH.Fragment.sSMYrx);
        if (string == null) {
            string = "";
        }
        setLeftText(string);
        setLeftColor(typedArrayObtainStyledAttributes.getColor(qZH.Fragment.AwvSrB, ContextCompat.getColor(getContext(), android.R.color.black)));
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(qZH.Fragment.zuBGHE);
        setRightText(string2 != null ? string2 : "");
        setRightColor(typedArrayObtainStyledAttributes.getColor(qZH.Fragment.QKVWgx, ContextCompat.getColor(getContext(), android.R.color.black)));
        setShowText(typedArrayObtainStyledAttributes.getBoolean(qZH.Fragment.ORxRYg, true));
        setRoundedCorner(typedArrayObtainStyledAttributes.getBoolean(qZH.Fragment.QOLQEE, false));
        OLrzqt(typedArrayObtainStyledAttributes.getBoolean(qZH.Fragment.AubY, this.AEQbTJ));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Application KWHzl(@androidx.annotation.DrawableRes int i) {
        return new Application(ContextCompat.getDrawable(getContext(), i));
    }

    public final void copydefault(android.graphics.Canvas canvas, android.graphics.Paint paint, java.lang.String str, float f, float f2, @androidx.annotation.ColorInt int i, Paint.Align align, float f3) {
        paint.setColor(i);
        paint.setTextSize(f3);
        paint.setTextAlign(align);
        canvas.drawText(str, 0, str.length(), f, f2, paint);
    }

    /* JADX INFO: renamed from: o.npj$Application */
    public final class Application {
        public int AEQbTJ;
        public int EZpvd;
        public final android.graphics.drawable.Drawable KWHzl;
        public int OLrzqt;
        public ColorFilter copydefault;
        public int djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(int i, int i2, int i3, int i4) {
            this.EZpvd = i;
            this.djBIcL = i2;
            this.AEQbTJ = i3;
            this.OLrzqt = i4;
        }

        public Application(android.graphics.drawable.Drawable drawable) {
            this.KWHzl = drawable;
        }

        public final void KWHzl(java.lang.Integer num) {
            if (num != null) {
                ColorFilter colorFilterCreateBlendModeColorFilterCompat = BlendModeColorFilterCompat.createBlendModeColorFilterCompat(num.intValue(), BlendModeCompat.SRC_IN);
                this.copydefault = colorFilterCreateBlendModeColorFilterCompat;
                android.graphics.drawable.Drawable drawable = this.KWHzl;
                if (drawable != null) {
                    drawable.setColorFilter(colorFilterCreateBlendModeColorFilterCompat);
                }
                C35142npj.this.invalidate();
            }
        }

        public final void AEQbTJ(@NotNull android.graphics.Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            android.graphics.drawable.Drawable drawable = this.KWHzl;
            if (drawable == null) {
                C43296rmc.AEQbTJ("RatioBar", "drawable is null");
            } else {
                drawable.setBounds(this.EZpvd, this.djBIcL, this.AEQbTJ, this.OLrzqt);
                this.KWHzl.draw(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: o.npj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.npj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
