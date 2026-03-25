package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47912tz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47912tz {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<C46240tN> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tz$Activity) A[MD:(o.tz$Activity):void (m)] call: o.tz.<init>(o.tz$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47912tz(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C46240tN> KWHzl() {
        return this.copydefault;
    }

    public C47912tz(Activity activity) {
        this.copydefault = activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListTagsForResourceResponse(");
        sb.append("tags=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C46240tN> list = this.copydefault;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C47912tz.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((C47912tz) obj).copydefault);
    }

    public static /* synthetic */ C47912tz copy$default(C47912tz c47912tz, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ListTagsForResourceResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47912tz.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47912tz.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c47912tz);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: renamed from: o.tz$Activity */
    public static final class Activity {
        public java.util.List<C46240tN> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C46240tN> AEQbTJ() {
            return this.copydefault;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C46240tN> list) {
            this.copydefault = list;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C47912tz c47912tz) {
            this();
            Intrinsics.checkNotNullParameter(c47912tz, "");
            this.copydefault = c47912tz.KWHzl();
        }

        public final C47912tz copydefault() {
            return new C47912tz(this, null);
        }
    }
}
