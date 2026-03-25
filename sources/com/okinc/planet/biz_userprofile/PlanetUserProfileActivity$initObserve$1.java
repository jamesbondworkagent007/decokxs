package com.okinc.planet.biz_userprofile;

import com.okinc.planet.utils.ImageLoadInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC46197tLk;
import o.C33129mqd;
import o.C46189tLc;
import o.C46196tLj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tJI;

/* JADX INFO: loaded from: classes19.dex */
public final class PlanetUserProfileActivity$initObserve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$initObserve$1(tJI tji, Continuation<? super PlanetUserProfileActivity$initObserve$1> continuation) {
        super(2, continuation);
        this.this$0 = tji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileActivity$initObserve$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$initObserve$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Application implements Flow<AbstractC46197tLk<? extends Pair<? extends Boolean, ? extends ImageLoadInfo>>> {
        public final /* synthetic */ tJI AEQbTJ;
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$1$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ tJI OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, tJI tji) {
                this.KWHzl = flowCollector;
                this.OLrzqt = tji;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                PlanetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1 planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1;
                String strAEQbTJ;
                AbstractC46197tLk<T> abstractC46197tLkKWHzl;
                if (continuation instanceof PlanetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1) {
                    planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1 = (PlanetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1) continuation;
                    int i = planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1 = new PlanetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1(this, continuation);
                    }
                }
                Object obj2 = planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) obj;
                    if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd());
                    } else if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.StateListAnimator) abstractC46197tLk).KWHzl());
                    } else {
                        if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C46189tLc c46189tLc = (C46189tLc) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault();
                        boolean zValues = this.OLrzqt.getFieldNames().values();
                        if (C33129mqd.OLrzqt((CharSequence) c46189tLc.OLrzqt().EZpvd())) {
                            strAEQbTJ = c46189tLc.OLrzqt().EZpvd();
                        } else {
                            strAEQbTJ = c46189tLc.OLrzqt().AEQbTJ();
                        }
                        String strCopydefault = C46196tLj.EZpvd.copydefault(c46189tLc);
                        if (strAEQbTJ == null) {
                            strAEQbTJ = "";
                        }
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(C56390yDp.OLrzqt(C56443yFo.KWHzl(zValues), new ImageLoadInfo(c46189tLc.OLrzqt().KWHzl(), strCopydefault, strAEQbTJ, 0, 0, 0.0f, 56, null)));
                    }
                    planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1.label = 1;
                    if (flowCollector.emit(abstractC46197tLkKWHzl, planetUserProfileActivity$initObserve$1$invokeSuspend$$inlined$mapViewState$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow, tJI tji) {
            this.EZpvd = flow;
            this.AEQbTJ = tji;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super AbstractC46197tLk<? extends Pair<? extends Boolean, ? extends ImageLoadInfo>>> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Application(this.this$0.getFieldNames().OLrzqt(), this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initObserve$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends Pair<? extends Boolean, ? extends ImageLoadInfo>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ tJI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(tJI tji, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = tji;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends Pair<? extends Boolean, ? extends ImageLoadInfo>> abstractC46197tLk, Continuation<? super Unit> continuation) {
            return invoke2((AbstractC46197tLk<Pair<Boolean, ImageLoadInfo>>) abstractC46197tLk, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AbstractC46197tLk<Pair<Boolean, ImageLoadInfo>> abstractC46197tLk, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
                if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                    Pair pair = (Pair) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault();
                    boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
                    ImageLoadInfo imageLoadInfo = (ImageLoadInfo) pair.component2();
                    if (zBooleanValue) {
                        tJI tji = this.this$0;
                        tji.EZpvd(tji.getFieldNames().AkhnZx(), this.this$0.getFieldNames().EZpvd());
                    } else {
                        tJI tji2 = this.this$0;
                        tji2.copydefault(tji2.getFieldNames().AkhnZx(), this.this$0.getFieldNames().EZpvd());
                        this.this$0.gEmmrt().QVAiDq.KWHzl(imageLoadInfo.copydefault());
                        this.this$0.gEmmrt().OcIXYQ.KWHzl(imageLoadInfo.copydefault());
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
