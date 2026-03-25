package com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
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
import o.C28333kXn;
import o.C33070mpX;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9748bbT;
import o.InterfaceC9734bbF;
import o.InterfaceC9740bbL;
import o.gYQ;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm.MemeV6MarketEVMPMMTxUseCase$submitPMMOrder-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ V6BaseQuoteResponse $data$inlined;
    final /* synthetic */ int $direction$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ String $selectedDefiPlatformId$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C28333kXn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, V6BaseQuoteResponse v6BaseQuoteResponse, String str, C28333kXn c28333kXn, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, int i) {
        super(2, continuation);
        this.$data$inlined = v6BaseQuoteResponse;
        this.$selectedDefiPlatformId$inlined = str;
        this.this$0 = c28333kXn;
        this.$activity$inlined = fragmentActivity;
        this.$silentSignWhenAvailable$inlined = z;
        this.$loadingCallback$inlined = taskDescription;
        this.$direction$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1(continuation, this.$data$inlined, this.$selectedDefiPlatformId$inlined, this.this$0, this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined, this.$direction$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((MemeV6MarketEVMPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a A[Catch: all -> 0x019b, CancellationException -> 0x01b2, TryCatch #2 {CancellationException -> 0x01b2, all -> 0x019b, blocks: (B:7:0x0016, B:58:0x015d, B:60:0x0161, B:64:0x016c, B:12:0x002d, B:42:0x0110, B:44:0x011a, B:46:0x0122, B:51:0x012d, B:55:0x013a, B:65:0x0171, B:66:0x0186, B:15:0x003d, B:39:0x00eb, B:18:0x0048, B:20:0x0054, B:22:0x005a, B:24:0x0060, B:26:0x0068, B:28:0x006e, B:33:0x0079, B:35:0x007f, B:67:0x0187, B:68:0x019a), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0161 A[Catch: all -> 0x019b, CancellationException -> 0x01b2, TryCatch #2 {CancellationException -> 0x01b2, all -> 0x019b, blocks: (B:7:0x0016, B:58:0x015d, B:60:0x0161, B:64:0x016c, B:12:0x002d, B:42:0x0110, B:44:0x011a, B:46:0x0122, B:51:0x012d, B:55:0x013a, B:65:0x0171, B:66:0x0186, B:15:0x003d, B:39:0x00eb, B:18:0x0048, B:20:0x0054, B:22:0x005a, B:24:0x0060, B:26:0x0068, B:28:0x006e, B:33:0x0079, B:35:0x007f, B:67:0x0187, B:68:0x019a), top: B:75:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0171 A[Catch: all -> 0x019b, CancellationException -> 0x01b2, TryCatch #2 {CancellationException -> 0x01b2, all -> 0x019b, blocks: (B:7:0x0016, B:58:0x015d, B:60:0x0161, B:64:0x016c, B:12:0x002d, B:42:0x0110, B:44:0x011a, B:46:0x0122, B:51:0x012d, B:55:0x013a, B:65:0x0171, B:66:0x0186, B:15:0x003d, B:39:0x00eb, B:18:0x0048, B:20:0x0054, B:22:0x005a, B:24:0x0060, B:26:0x0068, B:28:0x006e, B:33:0x0079, B:35:0x007f, B:67:0x0187, B:68:0x019a), top: B:75:0x000e }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAwaitFirst;
        DefiPlatformInfo defiPlatformInfo;
        String str;
        DexMultiTokenInfoBean fromToken;
        OfflineQuote calldata;
        Object objAwaitFirst2;
        ResponseData responseData;
        Object objAwaitFirst3;
        String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str3 = "";
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
            AbstractC58185ywX<Pair<InterfaceC9734bbF, String>> abstractC58185ywXEZpvd = this.this$0.OLrzqt.KWHzl(new SignDataArgs<>(this.this$0.OLrzqt.OLrzqt(), null, C33129mqd.valueOf(chainId), this.this$0.EZpvd(unsignedTx), null, null, null, null, null, null, C56443yFo.AEQbTJ(3), null, null, C56443yFo.AEQbTJ(1), null, null, null, false, false, null, false, false, false, false, 16767986, null)).EZpvd();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            this.L$0 = defiPlatformInfoCopydefault;
            this.L$1 = chainId;
            this.label = 1;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, this);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
            defiPlatformInfo = defiPlatformInfoCopydefault;
            str = chainId;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objAwaitFirst3 = obj;
                    ResponseData responseData2 = (ResponseData) objAwaitFirst3;
                    str2 = responseData2 != null ? (String) responseData2.getData() : null;
                    if (str2 == null) {
                        str3 = str2;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(str3);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                str = (String) this.L$1;
                DefiPlatformInfo defiPlatformInfo2 = (DefiPlatformInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                defiPlatformInfo = defiPlatformInfo2;
                objAwaitFirst2 = obj;
                responseData = (ResponseData) objAwaitFirst2;
                if (responseData.getCode() == -5001) {
                    throw new OKServerException(responseData.getCode(), C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 12, null);
                }
                C9748bbT c9748bbT = (C9748bbT) responseData.getData();
                String strAEQbTJ = c9748bbT != null ? c9748bbT.AEQbTJ() : null;
                String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
                String quote = defiPlatformInfo.getCalldata().getQuote();
                AbstractC58185ywX<ResponseData<String>> abstractC58185ywXEZpvd2 = this.this$0.EZpvd(str4, quote == null ? "" : quote, this.this$0.OLrzqt.copydefault(str), defiPlatformInfo.getDefiPlatformId(), this.$direction$inlined);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                objAwaitFirst3 = AwaitKt.awaitFirst(abstractC58185ywXEZpvd2, this);
                if (objAwaitFirst3 == objCopydefault) {
                    return objCopydefault;
                }
                ResponseData responseData22 = (ResponseData) objAwaitFirst3;
                if (responseData22 != null) {
                }
                if (str2 == null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str3);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            str = (String) this.L$1;
            DefiPlatformInfo defiPlatformInfo3 = (DefiPlatformInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            defiPlatformInfo = defiPlatformInfo3;
            objAwaitFirst = obj;
        }
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXKWHzl = this.this$0.AEQbTJ.KWHzl((InterfaceC9734bbF) ((Pair) objAwaitFirst).getFirst(), this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
        this.L$0 = defiPlatformInfo;
        this.L$1 = str;
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
