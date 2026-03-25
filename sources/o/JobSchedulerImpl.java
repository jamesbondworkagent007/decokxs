package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.JobSchedulerImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class JobSchedulerImpl {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final java.util.List<LauncherActivity> EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.JobSchedulerImpl$Activity) A[MD:(o.JobSchedulerImpl$Activity):void (m)] call: o.JobSchedulerImpl.<init>(o.JobSchedulerImpl$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ JobSchedulerImpl(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LauncherActivity> OLrzqt() {
        return this.EZpvd;
    }

    public JobSchedulerImpl(Activity activity) {
        java.util.List<LauncherActivity> listEZpvd = activity.EZpvd();
        if (listEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for logConfigurations".toString());
        }
        this.EZpvd = listEZpvd;
        java.lang.String strCopydefault = activity.copydefault();
        if (strCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for userPoolId".toString());
        }
        this.OLrzqt = strCopydefault;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.JobSchedulerImpl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogDeliveryConfigurationType(");
        sb.append("logConfigurations=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JobSchedulerImpl.class != obj.getClass()) {
            return false;
        }
        JobSchedulerImpl jobSchedulerImpl = (JobSchedulerImpl) obj;
        return Intrinsics.EZpvd(this.EZpvd, jobSchedulerImpl.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) jobSchedulerImpl.OLrzqt);
    }

    public static /* synthetic */ JobSchedulerImpl copy$default(JobSchedulerImpl jobSchedulerImpl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.LogDeliveryConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull JobSchedulerImpl.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(JobSchedulerImpl.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(jobSchedulerImpl);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.util.List<LauncherActivity> EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<LauncherActivity> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<LauncherActivity> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull JobSchedulerImpl jobSchedulerImpl) {
            this();
            Intrinsics.checkNotNullParameter(jobSchedulerImpl, "");
            this.EZpvd = jobSchedulerImpl.OLrzqt();
            this.OLrzqt = jobSchedulerImpl.AEQbTJ();
        }

        public final JobSchedulerImpl AEQbTJ() {
            return new JobSchedulerImpl(this, null);
        }

        public final Activity KWHzl() {
            if (this.EZpvd == null) {
                this.EZpvd = yDY.AhwBna();
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }
    }
}
