package o;

import com.okinc.business.defi.biz.net.bean.WalletSearchResp;
import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18947fry implements InterfaceC18906frJ {
    public final C13934dbu EZpvd;

    @yCM
    public C18947fry(@NotNull C13934dbu c13934dbu) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        this.EZpvd = c13934dbu;
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<WalletHotSearchResponse, OKServerException>> continuation) {
        return this.EZpvd.AhwBna(continuation);
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.Long l, @NotNull java.util.List<java.lang.String> list, @NotNull DiscoverSearchParam discoverSearchParam, @NotNull Continuation<? super AbstractC43419rot<WalletSearchResponse, OKServerException>> continuation) {
        return this.EZpvd.copydefault(str, l, list, discoverSearchParam, continuation);
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<SearchRecommendResponse, OKServerException>> continuation) {
        return this.EZpvd.KWHzl(str, str2, continuation);
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object KWHzl(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<MarketChainBean>, OKServerException>> continuation) {
        return this.EZpvd.AkhnZx(continuation);
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SearchAddressResponse>, OKServerException>> continuation) {
        return this.EZpvd.AYXKKw(str, continuation);
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objEZpvd = ((gKN) C43251rlk.copydefault(gKN.class)).EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(j)), str, continuation);
        return objEZpvd == C56442yFn.copydefault() ? objEZpvd : Unit.INSTANCE;
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletSearchResp>, OKServerException>> continuation) {
        return new AbstractC43419rot.StateListAnimator(yDY.AhwBna());
    }

    @Override // o.InterfaceC18906frJ
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletSearchResp>, OKServerException>> continuation) {
        return new AbstractC43419rot.StateListAnimator(yDY.AhwBna());
    }
}
