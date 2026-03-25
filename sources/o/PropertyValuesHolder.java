package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PropertyValuesHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PropertyValuesHolder {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final RestoreObserver OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PropertyValuesHolder$Activity) A[MD:(o.PropertyValuesHolder$Activity):void (m)] call: o.PropertyValuesHolder.<init>(o.PropertyValuesHolder$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PropertyValuesHolder(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreObserver KWHzl() {
        return this.OLrzqt;
    }

    public PropertyValuesHolder(Activity activity) {
        this.OLrzqt = activity.EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PropertyValuesHolder.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateUserPoolClientResponse(");
        sb.append("userPoolClient=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RestoreObserver restoreObserver = this.OLrzqt;
        if (restoreObserver != null) {
            return restoreObserver.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && PropertyValuesHolder.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((PropertyValuesHolder) obj).OLrzqt);
    }

    public static /* synthetic */ PropertyValuesHolder copy$default(PropertyValuesHolder propertyValuesHolder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateUserPoolClientResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PropertyValuesHolder.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PropertyValuesHolder.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(propertyValuesHolder);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public RestoreObserver EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreObserver EZpvd() {
            return this.EZpvd;
        }

        public final Activity copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(RestoreObserver restoreObserver) {
            this.EZpvd = restoreObserver;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull PropertyValuesHolder propertyValuesHolder) {
            this();
            Intrinsics.checkNotNullParameter(propertyValuesHolder, "");
            this.EZpvd = propertyValuesHolder.KWHzl();
        }

        public final PropertyValuesHolder AEQbTJ() {
            return new PropertyValuesHolder(this, null);
        }
    }
}
