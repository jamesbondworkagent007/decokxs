package o;

import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressCoinHistoryResponse;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.AddressTxHistoryDetail;
import com.okinc.business.defi.biz.net.bean.CoinInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWW {
    public final eWU AEQbTJ;

    @yCM
    public eWW(@NotNull eWU ewu) {
        Intrinsics.checkNotNullParameter(ewu, "");
        this.AEQbTJ = ewu;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.util.List<java.lang.Long> list, boolean z, boolean z2, int i, int i2, @NotNull Continuation<? super AbstractC43419rot<AddressAllAssetResponse, OKServerException>> continuation) {
        return this.AEQbTJ.copydefault(str, list, z, z2, i, i2, continuation);
    }

    public static /* synthetic */ java.lang.Object getAddressCoinHistory$default(eWW eww, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        return eww.EZpvd(str, j, str2, str3, continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressCoinHistoryResponse, OKServerException>> continuation) {
        return this.AEQbTJ.EZpvd(str, j, str2, str3, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressTokenAsset, OKServerException>> continuation) {
        return this.AEQbTJ.KWHzl(str, str2, l, str3, continuation);
    }

    public final java.lang.Object EZpvd(long j, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CoinInfoBean, OKServerException>> continuation) {
        return this.AEQbTJ.EZpvd(j, str, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, long j, int i, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AddressTxHistoryDetail, OKServerException>> continuation) {
        return this.AEQbTJ.KWHzl(str, j, i, str2, continuation);
    }
}
