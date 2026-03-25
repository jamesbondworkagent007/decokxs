package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.StgyFavouriteReq;
import com.okinc.unify_trade.biz.StgyFavouriteResult;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56272xzg extends xKE<java.util.List<? extends StgyFavouriteResult>> {
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56272xzg KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        return this;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.StgyFavouriteResult>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends StgyFavouriteResult>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null);
        java.lang.String str = this.OLrzqt;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        return bizApiService.setStgyFavourite(new StgyFavouriteReq(str, (java.lang.String) null, 2, (DefaultConstructorMarker) null));
    }
}
