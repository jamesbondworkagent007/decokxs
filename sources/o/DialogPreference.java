package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DialogPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DialogPreference {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final ServiceManagerNative AEQbTJ;
    public final ContactsContract AYXKKw;
    public final java.util.List<PrinterDiscoverySession> AhwBna;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final StorageManagerInternal djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DialogPreference$Application) A[MD:(o.DialogPreference$Application):void (m)] call: o.DialogPreference.<init>(o.DialogPreference$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DialogPreference(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> gEmmrt() {
        return this.AhwBna;
    }

    public DialogPreference(Application application) {
        this.OLrzqt = application.EZpvd();
        this.KWHzl = application.OLrzqt();
        this.AEQbTJ = application.KWHzl();
        this.copydefault = application.AEQbTJ();
        this.djBIcL = application.gEmmrt();
        this.AhwBna = application.AYXKKw();
        this.gEmmrt = application.djBIcL();
        this.AYXKKw = application.AhwBna();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DialogPreference.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartDominantLanguageDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.AEQbTJ;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.djBIcL;
        int iHashCode5 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AhwBna;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        ContactsContract contactsContract = this.AYXKKw;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DialogPreference.class != obj.getClass()) {
            return false;
        }
        DialogPreference dialogPreference = (DialogPreference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) dialogPreference.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dialogPreference.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, dialogPreference.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) dialogPreference.copydefault) && Intrinsics.EZpvd(this.djBIcL, dialogPreference.djBIcL) && Intrinsics.EZpvd(this.AhwBna, dialogPreference.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) dialogPreference.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, dialogPreference.AYXKKw);
    }

    public static /* synthetic */ DialogPreference copy$default(DialogPreference dialogPreference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartDominantLanguageDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DialogPreference.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogPreference.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(dialogPreference);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public ServiceManagerNative EZpvd;
        public java.lang.String KWHzl;
        public StorageManagerInternal OLrzqt;
        public java.lang.String copydefault;
        public ContactsContract djBIcL;
        public java.util.List<PrinterDiscoverySession> gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal gEmmrt() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DialogPreference dialogPreference) {
            this();
            Intrinsics.checkNotNullParameter(dialogPreference, "");
            this.KWHzl = dialogPreference.EZpvd();
            this.copydefault = dialogPreference.OLrzqt();
            this.EZpvd = dialogPreference.copydefault();
            this.AEQbTJ = dialogPreference.AEQbTJ();
            this.OLrzqt = dialogPreference.KWHzl();
            this.gEmmrt = dialogPreference.gEmmrt();
            this.AYXKKw = dialogPreference.AYXKKw();
            this.djBIcL = dialogPreference.djBIcL();
        }

        public final DialogPreference copydefault() {
            return new DialogPreference(this, null);
        }
    }
}
