package o;

import com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserialization$mapToData$1;
import com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserializedValue$mapToData$1;
import com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserializedValue$mapToData$2;
import com.tinder.scarlet.internal.servicemethod.EventMapper$ToLifecycleState$mapToData$1;
import com.tinder.scarlet.internal.servicemethod.EventMapper$ToState$mapToData$1;
import com.tinder.scarlet.internal.servicemethod.EventMapper$ToWebSocketEvent$mapToData$1;
import java.lang.reflect.ParameterizedType;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58027ytY;
import o.AbstractC58083yub;
import o.AbstractC58087yuf;
import o.AbstractC58096yuo;
import o.InterfaceC58028ytZ;
import o.InterfaceC58092yuk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58096yuo<T> {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuo.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58096yuo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AbstractC58245yxe<T> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY);

    private AbstractC58096yuo() {
    }

    /* JADX INFO: renamed from: o.yuo$Application */
    public static final class Application extends AbstractC58096yuo<java.lang.Object> {
        public static final Application EZpvd = new Application();

        private Application() {
            super(null);
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<java.lang.Object> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            AbstractC58245yxe<java.lang.Object> abstractC58245yxeAEQbTJ = AbstractC58245yxe.AEQbTJ(abstractC58027ytY);
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxeAEQbTJ, "");
            return abstractC58245yxeAEQbTJ;
        }
    }

    /* JADX INFO: renamed from: o.yuo$StateListAnimator */
    public static final class StateListAnimator<E extends AbstractC58027ytY> extends AbstractC58096yuo<E> {
        public final java.lang.Class<E> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.Class<E> cls) {
            super(null);
            Intrinsics.checkNotNullParameter(cls, "");
            this.KWHzl = cls;
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<E> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            if (this.KWHzl.isInstance(abstractC58027ytY)) {
                AbstractC58245yxe<E> abstractC58245yxeAEQbTJ = AbstractC58245yxe.AEQbTJ(abstractC58027ytY);
                Intrinsics.checkNotNullExpressionValue(abstractC58245yxeAEQbTJ, "");
                return abstractC58245yxeAEQbTJ;
            }
            AbstractC58245yxe<E> abstractC58245yxeAEQbTJ2 = AbstractC58245yxe.AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxeAEQbTJ2, "");
            return abstractC58245yxeAEQbTJ2;
        }
    }

    /* JADX INFO: renamed from: o.yuo$Fragment */
    public static final class Fragment extends AbstractC58096yuo<InterfaceC58028ytZ.StateListAnimator> {
        public static final Fragment copydefault = new Fragment();
        public static final StateListAnimator<AbstractC58027ytY.StateListAnimator.Activity<?>> KWHzl = new StateListAnimator<>(AbstractC58027ytY.StateListAnimator.Activity.class);

        private Fragment() {
            super(null);
        }

        public static final InterfaceC58028ytZ.StateListAnimator OLrzqt(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (InterfaceC58028ytZ.StateListAnimator) function1.invoke(obj);
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<InterfaceC58028ytZ.StateListAnimator> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            AbstractC58245yxe<E> abstractC58245yxeCopydefault = KWHzl.copydefault(abstractC58027ytY);
            final EventMapper$ToLifecycleState$mapToData$1 eventMapper$ToLifecycleState$mapToData$1 = new Function1<AbstractC58027ytY.StateListAnimator.Activity<?>, InterfaceC58028ytZ.StateListAnimator>() { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToLifecycleState$mapToData$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC58028ytZ.StateListAnimator invoke(@NotNull AbstractC58027ytY.StateListAnimator.Activity<?> activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    return activity.OLrzqt();
                }
            };
            AbstractC58245yxe<InterfaceC58028ytZ.StateListAnimator> abstractC58245yxeEZpvd = abstractC58245yxeCopydefault.EZpvd((InterfaceC58229yxO<? super E, ? extends R>) new InterfaceC58229yxO() { // from class: o.yur
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC58096yuo.Fragment.OLrzqt(eventMapper$ToLifecycleState$mapToData$1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxeEZpvd, "");
            return abstractC58245yxeEZpvd;
        }
    }

    /* JADX INFO: renamed from: o.yuo$Dialog */
    public static final class Dialog extends AbstractC58096yuo<InterfaceC58092yuk.Activity> {
        public static final Dialog KWHzl = new Dialog();
        public static final StateListAnimator<AbstractC58027ytY.Application.TaskDescription<?>> copydefault = new StateListAnimator<>(AbstractC58027ytY.Application.TaskDescription.class);

        private Dialog() {
            super(null);
        }

        public static final InterfaceC58092yuk.Activity EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (InterfaceC58092yuk.Activity) function1.invoke(obj);
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<InterfaceC58092yuk.Activity> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            AbstractC58245yxe<E> abstractC58245yxeCopydefault = copydefault.copydefault(abstractC58027ytY);
            final EventMapper$ToWebSocketEvent$mapToData$1 eventMapper$ToWebSocketEvent$mapToData$1 = new Function1<AbstractC58027ytY.Application.TaskDescription<?>, InterfaceC58092yuk.Activity>() { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToWebSocketEvent$mapToData$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final InterfaceC58092yuk.Activity invoke(@NotNull AbstractC58027ytY.Application.TaskDescription<?> taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                    return taskDescription.AEQbTJ();
                }
            };
            AbstractC58245yxe<InterfaceC58092yuk.Activity> abstractC58245yxeEZpvd = abstractC58245yxeCopydefault.EZpvd((InterfaceC58229yxO<? super E, ? extends R>) new InterfaceC58229yxO() { // from class: o.yuw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC58096yuo.Dialog.EZpvd(eventMapper$ToWebSocketEvent$mapToData$1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxeEZpvd, "");
            return abstractC58245yxeEZpvd;
        }
    }

    /* JADX INFO: renamed from: o.yuo$PendingIntent */
    public static final class PendingIntent extends AbstractC58096yuo<AbstractC58087yuf> {
        public static final PendingIntent AEQbTJ = new PendingIntent();
        public static final StateListAnimator<AbstractC58027ytY.Activity<?>> OLrzqt = new StateListAnimator<>(AbstractC58027ytY.Activity.class);

        private PendingIntent() {
            super(null);
        }

        public static final AbstractC58087yuf KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (AbstractC58087yuf) function1.invoke(obj);
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<AbstractC58087yuf> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            AbstractC58245yxe<E> abstractC58245yxeCopydefault = OLrzqt.copydefault(abstractC58027ytY);
            final EventMapper$ToState$mapToData$1 eventMapper$ToState$mapToData$1 = new Function1<AbstractC58027ytY.Activity<?>, AbstractC58087yuf>() { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToState$mapToData$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final AbstractC58087yuf invoke(@NotNull AbstractC58027ytY.Activity<?> activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    return activity.OLrzqt();
                }
            };
            AbstractC58245yxe<AbstractC58087yuf> abstractC58245yxeEZpvd = abstractC58245yxeCopydefault.EZpvd((InterfaceC58229yxO<? super E, ? extends R>) new InterfaceC58229yxO() { // from class: o.yuv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC58096yuo.PendingIntent.KWHzl(eventMapper$ToState$mapToData$1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxeEZpvd, "");
            return abstractC58245yxeEZpvd;
        }
    }

    /* JADX INFO: renamed from: o.yuo$Activity */
    public static final class Activity<T> extends AbstractC58096yuo<AbstractC58083yub<T>> {
        public final Dialog AEQbTJ;
        public final InterfaceC58026ytX<T> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC58026ytX<T> interfaceC58026ytX) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC58026ytX, "");
            this.OLrzqt = interfaceC58026ytX;
            this.AEQbTJ = Dialog.KWHzl;
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<AbstractC58083yub<T>> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            AbstractC58245yxe<InterfaceC58092yuk.Activity> abstractC58245yxeCopydefault = this.AEQbTJ.copydefault(abstractC58027ytY);
            final EventMapper$ToDeserialization$mapToData$1 eventMapper$ToDeserialization$mapToData$1 = new Function1<InterfaceC58092yuk.Activity, java.lang.Boolean>() { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserialization$mapToData$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(@NotNull InterfaceC58092yuk.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    return Boolean.valueOf(activity instanceof InterfaceC58092yuk.Activity.C1015Activity);
                }
            };
            AbstractC58245yxe<InterfaceC58092yuk.Activity> abstractC58245yxeEZpvd = abstractC58245yxeCopydefault.EZpvd(new InterfaceC58239yxY() { // from class: o.yum
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58239yxY
                public final boolean test(java.lang.Object obj) {
                    return AbstractC58096yuo.Activity.OLrzqt(eventMapper$ToDeserialization$mapToData$1, obj);
                }
            });
            final Function1<InterfaceC58092yuk.Activity, AbstractC58083yub<T>> function1 = new Function1<InterfaceC58092yuk.Activity, AbstractC58083yub<T>>(this) { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserialization$mapToData$2
                final /* synthetic */ AbstractC58096yuo.Activity<T> this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final AbstractC58083yub<T> invoke(@NotNull InterfaceC58092yuk.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                    return this.this$0.EZpvd(((InterfaceC58092yuk.Activity.C1015Activity) activity).AEQbTJ());
                }
            };
            AbstractC58245yxe<AbstractC58083yub<T>> abstractC58245yxe = (AbstractC58245yxe<AbstractC58083yub<T>>) abstractC58245yxeEZpvd.EZpvd(new InterfaceC58229yxO() { // from class: o.yus
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC58096yuo.Activity.AEQbTJ(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxe, "");
            return abstractC58245yxe;
        }

        public static final boolean OLrzqt(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
        }

        public static final AbstractC58083yub AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (AbstractC58083yub) function1.invoke(obj);
        }

        public final AbstractC58083yub<T> EZpvd(AbstractC58082yua abstractC58082yua) {
            try {
                return new AbstractC58083yub.ActionBar(this.OLrzqt.AEQbTJ(abstractC58082yua));
            } catch (java.lang.Throwable th) {
                return new AbstractC58083yub.Application(th);
            }
        }
    }

    /* JADX INFO: renamed from: o.yuo$LoaderManager */
    public static final class LoaderManager<T> extends AbstractC58096yuo<T> {
        public final Activity<T> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull Activity<T> activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl = activity;
        }

        @Override // o.AbstractC58096yuo
        public AbstractC58245yxe<T> copydefault(@NotNull AbstractC58027ytY abstractC58027ytY) {
            Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
            AbstractC58245yxe<AbstractC58083yub<T>> abstractC58245yxeCopydefault = this.KWHzl.copydefault(abstractC58027ytY);
            final EventMapper$ToDeserializedValue$mapToData$1 eventMapper$ToDeserializedValue$mapToData$1 = new Function1<AbstractC58083yub<T>, java.lang.Boolean>() { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserializedValue$mapToData$1
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(@NotNull AbstractC58083yub<T> abstractC58083yub) {
                    Intrinsics.checkNotNullParameter(abstractC58083yub, "");
                    return Boolean.valueOf(abstractC58083yub instanceof AbstractC58083yub.ActionBar);
                }
            };
            AbstractC58245yxe<AbstractC58083yub<T>> abstractC58245yxeEZpvd = abstractC58245yxeCopydefault.EZpvd(new InterfaceC58239yxY() { // from class: o.yuu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58239yxY
                public final boolean test(java.lang.Object obj) {
                    return AbstractC58096yuo.LoaderManager.EZpvd(eventMapper$ToDeserializedValue$mapToData$1, obj);
                }
            });
            final EventMapper$ToDeserializedValue$mapToData$2 eventMapper$ToDeserializedValue$mapToData$2 = new Function1<AbstractC58083yub<T>, T>() { // from class: com.tinder.scarlet.internal.servicemethod.EventMapper$ToDeserializedValue$mapToData$2
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function1
                public final T invoke(@NotNull AbstractC58083yub<T> abstractC58083yub) {
                    Intrinsics.checkNotNullParameter(abstractC58083yub, "");
                    return (T) ((AbstractC58083yub.ActionBar) abstractC58083yub).AEQbTJ();
                }
            };
            AbstractC58245yxe<T> abstractC58245yxe = (AbstractC58245yxe<T>) abstractC58245yxeEZpvd.EZpvd(new InterfaceC58229yxO() { // from class: o.yut
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC58096yuo.LoaderManager.KWHzl(eventMapper$ToDeserializedValue$mapToData$2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58245yxe, "");
            return abstractC58245yxe;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
        }

        public static final java.lang.Object KWHzl(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return function1.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.yuo$TaskDescription */
    public static final class TaskDescription {
        public final C58056yuA AEQbTJ;
        public final java.util.Map<InterfaceC58026ytX<java.lang.Object>, Activity<?>> OLrzqt;

        public TaskDescription(@NotNull C58056yuA c58056yuA) {
            Intrinsics.checkNotNullParameter(c58056yuA, "");
            this.AEQbTJ = c58056yuA;
            this.OLrzqt = new LinkedHashMap();
        }

        public final AbstractC58096yuo<?> copydefault(@NotNull ParameterizedType parameterizedType, @NotNull java.lang.annotation.Annotation[] annotationArr) {
            Intrinsics.checkNotNullParameter(parameterizedType, "");
            Intrinsics.checkNotNullParameter(annotationArr, "");
            java.lang.Class<?> clsCopydefault = C58137yvc.copydefault(AbstractC58096yuo.Companion.copydefault(parameterizedType));
            if (Intrinsics.EZpvd(clsCopydefault, AbstractC58027ytY.class)) {
                return Application.EZpvd;
            }
            if (!(!AbstractC58027ytY.class.isAssignableFrom(clsCopydefault))) {
                throw new java.lang.IllegalArgumentException("Subclasses of Event is not supported".toString());
            }
            if (Intrinsics.EZpvd(InterfaceC58028ytZ.StateListAnimator.class, clsCopydefault)) {
                return Fragment.copydefault;
            }
            if (!(!InterfaceC58028ytZ.StateListAnimator.class.isAssignableFrom(clsCopydefault))) {
                throw new java.lang.IllegalArgumentException("Subclasses of Lifecycle.Event is not supported".toString());
            }
            if (Intrinsics.EZpvd(InterfaceC58092yuk.Activity.class, clsCopydefault)) {
                return Dialog.KWHzl;
            }
            if (!(!InterfaceC58092yuk.Activity.class.isAssignableFrom(clsCopydefault))) {
                throw new java.lang.IllegalArgumentException("Subclasses of WebSocket.Event is not supported".toString());
            }
            if (Intrinsics.EZpvd(AbstractC58087yuf.class, clsCopydefault)) {
                return PendingIntent.AEQbTJ;
            }
            if (!(!AbstractC58087yuf.class.isAssignableFrom(clsCopydefault))) {
                throw new java.lang.IllegalArgumentException("Subclasses of State is not supported".toString());
            }
            Activity<?> activityKWHzl = KWHzl(KWHzl(parameterizedType, annotationArr));
            return Intrinsics.EZpvd(clsCopydefault, AbstractC58083yub.class) ? activityKWHzl : new LoaderManager(activityKWHzl);
        }

        public final Activity<?> KWHzl(InterfaceC58026ytX<java.lang.Object> interfaceC58026ytX) {
            if (this.OLrzqt.containsKey(interfaceC58026ytX)) {
                Activity<?> activity = this.OLrzqt.get(interfaceC58026ytX);
                Intrinsics.copydefault(activity);
                return activity;
            }
            Activity<?> activity2 = new Activity<>(interfaceC58026ytX);
            this.OLrzqt.put(interfaceC58026ytX, activity2);
            return activity2;
        }

        public final InterfaceC58026ytX<java.lang.Object> KWHzl(ParameterizedType parameterizedType, java.lang.annotation.Annotation[] annotationArr) {
            ActionBar actionBar = AbstractC58096yuo.Companion;
            java.lang.reflect.Type typeCopydefault = actionBar.copydefault(parameterizedType);
            if (Intrinsics.EZpvd(C58137yvc.copydefault(typeCopydefault), AbstractC58083yub.class)) {
                Intrinsics.copydefault(typeCopydefault, "");
                typeCopydefault = actionBar.copydefault((ParameterizedType) typeCopydefault);
            }
            return this.AEQbTJ.AEQbTJ(typeCopydefault, annotationArr);
        }
    }

    /* JADX INFO: renamed from: o.yuo$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.reflect.Type copydefault(ParameterizedType parameterizedType) {
            return C58137yvc.KWHzl(parameterizedType, 0);
        }
    }
}
