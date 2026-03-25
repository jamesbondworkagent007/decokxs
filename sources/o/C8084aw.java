package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C8084aw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8084aw {
    public static final Activity OLrzqt = new Activity(null);
    public final java.lang.Float EZpvd;
    public final java.lang.Float KWHzl;
    public final java.lang.Float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aw$StateListAnimator) A[MD:(o.aw$StateListAnimator):void (m)] call: o.aw.<init>(o.aw$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8084aw(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.EZpvd;
    }

    public C8084aw(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.KWHzl();
    }

    /* JADX INFO: renamed from: o.aw$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aw.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Pose(");
        sb.append("pitch=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("roll=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("yaw=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.KWHzl;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.lang.Float f2 = this.copydefault;
        int iHashCode2 = f2 != null ? f2.hashCode() : 0;
        java.lang.Float f3 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8084aw.class != obj.getClass()) {
            return false;
        }
        C8084aw c8084aw = (C8084aw) obj;
        return Intrinsics.copydefault(this.KWHzl, c8084aw.KWHzl) && Intrinsics.copydefault(this.copydefault, c8084aw.copydefault) && Intrinsics.copydefault(this.EZpvd, c8084aw.EZpvd);
    }

    public static /* synthetic */ C8084aw copy$default(C8084aw c8084aw, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Pose$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8084aw.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8084aw.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c8084aw);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.aw$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.Float AEQbTJ;
        public java.lang.Float EZpvd;
        public java.lang.Float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Float f) {
            this.AEQbTJ = f;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.EZpvd = f;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C8084aw c8084aw) {
            this();
            Intrinsics.checkNotNullParameter(c8084aw, "");
            this.AEQbTJ = c8084aw.EZpvd();
            this.OLrzqt = c8084aw.AEQbTJ();
            this.EZpvd = c8084aw.copydefault();
        }

        public final C8084aw copydefault() {
            return new C8084aw(this, null);
        }
    }
}
