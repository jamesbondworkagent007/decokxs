package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ActivityChooserView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ActivityChooserView {
    public static final Application copydefault = new Application(null);
    public final java.util.List<java.lang.String> EZpvd;
    public final java.lang.Float KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ActivityChooserView$Activity) A[MD:(o.ActivityChooserView$Activity):void (m)] call: o.ActivityChooserView.<init>(o.ActivityChooserView$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActivityChooserView(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.KWHzl;
    }

    public ActivityChooserView(Activity activity) {
        this.EZpvd = activity.OLrzqt();
        this.KWHzl = activity.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActivityChooserView.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectedHomeSettingsForUpdate(");
        sb.append("labels=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("minConfidence=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Float f = this.KWHzl;
        return (iHashCode * 31) + (f != null ? f.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityChooserView.class != obj.getClass()) {
            return false;
        }
        ActivityChooserView activityChooserView = (ActivityChooserView) obj;
        return Intrinsics.EZpvd(this.EZpvd, activityChooserView.EZpvd) && Intrinsics.copydefault(this.KWHzl, activityChooserView.KWHzl);
    }

    public static /* synthetic */ ActivityChooserView copy$default(ActivityChooserView activityChooserView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ConnectedHomeSettingsForUpdate$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActivityChooserView.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActivityChooserView.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(activityChooserView);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.lang.Float AEQbTJ;
        public java.util.List<java.lang.String> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ActivityChooserView activityChooserView) {
            this();
            Intrinsics.checkNotNullParameter(activityChooserView, "");
            this.KWHzl = activityChooserView.KWHzl();
            this.AEQbTJ = activityChooserView.copydefault();
        }

        public final ActivityChooserView EZpvd() {
            return new ActivityChooserView(this, null);
        }
    }
}
