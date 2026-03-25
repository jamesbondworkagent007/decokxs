package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BadPaddingException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BadPaddingException {
    public static final Activity KWHzl = new Activity(null);
    public final java.util.List<SearchManager> EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BadPaddingException$StateListAnimator) A[MD:(o.BadPaddingException$StateListAnimator):void (m)] call: o.BadPaddingException.<init>(o.BadPaddingException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BadPaddingException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchManager> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    public BadPaddingException(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BadPaddingException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AddCustomAttributesRequest(");
        sb.append("customAttributes=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<SearchManager> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.copydefault;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BadPaddingException.class != obj.getClass()) {
            return false;
        }
        BadPaddingException badPaddingException = (BadPaddingException) obj;
        return Intrinsics.EZpvd(this.EZpvd, badPaddingException.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) badPaddingException.copydefault);
    }

    public static /* synthetic */ BadPaddingException copy$default(BadPaddingException badPaddingException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AddCustomAttributesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BadPaddingException.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BadPaddingException.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(badPaddingException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public java.util.List<SearchManager> KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SearchManager> copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull BadPaddingException badPaddingException) {
            this();
            Intrinsics.checkNotNullParameter(badPaddingException, "");
            this.KWHzl = badPaddingException.KWHzl();
            this.copydefault = badPaddingException.copydefault();
        }

        public final BadPaddingException EZpvd() {
            return new BadPaddingException(this, null);
        }
    }
}
