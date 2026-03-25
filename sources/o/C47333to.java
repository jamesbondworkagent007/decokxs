package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47333to;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.to, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47333to {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final C46537tY AEQbTJ;
    public final C46537tY EZpvd;
    public final C46510tX copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.to$StateListAnimator) A[MD:(o.to$StateListAnimator):void (m)] call: o.to.<init>(o.to$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47333to(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46510tX EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46537tY KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46537tY copydefault() {
        return this.AEQbTJ;
    }

    public C47333to(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.KWHzl();
    }

    /* JADX INFO: renamed from: o.to$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.to.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetTerminologyResponse(");
        sb.append("auxiliaryDataLocation=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("terminologyDataLocation=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyProperties=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C46537tY c46537tY = this.EZpvd;
        int iHashCode = c46537tY != null ? c46537tY.hashCode() : 0;
        C46537tY c46537tY2 = this.AEQbTJ;
        int iHashCode2 = c46537tY2 != null ? c46537tY2.hashCode() : 0;
        C46510tX c46510tX = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c46510tX != null ? c46510tX.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47333to.class != obj.getClass()) {
            return false;
        }
        C47333to c47333to = (C47333to) obj;
        return Intrinsics.EZpvd(this.EZpvd, c47333to.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c47333to.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c47333to.copydefault);
    }

    public static /* synthetic */ C47333to copy$default(C47333to c47333to, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.GetTerminologyResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47333to.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47333to.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c47333to);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.to$StateListAnimator */
    public static final class StateListAnimator {
        public C46537tY EZpvd;
        public C46510tX KWHzl;
        public C46537tY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46537tY AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46537tY EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C46537tY c46537tY) {
            this.EZpvd = c46537tY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46510tX KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C46537tY c46537tY) {
            this.copydefault = c46537tY;
        }

        public final StateListAnimator OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C46510tX c46510tX) {
            this.KWHzl = c46510tX;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C47333to c47333to) {
            this();
            Intrinsics.checkNotNullParameter(c47333to, "");
            this.EZpvd = c47333to.KWHzl();
            this.copydefault = c47333to.copydefault();
            this.KWHzl = c47333to.EZpvd();
        }

        public final C47333to copydefault() {
            return new C47333to(this, null);
        }
    }
}
