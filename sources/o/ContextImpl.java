package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ContextImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ContextImpl {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final PackageDeleteObserver DbNXlk;
    public final java.lang.String EZpvd;
    public final AnyRes OLrzqt;
    public final AppIdInt copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ContextImpl$TaskDescription) A[MD:(o.ContextImpl$TaskDescription):void (m)] call: o.ContextImpl.<init>(o.ContextImpl$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ContextImpl(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppIdInt AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnyRes OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PackageDeleteObserver fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.isConnected;
    }

    public ContextImpl(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.AEQbTJ();
        this.copydefault = taskDescription.copydefault();
        this.EZpvd = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.AYXKKw();
        this.djBIcL = taskDescription.valueOf();
        this.AYXKKw = taskDescription.djBIcL();
        this.AhwBna = taskDescription.AhwBna();
        this.valueOf = taskDescription.gEmmrt();
        this.gEmmrt = taskDescription.isConnected();
        this.values = taskDescription.values();
        this.isConnected = taskDescription.DbNXlk();
        this.DbNXlk = taskDescription.AkhnZx();
        this.fetchVPNInfo = taskDescription.fetchVPNInfo();
        this.AkhnZx = taskDescription.fJNWhG();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ContextImpl.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LambdaConfigType(");
        sb.append("createAuthChallenge=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("customEmailSender=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("customMessage=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("customSmsSender=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("defineAuthChallenge=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("postAuthentication=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("postConfirmation=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("preAuthentication=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("preSignUp=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("preTokenGeneration=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("preTokenGenerationConfig=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("userMigration=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("verifyAuthChallengeResponse=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        AppIdInt appIdInt = this.copydefault;
        int iHashCode2 = appIdInt != null ? appIdInt.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        AnyRes anyRes = this.OLrzqt;
        int iHashCode4 = anyRes != null ? anyRes.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.AhwBna;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        java.lang.String str6 = this.valueOf;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        java.lang.String str7 = this.gEmmrt;
        int iHashCode9 = str7 != null ? str7.hashCode() : 0;
        java.lang.String str8 = this.values;
        int iHashCode10 = str8 != null ? str8.hashCode() : 0;
        java.lang.String str9 = this.isConnected;
        int iHashCode11 = str9 != null ? str9.hashCode() : 0;
        PackageDeleteObserver packageDeleteObserver = this.DbNXlk;
        int iHashCode12 = packageDeleteObserver != null ? packageDeleteObserver.hashCode() : 0;
        java.lang.String str10 = this.fetchVPNInfo;
        int iHashCode13 = str10 != null ? str10.hashCode() : 0;
        java.lang.String str11 = this.AkhnZx;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ContextImpl.class != obj.getClass()) {
            return false;
        }
        ContextImpl contextImpl = (ContextImpl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) contextImpl.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, contextImpl.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) contextImpl.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, contextImpl.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) contextImpl.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) contextImpl.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) contextImpl.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) contextImpl.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) contextImpl.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) contextImpl.values) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) contextImpl.isConnected) && Intrinsics.EZpvd(this.DbNXlk, contextImpl.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) contextImpl.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) contextImpl.AkhnZx);
    }

    public static /* synthetic */ ContextImpl copy$default(ContextImpl contextImpl, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.LambdaConfigType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ContextImpl.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContextImpl.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(contextImpl);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public java.lang.String DbNXlk;
        public java.lang.String EZpvd;
        public AppIdInt KWHzl;
        public java.lang.String OLrzqt;
        public AnyRes copydefault;
        public java.lang.String djBIcL;
        public java.lang.String fetchVPNInfo;
        public java.lang.String gEmmrt;
        public PackageDeleteObserver isConnected;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnyRes AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(java.lang.String str) {
            this.fetchVPNInfo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AhwBna(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PackageDeleteObserver AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.DbNXlk;
        }

        public final TaskDescription EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AppIdInt appIdInt) {
            this.KWHzl = appIdInt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppIdInt copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AnyRes anyRes) {
            this.copydefault = anyRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(PackageDeleteObserver packageDeleteObserver) {
            this.isConnected = packageDeleteObserver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fJNWhG() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void gEmmrt(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void values(java.lang.String str) {
            this.AkhnZx = str;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ContextImpl contextImpl) {
            this();
            Intrinsics.checkNotNullParameter(contextImpl, "");
            this.EZpvd = contextImpl.copydefault();
            this.KWHzl = contextImpl.AEQbTJ();
            this.OLrzqt = contextImpl.KWHzl();
            this.copydefault = contextImpl.OLrzqt();
            this.AEQbTJ = contextImpl.EZpvd();
            this.AYXKKw = contextImpl.djBIcL();
            this.AhwBna = contextImpl.gEmmrt();
            this.djBIcL = contextImpl.AYXKKw();
            this.valueOf = contextImpl.valueOf();
            this.gEmmrt = contextImpl.AhwBna();
            this.DbNXlk = contextImpl.values();
            this.isConnected = contextImpl.fetchVPNInfo();
            this.fetchVPNInfo = contextImpl.isConnected();
            this.AkhnZx = contextImpl.DbNXlk();
        }

        public final ContextImpl KWHzl() {
            return new ContextImpl(this, null);
        }
    }
}
