package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.bot.LockVoucherBody;
import com.okinc.unify_trade.biz.bot.LockVoucherResponse;
import com.okinc.unify_trade.net.BizApiService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C56192xyF extends xKE<java.util.List<? extends LockVoucherResponse>> {
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Return type fixed from 'o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.unify_trade.biz.bot.LockVoucherResponse>>>' to match base method */
    @Override // o.xKE
    public AbstractC58185ywX<ResponseData<java.util.List<? extends LockVoucherResponse>>> EZpvd() {
        BizApiService bizApiService = (BizApiService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizApiService.class));
        java.lang.String str = this.copydefault;
        if (str == null) {
            str = "";
        }
        return bizApiService.lockVoucher(new LockVoucherBody(str, null));
    }
}
