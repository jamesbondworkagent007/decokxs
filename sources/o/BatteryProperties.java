package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BatteryProperties;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BatteryProperties {
    public static final Application OLrzqt = new Application(null);
    public final java.util.List<ParseException> AEQbTJ;
    public final java.util.List<RecoverySystem> AhwBna;
    public final java.util.List<HardwarePropertiesManager> EZpvd;
    public final FileUriExposedException KWHzl;
    public final java.util.List<IncidentReportArgs> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BatteryProperties$ActionBar) A[MD:(o.BatteryProperties$ActionBar):void (m)] call: o.BatteryProperties.<init>(o.BatteryProperties$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BatteryProperties(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<IncidentReportArgs> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<RecoverySystem> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<HardwarePropertiesManager> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FileUriExposedException OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ParseException> copydefault() {
        return this.AEQbTJ;
    }

    public BatteryProperties(ActionBar actionBar) {
        this.AEQbTJ = actionBar.AEQbTJ();
        this.KWHzl = actionBar.KWHzl();
        this.EZpvd = actionBar.copydefault();
        this.copydefault = actionBar.gEmmrt();
        this.AhwBna = actionBar.AYXKKw();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BatteryProperties.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.String str = "DetectEntitiesResponse(*** Sensitive Data Redacted ***)";
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public int hashCode() {
        java.util.List<ParseException> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        FileUriExposedException fileUriExposedException = this.KWHzl;
        int iHashCode2 = fileUriExposedException != null ? fileUriExposedException.hashCode() : 0;
        java.util.List<HardwarePropertiesManager> list2 = this.EZpvd;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        java.util.List<IncidentReportArgs> list3 = this.copydefault;
        int iHashCode4 = list3 != null ? list3.hashCode() : 0;
        java.util.List<RecoverySystem> list4 = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BatteryProperties.class != obj.getClass()) {
            return false;
        }
        BatteryProperties batteryProperties = (BatteryProperties) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, batteryProperties.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, batteryProperties.KWHzl) && Intrinsics.EZpvd(this.EZpvd, batteryProperties.EZpvd) && Intrinsics.EZpvd(this.copydefault, batteryProperties.copydefault) && Intrinsics.EZpvd(this.AhwBna, batteryProperties.AhwBna);
    }

    public static /* synthetic */ BatteryProperties copy$default(BatteryProperties batteryProperties, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DetectEntitiesResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BatteryProperties.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BatteryProperties.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(batteryProperties);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public FileUriExposedException AEQbTJ;
        public java.util.List<ParseException> EZpvd;
        public java.util.List<IncidentReportArgs> KWHzl;
        public java.util.List<RecoverySystem> OLrzqt;
        public java.util.List<HardwarePropertiesManager> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ParseException> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<RecoverySystem> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<RecoverySystem> AYXKKw() {
            return this.OLrzqt;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<HardwarePropertiesManager> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FileUriExposedException KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<ParseException> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(FileUriExposedException fileUriExposedException) {
            this.AEQbTJ = fileUriExposedException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HardwarePropertiesManager> copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<IncidentReportArgs> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<IncidentReportArgs> gEmmrt() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull BatteryProperties batteryProperties) {
            this();
            Intrinsics.checkNotNullParameter(batteryProperties, "");
            this.EZpvd = batteryProperties.copydefault();
            this.AEQbTJ = batteryProperties.OLrzqt();
            this.copydefault = batteryProperties.KWHzl();
            this.KWHzl = batteryProperties.AEQbTJ();
            this.OLrzqt = batteryProperties.EZpvd();
        }

        public final BatteryProperties OLrzqt() {
            return new BatteryProperties(this, null);
        }
    }
}
