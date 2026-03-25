package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PreferenceGroupAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PreferenceGroupAdapter {
    public static final Application KWHzl = new Application(null);
    public final java.lang.String AEQbTJ;
    public final SynchronousResultReceiver AYXKKw;
    public final java.util.List<PrinterDiscoverySession> AhwBna;
    public final ServiceManagerNative EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final StorageManagerInternal djBIcL;
    public final java.lang.String gEmmrt;
    public final ContactsContract valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PreferenceGroupAdapter$TaskDescription) A[MD:(o.PreferenceGroupAdapter$TaskDescription):void (m)] call: o.PreferenceGroupAdapter.<init>(o.PreferenceGroupAdapter$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PreferenceGroupAdapter(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> valueOf() {
        return this.AhwBna;
    }

    public PreferenceGroupAdapter(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.copydefault();
        this.OLrzqt = taskDescription.OLrzqt();
        this.EZpvd = taskDescription.AEQbTJ();
        this.copydefault = taskDescription.KWHzl();
        this.AYXKKw = taskDescription.AhwBna();
        this.djBIcL = taskDescription.valueOf();
        this.AhwBna = taskDescription.AYXKKw();
        this.gEmmrt = taskDescription.gEmmrt();
        this.valueOf = taskDescription.djBIcL();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PreferenceGroupAdapter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartSentimentDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
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
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.EZpvd;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.AYXKKw;
        int iHashCode5 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.djBIcL;
        int iHashCode6 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AhwBna;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        ContactsContract contactsContract = this.valueOf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreferenceGroupAdapter.class != obj.getClass()) {
            return false;
        }
        PreferenceGroupAdapter preferenceGroupAdapter = (PreferenceGroupAdapter) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) preferenceGroupAdapter.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) preferenceGroupAdapter.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, preferenceGroupAdapter.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) preferenceGroupAdapter.copydefault) && Intrinsics.EZpvd(this.AYXKKw, preferenceGroupAdapter.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, preferenceGroupAdapter.djBIcL) && Intrinsics.EZpvd(this.AhwBna, preferenceGroupAdapter.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) preferenceGroupAdapter.gEmmrt) && Intrinsics.EZpvd(this.valueOf, preferenceGroupAdapter.valueOf);
    }

    public static /* synthetic */ PreferenceGroupAdapter copy$default(PreferenceGroupAdapter preferenceGroupAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartSentimentDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PreferenceGroupAdapter.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PreferenceGroupAdapter.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(preferenceGroupAdapter);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public SynchronousResultReceiver AEQbTJ;
        public java.lang.String AYXKKw;
        public java.util.List<PrinterDiscoverySession> AhwBna;
        public ServiceManagerNative EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public StorageManagerInternal gEmmrt;
        public ContactsContract valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal valueOf() {
            return this.gEmmrt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PreferenceGroupAdapter preferenceGroupAdapter) {
            this();
            Intrinsics.checkNotNullParameter(preferenceGroupAdapter, "");
            this.copydefault = preferenceGroupAdapter.KWHzl();
            this.OLrzqt = preferenceGroupAdapter.copydefault();
            this.EZpvd = preferenceGroupAdapter.AEQbTJ();
            this.KWHzl = preferenceGroupAdapter.OLrzqt();
            this.AEQbTJ = preferenceGroupAdapter.EZpvd();
            this.gEmmrt = preferenceGroupAdapter.AYXKKw();
            this.AhwBna = preferenceGroupAdapter.valueOf();
            this.AYXKKw = preferenceGroupAdapter.AhwBna();
            this.valueOf = preferenceGroupAdapter.gEmmrt();
        }

        public final PreferenceGroupAdapter EZpvd() {
            return new PreferenceGroupAdapter(this, null);
        }
    }
}
