package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.components.security.scanner.AccessibilityAppType;
import com.okinc.components.security.scanner.BlackAppType;
import com.okinc.components.security.scanner.EnsecureAppInfo;
import com.okinc.core.util.SPUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32788mkG {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.mkG$StateListAnimator */
    public static final class StateListAnimator {

        /* JADX INFO: renamed from: o.mkG$StateListAnimator$ActionBar */
        public static final class ActionBar extends TypeToken<java.util.Map<java.lang.String, ? extends EnsecureAppInfo.ScanResult>> {
        }

        /* JADX INFO: renamed from: o.mkG$StateListAnimator$Application */
        public static final class Application extends TypeToken<java.util.Map<java.lang.String, TaskDescription>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mkG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.mkG$StateListAnimator$TaskDescription */
        /* JADX INFO: loaded from: classes15.dex */
        public static final class TaskDescription {
            public final long KWHzl;
            public final int OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, long j, int i, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    j = taskDescription.KWHzl;
                }
                if ((i2 & 2) != 0) {
                    i = taskDescription.OLrzqt;
                }
                return taskDescription.AEQbTJ(j, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(long j, int i) {
                return new TaskDescription(j, i);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return this.KWHzl == taskDescription.KWHzl && this.OLrzqt == taskDescription.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (java.lang.Long.hashCode(this.KWHzl) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "IgnoredSceneData(timestamp=" + this.KWHzl + ", count=" + this.OLrzqt + ")";
            }

            public TaskDescription(long j, int i) {
                this.KWHzl = j;
                this.OLrzqt = i;
            }
        }

        public final boolean copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String string = SPUtils.getString(str, null, "dsapps");
            return (string == null || string.length() == 0 || java.lang.System.currentTimeMillis() - 604800000 >= java.lang.Long.parseLong(string)) ? false : true;
        }

        public final void AhwBna(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            SPUtils.put(str, java.lang.String.valueOf(java.lang.System.currentTimeMillis()), "dsapps");
        }

        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            SPUtils.remove(str, "dsapps");
        }

        public static /* synthetic */ int getRiskCount$default(StateListAnimator stateListAnimator, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "lastRecord_active";
            }
            return stateListAnimator.copydefault(z, str);
        }

        public final int copydefault(boolean z, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            kotlin.Pair<java.lang.Long, java.util.Map<java.lang.String, EnsecureAppInfo.ScanResult>> pairDjBIcL = djBIcL(str);
            if (pairDjBIcL.getFirst().longValue() == 0 || pairDjBIcL.getSecond().isEmpty()) {
                return 0;
            }
            java.util.Map<java.lang.String, EnsecureAppInfo.ScanResult> second = pairDjBIcL.getSecond();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<java.lang.String, EnsecureAppInfo.ScanResult> entry : second.entrySet()) {
                if (z || !C32788mkG.Companion.copydefault(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return linkedHashMap.size();
        }

        public static /* synthetic */ void recordLastScanTimestamp$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "lastTime_active";
            }
            stateListAnimator.valueOf(str);
        }

        public final void valueOf(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            SPUtils.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "dsapps");
        }

        public static /* synthetic */ long getLastScanTimestamp$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "lastTime_active";
            }
            return stateListAnimator.AEQbTJ(str);
        }

        public final long AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.Long l = SPUtils.getLong(str, 0L, "dsapps");
            Intrinsics.checkNotNullExpressionValue(l, "");
            return l.longValue();
        }

        public static /* synthetic */ void recordScanResult$default(StateListAnimator stateListAnimator, java.util.Map map, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "lastRecord_active";
            }
            stateListAnimator.EZpvd(map, str);
        }

        public final void EZpvd(@NotNull java.util.Map<java.lang.String, EnsecureAppInfo.ScanResult> map, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "lastRecord_active") ? "lastTime_active" : "lastTime_background");
            SPUtils.put(str, new Gson().toJson(map), "dsapps");
        }

        public static /* synthetic */ kotlin.Pair readScanResult$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "lastRecord_active";
            }
            return stateListAnimator.djBIcL(str);
        }

        public final kotlin.Pair<java.lang.Long, java.util.Map<java.lang.String, EnsecureAppInfo.ScanResult>> djBIcL(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String string = SPUtils.getString(str, null, "dsapps");
            return new kotlin.Pair<>(java.lang.Long.valueOf(AEQbTJ(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "lastRecord_active") ? "lastTime_active" : "lastTime_background")), new Gson().fromJson(string, new ActionBar().getType()));
        }

        public static /* synthetic */ void recordScanStatus$default(StateListAnimator stateListAnimator, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                str = "status";
            }
            stateListAnimator.OLrzqt(i, str);
        }

        public final void OLrzqt(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            SPUtils.put(str, java.lang.Integer.valueOf(i), "dsapps");
        }

        public static /* synthetic */ int readScanstatus$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "status";
            }
            return stateListAnimator.gEmmrt(str);
        }

        public final int gEmmrt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.Integer num = SPUtils.getInt(str, 0, "dsapps");
            Intrinsics.checkNotNullExpressionValue(num, "");
            return num.intValue();
        }

        public final java.util.Map<java.lang.Integer, java.util.List<EnsecureAppInfo>> OLrzqt(java.util.List<EnsecureAppInfo> list, java.util.List<EnsecureAppInfo> list2) {
            java.util.Collection collectionFJNWhG;
            if (list != null && !list.isEmpty()) {
                collectionFJNWhG = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!((EnsecureAppInfo) obj).isIgnored()) {
                        collectionFJNWhG.add(obj);
                    }
                }
            } else if (list2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    if (!C32788mkG.Companion.copydefault(((EnsecureAppInfo) obj2).getPackageName())) {
                        arrayList.add(obj2);
                    }
                }
                collectionFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
            } else {
                collectionFJNWhG = null;
            }
            if (collectionFJNWhG == null || collectionFJNWhG.isEmpty()) {
                return C56424yEw.KWHzl();
            }
            java.util.List<java.lang.Integer> listOLrzqt = C32808mka.Companion.OLrzqt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listOLrzqt, 10)), 16));
            for (java.lang.Object obj3 : listOLrzqt) {
                int iIntValue = ((java.lang.Number) obj3).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj4 : collectionFJNWhG) {
                    java.lang.Integer numKWHzl = C32788mkG.Companion.KWHzl(((EnsecureAppInfo) obj4).getScanResult().getReason());
                    if (numKWHzl != null && numKWHzl.intValue() == iIntValue) {
                        arrayList2.add(obj4);
                    }
                }
                linkedHashMap.put(obj3, arrayList2);
            }
            return linkedHashMap;
        }

        public final java.lang.Integer KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AccessibilityAppType.MAL_TROJAN.getValue())) {
                return 1;
            }
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AccessibilityAppType.SUS_TROJAN.getValue())) {
                return 2;
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) BlackAppType.FAKE_IM.getValue()) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) BlackAppType.FAKE_WALLET.getValue())) {
                if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) BlackAppType.TROJAN.getValue()) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) BlackAppType.REMOTE_CONTROL.getValue()) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) BlackAppType.MNEMONIC_STEALER.getValue()) && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) BlackAppType.CLIPBOARD.getValue())) {
                    return 4;
                }
                return 4;
            }
            return 3;
        }

        public final void AYXKKw(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            java.util.Map<java.lang.String, TaskDescription> mapOLrzqt = OLrzqt();
            TaskDescription taskDescription = mapOLrzqt.get(str);
            mapOLrzqt.put(str, new TaskDescription(java.lang.System.currentTimeMillis(), (taskDescription != null ? taskDescription.KWHzl() : 0) + 1));
            SPUtils.put("lastTime_Ignored", new Gson().toJson(mapOLrzqt), "dsapps");
        }

        public final kotlin.Pair<java.lang.Long, java.lang.Integer> OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            TaskDescription taskDescription = OLrzqt().get(str);
            if (taskDescription != null) {
                return new kotlin.Pair<>(java.lang.Long.valueOf(taskDescription.copydefault()), java.lang.Integer.valueOf(taskDescription.KWHzl()));
            }
            return new kotlin.Pair<>(0L, 0);
        }

        public final java.util.Map<java.lang.String, TaskDescription> OLrzqt() {
            java.lang.String string = SPUtils.getString("lastTime_Ignored", null, "dsapps");
            if (string == null || string.length() == 0) {
                return new LinkedHashMap();
            }
            try {
                java.util.Map<java.lang.String, TaskDescription> map = (java.util.Map) new Gson().fromJson(string, new Application().getType());
                return map == null ? new LinkedHashMap() : map;
            } catch (java.lang.Exception unused) {
                return new LinkedHashMap();
            }
        }
    }
}
