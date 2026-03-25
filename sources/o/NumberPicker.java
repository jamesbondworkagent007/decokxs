package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NumberPicker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NumberPicker {
    public static final Application AEQbTJ = new Application(null);
    public final C25615j EZpvd;
    public final java.lang.Float KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NumberPicker$StateListAnimator) A[MD:(o.NumberPicker$StateListAnimator):void (m)] call: o.NumberPicker.<init>(o.NumberPicker$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NumberPicker(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.KWHzl;
    }

    public NumberPicker(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.EZpvd();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NumberPicker.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectCustomLabelsRequest(");
        sb.append("image=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("minConfidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("projectVersionArn=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C25615j c25615j = this.EZpvd;
        int iHashCode = c25615j != null ? c25615j.hashCode() : 0;
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Float f = this.KWHzl;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        return (((((iHashCode * 31) + iIntValue) * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NumberPicker.class != obj.getClass()) {
            return false;
        }
        NumberPicker numberPicker = (NumberPicker) obj;
        return Intrinsics.EZpvd(this.EZpvd, numberPicker.EZpvd) && Intrinsics.EZpvd(this.copydefault, numberPicker.copydefault) && Intrinsics.copydefault(this.KWHzl, numberPicker.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) numberPicker.OLrzqt);
    }

    public static /* synthetic */ NumberPicker copy$default(NumberPicker numberPicker, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectCustomLabelsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NumberPicker.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NumberPicker.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(numberPicker);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public java.lang.Float AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.Integer OLrzqt;
        public C25615j copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull NumberPicker numberPicker) {
            this();
            Intrinsics.checkNotNullParameter(numberPicker, "");
            this.copydefault = numberPicker.AEQbTJ();
            this.OLrzqt = numberPicker.OLrzqt();
            this.AEQbTJ = numberPicker.copydefault();
            this.EZpvd = numberPicker.EZpvd();
        }

        public final NumberPicker KWHzl() {
            return new NumberPicker(this, null);
        }
    }
}
