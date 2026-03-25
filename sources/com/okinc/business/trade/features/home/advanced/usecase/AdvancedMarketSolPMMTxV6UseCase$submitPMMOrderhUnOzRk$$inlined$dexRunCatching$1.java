package com.okinc.business.trade.features.home.advanced.usecase;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C23274hvD;
import o.C28181kRx;
import o.C28196kSl;
import o.C33070mpX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9748bbT;
import o.InterfaceC9734bbF;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ V6BaseQuoteResponse $data$inlined;
    final /* synthetic */ int $direction$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C28181kRx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, V6BaseQuoteResponse v6BaseQuoteResponse, C28181kRx c28181kRx, int i, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription) {
        super(2, continuation);
        this.$data$inlined = v6BaseQuoteResponse;
        this.this$0 = c28181kRx;
        this.$direction$inlined = i;
        this.$activity$inlined = fragmentActivity;
        this.$silentSignWhenAvailable$inlined = z;
        this.$loadingCallback$inlined = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1(continuation, this.$data$inlined, this.this$0, this.$direction$inlined, this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124 A[Catch: all -> 0x014c, CancellationException -> 0x0163, TryCatch #2 {CancellationException -> 0x0163, all -> 0x014c, blocks: (B:7:0x0016, B:46:0x0120, B:48:0x0124, B:50:0x012c, B:54:0x0134, B:11:0x0025, B:43:0x00fe, B:14:0x0030, B:37:0x00da, B:40:0x00df, B:17:0x003b, B:19:0x0045, B:21:0x004b, B:23:0x0052, B:25:0x005a, B:27:0x0060, B:32:0x006b, B:34:0x0071, B:55:0x0139, B:56:0x014b), top: B:63:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        DappInteractionArgs dappInteractionArgs;
        Object objOLrzqt;
        DexMultiTokenInfoBean fromToken;
        OfflineQuote calldata;
        Object objAwait;
        Object objAwaitFirst;
        ResponseData responseData;
        C9748bbT c9748bbT;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str = "";
        String strGEmmrt = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            DefiPlatformInfo selectedDeFiPlatform = this.$data$inlined.getSelectedDeFiPlatform();
            String unsignedTx = (selectedDeFiPlatform == null || (calldata = selectedDeFiPlatform.getCalldata()) == null) ? null : calldata.getUnsignedTx();
            CommonDexInfo commonDexInfo = this.$data$inlined.getCommonDexInfo();
            String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            if (unsignedTx == null || unsignedTx.length() == 0) {
                throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null);
            }
            dappInteractionArgs = dappInteractionArgs;
            DappInteractionArgs dappInteractionArgs2 = new DappInteractionArgs(this.this$0.OLrzqt.copydefault(), null, chainId, null, unsignedTx, null, "dex", C56443yFo.AEQbTJ(3), null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(1), null, null, SolanaSignType.NORMAL, null, null, -604012758, null);
            C28196kSl c28196kSl = this.this$0.OLrzqt;
            long jValueOf = C33129mqd.valueOf(chainId);
            this.L$0 = dappInteractionArgs;
            this.label = 1;
            objOLrzqt = c28196kSl.OLrzqt(jValueOf, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objAwaitFirst = obj;
                    responseData = (ResponseData) objAwaitFirst;
                    if (responseData != null && (c9748bbT = (C9748bbT) responseData.getData()) != null) {
                        strGEmmrt = c9748bbT.gEmmrt();
                    }
                    if (strGEmmrt != null) {
                        str = strGEmmrt;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(str);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                C56391yDq.AEQbTJ(obj);
                objAwait = obj;
                AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXKWHzl = this.this$0.copydefault.KWHzl((InterfaceC9734bbF) ((Pair) objAwait).getFirst(), this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
                this.label = 3;
                objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXKWHzl, this);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
                responseData = (ResponseData) objAwaitFirst;
                if (responseData != null) {
                    strGEmmrt = c9748bbT.gEmmrt();
                }
                if (strGEmmrt != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            DappInteractionArgs dappInteractionArgs3 = (DappInteractionArgs) this.L$0;
            C56391yDq.AEQbTJ(obj);
            dappInteractionArgs = dappInteractionArgs3;
            objOLrzqt = obj;
        }
        String str2 = (String) objOLrzqt;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC58260yxt<Pair<InterfaceC9734bbF, String>> abstractC58260yxtOLrzqt = this.this$0.OLrzqt.OLrzqt(dappInteractionArgs, this.this$0.copydefault(this.$data$inlined, str2, this.$direction$inlined));
        this.L$0 = null;
        this.label = 2;
        objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXKWHzl2 = this.this$0.copydefault.KWHzl((InterfaceC9734bbF) ((Pair) objAwait).getFirst(), this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
        this.label = 3;
        objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXKWHzl2, this);
        if (objAwaitFirst == objCopydefault) {
        }
        responseData = (ResponseData) objAwaitFirst;
        if (responseData != null) {
        }
        if (strGEmmrt != null) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(str);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
