package o;

import com.okinc.business.defi.api.bean.OKWalletCloseTokenModel;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.FilterClosedTokenUseCase$filterMyPosition$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28399kZz {
    public final kYC OLrzqt;

    @yCM
    public C28399kZz(@NotNull kYC kyc) {
        Intrinsics.checkNotNullParameter(kyc, "");
        this.OLrzqt = kyc;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException> abstractC43419rot, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) throws java.lang.Throwable {
        FilterClosedTokenUseCase$filterMyPosition$1 filterClosedTokenUseCase$filterMyPosition$1;
        if (continuation instanceof FilterClosedTokenUseCase$filterMyPosition$1) {
            filterClosedTokenUseCase$filterMyPosition$1 = (FilterClosedTokenUseCase$filterMyPosition$1) continuation;
            int i = filterClosedTokenUseCase$filterMyPosition$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                filterClosedTokenUseCase$filterMyPosition$1.label = i - Integer.MIN_VALUE;
            } else {
                filterClosedTokenUseCase$filterMyPosition$1 = new FilterClosedTokenUseCase$filterMyPosition$1(this, continuation);
            }
        }
        java.lang.Object objAwait = filterClosedTokenUseCase$filterMyPosition$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = filterClosedTokenUseCase$filterMyPosition$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                AbstractC58260yxt<java.util.List<OKWalletCloseTokenModel>> abstractC58260yxtEZpvd = this.OLrzqt.EZpvd();
                filterClosedTokenUseCase$filterMyPosition$1.L$0 = abstractC43419rot;
                filterClosedTokenUseCase$filterMyPosition$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, filterClosedTokenUseCase$filterMyPosition$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC43419rot = (AbstractC43419rot) filterClosedTokenUseCase$filterMyPosition$1.L$0;
                C56391yDq.AEQbTJ(objAwait);
            }
            java.util.List<OKWalletCloseTokenModel> list = (java.util.List) objAwait;
            Intrinsics.copydefault(list);
            if (!(!list.isEmpty()) || !(abstractC43419rot instanceof AbstractC43419rot.StateListAnimator)) {
                return abstractC43419rot;
            }
            java.lang.Iterable iterable = (java.lang.Iterable) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : iterable) {
                DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) obj;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    for (OKWalletCloseTokenModel oKWalletCloseTokenModel : list) {
                        if (dexMultiTokenInfoBean.equalsToken(oKWalletCloseTokenModel.getGeneralChainId(), oKWalletCloseTokenModel.getContractAddress())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj);
            }
            return new AbstractC43419rot.StateListAnimator(arrayList);
        } catch (java.lang.Exception e) {
            pUU.copydefault("FilterClosedTokenUseCase", "Error filtering closed tokens: " + e.getMessage());
            return abstractC43419rot;
        }
    }
}
