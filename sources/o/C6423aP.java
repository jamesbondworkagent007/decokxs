package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C6423aP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6423aP {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final AbstractC6105aJ AhwBna;
    public final C25615j EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Float OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aP$ActionBar) A[MD:(o.aP$ActionBar):void (m)] call: o.aP.<init>(o.aP$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6423aP(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC6105aJ KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.OLrzqt;
    }

    public C6423aP(ActionBar actionBar) {
        this.AEQbTJ = actionBar.KWHzl();
        this.OLrzqt = actionBar.AEQbTJ();
        this.EZpvd = actionBar.OLrzqt();
        this.KWHzl = actionBar.EZpvd();
        this.AhwBna = actionBar.gEmmrt();
    }

    /* JADX INFO: renamed from: o.aP$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aP.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SearchFacesByImageRequest(");
        sb.append("collectionId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("faceMatchThreshold=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("image=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("maxFaces=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("qualityFilter=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Float f = this.OLrzqt;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        C25615j c25615j = this.EZpvd;
        int iHashCode3 = c25615j != null ? c25615j.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        AbstractC6105aJ abstractC6105aJ = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + (abstractC6105aJ != null ? abstractC6105aJ.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6423aP.class != obj.getClass()) {
            return false;
        }
        C6423aP c6423aP = (C6423aP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c6423aP.AEQbTJ) && Intrinsics.copydefault(this.OLrzqt, c6423aP.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c6423aP.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c6423aP.KWHzl) && Intrinsics.EZpvd(this.AhwBna, c6423aP.AhwBna);
    }

    public static /* synthetic */ C6423aP copy$default(C6423aP c6423aP, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SearchFacesByImageRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6423aP.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6423aP.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c6423aP);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: renamed from: o.aP$ActionBar */
    public static final class ActionBar {
        public C25615j AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.Integer KWHzl;
        public java.lang.Float OLrzqt;
        public AbstractC6105aJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.KWHzl = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C25615j c25615j) {
            this.AEQbTJ = c25615j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC6105aJ gEmmrt() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C6423aP c6423aP) {
            this();
            Intrinsics.checkNotNullParameter(c6423aP, "");
            this.EZpvd = c6423aP.AEQbTJ();
            this.OLrzqt = c6423aP.copydefault();
            this.AEQbTJ = c6423aP.EZpvd();
            this.KWHzl = c6423aP.OLrzqt();
            this.copydefault = c6423aP.KWHzl();
        }

        public final C6423aP copydefault() {
            return new C6423aP(this, null);
        }
    }
}
