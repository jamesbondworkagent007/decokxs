package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12126ch;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C12126ch {
    public static final Activity KWHzl = new Activity(null);
    public final java.util.List<WebViewDelegate> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ch$ActionBar) A[MD:(o.ch$ActionBar):void (m)] call: o.ch.<init>(o.ch$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C12126ch(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WebViewDelegate> OLrzqt() {
        return this.OLrzqt;
    }

    public C12126ch(ActionBar actionBar) {
        this.OLrzqt = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.ch$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ch.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TrainingData(");
        sb.append("assets=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<WebViewDelegate> list = this.OLrzqt;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C12126ch.class == obj.getClass() && Intrinsics.EZpvd(this.OLrzqt, ((C12126ch) obj).OLrzqt);
    }

    public static /* synthetic */ C12126ch copy$default(C12126ch c12126ch, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.TrainingData$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C12126ch.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C12126ch.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c12126ch);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.ch$ActionBar */
    public static final class ActionBar {
        public java.util.List<WebViewDelegate> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WebViewDelegate> EZpvd() {
            return this.KWHzl;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<WebViewDelegate> list) {
            this.KWHzl = list;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C12126ch c12126ch) {
            this();
            Intrinsics.checkNotNullParameter(c12126ch, "");
            this.KWHzl = c12126ch.OLrzqt();
        }

        public final C12126ch KWHzl() {
            return new C12126ch(this, null);
        }
    }
}
