package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC12782ctV;
import o.C17862fVa;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.fUX;
import o.yHO;
import o.yIY;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$tokenAssetsFlow$3 extends SuspendLambda implements yHO<FlowCollector<? super Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription>>, AbstractC12782ctV, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ fUX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterViewModel$tokenAssetsFlow$3(fUX fux, Continuation<? super SmallAssetsConverterViewModel$tokenAssetsFlow$3> continuation) {
        super(3, continuation);
        this.this$0 = fux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription>> flowCollector, AbstractC12782ctV abstractC12782ctV, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription>>) flowCollector, abstractC12782ctV, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription>> flowCollector, AbstractC12782ctV abstractC12782ctV, Continuation<? super Unit> continuation) {
        SmallAssetsConverterViewModel$tokenAssetsFlow$3 smallAssetsConverterViewModel$tokenAssetsFlow$3 = new SmallAssetsConverterViewModel$tokenAssetsFlow$3(this.this$0, continuation);
        smallAssetsConverterViewModel$tokenAssetsFlow$3.L$0 = flowCollector;
        smallAssetsConverterViewModel$tokenAssetsFlow$3.L$1 = abstractC12782ctV;
        return smallAssetsConverterViewModel$tokenAssetsFlow$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC12782ctV abstractC12782ctV;
        FlowCollector flowCollector;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            abstractC12782ctV = (AbstractC12782ctV) this.L$1;
            C17862fVa c17862fVa = this.this$0.getNewProxyInstance;
            long jGEmmrt = this.this$0.gEmmrt();
            yIY yiy = fUX.copydefault;
            this.L$0 = flowCollector2;
            this.L$1 = abstractC12782ctV;
            this.label = 1;
            Object objEZpvd = c17862fVa.EZpvd(abstractC12782ctV, jGEmmrt, yiy, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            flowCollector = flowCollector2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            abstractC12782ctV = (AbstractC12782ctV) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Pair pairOLrzqt = C56390yDp.OLrzqt(abstractC12782ctV, obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (flowCollector.emit(pairOLrzqt, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
