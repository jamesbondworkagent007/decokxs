package o;

import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.FilterClosedTokenListUseCase$filterTokens$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZA {
    public final kYC KWHzl;

    public kZA(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.KWHzl = kyc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException> abstractC43419rot, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        FilterClosedTokenListUseCase$filterTokens$1 filterClosedTokenListUseCase$filterTokens$1;
        java.util.ArrayList arrayList;
        if (continuation instanceof FilterClosedTokenListUseCase$filterTokens$1) {
            filterClosedTokenListUseCase$filterTokens$1 = (FilterClosedTokenListUseCase$filterTokens$1) continuation;
            int i = filterClosedTokenListUseCase$filterTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                filterClosedTokenListUseCase$filterTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                filterClosedTokenListUseCase$filterTokens$1 = new FilterClosedTokenListUseCase$filterTokens$1(this, continuation);
            }
        }
        java.lang.Object objAwait = filterClosedTokenListUseCase$filterTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = filterClosedTokenListUseCase$filterTokens$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                AbstractC58260yxt<java.util.List<OKWalletCloseTokenModel>> abstractC58260yxtEZpvd = this.KWHzl.EZpvd();
                filterClosedTokenListUseCase$filterTokens$1.L$0 = abstractC43419rot;
                filterClosedTokenListUseCase$filterTokens$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, filterClosedTokenListUseCase$filterTokens$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot = (AbstractC43419rot) filterClosedTokenListUseCase$filterTokens$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            java.util.List<OKWalletCloseTokenModel> list = (java.util.List) objAwait;
            Intrinsics.copydefault(list);
            if (!(!list.isEmpty()) || !(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                return abstractC43419rot;
            }
            java.lang.Iterable<ChainTokensData> iterable = (java.lang.Iterable) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
            for (ChainTokensData chainTokensData : iterable) {
                java.util.List<DexMultiTokenInfoBean> tokenList = chainTokensData.getTokenList();
                if (tokenList != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj : tokenList) {
                        DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) obj;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (OKWalletCloseTokenModel oKWalletCloseTokenModel : list) {
                                if (dexMultiTokenInfoBean.equalsToken(oKWalletCloseTokenModel.getGeneralChainId(), oKWalletCloseTokenModel.getContractAddress())) {
                                    break;
                                }
                            }
                        }
                        arrayList3.add(obj);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                arrayList2.add(ChainTokensData.copy$default(chainTokensData, null, null, false, null, arrayList, 15, null));
            }
            return new AbstractC43419rot.StateListAnimator(arrayList2);
        } catch (java.lang.Exception e) {
            pUU.copydefault("FilterClosedTokenListUseCase", "Error filtering closed tokens: " + e.getMessage());
            return abstractC43419rot;
        }
    }
}
