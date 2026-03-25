package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.EncryptedPrivateKeyInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class EncryptedPrivateKeyInfo {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.EncryptedPrivateKeyInfo$Application) A[MD:(o.EncryptedPrivateKeyInfo$Application):void (m)] call: o.EncryptedPrivateKeyInfo.<init>(o.EncryptedPrivateKeyInfo$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EncryptedPrivateKeyInfo(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    public EncryptedPrivateKeyInfo(Application application) {
        this.AEQbTJ = application.OLrzqt();
        this.EZpvd = application.KWHzl();
        this.KWHzl = application.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.EncryptedPrivateKeyInfo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminConfirmSignUpRequest(");
        sb.append("clientMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.AEQbTJ;
        int iHashCode = map != null ? map.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EncryptedPrivateKeyInfo.class != obj.getClass()) {
            return false;
        }
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = (EncryptedPrivateKeyInfo) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, encryptedPrivateKeyInfo.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) encryptedPrivateKeyInfo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) encryptedPrivateKeyInfo.KWHzl);
    }

    public static /* synthetic */ EncryptedPrivateKeyInfo copy$default(EncryptedPrivateKeyInfo encryptedPrivateKeyInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminConfirmSignUpRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull EncryptedPrivateKeyInfo.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EncryptedPrivateKeyInfo.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(encryptedPrivateKeyInfo);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) {
            this();
            Intrinsics.checkNotNullParameter(encryptedPrivateKeyInfo, "");
            this.AEQbTJ = encryptedPrivateKeyInfo.AEQbTJ();
            this.OLrzqt = encryptedPrivateKeyInfo.OLrzqt();
            this.EZpvd = encryptedPrivateKeyInfo.EZpvd();
        }

        public final EncryptedPrivateKeyInfo EZpvd() {
            return new EncryptedPrivateKeyInfo(this, null);
        }
    }
}
