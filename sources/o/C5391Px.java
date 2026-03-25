package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C5391Px;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C5391Px {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final SelectBackupTransportCallback copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Px$ActionBar) A[MD:(o.Px$ActionBar):void (m)] call: o.Px.<init>(o.Px$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5391Px(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelectBackupTransportCallback KWHzl() {
        return this.copydefault;
    }

    public C5391Px(ActionBar actionBar) {
        this.copydefault = actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.Px$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Px.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeUserPoolResponse(");
        sb.append("userPool=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SelectBackupTransportCallback selectBackupTransportCallback = this.copydefault;
        if (selectBackupTransportCallback != null) {
            return selectBackupTransportCallback.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5391Px.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((C5391Px) obj).copydefault);
    }

    public static /* synthetic */ C5391Px copy$default(C5391Px c5391Px, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.DescribeUserPoolResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C5391Px.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5391Px.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c5391Px);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.Px$ActionBar */
    public static final class ActionBar {
        public SelectBackupTransportCallback KWHzl;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelectBackupTransportCallback EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(SelectBackupTransportCallback selectBackupTransportCallback) {
            this.KWHzl = selectBackupTransportCallback;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C5391Px c5391Px) {
            this();
            Intrinsics.checkNotNullParameter(c5391Px, "");
            this.KWHzl = c5391Px.KWHzl();
        }

        public final C5391Px OLrzqt() {
            return new C5391Px(this, null);
        }
    }
}
