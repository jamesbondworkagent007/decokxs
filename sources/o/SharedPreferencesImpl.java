package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SharedPreferencesImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SharedPreferencesImpl {
    public static final Activity copydefault = new Activity(null);
    public final JobSchedulerImpl KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SharedPreferencesImpl$StateListAnimator) A[MD:(o.SharedPreferencesImpl$StateListAnimator):void (m)] call: o.SharedPreferencesImpl.<init>(o.SharedPreferencesImpl$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SharedPreferencesImpl(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JobSchedulerImpl EZpvd() {
        return this.KWHzl;
    }

    public SharedPreferencesImpl(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.KWHzl();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SharedPreferencesImpl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetLogDeliveryConfigurationResponse(");
        sb.append("logDeliveryConfiguration=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        JobSchedulerImpl jobSchedulerImpl = this.KWHzl;
        if (jobSchedulerImpl != null) {
            return jobSchedulerImpl.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && SharedPreferencesImpl.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((SharedPreferencesImpl) obj).KWHzl);
    }

    public static /* synthetic */ SharedPreferencesImpl copy$default(SharedPreferencesImpl sharedPreferencesImpl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetLogDeliveryConfigurationResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SharedPreferencesImpl.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SharedPreferencesImpl.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(sharedPreferencesImpl);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public JobSchedulerImpl copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JobSchedulerImpl KWHzl() {
            return this.copydefault;
        }

        public final StateListAnimator copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(JobSchedulerImpl jobSchedulerImpl) {
            this.copydefault = jobSchedulerImpl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull SharedPreferencesImpl sharedPreferencesImpl) {
            this();
            Intrinsics.checkNotNullParameter(sharedPreferencesImpl, "");
            this.copydefault = sharedPreferencesImpl.EZpvd();
        }

        public final SharedPreferencesImpl EZpvd() {
            return new SharedPreferencesImpl(this, null);
        }
    }
}
