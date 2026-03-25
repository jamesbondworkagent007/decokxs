package com.okinc.business.market.watch.ui;

import com.okinc.business.market.watch.ui.GroupWatchListFragment$onVisible$1;
import com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27989kKu;
import o.C27993kKy;
import o.C27996kLa;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.kKI;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$onVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$onVisible$1(kKI kki, Continuation<? super GroupWatchListFragment$onVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = kki;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListFragment$onVisible$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$onVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.watch.ui.GroupWatchListFragment$onVisible$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C27996kLa, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C27996kLa c27996kLa, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(c27996kLa, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                final C27996kLa c27996kLa = (C27996kLa) this.L$0;
                C32866mlf.onEvent$default("Discover_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.kKS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return GroupWatchListFragment$onVisible$1.AnonymousClass1.invokeSuspend$lambda$0(c27996kLa, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(C27996kLa c27996kLa, EventParamsList eventParamsList) {
            String strCopydefault = c27996kLa.copydefault();
            EventParamsList.put$default(eventParamsList, "tab", "favorites", false, 4, null);
            EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), C27993kKy.copydefault(strCopydefault), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKI kki = this.this$0;
            GroupWatchListViewModel groupWatchListViewModelAkhnZx = kki.AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (kki.OLrzqt(groupWatchListViewModelAkhnZx, anonymousClass1, this) == objCopydefault) {
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
