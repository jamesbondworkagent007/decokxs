package o;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.oXR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oXQ {
    public static final oXQ EZpvd = new oXQ();

    private oXQ() {
    }

    /* JADX DEBUG: Type inference failed for r9v1. Raw type applied. Possible types: T, ? super T */
    public final <T> oXF<T> OLrzqt(@NotNull java.util.List<? extends T> list, @NotNull oXP oxp, @NotNull Function1<? super T, java.lang.Float> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        Intrinsics.checkNotNullParameter(function1, "");
        float fIwGUEr = oxp.iwGUEr();
        float fieldNames = oxp.getFieldNames();
        float fHDKMBd = oxp.hDKMBd();
        float newProxyInstance = oxp.getNewProxyInstance();
        float fAkhnZx = oxp.AkhnZx();
        float fGEmmrt = oxp.gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        java.util.List<PointF> listAEQbTJ = AEQbTJ(arrayList, newProxyInstance, fHDKMBd);
        java.util.ArrayList<PointF> arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        for (PointF pointF : listAEQbTJ) {
            arrayList2.add(new PointF(pointF.x + fIwGUEr, pointF.y + fieldNames));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        int i = 0;
        for (T t : arrayList2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList3.add(i < list.size() ? new oXL(EZpvd.KWHzl((PointF) t, oxp), list.get(i)) : null);
            i++;
        }
        java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : listQfsBiF) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((oXL) t2).copydefault().copydefault());
            java.lang.Object arrayList4 = linkedHashMap.get(numValueOf);
            if (arrayList4 == null) {
                arrayList4 = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList4);
            }
            ((java.util.List) arrayList4).add(t2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (oXL) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) entry.getValue()));
        }
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(((PointF) arrayList2.get(0)).x, ((PointF) arrayList2.get(0)).y);
        android.graphics.Path path2 = new android.graphics.Path();
        path2.moveTo(0.0f, 0.0f);
        path2.lineTo(((PointF) arrayList2.get(0)).x, ((PointF) arrayList2.get(0)).y);
        android.graphics.Path path3 = new android.graphics.Path();
        path3.moveTo(0.0f, fGEmmrt);
        path3.lineTo(((PointF) arrayList2.get(0)).x, ((PointF) arrayList2.get(0)).y);
        if (arrayList2.size() <= 2) {
            if (arrayList2.size() > 1) {
                path.lineTo(((PointF) arrayList2.get(1)).x, ((PointF) arrayList2.get(1)).y);
                path2.lineTo(((PointF) arrayList2.get(1)).x, ((PointF) arrayList2.get(1)).y);
                path3.lineTo(((PointF) arrayList2.get(1)).x, ((PointF) arrayList2.get(1)).y);
            }
        } else {
            for (PointF pointF2 : arrayList2) {
                path.lineTo(pointF2.x, pointF2.y);
                path2.lineTo(pointF2.x, pointF2.y);
                path3.lineTo(pointF2.x, pointF2.y);
            }
            PointF pointF3 = (PointF) CollectionsKt___CollectionsKt.wlaJM(arrayList2);
            if (pointF3 != null) {
                path.lineTo(pointF3.x, pointF3.y);
                path2.lineTo(pointF3.x, pointF3.y);
                path2.lineTo(fAkhnZx, pointF3.y);
                path3.lineTo(pointF3.x, pointF3.y);
                path3.lineTo(fAkhnZx, pointF3.y);
            }
        }
        path2.lineTo(fAkhnZx, 0.0f);
        path2.close();
        path3.lineTo(fAkhnZx, fGEmmrt);
        path3.close();
        return new oXF<>(path, path2, path3, linkedHashMap2);
    }

    public final java.util.List<PointF> AEQbTJ(@NotNull java.util.List<java.lang.Float> list, float f, float f2) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty() || list.size() == 1) {
            float f3 = f2 / 2;
            return yDY.gEmmrt(new PointF(0.0f, f3), new PointF(f, f3));
        }
        int size = list.size();
        java.lang.Float fGasjUx = CollectionsKt___CollectionsKt.gasjUx(list);
        float fFloatValue = fGasjUx != null ? fGasjUx.floatValue() : 0.0f;
        java.lang.Float fDxcTrN = CollectionsKt___CollectionsKt.dxcTrN(list);
        float fFloatValue2 = (fDxcTrN != null ? fDxcTrN.floatValue() : 0.0f) - fFloatValue;
        float f4 = f / (size - 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new PointF(i * f4, fFloatValue2 == 0.0f ? f2 / 2 : f2 - (((((java.lang.Number) obj).floatValue() - fFloatValue) / fFloatValue2) * f2)));
            i++;
        }
        return arrayList;
    }

    public final java.util.List<C36343oYg> OLrzqt(@NotNull android.graphics.Path path, @NotNull oXP oxp) {
        Intrinsics.checkNotNullParameter(path, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        float fUzCIH = 0.0f;
        while (fUzCIH < length) {
            pathMeasure.getPosTan(fUzCIH, fArr, null);
            try {
                Result.Application application = Result.Companion;
                C36343oYg c36343oYgEZpvd = EZpvd.EZpvd(fArr, oxp);
                Result.m7377constructorimpl(c36343oYgEZpvd != null ? java.lang.Boolean.valueOf(linkedHashSet.add(c36343oYgEZpvd)) : null);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            fUzCIH += oxp.uzCIH();
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet);
    }

    public final C36343oYg EZpvd(float[] fArr, oXP oxp) {
        if (fArr.length < 2) {
            return null;
        }
        int iEZpvd = yII.EZpvd((fArr[0] - oxp.iwGUEr()) / oxp.uzCIH());
        int iEZpvd2 = yII.EZpvd((fArr[1] - oxp.getFieldNames()) / oxp.uzCIH());
        float fUzCIH = oxp.uzCIH();
        return new C36343oYg((iEZpvd * fUzCIH) + oxp.iwGUEr(), (iEZpvd2 * oxp.uzCIH()) + oxp.getFieldNames(), iEZpvd, iEZpvd2, oxp.uzCIH(), oxp.ejfBZ(), oxp.valueOf());
    }

    public final C36343oYg KWHzl(PointF pointF, oXP oxp) {
        int iValueOf = C56548yJl.valueOf((int) ((pointF.x - oxp.iwGUEr()) / oxp.uzCIH()), oxp.fIwbmz() - 1);
        int iValueOf2 = C56548yJl.valueOf(oxp.fJNWhG() - 1, (int) ((pointF.y - oxp.getFieldNames()) / oxp.uzCIH()));
        float fUzCIH = oxp.uzCIH();
        return new C36343oYg((iValueOf * fUzCIH) + oxp.iwGUEr(), oxp.getFieldNames() + (iValueOf2 * oxp.uzCIH()), iValueOf, iValueOf2, oxp.uzCIH(), oxp.ejfBZ(), oxp.valueOf());
    }

    public final int KWHzl(float f, @NotNull oXP oxp) {
        Intrinsics.checkNotNullParameter(oxp, "");
        return C56548yJl.copydefault((int) ((f - oxp.iwGUEr()) / oxp.uzCIH()), 0);
    }

    public final kotlin.Pair<java.lang.Float, java.lang.Float> KWHzl(@NotNull java.util.List<C36343oYg> list, @NotNull oXP oxp) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        if (list.size() == 1) {
            return C56390yDp.OLrzqt(java.lang.Float.valueOf(((C36343oYg) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).gEmmrt() - oxp.uzCIH()), java.lang.Float.valueOf(oxp.uzCIH() * 3));
        }
        if (list.size() == 2) {
            return C56390yDp.OLrzqt(java.lang.Float.valueOf(((C36343oYg) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).gEmmrt() - (oxp.uzCIH() * 2)), java.lang.Float.valueOf(oxp.uzCIH() * 4));
        }
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                float fGEmmrt = ((C36343oYg) next).gEmmrt();
                do {
                    java.lang.Object next2 = it.next();
                    float fGEmmrt2 = ((C36343oYg) next2).gEmmrt();
                    if (java.lang.Float.compare(fGEmmrt, fGEmmrt2) > 0) {
                        next = next2;
                        fGEmmrt = fGEmmrt2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        C36343oYg c36343oYg = (C36343oYg) obj;
        return C56390yDp.OLrzqt(java.lang.Float.valueOf(c36343oYg != null ? c36343oYg.gEmmrt() : 0.0f), java.lang.Float.valueOf(list.size() * oxp.uzCIH()));
    }

    public final RectF EZpvd(@NotNull oXR.TaskDescription taskDescription, @NotNull oXP oxp) {
        kotlin.Pair<java.lang.Float, java.lang.Float> pairKWHzl;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(oxp, "");
        java.util.List<C36343oYg> listAEQbTJ = taskDescription.AEQbTJ();
        if (listAEQbTJ == null || listAEQbTJ.isEmpty()) {
            return new RectF();
        }
        java.lang.Float fOLrzqt = taskDescription.OLrzqt();
        if (fOLrzqt == null) {
            return new RectF();
        }
        float fFloatValue = fOLrzqt.floatValue();
        java.util.List<C36343oYg> listAEQbTJ2 = taskDescription.AEQbTJ();
        if (listAEQbTJ2 == null || (pairKWHzl = KWHzl(listAEQbTJ2, oxp)) == null) {
            return new RectF();
        }
        float fFloatValue2 = pairKWHzl.component1().floatValue();
        float fFloatValue3 = pairKWHzl.component2().floatValue();
        float fUzCIH = fFloatValue - ((oxp.uzCIH() * 1.5f) / 2.0f);
        return new RectF(fUzCIH, fFloatValue2, (oxp.uzCIH() * 1.5f) + fUzCIH, fFloatValue3 + fFloatValue2);
    }
}
