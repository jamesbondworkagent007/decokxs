package com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm;

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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C23274hvD;
import o.C28332kXm;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9748bbT;
import o.InterfaceC9734bbF;
import o.InterfaceC9740bbL;
import o.gYQ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm.MemeV6MarketSolPMMTxUseCase$submitPMMOrder-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ V6BaseQuoteResponse $data$inlined;
    final /* synthetic */ int $direction$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ String $selectedDefiPlatformId$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    int label;
    final /* synthetic */ C28332kXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, V6BaseQuoteResponse v6BaseQuoteResponse, String str, C28332kXm c28332kXm, int i, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription) {
        super(2, continuation);
        this.$data$inlined = v6BaseQuoteResponse;
        this.$selectedDefiPlatformId$inlined = str;
        this.this$0 = c28332kXm;
        this.$direction$inlined = i;
        this.$activity$inlined = fragmentActivity;
        this.$silentSignWhenAvailable$inlined = z;
        this.$loadingCallback$inlined = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1(continuation, this.$data$inlined, this.$selectedDefiPlatformId$inlined, this.this$0, this.$direction$inlined, this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113 A[Catch: all -> 0x0150, CancellationException -> 0x0167, TryCatch #2 {CancellationException -> 0x0167, all -> 0x0150, blocks: (B:6:0x0012, B:36:0x0109, B:38:0x0113, B:40:0x011b, B:45:0x0125, B:46:0x012a, B:47:0x013c, B:10:0x0021, B:33:0x00e8, B:13:0x002b, B:15:0x0037, B:17:0x003d, B:19:0x0044, B:21:0x004c, B:23:0x0052, B:28:0x005d, B:30:0x0063, B:48:0x013d, B:49:0x014f), top: B:56:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a A[Catch: all -> 0x0150, CancellationException -> 0x0167, TryCatch #2 {CancellationException -> 0x0167, all -> 0x0150, blocks: (B:6:0x0012, B:36:0x0109, B:38:0x0113, B:40:0x011b, B:45:0x0125, B:46:0x012a, B:47:0x013c, B:10:0x0021, B:33:0x00e8, B:13:0x002b, B:15:0x0037, B:17:0x003d, B:19:0x0044, B:21:0x004c, B:23:0x0052, B:28:0x005d, B:30:0x0063, B:48:0x013d, B:49:0x014f), top: B:56:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAwaitFirst;
        DexMultiTokenInfoBean fromToken;
        OfflineQuote calldata;
        Object objAwaitFirst2;
        ResponseData responseData;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str = "";
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
            DefiPlatformInfo defiPlatformInfoCopydefault = gYQ.copydefault(this.$data$inlined, this.$selectedDefiPlatformId$inlined);
            String unsignedTx = (defiPlatformInfoCopydefault == null || (calldata = defiPlatformInfoCopydefault.getCalldata()) == null) ? null : calldata.getUnsignedTx();
            CommonDexInfo commonDexInfo = this.$data$inlined.getCommonDexInfo();
            String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            if (unsignedTx == null || unsignedTx.length() == 0) {
                throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null);
            }
            AbstractC58185ywX<Pair<InterfaceC9734bbF, String>> abstractC58185ywXEZpvd = this.this$0.EZpvd.AEQbTJ(new DappInteractionArgs(this.this$0.EZpvd.OLrzqt(), null, chainId, null, unsignedTx, null, "dex", C56443yFo.AEQbTJ(3), null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(1), null, null, SolanaSignType.NORMAL, null, null, -604012758, null), this.this$0.AEQbTJ(this.$data$inlined, this.this$0.EZpvd.copydefault(chainId), this.$direction$inlined)).EZpvd();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            this.label = 1;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, this);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAwaitFirst2 = obj;
                responseData = (ResponseData) objAwaitFirst2;
                if (responseData.getCode() == -5001) {
                    throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null);
                }
                C9748bbT c9748bbT = (C9748bbT) responseData.getData();
                String strGEmmrt = c9748bbT != null ? c9748bbT.gEmmrt() : null;
                if (strGEmmrt != null) {
                    str = strGEmmrt;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAwaitFirst = obj;
        }
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXKWHzl = this.this$0.AEQbTJ.KWHzl((InterfaceC9734bbF) ((Pair) objAwaitFirst).getFirst(), this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
        this.label = 2;
        objAwaitFirst2 = AwaitKt.awaitFirst(abstractC58185ywXKWHzl, this);
        if (objAwaitFirst2 == objCopydefault) {
            return objCopydefault;
        }
        responseData = (ResponseData) objAwaitFirst2;
        if (responseData.getCode() == -5001) {
        }
    }
}
