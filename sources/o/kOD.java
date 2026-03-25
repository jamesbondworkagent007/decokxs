package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kOD extends android.view.View {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final float AEQbTJ;
    public boolean AYXKKw;
    public int AhwBna;
    public float EZpvd;
    public final android.graphics.Paint OLrzqt;
    public int copydefault;
    public final android.graphics.Paint djBIcL;
    public java.lang.String gEmmrt;
    public float isConnected;
    public final RectF valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kOD(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = 16757015;
        this.EZpvd = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.gEmmrt = "Tag";
        this.AhwBna = -1;
        this.isConnected = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.djBIcL = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.OLrzqt = paint2;
        this.valueOf = new RectF();
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(20.0f, null, 1, null);
        paint.setAntiAlias(true);
        paint.setColor(this.AhwBna);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(this.isConnected);
        paint2.setAntiAlias(true);
        paint2.setColor(this.copydefault);
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kOD(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.copydefault = 16757015;
        this.EZpvd = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.gEmmrt = "Tag";
        this.AhwBna = -1;
        this.isConnected = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.djBIcL = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.OLrzqt = paint2;
        this.valueOf = new RectF();
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(20.0f, null, 1, null);
        paint.setAntiAlias(true);
        paint.setColor(this.AhwBna);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(this.isConnected);
        paint2.setAntiAlias(true);
        paint2.setColor(this.copydefault);
        paint2.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kOD(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        this.copydefault = 16757015;
        this.EZpvd = C55298xhM.dp2pxFloat$default(4.0f, null, 1, null);
        this.gEmmrt = "Tag";
        this.AhwBna = -1;
        this.isConnected = C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.djBIcL = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        this.OLrzqt = paint2;
        this.valueOf = new RectF();
        this.AEQbTJ = C55298xhM.dp2pxFloat$default(20.0f, null, 1, null);
        paint.setAntiAlias(true);
        paint.setColor(this.AhwBna);
        paint.setTextAlign(Paint.Align.LEFT);
        paint.setTextSize(this.isConnected);
        paint2.setAntiAlias(true);
        paint2.setColor(this.copydefault);
        paint2.setStyle(Paint.Style.FILL);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kOD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.graphics.Paint paint = this.djBIcL;
        if (paint != null) {
            java.lang.String str = this.gEmmrt;
            paint.getTextBounds(str, 0, str.length(), rect);
        }
        int iWidth = rect.width() + C55298xhM.dp2px$default(8.0f, null, 1, null);
        int iHeight = rect.height();
        int iDp2px$default = C55298xhM.dp2px$default(2.0f, null, 1, null);
        float f = 2;
        float measuredHeight = (getMeasuredHeight() - this.AEQbTJ) / f;
        float measuredWidth = this.AYXKKw ? (getMeasuredWidth() - iWidth) / 2 : 0.0f;
        this.valueOf.set(measuredWidth, measuredHeight, iWidth + measuredWidth, this.AEQbTJ + measuredHeight);
        RectF rectF = this.valueOf;
        float f2 = this.EZpvd;
        canvas.drawRoundRect(rectF, f2, f2, this.OLrzqt);
        canvas.drawText(this.gEmmrt, measuredWidth + C55298xhM.dp2px$default(4.0f, null, 1, null), measuredHeight + ((this.AEQbTJ + (iHeight - iDp2px$default)) / f), this.djBIcL);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTagStyle(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = z;
        switch (str.hashCode()) {
            case -349730414:
                if (str.equals("converted")) {
                    this.gEmmrt = C33070mpX.AYXKKw(qZH.PendingIntent.gCNefq);
                    this.djBIcL.setTypeface(C55051xce.OLrzqt.OLrzqt());
                    this.djBIcL.setColor(C33070mpX.copydefault(C52761wXj.Activity.ixgjPv));
                    this.OLrzqt.setColor(C33070mpX.copydefault(z ? C52761wXj.Activity.Swccd : C52761wXj.Activity.fkESqH));
                }
                break;
            case -318386323:
                if (str.equals("preopen")) {
                    android.content.Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    this.gEmmrt = C46656tbL.EZpvd(context, qZH.PendingIntent.getSerial);
                    this.djBIcL.setColor(C33070mpX.copydefault(C52761wXj.Activity.ixgjPv));
                    this.djBIcL.setTypeface(C55051xce.OLrzqt.OLrzqt());
                    this.OLrzqt.setColor(C33070mpX.copydefault(z ? C52761wXj.Activity.DarRvM : C52761wXj.Activity.QKudOq));
                }
                break;
            case 3322092:
                if (str.equals("live")) {
                }
                break;
            case 94756344:
                if (str.equals(EopTrackEvent.CLOSE)) {
                    android.content.Context context2 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    this.gEmmrt = C46656tbL.EZpvd(context2, qZH.PendingIntent.HJWChPRAkuRW);
                    this.djBIcL.setTypeface(C55051xce.OLrzqt.valueOf());
                    this.djBIcL.setColor(C33070mpX.copydefault(z ? C52761wXj.Activity.spnCvw : C52761wXj.Activity.Dmq));
                    this.OLrzqt.setColor(C33070mpX.copydefault(z ? C52761wXj.Activity.invokespecialaGOrKO : C52761wXj.Activity.invokespecialDPHOMC));
                }
                break;
        }
        invalidate();
    }

    public final void setTextColor(int i) {
        this.AhwBna = i;
        invalidate();
    }

    public final void setTextSize(float f) {
        this.isConnected = f;
        this.djBIcL.setTextSize(f);
        invalidate();
    }
}
