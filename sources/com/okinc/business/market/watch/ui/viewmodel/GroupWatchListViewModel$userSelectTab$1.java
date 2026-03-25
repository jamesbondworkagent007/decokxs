package com.okinc.business.market.watch.ui.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C27996kLa;
import o.C27997kLb;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListViewModel$userSelectTab$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ GroupWatchListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListViewModel$userSelectTab$1(GroupWatchListViewModel groupWatchListViewModel, int i, Continuation<? super GroupWatchListViewModel$userSelectTab$1> continuation) {
        super(2, continuation);
        this.this$0 = groupWatchListViewModel;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListViewModel$userSelectTab$1(this.this$0, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListViewModel$userSelectTab$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$userSelectTab$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<C27996kLa, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $position;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ GroupWatchListViewModel this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, GroupWatchListViewModel groupWatchListViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$position = i;
            this.this$0 = groupWatchListViewModel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, this.this$0, continuation);
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
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C27996kLa c27996kLa = (C27996kLa) this.L$0;
                if (c27996kLa.KWHzl() instanceof InterfaceC49371unL.Activity) {
                    int i2 = this.$position;
                    GroupWatchListViewModel groupWatchListViewModel = this.this$0;
                    Result.Application application2 = Result.Companion;
                    InterfaceC49371unL<C27997kLb> interfaceC49371unLKWHzl = c27996kLa.KWHzl();
                    Intrinsics.copydefault(interfaceC49371unLKWHzl, "");
                    String groupName = ((C27997kLb) ((InterfaceC49371unL.Activity) interfaceC49371unLKWHzl).copydefault()).KWHzl().get(i2).getGroupName();
                    GroupWatchListViewModel$userSelectTab$1$1$1$1 groupWatchListViewModel$userSelectTab$1$1$1$1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel$userSelectTab$1$1$1$1
                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                        public Object get(Object obj2) {
                            return ((C27996kLa) obj2).copydefault();
                        }

                        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                        public void set(Object obj2, Object obj3) {
                            ((C27996kLa) obj2).OLrzqt((String) obj3);
                        }
                    };
                    this.label = 1;
                    if (groupWatchListViewModel.KWHzl(groupWatchListViewModel$userSelectTab$1$1$1$1, groupName, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            Result.m7377constructorimpl(Unit.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupWatchListViewModel groupWatchListViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$position, groupWatchListViewModel, null);
            this.label = 1;
            if (groupWatchListViewModel.copydefault(groupWatchListViewModel, anonymousClass1, this) == objCopydefault) {
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
