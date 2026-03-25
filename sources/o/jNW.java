package o;

import com.okinc.business.market.data.model.history.NativeTokenPriceData;
import com.okinc.business.market.features.coindetail.repo.CoinDetailRepository$getNativeTokenPrice$2;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jNW {
    public final InterfaceC27595jyE AEQbTJ;

    @yCM
    public jNW(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        this.AEQbTJ = interfaceC27595jyE;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<NativeTokenPriceData, OKServerException>> continuation) {
        return kAB.EZpvd(new CoinDetailRepository$getNativeTokenPrice$2(this, str, null), continuation);
    }
}
