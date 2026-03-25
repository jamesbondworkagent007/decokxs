package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackupManagerMonitor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BackupManagerMonitor {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<AnimatorInflater> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupManagerMonitor$TaskDescription) A[MD:(o.BackupManagerMonitor$TaskDescription):void (m)] call: o.BackupManagerMonitor.<init>(o.BackupManagerMonitor$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupManagerMonitor(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AnimatorInflater> OLrzqt() {
        return this.EZpvd;
    }

    public BackupManagerMonitor(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupManagerMonitor.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateUserAttributesResponse(");
        sb.append("codeDeliveryDetailsList=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<AnimatorInflater> list = this.EZpvd;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BackupManagerMonitor.class == obj.getClass() && Intrinsics.EZpvd(this.EZpvd, ((BackupManagerMonitor) obj).EZpvd);
    }

    public static /* synthetic */ BackupManagerMonitor copy$default(BackupManagerMonitor backupManagerMonitor, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateUserAttributesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BackupManagerMonitor.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BackupManagerMonitor.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(backupManagerMonitor);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        public java.util.List<AnimatorInflater> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AnimatorInflater> AEQbTJ() {
            return this.EZpvd;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<AnimatorInflater> list) {
            this.EZpvd = list;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull BackupManagerMonitor backupManagerMonitor) {
            this();
            Intrinsics.checkNotNullParameter(backupManagerMonitor, "");
            this.EZpvd = backupManagerMonitor.OLrzqt();
        }

        public final BackupManagerMonitor KWHzl() {
            return new BackupManagerMonitor(this, null);
        }
    }
}
