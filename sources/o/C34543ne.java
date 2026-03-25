package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34543ne;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34543ne {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.util.List<C35318nt> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ne$ActionBar) A[MD:(o.ne$ActionBar):void (m)] call: o.ne.<init>(o.ne$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34543ne(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35318nt> EZpvd() {
        return this.KWHzl;
    }

    public C34543ne(ActionBar actionBar) {
        this.KWHzl = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.ne$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ne.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeIdRequest(");
        sb.append("documentPages=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C35318nt> list = this.KWHzl;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C34543ne.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((C34543ne) obj).KWHzl);
    }

    public static /* synthetic */ C34543ne copy$default(C34543ne c34543ne, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeIdRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34543ne.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34543ne.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c34543ne);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    /* JADX INFO: renamed from: o.ne$ActionBar */
    public static final class ActionBar {
        public java.util.List<C35318nt> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C35318nt> EZpvd() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C34543ne c34543ne) {
            this();
            Intrinsics.checkNotNullParameter(c34543ne, "");
            this.AEQbTJ = c34543ne.EZpvd();
        }

        public final C34543ne copydefault() {
            return new C34543ne(this, null);
        }
    }
}
