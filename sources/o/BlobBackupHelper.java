package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BlobBackupHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BlobBackupHelper {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final java.lang.String AYXKKw;
    public final NavigationRes AhwBna;
    public final java.lang.String AkhnZx;
    public final BackupTransport AuCTel;
    public final Vr2dDisplayProperties DbNXlk;
    public final java.util.List<JobWorkItem> EZpvd;
    public final FloatRange KWHzl;
    public final DoubleStream OLrzqt;
    public final CipherOutputStream copydefault;
    public final java.lang.String djBIcL;
    public final WallpaperBackupHelper ejfBZ;
    public final java.lang.String fARcdN;
    public final FullBackup fIwbmz;
    public final java.util.Map<java.lang.String, java.lang.String> fJNWhG;
    public final RestoreSession fetchVPNInfo;
    public final StringDef gEmmrt;
    public final java.lang.String isConnected;
    public final ContextImpl valueOf;
    public final SharedPreferencesBackupHelper values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BlobBackupHelper$Activity) A[MD:(o.BlobBackupHelper$Activity):void (m)] call: o.BlobBackupHelper.<init>(o.BlobBackupHelper$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BlobBackupHelper(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NavigationRes AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreSession AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Vr2dDisplayProperties AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CipherOutputStream EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoubleStream KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatRange OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<JobWorkItem> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContextImpl djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FullBackup ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WallpaperBackupHelper fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> fIwbmz() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackupTransport fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringDef gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedPreferencesBackupHelper values() {
        return this.values;
    }

    public BlobBackupHelper(Activity activity) {
        this.OLrzqt = activity.EZpvd();
        this.copydefault = activity.AEQbTJ();
        this.EZpvd = activity.KWHzl();
        this.KWHzl = activity.copydefault();
        this.AhwBna = activity.djBIcL();
        this.gEmmrt = activity.AhwBna();
        this.AYXKKw = activity.AYXKKw();
        this.djBIcL = activity.gEmmrt();
        this.valueOf = activity.valueOf();
        this.fetchVPNInfo = activity.values();
        this.values = activity.AkhnZx();
        this.isConnected = activity.DbNXlk();
        this.DbNXlk = activity.fetchVPNInfo();
        this.AkhnZx = activity.isConnected();
        this.AuCTel = activity.fJNWhG();
        this.fIwbmz = activity.fARcdN();
        this.fARcdN = activity.fIwbmz();
        this.fJNWhG = activity.ejfBZ();
        this.ejfBZ = activity.AuCTel();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BlobBackupHelper.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateUserPoolRequest(");
        sb.append("accountRecoverySetting=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("adminCreateUserConfig=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("autoVerifiedAttributes=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("deletionProtection=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("deviceConfiguration=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("emailConfiguration=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("emailVerificationMessage=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("emailVerificationSubject=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("lambdaConfig=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("mfaConfiguration=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("policies=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("smsAuthenticationMessage=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("smsConfiguration=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("smsVerificationMessage=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("userAttributeUpdateSettings=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolAddOns=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolTags=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("verificationMessageTemplate=");
        sb2.append(this.ejfBZ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        DoubleStream doubleStream = this.OLrzqt;
        int iHashCode = doubleStream != null ? doubleStream.hashCode() : 0;
        CipherOutputStream cipherOutputStream = this.copydefault;
        int iHashCode2 = cipherOutputStream != null ? cipherOutputStream.hashCode() : 0;
        java.util.List<JobWorkItem> list = this.EZpvd;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        FloatRange floatRange = this.KWHzl;
        int iHashCode4 = floatRange != null ? floatRange.hashCode() : 0;
        NavigationRes navigationRes = this.AhwBna;
        int iHashCode5 = navigationRes != null ? navigationRes.hashCode() : 0;
        StringDef stringDef = this.gEmmrt;
        int iHashCode6 = stringDef != null ? stringDef.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode7 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        int iHashCode8 = str2 != null ? str2.hashCode() : 0;
        ContextImpl contextImpl = this.valueOf;
        int iHashCode9 = contextImpl != null ? contextImpl.hashCode() : 0;
        RestoreSession restoreSession = this.fetchVPNInfo;
        int iHashCode10 = restoreSession != null ? restoreSession.hashCode() : 0;
        SharedPreferencesBackupHelper sharedPreferencesBackupHelper = this.values;
        int iHashCode11 = sharedPreferencesBackupHelper != null ? sharedPreferencesBackupHelper.hashCode() : 0;
        java.lang.String str3 = this.isConnected;
        int iHashCode12 = str3 != null ? str3.hashCode() : 0;
        Vr2dDisplayProperties vr2dDisplayProperties = this.DbNXlk;
        int iHashCode13 = vr2dDisplayProperties != null ? vr2dDisplayProperties.hashCode() : 0;
        java.lang.String str4 = this.AkhnZx;
        int iHashCode14 = str4 != null ? str4.hashCode() : 0;
        BackupTransport backupTransport = this.AuCTel;
        int iHashCode15 = backupTransport != null ? backupTransport.hashCode() : 0;
        FullBackup fullBackup = this.fIwbmz;
        int iHashCode16 = fullBackup != null ? fullBackup.hashCode() : 0;
        java.lang.String str5 = this.fARcdN;
        int iHashCode17 = str5 != null ? str5.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.fJNWhG;
        int iHashCode18 = map != null ? map.hashCode() : 0;
        WallpaperBackupHelper wallpaperBackupHelper = this.ejfBZ;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (wallpaperBackupHelper != null ? wallpaperBackupHelper.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BlobBackupHelper.class != obj.getClass()) {
            return false;
        }
        BlobBackupHelper blobBackupHelper = (BlobBackupHelper) obj;
        return Intrinsics.EZpvd(this.OLrzqt, blobBackupHelper.OLrzqt) && Intrinsics.EZpvd(this.copydefault, blobBackupHelper.copydefault) && Intrinsics.EZpvd(this.EZpvd, blobBackupHelper.EZpvd) && Intrinsics.EZpvd(this.KWHzl, blobBackupHelper.KWHzl) && Intrinsics.EZpvd(this.AhwBna, blobBackupHelper.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, blobBackupHelper.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) blobBackupHelper.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) blobBackupHelper.djBIcL) && Intrinsics.EZpvd(this.valueOf, blobBackupHelper.valueOf) && Intrinsics.EZpvd(this.fetchVPNInfo, blobBackupHelper.fetchVPNInfo) && Intrinsics.EZpvd(this.values, blobBackupHelper.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) blobBackupHelper.isConnected) && Intrinsics.EZpvd(this.DbNXlk, blobBackupHelper.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) blobBackupHelper.AkhnZx) && Intrinsics.EZpvd(this.AuCTel, blobBackupHelper.AuCTel) && Intrinsics.EZpvd(this.fIwbmz, blobBackupHelper.fIwbmz) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) blobBackupHelper.fARcdN) && Intrinsics.EZpvd(this.fJNWhG, blobBackupHelper.fJNWhG) && Intrinsics.EZpvd(this.ejfBZ, blobBackupHelper.ejfBZ);
    }

    public static /* synthetic */ BlobBackupHelper copy$default(BlobBackupHelper blobBackupHelper, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateUserPoolRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BlobBackupHelper.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BlobBackupHelper.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(blobBackupHelper);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public NavigationRes AEQbTJ;
        public StringDef AYXKKw;
        public RestoreSession AhwBna;
        public SharedPreferencesBackupHelper AkhnZx;
        public java.util.Map<java.lang.String, java.lang.String> AuCTel;
        public Vr2dDisplayProperties DbNXlk;
        public CipherOutputStream EZpvd;
        public DoubleStream KWHzl;
        public FloatRange OLrzqt;
        public java.util.List<? extends JobWorkItem> copydefault;
        public java.lang.String djBIcL;
        public FullBackup fARcdN;
        public WallpaperBackupHelper fIwbmz;
        public java.lang.String fJNWhG;
        public BackupTransport fetchVPNInfo;
        public ContextImpl gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CipherOutputStream AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StringDef AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedPreferencesBackupHelper AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WallpaperBackupHelper AuCTel() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DoubleStream EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.JobWorkItem>, java.util.List<o.JobWorkItem> */
        public final java.util.List<JobWorkItem> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatRange copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NavigationRes djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> ejfBZ() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullBackup fARcdN() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fIwbmz() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BackupTransport fJNWhG() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Vr2dDisplayProperties fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContextImpl valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreSession values() {
            return this.AhwBna;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull BlobBackupHelper blobBackupHelper) {
            this();
            Intrinsics.checkNotNullParameter(blobBackupHelper, "");
            this.KWHzl = blobBackupHelper.KWHzl();
            this.EZpvd = blobBackupHelper.EZpvd();
            this.copydefault = blobBackupHelper.copydefault();
            this.OLrzqt = blobBackupHelper.OLrzqt();
            this.AEQbTJ = blobBackupHelper.AEQbTJ();
            this.AYXKKw = blobBackupHelper.gEmmrt();
            this.valueOf = blobBackupHelper.AYXKKw();
            this.djBIcL = blobBackupHelper.valueOf();
            this.gEmmrt = blobBackupHelper.djBIcL();
            this.AhwBna = blobBackupHelper.AhwBna();
            this.AkhnZx = blobBackupHelper.values();
            this.values = blobBackupHelper.DbNXlk();
            this.DbNXlk = blobBackupHelper.AkhnZx();
            this.isConnected = blobBackupHelper.isConnected();
            this.fetchVPNInfo = blobBackupHelper.fetchVPNInfo();
            this.fARcdN = blobBackupHelper.ejfBZ();
            this.fJNWhG = blobBackupHelper.fJNWhG();
            this.AuCTel = blobBackupHelper.fIwbmz();
            this.fIwbmz = blobBackupHelper.fARcdN();
        }

        public final BlobBackupHelper OLrzqt() {
            return new BlobBackupHelper(this, null);
        }
    }
}
