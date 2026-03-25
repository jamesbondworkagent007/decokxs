package com.okinc.business.trade.features.home.advanced.usecase;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AFB;
import o.AGK;
import o.AbstractC43419rot;
import o.C28165kRh;
import o.C33077mpe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28150kQt;
import o.kTY;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DefiChainInfo>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C28165kRh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2(C28165kRh c28165kRh, Continuation<? super AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2> continuation) {
        super(2, continuation);
        this.this$0 = c28165kRh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DefiChainInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<DefiChainInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DefiChainInfo>> continuation) {
        return ((AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        C28165kRh c28165kRh;
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AFB afbEZpvd = this.this$0.KWHzl.EZpvd();
            C33077mpe c33077mpe = new C33077mpe(new AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2$result$1(afbEZpvd), new AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2$result$2(afbEZpvd), new AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2$result$3(afbEZpvd), new AdvancedMainConfigUseCase$fetchCoreAdvancedChainList$2$result$4(afbEZpvd), this.this$0.djBIcL);
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
                c28165kRh = (C28165kRh) this.L$0;
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((DefiChainInfo) obj2).getSupportCefiMode()) {
                            arrayList.add(obj2);
                        }
                    }
                    c28165kRh.copydefault(arrayList);
                }
                return abstractC43419rot.AEQbTJ();
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C28165kRh c28165kRh2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("AdvancedMainConfigUseCase", "fetchCoreAdvancedChainList failed, fallback to native", thM7380exceptionOrNullimpl);
            InterfaceC28150kQt interfaceC28150kQt = c28165kRh2.AhwBna;
            this.L$0 = c28165kRh2;
            this.label = 2;
            obj = interfaceC28150kQt.OLrzqt(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            c28165kRh = c28165kRh2;
            abstractC43419rot = (AbstractC43419rot) obj;
            if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            }
            return abstractC43419rot.AEQbTJ();
        }
        List list2 = (List) objAEQbTJ;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList2.add(kTY.EZpvd((AGK) it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((DefiChainInfo) obj3).getSupportCefiMode()) {
                arrayList3.add(obj3);
            }
        }
        this.this$0.copydefault(arrayList3);
        pUU.KWHzl("AdvancedMainConfigUseCase", "fetchCoreAdvancedChainList (core) success, size=" + arrayList3.size());
        return arrayList3;
    }
}
