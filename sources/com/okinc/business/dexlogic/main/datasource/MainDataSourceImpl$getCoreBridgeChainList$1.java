package com.okinc.business.dexlogic.main.datasource;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import o.C2149AAq;
import o.C2204ACt;
import o.C22380heK;
import o.C22384heO;
import o.C33077mpe;
import o.C4132AzA;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.kTY;
import o.pUU;

/* JADX INFO: loaded from: classes6.dex */
public final class MainDataSourceImpl$getCoreBridgeChainList$1 extends SuspendLambda implements Function2<ProducerScope<? super List<? extends DefiChainInfo>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C22384heO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDataSourceImpl$getCoreBridgeChainList$1(C22384heO c22384heO, Continuation<? super MainDataSourceImpl$getCoreBridgeChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = c22384heO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainDataSourceImpl$getCoreBridgeChainList$1 mainDataSourceImpl$getCoreBridgeChainList$1 = new MainDataSourceImpl$getCoreBridgeChainList$1(this.this$0, continuation);
        mainDataSourceImpl$getCoreBridgeChainList$1.L$0 = obj;
        return mainDataSourceImpl$getCoreBridgeChainList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProducerScope<? super List<? extends DefiChainInfo>> producerScope, Continuation<? super Unit> continuation) {
        return invoke2((ProducerScope<? super List<DefiChainInfo>>) producerScope, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProducerScope<? super List<DefiChainInfo>> producerScope, Continuation<? super Unit> continuation) {
        return ((MainDataSourceImpl$getCoreBridgeChainList$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProducerScope producerScope;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            producerScope = (ProducerScope) this.L$0;
            C2149AAq c2149AAqAD_ = this.this$0.aD_();
            Intrinsics.copydefault(c2149AAqAD_);
            C2204ACt c2204ACtAEQbTJ = c2149AAqAD_.AEQbTJ();
            C33077mpe c33077mpe = new C33077mpe(new MainDataSourceImpl$getCoreBridgeChainList$1$result$1(c2204ACtAEQbTJ), new MainDataSourceImpl$getCoreBridgeChainList$1$result$2(c2204ACtAEQbTJ), new MainDataSourceImpl$getCoreBridgeChainList$1$result$3(c2204ACtAEQbTJ), new MainDataSourceImpl$getCoreBridgeChainList$1$result$4(c2204ACtAEQbTJ), null, 16, null);
            this.L$0 = producerScope;
            this.label = 1;
            objAEQbTJ = c33077mpe.AEQbTJ(this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            producerScope = (ProducerScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        List list = (List) objAEQbTJ;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kTY.KWHzl((C4132AzA) it.next()));
        }
        this.this$0.AEQbTJ.clear();
        this.this$0.AEQbTJ.addAll(arrayList);
        this.this$0.gEmmrt.clear();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((DefiChainInfo) obj2).isSupportAAWallet()) {
                arrayList2.add(obj2);
            }
        }
        C22384heO c22384heO = this.this$0;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c22384heO.gEmmrt.add((DefiChainInfo) it2.next());
        }
        C22380heK.OLrzqt.AEQbTJ().AEQbTJ(arrayList);
        pUU.KWHzl("MainDataSourceImpl", "Core getSupportChainList (bridge) success, size=" + arrayList.size());
        this.L$0 = null;
        this.label = 2;
        if (producerScope.send(arrayList, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }
}
