package o;

import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xiy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55389xiy extends AppCompatImageView {
    public final android.graphics.Paint AEQbTJ;
    public android.graphics.drawable.Drawable AYXKKw;
    public final float AhwBna;
    public final java.util.Map<java.lang.String, android.graphics.drawable.Drawable> AkhnZx;
    public final float DbNXlk;
    public final android.graphics.Paint EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public int copydefault;
    public final int djBIcL;
    public final java.util.List<java.lang.Object> fetchVPNInfo;
    public final float gEmmrt;
    public float isConnected;
    public java.lang.Object valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55389xiy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55389xiy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private final void copydefault(android.graphics.Canvas canvas) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.xiy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55389xiy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55389xiy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.EZpvd = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        this.AEQbTJ = paint2;
        this.fetchVPNInfo = new java.util.ArrayList();
        float f = context.getResources().getDisplayMetrics().density * 32.0f;
        this.DbNXlk = f;
        this.AhwBna = context.getResources().getDisplayMetrics().density * 16.0f;
        this.djBIcL = C55298xhM.OLrzqt(4, context);
        this.isConnected = f;
        this.gEmmrt = 0.375f;
        this.AkhnZx = new LinkedHashMap();
        this.OLrzqt = C55298xhM.AEQbTJ(1, context);
        this.KWHzl = C55298xhM.OLrzqt(0.5f, context);
        this.copydefault = ContextCompat.getColor(context, C52761wXj.Activity.wlaJM);
    }

    public final void setTokens(@NotNull java.lang.Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.fetchVPNInfo.clear();
        C56406yEe.KWHzl(this.fetchVPNInfo, objArr);
        EZpvd();
    }

    public final void setChain(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.valueOf = obj;
        AEQbTJ();
    }

    public final void setTokenSize(float f) {
        this.isConnected = f;
        requestLayout();
    }

    public final void setOverlapOffset(float f) {
        this.values = f;
        requestLayout();
    }

    public final void setBorderSize(float f) {
        this.OLrzqt = f;
        invalidate();
    }

    public final void setChainBorderSize(float f) {
        this.KWHzl = f;
        invalidate();
    }

    public final void setBorderColor(@androidx.annotation.ColorInt int i) {
        this.copydefault = i;
        invalidate();
    }

    private final void EZpvd() {
        this.AkhnZx.clear();
        final int i = 0;
        for (java.lang.Object obj : this.fetchVPNInfo) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            copydefault(obj, new Function1() { // from class: o.xix
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C55389xiy.EZpvd(this.OLrzqt, i, (android.graphics.drawable.Drawable) obj2);
                }
            });
            i++;
        }
    }

    public static final Unit EZpvd(C55389xiy c55389xiy, int i, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        c55389xiy.AkhnZx.put("token_" + i, drawable);
        int i2 = (int) c55389xiy.isConnected;
        drawable.setBounds(0, 0, i2, i2);
        c55389xiy.invalidate();
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        java.lang.Object obj = this.valueOf;
        if (obj != null) {
            copydefault(obj, new Function1() { // from class: o.xiw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C55389xiy.EZpvd(this.EZpvd, (android.graphics.drawable.Drawable) obj2);
                }
            });
        } else {
            this.AYXKKw = null;
            invalidate();
        }
    }

    public static final Unit EZpvd(C55389xiy c55389xiy, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "");
        c55389xiy.AYXKKw = drawable;
        int i = (int) c55389xiy.AhwBna;
        drawable.setBounds(0, 0, i, i);
        c55389xiy.invalidate();
        return Unit.INSTANCE;
    }

    private final void copydefault(java.lang.Object obj, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        if (obj instanceof java.lang.String) {
            Glide.AEQbTJ(getContext()).EZpvd((java.lang.String) obj).OLrzqt(new StateListAnimator(function1));
            return;
        }
        if (obj instanceof java.lang.Integer) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), ((java.lang.Number) obj).intValue());
            if (drawable != null) {
                function1.invoke(drawable);
                return;
            }
            return;
        }
        if (obj instanceof android.graphics.drawable.Drawable) {
            function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.xiy$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> AEQbTJ;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.AEQbTJ.invoke(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.fetchVPNInfo.isEmpty() && this.valueOf == null) {
            return;
        }
        if (this.values == 0.0f) {
            this.values = this.isConnected * this.gEmmrt;
        }
        int i3 = this.valueOf != null ? this.djBIcL : 0;
        if (this.fetchVPNInfo.isEmpty()) {
            setMeasuredDimension(getMeasuredWidth() + i3, getMeasuredHeight() + i3);
        } else {
            float f = i3;
            setMeasuredDimension(yII.EZpvd(this.isConnected + (this.values * (this.fetchVPNInfo.size() - 1)) + f), yII.EZpvd(this.isConnected + f));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        int size = this.fetchVPNInfo.size();
        for (int i = 0; i < size; i++) {
            int iSave = canvas.save();
            if (getLayoutDirection() == 1) {
                canvas.translate(getWidth() - (this.isConnected + (this.values * i)), 0.0f);
            } else {
                canvas.translate(this.values * i, 0.0f);
            }
            android.graphics.drawable.Drawable drawable = this.AkhnZx.get("token_" + i);
            if (drawable != null) {
                drawable.draw(canvas);
                EZpvd(canvas, this.OLrzqt, this.copydefault, this.isConnected / 2.0f, this.EZpvd);
            } else {
                copydefault(canvas);
            }
            canvas.restoreToCount(iSave);
        }
        android.graphics.drawable.Drawable drawable2 = this.AYXKKw;
        if (drawable2 != null) {
            int iSave2 = canvas.save();
            if (drawable2.getLayoutDirection() == 1) {
                canvas.translate(0.0f, getHeight() - this.AhwBna);
            } else {
                canvas.translate(getWidth() - this.AhwBna, getHeight() - this.AhwBna);
            }
            drawable2.draw(canvas);
            EZpvd(canvas, this.KWHzl, this.copydefault, this.AhwBna / 2.0f, this.AEQbTJ);
            canvas.restoreToCount(iSave2);
        }
    }

    private final void EZpvd(android.graphics.Canvas canvas, float f, int i, float f2, android.graphics.Paint paint) {
        if (f > 0.0f) {
            paint.setStrokeWidth(f);
            paint.setColor(i);
            canvas.drawCircle(f2, f2, f2 - (f / 2.0f), paint);
        }
    }
}
