package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.SpotGridPauseResumeDto;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56221xyi extends xKE<java.util.List<? extends StrategyResponse>> {
    public SpotGridPauseResumeDto OLrzqt;

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = new SpotGridPauseResumeDto(str, (java.lang.String) null, 2, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StrategyResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StrategyResponse>>> EZpvd() {
        SpotGridPauseResumeDto spotGridPauseResumeDto = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        SpotGridPauseResumeDto spotGridPauseResumeDto2 = this.OLrzqt;
        if (spotGridPauseResumeDto2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            spotGridPauseResumeDto = spotGridPauseResumeDto2;
        }
        return bizApiService.pauseSpotGrid(spotGridPauseResumeDto);
    }
}
