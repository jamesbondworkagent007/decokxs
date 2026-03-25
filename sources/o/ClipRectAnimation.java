package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ClipRectAnimation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ClipRectAnimation {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final TranslateYAnimation DbNXlk;
    public final java.util.List<java.lang.String> EZpvd;
    public final DecelerateInterpolator KWHzl;
    public final AccelerateInterpolator OLrzqt;
    public final AccessibilityCache copydefault;
    public final java.lang.String djBIcL;
    public final AutofillManager fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.util.List<CycleInterpolator> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ClipRectAnimation$Application) A[MD:(o.ClipRectAnimation$Application):void (m)] call: o.ClipRectAnimation.<init>(o.ClipRectAnimation$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ClipRectAnimation(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateInterpolator EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DecelerateInterpolator KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessibilityCache copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslateYAnimation fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CycleInterpolator> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutofillManager values() {
        return this.fetchVPNInfo;
    }

    public ClipRectAnimation(Application application) {
        this.copydefault = application.AEQbTJ();
        this.OLrzqt = application.EZpvd();
        this.EZpvd = application.OLrzqt();
        this.KWHzl = application.copydefault();
        this.AhwBna = application.djBIcL();
        this.AYXKKw = application.valueOf();
        this.gEmmrt = application.gEmmrt();
        this.djBIcL = application.AYXKKw();
        this.valueOf = application.AhwBna();
        this.AkhnZx = application.AkhnZx();
        this.fetchVPNInfo = application.values();
        this.DbNXlk = application.fetchVPNInfo();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ClipRectAnimation.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartSpeechSynthesisTaskRequest(");
        sb.append("engine=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("lexiconNames=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("outputFormat=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("outputS3BucketName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("outputS3KeyPrefix=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("sampleRate=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("snsTopicArn=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("speechMarkTypes=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("text=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("textType=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("voiceId=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccessibilityCache accessibilityCache = this.copydefault;
        int iHashCode = accessibilityCache != null ? accessibilityCache.hashCode() : 0;
        AccelerateInterpolator accelerateInterpolator = this.OLrzqt;
        int iHashCode2 = accelerateInterpolator != null ? accelerateInterpolator.hashCode() : 0;
        java.util.List<java.lang.String> list = this.EZpvd;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        DecelerateInterpolator decelerateInterpolator = this.KWHzl;
        int iHashCode4 = decelerateInterpolator != null ? decelerateInterpolator.hashCode() : 0;
        java.lang.String str = this.AhwBna;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode6 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode7 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        java.util.List<CycleInterpolator> list2 = this.valueOf;
        int iHashCode9 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str5 = this.AkhnZx;
        int iHashCode10 = str5 != null ? str5.hashCode() : 0;
        AutofillManager autofillManager = this.fetchVPNInfo;
        int iHashCode11 = autofillManager != null ? autofillManager.hashCode() : 0;
        TranslateYAnimation translateYAnimation = this.DbNXlk;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (translateYAnimation != null ? translateYAnimation.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClipRectAnimation.class != obj.getClass()) {
            return false;
        }
        ClipRectAnimation clipRectAnimation = (ClipRectAnimation) obj;
        return Intrinsics.EZpvd(this.copydefault, clipRectAnimation.copydefault) && Intrinsics.EZpvd(this.OLrzqt, clipRectAnimation.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, clipRectAnimation.EZpvd) && Intrinsics.EZpvd(this.KWHzl, clipRectAnimation.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) clipRectAnimation.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) clipRectAnimation.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) clipRectAnimation.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) clipRectAnimation.djBIcL) && Intrinsics.EZpvd(this.valueOf, clipRectAnimation.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) clipRectAnimation.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, clipRectAnimation.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, clipRectAnimation.DbNXlk);
    }

    public static /* synthetic */ ClipRectAnimation copy$default(ClipRectAnimation clipRectAnimation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.StartSpeechSynthesisTaskRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ClipRectAnimation.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ClipRectAnimation.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(clipRectAnimation);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public DecelerateInterpolator AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public TranslateYAnimation AkhnZx;
        public java.lang.String EZpvd;
        public AccelerateInterpolator KWHzl;
        public AccessibilityCache OLrzqt;
        public java.util.List<java.lang.String> copydefault;
        public java.lang.String djBIcL;
        public java.util.List<? extends CycleInterpolator> gEmmrt;
        public java.lang.String valueOf;
        public AutofillManager values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccessibilityCache AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.CycleInterpolator>, java.util.List<o.CycleInterpolator> */
        public final java.util.List<CycleInterpolator> AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccelerateInterpolator EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DecelerateInterpolator copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TranslateYAnimation fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AutofillManager values() {
            return this.values;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ClipRectAnimation clipRectAnimation) {
            this();
            Intrinsics.checkNotNullParameter(clipRectAnimation, "");
            this.OLrzqt = clipRectAnimation.copydefault();
            this.KWHzl = clipRectAnimation.EZpvd();
            this.copydefault = clipRectAnimation.AEQbTJ();
            this.AEQbTJ = clipRectAnimation.KWHzl();
            this.EZpvd = clipRectAnimation.OLrzqt();
            this.valueOf = clipRectAnimation.djBIcL();
            this.AYXKKw = clipRectAnimation.valueOf();
            this.AhwBna = clipRectAnimation.AhwBna();
            this.gEmmrt = clipRectAnimation.gEmmrt();
            this.djBIcL = clipRectAnimation.AYXKKw();
            this.values = clipRectAnimation.values();
            this.AkhnZx = clipRectAnimation.fetchVPNInfo();
        }

        public final ClipRectAnimation KWHzl() {
            return new ClipRectAnimation(this, null);
        }
    }
}
