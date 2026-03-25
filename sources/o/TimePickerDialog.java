package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TimePickerDialog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TimePickerDialog {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final WaitResult OLrzqt;
    public final WindowConfiguration copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TimePickerDialog$StateListAnimator) A[MD:(o.TimePickerDialog$StateListAnimator):void (m)] call: o.TimePickerDialog.<init>(o.TimePickerDialog$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TimePickerDialog(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WaitResult KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WindowConfiguration OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public TimePickerDialog(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TimePickerDialog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetUserMfaPreferenceRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("smsMfaSettings=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("softwareTokenMfaSettings=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        WaitResult waitResult = this.OLrzqt;
        int iHashCode2 = waitResult != null ? waitResult.hashCode() : 0;
        WindowConfiguration windowConfiguration = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (windowConfiguration != null ? windowConfiguration.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimePickerDialog.class != obj.getClass()) {
            return false;
        }
        TimePickerDialog timePickerDialog = (TimePickerDialog) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) timePickerDialog.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, timePickerDialog.OLrzqt) && Intrinsics.EZpvd(this.copydefault, timePickerDialog.copydefault);
    }

    public static /* synthetic */ TimePickerDialog copy$default(TimePickerDialog timePickerDialog, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetUserMfaPreferenceRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TimePickerDialog.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TimePickerDialog.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(timePickerDialog);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class StateListAnimator {
        public WindowConfiguration EZpvd;
        public java.lang.String OLrzqt;
        public WaitResult copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WindowConfiguration AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WindowConfiguration windowConfiguration) {
            this.EZpvd = windowConfiguration;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WaitResult OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(WaitResult waitResult) {
            this.copydefault = waitResult;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull TimePickerDialog timePickerDialog) {
            this();
            Intrinsics.checkNotNullParameter(timePickerDialog, "");
            this.OLrzqt = timePickerDialog.copydefault();
            this.copydefault = timePickerDialog.KWHzl();
            this.EZpvd = timePickerDialog.OLrzqt();
        }

        public final TimePickerDialog KWHzl() {
            return new TimePickerDialog(this, null);
        }
    }
}
