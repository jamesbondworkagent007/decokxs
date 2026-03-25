package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Person;
import o.ProcessMemoryState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ProcessMemoryState {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final int AEQbTJ;
    public final Person copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ProcessMemoryState$StateListAnimator) A[MD:(o.ProcessMemoryState$StateListAnimator):void (m)] call: o.ProcessMemoryState.<init>(o.ProcessMemoryState$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ProcessMemoryState(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Person copydefault() {
        return this.copydefault;
    }

    public ProcessMemoryState(StateListAnimator stateListAnimator) {
        Person personEZpvd = stateListAnimator.EZpvd();
        if (personEZpvd == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for name".toString());
        }
        this.copydefault = personEZpvd;
        java.lang.Integer numOLrzqt = stateListAnimator.OLrzqt();
        if (numOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for priority".toString());
        }
        this.AEQbTJ = numOLrzqt.intValue();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ProcessMemoryState.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecoveryOptionType(");
        sb.append("name=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("priority=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.AEQbTJ;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ProcessMemoryState.class != obj.getClass()) {
            return false;
        }
        ProcessMemoryState processMemoryState = (ProcessMemoryState) obj;
        return Intrinsics.EZpvd(this.copydefault, processMemoryState.copydefault) && this.AEQbTJ == processMemoryState.AEQbTJ;
    }

    public static /* synthetic */ ProcessMemoryState copy$default(ProcessMemoryState processMemoryState, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.RecoveryOptionType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ProcessMemoryState.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ProcessMemoryState.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(processMemoryState);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public java.lang.Integer AEQbTJ;
        public Person EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Person EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Person person) {
            this.EZpvd = person;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ProcessMemoryState processMemoryState) {
            this();
            Intrinsics.checkNotNullParameter(processMemoryState, "");
            this.EZpvd = processMemoryState.copydefault();
            this.AEQbTJ = java.lang.Integer.valueOf(processMemoryState.OLrzqt());
        }

        public final ProcessMemoryState copydefault() {
            return new ProcessMemoryState(this, null);
        }

        public final StateListAnimator KWHzl() {
            if (this.EZpvd == null) {
                this.EZpvd = new Person.StateListAnimator("no value provided");
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = 0;
            }
            return this;
        }
    }
}
