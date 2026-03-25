package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8774bJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8774bJ {
    public static final Application OLrzqt = new Application(null);
    public final AbstractC5734aC AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bJ$StateListAnimator) A[MD:(o.bJ$StateListAnimator):void (m)] call: o.bJ.<init>(o.bJ$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8774bJ(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5734aC KWHzl() {
        return this.AEQbTJ;
    }

    public C8774bJ(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bJ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StopProjectVersionResponse(");
        sb.append("status=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC5734aC abstractC5734aC = this.AEQbTJ;
        if (abstractC5734aC != null) {
            return abstractC5734aC.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8774bJ.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((C8774bJ) obj).AEQbTJ);
    }

    public static /* synthetic */ C8774bJ copy$default(C8774bJ c8774bJ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StopProjectVersionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8774bJ.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8774bJ.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c8774bJ);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.bJ$StateListAnimator */
    public static final class StateListAnimator {
        public AbstractC5734aC KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC5734aC AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC5734aC abstractC5734aC) {
            this.KWHzl = abstractC5734aC;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C8774bJ c8774bJ) {
            this();
            Intrinsics.checkNotNullParameter(c8774bJ, "");
            this.KWHzl = c8774bJ.KWHzl();
        }

        public final C8774bJ EZpvd() {
            return new C8774bJ(this, null);
        }
    }
}
