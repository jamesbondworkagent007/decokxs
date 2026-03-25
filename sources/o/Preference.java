package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Preference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Preference {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<PrinterDiscoverySession> AhwBna;
    public final ServiceManagerNative KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final SynchronousResultReceiver djBIcL;
    public final StorageManagerInternal gEmmrt;
    public final ContactsContract valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Preference$Application) A[MD:(o.Preference$Application):void (m)] call: o.Preference.<init>(o.Preference$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Preference(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal valueOf() {
        return this.gEmmrt;
    }

    public Preference(Application application) {
        this.copydefault = application.EZpvd();
        this.OLrzqt = application.KWHzl();
        this.KWHzl = application.AEQbTJ();
        this.AEQbTJ = application.copydefault();
        this.djBIcL = application.AhwBna();
        this.gEmmrt = application.djBIcL();
        this.AhwBna = application.valueOf();
        this.AYXKKw = application.gEmmrt();
        this.valueOf = application.AYXKKw();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Preference.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartKeyPhrasesDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.KWHzl;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.djBIcL;
        int iHashCode5 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.gEmmrt;
        int iHashCode6 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AhwBna;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        ContactsContract contactsContract = this.valueOf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Preference.class != obj.getClass()) {
            return false;
        }
        Preference preference = (Preference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) preference.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) preference.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, preference.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) preference.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, preference.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, preference.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, preference.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) preference.AYXKKw) && Intrinsics.EZpvd(this.valueOf, preference.valueOf);
    }

    public static /* synthetic */ Preference copy$default(Preference preference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartKeyPhrasesDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Preference.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Preference.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(preference);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public SynchronousResultReceiver EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public ServiceManagerNative copydefault;
        public java.util.List<PrinterDiscoverySession> djBIcL;
        public StorageManagerInternal gEmmrt;
        public ContactsContract valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> valueOf() {
            return this.djBIcL;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull Preference preference) {
            this();
            Intrinsics.checkNotNullParameter(preference, "");
            this.OLrzqt = preference.AEQbTJ();
            this.KWHzl = preference.KWHzl();
            this.copydefault = preference.EZpvd();
            this.AEQbTJ = preference.OLrzqt();
            this.EZpvd = preference.copydefault();
            this.gEmmrt = preference.valueOf();
            this.djBIcL = preference.gEmmrt();
            this.AYXKKw = preference.AYXKKw();
            this.valueOf = preference.AhwBna();
        }

        public final Preference OLrzqt() {
            return new Preference(this, null);
        }
    }
}
