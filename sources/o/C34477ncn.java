package o;

import com.google.gson.Gson;
import com.okinc.dexkline.market.data.model.position_pnl.LatestPnLData;
import com.okinc.dexkline.market.features.position.domain.model.LatestPnL;
import com.okinc.dexkline.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34477ncn {
    public final Gson AEQbTJ;
    public final Json copydefault;

    public C34477ncn(@NotNull Json json, @NotNull Gson gson) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(gson, "");
        this.copydefault = json;
        this.AEQbTJ = gson;
    }

    public final PnLDetailsUiModel copydefault(@NotNull LatestPnL latestPnL) {
        Intrinsics.checkNotNullParameter(latestPnL, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = KWHzl(latestPnL.djBIcL(), latestPnL.OLrzqt(), latestPnL.gEmmrt());
        java.lang.String strComponent1 = pairKWHzl.component1();
        java.lang.String strComponent2 = pairKWHzl.component2();
        return new PnLDetailsUiModel(latestPnL.values(), latestPnL.AYXKKw(), strComponent1, strComponent2, latestPnL.copydefault(), latestPnL.AEQbTJ(), latestPnL.djBIcL(), latestPnL.fetchVPNInfo(), latestPnL.OLrzqt(), latestPnL.AhwBna(), latestPnL.EZpvd(), latestPnL.KWHzl(), latestPnL.gEmmrt(), latestPnL.valueOf());
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0 || str2.length() == 0 || str3.length() == 0) {
            return C56390yDp.OLrzqt("", "");
        }
        java.lang.String strAddCheckS$default = mRE.addCheckS$default(str2, str, null, null, null, 14, null);
        return C56390yDp.OLrzqt(strAddCheckS$default, mRE.divCheckS$default(mRE.mulCheckS$default(strAddCheckS$default, 100, null, null, null, 14, null), str3, null, null, null, 14, null));
    }

    public final LatestPnL AEQbTJ(@NotNull LatestPnLData latestPnLData) {
        Intrinsics.checkNotNullParameter(latestPnLData, "");
        return new LatestPnL(latestPnLData.KWHzl(), latestPnLData.EZpvd(), latestPnLData.AhwBna(), latestPnLData.isConnected(), latestPnLData.valueOf(), latestPnLData.gEmmrt(), latestPnLData.OLrzqt(), latestPnLData.AEQbTJ(), latestPnLData.copydefault(), latestPnLData.djBIcL(), latestPnLData.AYXKKw(), latestPnLData.AkhnZx());
    }
}
