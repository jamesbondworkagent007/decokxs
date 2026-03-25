package com.okinc.im.imui.share.viewmodel;

import com.okinc.im.imui.share.model.SelectionStatus;
import com.okinc.okimcore.model.share.ShareTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C37580owX;
import o.C37656oxu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC37636oxa;
import o.InterfaceC44379sNq;
import o.InterfaceC44380sNr;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ShareMessageViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C37656oxu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessageViewModel$fetchData$1(C37656oxu c37656oxu, Continuation<? super ShareMessageViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = c37656oxu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareMessageViewModel$fetchData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareMessageViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44379sNq interfaceC44379sNq = this.this$0.EZpvd;
            this.label = 1;
            obj = interfaceC44379sNq.OLrzqt(this);
            if (obj == objCopydefault) {
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
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C37580owX((ShareTarget) it.next(), null, SelectionStatus.UNSELECTED));
        }
        mutableStateFlow.setValue(arrayList);
        Flow flowFlowOn = FlowKt.flowOn(FlowKt.combine(this.this$0.AEQbTJ, this.this$0.gEmmrt, this.this$0.OLrzqt, new AnonymousClass2(this.this$0, null)), Dispatchers.getIO());
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
        this.label = 2;
        if (FlowKt.collectLatest(flowFlowOn, anonymousClass3, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.share.viewmodel.ShareMessageViewModel$fetchData$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements yHT<List<? extends C37580owX>, String, Set<? extends ShareTarget>, Continuation<? super List<? extends C37580owX>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;
        final /* synthetic */ C37656oxu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C37656oxu c37656oxu, Continuation<? super AnonymousClass2> continuation) {
            super(4, continuation);
            this.this$0 = c37656oxu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHT
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C37580owX> list, String str, Set<? extends ShareTarget> set, Continuation<? super List<? extends C37580owX>> continuation) {
            return invoke2((List<C37580owX>) list, str, (Set<ShareTarget>) set, (Continuation<? super List<C37580owX>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C37580owX> list, String str, Set<ShareTarget> set, Continuation<? super List<C37580owX>> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = list;
            anonymousClass2.L$1 = str;
            anonymousClass2.L$2 = set;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str;
            Set set;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                List<C37580owX> list = (List) this.L$0;
                str = (String) this.L$1;
                Set set2 = (Set) this.L$2;
                if (str != null && str.length() != 0) {
                    InterfaceC44380sNr interfaceC44380sNr = this.this$0.valueOf;
                    this.L$0 = str;
                    this.L$1 = set2;
                    this.label = 1;
                    obj = interfaceC44380sNr.OLrzqt(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    set = set2;
                } else {
                    C37656oxu c37656oxu = this.this$0;
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (C37580owX c37580owX : list) {
                        arrayList.add(new C37580owX(c37580owX.OLrzqt(), str, c37656oxu.KWHzl(set2, c37580owX.OLrzqt())));
                    }
                    return arrayList;
                }
            }
            Iterable<ShareTarget> iterable = (Iterable) obj;
            C37656oxu c37656oxu2 = this.this$0;
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            for (ShareTarget shareTarget : iterable) {
                arrayList2.add(new C37580owX(shareTarget, str, c37656oxu2.KWHzl(set, shareTarget)));
            }
            return arrayList2;
        }
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.share.viewmodel.ShareMessageViewModel$fetchData$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends C37580owX>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C37656oxu this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C37656oxu c37656oxu, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c37656oxu;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends C37580owX> list, Continuation<? super Unit> continuation) {
            return invoke2((List<C37580owX>) list, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<C37580owX> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List list = (List) this.L$0;
                this.this$0.copydefault.tryEmit(list.isEmpty() ? InterfaceC37636oxa.StateListAnimator.AEQbTJ : new InterfaceC37636oxa.TaskDescription(list));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
