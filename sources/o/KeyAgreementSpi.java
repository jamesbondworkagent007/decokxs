package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.KeyAgreementSpi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class KeyAgreementSpi {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.KeyAgreementSpi$StateListAnimator) A[MD:(o.KeyAgreementSpi$StateListAnimator):void (m)] call: o.KeyAgreementSpi.<init>(o.KeyAgreementSpi$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ KeyAgreementSpi(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public KeyAgreementSpi(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.EZpvd();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.KeyAgreementSpi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminDisableUserRequest(");
        sb.append("userPoolId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || KeyAgreementSpi.class != obj.getClass()) {
            return false;
        }
        KeyAgreementSpi keyAgreementSpi = (KeyAgreementSpi) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) keyAgreementSpi.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) keyAgreementSpi.copydefault);
    }

    public static /* synthetic */ KeyAgreementSpi copy$default(KeyAgreementSpi keyAgreementSpi, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminDisableUserRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull KeyAgreementSpi.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(KeyAgreementSpi.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(keyAgreementSpi);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull KeyAgreementSpi keyAgreementSpi) {
            this();
            Intrinsics.checkNotNullParameter(keyAgreementSpi, "");
            this.EZpvd = keyAgreementSpi.OLrzqt();
            this.KWHzl = keyAgreementSpi.KWHzl();
        }

        public final KeyAgreementSpi AEQbTJ() {
            return new KeyAgreementSpi(this, null);
        }
    }
}
