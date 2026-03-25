package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PreferenceInflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PreferenceInflater {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final CleartextNetworkViolation AYXKKw;
    public final SynchronousResultReceiver AhwBna;
    public final ServiceManagerNative EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final StorageManagerInternal djBIcL;
    public final ServiceConnectionLeakedViolation gEmmrt;
    public final java.util.List<PrinterDiscoverySession> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PreferenceInflater$ActionBar) A[MD:(o.PreferenceInflater$ActionBar):void (m)] call: o.PreferenceInflater.<init>(o.PreferenceInflater$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PreferenceInflater(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceConnectionLeakedViolation gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CleartextNetworkViolation valueOf() {
        return this.AYXKKw;
    }

    public PreferenceInflater(ActionBar actionBar) {
        this.OLrzqt = actionBar.OLrzqt();
        this.copydefault = actionBar.AEQbTJ();
        this.EZpvd = actionBar.EZpvd();
        this.AEQbTJ = actionBar.copydefault();
        this.AhwBna = actionBar.valueOf();
        this.AYXKKw = actionBar.AYXKKw();
        this.djBIcL = actionBar.AhwBna();
        this.gEmmrt = actionBar.djBIcL();
        this.valueOf = actionBar.gEmmrt();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PreferenceInflater.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartPiiEntitiesDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("mode=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("redactionConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.EZpvd;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.AhwBna;
        int iHashCode5 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        CleartextNetworkViolation cleartextNetworkViolation = this.AYXKKw;
        int iHashCode6 = cleartextNetworkViolation != null ? cleartextNetworkViolation.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.djBIcL;
        int iHashCode7 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        ServiceConnectionLeakedViolation serviceConnectionLeakedViolation = this.gEmmrt;
        int iHashCode8 = serviceConnectionLeakedViolation != null ? serviceConnectionLeakedViolation.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.valueOf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreferenceInflater.class != obj.getClass()) {
            return false;
        }
        PreferenceInflater preferenceInflater = (PreferenceInflater) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) preferenceInflater.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) preferenceInflater.copydefault) && Intrinsics.EZpvd(this.EZpvd, preferenceInflater.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) preferenceInflater.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, preferenceInflater.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, preferenceInflater.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, preferenceInflater.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, preferenceInflater.gEmmrt) && Intrinsics.EZpvd(this.valueOf, preferenceInflater.valueOf);
    }

    public static /* synthetic */ PreferenceInflater copy$default(PreferenceInflater preferenceInflater, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartPiiEntitiesDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PreferenceInflater.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PreferenceInflater.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(preferenceInflater);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AhwBna;
        public SynchronousResultReceiver EZpvd;
        public java.lang.String KWHzl;
        public ServiceManagerNative OLrzqt;
        public java.lang.String copydefault;
        public CleartextNetworkViolation djBIcL;
        public ServiceConnectionLeakedViolation gEmmrt;
        public StorageManagerInternal valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CleartextNetworkViolation AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative EZpvd() {
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
        public final ServiceConnectionLeakedViolation djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver valueOf() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull PreferenceInflater preferenceInflater) {
            this();
            Intrinsics.checkNotNullParameter(preferenceInflater, "");
            this.copydefault = preferenceInflater.EZpvd();
            this.AEQbTJ = preferenceInflater.copydefault();
            this.OLrzqt = preferenceInflater.OLrzqt();
            this.KWHzl = preferenceInflater.KWHzl();
            this.EZpvd = preferenceInflater.AEQbTJ();
            this.djBIcL = preferenceInflater.valueOf();
            this.valueOf = preferenceInflater.djBIcL();
            this.gEmmrt = preferenceInflater.gEmmrt();
            this.AhwBna = preferenceInflater.AhwBna();
        }

        public final PreferenceInflater KWHzl() {
            return new PreferenceInflater(this, null);
        }
    }
}
