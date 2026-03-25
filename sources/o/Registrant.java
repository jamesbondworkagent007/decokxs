package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.Registrant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Registrant {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final RemoteCallbackList DbNXlk;
    public final C5173Hn EZpvd;
    public final RemoteCallbackList KWHzl;
    public final C5173Hn OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final RemoteException gEmmrt;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.Registrant$ActionBar) A[MD:(o.Registrant$ActionBar):void (m)] call: o.Registrant.<init>(o.Registrant$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Registrant(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteCallbackList copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteCallbackList fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoteException gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public Registrant(ActionBar actionBar) {
        this.OLrzqt = actionBar.AEQbTJ();
        this.EZpvd = actionBar.KWHzl();
        this.copydefault = actionBar.copydefault();
        this.KWHzl = actionBar.djBIcL();
        this.djBIcL = actionBar.gEmmrt();
        this.AYXKKw = actionBar.valueOf();
        this.AhwBna = actionBar.AYXKKw();
        this.valueOf = actionBar.AhwBna();
        this.gEmmrt = actionBar.DbNXlk();
        this.values = actionBar.AkhnZx();
        this.DbNXlk = actionBar.values();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Registrant.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FlywheelIterationProperties(");
        sb.append("creationTime=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("evaluatedModelArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("evaluatedModelMetrics=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("evaluationManifestS3Prefix=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelIterationId=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("trainedModelArn=" + this.values + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("trainedModelMetrics=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        int iHashCode2 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        RemoteCallbackList remoteCallbackList = this.KWHzl;
        int iHashCode4 = remoteCallbackList != null ? remoteCallbackList.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        RemoteException remoteException = this.gEmmrt;
        int iHashCode9 = remoteException != null ? remoteException.hashCode() : 0;
        java.lang.String str6 = this.values;
        int iHashCode10 = str6 != null ? str6.hashCode() : 0;
        RemoteCallbackList remoteCallbackList2 = this.DbNXlk;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (remoteCallbackList2 != null ? remoteCallbackList2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Registrant.class != obj.getClass()) {
            return false;
        }
        Registrant registrant = (Registrant) obj;
        return Intrinsics.EZpvd(this.OLrzqt, registrant.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, registrant.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) registrant.copydefault) && Intrinsics.EZpvd(this.KWHzl, registrant.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) registrant.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) registrant.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) registrant.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) registrant.valueOf) && Intrinsics.EZpvd(this.gEmmrt, registrant.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) registrant.values) && Intrinsics.EZpvd(this.DbNXlk, registrant.DbNXlk);
    }

    public static /* synthetic */ Registrant copy$default(Registrant registrant, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.FlywheelIterationProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Registrant.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Registrant.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(registrant);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    public static final class ActionBar {
        public C5173Hn AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public C5173Hn EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public RemoteCallbackList copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public RemoteException valueOf;
        public RemoteCallbackList values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RemoteException DbNXlk() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(RemoteCallbackList remoteCallbackList) {
            this.copydefault = remoteCallbackList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(RemoteException remoteException) {
            this.valueOf = remoteException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(RemoteCallbackList remoteCallbackList) {
            this.values = remoteCallbackList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RemoteCallbackList djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void valueOf(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RemoteCallbackList values() {
            return this.values;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull Registrant registrant) {
            this();
            Intrinsics.checkNotNullParameter(registrant, "");
            this.AEQbTJ = registrant.OLrzqt();
            this.EZpvd = registrant.KWHzl();
            this.KWHzl = registrant.AEQbTJ();
            this.copydefault = registrant.copydefault();
            this.OLrzqt = registrant.EZpvd();
            this.gEmmrt = registrant.djBIcL();
            this.djBIcL = registrant.AhwBna();
            this.AYXKKw = registrant.valueOf();
            this.valueOf = registrant.gEmmrt();
            this.AhwBna = registrant.AYXKKw();
            this.values = registrant.fetchVPNInfo();
        }

        public final Registrant EZpvd() {
            return new Registrant(this, null);
        }
    }
}
