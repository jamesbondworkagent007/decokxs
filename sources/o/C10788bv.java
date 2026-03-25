package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C10788bv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C10788bv {
    public static final Application KWHzl = new Application(null);
    public final C11108cC AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final C7662ao copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bv$StateListAnimator) A[MD:(o.bv$StateListAnimator):void (m)] call: o.bv.<init>(o.bv$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10788bv(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7662ao AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC copydefault() {
        return this.AEQbTJ;
    }

    public C10788bv(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.AEQbTJ();
        this.OLrzqt = stateListAnimator.copydefault();
        this.copydefault = stateListAnimator.KWHzl();
        this.AEQbTJ = stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.bv$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bv.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartPersonTrackingRequest(");
        sb.append("clientRequestToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("video=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C7662ao c7662ao = this.copydefault;
        int iHashCode3 = c7662ao != null ? c7662ao.hashCode() : 0;
        C11108cC c11108cC = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c11108cC != null ? c11108cC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10788bv.class != obj.getClass()) {
            return false;
        }
        C10788bv c10788bv = (C10788bv) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c10788bv.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c10788bv.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c10788bv.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c10788bv.AEQbTJ);
    }

    public static /* synthetic */ C10788bv copy$default(C10788bv c10788bv, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartPersonTrackingRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C10788bv.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C10788bv.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c10788bv);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bv$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public C11108cC EZpvd;
        public C7662ao OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7662ao KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C10788bv c10788bv) {
            this();
            Intrinsics.checkNotNullParameter(c10788bv, "");
            this.copydefault = c10788bv.OLrzqt();
            this.AEQbTJ = c10788bv.KWHzl();
            this.OLrzqt = c10788bv.AEQbTJ();
            this.EZpvd = c10788bv.copydefault();
        }

        public final C10788bv OLrzqt() {
            return new C10788bv(this, null);
        }
    }
}
