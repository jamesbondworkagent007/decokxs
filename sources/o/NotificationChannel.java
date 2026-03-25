package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NotificationChannel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NotificationChannel {
    public static final ActionBar copydefault = new ActionBar(null);
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.Integer EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final int djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NotificationChannel$Activity) A[MD:(o.NotificationChannel$Activity):void (m)] call: o.NotificationChannel.<init>(o.NotificationChannel$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NotificationChannel(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.djBIcL;
    }

    public NotificationChannel(Activity activity) {
        this.EZpvd = activity.copydefault();
        this.AEQbTJ = activity.AEQbTJ();
        this.KWHzl = activity.EZpvd();
        this.OLrzqt = activity.AYXKKw();
        this.AYXKKw = activity.valueOf();
        this.djBIcL = activity.djBIcL();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NotificationChannel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PasswordPolicyType(");
        sb.append("minimumLength=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("requireLowercase=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("requireNumbers=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("requireSymbols=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("requireUppercase=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("temporaryPasswordValidityDays=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        return (((((((((iIntValue * 31) + iHashCode) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + this.djBIcL;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NotificationChannel.class != obj.getClass()) {
            return false;
        }
        NotificationChannel notificationChannel = (NotificationChannel) obj;
        return Intrinsics.EZpvd(this.EZpvd, notificationChannel.EZpvd) && this.AEQbTJ == notificationChannel.AEQbTJ && this.KWHzl == notificationChannel.KWHzl && this.OLrzqt == notificationChannel.OLrzqt && this.AYXKKw == notificationChannel.AYXKKw && this.djBIcL == notificationChannel.djBIcL;
    }

    public static /* synthetic */ NotificationChannel copy$default(NotificationChannel notificationChannel, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordPolicyType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NotificationChannel.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NotificationChannel.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(notificationChannel);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public boolean AEQbTJ;
        public boolean EZpvd;
        public boolean KWHzl;
        public boolean OLrzqt;
        public java.lang.Integer copydefault;
        public int djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.djBIcL = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.copydefault = num;
        }

        public final Activity OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull NotificationChannel notificationChannel) {
            this();
            Intrinsics.checkNotNullParameter(notificationChannel, "");
            this.copydefault = notificationChannel.AEQbTJ();
            this.KWHzl = notificationChannel.copydefault();
            this.OLrzqt = notificationChannel.KWHzl();
            this.AEQbTJ = notificationChannel.OLrzqt();
            this.EZpvd = notificationChannel.EZpvd();
            this.djBIcL = notificationChannel.djBIcL();
        }

        public final NotificationChannel KWHzl() {
            return new NotificationChannel(this, null);
        }
    }
}
