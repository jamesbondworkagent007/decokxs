package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SecretKeyFactorySpi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SecretKeyFactorySpi {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.util.List<ChooseAccountActivity> AEQbTJ;
    public final C5173Hn AYXKKw;
    public final JobParameters AhwBna;
    public final java.util.List<ListFragment> KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<java.lang.String> gEmmrt;
    public final C5173Hn valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SecretKeyFactorySpi$ActionBar) A[MD:(o.SecretKeyFactorySpi$ActionBar):void (m)] call: o.SecretKeyFactorySpi.<init>(o.SecretKeyFactorySpi$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SecretKeyFactorySpi(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JobParameters AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ListFragment> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public SecretKeyFactorySpi(ActionBar actionBar) {
        this.OLrzqt = actionBar.EZpvd();
        this.KWHzl = actionBar.copydefault();
        this.copydefault = actionBar.AEQbTJ();
        this.AEQbTJ = actionBar.gEmmrt();
        this.valueOf = actionBar.AhwBna();
        this.AYXKKw = actionBar.djBIcL();
        this.gEmmrt = actionBar.AYXKKw();
        this.AhwBna = actionBar.valueOf();
        java.lang.String strDbNXlk = actionBar.DbNXlk();
        if (strDbNXlk == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for username".toString());
        }
        this.djBIcL = strDbNXlk;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SecretKeyFactorySpi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminGetUserResponse(");
        sb.append("enabled=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("mfaOptions=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("preferredMfaSetting=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("userAttributes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("userCreateDate=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("userLastModifiedDate=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("userMfaSettingList=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("userStatus=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        java.util.List<ListFragment> list = this.KWHzl;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.util.List<ChooseAccountActivity> list2 = this.AEQbTJ;
        int iHashCode4 = list2 != null ? list2.hashCode() : 0;
        C5173Hn c5173Hn = this.valueOf;
        int iHashCode5 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AYXKKw;
        int iHashCode6 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.gEmmrt;
        int iHashCode7 = list3 != null ? list3.hashCode() : 0;
        JobParameters jobParameters = this.AhwBna;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (jobParameters != null ? jobParameters.hashCode() : 0)) * 31) + this.djBIcL.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SecretKeyFactorySpi.class != obj.getClass()) {
            return false;
        }
        SecretKeyFactorySpi secretKeyFactorySpi = (SecretKeyFactorySpi) obj;
        return this.OLrzqt == secretKeyFactorySpi.OLrzqt && Intrinsics.EZpvd(this.KWHzl, secretKeyFactorySpi.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) secretKeyFactorySpi.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, secretKeyFactorySpi.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, secretKeyFactorySpi.valueOf) && Intrinsics.EZpvd(this.AYXKKw, secretKeyFactorySpi.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, secretKeyFactorySpi.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, secretKeyFactorySpi.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) secretKeyFactorySpi.djBIcL);
    }

    public static /* synthetic */ SecretKeyFactorySpi copy$default(SecretKeyFactorySpi secretKeyFactorySpi, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminGetUserResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SecretKeyFactorySpi.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SecretKeyFactorySpi.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(secretKeyFactorySpi);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public java.util.List<ListFragment> AEQbTJ;
        public java.lang.String AYXKKw;
        public C5173Hn AhwBna;
        public java.util.List<ChooseAccountActivity> EZpvd;
        public C5173Hn KWHzl;
        public boolean OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<java.lang.String> djBIcL;
        public JobParameters valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ListFragment> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(JobParameters jobParameters) {
            this.valueOf = jobParameters;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl() {
            if (this.AYXKKw == null) {
                this.AYXKKw = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.AhwBna = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<ChooseAccountActivity> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ListFragment> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JobParameters valueOf() {
            return this.valueOf;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull SecretKeyFactorySpi secretKeyFactorySpi) {
            this();
            Intrinsics.checkNotNullParameter(secretKeyFactorySpi, "");
            this.OLrzqt = secretKeyFactorySpi.EZpvd();
            this.AEQbTJ = secretKeyFactorySpi.OLrzqt();
            this.copydefault = secretKeyFactorySpi.copydefault();
            this.EZpvd = secretKeyFactorySpi.AEQbTJ();
            this.KWHzl = secretKeyFactorySpi.KWHzl();
            this.AhwBna = secretKeyFactorySpi.djBIcL();
            this.djBIcL = secretKeyFactorySpi.AYXKKw();
            this.valueOf = secretKeyFactorySpi.AhwBna();
            this.AYXKKw = secretKeyFactorySpi.valueOf();
        }

        public final SecretKeyFactorySpi OLrzqt() {
            return new SecretKeyFactorySpi(this, null);
        }
    }
}
