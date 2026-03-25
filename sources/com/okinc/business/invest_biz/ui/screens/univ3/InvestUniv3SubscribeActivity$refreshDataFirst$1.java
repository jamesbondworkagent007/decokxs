package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23732iHg;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$refreshDataFirst$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $errorAction;
    final /* synthetic */ Function1<InvestUniv3SubscribeReceiveInfo, Unit> $nextAction;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestUniv3SubscribeActivity$refreshDataFirst$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, Function1<? super InvestUniv3SubscribeReceiveInfo, Unit> function1, Function0<Unit> function0, Continuation<? super InvestUniv3SubscribeActivity$refreshDataFirst$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$nextAction = function1;
        this.$errorAction = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$refreshDataFirst$1(this.this$0, this.$nextAction, this.$errorAction, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$refreshDataFirst$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Incorrect finally slice size: {[IGET, INVOKE, IGET, INVOKE, IGET, INVOKE, SGET, INVOKE, IGET, INVOKE, IGET, INVOKE, SGET, MOVE, IF] complete}, expected: {[IGET, INVOKE, IGET, INVOKE, IGET, INVOKE, INVOKE, IGET, INVOKE, IGET, INVOKE, MOVE, IF] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        C23732iHg c23732iHg = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex = this.this$0.AuCTel;
                InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex2 = InvestUniv3SubscribeActivity.AmountInputIndex.Second;
                if ((amountInputIndex == amountInputIndex2 && !this.this$0.ejfBZ()) || (this.this$0.AuCTel == InvestUniv3SubscribeActivity.AmountInputIndex.First && this.this$0.ejfBZ())) {
                    amountInputIndex2 = InvestUniv3SubscribeActivity.AmountInputIndex.First;
                }
                String strOLrzqt = (amountInputIndex2 == InvestUniv3SubscribeActivity.AmountInputIndex.First ? this.this$0.isConnected().AwvSrB().getValue() : this.this$0.isConnected().zuBGHE().getValue()).OLrzqt();
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = this.this$0.isConnected();
                this.label = 1;
                obj = investUniv3SubscribeViewModelIsConnected.EZpvd(strOLrzqt, amountInputIndex2, false, (Continuation<? super InvestUniv3SubscribeReceiveInfo>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) obj;
            if (investUniv3SubscribeReceiveInfo == null || !investUniv3SubscribeReceiveInfo.isAllowSubscribe()) {
                Function0<Unit> function0 = this.$errorAction;
                if (function0 != null) {
                    function0.invoke();
                }
            } else {
                this.$nextAction.invoke(investUniv3SubscribeReceiveInfo);
            }
            C23732iHg c23732iHg2 = this.this$0.AhwBna;
            if (c23732iHg2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg2;
            }
            c23732iHg.DAIeex.fIwbmz();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            C23732iHg c23732iHg3 = this.this$0.AhwBna;
            if (c23732iHg3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c23732iHg = c23732iHg3;
            }
            c23732iHg.DAIeex.fIwbmz();
            throw th;
        }
    }
}
