package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityRelaunchItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ActivityRelaunchItem {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.lang.String EZpvd;
    public final ActivityLifecycleItem OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ActivityRelaunchItem$Activity) A[MD:(o.ActivityRelaunchItem$Activity):void (m)] call: o.ActivityRelaunchItem.<init>(o.ActivityRelaunchItem$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActivityRelaunchItem(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityLifecycleItem AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    public ActivityRelaunchItem(Activity activity) {
        this.EZpvd = activity.copydefault();
        this.OLrzqt = activity.AEQbTJ();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActivityRelaunchItem.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VerifySoftwareTokenResponse(");
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("status=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        ActivityLifecycleItem activityLifecycleItem = this.OLrzqt;
        return (iHashCode * 31) + (activityLifecycleItem != null ? activityLifecycleItem.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityRelaunchItem.class != obj.getClass()) {
            return false;
        }
        ActivityRelaunchItem activityRelaunchItem = (ActivityRelaunchItem) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activityRelaunchItem.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activityRelaunchItem.OLrzqt);
    }

    public static /* synthetic */ ActivityRelaunchItem copy$default(ActivityRelaunchItem activityRelaunchItem, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.VerifySoftwareTokenResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActivityRelaunchItem.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActivityRelaunchItem.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(activityRelaunchItem);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public ActivityLifecycleItem EZpvd;
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActivityLifecycleItem AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ActivityLifecycleItem activityLifecycleItem) {
            this.EZpvd = activityLifecycleItem;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ActivityRelaunchItem activityRelaunchItem) {
            this();
            Intrinsics.checkNotNullParameter(activityRelaunchItem, "");
            this.KWHzl = activityRelaunchItem.KWHzl();
            this.EZpvd = activityRelaunchItem.AEQbTJ();
        }

        public final ActivityRelaunchItem EZpvd() {
            return new ActivityRelaunchItem(this, null);
        }
    }
}
