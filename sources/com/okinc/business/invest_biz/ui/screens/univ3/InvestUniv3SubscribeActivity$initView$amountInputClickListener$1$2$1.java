package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25480ixX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$initView$amountInputClickListener$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestUniv3SubscribeActivity.AmountInputIndex $inputIndex;
    final /* synthetic */ Ref.BooleanRef $isNotEnough;
    final /* synthetic */ Ref.ObjectRef<String> $maxValueToBeSet;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initView$amountInputClickListener$1$2$1(Ref.BooleanRef booleanRef, InvestUniv3SubscribeActivity investUniv3SubscribeActivity, InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex, Ref.ObjectRef<String> objectRef, Continuation<? super InvestUniv3SubscribeActivity$initView$amountInputClickListener$1$2$1> continuation) {
        super(2, continuation);
        this.$isNotEnough = booleanRef;
        this.this$0 = investUniv3SubscribeActivity;
        this.$inputIndex = amountInputIndex;
        this.$maxValueToBeSet = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initView$amountInputClickListener$1$2$1(this.$isNotEnough, this.this$0, this.$inputIndex, this.$maxValueToBeSet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initView$amountInputClickListener$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$isNotEnough.element) {
                this.this$0.isConnected().dHguZz();
                if ((this.$inputIndex != InvestUniv3SubscribeActivity.AmountInputIndex.First || !this.this$0.ejfBZ()) && (this.$inputIndex != InvestUniv3SubscribeActivity.AmountInputIndex.Second || this.this$0.ejfBZ())) {
                    MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE = this.this$0.isConnected().zuBGHE();
                    C25480ixX value = this.this$0.isConnected().zuBGHE().getValue();
                    C25480ixX c25480ixXEZpvd = value.EZpvd((6095 & 1) != 0 ? value.OLrzqt : this.$maxValueToBeSet.element, (6095 & 2) != 0 ? value.EZpvd : null, (6095 & 4) != 0 ? value.KWHzl : null, (6095 & 8) != 0 ? value.AEQbTJ : null, (6095 & 16) != 0 ? value.valueOf : false, (6095 & 32) != 0 ? value.AYXKKw : false, (6095 & 64) != 0 ? value.AhwBna : false, (6095 & 128) != 0 ? value.gEmmrt : false, (6095 & 256) != 0 ? value.djBIcL : false, (6095 & 512) != 0 ? value.values : null, (6095 & 1024) != 0 ? value.fetchVPNInfo : 0, (6095 & 2048) != 0 ? value.AkhnZx : null, (6095 & 4096) != 0 ? value.copydefault : false);
                    this.label = 2;
                    if (mutableStateFlowZuBGHE.emit(c25480ixXEZpvd, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.OLrzqt(this.$maxValueToBeSet.element, InvestUniv3SubscribeActivity.AmountInputIndex.Second);
                } else {
                    MutableStateFlow<C25480ixX> mutableStateFlowAwvSrB = this.this$0.isConnected().AwvSrB();
                    C25480ixX value2 = this.this$0.isConnected().AwvSrB().getValue();
                    C25480ixX c25480ixXEZpvd2 = value2.EZpvd((6095 & 1) != 0 ? value2.OLrzqt : this.$maxValueToBeSet.element, (6095 & 2) != 0 ? value2.EZpvd : null, (6095 & 4) != 0 ? value2.KWHzl : null, (6095 & 8) != 0 ? value2.AEQbTJ : null, (6095 & 16) != 0 ? value2.valueOf : false, (6095 & 32) != 0 ? value2.AYXKKw : false, (6095 & 64) != 0 ? value2.AhwBna : false, (6095 & 128) != 0 ? value2.gEmmrt : false, (6095 & 256) != 0 ? value2.djBIcL : false, (6095 & 512) != 0 ? value2.values : null, (6095 & 1024) != 0 ? value2.fetchVPNInfo : 0, (6095 & 2048) != 0 ? value2.AkhnZx : null, (6095 & 4096) != 0 ? value2.copydefault : false);
                    this.label = 1;
                    if (mutableStateFlowAwvSrB.emit(c25480ixXEZpvd2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    this.this$0.OLrzqt(this.$maxValueToBeSet.element, InvestUniv3SubscribeActivity.AmountInputIndex.First);
                }
            } else {
                MutableStateFlow<C25480ixX> mutableStateFlowZuBGHE2 = (!(this.$inputIndex == InvestUniv3SubscribeActivity.AmountInputIndex.First && this.this$0.ejfBZ()) && (this.$inputIndex != InvestUniv3SubscribeActivity.AmountInputIndex.Second || this.this$0.ejfBZ())) ? this.this$0.isConnected().zuBGHE() : this.this$0.isConnected().AwvSrB();
                InvestUniv3SubscribeViewModel investUniv3SubscribeViewModelIsConnected = this.this$0.isConnected();
                this.label = 3;
                if (investUniv3SubscribeViewModelIsConnected.EZpvd(mutableStateFlowZuBGHE2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt(this.$maxValueToBeSet.element, InvestUniv3SubscribeActivity.AmountInputIndex.First);
        } else if (i == 2) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.OLrzqt(this.$maxValueToBeSet.element, InvestUniv3SubscribeActivity.AmountInputIndex.Second);
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
