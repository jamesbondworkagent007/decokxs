package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PowerManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PowerManager {
    public static final Application EZpvd = new Application(null);
    public final C5173Hn AEQbTJ;
    public final C5173Hn KWHzl;
    public final java.lang.String OLrzqt;
    public final StatsDimensionsValue copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PowerManager$ActionBar) A[MD:(o.PowerManager$ActionBar):void (m)] call: o.PowerManager.<init>(o.PowerManager$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PowerManager(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.KWHzl;
    }

    public PowerManager(ActionBar actionBar) {
        this.OLrzqt = actionBar.EZpvd();
        this.copydefault = actionBar.OLrzqt();
        this.KWHzl = actionBar.AEQbTJ();
        this.AEQbTJ = actionBar.copydefault();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PowerManager.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EventsDetectionJobFilter(");
        sb.append("jobName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.copydefault;
        int iHashCode2 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PowerManager.class != obj.getClass()) {
            return false;
        }
        PowerManager powerManager = (PowerManager) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) powerManager.OLrzqt) && Intrinsics.EZpvd(this.copydefault, powerManager.copydefault) && Intrinsics.EZpvd(this.KWHzl, powerManager.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, powerManager.AEQbTJ);
    }

    public static /* synthetic */ PowerManager copy$default(PowerManager powerManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.EventsDetectionJobFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PowerManager.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PowerManager.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(powerManager);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public C5173Hn AEQbTJ;
        public StatsDimensionsValue EZpvd;
        public java.lang.String OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull PowerManager powerManager) {
            this();
            Intrinsics.checkNotNullParameter(powerManager, "");
            this.OLrzqt = powerManager.EZpvd();
            this.EZpvd = powerManager.OLrzqt();
            this.AEQbTJ = powerManager.copydefault();
            this.copydefault = powerManager.KWHzl();
        }

        public final PowerManager KWHzl() {
            return new PowerManager(this, null);
        }
    }
}
