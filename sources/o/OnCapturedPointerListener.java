package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.OnCapturedPointerListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OnCapturedPointerListener {
    public static final Application EZpvd = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OnCapturedPointerListener$Activity) A[MD:(o.OnCapturedPointerListener$Activity):void (m)] call: o.OnCapturedPointerListener.<init>(o.OnCapturedPointerListener$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OnCapturedPointerListener(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public OnCapturedPointerListener(Activity activity) {
        this.OLrzqt = activity.copydefault();
        this.copydefault = activity.EZpvd();
        this.KWHzl = activity.AEQbTJ();
        this.AEQbTJ = activity.AYXKKw();
        this.valueOf = activity.djBIcL();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnCapturedPointerListener.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateTokenResponse(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("expiresIn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("idToken=*** Sensitive Data Redacted ***,");
        sb.append("refreshToken=*** Sensitive Data Redacted ***,");
        sb.append("tokenType=" + this.valueOf);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.copydefault;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        return (((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnCapturedPointerListener.class != obj.getClass()) {
            return false;
        }
        OnCapturedPointerListener onCapturedPointerListener = (OnCapturedPointerListener) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) onCapturedPointerListener.OLrzqt) && this.copydefault == onCapturedPointerListener.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) onCapturedPointerListener.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) onCapturedPointerListener.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) onCapturedPointerListener.valueOf);
    }

    public static /* synthetic */ OnCapturedPointerListener copy$default(OnCapturedPointerListener onCapturedPointerListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.CreateTokenResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OnCapturedPointerListener.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OnCapturedPointerListener.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(onCapturedPointerListener);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public int OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull OnCapturedPointerListener onCapturedPointerListener) {
            this();
            Intrinsics.checkNotNullParameter(onCapturedPointerListener, "");
            this.AEQbTJ = onCapturedPointerListener.KWHzl();
            this.OLrzqt = onCapturedPointerListener.EZpvd();
            this.EZpvd = onCapturedPointerListener.copydefault();
            this.KWHzl = onCapturedPointerListener.OLrzqt();
            this.copydefault = onCapturedPointerListener.AEQbTJ();
        }

        public final OnCapturedPointerListener OLrzqt() {
            return new OnCapturedPointerListener(this, null);
        }
    }
}
