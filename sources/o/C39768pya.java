package o;

import android.icu.util.Calendar;
import androidx.camera.video.AudioStats;
import com.okinc.kline.ui.unlock.data.po.UnlockScheduleInfo;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenSchedule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39768pya {
    public static final C39768pya copydefault = new C39768pya();

    private C39768pya() {
    }

    public final C39703pxO copydefault(@NotNull kotlin.Pair<? extends java.util.List<UnlockTokenSchedule>, ? extends java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>>> pair) {
        java.lang.Object next;
        java.util.Iterator<java.lang.Integer> it;
        float f;
        java.lang.Object next2;
        java.util.Iterator it2;
        java.util.List list;
        C39709pxU c39709pxU;
        C39709pxU c39709pxU2;
        java.lang.Object next3;
        java.util.Iterator it3;
        float f2;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pairOLrzqt;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(pair.getFirst(), new TaskDescription());
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listEZpvd, 10)), 16));
        for (java.lang.Object obj : listEZpvd) {
            linkedHashMap.put(((UnlockTokenSchedule) obj).getTs(), obj);
        }
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        java.util.List listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.fJNWhG(linkedHashMap.keySet()), new Application());
        int size = pair.getSecond().size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it4 = C39650pwO.KWHzl().iterator();
        long jEZpvd = EZpvd();
        long jValueOf = C33129mqd.valueOf(CollectionsKt___CollectionsKt.firstOrNull(listEZpvd2));
        long jValueOf2 = C33129mqd.valueOf(CollectionsKt___CollectionsKt.wlaJM(listEZpvd2));
        java.util.Iterator<T> it5 = pair.getFirst().iterator();
        while (true) {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
            if (((UnlockTokenSchedule) next).getNearToday()) {
                break;
            }
        }
        UnlockTokenSchedule unlockTokenSchedule = (UnlockTokenSchedule) next;
        if (unlockTokenSchedule == null) {
            unlockTokenSchedule = (UnlockTokenSchedule) CollectionsKt___CollectionsKt.wlaJM(pair.getFirst());
        }
        if (jValueOf2 == 0 || jValueOf == 0 || jValueOf2 == jValueOf) {
            it = it4;
            f = 1.0f;
        } else {
            it = it4;
            f = (jEZpvd - jValueOf) / (jValueOf2 - jValueOf);
        }
        float f3 = f;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.util.Iterator<T> it6 = ((UnlockTokenSchedule) entry.getValue()).getInfos().iterator();
            while (it6.hasNext()) {
                java.lang.String label = ((UnlockScheduleInfo) it6.next()).getLabel();
                if (!arrayList.contains(label)) {
                    arrayList.add(label);
                }
            }
        }
        if (arrayList.size() > 1) {
            C56407yEf.copydefault(arrayList, new StateListAnimator(pair));
        }
        C56404yEc.zsXlph(arrayList);
        java.util.Iterator it7 = linkedHashMap.entrySet().iterator();
        java.util.Iterator<java.lang.Integer> it8 = it;
        while (it7.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it7.next();
            long jValueOf3 = C33129mqd.valueOf(entry2.getKey());
            int iIndexOf = listEZpvd2.indexOf(entry2.getKey());
            if (jValueOf3 != 0) {
                for (UnlockScheduleInfo unlockScheduleInfo : ((UnlockTokenSchedule) entry2.getValue()).getInfos()) {
                    java.lang.String label2 = unlockScheduleInfo.getLabel();
                    int iIndexOf2 = arrayList.indexOf(label2);
                    java.util.Iterator it9 = it7;
                    java.lang.Object key = entry2.getKey();
                    java.lang.Object obj2 = linkedHashMap2.get(key);
                    Map.Entry entry3 = entry2;
                    if (obj2 == null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        linkedHashMap2.put(key, arrayList2);
                        obj2 = arrayList2;
                    }
                    java.util.List list2 = (java.util.List) obj2;
                    java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>> second = pair.getSecond();
                    kotlin.Pair<java.lang.Integer, java.lang.Integer> pair2 = second.get(label2);
                    if (pair2 == null) {
                        if (it8.hasNext()) {
                            f2 = f3;
                            pairOLrzqt = C56390yDp.OLrzqt(it8.next(), java.lang.Integer.valueOf(size));
                            it8 = it8;
                        } else {
                            f2 = f3;
                            java.util.Iterator<java.lang.Integer> it10 = C39650pwO.KWHzl().iterator();
                            pairOLrzqt = C56390yDp.OLrzqt(it10.next(), java.lang.Integer.valueOf(size));
                            it8 = it10;
                        }
                        second.put(label2, pairOLrzqt);
                        pair2 = pairOLrzqt;
                    } else {
                        f2 = f3;
                    }
                    list2.add(new C39709pxU(jValueOf3, label2, C33129mqd.AEQbTJ(unlockScheduleInfo.getUnlocked()), C33129mqd.AEQbTJ(unlockScheduleInfo.getUnlockedValue()), C33129mqd.valueOf(unlockScheduleInfo.getUnlocked()), C33129mqd.AEQbTJ(unlockScheduleInfo.getUnlockedValue()), pair2.getFirst().intValue(), iIndexOf, iIndexOf2));
                    it7 = it9;
                    entry2 = entry3;
                    f3 = f2;
                }
                it3 = it7;
            } else {
                it3 = it7;
            }
            it7 = it3;
            f3 = f3;
        }
        float f4 = f3;
        java.util.Iterator it11 = linkedHashMap2.entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it11.hasNext()) {
                break;
            }
            Map.Entry entry4 = (Map.Entry) it11.next();
            int iIndexOf3 = listEZpvd2.indexOf(entry4.getKey());
            java.util.List list3 = (java.util.List) entry4.getValue();
            for (java.lang.Object obj3 : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj3;
                java.util.Iterator it12 = list3.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it12.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((C39709pxU) next2).valueOf(), (java.lang.Object) str)) {
                        break;
                    }
                }
                C39709pxU c39709pxU3 = (C39709pxU) next2;
                if (c39709pxU3 != null) {
                    int i2 = i - 1;
                    java.lang.String str2 = i2 < 0 ? null : (java.lang.String) arrayList.get(i2);
                    java.lang.Object arrayList3 = arrayMap.get(str);
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList();
                        arrayMap.put(str, arrayList3);
                    }
                    java.util.List list4 = (java.util.List) arrayList3;
                    if (str2 != null) {
                        java.lang.Object arrayList4 = arrayMap.get(str2);
                        if (arrayList4 == null) {
                            arrayList4 = new java.util.ArrayList();
                            arrayMap.put(str2, arrayList4);
                        }
                        list = (java.util.List) arrayList4;
                    } else {
                        list = null;
                    }
                    if (str2 != null) {
                        if (list != null) {
                            java.util.Iterator it13 = list.iterator();
                            while (true) {
                                if (!it13.hasNext()) {
                                    it2 = it11;
                                    next3 = null;
                                    break;
                                }
                                next3 = it13.next();
                                it2 = it11;
                                if (((C39709pxU) next3).KWHzl() == iIndexOf3) {
                                    break;
                                }
                                it11 = it2;
                            }
                            c39709pxU2 = (C39709pxU) next3;
                        } else {
                            it2 = it11;
                            c39709pxU2 = null;
                        }
                        c39709pxU = c39709pxU2;
                    } else {
                        it2 = it11;
                        c39709pxU = null;
                    }
                    list4.add(copydefault.KWHzl(c39709pxU3.valueOf(), c39709pxU3.AhwBna(), c39709pxU3, c39709pxU, c39709pxU3.EZpvd(), c39709pxU3.KWHzl(), arrayList.indexOf(str)));
                } else {
                    it2 = it11;
                }
                i++;
                it11 = it2;
            }
        }
        for (java.util.List list5 : arrayMap.values()) {
            Intrinsics.copydefault(list5);
            C39709pxU c39709pxU4 = (C39709pxU) CollectionsKt___CollectionsKt.wlaJM(list5);
            if (c39709pxU4 != null && c39709pxU4.KWHzl() < listEZpvd2.size() - 1) {
                try {
                    Result.Application application = Result.Companion;
                    int size2 = listEZpvd2.size();
                    int iKWHzl = c39709pxU4.KWHzl();
                    for (int i3 = 0; i3 < (size2 - 1) - iKWHzl; i3++) {
                        list5.add(c39709pxU4.AEQbTJ((382 & 1) != 0 ? c39709pxU4.AhwBna : C33129mqd.valueOf(listEZpvd2.get(c39709pxU4.KWHzl() + i3)), (382 & 2) != 0 ? c39709pxU4.gEmmrt : null, (382 & 4) != 0 ? c39709pxU4.djBIcL : AudioStats.AUDIO_AMPLITUDE_NONE, (382 & 8) != 0 ? c39709pxU4.AEQbTJ : AudioStats.AUDIO_AMPLITUDE_NONE, (382 & 16) != 0 ? c39709pxU4.OLrzqt : 0L, (382 & 32) != 0 ? c39709pxU4.KWHzl : AudioStats.AUDIO_AMPLITUDE_NONE, (382 & 64) != 0 ? c39709pxU4.EZpvd : 0, (382 & 128) != 0 ? c39709pxU4.copydefault : i3 + c39709pxU4.KWHzl(), (382 & 256) != 0 ? c39709pxU4.valueOf : 0));
                    }
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
        }
        return new C39703pxO(jEZpvd, f4, unlockTokenSchedule != null ? unlockTokenSchedule.getTs() : null, linkedHashMap2, arrayMap, listEZpvd2);
    }

    /* JADX INFO: renamed from: o.pya$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf((java.lang.String) t)), java.lang.Long.valueOf(C33129mqd.valueOf((java.lang.String) t2)));
        }
    }

    /* JADX INFO: renamed from: o.pya$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ kotlin.Pair AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(kotlin.Pair pair) {
            this.AEQbTJ = pair;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            kotlin.Pair pair = (kotlin.Pair) ((java.util.Map) this.AEQbTJ.getSecond()).get((java.lang.String) t);
            java.lang.Integer num = pair != null ? (java.lang.Integer) pair.getSecond() : null;
            kotlin.Pair pair2 = (kotlin.Pair) ((java.util.Map) this.AEQbTJ.getSecond()).get((java.lang.String) t2);
            return yET.KWHzl(num, pair2 != null ? (java.lang.Integer) pair2.getSecond() : null);
        }
    }

    /* JADX INFO: renamed from: o.pya$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((UnlockTokenSchedule) t).getTs())), java.lang.Long.valueOf(C33129mqd.valueOf(((UnlockTokenSchedule) t2).getTs())));
        }
    }

    public final C39709pxU KWHzl(java.lang.String str, long j, C39709pxU c39709pxU, C39709pxU c39709pxU2, int i, int i2, int i3) {
        double dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Double.valueOf(c39709pxU.djBIcL()));
        double dOLrzqt = AudioStats.AUDIO_AMPLITUDE_NONE;
        double dDjBIcL = c39709pxU2 != null ? c39709pxU2.djBIcL() : 0.0d;
        double dAEQbTJ2 = C33129mqd.AEQbTJ(java.lang.Double.valueOf(c39709pxU.OLrzqt()));
        if (c39709pxU2 != null) {
            dOLrzqt = c39709pxU2.OLrzqt();
        }
        return new C39709pxU(j, str, dAEQbTJ + dDjBIcL, dAEQbTJ2 + dOLrzqt, c39709pxU.AEQbTJ(), c39709pxU.copydefault(), i, i2, i3);
    }

    public final long EZpvd() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }
}
