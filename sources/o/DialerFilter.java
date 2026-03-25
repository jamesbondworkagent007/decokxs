package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DialerFilter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DialerFilter {
    public static final Application OLrzqt = new Application(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final EditText AhwBna;
    public final C5173Hn EZpvd;
    public final DropDownListView KWHzl;
    public final DoubleDigitManager copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DialerFilter$ActionBar) A[MD:(o.DialerFilter$ActionBar):void (m)] call: o.DialerFilter.<init>(o.DialerFilter$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DialerFilter(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DropDownListView AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditText AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DoubleDigitManager KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AYXKKw;
    }

    public DialerFilter(ActionBar actionBar) {
        this.AEQbTJ = actionBar.OLrzqt();
        this.KWHzl = actionBar.EZpvd();
        this.EZpvd = actionBar.AEQbTJ();
        this.copydefault = actionBar.AYXKKw();
        this.AYXKKw = actionBar.djBIcL();
        this.AhwBna = actionBar.AhwBna();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DialerFilter.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetDescription(");
        sb.append("creationTimestamp=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("datasetStats=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("lastUpdatedTimestamp=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("statusMessageCode=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        DropDownListView dropDownListView = this.KWHzl;
        int iHashCode2 = dropDownListView != null ? dropDownListView.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        int iHashCode3 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        DoubleDigitManager doubleDigitManager = this.copydefault;
        int iHashCode4 = doubleDigitManager != null ? doubleDigitManager.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        EditText editText = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (editText != null ? editText.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DialerFilter.class != obj.getClass()) {
            return false;
        }
        DialerFilter dialerFilter = (DialerFilter) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, dialerFilter.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, dialerFilter.KWHzl) && Intrinsics.EZpvd(this.EZpvd, dialerFilter.EZpvd) && Intrinsics.EZpvd(this.copydefault, dialerFilter.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) dialerFilter.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, dialerFilter.AhwBna);
    }

    public static /* synthetic */ DialerFilter copy$default(DialerFilter dialerFilter, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DatasetDescription$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DialerFilter.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialerFilter.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(dialerFilter);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C5173Hn EZpvd;
        public DoubleDigitManager KWHzl;
        public DropDownListView OLrzqt;
        public C5173Hn copydefault;
        public EditText gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DoubleDigitManager doubleDigitManager) {
            this.KWHzl = doubleDigitManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DropDownListView dropDownListView) {
            this.OLrzqt = dropDownListView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DoubleDigitManager AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EditText AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DropDownListView EZpvd() {
            return this.OLrzqt;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(EditText editText) {
            this.gEmmrt = editText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull DialerFilter dialerFilter) {
            this();
            Intrinsics.checkNotNullParameter(dialerFilter, "");
            this.copydefault = dialerFilter.EZpvd();
            this.OLrzqt = dialerFilter.AEQbTJ();
            this.EZpvd = dialerFilter.OLrzqt();
            this.KWHzl = dialerFilter.KWHzl();
            this.AEQbTJ = dialerFilter.copydefault();
            this.gEmmrt = dialerFilter.AhwBna();
        }

        public final DialerFilter copydefault() {
            return new DialerFilter(this, null);
        }
    }
}
