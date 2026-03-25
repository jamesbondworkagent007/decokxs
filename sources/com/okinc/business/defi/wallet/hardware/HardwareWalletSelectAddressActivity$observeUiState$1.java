package com.okinc.business.defi.wallet.hardware;

import android.app.Activity;
import android.widget.TextView;
import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC16383eir;
import o.C15296eDb;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.eEL;
import o.eEX;
import o.pUU;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class HardwareWalletSelectAddressActivity$observeUiState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ eEL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HardwareWalletSelectAddressActivity$observeUiState$1(eEL eel, Continuation<? super HardwareWalletSelectAddressActivity$observeUiState$1> continuation) {
        super(2, continuation);
        this.this$0 = eel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HardwareWalletSelectAddressActivity$observeUiState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HardwareWalletSelectAddressActivity$observeUiState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<eEX.ActionBar> stateFlowAhwBna = this.this$0.djBIcL().AhwBna();
            final eEL eel = this.this$0;
            FlowCollector<? super eEX.ActionBar> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.hardware.HardwareWalletSelectAddressActivity$observeUiState$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(eEX.ActionBar actionBar, Continuation<? super Unit> continuation) {
                    pUU.OLrzqt(">>>ledger observeUiState thread:" + Thread.currentThread() + " collect :" + actionBar);
                    if (actionBar.djBIcL()) {
                        eel.values();
                        return Unit.INSTANCE;
                    }
                    if (!actionBar.valueOf()) {
                        eel.gEmmrt();
                        AbstractC16383eir abstractC16383eir = null;
                        rVN.reportFullyDrawn$default((Activity) eel, true, (String) null, 2, (Object) null);
                        if (!actionBar.copydefault().isEmpty()) {
                            AbstractC16383eir abstractC16383eir2 = eel.AhwBna;
                            if (abstractC16383eir2 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC16383eir2 = null;
                            }
                            abstractC16383eir2.AYXKKw.setVisibility(0);
                            AbstractC16383eir abstractC16383eir3 = eel.AhwBna;
                            if (abstractC16383eir3 == null) {
                                Intrinsics.gEmmrt("");
                                abstractC16383eir3 = null;
                            }
                            TextView textView = abstractC16383eir3.AhwBna;
                            HardwareWalletDerivationPath hardwareWalletDerivationPathAEQbTJ = actionBar.AEQbTJ();
                            textView.setText(hardwareWalletDerivationPathAEQbTJ != null ? hardwareWalletDerivationPathAEQbTJ.getTitle() : null);
                        } else {
                            AbstractC16383eir abstractC16383eir4 = eel.AhwBna;
                            if (abstractC16383eir4 == null) {
                                Intrinsics.gEmmrt("");
                            } else {
                                abstractC16383eir = abstractC16383eir4;
                            }
                            abstractC16383eir.AYXKKw.setVisibility(8);
                        }
                        if (actionBar.gEmmrt()) {
                            if (C33129mqd.KWHzl((Collection) actionBar.OLrzqt())) {
                                C15296eDb.setData$default(eel.copydefault(), actionBar.OLrzqt(), false, actionBar.EZpvd(), 2, null);
                            }
                        } else if (!actionBar.KWHzl().isEmpty()) {
                            C15296eDb.setData$default(eel.copydefault(), actionBar.KWHzl(), false, actionBar.EZpvd(), 2, null);
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAhwBna.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
