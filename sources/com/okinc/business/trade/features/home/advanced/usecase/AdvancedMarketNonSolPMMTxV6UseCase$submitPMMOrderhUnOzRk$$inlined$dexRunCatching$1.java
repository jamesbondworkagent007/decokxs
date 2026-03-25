package com.okinc.business.trade.features.home.advanced.usecase;

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
import o.C28172kRo;
import o.C28180kRw;
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

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrder-hUnOzRk$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ V6BaseQuoteResponse $data$inlined;
    final /* synthetic */ int $direction$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C28172kRo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1(Continuation continuation, V6BaseQuoteResponse v6BaseQuoteResponse, C28172kRo c28172kRo, FragmentActivity fragmentActivity, boolean z, InterfaceC9740bbL.TaskDescription taskDescription, int i) {
        super(2, continuation);
        this.$data$inlined = v6BaseQuoteResponse;
        this.this$0 = c28172kRo;
        this.$activity$inlined = fragmentActivity;
        this.$silentSignWhenAvailable$inlined = z;
        this.$loadingCallback$inlined = taskDescription;
        this.$direction$inlined = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1(continuation, this.$data$inlined, this.this$0, this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined, this.$direction$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((AdvancedMarketNonSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136 A[Catch: all -> 0x01cc, CancellationException -> 0x01e3, TryCatch #2 {CancellationException -> 0x01e3, all -> 0x01cc, blocks: (B:8:0x0019, B:69:0x0197, B:71:0x019b, B:75:0x01a6, B:13:0x0038, B:62:0x0175, B:66:0x017c, B:16:0x004a, B:47:0x012c, B:49:0x0136, B:51:0x0144, B:55:0x014d, B:58:0x0158, B:76:0x01ab, B:77:0x01b8, B:19:0x005a, B:43:0x0106, B:22:0x0065, B:24:0x006f, B:26:0x0075, B:28:0x007b, B:30:0x0083, B:32:0x0089, B:37:0x0094, B:39:0x009a, B:78:0x01b9, B:79:0x01cb), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019b A[Catch: all -> 0x01cc, CancellationException -> 0x01e3, TryCatch #2 {CancellationException -> 0x01e3, all -> 0x01cc, blocks: (B:8:0x0019, B:69:0x0197, B:71:0x019b, B:75:0x01a6, B:13:0x0038, B:62:0x0175, B:66:0x017c, B:16:0x004a, B:47:0x012c, B:49:0x0136, B:51:0x0144, B:55:0x014d, B:58:0x0158, B:76:0x01ab, B:77:0x01b8, B:19:0x005a, B:43:0x0106, B:22:0x0065, B:24:0x006f, B:26:0x0075, B:28:0x007b, B:30:0x0083, B:32:0x0089, B:37:0x0094, B:39:0x009a, B:78:0x01b9, B:79:0x01cb), top: B:86:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ab A[Catch: all -> 0x01cc, CancellationException -> 0x01e3, TryCatch #2 {CancellationException -> 0x01e3, all -> 0x01cc, blocks: (B:8:0x0019, B:69:0x0197, B:71:0x019b, B:75:0x01a6, B:13:0x0038, B:62:0x0175, B:66:0x017c, B:16:0x004a, B:47:0x012c, B:49:0x0136, B:51:0x0144, B:55:0x014d, B:58:0x0158, B:76:0x01ab, B:77:0x01b8, B:19:0x005a, B:43:0x0106, B:22:0x0065, B:24:0x006f, B:26:0x0075, B:28:0x007b, B:30:0x0083, B:32:0x0089, B:37:0x0094, B:39:0x009a, B:78:0x01b9, B:79:0x01cb), top: B:86:0x000f }] */
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
        DefiPlatformInfo defiPlatformInfo2;
        ResponseData responseData;
        C28180kRw c28180kRw;
        Object objOLrzqt;
        String str2;
        String str3;
        Object objAwaitFirst3;
        String str4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String str5 = "";
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
            AbstractC58185ywX<Pair<InterfaceC9734bbF, String>> abstractC58185ywXEZpvd = this.this$0.EZpvd.KWHzl(new SignDataArgs<>(this.this$0.EZpvd.copydefault(), null, C33129mqd.valueOf(chainId), this.this$0.KWHzl(unsignedTx), null, null, null, null, null, null, C56443yFo.AEQbTJ(3), null, null, C56443yFo.AEQbTJ(1), null, null, null, false, false, null, false, false, false, false, 16767986, null)).EZpvd();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            this.L$0 = selectedDeFiPlatform;
            this.L$1 = chainId;
            this.label = 1;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, this);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
            defiPlatformInfo = selectedDeFiPlatform;
            str = chainId;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        objAwaitFirst3 = obj;
                        ResponseData responseData2 = (ResponseData) objAwaitFirst3;
                        str4 = responseData2 != null ? (String) responseData2.getData() : null;
                        if (str4 != null) {
                            str5 = str4;
                        }
                        objM7377constructorimpl = Result.m7377constructorimpl(str5);
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    C28180kRw c28180kRw2 = (C28180kRw) this.L$3;
                    String str6 = (String) this.L$2;
                    String str7 = (String) this.L$1;
                    defiPlatformInfo2 = (DefiPlatformInfo) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    c28180kRw = c28180kRw2;
                    str3 = str6;
                    str2 = str7;
                    objOLrzqt = obj;
                    String str8 = (String) objOLrzqt;
                    AbstractC58185ywX<ResponseData<String>> abstractC58185ywXAEQbTJ = c28180kRw.AEQbTJ(str3, str2, str8 != null ? "" : str8, defiPlatformInfo2.getDefiPlatformId(), this.$direction$inlined);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    objAwaitFirst3 = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, this);
                    if (objAwaitFirst3 == objCopydefault) {
                        return objCopydefault;
                    }
                    ResponseData responseData22 = (ResponseData) objAwaitFirst3;
                    if (responseData22 != null) {
                    }
                    if (str4 != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(str5);
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
                str = (String) this.L$1;
                DefiPlatformInfo defiPlatformInfo3 = (DefiPlatformInfo) this.L$0;
                C56391yDq.AEQbTJ(obj);
                defiPlatformInfo2 = defiPlatformInfo3;
                objAwaitFirst2 = obj;
                responseData = (ResponseData) objAwaitFirst2;
                if (responseData.getCode() == -5001) {
                    throw new OKServerException(0, null, null, null, 15, null);
                }
                c28180kRw = this.this$0.OLrzqt;
                C9748bbT c9748bbT = (C9748bbT) responseData.getData();
                String strAEQbTJ = c9748bbT != null ? c9748bbT.AEQbTJ() : null;
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                String quote = defiPlatformInfo2.getCalldata().getQuote();
                if (quote == null) {
                    quote = "";
                }
                C28196kSl c28196kSl = this.this$0.EZpvd;
                long jValueOf = C33129mqd.valueOf(str);
                this.L$0 = defiPlatformInfo2;
                this.L$1 = quote;
                this.L$2 = strAEQbTJ;
                this.L$3 = c28180kRw;
                this.label = 3;
                objOLrzqt = c28196kSl.OLrzqt(jValueOf, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                str2 = quote;
                str3 = strAEQbTJ;
                String str82 = (String) objOLrzqt;
                AbstractC58185ywX<ResponseData<String>> abstractC58185ywXAEQbTJ2 = c28180kRw.AEQbTJ(str3, str2, str82 != null ? "" : str82, defiPlatformInfo2.getDefiPlatformId(), this.$direction$inlined);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                objAwaitFirst3 = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ2, this);
                if (objAwaitFirst3 == objCopydefault) {
                }
                ResponseData responseData222 = (ResponseData) objAwaitFirst3;
                if (responseData222 != null) {
                }
                if (str4 != null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(str5);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            str = (String) this.L$1;
            DefiPlatformInfo defiPlatformInfo4 = (DefiPlatformInfo) this.L$0;
            C56391yDq.AEQbTJ(obj);
            defiPlatformInfo = defiPlatformInfo4;
            objAwaitFirst = obj;
        }
        AbstractC58185ywX<ResponseData<C9748bbT>> abstractC58185ywXKWHzl = this.this$0.OLrzqt.KWHzl((InterfaceC9734bbF) ((Pair) objAwaitFirst).getFirst(), this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
        this.L$0 = defiPlatformInfo;
        this.L$1 = str;
        this.label = 2;
        objAwaitFirst2 = AwaitKt.awaitFirst(abstractC58185ywXKWHzl, this);
        if (objAwaitFirst2 == objCopydefault) {
            return objCopydefault;
        }
        defiPlatformInfo2 = defiPlatformInfo;
        responseData = (ResponseData) objAwaitFirst2;
        if (responseData.getCode() == -5001) {
        }
    }
}
