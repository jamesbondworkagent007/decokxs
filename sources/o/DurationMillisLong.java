package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DurationMillisLong;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class DurationMillisLong {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final AuthenticationRequiredException copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DurationMillisLong$ActionBar) A[MD:(o.DurationMillisLong$ActionBar):void (m)] call: o.DurationMillisLong.<init>(o.DurationMillisLong$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DurationMillisLong(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationRequiredException OLrzqt() {
        return this.copydefault;
    }

    public DurationMillisLong(ActionBar actionBar) {
        this.copydefault = actionBar.KWHzl();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DurationMillisLong.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeIdentityProviderResponse(");
        sb.append("identityProvider=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AuthenticationRequiredException authenticationRequiredException = this.copydefault;
        if (authenticationRequiredException != null) {
            return authenticationRequiredException.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DurationMillisLong.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((DurationMillisLong) obj).copydefault);
    }

    public static /* synthetic */ DurationMillisLong copy$default(DurationMillisLong durationMillisLong, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.DescribeIdentityProviderResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DurationMillisLong.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DurationMillisLong.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(durationMillisLong);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public AuthenticationRequiredException OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AuthenticationRequiredException authenticationRequiredException) {
            this.OLrzqt = authenticationRequiredException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationRequiredException KWHzl() {
            return this.OLrzqt;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull DurationMillisLong durationMillisLong) {
            this();
            Intrinsics.checkNotNullParameter(durationMillisLong, "");
            this.OLrzqt = durationMillisLong.OLrzqt();
        }

        public final DurationMillisLong EZpvd() {
            return new DurationMillisLong(this, null);
        }
    }
}
