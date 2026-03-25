package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SeekBarDialogPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SeekBarDialogPreference {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final StatsDimensionsValue EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SeekBarDialogPreference$ActionBar) A[MD:(o.SeekBarDialogPreference$ActionBar):void (m)] call: o.SeekBarDialogPreference.<init>(o.SeekBarDialogPreference$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SeekBarDialogPreference(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue OLrzqt() {
        return this.EZpvd;
    }

    public SeekBarDialogPreference(ActionBar actionBar) {
        this.copydefault = actionBar.AEQbTJ();
        this.EZpvd = actionBar.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SeekBarDialogPreference.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StopDominantLanguageDetectionJobResponse(");
        sb.append("jobId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("jobStatus=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.EZpvd;
        return (iHashCode * 31) + (statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekBarDialogPreference.class != obj.getClass()) {
            return false;
        }
        SeekBarDialogPreference seekBarDialogPreference = (SeekBarDialogPreference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) seekBarDialogPreference.copydefault) && Intrinsics.EZpvd(this.EZpvd, seekBarDialogPreference.EZpvd);
    }

    public static /* synthetic */ SeekBarDialogPreference copy$default(SeekBarDialogPreference seekBarDialogPreference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StopDominantLanguageDetectionJobResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SeekBarDialogPreference.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SeekBarDialogPreference.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(seekBarDialogPreference);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public java.lang.String EZpvd;
        public StatsDimensionsValue OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(StatsDimensionsValue statsDimensionsValue) {
            this.OLrzqt = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue copydefault() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull SeekBarDialogPreference seekBarDialogPreference) {
            this();
            Intrinsics.checkNotNullParameter(seekBarDialogPreference, "");
            this.EZpvd = seekBarDialogPreference.AEQbTJ();
            this.OLrzqt = seekBarDialogPreference.OLrzqt();
        }

        public final SeekBarDialogPreference OLrzqt() {
            return new SeekBarDialogPreference(this, null);
        }
    }
}
