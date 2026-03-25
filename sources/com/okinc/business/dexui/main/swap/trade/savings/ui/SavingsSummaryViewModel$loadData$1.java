package com.okinc.business.dexui.main.swap.trade.savings.ui;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexui.main.swap.trade.savings.data.SavingsSummaryResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C24857ilj;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59443zhD;
import o.InterfaceC24858ilk;

/* JADX INFO: loaded from: classes6.dex */
public final class SavingsSummaryViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SavingsSummaryViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsSummaryViewModel$loadData$1(SavingsSummaryViewModel savingsSummaryViewModel, Continuation<? super SavingsSummaryViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = savingsSummaryViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SavingsSummaryViewModel$loadData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SavingsSummaryViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault.setValue(InterfaceC24858ilk.ActionBar.OLrzqt);
            this.this$0.AEQbTJ();
            C24857ilj c24857ilj = this.this$0.KWHzl;
            this.label = 1;
            objEZpvd = c24857ilj.EZpvd(this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        SavingsSummaryViewModel savingsSummaryViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            SavingsSummaryResponse savingsSummaryResponse = (SavingsSummaryResponse) objEZpvd;
            if (savingsSummaryViewModel.copydefault(savingsSummaryResponse)) {
                savingsSummaryViewModel.copydefault.setValue(InterfaceC24858ilk.Activity.KWHzl);
                return Unit.INSTANCE;
            }
            Double dAuCTel = C59443zhD.AuCTel(savingsSummaryResponse.getTotalSavingValueUsd());
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            double dDoubleValue2 = dAuCTel != null ? dAuCTel.doubleValue() : 0.0d;
            Double dAuCTel2 = C59443zhD.AuCTel(savingsSummaryResponse.getTotalSurplusValueUsd());
            if (dAuCTel2 != null) {
                dDoubleValue = dAuCTel2.doubleValue();
            }
            savingsSummaryViewModel.copydefault.setValue(new InterfaceC24858ilk.Application(savingsSummaryResponse.getSummaryMonth(), C33129mqd.gEmmrt(C56443yFo.AEQbTJ(dDoubleValue2 + dDoubleValue)), savingsSummaryResponse.getTotalSavingValueUsd(), savingsSummaryResponse.getTotalSurplusValueUsd(), savingsSummaryResponse.getTotalTradeCount(), savingsSummaryResponse.getTotalTradeValueUsd()));
        }
        SavingsSummaryViewModel savingsSummaryViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            savingsSummaryViewModel2.copydefault.setValue(InterfaceC24858ilk.TaskDescription.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
