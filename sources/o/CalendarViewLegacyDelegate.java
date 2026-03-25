package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CalendarViewLegacyDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CalendarViewLegacyDelegate {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final V AEQbTJ;
    public final java.lang.Integer EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CalendarViewLegacyDelegate$Activity) A[MD:(o.CalendarViewLegacyDelegate$Activity):void (m)] call: o.CalendarViewLegacyDelegate.<init>(o.CalendarViewLegacyDelegate$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CalendarViewLegacyDelegate(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V KWHzl() {
        return this.AEQbTJ;
    }

    public CalendarViewLegacyDelegate(Activity activity) {
        this.EZpvd = activity.KWHzl();
        this.AEQbTJ = activity.AEQbTJ();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CalendarViewLegacyDelegate.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateFaceLivenessSessionRequestSettings(");
        sb.append("auditImagesLimit=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("outputConfig=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        V v = this.AEQbTJ;
        return (iIntValue * 31) + (v != null ? v.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CalendarViewLegacyDelegate.class != obj.getClass()) {
            return false;
        }
        CalendarViewLegacyDelegate calendarViewLegacyDelegate = (CalendarViewLegacyDelegate) obj;
        return Intrinsics.EZpvd(this.EZpvd, calendarViewLegacyDelegate.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, calendarViewLegacyDelegate.AEQbTJ);
    }

    public static /* synthetic */ CalendarViewLegacyDelegate copy$default(CalendarViewLegacyDelegate calendarViewLegacyDelegate, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CreateFaceLivenessSessionRequestSettings$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CalendarViewLegacyDelegate.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CalendarViewLegacyDelegate.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(calendarViewLegacyDelegate);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public V EZpvd;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull CalendarViewLegacyDelegate calendarViewLegacyDelegate) {
            this();
            Intrinsics.checkNotNullParameter(calendarViewLegacyDelegate, "");
            this.OLrzqt = calendarViewLegacyDelegate.AEQbTJ();
            this.EZpvd = calendarViewLegacyDelegate.KWHzl();
        }

        public final CalendarViewLegacyDelegate OLrzqt() {
            return new CalendarViewLegacyDelegate(this, null);
        }
    }
}
