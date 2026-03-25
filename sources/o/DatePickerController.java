package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DatePickerController {
    public static final Activity copydefault = new Activity(null);
    public final CursorTreeAdapter AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DatePickerController$ActionBar) A[MD:(o.DatePickerController$ActionBar):void (m)] call: o.DatePickerController.<init>(o.DatePickerController$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DatePickerController(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CursorTreeAdapter AEQbTJ() {
        return this.AEQbTJ;
    }

    public DatePickerController(ActionBar actionBar) {
        this.AEQbTJ = actionBar.AEQbTJ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DatePickerController.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomizationFeatureConfig(");
        sb.append("contentModeration=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        CursorTreeAdapter cursorTreeAdapter = this.AEQbTJ;
        if (cursorTreeAdapter != null) {
            return cursorTreeAdapter.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DatePickerController.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((DatePickerController) obj).AEQbTJ);
    }

    public static /* synthetic */ DatePickerController copy$default(DatePickerController datePickerController, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CustomizationFeatureConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DatePickerController.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DatePickerController.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(datePickerController);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public CursorTreeAdapter OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CursorTreeAdapter AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(CursorTreeAdapter cursorTreeAdapter) {
            this.OLrzqt = cursorTreeAdapter;
        }

        public final ActionBar copydefault() {
            return this;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull DatePickerController datePickerController) {
            this();
            Intrinsics.checkNotNullParameter(datePickerController, "");
            this.OLrzqt = datePickerController.AEQbTJ();
        }

        public final DatePickerController KWHzl() {
            return new DatePickerController(this, null);
        }
    }
}
