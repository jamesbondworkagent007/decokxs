package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.OnActivityPausedListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class OnActivityPausedListener {
    public static final ActionBar copydefault = new ActionBar(null);
    public final ClientTransactionHandler AEQbTJ;
    public final C5173Hn EZpvd;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OnActivityPausedListener$StateListAnimator) A[MD:(o.OnActivityPausedListener$StateListAnimator):void (m)] call: o.OnActivityPausedListener.<init>(o.OnActivityPausedListener$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OnActivityPausedListener(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientTransactionHandler copydefault() {
        return this.AEQbTJ;
    }

    public OnActivityPausedListener(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.EZpvd();
        this.OLrzqt = stateListAnimator.copydefault();
        this.AEQbTJ = stateListAnimator.gEmmrt();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnActivityPausedListener.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProviderDescription(");
        sb.append("creationDate=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("lastModifiedDate=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("providerName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("providerType=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        int iHashCode2 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        ClientTransactionHandler clientTransactionHandler = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (clientTransactionHandler != null ? clientTransactionHandler.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnActivityPausedListener.class != obj.getClass()) {
            return false;
        }
        OnActivityPausedListener onActivityPausedListener = (OnActivityPausedListener) obj;
        return Intrinsics.EZpvd(this.KWHzl, onActivityPausedListener.KWHzl) && Intrinsics.EZpvd(this.EZpvd, onActivityPausedListener.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) onActivityPausedListener.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, onActivityPausedListener.AEQbTJ);
    }

    public static /* synthetic */ OnActivityPausedListener copy$default(OnActivityPausedListener onActivityPausedListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ProviderDescription$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OnActivityPausedListener.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OnActivityPausedListener.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(onActivityPausedListener);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public ClientTransactionHandler AEQbTJ;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ClientTransactionHandler clientTransactionHandler) {
            this.AEQbTJ = clientTransactionHandler;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        public final StateListAnimator OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClientTransactionHandler gEmmrt() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull OnActivityPausedListener onActivityPausedListener) {
            this();
            Intrinsics.checkNotNullParameter(onActivityPausedListener, "");
            this.copydefault = onActivityPausedListener.OLrzqt();
            this.OLrzqt = onActivityPausedListener.EZpvd();
            this.KWHzl = onActivityPausedListener.AEQbTJ();
            this.AEQbTJ = onActivityPausedListener.copydefault();
        }

        public final OnActivityPausedListener KWHzl() {
            return new OnActivityPausedListener(this, null);
        }
    }
}
