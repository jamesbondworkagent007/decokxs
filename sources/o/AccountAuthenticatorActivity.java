package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AccountAuthenticatorActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AccountAuthenticatorActivity {
    public static final Activity OLrzqt = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final java.util.List<ChooseAccountActivity> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AccountAuthenticatorActivity$StateListAnimator) A[MD:(o.AccountAuthenticatorActivity$StateListAnimator):void (m)] call: o.AccountAuthenticatorActivity.<init>(o.AccountAuthenticatorActivity$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccountAuthenticatorActivity(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.KWHzl;
    }

    public AccountAuthenticatorActivity(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccountAuthenticatorActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminUpdateUserAttributesRequest(");
        sb.append("clientMetadata=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("userAttributes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.KWHzl;
        int iHashCode = map != null ? map.hashCode() : 0;
        java.util.List<ChooseAccountActivity> list = this.copydefault;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AccountAuthenticatorActivity.class != obj.getClass()) {
            return false;
        }
        AccountAuthenticatorActivity accountAuthenticatorActivity = (AccountAuthenticatorActivity) obj;
        return Intrinsics.EZpvd(this.KWHzl, accountAuthenticatorActivity.KWHzl) && Intrinsics.EZpvd(this.copydefault, accountAuthenticatorActivity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) accountAuthenticatorActivity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) accountAuthenticatorActivity.EZpvd);
    }

    public static /* synthetic */ AccountAuthenticatorActivity copy$default(AccountAuthenticatorActivity accountAuthenticatorActivity, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminUpdateUserAttributesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AccountAuthenticatorActivity.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AccountAuthenticatorActivity.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(accountAuthenticatorActivity);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public java.util.List<ChooseAccountActivity> OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AccountAuthenticatorActivity accountAuthenticatorActivity) {
            this();
            Intrinsics.checkNotNullParameter(accountAuthenticatorActivity, "");
            this.EZpvd = accountAuthenticatorActivity.copydefault();
            this.OLrzqt = accountAuthenticatorActivity.EZpvd();
            this.AEQbTJ = accountAuthenticatorActivity.OLrzqt();
            this.copydefault = accountAuthenticatorActivity.AEQbTJ();
        }

        public final AccountAuthenticatorActivity OLrzqt() {
            return new AccountAuthenticatorActivity(this, null);
        }
    }
}
