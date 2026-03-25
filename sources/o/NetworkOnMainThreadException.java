package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.NetworkOnMainThreadException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkOnMainThreadException {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<ProxyFileDescriptorCallback> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkOnMainThreadException$Activity) A[MD:(o.NetworkOnMainThreadException$Activity):void (m)] call: o.NetworkOnMainThreadException.<init>(o.NetworkOnMainThreadException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkOnMainThreadException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ProxyFileDescriptorCallback> OLrzqt() {
        return this.EZpvd;
    }

    public NetworkOnMainThreadException(Activity activity) {
        java.util.List<ProxyFileDescriptorCallback> listKWHzl = activity.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for entityTypes".toString());
        }
        this.EZpvd = listKWHzl;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkOnMainThreadException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EntityRecognitionConfig(");
        sb.append("entityTypes=" + this.EZpvd);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && NetworkOnMainThreadException.class == obj.getClass() && Intrinsics.EZpvd(this.EZpvd, ((NetworkOnMainThreadException) obj).EZpvd);
    }

    public static /* synthetic */ NetworkOnMainThreadException copy$default(NetworkOnMainThreadException networkOnMainThreadException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EntityRecognitionConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkOnMainThreadException.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkOnMainThreadException.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(networkOnMainThreadException);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.util.List<ProxyFileDescriptorCallback> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<ProxyFileDescriptorCallback> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ProxyFileDescriptorCallback> KWHzl() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull NetworkOnMainThreadException networkOnMainThreadException) {
            this();
            Intrinsics.checkNotNullParameter(networkOnMainThreadException, "");
            this.OLrzqt = networkOnMainThreadException.OLrzqt();
        }

        public final NetworkOnMainThreadException copydefault() {
            return new NetworkOnMainThreadException(this, null);
        }

        public final Activity EZpvd() {
            if (this.OLrzqt == null) {
                this.OLrzqt = yDY.AhwBna();
            }
            return this;
        }
    }
}
