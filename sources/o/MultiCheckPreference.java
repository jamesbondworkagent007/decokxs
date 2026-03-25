package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.MultiCheckPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MultiCheckPreference {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.util.List<PrinterDiscoverySession> AhwBna;
    public final java.lang.String EZpvd;
    public final ServiceManagerNative KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<java.lang.String> djBIcL;
    public final SynchronousResultReceiver gEmmrt;
    public final StorageManagerInternal valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MultiCheckPreference$Application) A[MD:(o.MultiCheckPreference$Application):void (m)] call: o.MultiCheckPreference.<init>(o.MultiCheckPreference$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MultiCheckPreference(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> gEmmrt() {
        return this.djBIcL;
    }

    public MultiCheckPreference(Application application) {
        this.OLrzqt = application.EZpvd();
        this.EZpvd = application.OLrzqt();
        this.KWHzl = application.KWHzl();
        this.copydefault = application.copydefault();
        this.gEmmrt = application.AhwBna();
        this.valueOf = application.gEmmrt();
        this.AhwBna = application.valueOf();
        this.djBIcL = application.djBIcL();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MultiCheckPreference.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartEventsDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("targetEventTypes=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.KWHzl;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.gEmmrt;
        int iHashCode5 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.valueOf;
        int iHashCode6 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AhwBna;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MultiCheckPreference.class != obj.getClass()) {
            return false;
        }
        MultiCheckPreference multiCheckPreference = (MultiCheckPreference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) multiCheckPreference.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) multiCheckPreference.EZpvd) && Intrinsics.EZpvd(this.KWHzl, multiCheckPreference.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) multiCheckPreference.copydefault) && Intrinsics.EZpvd(this.gEmmrt, multiCheckPreference.gEmmrt) && Intrinsics.EZpvd(this.valueOf, multiCheckPreference.valueOf) && Intrinsics.EZpvd(this.AhwBna, multiCheckPreference.AhwBna) && Intrinsics.EZpvd(this.djBIcL, multiCheckPreference.djBIcL);
    }

    public static /* synthetic */ MultiCheckPreference copy$default(MultiCheckPreference multiCheckPreference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartEventsDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MultiCheckPreference.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MultiCheckPreference.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(multiCheckPreference);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AhwBna;
        public SynchronousResultReceiver EZpvd;
        public java.lang.String KWHzl;
        public ServiceManagerNative OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<java.lang.String> djBIcL;
        public StorageManagerInternal gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> valueOf() {
            return this.AhwBna;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull MultiCheckPreference multiCheckPreference) {
            this();
            Intrinsics.checkNotNullParameter(multiCheckPreference, "");
            this.AEQbTJ = multiCheckPreference.AEQbTJ();
            this.copydefault = multiCheckPreference.OLrzqt();
            this.OLrzqt = multiCheckPreference.KWHzl();
            this.KWHzl = multiCheckPreference.copydefault();
            this.EZpvd = multiCheckPreference.EZpvd();
            this.gEmmrt = multiCheckPreference.AYXKKw();
            this.AhwBna = multiCheckPreference.djBIcL();
            this.djBIcL = multiCheckPreference.gEmmrt();
        }

        public final MultiCheckPreference AEQbTJ() {
            return new MultiCheckPreference(this, null);
        }
    }
}
