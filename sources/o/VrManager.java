package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RestoreDescription;
import o.VrManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class VrManager {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final RestoreDescription AYXKKw;
    public final java.util.List<ChooseAccountActivity> AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final AccountManagerResponse copydefault;
    public final java.util.List<ChooseAccountActivity> djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.VrManager$Application) A[MD:(o.VrManager$Application):void (m)] call: o.VrManager.<init>(o.VrManager$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ VrManager(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreDescription gEmmrt() {
        return this.AYXKKw;
    }

    public VrManager(Application application) {
        this.copydefault = application.KWHzl();
        this.EZpvd = application.AEQbTJ();
        this.OLrzqt = application.OLrzqt();
        this.KWHzl = application.copydefault();
        this.valueOf = application.AhwBna();
        this.djBIcL = application.gEmmrt();
        this.AYXKKw = application.AYXKKw();
        this.gEmmrt = application.djBIcL();
        this.AhwBna = application.valueOf();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.VrManager.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SignUpRequest(");
        sb.append("analyticsMetadata=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("password=*** Sensitive Data Redacted ***,");
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userAttributes=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***,");
        sb.append("validationData=" + this.AhwBna);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.copydefault;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.util.List<ChooseAccountActivity> list = this.djBIcL;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        RestoreDescription restoreDescription = this.AYXKKw;
        int iHashCode7 = restoreDescription != null ? restoreDescription.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        java.util.List<ChooseAccountActivity> list2 = this.AhwBna;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VrManager.class != obj.getClass()) {
            return false;
        }
        VrManager vrManager = (VrManager) obj;
        return Intrinsics.EZpvd(this.copydefault, vrManager.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) vrManager.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, vrManager.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) vrManager.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) vrManager.valueOf) && Intrinsics.EZpvd(this.djBIcL, vrManager.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, vrManager.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) vrManager.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, vrManager.AhwBna);
    }

    public static /* synthetic */ VrManager copy$default(VrManager vrManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SignUpRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VrManager.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VrManager.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(vrManager);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public AccountManagerResponse AEQbTJ;
        public java.util.List<ChooseAccountActivity> AYXKKw;
        public RestoreDescription AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public java.util.List<ChooseAccountActivity> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<ChooseAccountActivity> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AccountManagerResponse accountManagerResponse) {
            this.AEQbTJ = accountManagerResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreDescription AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<ChooseAccountActivity> list) {
            this.valueOf = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
            this.OLrzqt = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> valueOf() {
            return this.valueOf;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull VrManager vrManager) {
            this();
            Intrinsics.checkNotNullParameter(vrManager, "");
            this.AEQbTJ = vrManager.OLrzqt();
            this.copydefault = vrManager.EZpvd();
            this.OLrzqt = vrManager.KWHzl();
            this.KWHzl = vrManager.AEQbTJ();
            this.EZpvd = vrManager.copydefault();
            this.AYXKKw = vrManager.AYXKKw();
            this.AhwBna = vrManager.gEmmrt();
            this.djBIcL = vrManager.djBIcL();
            this.valueOf = vrManager.AhwBna();
        }

        public final VrManager EZpvd() {
            return new VrManager(this, null);
        }

        public final void EZpvd(@NotNull Function1<? super RestoreDescription.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AhwBna = RestoreDescription.copydefault.OLrzqt(function1);
        }
    }
}
