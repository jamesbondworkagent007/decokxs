package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SystemServiceRegistry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class SystemServiceRegistry {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final DevicePolicyManager KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SystemServiceRegistry$Activity) A[MD:(o.SystemServiceRegistry$Activity):void (m)] call: o.SystemServiceRegistry.<init>(o.SystemServiceRegistry$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SystemServiceRegistry(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevicePolicyManager EZpvd() {
        return this.KWHzl;
    }

    public SystemServiceRegistry(Activity activity) {
        this.KWHzl = activity.OLrzqt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SystemServiceRegistry.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetUiCustomizationResponse(");
        sb.append("uiCustomization=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        DevicePolicyManager devicePolicyManager = this.KWHzl;
        if (devicePolicyManager != null) {
            return devicePolicyManager.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && SystemServiceRegistry.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((SystemServiceRegistry) obj).KWHzl);
    }

    public static /* synthetic */ SystemServiceRegistry copy$default(SystemServiceRegistry systemServiceRegistry, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetUiCustomizationResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SystemServiceRegistry.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SystemServiceRegistry.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(systemServiceRegistry);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public DevicePolicyManager OLrzqt;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(DevicePolicyManager devicePolicyManager) {
            this.OLrzqt = devicePolicyManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DevicePolicyManager OLrzqt() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull SystemServiceRegistry systemServiceRegistry) {
            this();
            Intrinsics.checkNotNullParameter(systemServiceRegistry, "");
            this.OLrzqt = systemServiceRegistry.EZpvd();
        }

        public final SystemServiceRegistry copydefault() {
            return new SystemServiceRegistry(this, null);
        }
    }
}
