package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.StackTraceElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class StackTraceElement {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.lang.String AYXKKw;
    public final java.util.Map<java.lang.String, java.lang.String> AhwBna;
    public final java.util.Map<java.lang.String, java.lang.String> AkhnZx;
    public final boolean EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<ClassFormatError> OLrzqt;
    public final java.lang.Boolean copydefault;
    public final java.util.List<java.lang.String> djBIcL;
    public final java.util.List<java.lang.String> gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.StackTraceElement$StateListAnimator) A[MD:(o.StackTraceElement$StateListAnimator):void (m)] call: o.StackTraceElement.<init>(o.StackTraceElement$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ StackTraceElement(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ClassFormatError> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return this.AhwBna;
    }

    public StackTraceElement(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.EZpvd();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.AhwBna();
        java.lang.String strGEmmrt = stateListAnimator.gEmmrt();
        if (strGEmmrt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolId".toString());
        }
        this.AYXKKw = strGEmmrt;
        java.lang.String strDjBIcL = stateListAnimator.djBIcL();
        if (strDjBIcL == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolName".toString());
        }
        this.valueOf = strDjBIcL;
        this.AhwBna = stateListAnimator.valueOf();
        this.gEmmrt = stateListAnimator.AYXKKw();
        this.djBIcL = stateListAnimator.isConnected();
        this.AkhnZx = stateListAnimator.AkhnZx();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.StackTraceElement.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateIdentityPoolResponse(");
        sb.append("allowClassicFlow=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("allowUnauthenticatedIdentities=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("cognitoIdentityProviders=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("developerProviderName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolName=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolTags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("openIdConnectProviderArns=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("samlProviderArns=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("supportedLoginProviders=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.copydefault;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        int iHashCode2 = java.lang.Boolean.hashCode(this.EZpvd);
        java.util.List<ClassFormatError> list = this.OLrzqt;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        int iHashCode5 = this.AYXKKw.hashCode();
        int iHashCode6 = this.valueOf.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.AhwBna;
        int iHashCode7 = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.gEmmrt;
        int iHashCode8 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.djBIcL;
        int iHashCode9 = list3 != null ? list3.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AkhnZx;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StackTraceElement.class != obj.getClass()) {
            return false;
        }
        StackTraceElement stackTraceElement = (StackTraceElement) obj;
        return Intrinsics.EZpvd(this.copydefault, stackTraceElement.copydefault) && this.EZpvd == stackTraceElement.EZpvd && Intrinsics.EZpvd(this.OLrzqt, stackTraceElement.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stackTraceElement.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) stackTraceElement.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) stackTraceElement.valueOf) && Intrinsics.EZpvd(this.AhwBna, stackTraceElement.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, stackTraceElement.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, stackTraceElement.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, stackTraceElement.AkhnZx);
    }

    public static /* synthetic */ StackTraceElement copy$default(StackTraceElement stackTraceElement, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.UpdateIdentityPoolResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StackTraceElement.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StackTraceElement.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(stackTraceElement);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public boolean AEQbTJ;
        public java.util.List<java.lang.String> AYXKKw;
        public java.util.Map<java.lang.String, java.lang.String> AhwBna;
        public java.lang.Boolean EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<ClassFormatError> copydefault;
        public java.util.Map<java.lang.String, java.lang.String> djBIcL;
        public java.util.List<java.lang.String> gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<java.lang.String> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
            this.djBIcL = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AkhnZx() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ClassFormatError> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ClassFormatError> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.Map<java.lang.String, java.lang.String> map) {
            this.AhwBna = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.gEmmrt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault() {
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            if (this.valueOf == null) {
                this.valueOf = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Boolean bool) {
            this.EZpvd = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> isConnected() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
            return this.djBIcL;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull StackTraceElement stackTraceElement) {
            this();
            Intrinsics.checkNotNullParameter(stackTraceElement, "");
            this.EZpvd = stackTraceElement.KWHzl();
            this.AEQbTJ = stackTraceElement.EZpvd();
            this.copydefault = stackTraceElement.copydefault();
            this.OLrzqt = stackTraceElement.AEQbTJ();
            this.KWHzl = stackTraceElement.OLrzqt();
            this.valueOf = stackTraceElement.gEmmrt();
            this.djBIcL = stackTraceElement.valueOf();
            this.AYXKKw = stackTraceElement.AhwBna();
            this.gEmmrt = stackTraceElement.AYXKKw();
            this.AhwBna = stackTraceElement.djBIcL();
        }

        public final StackTraceElement AEQbTJ() {
            return new StackTraceElement(this, null);
        }
    }
}
