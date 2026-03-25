package o;

import io.reactivex.processors.PublishProcessor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58027ytY;
import o.AbstractC58087yuf;
import o.C58024ytV;
import o.C58071yuP;
import o.C58093yul;
import o.InterfaceC58028ytZ;
import o.InterfaceC58092yuk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58093yul {
    public final StateListAnimator KWHzl;

    public C58093yul(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
    }

    public final void AEQbTJ() {
        this.KWHzl.AhwBna();
    }

    public final AbstractC58185ywX<AbstractC58027ytY> KWHzl() {
        return this.KWHzl.copydefault();
    }

    public final boolean OLrzqt(@NotNull AbstractC58082yua abstractC58082yua) {
        Intrinsics.checkNotNullParameter(abstractC58082yua, "");
        AbstractC58087yuf abstractC58087yufOLrzqt = this.KWHzl.OLrzqt();
        if (abstractC58087yufOLrzqt instanceof AbstractC58087yuf.Application) {
            return ((AbstractC58087yuf.Application) abstractC58087yufOLrzqt).KWHzl().copydefault().AEQbTJ(abstractC58082yua);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.yul$StateListAnimator */
    public static final class StateListAnimator {
        public final C58097yup AEQbTJ;
        public final InterfaceC58092yuk.Application AhwBna;
        public final AbstractC58253yxm EZpvd;
        public final PublishProcessor<AbstractC58027ytY> KWHzl;
        public final InterfaceC58080yuY OLrzqt;
        public final InterfaceC58028ytZ copydefault;
        public final C58024ytV<AbstractC58087yuf, AbstractC58027ytY, java.lang.Object> gEmmrt;

        public StateListAnimator(@NotNull InterfaceC58028ytZ interfaceC58028ytZ, @NotNull InterfaceC58092yuk.Application application, @NotNull InterfaceC58080yuY interfaceC58080yuY, @NotNull AbstractC58253yxm abstractC58253yxm) {
            Intrinsics.checkNotNullParameter(interfaceC58028ytZ, "");
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(interfaceC58080yuY, "");
            Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
            this.copydefault = interfaceC58028ytZ;
            this.AhwBna = application;
            this.OLrzqt = interfaceC58080yuY;
            this.EZpvd = abstractC58253yxm;
            this.AEQbTJ = new C58097yup(this);
            PublishProcessor<AbstractC58027ytY> publishProcessorIsConnected = PublishProcessor.isConnected();
            Intrinsics.checkNotNullExpressionValue(publishProcessorIsConnected, "");
            this.KWHzl = publishProcessorIsConnected;
            this.gEmmrt = C58024ytV.Companion.EZpvd(new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, java.lang.Object>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object> taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object> taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    final C58093yul.StateListAnimator stateListAnimator = this.this$0;
                    Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Activity>, Unit> function1 = new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Activity>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Activity> stateListAnimator2) {
                            invoke2(stateListAnimator2);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull final C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Activity> stateListAnimator2) {
                            Intrinsics.checkNotNullParameter(stateListAnimator2, "");
                            final C58093yul.StateListAnimator stateListAnimator3 = stateListAnimator;
                            stateListAnimator2.AEQbTJ(new Function2<AbstractC58087yuf.Activity, AbstractC58027ytY, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.1.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC58087yuf.Activity activity, AbstractC58027ytY abstractC58027ytY) {
                                    invoke2(activity, abstractC58027ytY);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull AbstractC58087yuf.Activity activity, @NotNull AbstractC58027ytY abstractC58027ytY) {
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
                                    stateListAnimator3.valueOf();
                                }
                            });
                            C58024ytV.ActionBar<AbstractC58027ytY, ? extends E> actionBarKWHzl = stateListAnimator.KWHzl();
                            final C58093yul.StateListAnimator stateListAnimator4 = stateListAnimator;
                            stateListAnimator2.OLrzqt(actionBarKWHzl, new Function2<AbstractC58087yuf.Activity, AbstractC58027ytY.StateListAnimator.Activity<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.1.2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Activity activity, @NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity2) {
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    Intrinsics.checkNotNullParameter(activity2, "");
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator2, activity, new AbstractC58087yuf.TaskDescription(stateListAnimator4.EZpvd(), 0), null, 2, null);
                                }
                            });
                            C58024ytV.ActionBar<AbstractC58027ytY, ? extends E> actionBarAEQbTJ = stateListAnimator.AEQbTJ();
                            final C58093yul.StateListAnimator stateListAnimator5 = stateListAnimator;
                            stateListAnimator2.OLrzqt(actionBarAEQbTJ, new Function2<AbstractC58087yuf.Activity, AbstractC58027ytY.StateListAnimator.Activity<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.1.3
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Activity activity, @NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity2) {
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    Intrinsics.checkNotNullParameter(activity2, "");
                                    stateListAnimator5.valueOf();
                                    return C58024ytV.TaskDescription.StateListAnimator.dontTransition$default(stateListAnimator2, activity, null, 1, null);
                                }
                            });
                            stateListAnimator2.OLrzqt(C58024ytV.ActionBar.Companion.copydefault(AbstractC58027ytY.StateListAnimator.TaskDescription.class), new Function2<AbstractC58087yuf.Activity, AbstractC58027ytY.StateListAnimator.TaskDescription, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.1.4
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Activity activity, @NotNull AbstractC58027ytY.StateListAnimator.TaskDescription taskDescription2) {
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    Intrinsics.checkNotNullParameter(taskDescription2, "");
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator2, activity, AbstractC58087yuf.ActionBar.EZpvd, null, 2, null);
                                }
                            });
                        }
                    };
                    C58024ytV.ActionBar.C1010ActionBar c1010ActionBar = C58024ytV.ActionBar.Companion;
                    taskDescription.AEQbTJ(c1010ActionBar.copydefault(AbstractC58087yuf.Activity.class), function1);
                    final C58093yul.StateListAnimator stateListAnimator2 = this.this$0;
                    taskDescription.AEQbTJ(c1010ActionBar.copydefault(AbstractC58087yuf.LoaderManager.class), new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.LoaderManager>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.LoaderManager> stateListAnimator3) {
                            invoke2(stateListAnimator3);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull final C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.LoaderManager> stateListAnimator3) {
                            Intrinsics.checkNotNullParameter(stateListAnimator3, "");
                            final C58093yul.StateListAnimator stateListAnimator4 = stateListAnimator2;
                            stateListAnimator3.AEQbTJ(new Function2<AbstractC58087yuf.LoaderManager, AbstractC58027ytY, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.2.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC58087yuf.LoaderManager loaderManager, AbstractC58027ytY abstractC58027ytY) {
                                    invoke2(loaderManager, abstractC58027ytY);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull AbstractC58087yuf.LoaderManager loaderManager, @NotNull AbstractC58027ytY abstractC58027ytY) {
                                    Intrinsics.checkNotNullParameter(loaderManager, "");
                                    Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
                                    stateListAnimator4.valueOf();
                                }
                            });
                            final C58093yul.StateListAnimator stateListAnimator5 = stateListAnimator2;
                            Function2<AbstractC58087yuf.LoaderManager, AbstractC58027ytY.TaskDescription, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>> function2 = new Function2<AbstractC58087yuf.LoaderManager, AbstractC58027ytY.TaskDescription, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.2.2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.LoaderManager loaderManager, @NotNull AbstractC58027ytY.TaskDescription taskDescription2) {
                                    Intrinsics.checkNotNullParameter(loaderManager, "");
                                    Intrinsics.checkNotNullParameter(taskDescription2, "");
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator3, loaderManager, new AbstractC58087yuf.TaskDescription(stateListAnimator5.EZpvd(), loaderManager.AEQbTJ() + 1), null, 2, null);
                                }
                            };
                            C58024ytV.ActionBar.C1010ActionBar c1010ActionBar2 = C58024ytV.ActionBar.Companion;
                            stateListAnimator3.OLrzqt(c1010ActionBar2.copydefault(AbstractC58027ytY.TaskDescription.class), function2);
                            C58024ytV.ActionBar<AbstractC58027ytY, ? extends E> actionBarKWHzl = stateListAnimator2.KWHzl();
                            final C58093yul.StateListAnimator stateListAnimator6 = stateListAnimator2;
                            stateListAnimator3.OLrzqt(actionBarKWHzl, new Function2<AbstractC58087yuf.LoaderManager, AbstractC58027ytY.StateListAnimator.Activity<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.2.3
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.LoaderManager loaderManager, @NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                                    Intrinsics.checkNotNullParameter(loaderManager, "");
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    stateListAnimator6.valueOf();
                                    return C58024ytV.TaskDescription.StateListAnimator.dontTransition$default(stateListAnimator3, loaderManager, null, 1, null);
                                }
                            });
                            C58024ytV.ActionBar<AbstractC58027ytY, ? extends E> actionBarAEQbTJ = stateListAnimator2.AEQbTJ();
                            final C58093yul.StateListAnimator stateListAnimator7 = stateListAnimator2;
                            stateListAnimator3.OLrzqt(actionBarAEQbTJ, new Function2<AbstractC58087yuf.LoaderManager, AbstractC58027ytY.StateListAnimator.Activity<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.2.4
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.LoaderManager loaderManager, @NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                                    Intrinsics.checkNotNullParameter(loaderManager, "");
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    stateListAnimator7.copydefault(loaderManager);
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator3, loaderManager, AbstractC58087yuf.Activity.copydefault, null, 2, null);
                                }
                            });
                            final C58093yul.StateListAnimator stateListAnimator8 = stateListAnimator2;
                            stateListAnimator3.OLrzqt(c1010ActionBar2.copydefault(AbstractC58027ytY.StateListAnimator.TaskDescription.class), new Function2<AbstractC58087yuf.LoaderManager, AbstractC58027ytY.StateListAnimator.TaskDescription, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.2.5
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.LoaderManager loaderManager, @NotNull AbstractC58027ytY.StateListAnimator.TaskDescription taskDescription2) {
                                    Intrinsics.checkNotNullParameter(loaderManager, "");
                                    Intrinsics.checkNotNullParameter(taskDescription2, "");
                                    stateListAnimator8.copydefault(loaderManager);
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator3, loaderManager, AbstractC58087yuf.ActionBar.EZpvd, null, 2, null);
                                }
                            });
                        }
                    });
                    final C58093yul.StateListAnimator stateListAnimator3 = this.this$0;
                    taskDescription.AEQbTJ(c1010ActionBar.copydefault(AbstractC58087yuf.TaskDescription.class), new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.TaskDescription>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.3
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.TaskDescription> stateListAnimator4) {
                            invoke2(stateListAnimator4);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull final C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.TaskDescription> stateListAnimator4) {
                            Intrinsics.checkNotNullParameter(stateListAnimator4, "");
                            stateListAnimator4.OLrzqt(stateListAnimator3.AYXKKw(), new Function2<AbstractC58087yuf.TaskDescription, AbstractC58027ytY.Application.TaskDescription<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.3.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.TaskDescription taskDescription2, @NotNull AbstractC58027ytY.Application.TaskDescription<?> taskDescription3) {
                                    Intrinsics.checkNotNullParameter(taskDescription2, "");
                                    Intrinsics.checkNotNullParameter(taskDescription3, "");
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator4, taskDescription2, new AbstractC58087yuf.Application(taskDescription2.AEQbTJ()), null, 2, null);
                                }
                            });
                            final C58093yul.StateListAnimator stateListAnimator5 = stateListAnimator3;
                            stateListAnimator4.OLrzqt(C58024ytV.ActionBar.Companion.copydefault(AbstractC58027ytY.Application.ActionBar.class), new Function2<AbstractC58087yuf.TaskDescription, AbstractC58027ytY.Application.ActionBar, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.3.2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.TaskDescription taskDescription2, @NotNull AbstractC58027ytY.Application.ActionBar actionBar) {
                                    Intrinsics.checkNotNullParameter(taskDescription2, "");
                                    Intrinsics.checkNotNullParameter(actionBar, "");
                                    if (stateListAnimator5.OLrzqt.getShouldBackoff()) {
                                        long jBackoffDurationMillisAt = stateListAnimator5.OLrzqt.backoffDurationMillisAt(taskDescription2.EZpvd());
                                        return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator4, taskDescription2, new AbstractC58087yuf.LoaderManager(stateListAnimator5.OLrzqt(jBackoffDurationMillisAt), taskDescription2.EZpvd(), jBackoffDurationMillisAt), null, 2, null);
                                    }
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator4, taskDescription2, AbstractC58087yuf.Activity.copydefault, null, 2, null);
                                }
                            });
                        }
                    });
                    final C58093yul.StateListAnimator stateListAnimator4 = this.this$0;
                    taskDescription.AEQbTJ(c1010ActionBar.copydefault(AbstractC58087yuf.Application.class), new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Application>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.4
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Application> stateListAnimator5) {
                            invoke2(stateListAnimator5);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull final C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.Application> stateListAnimator5) {
                            Intrinsics.checkNotNullParameter(stateListAnimator5, "");
                            final C58093yul.StateListAnimator stateListAnimator6 = stateListAnimator4;
                            stateListAnimator5.AEQbTJ(new Function2<AbstractC58087yuf.Application, AbstractC58027ytY, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.4.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC58087yuf.Application application2, AbstractC58027ytY abstractC58027ytY) {
                                    invoke2(application2, abstractC58027ytY);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull AbstractC58087yuf.Application application2, @NotNull AbstractC58027ytY abstractC58027ytY) {
                                    Intrinsics.checkNotNullParameter(application2, "");
                                    Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
                                    stateListAnimator6.valueOf();
                                }
                            });
                            C58024ytV.ActionBar<AbstractC58027ytY, ? extends E> actionBarKWHzl = stateListAnimator4.KWHzl();
                            final C58093yul.StateListAnimator stateListAnimator7 = stateListAnimator4;
                            stateListAnimator5.OLrzqt(actionBarKWHzl, new Function2<AbstractC58087yuf.Application, AbstractC58027ytY.StateListAnimator.Activity<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.4.2
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Application application2, @NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                                    Intrinsics.checkNotNullParameter(application2, "");
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    stateListAnimator7.valueOf();
                                    return C58024ytV.TaskDescription.StateListAnimator.dontTransition$default(stateListAnimator5, application2, null, 1, null);
                                }
                            });
                            C58024ytV.ActionBar<AbstractC58027ytY, ? extends E> actionBarAEQbTJ = stateListAnimator4.AEQbTJ();
                            final C58093yul.StateListAnimator stateListAnimator8 = stateListAnimator4;
                            stateListAnimator5.OLrzqt(actionBarAEQbTJ, new Function2<AbstractC58087yuf.Application, AbstractC58027ytY.StateListAnimator.Activity<?>, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.4.3
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Application application2, @NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                                    Intrinsics.checkNotNullParameter(application2, "");
                                    Intrinsics.checkNotNullParameter(activity, "");
                                    stateListAnimator8.KWHzl(application2, activity.OLrzqt());
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator5, application2, AbstractC58087yuf.StateListAnimator.AEQbTJ, null, 2, null);
                                }
                            });
                            Function2<AbstractC58087yuf.Application, AbstractC58027ytY.StateListAnimator.TaskDescription, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>> function2 = new Function2<AbstractC58087yuf.Application, AbstractC58027ytY.StateListAnimator.TaskDescription, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.4.4
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Application application2, @NotNull AbstractC58027ytY.StateListAnimator.TaskDescription taskDescription2) {
                                    Intrinsics.checkNotNullParameter(application2, "");
                                    Intrinsics.checkNotNullParameter(taskDescription2, "");
                                    application2.KWHzl().copydefault().EZpvd();
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator5, application2, AbstractC58087yuf.ActionBar.EZpvd, null, 2, null);
                                }
                            };
                            C58024ytV.ActionBar.C1010ActionBar c1010ActionBar2 = C58024ytV.ActionBar.Companion;
                            stateListAnimator5.OLrzqt(c1010ActionBar2.copydefault(AbstractC58027ytY.StateListAnimator.TaskDescription.class), function2);
                            final C58093yul.StateListAnimator stateListAnimator9 = stateListAnimator4;
                            stateListAnimator5.OLrzqt(c1010ActionBar2.copydefault(AbstractC58027ytY.Application.ActionBar.class), new Function2<AbstractC58087yuf.Application, AbstractC58027ytY.Application.ActionBar, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.4.5
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.Application application2, @NotNull AbstractC58027ytY.Application.ActionBar actionBar) {
                                    Intrinsics.checkNotNullParameter(application2, "");
                                    Intrinsics.checkNotNullParameter(actionBar, "");
                                    if (stateListAnimator9.OLrzqt.getShouldBackoff()) {
                                        long jBackoffDurationMillisAt = stateListAnimator9.OLrzqt.backoffDurationMillisAt(0);
                                        return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator5, application2, new AbstractC58087yuf.LoaderManager(stateListAnimator9.OLrzqt(jBackoffDurationMillisAt), 0, jBackoffDurationMillisAt), null, 2, null);
                                    }
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator5, application2, AbstractC58087yuf.Activity.copydefault, null, 2, null);
                                }
                            });
                        }
                    });
                    taskDescription.AEQbTJ(c1010ActionBar.copydefault(AbstractC58087yuf.StateListAnimator.class), new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.StateListAnimator>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.5
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.StateListAnimator> stateListAnimator5) {
                            invoke2(stateListAnimator5);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull final C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.StateListAnimator> stateListAnimator5) {
                            Intrinsics.checkNotNullParameter(stateListAnimator5, "");
                            stateListAnimator5.OLrzqt(C58024ytV.ActionBar.Companion.copydefault(AbstractC58027ytY.Application.ActionBar.class), new Function2<AbstractC58087yuf.StateListAnimator, AbstractC58027ytY.Application.ActionBar, C58024ytV.StateListAnimator.Activity.TaskDescription<? extends AbstractC58087yuf, ? extends Object>>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.5.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                                @Override // kotlin.jvm.functions.Function2
                                public final C58024ytV.StateListAnimator.Activity.TaskDescription<AbstractC58087yuf, Object> invoke(@NotNull AbstractC58087yuf.StateListAnimator stateListAnimator6, @NotNull AbstractC58027ytY.Application.ActionBar actionBar) {
                                    Intrinsics.checkNotNullParameter(stateListAnimator6, "");
                                    Intrinsics.checkNotNullParameter(actionBar, "");
                                    return C58024ytV.TaskDescription.StateListAnimator.transitionTo$default(stateListAnimator5, stateListAnimator6, AbstractC58087yuf.Activity.copydefault, null, 2, null);
                                }
                            });
                        }
                    });
                    final C58093yul.StateListAnimator stateListAnimator5 = this.this$0;
                    taskDescription.AEQbTJ(c1010ActionBar.copydefault(AbstractC58087yuf.ActionBar.class), new Function1<C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.ActionBar>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.6
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.ActionBar> stateListAnimator6) {
                            invoke2(stateListAnimator6);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull C58024ytV.TaskDescription<AbstractC58087yuf, AbstractC58027ytY, Object>.StateListAnimator<AbstractC58087yuf.ActionBar> stateListAnimator6) {
                            Intrinsics.checkNotNullParameter(stateListAnimator6, "");
                            final C58093yul.StateListAnimator stateListAnimator7 = stateListAnimator5;
                            stateListAnimator6.AEQbTJ(new Function2<AbstractC58087yuf.ActionBar, AbstractC58027ytY, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection.StateManager.stateMachine.1.6.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                {
                                    super(2);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(AbstractC58087yuf.ActionBar actionBar, AbstractC58027ytY abstractC58027ytY) {
                                    invoke2(actionBar, abstractC58027ytY);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull AbstractC58087yuf.ActionBar actionBar, @NotNull AbstractC58027ytY abstractC58027ytY) {
                                    Intrinsics.checkNotNullParameter(actionBar, "");
                                    Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
                                    stateListAnimator7.AEQbTJ.dispose();
                                }
                            });
                        }
                    });
                    taskDescription.AEQbTJ(AbstractC58087yuf.Activity.copydefault);
                    final C58093yul.StateListAnimator stateListAnimator6 = this.this$0;
                    taskDescription.AEQbTJ(new Function1<C58024ytV.Activity<? extends AbstractC58087yuf, ? extends AbstractC58027ytY, ? extends Object>, Unit>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$stateMachine$1.7
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(C58024ytV.Activity<? extends AbstractC58087yuf, ? extends AbstractC58027ytY, ? extends Object> activity) {
                            invoke2((C58024ytV.Activity<? extends AbstractC58087yuf, ? extends AbstractC58027ytY, Object>) activity);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull C58024ytV.Activity<? extends AbstractC58087yuf, ? extends AbstractC58027ytY, Object> activity) {
                            Intrinsics.checkNotNullParameter(activity, "");
                            C58093yul.StateListAnimator stateListAnimator7 = stateListAnimator6;
                            if (!(activity instanceof C58024ytV.Activity.StateListAnimator) || Intrinsics.EZpvd(activity.KWHzl(), ((C58024ytV.Activity.StateListAnimator) activity).AEQbTJ())) {
                                return;
                            }
                            stateListAnimator7.KWHzl.onNext(new AbstractC58027ytY.Activity(stateListAnimator7.OLrzqt()));
                        }
                    });
                }
            });
        }

        public final AbstractC58087yuf OLrzqt() {
            return this.gEmmrt.OLrzqt();
        }

        public final AbstractC58185ywX<AbstractC58027ytY> copydefault() {
            AbstractC58185ywX<AbstractC58027ytY> abstractC58185ywXAYXKKw = this.KWHzl.AYXKKw();
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAYXKKw, "");
            return abstractC58185ywXAYXKKw;
        }

        public final void AhwBna() {
            this.copydefault.subscribe(this.AEQbTJ);
        }

        public final void AEQbTJ(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            this.KWHzl.onNext(abstractC58027ytY);
            this.gEmmrt.EZpvd(abstractC58027ytY);
        }

        public final C58084yuc EZpvd() {
            InterfaceC58092yuk interfaceC58092yukAEQbTJ = this.AhwBna.AEQbTJ();
            C58095yun c58095yun = new C58095yun(this);
            AbstractC58185ywX.copydefault(interfaceC58092yukAEQbTJ.AEQbTJ()).KWHzl(this.EZpvd).copydefault(InterfaceC58092yuk.Activity.class).copydefault(c58095yun);
            return new C58084yuc(interfaceC58092yukAEQbTJ, c58095yun);
        }

        public final InterfaceC58217yxC OLrzqt(long j) {
            C58098yuq c58098yuq = new C58098yuq(this);
            AbstractC58185ywX.KWHzl(j, java.util.concurrent.TimeUnit.MILLISECONDS, this.EZpvd).AYXKKw().copydefault(c58098yuq);
            return c58098yuq;
        }

        public final void valueOf() {
            this.AEQbTJ.KWHzl();
        }

        public final void KWHzl(AbstractC58087yuf.Application application, InterfaceC58028ytZ.StateListAnimator stateListAnimator) {
            if (stateListAnimator instanceof InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator) {
                application.KWHzl().copydefault().AEQbTJ(((InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.C1013StateListAnimator) stateListAnimator).AEQbTJ());
            } else if (Intrinsics.EZpvd(stateListAnimator, InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator.TaskDescription.EZpvd)) {
                application.KWHzl().copydefault().EZpvd();
            }
        }

        public final void copydefault(AbstractC58087yuf.LoaderManager loaderManager) {
            loaderManager.copydefault().dispose();
        }

        public final C58024ytV.ActionBar<AbstractC58027ytY, AbstractC58027ytY.StateListAnimator.Activity<?>> KWHzl() {
            return C58024ytV.ActionBar.Companion.copydefault(AbstractC58027ytY.StateListAnimator.Activity.class).copydefault((Function1) new Function1<AbstractC58027ytY.StateListAnimator.Activity<?>, java.lang.Boolean>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$lifecycleStart$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(@NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    return Boolean.valueOf(Intrinsics.EZpvd(activity.OLrzqt(), InterfaceC58028ytZ.StateListAnimator.Activity.EZpvd));
                }
            });
        }

        public final C58024ytV.ActionBar<AbstractC58027ytY, AbstractC58027ytY.StateListAnimator.Activity<?>> AEQbTJ() {
            return C58024ytV.ActionBar.Companion.copydefault(AbstractC58027ytY.StateListAnimator.Activity.class).copydefault((Function1) new Function1<AbstractC58027ytY.StateListAnimator.Activity<?>, java.lang.Boolean>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$lifecycleStop$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(@NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    return Boolean.valueOf(activity.OLrzqt() instanceof InterfaceC58028ytZ.StateListAnimator.AbstractC1012StateListAnimator);
                }
            });
        }

        public final C58024ytV.ActionBar<AbstractC58027ytY, AbstractC58027ytY.Application.TaskDescription<?>> AYXKKw() {
            return C58024ytV.ActionBar.Companion.copydefault(AbstractC58027ytY.Application.TaskDescription.class).copydefault((Function1) new Function1<AbstractC58027ytY.Application.TaskDescription<?>, java.lang.Boolean>() { // from class: com.tinder.scarlet.internal.connection.Connection$StateManager$webSocketOpen$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(@NotNull AbstractC58027ytY.Application.TaskDescription<?> taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    return Boolean.valueOf(taskDescription.AEQbTJ() instanceof InterfaceC58092yuk.Activity.TaskDescription);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.yul$Activity */
    public static final class Activity {
        public final InterfaceC58080yuY AEQbTJ;
        public final InterfaceC58092yuk.Application EZpvd;
        public final InterfaceC56387yDm KWHzl;
        public final InterfaceC58028ytZ OLrzqt;
        public final AbstractC58253yxm copydefault;

        public Activity(@NotNull InterfaceC58028ytZ interfaceC58028ytZ, @NotNull InterfaceC58092yuk.Application application, @NotNull InterfaceC58080yuY interfaceC58080yuY, @NotNull AbstractC58253yxm abstractC58253yxm) {
            Intrinsics.checkNotNullParameter(interfaceC58028ytZ, "");
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(interfaceC58080yuY, "");
            Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
            this.OLrzqt = interfaceC58028ytZ;
            this.EZpvd = application;
            this.AEQbTJ = interfaceC58080yuY;
            this.copydefault = abstractC58253yxm;
            this.KWHzl = C56392yDr.copydefault(new Function0<C58071yuP>() { // from class: com.tinder.scarlet.internal.connection.Connection$Factory$sharedLifecycle$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                public final C58071yuP invoke() {
                    return this.this$0.copydefault();
                }
            });
        }

        public final InterfaceC58028ytZ OLrzqt() {
            return (InterfaceC58028ytZ) this.KWHzl.getValue();
        }

        public final C58093yul AEQbTJ() {
            return new C58093yul(new StateListAnimator(OLrzqt(), this.EZpvd, this.AEQbTJ, this.copydefault));
        }

        public final C58071yuP copydefault() {
            C58071yuP c58071yuP = new C58071yuP(0L, 1, null);
            this.OLrzqt.subscribe(c58071yuP);
            return c58071yuP;
        }
    }
}
