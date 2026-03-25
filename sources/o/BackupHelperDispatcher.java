package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackupHelperDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BackupHelperDispatcher {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final RestoreObserver AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupHelperDispatcher$Activity) A[MD:(o.BackupHelperDispatcher$Activity):void (m)] call: o.BackupHelperDispatcher.<init>(o.BackupHelperDispatcher$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupHelperDispatcher(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreObserver copydefault() {
        return this.AEQbTJ;
    }

    public BackupHelperDispatcher(Activity activity) {
        this.AEQbTJ = activity.OLrzqt();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupHelperDispatcher.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateUserPoolClientResponse(");
        sb.append("userPoolClient=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RestoreObserver restoreObserver = this.AEQbTJ;
        if (restoreObserver != null) {
            return restoreObserver.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BackupHelperDispatcher.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((BackupHelperDispatcher) obj).AEQbTJ);
    }

    public static /* synthetic */ BackupHelperDispatcher copy$default(BackupHelperDispatcher backupHelperDispatcher, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateUserPoolClientResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BackupHelperDispatcher.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BackupHelperDispatcher.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(backupHelperDispatcher);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public RestoreObserver AEQbTJ;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreObserver OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RestoreObserver restoreObserver) {
            this.AEQbTJ = restoreObserver;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull BackupHelperDispatcher backupHelperDispatcher) {
            this();
            Intrinsics.checkNotNullParameter(backupHelperDispatcher, "");
            this.AEQbTJ = backupHelperDispatcher.copydefault();
        }

        public final BackupHelperDispatcher copydefault() {
            return new BackupHelperDispatcher(this, null);
        }
    }
}
