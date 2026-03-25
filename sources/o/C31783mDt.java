package o;

import com.okinc.crcore.shared.formatter.AmountDisplayType;
import com.okinc.crcore.shared.formatter.AssetDisplayType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC31777mDn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31783mDt {
    public final java.util.Map<AssetDisplayType, java.util.Map<AmountDisplayType, AbstractC31777mDn>> KWHzl;

    public C31783mDt(@NotNull java.util.Map<AssetDisplayType, ? extends java.util.Map<AmountDisplayType, ? extends AbstractC31777mDn>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), C56424yEw.isConnected((java.util.Map) entry.getValue()));
        }
        this.KWHzl = C56424yEw.isConnected(linkedHashMap);
    }

    public final AbstractC31777mDn copydefault(@NotNull AssetDisplayType assetDisplayType, @NotNull AmountDisplayType amountDisplayType) {
        AbstractC31777mDn abstractC31777mDn;
        Intrinsics.checkNotNullParameter(assetDisplayType, "");
        Intrinsics.checkNotNullParameter(amountDisplayType, "");
        java.util.Map<AmountDisplayType, AbstractC31777mDn> map = this.KWHzl.get(assetDisplayType);
        return (map == null || (abstractC31777mDn = map.get(amountDisplayType)) == null) ? AbstractC31777mDn.StateListAnimator.KWHzl : abstractC31777mDn;
    }
}
