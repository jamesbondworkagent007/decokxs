package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SystemUpdateInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SystemUpdateInfo {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final TestApi KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SystemUpdateInfo$TaskDescription) A[MD:(o.SystemUpdateInfo$TaskDescription):void (m)] call: o.SystemUpdateInfo.<init>(o.SystemUpdateInfo$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SystemUpdateInfo(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TestApi EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public SystemUpdateInfo(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.EZpvd();
        this.AEQbTJ = taskDescription.KWHzl();
        this.KWHzl = taskDescription.AEQbTJ();
        this.copydefault = taskDescription.OLrzqt();
        this.AhwBna = taskDescription.AhwBna();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SystemUpdateInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateAuthEventFeedbackRequest(");
        sb.append("eventId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("feedbackToken=*** Sensitive Data Redacted ***,");
        sb.append("feedbackValue=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        TestApi testApi = this.KWHzl;
        int iHashCode3 = testApi != null ? testApi.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SystemUpdateInfo.class != obj.getClass()) {
            return false;
        }
        SystemUpdateInfo systemUpdateInfo = (SystemUpdateInfo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) systemUpdateInfo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) systemUpdateInfo.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, systemUpdateInfo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) systemUpdateInfo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) systemUpdateInfo.AhwBna);
    }

    public static /* synthetic */ SystemUpdateInfo copy$default(SystemUpdateInfo systemUpdateInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateAuthEventFeedbackRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SystemUpdateInfo.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SystemUpdateInfo.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(systemUpdateInfo);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public TestApi KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TestApi AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull SystemUpdateInfo systemUpdateInfo) {
            this();
            Intrinsics.checkNotNullParameter(systemUpdateInfo, "");
            this.AEQbTJ = systemUpdateInfo.copydefault();
            this.OLrzqt = systemUpdateInfo.OLrzqt();
            this.KWHzl = systemUpdateInfo.EZpvd();
            this.copydefault = systemUpdateInfo.KWHzl();
            this.EZpvd = systemUpdateInfo.AEQbTJ();
        }

        public final SystemUpdateInfo copydefault() {
            return new SystemUpdateInfo(this, null);
        }
    }
}
