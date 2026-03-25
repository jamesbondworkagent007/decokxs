package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ServiceManagerNative;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ServiceManagerNative {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final HandlerThread EZpvd;
    public final java.lang.String KWHzl;
    public final ShellCommand copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ServiceManagerNative$StateListAnimator) A[MD:(o.ServiceManagerNative$StateListAnimator):void (m)] call: o.ServiceManagerNative.<init>(o.ServiceManagerNative$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ServiceManagerNative(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HandlerThread OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShellCommand copydefault() {
        return this.copydefault;
    }

    public ServiceManagerNative(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.EZpvd();
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        if (strCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for s3Uri".toString());
        }
        this.KWHzl = strCopydefault;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ServiceManagerNative.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InputDataConfig(");
        sb.append("documentReaderConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("inputFormat=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Uri=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        HandlerThread handlerThread = this.EZpvd;
        int iHashCode = handlerThread != null ? handlerThread.hashCode() : 0;
        ShellCommand shellCommand = this.copydefault;
        return (((iHashCode * 31) + (shellCommand != null ? shellCommand.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ServiceManagerNative.class != obj.getClass()) {
            return false;
        }
        ServiceManagerNative serviceManagerNative = (ServiceManagerNative) obj;
        return Intrinsics.EZpvd(this.EZpvd, serviceManagerNative.EZpvd) && Intrinsics.EZpvd(this.copydefault, serviceManagerNative.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) serviceManagerNative.KWHzl);
    }

    public static /* synthetic */ ServiceManagerNative copy$default(ServiceManagerNative serviceManagerNative, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.InputDataConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ServiceManagerNative.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ServiceManagerNative.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(serviceManagerNative);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public ShellCommand AEQbTJ;
        public HandlerThread KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HandlerThread AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(HandlerThread handlerThread) {
            this.KWHzl = handlerThread;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ShellCommand shellCommand) {
            this.AEQbTJ = shellCommand;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShellCommand EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ServiceManagerNative serviceManagerNative) {
            this();
            Intrinsics.checkNotNullParameter(serviceManagerNative, "");
            this.KWHzl = serviceManagerNative.OLrzqt();
            this.AEQbTJ = serviceManagerNative.copydefault();
            this.OLrzqt = serviceManagerNative.KWHzl();
        }

        public final ServiceManagerNative KWHzl() {
            return new ServiceManagerNative(this, null);
        }
    }
}
