package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RadialTimePickerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RadialTimePickerView {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.Float AEQbTJ;
    public final java.lang.Float OLrzqt;
    public final java.lang.Float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RadialTimePickerView$StateListAnimator) A[MD:(o.RadialTimePickerView$StateListAnimator):void (m)] call: o.RadialTimePickerView.<init>(o.RadialTimePickerView$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RadialTimePickerView(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.copydefault;
    }

    public RadialTimePickerView(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RadialTimePickerView.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectLabelsImageQuality(");
        sb.append("brightness=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("contrast=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sharpness=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.AEQbTJ;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.lang.Float f2 = this.OLrzqt;
        int iHashCode2 = f2 != null ? f2.hashCode() : 0;
        java.lang.Float f3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadialTimePickerView.class != obj.getClass()) {
            return false;
        }
        RadialTimePickerView radialTimePickerView = (RadialTimePickerView) obj;
        return Intrinsics.copydefault(this.AEQbTJ, radialTimePickerView.AEQbTJ) && Intrinsics.copydefault(this.OLrzqt, radialTimePickerView.OLrzqt) && Intrinsics.copydefault(this.copydefault, radialTimePickerView.copydefault);
    }

    public static /* synthetic */ RadialTimePickerView copy$default(RadialTimePickerView radialTimePickerView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectLabelsImageQuality$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RadialTimePickerView.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RadialTimePickerView.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(radialTimePickerView);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public java.lang.Float EZpvd;
        public java.lang.Float KWHzl;
        public java.lang.Float OLrzqt;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.OLrzqt = f;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RadialTimePickerView radialTimePickerView) {
            this();
            Intrinsics.checkNotNullParameter(radialTimePickerView, "");
            this.KWHzl = radialTimePickerView.AEQbTJ();
            this.OLrzqt = radialTimePickerView.EZpvd();
            this.EZpvd = radialTimePickerView.copydefault();
        }

        public final RadialTimePickerView EZpvd() {
            return new RadialTimePickerView(this, null);
        }
    }
}
