package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ExpiredTokenException extends SsoOidcException {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String error;
    private final String errorDescription;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException$ActionBar) A[MD:(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException$ActionBar):void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException.<init>(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ExpiredTokenException(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    private ExpiredTokenException(ActionBar actionBar) {
        this.error = actionBar.copydefault();
        this.errorDescription = actionBar.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpiredTokenException(");
        sb.append("error=" + this.error + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.errorDescription);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.errorDescription;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExpiredTokenException.class != obj.getClass()) {
            return false;
        }
        ExpiredTokenException expiredTokenException = (ExpiredTokenException) obj;
        return Intrinsics.EZpvd((Object) this.error, (Object) expiredTokenException.error) && Intrinsics.EZpvd((Object) this.errorDescription, (Object) expiredTokenException.errorDescription);
    }

    public static /* synthetic */ ExpiredTokenException copy$default(ExpiredTokenException expiredTokenException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.ExpiredTokenException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(expiredTokenException);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public final ExpiredTokenException copy(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(this);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public String AEQbTJ;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.AEQbTJ = str;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ExpiredTokenException expiredTokenException) {
            this();
            Intrinsics.checkNotNullParameter(expiredTokenException, "");
            this.OLrzqt = expiredTokenException.getError();
            this.AEQbTJ = expiredTokenException.getErrorDescription();
        }

        public final ExpiredTokenException EZpvd() {
            return new ExpiredTokenException(this, null);
        }
    }
}
