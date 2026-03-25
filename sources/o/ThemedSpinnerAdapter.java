package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ThemedSpinnerAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ThemedSpinnerAdapter {
    public static final Application copydefault = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final Adapter KWHzl;
    public final java.lang.String OLrzqt;
    public final AnalogClock valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ThemedSpinnerAdapter$StateListAnimator) A[MD:(o.ThemedSpinnerAdapter$StateListAnimator):void (m)] call: o.ThemedSpinnerAdapter.<init>(o.ThemedSpinnerAdapter$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ThemedSpinnerAdapter(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnalogClock EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Adapter OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    public ThemedSpinnerAdapter(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.KWHzl();
        this.OLrzqt = stateListAnimator.EZpvd();
        this.EZpvd = stateListAnimator.AEQbTJ();
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.valueOf = stateListAnimator.AYXKKw();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ThemedSpinnerAdapter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetContentModerationRequest(");
        sb.append("aggregateBy=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sortBy=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        Adapter adapter = this.KWHzl;
        int iHashCode = adapter != null ? adapter.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        AnalogClock analogClock = this.valueOf;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + (analogClock != null ? analogClock.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ThemedSpinnerAdapter.class != obj.getClass()) {
            return false;
        }
        ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) obj;
        return Intrinsics.EZpvd(this.KWHzl, themedSpinnerAdapter.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) themedSpinnerAdapter.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, themedSpinnerAdapter.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) themedSpinnerAdapter.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, themedSpinnerAdapter.valueOf);
    }

    public static /* synthetic */ ThemedSpinnerAdapter copy$default(ThemedSpinnerAdapter themedSpinnerAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetContentModerationRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ThemedSpinnerAdapter.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ThemedSpinnerAdapter.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(themedSpinnerAdapter);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public java.lang.Integer AEQbTJ;
        public java.lang.String EZpvd;
        public Adapter KWHzl;
        public AnalogClock OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnalogClock AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Adapter KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ThemedSpinnerAdapter themedSpinnerAdapter) {
            this();
            Intrinsics.checkNotNullParameter(themedSpinnerAdapter, "");
            this.KWHzl = themedSpinnerAdapter.OLrzqt();
            this.EZpvd = themedSpinnerAdapter.AEQbTJ();
            this.AEQbTJ = themedSpinnerAdapter.copydefault();
            this.copydefault = themedSpinnerAdapter.KWHzl();
            this.OLrzqt = themedSpinnerAdapter.EZpvd();
        }

        public final ThemedSpinnerAdapter copydefault() {
            return new ThemedSpinnerAdapter(this, null);
        }
    }
}
