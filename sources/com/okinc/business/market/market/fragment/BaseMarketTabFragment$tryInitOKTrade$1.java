package com.okinc.business.market.market.fragment;

import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC27884kGx;
import o.C43251rlk;
import o.C55608xnE;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49425uoM;
import o.InterfaceC54577xNn;
import o.InterfaceC54581xNr;

/* JADX INFO: loaded from: classes18.dex */
public final class BaseMarketTabFragment$tryInitOKTrade$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC27884kGx this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMarketTabFragment$tryInitOKTrade$1(AbstractC27884kGx abstractC27884kGx, Continuation<? super BaseMarketTabFragment$tryInitOKTrade$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC27884kGx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseMarketTabFragment$tryInitOKTrade$1 baseMarketTabFragment$tryInitOKTrade$1 = new BaseMarketTabFragment$tryInitOKTrade$1(this.this$0, continuation);
        baseMarketTabFragment$tryInitOKTrade$1.L$0 = obj;
        return baseMarketTabFragment$tryInitOKTrade$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseMarketTabFragment$tryInitOKTrade$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        CoroutineScope coroutineScope;
        InterfaceC54581xNr interfaceC54581xNr;
        InterfaceC54577xNn interfaceC54577xNn;
        Object objM8790ensureInitialize0E7RQCE$default;
        AbstractC27884kGx abstractC27884kGx;
        AbstractC27884kGx abstractC27884kGx2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null) {
                this.L$0 = coroutineScope;
                this.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNn, false, null, this, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                interfaceC54581xNr = null;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    if (interfaceC54581xNr != null) {
                        abstractC27884kGx = this.this$0;
                        Result.Application application2 = Result.Companion;
                        this.L$0 = abstractC27884kGx;
                        this.label = 2;
                        if (C55608xnE.tryToInitTradeGroupList$default(interfaceC54581xNr, false, this, 1, null) == objCopydefault) {
                            return objCopydefault;
                        }
                        this.L$0 = abstractC27884kGx;
                        this.label = 3;
                        if (abstractC27884kGx.EZpvd(this) != objCopydefault) {
                        }
                    } else {
                        this.this$0.fARcdN();
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC27884kGx2 = (AbstractC27884kGx) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    abstractC27884kGx2.copydefault();
                    abstractC27884kGx2.gEmmrt();
                    abstractC27884kGx2.DbNXlk();
                    abstractC27884kGx2.values();
                    abstractC27884kGx2.isConnected();
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    AbstractC27884kGx abstractC27884kGx3 = this.this$0;
                    if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                        abstractC27884kGx3.fARcdN();
                    }
                    Result.m7376boximpl(objM7377constructorimpl);
                    return Unit.INSTANCE;
                }
                abstractC27884kGx = (AbstractC27884kGx) this.L$0;
                C56391yDq.AEQbTJ(obj);
                this.L$0 = abstractC27884kGx;
                this.label = 3;
                if (abstractC27884kGx.EZpvd(this) != objCopydefault) {
                    return objCopydefault;
                }
                abstractC27884kGx2 = abstractC27884kGx;
                abstractC27884kGx2.copydefault();
                abstractC27884kGx2.gEmmrt();
                abstractC27884kGx2.DbNXlk();
                abstractC27884kGx2.values();
                abstractC27884kGx2.isConnected();
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                AbstractC27884kGx abstractC27884kGx32 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                }
                Result.m7376boximpl(objM7377constructorimpl);
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM8790ensureInitialize0E7RQCE$default = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objM8790ensureInitialize0E7RQCE$default)) {
            objM8790ensureInitialize0E7RQCE$default = null;
        }
        interfaceC54581xNr = (InterfaceC54581xNr) objM8790ensureInitialize0E7RQCE$default;
        if (CoroutineScopeKt.isActive(coroutineScope)) {
        }
        return Unit.INSTANCE;
    }
}
