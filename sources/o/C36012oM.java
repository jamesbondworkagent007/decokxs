package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36012oM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36012oM {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final C35634nz copydefault;
    public final C37291or djBIcL;
    public final C37344os gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oM$ActionBar) A[MD:(o.oM$ActionBar):void (m)] call: o.oM.<init>(o.oM$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36012oM(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37344os AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35634nz KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37291or OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C36012oM(ActionBar actionBar) {
        this.EZpvd = actionBar.AEQbTJ();
        this.copydefault = actionBar.copydefault();
        this.AEQbTJ = actionBar.EZpvd();
        this.OLrzqt = actionBar.KWHzl();
        this.djBIcL = actionBar.djBIcL();
        this.gEmmrt = actionBar.AYXKKw();
    }

    /* JADX INFO: renamed from: o.oM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartExpenseAnalysisRequest(");
        sb.append("clientRequestToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("documentLocation=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("outputConfig=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        C35634nz c35634nz = this.copydefault;
        int iHashCode2 = c35634nz != null ? c35634nz.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.OLrzqt;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        C37291or c37291or = this.djBIcL;
        int iHashCode5 = c37291or != null ? c37291or.hashCode() : 0;
        C37344os c37344os = this.gEmmrt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c37344os != null ? c37344os.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36012oM.class != obj.getClass()) {
            return false;
        }
        C36012oM c36012oM = (C36012oM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36012oM.EZpvd) && Intrinsics.EZpvd(this.copydefault, c36012oM.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c36012oM.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c36012oM.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, c36012oM.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c36012oM.gEmmrt);
    }

    public static /* synthetic */ C36012oM copy$default(C36012oM c36012oM, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.StartExpenseAnalysisRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36012oM.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36012oM.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c36012oM);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oM$ActionBar */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C37344os AYXKKw;
        public java.lang.String EZpvd;
        public C37291or KWHzl;
        public C35634nz OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37344os AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35634nz copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37291or djBIcL() {
            return this.KWHzl;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C36012oM c36012oM) {
            this();
            Intrinsics.checkNotNullParameter(c36012oM, "");
            this.copydefault = c36012oM.EZpvd();
            this.OLrzqt = c36012oM.KWHzl();
            this.EZpvd = c36012oM.copydefault();
            this.AEQbTJ = c36012oM.AEQbTJ();
            this.KWHzl = c36012oM.OLrzqt();
            this.AYXKKw = c36012oM.AYXKKw();
        }

        public final C36012oM OLrzqt() {
            return new C36012oM(this, null);
        }
    }
}
