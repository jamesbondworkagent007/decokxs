package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DialogFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DialogFragment {
    public static final Application copydefault = new Application(null);
    public final GrantCredentialsPermissionActivity AEQbTJ;
    public final OnAccountsUpdateListener EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DialogFragment$ActionBar) A[MD:(o.DialogFragment$ActionBar):void (m)] call: o.DialogFragment.<init>(o.DialogFragment$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DialogFragment(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnAccountsUpdateListener EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GrantCredentialsPermissionActivity OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public DialogFragment(ActionBar actionBar) {
        this.EZpvd = actionBar.KWHzl();
        this.AEQbTJ = actionBar.EZpvd();
        this.OLrzqt = actionBar.AEQbTJ();
        this.KWHzl = actionBar.gEmmrt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DialogFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InitiateAuthResponse(");
        sb.append("authenticationResult=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("challengeName=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("challengeParameters=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("session=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        OnAccountsUpdateListener onAccountsUpdateListener = this.EZpvd;
        int iHashCode = onAccountsUpdateListener != null ? onAccountsUpdateListener.hashCode() : 0;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivity = this.AEQbTJ;
        int iHashCode2 = grantCredentialsPermissionActivity != null ? grantCredentialsPermissionActivity.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DialogFragment.class != obj.getClass()) {
            return false;
        }
        DialogFragment dialogFragment = (DialogFragment) obj;
        return Intrinsics.EZpvd(this.EZpvd, dialogFragment.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, dialogFragment.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, dialogFragment.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) dialogFragment.KWHzl);
    }

    public static /* synthetic */ DialogFragment copy$default(DialogFragment dialogFragment, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.InitiateAuthResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DialogFragment.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DialogFragment.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(dialogFragment);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public GrantCredentialsPermissionActivity AEQbTJ;
        public java.lang.String EZpvd;
        public OnAccountsUpdateListener KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(GrantCredentialsPermissionActivity grantCredentialsPermissionActivity) {
            this.AEQbTJ = grantCredentialsPermissionActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GrantCredentialsPermissionActivity EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
            this.copydefault = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnAccountsUpdateListener KWHzl() {
            return this.KWHzl;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(OnAccountsUpdateListener onAccountsUpdateListener) {
            this.KWHzl = onAccountsUpdateListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull DialogFragment dialogFragment) {
            this();
            Intrinsics.checkNotNullParameter(dialogFragment, "");
            this.KWHzl = dialogFragment.EZpvd();
            this.AEQbTJ = dialogFragment.OLrzqt();
            this.copydefault = dialogFragment.copydefault();
            this.EZpvd = dialogFragment.AEQbTJ();
        }

        public final DialogFragment copydefault() {
            return new DialogFragment(this, null);
        }
    }
}
