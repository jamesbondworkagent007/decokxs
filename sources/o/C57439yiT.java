package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.content.res.ResourcesCompat;
import java.text.NumberFormat;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.yiT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57439yiT extends android.view.View {
    public final java.util.List<Activity> AEQbTJ;
    public final NumberFormat AYXKKw;
    public java.util.List<ActionBar> AhwBna;
    public final float AkhnZx;
    public final java.util.List<Activity> DbNXlk;
    public java.lang.String EZpvd;
    public final int KWHzl;
    public final float[][] OLrzqt;
    public final float[][] copydefault;
    public Application djBIcL;
    public boolean fARcdN;
    public final float fetchVPNInfo;
    public Function1<? super java.lang.Double, java.lang.String> gEmmrt;
    public final java.util.List<RectF> isConnected;
    public final android.graphics.Paint valueOf;
    public int values;

    /* JADX INFO: renamed from: o.yiT$Application */
    public interface Application {
        void EZpvd();

        void KWHzl(int i, @NotNull StateListAnimator stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57439yiT(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C57439yiT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectedListener(Application application) {
        this.djBIcL = application;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:41) call: o.yiT.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C57439yiT(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57439yiT(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.copydefault));
        this.KWHzl = C55298xhM.copydefault(1.6f, context);
        this.valueOf = new android.graphics.Paint(1);
        this.isConnected = new java.util.ArrayList();
        this.DbNXlk = new java.util.ArrayList();
        this.AEQbTJ = new java.util.ArrayList();
        this.values = -1;
        this.fetchVPNInfo = C55298xhM.EZpvd(12.0f, context);
        this.AkhnZx = C55298xhM.EZpvd(4.0f, context);
        this.OLrzqt = new float[][]{new float[]{0.804f}, new float[]{0.804f, 0.757f}, new float[]{0.45f, 0.56f, 0.619f}, new float[]{0.35f, 0.45f, 0.52f, 0.55f}, new float[]{0.3f, 0.4f, 0.34f, 0.59f, 0.5f}};
        this.copydefault = new float[][]{new float[]{0.495f}, new float[]{0.495f, 0.5f}, new float[]{0.324f, 0.5f, 0.5f}, new float[]{0.324f, 0.322f, 0.5f, 0.495f}, new float[]{0.242f, 0.4f, 0.3f, 0.5f, 0.484f}};
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        this.AYXKKw = numberFormat;
        this.AhwBna = yDY.AhwBna();
        this.fARcdN = true;
    }

    private final android.text.TextPaint OLrzqt() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        int i = C52761wXj.ActionBar.RVsVBY;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setColor(C55366xib.KWHzl(i, context));
        textPaint.setAntiAlias(true);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textPaint.setTextSize(C55298xhM.gEmmrt(12.0f, context2));
        textPaint.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.KWHzl));
        return textPaint;
    }

    public final android.graphics.Paint AEQbTJ(int i) {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        int i2 = C52761wXj.ActionBar.RVsVBY;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textPaint.setColor(C55366xib.KWHzl(i2, context));
        textPaint.setAntiAlias(true);
        float f = new float[]{16.0f, 16.0f, 16.0f, 16.0f, 16.0f, 16.0f}[C56548yJl.EZpvd(i, 0, 5)];
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        textPaint.setTextSize(C55298xhM.gEmmrt(f, context2));
        textPaint.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.AEQbTJ));
        return textPaint;
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        if (!this.fARcdN || this.AhwBna.isEmpty()) {
            return;
        }
        super.onDraw(canvas);
        OLrzqt(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.fARcdN) {
            AEQbTJ();
            EZpvd();
            copydefault();
        }
    }

    /* JADX INFO: renamed from: o.yiT$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(((C57444yiY) t2).KWHzl()), java.lang.Double.valueOf(((C57444yiY) t).KWHzl()));
        }
    }

    public static /* synthetic */ void setData$default(C57439yiT c57439yiT, java.util.List list, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c57439yiT.setData(list, str, function1);
    }

    public final void setData(@NotNull java.util.List<C57444yiY> list, java.lang.String str, @NotNull Function1<? super java.lang.Double, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
        this.values = -1;
        java.util.List<ActionBar> listEZpvd = EZpvd(list);
        this.AhwBna = listEZpvd;
        if (listEZpvd.size() < 3) {
            setVisibility(8);
            this.fARcdN = false;
            return;
        }
        this.EZpvd = str;
        AEQbTJ();
        EZpvd();
        copydefault();
        invalidate();
    }

    public final void EZpvd() {
        this.DbNXlk.clear();
        int i = 0;
        for (RectF rectF : this.isConnected) {
            float f = rectF.left;
            float f2 = this.KWHzl;
            float f3 = rectF.top;
            double dWidth = rectF.width();
            java.lang.String strCopydefault = this.EZpvd;
            if (!(!(strCopydefault == null || strCopydefault.length() == 0))) {
                strCopydefault = null;
            }
            if (strCopydefault == null) {
                strCopydefault = this.AhwBna.get(i).copydefault();
            }
            android.graphics.Paint paintAEQbTJ = AEQbTJ(i);
            java.lang.String strSubstring = strCopydefault;
            while (true) {
                if (strSubstring.length() > 0) {
                    java.lang.String str = strSubstring;
                    android.graphics.Paint paint = paintAEQbTJ;
                    double d = dWidth;
                    kotlin.Pair<java.lang.Boolean, java.lang.Float> pairCopydefault = copydefault(this, dWidth, strSubstring, false, paint, this.fetchVPNInfo);
                    boolean zBooleanValue = pairCopydefault.component1().booleanValue();
                    float fFloatValue = pairCopydefault.component2().floatValue();
                    if (zBooleanValue) {
                        paint.setTextSize(fFloatValue);
                        float f4 = 2;
                        float fHeight = (((rectF.height() - this.KWHzl) - (this.fetchVPNInfo * f4)) - (f4 * (java.lang.Math.abs(paint.ascent()) + paint.descent()))) - this.AkhnZx;
                        float f5 = fHeight < 0.0f ? this.fetchVPNInfo + fHeight : this.fetchVPNInfo;
                        float f6 = f5 >= 0.0f ? f5 : 0.0f;
                        float fAbs = java.lang.Math.abs(paint.ascent());
                        this.DbNXlk.add(new Activity(str + "", f + f2 + this.fetchVPNInfo, f3 + f2 + fAbs + f6, paint));
                    } else {
                        paint.setTextSize(fFloatValue);
                        strSubstring = str.substring(0, str.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                        paintAEQbTJ = paint;
                        dWidth = d;
                    }
                }
            }
            i++;
        }
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Float> copydefault(C57439yiT c57439yiT, double d, java.lang.String str, boolean z, android.graphics.Paint paint, float f) {
        if (z) {
            str = str + "...";
        }
        float f2 = f * 2;
        if (d > paint.measureText(str, 0, str.length()) + f2) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
        }
        do {
            float textSize = paint.getTextSize();
            android.content.Context context = c57439yiT.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (textSize > C55298xhM.gEmmrt(12.0f, context)) {
                float textSize2 = paint.getTextSize();
                android.content.Context context2 = c57439yiT.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setTextSize(textSize2 - C55298xhM.gEmmrt(1.0f, context2));
            } else {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                android.content.Context context3 = c57439yiT.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new kotlin.Pair<>(bool, java.lang.Float.valueOf(C55298xhM.gEmmrt(12.0f, context3)));
            }
        } while (d <= paint.measureText(str, 0, str.length()) + f2);
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        this.AEQbTJ.clear();
        int i = 0;
        for (RectF rectF : this.isConnected) {
            float f = rectF.left;
            float f2 = this.KWHzl;
            double dWidth = rectF.width();
            java.lang.String strKWHzl = this.AhwBna.get(i).KWHzl();
            android.text.TextPaint textPaintOLrzqt = OLrzqt();
            java.lang.String strSubstring = strKWHzl;
            boolean z = false;
            while (true) {
                if (z) {
                    if (strSubstring.length() > 1) {
                        java.lang.String str = strSubstring;
                        kotlin.Pair<java.lang.Boolean, java.lang.Float> pairAEQbTJ = AEQbTJ(this, dWidth, strSubstring, z, textPaintOLrzqt, this.fetchVPNInfo);
                        boolean zBooleanValue = pairAEQbTJ.component1().booleanValue();
                        float fFloatValue = pairAEQbTJ.component2().floatValue();
                        if (zBooleanValue) {
                            textPaintOLrzqt.setTextSize(fFloatValue);
                            this.AEQbTJ.add(new Activity(str + (z ? "..." : ""), f + f2 + this.fetchVPNInfo, this.DbNXlk.get(i).EZpvd() + this.DbNXlk.get(i).OLrzqt().getFontMetrics().descent + this.AkhnZx + java.lang.Math.abs(textPaintOLrzqt.ascent()), textPaintOLrzqt));
                        } else {
                            textPaintOLrzqt.setTextSize(fFloatValue);
                            strSubstring = str.substring(0, str.length() - 1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            z = true;
                        }
                    }
                } else if (strSubstring.length() > 0) {
                }
            }
            i++;
        }
    }

    public static final kotlin.Pair<java.lang.Boolean, java.lang.Float> AEQbTJ(C57439yiT c57439yiT, double d, java.lang.String str, boolean z, android.graphics.Paint paint, float f) {
        if (z) {
            str = str + "...";
        }
        float f2 = f * 2;
        if (d >= paint.measureText(str, 0, str.length()) + f2) {
            return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
        }
        do {
            float textSize = paint.getTextSize();
            android.content.Context context = c57439yiT.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (textSize > C55298xhM.gEmmrt(12.0f, context)) {
                float textSize2 = paint.getTextSize();
                android.content.Context context2 = c57439yiT.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                paint.setTextSize(textSize2 - C55298xhM.gEmmrt(1.0f, context2));
            } else {
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                android.content.Context context3 = c57439yiT.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                return new kotlin.Pair<>(bool, java.lang.Float.valueOf(C55298xhM.gEmmrt(12.0f, context3)));
            }
        } while (d < paint.measureText(str, 0, str.length()) + f2);
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Float.valueOf(paint.getTextSize()));
    }

    public final java.util.List<ActionBar> EZpvd(java.util.List<C57444yiY> list) {
        java.lang.String strInvoke;
        java.util.Iterator<T> it = list.iterator();
        double dKWHzl = 0.0d;
        while (it.hasNext()) {
            dKWHzl += ((C57444yiY) it.next()).KWHzl();
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int i = 0;
        for (java.lang.Object obj : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C57444yiY c57444yiY = (C57444yiY) obj;
            if (i < 5) {
                arrayList.add(c57444yiY);
            } else {
                arrayList2.add(c57444yiY);
            }
            i++;
        }
        java.lang.String string = getContext().getString(C57406yhn.ActionBar.KWHzl);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (arrayList2.size() > 1) {
            java.util.Iterator it2 = arrayList2.iterator();
            double dKWHzl2 = 0.0d;
            while (it2.hasNext()) {
                dKWHzl2 += ((C57444yiY) it2.next()).KWHzl();
            }
            java.util.Iterator it3 = arrayList2.iterator();
            double dOLrzqt = 0.0d;
            while (it3.hasNext()) {
                dOLrzqt += ((C57444yiY) it3.next()).OLrzqt();
            }
            java.util.Iterator it4 = arrayList2.iterator();
            double dCopydefault = 0.0d;
            while (it4.hasNext()) {
                dCopydefault += ((C57444yiY) it4.next()).copydefault();
            }
            arrayList.add(new C57444yiY(string, dKWHzl2, dOLrzqt, dCopydefault, ((C57444yiY) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList2)).EZpvd()));
        } else {
            arrayList.addAll(arrayList2);
        }
        java.util.List<C57444yiY> listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 6);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (C57444yiY c57444yiY2 : listAhwBna) {
            java.lang.String strAEQbTJ = c57444yiY2.AEQbTJ();
            Function1<? super java.lang.Double, java.lang.String> function1 = this.gEmmrt;
            double d = dKWHzl;
            arrayList3.add(new ActionBar(strAEQbTJ, (function1 == null || (strInvoke = function1.invoke(java.lang.Double.valueOf(c57444yiY2.KWHzl()))) == null) ? "" : strInvoke, (c57444yiY2.KWHzl() / dKWHzl) * ((double) 100), Intrinsics.EZpvd((java.lang.Object) c57444yiY2.AEQbTJ(), (java.lang.Object) string) ? arrayList2 : C56402yEa.EZpvd(c57444yiY2)));
            dKWHzl = d;
        }
        return arrayList3;
    }

    public final void AEQbTJ() {
        RectF rectF;
        RectF rectF2;
        RectF rectF3 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        this.isConnected.clear();
        double dEZpvd = 100.0d;
        int i = 0;
        for (ActionBar actionBar : this.AhwBna) {
            int i2 = i + 1;
            if (i2 >= this.AhwBna.size() || i == 5) {
                this.isConnected.add(rectF3);
            } else {
                float fKWHzl = KWHzl((float) (this.AhwBna.get(i).EZpvd() / dEZpvd), i);
                if (i % 2 == 0) {
                    float f = rectF3.left;
                    rectF = new RectF(f, rectF3.top, (fKWHzl * rectF3.width()) + f, rectF3.bottom);
                    rectF2 = new RectF(rectF3.left + rectF.width(), rectF3.top, rectF3.right, rectF3.bottom);
                } else {
                    float f2 = rectF3.left;
                    float f3 = rectF3.top;
                    rectF = new RectF(f2, f3, rectF3.right, (fKWHzl * rectF3.height()) + f3);
                    rectF2 = new RectF(rectF3.left, rectF3.top + rectF.height(), rectF3.right, rectF3.bottom);
                }
                this.isConnected.add(rectF);
                dEZpvd -= actionBar.EZpvd();
                rectF3 = rectF2;
            }
            i = i2;
        }
    }

    public final float KWHzl(float f, int i) {
        int iEZpvd = C56548yJl.EZpvd(this.AhwBna.size() - 2, 0, this.OLrzqt.length - 1);
        return C56548yJl.KWHzl(f, this.copydefault[iEZpvd][i], this.OLrzqt[iEZpvd][i]);
    }

    public final void EZpvd(android.graphics.Canvas canvas, RectF rectF, int i) {
        android.graphics.Path path = new android.graphics.Path();
        path.addRect(rectF, Path.Direction.CW);
        int i2 = this.values;
        int i3 = (i2 == -1 || i2 == i) ? 255 : 102;
        android.graphics.Paint paint = this.valueOf;
        int i4 = C52761wXj.ActionBar.DGOPHZDGOPHZ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setColor(C55366xib.KWHzl(i4, context));
        paint.setAlpha(i3);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Unit unit = Unit.INSTANCE;
        canvas.drawPath(path, paint);
        android.graphics.Paint paint2 = this.valueOf;
        paint2.setColor(C33070mpX.copydefault(C52761wXj.Activity.copydefault));
        paint2.setStrokeWidth(this.KWHzl);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
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
            java.util.Iterator<RectF> it = this.isConnected.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().contains(x, y)) {
                    break;
                }
                i++;
            }
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i);
            java.lang.Integer num = numValueOf2.intValue() != -1 ? numValueOf2 : null;
            if (num == null) {
                return super.onTouchEvent(motionEvent);
            }
            int iIntValue = num.intValue();
            int i2 = this.values;
            if (i2 == -1 || i2 != iIntValue) {
                KWHzl(iIntValue);
            } else {
                KWHzl();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void KWHzl(int i) {
        StateListAnimator stateListAnimatorEZpvd = EZpvd(i);
        if (stateListAnimatorEZpvd == null) {
            return;
        }
        this.values = i;
        Application application = this.djBIcL;
        if (application != null) {
            application.KWHzl(i, stateListAnimatorEZpvd);
        }
        invalidate();
    }

    public final void KWHzl() {
        if (this.values == -1) {
            return;
        }
        this.values = -1;
        Application application = this.djBIcL;
        if (application != null) {
            application.EZpvd();
        }
        invalidate();
    }

    public final StateListAnimator EZpvd(int i) {
        if (i == -1) {
            return null;
        }
        ActionBar actionBar = this.AhwBna.get(i);
        return new StateListAnimator(actionBar.KWHzl(), actionBar.copydefault(), actionBar.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.yiT$ActionBar */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.util.List<C57444yiY> EZpvd;
        public final java.lang.String KWHzl;
        public final double OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.yiT$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, double d, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.AEQbTJ;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                d = actionBar.OLrzqt;
            }
            double d2 = d;
            if ((i & 8) != 0) {
                list = actionBar.EZpvd;
            }
            return actionBar.AEQbTJ(str, str3, d2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C57444yiY> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, double d, @NotNull java.util.List<C57444yiY> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(str, str2, d, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && java.lang.Double.compare(this.OLrzqt, actionBar.OLrzqt) == 0 && Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Double.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "RectData(name=" + this.KWHzl + ", value=" + this.AEQbTJ + ", areaProportion=" + this.OLrzqt + ", treeMapData=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, double d, @NotNull java.util.List<C57444yiY> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.OLrzqt = d;
            this.EZpvd = list;
        }
    }

    /* JADX INFO: renamed from: o.yiT$Activity */
    public static final class Activity {
        public final float EZpvd;
        public final java.lang.String KWHzl;
        public final android.graphics.Paint OLrzqt;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, float f, float f2, android.graphics.Paint paint, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                f = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                f2 = activity.copydefault;
            }
            if ((i & 8) != 0) {
                paint = activity.OLrzqt;
            }
            return activity.copydefault(str, f, f2, paint);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.graphics.Paint OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, float f, float f2, @NotNull android.graphics.Paint paint) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(paint, "");
            return new Activity(str, f, f2, paint);
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
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && java.lang.Float.compare(this.EZpvd, activity.EZpvd) == 0 && java.lang.Float.compare(this.copydefault, activity.copydefault) == 0 && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.KWHzl.hashCode() * 31) + java.lang.Float.hashCode(this.EZpvd)) * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextData(text=" + this.KWHzl + ", xPos=" + this.EZpvd + ", yPos=" + this.copydefault + ", textPaint=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, float f, float f2, @NotNull android.graphics.Paint paint) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(paint, "");
            this.KWHzl = str;
            this.EZpvd = f;
            this.copydefault = f2;
            this.OLrzqt = paint;
        }
    }

    /* JADX INFO: renamed from: o.yiT$StateListAnimator */
    public static final class StateListAnimator {
        public final java.util.List<C57444yiY> AEQbTJ;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yiT$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                list = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.OLrzqt(str, str2, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C57444yiY> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C57444yiY> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(str, str2, list);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SelectedData(name=" + this.copydefault + ", percentValue=" + this.OLrzqt + ", data=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C57444yiY> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = str;
            this.OLrzqt = str2;
            this.AEQbTJ = list;
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : this.isConnected) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            EZpvd(canvas, (RectF) obj, i2);
            i2++;
        }
        java.util.Iterator<T> it = this.DbNXlk.iterator();
        int i3 = 0;
        while (true) {
            int i4 = 102;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            Activity activity = (Activity) next;
            android.graphics.Paint paintOLrzqt = activity.OLrzqt();
            int i5 = this.values;
            if (i5 == -1 || i5 == i3) {
                i4 = 255;
            }
            paintOLrzqt.setAlpha(i4);
            canvas.drawText(activity.AEQbTJ(), activity.copydefault(), activity.EZpvd(), activity.OLrzqt());
            i3++;
        }
        for (java.lang.Object obj2 : this.AEQbTJ) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Activity activity2 = (Activity) obj2;
            android.graphics.Paint paintOLrzqt2 = activity2.OLrzqt();
            int i6 = this.values;
            paintOLrzqt2.setAlpha(i6 == -1 ? CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA : i6 == i ? CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA : 102);
            canvas.drawText(activity2.AEQbTJ(), activity2.copydefault(), activity2.EZpvd(), activity2.OLrzqt());
            i++;
        }
    }
}
