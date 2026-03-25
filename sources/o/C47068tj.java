package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47068tj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47068tj {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final C46159tK AEQbTJ;
    public final C46105tI EZpvd;
    public final C46105tI OLrzqt;
    public final C46105tI copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tj$StateListAnimator) A[MD:(o.tj$StateListAnimator):void (m)] call: o.tj.<init>(o.tj$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47068tj(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46105tI AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46105tI KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46159tK OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46105tI copydefault() {
        return this.OLrzqt;
    }

    public C47068tj(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.gEmmrt();
    }

    /* JADX INFO: renamed from: o.tj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetParallelDataResponse(");
        sb.append("auxiliaryDataLocation=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("dataLocation=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("latestUpdateAttemptAuxiliaryDataLocation=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("parallelDataProperties=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C46105tI c46105tI = this.EZpvd;
        int iHashCode = c46105tI != null ? c46105tI.hashCode() : 0;
        C46105tI c46105tI2 = this.copydefault;
        int iHashCode2 = c46105tI2 != null ? c46105tI2.hashCode() : 0;
        C46105tI c46105tI3 = this.OLrzqt;
        int iHashCode3 = c46105tI3 != null ? c46105tI3.hashCode() : 0;
        C46159tK c46159tK = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c46159tK != null ? c46159tK.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47068tj.class != obj.getClass()) {
            return false;
        }
        C47068tj c47068tj = (C47068tj) obj;
        return Intrinsics.EZpvd(this.EZpvd, c47068tj.EZpvd) && Intrinsics.EZpvd(this.copydefault, c47068tj.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c47068tj.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c47068tj.AEQbTJ);
    }

    public static /* synthetic */ C47068tj copy$default(C47068tj c47068tj, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.GetParallelDataResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47068tj.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47068tj.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c47068tj);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.tj$StateListAnimator */
    public static final class StateListAnimator {
        public C46159tK EZpvd;
        public C46105tI KWHzl;
        public C46105tI OLrzqt;
        public C46105tI copydefault;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C46105tI c46105tI) {
            this.OLrzqt = c46105tI;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46105tI EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46105tI KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C46105tI c46105tI) {
            this.copydefault = c46105tI;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C46159tK c46159tK) {
            this.EZpvd = c46159tK;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46105tI OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C46105tI c46105tI) {
            this.KWHzl = c46105tI;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46159tK gEmmrt() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C47068tj c47068tj) {
            this();
            Intrinsics.checkNotNullParameter(c47068tj, "");
            this.copydefault = c47068tj.AEQbTJ();
            this.OLrzqt = c47068tj.KWHzl();
            this.KWHzl = c47068tj.copydefault();
            this.EZpvd = c47068tj.OLrzqt();
        }

        public final C47068tj copydefault() {
            return new C47068tj(this, null);
        }
    }
}
