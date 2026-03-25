package com.okinc.im.usecase.pluginlist;

import com.okinc.im.config.page.IMPageType;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AbstractC35291nsZ;
import o.C35287nsV;
import o.C35854oGd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.yHT;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservePluginListUseCase$execute$1 extends SuspendLambda implements yHT<C35287nsV, List<? extends AbstractC35291nsZ>, List<? extends AbstractC35291nsZ>, Continuation<? super Pair<? extends C35287nsV, ? extends List<? extends AbstractC35291nsZ>>>, Object> {
    final /* synthetic */ IMPageType $pageType;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ C35854oGd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservePluginListUseCase$execute$1(C35854oGd c35854oGd, IMPageType iMPageType, Continuation<? super ObservePluginListUseCase$execute$1> continuation) {
        super(4, continuation);
        this.this$0 = c35854oGd;
        this.$pageType = iMPageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* bridge */ /* synthetic */ Object invoke(C35287nsV c35287nsV, List<? extends AbstractC35291nsZ> list, List<? extends AbstractC35291nsZ> list2, Continuation<? super Pair<? extends C35287nsV, ? extends List<? extends AbstractC35291nsZ>>> continuation) {
        return invoke2(c35287nsV, list, list2, (Continuation<? super Pair<C35287nsV, ? extends List<? extends AbstractC35291nsZ>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C35287nsV c35287nsV, List<? extends AbstractC35291nsZ> list, List<? extends AbstractC35291nsZ> list2, Continuation<? super Pair<C35287nsV, ? extends List<? extends AbstractC35291nsZ>>> continuation) {
        ObservePluginListUseCase$execute$1 observePluginListUseCase$execute$1 = new ObservePluginListUseCase$execute$1(this.this$0, this.$pageType, continuation);
        observePluginListUseCase$execute$1.L$0 = c35287nsV;
        observePluginListUseCase$execute$1.L$1 = list;
        observePluginListUseCase$execute$1.L$2 = list2;
        return observePluginListUseCase$execute$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C35287nsV c35287nsV = (C35287nsV) this.L$0;
            List list = (List) this.L$1;
            return C56390yDp.OLrzqt(c35287nsV, CollectionsKt___CollectionsKt.djBIcL((Collection) this.this$0.KWHzl((List<? extends AbstractC35291nsZ>) list, c35287nsV, this.$pageType), (Iterable) this.L$2));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
