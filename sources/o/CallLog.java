package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CallLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CallLog {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CallLog$TaskDescription) A[MD:(o.CallLog$TaskDescription):void (m)] call: o.CallLog.<init>(o.CallLog$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CallLog(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public CallLog(TaskDescription taskDescription) {
        this.copydefault = taskDescription.AEQbTJ();
        this.AEQbTJ = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.copydefault();
        this.KWHzl = taskDescription.KWHzl();
        this.AhwBna = taskDescription.AYXKKw();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CallLog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateEndpointRequest(");
        sb.append("desiredDataAccessRoleArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("desiredInferenceUnits=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("desiredModelArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endpointArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("flywheelArn=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        return (((((((iHashCode * 31) + iIntValue) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CallLog.class != obj.getClass()) {
            return false;
        }
        CallLog callLog = (CallLog) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) callLog.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, callLog.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) callLog.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) callLog.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) callLog.AhwBna);
    }

    public static /* synthetic */ CallLog copy$default(CallLog callLog, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.UpdateEndpointRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CallLog.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CallLog.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(callLog);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Integer OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull CallLog callLog) {
            this();
            Intrinsics.checkNotNullParameter(callLog, "");
            this.KWHzl = callLog.AEQbTJ();
            this.OLrzqt = callLog.OLrzqt();
            this.EZpvd = callLog.copydefault();
            this.copydefault = callLog.KWHzl();
            this.AEQbTJ = callLog.EZpvd();
        }

        public final CallLog EZpvd() {
            return new CallLog(this, null);
        }
    }
}
