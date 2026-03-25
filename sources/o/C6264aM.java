package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6264aM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6264aM {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<WebViewUpdateService> EZpvd;
    public final AbstractC7503al OLrzqt;
    public final java.util.List<ActionMenuView> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aM$StateListAnimator) A[MD:(o.aM$StateListAnimator):void (m)] call: o.aM.<init>(o.aM$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6264aM(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WebViewUpdateService> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ActionMenuView> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7503al OLrzqt() {
        return this.OLrzqt;
    }

    public C6264aM(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.EZpvd();
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.aM$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecognizeCelebritiesResponse(");
        sb.append("celebrityFaces=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("orientationCorrection=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("unrecognizedFaces=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<WebViewUpdateService> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        AbstractC7503al abstractC7503al = this.OLrzqt;
        int iHashCode2 = abstractC7503al != null ? abstractC7503al.hashCode() : 0;
        java.util.List<ActionMenuView> list2 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6264aM.class != obj.getClass()) {
            return false;
        }
        C6264aM c6264aM = (C6264aM) obj;
        return Intrinsics.EZpvd(this.EZpvd, c6264aM.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c6264aM.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c6264aM.copydefault);
    }

    public static /* synthetic */ C6264aM copy$default(C6264aM c6264aM, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.RecognizeCelebritiesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6264aM.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6264aM.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c6264aM);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.aM$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public AbstractC7503al AEQbTJ;
        public java.util.List<ActionMenuView> KWHzl;
        public java.util.List<WebViewUpdateService> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7503al AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WebViewUpdateService> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<WebViewUpdateService> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC7503al abstractC7503al) {
            this.AEQbTJ = abstractC7503al;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<ActionMenuView> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ActionMenuView> copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C6264aM c6264aM) {
            this();
            Intrinsics.checkNotNullParameter(c6264aM, "");
            this.copydefault = c6264aM.AEQbTJ();
            this.AEQbTJ = c6264aM.OLrzqt();
            this.KWHzl = c6264aM.EZpvd();
        }

        public final C6264aM OLrzqt() {
            return new C6264aM(this, null);
        }
    }
}
