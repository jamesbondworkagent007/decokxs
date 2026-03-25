package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.LocalSocketAddress;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalSocketAddress {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LocalSocketAddress$ActionBar) A[MD:(o.LocalSocketAddress$ActionBar):void (m)] call: o.LocalSocketAddress.<init>(o.LocalSocketAddress$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LocalSocketAddress(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    public LocalSocketAddress(ActionBar actionBar) {
        java.lang.String strKWHzl = actionBar.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.KWHzl = strKWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LocalSocketAddress.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public final LocalSocketAddress copydefault() {
            return new LocalSocketAddress(this, null);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComprehendAuthSchemeParameters(");
        sb.append("operationName=" + this.KWHzl + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalSocketAddress) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((LocalSocketAddress) obj).KWHzl);
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.LocalSocketAddress */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocalSocketAddress copy$default(LocalSocketAddress localSocketAddress, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.auth.ComprehendAuthSchemeParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LocalSocketAddress.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LocalSocketAddress.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        return localSocketAddress.EZpvd(function1);
    }

    public final LocalSocketAddress EZpvd(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar();
        actionBar.OLrzqt(this.KWHzl);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }
}
