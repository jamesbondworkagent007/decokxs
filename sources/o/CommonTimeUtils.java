package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CommonTimeUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CommonTimeUtils {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final StatsDimensionsValue AhwBna;
    public final java.lang.String AkhnZx;
    public final C5173Hn DbNXlk;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final ContactsContract fetchVPNInfo;
    public final ServiceManagerNative gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final StorageManagerInternal values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CommonTimeUtils$StateListAnimator) A[MD:(o.CommonTimeUtils$StateListAnimator):void (m)] call: o.CommonTimeUtils.<init>(o.CommonTimeUtils$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CommonTimeUtils(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract values() {
        return this.fetchVPNInfo;
    }

    public CommonTimeUtils(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.AhwBna();
        this.gEmmrt = stateListAnimator.valueOf();
        this.valueOf = stateListAnimator.gEmmrt();
        this.AYXKKw = stateListAnimator.djBIcL();
        this.djBIcL = stateListAnimator.AYXKKw();
        this.AhwBna = stateListAnimator.fetchVPNInfo();
        this.AkhnZx = stateListAnimator.AkhnZx();
        this.values = stateListAnimator.DbNXlk();
        this.DbNXlk = stateListAnimator.isConnected();
        this.isConnected = stateListAnimator.values();
        this.fetchVPNInfo = stateListAnimator.AuCTel();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CommonTimeUtils.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentClassificationJobProperties(");
        sb.append("dataAccessRoleArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("documentClassifierArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.fetchVPNInfo);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.gEmmrt;
        int iHashCode5 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.AYXKKw;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.djBIcL;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.AhwBna;
        int iHashCode9 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        java.lang.String str7 = this.AkhnZx;
        int iHashCode10 = str7 != null ? str7.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.values;
        int iHashCode11 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.DbNXlk;
        int iHashCode12 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str8 = this.isConnected;
        int iHashCode13 = str8 != null ? str8.hashCode() : 0;
        ContactsContract contactsContract = this.fetchVPNInfo;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommonTimeUtils.class != obj.getClass()) {
            return false;
        }
        CommonTimeUtils commonTimeUtils = (CommonTimeUtils) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) commonTimeUtils.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) commonTimeUtils.copydefault) && Intrinsics.EZpvd(this.EZpvd, commonTimeUtils.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) commonTimeUtils.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, commonTimeUtils.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) commonTimeUtils.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) commonTimeUtils.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) commonTimeUtils.djBIcL) && Intrinsics.EZpvd(this.AhwBna, commonTimeUtils.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) commonTimeUtils.AkhnZx) && Intrinsics.EZpvd(this.values, commonTimeUtils.values) && Intrinsics.EZpvd(this.DbNXlk, commonTimeUtils.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) commonTimeUtils.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, commonTimeUtils.fetchVPNInfo);
    }

    public static /* synthetic */ CommonTimeUtils copy$default(CommonTimeUtils commonTimeUtils, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentClassificationJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CommonTimeUtils.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CommonTimeUtils.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(commonTimeUtils);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public StatsDimensionsValue AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public ServiceManagerNative KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public C5173Hn fetchVPNInfo;
        public java.lang.String gEmmrt;
        public StorageManagerInternal isConnected;
        public java.lang.String valueOf;
        public ContactsContract values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(StatsDimensionsValue statsDimensionsValue) {
            this.AYXKKw = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AuCTel() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ServiceManagerNative serviceManagerNative) {
            this.KWHzl = serviceManagerNative;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ContactsContract contactsContract) {
            this.values = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(StorageManagerInternal storageManagerInternal) {
            this.isConnected = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.fetchVPNInfo = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative valueOf() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.DbNXlk;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull CommonTimeUtils commonTimeUtils) {
            this();
            Intrinsics.checkNotNullParameter(commonTimeUtils, "");
            this.EZpvd = commonTimeUtils.KWHzl();
            this.AEQbTJ = commonTimeUtils.EZpvd();
            this.OLrzqt = commonTimeUtils.AEQbTJ();
            this.copydefault = commonTimeUtils.copydefault();
            this.KWHzl = commonTimeUtils.OLrzqt();
            this.valueOf = commonTimeUtils.valueOf();
            this.djBIcL = commonTimeUtils.AhwBna();
            this.AhwBna = commonTimeUtils.gEmmrt();
            this.AYXKKw = commonTimeUtils.AYXKKw();
            this.gEmmrt = commonTimeUtils.djBIcL();
            this.isConnected = commonTimeUtils.DbNXlk();
            this.fetchVPNInfo = commonTimeUtils.fetchVPNInfo();
            this.DbNXlk = commonTimeUtils.AkhnZx();
            this.values = commonTimeUtils.values();
        }

        public final CommonTimeUtils AEQbTJ() {
            return new CommonTimeUtils(this, null);
        }
    }
}
