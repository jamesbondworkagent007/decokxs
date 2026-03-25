package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityTransitionCoordinator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityTransitionCoordinator {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final JobSchedulerImpl EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ActivityTransitionCoordinator$ActionBar) A[MD:(o.ActivityTransitionCoordinator$ActionBar):void (m)] call: o.ActivityTransitionCoordinator.<init>(o.ActivityTransitionCoordinator$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActivityTransitionCoordinator(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JobSchedulerImpl OLrzqt() {
        return this.EZpvd;
    }

    public ActivityTransitionCoordinator(ActionBar actionBar) {
        this.EZpvd = actionBar.copydefault();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActivityTransitionCoordinator.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLogDeliveryConfigurationResponse(");
        sb.append("logDeliveryConfiguration=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        JobSchedulerImpl jobSchedulerImpl = this.EZpvd;
        if (jobSchedulerImpl != null) {
            return jobSchedulerImpl.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ActivityTransitionCoordinator.class == obj.getClass() && Intrinsics.EZpvd(this.EZpvd, ((ActivityTransitionCoordinator) obj).EZpvd);
    }

    public static /* synthetic */ ActivityTransitionCoordinator copy$default(ActivityTransitionCoordinator activityTransitionCoordinator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.GetLogDeliveryConfigurationResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActivityTransitionCoordinator.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActivityTransitionCoordinator.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(activityTransitionCoordinator);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public JobSchedulerImpl AEQbTJ;

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JobSchedulerImpl copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(JobSchedulerImpl jobSchedulerImpl) {
            this.AEQbTJ = jobSchedulerImpl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ActivityTransitionCoordinator activityTransitionCoordinator) {
            this();
            Intrinsics.checkNotNullParameter(activityTransitionCoordinator, "");
            this.AEQbTJ = activityTransitionCoordinator.OLrzqt();
        }

        public final ActivityTransitionCoordinator EZpvd() {
            return new ActivityTransitionCoordinator(this, null);
        }
    }
}
