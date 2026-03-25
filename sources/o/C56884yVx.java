package o;

import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yVx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56884yVx {
    public final java.util.Map<java.lang.String, C56882yVv> EZpvd = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, C56882yVv> EZpvd() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.yVx$Activity */
    public final class Activity {
        public final java.lang.String AEQbTJ;
        public final /* synthetic */ C56884yVx KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull C56884yVx c56884yVx, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = c56884yVx;
            this.AEQbTJ = str;
        }

        public static /* synthetic */ void function$default(Activity activity, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            activity.AEQbTJ(str, str2, function1);
        }

        public final void AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull Function1<? super TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function1, "");
            java.util.Map map = this.KWHzl.EZpvd;
            TaskDescription taskDescription = new TaskDescription(this, str, str2);
            function1.invoke(taskDescription);
            kotlin.Pair<java.lang.String, C56882yVv> pairEZpvd = taskDescription.EZpvd();
            map.put(pairEZpvd.getFirst(), pairEZpvd.getSecond());
        }

        /* JADX INFO: renamed from: o.yVx$Activity$TaskDescription */
        public final class TaskDescription {
            public final java.lang.String AEQbTJ;
            public final /* synthetic */ Activity EZpvd;
            public kotlin.Pair<java.lang.String, yVF> KWHzl;
            public final java.lang.String OLrzqt;
            public final java.util.List<kotlin.Pair<java.lang.String, yVF>> copydefault;

            public TaskDescription(@NotNull Activity activity, java.lang.String str, java.lang.String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = activity;
                this.OLrzqt = str;
                this.AEQbTJ = str2;
                this.copydefault = new java.util.ArrayList();
                this.KWHzl = C56390yDp.OLrzqt(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);
            }

            public final void EZpvd(@NotNull java.lang.String str, @NotNull C56857yUx... c56857yUxArr) {
                yVF yvf;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(c56857yUxArr, "");
                java.util.List<kotlin.Pair<java.lang.String, yVF>> list = this.copydefault;
                if (c56857yUxArr.length == 0) {
                    yvf = null;
                } else {
                    java.lang.Iterable<IndexedValue> iterableORxRYg = yDV.ORxRYg(c56857yUxArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterableORxRYg, 10)), 16));
                    for (IndexedValue indexedValue : iterableORxRYg) {
                        int iOLrzqt = indexedValue.OLrzqt();
                        linkedHashMap.put(java.lang.Integer.valueOf(iOLrzqt), (C56857yUx) indexedValue.AEQbTJ());
                    }
                    yvf = new yVF(linkedHashMap);
                }
                list.add(C56390yDp.OLrzqt(str, yvf));
            }

            public final void KWHzl(@NotNull java.lang.String str, @NotNull C56857yUx... c56857yUxArr) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(c56857yUxArr, "");
                java.lang.Iterable<IndexedValue> iterableORxRYg = yDV.ORxRYg(c56857yUxArr);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterableORxRYg, 10)), 16));
                for (IndexedValue indexedValue : iterableORxRYg) {
                    int iOLrzqt = indexedValue.OLrzqt();
                    linkedHashMap.put(java.lang.Integer.valueOf(iOLrzqt), (C56857yUx) indexedValue.AEQbTJ());
                }
                this.KWHzl = C56390yDp.OLrzqt(str, new yVF(linkedHashMap));
            }

            public final void KWHzl(@NotNull JvmPrimitiveType jvmPrimitiveType) {
                Intrinsics.checkNotNullParameter(jvmPrimitiveType, "");
                java.lang.String desc = jvmPrimitiveType.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "");
                this.KWHzl = C56390yDp.OLrzqt(desc, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [338=4] */
            public final kotlin.Pair<java.lang.String, C56882yVv> EZpvd() {
                C56894yWg c56894yWg = C56894yWg.AEQbTJ;
                java.lang.String strCopydefault = this.EZpvd.copydefault();
                java.lang.String str = this.OLrzqt;
                java.util.List<kotlin.Pair<java.lang.String, yVF>> list = this.copydefault;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getFirst());
                }
                java.lang.String strCopydefault2 = c56894yWg.copydefault(strCopydefault, c56894yWg.EZpvd(str, arrayList, this.KWHzl.getFirst()));
                yVF second = this.KWHzl.getSecond();
                java.util.List<kotlin.Pair<java.lang.String, yVF>> list2 = this.copydefault;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((yVF) ((kotlin.Pair) it2.next()).getSecond());
                }
                return C56390yDp.OLrzqt(strCopydefault2, new C56882yVv(second, arrayList2, this.AEQbTJ));
            }
        }
    }
}
