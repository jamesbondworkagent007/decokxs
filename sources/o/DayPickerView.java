package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DayPickerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DayPickerView {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final byte[] copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DayPickerView$Activity) A[MD:(o.DayPickerView$Activity):void (m)] call: o.DayPickerView.<init>(o.DayPickerView$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DayPickerView(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] OLrzqt() {
        return this.copydefault;
    }

    public DayPickerView(Activity activity) {
        byte[] bArrOLrzqt = activity.OLrzqt();
        if (bArrOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for groundTruth".toString());
        }
        this.copydefault = bArrOLrzqt;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DayPickerView.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetChanges(");
        sb.append("groundTruth=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(this.copydefault);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DayPickerView.class != obj.getClass()) {
            return false;
        }
        DayPickerView dayPickerView = (DayPickerView) obj;
        byte[] bArr = this.copydefault;
        if (bArr != null) {
            byte[] bArr2 = dayPickerView.copydefault;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (dayPickerView.copydefault != null) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ DayPickerView copy$default(DayPickerView dayPickerView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DatasetChanges$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DayPickerView.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DayPickerView.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(dayPickerView);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public byte[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] OLrzqt() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull DayPickerView dayPickerView) {
            this();
            Intrinsics.checkNotNullParameter(dayPickerView, "");
            this.OLrzqt = dayPickerView.OLrzqt();
        }

        public final DayPickerView EZpvd() {
            return new DayPickerView(this, null);
        }
    }
}
