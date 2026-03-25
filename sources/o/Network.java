package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Network;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Network {
    public static final Application copydefault = new Application(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Network$TaskDescription) A[MD:(o.Network$TaskDescription):void (m)] call: o.Network.<init>(o.Network$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Network(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public Network(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.copydefault();
        this.OLrzqt = taskDescription.EZpvd();
        java.lang.Boolean boolKWHzl = taskDescription.KWHzl();
        if (boolKWHzl == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.KWHzl = boolKWHzl;
        java.lang.Boolean boolOLrzqt = taskDescription.OLrzqt();
        if (boolOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.AEQbTJ = boolOLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Network.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Network)) {
            return false;
        }
        Network network = (Network) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) network.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) network.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, network.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, network.AEQbTJ);
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComprehendEndpointParameters(");
        sb.append("endpoint=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("region=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("useDualStack=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("useFips=" + this.AEQbTJ + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Network */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Network copy$default(Network network, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.endpoints.ComprehendEndpointParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Network.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Network.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        return network.AEQbTJ(function1);
    }

    public final Network AEQbTJ(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription();
        taskDescription.OLrzqt(this.EZpvd);
        taskDescription.KWHzl(this.OLrzqt);
        taskDescription.OLrzqt(this.KWHzl);
        taskDescription.AEQbTJ(this.AEQbTJ);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TaskDescription {
        public java.lang.Boolean EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Boolean OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Boolean bool) {
            this.OLrzqt = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Boolean bool) {
            this.EZpvd = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public TaskDescription() {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.EZpvd = bool;
            this.OLrzqt = bool;
        }

        public final Network AEQbTJ() {
            return new Network(this, null);
        }
    }
}
