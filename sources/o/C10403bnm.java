package o;

import com.okinc.business.defi.biz.net.bean.TokenAsset;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bnm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10403bnm {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.bnl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10403bnm.copydefault();
        }
    });

    public static final java.util.HashMap copydefault() {
        return new java.util.HashMap();
    }

    public final java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>>> OLrzqt() {
        return (java.util.HashMap) this.KWHzl.getValue();
    }

    public final TokenAsset OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
        java.util.HashMap<java.lang.String, TokenAsset> map;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map2 = OLrzqt().get(str);
        if (map2 == null || (map = map2.get(java.lang.Long.valueOf(j))) == null) {
            return null;
        }
        return map.get(str2);
    }

    public final java.util.List<TokenAsset> OLrzqt(@NotNull java.lang.String str, long j) {
        java.util.HashMap<java.lang.String, TokenAsset> map;
        java.util.Collection<TokenAsset> collectionValues;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map2 = OLrzqt().get(str);
        if (map2 == null || (map = map2.get(java.lang.Long.valueOf(j))) == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    public final java.util.List<TokenAsset> AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map = OLrzqt().get(str);
        if (map != null) {
            java.util.Iterator<Map.Entry<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().getValue().values());
            }
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull java.lang.String str, long j, @NotNull TokenAsset tokenAsset) {
        java.util.HashMap<java.lang.String, TokenAsset> map;
        java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenAsset, "");
        if (OLrzqt().get(str) == null) {
            OLrzqt().put(str, new java.util.HashMap<>());
        }
        java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map3 = OLrzqt().get(str);
        if ((map3 != null ? map3.get(java.lang.Long.valueOf(j)) : null) == null && (map2 = OLrzqt().get(str)) != null) {
            map2.put(java.lang.Long.valueOf(j), new java.util.HashMap<>());
        }
        java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map4 = OLrzqt().get(str);
        if (map4 == null || (map = map4.get(java.lang.Long.valueOf(j))) == null) {
            return;
        }
        map.put(tokenAsset.getAddress(), tokenAsset);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        OLrzqt().put(str, map);
    }
}
