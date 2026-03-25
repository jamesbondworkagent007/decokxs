package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TimePickerClockDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TimePickerClockDelegate {
    public static final Activity OLrzqt = new Activity(null);
    public final java.util.List<java.lang.String> EZpvd;
    public final java.lang.String KWHzl;
    public final C44009s copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TimePickerClockDelegate$ActionBar) A[MD:(o.TimePickerClockDelegate$ActionBar):void (m)] call: o.TimePickerClockDelegate.<init>(o.TimePickerClockDelegate$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TimePickerClockDelegate(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44009s copydefault() {
        return this.copydefault;
    }

    public TimePickerClockDelegate(ActionBar actionBar) {
        this.copydefault = actionBar.AEQbTJ();
        this.KWHzl = actionBar.KWHzl();
        this.EZpvd = actionBar.OLrzqt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TimePickerClockDelegate.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetCelebrityInfoResponse(");
        sb.append("knownGender=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("urls=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C44009s c44009s = this.copydefault;
        int iHashCode = c44009s != null ? c44009s.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.List<java.lang.String> list = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimePickerClockDelegate.class != obj.getClass()) {
            return false;
        }
        TimePickerClockDelegate timePickerClockDelegate = (TimePickerClockDelegate) obj;
        return Intrinsics.EZpvd(this.copydefault, timePickerClockDelegate.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) timePickerClockDelegate.KWHzl) && Intrinsics.EZpvd(this.EZpvd, timePickerClockDelegate.EZpvd);
    }

    public static /* synthetic */ TimePickerClockDelegate copy$default(TimePickerClockDelegate timePickerClockDelegate, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetCelebrityInfoResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TimePickerClockDelegate.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TimePickerClockDelegate.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(timePickerClockDelegate);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public java.lang.String EZpvd;
        public java.util.List<java.lang.String> KWHzl;
        public C44009s OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C44009s AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C44009s c44009s) {
            this.OLrzqt = c44009s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.KWHzl;
        }

        public final ActionBar copydefault() {
            return this;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TimePickerClockDelegate timePickerClockDelegate) {
            this();
            Intrinsics.checkNotNullParameter(timePickerClockDelegate, "");
            this.OLrzqt = timePickerClockDelegate.copydefault();
            this.EZpvd = timePickerClockDelegate.OLrzqt();
            this.KWHzl = timePickerClockDelegate.KWHzl();
        }

        public final TimePickerClockDelegate EZpvd() {
            return new TimePickerClockDelegate(this, null);
        }
    }
}
