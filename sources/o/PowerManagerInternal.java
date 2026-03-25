package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PowerManagerInternal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PowerManagerInternal {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final StatsDimensionsValue AYXKKw;
    public final java.lang.String AhwBna;
    public final C5173Hn AkhnZx;
    public final StorageManagerInternal DbNXlk;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;
    public final ServiceManagerNative copydefault;
    public final java.lang.String djBIcL;
    public final SynchronousResultReceiver gEmmrt;
    public final java.util.List<java.lang.String> isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PowerManagerInternal$TaskDescription) A[MD:(o.PowerManagerInternal$TaskDescription):void (m)] call: o.PowerManagerInternal.<init>(o.PowerManagerInternal$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PowerManagerInternal(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn values() {
        return this.AkhnZx;
    }

    public PowerManagerInternal(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.EZpvd();
        this.KWHzl = taskDescription.AEQbTJ();
        this.copydefault = taskDescription.copydefault();
        this.OLrzqt = taskDescription.valueOf();
        this.valueOf = taskDescription.AhwBna();
        this.djBIcL = taskDescription.djBIcL();
        this.AYXKKw = taskDescription.gEmmrt();
        this.gEmmrt = taskDescription.AYXKKw();
        this.AhwBna = taskDescription.isConnected();
        this.DbNXlk = taskDescription.DbNXlk();
        this.AkhnZx = taskDescription.AkhnZx();
        this.isConnected = taskDescription.values();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PowerManagerInternal.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EventsDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("targetEventTypes=");
        sb2.append(this.isConnected);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.copydefault;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.AYXKKw;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.gEmmrt;
        int iHashCode8 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str5 = this.AhwBna;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.DbNXlk;
        int iHashCode10 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AkhnZx;
        int iHashCode11 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.util.List<java.lang.String> list = this.isConnected;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PowerManagerInternal.class != obj.getClass()) {
            return false;
        }
        PowerManagerInternal powerManagerInternal = (PowerManagerInternal) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) powerManagerInternal.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, powerManagerInternal.KWHzl) && Intrinsics.EZpvd(this.copydefault, powerManagerInternal.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) powerManagerInternal.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) powerManagerInternal.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) powerManagerInternal.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, powerManagerInternal.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, powerManagerInternal.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) powerManagerInternal.AhwBna) && Intrinsics.EZpvd(this.DbNXlk, powerManagerInternal.DbNXlk) && Intrinsics.EZpvd(this.AkhnZx, powerManagerInternal.AkhnZx) && Intrinsics.EZpvd(this.isConnected, powerManagerInternal.isConnected);
    }

    public static /* synthetic */ PowerManagerInternal copy$default(PowerManagerInternal powerManagerInternal, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EventsDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PowerManagerInternal.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PowerManagerInternal.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(powerManagerInternal);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public SynchronousResultReceiver AhwBna;
        public C5173Hn AkhnZx;
        public java.lang.String EZpvd;
        public C5173Hn KWHzl;
        public java.lang.String OLrzqt;
        public ServiceManagerNative copydefault;
        public java.lang.String djBIcL;
        public StorageManagerInternal gEmmrt;
        public StatsDimensionsValue valueOf;
        public java.util.List<java.lang.String> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.AkhnZx = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ServiceManagerNative serviceManagerNative) {
            this.copydefault = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(SynchronousResultReceiver synchronousResultReceiver) {
            this.AhwBna = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal DbNXlk() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.values = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(StorageManagerInternal storageManagerInternal) {
            this.gEmmrt = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(StatsDimensionsValue statsDimensionsValue) {
            this.valueOf = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> values() {
            return this.values;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PowerManagerInternal powerManagerInternal) {
            this();
            Intrinsics.checkNotNullParameter(powerManagerInternal, "");
            this.OLrzqt = powerManagerInternal.copydefault();
            this.KWHzl = powerManagerInternal.KWHzl();
            this.copydefault = powerManagerInternal.OLrzqt();
            this.AEQbTJ = powerManagerInternal.EZpvd();
            this.EZpvd = powerManagerInternal.AEQbTJ();
            this.AYXKKw = powerManagerInternal.gEmmrt();
            this.valueOf = powerManagerInternal.AhwBna();
            this.AhwBna = powerManagerInternal.djBIcL();
            this.djBIcL = powerManagerInternal.AYXKKw();
            this.gEmmrt = powerManagerInternal.valueOf();
            this.AkhnZx = powerManagerInternal.values();
            this.values = powerManagerInternal.DbNXlk();
        }

        public final PowerManagerInternal OLrzqt() {
            return new PowerManagerInternal(this, null);
        }
    }
}
