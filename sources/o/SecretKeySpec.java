package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SecretKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SecretKeySpec {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final WaitResult EZpvd;
    public final java.lang.String KWHzl;
    public final WindowConfiguration copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SecretKeySpec$Application) A[MD:(o.SecretKeySpec$Application):void (m)] call: o.SecretKeySpec.<init>(o.SecretKeySpec$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SecretKeySpec(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WindowConfiguration AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WaitResult copydefault() {
        return this.EZpvd;
    }

    public SecretKeySpec(Application application) {
        this.EZpvd = application.AEQbTJ();
        this.copydefault = application.copydefault();
        this.KWHzl = application.OLrzqt();
        this.AEQbTJ = application.EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SecretKeySpec.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminSetUserMfaPreferenceRequest(");
        sb.append("smsMfaSettings=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("softwareTokenMfaSettings=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WaitResult waitResult = this.EZpvd;
        int iHashCode = waitResult != null ? waitResult.hashCode() : 0;
        WindowConfiguration windowConfiguration = this.copydefault;
        int iHashCode2 = windowConfiguration != null ? windowConfiguration.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SecretKeySpec.class != obj.getClass()) {
            return false;
        }
        SecretKeySpec secretKeySpec = (SecretKeySpec) obj;
        return Intrinsics.EZpvd(this.EZpvd, secretKeySpec.EZpvd) && Intrinsics.EZpvd(this.copydefault, secretKeySpec.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) secretKeySpec.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) secretKeySpec.AEQbTJ);
    }

    public static /* synthetic */ SecretKeySpec copy$default(SecretKeySpec secretKeySpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminSetUserMfaPreferenceRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SecretKeySpec.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SecretKeySpec.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(secretKeySpec);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public WindowConfiguration AEQbTJ;
        public java.lang.String KWHzl;
        public WaitResult OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WaitResult AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WindowConfiguration copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull SecretKeySpec secretKeySpec) {
            this();
            Intrinsics.checkNotNullParameter(secretKeySpec, "");
            this.OLrzqt = secretKeySpec.copydefault();
            this.AEQbTJ = secretKeySpec.AEQbTJ();
            this.KWHzl = secretKeySpec.EZpvd();
            this.copydefault = secretKeySpec.KWHzl();
        }

        public final SecretKeySpec KWHzl() {
            return new SecretKeySpec(this, null);
        }
    }
}
