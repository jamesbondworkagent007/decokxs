package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RevocableFileDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RevocableFileDescriptor {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final C5173Hn AYXKKw;
    public final ApfProgramEvent AhwBna;
    public final RemoteMailException AkhnZx;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final C5173Hn copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final RecommendationService isConnected;
    public final java.lang.String valueOf;
    public final TimerStat values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RevocableFileDescriptor$ActionBar) A[MD:(o.RevocableFileDescriptor$ActionBar):void (m)] call: o.RevocableFileDescriptor.<init>(o.RevocableFileDescriptor$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RevocableFileDescriptor(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationService DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApfProgramEvent OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimerStat valueOf() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteMailException values() {
        return this.AkhnZx;
    }

    public RevocableFileDescriptor(ActionBar actionBar) {
        this.KWHzl = actionBar.OLrzqt();
        this.copydefault = actionBar.copydefault();
        this.EZpvd = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.AYXKKw();
        this.AhwBna = actionBar.valueOf();
        this.djBIcL = actionBar.AhwBna();
        this.AYXKKw = actionBar.djBIcL();
        this.gEmmrt = actionBar.gEmmrt();
        this.valueOf = actionBar.DbNXlk();
        this.values = actionBar.AkhnZx();
        this.AkhnZx = actionBar.values();
        this.isConnected = actionBar.fetchVPNInfo();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RevocableFileDescriptor.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FlywheelProperties(");
        sb.append("activeModelArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("creationTime=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("dataLakeS3Uri=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("dataSecurityConfig=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedTime=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("latestFlywheelIteration=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("modelType=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("taskConfig=");
        sb2.append(this.isConnected);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.OLrzqt;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        ApfProgramEvent apfProgramEvent = this.AhwBna;
        int iHashCode5 = apfProgramEvent != null ? apfProgramEvent.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AYXKKw;
        int iHashCode7 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str5 = this.gEmmrt;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.valueOf;
        int iHashCode9 = str6 != null ? str6.hashCode() : 0;
        TimerStat timerStat = this.values;
        int iHashCode10 = timerStat != null ? timerStat.hashCode() : 0;
        RemoteMailException remoteMailException = this.AkhnZx;
        int iHashCode11 = remoteMailException != null ? remoteMailException.hashCode() : 0;
        RecommendationService recommendationService = this.isConnected;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (recommendationService != null ? recommendationService.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RevocableFileDescriptor.class != obj.getClass()) {
            return false;
        }
        RevocableFileDescriptor revocableFileDescriptor = (RevocableFileDescriptor) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) revocableFileDescriptor.KWHzl) && Intrinsics.EZpvd(this.copydefault, revocableFileDescriptor.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) revocableFileDescriptor.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) revocableFileDescriptor.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, revocableFileDescriptor.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) revocableFileDescriptor.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, revocableFileDescriptor.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) revocableFileDescriptor.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) revocableFileDescriptor.valueOf) && Intrinsics.EZpvd(this.values, revocableFileDescriptor.values) && Intrinsics.EZpvd(this.AkhnZx, revocableFileDescriptor.AkhnZx) && Intrinsics.EZpvd(this.isConnected, revocableFileDescriptor.isConnected);
    }

    public static /* synthetic */ RevocableFileDescriptor copy$default(RevocableFileDescriptor revocableFileDescriptor, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.FlywheelProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RevocableFileDescriptor.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RevocableFileDescriptor.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(revocableFileDescriptor);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public TimerStat AYXKKw;
        public C5173Hn AhwBna;
        public RemoteMailException DbNXlk;
        public ApfProgramEvent EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public RecommendationService isConnected;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimerStat AkhnZx() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ApfProgramEvent apfProgramEvent) {
            this.EZpvd = apfProgramEvent;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(TimerStat timerStat) {
            this.AYXKKw = timerStat;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.AhwBna = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RecommendationService recommendationService) {
            this.isConnected = recommendationService;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(RemoteMailException remoteMailException) {
            this.DbNXlk = remoteMailException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecommendationService fetchVPNInfo() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApfProgramEvent valueOf() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RemoteMailException values() {
            return this.DbNXlk;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull RevocableFileDescriptor revocableFileDescriptor) {
            this();
            Intrinsics.checkNotNullParameter(revocableFileDescriptor, "");
            this.AEQbTJ = revocableFileDescriptor.EZpvd();
            this.OLrzqt = revocableFileDescriptor.copydefault();
            this.KWHzl = revocableFileDescriptor.AEQbTJ();
            this.copydefault = revocableFileDescriptor.KWHzl();
            this.EZpvd = revocableFileDescriptor.OLrzqt();
            this.djBIcL = revocableFileDescriptor.AhwBna();
            this.AhwBna = revocableFileDescriptor.gEmmrt();
            this.gEmmrt = revocableFileDescriptor.djBIcL();
            this.valueOf = revocableFileDescriptor.AYXKKw();
            this.AYXKKw = revocableFileDescriptor.valueOf();
            this.DbNXlk = revocableFileDescriptor.values();
            this.isConnected = revocableFileDescriptor.DbNXlk();
        }

        public final RevocableFileDescriptor EZpvd() {
            return new RevocableFileDescriptor(this, null);
        }
    }
}
