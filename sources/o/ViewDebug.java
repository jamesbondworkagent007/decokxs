package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ViewDebug;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewDebug {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ViewDebug$Activity) A[MD:(o.ViewDebug$Activity):void (m)] call: o.ViewDebug.<init>(o.ViewDebug$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewDebug(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    public ViewDebug(Activity activity) {
        java.lang.String strAEQbTJ = activity.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.EZpvd = strAEQbTJ;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ViewDebug.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final class Activity {
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        public final ViewDebug copydefault() {
            return new ViewDebug(this, null);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PollyAuthSchemeParameters(");
        sb.append("operationName=" + this.EZpvd + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewDebug) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((ViewDebug) obj).EZpvd);
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ViewDebug */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ViewDebug copy$default(ViewDebug viewDebug, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.polly.auth.PollyAuthSchemeParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ViewDebug.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewDebug.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        return viewDebug.OLrzqt(function1);
    }

    public final ViewDebug OLrzqt(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity();
        activity.AEQbTJ(this.EZpvd);
        function1.invoke(activity);
        return activity.copydefault();
    }
}
