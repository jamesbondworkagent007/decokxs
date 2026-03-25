package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AlphaAnimation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AlphaAnimation {
    public static final Application OLrzqt = new Application(null);
    public final C5173Hn AEQbTJ;
    public final int AYXKKw;
    public final java.lang.String EZpvd;
    public final AccelerateInterpolator KWHzl;
    public final int copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AlphaAnimation$StateListAnimator) A[MD:(o.AlphaAnimation$StateListAnimator):void (m)] call: o.AlphaAnimation.<init>(o.AlphaAnimation$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AlphaAnimation(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateInterpolator OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public AlphaAnimation(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.KWHzl();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.AYXKKw();
        this.valueOf = stateListAnimator.AhwBna();
        this.AYXKKw = stateListAnimator.djBIcL();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AlphaAnimation.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LexiconAttributes(");
        sb.append("alphabet=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("lastModified=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("lexemesCount=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("lexiconArn=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("size=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        AccelerateInterpolator accelerateInterpolator = this.KWHzl;
        int iHashCode2 = accelerateInterpolator != null ? accelerateInterpolator.hashCode() : 0;
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        int i = this.copydefault;
        java.lang.String str2 = this.valueOf;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.AYXKKw;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AlphaAnimation.class != obj.getClass()) {
            return false;
        }
        AlphaAnimation alphaAnimation = (AlphaAnimation) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) alphaAnimation.EZpvd) && Intrinsics.EZpvd(this.KWHzl, alphaAnimation.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, alphaAnimation.AEQbTJ) && this.copydefault == alphaAnimation.copydefault && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) alphaAnimation.valueOf) && this.AYXKKw == alphaAnimation.AYXKKw;
    }

    public static /* synthetic */ AlphaAnimation copy$default(AlphaAnimation alphaAnimation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.LexiconAttributes$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AlphaAnimation.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AlphaAnimation.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(alphaAnimation);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public int AYXKKw;
        public int EZpvd;
        public C5173Hn KWHzl;
        public AccelerateInterpolator OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.EZpvd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccelerateInterpolator KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(int i) {
            this.AYXKKw = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AccelerateInterpolator accelerateInterpolator) {
            this.OLrzqt = accelerateInterpolator;
        }

        public final StateListAnimator copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.AYXKKw;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AlphaAnimation alphaAnimation) {
            this();
            Intrinsics.checkNotNullParameter(alphaAnimation, "");
            this.copydefault = alphaAnimation.copydefault();
            this.OLrzqt = alphaAnimation.OLrzqt();
            this.KWHzl = alphaAnimation.EZpvd();
            this.EZpvd = alphaAnimation.AEQbTJ();
            this.AEQbTJ = alphaAnimation.KWHzl();
            this.AYXKKw = alphaAnimation.AhwBna();
        }

        public final AlphaAnimation OLrzqt() {
            return new AlphaAnimation(this, null);
        }
    }
}
