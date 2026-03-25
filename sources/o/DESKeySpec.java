package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DESKeySpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class DESKeySpec {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final NetworkErrorException AEQbTJ;
    public final IntEvaluator AhwBna;
    public final java.lang.String EZpvd;
    public final AccountManagerResponse KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DESKeySpec$TaskDescription) A[MD:(o.DESKeySpec$TaskDescription):void (m)] call: o.DESKeySpec.<init>(o.DESKeySpec$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DESKeySpec(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerResponse AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntEvaluator AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkErrorException KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    public DESKeySpec(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.KWHzl();
        this.copydefault = taskDescription.AEQbTJ();
        this.EZpvd = taskDescription.EZpvd();
        this.djBIcL = taskDescription.valueOf();
        this.AhwBna = taskDescription.AhwBna();
        this.gEmmrt = taskDescription.djBIcL();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DESKeySpec.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminInitiateAuthRequest(");
        sb.append("analyticsMetadata=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("authFlow=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("authParameters=*** Sensitive Data Redacted ***,");
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("contextData=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AccountManagerResponse accountManagerResponse = this.KWHzl;
        int iHashCode = accountManagerResponse != null ? accountManagerResponse.hashCode() : 0;
        NetworkErrorException networkErrorException = this.AEQbTJ;
        int iHashCode2 = networkErrorException != null ? networkErrorException.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.copydefault;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.djBIcL;
        int iHashCode5 = map2 != null ? map2.hashCode() : 0;
        IntEvaluator intEvaluator = this.AhwBna;
        int iHashCode6 = intEvaluator != null ? intEvaluator.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DESKeySpec.class != obj.getClass()) {
            return false;
        }
        DESKeySpec dESKeySpec = (DESKeySpec) obj;
        return Intrinsics.EZpvd(this.KWHzl, dESKeySpec.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, dESKeySpec.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, dESKeySpec.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) dESKeySpec.EZpvd) && Intrinsics.EZpvd(this.djBIcL, dESKeySpec.djBIcL) && Intrinsics.EZpvd(this.AhwBna, dESKeySpec.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) dESKeySpec.gEmmrt);
    }

    public static /* synthetic */ DESKeySpec copy$default(DESKeySpec dESKeySpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminInitiateAuthRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DESKeySpec.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DESKeySpec.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(dESKeySpec);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
        public java.lang.String AYXKKw;
        public java.util.Map<java.lang.String, java.lang.String> EZpvd;
        public AccountManagerResponse KWHzl;
        public NetworkErrorException OLrzqt;
        public java.lang.String copydefault;
        public IntEvaluator djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IntEvaluator AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkErrorException KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerResponse copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> valueOf() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull DESKeySpec dESKeySpec) {
            this();
            Intrinsics.checkNotNullParameter(dESKeySpec, "");
            this.KWHzl = dESKeySpec.AEQbTJ();
            this.OLrzqt = dESKeySpec.KWHzl();
            this.EZpvd = dESKeySpec.EZpvd();
            this.copydefault = dESKeySpec.OLrzqt();
            this.AEQbTJ = dESKeySpec.copydefault();
            this.djBIcL = dESKeySpec.AhwBna();
            this.AYXKKw = dESKeySpec.djBIcL();
        }

        public final DESKeySpec OLrzqt() {
            return new DESKeySpec(this, null);
        }
    }
}
