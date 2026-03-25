package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TrafficStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TrafficStats {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final FileUriExposedException AEQbTJ;
    public final java.util.List<HardwarePropertiesManager> EZpvd;
    public final java.util.List<RecoverySystem> OLrzqt;
    public final java.util.List<CommonClock> copydefault;
    public final java.util.List<FileUtils> djBIcL;
    public final java.util.List<DocumentsProvider> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TrafficStats$ActionBar) A[MD:(o.TrafficStats$ActionBar):void (m)] call: o.TrafficStats.<init>(o.TrafficStats$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TrafficStats(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CommonClock> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileUriExposedException EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HardwarePropertiesManager> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<RecoverySystem> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FileUtils> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DocumentsProvider> djBIcL() {
        return this.valueOf;
    }

    public TrafficStats(ActionBar actionBar) {
        this.copydefault = actionBar.KWHzl();
        this.AEQbTJ = actionBar.copydefault();
        this.EZpvd = actionBar.OLrzqt();
        this.OLrzqt = actionBar.djBIcL();
        this.djBIcL = actionBar.gEmmrt();
        this.valueOf = actionBar.valueOf();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TrafficStats.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "ClassifyDocumentResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        java.util.List<CommonClock> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        FileUriExposedException fileUriExposedException = this.AEQbTJ;
        int iHashCode2 = fileUriExposedException != null ? fileUriExposedException.hashCode() : 0;
        java.util.List<HardwarePropertiesManager> list2 = this.EZpvd;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        java.util.List<RecoverySystem> list3 = this.OLrzqt;
        int iHashCode4 = list3 != null ? list3.hashCode() : 0;
        java.util.List<FileUtils> list4 = this.djBIcL;
        int iHashCode5 = list4 != null ? list4.hashCode() : 0;
        java.util.List<DocumentsProvider> list5 = this.valueOf;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list5 != null ? list5.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrafficStats.class != obj.getClass()) {
            return false;
        }
        TrafficStats trafficStats = (TrafficStats) obj;
        return Intrinsics.EZpvd(this.copydefault, trafficStats.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, trafficStats.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, trafficStats.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, trafficStats.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, trafficStats.djBIcL) && Intrinsics.EZpvd(this.valueOf, trafficStats.valueOf);
    }

    public static /* synthetic */ TrafficStats copy$default(TrafficStats trafficStats, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ClassifyDocumentResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TrafficStats.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TrafficStats.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(trafficStats);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public java.util.List<CommonClock> AEQbTJ;
        public java.util.List<RecoverySystem> EZpvd;
        public java.util.List<HardwarePropertiesManager> KWHzl;
        public FileUriExposedException OLrzqt;
        public java.util.List<FileUtils> copydefault;
        public java.util.List<DocumentsProvider> djBIcL;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<DocumentsProvider> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<FileUtils> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(FileUriExposedException fileUriExposedException) {
            this.OLrzqt = fileUriExposedException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<CommonClock> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<CommonClock> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HardwarePropertiesManager> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<RecoverySystem> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FileUriExposedException copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<HardwarePropertiesManager> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<RecoverySystem> djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FileUtils> gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<DocumentsProvider> valueOf() {
            return this.djBIcL;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TrafficStats trafficStats) {
            this();
            Intrinsics.checkNotNullParameter(trafficStats, "");
            this.AEQbTJ = trafficStats.AEQbTJ();
            this.OLrzqt = trafficStats.EZpvd();
            this.KWHzl = trafficStats.KWHzl();
            this.EZpvd = trafficStats.OLrzqt();
            this.copydefault = trafficStats.copydefault();
            this.djBIcL = trafficStats.djBIcL();
        }

        public final TrafficStats EZpvd() {
            return new TrafficStats(this, null);
        }
    }
}
