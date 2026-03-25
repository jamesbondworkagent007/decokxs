package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ServiceSpecificException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ServiceSpecificException {
    public static final Application AEQbTJ = new Application(null);
    public final SharedMemory KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ServiceSpecificException$Activity) A[MD:(o.ServiceSpecificException$Activity):void (m)] call: o.ServiceSpecificException.<init>(o.ServiceSpecificException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ServiceSpecificException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedMemory KWHzl() {
        return this.KWHzl;
    }

    public ServiceSpecificException(Activity activity) {
        this.KWHzl = activity.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ServiceSpecificException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InvalidRequestDetail(");
        sb.append("reason=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SharedMemory sharedMemory = this.KWHzl;
        if (sharedMemory != null) {
            return sharedMemory.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ServiceSpecificException.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((ServiceSpecificException) obj).KWHzl);
    }

    public static /* synthetic */ ServiceSpecificException copy$default(ServiceSpecificException serviceSpecificException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.InvalidRequestDetail$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ServiceSpecificException.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ServiceSpecificException.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(serviceSpecificException);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public SharedMemory copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SharedMemory AEQbTJ() {
            return this.copydefault;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(SharedMemory sharedMemory) {
            this.copydefault = sharedMemory;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ServiceSpecificException serviceSpecificException) {
            this();
            Intrinsics.checkNotNullParameter(serviceSpecificException, "");
            this.copydefault = serviceSpecificException.KWHzl();
        }

        public final ServiceSpecificException KWHzl() {
            return new ServiceSpecificException(this, null);
        }
    }
}
