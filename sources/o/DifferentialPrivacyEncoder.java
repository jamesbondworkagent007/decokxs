package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DifferentialPrivacyEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DifferentialPrivacyEncoder {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final StorageManagerInternal AkhnZx;
    public final C5173Hn DbNXlk;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final ServiceManagerNative OLrzqt;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Integer gEmmrt;
    public final StatsDimensionsValue valueOf;
    public final ContactsContract values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DifferentialPrivacyEncoder$TaskDescription) A[MD:(o.DifferentialPrivacyEncoder$TaskDescription):void (m)] call: o.DifferentialPrivacyEncoder.<init>(o.DifferentialPrivacyEncoder$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DifferentialPrivacyEncoder(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public DifferentialPrivacyEncoder(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.EZpvd();
        this.EZpvd = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.AEQbTJ();
        this.KWHzl = taskDescription.djBIcL();
        this.djBIcL = taskDescription.AYXKKw();
        this.AhwBna = taskDescription.AhwBna();
        this.valueOf = taskDescription.valueOf();
        this.AYXKKw = taskDescription.gEmmrt();
        this.gEmmrt = taskDescription.DbNXlk();
        this.AkhnZx = taskDescription.isConnected();
        this.DbNXlk = taskDescription.values();
        this.fetchVPNInfo = taskDescription.fetchVPNInfo();
        this.values = taskDescription.AkhnZx();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DifferentialPrivacyEncoder.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopicsDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("numberOfTopics=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.values);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.OLrzqt;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.valueOf;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        java.lang.String str5 = this.AYXKKw;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        java.lang.Integer num = this.gEmmrt;
        int iIntValue = num != null ? num.intValue() : 0;
        StorageManagerInternal storageManagerInternal = this.AkhnZx;
        int iHashCode9 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.DbNXlk;
        int iHashCode10 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.fetchVPNInfo;
        int iHashCode11 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.values;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iIntValue) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DifferentialPrivacyEncoder.class != obj.getClass()) {
            return false;
        }
        DifferentialPrivacyEncoder differentialPrivacyEncoder = (DifferentialPrivacyEncoder) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) differentialPrivacyEncoder.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, differentialPrivacyEncoder.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, differentialPrivacyEncoder.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) differentialPrivacyEncoder.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) differentialPrivacyEncoder.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) differentialPrivacyEncoder.AhwBna) && Intrinsics.EZpvd(this.valueOf, differentialPrivacyEncoder.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) differentialPrivacyEncoder.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, differentialPrivacyEncoder.gEmmrt) && Intrinsics.EZpvd(this.AkhnZx, differentialPrivacyEncoder.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, differentialPrivacyEncoder.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) differentialPrivacyEncoder.fetchVPNInfo) && Intrinsics.EZpvd(this.values, differentialPrivacyEncoder.values);
    }

    public static /* synthetic */ DifferentialPrivacyEncoder copy$default(DifferentialPrivacyEncoder differentialPrivacyEncoder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TopicsDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DifferentialPrivacyEncoder.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DifferentialPrivacyEncoder.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(differentialPrivacyEncoder);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.Integer AYXKKw;
        public java.lang.String AhwBna;
        public ContactsContract AkhnZx;
        public ServiceManagerNative EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;
        public StorageManagerInternal djBIcL;
        public java.lang.String fetchVPNInfo;
        public StatsDimensionsValue gEmmrt;
        public java.lang.String valueOf;
        public C5173Hn values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(StorageManagerInternal storageManagerInternal) {
            this.djBIcL = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.AYXKKw = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(StatsDimensionsValue statsDimensionsValue) {
            this.gEmmrt = statsDimensionsValue;
        }

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ContactsContract contactsContract) {
            this.AkhnZx = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.values = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ServiceManagerNative serviceManagerNative) {
            this.EZpvd = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.fetchVPNInfo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn values() {
            return this.values;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull DifferentialPrivacyEncoder differentialPrivacyEncoder) {
            this();
            Intrinsics.checkNotNullParameter(differentialPrivacyEncoder, "");
            this.copydefault = differentialPrivacyEncoder.AEQbTJ();
            this.OLrzqt = differentialPrivacyEncoder.OLrzqt();
            this.EZpvd = differentialPrivacyEncoder.KWHzl();
            this.AEQbTJ = differentialPrivacyEncoder.copydefault();
            this.KWHzl = differentialPrivacyEncoder.EZpvd();
            this.AhwBna = differentialPrivacyEncoder.valueOf();
            this.gEmmrt = differentialPrivacyEncoder.gEmmrt();
            this.valueOf = differentialPrivacyEncoder.AhwBna();
            this.AYXKKw = differentialPrivacyEncoder.AYXKKw();
            this.djBIcL = differentialPrivacyEncoder.djBIcL();
            this.values = differentialPrivacyEncoder.fetchVPNInfo();
            this.fetchVPNInfo = differentialPrivacyEncoder.isConnected();
            this.AkhnZx = differentialPrivacyEncoder.AkhnZx();
        }

        public final DifferentialPrivacyEncoder copydefault() {
            return new DifferentialPrivacyEncoder(this, null);
        }
    }
}
