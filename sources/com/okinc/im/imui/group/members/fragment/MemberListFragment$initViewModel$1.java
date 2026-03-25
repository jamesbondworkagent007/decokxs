package com.okinc.im.imui.group.members.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.imui.group.members.fragment.MemberListFragment$initViewModel$1;
import com.okinc.im.imui.group.members.viewmodel.GroupMemberListViewModel;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C33903nKc;
import o.C55113xdn;
import o.C55173xeu;
import o.C56391yDq;
import o.C56442yFn;
import o.nXX;
import o.rVN;

/* JADX INFO: loaded from: classes23.dex */
public final class MemberListFragment$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ nXX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberListFragment$initViewModel$1(nXX nxx, Continuation<? super MemberListFragment$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = nxx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemberListFragment$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemberListFragment$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.members.fragment.MemberListFragment$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ nXX this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nXX nxx, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nxx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.members.fragment.MemberListFragment$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ nXX this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04391(nXX nxx, Continuation<? super C04391> continuation) {
                super(2, continuation);
                this.this$0 = nxx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04391(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<GroupMemberListViewModel.ActionBar> stateFlowKWHzl = this.this$0.valueOf().KWHzl(this.this$0.djBIcL());
                    C04401 c04401 = new C04401(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlowKWHzl, c04401, this) == objCopydefault) {
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

            /* JADX INFO: renamed from: com.okinc.im.imui.group.members.fragment.MemberListFragment$initViewModel$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C04401 extends SuspendLambda implements Function2<GroupMemberListViewModel.ActionBar, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ nXX this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04401(nXX nxx, Continuation<? super C04401> continuation) {
                    super(2, continuation);
                    this.this$0 = nxx;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04401 c04401 = new C04401(this.this$0, continuation);
                    c04401.L$0 = obj;
                    return c04401;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(GroupMemberListViewModel.ActionBar actionBar, Continuation<? super Unit> continuation) {
                    return ((C04401) create(actionBar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        GroupMemberListViewModel.ActionBar actionBar = (GroupMemberListViewModel.ActionBar) this.L$0;
                        final C33903nKc c33903nKc = this.this$0.AhwBna;
                        if (c33903nKc != null) {
                            nXX nxx = this.this$0;
                            if (actionBar instanceof GroupMemberListViewModel.ActionBar.Activity) {
                                C55113xdn c55113xdn = c33903nKc.copydefault;
                                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                                c55113xdn.setVisibility(0);
                                C55173xeu c55173xeu = c33903nKc.KWHzl;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                                c55173xeu.setVisibility(8);
                                RecyclerView recyclerView = c33903nKc.EZpvd;
                                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                                recyclerView.setVisibility(8);
                            } else if (actionBar instanceof GroupMemberListViewModel.ActionBar.StateListAnimator) {
                                C55173xeu c55173xeu2 = c33903nKc.KWHzl;
                                Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
                                c55173xeu2.setVisibility(0);
                                C55113xdn c55113xdn2 = c33903nKc.copydefault;
                                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                                c55113xdn2.setVisibility(8);
                                RecyclerView recyclerView2 = c33903nKc.EZpvd;
                                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                                recyclerView2.setVisibility(8);
                                rVN.reportFullyDrawn$default((Fragment) nxx, true, (String) null, 2, (Object) null);
                            } else if (actionBar instanceof GroupMemberListViewModel.ActionBar.Application) {
                                nxx.OLrzqt().OLrzqt((List) ((GroupMemberListViewModel.ActionBar.Application) actionBar).copydefault(), new Function0() { // from class: o.nYf
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return MemberListFragment$initViewModel$1.AnonymousClass1.C04391.C04401.invokeSuspend$lambda$1$lambda$0(c33903nKc);
                                    }
                                });
                                rVN.reportFullyDrawn$default((Fragment) nxx, true, (String) null, 2, (Object) null);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invokeSuspend$lambda$1$lambda$0(C33903nKc c33903nKc) {
                    RecyclerView recyclerView = c33903nKc.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                    recyclerView.setVisibility(0);
                    C55173xeu c55173xeu = c33903nKc.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(8);
                    C55113xdn c55113xdn = c33903nKc.copydefault;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(8);
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C04391(this.this$0, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            nXX nxx = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(nxx, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(nxx, state, anonymousClass1, this) == objCopydefault) {
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
