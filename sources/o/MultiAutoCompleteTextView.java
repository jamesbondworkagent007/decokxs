package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MultiAutoCompleteTextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MultiAutoCompleteTextView {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.util.List<DatePickerCalendarDelegate> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MultiAutoCompleteTextView$Activity) A[MD:(o.MultiAutoCompleteTextView$Activity):void (m)] call: o.MultiAutoCompleteTextView.<init>(o.MultiAutoCompleteTextView$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MultiAutoCompleteTextView(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DatePickerCalendarDelegate> EZpvd() {
        return this.KWHzl;
    }

    public MultiAutoCompleteTextView(Activity activity) {
        this.KWHzl = activity.OLrzqt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MultiAutoCompleteTextView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectCustomLabelsResponse(");
        sb.append("customLabels=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<DatePickerCalendarDelegate> list = this.KWHzl;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && MultiAutoCompleteTextView.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((MultiAutoCompleteTextView) obj).KWHzl);
    }

    public static /* synthetic */ MultiAutoCompleteTextView copy$default(MultiAutoCompleteTextView multiAutoCompleteTextView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectCustomLabelsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MultiAutoCompleteTextView.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MultiAutoCompleteTextView.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(multiAutoCompleteTextView);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.util.List<DatePickerCalendarDelegate> EZpvd;

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DatePickerCalendarDelegate> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<DatePickerCalendarDelegate> list) {
            this.EZpvd = list;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull MultiAutoCompleteTextView multiAutoCompleteTextView) {
            this();
            Intrinsics.checkNotNullParameter(multiAutoCompleteTextView, "");
            this.EZpvd = multiAutoCompleteTextView.EZpvd();
        }

        public final MultiAutoCompleteTextView AEQbTJ() {
            return new MultiAutoCompleteTextView(this, null);
        }
    }
}
