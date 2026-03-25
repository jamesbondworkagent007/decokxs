package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NullCipher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NullCipher {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NullCipher$StateListAnimator) A[MD:(o.NullCipher$StateListAnimator):void (m)] call: o.NullCipher.<init>(o.NullCipher$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NullCipher(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public NullCipher(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.OLrzqt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NullCipher.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminGetDeviceRequest(");
        sb.append("deviceKey=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NullCipher.class != obj.getClass()) {
            return false;
        }
        NullCipher nullCipher = (NullCipher) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) nullCipher.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) nullCipher.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) nullCipher.copydefault);
    }

    public static /* synthetic */ NullCipher copy$default(NullCipher nullCipher, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminGetDeviceRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NullCipher.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NullCipher.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(nullCipher);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull NullCipher nullCipher) {
            this();
            Intrinsics.checkNotNullParameter(nullCipher, "");
            this.AEQbTJ = nullCipher.AEQbTJ();
            this.EZpvd = nullCipher.KWHzl();
            this.OLrzqt = nullCipher.OLrzqt();
        }

        public final NullCipher EZpvd() {
            return new NullCipher(this, null);
        }
    }
}
