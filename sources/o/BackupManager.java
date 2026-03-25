package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BackupManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BackupManager {
    public static final Application KWHzl = new Application(null);
    public final java.util.List<java.lang.String> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final AccountsException AhwBna;
    public final java.lang.String AkhnZx;
    public final java.util.List<java.lang.String> AuCTel;
    public final java.util.List<TransitionRes> DbNXlk;
    public final java.lang.Boolean EZpvd;
    public final java.util.List<NotificationManager> OLrzqt;
    public final java.lang.Integer copydefault;
    public final java.util.List<java.lang.String> djBIcL;
    public final java.util.List<java.lang.String> ejfBZ;
    public final java.util.List<java.lang.String> fARcdN;
    public final PictureInPictureArgs fIwbmz;
    public final java.lang.Integer fJNWhG;
    public final java.lang.Boolean fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final DevicePolicyManagerInternal getFieldNames;
    public final java.lang.String hDKMBd;
    public final java.lang.Boolean isConnected;
    public final java.util.List<java.lang.String> iwGUEr;
    public final java.lang.Integer valueOf;
    public final java.lang.Integer values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupManager$TaskDescription) A[MD:(o.BackupManager$TaskDescription):void (m)] call: o.BackupManager.<init>(o.BackupManager$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupManager(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AkhnZx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountsException OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NotificationManager> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PictureInPictureArgs ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevicePolicyManagerInternal fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TransitionRes> fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer values() {
        return this.values;
    }

    public BackupManager(TaskDescription taskDescription) {
        this.copydefault = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.KWHzl();
        this.AhwBna = taskDescription.AYXKKw();
        this.valueOf = taskDescription.djBIcL();
        this.djBIcL = taskDescription.AhwBna();
        this.gEmmrt = taskDescription.gEmmrt();
        this.AYXKKw = taskDescription.valueOf();
        this.AkhnZx = taskDescription.fetchVPNInfo();
        this.fetchVPNInfo = taskDescription.AkhnZx();
        this.isConnected = taskDescription.values();
        this.DbNXlk = taskDescription.DbNXlk();
        this.values = taskDescription.isConnected();
        this.ejfBZ = taskDescription.AuCTel();
        this.fIwbmz = taskDescription.fIwbmz();
        this.AuCTel = taskDescription.fARcdN();
        this.fJNWhG = taskDescription.fJNWhG();
        this.fARcdN = taskDescription.ejfBZ();
        this.getFieldNames = taskDescription.getNewProxyInstance();
        this.hDKMBd = taskDescription.uzCIH();
        this.iwGUEr = taskDescription.hDKMBd();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateUserPoolClientRequest(");
        sb.append("accessTokenValidity=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("allowedOAuthFlows=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("allowedOAuthFlowsUserPoolClient=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("allowedOAuthScopes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("analyticsConfiguration=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("authSessionValidity=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("callbackUrls=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("defaultRedirectUri=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("enablePropagateAdditionalUserContextData=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("enableTokenRevocation=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("explicitAuthFlows=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("idTokenValidity=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("logoutUrls=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("preventUserExistenceErrors=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("readAttributes=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("refreshTokenValidity=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        sb.append("supportedIdentityProviders=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        sb.append("tokenValidityUnits=" + this.getFieldNames + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.hDKMBd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("writeAttributes=");
        sb2.append(this.iwGUEr);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.util.List<NotificationManager> list = this.OLrzqt;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Boolean bool = this.EZpvd;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.AEQbTJ;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        AccountsException accountsException = this.AhwBna;
        int iHashCode4 = accountsException != null ? accountsException.hashCode() : 0;
        java.lang.Integer num2 = this.valueOf;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.util.List<java.lang.String> list3 = this.djBIcL;
        int iHashCode5 = list3 != null ? list3.hashCode() : 0;
        java.lang.String str = this.gEmmrt;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AkhnZx;
        int iHashCode8 = str3 != null ? str3.hashCode() : 0;
        java.lang.Boolean bool2 = this.fetchVPNInfo;
        int iHashCode9 = bool2 != null ? bool2.hashCode() : 0;
        java.lang.Boolean bool3 = this.isConnected;
        int iHashCode10 = bool3 != null ? bool3.hashCode() : 0;
        java.util.List<TransitionRes> list4 = this.DbNXlk;
        int iHashCode11 = list4 != null ? list4.hashCode() : 0;
        java.lang.Integer num3 = this.values;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        java.util.List<java.lang.String> list5 = this.ejfBZ;
        int iHashCode12 = list5 != null ? list5.hashCode() : 0;
        PictureInPictureArgs pictureInPictureArgs = this.fIwbmz;
        int iHashCode13 = pictureInPictureArgs != null ? pictureInPictureArgs.hashCode() : 0;
        java.util.List<java.lang.String> list6 = this.AuCTel;
        int iHashCode14 = list6 != null ? list6.hashCode() : 0;
        java.lang.Integer num4 = this.fJNWhG;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        java.util.List<java.lang.String> list7 = this.fARcdN;
        int iHashCode15 = list7 != null ? list7.hashCode() : 0;
        DevicePolicyManagerInternal devicePolicyManagerInternal = this.getFieldNames;
        int iHashCode16 = devicePolicyManagerInternal != null ? devicePolicyManagerInternal.hashCode() : 0;
        java.lang.String str4 = this.hDKMBd;
        int iHashCode17 = str4 != null ? str4.hashCode() : 0;
        java.util.List<java.lang.String> list8 = this.iwGUEr;
        return (((((((((((((((((((((((((((((((((((((((((iIntValue * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iIntValue2) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iIntValue3) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iIntValue4) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (list8 != null ? list8.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BackupManager.class != obj.getClass()) {
            return false;
        }
        BackupManager backupManager = (BackupManager) obj;
        return Intrinsics.EZpvd(this.copydefault, backupManager.copydefault) && Intrinsics.EZpvd(this.OLrzqt, backupManager.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, backupManager.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, backupManager.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, backupManager.AhwBna) && Intrinsics.EZpvd(this.valueOf, backupManager.valueOf) && Intrinsics.EZpvd(this.djBIcL, backupManager.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) backupManager.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) backupManager.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) backupManager.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, backupManager.fetchVPNInfo) && Intrinsics.EZpvd(this.isConnected, backupManager.isConnected) && Intrinsics.EZpvd(this.DbNXlk, backupManager.DbNXlk) && Intrinsics.EZpvd(this.values, backupManager.values) && Intrinsics.EZpvd(this.ejfBZ, backupManager.ejfBZ) && Intrinsics.EZpvd(this.fIwbmz, backupManager.fIwbmz) && Intrinsics.EZpvd(this.AuCTel, backupManager.AuCTel) && Intrinsics.EZpvd(this.fJNWhG, backupManager.fJNWhG) && Intrinsics.EZpvd(this.fARcdN, backupManager.fARcdN) && Intrinsics.EZpvd(this.getFieldNames, backupManager.getFieldNames) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) backupManager.hDKMBd) && Intrinsics.EZpvd(this.iwGUEr, backupManager.iwGUEr);
    }

    public static /* synthetic */ BackupManager copy$default(BackupManager backupManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateUserPoolClientRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BackupManager.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BackupManager.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(backupManager);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public java.lang.Boolean AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.Boolean AkhnZx;
        public DevicePolicyManagerInternal AuCTel;
        public java.util.List<java.lang.String> DbNXlk;
        public AccountsException EZpvd;
        public java.util.List<? extends NotificationManager> KWHzl;
        public java.lang.Integer OLrzqt;
        public java.util.List<java.lang.String> copydefault;
        public java.lang.String djBIcL;
        public PictureInPictureArgs ejfBZ;
        public java.util.List<java.lang.String> fARcdN;
        public java.lang.Integer fIwbmz;
        public java.util.List<java.lang.String> fJNWhG;
        public java.util.List<? extends TransitionRes> fetchVPNInfo;
        public java.lang.Integer gEmmrt;
        public java.util.List<java.lang.String> getNewProxyInstance;
        public java.lang.String hDKMBd;
        public java.lang.Integer isConnected;
        public java.util.List<java.lang.String> valueOf;
        public java.lang.Boolean values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.NotificationManager>, java.util.List<o.NotificationManager> */
        public final java.util.List<NotificationManager> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountsException AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AuCTel() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.TransitionRes>, java.util.List<o.TransitionRes> */
        public final java.util.List<TransitionRes> DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> ejfBZ() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> fARcdN() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PictureInPictureArgs fIwbmz() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer fJNWhG() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DevicePolicyManagerInternal getNewProxyInstance() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> hDKMBd() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String uzCIH() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean values() {
            return this.AkhnZx;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull BackupManager backupManager) {
            this();
            Intrinsics.checkNotNullParameter(backupManager, "");
            this.OLrzqt = backupManager.EZpvd();
            this.KWHzl = backupManager.copydefault();
            this.AEQbTJ = backupManager.AEQbTJ();
            this.copydefault = backupManager.KWHzl();
            this.EZpvd = backupManager.OLrzqt();
            this.gEmmrt = backupManager.AYXKKw();
            this.valueOf = backupManager.AhwBna();
            this.AhwBna = backupManager.gEmmrt();
            this.djBIcL = backupManager.valueOf();
            this.AYXKKw = backupManager.djBIcL();
            this.values = backupManager.DbNXlk();
            this.AkhnZx = backupManager.isConnected();
            this.fetchVPNInfo = backupManager.fetchVPNInfo();
            this.isConnected = backupManager.values();
            this.DbNXlk = backupManager.AkhnZx();
            this.ejfBZ = backupManager.ejfBZ();
            this.fJNWhG = backupManager.fARcdN();
            this.fIwbmz = backupManager.AuCTel();
            this.fARcdN = backupManager.fJNWhG();
            this.AuCTel = backupManager.fIwbmz();
            this.hDKMBd = backupManager.getNewProxyInstance();
            this.getNewProxyInstance = backupManager.uzCIH();
        }

        public final BackupManager OLrzqt() {
            return new BackupManager(this, null);
        }
    }
}
