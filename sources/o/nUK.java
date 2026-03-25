package o;

import com.okinc.im.imui.group.joinreview.displaymodel.JoinRequestDisplayModel;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nUK {
    public static /* synthetic */ java.util.List updateSelection$default(java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return EZpvd(list, str, z);
    }

    public static /* synthetic */ java.util.List setLoading$default(java.util.List list, java.util.List list2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list2 = null;
        }
        return copydefault(list, list2, z);
    }

    public static final java.util.List<JoinRequestDisplayModel> EZpvd(@NotNull java.util.List<JoinRequestDisplayModel> list, @NotNull java.util.List<JoinRequestDisplayModel> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            JoinRequestDisplayModel joinRequestDisplayModel = (JoinRequestDisplayModel) obj;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((java.lang.Object) joinRequestDisplayModel.AEQbTJ(), (java.lang.Object) ((JoinRequestDisplayModel) it.next()).AEQbTJ())) {
                        break;
                    }
                }
            }
            arrayList.add(obj);
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) list2);
    }

    public static final java.util.List<JoinRequestDisplayModel> AEQbTJ(@NotNull java.util.List<JoinRequestDisplayModel> list, @NotNull java.util.List<java.lang.String> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!list2.contains(((JoinRequestDisplayModel) obj).AEQbTJ())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List<JoinRequestDisplayModel> EZpvd(@NotNull java.util.List<JoinRequestDisplayModel> list, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (JoinRequestDisplayModel joinRequestDisplayModelCopy$default : list) {
            if (str == null || Intrinsics.EZpvd((java.lang.Object) joinRequestDisplayModelCopy$default.AEQbTJ(), (java.lang.Object) str)) {
                joinRequestDisplayModelCopy$default = JoinRequestDisplayModel.copy$default(joinRequestDisplayModelCopy$default, null, null, null, null, z, false, 47, null);
            }
            arrayList.add(joinRequestDisplayModelCopy$default);
        }
        return arrayList;
    }

    public static final java.util.List<JoinRequestDisplayModel> copydefault(@NotNull java.util.List<JoinRequestDisplayModel> list, java.util.List<java.lang.String> list2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (JoinRequestDisplayModel joinRequestDisplayModelCopy$default : list) {
            if (list2 == null || list2.contains(joinRequestDisplayModelCopy$default.AEQbTJ())) {
                joinRequestDisplayModelCopy$default = JoinRequestDisplayModel.copy$default(joinRequestDisplayModelCopy$default, null, null, null, null, false, z, 31, null);
            }
            arrayList.add(joinRequestDisplayModelCopy$default);
        }
        return arrayList;
    }
}
