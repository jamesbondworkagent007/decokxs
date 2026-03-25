package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AccountManagerResponse;
import o.BroadcastOptions;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BroadcastOptions {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final AccountManagerResponse AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AhwBna;
    public final java.lang.String EZpvd;
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl;
    public final NetworkErrorException OLrzqt;
    public final RestoreDescription djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.BroadcastOptions$Activity) A[MD:(o.BroadcastOptions$Activity):void (m)] call: o.BroadcastOptions.<init>(o.BroadcastOptions$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ BroadcastOptions(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkErrorException OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreDescription gEmmrt() {
        return this.djBIcL;
    }

    public BroadcastOptions(Activity activity) {
        this.AEQbTJ = activity.copydefault();
        this.OLrzqt = activity.OLrzqt();
        this.KWHzl = activity.AEQbTJ();
        this.EZpvd = activity.KWHzl();
        this.AhwBna = activity.djBIcL();
        this.djBIcL = activity.AhwBna();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BroadcastOptions.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InitiateAuthRequest(");
        sb.append("analyticsMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("authFlow=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("authParameters=*** Sensitive Data Redacted ***,");
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("userContextData=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.AEQbTJ;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        NetworkErrorException networkErrorException = this.OLrzqt;
        int iHashCode2 = networkErrorException != null ? networkErrorException.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.KWHzl;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.AhwBna;
        int iHashCode5 = map2 != null ? map2.hashCode() : 0;
        RestoreDescription restoreDescription = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (restoreDescription != null ? restoreDescription.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BroadcastOptions.class != obj.getClass()) {
            return false;
        }
        BroadcastOptions broadcastOptions = (BroadcastOptions) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, broadcastOptions.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, broadcastOptions.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, broadcastOptions.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) broadcastOptions.EZpvd) && Intrinsics.EZpvd(this.AhwBna, broadcastOptions.AhwBna) && Intrinsics.EZpvd(this.djBIcL, broadcastOptions.djBIcL);
    }

    public static /* synthetic */ BroadcastOptions copy$default(BroadcastOptions broadcastOptions, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.InitiateAuthRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull BroadcastOptions.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BroadcastOptions.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(broadcastOptions);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
        public RestoreDescription AhwBna;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public NetworkErrorException KWHzl;
        public AccountManagerResponse OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
            this.AEQbTJ = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreDescription AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.Map<java.lang.String, java.lang.String> map) {
            this.EZpvd = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkErrorException OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(NetworkErrorException networkErrorException) {
            this.KWHzl = networkErrorException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull BroadcastOptions broadcastOptions) {
            this();
            Intrinsics.checkNotNullParameter(broadcastOptions, "");
            this.OLrzqt = broadcastOptions.KWHzl();
            this.KWHzl = broadcastOptions.OLrzqt();
            this.EZpvd = broadcastOptions.AEQbTJ();
            this.copydefault = broadcastOptions.copydefault();
            this.AEQbTJ = broadcastOptions.EZpvd();
            this.AhwBna = broadcastOptions.gEmmrt();
        }

        public final BroadcastOptions EZpvd() {
            return new BroadcastOptions(this, null);
        }

        public final void copydefault(@NotNull Function1<? super AccountManagerResponse.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = AccountManagerResponse.OLrzqt.OLrzqt(function1);
        }

        public final void OLrzqt(@NotNull Function1<? super RestoreDescription.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AhwBna = RestoreDescription.copydefault.OLrzqt(function1);
        }
    }
}
