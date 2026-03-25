package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ZoomButton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ZoomButton {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final AbstractC7768aq AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ZoomButton$StateListAnimator) A[MD:(o.ZoomButton$StateListAnimator):void (m)] call: o.ZoomButton.<init>(o.ZoomButton$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ZoomButton(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7768aq AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public ZoomButton(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.copydefault();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ZoomButton.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetPersonTrackingRequest(");
        sb.append("jobId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sortBy=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        AbstractC7768aq abstractC7768aq = this.AEQbTJ;
        return (((((iHashCode * 31) + iIntValue) * 31) + iHashCode2) * 31) + (abstractC7768aq != null ? abstractC7768aq.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ZoomButton.class != obj.getClass()) {
            return false;
        }
        ZoomButton zoomButton = (ZoomButton) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) zoomButton.copydefault) && Intrinsics.EZpvd(this.EZpvd, zoomButton.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) zoomButton.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, zoomButton.AEQbTJ);
    }

    public static /* synthetic */ ZoomButton copy$default(ZoomButton zoomButton, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetPersonTrackingRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ZoomButton.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ZoomButton.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(zoomButton);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.Integer OLrzqt;
        public AbstractC7768aq copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7768aq AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ZoomButton zoomButton) {
            this();
            Intrinsics.checkNotNullParameter(zoomButton, "");
            this.EZpvd = zoomButton.EZpvd();
            this.OLrzqt = zoomButton.KWHzl();
            this.KWHzl = zoomButton.OLrzqt();
            this.copydefault = zoomButton.AEQbTJ();
        }

        public final ZoomButton KWHzl() {
            return new ZoomButton(this, null);
        }
    }
}
