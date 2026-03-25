package o;

import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24695iig {
    public static final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return str + str2 + "10000";
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        java.util.List list2;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC22646hjL interfaceC22646hjLGEmmrt = C22380heK.OLrzqt.copydefault(str).EZpvd(z).gEmmrt();
        if (interfaceC22646hjLGEmmrt.EZpvd()) {
            return "--";
        }
        if (interfaceC22646hjLGEmmrt.KWHzl().isEmpty() || ((list2 = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(interfaceC22646hjLGEmmrt.KWHzl().values())) != null && list2.isEmpty())) {
            return "0/0";
        }
        if (list == null || list.isEmpty()) {
            return ((java.util.List) CollectionsKt___CollectionsKt.dNCPSb(interfaceC22646hjLGEmmrt.KWHzl().values())).size() + "/" + ((java.util.List) CollectionsKt___CollectionsKt.dNCPSb(interfaceC22646hjLGEmmrt.KWHzl().values())).size();
        }
        return list.size() + "/" + ((java.util.List) CollectionsKt___CollectionsKt.dNCPSb(interfaceC22646hjLGEmmrt.KWHzl().values())).size();
    }

    public static final boolean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        boolean z = true;
        InterfaceC22646hjL interfaceC22646hjLGEmmrt = C22380heK.OLrzqt.copydefault(str).EZpvd(true).gEmmrt();
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) interfaceC22646hjLGEmmrt.KWHzl().getOrDefault(copydefault(str2, str2), yDY.AhwBna()));
        if (!(listFJNWhG instanceof java.util.Collection) || !listFJNWhG.isEmpty()) {
            java.util.Iterator it = listFJNWhG.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((LiquidityListItem) it.next()).isSelected()) {
                    z = false;
                    break;
                }
            }
        }
        return listFJNWhG.isEmpty() | z;
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(str, z).OLrzqt().getValue();
    }

    public static final C24694iif AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            InterfaceC22646hjL interfaceC22646hjLGEmmrt = C22380heK.OLrzqt.copydefault(str).EZpvd(z).gEmmrt();
            java.util.List<java.lang.String> value = interfaceC22646hjLGEmmrt.OLrzqt().getValue();
            java.lang.Integer numValueOf = value != null ? java.lang.Integer.valueOf(value.size()) : null;
            java.lang.Object objValueOf = C33129mqd.KWHzl((java.util.Collection) CollectionsKt___CollectionsKt.dNCPSb(interfaceC22646hjLGEmmrt.KWHzl().values())) ? java.lang.Integer.valueOf(((java.util.List) CollectionsKt___CollectionsKt.dNCPSb(interfaceC22646hjLGEmmrt.KWHzl().values())).size()) : DexSwapLiquiditySource.All;
            if (numValueOf != null) {
                return numValueOf.intValue() == C33129mqd.AhwBna(objValueOf) ? new C24694iif(numValueOf.intValue(), DexSwapLiquiditySource.All) : numValueOf.intValue() == 1 ? new C24694iif(1, DexSwapLiquiditySource.EQUAL_ONE) : new C24694iif(numValueOf.intValue(), DexSwapLiquiditySource.MORE_THAN_ONE);
            }
            return new C24694iif(C33129mqd.AhwBna(objValueOf), DexSwapLiquiditySource.All);
        } catch (java.lang.Exception unused) {
            return new C24694iif(0, DexSwapLiquiditySource.All);
        }
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC22646hjL interfaceC22646hjLGEmmrt = C22380heK.OLrzqt.copydefault(str).EZpvd(true).gEmmrt();
        java.util.List list = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(interfaceC22646hjLGEmmrt.KWHzl().values());
        java.util.List<java.lang.String> value = interfaceC22646hjLGEmmrt.OLrzqt().getValue();
        if (list == null || list.isEmpty() || value == null || value.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!value.contains(((LiquidityListItem) obj).getId())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LiquidityListItem) it.next()).getId());
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null);
    }

    public static final int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List list = (java.util.List) CollectionsKt___CollectionsKt.RcXXUw(C22380heK.OLrzqt.copydefault(str).EZpvd(true).gEmmrt().KWHzl().values());
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
