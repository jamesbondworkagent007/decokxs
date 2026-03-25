package o;

import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.trade.features.home.domain.model.tradingmode.MemeModeProvider$isModeSupported$1;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kUq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28255kUq implements InterfaceC28261kUw {
    public static final C28255kUq OLrzqt = new C28255kUq();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28261kUw
    public int KWHzl() {
        return C52761wXj.TaskDescription.sendSocketRequest;
    }

    private C28255kUq() {
    }

    @Override // o.InterfaceC28261kUw
    public java.lang.String EZpvd() {
        return C33070mpX.AYXKKw(C23274hvD.Fragment.OUcgGI);
    }

    @Override // o.InterfaceC28261kUw
    public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, @NotNull C28251kUm c28251kUm) {
        java.lang.String strategyType;
        CoinInfo toCoinInfo;
        CoinInfo toCoinInfo2;
        CoinInfo fromCoinInfo;
        CoinInfo fromCoinInfo2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c28251kUm, "");
        android.os.Bundle bundleAEQbTJ = c28251kUm.AEQbTJ();
        int i = bundleAEQbTJ != null ? bundleAEQbTJ.getInt("index", -1) : -1;
        android.os.Bundle bundleAEQbTJ2 = c28251kUm.AEQbTJ();
        java.lang.String tokenAddress = null;
        java.lang.String string = bundleAEQbTJ2 != null ? bundleAEQbTJ2.getString("transaction_amount") : null;
        java.lang.String str = string == null ? "" : string;
        final TradeParam tradeParamEZpvd = c28251kUm.EZpvd();
        if (tradeParamEZpvd == null || (strategyType = tradeParamEZpvd.getStrategyType()) == null) {
            strategyType = "0";
        }
        java.lang.String str2 = strategyType;
        java.lang.String chainId = (tradeParamEZpvd == null || (fromCoinInfo2 = tradeParamEZpvd.getFromCoinInfo()) == null) ? null : fromCoinInfo2.getChainId();
        TokenBase tokenBase = new TokenBase(chainId == null ? "" : chainId, C31256lqb.KWHzl((tradeParamEZpvd == null || (fromCoinInfo = tradeParamEZpvd.getFromCoinInfo()) == null) ? null : fromCoinInfo.getTokenAddress(), (Function0<java.lang.String>) new Function0() { // from class: o.kUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28255kUq.djBIcL(tradeParamEZpvd);
            }
        }), null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4, null);
        java.lang.String chainId2 = (tradeParamEZpvd == null || (toCoinInfo2 = tradeParamEZpvd.getToCoinInfo()) == null) ? null : toCoinInfo2.getChainId();
        java.lang.String str3 = chainId2 == null ? "" : chainId2;
        if (tradeParamEZpvd != null && (toCoinInfo = tradeParamEZpvd.getToCoinInfo()) != null) {
            tokenAddress = toCoinInfo.getTokenAddress();
        }
        TokenBase tokenBase2 = new TokenBase(str3, tokenAddress == null ? "" : tokenAddress, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -4, null);
        android.os.Bundle bundleAEQbTJ3 = c28251kUm.AEQbTJ();
        if (bundleAEQbTJ3 != null) {
            bundleAEQbTJ3.clear();
        }
        return MemeModeTransactionFragment.Companion.KWHzl(c28251kUm.KWHzl(), tokenBase, i, str, (32 & 16) != 0 ? "0" : str2, (32 & 32) != 0 ? C31172lox.Companion.KWHzl() : 0, (32 & 64) != 0 ? null : tokenBase2);
    }

    public static final java.lang.String djBIcL(TradeParam tradeParam) {
        CoinInfo toCoinInfo;
        java.lang.String tokenAddress = (tradeParam == null || (toCoinInfo = tradeParam.getToCoinInfo()) == null) ? null : toCoinInfo.getTokenAddress();
        return tokenAddress == null ? "" : tokenAddress;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x0024 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [o.bdR] */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.okinc.business.dex.api.bean.TradeParam] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.kVU] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o.kUv] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // o.InterfaceC28261kUw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull android.content.Context context, final TradeParam tradeParam, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MemeModeProvider$isModeSupported$1 memeModeProvider$isModeSupported$1;
        ?? r3;
        java.lang.Object objM7377constructorimpl;
        ?? r13;
        ?? r12;
        ?? r32;
        ?? r1;
        java.lang.Object objM7386unboximpl;
        ?? r122;
        ?? r132;
        int i;
        if (!(continuation instanceof MemeModeProvider$isModeSupported$1) || (r3 = (i = (memeModeProvider$isModeSupported$1 = (MemeModeProvider$isModeSupported$1) continuation).label) & Integer.MIN_VALUE) == 0) {
            memeModeProvider$isModeSupported$1 = new MemeModeProvider$isModeSupported$1(this, continuation);
        } else {
            memeModeProvider$isModeSupported$1.label = i - Integer.MIN_VALUE;
        }
        MemeModeProvider$isModeSupported$1 memeModeProvider$isModeSupported$12 = memeModeProvider$isModeSupported$1;
        java.lang.Object objAwait = memeModeProvider$isModeSupported$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r14 = memeModeProvider$isModeSupported$12.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r1 = r14;
            r32 = r3;
            r12 = context;
            r13 = tradeParam;
        }
        if (r14 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            if (tradeParam == 0) {
                return C56443yFo.KWHzl(false);
            }
            C58114yvF c58114yvF = C58114yvF.EZpvd;
            InterfaceC28260kUv interfaceC28260kUv = (InterfaceC28260kUv) C58114yvF.OLrzqt(context, InterfaceC28260kUv.class);
            java.lang.String strKWHzl = C31256lqb.KWHzl(tradeParam.getFromCoinInfo().getTokenAddress(), (Function0<java.lang.String>) new Function0() { // from class: o.kUo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28255kUq.copydefault(tradeParam);
                }
            });
            java.lang.String strKWHzl2 = C31256lqb.KWHzl(tradeParam.getFromCoinInfo().getChainId(), (Function0<java.lang.String>) new Function0() { // from class: o.kUp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28255kUq.OLrzqt(tradeParam);
                }
            });
            if (strKWHzl.length() == 0) {
                return C56443yFo.KWHzl(false);
            }
            InterfaceC9852bdR interfaceC9852bdRDxcTrN = interfaceC28260kUv.dxcTrN();
            Result.Application application2 = Result.Companion;
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = interfaceC9852bdRDxcTrN.gEmmrt().KWHzl();
            memeModeProvider$isModeSupported$12.L$0 = interfaceC28260kUv;
            memeModeProvider$isModeSupported$12.L$1 = strKWHzl;
            memeModeProvider$isModeSupported$12.L$2 = strKWHzl2;
            memeModeProvider$isModeSupported$12.L$3 = interfaceC9852bdRDxcTrN;
            memeModeProvider$isModeSupported$12.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtKWHzl, memeModeProvider$isModeSupported$12);
            r14 = strKWHzl;
            r3 = interfaceC28260kUv;
            context = interfaceC9852bdRDxcTrN;
            tradeParam = strKWHzl2;
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (r14 != 1) {
                if (r14 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.String str = (java.lang.String) memeModeProvider$isModeSupported$12.L$1;
                java.lang.String str2 = (java.lang.String) memeModeProvider$isModeSupported$12.L$0;
                C56391yDq.AEQbTJ(objAwait);
                objM7386unboximpl = ((Result) objAwait).m7386unboximpl();
                r122 = str;
                r132 = str2;
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                    return C56443yFo.KWHzl(false);
                }
                ValidateTokensResponse validateTokensResponse = (ValidateTokensResponse) objM7386unboximpl;
                if (!Intrinsics.EZpvd(validateTokensResponse.getToTokenInfo().getChainId(), (java.lang.Object) r122)) {
                    pUU.copydefault("MemeModeProvider", "chainId(" + r122 + ") not supported");
                    return C56443yFo.KWHzl(false);
                }
                if (!C59449zhJ.gEmmrt(validateTokensResponse.getToTokenInfo().getTokenContractAddress(), r132, !Intrinsics.EZpvd((java.lang.Object) r122, (java.lang.Object) "501"))) {
                    if (r132.length() == 0 && validateTokensResponse.getToTokenInfo().isMainChainCoin()) {
                        pUU.copydefault("MemeModeProvider", "fallback to native token");
                    } else {
                        pUU.copydefault("MemeModeProvider", "token(address=" + r132 + ") not supported, fallback to " + validateTokensResponse.getToTokenInfo().getTokenContractAddress());
                    }
                }
                return C56443yFo.KWHzl(true);
            }
            InterfaceC9852bdR interfaceC9852bdR = (InterfaceC9852bdR) memeModeProvider$isModeSupported$12.L$3;
            java.lang.String str3 = (java.lang.String) memeModeProvider$isModeSupported$12.L$2;
            java.lang.String str4 = (java.lang.String) memeModeProvider$isModeSupported$12.L$1;
            InterfaceC28260kUv interfaceC28260kUv2 = (InterfaceC28260kUv) memeModeProvider$isModeSupported$12.L$0;
            C56391yDq.AEQbTJ(objAwait);
            r14 = str4;
            r3 = interfaceC28260kUv2;
            context = interfaceC9852bdR;
            tradeParam = str3;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((InterfaceC9738bbJ) objAwait);
        r1 = r14;
        r32 = r3;
        r12 = context;
        r13 = tradeParam;
        ?? r10 = r1;
        java.lang.Object obj = objM7377constructorimpl;
        if (Result.m7383isFailureimpl(obj)) {
            obj = null;
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        java.lang.String strDbNXlk = interfaceC9738bbJ != null ? interfaceC9738bbJ.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        java.lang.String str5 = strDbNXlk;
        ?? FZBcTu = r32.fZBcTu();
        java.lang.String strDjBIcL = r12.djBIcL();
        memeModeProvider$isModeSupported$12.L$0 = r10;
        memeModeProvider$isModeSupported$12.L$1 = r13;
        memeModeProvider$isModeSupported$12.L$2 = null;
        memeModeProvider$isModeSupported$12.L$3 = null;
        memeModeProvider$isModeSupported$12.label = 2;
        java.lang.Object objOLrzqt = FZBcTu.OLrzqt(r13, str5, strDjBIcL, r10, "", memeModeProvider$isModeSupported$12);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        objM7386unboximpl = objOLrzqt;
        r122 = r13;
        r132 = r10;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
        }
    }

    public static final java.lang.String copydefault(TradeParam tradeParam) {
        java.lang.String tokenAddress = tradeParam.getToCoinInfo().getTokenAddress();
        return tokenAddress == null ? "" : tokenAddress;
    }

    public static final java.lang.String OLrzqt(TradeParam tradeParam) {
        return tradeParam.getToCoinInfo().getChainId();
    }
}
