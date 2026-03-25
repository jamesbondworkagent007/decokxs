package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SynchronousUserSwitchObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SynchronousUserSwitchObserver {
    public static final Application EZpvd = new Application(null);
    public final LongStream AEQbTJ;
    public final java.lang.String AYXKKw;
    public final FloatArrayEvaluator KWHzl;
    public final java.lang.String OLrzqt;
    public final ServiceStartArgs copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SynchronousUserSwitchObserver$StateListAnimator) A[MD:(o.SynchronousUserSwitchObserver$StateListAnimator):void (m)] call: o.SynchronousUserSwitchObserver.<init>(o.SynchronousUserSwitchObserver$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SynchronousUserSwitchObserver(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceStartArgs AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FloatArrayEvaluator OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LongStream copydefault() {
        return this.AEQbTJ;
    }

    public SynchronousUserSwitchObserver(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.EZpvd();
        this.AYXKKw = stateListAnimator.djBIcL();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SynchronousUserSwitchObserver.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetRiskConfigurationRequest(");
        sb.append("accountTakeoverRiskConfiguration=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("compromisedCredentialsRiskConfiguration=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("riskExceptionConfiguration=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        LongStream longStream = this.AEQbTJ;
        int iHashCode = longStream != null ? longStream.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        FloatArrayEvaluator floatArrayEvaluator = this.KWHzl;
        int iHashCode3 = floatArrayEvaluator != null ? floatArrayEvaluator.hashCode() : 0;
        ServiceStartArgs serviceStartArgs = this.copydefault;
        int iHashCode4 = serviceStartArgs != null ? serviceStartArgs.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SynchronousUserSwitchObserver.class != obj.getClass()) {
            return false;
        }
        SynchronousUserSwitchObserver synchronousUserSwitchObserver = (SynchronousUserSwitchObserver) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, synchronousUserSwitchObserver.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) synchronousUserSwitchObserver.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, synchronousUserSwitchObserver.KWHzl) && Intrinsics.EZpvd(this.copydefault, synchronousUserSwitchObserver.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) synchronousUserSwitchObserver.AYXKKw);
    }

    public static /* synthetic */ SynchronousUserSwitchObserver copy$default(SynchronousUserSwitchObserver synchronousUserSwitchObserver, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetRiskConfigurationRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SynchronousUserSwitchObserver.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SynchronousUserSwitchObserver.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(synchronousUserSwitchObserver);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public FloatArrayEvaluator AEQbTJ;
        public java.lang.String EZpvd;
        public LongStream KWHzl;
        public ServiceStartArgs OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FloatArrayEvaluator AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceStartArgs EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LongStream OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.EZpvd;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull SynchronousUserSwitchObserver synchronousUserSwitchObserver) {
            this();
            Intrinsics.checkNotNullParameter(synchronousUserSwitchObserver, "");
            this.KWHzl = synchronousUserSwitchObserver.copydefault();
            this.copydefault = synchronousUserSwitchObserver.EZpvd();
            this.AEQbTJ = synchronousUserSwitchObserver.OLrzqt();
            this.OLrzqt = synchronousUserSwitchObserver.AEQbTJ();
            this.EZpvd = synchronousUserSwitchObserver.KWHzl();
        }

        public final SynchronousUserSwitchObserver copydefault() {
            return new SynchronousUserSwitchObserver(this, null);
        }
    }
}
