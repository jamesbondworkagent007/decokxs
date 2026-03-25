package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NetworkTemplate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkTemplate {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final PrinterCapabilitiesInfo AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkTemplate$ActionBar) A[MD:(o.NetworkTemplate$ActionBar):void (m)] call: o.NetworkTemplate.<init>(o.NetworkTemplate$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkTemplate(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrinterCapabilitiesInfo copydefault() {
        return this.AEQbTJ;
    }

    public NetworkTemplate(ActionBar actionBar) {
        this.AEQbTJ = actionBar.copydefault();
        this.EZpvd = actionBar.AEQbTJ();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkTemplate.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectSyntaxRequest(");
        sb.append("languageCode=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("textList=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        PrinterCapabilitiesInfo printerCapabilitiesInfo = this.AEQbTJ;
        int iHashCode = printerCapabilitiesInfo != null ? printerCapabilitiesInfo.hashCode() : 0;
        java.util.List<java.lang.String> list = this.EZpvd;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkTemplate.class != obj.getClass()) {
            return false;
        }
        NetworkTemplate networkTemplate = (NetworkTemplate) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, networkTemplate.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, networkTemplate.EZpvd);
    }

    public static /* synthetic */ NetworkTemplate copy$default(NetworkTemplate networkTemplate, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectSyntaxRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkTemplate.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkTemplate.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(networkTemplate);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public PrinterCapabilitiesInfo EZpvd;
        public java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PrinterCapabilitiesInfo copydefault() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull NetworkTemplate networkTemplate) {
            this();
            Intrinsics.checkNotNullParameter(networkTemplate, "");
            this.EZpvd = networkTemplate.copydefault();
            this.OLrzqt = networkTemplate.OLrzqt();
        }

        public final NetworkTemplate KWHzl() {
            return new NetworkTemplate(this, null);
        }
    }
}
