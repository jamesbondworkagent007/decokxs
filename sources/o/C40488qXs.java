package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.WatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.watch.usecase.WatchListSubscribeUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC54577xNn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40488qXs extends AbstractC49400uno<java.lang.String, Flow<? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>>> {
    private static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final qWQ AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C40488qXs(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = qwq;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.qXs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qXs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0026 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:17:0x0047, B:41:0x00c3, B:43:0x00c9, B:45:0x00d9, B:47:0x00df, B:50:0x00ee, B:40:0x00a6), top: B:68:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v6, types: [o.qWO, o.qWQ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.qXs] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super Flow<? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>>> continuation) throws java.lang.Throwable {
        WatchListSubscribeUseCase$onExecute$1 watchListSubscribeUseCase$onExecute$1;
        ?? r2;
        java.lang.Object objM7377constructorimpl;
        ?? r22;
        ?? r1;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C40488qXs c40488qXs;
        java.lang.Object objM8790ensureInitialize0E7RQCE$default;
        java.lang.Object objM7377constructorimpl2;
        java.util.Iterator it;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        if (continuation instanceof WatchListSubscribeUseCase$onExecute$1) {
            watchListSubscribeUseCase$onExecute$1 = (WatchListSubscribeUseCase$onExecute$1) continuation;
            int i = watchListSubscribeUseCase$onExecute$1.label;
            r2 = -2147483648;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListSubscribeUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListSubscribeUseCase$onExecute$1 = new WatchListSubscribeUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = watchListSubscribeUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r12 = watchListSubscribeUseCase$onExecute$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r1 = r12;
            r22 = r2;
        }
        if (r12 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            try {
                Result.Application application2 = Result.Companion;
                InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                watchListSubscribeUseCase$onExecute$1.L$0 = this;
                watchListSubscribeUseCase$onExecute$1.L$1 = str;
                watchListSubscribeUseCase$onExecute$1.label = 1;
                objM8790ensureInitialize0E7RQCE$default = InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(interfaceC54577xNnKWHzl, false, null, watchListSubscribeUseCase$onExecute$1, 3, null);
                if (objM8790ensureInitialize0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                c40488qXs = this;
            } catch (java.lang.Throwable th2) {
                th = th2;
                c40488qXs = this;
                Result.Application application3 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objKWHzl);
                    return FlowKt.merge(new StateListAnimator((Flow) objKWHzl), FlowKt.flowOf(C56424yEw.KWHzl()));
                }
                it = (java.util.Iterator) watchListSubscribeUseCase$onExecute$1.L$2;
                java.lang.String str2 = (java.lang.String) watchListSubscribeUseCase$onExecute$1.L$1;
                C40488qXs c40488qXs2 = (C40488qXs) watchListSubscribeUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                r12 = str2;
                r2 = c40488qXs2;
                while (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                    if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) != null) {
                        watchListSubscribeUseCase$onExecute$1.L$0 = r2;
                        watchListSubscribeUseCase$onExecute$1.L$1 = r12;
                        watchListSubscribeUseCase$onExecute$1.L$2 = it;
                        watchListSubscribeUseCase$onExecute$1.label = 2;
                        if (C55608xnE.copydefault(abstractC54531xLwOLrzqt, watchListSubscribeUseCase$onExecute$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                r1 = r12;
                r22 = r2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("WatchListSubscribeUseCase", "onExecute: getITradeManager().ensureInit() failed", thM7380exceptionOrNullimpl);
                }
                ?? r14 = r22.AEQbTJ;
                java.lang.String strKWHzl = C55686xod.KWHzl();
                ?? r13 = r1;
                if (r1 == 0) {
                    r13 = "ALL";
                }
                watchListSubscribeUseCase$onExecute$1.L$0 = null;
                watchListSubscribeUseCase$onExecute$1.L$1 = null;
                watchListSubscribeUseCase$onExecute$1.L$2 = null;
                watchListSubscribeUseCase$onExecute$1.label = 3;
                objKWHzl = r14.KWHzl(strKWHzl, r13, watchListSubscribeUseCase$onExecute$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                return FlowKt.merge(new StateListAnimator((Flow) objKWHzl), FlowKt.flowOf(C56424yEw.KWHzl()));
            }
            str = (java.lang.String) watchListSubscribeUseCase$onExecute$1.L$1;
            c40488qXs = (C40488qXs) watchListSubscribeUseCase$onExecute$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
                objM8790ensureInitialize0E7RQCE$default = ((Result) objKWHzl).m7386unboximpl();
            } catch (java.lang.Throwable th3) {
                th = th3;
                Result.Application application32 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl2 = Result.m7377constructorimpl(Result.m7376boximpl(objM8790ensureInitialize0E7RQCE$default));
        r2 = c40488qXs;
        r12 = str;
        java.lang.Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.AEQbTJ("WatchListSubscribeUseCase", "onExecute: getITradeManager().ensureInitialize() failed", thM7380exceptionOrNullimpl2);
            return FlowKt.emptyFlow();
        }
        Result.Application application4 = Result.Companion;
        it = yDY.gEmmrt("SPOT", "FUTURES", "SWAP", "OPTION").iterator();
        while (it.hasNext()) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        r1 = r12;
        r22 = r2;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        ?? r142 = r22.AEQbTJ;
        java.lang.String strKWHzl2 = C55686xod.KWHzl();
        ?? r132 = r1;
        if (r1 == 0) {
        }
        watchListSubscribeUseCase$onExecute$1.L$0 = null;
        watchListSubscribeUseCase$onExecute$1.L$1 = null;
        watchListSubscribeUseCase$onExecute$1.L$2 = null;
        watchListSubscribeUseCase$onExecute$1.label = 3;
        objKWHzl = r142.KWHzl(strKWHzl2, r132, watchListSubscribeUseCase$onExecute$1);
        if (objKWHzl == objCopydefault) {
        }
        return FlowKt.merge(new StateListAnimator((Flow) objKWHzl), FlowKt.flowOf(C56424yEw.KWHzl()));
    }

    /* JADX INFO: renamed from: o.qXs$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qXs$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof WatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) {
                    watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 = (WatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 = new WatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator<T> it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        BizInstrument bizInstrumentKWHzl = qWJ.KWHzl(qWJ.EZpvd((MarketUserFavorite) it.next()));
                        if (bizInstrumentKWHzl != null) {
                            arrayList.add(bizInstrumentKWHzl);
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (T t : arrayList) {
                        java.lang.String instType = ((BizInstrument) t).getInstType();
                        java.lang.Object arrayList2 = linkedHashMap.get(instType);
                        if (arrayList2 == null) {
                            arrayList2 = new java.util.ArrayList();
                            linkedHashMap.put(instType, arrayList2);
                        }
                        ((java.util.List) arrayList2).add(t);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        java.lang.Object key = entry.getKey();
                        java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(iterable, 10)), 16));
                        for (T t2 : iterable) {
                            linkedHashMap3.put(((BizInstrument) t2).getInstId(), t2);
                        }
                        linkedHashMap2.put(key, linkedHashMap3);
                    }
                    watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(linkedHashMap2, watchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
