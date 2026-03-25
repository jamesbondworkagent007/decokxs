package o;

import android.graphics.Color;
import android.graphics.Paint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49946uyD extends android.view.View {
    public int AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public android.graphics.Paint AkhnZx;
    public float DbNXlk;
    public int EZpvd;
    public float KWHzl;
    public java.lang.String OLrzqt;
    public float copydefault;
    public int djBIcL;
    public float fetchVPNInfo;
    public int gEmmrt;
    public int isConnected;
    public float valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49946uyD(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49946uyD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHighLevelColor(@androidx.annotation.ColorInt int i) {
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLowLevelColor(@androidx.annotation.ColorInt int i) {
        this.djBIcL = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: o.uyD.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C49946uyD(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49946uyD(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.isConnected = 5;
        this.OLrzqt = "";
        this.AhwBna = 2.0f;
        this.copydefault = 8.0f;
        this.valueOf = 2.0f;
        this.AEQbTJ = Color.parseColor("#EDF0F7");
        this.EZpvd = Color.parseColor("#004CFF");
        this.djBIcL = context.getColor(C52761wXj.Activity.DcMfJK);
        this.gEmmrt = context.getColor(C52761wXj.Activity.gdmIOq);
        this.AYXKKw = context.getColor(C52761wXj.Activity.DQzvGN);
        this.AkhnZx = new android.graphics.Paint();
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C49511upt.Fragment.EZpvd, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                this.isConnected = typedArrayObtainStyledAttributes.getInteger(C49511upt.Fragment.values, this.isConnected);
                java.lang.String string = typedArrayObtainStyledAttributes.getString(C49511upt.Fragment.OLrzqt);
                this.OLrzqt = string == null ? this.OLrzqt : string;
                this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C49511upt.Fragment.KWHzl, this.AEQbTJ);
                this.EZpvd = typedArrayObtainStyledAttributes.getColor(C49511upt.Fragment.copydefault, this.EZpvd);
                this.AhwBna = typedArrayObtainStyledAttributes.getDimension(C49511upt.Fragment.gEmmrt, this.AhwBna);
                this.copydefault = typedArrayObtainStyledAttributes.getDimension(C49511upt.Fragment.AEQbTJ, this.copydefault);
                float dimension = typedArrayObtainStyledAttributes.getDimension(C49511upt.Fragment.AhwBna, this.valueOf);
                this.valueOf = dimension;
                this.DbNXlk = (this.isConnected * (this.AhwBna + dimension)) - dimension;
                this.djBIcL = typedArrayObtainStyledAttributes.getColor(C49511upt.Fragment.valueOf, this.EZpvd);
                this.gEmmrt = typedArrayObtainStyledAttributes.getColor(C49511upt.Fragment.djBIcL, this.EZpvd);
                this.AYXKKw = typedArrayObtainStyledAttributes.getColor(C49511upt.Fragment.AYXKKw, this.EZpvd);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        OLrzqt();
    }

    public final void OLrzqt() {
        this.AkhnZx.setAntiAlias(true);
        this.AkhnZx.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.OLrzqt.length() > 0) {
            float f = 2;
            this.KWHzl = (getWidth() - this.DbNXlk) / f;
            this.values = (getHeight() - this.copydefault) / f;
            int i = this.isConnected;
            for (int i2 = 0; i2 < i; i2++) {
                if (i2 < C33129mqd.AhwBna(this.OLrzqt)) {
                    if (C33129mqd.valueOf(this.OLrzqt, 2)) {
                        this.AkhnZx.setColor(this.djBIcL);
                    } else if (C33129mqd.valueOf(this.OLrzqt, 3)) {
                        this.AkhnZx.setColor(this.gEmmrt);
                    } else {
                        this.AkhnZx.setColor(this.AYXKKw);
                    }
                } else {
                    this.AkhnZx.setColor(this.AEQbTJ);
                }
                float f2 = this.KWHzl;
                float f3 = this.AhwBna;
                float f4 = f2 + (i2 * (this.valueOf + f3));
                this.fetchVPNInfo = f4;
                float f5 = this.values;
                canvas.drawRect(f4, f5, f4 + f3, f5 + this.copydefault, this.AkhnZx);
            }
        }
    }

    public final void setCurrentLevel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        invalidate();
    }
}
