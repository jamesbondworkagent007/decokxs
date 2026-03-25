package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NegativeArraySizeException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NegativeArraySizeException {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NegativeArraySizeException$ActionBar) A[MD:(o.NegativeArraySizeException$ActionBar):void (m)] call: o.NegativeArraySizeException.<init>(o.NegativeArraySizeException$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NegativeArraySizeException(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.AEQbTJ;
    }

    public NegativeArraySizeException(ActionBar actionBar) {
        this.OLrzqt = actionBar.KWHzl();
        this.copydefault = actionBar.copydefault();
        this.AEQbTJ = actionBar.AEQbTJ();
        this.EZpvd = actionBar.EZpvd();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NegativeArraySizeException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListIdentitiesRequest(");
        sb.append("hideDisabled=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.OLrzqt;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NegativeArraySizeException.class != obj.getClass()) {
            return false;
        }
        NegativeArraySizeException negativeArraySizeException = (NegativeArraySizeException) obj;
        return Intrinsics.EZpvd(this.OLrzqt, negativeArraySizeException.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) negativeArraySizeException.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, negativeArraySizeException.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) negativeArraySizeException.EZpvd);
    }

    public static /* synthetic */ NegativeArraySizeException copy$default(NegativeArraySizeException negativeArraySizeException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.ListIdentitiesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NegativeArraySizeException.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NegativeArraySizeException.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(negativeArraySizeException);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.Boolean KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull NegativeArraySizeException negativeArraySizeException) {
            this();
            Intrinsics.checkNotNullParameter(negativeArraySizeException, "");
            this.KWHzl = negativeArraySizeException.EZpvd();
            this.AEQbTJ = negativeArraySizeException.AEQbTJ();
            this.copydefault = negativeArraySizeException.copydefault();
            this.OLrzqt = negativeArraySizeException.OLrzqt();
        }

        public final NegativeArraySizeException OLrzqt() {
            return new NegativeArraySizeException(this, null);
        }
    }
}
