package com.okinc.business.trade.features.home.meme.usecase.chainlist;

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
import o.C33077mpe;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28276kVk;
import o.kTY;
import o.kVV;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeChainListUseCase$fetchCoreMemeChainList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends DefiChainInfo>>, Object> {
    int label;
    final /* synthetic */ kVV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeChainListUseCase$fetchCoreMemeChainList$2(kVV kvv, Continuation<? super MemeChainListUseCase$fetchCoreMemeChainList$2> continuation) {
        super(2, continuation);
        this.this$0 = kvv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeChainListUseCase$fetchCoreMemeChainList$2(this.this$0, continuation);
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
        return ((MemeChainListUseCase$fetchCoreMemeChainList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AFB afbEZpvd = this.this$0.OLrzqt.EZpvd();
            C33077mpe c33077mpe = new C33077mpe(new MemeChainListUseCase$fetchCoreMemeChainList$2$result$1(afbEZpvd), new MemeChainListUseCase$fetchCoreMemeChainList$2$result$2(afbEZpvd), new MemeChainListUseCase$fetchCoreMemeChainList$2$result$3(afbEZpvd), new MemeChainListUseCase$fetchCoreMemeChainList$2$result$4(afbEZpvd), this.this$0.AEQbTJ);
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
                return ((AbstractC43419rot) obj).AEQbTJ();
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        kVV kvv = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objAEQbTJ);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("MemeChainListUseCase", "fetchCoreMemeChainList failed, fallback to native", thM7380exceptionOrNullimpl);
            InterfaceC28276kVk interfaceC28276kVk = kvv.KWHzl;
            this.label = 2;
            obj = interfaceC28276kVk.EZpvd(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            return ((AbstractC43419rot) obj).AEQbTJ();
        }
        List list = (List) objAEQbTJ;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kTY.EZpvd((AGK) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((DefiChainInfo) obj2).getSupportMemeMode()) {
                arrayList2.add(obj2);
            }
        }
        this.this$0.KWHzl.copydefault(arrayList2);
        pUU.KWHzl("MemeChainListUseCase", "fetchCoreMemeChainList (core) success, size=" + arrayList2.size());
        return arrayList2;
    }
}
