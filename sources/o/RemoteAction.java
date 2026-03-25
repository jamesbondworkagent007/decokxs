package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AccountManagerResponse;
import o.RemoteAction;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteAction {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final AccountManagerResponse AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public final java.lang.String OLrzqt;
    public final GrantCredentialsPermissionActivity copydefault;
    public final RestoreDescription gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RemoteAction$ActionBar) A[MD:(o.RemoteAction$ActionBar):void (m)] call: o.RemoteAction.<init>(o.RemoteAction$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteAction(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreDescription AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GrantCredentialsPermissionActivity OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    public RemoteAction(ActionBar actionBar) {
        this.AEQbTJ = actionBar.OLrzqt();
        this.copydefault = actionBar.EZpvd();
        this.EZpvd = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.copydefault();
        this.AYXKKw = actionBar.djBIcL();
        this.AhwBna = actionBar.AhwBna();
        this.gEmmrt = actionBar.gEmmrt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteAction.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final RemoteAction EZpvd(@NotNull Function1<? super ActionBar, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            ActionBar actionBar = new ActionBar();
            function1.invoke(actionBar);
            return actionBar.KWHzl();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RespondToAuthChallengeRequest(");
        sb.append("analyticsMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("challengeName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("challengeResponses=*** Sensitive Data Redacted ***,");
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.AEQbTJ;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivity = this.copydefault;
        int iHashCode2 = grantCredentialsPermissionActivity != null ? grantCredentialsPermissionActivity.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AYXKKw;
        int iHashCode5 = map2 != null ? map2.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode6 = str2 != null ? str2.hashCode() : 0;
        RestoreDescription restoreDescription = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (restoreDescription != null ? restoreDescription.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RemoteAction.class != obj.getClass()) {
            return false;
        }
        RemoteAction remoteAction = (RemoteAction) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, remoteAction.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, remoteAction.copydefault) && Intrinsics.EZpvd(this.EZpvd, remoteAction.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) remoteAction.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, remoteAction.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) remoteAction.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, remoteAction.gEmmrt);
    }

    public static /* synthetic */ RemoteAction copy$default(RemoteAction remoteAction, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.RespondToAuthChallengeRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RemoteAction.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RemoteAction.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(remoteAction);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public RestoreDescription AhwBna;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public AccountManagerResponse KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public GrantCredentialsPermissionActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GrantCredentialsPermissionActivity EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(GrantCredentialsPermissionActivity grantCredentialsPermissionActivity) {
            this.copydefault = grantCredentialsPermissionActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
            this.OLrzqt = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
            this.EZpvd = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreDescription gEmmrt() {
            return this.AhwBna;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull RemoteAction remoteAction) {
            this();
            Intrinsics.checkNotNullParameter(remoteAction, "");
            this.KWHzl = remoteAction.KWHzl();
            this.copydefault = remoteAction.OLrzqt();
            this.EZpvd = remoteAction.AEQbTJ();
            this.AEQbTJ = remoteAction.copydefault();
            this.OLrzqt = remoteAction.EZpvd();
            this.AYXKKw = remoteAction.gEmmrt();
            this.AhwBna = remoteAction.AhwBna();
        }

        public final RemoteAction KWHzl() {
            return new RemoteAction(this, null);
        }

        public final void KWHzl(@NotNull Function1<? super AccountManagerResponse.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = AccountManagerResponse.OLrzqt.OLrzqt(function1);
        }

        public final void EZpvd(@NotNull Function1<? super RestoreDescription.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AhwBna = RestoreDescription.copydefault.OLrzqt(function1);
        }
    }
}
