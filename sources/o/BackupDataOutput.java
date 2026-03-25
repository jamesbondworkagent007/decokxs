package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackupDataOutput;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BackupDataOutput {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final QueuedWork OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupDataOutput$Activity) A[MD:(o.BackupDataOutput$Activity):void (m)] call: o.BackupDataOutput.<init>(o.BackupDataOutput$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupDataOutput(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueuedWork EZpvd() {
        return this.OLrzqt;
    }

    public BackupDataOutput(Activity activity) {
        this.OLrzqt = activity.AEQbTJ();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupDataOutput.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateResourceServerResponse(");
        sb.append("resourceServer=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        QueuedWork queuedWork = this.OLrzqt;
        if (queuedWork != null) {
            return queuedWork.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BackupDataOutput.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((BackupDataOutput) obj).OLrzqt);
    }

    public static /* synthetic */ BackupDataOutput copy$default(BackupDataOutput backupDataOutput, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateResourceServerResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BackupDataOutput.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BackupDataOutput.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(backupDataOutput);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public QueuedWork EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final QueuedWork AEQbTJ() {
            return this.EZpvd;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(QueuedWork queuedWork) {
            this.EZpvd = queuedWork;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull BackupDataOutput backupDataOutput) {
            this();
            Intrinsics.checkNotNullParameter(backupDataOutput, "");
            this.EZpvd = backupDataOutput.EZpvd();
        }

        public final BackupDataOutput OLrzqt() {
            return new BackupDataOutput(this, null);
        }
    }
}
