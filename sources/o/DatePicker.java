package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class DatePicker {
    public static final ActionBar copydefault = new ActionBar(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DatePicker$Activity) A[MD:(o.DatePicker$Activity):void (m)] call: o.DatePicker.<init>(o.DatePicker$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DatePicker(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public DatePicker(Activity activity) {
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DatePicker.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "CreateUserResponse()";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        return C56524yIo.AEQbTJ(DatePicker.class).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatePicker.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public static final class Activity {
        public final Activity AEQbTJ() {
            return this;
        }

        public final DatePicker copydefault() {
            return new DatePicker(this, null);
        }
    }
}
