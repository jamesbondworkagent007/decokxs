package o;

import com.okinc.business.defi.biz.database.extra.entity.SupportPnlChainEntity;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eWE implements eWV {
    public final eWC AEQbTJ;
    public final eWA KWHzl;

    @yCM
    public eWE(@NotNull eWA ewa, @NotNull eWC ewc) {
        Intrinsics.checkNotNullParameter(ewa, "");
        Intrinsics.checkNotNullParameter(ewc, "");
        this.KWHzl = ewa;
        this.AEQbTJ = ewc;
    }

    @Override // o.eWV
    public java.lang.Object EZpvd(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.util.List<SupportPnlChainEntity>> continuation) {
        return this.KWHzl.OLrzqt(coroutineDispatcher, continuation);
    }

    @Override // o.eWV
    public java.lang.Object copydefault(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super AbstractC43419rot<WalletSupportPnlChainListResponse, OKServerException>> continuation) {
        return this.AEQbTJ.OLrzqt(coroutineDispatcher, continuation);
    }

    @Override // o.eWV
    public java.lang.Object EZpvd(@NotNull java.util.List<SupportPnlChainEntity> list, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return this.KWHzl.AEQbTJ(list, coroutineDispatcher, continuation);
    }

    @Override // o.eWV
    public java.lang.Object KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.Long l, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) {
        return this.AEQbTJ.copydefault(str, str2, l, str3, continuation);
    }

    @Override // o.eWV
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.Long l, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) {
        return this.AEQbTJ.EZpvd(str, str2, l, continuation);
    }

    @Override // o.eWV
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) {
        return this.AEQbTJ.OLrzqt(str, l, i, z, i2, i3, continuation);
    }

    @Override // o.eWV
    public java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, boolean z2, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) {
        return this.AEQbTJ.AEQbTJ(str, l, i, z, i2, i3, z2, continuation);
    }

    @Override // o.eWV
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<WalletPnlShareInfoResponse, OKServerException>> continuation) {
        return this.AEQbTJ.AEQbTJ(str, str2, str3, str4, continuation);
    }
}
