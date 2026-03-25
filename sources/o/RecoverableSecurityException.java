package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RecoverableSecurityException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RecoverableSecurityException {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final OnAccountsUpdateListener AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd;
    public final GrantCredentialsPermissionActivity OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RecoverableSecurityException$TaskDescription) A[MD:(o.RecoverableSecurityException$TaskDescription):void (m)] call: o.RecoverableSecurityException.<init>(o.RecoverableSecurityException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RecoverableSecurityException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GrantCredentialsPermissionActivity AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnAccountsUpdateListener EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.EZpvd;
    }

    public RecoverableSecurityException(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.AEQbTJ();
        this.OLrzqt = taskDescription.EZpvd();
        this.EZpvd = taskDescription.copydefault();
        this.copydefault = taskDescription.valueOf();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RecoverableSecurityException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RespondToAuthChallengeResponse(");
        sb.append("authenticationResult=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("challengeName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("challengeParameters=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("session=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        OnAccountsUpdateListener onAccountsUpdateListener = this.AEQbTJ;
        int iHashCode = onAccountsUpdateListener != null ? onAccountsUpdateListener.hashCode() : 0;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivity = this.OLrzqt;
        int iHashCode2 = grantCredentialsPermissionActivity != null ? grantCredentialsPermissionActivity.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.EZpvd;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RecoverableSecurityException.class != obj.getClass()) {
            return false;
        }
        RecoverableSecurityException recoverableSecurityException = (RecoverableSecurityException) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, recoverableSecurityException.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, recoverableSecurityException.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, recoverableSecurityException.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) recoverableSecurityException.copydefault);
    }

    public static /* synthetic */ RecoverableSecurityException copy$default(RecoverableSecurityException recoverableSecurityException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.RespondToAuthChallengeResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RecoverableSecurityException.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RecoverableSecurityException.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(recoverableSecurityException);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
        public OnAccountsUpdateListener EZpvd;
        public java.lang.String OLrzqt;
        public GrantCredentialsPermissionActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnAccountsUpdateListener AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GrantCredentialsPermissionActivity EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.Map<java.lang.String, java.lang.String> map) {
            this.AEQbTJ = map;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(OnAccountsUpdateListener onAccountsUpdateListener) {
            this.EZpvd = onAccountsUpdateListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(GrantCredentialsPermissionActivity grantCredentialsPermissionActivity) {
            this.copydefault = grantCredentialsPermissionActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull RecoverableSecurityException recoverableSecurityException) {
            this();
            Intrinsics.checkNotNullParameter(recoverableSecurityException, "");
            this.EZpvd = recoverableSecurityException.EZpvd();
            this.copydefault = recoverableSecurityException.AEQbTJ();
            this.AEQbTJ = recoverableSecurityException.copydefault();
            this.OLrzqt = recoverableSecurityException.KWHzl();
        }

        public final RecoverableSecurityException KWHzl() {
            return new RecoverableSecurityException(this, null);
        }
    }
}
