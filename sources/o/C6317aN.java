package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C6317aN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6317aN {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final C25615j copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aN$ActionBar) A[MD:(o.aN$ActionBar):void (m)] call: o.aN.<init>(o.aN$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C6317aN(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j copydefault() {
        return this.copydefault;
    }

    public C6317aN(ActionBar actionBar) {
        this.copydefault = actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.aN$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RecognizeCelebritiesRequest(");
        sb.append("image=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C25615j c25615j = this.copydefault;
        if (c25615j != null) {
            return c25615j.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C6317aN.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((C6317aN) obj).copydefault);
    }

    public static /* synthetic */ C6317aN copy$default(C6317aN c6317aN, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.RecognizeCelebritiesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C6317aN.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C6317aN.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c6317aN);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.aN$ActionBar */
    public static final class ActionBar {
        public C25615j KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C25615j c25615j) {
            this.KWHzl = c25615j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j OLrzqt() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C6317aN c6317aN) {
            this();
            Intrinsics.checkNotNullParameter(c6317aN, "");
            this.KWHzl = c6317aN.copydefault();
        }

        public final C6317aN KWHzl() {
            return new C6317aN(this, null);
        }
    }
}
