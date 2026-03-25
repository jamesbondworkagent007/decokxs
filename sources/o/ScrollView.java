package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ScrollView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ScrollView {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.util.List<C12497co> EZpvd;
    public final java.util.List<ResourceCursorTreeAdapter> KWHzl;
    public final AbstractC12972cx OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ScrollView$StateListAnimator) A[MD:(o.ScrollView$StateListAnimator):void (m)] call: o.ScrollView.<init>(o.ScrollView$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ScrollView(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12972cx AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C12497co> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ResourceCursorTreeAdapter> OLrzqt() {
        return this.KWHzl;
    }

    public ScrollView(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.EZpvd = stateListAnimator.AEQbTJ();
        this.OLrzqt = stateListAnimator.EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ScrollView.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DisassociateFacesResponse(");
        sb.append("disassociatedFaces=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("unsuccessfulFaceDisassociations=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userStatus=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<ResourceCursorTreeAdapter> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.util.List<C12497co> list2 = this.EZpvd;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        AbstractC12972cx abstractC12972cx = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (abstractC12972cx != null ? abstractC12972cx.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollView.class != obj.getClass()) {
            return false;
        }
        ScrollView scrollView = (ScrollView) obj;
        return Intrinsics.EZpvd(this.KWHzl, scrollView.KWHzl) && Intrinsics.EZpvd(this.EZpvd, scrollView.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, scrollView.OLrzqt);
    }

    public static /* synthetic */ ScrollView copy$default(ScrollView scrollView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DisassociateFacesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ScrollView.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ScrollView.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(scrollView);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public java.util.List<ResourceCursorTreeAdapter> AEQbTJ;
        public AbstractC12972cx OLrzqt;
        public java.util.List<C12497co> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C12497co> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC12972cx EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<ResourceCursorTreeAdapter> list) {
            this.AEQbTJ = list;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C12497co> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ResourceCursorTreeAdapter> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC12972cx abstractC12972cx) {
            this.OLrzqt = abstractC12972cx;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ScrollView scrollView) {
            this();
            Intrinsics.checkNotNullParameter(scrollView, "");
            this.AEQbTJ = scrollView.OLrzqt();
            this.copydefault = scrollView.KWHzl();
            this.OLrzqt = scrollView.AEQbTJ();
        }

        public final ScrollView OLrzqt() {
            return new ScrollView(this, null);
        }
    }
}
