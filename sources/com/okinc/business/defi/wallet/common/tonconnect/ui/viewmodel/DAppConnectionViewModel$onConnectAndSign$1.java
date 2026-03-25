package com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel;

import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
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
import o.C56443yFo;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectionViewModel$onConnectAndSign$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C15937eaV $connectAndSignData;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int label;
    final /* synthetic */ C16029ecH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectionViewModel$onConnectAndSign$1(C16029ecH c16029ecH, C15937eaV c15937eaV, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectionViewModel$onConnectAndSign$1> continuation) {
        super(2, continuation);
        this.this$0 = c16029ecH;
        this.$connectAndSignData = c15937eaV;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectionViewModel$onConnectAndSign$1(this.this$0, this.$connectAndSignData, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppConnectionViewModel$onConnectAndSign$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object value;
        C16026ecE c16026ecE;
        Object objOLrzqt;
        Object value2;
        C16026ecE c16026ecE2;
        boolean zBooleanValue;
        MutableStateFlow mutableStateFlow;
        Object value3;
        C16026ecE c16026ecE3;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15935eaT c15935eaT = this.this$0.AEQbTJ;
            C15937eaV c15937eaV = this.$connectAndSignData;
            AbstractC12782ctV abstractC12782ctV = this.$wallet;
            this.label = 1;
            objCopydefault = c15935eaT.copydefault(c15937eaV, abstractC12782ctV, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                zBooleanValue = ((Boolean) objOLrzqt).booleanValue();
                mutableStateFlow = this.this$0.copydefault;
                do {
                    value3 = mutableStateFlow.getValue();
                    c16026ecE3 = (C16026ecE) value3;
                } while (!mutableStateFlow.compareAndSet(value3, c16026ecE3.copydefault((1022 & 1) != 0 ? c16026ecE3.KWHzl : C56443yFo.AEQbTJ(!zBooleanValue ? 2 : 5), (1022 & 2) != 0 ? c16026ecE3.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE3.djBIcL : null, (1022 & 8) != 0 ? c16026ecE3.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE3.AhwBna : null, (1022 & 32) != 0 ? c16026ecE3.EZpvd : false, (1022 & 64) != 0 ? c16026ecE3.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE3.valueOf : null, (1022 & 256) != 0 ? c16026ecE3.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE3.copydefault : null)));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = obj;
        }
        WalletEvent walletEvent = (WalletEvent) objCopydefault;
        if (walletEvent != null) {
            MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
            do {
                value = mutableStateFlow2.getValue();
                c16026ecE = (C16026ecE) value;
            } while (!mutableStateFlow2.compareAndSet(value, c16026ecE.copydefault((1022 & 1) != 0 ? c16026ecE.KWHzl : C56443yFo.AEQbTJ(1), (1022 & 2) != 0 ? c16026ecE.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE.djBIcL : null, (1022 & 8) != 0 ? c16026ecE.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE.AhwBna : null, (1022 & 32) != 0 ? c16026ecE.EZpvd : false, (1022 & 64) != 0 ? c16026ecE.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE.valueOf : null, (1022 & 256) != 0 ? c16026ecE.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE.copydefault : null)));
            if (walletEvent instanceof WalletEvent.ConnectError) {
                MutableStateFlow mutableStateFlow3 = this.this$0.copydefault;
                do {
                    value2 = mutableStateFlow3.getValue();
                    c16026ecE2 = (C16026ecE) value2;
                } while (!mutableStateFlow3.compareAndSet(value2, c16026ecE2.copydefault((1022 & 1) != 0 ? c16026ecE2.KWHzl : C56443yFo.AEQbTJ(5), (1022 & 2) != 0 ? c16026ecE2.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE2.djBIcL : null, (1022 & 8) != 0 ? c16026ecE2.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE2.AhwBna : null, (1022 & 32) != 0 ? c16026ecE2.EZpvd : false, (1022 & 64) != 0 ? c16026ecE2.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE2.valueOf : null, (1022 & 256) != 0 ? c16026ecE2.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE2.copydefault : null)));
                return Unit.INSTANCE;
            }
            C15935eaT c15935eaT2 = this.this$0.AEQbTJ;
            AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
            this.label = 2;
            objOLrzqt = c15935eaT2.OLrzqt(walletEvent, abstractC12782ctV2, this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
            zBooleanValue = ((Boolean) objOLrzqt).booleanValue();
            mutableStateFlow = this.this$0.copydefault;
            do {
                value3 = mutableStateFlow.getValue();
                c16026ecE3 = (C16026ecE) value3;
            } while (!mutableStateFlow.compareAndSet(value3, c16026ecE3.copydefault((1022 & 1) != 0 ? c16026ecE3.KWHzl : C56443yFo.AEQbTJ(!zBooleanValue ? 2 : 5), (1022 & 2) != 0 ? c16026ecE3.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE3.djBIcL : null, (1022 & 8) != 0 ? c16026ecE3.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE3.AhwBna : null, (1022 & 32) != 0 ? c16026ecE3.EZpvd : false, (1022 & 64) != 0 ? c16026ecE3.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE3.valueOf : null, (1022 & 256) != 0 ? c16026ecE3.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE3.copydefault : null)));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
