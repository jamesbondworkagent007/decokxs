package com.okinc.im.imui.messageV2.view.keyboard.plugin;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.config.page.IMPageType;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC35291nsZ;
import o.C35287nsV;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class PluginsViewModel$init$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ IMPageType $pageType;
    int label;
    final /* synthetic */ PluginsViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginsViewModel$init$1(PluginsViewModel pluginsViewModel, String str, IMPageType iMPageType, Continuation<? super PluginsViewModel$init$1> continuation) {
        super(2, continuation);
        this.this$0 = pluginsViewModel;
        this.$channelId = str;
        this.$pageType = iMPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PluginsViewModel$init$1(this.this$0, this.$channelId, this.$pageType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PluginsViewModel$init$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowM7441catch = FlowKt.m7441catch(this.this$0.gEmmrt.OLrzqt(this.$channelId, this.$pageType), new AnonymousClass1(this.this$0, null));
            final PluginsViewModel pluginsViewModel = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsViewModel$init$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<C35287nsV, ? extends List<? extends AbstractC35291nsZ>> pair, Continuation<? super Unit> continuation) {
                    if (pair == null) {
                        Object objKWHzl = C36588odm.KWHzl(pluginsViewModel.OLrzqt, yDY.AhwBna(), continuation);
                        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
                    }
                    C35287nsV c35287nsVComponent1 = pair.component1();
                    List<? extends AbstractC35291nsZ> listComponent2 = pair.component2();
                    PluginsViewModel pluginsViewModel2 = pluginsViewModel;
                    Iterator<T> it = listComponent2.iterator();
                    while (it.hasNext()) {
                        ((AbstractC35291nsZ) it.next()).KWHzl(c35287nsVComponent1, pluginsViewModel2.KWHzl());
                    }
                    Object objKWHzl2 = C36588odm.KWHzl(pluginsViewModel.OLrzqt, listComponent2, continuation);
                    return objKWHzl2 == C56442yFn.copydefault() ? objKWHzl2 : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowM7441catch.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.im.imui.messageV2.view.keyboard.plugin.PluginsViewModel$init$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<FlowCollector<? super Pair<? extends C35287nsV, ? extends List<? extends AbstractC35291nsZ>>>, Throwable, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ PluginsViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PluginsViewModel pluginsViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
            this.this$0 = pluginsViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Pair<? extends C35287nsV, ? extends List<? extends AbstractC35291nsZ>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Pair<C35287nsV, ? extends List<? extends AbstractC35291nsZ>>>) flowCollector, th, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(FlowCollector<? super Pair<C35287nsV, ? extends List<? extends AbstractC35291nsZ>>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            return new AnonymousClass1(this.this$0, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableLiveData mutableLiveData = this.this$0.OLrzqt;
                List listAhwBna = yDY.AhwBna();
                this.label = 1;
                if (C36588odm.KWHzl(mutableLiveData, listAhwBna, this) == objCopydefault) {
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
}
