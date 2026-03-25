package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36973ol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36973ol {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<C35742oC> EZpvd;
    public final java.util.List<C36814oi> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ol$ActionBar) A[MD:(o.ol$ActionBar):void (m)] call: o.ol.<init>(o.ol$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36973ol(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35742oC> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36814oi> OLrzqt() {
        return this.OLrzqt;
    }

    public C36973ol(ActionBar actionBar) {
        this.OLrzqt = actionBar.KWHzl();
        this.EZpvd = actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.ol$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ol.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LendingDocument(");
        sb.append("lendingFields=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("signatureDetections=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C36814oi> list = this.OLrzqt;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.util.List<C35742oC> list2 = this.EZpvd;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36973ol.class != obj.getClass()) {
            return false;
        }
        C36973ol c36973ol = (C36973ol) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c36973ol.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c36973ol.EZpvd);
    }

    public static /* synthetic */ C36973ol copy$default(C36973ol c36973ol, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.LendingDocument$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36973ol.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36973ol.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c36973ol);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ol$ActionBar */
    public static final class ActionBar {
        public java.util.List<C36814oi> EZpvd;
        public java.util.List<C35742oC> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C35742oC> AEQbTJ() {
            return this.OLrzqt;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C36814oi> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36814oi> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C35742oC> list) {
            this.OLrzqt = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36973ol c36973ol) {
            this();
            Intrinsics.checkNotNullParameter(c36973ol, "");
            this.EZpvd = c36973ol.OLrzqt();
            this.OLrzqt = c36973ol.KWHzl();
        }

        public final C36973ol OLrzqt() {
            return new C36973ol(this, null);
        }
    }
}
