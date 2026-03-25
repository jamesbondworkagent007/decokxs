package com.reown.android.pairing.model.mapper;

import com.reown.android.Core;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.pairing.engine.model.EngineDO;
import com.reown.foundation.common.model.Topic;
import com.reown.utils.UtilFunctionsKt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.yDY;

/* JADX INFO: loaded from: classes12.dex */
public final class PairingMapperKt {
    public static final /* synthetic */ Core.Model.DeletedPairing toCore(EngineDO.PairingDelete pairingDelete) {
        Intrinsics.checkNotNullParameter(pairingDelete, "");
        return new Core.Model.DeletedPairing(pairingDelete.getTopic(), pairingDelete.getReason());
    }

    public static final /* synthetic */ Core.Model.Pairing toCore(Pairing pairing) {
        Intrinsics.checkNotNullParameter(pairing, "");
        String value = pairing.getTopic().getValue();
        long seconds = pairing.getExpiry().getSeconds();
        AppMetaData peerAppMetaData = pairing.getPeerAppMetaData();
        Core.Model.AppMetaData core = peerAppMetaData != null ? toCore(peerAppMetaData) : null;
        String relayProtocol = pairing.getRelayProtocol();
        String relayData = pairing.getRelayData();
        String uri = pairing.getUri();
        String methods = pairing.getMethods();
        if (methods == null) {
            methods = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        return new Core.Model.Pairing(value, seconds, core, relayProtocol, relayData, uri, true, methods);
    }

    public static final /* synthetic */ Pairing toPairing(Core.Model.Pairing pairing) {
        Intrinsics.checkNotNullParameter(pairing, "");
        Topic topic = new Topic(pairing.getTopic());
        Expiry expiry = new Expiry(pairing.getExpiry());
        Core.Model.AppMetaData peerAppMetaData = pairing.getPeerAppMetaData();
        return new Pairing(topic, expiry, peerAppMetaData != null ? toAppMetaData(peerAppMetaData) : null, pairing.getRelayProtocol(), pairing.getRelayData(), pairing.getUri(), false, pairing.getRegisteredMethods(), 64, null);
    }

    public static final /* synthetic */ AppMetaData toAppMetaData(Core.Model.AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(appMetaData, "");
        return new AppMetaData(appMetaData.getDescription(), appMetaData.getUrl(), appMetaData.getIcons(), appMetaData.getName(), new Redirect(appMetaData.getRedirect(), null, false, 6, null), null, 32, null);
    }

    public static final /* synthetic */ Core.Model.AppMetaData toCore(AppMetaData appMetaData) {
        String empty;
        String empty2;
        String empty3;
        List<String> listAhwBna;
        Redirect redirect;
        if (appMetaData == null || (empty = appMetaData.getName()) == null) {
            empty = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str = empty;
        if (appMetaData == null || (empty2 = appMetaData.getDescription()) == null) {
            empty2 = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str2 = empty2;
        if (appMetaData == null || (empty3 = appMetaData.getUrl()) == null) {
            empty3 = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str3 = empty3;
        if (appMetaData == null || (listAhwBna = appMetaData.getIcons()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        return new Core.Model.AppMetaData(str, str2, str3, listAhwBna, (appMetaData == null || (redirect = appMetaData.getRedirect()) == null) ? null : redirect.getNative(), null, false, null, 224, null);
    }
}
