package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.okinc.kline.data.KLineTradeSubIndicatorBean;
import com.okinc.kline.ws.util.FutureIndicatorDataHandle$bindWsForIndicator$1;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37979pHu {
    public static Job KWHzl;
    public static final C37979pHu AEQbTJ = new C37979pHu();
    public static final MutableLiveData<java.util.List<oUF>> AYXKKw = new MutableLiveData<>();
    public static final MutableLiveData<java.util.List<oUF>> copydefault = new MutableLiveData<>();
    public static final MutableLiveData<java.util.List<oUF>> EZpvd = new MutableLiveData<>();
    public static final MutableLiveData<java.util.List<oUF>> gEmmrt = new MutableLiveData<>();
    public static final MutableLiveData<java.util.List<oUF>> AhwBna = new MutableLiveData<>();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUF>> AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUF>> EZpvd() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUF>> KWHzl() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUF>> OLrzqt() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.List<oUF>> copydefault() {
        return EZpvd;
    }

    private C37979pHu() {
    }

    public final void KWHzl(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, int i, @NotNull KLineTradeSubIndicatorBean kLineTradeSubIndicatorBean) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(kLineTradeSubIndicatorBean, "");
        Job job = KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        KWHzl = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getDefault(), null, new FutureIndicatorDataHandle$bindWsForIndicator$1(str, str3, kLineTradeSubIndicatorBean, str2, i, null), 2, null);
    }

    public final void AEQbTJ(java.util.List<C37983pHy> list, int i, java.util.List<oUF> list2) {
        java.util.List<java.util.List<java.lang.String>> listKWHzl;
        java.util.List<java.util.List<java.lang.String>> listCopydefault;
        java.util.List<java.util.List<java.lang.String>> listOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list2);
        if (i == 0) {
            int i2 = 0;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C37983pHy c37983pHy = (C37983pHy) obj;
                if (c37983pHy != null && (listKWHzl = c37983pHy.KWHzl()) != null) {
                    java.util.Iterator<T> it = listKWHzl.iterator();
                    while (it.hasNext()) {
                        java.util.List list3 = (java.util.List) it.next();
                        if (list3.size() >= 2) {
                            oUF ouf = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                            if (!Intrinsics.EZpvd(ouf != null ? ouf.fIwbmz() : null, list3.get(0))) {
                                arrayList.add(new oUF((java.lang.String) list3.get(0), (java.lang.String) list3.get(1), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 131068, null));
                            }
                        }
                    }
                }
                i2++;
            }
        } else if (i == 1) {
            int i3 = 0;
            for (java.lang.Object obj2 : list) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                C37983pHy c37983pHy2 = (C37983pHy) obj2;
                if (c37983pHy2 != null && (listCopydefault = c37983pHy2.copydefault()) != null) {
                    java.util.Iterator<T> it2 = listCopydefault.iterator();
                    while (it2.hasNext()) {
                        java.util.List list4 = (java.util.List) it2.next();
                        if (list4.size() >= 2) {
                            oUF ouf2 = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                            if (!Intrinsics.EZpvd(ouf2 != null ? ouf2.fIwbmz() : null, list4.get(0))) {
                                arrayList.add(new oUF((java.lang.String) list4.get(0), (java.lang.String) list4.get(1), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 131068, null));
                            }
                        }
                    }
                }
                i3++;
            }
        } else if (i == 2) {
            int i4 = 0;
            for (java.lang.Object obj3 : list) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                C37983pHy c37983pHy3 = (C37983pHy) obj3;
                if (c37983pHy3 != null && (listOLrzqt = c37983pHy3.OLrzqt()) != null) {
                    java.util.Iterator<T> it3 = listOLrzqt.iterator();
                    while (it3.hasNext()) {
                        java.util.List list5 = (java.util.List) it3.next();
                        if (list5.size() >= 2) {
                            oUF ouf3 = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                            if (!Intrinsics.EZpvd(ouf3 != null ? ouf3.fIwbmz() : null, list5.get(0))) {
                                arrayList.add(new oUF((java.lang.String) list5.get(0), (java.lang.String) list5.get(1), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 131068, null));
                            }
                        }
                    }
                }
                i4++;
            }
        }
        AYXKKw.postValue(arrayList);
    }

    public final void KWHzl(java.util.List<C37975pHq> list, java.util.ArrayList<oUF> arrayList) {
        java.util.List<java.util.List<java.lang.String>> listAEQbTJ;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(arrayList);
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C37975pHq c37975pHq = (C37975pHq) obj;
            if (c37975pHq != null && (listAEQbTJ = c37975pHq.AEQbTJ()) != null) {
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (it.hasNext()) {
                    java.util.List list2 = (java.util.List) it.next();
                    if (list2.size() >= 4) {
                        oUF ouf = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList2);
                        if (!Intrinsics.EZpvd(ouf != null ? ouf.fIwbmz() : null, list2.get(i))) {
                            arrayList2.add(new oUF((java.lang.String) list2.get(i), null, (java.lang.String) list2.get(1), (java.lang.String) list2.get(2), (java.lang.String) list2.get(3), C33129mqd.AEQbTJ(list2.get(1)) - C33129mqd.AEQbTJ(list2.get(2)), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 131010, null));
                            i = 0;
                        }
                    }
                }
            }
            i2++;
            i = 0;
        }
        copydefault.postValue(arrayList2);
    }

    public final void KWHzl(java.util.List<C37977pHs> list, java.util.List<oUF> list2) {
        java.util.List<java.util.List<java.lang.String>> listEZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list2);
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C37977pHs c37977pHs = (C37977pHs) obj;
            if (c37977pHs != null && (listEZpvd = c37977pHs.EZpvd()) != null) {
                java.util.Iterator<T> it = listEZpvd.iterator();
                while (it.hasNext()) {
                    java.util.List list3 = (java.util.List) it.next();
                    if (list3.size() >= 4) {
                        oUF ouf = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                        if (!Intrinsics.EZpvd(ouf != null ? ouf.fIwbmz() : null, list3.get(i))) {
                            arrayList.add(new oUF((java.lang.String) list3.get(i), null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) list3.get(1), (java.lang.String) list3.get(2), (java.lang.String) list3.get(3), C33129mqd.AEQbTJ(list3.get(1)) - C33129mqd.AEQbTJ(list3.get(2)), null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 130110, null));
                            i = 0;
                        }
                    }
                }
            }
            i2++;
            i = 0;
        }
        EZpvd.postValue(arrayList);
    }

    public final void OLrzqt(java.util.List<C37974pHp> list, java.util.List<oUF> list2) {
        java.util.List<java.util.List<java.lang.String>> listEZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list2);
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C37974pHp c37974pHp = (C37974pHp) obj;
            if (c37974pHp != null && (listEZpvd = c37974pHp.EZpvd()) != null) {
                java.util.Iterator<T> it = listEZpvd.iterator();
                while (it.hasNext()) {
                    java.util.List list3 = (java.util.List) it.next();
                    if (list3.size() >= 4) {
                        oUF ouf = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                        if (!Intrinsics.EZpvd(ouf != null ? ouf.fIwbmz() : null, list3.get(i))) {
                            arrayList.add(new oUF((java.lang.String) list3.get(i), null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) list3.get(1), (java.lang.String) list3.get(2), (java.lang.String) list3.get(3), C33129mqd.AEQbTJ(list3.get(1)) - C33129mqd.AEQbTJ(list3.get(2)), null, null, AudioStats.AUDIO_AMPLITUDE_NONE, 115710, null));
                            i = 0;
                        }
                    }
                }
            }
            i2++;
            i = 0;
        }
        gEmmrt.postValue(arrayList);
    }

    public final void EZpvd(java.util.List<C37982pHx> list, int i, java.util.List<oUF> list2) {
        java.util.List<java.util.List<java.lang.String>> listEZpvd;
        java.util.List<java.util.List<java.lang.String>> listKWHzl;
        java.util.List<java.util.List<java.lang.String>> listOLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(list2);
        int i2 = 0;
        if (i == 0) {
            int i3 = 0;
            for (java.lang.Object obj : list) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                C37982pHx c37982pHx = (C37982pHx) obj;
                if (c37982pHx != null && (listEZpvd = c37982pHx.EZpvd()) != null) {
                    java.util.Iterator<T> it = listEZpvd.iterator();
                    while (it.hasNext()) {
                        java.util.List list3 = (java.util.List) it.next();
                        if (list3.size() >= 2) {
                            oUF ouf = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                            if (!Intrinsics.EZpvd(ouf != null ? ouf.fIwbmz() : null, list3.get(0))) {
                                arrayList.add(new oUF((java.lang.String) list3.get(0), null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) list3.get(1), (java.lang.String) list3.get(2), C33129mqd.AEQbTJ(list3.get(1)) + C33129mqd.AEQbTJ(list3.get(2)), 16382, null));
                            }
                        }
                    }
                }
                i3++;
            }
        } else if (i == 1) {
            int i4 = 0;
            for (java.lang.Object obj2 : list) {
                if (i4 < 0) {
                    yDY.AYXKKw();
                }
                C37982pHx c37982pHx2 = (C37982pHx) obj2;
                if (c37982pHx2 != null && (listKWHzl = c37982pHx2.KWHzl()) != null) {
                    java.util.Iterator<T> it2 = listKWHzl.iterator();
                    while (it2.hasNext()) {
                        java.util.List list4 = (java.util.List) it2.next();
                        if (list4.size() >= 2) {
                            oUF ouf2 = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                            if (!Intrinsics.EZpvd(ouf2 != null ? ouf2.fIwbmz() : null, list4.get(i2))) {
                                arrayList.add(new oUF((java.lang.String) list4.get(i2), null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) list4.get(1), (java.lang.String) list4.get(2), C33129mqd.AEQbTJ(list4.get(1)) + C33129mqd.AEQbTJ(list4.get(2)), 16382, null));
                                i2 = 0;
                            }
                        }
                    }
                }
                i4++;
                i2 = 0;
            }
        } else if (i == 2) {
            int i5 = 0;
            for (java.lang.Object obj3 : list) {
                if (i5 < 0) {
                    yDY.AYXKKw();
                }
                C37982pHx c37982pHx3 = (C37982pHx) obj3;
                if (c37982pHx3 != null && (listOLrzqt = c37982pHx3.OLrzqt()) != null) {
                    java.util.Iterator<T> it3 = listOLrzqt.iterator();
                    while (it3.hasNext()) {
                        java.util.List list5 = (java.util.List) it3.next();
                        if (list5.size() >= 3) {
                            oUF ouf3 = (oUF) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                            if (!Intrinsics.EZpvd(ouf3 != null ? ouf3.fIwbmz() : null, list5.get(0))) {
                                arrayList.add(new oUF((java.lang.String) list5.get(0), null, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, null, null, null, AudioStats.AUDIO_AMPLITUDE_NONE, (java.lang.String) list5.get(1), (java.lang.String) list5.get(2), C33129mqd.AEQbTJ(list5.get(1)) + C33129mqd.AEQbTJ(list5.get(2)), 16382, null));
                            }
                        }
                    }
                }
                i5++;
            }
        }
        AhwBna.postValue(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [344=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2040464843:
                return !str.equals("LSAcco") ? str : "Top Acc. L/S";
            case -1266155568:
                return !str.equals("ENVELOPE") ? str : C33070mpX.AYXKKw(C35964oKf.Fragment.HJWChPQPAeHI);
            case -1213730046:
                return !str.equals("SUPERTREND") ? str : C33070mpX.AYXKKw(C35964oKf.Fragment.hGuIrQ);
            case 2655:
                return !str.equals("SR") ? str : C33070mpX.AYXKKw(C35964oKf.Fragment.geAOna);
            case 2647728:
                return !str.equals("VWAP") ? str : C33070mpX.AYXKKw(C35964oKf.Fragment.v);
            case 63511234:
                return !str.equals("BSVol") ? str : "Taker B/S";
            case 72740685:
                return !str.equals("LSPos") ? str : "Top Pos. L/S";
            case 1185755844:
                return !str.equals("LSRatio") ? str : "Acc. L/S";
            default:
                return str;
        }
    }
}
