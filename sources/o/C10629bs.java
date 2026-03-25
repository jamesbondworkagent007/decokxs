package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10629bs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10629bs {
    public static final Application EZpvd = new Application(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bs$StateListAnimator) A[MD:(o.bs$StateListAnimator):void (m)] call: o.bs.<init>(o.bs$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10629bs(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.AEQbTJ;
    }

    public C10629bs(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.KWHzl();
        this.AEQbTJ = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bs$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bs.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartProjectVersionRequest(");
        sb.append("maxInferenceUnits=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("minInferenceUnits=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("projectVersionArn=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.AEQbTJ;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.String str = this.KWHzl;
        return (((iIntValue * 31) + iIntValue2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10629bs.class != obj.getClass()) {
            return false;
        }
        C10629bs c10629bs = (C10629bs) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c10629bs.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c10629bs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c10629bs.KWHzl);
    }

    public static /* synthetic */ C10629bs copy$default(C10629bs c10629bs, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartProjectVersionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10629bs.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10629bs.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c10629bs);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.bs$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.lang.Integer KWHzl;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C10629bs c10629bs) {
            this();
            Intrinsics.checkNotNullParameter(c10629bs, "");
            this.OLrzqt = c10629bs.EZpvd();
            this.KWHzl = c10629bs.OLrzqt();
            this.AEQbTJ = c10629bs.AEQbTJ();
        }

        public final C10629bs copydefault() {
            return new C10629bs(this, null);
        }
    }
}
