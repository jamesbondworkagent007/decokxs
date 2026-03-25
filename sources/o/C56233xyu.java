package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.bot.SpotGridPauseResumeDto;
import com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56233xyu extends xKE<java.util.List<? extends ResumeSpotGridData>> {
    public SpotGridPauseResumeDto OLrzqt;

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C33129mqd.AEQbTJ(str2, "0")) {
            this.OLrzqt = new SpotGridPauseResumeDto(str, str2);
        } else {
            this.OLrzqt = new SpotGridPauseResumeDto(str, (java.lang.String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.bot.grid.bean.ResumeSpotGridData>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends ResumeSpotGridData>>> EZpvd() {
        SpotGridPauseResumeDto spotGridPauseResumeDto = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        SpotGridPauseResumeDto spotGridPauseResumeDto2 = this.OLrzqt;
        if (spotGridPauseResumeDto2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            spotGridPauseResumeDto = spotGridPauseResumeDto2;
        }
        return bizApiService.resumeSpotGrid(spotGridPauseResumeDto);
    }
}
