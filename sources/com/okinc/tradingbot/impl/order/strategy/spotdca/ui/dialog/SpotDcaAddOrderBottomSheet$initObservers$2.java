package com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAddOrderBottomSheet$initObservers$2;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C33070mpX;
import o.C47988uAv;
import o.C52653wTj;
import o.C53223whT;
import o.C55326xho;
import o.C55688xof;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.ViewOnClickListenerC54939xaY;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaAddOrderBottomSheet$initObservers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C53223whT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotDcaAddOrderBottomSheet$initObservers$2(C53223whT c53223whT, Continuation<? super SpotDcaAddOrderBottomSheet$initObservers$2> continuation) {
        super(2, continuation);
        this.this$0 = c53223whT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotDcaAddOrderBottomSheet$initObservers$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SpotDcaAddOrderBottomSheet$initObservers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAddOrderBottomSheet$initObservers$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C53223whT this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C53223whT c53223whT, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c53223whT;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAddOrderBottomSheet$initObservers$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ C53223whT AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(C53223whT c53223whT) {
                this.AEQbTJ = c53223whT;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return EZpvd((SpotDcaAddOrderPresenter.TaskDescription) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object EZpvd(SpotDcaAddOrderPresenter.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                Function2 function2;
                if (taskDescription instanceof SpotDcaAddOrderPresenter.TaskDescription.ActionBar) {
                    Context context = this.AEQbTJ.getContext();
                    if (context != null && (function2 = this.AEQbTJ.AkhnZx) != null) {
                        function2.invoke(C33070mpX.OLrzqt(C55688xof.Application.fvQaOB, context), C56443yFo.AEQbTJ(3));
                    }
                    this.AEQbTJ.dismiss();
                } else if (taskDescription instanceof SpotDcaAddOrderPresenter.TaskDescription.Application) {
                    Context context2 = this.AEQbTJ.getContext();
                    if (context2 != null) {
                        final C53223whT c53223whT = this.AEQbTJ;
                        SpotDcaAddOrderPresenter.TaskDescription.Application application = (SpotDcaAddOrderPresenter.TaskDescription.Application) taskDescription;
                        C52653wTj.OLrzqt.copydefault(context2, application.EZpvd(), application.OLrzqt(), new Function1() { // from class: o.whX
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return SpotDcaAddOrderBottomSheet$initObservers$2.AnonymousClass1.AnonymousClass2.KWHzl(c53223whT, (ViewOnClickListenerC54939xaY) obj);
                            }
                        });
                    }
                } else if (taskDescription instanceof SpotDcaAddOrderPresenter.TaskDescription.C0657TaskDescription) {
                    Context context3 = this.AEQbTJ.getContext();
                    if (context3 != null) {
                        final C53223whT c53223whT2 = this.AEQbTJ;
                        C52653wTj.OLrzqt.copydefault(context3, new Function1() { // from class: o.whV
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return SpotDcaAddOrderBottomSheet$initObservers$2.AnonymousClass1.AnonymousClass2.copydefault(c53223whT2, (ViewOnClickListenerC54939xaY) obj);
                            }
                        });
                    }
                } else if (taskDescription instanceof SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator) {
                    if (this.AEQbTJ.getContext() != null) {
                        C55326xho.toastWithFailedIcon$default(((SpotDcaAddOrderPresenter.TaskDescription.StateListAnimator) taskDescription).KWHzl(), 0, 1, (Object) null);
                    }
                } else {
                    if (!(taskDescription instanceof SpotDcaAddOrderPresenter.TaskDescription.Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C47988uAv.setInputContent$default(C53223whT.copydefault(this.AEQbTJ).KWHzl, ((SpotDcaAddOrderPresenter.TaskDescription.Activity) taskDescription).EZpvd(), false, false, 6, null);
                }
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit KWHzl(C53223whT c53223whT, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
                Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
                ((SpotDcaAddOrderPresenter) c53223whT.OLrzqt()).copydefault(SpotDcaAddOrderPresenter.Activity.Fragment.OLrzqt);
                viewOnClickListenerC54939xaY.dismiss();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
            /* JADX WARN: Multi-variable type inference failed */
            public static final Unit copydefault(C53223whT c53223whT, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
                Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
                ((SpotDcaAddOrderPresenter) c53223whT.OLrzqt()).copydefault(SpotDcaAddOrderPresenter.Activity.Application.AEQbTJ);
                viewOnClickListenerC54939xaY.dismiss();
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<SpotDcaAddOrderPresenter.TaskDescription> sharedFlowValueOf = ((SpotDcaAddOrderPresenter) this.this$0.OLrzqt()).valueOf();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (sharedFlowValueOf.collect(anonymousClass2, this) == objCopydefault) {
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
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
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
