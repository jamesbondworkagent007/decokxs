package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TranslateXAnimation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TranslateXAnimation {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final TranslateYAnimation EZpvd;
    public final java.util.List<AccelerateInterpolator> KWHzl;
    public final AccelerateInterpolator OLrzqt;
    public final AccessibilityWindowInfo copydefault;
    public final java.util.List<AccessibilityCache> djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TranslateXAnimation$ActionBar) A[MD:(o.TranslateXAnimation$ActionBar):void (m)] call: o.TranslateXAnimation.<init>(o.TranslateXAnimation$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TranslateXAnimation(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AccelerateInterpolator> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TranslateYAnimation EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateInterpolator KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessibilityWindowInfo copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AccessibilityCache> gEmmrt() {
        return this.djBIcL;
    }

    public TranslateXAnimation(ActionBar actionBar) {
        this.KWHzl = actionBar.OLrzqt();
        this.copydefault = actionBar.KWHzl();
        this.EZpvd = actionBar.copydefault();
        this.OLrzqt = actionBar.AYXKKw();
        this.AYXKKw = actionBar.djBIcL();
        this.AhwBna = actionBar.AhwBna();
        this.djBIcL = actionBar.valueOf();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TranslateXAnimation.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Voice(");
        sb.append("additionalLanguageCodes=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("gender=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("languageName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("supportedEngines=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<AccelerateInterpolator> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        AccessibilityWindowInfo accessibilityWindowInfo = this.copydefault;
        int iHashCode2 = accessibilityWindowInfo != null ? accessibilityWindowInfo.hashCode() : 0;
        TranslateYAnimation translateYAnimation = this.EZpvd;
        int iHashCode3 = translateYAnimation != null ? translateYAnimation.hashCode() : 0;
        AccelerateInterpolator accelerateInterpolator = this.OLrzqt;
        int iHashCode4 = accelerateInterpolator != null ? accelerateInterpolator.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode6 = str2 != null ? str2.hashCode() : 0;
        java.util.List<AccessibilityCache> list2 = this.djBIcL;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TranslateXAnimation.class != obj.getClass()) {
            return false;
        }
        TranslateXAnimation translateXAnimation = (TranslateXAnimation) obj;
        return Intrinsics.EZpvd(this.KWHzl, translateXAnimation.KWHzl) && Intrinsics.EZpvd(this.copydefault, translateXAnimation.copydefault) && Intrinsics.EZpvd(this.EZpvd, translateXAnimation.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, translateXAnimation.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) translateXAnimation.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) translateXAnimation.AhwBna) && Intrinsics.EZpvd(this.djBIcL, translateXAnimation.djBIcL);
    }

    public static /* synthetic */ TranslateXAnimation copy$default(TranslateXAnimation translateXAnimation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.Voice$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TranslateXAnimation.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TranslateXAnimation.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(translateXAnimation);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public TranslateYAnimation AEQbTJ;
        public java.util.List<? extends AccessibilityCache> AYXKKw;
        public java.lang.String EZpvd;
        public AccelerateInterpolator KWHzl;
        public AccessibilityWindowInfo OLrzqt;
        public java.util.List<? extends AccelerateInterpolator> copydefault;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AccelerateInterpolator accelerateInterpolator) {
            this.KWHzl = accelerateInterpolator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccelerateInterpolator AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<? extends AccessibilityCache> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccessibilityWindowInfo KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.AccelerateInterpolator>, java.util.List<o.AccelerateInterpolator> */
        public final java.util.List<AccelerateInterpolator> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<? extends AccelerateInterpolator> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TranslateYAnimation copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AccessibilityWindowInfo accessibilityWindowInfo) {
            this.OLrzqt = accessibilityWindowInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(TranslateYAnimation translateYAnimation) {
            this.AEQbTJ = translateYAnimation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.AccessibilityCache>, java.util.List<o.AccessibilityCache> */
        public final java.util.List<AccessibilityCache> valueOf() {
            return this.AYXKKw;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TranslateXAnimation translateXAnimation) {
            this();
            Intrinsics.checkNotNullParameter(translateXAnimation, "");
            this.copydefault = translateXAnimation.AEQbTJ();
            this.OLrzqt = translateXAnimation.copydefault();
            this.AEQbTJ = translateXAnimation.EZpvd();
            this.KWHzl = translateXAnimation.KWHzl();
            this.EZpvd = translateXAnimation.OLrzqt();
            this.gEmmrt = translateXAnimation.AYXKKw();
            this.AYXKKw = translateXAnimation.gEmmrt();
        }

        public final TranslateXAnimation AEQbTJ() {
            return new TranslateXAnimation(this, null);
        }
    }
}
