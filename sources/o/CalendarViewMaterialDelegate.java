package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.CalendarViewMaterialDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CalendarViewMaterialDelegate {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CalendarViewMaterialDelegate$ActionBar) A[MD:(o.CalendarViewMaterialDelegate$ActionBar):void (m)] call: o.CalendarViewMaterialDelegate.<init>(o.CalendarViewMaterialDelegate$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CalendarViewMaterialDelegate(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    public CalendarViewMaterialDelegate(ActionBar actionBar) {
        java.lang.String strKWHzl = actionBar.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for sessionId".toString());
        }
        this.AEQbTJ = strKWHzl;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CalendarViewMaterialDelegate.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateFaceLivenessSessionResponse(");
        sb.append("sessionId=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && CalendarViewMaterialDelegate.class == obj.getClass() && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((CalendarViewMaterialDelegate) obj).AEQbTJ);
    }

    public static /* synthetic */ CalendarViewMaterialDelegate copy$default(CalendarViewMaterialDelegate calendarViewMaterialDelegate, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CreateFaceLivenessSessionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CalendarViewMaterialDelegate.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CalendarViewMaterialDelegate.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(calendarViewMaterialDelegate);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull CalendarViewMaterialDelegate calendarViewMaterialDelegate) {
            this();
            Intrinsics.checkNotNullParameter(calendarViewMaterialDelegate, "");
            this.AEQbTJ = calendarViewMaterialDelegate.KWHzl();
        }

        public final CalendarViewMaterialDelegate OLrzqt() {
            return new CalendarViewMaterialDelegate(this, null);
        }
    }
}
