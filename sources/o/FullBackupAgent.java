package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FullBackupAgent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class FullBackupAgent {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final FullBackupDataOutput DbNXlk;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final C5173Hn copydefault;
    public final long djBIcL;
    public final C5173Hn fetchVPNInfo;
    public final long gEmmrt;
    public final long isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FullBackupAgent$Activity) A[MD:(o.FullBackupAgent$Activity):void (m)] call: o.FullBackupAgent.<init>(o.FullBackupAgent$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FullBackupAgent(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FullBackupDataOutput values() {
        return this.DbNXlk;
    }

    public FullBackupAgent(Activity activity) {
        this.OLrzqt = activity.AEQbTJ();
        this.EZpvd = activity.copydefault();
        this.KWHzl = activity.OLrzqt();
        this.copydefault = activity.valueOf();
        this.djBIcL = activity.gEmmrt();
        this.gEmmrt = activity.AhwBna();
        this.AYXKKw = activity.djBIcL();
        this.AhwBna = activity.AYXKKw();
        this.valueOf = activity.isConnected();
        this.isConnected = activity.AkhnZx();
        this.fetchVPNInfo = activity.values();
        this.DbNXlk = activity.DbNXlk();
        this.AkhnZx = activity.fetchVPNInfo();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FullBackupAgent.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserImportJobType(");
        sb.append("cloudWatchLogsRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("completionDate=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("completionMessage=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("creationDate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("failedUsers=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("importedUsers=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("preSignedUrl=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("skippedUsers=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("startDate=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C5173Hn c5173Hn2 = this.copydefault;
        int iHashCode4 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        int iHashCode5 = java.lang.Long.hashCode(this.djBIcL);
        int iHashCode6 = java.lang.Long.hashCode(this.gEmmrt);
        java.lang.String str3 = this.AYXKKw;
        int iHashCode7 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        int iHashCode10 = java.lang.Long.hashCode(this.isConnected);
        C5173Hn c5173Hn3 = this.fetchVPNInfo;
        int iHashCode11 = c5173Hn3 != null ? c5173Hn3.hashCode() : 0;
        FullBackupDataOutput fullBackupDataOutput = this.DbNXlk;
        int iHashCode12 = fullBackupDataOutput != null ? fullBackupDataOutput.hashCode() : 0;
        java.lang.String str6 = this.AkhnZx;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FullBackupAgent.class != obj.getClass()) {
            return false;
        }
        FullBackupAgent fullBackupAgent = (FullBackupAgent) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fullBackupAgent.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, fullBackupAgent.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) fullBackupAgent.KWHzl) && Intrinsics.EZpvd(this.copydefault, fullBackupAgent.copydefault) && this.djBIcL == fullBackupAgent.djBIcL && this.gEmmrt == fullBackupAgent.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) fullBackupAgent.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) fullBackupAgent.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) fullBackupAgent.valueOf) && this.isConnected == fullBackupAgent.isConnected && Intrinsics.EZpvd(this.fetchVPNInfo, fullBackupAgent.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, fullBackupAgent.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) fullBackupAgent.AkhnZx);
    }

    public static /* synthetic */ FullBackupAgent copy$default(FullBackupAgent fullBackupAgent, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserImportJobType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FullBackupAgent.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FullBackupAgent.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(fullBackupAgent);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public C5173Hn AkhnZx;
        public java.lang.String DbNXlk;
        public C5173Hn EZpvd;
        public C5173Hn KWHzl;
        public java.lang.String OLrzqt;
        public long copydefault;
        public java.lang.String djBIcL;
        public long gEmmrt;
        public long valueOf;
        public FullBackupDataOutput values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(long j) {
            this.valueOf = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(FullBackupDataOutput fullBackupDataOutput) {
            this.values = fullBackupDataOutput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AkhnZx() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FullBackupDataOutput DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(long j) {
            this.gEmmrt = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.AkhnZx = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(long j) {
            this.copydefault = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
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
        public final java.lang.String fetchVPNInfo() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn valueOf() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn values() {
            return this.AkhnZx;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull FullBackupAgent fullBackupAgent) {
            this();
            Intrinsics.checkNotNullParameter(fullBackupAgent, "");
            this.OLrzqt = fullBackupAgent.AEQbTJ();
            this.EZpvd = fullBackupAgent.KWHzl();
            this.AEQbTJ = fullBackupAgent.OLrzqt();
            this.KWHzl = fullBackupAgent.EZpvd();
            this.copydefault = fullBackupAgent.copydefault();
            this.gEmmrt = fullBackupAgent.AYXKKw();
            this.djBIcL = fullBackupAgent.AhwBna();
            this.AYXKKw = fullBackupAgent.valueOf();
            this.AhwBna = fullBackupAgent.gEmmrt();
            this.valueOf = fullBackupAgent.djBIcL();
            this.AkhnZx = fullBackupAgent.DbNXlk();
            this.values = fullBackupAgent.values();
            this.DbNXlk = fullBackupAgent.AkhnZx();
        }

        public final FullBackupAgent EZpvd() {
            return new FullBackupAgent(this, null);
        }
    }
}
