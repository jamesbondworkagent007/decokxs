package o;

import com.okinc.business.defi.wallet.common.okxconnect.track.ChainInfo;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.ebv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16016ebv {
    public static final java.lang.String KWHzl(java.util.List<C10854bwM> list) {
        Json.Default r0 = Json.Default;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C10854bwM c10854bwM : list) {
            arrayList.add(new ChainInfo(c10854bwM.fJNWhG(), c10854bwM.fetchVPNInfo()));
        }
        r0.getSerializersModule();
        return r0.encodeToString(new ArrayListSerializer(ChainInfo.Companion.serializer()), arrayList);
    }
}
