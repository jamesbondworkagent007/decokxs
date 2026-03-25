package com.okinc.business.defi.wallet.tee.converter.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC12782ctV;
import o.C17862fVa;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.fTZ;
import o.fUX;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterViewModel$tokenAssetsFlow$4 extends SuspendLambda implements yHO<Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription>, Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription>, Continuation<? super Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ fUX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterViewModel$tokenAssetsFlow$4(fUX fux, Continuation<? super SmallAssetsConverterViewModel$tokenAssetsFlow$4> continuation) {
        super(3, continuation);
        this.this$0 = fux;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHO
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription> pair, Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription> pair2, Continuation<? super Pair<? extends AbstractC12782ctV, ? extends C17862fVa.TaskDescription>> continuation) {
        return invoke2((Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription>) pair, (Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription>) pair2, (Continuation<? super Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription> pair, Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription> pair2, Continuation<? super Pair<? extends AbstractC12782ctV, C17862fVa.TaskDescription>> continuation) {
        SmallAssetsConverterViewModel$tokenAssetsFlow$4 smallAssetsConverterViewModel$tokenAssetsFlow$4 = new SmallAssetsConverterViewModel$tokenAssetsFlow$4(this.this$0, continuation);
        smallAssetsConverterViewModel$tokenAssetsFlow$4.L$0 = pair;
        smallAssetsConverterViewModel$tokenAssetsFlow$4.L$1 = pair2;
        return smallAssetsConverterViewModel$tokenAssetsFlow$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strAEQbTJ;
        Object next;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            Pair pair2 = (Pair) this.L$1;
            Object obj2 = null;
            if (pair != null && Intrinsics.EZpvd((Object) ((AbstractC12782ctV) pair.getFirst()).DbNXlk(), (Object) ((AbstractC12782ctV) pair2.getFirst()).DbNXlk()) && ((C17862fVa.TaskDescription) pair.getSecond()).copydefault().EZpvd() && ((C17862fVa.TaskDescription) pair2.getSecond()).copydefault().EZpvd()) {
                List<fTZ.Application> listAEQbTJ = ((C17862fVa.TaskDescription) pair2.getSecond()).copydefault().AEQbTJ();
                List<fTZ.Application> listAEQbTJ2 = ((C17862fVa.TaskDescription) pair.getSecond()).copydefault().AEQbTJ();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
                for (fTZ.Application application : listAEQbTJ2) {
                    if (application.copydefault()) {
                        Iterator<T> it = listAEQbTJ.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) ((fTZ.Application) next).OLrzqt().OLrzqt(), (Object) application.OLrzqt().OLrzqt())) {
                                break;
                            }
                        }
                        fTZ.Application application2 = (fTZ.Application) next;
                        if (application2 != null) {
                            application2.AEQbTJ(true);
                        }
                    }
                    arrayList.add(Unit.INSTANCE);
                }
            }
            fUX fux = this.this$0;
            if (((C17862fVa.TaskDescription) pair2.getSecond()).copydefault().EZpvd()) {
                List<fTZ.Application> listAEQbTJ3 = ((C17862fVa.TaskDescription) pair2.getSecond()).copydefault().AEQbTJ();
                MutableStateFlow mutableStateFlow = fux.AEQbTJ;
                Iterator<T> it2 = listAEQbTJ3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (((fTZ.Application) next2).OLrzqt().AuCTel()) {
                        obj2 = next2;
                        break;
                    }
                }
                fTZ.Application application3 = (fTZ.Application) obj2;
                if (application3 == null) {
                    strAEQbTJ = "0";
                } else {
                    listAEQbTJ3.remove(application3);
                    strAEQbTJ = application3.AEQbTJ();
                }
                mutableStateFlow.setValue(strAEQbTJ);
                fux.isConnected = listAEQbTJ3;
                fux.AuCTel();
            }
            return pair2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
