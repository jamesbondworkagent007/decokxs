package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SafeVarargs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SafeVarargs {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<java.lang.String> AhwBna;
    public final java.util.List<ClassFormatError> EZpvd;
    public final java.lang.String KWHzl;
    public final boolean copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<java.lang.String> gEmmrt;
    public final java.util.Map<java.lang.String, java.lang.String> isConnected;
    public final java.util.Map<java.lang.String, java.lang.String> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SafeVarargs$Activity) A[MD:(o.SafeVarargs$Activity):void (m)] call: o.SafeVarargs.<init>(o.SafeVarargs$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SafeVarargs(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ClassFormatError> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public SafeVarargs(Activity activity) {
        this.AEQbTJ = activity.OLrzqt();
        this.copydefault = activity.AEQbTJ();
        this.EZpvd = activity.copydefault();
        this.KWHzl = activity.EZpvd();
        java.lang.String strValueOf = activity.valueOf();
        if (strValueOf == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolId".toString());
        }
        this.djBIcL = strValueOf;
        java.lang.String strDjBIcL = activity.djBIcL();
        if (strDjBIcL == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolName".toString());
        }
        this.AYXKKw = strDjBIcL;
        this.valueOf = activity.gEmmrt();
        this.gEmmrt = activity.AYXKKw();
        this.AhwBna = activity.AhwBna();
        this.isConnected = activity.AkhnZx();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SafeVarargs.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateIdentityPoolRequest(");
        sb.append("allowClassicFlow=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("allowUnauthenticatedIdentities=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("cognitoIdentityProviders=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("developerProviderName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolTags=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("openIdConnectProviderArns=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("samlProviderArns=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("supportedLoginProviders=");
        sb2.append(this.isConnected);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        java.util.List<ClassFormatError> list = this.EZpvd;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        int iHashCode5 = this.djBIcL.hashCode();
        int iHashCode6 = this.AYXKKw.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.valueOf;
        int iHashCode7 = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.gEmmrt;
        int iHashCode8 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.AhwBna;
        int iHashCode9 = list3 != null ? list3.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.isConnected;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SafeVarargs.class != obj.getClass()) {
            return false;
        }
        SafeVarargs safeVarargs = (SafeVarargs) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, safeVarargs.AEQbTJ) && this.copydefault == safeVarargs.copydefault && Intrinsics.EZpvd(this.EZpvd, safeVarargs.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) safeVarargs.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) safeVarargs.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) safeVarargs.AYXKKw) && Intrinsics.EZpvd(this.valueOf, safeVarargs.valueOf) && Intrinsics.EZpvd(this.gEmmrt, safeVarargs.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, safeVarargs.AhwBna) && Intrinsics.EZpvd(this.isConnected, safeVarargs.isConnected);
    }

    public static /* synthetic */ SafeVarargs copy$default(SafeVarargs safeVarargs, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.UpdateIdentityPoolRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SafeVarargs.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SafeVarargs.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(safeVarargs);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public java.lang.Boolean AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public java.util.List<ClassFormatError> KWHzl;
        public boolean OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<java.lang.String> djBIcL;
        public java.util.Map<java.lang.String, java.lang.String> gEmmrt;
        public java.util.List<java.lang.String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AkhnZx() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ClassFormatError> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SafeVarargs safeVarargs) {
            this();
            Intrinsics.checkNotNullParameter(safeVarargs, "");
            this.AEQbTJ = safeVarargs.AEQbTJ();
            this.OLrzqt = safeVarargs.copydefault();
            this.KWHzl = safeVarargs.KWHzl();
            this.EZpvd = safeVarargs.OLrzqt();
            this.copydefault = safeVarargs.EZpvd();
            this.AhwBna = safeVarargs.valueOf();
            this.gEmmrt = safeVarargs.AhwBna();
            this.valueOf = safeVarargs.AYXKKw();
            this.djBIcL = safeVarargs.gEmmrt();
            this.AYXKKw = safeVarargs.djBIcL();
        }

        public final SafeVarargs KWHzl() {
            return new SafeVarargs(this, null);
        }
    }
}
