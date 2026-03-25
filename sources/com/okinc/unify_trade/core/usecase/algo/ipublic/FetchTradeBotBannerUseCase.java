package com.okinc.unify_trade.core.usecase.algo.ipublic;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.MPBotBannerResult;
import com.okinc.unify_trade.net.BizApiService;
import java.util.List;
import o.AbstractC58185ywX;
import o.C43393roT;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC56445yFq;
import o.xKE;

/* JADX INFO: loaded from: classes19.dex */
public final class FetchTradeBotBannerUseCase extends xKE<List<? extends MPBotBannerResult>> {
    public String AEQbTJ;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Types {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Types[] $VALUES;
        public static final Types BANNER = new Types("BANNER", 0, "banner");
        public static final Types LOSS_INSURANCE = new Types("LOSS_INSURANCE", 1, "loss_insurance");
        private final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Types[] $values() {
            return new Types[]{BANNER, LOSS_INSURANCE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Types> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        private Types(String str, int i, String str2) {
            this.type = str2;
        }

        static {
            Types[] typesArr$values = $values();
            $VALUES = typesArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(typesArr$values);
        }

        public static Types valueOf(String str) {
            return (Types) Enum.valueOf(Types.class, str);
        }

        public static Types[] values() {
            return (Types[]) $VALUES.clone();
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.MPBotBannerResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<List<? extends MPBotBannerResult>>> EZpvd() {
        return ((BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null)).fetchMPBanner(this.AEQbTJ);
    }
}
