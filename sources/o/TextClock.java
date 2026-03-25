package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TextClock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TextClock {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TextClock$ActionBar) A[MD:(o.TextClock$ActionBar):void (m)] call: o.TextClock.<init>(o.TextClock$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TextClock(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.copydefault;
    }

    public TextClock(ActionBar actionBar) {
        this.EZpvd = actionBar.AEQbTJ();
        this.KWHzl = actionBar.KWHzl();
        this.copydefault = actionBar.EZpvd();
        this.OLrzqt = actionBar.OLrzqt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TextClock.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GeneralLabelsSettings(");
        sb.append("labelCategoryExclusionFilters=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("labelCategoryInclusionFilters=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("labelExclusionFilters=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("labelInclusionFilters=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.KWHzl;
        int iHashCode2 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.copydefault;
        int iHashCode3 = list3 != null ? list3.hashCode() : 0;
        java.util.List<java.lang.String> list4 = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextClock.class != obj.getClass()) {
            return false;
        }
        TextClock textClock = (TextClock) obj;
        return Intrinsics.EZpvd(this.EZpvd, textClock.EZpvd) && Intrinsics.EZpvd(this.KWHzl, textClock.KWHzl) && Intrinsics.EZpvd(this.copydefault, textClock.copydefault) && Intrinsics.EZpvd(this.OLrzqt, textClock.OLrzqt);
    }

    public static /* synthetic */ TextClock copy$default(TextClock textClock, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GeneralLabelsSettings$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TextClock.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextClock.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(textClock);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public java.util.List<java.lang.String> AEQbTJ;
        public java.util.List<java.lang.String> EZpvd;
        public java.util.List<java.lang.String> OLrzqt;
        public java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TextClock textClock) {
            this();
            Intrinsics.checkNotNullParameter(textClock, "");
            this.copydefault = textClock.OLrzqt();
            this.AEQbTJ = textClock.EZpvd();
            this.EZpvd = textClock.copydefault();
            this.OLrzqt = textClock.KWHzl();
        }

        public final TextClock copydefault() {
            return new TextClock(this, null);
        }
    }
}
