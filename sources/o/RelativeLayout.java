package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RelativeLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RelativeLayout {
    public static final Application KWHzl = new Application(null);
    public final java.lang.String AEQbTJ;
    public final C19373g EZpvd;
    public final java.util.List<C7397aj> OLrzqt;
    public final java.util.List<AdapterViewFlipper> copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RelativeLayout$StateListAnimator) A[MD:(o.RelativeLayout$StateListAnimator):void (m)] call: o.RelativeLayout.<init>(o.RelativeLayout$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RelativeLayout(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C7397aj> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19373g KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AdapterViewFlipper> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.gEmmrt;
    }

    public RelativeLayout(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.EZpvd();
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.gEmmrt();
        this.gEmmrt = stateListAnimator.AhwBna();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RelativeLayout.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectModerationLabelsResponse(");
        sb.append("contentTypes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("humanLoopActivationOutput=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("moderationLabels=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("moderationModelVersion=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("projectVersion=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<AdapterViewFlipper> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        C19373g c19373g = this.EZpvd;
        int iHashCode2 = c19373g != null ? c19373g.hashCode() : 0;
        java.util.List<C7397aj> list2 = this.OLrzqt;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RelativeLayout.class != obj.getClass()) {
            return false;
        }
        RelativeLayout relativeLayout = (RelativeLayout) obj;
        return Intrinsics.EZpvd(this.copydefault, relativeLayout.copydefault) && Intrinsics.EZpvd(this.EZpvd, relativeLayout.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, relativeLayout.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) relativeLayout.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) relativeLayout.gEmmrt);
    }

    public static /* synthetic */ RelativeLayout copy$default(RelativeLayout relativeLayout, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectModerationLabelsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RelativeLayout.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RelativeLayout.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(relativeLayout);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public java.util.List<C7397aj> AEQbTJ;
        public C19373g EZpvd;
        public java.util.List<AdapterViewFlipper> KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C19373g EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<AdapterViewFlipper> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AdapterViewFlipper> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C7397aj> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C7397aj> OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C19373g c19373g) {
            this.EZpvd = c19373g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RelativeLayout relativeLayout) {
            this();
            Intrinsics.checkNotNullParameter(relativeLayout, "");
            this.KWHzl = relativeLayout.OLrzqt();
            this.EZpvd = relativeLayout.KWHzl();
            this.AEQbTJ = relativeLayout.AEQbTJ();
            this.OLrzqt = relativeLayout.EZpvd();
            this.copydefault = relativeLayout.copydefault();
        }

        public final RelativeLayout copydefault() {
            return new RelativeLayout(this, null);
        }
    }
}
