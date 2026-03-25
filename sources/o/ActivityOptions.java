package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityOptions;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityOptions {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final AutomaticZenRule AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ActivityOptions$Activity) A[MD:(o.ActivityOptions$Activity):void (m)] call: o.ActivityOptions.<init>(o.ActivityOptions$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActivityOptions(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutomaticZenRule AEQbTJ() {
        return this.AEQbTJ;
    }

    public ActivityOptions(Activity activity) {
        this.AEQbTJ = activity.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActivityOptions.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetGroupResponse(");
        sb.append("group=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AutomaticZenRule automaticZenRule = this.AEQbTJ;
        if (automaticZenRule != null) {
            return automaticZenRule.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ActivityOptions.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((ActivityOptions) obj).AEQbTJ);
    }

    public static /* synthetic */ ActivityOptions copy$default(ActivityOptions activityOptions, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.GetGroupResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActivityOptions.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActivityOptions.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(activityOptions);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public AutomaticZenRule KWHzl;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AutomaticZenRule automaticZenRule) {
            this.KWHzl = automaticZenRule;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AutomaticZenRule copydefault() {
            return this.KWHzl;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ActivityOptions activityOptions) {
            this();
            Intrinsics.checkNotNullParameter(activityOptions, "");
            this.KWHzl = activityOptions.AEQbTJ();
        }

        public final ActivityOptions EZpvd() {
            return new ActivityOptions(this, null);
        }
    }
}
