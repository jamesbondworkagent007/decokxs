package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DiskReadViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DiskReadViolation {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final IntentReceiverLeakedViolation AkhnZx;
    public final CleartextNetworkViolation DbNXlk;
    public final java.lang.String EZpvd;
    public final ServiceManagerNative KWHzl;
    public final C5173Hn OLrzqt;
    public final java.lang.String copydefault;
    public final SynchronousResultReceiver djBIcL;
    public final C5173Hn fetchVPNInfo;
    public final StatsDimensionsValue gEmmrt;
    public final ServiceConnectionLeakedViolation isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DiskReadViolation$TaskDescription) A[MD:(o.DiskReadViolation$TaskDescription):void (m)] call: o.DiskReadViolation.<init>(o.DiskReadViolation$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DiskReadViolation(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CleartextNetworkViolation AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentReceiverLeakedViolation DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceConnectionLeakedViolation values() {
        return this.isConnected;
    }

    public DiskReadViolation(TaskDescription taskDescription) {
        this.copydefault = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.KWHzl();
        this.KWHzl = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.AYXKKw();
        this.valueOf = taskDescription.valueOf();
        this.AYXKKw = taskDescription.AhwBna();
        this.gEmmrt = taskDescription.djBIcL();
        this.djBIcL = taskDescription.gEmmrt();
        this.AhwBna = taskDescription.AkhnZx();
        this.DbNXlk = taskDescription.isConnected();
        this.AkhnZx = taskDescription.values();
        this.isConnected = taskDescription.fetchVPNInfo();
        this.fetchVPNInfo = taskDescription.DbNXlk();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DiskReadViolation.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PiiEntitiesDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("mode=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("redactionConfig=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTime=");
        sb2.append(this.fetchVPNInfo);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.KWHzl;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.gEmmrt;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.djBIcL;
        int iHashCode8 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str5 = this.AhwBna;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        CleartextNetworkViolation cleartextNetworkViolation = this.DbNXlk;
        int iHashCode10 = cleartextNetworkViolation != null ? cleartextNetworkViolation.hashCode() : 0;
        IntentReceiverLeakedViolation intentReceiverLeakedViolation = this.AkhnZx;
        int iHashCode11 = intentReceiverLeakedViolation != null ? intentReceiverLeakedViolation.hashCode() : 0;
        ServiceConnectionLeakedViolation serviceConnectionLeakedViolation = this.isConnected;
        int iHashCode12 = serviceConnectionLeakedViolation != null ? serviceConnectionLeakedViolation.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fetchVPNInfo;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DiskReadViolation.class != obj.getClass()) {
            return false;
        }
        DiskReadViolation diskReadViolation = (DiskReadViolation) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) diskReadViolation.copydefault) && Intrinsics.EZpvd(this.OLrzqt, diskReadViolation.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, diskReadViolation.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) diskReadViolation.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) diskReadViolation.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) diskReadViolation.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, diskReadViolation.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, diskReadViolation.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) diskReadViolation.AhwBna) && Intrinsics.EZpvd(this.DbNXlk, diskReadViolation.DbNXlk) && Intrinsics.EZpvd(this.AkhnZx, diskReadViolation.AkhnZx) && Intrinsics.EZpvd(this.isConnected, diskReadViolation.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, diskReadViolation.fetchVPNInfo);
    }

    public static /* synthetic */ DiskReadViolation copy$default(DiskReadViolation diskReadViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.PiiEntitiesDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DiskReadViolation.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DiskReadViolation.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(diskReadViolation);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public C5173Hn AEQbTJ;
        public CleartextNetworkViolation AYXKKw;
        public SynchronousResultReceiver AhwBna;
        public ServiceConnectionLeakedViolation AkhnZx;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public ServiceManagerNative copydefault;
        public java.lang.String djBIcL;
        public C5173Hn fetchVPNInfo;
        public java.lang.String gEmmrt;
        public IntentReceiverLeakedViolation isConnected;
        public StatsDimensionsValue valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ServiceConnectionLeakedViolation serviceConnectionLeakedViolation) {
            this.AkhnZx = serviceConnectionLeakedViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ServiceManagerNative serviceManagerNative) {
            this.copydefault = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.fetchVPNInfo = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(CleartextNetworkViolation cleartextNetworkViolation) {
            this.AYXKKw = cleartextNetworkViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(StatsDimensionsValue statsDimensionsValue) {
            this.valueOf = statsDimensionsValue;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(IntentReceiverLeakedViolation intentReceiverLeakedViolation) {
            this.isConnected = intentReceiverLeakedViolation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(SynchronousResultReceiver synchronousResultReceiver) {
            this.AhwBna = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceConnectionLeakedViolation fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CleartextNetworkViolation isConnected() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IntentReceiverLeakedViolation values() {
            return this.isConnected;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull DiskReadViolation diskReadViolation) {
            this();
            Intrinsics.checkNotNullParameter(diskReadViolation, "");
            this.KWHzl = diskReadViolation.OLrzqt();
            this.AEQbTJ = diskReadViolation.copydefault();
            this.copydefault = diskReadViolation.KWHzl();
            this.OLrzqt = diskReadViolation.AEQbTJ();
            this.EZpvd = diskReadViolation.EZpvd();
            this.djBIcL = diskReadViolation.valueOf();
            this.valueOf = diskReadViolation.gEmmrt();
            this.AhwBna = diskReadViolation.djBIcL();
            this.gEmmrt = diskReadViolation.AhwBna();
            this.AYXKKw = diskReadViolation.AYXKKw();
            this.isConnected = diskReadViolation.DbNXlk();
            this.AkhnZx = diskReadViolation.values();
            this.fetchVPNInfo = diskReadViolation.isConnected();
        }

        public final DiskReadViolation OLrzqt() {
            return new DiskReadViolation(this, null);
        }
    }
}
