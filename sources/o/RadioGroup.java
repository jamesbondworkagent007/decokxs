package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RadioGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class RadioGroup {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.util.List<C45887t> EZpvd;
    public final PopupWindow KWHzl;
    public final AbstractC7503al OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RadioGroup$StateListAnimator) A[MD:(o.RadioGroup$StateListAnimator):void (m)] call: o.RadioGroup.<init>(o.RadioGroup$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RadioGroup(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C45887t> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupWindow OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7503al copydefault() {
        return this.OLrzqt;
    }

    public RadioGroup(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.djBIcL();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RadioGroup.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectLabelsResponse(");
        sb.append("imageProperties=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("labelModelVersion=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("labels=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("orientationCorrection=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        PopupWindow popupWindow = this.KWHzl;
        int iHashCode = popupWindow != null ? popupWindow.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.List<C45887t> list = this.EZpvd;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        AbstractC7503al abstractC7503al = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (abstractC7503al != null ? abstractC7503al.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RadioGroup.class != obj.getClass()) {
            return false;
        }
        RadioGroup radioGroup = (RadioGroup) obj;
        return Intrinsics.EZpvd(this.KWHzl, radioGroup.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) radioGroup.copydefault) && Intrinsics.EZpvd(this.EZpvd, radioGroup.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, radioGroup.OLrzqt);
    }

    public static /* synthetic */ RadioGroup copy$default(RadioGroup radioGroup, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectLabelsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RadioGroup.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RadioGroup.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(radioGroup);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public AbstractC7503al EZpvd;
        public java.util.List<C45887t> KWHzl;
        public PopupWindow OLrzqt;
        public java.lang.String copydefault;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C45887t> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC7503al abstractC7503al) {
            this.EZpvd = abstractC7503al;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C45887t> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PopupWindow copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(PopupWindow popupWindow) {
            this.OLrzqt = popupWindow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7503al djBIcL() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RadioGroup radioGroup) {
            this();
            Intrinsics.checkNotNullParameter(radioGroup, "");
            this.OLrzqt = radioGroup.OLrzqt();
            this.copydefault = radioGroup.KWHzl();
            this.KWHzl = radioGroup.AEQbTJ();
            this.EZpvd = radioGroup.copydefault();
        }

        public final RadioGroup KWHzl() {
            return new RadioGroup(this, null);
        }
    }
}
