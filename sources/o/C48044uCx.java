package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.MarketSignalConfigUiModel;
import com.okinc.tradingbot.impl.aiBot.domain.model.TimeframeModel;
import com.okinc.tradingbot.impl.aiBot.dto.AiHomeDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uCx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48044uCx {
    public static final C48044uCx copydefault = new C48044uCx();

    private C48044uCx() {
    }

    public final MarketSignalConfigUiModel OLrzqt(@NotNull AiHomeDto aiHomeDto) {
        Intrinsics.checkNotNullParameter(aiHomeDto, "");
        java.util.List<java.lang.String> listKWHzl = aiHomeDto.KWHzl();
        java.util.List<java.lang.String> listAYXKKw = aiHomeDto.AYXKKw();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        int i = 0;
        for (java.lang.Object obj : listAYXKKw) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new TimeframeModel(i, (java.lang.String) obj));
            i++;
        }
        return new MarketSignalConfigUiModel(listKWHzl, arrayList, aiHomeDto.DbNXlk(), aiHomeDto.fetchVPNInfo());
    }
}
