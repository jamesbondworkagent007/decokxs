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

/* JADX INFO: renamed from: o.eWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15833eWz implements eWU {
    public final C13934dbu EZpvd;

    @yCM
    public C15833eWz(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = c13934dbu;
    }

    @Override // o.eWU
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.util.List<java.lang.Long> list, boolean z, boolean z2, int i, int i2, @NotNull Continuation<? super AbstractC43419rot<AddressAllAssetResponse, OKServerException>> continuation) {
        return this.EZpvd.EZpvd(str, list, z, z2, i, i2, continuation);
    }

    @Override // o.eWU
    public java.lang.Object EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressCoinHistoryResponse, OKServerException>> continuation) {
        return this.EZpvd.OLrzqt(str, j, str2, (16 & 8) != 0 ? "" : str3, (16 & 16) != 0 ? 15 : 0, (Continuation<? super AbstractC43419rot<AddressCoinHistoryResponse, OKServerException>>) continuation);
    }

    @Override // o.eWU
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<AddressTokenAsset, OKServerException>> continuation) {
        return this.EZpvd.EZpvd(str, str2, l, str3, continuation);
    }

    @Override // o.eWU
    public java.lang.Object EZpvd(long j, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<CoinInfoBean, OKServerException>> continuation) {
        return this.EZpvd.AEQbTJ(j, str, continuation);
    }

    @Override // o.eWU
    public java.lang.Object KWHzl(@NotNull java.lang.String str, long j, int i, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<AddressTxHistoryDetail, OKServerException>> continuation) {
        return this.EZpvd.KWHzl(str, j, i, str2, continuation);
    }
}
