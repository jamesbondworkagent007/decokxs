package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.MenuItem;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItem {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MenuItem$ActionBar) A[MD:(o.MenuItem$ActionBar):void (m)] call: o.MenuItem.<init>(o.MenuItem$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MenuItem(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    public MenuItem(ActionBar actionBar) {
        java.lang.String strOLrzqt = actionBar.OLrzqt();
        if (strOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.AEQbTJ = strOLrzqt;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MenuItem.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final class ActionBar {
        public java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        public final MenuItem KWHzl() {
            return new MenuItem(this, null);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SsoOidcAuthSchemeParameters(");
        sb.append("operationName=" + this.AEQbTJ + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MenuItem) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((MenuItem) obj).AEQbTJ);
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.MenuItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItem copy$aws_config$default(MenuItem menuItem, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.auth.SsoOidcAuthSchemeParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MenuItem.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MenuItem.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        return menuItem.AEQbTJ(function1);
    }

    public final MenuItem AEQbTJ(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar();
        actionBar.AEQbTJ(this.AEQbTJ);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }
}
