package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PathInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PathInterpolator {
    public static final Activity EZpvd = new Activity(null);
    public final AccessibilityCache AEQbTJ;
    public final AutofillManager AYXKKw;
    public final TranslateYAnimation AhwBna;
    public final AccelerateInterpolator KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final DecelerateInterpolator copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<CycleInterpolator> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PathInterpolator$Application) A[MD:(o.PathInterpolator$Application):void (m)] call: o.PathInterpolator.<init>(o.PathInterpolator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PathInterpolator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateInterpolator AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslateYAnimation AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessibilityCache KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DecelerateInterpolator OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CycleInterpolator> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutofillManager valueOf() {
        return this.AYXKKw;
    }

    public PathInterpolator(Application application) {
        this.AEQbTJ = application.AEQbTJ();
        this.KWHzl = application.OLrzqt();
        this.OLrzqt = application.EZpvd();
        this.copydefault = application.copydefault();
        this.djBIcL = application.djBIcL();
        this.valueOf = application.gEmmrt();
        this.gEmmrt = application.AYXKKw();
        this.AYXKKw = application.valueOf();
        this.AhwBna = application.AhwBna();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PathInterpolator.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final PathInterpolator KWHzl(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.KWHzl();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SynthesizeSpeechRequest(");
        sb.append("engine=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("lexiconNames=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("outputFormat=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("sampleRate=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("speechMarkTypes=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("text=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("textType=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("voiceId=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccessibilityCache accessibilityCache = this.AEQbTJ;
        int iHashCode = accessibilityCache != null ? accessibilityCache.hashCode() : 0;
        AccelerateInterpolator accelerateInterpolator = this.KWHzl;
        int iHashCode2 = accelerateInterpolator != null ? accelerateInterpolator.hashCode() : 0;
        java.util.List<java.lang.String> list = this.OLrzqt;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        DecelerateInterpolator decelerateInterpolator = this.copydefault;
        int iHashCode4 = decelerateInterpolator != null ? decelerateInterpolator.hashCode() : 0;
        java.lang.String str = this.djBIcL;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        java.util.List<CycleInterpolator> list2 = this.valueOf;
        int iHashCode6 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        AutofillManager autofillManager = this.AYXKKw;
        int iHashCode8 = autofillManager != null ? autofillManager.hashCode() : 0;
        TranslateYAnimation translateYAnimation = this.AhwBna;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (translateYAnimation != null ? translateYAnimation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PathInterpolator.class != obj.getClass()) {
            return false;
        }
        PathInterpolator pathInterpolator = (PathInterpolator) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, pathInterpolator.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, pathInterpolator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, pathInterpolator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, pathInterpolator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) pathInterpolator.djBIcL) && Intrinsics.EZpvd(this.valueOf, pathInterpolator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) pathInterpolator.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, pathInterpolator.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, pathInterpolator.AhwBna);
    }

    public static /* synthetic */ PathInterpolator copy$default(PathInterpolator pathInterpolator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.SynthesizeSpeechRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PathInterpolator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PathInterpolator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(pathInterpolator);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public AutofillManager AYXKKw;
        public TranslateYAnimation AhwBna;
        public java.util.List<java.lang.String> EZpvd;
        public DecelerateInterpolator KWHzl;
        public AccelerateInterpolator OLrzqt;
        public AccessibilityCache copydefault;
        public java.util.List<? extends CycleInterpolator> gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccessibilityCache AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TranslateYAnimation AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(DecelerateInterpolator decelerateInterpolator) {
            this.KWHzl = decelerateInterpolator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AccelerateInterpolator accelerateInterpolator) {
            this.OLrzqt = accelerateInterpolator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccelerateInterpolator OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DecelerateInterpolator copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AutofillManager autofillManager) {
            this.AYXKKw = autofillManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(TranslateYAnimation translateYAnimation) {
            this.AhwBna = translateYAnimation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.CycleInterpolator>, java.util.List<o.CycleInterpolator> */
        public final java.util.List<CycleInterpolator> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AutofillManager valueOf() {
            return this.AYXKKw;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull PathInterpolator pathInterpolator) {
            this();
            Intrinsics.checkNotNullParameter(pathInterpolator, "");
            this.copydefault = pathInterpolator.KWHzl();
            this.OLrzqt = pathInterpolator.AEQbTJ();
            this.EZpvd = pathInterpolator.copydefault();
            this.KWHzl = pathInterpolator.OLrzqt();
            this.AEQbTJ = pathInterpolator.EZpvd();
            this.gEmmrt = pathInterpolator.gEmmrt();
            this.valueOf = pathInterpolator.djBIcL();
            this.AYXKKw = pathInterpolator.valueOf();
            this.AhwBna = pathInterpolator.AhwBna();
        }

        public final PathInterpolator KWHzl() {
            return new PathInterpolator(this, null);
        }
    }
}
