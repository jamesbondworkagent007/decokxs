package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AuthenticationRequiredException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AuthenticationRequiredException {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final ClientTransactionHandler AhwBna;
    public final C5173Hn KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final java.lang.String djBIcL;
    public final java.util.Map<java.lang.String, java.lang.String> gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AuthenticationRequiredException$Activity) A[MD:(o.AuthenticationRequiredException$Activity):void (m)] call: o.AuthenticationRequiredException.<init>(o.AuthenticationRequiredException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AuthenticationRequiredException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientTransactionHandler AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    public AuthenticationRequiredException(Activity activity) {
        this.OLrzqt = activity.EZpvd();
        this.KWHzl = activity.copydefault();
        this.copydefault = activity.KWHzl();
        this.AEQbTJ = activity.AhwBna();
        this.gEmmrt = activity.AYXKKw();
        this.AYXKKw = activity.gEmmrt();
        this.AhwBna = activity.valueOf();
        this.djBIcL = activity.djBIcL();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AuthenticationRequiredException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IdentityProviderType(");
        sb.append("attributeMapping=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("creationDate=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("idpIdentifiers=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedDate=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("providerDetails=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("providerName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("providerType=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode = map != null ? map.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.util.List<java.lang.String> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AEQbTJ;
        int iHashCode4 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.gEmmrt;
        int iHashCode5 = map2 != null ? map2.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        ClientTransactionHandler clientTransactionHandler = this.AhwBna;
        int iHashCode7 = clientTransactionHandler != null ? clientTransactionHandler.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthenticationRequiredException.class != obj.getClass()) {
            return false;
        }
        AuthenticationRequiredException authenticationRequiredException = (AuthenticationRequiredException) obj;
        return Intrinsics.EZpvd(this.OLrzqt, authenticationRequiredException.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, authenticationRequiredException.KWHzl) && Intrinsics.EZpvd(this.copydefault, authenticationRequiredException.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, authenticationRequiredException.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, authenticationRequiredException.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) authenticationRequiredException.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, authenticationRequiredException.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) authenticationRequiredException.djBIcL);
    }

    public static /* synthetic */ AuthenticationRequiredException copy$default(AuthenticationRequiredException authenticationRequiredException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.IdentityProviderType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AuthenticationRequiredException.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AuthenticationRequiredException.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(authenticationRequiredException);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.util.List<java.lang.String> AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public C5173Hn KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public C5173Hn copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public ClientTransactionHandler valueOf;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
            this.OLrzqt = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ClientTransactionHandler clientTransactionHandler) {
            this.valueOf = clientTransactionHandler;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
            this.EZpvd = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<java.lang.String> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClientTransactionHandler valueOf() {
            return this.valueOf;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AuthenticationRequiredException authenticationRequiredException) {
            this();
            Intrinsics.checkNotNullParameter(authenticationRequiredException, "");
            this.EZpvd = authenticationRequiredException.OLrzqt();
            this.copydefault = authenticationRequiredException.KWHzl();
            this.AEQbTJ = authenticationRequiredException.AEQbTJ();
            this.KWHzl = authenticationRequiredException.copydefault();
            this.OLrzqt = authenticationRequiredException.EZpvd();
            this.djBIcL = authenticationRequiredException.AhwBna();
            this.valueOf = authenticationRequiredException.AYXKKw();
            this.gEmmrt = authenticationRequiredException.djBIcL();
        }

        public final AuthenticationRequiredException OLrzqt() {
            return new AuthenticationRequiredException(this, null);
        }
    }
}
