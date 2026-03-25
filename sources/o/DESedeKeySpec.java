package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DESedeKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class DESedeKeySpec {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final OnAccountsUpdateListener AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final GrantCredentialsPermissionActivity copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DESedeKeySpec$Application) A[MD:(o.DESedeKeySpec$Application):void (m)] call: o.DESedeKeySpec.<init>(o.DESedeKeySpec$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DESedeKeySpec(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GrantCredentialsPermissionActivity AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnAccountsUpdateListener copydefault() {
        return this.AEQbTJ;
    }

    public DESedeKeySpec(Application application) {
        this.AEQbTJ = application.OLrzqt();
        this.copydefault = application.copydefault();
        this.KWHzl = application.EZpvd();
        this.EZpvd = application.djBIcL();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DESedeKeySpec.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminInitiateAuthResponse(");
        sb.append("authenticationResult=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("challengeName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("challengeParameters=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("session=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        OnAccountsUpdateListener onAccountsUpdateListener = this.AEQbTJ;
        int iHashCode = onAccountsUpdateListener != null ? onAccountsUpdateListener.hashCode() : 0;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivity = this.copydefault;
        int iHashCode2 = grantCredentialsPermissionActivity != null ? grantCredentialsPermissionActivity.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.KWHzl;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DESedeKeySpec.class != obj.getClass()) {
            return false;
        }
        DESedeKeySpec dESedeKeySpec = (DESedeKeySpec) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dESedeKeySpec.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, dESedeKeySpec.copydefault) && Intrinsics.EZpvd(this.KWHzl, dESedeKeySpec.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dESedeKeySpec.EZpvd);
    }

    public static /* synthetic */ DESedeKeySpec copy$default(DESedeKeySpec dESedeKeySpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminInitiateAuthResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DESedeKeySpec.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DESedeKeySpec.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(dESedeKeySpec);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public java.lang.String KWHzl;
        public OnAccountsUpdateListener OLrzqt;
        public GrantCredentialsPermissionActivity copydefault;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(GrantCredentialsPermissionActivity grantCredentialsPermissionActivity) {
            this.copydefault = grantCredentialsPermissionActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(OnAccountsUpdateListener onAccountsUpdateListener) {
            this.OLrzqt = onAccountsUpdateListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnAccountsUpdateListener OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
            this.EZpvd = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GrantCredentialsPermissionActivity copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DESedeKeySpec dESedeKeySpec) {
            this();
            Intrinsics.checkNotNullParameter(dESedeKeySpec, "");
            this.OLrzqt = dESedeKeySpec.copydefault();
            this.copydefault = dESedeKeySpec.AEQbTJ();
            this.EZpvd = dESedeKeySpec.KWHzl();
            this.KWHzl = dESedeKeySpec.EZpvd();
        }

        public final DESedeKeySpec KWHzl() {
            return new DESedeKeySpec(this, null);
        }
    }
}
