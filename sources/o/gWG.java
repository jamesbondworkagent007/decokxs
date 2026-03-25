package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsOriginData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPnLData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsPositionData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.WsPnlStatDto;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes5.dex */
public final class gWG {
    @yCM
    public gWG() {
    }

    public final WsPnlStatDto AEQbTJ(TeeWsOriginData teeWsOriginData) {
        JsonObject data;
        if (teeWsOriginData == null || (data = teeWsOriginData.getData()) == null) {
            return null;
        }
        return ((TeeWsPnLData) C43284rmQ.KWHzl().decodeFromJsonElement(TeeWsPnLData.Companion.serializer(), data)).getPnlStatDTO();
    }

    public final TeeWsPositionData EZpvd(TeeWsOriginData teeWsOriginData) {
        JsonObject data;
        if (teeWsOriginData == null || (data = teeWsOriginData.getData()) == null) {
            return null;
        }
        return (TeeWsPositionData) C43284rmQ.KWHzl().decodeFromJsonElement(TeeWsPositionData.Companion.serializer(), data);
    }
}
