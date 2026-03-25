package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C27019jnL;
import o.C27315jsq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestUniv3SubscribeActivity$PriceChangeCallback$onEditModeChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isInEditMode;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;
    final /* synthetic */ InvestUniv3SubscribeActivity.Activity this$1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$PriceChangeCallback$onEditModeChange$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, boolean z, InvestUniv3SubscribeActivity.Activity activity, Continuation<? super InvestUniv3SubscribeActivity$PriceChangeCallback$onEditModeChange$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$isInEditMode = z;
        this.this$1 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$PriceChangeCallback$onEditModeChange$1(this.this$0, this.$isInEditMode, this.this$1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$PriceChangeCallback$onEditModeChange$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow<C27315jsq> mutableSharedFlowIRxXKY;
        C27315jsq c27315jsq;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<InvestUniv3SubscribeActivity.EditMode> mutableStateFlowDjBIcL = this.this$0.djBIcL();
            InvestUniv3SubscribeActivity.EditMode editModeKWHzl = this.$isInEditMode ? this.this$1.KWHzl() : InvestUniv3SubscribeActivity.EditMode.NONE;
            this.label = 1;
            if (mutableStateFlowDjBIcL.emit(editModeKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    int iKWHzl = this.this$0.isConnected().AxsJAYaxsJAY().KWHzl();
                    mutableSharedFlowIRxXKY = this.this$0.isConnected().iRxXKY();
                    c27315jsq = new C27315jsq(this.this$0.isConnected().OLrzqt(iKWHzl), iKWHzl);
                    this.label = 3;
                    if (mutableSharedFlowIRxXKY.emit(c27315jsq, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (!this.$isInEditMode) {
                        if (!this.this$0.isConnected().OcIXYQ()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                if (!this.$isInEditMode && this.this$0.isConnected().DarRvM()) {
                    if (!this.this$0.isConnected().OcIXYQ()) {
                        if (this.this$0.isConnected().ffGIBT()) {
                            this.this$0.isConnected().DXXBbs().setValue(new C27019jnL(true));
                        } else {
                            this.this$0.isConnected().DCJXGO().setValue(new C27019jnL(true));
                        }
                    } else {
                        this.this$0.AuCTel();
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (!this.$isInEditMode) {
            int iKWHzl2 = this.this$0.isConnected().AxsJAY().KWHzl();
            MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx = this.this$0.isConnected().sSMYrx();
            C27315jsq c27315jsq2 = new C27315jsq(this.this$0.isConnected().OLrzqt(iKWHzl2), iKWHzl2);
            this.label = 2;
            if (mutableSharedFlowSSMYrx.emit(c27315jsq2, this) == objCopydefault) {
                return objCopydefault;
            }
            int iKWHzl3 = this.this$0.isConnected().AxsJAYaxsJAY().KWHzl();
            mutableSharedFlowIRxXKY = this.this$0.isConnected().iRxXKY();
            c27315jsq = new C27315jsq(this.this$0.isConnected().OLrzqt(iKWHzl3), iKWHzl3);
            this.label = 3;
            if (mutableSharedFlowIRxXKY.emit(c27315jsq, this) == objCopydefault) {
            }
        }
        if (!this.$isInEditMode) {
        }
        return Unit.INSTANCE;
    }
}
