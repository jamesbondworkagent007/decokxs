package com.okinc.kline.ui.unlock.ui;

import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C36094oPa;
import o.C39708pxT;
import o.C39729pxo;
import o.C39737pxw;
import o.C39774pyg;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class KlineUnlockAllocationFragment$initView$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C39729pxo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineUnlockAllocationFragment$initView$4(C39729pxo c39729pxo, Continuation<? super KlineUnlockAllocationFragment$initView$4> continuation) {
        super(2, continuation);
        this.this$0 = c39729pxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineUnlockAllocationFragment$initView$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((KlineUnlockAllocationFragment$initView$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.unlock.ui.KlineUnlockAllocationFragment$initView$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C39729pxo this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C39729pxo c39729pxo, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c39729pxo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C39774pyg c39774pyg;
            float f;
            int indexOfDataSet;
            List<IPieDataSet> dataSets;
            List<PieEntry> values;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                String str = (String) this.L$0;
                this.this$0.getTAG();
                C39729pxo.TaskDescription taskDescription = this.this$0.gEmmrt;
                List<C39737pxw<C39708pxT>> listKWHzl = this.this$0.gEmmrt.KWHzl();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
                Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    C39737pxw c39737pxw = (C39737pxw) it.next();
                    arrayList.add(new C39737pxw<>(c39737pxw.copydefault(), Intrinsics.EZpvd((Object) str, (Object) ((C39708pxT) c39737pxw.copydefault()).copydefault())));
                }
                taskDescription.EZpvd(arrayList);
                C36094oPa c36094oPaAYXKKw = this.this$0.AYXKKw();
                if (c36094oPaAYXKKw != null && (c39774pyg = c36094oPaAYXKKw.djBIcL) != null) {
                    PieData pieData = (PieData) c39774pyg.getData();
                    if (pieData == null || (dataSets = pieData.getDataSets()) == null) {
                        f = -1.0f;
                        indexOfDataSet = -1;
                    } else {
                        f = -1.0f;
                        indexOfDataSet = -1;
                        for (IPieDataSet iPieDataSet : dataSets) {
                            PieDataSet pieDataSet = iPieDataSet instanceof PieDataSet ? (PieDataSet) iPieDataSet : null;
                            if (pieDataSet != null && (values = pieDataSet.getValues()) != null) {
                                Iterator<T> it2 = values.iterator();
                                int i = 0;
                                while (true) {
                                    if (it2.hasNext()) {
                                        Object next = it2.next();
                                        if (i < 0) {
                                            yDY.AYXKKw();
                                        }
                                        PieEntry pieEntry = (PieEntry) next;
                                        if (pieEntry == null) {
                                            pieEntry = null;
                                        }
                                        if (pieEntry != null) {
                                            Object data = pieEntry.getData();
                                            C39708pxT c39708pxT = data instanceof C39708pxT ? (C39708pxT) data : null;
                                            if (c39708pxT != null && Intrinsics.EZpvd((Object) c39708pxT.copydefault(), (Object) str)) {
                                                f = i;
                                                indexOfDataSet = ((PieData) c39774pyg.getData()).getIndexOfDataSet(pieDataSet);
                                                break;
                                            }
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                    if (f != -1.0f && indexOfDataSet != -1) {
                        c39774pyg.highlightValue(f, 0, true);
                        c39774pyg.invalidate();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<String> mutableStateFlowAEQbTJ = this.this$0.KWHzl().AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(mutableStateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
