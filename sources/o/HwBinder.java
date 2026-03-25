package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.HwBinder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HwBinder {
    public static final Application KWHzl = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final ServiceManagerNative OLrzqt;
    public final C5173Hn copydefault;
    public final StatsDimensionsValue djBIcL;
    public final C5173Hn fetchVPNInfo;
    public final StorageManagerInternal gEmmrt;
    public final ContactsContract isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.HwBinder$ActionBar) A[MD:(o.HwBinder$ActionBar):void (m)] call: o.HwBinder.<init>(o.HwBinder$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HwBinder(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal valueOf() {
        return this.gEmmrt;
    }

    public HwBinder(ActionBar actionBar) {
        this.EZpvd = actionBar.copydefault();
        this.copydefault = actionBar.EZpvd();
        this.OLrzqt = actionBar.KWHzl();
        this.AEQbTJ = actionBar.gEmmrt();
        this.AhwBna = actionBar.valueOf();
        this.AYXKKw = actionBar.AYXKKw();
        this.djBIcL = actionBar.AhwBna();
        this.valueOf = actionBar.djBIcL();
        this.gEmmrt = actionBar.DbNXlk();
        this.fetchVPNInfo = actionBar.isConnected();
        this.DbNXlk = actionBar.values();
        this.isConnected = actionBar.AkhnZx();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HwBinder.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DominantLanguageDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
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
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.OLrzqt;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.djBIcL;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.gEmmrt;
        int iHashCode9 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fetchVPNInfo;
        int iHashCode10 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.DbNXlk;
        int iHashCode11 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.isConnected;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HwBinder.class != obj.getClass()) {
            return false;
        }
        HwBinder hwBinder = (HwBinder) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) hwBinder.EZpvd) && Intrinsics.EZpvd(this.copydefault, hwBinder.copydefault) && Intrinsics.EZpvd(this.OLrzqt, hwBinder.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) hwBinder.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) hwBinder.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) hwBinder.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, hwBinder.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) hwBinder.valueOf) && Intrinsics.EZpvd(this.gEmmrt, hwBinder.gEmmrt) && Intrinsics.EZpvd(this.fetchVPNInfo, hwBinder.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) hwBinder.DbNXlk) && Intrinsics.EZpvd(this.isConnected, hwBinder.isConnected);
    }

    public static /* synthetic */ HwBinder copy$default(HwBinder hwBinder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DominantLanguageDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HwBinder.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HwBinder.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(hwBinder);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public ServiceManagerNative AEQbTJ;
        public StatsDimensionsValue AYXKKw;
        public C5173Hn AhwBna;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public StorageManagerInternal gEmmrt;
        public ContactsContract isConnected;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ContactsContract contactsContract) {
            this.isConnected = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal DbNXlk() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(StatsDimensionsValue statsDimensionsValue) {
            this.AYXKKw = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.AhwBna = c5173Hn;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ServiceManagerNative serviceManagerNative) {
            this.AEQbTJ = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(StorageManagerInternal storageManagerInternal) {
            this.gEmmrt = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.DbNXlk;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull HwBinder hwBinder) {
            this();
            Intrinsics.checkNotNullParameter(hwBinder, "");
            this.EZpvd = hwBinder.AEQbTJ();
            this.OLrzqt = hwBinder.EZpvd();
            this.AEQbTJ = hwBinder.KWHzl();
            this.KWHzl = hwBinder.OLrzqt();
            this.copydefault = hwBinder.copydefault();
            this.djBIcL = hwBinder.AYXKKw();
            this.AYXKKw = hwBinder.djBIcL();
            this.valueOf = hwBinder.AhwBna();
            this.gEmmrt = hwBinder.valueOf();
            this.AhwBna = hwBinder.gEmmrt();
            this.DbNXlk = hwBinder.isConnected();
            this.isConnected = hwBinder.AkhnZx();
        }

        public final HwBinder AEQbTJ() {
            return new HwBinder(this, null);
        }
    }
}
