package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Exception;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Exception {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final boolean AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.Map<java.lang.String, java.lang.String> AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.util.List<ClassFormatError> copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<java.lang.String> gEmmrt;
    public final java.util.Map<java.lang.String, java.lang.String> isConnected;
    public final java.util.List<java.lang.String> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Exception$Application) A[MD:(o.Exception$Application):void (m)] call: o.Exception.<init>(o.Exception$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Exception(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ClassFormatError> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
        return this.AhwBna;
    }

    public Exception(Application application) {
        this.KWHzl = application.OLrzqt();
        this.AEQbTJ = application.EZpvd();
        this.copydefault = application.copydefault();
        this.EZpvd = application.djBIcL();
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolId".toString());
        }
        this.djBIcL = strAYXKKw;
        java.lang.String strValueOf = application.valueOf();
        if (strValueOf == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for identityPoolName".toString());
        }
        this.AYXKKw = strValueOf;
        this.AhwBna = application.gEmmrt();
        this.valueOf = application.AhwBna();
        this.gEmmrt = application.DbNXlk();
        this.isConnected = application.isConnected();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Exception.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeIdentityPoolResponse(");
        sb.append("allowClassicFlow=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("allowUnauthenticatedIdentities=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("cognitoIdentityProviders=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("developerProviderName=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolTags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("openIdConnectProviderArns=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("samlProviderArns=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
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
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        int iHashCode2 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.util.List<ClassFormatError> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        int iHashCode5 = this.djBIcL.hashCode();
        int iHashCode6 = this.AYXKKw.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.AhwBna;
        int iHashCode7 = map != null ? map.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.valueOf;
        int iHashCode8 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.gEmmrt;
        int iHashCode9 = list3 != null ? list3.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.isConnected;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Exception.class != obj.getClass()) {
            return false;
        }
        Exception exception = (Exception) obj;
        return Intrinsics.EZpvd(this.KWHzl, exception.KWHzl) && this.AEQbTJ == exception.AEQbTJ && Intrinsics.EZpvd(this.copydefault, exception.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) exception.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) exception.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) exception.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, exception.AhwBna) && Intrinsics.EZpvd(this.valueOf, exception.valueOf) && Intrinsics.EZpvd(this.gEmmrt, exception.gEmmrt) && Intrinsics.EZpvd(this.isConnected, exception.isConnected);
    }

    public static /* synthetic */ Exception copy$default(Exception exception, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.DescribeIdentityPoolResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Exception.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Exception.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(exception);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> AYXKKw;
        public java.util.List<java.lang.String> AhwBna;
        public java.lang.String EZpvd;
        public java.lang.Boolean KWHzl;
        public boolean OLrzqt;
        public java.util.List<ClassFormatError> copydefault;
        public java.util.Map<java.lang.String, java.lang.String> djBIcL;
        public java.lang.String gEmmrt;
        public java.util.Map<java.lang.String, java.lang.String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = "";
            }
            if (this.gEmmrt == null) {
                this.gEmmrt = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
            this.valueOf = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ClassFormatError> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Boolean bool) {
            this.KWHzl = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.Map<java.lang.String, java.lang.String> map) {
            this.djBIcL = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.AhwBna = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ClassFormatError> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull Exception exception) {
            this();
            Intrinsics.checkNotNullParameter(exception, "");
            this.KWHzl = exception.OLrzqt();
            this.OLrzqt = exception.EZpvd();
            this.copydefault = exception.copydefault();
            this.EZpvd = exception.KWHzl();
            this.AEQbTJ = exception.AEQbTJ();
            this.gEmmrt = exception.gEmmrt();
            this.valueOf = exception.valueOf();
            this.AYXKKw = exception.AYXKKw();
            this.AhwBna = exception.AhwBna();
            this.djBIcL = exception.djBIcL();
        }

        public final Exception KWHzl() {
            return new Exception(this, null);
        }
    }
}
