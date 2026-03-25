package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AnimatorRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AnimatorRes {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final NavigationRes AYXKKw;
    public final java.lang.String AhwBna;
    public final ContextImpl AkhnZx;
    public final java.lang.String AuCTel;
    public final java.util.List<SearchManager> DbNXlk;
    public final CipherOutputStream EZpvd;
    public final DoubleStream KWHzl;
    public final java.util.List<JobWorkItem> OLrzqt;
    public final java.util.List<AccountManagerCallback> copydefault;
    public final java.lang.String djBIcL;
    public final Vr2dDisplayProperties ejfBZ;
    public final FullBackup fARcdN;
    public final BackupTransport fIwbmz;
    public final java.lang.String fJNWhG;
    public final SharedPreferencesBackupHelper fetchVPNInfo;
    public final StringDef gEmmrt;
    public final WallpaperBackupHelper getNewProxyInstance;
    public final java.util.List<JobScheduler> hDKMBd;
    public final java.lang.String isConnected;
    public final java.util.Map<java.lang.String, java.lang.String> iwGUEr;
    public final JobInfo uzCIH;
    public final FloatRange valueOf;
    public final RestoreSession values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AnimatorRes$Activity) A[MD:(o.AnimatorRes$Activity):void (m)] call: o.AnimatorRes.<init>(o.AnimatorRes$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AnimatorRes(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CipherOutputStream AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextImpl AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SearchManager> AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedPreferencesBackupHelper DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoubleStream EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatRange KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<JobWorkItem> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AccountManagerCallback> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NavigationRes djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> ejfBZ() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Vr2dDisplayProperties fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FullBackup fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackupTransport fJNWhG() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JobInfo getFieldNames() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WallpaperBackupHelper getNewProxyInstance() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreSession isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<JobScheduler> uzCIH() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringDef valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.isConnected;
    }

    public AnimatorRes(Activity activity) {
        this.KWHzl = activity.KWHzl();
        this.EZpvd = activity.OLrzqt();
        this.copydefault = activity.AEQbTJ();
        this.OLrzqt = activity.EZpvd();
        this.valueOf = activity.gEmmrt();
        this.AYXKKw = activity.djBIcL();
        this.gEmmrt = activity.valueOf();
        this.djBIcL = activity.AYXKKw();
        this.AhwBna = activity.AhwBna();
        this.AkhnZx = activity.isConnected();
        this.values = activity.values();
        this.fetchVPNInfo = activity.fetchVPNInfo();
        this.isConnected = activity.DbNXlk();
        this.DbNXlk = activity.AkhnZx();
        this.AuCTel = activity.fIwbmz();
        this.ejfBZ = activity.fJNWhG();
        this.fJNWhG = activity.AuCTel();
        this.fIwbmz = activity.ejfBZ();
        this.fARcdN = activity.fARcdN();
        this.iwGUEr = activity.hDKMBd();
        this.hDKMBd = activity.getNewProxyInstance();
        this.uzCIH = activity.uzCIH();
        this.getNewProxyInstance = activity.getFieldNames();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AnimatorRes.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateUserPoolRequest(");
        sb.append("accountRecoverySetting=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("adminCreateUserConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("aliasAttributes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("autoVerifiedAttributes=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("deletionProtection=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("deviceConfiguration=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("emailConfiguration=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("emailVerificationMessage=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("emailVerificationSubject=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("lambdaConfig=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("mfaConfiguration=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("policies=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("poolName=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("schema=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("smsAuthenticationMessage=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("smsConfiguration=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("smsVerificationMessage=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        sb.append("userAttributeUpdateSettings=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolAddOns=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolTags=" + this.iwGUEr + AbstractJsonLexerKt.COMMA);
        sb.append("usernameAttributes=" + this.hDKMBd + AbstractJsonLexerKt.COMMA);
        sb.append("usernameConfiguration=" + this.uzCIH + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("verificationMessageTemplate=");
        sb2.append(this.getNewProxyInstance);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        DoubleStream doubleStream = this.KWHzl;
        int iHashCode = doubleStream != null ? doubleStream.hashCode() : 0;
        CipherOutputStream cipherOutputStream = this.EZpvd;
        int iHashCode2 = cipherOutputStream != null ? cipherOutputStream.hashCode() : 0;
        java.util.List<AccountManagerCallback> list = this.copydefault;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.util.List<JobWorkItem> list2 = this.OLrzqt;
        int iHashCode4 = list2 != null ? list2.hashCode() : 0;
        FloatRange floatRange = this.valueOf;
        int iHashCode5 = floatRange != null ? floatRange.hashCode() : 0;
        NavigationRes navigationRes = this.AYXKKw;
        int iHashCode6 = navigationRes != null ? navigationRes.hashCode() : 0;
        StringDef stringDef = this.gEmmrt;
        int iHashCode7 = stringDef != null ? stringDef.hashCode() : 0;
        java.lang.String str = this.djBIcL;
        int iHashCode8 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode9 = str2 != null ? str2.hashCode() : 0;
        ContextImpl contextImpl = this.AkhnZx;
        int iHashCode10 = contextImpl != null ? contextImpl.hashCode() : 0;
        RestoreSession restoreSession = this.values;
        int iHashCode11 = restoreSession != null ? restoreSession.hashCode() : 0;
        SharedPreferencesBackupHelper sharedPreferencesBackupHelper = this.fetchVPNInfo;
        int iHashCode12 = sharedPreferencesBackupHelper != null ? sharedPreferencesBackupHelper.hashCode() : 0;
        java.lang.String str3 = this.isConnected;
        int iHashCode13 = str3 != null ? str3.hashCode() : 0;
        java.util.List<SearchManager> list3 = this.DbNXlk;
        int iHashCode14 = list3 != null ? list3.hashCode() : 0;
        java.lang.String str4 = this.AuCTel;
        int iHashCode15 = str4 != null ? str4.hashCode() : 0;
        Vr2dDisplayProperties vr2dDisplayProperties = this.ejfBZ;
        int iHashCode16 = vr2dDisplayProperties != null ? vr2dDisplayProperties.hashCode() : 0;
        java.lang.String str5 = this.fJNWhG;
        int iHashCode17 = str5 != null ? str5.hashCode() : 0;
        BackupTransport backupTransport = this.fIwbmz;
        int iHashCode18 = backupTransport != null ? backupTransport.hashCode() : 0;
        FullBackup fullBackup = this.fARcdN;
        int iHashCode19 = fullBackup != null ? fullBackup.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.iwGUEr;
        int iHashCode20 = map != null ? map.hashCode() : 0;
        java.util.List<JobScheduler> list4 = this.hDKMBd;
        int iHashCode21 = list4 != null ? list4.hashCode() : 0;
        JobInfo jobInfo = this.uzCIH;
        int iHashCode22 = jobInfo != null ? jobInfo.hashCode() : 0;
        WallpaperBackupHelper wallpaperBackupHelper = this.getNewProxyInstance;
        return (((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + (wallpaperBackupHelper != null ? wallpaperBackupHelper.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnimatorRes.class != obj.getClass()) {
            return false;
        }
        AnimatorRes animatorRes = (AnimatorRes) obj;
        return Intrinsics.EZpvd(this.KWHzl, animatorRes.KWHzl) && Intrinsics.EZpvd(this.EZpvd, animatorRes.EZpvd) && Intrinsics.EZpvd(this.copydefault, animatorRes.copydefault) && Intrinsics.EZpvd(this.OLrzqt, animatorRes.OLrzqt) && Intrinsics.EZpvd(this.valueOf, animatorRes.valueOf) && Intrinsics.EZpvd(this.AYXKKw, animatorRes.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, animatorRes.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) animatorRes.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) animatorRes.AhwBna) && Intrinsics.EZpvd(this.AkhnZx, animatorRes.AkhnZx) && Intrinsics.EZpvd(this.values, animatorRes.values) && Intrinsics.EZpvd(this.fetchVPNInfo, animatorRes.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) animatorRes.isConnected) && Intrinsics.EZpvd(this.DbNXlk, animatorRes.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) animatorRes.AuCTel) && Intrinsics.EZpvd(this.ejfBZ, animatorRes.ejfBZ) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) animatorRes.fJNWhG) && Intrinsics.EZpvd(this.fIwbmz, animatorRes.fIwbmz) && Intrinsics.EZpvd(this.fARcdN, animatorRes.fARcdN) && Intrinsics.EZpvd(this.iwGUEr, animatorRes.iwGUEr) && Intrinsics.EZpvd(this.hDKMBd, animatorRes.hDKMBd) && Intrinsics.EZpvd(this.uzCIH, animatorRes.uzCIH) && Intrinsics.EZpvd(this.getNewProxyInstance, animatorRes.getNewProxyInstance);
    }

    public static /* synthetic */ AnimatorRes copy$default(AnimatorRes animatorRes, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateUserPoolRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimatorRes.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimatorRes.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(animatorRes);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.util.List<? extends AccountManagerCallback> AEQbTJ;
        public java.lang.String AYXKKw;
        public ContextImpl AhwBna;
        public java.lang.String AkhnZx;
        public java.util.Map<java.lang.String, java.lang.String> AuCTel;
        public SharedPreferencesBackupHelper DbNXlk;
        public DoubleStream EZpvd;
        public java.util.List<? extends JobWorkItem> KWHzl;
        public CipherOutputStream OLrzqt;
        public FloatRange copydefault;
        public java.lang.String djBIcL;
        public BackupTransport ejfBZ;
        public Vr2dDisplayProperties fARcdN;
        public FullBackup fIwbmz;
        public java.lang.String fJNWhG;
        public java.util.List<SearchManager> fetchVPNInfo;
        public StringDef gEmmrt;
        public JobInfo getFieldNames;
        public WallpaperBackupHelper getNewProxyInstance;
        public RestoreSession isConnected;
        public java.util.List<? extends JobScheduler> iwGUEr;
        public NavigationRes valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.AccountManagerCallback>, java.util.List<o.AccountManagerCallback> */
        public final java.util.List<AccountManagerCallback> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SearchManager> AkhnZx() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.JobWorkItem>, java.util.List<o.JobWorkItem> */
        public final java.util.List<JobWorkItem> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DoubleStream KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CipherOutputStream OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NavigationRes djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BackupTransport ejfBZ() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullBackup fARcdN() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fIwbmz() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Vr2dDisplayProperties fJNWhG() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedPreferencesBackupHelper fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatRange gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WallpaperBackupHelper getFieldNames() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.JobScheduler>, java.util.List<o.JobScheduler> */
        public final java.util.List<JobScheduler> getNewProxyInstance() {
            return this.iwGUEr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> hDKMBd() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContextImpl isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JobInfo uzCIH() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StringDef valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreSession values() {
            return this.isConnected;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AnimatorRes animatorRes) {
            this();
            Intrinsics.checkNotNullParameter(animatorRes, "");
            this.EZpvd = animatorRes.EZpvd();
            this.OLrzqt = animatorRes.AEQbTJ();
            this.AEQbTJ = animatorRes.copydefault();
            this.KWHzl = animatorRes.OLrzqt();
            this.copydefault = animatorRes.KWHzl();
            this.valueOf = animatorRes.djBIcL();
            this.gEmmrt = animatorRes.valueOf();
            this.AYXKKw = animatorRes.AYXKKw();
            this.djBIcL = animatorRes.gEmmrt();
            this.AhwBna = animatorRes.AhwBna();
            this.isConnected = animatorRes.isConnected();
            this.DbNXlk = animatorRes.DbNXlk();
            this.AkhnZx = animatorRes.values();
            this.fetchVPNInfo = animatorRes.AkhnZx();
            this.values = animatorRes.fetchVPNInfo();
            this.fARcdN = animatorRes.fARcdN();
            this.fJNWhG = animatorRes.AuCTel();
            this.ejfBZ = animatorRes.fJNWhG();
            this.fIwbmz = animatorRes.fIwbmz();
            this.AuCTel = animatorRes.ejfBZ();
            this.iwGUEr = animatorRes.uzCIH();
            this.getFieldNames = animatorRes.getFieldNames();
            this.getNewProxyInstance = animatorRes.getNewProxyInstance();
        }

        public final AnimatorRes copydefault() {
            return new AnimatorRes(this, null);
        }
    }
}
