package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C8456bD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8456bD {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.Float AEQbTJ;
    public final WebViewLibraryLoader OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bD$Activity) A[MD:(o.bD$Activity):void (m)] call: o.bD.<init>(o.bD$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8456bD(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewLibraryLoader KWHzl() {
        return this.OLrzqt;
    }

    public C8456bD(Activity activity) {
        this.OLrzqt = activity.KWHzl();
        this.AEQbTJ = activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.bD$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bD.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTechnicalCueDetectionFilter(");
        sb.append("blackFrame=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("minSegmentConfidence=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewLibraryLoader webViewLibraryLoader = this.OLrzqt;
        int iHashCode = webViewLibraryLoader != null ? webViewLibraryLoader.hashCode() : 0;
        java.lang.Float f = this.AEQbTJ;
        return (iHashCode * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8456bD.class != obj.getClass()) {
            return false;
        }
        C8456bD c8456bD = (C8456bD) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c8456bD.OLrzqt) && Intrinsics.copydefault(this.AEQbTJ, c8456bD.AEQbTJ);
    }

    public static /* synthetic */ C8456bD copy$default(C8456bD c8456bD, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartTechnicalCueDetectionFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8456bD.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8456bD.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c8456bD);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bD$Activity */
    public static final class Activity {
        public java.lang.Float AEQbTJ;
        public WebViewLibraryLoader copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewLibraryLoader KWHzl() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C8456bD c8456bD) {
            this();
            Intrinsics.checkNotNullParameter(c8456bD, "");
            this.copydefault = c8456bD.KWHzl();
            this.AEQbTJ = c8456bD.AEQbTJ();
        }

        public final C8456bD OLrzqt() {
            return new C8456bD(this, null);
        }
    }
}
