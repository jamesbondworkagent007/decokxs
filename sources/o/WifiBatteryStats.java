package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WifiBatteryStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WifiBatteryStats {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.util.List<DiskReadViolation> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WifiBatteryStats$ActionBar) A[MD:(o.WifiBatteryStats$ActionBar):void (m)] call: o.WifiBatteryStats.<init>(o.WifiBatteryStats$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WifiBatteryStats(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DiskReadViolation> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    public WifiBatteryStats(ActionBar actionBar) {
        this.copydefault = actionBar.OLrzqt();
        this.OLrzqt = actionBar.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WifiBatteryStats.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListPiiEntitiesDetectionJobsResponse(");
        sb.append("nextToken=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("piiEntitiesDetectionJobPropertiesList=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<DiskReadViolation> list = this.OLrzqt;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WifiBatteryStats.class != obj.getClass()) {
            return false;
        }
        WifiBatteryStats wifiBatteryStats = (WifiBatteryStats) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) wifiBatteryStats.copydefault) && Intrinsics.EZpvd(this.OLrzqt, wifiBatteryStats.OLrzqt);
    }

    public static /* synthetic */ WifiBatteryStats copy$default(WifiBatteryStats wifiBatteryStats, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListPiiEntitiesDetectionJobsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WifiBatteryStats.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WifiBatteryStats.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(wifiBatteryStats);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.lang.String KWHzl;
        public java.util.List<DiskReadViolation> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<DiskReadViolation> list) {
            this.copydefault = list;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DiskReadViolation> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull WifiBatteryStats wifiBatteryStats) {
            this();
            Intrinsics.checkNotNullParameter(wifiBatteryStats, "");
            this.KWHzl = wifiBatteryStats.EZpvd();
            this.copydefault = wifiBatteryStats.AEQbTJ();
        }

        public final WifiBatteryStats copydefault() {
            return new WifiBatteryStats(this, null);
        }
    }
}
