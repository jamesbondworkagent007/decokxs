package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C9092bP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9092bP {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bP$StateListAnimator) A[MD:(o.bP$StateListAnimator):void (m)] call: o.bP.<init>(o.bP$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9092bP(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    public C9092bP(StateListAnimator stateListAnimator) {
        java.lang.String strEZpvd = stateListAnimator.EZpvd();
        if (strEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for snsTopicArn".toString());
        }
        this.copydefault = strEZpvd;
    }

    /* JADX INFO: renamed from: o.bP$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bP.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamProcessorNotificationChannel(");
        sb.append("snsTopicArn=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.copydefault.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C9092bP.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((C9092bP) obj).copydefault);
    }

    public static /* synthetic */ C9092bP copy$default(C9092bP c9092bP, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StreamProcessorNotificationChannel$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9092bP.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9092bP.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c9092bP);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.bP$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt() {
            if (this.EZpvd == null) {
                this.EZpvd = "";
            }
            return this;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C9092bP c9092bP) {
            this();
            Intrinsics.checkNotNullParameter(c9092bP, "");
            this.EZpvd = c9092bP.KWHzl();
        }

        public final C9092bP copydefault() {
            return new C9092bP(this, null);
        }
    }
}
