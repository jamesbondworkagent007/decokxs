package com.okinc.business.invest_biz.ui.screens.token;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC27123jpJ;
import o.C26588jfE;
import o.C27117jpD;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26561jee;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestFlowManager$executeInvestFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<TransactionConfig, Unit> $callback;
    final /* synthetic */ Function0<Unit> $dismissCallback;
    final /* synthetic */ InvestPageSource $fromSource;
    final /* synthetic */ boolean $hasMultipleProtocols;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ boolean $isRiskDialog;
    final /* synthetic */ TokenInvestDetail $tokenInvestDetail;
    int label;
    final /* synthetic */ C26588jfE this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestFlowManager$executeInvestFlow$1(C26588jfE c26588jfE, long j, TokenInvestDetail tokenInvestDetail, boolean z, InvestPageSource investPageSource, Function0<Unit> function0, Function1<? super TransactionConfig, Unit> function1, boolean z2, Continuation<? super InvestFlowManager$executeInvestFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = c26588jfE;
        this.$investmentId = j;
        this.$tokenInvestDetail = tokenInvestDetail;
        this.$hasMultipleProtocols = z;
        this.$fromSource = investPageSource;
        this.$dismissCallback = function0;
        this.$callback = function1;
        this.$isRiskDialog = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestFlowManager$executeInvestFlow$1(this.this$0, this.$investmentId, this.$tokenInvestDetail, this.$hasMultipleProtocols, this.$fromSource, this.$dismissCallback, this.$callback, this.$isRiskDialog, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestFlowManager$executeInvestFlow$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        InterfaceC26561jee interfaceC26561jeeKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27117jpD c27117jpD = this.this$0.fetchVPNInfo;
            long j = this.$investmentId;
            TokenInvestDetail tokenInvestDetail = this.$tokenInvestDetail;
            boolean z = this.$hasMultipleProtocols;
            InvestPageSource investPageSource = this.$fromSource;
            this.label = 1;
            objOLrzqt = c27117jpD.OLrzqt(j, tokenInvestDetail, z, (8 & 8) != 0, (8 & 16) != 0 ? InvestPageSource.Default : investPageSource, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        C26588jfE c26588jfE = this.this$0;
        Function0<Unit> function0 = this.$dismissCallback;
        InvestPageSource investPageSource2 = this.$fromSource;
        Function1<TransactionConfig, Unit> function1 = this.$callback;
        boolean z2 = this.$isRiskDialog;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            AbstractC27123jpJ abstractC27123jpJ = (AbstractC27123jpJ) objOLrzqt;
            if (abstractC27123jpJ instanceof AbstractC27123jpJ.Application) {
                c26588jfE.EZpvd().copydefault(((AbstractC27123jpJ.Application) abstractC27123jpJ).AEQbTJ(), c26588jfE.AYXKKw);
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                if (!(abstractC27123jpJ instanceof AbstractC27123jpJ.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                AbstractC27123jpJ.ActionBar actionBar = (AbstractC27123jpJ.ActionBar) abstractC27123jpJ;
                InterfaceC26561jee interfaceC26561jeeKWHzl2 = actionBar.KWHzl();
                InterfaceC26561jee.ActionBar actionBar2 = interfaceC26561jeeKWHzl2 instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeKWHzl2 : null;
                if (actionBar2 == null || (interfaceC26561jeeKWHzl = actionBar2.OLrzqt((261631 & 1) != 0 ? actionBar2.ejfBZ : null, (261631 & 2) != 0 ? actionBar2.isConnected : null, (261631 & 4) != 0 ? actionBar2.AhwBna : 0L, (261631 & 8) != 0 ? actionBar2.valueOf : null, (261631 & 16) != 0 ? actionBar2.EZpvd : 0L, (261631 & 32) != 0 ? actionBar2.AYXKKw : null, (261631 & 64) != 0 ? actionBar2.fJNWhG : null, (261631 & 128) != 0 ? actionBar2.gEmmrt : false, (261631 & 256) != 0 ? actionBar2.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBar2.DbNXlk : null, (261631 & 1024) != 0 ? actionBar2.values : null, (261631 & 2048) != 0 ? actionBar2.OLrzqt : null, (261631 & 4096) != 0 ? actionBar2.KWHzl : false, (261631 & 8192) != 0 ? actionBar2.fARcdN : null, (261631 & 16384) != 0 ? actionBar2.djBIcL : false, (261631 & 32768) != 0 ? actionBar2.AEQbTJ : investPageSource2, (261631 & 65536) != 0 ? actionBar2.copydefault : null, (261631 & 131072) != 0 ? actionBar2.AkhnZx : null)) == null) {
                    interfaceC26561jeeKWHzl = actionBar.KWHzl();
                }
                c26588jfE.OLrzqt().copydefault(interfaceC26561jeeKWHzl, function1);
                if ((!(interfaceC26561jeeKWHzl instanceof InterfaceC26561jee.Application) || z2) && function0 != null) {
                    function0.invoke();
                }
            }
        }
        Function0<Unit> function02 = this.$dismissCallback;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null && function02 != null) {
            function02.invoke();
        }
        return Unit.INSTANCE;
    }
}
