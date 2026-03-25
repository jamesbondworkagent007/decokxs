package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IServiceManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IServiceManager {
    public static final Application KWHzl = new Application(null);
    public final C5173Hn AEQbTJ;
    public final ServiceManagerNative AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final StorageManagerInternal DbNXlk;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final ContactsContract fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final StatsDimensionsValue gEmmrt;
    public final SynchronousResultReceiver isConnected;
    public final java.lang.String valueOf;
    public final C5173Hn values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IServiceManager$ActionBar) A[MD:(o.IServiceManager$ActionBar):void (m)] call: o.IServiceManager.<init>(o.IServiceManager$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IServiceManager(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract isConnected() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.AkhnZx;
    }

    public IServiceManager(ActionBar actionBar) {
        this.OLrzqt = actionBar.AEQbTJ();
        this.AEQbTJ = actionBar.KWHzl();
        this.EZpvd = actionBar.EZpvd();
        this.copydefault = actionBar.valueOf();
        this.AYXKKw = actionBar.gEmmrt();
        this.valueOf = actionBar.AhwBna();
        this.djBIcL = actionBar.djBIcL();
        this.AhwBna = actionBar.AYXKKw();
        this.gEmmrt = actionBar.DbNXlk();
        this.isConnected = actionBar.fetchVPNInfo();
        this.AkhnZx = actionBar.AkhnZx();
        this.DbNXlk = actionBar.values();
        this.values = actionBar.isConnected();
        this.fetchVPNInfo = actionBar.fJNWhG();
        this.fJNWhG = actionBar.AuCTel();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IServiceManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntitiesDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("entityRecognizerArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.fJNWhG);
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
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.AYXKKw;
        int iHashCode5 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.AhwBna;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.gEmmrt;
        int iHashCode9 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.isConnected;
        int iHashCode10 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str7 = this.AkhnZx;
        int iHashCode11 = str7 != null ? str7.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.DbNXlk;
        int iHashCode12 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.values;
        int iHashCode13 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str8 = this.fetchVPNInfo;
        int iHashCode14 = str8 != null ? str8.hashCode() : 0;
        ContactsContract contactsContract = this.fJNWhG;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IServiceManager.class != obj.getClass()) {
            return false;
        }
        IServiceManager iServiceManager = (IServiceManager) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) iServiceManager.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, iServiceManager.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) iServiceManager.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iServiceManager.copydefault) && Intrinsics.EZpvd(this.AYXKKw, iServiceManager.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) iServiceManager.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) iServiceManager.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) iServiceManager.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, iServiceManager.gEmmrt) && Intrinsics.EZpvd(this.isConnected, iServiceManager.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) iServiceManager.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, iServiceManager.DbNXlk) && Intrinsics.EZpvd(this.values, iServiceManager.values) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) iServiceManager.fetchVPNInfo) && Intrinsics.EZpvd(this.fJNWhG, iServiceManager.fJNWhG);
    }

    public static /* synthetic */ IServiceManager copy$default(IServiceManager iServiceManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntitiesDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IServiceManager.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IServiceManager.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(iServiceManager);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public ContactsContract AkhnZx;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public ServiceManagerNative OLrzqt;
        public C5173Hn copydefault;
        public SynchronousResultReceiver djBIcL;
        public C5173Hn fetchVPNInfo;
        public StatsDimensionsValue gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String valueOf;
        public StorageManagerInternal values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AuCTel() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue DbNXlk() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ContactsContract contactsContract) {
            this.AkhnZx = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ServiceManagerNative serviceManagerNative) {
            this.OLrzqt = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(StatsDimensionsValue statsDimensionsValue) {
            this.gEmmrt = statsDimensionsValue;
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
            this.fetchVPNInfo = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SynchronousResultReceiver synchronousResultReceiver) {
            this.djBIcL = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(StorageManagerInternal storageManagerInternal) {
            this.values = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fJNWhG() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver fetchVPNInfo() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal values() {
            return this.values;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull IServiceManager iServiceManager) {
            this();
            Intrinsics.checkNotNullParameter(iServiceManager, "");
            this.KWHzl = iServiceManager.EZpvd();
            this.copydefault = iServiceManager.KWHzl();
            this.EZpvd = iServiceManager.AEQbTJ();
            this.AEQbTJ = iServiceManager.OLrzqt();
            this.OLrzqt = iServiceManager.copydefault();
            this.AYXKKw = iServiceManager.djBIcL();
            this.AhwBna = iServiceManager.valueOf();
            this.valueOf = iServiceManager.AhwBna();
            this.gEmmrt = iServiceManager.gEmmrt();
            this.djBIcL = iServiceManager.AYXKKw();
            this.isConnected = iServiceManager.values();
            this.values = iServiceManager.DbNXlk();
            this.fetchVPNInfo = iServiceManager.AkhnZx();
            this.DbNXlk = iServiceManager.fetchVPNInfo();
            this.AkhnZx = iServiceManager.isConnected();
        }

        public final IServiceManager copydefault() {
            return new IServiceManager(this, null);
        }
    }
}
