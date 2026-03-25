package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C48882ue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C48882ue {
    public static final Application AEQbTJ = new Application(null);
    public final AbstractC46132tJ OLrzqt;
    public final AbstractC46962th copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ue$StateListAnimator) A[MD:(o.ue$StateListAnimator):void (m)] call: o.ue.<init>(o.ue$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48882ue(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46962th EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46132tJ copydefault() {
        return this.OLrzqt;
    }

    public C48882ue(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.KWHzl();
        this.OLrzqt = stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.ue$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ue.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TranslationSettings(");
        sb.append("formality=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("profanity=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC46962th abstractC46962th = this.copydefault;
        int iHashCode = abstractC46962th != null ? abstractC46962th.hashCode() : 0;
        AbstractC46132tJ abstractC46132tJ = this.OLrzqt;
        return (iHashCode * 31) + (abstractC46132tJ != null ? abstractC46132tJ.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48882ue.class != obj.getClass()) {
            return false;
        }
        C48882ue c48882ue = (C48882ue) obj;
        return Intrinsics.EZpvd(this.copydefault, c48882ue.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c48882ue.OLrzqt);
    }

    public static /* synthetic */ C48882ue copy$default(C48882ue c48882ue, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TranslationSettings$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C48882ue.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C48882ue.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c48882ue);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.ue$StateListAnimator */
    public static final class StateListAnimator {
        public AbstractC46132tJ EZpvd;
        public AbstractC46962th KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46132tJ AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC46132tJ abstractC46132tJ) {
            this.EZpvd = abstractC46132tJ;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC46962th abstractC46962th) {
            this.KWHzl = abstractC46962th;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46962th KWHzl() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C48882ue c48882ue) {
            this();
            Intrinsics.checkNotNullParameter(c48882ue, "");
            this.KWHzl = c48882ue.EZpvd();
            this.EZpvd = c48882ue.copydefault();
        }

        public final C48882ue copydefault() {
            return new C48882ue(this, null);
        }
    }
}
