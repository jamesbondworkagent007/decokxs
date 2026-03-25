package o;

import com.okinc.dexkline.market.data.model.KlineDexFlashPo;
import com.okinc.dexkline.market.data.model.history.NativeTokenPriceData;
import com.okinc.dexkline.market.features.coindetail.repo.CoinDetailRepository$getDexContentFlashNewsList$2;
import com.okinc.dexkline.market.features.coindetail.repo.CoinDetailRepository$getDexFlashNewsList$2;
import com.okinc.dexkline.market.features.coindetail.repo.CoinDetailRepository$getNativeTokenPrice$2;
import com.okinc.kline.news.data.po.KlineFlashPo;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mWJ {
    public final InterfaceC32260mVk AEQbTJ;

    @yCM
    public mWJ(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        this.AEQbTJ = interfaceC32260mVk;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<NativeTokenPriceData, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new CoinDetailRepository$getNativeTokenPrice$2(this, str, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<KlineDexFlashPo, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new CoinDetailRepository$getDexFlashNewsList$2(str2, str, str3, str4, str5, num, null), continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<KlineFlashPo, OKServerException>> continuation) {
        return C34583nen.AEQbTJ(new CoinDetailRepository$getDexContentFlashNewsList$2(str2, str, str3, str4, str5, num, null), continuation);
    }
}
