package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IntKeyframeSet;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class IntKeyframeSet {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.lang.Boolean AYXKKw;
    public final java.lang.String AhwBna;
    public final AccountManagerResponse EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final RestoreDescription gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IntKeyframeSet$Activity) A[MD:(o.IntKeyframeSet$Activity):void (m)] call: o.IntKeyframeSet.<init>(o.IntKeyframeSet$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IntKeyframeSet(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreDescription AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public IntKeyframeSet(Activity activity) {
        this.EZpvd = activity.copydefault();
        this.KWHzl = activity.KWHzl();
        this.AEQbTJ = activity.EZpvd();
        this.OLrzqt = activity.OLrzqt();
        this.AYXKKw = activity.djBIcL();
        this.AhwBna = activity.AYXKKw();
        this.gEmmrt = activity.gEmmrt();
        this.valueOf = activity.valueOf();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IntKeyframeSet.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfirmSignUpRequest(");
        sb.append("analyticsMetadata=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("confirmationCode=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("forceAliasCreation=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.EZpvd;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.AEQbTJ;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.AYXKKw;
        int iHashCode5 = bool != null ? bool.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        RestoreDescription restoreDescription = this.gEmmrt;
        int iHashCode7 = restoreDescription != null ? restoreDescription.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IntKeyframeSet.class != obj.getClass()) {
            return false;
        }
        IntKeyframeSet intKeyframeSet = (IntKeyframeSet) obj;
        return Intrinsics.EZpvd(this.EZpvd, intKeyframeSet.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) intKeyframeSet.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, intKeyframeSet.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) intKeyframeSet.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, intKeyframeSet.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) intKeyframeSet.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, intKeyframeSet.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) intKeyframeSet.valueOf);
    }

    public static /* synthetic */ IntKeyframeSet copy$default(IntKeyframeSet intKeyframeSet, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ConfirmSignUpRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntKeyframeSet.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntKeyframeSet.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(intKeyframeSet);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public AccountManagerResponse OLrzqt;
        public java.lang.Boolean copydefault;
        public RestoreDescription djBIcL;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AccountManagerResponse accountManagerResponse) {
            this.OLrzqt = accountManagerResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.Map<java.lang.String, java.lang.String> map) {
            this.KWHzl = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreDescription gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AYXKKw;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull IntKeyframeSet intKeyframeSet) {
            this();
            Intrinsics.checkNotNullParameter(intKeyframeSet, "");
            this.OLrzqt = intKeyframeSet.copydefault();
            this.EZpvd = intKeyframeSet.OLrzqt();
            this.KWHzl = intKeyframeSet.KWHzl();
            this.AEQbTJ = intKeyframeSet.EZpvd();
            this.copydefault = intKeyframeSet.AEQbTJ();
            this.gEmmrt = intKeyframeSet.djBIcL();
            this.djBIcL = intKeyframeSet.AhwBna();
            this.AYXKKw = intKeyframeSet.valueOf();
        }

        public final IntKeyframeSet AEQbTJ() {
            return new IntKeyframeSet(this, null);
        }

        public final void OLrzqt(@NotNull Function1<? super RestoreDescription.Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.djBIcL = RestoreDescription.copydefault.OLrzqt(function1);
        }
    }
}
