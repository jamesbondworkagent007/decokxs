package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36602oe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36602oe {
    public static final Application OLrzqt = new Application(null);
    public final java.util.List<AbstractC34841nk> AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oe$ActionBar) A[MD:(o.oe$ActionBar):void (m)] call: o.oe.<init>(o.oe$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36602oe(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC34841nk> AEQbTJ() {
        return this.AEQbTJ;
    }

    public C36602oe(ActionBar actionBar) {
        this.AEQbTJ = actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oe$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oe.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HumanLoopDataAttributes(");
        sb.append("contentClassifiers=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<AbstractC34841nk> list = this.AEQbTJ;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C36602oe.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((C36602oe) obj).AEQbTJ);
    }

    public static /* synthetic */ C36602oe copy$default(C36602oe c36602oe, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.HumanLoopDataAttributes$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36602oe.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36602oe.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c36602oe);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.oe$ActionBar */
    public static final class ActionBar {
        public java.util.List<? extends AbstractC34841nk> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nk>, java.util.List<o.nk> */
        public final java.util.List<AbstractC34841nk> OLrzqt() {
            return this.AEQbTJ;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36602oe c36602oe) {
            this();
            Intrinsics.checkNotNullParameter(c36602oe, "");
            this.AEQbTJ = c36602oe.AEQbTJ();
        }

        public final C36602oe AEQbTJ() {
            return new C36602oe(this, null);
        }
    }
}
