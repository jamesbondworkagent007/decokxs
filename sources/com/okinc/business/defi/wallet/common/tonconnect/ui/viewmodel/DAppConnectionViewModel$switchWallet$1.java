package com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.C15935eaT;
import o.C15937eaV;
import o.C16026ecE;
import o.C16029ecH;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectionViewModel$switchWallet$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C16029ecH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectionViewModel$switchWallet$1(C16029ecH c16029ecH, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectionViewModel$switchWallet$1> continuation) {
        super(2, continuation);
        this.this$0 = c16029ecH;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectionViewModel$switchWallet$1(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppConnectionViewModel$switchWallet$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:13:0x0084). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableStateFlow mutableStateFlow;
        AbstractC12782ctV abstractC12782ctV;
        C16029ecH c16029ecH;
        Object connectAndSignData$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mutableStateFlow = this.this$0.copydefault;
            abstractC12782ctV = this.$wallet;
            c16029ecH = this.this$0;
            Object value = mutableStateFlow.getValue();
            C16026ecE c16026ecE = (C16026ecE) value;
            i = !c16029ecH.OLrzqt(abstractC12782ctV) ? 1 : 0;
            C15935eaT c15935eaT = c16029ecH.AEQbTJ;
            this.L$0 = mutableStateFlow;
            this.L$1 = abstractC12782ctV;
            this.L$2 = c16029ecH;
            this.L$3 = value;
            this.L$4 = abstractC12782ctV;
            this.L$5 = c16026ecE;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 1;
            connectAndSignData$default = C15935eaT.getConnectAndSignData$default(c15935eaT, null, abstractC12782ctV, this, 1, null);
            if (connectAndSignData$default == objCopydefault) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.I$1;
            int i3 = this.I$0;
            C16026ecE c16026ecE2 = (C16026ecE) this.L$5;
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) this.L$4;
            Object obj2 = this.L$3;
            C16029ecH c16029ecH2 = (C16029ecH) this.L$2;
            abstractC12782ctV = (AbstractC12782ctV) this.L$1;
            MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.L$0;
            C56391yDq.AEQbTJ(obj);
            int i4 = i3;
            C16026ecE c16026ecE3 = c16026ecE2;
            AbstractC12782ctV abstractC12782ctV3 = abstractC12782ctV2;
            mutableStateFlow = mutableStateFlow2;
            int i5 = i2;
            c16029ecH = c16029ecH2;
            connectAndSignData$default = obj;
            if (mutableStateFlow.compareAndSet(obj2, c16026ecE3.copydefault((1022 & 1) != 0 ? c16026ecE3.KWHzl : null, (1022 & 2) != 0 ? c16026ecE3.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE3.djBIcL : abstractC12782ctV3, (1022 & 8) != 0 ? c16026ecE3.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE3.AhwBna : null, (1022 & 32) != 0 ? c16026ecE3.EZpvd : i5 == 0, (1022 & 64) != 0 ? c16026ecE3.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE3.valueOf : null, (1022 & 256) != 0 ? c16026ecE3.OLrzqt : i4 == 0, (1022 & 512) != 0 ? c16026ecE3.copydefault : (C15937eaV) connectAndSignData$default))) {
                return Unit.INSTANCE;
            }
            Object value2 = mutableStateFlow.getValue();
            C16026ecE c16026ecE4 = (C16026ecE) value2;
            i4 = !c16029ecH.OLrzqt(abstractC12782ctV) ? 1 : 0;
            C15935eaT c15935eaT2 = c16029ecH.AEQbTJ;
            this.L$0 = mutableStateFlow;
            this.L$1 = abstractC12782ctV;
            this.L$2 = c16029ecH;
            this.L$3 = value2;
            this.L$4 = abstractC12782ctV;
            this.L$5 = c16026ecE4;
            this.I$0 = i4;
            this.I$1 = 0;
            this.label = 1;
            connectAndSignData$default = C15935eaT.getConnectAndSignData$default(c15935eaT2, null, abstractC12782ctV, this, 1, null);
            if (connectAndSignData$default == objCopydefault) {
                return objCopydefault;
            }
            i5 = 0;
            abstractC12782ctV3 = abstractC12782ctV;
            obj2 = value2;
            c16026ecE3 = c16026ecE4;
            if (mutableStateFlow.compareAndSet(obj2, c16026ecE3.copydefault((1022 & 1) != 0 ? c16026ecE3.KWHzl : null, (1022 & 2) != 0 ? c16026ecE3.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE3.djBIcL : abstractC12782ctV3, (1022 & 8) != 0 ? c16026ecE3.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE3.AhwBna : null, (1022 & 32) != 0 ? c16026ecE3.EZpvd : i5 == 0, (1022 & 64) != 0 ? c16026ecE3.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE3.valueOf : null, (1022 & 256) != 0 ? c16026ecE3.OLrzqt : i4 == 0, (1022 & 512) != 0 ? c16026ecE3.copydefault : (C15937eaV) connectAndSignData$default))) {
            }
            Object value22 = mutableStateFlow.getValue();
            C16026ecE c16026ecE42 = (C16026ecE) value22;
            i4 = !c16029ecH.OLrzqt(abstractC12782ctV) ? 1 : 0;
            C15935eaT c15935eaT22 = c16029ecH.AEQbTJ;
            this.L$0 = mutableStateFlow;
            this.L$1 = abstractC12782ctV;
            this.L$2 = c16029ecH;
            this.L$3 = value22;
            this.L$4 = abstractC12782ctV;
            this.L$5 = c16026ecE42;
            this.I$0 = i4;
            this.I$1 = 0;
            this.label = 1;
            connectAndSignData$default = C15935eaT.getConnectAndSignData$default(c15935eaT22, null, abstractC12782ctV, this, 1, null);
            if (connectAndSignData$default == objCopydefault) {
            }
        }
    }
}
