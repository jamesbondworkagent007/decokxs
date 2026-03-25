package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.okinc.business.market.data.model.position_pnl.LatestPnLData;
import com.okinc.business.market.data.model.position_pnl.PnLExtraParams;
import com.okinc.business.market.features.position.domain.model.LatestPnL;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29135knt {
    public final Gson AEQbTJ;
    public final Json OLrzqt;

    public C29135knt(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.OLrzqt = json;
        this.AEQbTJ = gson;
    }

    public final PnLDetailsUiModel copydefault(@NotNull LatestPnL latestPnL) {
        Intrinsics.checkNotNullParameter(latestPnL, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairAEQbTJ = AEQbTJ(latestPnL.djBIcL(), latestPnL.AEQbTJ(), latestPnL.valueOf());
        java.lang.String strComponent1 = pairAEQbTJ.component1();
        java.lang.String strComponent2 = pairAEQbTJ.component2();
        return new PnLDetailsUiModel(latestPnL.AkhnZx(), latestPnL.gEmmrt(), strComponent1, strComponent2, latestPnL.OLrzqt(), latestPnL.KWHzl(), latestPnL.djBIcL(), latestPnL.isConnected(), latestPnL.AEQbTJ(), latestPnL.AYXKKw(), latestPnL.EZpvd(), latestPnL.copydefault(), latestPnL.valueOf(), latestPnL.AhwBna(), null, null, null, null, null, 507904, null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0 || str2.length() == 0 || str3.length() == 0) {
            return C56390yDp.OLrzqt("", "");
        }
        java.lang.String strAddCheckS$default = C23313hvq.addCheckS$default(str2, str, null, null, null, 14, null);
        return C56390yDp.OLrzqt(strAddCheckS$default, C23313hvq.divCheckS$default(C23313hvq.mulCheckS$default(strAddCheckS$default, 100, null, null, null, 14, null), str3, null, null, null, 14, null));
    }

    public final LatestPnL AEQbTJ(@NotNull LatestPnLData latestPnLData) {
        Intrinsics.checkNotNullParameter(latestPnLData, "");
        return new LatestPnL(latestPnLData.OLrzqt(), latestPnLData.KWHzl(), latestPnLData.gEmmrt(), latestPnLData.DbNXlk(), latestPnLData.AYXKKw(), latestPnLData.AhwBna(), latestPnLData.AEQbTJ(), latestPnLData.copydefault(), latestPnLData.EZpvd(), latestPnLData.valueOf(), latestPnLData.djBIcL(), latestPnLData.AkhnZx());
    }

    public final JsonObject KWHzl(@NotNull PnLExtraParams pnLExtraParams) {
        Intrinsics.checkNotNullParameter(pnLExtraParams, "");
        java.lang.Object objFromJson = this.AEQbTJ.fromJson(this.OLrzqt.encodeToString(PnLExtraParams.Companion.serializer(), pnLExtraParams), (java.lang.Class<java.lang.Object>) JsonObject.class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
        return (JsonObject) objFromJson;
    }
}
