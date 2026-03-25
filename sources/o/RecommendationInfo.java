package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RecommendationInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RecommendationInfo {
    public static final Activity EZpvd = new Activity(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final SynchronousResultReceiver AhwBna;
    public final StorageManagerInternal AkhnZx;
    public final java.lang.String DbNXlk;
    public final ServiceManagerNative KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final StatsDimensionsValue gEmmrt;
    public final C5173Hn isConnected;
    public final java.lang.String valueOf;
    public final ContactsContract values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RecommendationInfo$StateListAnimator) A[MD:(o.RecommendationInfo$StateListAnimator):void (m)] call: o.RecommendationInfo.<init>(o.RecommendationInfo$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RecommendationInfo(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.DbNXlk;
    }

    public RecommendationInfo(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.valueOf();
        this.valueOf = stateListAnimator.djBIcL();
        this.djBIcL = stateListAnimator.gEmmrt();
        this.gEmmrt = stateListAnimator.AhwBna();
        this.AhwBna = stateListAnimator.AYXKKw();
        this.AYXKKw = stateListAnimator.AkhnZx();
        this.AkhnZx = stateListAnimator.fetchVPNInfo();
        this.isConnected = stateListAnimator.DbNXlk();
        this.DbNXlk = stateListAnimator.isConnected();
        this.values = stateListAnimator.values();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RecommendationInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetedSentimentDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
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
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.KWHzl;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.gEmmrt;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.AhwBna;
        int iHashCode8 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str5 = this.AYXKKw;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.AkhnZx;
        int iHashCode10 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.isConnected;
        int iHashCode11 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.DbNXlk;
        int iHashCode12 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.values;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RecommendationInfo.class != obj.getClass()) {
            return false;
        }
        RecommendationInfo recommendationInfo = (RecommendationInfo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) recommendationInfo.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, recommendationInfo.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, recommendationInfo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) recommendationInfo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) recommendationInfo.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) recommendationInfo.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, recommendationInfo.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, recommendationInfo.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) recommendationInfo.AYXKKw) && Intrinsics.EZpvd(this.AkhnZx, recommendationInfo.AkhnZx) && Intrinsics.EZpvd(this.isConnected, recommendationInfo.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) recommendationInfo.DbNXlk) && Intrinsics.EZpvd(this.values, recommendationInfo.values);
    }

    public static /* synthetic */ RecommendationInfo copy$default(RecommendationInfo recommendationInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TargetedSentimentDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RecommendationInfo.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RecommendationInfo.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(recommendationInfo);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public StatsDimensionsValue AhwBna;
        public java.lang.String EZpvd;
        public ServiceManagerNative KWHzl;
        public java.lang.String OLrzqt;
        public C5173Hn copydefault;
        public java.lang.String djBIcL;
        public C5173Hn fetchVPNInfo;
        public StorageManagerInternal gEmmrt;
        public ContactsContract isConnected;
        public SynchronousResultReceiver valueOf;
        public java.lang.String values;

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
            this.isConnected = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(StorageManagerInternal storageManagerInternal) {
            this.gEmmrt = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn DbNXlk() {
            return this.fetchVPNInfo;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.fetchVPNInfo = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SynchronousResultReceiver synchronousResultReceiver) {
            this.valueOf = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ServiceManagerNative serviceManagerNative) {
            this.KWHzl = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(StatsDimensionsValue statsDimensionsValue) {
            this.AhwBna = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract values() {
            return this.isConnected;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RecommendationInfo recommendationInfo) {
            this();
            Intrinsics.checkNotNullParameter(recommendationInfo, "");
            this.AEQbTJ = recommendationInfo.AEQbTJ();
            this.copydefault = recommendationInfo.OLrzqt();
            this.KWHzl = recommendationInfo.KWHzl();
            this.EZpvd = recommendationInfo.EZpvd();
            this.OLrzqt = recommendationInfo.copydefault();
            this.AYXKKw = recommendationInfo.AhwBna();
            this.AhwBna = recommendationInfo.AYXKKw();
            this.valueOf = recommendationInfo.djBIcL();
            this.djBIcL = recommendationInfo.valueOf();
            this.gEmmrt = recommendationInfo.gEmmrt();
            this.fetchVPNInfo = recommendationInfo.isConnected();
            this.values = recommendationInfo.values();
            this.isConnected = recommendationInfo.AkhnZx();
        }

        public final RecommendationInfo KWHzl() {
            return new RecommendationInfo(this, null);
        }
    }
}
