package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FileBridge;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class FileBridge {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final DropBoxManager AYXKKw;
    public final java.lang.String AhwBna;
    public final Debug AkhnZx;
    public final ContactsContract AuCTel;
    public final java.lang.String DbNXlk;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;
    public final ScoredNetwork copydefault;
    public final DeviceIdleManager djBIcL;
    public final java.lang.String ejfBZ;
    public final java.lang.String fARcdN;
    public final C5173Hn fIwbmz;
    public final C5173Hn fJNWhG;
    public final C5173Hn fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final OnObbStateChangeListener isConnected;
    public final SynchronousResultReceiver valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FileBridge$ActionBar) A[MD:(o.FileBridge$ActionBar):void (m)] call: o.FileBridge.<init>(o.FileBridge$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FileBridge(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DropBoxManager AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnObbStateChangeListener DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ScoredNetwork KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn ejfBZ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Debug fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceIdleManager gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn values() {
        return this.fetchVPNInfo;
    }

    public FileBridge(ActionBar actionBar) {
        this.copydefault = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.copydefault();
        this.AEQbTJ = actionBar.OLrzqt();
        this.KWHzl = actionBar.gEmmrt();
        this.gEmmrt = actionBar.djBIcL();
        this.djBIcL = actionBar.AYXKKw();
        this.valueOf = actionBar.AhwBna();
        this.AhwBna = actionBar.valueOf();
        this.AYXKKw = actionBar.DbNXlk();
        this.values = actionBar.isConnected();
        this.AkhnZx = actionBar.values();
        this.DbNXlk = actionBar.AkhnZx();
        this.isConnected = actionBar.fetchVPNInfo();
        this.fetchVPNInfo = actionBar.AuCTel();
        this.fIwbmz = actionBar.fJNWhG();
        this.fJNWhG = actionBar.fIwbmz();
        this.ejfBZ = actionBar.fARcdN();
        this.fARcdN = actionBar.ejfBZ();
        this.AuCTel = actionBar.uzCIH();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FileBridge.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentClassifierProperties(");
        sb.append("classifierMetadata=*** Sensitive Data Redacted ***,");
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentClassifierArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("mode=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("modelKmsKeyId=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("sourceModelArn=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("trainingEndTime=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("trainingStartTime=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        sb.append("versionName=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.AuCTel);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ScoredNetwork scoredNetwork = this.copydefault;
        int iHashCode = scoredNetwork != null ? scoredNetwork.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode4 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        DeviceIdleManager deviceIdleManager = this.djBIcL;
        int iHashCode6 = deviceIdleManager != null ? deviceIdleManager.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.valueOf;
        int iHashCode7 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        DropBoxManager dropBoxManager = this.AYXKKw;
        int iHashCode9 = dropBoxManager != null ? dropBoxManager.hashCode() : 0;
        java.lang.String str5 = this.values;
        int iHashCode10 = str5 != null ? str5.hashCode() : 0;
        Debug debug = this.AkhnZx;
        int iHashCode11 = debug != null ? debug.hashCode() : 0;
        java.lang.String str6 = this.DbNXlk;
        int iHashCode12 = str6 != null ? str6.hashCode() : 0;
        OnObbStateChangeListener onObbStateChangeListener = this.isConnected;
        int iHashCode13 = onObbStateChangeListener != null ? onObbStateChangeListener.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fetchVPNInfo;
        int iHashCode14 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        C5173Hn c5173Hn3 = this.fIwbmz;
        int iHashCode15 = c5173Hn3 != null ? c5173Hn3.hashCode() : 0;
        C5173Hn c5173Hn4 = this.fJNWhG;
        int iHashCode16 = c5173Hn4 != null ? c5173Hn4.hashCode() : 0;
        java.lang.String str7 = this.ejfBZ;
        int iHashCode17 = str7 != null ? str7.hashCode() : 0;
        java.lang.String str8 = this.fARcdN;
        int iHashCode18 = str8 != null ? str8.hashCode() : 0;
        ContactsContract contactsContract = this.AuCTel;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FileBridge.class != obj.getClass()) {
            return false;
        }
        FileBridge fileBridge = (FileBridge) obj;
        return Intrinsics.EZpvd(this.copydefault, fileBridge.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fileBridge.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fileBridge.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, fileBridge.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) fileBridge.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, fileBridge.djBIcL) && Intrinsics.EZpvd(this.valueOf, fileBridge.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) fileBridge.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, fileBridge.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) fileBridge.values) && Intrinsics.EZpvd(this.AkhnZx, fileBridge.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) fileBridge.DbNXlk) && Intrinsics.EZpvd(this.isConnected, fileBridge.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, fileBridge.fetchVPNInfo) && Intrinsics.EZpvd(this.fIwbmz, fileBridge.fIwbmz) && Intrinsics.EZpvd(this.fJNWhG, fileBridge.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) fileBridge.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) fileBridge.fARcdN) && Intrinsics.EZpvd(this.AuCTel, fileBridge.AuCTel);
    }

    public static /* synthetic */ FileBridge copy$default(FileBridge fileBridge, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentClassifierProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FileBridge.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FileBridge.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(fileBridge);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public C5173Hn AEQbTJ;
        public DropBoxManager AYXKKw;
        public java.lang.String AhwBna;
        public OnObbStateChangeListener AkhnZx;
        public ContactsContract AuCTel;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public ScoredNetwork copydefault;
        public SynchronousResultReceiver djBIcL;
        public C5173Hn ejfBZ;
        public java.lang.String fARcdN;
        public java.lang.String fJNWhG;
        public Debug fetchVPNInfo;
        public DeviceIdleManager gEmmrt;
        public C5173Hn isConnected;
        public java.lang.String valueOf;
        public C5173Hn values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ScoredNetwork AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ContactsContract contactsContract) {
            this.AuCTel = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DeviceIdleManager deviceIdleManager) {
            this.gEmmrt = deviceIdleManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.values = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(OnObbStateChangeListener onObbStateChangeListener) {
            this.AkhnZx = onObbStateChangeListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceIdleManager AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(java.lang.String str) {
            this.fARcdN = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AuCTel() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DropBoxManager DbNXlk() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.ejfBZ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(SynchronousResultReceiver synchronousResultReceiver) {
            this.djBIcL = synchronousResultReceiver;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(DropBoxManager dropBoxManager) {
            this.AYXKKw = dropBoxManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ScoredNetwork scoredNetwork) {
            this.copydefault = scoredNetwork;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(Debug debug) {
            this.fetchVPNInfo = debug;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.isConnected = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String ejfBZ() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fARcdN() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn fIwbmz() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn fJNWhG() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnObbStateChangeListener fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract uzCIH() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.fJNWhG = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Debug values() {
            return this.fetchVPNInfo;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull FileBridge fileBridge) {
            this();
            Intrinsics.checkNotNullParameter(fileBridge, "");
            this.copydefault = fileBridge.KWHzl();
            this.OLrzqt = fileBridge.EZpvd();
            this.KWHzl = fileBridge.copydefault();
            this.AEQbTJ = fileBridge.AEQbTJ();
            this.EZpvd = fileBridge.OLrzqt();
            this.gEmmrt = fileBridge.gEmmrt();
            this.djBIcL = fileBridge.AYXKKw();
            this.AhwBna = fileBridge.valueOf();
            this.AYXKKw = fileBridge.AhwBna();
            this.valueOf = fileBridge.djBIcL();
            this.fetchVPNInfo = fileBridge.fetchVPNInfo();
            this.DbNXlk = fileBridge.isConnected();
            this.AkhnZx = fileBridge.DbNXlk();
            this.values = fileBridge.values();
            this.isConnected = fileBridge.AkhnZx();
            this.ejfBZ = fileBridge.ejfBZ();
            this.fJNWhG = fileBridge.fIwbmz();
            this.fARcdN = fileBridge.AuCTel();
            this.AuCTel = fileBridge.fJNWhG();
        }

        public final FileBridge EZpvd() {
            return new FileBridge(this, null);
        }
    }
}
