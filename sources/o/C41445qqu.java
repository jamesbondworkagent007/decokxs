package o;

import com.okinc.market.quotation.data.model.DexChainGroupV2Po;
import com.okinc.market.quotation.data.model.DexRiskPo;
import com.okinc.market.quotation.data.model.DexTokenListRequest;
import com.okinc.market.quotation.data.model.DexTokenPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41445qqu {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qqr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C41445qqu.OLrzqt();
        }
    });

    @yCM
    public C41445qqu() {
    }

    public final InterfaceC41440qqp KWHzl() {
        return (InterfaceC41440qqp) this.KWHzl.getValue();
    }

    public static final InterfaceC41440qqp OLrzqt() {
        return (InterfaceC41440qqp) C38416pXz.copydefault(C56524yIo.AEQbTJ(InterfaceC41440qqp.class));
    }

    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, boolean z, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation) {
        if (num != null) {
            return KWHzl().OLrzqt(str, str2, str3, num.intValue(), z, continuation);
        }
        return KWHzl().KWHzl(str, str2, str3, z, continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation) {
        return KWHzl().OLrzqt(str, continuation);
    }

    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation) {
        return KWHzl().OLrzqt(str, str2, continuation);
    }

    public java.lang.Object AEQbTJ(@NotNull Continuation<? super ResponseData<java.util.List<DexChainGroupV2Po>>> continuation) {
        return KWHzl().OLrzqt(continuation);
    }

    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super ResponseData<DexRiskPo>> continuation) {
        return KWHzl().copydefault(str, str2, continuation);
    }

    public java.lang.Object EZpvd(@NotNull java.util.List<DexTokenListRequest> list, @NotNull Continuation<? super ResponseData<java.util.List<DexTokenPo>>> continuation) {
        return KWHzl().copydefault(list, continuation);
    }
}
