package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import androidx.core.content.res.ResourcesCompat;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.akB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7452akB extends android.view.View {
    public final java.util.List<Application> AEQbTJ;
    public TaskDescription AYXKKw;
    public final NumberFormat AhwBna;
    public final java.util.List<StateListAnimator> AkhnZx;
    public boolean AuCTel;
    public java.util.List<Activity> DbNXlk;
    public int EZpvd;
    public final float[][] KWHzl;
    public final float[][] OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Float djBIcL;
    public final java.util.List<Application> fIwbmz;
    public float fetchVPNInfo;
    public final java.util.List<Application> gEmmrt;
    public int isConnected;
    public int valueOf;
    public final android.graphics.Paint values;

    /* JADX INFO: renamed from: o.akB$TaskDescription */
    public interface TaskDescription {
        void KWHzl(int i, @NotNull ActionBar actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7452akB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7452akB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectedListener(TaskDescription taskDescription) {
        this.AYXKKw = taskDescription;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:37) call: o.akB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C7452akB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7452akB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C55298xhM.copydefault(1.6f, context);
        this.values = new android.graphics.Paint(1);
        this.AkhnZx = new java.util.ArrayList();
        this.fIwbmz = new java.util.ArrayList();
        this.AEQbTJ = new java.util.ArrayList();
        this.gEmmrt = new java.util.ArrayList();
        this.isConnected = -1;
        this.fetchVPNInfo = C55298xhM.EZpvd(8.0f, context);
        this.djBIcL = java.lang.Float.valueOf(0.0f);
        this.valueOf = 6;
        this.OLrzqt = new float[][]{new float[]{0.495f}, new float[]{0.495f, 0.5f}, new float[]{0.324f, 0.5f, 0.5f}, new float[]{0.324f, 0.322f, 0.5f, 0.481f}, new float[]{0.242f, 0.4f, 0.3f, 0.5f, 0.484f}};
        this.KWHzl = new float[][]{new float[]{0.804f}, new float[]{0.804f, 0.757f}, new float[]{0.56f, 0.693f, 0.619f}, new float[]{0.55f, 0.52f, 0.52f, 0.55f}, new float[]{0.39f, 0.48f, 0.48f, 0.52f, 0.5f}};
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        this.AhwBna = numberFormat;
        this.DbNXlk = yDY.AhwBna();
        this.AuCTel = true;
    }

    private final android.text.TextPaint AhwBna() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTextSize(C55298xhM.gEmmrt(16.0f, context));
        textPaint.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.EZpvd));
        return textPaint;
    }

    private final android.text.TextPaint EZpvd() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setTextSize(C55298xhM.gEmmrt(12.0f, context));
        textPaint.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl));
        return textPaint;
    }

    public final android.text.TextPaint OLrzqt(int i, int i2) {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setColor(i2);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(OLrzqt(i));
        textPaint.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.AEQbTJ));
        return textPaint;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (this.AuCTel) {
            super.onDraw(canvas);
            AEQbTJ(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.AuCTel) {
            copydefault();
            KWHzl();
            AEQbTJ();
            OLrzqt();
        }
    }

    public static /* synthetic */ void setData$default(C7452akB c7452akB, java.util.List list, C7461akK c7461akK, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            c7461akK = null;
        }
        c7452akB.setData(list, c7461akK);
    }

    public final void setData(@NotNull java.util.List<C7458akH> list, C7461akK c7461akK) {
        Intrinsics.checkNotNullParameter(list, "");
        this.djBIcL = c7461akK != null ? java.lang.Float.valueOf(c7461akK.OLrzqt()) : this.djBIcL;
        this.valueOf = c7461akK != null ? c7461akK.AEQbTJ() : this.valueOf;
        this.EZpvd = (c7461akK != null ? java.lang.Float.valueOf(c7461akK.KWHzl()) : java.lang.Integer.valueOf(this.EZpvd)).intValue();
        this.fetchVPNInfo = c7461akK != null ? c7461akK.EZpvd() : this.fetchVPNInfo;
        this.isConnected = -1;
        this.DbNXlk = AEQbTJ(list);
        copydefault();
        KWHzl();
        AEQbTJ();
        OLrzqt();
        invalidate();
    }

    /* JADX INFO: renamed from: o.akB$LoaderManager */
    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((C7458akH) t2).OLrzqt()), java.lang.Double.valueOf(((C7458akH) t).OLrzqt()));
        }
    }

    public final void KWHzl() {
        this.fIwbmz.clear();
        int i = 0;
        for (StateListAnimator stateListAnimator : this.AkhnZx) {
            float f = stateListAnimator.OLrzqt().left;
            float f2 = this.EZpvd;
            float f3 = stateListAnimator.OLrzqt().top;
            float f4 = this.EZpvd;
            double dWidth = stateListAnimator.OLrzqt().width();
            java.lang.String strAEQbTJ = this.copydefault;
            if (!(!(strAEQbTJ == null || strAEQbTJ.length() == 0))) {
                strAEQbTJ = null;
            }
            if (strAEQbTJ == null) {
                strAEQbTJ = this.DbNXlk.get(i).AEQbTJ();
            }
            android.text.TextPaint textPaintAhwBna = AhwBna();
            textPaintAhwBna.setTextSize(EZpvd(i));
            textPaintAhwBna.setColor(this.DbNXlk.get(i).copydefault().get(0).AhwBna());
            java.lang.String strSubstring = strAEQbTJ;
            while (true) {
                if (strSubstring.length() > 0) {
                    java.lang.String str = strSubstring;
                    android.text.TextPaint textPaint = textPaintAhwBna;
                    double d = dWidth;
                    kotlin.Pair<java.lang.Boolean, java.lang.Float> pairEZpvd = EZpvd(this, dWidth, strSubstring, false, textPaint, this.fetchVPNInfo);
                    boolean zBooleanValue = pairEZpvd.component1().booleanValue();
                    float fFloatValue = pairEZpvd.component2().floatValue();
                    if (zBooleanValue) {
                        textPaint.setTextSize(fFloatValue);
                        float fDescent = (textPaint.descent() - textPaint.ascent()) / 2;
                        float f5 = this.fetchVPNInfo;
                        this.fIwbmz.add(new Application(str + "", f + f2 + this.fetchVPNInfo, f3 + f4 + fDescent + f5, textPaint, EZpvd(textPaint, str)));
                        break;
                    }
                    textPaint.setTextSize(fFloatValue);
                    strSubstring = str.substring(0, str.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    textPaintAhwBna = textPaint;
                    dWidth = d;
                }
            }
            i++;
        }
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Float> EZpvd(C7452akB c7452akB, double d, java.lang.String str, boolean z, android.graphics.Paint paint, float f) {
        if (z) {
            str = str + "...";
        }
        float f2 = f * 2;
        if (d > paint.measureText(str, 0, str.length()) + f2) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
        }
        do {
            float textSize = paint.getTextSize();
            android.content.Context context = c7452akB.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (textSize > C55298xhM.gEmmrt(10.0f, context)) {
                float textSize2 = paint.getTextSize();
                android.content.Context context2 = c7452akB.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setTextSize(textSize2 - C55298xhM.gEmmrt(1.0f, context2));
            } else {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                android.content.Context context3 = c7452akB.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new kotlin.Pair<>(bool, java.lang.Float.valueOf(C55298xhM.gEmmrt(10.0f, context3)));
            }
        } while (d <= paint.measureText(str, 0, str.length()) + f2);
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
    }

    public final int EZpvd(android.text.TextPaint textPaint, java.lang.String str) {
        android.graphics.Rect rect = new android.graphics.Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        return rect.bottom - rect.top;
    }

    public final float EZpvd(int i) {
        if (KWHzl(i) > 0.2f) {
            return C55298xhM.sp2pxFloat$default(16.0f, null, 1, null);
        }
        return C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
    }

    public final float OLrzqt(int i) {
        float fKWHzl = KWHzl(i);
        if (fKWHzl > 0.35f) {
            return C55298xhM.sp2pxFloat$default(20.0f, null, 1, null);
        }
        if (fKWHzl > 0.2f) {
            return C55298xhM.sp2pxFloat$default(16.0f, null, 1, null);
        }
        if (fKWHzl > 0.15f) {
            return C55298xhM.sp2pxFloat$default(14.0f, null, 1, null);
        }
        return C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
    }

    public final float copydefault(int i) {
        if (KWHzl(i) > 0.15f) {
            return C55298xhM.sp2pxFloat$default(12.0f, null, 1, null);
        }
        return C55298xhM.sp2pxFloat$default(10.0f, null, 1, null);
    }

    public final float KWHzl(int i) {
        StateListAnimator stateListAnimator = this.AkhnZx.get(i);
        return ((stateListAnimator.OLrzqt().right - stateListAnimator.OLrzqt().left) * (stateListAnimator.OLrzqt().bottom - stateListAnimator.OLrzqt().top)) / (getWidth() * getHeight());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fe, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ() {
        int i;
        java.lang.String str;
        boolean zBooleanValue;
        float fFloatValue;
        this.AEQbTJ.clear();
        int i2 = 0;
        int i3 = 0;
        for (StateListAnimator stateListAnimator : this.AkhnZx) {
            float f = stateListAnimator.OLrzqt().left;
            float f2 = this.EZpvd;
            float f3 = stateListAnimator.OLrzqt().bottom;
            float f4 = this.EZpvd;
            double dWidth = stateListAnimator.OLrzqt().width();
            java.lang.String strOLrzqt = this.DbNXlk.get(i3).OLrzqt();
            android.text.TextPaint textPaintEZpvd = EZpvd();
            textPaintEZpvd.setTextSize(copydefault(i3));
            textPaintEZpvd.setColor(this.DbNXlk.get(i3).copydefault().get(i2).AhwBna());
            java.lang.String strSubstring = strOLrzqt;
            int i4 = i2;
            while (true) {
                if (i4 != 0) {
                    if (strSubstring.length() <= 1) {
                        break;
                    }
                    str = strSubstring;
                    double d = dWidth;
                    kotlin.Pair<java.lang.Boolean, java.lang.Float> pairOLrzqt = OLrzqt(this, dWidth, strSubstring, i4, textPaintEZpvd, this.fetchVPNInfo);
                    zBooleanValue = pairOLrzqt.component1().booleanValue();
                    fFloatValue = pairOLrzqt.component2().floatValue();
                    if (!zBooleanValue && KWHzl(i3) > 0.08f) {
                        textPaintEZpvd.setTextSize(fFloatValue);
                        java.util.List<Application> list = this.AEQbTJ;
                        java.lang.String str2 = str + (i4 != 0 ? "..." : "");
                        float f5 = this.fetchVPNInfo;
                        list.add(new Application(str2, f + f2 + f5, (f3 - f4) - f5, textPaintEZpvd, EZpvd(textPaintEZpvd, str)));
                        i = 0;
                    } else {
                        android.text.TextPaint textPaint = textPaintEZpvd;
                        textPaint.setTextSize(fFloatValue);
                        strSubstring = str.substring(0, str.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        textPaintEZpvd = textPaint;
                        i2 = 0;
                        i4 = 1;
                        dWidth = d;
                    }
                } else {
                    if (strSubstring.length() <= 0) {
                        break;
                    }
                    str = strSubstring;
                    double d2 = dWidth;
                    kotlin.Pair<java.lang.Boolean, java.lang.Float> pairOLrzqt2 = OLrzqt(this, dWidth, strSubstring, i4, textPaintEZpvd, this.fetchVPNInfo);
                    zBooleanValue = pairOLrzqt2.component1().booleanValue();
                    fFloatValue = pairOLrzqt2.component2().floatValue();
                    if (!zBooleanValue) {
                    }
                    android.text.TextPaint textPaint2 = textPaintEZpvd;
                    textPaint2.setTextSize(fFloatValue);
                    strSubstring = str.substring(0, str.length() - 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    textPaintEZpvd = textPaint2;
                    i2 = 0;
                    i4 = 1;
                    dWidth = d2;
                }
            }
            i3++;
            i2 = i;
        }
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Float> OLrzqt(C7452akB c7452akB, double d, java.lang.String str, boolean z, android.graphics.Paint paint, float f) {
        if (z) {
            str = str + "...";
        }
        float f2 = f * 2;
        if (d >= paint.measureText(str, 0, str.length()) + f2) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
        }
        do {
            float textSize = paint.getTextSize();
            android.content.Context context = c7452akB.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (textSize > C55298xhM.gEmmrt(10.0f, context)) {
                float textSize2 = paint.getTextSize();
                android.content.Context context2 = c7452akB.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setTextSize(textSize2 - C55298xhM.gEmmrt(1.0f, context2));
            } else {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                android.content.Context context3 = c7452akB.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new kotlin.Pair<>(bool, java.lang.Float.valueOf(C55298xhM.gEmmrt(10.0f, context3)));
            }
        } while (d < paint.measureText(str, 0, str.length()) + f2);
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102 A[LOOP:1: B:9:0x0097->B:22:0x0102, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        java.util.Iterator it;
        int i;
        boolean zBooleanValue;
        this.gEmmrt.clear();
        java.util.Iterator it2 = this.AkhnZx.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it2.hasNext()) {
            StateListAnimator stateListAnimator = (StateListAnimator) it2.next();
            float f = stateListAnimator.OLrzqt().left;
            float f2 = this.EZpvd;
            float fEZpvd = (stateListAnimator.OLrzqt().bottom - this.EZpvd) - this.fetchVPNInfo;
            if (i3 < this.AEQbTJ.size()) {
                float fCopydefault = this.AEQbTJ.get(i3).copydefault();
                float fOLrzqt = this.AEQbTJ.get(i3).OLrzqt();
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                fEZpvd = (fCopydefault - fOLrzqt) - C55298xhM.EZpvd(3.0f, context);
            }
            float f3 = fEZpvd;
            double dWidth = stateListAnimator.OLrzqt().width();
            java.lang.String strKWHzl = this.DbNXlk.get(i3).KWHzl();
            android.text.TextPaint textPaintOLrzqt = OLrzqt(i3, this.DbNXlk.get(i3).copydefault().get(i2).AhwBna());
            java.lang.String strSubstring = strKWHzl;
            int i4 = i2;
            while (true) {
                if (i4 != 0) {
                    if (strSubstring.length() <= 1) {
                        break;
                    }
                    java.lang.String str = strSubstring;
                    it = it2;
                    android.text.TextPaint textPaint = textPaintOLrzqt;
                    kotlin.Pair<java.lang.Boolean, java.lang.Float> pairCopydefault = copydefault(this, dWidth, strSubstring, i4, textPaintOLrzqt, this.fetchVPNInfo);
                    zBooleanValue = pairCopydefault.component1().booleanValue();
                    float fFloatValue = pairCopydefault.component2().floatValue();
                    if (!zBooleanValue) {
                        textPaint.setTextSize(fFloatValue);
                        this.gEmmrt.add(new Application(str + (i4 != 0 ? "..." : ""), this.fetchVPNInfo + f + f2, f3, textPaint, EZpvd(textPaint, str)));
                        i = 0;
                    } else {
                        textPaint.setTextSize(fFloatValue);
                        strSubstring = str.substring(0, str.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        i2 = 0;
                        textPaintOLrzqt = textPaint;
                        i4 = 1;
                        it2 = it;
                    }
                } else {
                    if (strSubstring.length() <= 0) {
                        break;
                    }
                    java.lang.String str2 = strSubstring;
                    it = it2;
                    android.text.TextPaint textPaint2 = textPaintOLrzqt;
                    kotlin.Pair<java.lang.Boolean, java.lang.Float> pairCopydefault2 = copydefault(this, dWidth, strSubstring, i4, textPaintOLrzqt, this.fetchVPNInfo);
                    zBooleanValue = pairCopydefault2.component1().booleanValue();
                    float fFloatValue2 = pairCopydefault2.component2().floatValue();
                    if (!zBooleanValue) {
                    }
                }
            }
            it = it2;
            i = i2;
            i3++;
            i2 = i;
            it2 = it;
        }
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Float> copydefault(C7452akB c7452akB, double d, java.lang.String str, boolean z, android.graphics.Paint paint, float f) {
        if (z) {
            str = str + "...";
        }
        float f2 = f * 2;
        if (d >= paint.measureText(str, 0, str.length()) + f2) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
        }
        do {
            float textSize = paint.getTextSize();
            android.content.Context context = c7452akB.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (textSize > C55298xhM.gEmmrt(10.0f, context)) {
                float textSize2 = paint.getTextSize();
                android.content.Context context2 = c7452akB.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setTextSize(textSize2 - C55298xhM.gEmmrt(1.0f, context2));
            } else {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                android.content.Context context3 = c7452akB.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new kotlin.Pair<>(bool, java.lang.Float.valueOf(C55298xhM.gEmmrt(10.0f, context3)));
            }
        } while (d < paint.measureText(str, 0, str.length()) + f2);
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
    }

    public final java.util.List<Activity> AEQbTJ(java.util.List<C7458akH> list) {
        java.util.Iterator<T> it = list.iterator();
        double dOLrzqt = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dOLrzqt += ((C7458akH) it.next()).OLrzqt();
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new LoaderManager());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add((C7458akH) obj);
            i++;
        }
        arrayList.addAll(arrayList2);
        java.util.List<C7458akH> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, this.valueOf);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (C7458akH c7458akH : listAhwBna) {
            arrayList3.add(new Activity(c7458akH.AEQbTJ(), c7458akH.EZpvd(), c7458akH.copydefault(), (c7458akH.OLrzqt() / dOLrzqt) * ((double) 100), C56402yEa.EZpvd(c7458akH)));
        }
        return arrayList3;
    }

    public final void copydefault() {
        RectF rectF;
        RectF rectF2;
        RectF rectF3 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        this.AkhnZx.clear();
        double dEZpvd = 100.0d;
        int i = 0;
        for (Activity activity : this.DbNXlk) {
            int i2 = i + 1;
            if (i2 >= this.DbNXlk.size() || i == 5) {
                this.AkhnZx.add(new StateListAnimator(rectF3, this.DbNXlk.get(i).copydefault().get(0).KWHzl()));
            } else {
                float fEZpvd = EZpvd((float) (this.DbNXlk.get(i).EZpvd() / dEZpvd), i);
                if (i % 2 == 0) {
                    float f = rectF3.left;
                    rectF = new RectF(f, rectF3.top, (fEZpvd * rectF3.width()) + f, rectF3.bottom);
                    rectF2 = new RectF(rectF3.left + rectF.width(), rectF3.top, rectF3.right, rectF3.bottom);
                } else {
                    float f2 = rectF3.left;
                    float f3 = rectF3.top;
                    rectF = new RectF(f2, f3, rectF3.right, (fEZpvd * rectF3.height()) + f3);
                    rectF2 = new RectF(rectF3.left, rectF3.top + rectF.height(), rectF3.right, rectF3.bottom);
                }
                this.AkhnZx.add(new StateListAnimator(rectF, this.DbNXlk.get(i).copydefault().get(0).KWHzl()));
                dEZpvd -= activity.EZpvd();
                rectF3 = rectF2;
            }
            i = i2;
        }
    }

    public final float EZpvd(float f, int i) {
        int iEZpvd = C56548yJl.EZpvd(this.DbNXlk.size() - 2, 0, this.KWHzl.length - 1);
        return C56548yJl.KWHzl(f, this.OLrzqt[iEZpvd][i], this.KWHzl[iEZpvd][i]);
    }

    public final void KWHzl(android.graphics.Canvas canvas, RectF rectF, int i, int i2) {
        android.graphics.Path path = new android.graphics.Path();
        java.lang.Float f = this.djBIcL;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        java.lang.Float f2 = this.djBIcL;
        path.addRoundRect(rectF, fFloatValue, f2 != null ? f2.floatValue() : 0.0f, Path.Direction.CW);
        android.graphics.Paint paint = this.values;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        Unit unit = Unit.INSTANCE;
        canvas.drawPath(path, paint);
        android.graphics.Paint paint2 = this.values;
        setLayerType(1, null);
        paint2.setColor(0);
        paint2.setStrokeWidth(this.EZpvd);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        canvas.drawPath(path, paint2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Integer numValueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            java.util.Iterator<StateListAnimator> it = this.AkhnZx.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().OLrzqt().contains(x, y)) {
                    break;
                }
                i++;
            }
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            java.lang.Integer num = numValueOf2.intValue() != -1 ? numValueOf2 : null;
            if (num == null) {
                return super.onTouchEvent(motionEvent);
            }
            djBIcL(num.intValue());
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void djBIcL(int i) {
        ActionBar actionBarAEQbTJ = AEQbTJ(i);
        if (actionBarAEQbTJ == null) {
            return;
        }
        this.isConnected = i;
        TaskDescription taskDescription = this.AYXKKw;
        if (taskDescription != null) {
            taskDescription.KWHzl(i, actionBarAEQbTJ);
        }
    }

    public final ActionBar AEQbTJ(int i) {
        if (i == -1) {
            return null;
        }
        Activity activity = this.DbNXlk.get(i);
        return new ActionBar(activity.AEQbTJ(), activity.KWHzl(), activity.copydefault());
    }

    /* JADX INFO: renamed from: o.akB$StateListAnimator */
    public static final class StateListAnimator {
        public final RectF EZpvd;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, RectF rectF, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                rectF = stateListAnimator.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(rectF, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull RectF rectF, int i) {
            Intrinsics.checkNotNullParameter(rectF, "");
            return new StateListAnimator(rectF, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RectF OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && this.OLrzqt == stateListAnimator.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DrawRectData(rect=" + this.EZpvd + ", paintColor=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@NotNull RectF rectF, int i) {
            Intrinsics.checkNotNullParameter(rectF, "");
            this.EZpvd = rectF;
            this.OLrzqt = i;
        }
    }

    /* JADX INFO: renamed from: o.akB$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final double KWHzl;
        public final java.lang.String OLrzqt;
        public final java.util.List<C7458akH> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.akB$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, double d, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            java.lang.String str4 = str2;
            if ((i & 4) != 0) {
                str3 = activity.OLrzqt;
            }
            java.lang.String str5 = str3;
            if ((i & 8) != 0) {
                d = activity.KWHzl;
            }
            double d2 = d;
            if ((i & 16) != 0) {
                list = activity.copydefault;
            }
            return activity.EZpvd(str, str4, str5, d2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, double d, @NotNull java.util.List<C7458akH> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(str, str2, str3, d, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C7458akH> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && java.lang.Double.compare(this.KWHzl, activity.KWHzl) == 0 && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.AEQbTJ.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Double.hashCode(this.KWHzl)) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RectData(name=" + this.AEQbTJ + ", price=" + this.EZpvd + ", changePercent=" + this.OLrzqt + ", areaProportion=" + this.KWHzl + ", treeMapData=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, double d, @NotNull java.util.List<C7458akH> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.KWHzl = d;
            this.copydefault = list;
        }
    }

    /* JADX INFO: renamed from: o.akB$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public final float AEQbTJ;
        public final java.lang.String EZpvd;
        public final android.graphics.Paint KWHzl;
        public final float OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, float f, float f2, android.graphics.Paint paint, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i2 & 2) != 0) {
                f = application.AEQbTJ;
            }
            float f3 = f;
            if ((i2 & 4) != 0) {
                f2 = application.OLrzqt;
            }
            float f4 = f2;
            if ((i2 & 8) != 0) {
                paint = application.KWHzl;
            }
            android.graphics.Paint paint2 = paint;
            if ((i2 & 16) != 0) {
                i = application.copydefault;
            }
            return application.copydefault(str, f3, f4, paint2, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.Paint EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str, float f, float f2, @NotNull android.graphics.Paint paint, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(paint, "");
            return new Application(str, f, f2, paint, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && java.lang.Float.compare(this.AEQbTJ, application.AEQbTJ) == 0 && java.lang.Float.compare(this.OLrzqt, application.OLrzqt) == 0 && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && this.copydefault == application.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((this.EZpvd.hashCode() * 31) + java.lang.Float.hashCode(this.AEQbTJ)) * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Integer.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextData(text=" + this.EZpvd + ", xPos=" + this.AEQbTJ + ", yPos=" + this.OLrzqt + ", textPaint=" + this.KWHzl + ", textHeight=" + this.copydefault + ")";
        }

        public Application(@NotNull java.lang.String str, float f, float f2, @NotNull android.graphics.Paint paint, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(paint, "");
            this.EZpvd = str;
            this.AEQbTJ = f;
            this.OLrzqt = f2;
            this.KWHzl = paint;
            this.copydefault = i;
        }
    }

    /* JADX INFO: renamed from: o.akB$ActionBar */
    public static final class ActionBar {
        public final java.util.List<C7458akH> AEQbTJ;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.akB$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            if ((i & 4) != 0) {
                list = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C7458akH> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C7458akH> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectedData(name=" + this.OLrzqt + ", percentValue=" + this.copydefault + ", data=" + this.AEQbTJ + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C7458akH> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = str;
            this.copydefault = str2;
            this.AEQbTJ = list;
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas) {
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : this.AkhnZx) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            KWHzl(canvas, stateListAnimator.OLrzqt(), i2, stateListAnimator.copydefault());
            i2++;
        }
        int i3 = 0;
        for (java.lang.Object obj2 : this.fIwbmz) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            Application application = (Application) obj2;
            canvas.drawText(application.KWHzl(), application.AEQbTJ(), application.copydefault(), application.EZpvd());
            i3++;
        }
        for (java.lang.Object obj3 : this.AEQbTJ) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Application application2 = (Application) obj3;
            canvas.drawText(application2.KWHzl(), application2.AEQbTJ(), application2.copydefault(), application2.EZpvd());
            i++;
        }
        for (Application application3 : this.gEmmrt) {
            canvas.drawText(application3.KWHzl(), application3.AEQbTJ(), application3.copydefault(), application3.EZpvd());
        }
    }
}
