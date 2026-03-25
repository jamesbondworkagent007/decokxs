package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Process;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Process {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.lang.Boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Process$TaskDescription) A[MD:(o.Process$TaskDescription):void (m)] call: o.Process.<init>(o.Process$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Process(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public Process(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.copydefault();
        this.copydefault = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.EZpvd();
        this.EZpvd = taskDescription.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Process.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetPrincipalTagAttributeMapRequest(");
        sb.append("identityPoolId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("identityProviderName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("principalTags=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("useDefaults=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.Boolean bool = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Process.class != obj.getClass()) {
            return false;
        }
        Process process = (Process) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) process.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) process.copydefault) && Intrinsics.EZpvd(this.OLrzqt, process.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, process.EZpvd);
    }

    public static /* synthetic */ Process copy$default(Process process, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.SetPrincipalTagAttributeMapRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Process.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Process.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(process);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    public static final class TaskDescription {
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public java.lang.Boolean KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull Process process) {
            this();
            Intrinsics.checkNotNullParameter(process, "");
            this.OLrzqt = process.OLrzqt();
            this.copydefault = process.AEQbTJ();
            this.EZpvd = process.copydefault();
            this.KWHzl = process.KWHzl();
        }

        public final Process AEQbTJ() {
            return new Process(this, null);
        }
    }
}
