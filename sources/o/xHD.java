package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.unify_trade.biz.subscribe.DexAssets;
import com.okinc.unify_trade.biz.subscribe.DexAssetsResponse;
import com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceRequest;
import com.okinc.unify_trade.dex.assets.data.model.DexTokenPriceResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o.xHB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xHD {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xHA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xHD.copydefault();
        }
    });

    @yCM
    public xHD() {
    }

    public final xHB OLrzqt() {
        return (xHB) this.KWHzl.getValue();
    }

    public static final xHB copydefault() {
        return (xHB) C43417ror.OLrzqt(C56524yIo.AEQbTJ(xHB.class));
    }

    public java.lang.Object copydefault(@NotNull DexTokenPriceRequest dexTokenPriceRequest, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPriceResponse>>> continuation) {
        return OLrzqt().AEQbTJ(dexTokenPriceRequest, continuation);
    }

    public java.lang.Object copydefault(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<DexAssetsResponse>>> continuation) {
        return xHB.ActionBar.getDexAssets$default(OLrzqt(), num, num2, num3, str, null, continuation, 16, null);
    }

    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexAssets>>> continuation) {
        return xHB.ActionBar.getDexAsset$default(OLrzqt(), str, str2, null, continuation, 4, null);
    }
}
