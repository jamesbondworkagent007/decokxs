package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BackupDataInputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class BackupDataInputStream {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final AuthenticationRequiredException AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BackupDataInputStream$Activity) A[MD:(o.BackupDataInputStream$Activity):void (m)] call: o.BackupDataInputStream.<init>(o.BackupDataInputStream$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BackupDataInputStream(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationRequiredException KWHzl() {
        return this.AEQbTJ;
    }

    public BackupDataInputStream(Activity activity) {
        this.AEQbTJ = activity.EZpvd();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BackupDataInputStream.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateIdentityProviderResponse(");
        sb.append("identityProvider=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AuthenticationRequiredException authenticationRequiredException = this.AEQbTJ;
        if (authenticationRequiredException != null) {
            return authenticationRequiredException.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && BackupDataInputStream.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((BackupDataInputStream) obj).AEQbTJ);
    }

    public static /* synthetic */ BackupDataInputStream copy$default(BackupDataInputStream backupDataInputStream, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UpdateIdentityProviderResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BackupDataInputStream.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BackupDataInputStream.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(backupDataInputStream);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public AuthenticationRequiredException OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationRequiredException EZpvd() {
            return this.OLrzqt;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AuthenticationRequiredException authenticationRequiredException) {
            this.OLrzqt = authenticationRequiredException;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull BackupDataInputStream backupDataInputStream) {
            this();
            Intrinsics.checkNotNullParameter(backupDataInputStream, "");
            this.OLrzqt = backupDataInputStream.KWHzl();
        }

        public final BackupDataInputStream AEQbTJ() {
            return new BackupDataInputStream(this, null);
        }
    }
}
