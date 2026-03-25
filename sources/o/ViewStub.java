package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ViewStub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewStub {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.Boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ViewStub$TaskDescription) A[MD:(o.ViewStub$TaskDescription):void (m)] call: o.ViewStub.<init>(o.ViewStub$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewStub(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public ViewStub(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.copydefault();
        java.lang.Boolean boolEZpvd = taskDescription.EZpvd();
        if (boolEZpvd == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.AEQbTJ = boolEZpvd;
        java.lang.Boolean boolKWHzl = taskDescription.KWHzl();
        if (boolKWHzl == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.copydefault = boolKWHzl;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ViewStub.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewStub)) {
            return false;
        }
        ViewStub viewStub = (ViewStub) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) viewStub.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) viewStub.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, viewStub.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, viewStub.copydefault);
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PollyEndpointParameters(");
        sb.append("endpoint=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("region=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("useDualStack=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("useFips=" + this.copydefault + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ViewStub */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewStub copy$default(ViewStub viewStub, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.polly.endpoints.PollyEndpointParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ViewStub.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewStub.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        return viewStub.KWHzl(function1);
    }

    public final ViewStub KWHzl(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription();
        taskDescription.AEQbTJ(this.EZpvd);
        taskDescription.EZpvd(this.OLrzqt);
        taskDescription.EZpvd(this.AEQbTJ);
        taskDescription.copydefault(this.copydefault);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public java.lang.Boolean AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.AEQbTJ = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Boolean bool) {
            this.copydefault = bool;
        }

        public TaskDescription() {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.AEQbTJ = bool;
            this.copydefault = bool;
        }

        public final ViewStub AEQbTJ() {
            return new ViewStub(this, null);
        }
    }
}
