package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SharedPreferencesBackupHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SharedPreferencesBackupHelper {
    public static final Application copydefault = new Application(null);
    public final NotificationChannel EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SharedPreferencesBackupHelper$TaskDescription) A[MD:(o.SharedPreferencesBackupHelper$TaskDescription):void (m)] call: o.SharedPreferencesBackupHelper.<init>(o.SharedPreferencesBackupHelper$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SharedPreferencesBackupHelper(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationChannel OLrzqt() {
        return this.EZpvd;
    }

    public SharedPreferencesBackupHelper(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.OLrzqt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SharedPreferencesBackupHelper.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserPoolPolicyType(");
        sb.append("passwordPolicy=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        NotificationChannel notificationChannel = this.EZpvd;
        if (notificationChannel != null) {
            return notificationChannel.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && SharedPreferencesBackupHelper.class == obj.getClass() && Intrinsics.EZpvd(this.EZpvd, ((SharedPreferencesBackupHelper) obj).EZpvd);
    }

    public static /* synthetic */ SharedPreferencesBackupHelper copy$default(SharedPreferencesBackupHelper sharedPreferencesBackupHelper, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolPolicyType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SharedPreferencesBackupHelper.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SharedPreferencesBackupHelper.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(sharedPreferencesBackupHelper);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public NotificationChannel EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotificationChannel OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(NotificationChannel notificationChannel) {
            this.EZpvd = notificationChannel;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull SharedPreferencesBackupHelper sharedPreferencesBackupHelper) {
            this();
            Intrinsics.checkNotNullParameter(sharedPreferencesBackupHelper, "");
            this.EZpvd = sharedPreferencesBackupHelper.OLrzqt();
        }

        public final SharedPreferencesBackupHelper AEQbTJ() {
            return new SharedPreferencesBackupHelper(this, null);
        }
    }
}
