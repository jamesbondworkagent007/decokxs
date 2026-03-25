package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34304nZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34304nZ {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String OLrzqt;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nZ$Application) A[MD:(o.nZ$Application):void (m)] call: o.nZ.<init>(o.nZ$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34304nZ(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.copydefault;
    }

    public C34304nZ(Application application) {
        this.OLrzqt = application.EZpvd();
        this.copydefault = application.KWHzl();
        this.AEQbTJ = application.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.nZ$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZ.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HumanLoopActivationOutput(");
        sb.append("humanLoopActivationConditionsEvaluationResults=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("humanLoopActivationReasons=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("humanLoopArn=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<java.lang.String> list = this.copydefault;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34304nZ.class != obj.getClass()) {
            return false;
        }
        C34304nZ c34304nZ = (C34304nZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34304nZ.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c34304nZ.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c34304nZ.AEQbTJ);
    }

    public static /* synthetic */ C34304nZ copy$default(C34304nZ c34304nZ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.HumanLoopActivationOutput$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34304nZ.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34304nZ.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c34304nZ);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.nZ$Application */
    public static final class Application {
        public java.lang.String EZpvd;
        public java.util.List<java.lang.String> OLrzqt;
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
        public final java.util.List<java.lang.String> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        public final Application copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<java.lang.String> list) {
            this.OLrzqt = list;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34304nZ c34304nZ) {
            this();
            Intrinsics.checkNotNullParameter(c34304nZ, "");
            this.EZpvd = c34304nZ.EZpvd();
            this.OLrzqt = c34304nZ.OLrzqt();
            this.copydefault = c34304nZ.AEQbTJ();
        }

        public final C34304nZ OLrzqt() {
            return new C34304nZ(this, null);
        }
    }
}
