package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Destroyable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Destroyable {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final GrantCredentialsPermissionActivity EZpvd;
    public final OnAccountsUpdateListener KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Destroyable$Activity) A[MD:(o.Destroyable$Activity):void (m)] call: o.Destroyable.<init>(o.Destroyable$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Destroyable(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnAccountsUpdateListener OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GrantCredentialsPermissionActivity copydefault() {
        return this.EZpvd;
    }

    public Destroyable(Activity activity) {
        this.KWHzl = activity.KWHzl();
        this.EZpvd = activity.copydefault();
        this.OLrzqt = activity.EZpvd();
        this.AEQbTJ = activity.djBIcL();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Destroyable.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminRespondToAuthChallengeResponse(");
        sb.append("authenticationResult=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("challengeName=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("challengeParameters=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("session=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        OnAccountsUpdateListener onAccountsUpdateListener = this.KWHzl;
        int iHashCode = onAccountsUpdateListener != null ? onAccountsUpdateListener.hashCode() : 0;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivity = this.EZpvd;
        int iHashCode2 = grantCredentialsPermissionActivity != null ? grantCredentialsPermissionActivity.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Destroyable.class != obj.getClass()) {
            return false;
        }
        Destroyable destroyable = (Destroyable) obj;
        return Intrinsics.EZpvd(this.KWHzl, destroyable.KWHzl) && Intrinsics.EZpvd(this.EZpvd, destroyable.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, destroyable.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) destroyable.AEQbTJ);
    }

    public static /* synthetic */ Destroyable copy$default(Destroyable destroyable, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminRespondToAuthChallengeResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Destroyable.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Destroyable.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(destroyable);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public GrantCredentialsPermissionActivity KWHzl;
        public OnAccountsUpdateListener copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(OnAccountsUpdateListener onAccountsUpdateListener) {
            this.copydefault = onAccountsUpdateListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnAccountsUpdateListener KWHzl() {
            return this.copydefault;
        }

        public final Activity OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
            this.EZpvd = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GrantCredentialsPermissionActivity copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(GrantCredentialsPermissionActivity grantCredentialsPermissionActivity) {
            this.KWHzl = grantCredentialsPermissionActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull Destroyable destroyable) {
            this();
            Intrinsics.checkNotNullParameter(destroyable, "");
            this.copydefault = destroyable.OLrzqt();
            this.KWHzl = destroyable.copydefault();
            this.EZpvd = destroyable.KWHzl();
            this.AEQbTJ = destroyable.EZpvd();
        }

        public final Destroyable AEQbTJ() {
            return new Destroyable(this, null);
        }
    }
}
