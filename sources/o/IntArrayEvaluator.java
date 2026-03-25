package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IntArrayEvaluator;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class IntArrayEvaluator {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;
    public final AccountManagerResponse copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final RestoreDescription valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IntArrayEvaluator$Activity) A[MD:(o.IntArrayEvaluator$Activity):void (m)] call: o.IntArrayEvaluator.<init>(o.IntArrayEvaluator$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IntArrayEvaluator(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreDescription AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    public IntArrayEvaluator(Activity activity) {
        this.copydefault = activity.copydefault();
        this.KWHzl = activity.OLrzqt();
        this.OLrzqt = activity.KWHzl();
        this.EZpvd = activity.AEQbTJ();
        this.AhwBna = activity.AYXKKw();
        this.gEmmrt = activity.AhwBna();
        this.valueOf = activity.djBIcL();
        this.djBIcL = activity.valueOf();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IntArrayEvaluator.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfirmForgotPasswordRequest(");
        sb.append("analyticsMetadata=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("confirmationCode=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("password=*** Sensitive Data Redacted ***,");
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.copydefault;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        RestoreDescription restoreDescription = this.valueOf;
        int iHashCode7 = restoreDescription != null ? restoreDescription.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IntArrayEvaluator.class != obj.getClass()) {
            return false;
        }
        IntArrayEvaluator intArrayEvaluator = (IntArrayEvaluator) obj;
        return Intrinsics.EZpvd(this.copydefault, intArrayEvaluator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) intArrayEvaluator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, intArrayEvaluator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) intArrayEvaluator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) intArrayEvaluator.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) intArrayEvaluator.gEmmrt) && Intrinsics.EZpvd(this.valueOf, intArrayEvaluator.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) intArrayEvaluator.djBIcL);
    }

    public static /* synthetic */ IntArrayEvaluator copy$default(IntArrayEvaluator intArrayEvaluator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ConfirmForgotPasswordRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntArrayEvaluator.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntArrayEvaluator.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(intArrayEvaluator);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Activity {
        public AccountManagerResponse AEQbTJ;
        public java.lang.String AYXKKw;
        public RestoreDescription AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.util.Map<java.lang.String, java.lang.String> OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
            this.OLrzqt = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AccountManagerResponse accountManagerResponse) {
            this.AEQbTJ = accountManagerResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreDescription djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull IntArrayEvaluator intArrayEvaluator) {
            this();
            Intrinsics.checkNotNullParameter(intArrayEvaluator, "");
            this.AEQbTJ = intArrayEvaluator.KWHzl();
            this.EZpvd = intArrayEvaluator.AEQbTJ();
            this.OLrzqt = intArrayEvaluator.OLrzqt();
            this.KWHzl = intArrayEvaluator.EZpvd();
            this.copydefault = intArrayEvaluator.copydefault();
            this.gEmmrt = intArrayEvaluator.AYXKKw();
            this.AhwBna = intArrayEvaluator.AhwBna();
            this.AYXKKw = intArrayEvaluator.djBIcL();
        }

        public final IntArrayEvaluator EZpvd() {
            return new IntArrayEvaluator(this, null);
        }

        public final void OLrzqt(@NotNull Function1<? super RestoreDescription.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AhwBna = RestoreDescription.copydefault.OLrzqt(function1);
        }
    }
}
