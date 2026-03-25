package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36201oT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36201oT {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.Integer KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oT$ActionBar) A[MD:(o.oT$ActionBar):void (m)] call: o.oT.<init>(o.oT$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36201oT(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    public C36201oT(ActionBar actionBar) {
        this.KWHzl = actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.oT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UndetectedSignature(");
        sb.append("page=" + this.KWHzl);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.KWHzl;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C36201oT.class == obj.getClass() && Intrinsics.EZpvd(this.KWHzl, ((C36201oT) obj).KWHzl);
    }

    public static /* synthetic */ C36201oT copy$default(C36201oT c36201oT, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.UndetectedSignature$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36201oT.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36201oT.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c36201oT);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oT$ActionBar */
    public static final class ActionBar {
        public java.lang.Integer KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.KWHzl;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.KWHzl = num;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36201oT c36201oT) {
            this();
            Intrinsics.checkNotNullParameter(c36201oT, "");
            this.KWHzl = c36201oT.OLrzqt();
        }

        public final C36201oT OLrzqt() {
            return new C36201oT(this, null);
        }
    }
}
