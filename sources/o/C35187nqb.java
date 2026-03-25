package o;

import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Shader;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35187nqb {
    public final int EZpvd;
    public android.graphics.Paint OLrzqt = new android.graphics.Paint(1);
    public android.graphics.Paint KWHzl = new android.graphics.Paint(1);
    public android.graphics.Paint AEQbTJ = new android.graphics.Paint(1);

    public C35187nqb(int i) {
        this.EZpvd = i;
        this.OLrzqt.setColor(i);
        this.OLrzqt.setStrokeWidth(3.0f);
        android.graphics.Paint paint = this.OLrzqt;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.KWHzl.setColor(i);
        this.KWHzl.setStrokeWidth(3.0f);
        this.KWHzl.setStyle(style);
        this.KWHzl.setAntiAlias(true);
        this.KWHzl.setPathEffect(new DashPathEffect(new float[]{6.0f, 10.0f}, 0.0f));
        android.graphics.Paint paint2 = this.KWHzl;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.AEQbTJ.setStyle(Paint.Style.FILL);
        this.AEQbTJ.setStrokeCap(cap);
        this.AEQbTJ.setAntiAlias(true);
    }

    public static /* synthetic */ java.util.List calMathPoint$default(C35187nqb c35187nqb, java.util.List list, float f, float f2, float f3, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        return c35187nqb.EZpvd(list, f, f2, f3);
    }

    public final java.util.List<PointF> EZpvd(java.util.List<java.lang.Float> list, float f, float f2, float f3) {
        if (list.isEmpty()) {
            return yDY.AhwBna();
        }
        int size = list.size();
        float f4 = 2 * f3;
        float fFlVtFt = CollectionsKt___CollectionsKt.flVtFt(list);
        float fFZBcTu = CollectionsKt___CollectionsKt.fZBcTu(list);
        float f5 = (f - f4) / (size - 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new PointF((i * f5) + f3, (1.0f - ((((java.lang.Number) obj).floatValue() - fFlVtFt) / (fFZBcTu - fFlVtFt))) * (f2 - f4)));
            i++;
        }
        java.util.List<PointF> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        PointF pointF = (PointF) CollectionsKt___CollectionsKt.AubY(listFJNWhG);
        int size2 = 3 - ((listFJNWhG.size() - 1) % 3);
        if (1 <= size2 && size2 < 3) {
            for (int i2 = 0; i2 < size2; i2++) {
                listFJNWhG.add(pointF);
            }
        }
        return listFJNWhG;
    }

    public static /* synthetic */ kotlin.Pair calAverageFloat$default(C35187nqb c35187nqb, java.util.List list, float f, float f2, java.lang.Float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            f4 = 0.0f;
        }
        return c35187nqb.OLrzqt((java.util.List<java.lang.Float>) list, f, f2, f3, f4);
    }

    public final kotlin.Pair<PointF, PointF> OLrzqt(java.util.List<java.lang.Float> list, float f, float f2, java.lang.Float f3, float f4) {
        float fFloatValue = f3 != null ? f3.floatValue() : ((java.lang.Number) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).floatValue();
        float fFlVtFt = CollectionsKt___CollectionsKt.flVtFt(list);
        float fFZBcTu = (1.0f - ((fFloatValue - fFlVtFt) / (CollectionsKt___CollectionsKt.fZBcTu(list) - fFlVtFt))) * (f2 - (f4 * 2));
        return C56390yDp.OLrzqt(new PointF(0.0f, fFZBcTu), new PointF(f, fFZBcTu));
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.Float> list, float f, float f2, @NotNull android.graphics.Canvas canvas, java.lang.Float f3) {
        int i;
        java.util.List list2;
        android.graphics.Path path;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        android.graphics.Path path2 = new android.graphics.Path();
        android.graphics.Path path3 = new android.graphics.Path();
        java.util.List listCalMathPoint$default = calMathPoint$default(this, list, f, f2, 0.0f, 8, null);
        path3.moveTo(((PointF) listCalMathPoint$default.get(0)).x, f2);
        path3.lineTo(((PointF) listCalMathPoint$default.get(0)).x, ((PointF) listCalMathPoint$default.get(0)).y);
        if (listCalMathPoint$default.size() >= 4) {
            path2.moveTo(((PointF) listCalMathPoint$default.get(0)).x, ((PointF) listCalMathPoint$default.get(0)).y);
            int i2 = 1;
            while (i2 < listCalMathPoint$default.size()) {
                int i3 = i2 + 2;
                if (i3 < listCalMathPoint$default.size()) {
                    int i4 = i2 + 1;
                    path = path3;
                    path2.cubicTo(((PointF) listCalMathPoint$default.get(i2)).x, ((PointF) listCalMathPoint$default.get(i2)).y, ((PointF) listCalMathPoint$default.get(i4)).x, ((PointF) listCalMathPoint$default.get(i4)).y, ((PointF) listCalMathPoint$default.get(i3)).x, ((PointF) listCalMathPoint$default.get(i3)).y);
                    path2 = path2;
                    i = i2;
                    list2 = listCalMathPoint$default;
                    path.cubicTo(((PointF) listCalMathPoint$default.get(i2)).x, ((PointF) listCalMathPoint$default.get(i2)).y, ((PointF) listCalMathPoint$default.get(i4)).x, ((PointF) listCalMathPoint$default.get(i4)).y, ((PointF) listCalMathPoint$default.get(i3)).x, ((PointF) listCalMathPoint$default.get(i3)).y);
                } else {
                    i = i2;
                    list2 = listCalMathPoint$default;
                    path = path3;
                }
                i2 = i + 3;
                listCalMathPoint$default = list2;
                path3 = path;
            }
        }
        android.graphics.Path path4 = path3;
        path4.lineTo(((PointF) listCalMathPoint$default.get(r12.size() - 1)).x, f2);
        path4.close();
        android.graphics.Path path5 = new android.graphics.Path();
        kotlin.Pair pairCalAverageFloat$default = calAverageFloat$default(this, list, f, f2, f3, 0.0f, 16, null);
        float f4 = f2 - 6;
        path5.moveTo(((PointF) pairCalAverageFloat$default.getFirst()).x, C56548yJl.copydefault(6.0f, C56548yJl.valueOf(((PointF) pairCalAverageFloat$default.getFirst()).y, f4)));
        path5.lineTo(((PointF) pairCalAverageFloat$default.getSecond()).x, C56548yJl.copydefault(6.0f, C56548yJl.valueOf(((PointF) pairCalAverageFloat$default.getSecond()).y, f4)));
        this.AEQbTJ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f2, Color.argb(76, Color.red(this.EZpvd), Color.green(this.EZpvd), Color.blue(this.EZpvd)), 0, Shader.TileMode.CLAMP));
        canvas.drawPath(path2, this.OLrzqt);
        canvas.drawPath(path4, this.AEQbTJ);
        canvas.drawPath(path5, this.KWHzl);
    }
}
