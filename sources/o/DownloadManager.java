package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DownloadManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DownloadManager {
    public static final Activity EZpvd = new Activity(null);
    public final java.util.List<QueuedWork> KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DownloadManager$TaskDescription) A[MD:(o.DownloadManager$TaskDescription):void (m)] call: o.DownloadManager.<init>(o.DownloadManager$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DownloadManager(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<QueuedWork> OLrzqt() {
        return this.KWHzl;
    }

    public DownloadManager(TaskDescription taskDescription) {
        this.copydefault = taskDescription.AEQbTJ();
        java.util.List<QueuedWork> listKWHzl = taskDescription.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for resourceServers".toString());
        }
        this.KWHzl = listKWHzl;
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DownloadManager.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListResourceServersResponse(");
        sb.append("nextToken=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("resourceServers=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        return ((str != null ? str.hashCode() : 0) * 31) + this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DownloadManager.class != obj.getClass()) {
            return false;
        }
        DownloadManager downloadManager = (DownloadManager) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) downloadManager.copydefault) && Intrinsics.EZpvd(this.KWHzl, downloadManager.KWHzl);
    }

    public static /* synthetic */ DownloadManager copy$default(DownloadManager downloadManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ListResourceServersResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DownloadManager.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DownloadManager.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(downloadManager);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        public java.lang.String OLrzqt;
        public java.util.List<QueuedWork> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<QueuedWork> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<QueuedWork> list) {
            this.copydefault = list;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull DownloadManager downloadManager) {
            this();
            Intrinsics.checkNotNullParameter(downloadManager, "");
            this.OLrzqt = downloadManager.KWHzl();
            this.copydefault = downloadManager.OLrzqt();
        }

        public final DownloadManager OLrzqt() {
            return new DownloadManager(this, null);
        }

        public final TaskDescription EZpvd() {
            if (this.copydefault == null) {
                this.copydefault = yDY.AhwBna();
            }
            return this;
        }
    }
}
