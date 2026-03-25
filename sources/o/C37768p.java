package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C37768p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C37768p {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final WebViewZygote EZpvd;
    public final java.lang.Float KWHzl;
    public final java.util.List<SectionIndexer> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.p$ActionBar) A[MD:(o.p$ActionBar):void (m)] call: o.p.<init>(o.p$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C37768p(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SectionIndexer> copydefault() {
        return this.OLrzqt;
    }

    public C37768p(ActionBar actionBar) {
        this.EZpvd = actionBar.copydefault();
        this.KWHzl = actionBar.OLrzqt();
        this.OLrzqt = actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.p$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.p.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Instance(");
        sb.append("boundingBox=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("dominantColors=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.EZpvd;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.KWHzl;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        java.util.List<SectionIndexer> list = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37768p.class != obj.getClass()) {
            return false;
        }
        C37768p c37768p = (C37768p) obj;
        return Intrinsics.EZpvd(this.EZpvd, c37768p.EZpvd) && Intrinsics.copydefault(this.KWHzl, c37768p.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c37768p.OLrzqt);
    }

    public static /* synthetic */ C37768p copy$default(C37768p c37768p, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Instance$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37768p.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37768p.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c37768p);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.p$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public WebViewZygote AEQbTJ;
        public java.util.List<SectionIndexer> OLrzqt;
        public java.lang.Float copydefault;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(WebViewZygote webViewZygote) {
            this.AEQbTJ = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SectionIndexer> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SectionIndexer> list) {
            this.OLrzqt = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C37768p c37768p) {
            this();
            Intrinsics.checkNotNullParameter(c37768p, "");
            this.AEQbTJ = c37768p.EZpvd();
            this.copydefault = c37768p.KWHzl();
            this.OLrzqt = c37768p.copydefault();
        }

        public final C37768p EZpvd() {
            return new C37768p(this, null);
        }
    }
}
