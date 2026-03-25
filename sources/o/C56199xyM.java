package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StgyFavouriteReq;
import com.okinc.unify_trade.biz.StgyFavouriteResult;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56199xyM extends xKE<java.util.List<? extends StgyFavouriteResult>> {
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56199xyM AEQbTJ(java.lang.String str) {
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56199xyM OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StgyFavouriteResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StgyFavouriteResult>>> EZpvd() {
        java.lang.String str = null;
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str2 = this.copydefault;
        if (str2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            str = str2;
        }
        return bizApiService.deleteStgyFavourite(new StgyFavouriteReq(str, this.OLrzqt));
    }
}
