package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RC2ParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class RC2ParameterSpec {
    public static final Activity OLrzqt = new Activity(null);
    public final GrantCredentialsPermissionActivity AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public final java.lang.String EZpvd;
    public final AccountManagerResponse KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;
    public final IntEvaluator djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RC2ParameterSpec$ActionBar) A[MD:(o.RC2ParameterSpec$ActionBar):void (m)] call: o.RC2ParameterSpec.<init>(o.RC2ParameterSpec$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RC2ParameterSpec(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntEvaluator AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GrantCredentialsPermissionActivity OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    public RC2ParameterSpec(ActionBar actionBar) {
        this.KWHzl = actionBar.copydefault();
        this.AEQbTJ = actionBar.OLrzqt();
        this.copydefault = actionBar.KWHzl();
        this.EZpvd = actionBar.AEQbTJ();
        this.AYXKKw = actionBar.djBIcL();
        this.djBIcL = actionBar.AYXKKw();
        this.gEmmrt = actionBar.gEmmrt();
        this.valueOf = actionBar.AhwBna();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RC2ParameterSpec.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminRespondToAuthChallengeRequest(");
        sb.append("analyticsMetadata=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("challengeName=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("challengeResponses=*** Sensitive Data Redacted ***,");
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("contextData=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("userPoolId=" + this.valueOf);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.KWHzl;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivity = this.AEQbTJ;
        int iHashCode2 = grantCredentialsPermissionActivity != null ? grantCredentialsPermissionActivity.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AYXKKw;
        int iHashCode5 = map2 != null ? map2.hashCode() : 0;
        IntEvaluator intEvaluator = this.djBIcL;
        int iHashCode6 = intEvaluator != null ? intEvaluator.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RC2ParameterSpec.class != obj.getClass()) {
            return false;
        }
        RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) obj;
        return Intrinsics.EZpvd(this.KWHzl, rC2ParameterSpec.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, rC2ParameterSpec.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, rC2ParameterSpec.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) rC2ParameterSpec.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, rC2ParameterSpec.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, rC2ParameterSpec.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) rC2ParameterSpec.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) rC2ParameterSpec.valueOf);
    }

    public static /* synthetic */ RC2ParameterSpec copy$default(RC2ParameterSpec rC2ParameterSpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminRespondToAuthChallengeRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RC2ParameterSpec.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RC2ParameterSpec.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(rC2ParameterSpec);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public IntEvaluator AYXKKw;
        public AccountManagerResponse EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public GrantCredentialsPermissionActivity copydefault;
        public java.lang.String djBIcL;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IntEvaluator AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GrantCredentialsPermissionActivity OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull RC2ParameterSpec rC2ParameterSpec) {
            this();
            Intrinsics.checkNotNullParameter(rC2ParameterSpec, "");
            this.EZpvd = rC2ParameterSpec.copydefault();
            this.copydefault = rC2ParameterSpec.OLrzqt();
            this.KWHzl = rC2ParameterSpec.EZpvd();
            this.AEQbTJ = rC2ParameterSpec.AEQbTJ();
            this.OLrzqt = rC2ParameterSpec.KWHzl();
            this.AYXKKw = rC2ParameterSpec.AhwBna();
            this.valueOf = rC2ParameterSpec.gEmmrt();
            this.djBIcL = rC2ParameterSpec.djBIcL();
        }

        public final RC2ParameterSpec EZpvd() {
            return new RC2ParameterSpec(this, null);
        }
    }
}
