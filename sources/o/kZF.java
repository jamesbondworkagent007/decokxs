package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.GetSingleAllNetworkTokenListUseCase$getAllTokens$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZF implements InterfaceC28389kZp {
    public final kYA AEQbTJ;
    public final kYC EZpvd;
    public final kKG OLrzqt;
    public final kZA copydefault;

    public kZF(@NotNull kYA kya, @NotNull kYC kyc, @NotNull kKG kkg, @NotNull kZA kza) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(kza, "");
        this.AEQbTJ = kya;
        this.EZpvd = kyc;
        this.OLrzqt = kkg;
        this.copydefault = kza;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        if (c28378kZe.KWHzl().length() == 0) {
            return EZpvd(c28378kZe, continuation);
        }
        return OLrzqt(c28378kZe, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        GetSingleAllNetworkTokenListUseCase$getAllTokens$1 getSingleAllNetworkTokenListUseCase$getAllTokens$1;
        kZA kza;
        if (continuation instanceof GetSingleAllNetworkTokenListUseCase$getAllTokens$1) {
            getSingleAllNetworkTokenListUseCase$getAllTokens$1 = (GetSingleAllNetworkTokenListUseCase$getAllTokens$1) continuation;
            int i = getSingleAllNetworkTokenListUseCase$getAllTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSingleAllNetworkTokenListUseCase$getAllTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                getSingleAllNetworkTokenListUseCase$getAllTokens$1 = new GetSingleAllNetworkTokenListUseCase$getAllTokens$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = getSingleAllNetworkTokenListUseCase$getAllTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSingleAllNetworkTokenListUseCase$getAllTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            kza = this.copydefault;
            kYA kya = this.AEQbTJ;
            C28382kZi c28382kZi = new C28382kZi(null, this.EZpvd.OLrzqt(), this.EZpvd.KWHzl(), this.EZpvd.KWHzl(), this.OLrzqt.copydefault(), null, C56443yFo.AEQbTJ(c28378kZe.AhwBna().toTokenListType()), null, null, 417, null);
            getSingleAllNetworkTokenListUseCase$getAllTokens$1.L$0 = kza;
            getSingleAllNetworkTokenListUseCase$getAllTokens$1.label = 1;
            objKWHzl = kya.KWHzl(c28382kZi, getSingleAllNetworkTokenListUseCase$getAllTokens$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kza = (kZA) getSingleAllNetworkTokenListUseCase$getAllTokens$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        getSingleAllNetworkTokenListUseCase$getAllTokens$1.L$0 = null;
        getSingleAllNetworkTokenListUseCase$getAllTokens$1.label = 2;
        objKWHzl = kza.EZpvd((AbstractC43419rot) objKWHzl, getSingleAllNetworkTokenListUseCase$getAllTokens$1);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    private final java.lang.Object OLrzqt(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        kYA kya = this.AEQbTJ;
        java.lang.String strKWHzl = c28378kZe.KWHzl();
        return kya.copydefault(new C28382kZi(null, this.EZpvd.OLrzqt(), this.EZpvd.KWHzl(), this.EZpvd.KWHzl(), this.OLrzqt.copydefault(), C56443yFo.AEQbTJ(1), C56443yFo.AEQbTJ(c28378kZe.AhwBna().toTokenListType()), null, strKWHzl, 129, null), continuation);
    }
}
