package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebResourceError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class WebResourceError {
    public static final Application copydefault = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.Boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Boolean OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebResourceError$StateListAnimator) A[MD:(o.WebResourceError$StateListAnimator):void (m)] call: o.WebResourceError.<init>(o.WebResourceError$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebResourceError(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public WebResourceError(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.KWHzl = stateListAnimator.KWHzl();
        java.lang.Boolean boolCopydefault = stateListAnimator.copydefault();
        if (boolCopydefault == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.EZpvd = boolCopydefault;
        java.lang.Boolean boolEZpvd = stateListAnimator.EZpvd();
        if (boolEZpvd == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.OLrzqt = boolEZpvd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebResourceError.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebResourceError)) {
            return false;
        }
        WebResourceError webResourceError = (WebResourceError) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) webResourceError.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) webResourceError.KWHzl) && Intrinsics.EZpvd(this.EZpvd, webResourceError.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, webResourceError.OLrzqt);
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.EZpvd;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RekognitionEndpointParameters(");
        sb.append("endpoint=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("region=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("useDualStack=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("useFips=" + this.OLrzqt + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.WebResourceError */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebResourceError copy$default(WebResourceError webResourceError, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.endpoints.RekognitionEndpointParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebResourceError.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebResourceError.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        return webResourceError.OLrzqt(function1);
    }

    public final WebResourceError OLrzqt(@NotNull Function1<? super StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.AEQbTJ(this.AEQbTJ);
        stateListAnimator.copydefault(this.KWHzl);
        stateListAnimator.EZpvd(this.EZpvd);
        stateListAnimator.KWHzl(this.OLrzqt);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public java.lang.String EZpvd;
        public java.lang.Boolean KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.Boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.copydefault = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Boolean bool) {
            this.KWHzl = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        public StateListAnimator() {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.copydefault = bool;
            this.KWHzl = bool;
        }

        public final WebResourceError AEQbTJ() {
            return new WebResourceError(this, null);
        }
    }
}
