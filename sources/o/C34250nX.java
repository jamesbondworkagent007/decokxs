package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34250nX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34250nX {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final java.lang.String EZpvd;
    public final C36602oe OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nX$TaskDescription) A[MD:(o.nX$TaskDescription):void (m)] call: o.nX.<init>(o.nX$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34250nX(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36602oe OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C34250nX(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.copydefault();
        java.lang.String strAEQbTJ = taskDescription.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for flowDefinitionArn".toString());
        }
        this.copydefault = strAEQbTJ;
        java.lang.String strEZpvd = taskDescription.EZpvd();
        if (strEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for humanLoopName".toString());
        }
        this.EZpvd = strEZpvd;
    }

    /* JADX INFO: renamed from: o.nX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HumanLoopConfig(");
        sb.append("dataAttributes=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("flowDefinitionArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("humanLoopName=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C36602oe c36602oe = this.OLrzqt;
        return ((((c36602oe != null ? c36602oe.hashCode() : 0) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34250nX.class != obj.getClass()) {
            return false;
        }
        C34250nX c34250nX = (C34250nX) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c34250nX.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34250nX.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c34250nX.EZpvd);
    }

    public static /* synthetic */ C34250nX copy$default(C34250nX c34250nX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.HumanLoopConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34250nX.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34250nX.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c34250nX);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    /* JADX INFO: renamed from: o.nX$TaskDescription */
    public static final class TaskDescription {
        public java.lang.String EZpvd;
        public C36602oe OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C36602oe copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C34250nX c34250nX) {
            this();
            Intrinsics.checkNotNullParameter(c34250nX, "");
            this.OLrzqt = c34250nX.OLrzqt();
            this.copydefault = c34250nX.AEQbTJ();
            this.EZpvd = c34250nX.copydefault();
        }

        public final C34250nX KWHzl() {
            return new C34250nX(this, null);
        }
    }
}
