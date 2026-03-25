package o;

import com.okinc.business.defi.biz.net.bean.WalletSearchResp;
import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.MarketChainBean;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchRecommendResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.business.defi.wallet.mine.search.domain.usecase.SearchUseCase$getMarketChainList$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.frR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18914frR {
    public java.util.List<MarketChainBean> EZpvd;
    public final InterfaceC18906frJ OLrzqt;

    @yCM
    public C18914frR(@NotNull InterfaceC18906frJ interfaceC18906frJ) {
        Intrinsics.checkNotNullParameter(interfaceC18906frJ, "");
        this.OLrzqt = interfaceC18906frJ;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super AbstractC43419rot<WalletHotSearchResponse, OKServerException>> continuation) {
        return this.OLrzqt.EZpvd(continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.Long l, @NotNull java.util.List<java.lang.String> list, @NotNull DiscoverSearchParam discoverSearchParam, @NotNull Continuation<? super AbstractC43419rot<WalletSearchResponse, OKServerException>> continuation) {
        return this.OLrzqt.copydefault(str, l, list, discoverSearchParam, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<SearchRecommendResponse, OKServerException>> continuation) {
        return this.OLrzqt.OLrzqt(str, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<MarketChainBean>> continuation) throws java.lang.Throwable {
        SearchUseCase$getMarketChainList$1 searchUseCase$getMarketChainList$1;
        C18914frR c18914frR;
        C18914frR c18914frR2;
        if (continuation instanceof SearchUseCase$getMarketChainList$1) {
            searchUseCase$getMarketChainList$1 = (SearchUseCase$getMarketChainList$1) continuation;
            int i = searchUseCase$getMarketChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchUseCase$getMarketChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                searchUseCase$getMarketChainList$1 = new SearchUseCase$getMarketChainList$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = searchUseCase$getMarketChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchUseCase$getMarketChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.List<MarketChainBean> list = this.EZpvd;
            if (list != null && !list.isEmpty()) {
                return this.EZpvd;
            }
            InterfaceC18906frJ interfaceC18906frJ = this.OLrzqt;
            searchUseCase$getMarketChainList$1.L$0 = this;
            searchUseCase$getMarketChainList$1.L$1 = this;
            searchUseCase$getMarketChainList$1.label = 1;
            objKWHzl = interfaceC18906frJ.KWHzl(searchUseCase$getMarketChainList$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c18914frR = this;
            c18914frR2 = c18914frR;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18914frR2 = (C18914frR) searchUseCase$getMarketChainList$1.L$1;
            c18914frR = (C18914frR) searchUseCase$getMarketChainList$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.util.List<MarketChainBean> listAhwBna = (java.util.List) ((AbstractC43419rot) objKWHzl).copydefault();
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        c18914frR2.EZpvd = listAhwBna;
        return c18914frR.EZpvd;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<SearchAddressResponse>, OKServerException>> continuation) {
        return this.OLrzqt.copydefault(str, continuation);
    }

    public final java.lang.Object AEQbTJ(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.OLrzqt.AEQbTJ(j, str, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletSearchResp>, OKServerException>> continuation) {
        return this.OLrzqt.OLrzqt(str, i, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<WalletSearchResp>, OKServerException>> continuation) {
        return this.OLrzqt.AEQbTJ(str, i, continuation);
    }
}
