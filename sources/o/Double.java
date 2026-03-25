package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Double;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Double {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public final java.util.List<java.lang.String> AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.util.List<ClassFormatError> copydefault;
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<java.lang.String> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Double$Activity) A[MD:(o.Double$Activity):void (m)] call: o.Double.<init>(o.Double$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Double(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ClassFormatError> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
        return this.AYXKKw;
    }

    public Double(Activity activity) {
        this.AEQbTJ = activity.KWHzl();
        this.KWHzl = activity.AEQbTJ();
        this.copydefault = activity.OLrzqt();
        this.EZpvd = activity.copydefault();
        this.gEmmrt = activity.gEmmrt();
        this.djBIcL = activity.AhwBna();
        this.valueOf = activity.djBIcL();
        this.AhwBna = activity.AYXKKw();
        this.AYXKKw = activity.valueOf();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Double.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIdentityPoolRequest(");
        sb.append("allowClassicFlow=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("allowUnauthenticatedIdentities=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("cognitoIdentityProviders=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("developerProviderName=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolName=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolTags=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("openIdConnectProviderArns=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("samlProviderArns=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("supportedLoginProviders=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.KWHzl;
        int iHashCode2 = bool2 != null ? bool2.hashCode() : 0;
        java.util.List<ClassFormatError> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.djBIcL;
        int iHashCode6 = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.valueOf;
        int iHashCode7 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.AhwBna;
        int iHashCode8 = list3 != null ? list3.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AYXKKw;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Double.class != obj.getClass()) {
            return false;
        }
        Double r5 = (Double) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, r5.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, r5.KWHzl) && Intrinsics.EZpvd(this.copydefault, r5.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) r5.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) r5.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, r5.djBIcL) && Intrinsics.EZpvd(this.valueOf, r5.valueOf) && Intrinsics.EZpvd(this.AhwBna, r5.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, r5.AYXKKw);
    }

    public static /* synthetic */ Double copy$default(Double r0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.CreateIdentityPoolRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Double.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Double.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(r0);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> AYXKKw;
        public java.util.List<ClassFormatError> EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Boolean OLrzqt;
        public java.lang.Boolean copydefault;
        public java.util.Map<java.lang.String, java.lang.String> djBIcL;
        public java.util.Map<java.lang.String, java.lang.String> gEmmrt;
        public java.util.List<java.lang.String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ClassFormatError> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
            return this.gEmmrt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Double r2) {
            this();
            Intrinsics.checkNotNullParameter(r2, "");
            this.OLrzqt = r2.AEQbTJ();
            this.copydefault = r2.OLrzqt();
            this.EZpvd = r2.KWHzl();
            this.AEQbTJ = r2.EZpvd();
            this.KWHzl = r2.copydefault();
            this.djBIcL = r2.AYXKKw();
            this.valueOf = r2.AhwBna();
            this.AYXKKw = r2.djBIcL();
            this.gEmmrt = r2.gEmmrt();
        }

        public final Double EZpvd() {
            return new Double(this, null);
        }
    }
}
