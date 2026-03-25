package o;

import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.request.BonusPopupRequest;
import com.okinc.business.invest_biz.data.bean.response.BonusPopupDetailsResponse;
import com.okinc.business.invest_biz.ui.page.dialog.MerklClaimRepositoryImpl$getMerkleBonusPopupDetails$1;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24123iVt implements InterfaceC24127iVx {
    public final InterfaceC23589iBz AEQbTJ;

    @yCM
    public C24123iVt(@NotNull InterfaceC23589iBz interfaceC23589iBz) {
        Intrinsics.checkNotNullParameter(interfaceC23589iBz, "");
        this.AEQbTJ = interfaceC23589iBz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.InterfaceC24127iVx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<BonusPopupDetailsResponse>> continuation) throws java.lang.Throwable {
        MerklClaimRepositoryImpl$getMerkleBonusPopupDetails$1 merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1;
        java.lang.Object next;
        java.lang.String walletAddress;
        java.lang.String str2;
        long j2;
        java.util.List<java.lang.String> list2;
        java.lang.String str3;
        if (continuation instanceof MerklClaimRepositoryImpl$getMerkleBonusPopupDetails$1) {
            merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1 = (MerklClaimRepositoryImpl$getMerkleBonusPopupDetails$1) continuation;
            int i = merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.label = i - Integer.MIN_VALUE;
            } else {
                merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1 = new MerklClaimRepositoryImpl$getMerkleBonusPopupDetails$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            java.util.Iterator<T> it = C23580iBq.AEQbTJ.AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                java.lang.Long chainId = ((InvestWalletAddressInfo) next).getChainId();
                if (chainId != null && chainId.longValue() == j) {
                    break;
                }
            }
            InvestWalletAddressInfo investWalletAddressInfo = (InvestWalletAddressInfo) next;
            if (investWalletAddressInfo == null || (walletAddress = investWalletAddressInfo.getWalletAddress()) == null) {
                walletAddress = "";
            }
            java.lang.String str4 = walletAddress;
            java.lang.String strCopydefault = C23580iBq.AEQbTJ.copydefault();
            InterfaceC23589iBz interfaceC23589iBz = this.AEQbTJ;
            str2 = str;
            merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$0 = str2;
            merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$1 = list;
            merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$2 = str4;
            merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.J$0 = j;
            merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.label = 1;
            objKWHzl = interfaceC23589iBz.KWHzl(strCopydefault, merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            j2 = j;
            list2 = list;
            str3 = str4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                java.lang.Object objUnwrapResponseData$default = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
                Intrinsics.copydefault(objUnwrapResponseData$default);
                return objUnwrapResponseData$default;
            }
            long j3 = merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.J$0;
            java.lang.String str5 = (java.lang.String) merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$2;
            java.util.List<java.lang.String> list3 = (java.util.List) merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$1;
            str2 = (java.lang.String) merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            j2 = j3;
            str3 = str5;
            list2 = list3;
        }
        BonusPopupRequest bonusPopupRequest = new BonusPopupRequest(str2, str3, j2, list2);
        merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$0 = null;
        merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$1 = null;
        merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.L$2 = null;
        merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1.label = 2;
        objKWHzl = ((InterfaceC25472ixP) objKWHzl).EZpvd(bonusPopupRequest, merklClaimRepositoryImpl$getMerkleBonusPopupDetails$1);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        java.lang.Object objUnwrapResponseData$default2 = iBL.unwrapResponseData$default((ResponseData) objKWHzl, null, 1, null);
        Intrinsics.copydefault(objUnwrapResponseData$default2);
        return objUnwrapResponseData$default2;
    }
}
