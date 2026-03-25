package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SimpleExpandableListAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SimpleExpandableListAdapter {
    public static final Activity copydefault = new Activity(null);
    public final WebViewZygote AEQbTJ;
    public final AbstractC5999aH EZpvd;
    public final ArrayAdapter KWHzl;
    public final java.lang.Float OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SimpleExpandableListAdapter$StateListAnimator) A[MD:(o.SimpleExpandableListAdapter$StateListAnimator):void (m)] call: o.SimpleExpandableListAdapter.<init>(o.SimpleExpandableListAdapter$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SimpleExpandableListAdapter(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayAdapter EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5999aH OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.OLrzqt;
    }

    public SimpleExpandableListAdapter(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.KWHzl();
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.valueOf();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SimpleExpandableListAdapter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EquipmentDetection(");
        sb.append("boundingBox=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("coversBodyPart=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.AEQbTJ;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.OLrzqt;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        ArrayAdapter arrayAdapter = this.KWHzl;
        int iHashCode3 = arrayAdapter != null ? arrayAdapter.hashCode() : 0;
        AbstractC5999aH abstractC5999aH = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (abstractC5999aH != null ? abstractC5999aH.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SimpleExpandableListAdapter.class != obj.getClass()) {
            return false;
        }
        SimpleExpandableListAdapter simpleExpandableListAdapter = (SimpleExpandableListAdapter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, simpleExpandableListAdapter.AEQbTJ) && Intrinsics.copydefault(this.OLrzqt, simpleExpandableListAdapter.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, simpleExpandableListAdapter.KWHzl) && Intrinsics.EZpvd(this.EZpvd, simpleExpandableListAdapter.EZpvd);
    }

    public static /* synthetic */ SimpleExpandableListAdapter copy$default(SimpleExpandableListAdapter simpleExpandableListAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.EquipmentDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SimpleExpandableListAdapter.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SimpleExpandableListAdapter.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(simpleExpandableListAdapter);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public ArrayAdapter AEQbTJ;
        public java.lang.Float EZpvd;
        public WebViewZygote OLrzqt;
        public AbstractC5999aH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ArrayAdapter arrayAdapter) {
            this.AEQbTJ = arrayAdapter;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WebViewZygote webViewZygote) {
            this.OLrzqt = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC5999aH abstractC5999aH) {
            this.copydefault = abstractC5999aH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayAdapter OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC5999aH valueOf() {
            return this.copydefault;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull SimpleExpandableListAdapter simpleExpandableListAdapter) {
            this();
            Intrinsics.checkNotNullParameter(simpleExpandableListAdapter, "");
            this.OLrzqt = simpleExpandableListAdapter.KWHzl();
            this.EZpvd = simpleExpandableListAdapter.copydefault();
            this.AEQbTJ = simpleExpandableListAdapter.EZpvd();
            this.copydefault = simpleExpandableListAdapter.OLrzqt();
        }

        public final SimpleExpandableListAdapter copydefault() {
            return new SimpleExpandableListAdapter(this, null);
        }
    }
}
