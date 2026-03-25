package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Notification;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Notification {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Notification$TaskDescription) A[MD:(o.Notification$TaskDescription):void (m)] call: o.Notification.<init>(o.Notification$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Notification(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public Notification(TaskDescription taskDescription) {
        this.copydefault = taskDescription.OLrzqt();
        java.lang.String strCopydefault = taskDescription.copydefault();
        if (strCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for subject".toString());
        }
        this.OLrzqt = strCopydefault;
        this.KWHzl = taskDescription.EZpvd();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Notification.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NotifyEmailType(");
        sb.append("htmlBody=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("subject=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("textBody=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = this.OLrzqt.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Notification.class != obj.getClass()) {
            return false;
        }
        Notification notification = (Notification) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) notification.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) notification.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) notification.KWHzl);
    }

    public static /* synthetic */ Notification copy$default(Notification notification, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.NotifyEmailType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Notification.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Notification.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(notification);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull Notification notification) {
            this();
            Intrinsics.checkNotNullParameter(notification, "");
            this.KWHzl = notification.EZpvd();
            this.OLrzqt = notification.OLrzqt();
            this.AEQbTJ = notification.KWHzl();
        }

        public final Notification AEQbTJ() {
            return new Notification(this, null);
        }
    }
}
