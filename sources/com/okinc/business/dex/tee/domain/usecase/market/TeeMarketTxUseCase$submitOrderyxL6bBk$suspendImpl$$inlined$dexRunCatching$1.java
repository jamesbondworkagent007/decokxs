package com.okinc.business.dex.tee.domain.usecase.market;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.SignAuthType;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.error.SignCancelException;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC19751gNz;
import o.AbstractC28108kPe;
import o.AbstractC58260yxt;
import o.C19700gMb;
import o.C19735gNj;
import o.C19747gNv;
import o.C23274hvD;
import o.C23316hvt;
import o.C28109kPf;
import o.C28110kPg;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9748bbT;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.dex.tee.domain.usecase.market.TeeMarketTxUseCase$submitOrder-yxL6bBk$suspendImpl$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends SignAndBroadcastRes>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ long $chainId$inlined;
    final /* synthetic */ long $expireTimeMillis$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ TeeMarketPlaceOrderParams $marketPlaceOrderParams$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    final /* synthetic */ String $swapGenerateIntentData$inlined;
    int label;
    final /* synthetic */ AbstractC19751gNz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1(Continuation continuation, AbstractC19751gNz abstractC19751gNz, long j, String str, boolean z, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, TeeMarketPlaceOrderParams teeMarketPlaceOrderParams, long j2) {
        super(2, continuation);
        this.this$0 = abstractC19751gNz;
        this.$chainId$inlined = j;
        this.$swapGenerateIntentData$inlined = str;
        this.$silentSignWhenAvailable$inlined = z;
        this.$activity$inlined = fragmentActivity;
        this.$loadingCallback$inlined = taskDescription;
        this.$marketPlaceOrderParams$inlined = teeMarketPlaceOrderParams;
        this.$expireTimeMillis$inlined = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$swapGenerateIntentData$inlined, this.$silentSignWhenAvailable$inlined, this.$activity$inlined, this.$loadingCallback$inlined, this.$marketPlaceOrderParams$inlined, this.$expireTimeMillis$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends SignAndBroadcastRes>> continuation) {
        return ((TeeMarketTxUseCase$submitOrderyxL6bBk$suspendImpl$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAwait;
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
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
            C19700gMb c19700gMb = this.this$0.DbNXlk;
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.DbNXlk.KWHzl();
            String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtAEQbTJ = c19700gMb.AEQbTJ(new SignDataArgs<>(strDbNXlk == null ? "" : strDbNXlk, null, this.$chainId$inlined, this.this$0.OLrzqt(this.$swapGenerateIntentData$inlined), null, null, null, null, null, null, C56443yFo.AEQbTJ(3), null, null, null, null, null, null, false, false, null, false, false, false, true, 8387570, null), this.$silentSignWhenAvailable$inlined, this.$activity$inlined, this.$loadingCallback$inlined);
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtAEQbTJ, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objEZpvd = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objEZpvd);
                objM7377constructorimpl = Result.m7377constructorimpl((SignAndBroadcastRes) objEZpvd);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        ResponseData responseData = (ResponseData) objAwait;
        pUU.KWHzl("TeeMarketTxUseCase", "signResult code= " + responseData.getCode());
        int code = responseData.getCode();
        if (code == -5014 || code == -5007) {
            throw new SignCancelException(null, 1, null);
        }
        if (code != -5001) {
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), null, null, 13, null);
        }
        C9748bbT c9748bbT = (C9748bbT) responseData.getData();
        String strAEQbTJ = c9748bbT != null ? c9748bbT.AEQbTJ() : null;
        if (strAEQbTJ == null || strAEQbTJ.length() == 0) {
            pUU.KWHzl("TeeMarketTxUseCase", "resultData= " + strAEQbTJ);
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), null, null, 13, null);
        }
        pUU.KWHzl("TeeMarketTxUseCase", "signAndBroadcast marketPlaceOrderParams= " + C23316hvt.OLrzqt(this.$marketPlaceOrderParams$inlined));
        this.this$0.fetchVPNInfo.EZpvd(this.$marketPlaceOrderParams$inlined.getChainId());
        C28110kPg c28110kPg = C28110kPg.KWHzl;
        String chainId = this.$marketPlaceOrderParams$inlined.getChainId();
        String chainName = this.$marketPlaceOrderParams$inlined.getChainName();
        String businessType = this.$marketPlaceOrderParams$inlined.getBusinessType();
        TraceData traceData = this.$marketPlaceOrderParams$inlined.getTraceData();
        String quoteId = traceData != null ? traceData.getQuoteId() : null;
        C28109kPf c28109kPf = new C28109kPf(chainId, chainName, businessType, "swap", quoteId == null ? "" : quoteId, true);
        C9748bbT c9748bbT2 = (C9748bbT) responseData.getData();
        c28110kPg.copydefault(new AbstractC28108kPe.StateListAnimator(c28109kPf, c9748bbT2 != null ? c9748bbT2.EZpvd() : null));
        C9748bbT c9748bbT3 = (C9748bbT) responseData.getData();
        pUU.KWHzl("TeeMarketTxUseCase", "signAuthType = " + (c9748bbT3 != null ? c9748bbT3.EZpvd() : null));
        C19747gNv c19747gNv = this.this$0.djBIcL;
        C19735gNj c19735gNj = this.this$0.AkhnZx;
        TeeMarketPlaceOrderParams teeMarketPlaceOrderParams = this.$marketPlaceOrderParams$inlined;
        long j = this.$expireTimeMillis$inlined;
        String str = this.$swapGenerateIntentData$inlined;
        C9748bbT c9748bbT4 = (C9748bbT) responseData.getData();
        SignAndBroadcastParams signAndBroadcastParamsKWHzl = c19735gNj.KWHzl(teeMarketPlaceOrderParams, String.valueOf(j), str, strAEQbTJ, (c9748bbT4 != null ? c9748bbT4.EZpvd() : null) == SignAuthType.SILENT);
        this.label = 2;
        objEZpvd = c19747gNv.EZpvd(signAndBroadcastParamsKWHzl, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objEZpvd);
        objM7377constructorimpl = Result.m7377constructorimpl((SignAndBroadcastRes) objEZpvd);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
