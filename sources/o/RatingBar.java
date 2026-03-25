package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RatingBar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RatingBar {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final RadioButton AhwBna;
    public final java.lang.Integer EZpvd;
    public final java.util.List<ProgressBar> KWHzl;
    public final C25615j OLrzqt;
    public final java.lang.Float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RatingBar$StateListAnimator) A[MD:(o.RatingBar$StateListAnimator):void (m)] call: o.RatingBar.<init>(o.RatingBar$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RatingBar(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ProgressBar> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RadioButton OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    public RatingBar(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.KWHzl();
        this.AhwBna = stateListAnimator.djBIcL();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RatingBar.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectLabelsRequest(");
        sb.append("features=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("image=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("maxLabels=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("minConfidence=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("settings=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<ProgressBar> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        C25615j c25615j = this.OLrzqt;
        int iHashCode2 = c25615j != null ? c25615j.hashCode() : 0;
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Float f = this.copydefault;
        int iHashCode3 = f != null ? f.hashCode() : 0;
        RadioButton radioButton = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + (radioButton != null ? radioButton.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RatingBar.class != obj.getClass()) {
            return false;
        }
        RatingBar ratingBar = (RatingBar) obj;
        return Intrinsics.EZpvd(this.KWHzl, ratingBar.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, ratingBar.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, ratingBar.EZpvd) && Intrinsics.copydefault(this.copydefault, ratingBar.copydefault) && Intrinsics.EZpvd(this.AhwBna, ratingBar.AhwBna);
    }

    public static /* synthetic */ RatingBar copy$default(RatingBar ratingBar, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectLabelsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RatingBar.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RatingBar.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(ratingBar);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public C25615j AEQbTJ;
        public java.util.List<? extends ProgressBar> EZpvd;
        public RadioButton KWHzl;
        public java.lang.Integer OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.ProgressBar>, java.util.List<o.ProgressBar> */
        public final java.util.List<ProgressBar> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C25615j c25615j) {
            this.AEQbTJ = c25615j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RadioButton djBIcL() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RatingBar ratingBar) {
            this();
            Intrinsics.checkNotNullParameter(ratingBar, "");
            this.EZpvd = ratingBar.EZpvd();
            this.AEQbTJ = ratingBar.AEQbTJ();
            this.OLrzqt = ratingBar.copydefault();
            this.copydefault = ratingBar.KWHzl();
            this.KWHzl = ratingBar.OLrzqt();
        }

        public final RatingBar EZpvd() {
            return new RatingBar(this, null);
        }
    }
}
