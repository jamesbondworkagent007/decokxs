package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.OnAccountsUpdateListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OnAccountsUpdateListener {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final int AEQbTJ;
    public final LocalActivityManager EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.OnAccountsUpdateListener$Application) A[MD:(o.OnAccountsUpdateListener$Application):void (m)] call: o.OnAccountsUpdateListener.<init>(o.OnAccountsUpdateListener$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OnAccountsUpdateListener(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalActivityManager AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public OnAccountsUpdateListener(Application application) {
        this.KWHzl = application.KWHzl();
        this.AEQbTJ = application.OLrzqt();
        this.copydefault = application.EZpvd();
        this.EZpvd = application.AYXKKw();
        this.gEmmrt = application.gEmmrt();
        this.djBIcL = application.valueOf();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.OnAccountsUpdateListener.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuthenticationResultType(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("expiresIn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("idToken=*** Sensitive Data Redacted ***,");
        sb.append("newDeviceMetadata=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("refreshToken=*** Sensitive Data Redacted ***,");
        sb.append("tokenType=" + this.djBIcL);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        int i = this.AEQbTJ;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        LocalActivityManager localActivityManager = this.EZpvd;
        int iHashCode3 = localActivityManager != null ? localActivityManager.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        return (((((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OnAccountsUpdateListener.class != obj.getClass()) {
            return false;
        }
        OnAccountsUpdateListener onAccountsUpdateListener = (OnAccountsUpdateListener) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) onAccountsUpdateListener.KWHzl) && this.AEQbTJ == onAccountsUpdateListener.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) onAccountsUpdateListener.copydefault) && Intrinsics.EZpvd(this.EZpvd, onAccountsUpdateListener.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) onAccountsUpdateListener.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) onAccountsUpdateListener.djBIcL);
    }

    public static /* synthetic */ OnAccountsUpdateListener copy$default(OnAccountsUpdateListener onAccountsUpdateListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AuthenticationResultType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull OnAccountsUpdateListener.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(OnAccountsUpdateListener.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(onAccountsUpdateListener);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String EZpvd;
        public LocalActivityManager KWHzl;
        public int OLrzqt;
        public java.lang.String copydefault;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(LocalActivityManager localActivityManager) {
            this.KWHzl = localActivityManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LocalActivityManager AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(int i) {
            this.OLrzqt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull OnAccountsUpdateListener onAccountsUpdateListener) {
            this();
            Intrinsics.checkNotNullParameter(onAccountsUpdateListener, "");
            this.EZpvd = onAccountsUpdateListener.copydefault();
            this.OLrzqt = onAccountsUpdateListener.OLrzqt();
            this.AEQbTJ = onAccountsUpdateListener.EZpvd();
            this.KWHzl = onAccountsUpdateListener.AEQbTJ();
            this.copydefault = onAccountsUpdateListener.KWHzl();
            this.AYXKKw = onAccountsUpdateListener.valueOf();
        }

        public final OnAccountsUpdateListener copydefault() {
            return new OnAccountsUpdateListener(this, null);
        }
    }
}
