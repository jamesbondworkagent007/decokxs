package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.LeakedClosableViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LeakedClosableViolation {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LeakedClosableViolation$Activity) A[MD:(o.LeakedClosableViolation$Activity):void (m)] call: o.LeakedClosableViolation.<init>(o.LeakedClosableViolation$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LeakedClosableViolation(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    public LeakedClosableViolation(Activity activity) {
        this.copydefault = activity.OLrzqt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LeakedClosableViolation.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PutResourcePolicyResponse(");
        sb.append("policyRevisionId=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && LeakedClosableViolation.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((LeakedClosableViolation) obj).copydefault);
    }

    public static /* synthetic */ LeakedClosableViolation copy$default(LeakedClosableViolation leakedClosableViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.PutResourcePolicyResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LeakedClosableViolation.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LeakedClosableViolation.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(leakedClosableViolation);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull LeakedClosableViolation leakedClosableViolation) {
            this();
            Intrinsics.checkNotNullParameter(leakedClosableViolation, "");
            this.AEQbTJ = leakedClosableViolation.KWHzl();
        }

        public final LeakedClosableViolation KWHzl() {
            return new LeakedClosableViolation(this, null);
        }
    }
}
