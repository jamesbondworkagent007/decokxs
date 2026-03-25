package com.okinc.business.dex.tee.domain.usecase.limit;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.dex.tee.domain.model.CreateOrderParams;
import com.okinc.business.dex.tee.domain.model.TeeLimitPlaceOrderParams;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
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
import o.AbstractC19748gNw;
import o.AbstractC58260yxt;
import o.C19700gMb;
import o.C19739gNn;
import o.C23274hvD;
import o.C23316hvt;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9748bbT;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.dex.tee.domain.usecase.limit.TeeLimitTxUseCase$createOrder-BWLJW6A$suspendImpl$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends LimitOrderDetailBean>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ long $chainId$inlined;
    final /* synthetic */ long $expireTimeMillis$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ TeeLimitPlaceOrderParams $placeOrderParams$inlined;
    final /* synthetic */ String $swapGenerateIntentData$inlined;
    int label;
    final /* synthetic */ AbstractC19748gNw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1(Continuation continuation, AbstractC19748gNw abstractC19748gNw, long j, String str, TeeLimitPlaceOrderParams teeLimitPlaceOrderParams, FragmentActivity fragmentActivity, InterfaceC9740bbL.TaskDescription taskDescription, long j2) {
        super(2, continuation);
        this.this$0 = abstractC19748gNw;
        this.$chainId$inlined = j;
        this.$swapGenerateIntentData$inlined = str;
        this.$placeOrderParams$inlined = teeLimitPlaceOrderParams;
        this.$activity$inlined = fragmentActivity;
        this.$loadingCallback$inlined = taskDescription;
        this.$expireTimeMillis$inlined = j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1(continuation, this.this$0, this.$chainId$inlined, this.$swapGenerateIntentData$inlined, this.$placeOrderParams$inlined, this.$activity$inlined, this.$loadingCallback$inlined, this.$expireTimeMillis$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends LimitOrderDetailBean>> continuation) {
        return ((TeeLimitTxUseCase$createOrderBWLJW6A$suspendImpl$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C19700gMb c19700gMb = this.this$0.isConnected;
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.isConnected.KWHzl();
            String strDbNXlk = interfaceC9738bbJKWHzl != null ? interfaceC9738bbJKWHzl.DbNXlk() : null;
            if (strDbNXlk == null) {
                strDbNXlk = "";
            }
            AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtAEQbTJ = c19700gMb.AEQbTJ(new SignDataArgs<>(strDbNXlk, null, this.$chainId$inlined, this.this$0.KWHzl(this.$swapGenerateIntentData$inlined), null, null, null, null, null, null, C56443yFo.AEQbTJ(3), null, null, null, null, null, null, false, false, null, false, false, false, true, 8387570, null), this.$placeOrderParams$inlined.getTeeSilentSignEnabled(), this.$activity$inlined, this.$loadingCallback$inlined);
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
                objM7377constructorimpl = Result.m7377constructorimpl((LimitOrderDetailBean) objEZpvd);
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        ResponseData responseData = (ResponseData) objAwait;
        pUU.KWHzl("TeeLimitTxUseCase", "signResult code= " + responseData.getCode());
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
            pUU.KWHzl("TeeLimitTxUseCase", "resultData= " + strAEQbTJ);
            throw new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), null, null, 13, null);
        }
        pUU.KWHzl("TeeLimitTxUseCase", "signAndBroadcast placeOrderParams= " + C23316hvt.OLrzqt(this.$placeOrderParams$inlined));
        this.this$0.fetchVPNInfo.EZpvd(this.$placeOrderParams$inlined.getChainId());
        C19739gNn c19739gNn = this.this$0.AYXKKw;
        CreateOrderParams createOrderParamsKWHzl = this.this$0.AkhnZx.KWHzl(this.$placeOrderParams$inlined, this.$swapGenerateIntentData$inlined, strAEQbTJ, this.$expireTimeMillis$inlined);
        this.label = 2;
        objEZpvd = c19739gNn.EZpvd(createOrderParamsKWHzl, this);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objEZpvd);
        objM7377constructorimpl = Result.m7377constructorimpl((LimitOrderDetailBean) objEZpvd);
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
