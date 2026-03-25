package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Cipher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Cipher {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.Boolean KWHzl;
    public final LoadedApk OLrzqt;
    public final java.util.List<ElapsedRealtimeLong> copydefault;
    public final java.util.List<ChooseAccountActivity> djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<ChooseAccountActivity> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Cipher$Application) A[MD:(o.Cipher$Application):void (m)] call: o.Cipher.<init>(o.Cipher$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Cipher(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ElapsedRealtimeLong> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LoadedApk EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public Cipher(Application application) {
        this.AEQbTJ = application.copydefault();
        this.copydefault = application.EZpvd();
        this.KWHzl = application.OLrzqt();
        this.OLrzqt = application.KWHzl();
        this.AYXKKw = application.djBIcL();
        this.valueOf = application.AhwBna();
        this.AhwBna = application.valueOf();
        this.gEmmrt = application.gEmmrt();
        this.djBIcL = application.AYXKKw();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Cipher.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminCreateUserRequest(");
        sb.append("clientMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("desiredDeliveryMediums=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("forceAliasCreation=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("messageAction=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("temporaryPassword=*** Sensitive Data Redacted ***,");
        sb.append("userAttributes=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***,");
        sb.append("validationData=" + this.djBIcL);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.AEQbTJ;
        int iHashCode = map != null ? map.hashCode() : 0;
        java.util.List<ElapsedRealtimeLong> list = this.copydefault;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        LoadedApk loadedApk = this.OLrzqt;
        int iHashCode4 = loadedApk != null ? loadedApk.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        java.util.List<ChooseAccountActivity> list2 = this.valueOf;
        int iHashCode6 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode8 = str3 != null ? str3.hashCode() : 0;
        java.util.List<ChooseAccountActivity> list3 = this.djBIcL;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cipher.class != obj.getClass()) {
            return false;
        }
        Cipher cipher = (Cipher) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, cipher.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, cipher.copydefault) && Intrinsics.EZpvd(this.KWHzl, cipher.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, cipher.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) cipher.AYXKKw) && Intrinsics.EZpvd(this.valueOf, cipher.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) cipher.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) cipher.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, cipher.djBIcL);
    }

    public static /* synthetic */ Cipher copy$default(Cipher cipher, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminCreateUserRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Cipher.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Cipher.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(cipher);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.List<ChooseAccountActivity> AYXKKw;
        public java.lang.String AhwBna;
        public java.util.List<? extends ElapsedRealtimeLong> EZpvd;
        public LoadedApk KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public java.lang.Boolean copydefault;
        public java.util.List<ChooseAccountActivity> djBIcL;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.ElapsedRealtimeLong>, java.util.List<o.ElapsedRealtimeLong> */
        public final java.util.List<ElapsedRealtimeLong> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoadedApk KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull Cipher cipher) {
            this();
            Intrinsics.checkNotNullParameter(cipher, "");
            this.OLrzqt = cipher.KWHzl();
            this.EZpvd = cipher.AEQbTJ();
            this.copydefault = cipher.copydefault();
            this.KWHzl = cipher.EZpvd();
            this.AEQbTJ = cipher.OLrzqt();
            this.AYXKKw = cipher.AhwBna();
            this.gEmmrt = cipher.AYXKKw();
            this.AhwBna = cipher.valueOf();
            this.djBIcL = cipher.gEmmrt();
        }

        public final Cipher AEQbTJ() {
            return new Cipher(this, null);
        }
    }
}
