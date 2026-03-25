package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7821ar;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7821ar {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final long EZpvd;
    public final C7874as copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ar$StateListAnimator) A[MD:(o.ar$StateListAnimator):void (m)] call: o.ar.<init>(o.ar$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7821ar(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7874as EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.EZpvd;
    }

    public C7821ar(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.copydefault();
        this.EZpvd = stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.ar$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ar.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PersonDetection(");
        sb.append("person=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("timestamp=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C7874as c7874as = this.copydefault;
        return ((c7874as != null ? c7874as.hashCode() : 0) * 31) + java.lang.Long.hashCode(this.EZpvd);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7821ar.class != obj.getClass()) {
            return false;
        }
        C7821ar c7821ar = (C7821ar) obj;
        return Intrinsics.EZpvd(this.copydefault, c7821ar.copydefault) && this.EZpvd == c7821ar.EZpvd;
    }

    public static /* synthetic */ C7821ar copy$default(C7821ar c7821ar, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.PersonDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7821ar.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7821ar.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c7821ar);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.ar$StateListAnimator */
    public static final class StateListAnimator {
        public C7874as AEQbTJ;
        public long EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C7874as c7874as) {
            this.AEQbTJ = c7874as;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(long j) {
            this.EZpvd = j;
        }

        public final StateListAnimator OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7874as copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C7821ar c7821ar) {
            this();
            Intrinsics.checkNotNullParameter(c7821ar, "");
            this.AEQbTJ = c7821ar.EZpvd();
            this.EZpvd = c7821ar.copydefault();
        }

        public final C7821ar EZpvd() {
            return new C7821ar(this, null);
        }
    }
}
