package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.QuickContactBadge;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class QuickContactBadge {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final C23535i EZpvd;
    public final C25615j KWHzl;
    public final java.lang.Float OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.QuickContactBadge$ActionBar) A[MD:(o.QuickContactBadge$ActionBar):void (m)] call: o.QuickContactBadge.<init>(o.QuickContactBadge$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ QuickContactBadge(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23535i EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.OLrzqt;
    }

    public QuickContactBadge(ActionBar actionBar) {
        this.EZpvd = actionBar.EZpvd();
        this.KWHzl = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.copydefault();
        this.copydefault = actionBar.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.QuickContactBadge.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectModerationLabelsRequest(");
        sb.append("humanLoopConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("image=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("minConfidence=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("projectVersion=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C23535i c23535i = this.EZpvd;
        int iHashCode = c23535i != null ? c23535i.hashCode() : 0;
        C25615j c25615j = this.KWHzl;
        int iHashCode2 = c25615j != null ? c25615j.hashCode() : 0;
        java.lang.Float f = this.OLrzqt;
        int iHashCode3 = f != null ? f.hashCode() : 0;
        java.lang.String str = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QuickContactBadge.class != obj.getClass()) {
            return false;
        }
        QuickContactBadge quickContactBadge = (QuickContactBadge) obj;
        return Intrinsics.EZpvd(this.EZpvd, quickContactBadge.EZpvd) && Intrinsics.EZpvd(this.KWHzl, quickContactBadge.KWHzl) && Intrinsics.copydefault(this.OLrzqt, quickContactBadge.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) quickContactBadge.copydefault);
    }

    public static /* synthetic */ QuickContactBadge copy$default(QuickContactBadge quickContactBadge, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectModerationLabelsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull QuickContactBadge.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QuickContactBadge.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(quickContactBadge);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C23535i EZpvd;
        public C25615j KWHzl;
        public java.lang.Float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C25615j c25615j) {
            this.KWHzl = c25615j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C23535i EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull QuickContactBadge quickContactBadge) {
            this();
            Intrinsics.checkNotNullParameter(quickContactBadge, "");
            this.EZpvd = quickContactBadge.EZpvd();
            this.KWHzl = quickContactBadge.OLrzqt();
            this.OLrzqt = quickContactBadge.copydefault();
            this.AEQbTJ = quickContactBadge.KWHzl();
        }

        public final QuickContactBadge OLrzqt() {
            return new QuickContactBadge(this, null);
        }
    }
}
