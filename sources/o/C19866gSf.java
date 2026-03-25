package o;

import com.okinc.business.dex.trade.copytrading.domain.usecase.CoinAssetUseCase$getTokenInfo$1;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gSf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19866gSf {
    public final C28390kZq AEQbTJ;
    public final kKG EZpvd;
    public final InterfaceC19862gSb KWHzl;

    @yCM
    public C19866gSf(@NotNull InterfaceC19862gSb interfaceC19862gSb, @NotNull kKG kkg, @NotNull C28390kZq c28390kZq) {
        Intrinsics.checkNotNullParameter(interfaceC19862gSb, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        this.KWHzl = interfaceC19862gSb;
        this.EZpvd = kkg;
        this.AEQbTJ = c28390kZq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [16=4] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[PHI: r14
  0x00f0: PHI (r14v10 java.lang.Object) = (r14v9 java.lang.Object), (r14v1 java.lang.Object) binds: [B:33:0x00ed, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull Continuation<? super AbstractC43419rot<DexMultiTokenInfoBean, OKServerException>> continuation) throws java.lang.Throwable {
        CoinAssetUseCase$getTokenInfo$1 coinAssetUseCase$getTokenInfo$1;
        java.lang.String chainId;
        java.lang.String tokenContractAddress;
        C19866gSf c19866gSf;
        InterfaceC19862gSb interfaceC19862gSb;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2;
        java.lang.String str;
        java.lang.String str2;
        InterfaceC19862gSb interfaceC19862gSb2;
        java.lang.String str3;
        java.lang.String strEZpvd;
        if (continuation instanceof CoinAssetUseCase$getTokenInfo$1) {
            coinAssetUseCase$getTokenInfo$1 = (CoinAssetUseCase$getTokenInfo$1) continuation;
            int i = coinAssetUseCase$getTokenInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                coinAssetUseCase$getTokenInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                coinAssetUseCase$getTokenInfo$1 = new CoinAssetUseCase$getTokenInfo$1(this, continuation);
            }
        }
        CoinAssetUseCase$getTokenInfo$1 coinAssetUseCase$getTokenInfo$12 = coinAssetUseCase$getTokenInfo$1;
        java.lang.Object objKWHzl = coinAssetUseCase$getTokenInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = coinAssetUseCase$getTokenInfo$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC19862gSb interfaceC19862gSb3 = this.KWHzl;
            chainId = dexMultiTokenInfoBean.getChainId();
            tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress();
            kKG kkg = this.EZpvd;
            coinAssetUseCase$getTokenInfo$12.L$0 = this;
            coinAssetUseCase$getTokenInfo$12.L$1 = dexMultiTokenInfoBean;
            coinAssetUseCase$getTokenInfo$12.L$2 = interfaceC19862gSb3;
            coinAssetUseCase$getTokenInfo$12.L$3 = chainId;
            coinAssetUseCase$getTokenInfo$12.L$4 = tokenContractAddress;
            coinAssetUseCase$getTokenInfo$12.label = 1;
            java.lang.Object objAEQbTJ = kkg.AEQbTJ(coinAssetUseCase$getTokenInfo$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c19866gSf = this;
            interfaceC19862gSb = interfaceC19862gSb3;
            objKWHzl = objAEQbTJ;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objKWHzl);
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) coinAssetUseCase$getTokenInfo$12.L$5;
                java.lang.String str4 = (java.lang.String) coinAssetUseCase$getTokenInfo$12.L$4;
                str2 = (java.lang.String) coinAssetUseCase$getTokenInfo$12.L$3;
                InterfaceC19862gSb interfaceC19862gSb4 = (InterfaceC19862gSb) coinAssetUseCase$getTokenInfo$12.L$2;
                dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) coinAssetUseCase$getTokenInfo$12.L$1;
                c19866gSf = (C19866gSf) coinAssetUseCase$getTokenInfo$12.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                str3 = str4;
                interfaceC19862gSb2 = interfaceC19862gSb4;
                java.lang.String str5 = (java.lang.String) objKWHzl;
                InterfaceC9738bbJ interfaceC9738bbJValueOf = c19866gSf.EZpvd.valueOf();
                strEZpvd = interfaceC9738bbJValueOf == null ? interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(dexMultiTokenInfoBean2.getChainId())) : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                coinAssetUseCase$getTokenInfo$12.L$0 = null;
                coinAssetUseCase$getTokenInfo$12.L$1 = null;
                coinAssetUseCase$getTokenInfo$12.L$2 = null;
                coinAssetUseCase$getTokenInfo$12.L$3 = null;
                coinAssetUseCase$getTokenInfo$12.L$4 = null;
                coinAssetUseCase$getTokenInfo$12.L$5 = null;
                coinAssetUseCase$getTokenInfo$12.label = 3;
                objKWHzl = interfaceC19862gSb2.KWHzl(str2, str, str3, str5, strEZpvd, coinAssetUseCase$getTokenInfo$12);
                return objKWHzl != objCopydefault ? objCopydefault : objKWHzl;
            }
            java.lang.String str6 = (java.lang.String) coinAssetUseCase$getTokenInfo$12.L$4;
            chainId = (java.lang.String) coinAssetUseCase$getTokenInfo$12.L$3;
            interfaceC19862gSb = (InterfaceC19862gSb) coinAssetUseCase$getTokenInfo$12.L$2;
            DexMultiTokenInfoBean dexMultiTokenInfoBean3 = (DexMultiTokenInfoBean) coinAssetUseCase$getTokenInfo$12.L$1;
            c19866gSf = (C19866gSf) coinAssetUseCase$getTokenInfo$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            tokenContractAddress = str6;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean3;
        }
        java.lang.String str7 = (java.lang.String) objKWHzl;
        kKG kkg2 = c19866gSf.EZpvd;
        coinAssetUseCase$getTokenInfo$12.L$0 = c19866gSf;
        coinAssetUseCase$getTokenInfo$12.L$1 = dexMultiTokenInfoBean;
        coinAssetUseCase$getTokenInfo$12.L$2 = interfaceC19862gSb;
        coinAssetUseCase$getTokenInfo$12.L$3 = chainId;
        coinAssetUseCase$getTokenInfo$12.L$4 = tokenContractAddress;
        coinAssetUseCase$getTokenInfo$12.L$5 = str7;
        coinAssetUseCase$getTokenInfo$12.label = 2;
        java.lang.Object objCopydefault2 = kkg2.copydefault(coinAssetUseCase$getTokenInfo$12);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        java.lang.String str8 = tokenContractAddress;
        dexMultiTokenInfoBean2 = dexMultiTokenInfoBean;
        str = str7;
        objKWHzl = objCopydefault2;
        str2 = chainId;
        interfaceC19862gSb2 = interfaceC19862gSb;
        str3 = str8;
        java.lang.String str52 = (java.lang.String) objKWHzl;
        InterfaceC9738bbJ interfaceC9738bbJValueOf2 = c19866gSf.EZpvd.valueOf();
        if (interfaceC9738bbJValueOf2 == null) {
        }
        if (strEZpvd == null) {
        }
        coinAssetUseCase$getTokenInfo$12.L$0 = null;
        coinAssetUseCase$getTokenInfo$12.L$1 = null;
        coinAssetUseCase$getTokenInfo$12.L$2 = null;
        coinAssetUseCase$getTokenInfo$12.L$3 = null;
        coinAssetUseCase$getTokenInfo$12.L$4 = null;
        coinAssetUseCase$getTokenInfo$12.L$5 = null;
        coinAssetUseCase$getTokenInfo$12.label = 3;
        objKWHzl = interfaceC19862gSb2.KWHzl(str2, str, str3, str52, strEZpvd, coinAssetUseCase$getTokenInfo$12);
        if (objKWHzl != objCopydefault) {
        }
    }

    public final AbstractC58185ywX<C9860bdZ> EZpvd() {
        return this.AEQbTJ.copydefault();
    }
}
