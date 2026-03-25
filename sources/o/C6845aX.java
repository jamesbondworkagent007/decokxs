package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6845aX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C6845aX {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final C9675ba AEQbTJ;
    public final java.util.List<C12866cv> EZpvd;
    public final java.util.List<C12179ci> KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aX$ActionBar) A[MD:(o.aX$ActionBar):void (m)] call: o.aX.<init>(o.aX$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6845aX(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9675ba AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C12179ci> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C12866cv> copydefault() {
        return this.EZpvd;
    }

    public C6845aX(ActionBar actionBar) {
        this.OLrzqt = actionBar.OLrzqt();
        this.AEQbTJ = actionBar.copydefault();
        this.KWHzl = actionBar.AEQbTJ();
        this.EZpvd = actionBar.valueOf();
    }

    /* JADX INFO: renamed from: o.aX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchUsersByImageResponse(");
        sb.append("faceModelVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("searchedFace=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("unsearchedFaces=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userMatches=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C9675ba c9675ba = this.AEQbTJ;
        int iHashCode2 = c9675ba != null ? c9675ba.hashCode() : 0;
        java.util.List<C12179ci> list = this.KWHzl;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.util.List<C12866cv> list2 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6845aX.class != obj.getClass()) {
            return false;
        }
        C6845aX c6845aX = (C6845aX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c6845aX.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c6845aX.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c6845aX.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c6845aX.EZpvd);
    }

    public static /* synthetic */ C6845aX copy$default(C6845aX c6845aX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchUsersByImageResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6845aX.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6845aX.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c6845aX);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.aX$ActionBar */
    public static final class ActionBar {
        public C9675ba EZpvd;
        public java.util.List<C12179ci> KWHzl;
        public java.util.List<C12866cv> OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C12179ci> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C12866cv> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C9675ba c9675ba) {
            this.EZpvd = c9675ba;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C12179ci> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9675ba copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C12866cv> valueOf() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C6845aX c6845aX) {
            this();
            Intrinsics.checkNotNullParameter(c6845aX, "");
            this.copydefault = c6845aX.OLrzqt();
            this.EZpvd = c6845aX.AEQbTJ();
            this.KWHzl = c6845aX.KWHzl();
            this.OLrzqt = c6845aX.copydefault();
        }

        public final C6845aX EZpvd() {
            return new C6845aX(this, null);
        }
    }
}
