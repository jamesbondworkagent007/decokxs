package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SSLSessionCache;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SSLSessionCache {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.Double AEQbTJ;
    public final java.lang.Double AYXKKw;
    public final java.lang.Double AhwBna;
    public final java.lang.Double KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Double copydefault;
    public final java.lang.Double gEmmrt;
    public final java.lang.Double valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SSLSessionCache$Activity) A[MD:(o.SSLSessionCache$Activity):void (m)] call: o.SSLSessionCache.<init>(o.SSLSessionCache$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SSLSessionCache(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double djBIcL() {
        return this.gEmmrt;
    }

    public SSLSessionCache(Activity activity) {
        this.copydefault = activity.KWHzl();
        this.AEQbTJ = activity.AEQbTJ();
        this.OLrzqt = activity.EZpvd();
        this.KWHzl = activity.gEmmrt();
        this.AhwBna = activity.AhwBna();
        this.valueOf = activity.djBIcL();
        this.AYXKKw = activity.valueOf();
        this.gEmmrt = activity.AYXKKw();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SSLSessionCache.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClassifierEvaluationMetrics(");
        sb.append("accuracy=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("f1Score=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("hammingLoss=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("microF1Score=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("microPrecision=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("microRecall=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("precision=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("recall=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Double d = this.copydefault;
        int iHashCode = d != null ? d.hashCode() : 0;
        java.lang.Double d2 = this.AEQbTJ;
        int iHashCode2 = d2 != null ? d2.hashCode() : 0;
        java.lang.Double d3 = this.OLrzqt;
        int iHashCode3 = d3 != null ? d3.hashCode() : 0;
        java.lang.Double d4 = this.KWHzl;
        int iHashCode4 = d4 != null ? d4.hashCode() : 0;
        java.lang.Double d5 = this.AhwBna;
        int iHashCode5 = d5 != null ? d5.hashCode() : 0;
        java.lang.Double d6 = this.valueOf;
        int iHashCode6 = d6 != null ? d6.hashCode() : 0;
        java.lang.Double d7 = this.AYXKKw;
        int iHashCode7 = d7 != null ? d7.hashCode() : 0;
        java.lang.Double d8 = this.gEmmrt;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (d8 != null ? d8.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SSLSessionCache.class != obj.getClass()) {
            return false;
        }
        SSLSessionCache sSLSessionCache = (SSLSessionCache) obj;
        return Intrinsics.OLrzqt(this.copydefault, sSLSessionCache.copydefault) && Intrinsics.OLrzqt(this.AEQbTJ, sSLSessionCache.AEQbTJ) && Intrinsics.OLrzqt(this.OLrzqt, sSLSessionCache.OLrzqt) && Intrinsics.OLrzqt(this.KWHzl, sSLSessionCache.KWHzl) && Intrinsics.OLrzqt(this.AhwBna, sSLSessionCache.AhwBna) && Intrinsics.OLrzqt(this.valueOf, sSLSessionCache.valueOf) && Intrinsics.OLrzqt(this.AYXKKw, sSLSessionCache.AYXKKw) && Intrinsics.OLrzqt(this.gEmmrt, sSLSessionCache.gEmmrt);
    }

    public static /* synthetic */ SSLSessionCache copy$default(SSLSessionCache sSLSessionCache, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ClassifierEvaluationMetrics$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SSLSessionCache.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SSLSessionCache.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(sSLSessionCache);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.Double AEQbTJ;
        public java.lang.Double AhwBna;
        public java.lang.Double EZpvd;
        public java.lang.Double KWHzl;
        public java.lang.Double OLrzqt;
        public java.lang.Double copydefault;
        public java.lang.Double djBIcL;
        public java.lang.Double valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Double d) {
            this.OLrzqt = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.Double d) {
            this.valueOf = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Double d) {
            this.EZpvd = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Double d) {
            this.AEQbTJ = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Double d) {
            this.KWHzl = d;
        }

        public final Activity copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Double d) {
            this.copydefault = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(java.lang.Double d) {
            this.AhwBna = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.Double d) {
            this.djBIcL = d;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SSLSessionCache sSLSessionCache) {
            this();
            Intrinsics.checkNotNullParameter(sSLSessionCache, "");
            this.KWHzl = sSLSessionCache.OLrzqt();
            this.AEQbTJ = sSLSessionCache.AEQbTJ();
            this.OLrzqt = sSLSessionCache.KWHzl();
            this.copydefault = sSLSessionCache.EZpvd();
            this.EZpvd = sSLSessionCache.copydefault();
            this.djBIcL = sSLSessionCache.AhwBna();
            this.AhwBna = sSLSessionCache.AYXKKw();
            this.valueOf = sSLSessionCache.djBIcL();
        }

        public final SSLSessionCache OLrzqt() {
            return new SSLSessionCache(this, null);
        }
    }
}
