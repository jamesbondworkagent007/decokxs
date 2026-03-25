package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CipherOutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class CipherOutputStream {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final int EZpvd;
    public final boolean OLrzqt;
    public final MediaRouteButton copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CipherOutputStream$Activity) A[MD:(o.CipherOutputStream$Activity):void (m)] call: o.CipherOutputStream.<init>(o.CipherOutputStream$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CipherOutputStream(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaRouteButton copydefault() {
        return this.copydefault;
    }

    public CipherOutputStream(Activity activity) {
        this.OLrzqt = activity.AEQbTJ();
        this.copydefault = activity.EZpvd();
        this.EZpvd = activity.OLrzqt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CipherOutputStream.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminCreateUserConfigType(");
        sb.append("allowAdminCreateUserOnly=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inviteMessageTemplate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("unusedAccountValidityDays=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        MediaRouteButton mediaRouteButton = this.copydefault;
        return (((iHashCode * 31) + (mediaRouteButton != null ? mediaRouteButton.hashCode() : 0)) * 31) + this.EZpvd;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CipherOutputStream.class != obj.getClass()) {
            return false;
        }
        CipherOutputStream cipherOutputStream = (CipherOutputStream) obj;
        return this.OLrzqt == cipherOutputStream.OLrzqt && Intrinsics.EZpvd(this.copydefault, cipherOutputStream.copydefault) && this.EZpvd == cipherOutputStream.EZpvd;
    }

    public static /* synthetic */ CipherOutputStream copy$default(CipherOutputStream cipherOutputStream, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminCreateUserConfigType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CipherOutputStream.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CipherOutputStream.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(cipherOutputStream);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public boolean AEQbTJ;
        public int OLrzqt;
        public MediaRouteButton copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MediaRouteButton EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(MediaRouteButton mediaRouteButton) {
            this.copydefault = mediaRouteButton;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        public final Activity copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.OLrzqt = i;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull CipherOutputStream cipherOutputStream) {
            this();
            Intrinsics.checkNotNullParameter(cipherOutputStream, "");
            this.AEQbTJ = cipherOutputStream.EZpvd();
            this.copydefault = cipherOutputStream.copydefault();
            this.OLrzqt = cipherOutputStream.KWHzl();
        }

        public final CipherOutputStream KWHzl() {
            return new CipherOutputStream(this, null);
        }
    }
}
