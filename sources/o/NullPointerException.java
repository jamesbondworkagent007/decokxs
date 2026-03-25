package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NullPointerException;
import o.OutOfMemoryError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NullPointerException {
    public static final Application EZpvd = new Application(null);
    public final ClassNotFoundException AEQbTJ;
    public final ProcessBuilder KWHzl;
    public final OutOfMemoryError OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NullPointerException$TaskDescription) A[MD:(o.NullPointerException$TaskDescription):void (m)] call: o.NullPointerException.<init>(o.NullPointerException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NullPointerException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClassNotFoundException EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProcessBuilder KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OutOfMemoryError OLrzqt() {
        return this.OLrzqt;
    }

    public NullPointerException(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.EZpvd();
        this.KWHzl = taskDescription.AEQbTJ();
        OutOfMemoryError outOfMemoryErrorOLrzqt = taskDescription.OLrzqt();
        if (outOfMemoryErrorOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for type".toString());
        }
        this.OLrzqt = outOfMemoryErrorOLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NullPointerException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RoleMapping(");
        sb.append("ambiguousRoleResolution=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("rulesConfiguration=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ClassNotFoundException classNotFoundException = this.AEQbTJ;
        int iHashCode = classNotFoundException != null ? classNotFoundException.hashCode() : 0;
        ProcessBuilder processBuilder = this.KWHzl;
        return (((iHashCode * 31) + (processBuilder != null ? processBuilder.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NullPointerException.class != obj.getClass()) {
            return false;
        }
        NullPointerException nullPointerException = (NullPointerException) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, nullPointerException.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, nullPointerException.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, nullPointerException.OLrzqt);
    }

    public static /* synthetic */ NullPointerException copy$default(NullPointerException nullPointerException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.RoleMapping$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NullPointerException.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NullPointerException.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(nullPointerException);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public ClassNotFoundException EZpvd;
        public ProcessBuilder KWHzl;
        public OutOfMemoryError copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProcessBuilder AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClassNotFoundException EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ProcessBuilder processBuilder) {
            this.KWHzl = processBuilder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OutOfMemoryError OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ClassNotFoundException classNotFoundException) {
            this.EZpvd = classNotFoundException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(OutOfMemoryError outOfMemoryError) {
            this.copydefault = outOfMemoryError;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull NullPointerException nullPointerException) {
            this();
            Intrinsics.checkNotNullParameter(nullPointerException, "");
            this.EZpvd = nullPointerException.EZpvd();
            this.KWHzl = nullPointerException.KWHzl();
            this.copydefault = nullPointerException.OLrzqt();
        }

        public final NullPointerException copydefault() {
            return new NullPointerException(this, null);
        }

        public final TaskDescription KWHzl() {
            if (this.copydefault == null) {
                this.copydefault = new OutOfMemoryError.ActionBar("no value provided");
            }
            return this;
        }
    }
}
