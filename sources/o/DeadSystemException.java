package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DeadSystemException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DeadSystemException {
    public static final ActionBar copydefault = new ActionBar(null);
    public final C5173Hn AEQbTJ;
    public final C5173Hn EZpvd;
    public final OnObbStateChangeListener KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DeadSystemException$StateListAnimator) A[MD:(o.DeadSystemException$StateListAnimator):void (m)] call: o.DeadSystemException.<init>(o.DeadSystemException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeadSystemException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnObbStateChangeListener copydefault() {
        return this.KWHzl;
    }

    public DeadSystemException(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.copydefault();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DeadSystemException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentClassifierFilter(");
        sb.append("documentClassifierName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
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
        OnObbStateChangeListener onObbStateChangeListener = this.KWHzl;
        int iHashCode2 = onObbStateChangeListener != null ? onObbStateChangeListener.hashCode() : 0;
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeadSystemException.class != obj.getClass()) {
            return false;
        }
        DeadSystemException deadSystemException = (DeadSystemException) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) deadSystemException.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, deadSystemException.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, deadSystemException.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, deadSystemException.EZpvd);
    }

    public static /* synthetic */ DeadSystemException copy$default(DeadSystemException deadSystemException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentClassifierFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DeadSystemException.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DeadSystemException.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(deadSystemException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public C5173Hn AEQbTJ;
        public java.lang.String EZpvd;
        public OnObbStateChangeListener KWHzl;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnObbStateChangeListener OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull DeadSystemException deadSystemException) {
            this();
            Intrinsics.checkNotNullParameter(deadSystemException, "");
            this.EZpvd = deadSystemException.EZpvd();
            this.KWHzl = deadSystemException.copydefault();
            this.AEQbTJ = deadSystemException.OLrzqt();
            this.copydefault = deadSystemException.KWHzl();
        }

        public final DeadSystemException EZpvd() {
            return new DeadSystemException(this, null);
        }
    }
}
