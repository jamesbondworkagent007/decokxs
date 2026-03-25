package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.BatteryProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class BatteryProperty {
    public static final Application EZpvd = new Application(null);
    public final HandlerThread AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String KWHzl;
    public final SynchronousResultReceiver OLrzqt;
    public final byte[] copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BatteryProperty$ActionBar) A[MD:(o.BatteryProperty$ActionBar):void (m)] call: o.BatteryProperty.<init>(o.BatteryProperty$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BatteryProperty(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HandlerThread KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    public BatteryProperty(ActionBar actionBar) {
        this.copydefault = actionBar.KWHzl();
        this.AEQbTJ = actionBar.copydefault();
        this.KWHzl = actionBar.EZpvd();
        this.OLrzqt = actionBar.AEQbTJ();
        this.AhwBna = actionBar.valueOf();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BatteryProperty.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final BatteryProperty AEQbTJ(@NotNull Function1<? super ActionBar, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ActionBar actionBar = new ActionBar();
            function1.invoke(actionBar);
            return actionBar.OLrzqt();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectEntitiesRequest(");
        sb.append("bytes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("documentReaderConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("endpointArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        byte[] bArr = this.copydefault;
        int iHashCode = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        HandlerThread handlerThread = this.AEQbTJ;
        int iHashCode2 = handlerThread != null ? handlerThread.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.OLrzqt;
        int iHashCode4 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BatteryProperty.class != obj.getClass()) {
            return false;
        }
        BatteryProperty batteryProperty = (BatteryProperty) obj;
        byte[] bArr = this.copydefault;
        if (bArr != null) {
            byte[] bArr2 = batteryProperty.copydefault;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (batteryProperty.copydefault != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.AEQbTJ, batteryProperty.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) batteryProperty.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, batteryProperty.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) batteryProperty.AhwBna);
    }

    public static /* synthetic */ BatteryProperty copy$default(BatteryProperty batteryProperty, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DetectEntitiesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BatteryProperty.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BatteryProperty.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(batteryProperty);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public byte[] AEQbTJ;
        public SynchronousResultReceiver EZpvd;
        public java.lang.String KWHzl;
        public HandlerThread OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(SynchronousResultReceiver synchronousResultReceiver) {
            this.EZpvd = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HandlerThread copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull BatteryProperty batteryProperty) {
            this();
            Intrinsics.checkNotNullParameter(batteryProperty, "");
            this.AEQbTJ = batteryProperty.OLrzqt();
            this.OLrzqt = batteryProperty.KWHzl();
            this.copydefault = batteryProperty.EZpvd();
            this.EZpvd = batteryProperty.AEQbTJ();
            this.KWHzl = batteryProperty.copydefault();
        }

        public final BatteryProperty OLrzqt() {
            return new BatteryProperty(this, null);
        }
    }
}
