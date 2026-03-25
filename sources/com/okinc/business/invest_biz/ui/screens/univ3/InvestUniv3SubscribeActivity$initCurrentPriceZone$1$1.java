package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23732iHg;
import o.C27315jsq;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeActivity$initCurrentPriceZone$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $basePrecision;
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeActivity$initCurrentPriceZone$1$1(InvestUniv3SubscribeActivity investUniv3SubscribeActivity, int i, Continuation<? super InvestUniv3SubscribeActivity$initCurrentPriceZone$1$1> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeActivity;
        this.$basePrecision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeActivity$initCurrentPriceZone$1$1(this.this$0, this.$basePrecision, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUniv3SubscribeActivity$initCurrentPriceZone$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C27315jsq c27315jsq;
        MutableSharedFlow<C27315jsq> mutableSharedFlowIRxXKY;
        C27315jsq c27315jsq2;
        MutableSharedFlow<C27315jsq> mutableSharedFlowSSMYrx;
        C23732iHg c23732iHg;
        C23732iHg c23732iHg2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<InvestUniv3SubscribeActivity.EditMode> mutableStateFlowDjBIcL = this.this$0.djBIcL();
            InvestUniv3SubscribeActivity.EditMode editMode = InvestUniv3SubscribeActivity.EditMode.NONE;
            this.label = 1;
            if (mutableStateFlowDjBIcL.emit(editMode, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    c27315jsq = new C27315jsq(this.this$0.isConnected().OLrzqt(this.this$0.isConnected().AxsJAY().KWHzl()), this.this$0.isConnected().AxsJAY().KWHzl());
                    C27315jsq c27315jsq3 = new C27315jsq(this.this$0.isConnected().OLrzqt(this.this$0.isConnected().AxsJAYaxsJAY().KWHzl()), this.this$0.isConnected().AxsJAYaxsJAY().KWHzl());
                    mutableSharedFlowIRxXKY = this.this$0.isConnected().iRxXKY();
                    this.L$0 = c27315jsq3;
                    this.label = 3;
                    if (mutableSharedFlowIRxXKY.emit(c27315jsq, this) != objCopydefault) {
                        return objCopydefault;
                    }
                    c27315jsq2 = c27315jsq3;
                    mutableSharedFlowSSMYrx = this.this$0.isConnected().sSMYrx();
                    this.L$0 = null;
                    this.label = 4;
                    if (mutableSharedFlowSSMYrx.emit(c27315jsq2, this) == objCopydefault) {
                    }
                    c23732iHg = this.this$0.AhwBna;
                    if (c23732iHg == null) {
                    }
                    c23732iHg.fvQaOB.AEQbTJ((this.this$0.ejfBZ() ? this.this$0.isConnected().AwvSrB() : this.this$0.isConnected().zuBGHE()).getValue());
                    c23732iHg2 = this.this$0.AhwBna;
                    if (c23732iHg2 == null) {
                    }
                    c23732iHg2.giSNqX.AEQbTJ((this.this$0.ejfBZ() ? this.this$0.isConnected().zuBGHE() : this.this$0.isConnected().AwvSrB()).getValue());
                    this.this$0.zsXlph();
                    this.this$0.isConnected().QkdxfA();
                    this.this$0.AuCTelauCTel();
                    this.this$0.AubY();
                    this.this$0.EZpvd(true);
                    this.this$0.EZpvd((String) null, true);
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    c23732iHg = this.this$0.AhwBna;
                    if (c23732iHg == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg = null;
                    }
                    c23732iHg.fvQaOB.AEQbTJ((this.this$0.ejfBZ() ? this.this$0.isConnected().AwvSrB() : this.this$0.isConnected().zuBGHE()).getValue());
                    c23732iHg2 = this.this$0.AhwBna;
                    if (c23732iHg2 == null) {
                        Intrinsics.gEmmrt("");
                        c23732iHg2 = null;
                    }
                    c23732iHg2.giSNqX.AEQbTJ((this.this$0.ejfBZ() ? this.this$0.isConnected().zuBGHE() : this.this$0.isConnected().AwvSrB()).getValue());
                    this.this$0.zsXlph();
                    this.this$0.isConnected().QkdxfA();
                    this.this$0.AuCTelauCTel();
                    this.this$0.AubY();
                    this.this$0.EZpvd(true);
                    this.this$0.EZpvd((String) null, true);
                    return Unit.INSTANCE;
                }
                c27315jsq2 = (C27315jsq) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlowSSMYrx = this.this$0.isConnected().sSMYrx();
                this.L$0 = null;
                this.label = 4;
                if (mutableSharedFlowSSMYrx.emit(c27315jsq2, this) == objCopydefault) {
                    return objCopydefault;
                }
                c23732iHg = this.this$0.AhwBna;
                if (c23732iHg == null) {
                }
                c23732iHg.fvQaOB.AEQbTJ((this.this$0.ejfBZ() ? this.this$0.isConnected().AwvSrB() : this.this$0.isConnected().zuBGHE()).getValue());
                c23732iHg2 = this.this$0.AhwBna;
                if (c23732iHg2 == null) {
                }
                c23732iHg2.giSNqX.AEQbTJ((this.this$0.ejfBZ() ? this.this$0.isConnected().zuBGHE() : this.this$0.isConnected().AwvSrB()).getValue());
                this.this$0.zsXlph();
                this.this$0.isConnected().QkdxfA();
                this.this$0.AuCTelauCTel();
                this.this$0.AubY();
                this.this$0.EZpvd(true);
                this.this$0.EZpvd((String) null, true);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        MutableStateFlow<BigDecimal> mutableStateFlowEjfBZ = this.this$0.isConnected().ejfBZ();
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(C33129mqd.divS$default(C56443yFo.AEQbTJ(1), this.this$0.isConnected().ejfBZ().getValue(), C56443yFo.AEQbTJ(this.$basePrecision), null, null, 12, null));
        this.label = 2;
        if (mutableStateFlowEjfBZ.emit(bigDecimalEZpvd, this) == objCopydefault) {
            return objCopydefault;
        }
        c27315jsq = new C27315jsq(this.this$0.isConnected().OLrzqt(this.this$0.isConnected().AxsJAY().KWHzl()), this.this$0.isConnected().AxsJAY().KWHzl());
        C27315jsq c27315jsq32 = new C27315jsq(this.this$0.isConnected().OLrzqt(this.this$0.isConnected().AxsJAYaxsJAY().KWHzl()), this.this$0.isConnected().AxsJAYaxsJAY().KWHzl());
        mutableSharedFlowIRxXKY = this.this$0.isConnected().iRxXKY();
        this.L$0 = c27315jsq32;
        this.label = 3;
        if (mutableSharedFlowIRxXKY.emit(c27315jsq, this) != objCopydefault) {
        }
    }
}
