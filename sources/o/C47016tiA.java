package o;

import com.okinc.okrisk.collection.sensors.SensorType;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tiA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47016tiA {
    public static /* synthetic */ java.lang.String toRiskJson$default(java.util.List list, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = C56424yEw.KWHzl();
        }
        return copydefault(list, map);
    }

    public static final java.lang.CharSequence copydefault(C47063tiv c47063tiv) {
        Intrinsics.checkNotNullParameter(c47063tiv, "");
        return c47063tiv.djBIcL();
    }

    public static final java.lang.String copydefault(@NotNull java.util.List<C47063tiv> list, @NotNull java.util.Map<SensorType, java.lang.Integer> map) {
        java.util.Collection collection;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            SensorType sensorTypeEZpvd = ((C47063tiv) obj).EZpvd();
            java.lang.Object arrayList = linkedHashMap.get(sensorTypeEZpvd);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(sensorTypeEZpvd, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.List<SensorType> listGEmmrt = yDY.gEmmrt(SensorType.ACCELEROMETER, SensorType.GYROSCOPE, SensorType.MAGNETOMETER, SensorType.GRAVITY);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        for (SensorType sensorType : listGEmmrt) {
            java.util.List<C47063tiv> listAhwBna = (java.util.List) linkedHashMap.get(sensorType);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (C47063tiv c47063tiv : listAhwBna) {
                C56406yEe.KWHzl(arrayList3, yDY.gEmmrt(java.lang.Float.valueOf(c47063tiv.OLrzqt()), java.lang.Float.valueOf(c47063tiv.KWHzl()), java.lang.Float.valueOf(c47063tiv.AEQbTJ())));
            }
            int i3 = 0;
            if (arrayList3.isEmpty()) {
                i = 0;
            } else {
                java.util.Iterator it = arrayList3.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (java.lang.Float.isNaN(((java.lang.Number) it.next()).floatValue()) && (i = i + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                i2 = 0;
            } else {
                java.util.Iterator it2 = arrayList3.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (((java.lang.Number) it2.next()).floatValue() == Float.POSITIVE_INFINITY && (i2 = i2 + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
            }
            if (!arrayList3.isEmpty()) {
                java.util.Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    if (((java.lang.Number) it3.next()).floatValue() == Float.NEGATIVE_INFINITY && (i3 = i3 + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
            }
            if (i + i2 + i3 > 0) {
                C47220tlt.log$default(C47220tlt.KWHzl, "biometric", "Non-finite sensor values detected: type=" + sensorType + ", NaN=" + i + ", +Inf=" + i2 + ", -Inf=" + i3, null, null, 12, null);
            }
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listAhwBna, ",", null, null, 0, null, new Function1() { // from class: o.tiC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C47016tiA.copydefault((C47063tiv) obj2);
                }
            }, 30, null);
            C47063tiv c47063tiv2 = (C47063tiv) CollectionsKt___CollectionsKt.firstOrNull(listAhwBna);
            long jCopydefault = 0;
            long jCopydefault2 = c47063tiv2 != null ? c47063tiv2.copydefault() : 0L;
            C47063tiv c47063tiv3 = (C47063tiv) CollectionsKt___CollectionsKt.wlaJM(listAhwBna);
            if (c47063tiv3 != null) {
                jCopydefault = c47063tiv3.copydefault();
            }
            arrayList2.add("{\"sensorType\": \"" + sensorType + "\", \"startTime\": \"" + jCopydefault2 + "\", \"endTime\": \"" + jCopydefault + "\", \"availability\" : \"" + map.get(sensorType) + "\", \"data\": [" + strJoinToString$default + "]}");
        }
        for (SensorType sensorType2 : listGEmmrt) {
            java.lang.Integer num = map.get(sensorType2);
            if (num != null && num.intValue() == 0 && ((collection = (java.util.Collection) linkedHashMap.get(sensorType2)) == null || collection.isEmpty())) {
                C47220tlt.log$default(C47220tlt.KWHzl, "biometric", "Sensor available but no data collected: " + sensorType2, null, null, 12, null);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", "[", "]", 0, null, null, 56, null);
    }
}
