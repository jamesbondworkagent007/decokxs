package o;

import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.single.GetSingleChainTokenListUseCase$getAllTokens$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kZG implements InterfaceC28389kZp {
    public final kKG AEQbTJ;
    public final kYA EZpvd;
    public final kYC KWHzl;
    public final kZA copydefault;

    public kZG(@NotNull kYA kya, @NotNull kYC kyc, @NotNull kKG kkg, @NotNull kZA kza) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(kza, "");
        this.EZpvd = kya;
        this.KWHzl = kyc;
        this.AEQbTJ = kkg;
        this.copydefault = kza;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        if (c28378kZe.KWHzl().length() == 0) {
            return OLrzqt(c28378kZe, continuation);
        }
        return KWHzl(c28378kZe, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        GetSingleChainTokenListUseCase$getAllTokens$1 getSingleChainTokenListUseCase$getAllTokens$1;
        kZA kza;
        if (continuation instanceof GetSingleChainTokenListUseCase$getAllTokens$1) {
            getSingleChainTokenListUseCase$getAllTokens$1 = (GetSingleChainTokenListUseCase$getAllTokens$1) continuation;
            int i = getSingleChainTokenListUseCase$getAllTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSingleChainTokenListUseCase$getAllTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                getSingleChainTokenListUseCase$getAllTokens$1 = new GetSingleChainTokenListUseCase$getAllTokens$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = getSingleChainTokenListUseCase$getAllTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSingleChainTokenListUseCase$getAllTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            kza = this.copydefault;
            kYA kya = this.EZpvd;
            C28382kZi c28382kZi = new C28382kZi(c28378kZe.EZpvd(), this.KWHzl.OLrzqt(), this.KWHzl.KWHzl(), this.KWHzl.KWHzl(), this.AEQbTJ.copydefault(), null, C56443yFo.AEQbTJ(c28378kZe.AhwBna().toTokenListType()), null, null, 416, null);
            getSingleChainTokenListUseCase$getAllTokens$1.L$0 = kza;
            getSingleChainTokenListUseCase$getAllTokens$1.label = 1;
            objOLrzqt = kya.OLrzqt(c28382kZi, getSingleChainTokenListUseCase$getAllTokens$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kza = (kZA) getSingleChainTokenListUseCase$getAllTokens$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        getSingleChainTokenListUseCase$getAllTokens$1.L$0 = null;
        getSingleChainTokenListUseCase$getAllTokens$1.label = 2;
        objOLrzqt = kza.EZpvd((AbstractC43419rot) objOLrzqt, getSingleChainTokenListUseCase$getAllTokens$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    private final java.lang.Object KWHzl(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        kYA kya = this.EZpvd;
        java.lang.String strKWHzl = c28378kZe.KWHzl();
        return kya.copydefault(new C28382kZi(c28378kZe.EZpvd(), this.KWHzl.OLrzqt(), this.KWHzl.KWHzl(), this.KWHzl.KWHzl(), this.AEQbTJ.copydefault(), C56443yFo.AEQbTJ(0), C56443yFo.AEQbTJ(c28378kZe.AhwBna().toTokenListType()), null, strKWHzl, 128, null), continuation);
    }
}
