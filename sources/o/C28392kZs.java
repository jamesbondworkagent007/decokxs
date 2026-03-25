package o;

import com.google.android.gms.stats.CodePackage;
import com.okinc.business.dexlogic.bean.ChainTokensData;
import com.okinc.business.trade.features.home.tokenlist.domain.usecase.tokenlist.bridge.GetBridgeAllNetworkTokenListUseCase$getAllTokens$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28392kZs implements InterfaceC28389kZp {
    public final kYA AEQbTJ;
    public final kKG EZpvd;
    public final kYC KWHzl;
    public final kZA OLrzqt;

    public C28392kZs(@NotNull kYA kya, @NotNull kYC kyc, @NotNull kKG kkg, @NotNull kZA kza) {
        Intrinsics.checkNotNullParameter(kya, "");
        Intrinsics.checkNotNullParameter(kyc, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(kza, "");
        this.AEQbTJ = kya;
        this.KWHzl = kyc;
        this.EZpvd = kkg;
        this.OLrzqt = kza;
    }

    @Override // o.InterfaceC28389kZp
    public java.lang.Object AEQbTJ(@NotNull C28378kZe c28378kZe, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        if (c28378kZe.KWHzl().length() == 0) {
            return EZpvd(c28378kZe, continuation);
        }
        return KWHzl(c28378kZe, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) throws java.lang.Throwable {
        GetBridgeAllNetworkTokenListUseCase$getAllTokens$1 getBridgeAllNetworkTokenListUseCase$getAllTokens$1;
        kZA kza;
        if (continuation instanceof GetBridgeAllNetworkTokenListUseCase$getAllTokens$1) {
            getBridgeAllNetworkTokenListUseCase$getAllTokens$1 = (GetBridgeAllNetworkTokenListUseCase$getAllTokens$1) continuation;
            int i = getBridgeAllNetworkTokenListUseCase$getAllTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getBridgeAllNetworkTokenListUseCase$getAllTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                getBridgeAllNetworkTokenListUseCase$getAllTokens$1 = new GetBridgeAllNetworkTokenListUseCase$getAllTokens$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = getBridgeAllNetworkTokenListUseCase$getAllTokens$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = getBridgeAllNetworkTokenListUseCase$getAllTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            kza = this.OLrzqt;
            kYA kya = this.AEQbTJ;
            C28379kZf c28379kZf = new C28379kZf(c28378kZe.valueOf() ? null : c28378kZe.copydefault(), this.KWHzl.OLrzqt(), this.KWHzl.KWHzl(), c28378kZe.AYXKKw(), this.EZpvd.copydefault(), c28378kZe.valueOf() ? "FROM" : "TO", !c28378kZe.valueOf() ? null : c28378kZe.gEmmrt(), c28378kZe.valueOf() ? null : c28378kZe.OLrzqt());
            getBridgeAllNetworkTokenListUseCase$getAllTokens$1.L$0 = kza;
            getBridgeAllNetworkTokenListUseCase$getAllTokens$1.label = 1;
            objCopydefault = kya.copydefault(c28379kZf, getBridgeAllNetworkTokenListUseCase$getAllTokens$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objCopydefault);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kza = (kZA) getBridgeAllNetworkTokenListUseCase$getAllTokens$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        getBridgeAllNetworkTokenListUseCase$getAllTokens$1.L$0 = null;
        getBridgeAllNetworkTokenListUseCase$getAllTokens$1.label = 2;
        objCopydefault = kza.EZpvd((AbstractC43419rot) objCopydefault, getBridgeAllNetworkTokenListUseCase$getAllTokens$1);
        return objCopydefault == objCopydefault2 ? objCopydefault2 : objCopydefault;
    }

    public final java.lang.Object KWHzl(C28378kZe c28378kZe, Continuation<? super AbstractC43419rot<? extends java.util.List<ChainTokensData>, OKServerException>> continuation) {
        return this.AEQbTJ.OLrzqt(new C28381kZh(c28378kZe.KWHzl(), c28378kZe.valueOf() ? null : c28378kZe.copydefault(), !c28378kZe.valueOf() ? null : c28378kZe.gEmmrt(), this.KWHzl.OLrzqt(), this.KWHzl.KWHzl(), c28378kZe.valueOf() ? null : c28378kZe.OLrzqt(), c28378kZe.valueOf() ? "FROM" : "TO", CodePackage.COMMON, c28378kZe.AYXKKw(), this.EZpvd.copydefault()), continuation);
    }
}
