package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C12919cw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C12919cw {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.util.List<AbstractC9357bU> AEQbTJ;
    public final C9251bS AYXKKw;
    public final java.lang.String KWHzl;
    public final C9145bQ OLrzqt;
    public final java.util.List<C6158aK> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.cw$ActionBar) A[MD:(o.cw$ActionBar):void (m)] call: o.cw.<init>(o.cw$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C12919cw(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9145bQ AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC9357bU> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C6158aK> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9251bS copydefault() {
        return this.AYXKKw;
    }

    public C12919cw(ActionBar actionBar) {
        this.OLrzqt = actionBar.copydefault();
        this.KWHzl = actionBar.KWHzl();
        this.AEQbTJ = actionBar.OLrzqt();
        this.copydefault = actionBar.EZpvd();
        this.AYXKKw = actionBar.gEmmrt();
    }

    /* JADX INFO: renamed from: o.cw$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cw.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateStreamProcessorRequest(");
        sb.append("dataSharingPreferenceForUpdate=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("parametersToDelete=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("regionsOfInterestForUpdate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("settingsForUpdate=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C9145bQ c9145bQ = this.OLrzqt;
        int iHashCode = c9145bQ != null ? c9145bQ.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.List<AbstractC9357bU> list = this.AEQbTJ;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        java.util.List<C6158aK> list2 = this.copydefault;
        int iHashCode4 = list2 != null ? list2.hashCode() : 0;
        C9251bS c9251bS = this.AYXKKw;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c9251bS != null ? c9251bS.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12919cw.class != obj.getClass()) {
            return false;
        }
        C12919cw c12919cw = (C12919cw) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c12919cw.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c12919cw.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c12919cw.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c12919cw.copydefault) && Intrinsics.EZpvd(this.AYXKKw, c12919cw.AYXKKw);
    }

    public static /* synthetic */ C12919cw copy$default(C12919cw c12919cw, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.UpdateStreamProcessorRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C12919cw.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C12919cw.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c12919cw);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.cw$ActionBar */
    public static final class ActionBar {
        public java.util.List<C6158aK> AEQbTJ;
        public java.lang.String EZpvd;
        public java.util.List<? extends AbstractC9357bU> KWHzl;
        public C9251bS OLrzqt;
        public C9145bQ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C6158aK> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.bU>, java.util.List<o.bU> */
        public final java.util.List<AbstractC9357bU> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9145bQ copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9251bS gEmmrt() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C12919cw c12919cw) {
            this();
            Intrinsics.checkNotNullParameter(c12919cw, "");
            this.copydefault = c12919cw.AEQbTJ();
            this.EZpvd = c12919cw.OLrzqt();
            this.KWHzl = c12919cw.EZpvd();
            this.AEQbTJ = c12919cw.KWHzl();
            this.OLrzqt = c12919cw.copydefault();
        }

        public final C12919cw AEQbTJ() {
            return new C12919cw(this, null);
        }
    }
}
