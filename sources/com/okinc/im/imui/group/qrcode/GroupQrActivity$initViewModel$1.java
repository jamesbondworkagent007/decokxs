package com.okinc.im.imui.group.qrcode;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.im.imui.group.qrcode.GroupQrActivity$initViewModel$1;
import com.okinc.im.imui.group.qrcode.viewmodel.GroupQrViewModel;
import com.okinc.im.imui.qrcode.BaseQrDisplayActivity;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C35399nuc;
import o.C55173xeu;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.nZV;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupQrActivity$initViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ nZV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupQrActivity$initViewModel$1(nZV nzv, Continuation<? super GroupQrActivity$initViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = nzv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupQrActivity$initViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupQrActivity$initViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.GroupQrActivity$initViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ nZV this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nZV nzv, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nzv;
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

        /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.GroupQrActivity$initViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ nZV this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04501(nZV nzv, Continuation<? super C04501> continuation) {
                super(2, continuation);
                this.this$0 = nzv;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04501(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<GroupQrViewModel.TaskDescription> stateFlowAEQbTJ = this.this$0.OLrzqt().AEQbTJ();
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                    this.label = 1;
                    if (stateFlowAEQbTJ.collect(anonymousClass2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }

            /* JADX INFO: renamed from: com.okinc.im.imui.group.qrcode.GroupQrActivity$initViewModel$1$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ nZV AEQbTJ;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(nZV nzv) {
                    this.AEQbTJ = nzv;
                }

                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(GroupQrViewModel.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                    if (taskDescription instanceof GroupQrViewModel.TaskDescription.Activity) {
                        this.AEQbTJ.OLrzqt(false);
                        this.AEQbTJ.OLrzqt(BaseQrDisplayActivity.PageState.LOADING);
                    } else if (taskDescription instanceof GroupQrViewModel.TaskDescription.C0451TaskDescription) {
                        this.AEQbTJ.OLrzqt(BaseQrDisplayActivity.PageState.CONTENT);
                        GroupQrViewModel.TaskDescription.C0451TaskDescription c0451TaskDescription = (GroupQrViewModel.TaskDescription.C0451TaskDescription) taskDescription;
                        this.AEQbTJ.EZpvd(c0451TaskDescription.AEQbTJ(), c0451TaskDescription.OLrzqt(), c0451TaskDescription.KWHzl(), c0451TaskDescription.EZpvd());
                        this.AEQbTJ.OLrzqt(true);
                    } else if (taskDescription instanceof GroupQrViewModel.TaskDescription.ActionBar) {
                        this.AEQbTJ.OLrzqt(BaseQrDisplayActivity.PageState.CONTENT);
                        GroupQrViewModel.TaskDescription.ActionBar actionBar = (GroupQrViewModel.TaskDescription.ActionBar) taskDescription;
                        this.AEQbTJ.EZpvd(actionBar.copydefault());
                        if (actionBar.OLrzqt()) {
                            C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.ikIEnW, 0, 1, (Object) null);
                        }
                        this.AEQbTJ.OLrzqt(true);
                        rVN.reportFullyDrawn$default((Activity) this.AEQbTJ, true, (String) null, 2, (Object) null);
                    } else if (taskDescription instanceof GroupQrViewModel.TaskDescription.StateListAnimator) {
                        this.AEQbTJ.OLrzqt(BaseQrDisplayActivity.PageState.ERROR);
                        this.AEQbTJ.OLrzqt(true);
                        C55173xeu c55173xeuHDKMBd = this.AEQbTJ.hDKMBd();
                        final nZV nzv = this.AEQbTJ;
                        c55173xeuHDKMBd.setRetryClickListener(new View.OnClickListener() { // from class: o.oab
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                GroupQrActivity$initViewModel$1.AnonymousClass1.C04501.AnonymousClass2.EZpvd(nzv, view);
                            }
                        });
                        rVN.reportFullyDrawn$default((Activity) this.AEQbTJ, false, (String) null, 2, (Object) null);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }

                public static final void EZpvd(nZV nzv, View view) {
                    nzv.OLrzqt().copydefault(nzv.wlaJM());
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new C04501(this.this$0, null), 3, null);
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
            nZV nzv = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(nzv, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(nzv, state, anonymousClass1, this) == objCopydefault) {
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
