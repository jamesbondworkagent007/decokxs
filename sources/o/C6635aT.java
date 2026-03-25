package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6635aT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C6635aT {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final C6951aZ EZpvd;
    public final C6898aY KWHzl;
    public final java.util.List<C12866cv> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aT$StateListAnimator) A[MD:(o.aT$StateListAnimator):void (m)] call: o.aT.<init>(o.aT$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6635aT(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C12866cv> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6898aY EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6951aZ copydefault() {
        return this.EZpvd;
    }

    public C6635aT(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.AYXKKw();
    }

    /* JADX INFO: renamed from: o.aT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchUsersResponse(");
        sb.append("faceModelVersion=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("searchedFace=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("searchedUser=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userMatches=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        C6898aY c6898aY = this.KWHzl;
        int iHashCode2 = c6898aY != null ? c6898aY.hashCode() : 0;
        C6951aZ c6951aZ = this.EZpvd;
        int iHashCode3 = c6951aZ != null ? c6951aZ.hashCode() : 0;
        java.util.List<C12866cv> list = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6635aT.class != obj.getClass()) {
            return false;
        }
        C6635aT c6635aT = (C6635aT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c6635aT.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c6635aT.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c6635aT.EZpvd) && Intrinsics.EZpvd(this.copydefault, c6635aT.copydefault);
    }

    public static /* synthetic */ C6635aT copy$default(C6635aT c6635aT, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchUsersResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6635aT.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6635aT.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c6635aT);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.aT$StateListAnimator */
    public static final class StateListAnimator {
        public C6951aZ AEQbTJ;
        public java.util.List<C12866cv> EZpvd;
        public java.lang.String KWHzl;
        public C6898aY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C12866cv> AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6951aZ EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C12866cv> list) {
            this.EZpvd = list;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C6951aZ c6951aZ) {
            this.AEQbTJ = c6951aZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6898aY OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C6898aY c6898aY) {
            this.OLrzqt = c6898aY;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C6635aT c6635aT) {
            this();
            Intrinsics.checkNotNullParameter(c6635aT, "");
            this.KWHzl = c6635aT.KWHzl();
            this.OLrzqt = c6635aT.EZpvd();
            this.AEQbTJ = c6635aT.copydefault();
            this.EZpvd = c6635aT.AEQbTJ();
        }

        public final C6635aT copydefault() {
            return new C6635aT(this, null);
        }
    }
}
