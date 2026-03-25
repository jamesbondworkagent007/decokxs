package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NonSdkApiUsedViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NonSdkApiUsedViolation {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String AYXKKw;
    public final StatsDimensionsValue AhwBna;
    public final java.lang.String AkhnZx;
    public final StorageManagerInternal DbNXlk;
    public final java.lang.String EZpvd;
    public final ServiceManagerNative KWHzl;
    public final C5173Hn OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final C5173Hn fetchVPNInfo;
    public final SynchronousResultReceiver gEmmrt;
    public final ContactsContract isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NonSdkApiUsedViolation$StateListAnimator) A[MD:(o.NonSdkApiUsedViolation$StateListAnimator):void (m)] call: o.NonSdkApiUsedViolation.<init>(o.NonSdkApiUsedViolation$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NonSdkApiUsedViolation(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver valueOf() {
        return this.gEmmrt;
    }

    public NonSdkApiUsedViolation(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.AYXKKw();
        this.djBIcL = stateListAnimator.valueOf();
        this.valueOf = stateListAnimator.AhwBna();
        this.AhwBna = stateListAnimator.djBIcL();
        this.gEmmrt = stateListAnimator.gEmmrt();
        this.AYXKKw = stateListAnimator.values();
        this.DbNXlk = stateListAnimator.isConnected();
        this.fetchVPNInfo = stateListAnimator.AkhnZx();
        this.AkhnZx = stateListAnimator.DbNXlk();
        this.isConnected = stateListAnimator.fetchVPNInfo();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NonSdkApiUsedViolation.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SentimentDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.isConnected);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.KWHzl;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.AhwBna;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.gEmmrt;
        int iHashCode8 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str5 = this.AYXKKw;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.DbNXlk;
        int iHashCode10 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fetchVPNInfo;
        int iHashCode11 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.AkhnZx;
        int iHashCode12 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.isConnected;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NonSdkApiUsedViolation.class != obj.getClass()) {
            return false;
        }
        NonSdkApiUsedViolation nonSdkApiUsedViolation = (NonSdkApiUsedViolation) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) nonSdkApiUsedViolation.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, nonSdkApiUsedViolation.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, nonSdkApiUsedViolation.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) nonSdkApiUsedViolation.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) nonSdkApiUsedViolation.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) nonSdkApiUsedViolation.valueOf) && Intrinsics.EZpvd(this.AhwBna, nonSdkApiUsedViolation.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, nonSdkApiUsedViolation.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) nonSdkApiUsedViolation.AYXKKw) && Intrinsics.EZpvd(this.DbNXlk, nonSdkApiUsedViolation.DbNXlk) && Intrinsics.EZpvd(this.fetchVPNInfo, nonSdkApiUsedViolation.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) nonSdkApiUsedViolation.AkhnZx) && Intrinsics.EZpvd(this.isConnected, nonSdkApiUsedViolation.isConnected);
    }

    public static /* synthetic */ NonSdkApiUsedViolation copy$default(NonSdkApiUsedViolation nonSdkApiUsedViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.SentimentDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NonSdkApiUsedViolation.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NonSdkApiUsedViolation.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(nonSdkApiUsedViolation);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public SynchronousResultReceiver AYXKKw;
        public StatsDimensionsValue AhwBna;
        public ContactsContract DbNXlk;
        public C5173Hn EZpvd;
        public ServiceManagerNative KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public java.lang.String isConnected;
        public StorageManagerInternal valueOf;
        public C5173Hn values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ContactsContract contactsContract) {
            this.DbNXlk = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ServiceManagerNative serviceManagerNative) {
            this.KWHzl = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(StorageManagerInternal storageManagerInternal) {
            this.valueOf = storageManagerInternal;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.values = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(StatsDimensionsValue statsDimensionsValue) {
            this.AhwBna = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(SynchronousResultReceiver synchronousResultReceiver) {
            this.AYXKKw = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.djBIcL;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull NonSdkApiUsedViolation nonSdkApiUsedViolation) {
            this();
            Intrinsics.checkNotNullParameter(nonSdkApiUsedViolation, "");
            this.OLrzqt = nonSdkApiUsedViolation.KWHzl();
            this.EZpvd = nonSdkApiUsedViolation.AEQbTJ();
            this.KWHzl = nonSdkApiUsedViolation.EZpvd();
            this.AEQbTJ = nonSdkApiUsedViolation.OLrzqt();
            this.copydefault = nonSdkApiUsedViolation.copydefault();
            this.gEmmrt = nonSdkApiUsedViolation.gEmmrt();
            this.AhwBna = nonSdkApiUsedViolation.AhwBna();
            this.AYXKKw = nonSdkApiUsedViolation.valueOf();
            this.djBIcL = nonSdkApiUsedViolation.djBIcL();
            this.valueOf = nonSdkApiUsedViolation.AYXKKw();
            this.values = nonSdkApiUsedViolation.AkhnZx();
            this.isConnected = nonSdkApiUsedViolation.isConnected();
            this.DbNXlk = nonSdkApiUsedViolation.fetchVPNInfo();
        }

        public final NonSdkApiUsedViolation copydefault() {
            return new NonSdkApiUsedViolation(this, null);
        }
    }
}
