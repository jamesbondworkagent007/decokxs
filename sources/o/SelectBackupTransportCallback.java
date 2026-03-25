package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SelectBackupTransportCallback;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SelectBackupTransportCallback {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final C5173Hn AYXKKw;
    public final NavigationRes AhwBna;
    public final java.lang.String AkhnZx;
    public final int AuCTel;
    public final BackupTransport AuCTelauCTel;
    public final DeviceAdminReceiver AubY;
    public final java.util.List<JobScheduler> AwvSrB;
    public final java.lang.String DbNXlk;
    public final CipherOutputStream EZpvd;
    public final java.util.List<AccountManagerCallback> OLrzqt;
    public final DoubleStream copydefault;
    public final java.lang.String djBIcL;
    public final ContextImpl ejfBZ;
    public final java.lang.String fARcdN;
    public final C5173Hn fIwbmz;
    public final RestoreSession fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final FloatRange gEmmrt;
    public final java.util.Map<java.lang.String, java.lang.String> gHZMYf;
    public final java.lang.String getFieldNames;
    public final java.util.List<SearchManager> getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final StringDef isConnected;
    public final Vr2dDisplayProperties iwGUEr;
    public final WallpaperBackupHelper sSMYrx;
    public final SharedPreferencesBackupHelper uzCIH;
    public final java.util.List<JobWorkItem> valueOf;
    public final java.lang.String values;
    public final java.lang.String wlaJM;
    public final FullBackup zLjUOn;
    public final java.lang.String zsXlph;
    public final JobInfo zuBGHE;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SelectBackupTransportCallback$ActionBar) A[MD:(o.SelectBackupTransportCallback$ActionBar):void (m)] call: o.SelectBackupTransportCallback.<init>(o.SelectBackupTransportCallback$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SelectBackupTransportCallback(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NavigationRes AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextImpl AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FullBackup AuCTelauCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackupTransport AubY() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<JobWorkItem> EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CipherOutputStream KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AccountManagerCallback> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoubleStream copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreSession fARcdN() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fIwbmz() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatRange gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WallpaperBackupHelper gHZMYf() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedPreferencesBackupHelper getFieldNames() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchManager> getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringDef isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String iwGUEr() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<JobScheduler> sSMYrx() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Vr2dDisplayProperties uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceAdminReceiver wlaJM() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> zsXlph() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JobInfo zuBGHE() {
        return this.zuBGHE;
    }

    public SelectBackupTransportCallback(ActionBar actionBar) {
        this.copydefault = actionBar.EZpvd();
        this.EZpvd = actionBar.OLrzqt();
        this.OLrzqt = actionBar.KWHzl();
        this.AEQbTJ = actionBar.djBIcL();
        this.valueOf = actionBar.AhwBna();
        this.AYXKKw = actionBar.valueOf();
        this.djBIcL = actionBar.gEmmrt();
        this.gEmmrt = actionBar.AYXKKw();
        this.AhwBna = actionBar.fetchVPNInfo();
        this.AkhnZx = actionBar.AkhnZx();
        this.isConnected = actionBar.values();
        this.DbNXlk = actionBar.isConnected();
        this.values = actionBar.DbNXlk();
        this.fetchVPNInfo = actionBar.fIwbmz();
        this.AuCTel = actionBar.ejfBZ();
        this.fARcdN = actionBar.fARcdN();
        this.ejfBZ = actionBar.fJNWhG();
        this.fIwbmz = actionBar.AuCTel();
        this.fJNWhG = actionBar.iwGUEr();
        this.getFieldNames = actionBar.hDKMBd();
        this.uzCIH = actionBar.uzCIH();
        this.getNewProxyInstance = actionBar.getFieldNames();
        this.hDKMBd = actionBar.getNewProxyInstance();
        this.iwGUEr = actionBar.AubY();
        this.wlaJM = actionBar.zLjUOn();
        this.zsXlph = actionBar.zsXlph();
        this.AubY = actionBar.wlaJM();
        this.AuCTelauCTel = actionBar.AuCTelauCTel();
        this.zLjUOn = actionBar.gHZMYf();
        this.gHZMYf = actionBar.sSMYrx();
        this.AwvSrB = actionBar.AxsJAY();
        this.zuBGHE = actionBar.zuBGHE();
        this.sSMYrx = actionBar.AwvSrB();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SelectBackupTransportCallback.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserPoolType(");
        sb.append("accountRecoverySetting=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("adminCreateUserConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("aliasAttributes=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("arn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("autoVerifiedAttributes=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("creationDate=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("customDomain=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("deletionProtection=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("deviceConfiguration=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("domain=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("emailConfiguration=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("emailConfigurationFailure=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("emailVerificationMessage=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("emailVerificationSubject=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("estimatedNumberOfUsers=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        sb.append("lambdaConfig=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedDate=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("mfaConfiguration=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.getFieldNames + AbstractJsonLexerKt.COMMA);
        sb.append("policies=" + this.uzCIH + AbstractJsonLexerKt.COMMA);
        sb.append("schemaAttributes=" + this.getNewProxyInstance + AbstractJsonLexerKt.COMMA);
        sb.append("smsAuthenticationMessage=" + this.hDKMBd + AbstractJsonLexerKt.COMMA);
        sb.append("smsConfiguration=" + this.iwGUEr + AbstractJsonLexerKt.COMMA);
        sb.append("smsConfigurationFailure=" + this.wlaJM + AbstractJsonLexerKt.COMMA);
        sb.append("smsVerificationMessage=" + this.zsXlph + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.AubY + AbstractJsonLexerKt.COMMA);
        sb.append("userAttributeUpdateSettings=" + this.AuCTelauCTel + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolAddOns=" + this.zLjUOn + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolTags=" + this.gHZMYf + AbstractJsonLexerKt.COMMA);
        sb.append("usernameAttributes=" + this.AwvSrB + AbstractJsonLexerKt.COMMA);
        sb.append("usernameConfiguration=" + this.zuBGHE + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("verificationMessageTemplate=");
        sb2.append(this.sSMYrx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        DoubleStream doubleStream = this.copydefault;
        int iHashCode = doubleStream != null ? doubleStream.hashCode() : 0;
        CipherOutputStream cipherOutputStream = this.EZpvd;
        int iHashCode2 = cipherOutputStream != null ? cipherOutputStream.hashCode() : 0;
        java.util.List<AccountManagerCallback> list = this.OLrzqt;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.util.List<JobWorkItem> list2 = this.valueOf;
        int iHashCode5 = list2 != null ? list2.hashCode() : 0;
        C5173Hn c5173Hn = this.AYXKKw;
        int iHashCode6 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        FloatRange floatRange = this.gEmmrt;
        int iHashCode8 = floatRange != null ? floatRange.hashCode() : 0;
        NavigationRes navigationRes = this.AhwBna;
        int iHashCode9 = navigationRes != null ? navigationRes.hashCode() : 0;
        java.lang.String str3 = this.AkhnZx;
        int iHashCode10 = str3 != null ? str3.hashCode() : 0;
        StringDef stringDef = this.isConnected;
        int iHashCode11 = stringDef != null ? stringDef.hashCode() : 0;
        java.lang.String str4 = this.DbNXlk;
        int iHashCode12 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.values;
        int iHashCode13 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.fetchVPNInfo;
        int iHashCode14 = str6 != null ? str6.hashCode() : 0;
        int i = this.AuCTel;
        java.lang.String str7 = this.fARcdN;
        int iHashCode15 = str7 != null ? str7.hashCode() : 0;
        ContextImpl contextImpl = this.ejfBZ;
        int iHashCode16 = contextImpl != null ? contextImpl.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fIwbmz;
        int iHashCode17 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        RestoreSession restoreSession = this.fJNWhG;
        int iHashCode18 = restoreSession != null ? restoreSession.hashCode() : 0;
        java.lang.String str8 = this.getFieldNames;
        int iHashCode19 = str8 != null ? str8.hashCode() : 0;
        SharedPreferencesBackupHelper sharedPreferencesBackupHelper = this.uzCIH;
        int iHashCode20 = sharedPreferencesBackupHelper != null ? sharedPreferencesBackupHelper.hashCode() : 0;
        java.util.List<SearchManager> list3 = this.getNewProxyInstance;
        int iHashCode21 = list3 != null ? list3.hashCode() : 0;
        java.lang.String str9 = this.hDKMBd;
        int iHashCode22 = str9 != null ? str9.hashCode() : 0;
        Vr2dDisplayProperties vr2dDisplayProperties = this.iwGUEr;
        int iHashCode23 = vr2dDisplayProperties != null ? vr2dDisplayProperties.hashCode() : 0;
        java.lang.String str10 = this.wlaJM;
        int iHashCode24 = str10 != null ? str10.hashCode() : 0;
        java.lang.String str11 = this.zsXlph;
        int iHashCode25 = str11 != null ? str11.hashCode() : 0;
        DeviceAdminReceiver deviceAdminReceiver = this.AubY;
        int iHashCode26 = deviceAdminReceiver != null ? deviceAdminReceiver.hashCode() : 0;
        BackupTransport backupTransport = this.AuCTelauCTel;
        int iHashCode27 = backupTransport != null ? backupTransport.hashCode() : 0;
        FullBackup fullBackup = this.zLjUOn;
        int iHashCode28 = fullBackup != null ? fullBackup.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.gHZMYf;
        int iHashCode29 = map != null ? map.hashCode() : 0;
        java.util.List<JobScheduler> list4 = this.AwvSrB;
        int iHashCode30 = list4 != null ? list4.hashCode() : 0;
        JobInfo jobInfo = this.zuBGHE;
        int iHashCode31 = jobInfo != null ? jobInfo.hashCode() : 0;
        WallpaperBackupHelper wallpaperBackupHelper = this.sSMYrx;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + i) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (wallpaperBackupHelper != null ? wallpaperBackupHelper.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectBackupTransportCallback.class != obj.getClass()) {
            return false;
        }
        SelectBackupTransportCallback selectBackupTransportCallback = (SelectBackupTransportCallback) obj;
        return Intrinsics.EZpvd(this.copydefault, selectBackupTransportCallback.copydefault) && Intrinsics.EZpvd(this.EZpvd, selectBackupTransportCallback.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, selectBackupTransportCallback.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) selectBackupTransportCallback.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, selectBackupTransportCallback.valueOf) && Intrinsics.EZpvd(this.AYXKKw, selectBackupTransportCallback.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) selectBackupTransportCallback.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, selectBackupTransportCallback.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, selectBackupTransportCallback.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) selectBackupTransportCallback.AkhnZx) && Intrinsics.EZpvd(this.isConnected, selectBackupTransportCallback.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) selectBackupTransportCallback.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) selectBackupTransportCallback.values) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) selectBackupTransportCallback.fetchVPNInfo) && this.AuCTel == selectBackupTransportCallback.AuCTel && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) selectBackupTransportCallback.fARcdN) && Intrinsics.EZpvd(this.ejfBZ, selectBackupTransportCallback.ejfBZ) && Intrinsics.EZpvd(this.fIwbmz, selectBackupTransportCallback.fIwbmz) && Intrinsics.EZpvd(this.fJNWhG, selectBackupTransportCallback.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.getFieldNames, (java.lang.Object) selectBackupTransportCallback.getFieldNames) && Intrinsics.EZpvd(this.uzCIH, selectBackupTransportCallback.uzCIH) && Intrinsics.EZpvd(this.getNewProxyInstance, selectBackupTransportCallback.getNewProxyInstance) && Intrinsics.EZpvd((java.lang.Object) this.hDKMBd, (java.lang.Object) selectBackupTransportCallback.hDKMBd) && Intrinsics.EZpvd(this.iwGUEr, selectBackupTransportCallback.iwGUEr) && Intrinsics.EZpvd((java.lang.Object) this.wlaJM, (java.lang.Object) selectBackupTransportCallback.wlaJM) && Intrinsics.EZpvd((java.lang.Object) this.zsXlph, (java.lang.Object) selectBackupTransportCallback.zsXlph) && Intrinsics.EZpvd(this.AubY, selectBackupTransportCallback.AubY) && Intrinsics.EZpvd(this.AuCTelauCTel, selectBackupTransportCallback.AuCTelauCTel) && Intrinsics.EZpvd(this.zLjUOn, selectBackupTransportCallback.zLjUOn) && Intrinsics.EZpvd(this.gHZMYf, selectBackupTransportCallback.gHZMYf) && Intrinsics.EZpvd(this.AwvSrB, selectBackupTransportCallback.AwvSrB) && Intrinsics.EZpvd(this.zuBGHE, selectBackupTransportCallback.zuBGHE) && Intrinsics.EZpvd(this.sSMYrx, selectBackupTransportCallback.sSMYrx);
    }

    public static /* synthetic */ SelectBackupTransportCallback copy$default(SelectBackupTransportCallback selectBackupTransportCallback, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SelectBackupTransportCallback.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SelectBackupTransportCallback.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(selectBackupTransportCallback);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public java.util.List<? extends AccountManagerCallback> AEQbTJ;
        public C5173Hn AYXKKw;
        public NavigationRes AhwBna;
        public StringDef AkhnZx;
        public ContextImpl AuCTel;
        public DeviceAdminReceiver AuCTelauCTel;
        public java.util.Map<java.lang.String, java.lang.String> AubY;
        public JobInfo AwvSrB;
        public WallpaperBackupHelper AxsJAY;
        public java.lang.String DbNXlk;
        public DoubleStream EZpvd;
        public CipherOutputStream KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<? extends JobWorkItem> copydefault;
        public java.lang.String djBIcL;
        public java.lang.String ejfBZ;
        public RestoreSession fARcdN;
        public C5173Hn fIwbmz;
        public java.lang.String fJNWhG;
        public int fetchVPNInfo;
        public java.lang.String gEmmrt;
        public SharedPreferencesBackupHelper getFieldNames;
        public Vr2dDisplayProperties getNewProxyInstance;
        public java.util.List<SearchManager> hDKMBd;
        public java.lang.String isConnected;
        public java.lang.String iwGUEr;
        public java.lang.String uzCIH;
        public FloatRange valueOf;
        public java.lang.String values;
        public java.lang.String wlaJM;
        public FullBackup zLjUOn;
        public BackupTransport zsXlph;
        public java.util.List<? extends JobScheduler> zuBGHE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<? extends JobScheduler> list) {
            this.zuBGHE = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(FloatRange floatRange) {
            this.valueOf = floatRange;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(FullBackup fullBackup) {
            this.zLjUOn = fullBackup;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.fIwbmz = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(NavigationRes navigationRes) {
            this.AhwBna = navigationRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatRange AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(java.lang.String str) {
            this.uzCIH = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.JobWorkItem>, java.util.List<o.JobWorkItem> */
        public final java.util.List<JobWorkItem> AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.String str) {
            this.ejfBZ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AuCTel() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BackupTransport AuCTelauCTel() {
            return this.zsXlph;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Vr2dDisplayProperties AubY() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WallpaperBackupHelper AwvSrB() {
            return this.AxsJAY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.JobScheduler>, java.util.List<o.JobScheduler> */
        public final java.util.List<JobScheduler> AxsJAY() {
            return this.zuBGHE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DoubleStream EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
            this.AubY = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.AYXKKw = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(JobInfo jobInfo) {
            this.AwvSrB = jobInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Vr2dDisplayProperties vr2dDisplayProperties) {
            this.getNewProxyInstance = vr2dDisplayProperties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.AccountManagerCallback>, java.util.List<o.AccountManagerCallback> */
        public final java.util.List<AccountManagerCallback> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<? extends JobWorkItem> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(CipherOutputStream cipherOutputStream) {
            this.KWHzl = cipherOutputStream;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(StringDef stringDef) {
            this.AkhnZx = stringDef;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CipherOutputStream OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.fetchVPNInfo = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<SearchManager> list) {
            this.hDKMBd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(BackupTransport backupTransport) {
            this.zsXlph = backupTransport;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(DeviceAdminReceiver deviceAdminReceiver) {
            this.AuCTelauCTel = deviceAdminReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(DoubleStream doubleStream) {
            this.EZpvd = doubleStream;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RestoreSession restoreSession) {
            this.fARcdN = restoreSession;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(WallpaperBackupHelper wallpaperBackupHelper) {
            this.AxsJAY = wallpaperBackupHelper;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<? extends AccountManagerCallback> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ContextImpl contextImpl) {
            this.AuCTel = contextImpl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(SharedPreferencesBackupHelper sharedPreferencesBackupHelper) {
            this.getFieldNames = sharedPreferencesBackupHelper;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int ejfBZ() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fARcdN() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fIwbmz() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContextImpl fJNWhG() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NavigationRes fetchVPNInfo() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(java.lang.String str) {
            this.iwGUEr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullBackup gHZMYf() {
            return this.zLjUOn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SearchManager> getFieldNames() {
            return this.hDKMBd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String getNewProxyInstance() {
            return this.uzCIH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String hDKMBd() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void isConnected(java.lang.String str) {
            this.wlaJM = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreSession iwGUEr() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> sSMYrx() {
            return this.AubY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedPreferencesBackupHelper uzCIH() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.fJNWhG = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StringDef values() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceAdminReceiver wlaJM() {
            return this.AuCTelauCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String zLjUOn() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String zsXlph() {
            return this.wlaJM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JobInfo zuBGHE() {
            return this.AwvSrB;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull SelectBackupTransportCallback selectBackupTransportCallback) {
            this();
            Intrinsics.checkNotNullParameter(selectBackupTransportCallback, "");
            this.EZpvd = selectBackupTransportCallback.copydefault();
            this.KWHzl = selectBackupTransportCallback.KWHzl();
            this.AEQbTJ = selectBackupTransportCallback.OLrzqt();
            this.OLrzqt = selectBackupTransportCallback.AEQbTJ();
            this.copydefault = selectBackupTransportCallback.EZpvd();
            this.AYXKKw = selectBackupTransportCallback.djBIcL();
            this.djBIcL = selectBackupTransportCallback.valueOf();
            this.valueOf = selectBackupTransportCallback.gEmmrt();
            this.AhwBna = selectBackupTransportCallback.AYXKKw();
            this.gEmmrt = selectBackupTransportCallback.AhwBna();
            this.AkhnZx = selectBackupTransportCallback.isConnected();
            this.values = selectBackupTransportCallback.DbNXlk();
            this.isConnected = selectBackupTransportCallback.values();
            this.DbNXlk = selectBackupTransportCallback.fetchVPNInfo();
            this.fetchVPNInfo = selectBackupTransportCallback.AkhnZx();
            this.ejfBZ = selectBackupTransportCallback.ejfBZ();
            this.AuCTel = selectBackupTransportCallback.AuCTel();
            this.fIwbmz = selectBackupTransportCallback.fJNWhG();
            this.fARcdN = selectBackupTransportCallback.fARcdN();
            this.fJNWhG = selectBackupTransportCallback.fIwbmz();
            this.getFieldNames = selectBackupTransportCallback.getFieldNames();
            this.hDKMBd = selectBackupTransportCallback.getNewProxyInstance();
            this.uzCIH = selectBackupTransportCallback.iwGUEr();
            this.getNewProxyInstance = selectBackupTransportCallback.uzCIH();
            this.iwGUEr = selectBackupTransportCallback.hDKMBd();
            this.wlaJM = selectBackupTransportCallback.zLjUOn();
            this.AuCTelauCTel = selectBackupTransportCallback.wlaJM();
            this.zsXlph = selectBackupTransportCallback.AubY();
            this.zLjUOn = selectBackupTransportCallback.AuCTelauCTel();
            this.AubY = selectBackupTransportCallback.zsXlph();
            this.zuBGHE = selectBackupTransportCallback.sSMYrx();
            this.AwvSrB = selectBackupTransportCallback.zuBGHE();
            this.AxsJAY = selectBackupTransportCallback.gHZMYf();
        }

        public final SelectBackupTransportCallback AEQbTJ() {
            return new SelectBackupTransportCallback(this, null);
        }
    }
}
