package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DayPickerPagerAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DayPickerPagerAdapter {
    public static final Application EZpvd = new Application(null);
    public final C5173Hn AEQbTJ;
    public final EditText AYXKKw;
    public final java.lang.String KWHzl;
    public final DigitalClock OLrzqt;
    public final DoubleDigitManager copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DayPickerPagerAdapter$ActionBar) A[MD:(o.DayPickerPagerAdapter$ActionBar):void (m)] call: o.DayPickerPagerAdapter.<init>(o.DayPickerPagerAdapter$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DayPickerPagerAdapter(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditText AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoubleDigitManager EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DigitalClock copydefault() {
        return this.OLrzqt;
    }

    public DayPickerPagerAdapter(ActionBar actionBar) {
        this.AEQbTJ = actionBar.AEQbTJ();
        this.KWHzl = actionBar.EZpvd();
        this.OLrzqt = actionBar.KWHzl();
        this.copydefault = actionBar.djBIcL();
        this.djBIcL = actionBar.AYXKKw();
        this.AYXKKw = actionBar.valueOf();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DayPickerPagerAdapter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetMetadata(");
        sb.append("creationTimestamp=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("datasetArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("datasetType=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("statusMessageCode=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        DigitalClock digitalClock = this.OLrzqt;
        int iHashCode3 = digitalClock != null ? digitalClock.hashCode() : 0;
        DoubleDigitManager doubleDigitManager = this.copydefault;
        int iHashCode4 = doubleDigitManager != null ? doubleDigitManager.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        EditText editText = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (editText != null ? editText.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DayPickerPagerAdapter.class != obj.getClass()) {
            return false;
        }
        DayPickerPagerAdapter dayPickerPagerAdapter = (DayPickerPagerAdapter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dayPickerPagerAdapter.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dayPickerPagerAdapter.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, dayPickerPagerAdapter.OLrzqt) && Intrinsics.EZpvd(this.copydefault, dayPickerPagerAdapter.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) dayPickerPagerAdapter.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, dayPickerPagerAdapter.AYXKKw);
    }

    public static /* synthetic */ DayPickerPagerAdapter copy$default(DayPickerPagerAdapter dayPickerPagerAdapter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DatasetMetadata$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DayPickerPagerAdapter.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DayPickerPagerAdapter.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(dayPickerPagerAdapter);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public DigitalClock EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public DoubleDigitManager copydefault;
        public EditText djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DoubleDigitManager doubleDigitManager) {
            this.copydefault = doubleDigitManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(EditText editText) {
            this.djBIcL = editText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DigitalClock KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(DigitalClock digitalClock) {
            this.EZpvd = digitalClock;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DoubleDigitManager djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EditText valueOf() {
            return this.djBIcL;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull DayPickerPagerAdapter dayPickerPagerAdapter) {
            this();
            Intrinsics.checkNotNullParameter(dayPickerPagerAdapter, "");
            this.OLrzqt = dayPickerPagerAdapter.OLrzqt();
            this.KWHzl = dayPickerPagerAdapter.AEQbTJ();
            this.EZpvd = dayPickerPagerAdapter.copydefault();
            this.copydefault = dayPickerPagerAdapter.EZpvd();
            this.AEQbTJ = dayPickerPagerAdapter.KWHzl();
            this.djBIcL = dayPickerPagerAdapter.AYXKKw();
        }

        public final DayPickerPagerAdapter copydefault() {
            return new DayPickerPagerAdapter(this, null);
        }
    }
}
