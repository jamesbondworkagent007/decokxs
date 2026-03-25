package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SslError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SslError {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<PrinterDiscoverySession> AYXKKw;
    public final ApfProgramEvent AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final TimerStat gEmmrt;
    public final RecommendationService valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SslError$Activity) A[MD:(o.SslError$Activity):void (m)] call: o.SslError.<init>(o.SslError$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SslError(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApfProgramEvent AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendationService djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimerStat valueOf() {
        return this.gEmmrt;
    }

    public SslError(Activity activity) {
        this.OLrzqt = activity.AEQbTJ();
        this.KWHzl = activity.OLrzqt();
        this.AEQbTJ = activity.copydefault();
        this.EZpvd = activity.KWHzl();
        this.AhwBna = activity.djBIcL();
        this.djBIcL = activity.valueOf();
        this.gEmmrt = activity.AhwBna();
        this.AYXKKw = activity.gEmmrt();
        this.valueOf = activity.AYXKKw();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SslError.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateFlywheelRequest(");
        sb.append("activeModelArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("clientRequestToken=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataLakeS3Uri=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("dataSecurityConfig=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelName=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("modelType=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("taskConfig=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.EZpvd;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        ApfProgramEvent apfProgramEvent = this.AhwBna;
        int iHashCode5 = apfProgramEvent != null ? apfProgramEvent.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        TimerStat timerStat = this.gEmmrt;
        int iHashCode7 = timerStat != null ? timerStat.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AYXKKw;
        int iHashCode8 = list != null ? list.hashCode() : 0;
        RecommendationService recommendationService = this.valueOf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (recommendationService != null ? recommendationService.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SslError.class != obj.getClass()) {
            return false;
        }
        SslError sslError = (SslError) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) sslError.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) sslError.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) sslError.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) sslError.EZpvd) && Intrinsics.EZpvd(this.AhwBna, sslError.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) sslError.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, sslError.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, sslError.AYXKKw) && Intrinsics.EZpvd(this.valueOf, sslError.valueOf);
    }

    public static /* synthetic */ SslError copy$default(SslError sslError, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.CreateFlywheelRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SslError.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SslError.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(sslError);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public ApfProgramEvent AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AYXKKw;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public TimerStat gEmmrt;
        public RecommendationService valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecommendationService AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TimerStat AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApfProgramEvent djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SslError sslError) {
            this();
            Intrinsics.checkNotNullParameter(sslError, "");
            this.copydefault = sslError.copydefault();
            this.OLrzqt = sslError.OLrzqt();
            this.KWHzl = sslError.EZpvd();
            this.EZpvd = sslError.KWHzl();
            this.AEQbTJ = sslError.AEQbTJ();
            this.djBIcL = sslError.AYXKKw();
            this.gEmmrt = sslError.valueOf();
            this.AYXKKw = sslError.AhwBna();
            this.valueOf = sslError.djBIcL();
        }

        public final SslError EZpvd() {
            return new SslError(this, null);
        }
    }
}
