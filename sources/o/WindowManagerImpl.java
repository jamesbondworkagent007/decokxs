package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WindowManagerImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WindowManagerImpl {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.String AEQbTJ;
    public final AccelerateInterpolator EZpvd;
    public final java.lang.Boolean KWHzl;
    public final AccessibilityCache copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WindowManagerImpl$Activity) A[MD:(o.WindowManagerImpl$Activity):void (m)] call: o.WindowManagerImpl.<init>(o.WindowManagerImpl$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WindowManagerImpl(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccelerateInterpolator AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessibilityCache OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.KWHzl;
    }

    public WindowManagerImpl(Activity activity) {
        this.copydefault = activity.KWHzl();
        this.KWHzl = activity.EZpvd();
        this.EZpvd = activity.AEQbTJ();
        this.AEQbTJ = activity.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WindowManagerImpl.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final WindowManagerImpl EZpvd(@NotNull Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activity = new Activity();
            function1.invoke(activity);
            return activity.copydefault();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeVoicesRequest(");
        sb.append("engine=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("includeAdditionalLanguageCodes=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccessibilityCache accessibilityCache = this.copydefault;
        int iHashCode = accessibilityCache != null ? accessibilityCache.hashCode() : 0;
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode2 = bool != null ? bool.hashCode() : 0;
        AccelerateInterpolator accelerateInterpolator = this.EZpvd;
        int iHashCode3 = accelerateInterpolator != null ? accelerateInterpolator.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WindowManagerImpl.class != obj.getClass()) {
            return false;
        }
        WindowManagerImpl windowManagerImpl = (WindowManagerImpl) obj;
        return Intrinsics.EZpvd(this.copydefault, windowManagerImpl.copydefault) && Intrinsics.EZpvd(this.KWHzl, windowManagerImpl.KWHzl) && Intrinsics.EZpvd(this.EZpvd, windowManagerImpl.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) windowManagerImpl.AEQbTJ);
    }

    public static /* synthetic */ WindowManagerImpl copy$default(WindowManagerImpl windowManagerImpl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.DescribeVoicesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WindowManagerImpl.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WindowManagerImpl.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(windowManagerImpl);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public AccessibilityCache EZpvd;
        public AccelerateInterpolator KWHzl;
        public java.lang.Boolean OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccelerateInterpolator AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccessibilityCache KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull WindowManagerImpl windowManagerImpl) {
            this();
            Intrinsics.checkNotNullParameter(windowManagerImpl, "");
            this.EZpvd = windowManagerImpl.OLrzqt();
            this.OLrzqt = windowManagerImpl.copydefault();
            this.KWHzl = windowManagerImpl.AEQbTJ();
            this.copydefault = windowManagerImpl.EZpvd();
        }

        public final WindowManagerImpl copydefault() {
            return new WindowManagerImpl(this, null);
        }
    }
}
