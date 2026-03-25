package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33819nH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33819nH {
    public static final Application AEQbTJ = new Application(null);
    public final C33927nL AYXKKw;
    public final java.lang.Integer EZpvd;
    public final C33765nF KWHzl;
    public final java.util.List<C33792nG> OLrzqt;
    public final C33738nE copydefault;
    public final C33738nE djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nH$ActionBar) A[MD:(o.nH$ActionBar):void (m)] call: o.nH.<init>(o.nH$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33819nH(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C33792nG> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33738nE AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33927nL EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33765nF KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33738nE OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    public C33819nH(ActionBar actionBar) {
        this.KWHzl = actionBar.OLrzqt();
        this.OLrzqt = actionBar.AEQbTJ();
        this.copydefault = actionBar.KWHzl();
        this.EZpvd = actionBar.djBIcL();
        this.AYXKKw = actionBar.AhwBna();
        this.djBIcL = actionBar.gEmmrt();
    }

    /* JADX INFO: renamed from: o.nH$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExpenseField(");
        sb.append("currency=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("groupProperties=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("labelDetection=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("pageNumber=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("type=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("valueDetection=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C33765nF c33765nF = this.KWHzl;
        int iHashCode = c33765nF != null ? c33765nF.hashCode() : 0;
        java.util.List<C33792nG> list = this.OLrzqt;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        C33738nE c33738nE = this.copydefault;
        int iHashCode3 = c33738nE != null ? c33738nE.hashCode() : 0;
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        C33927nL c33927nL = this.AYXKKw;
        int iHashCode4 = c33927nL != null ? c33927nL.hashCode() : 0;
        C33738nE c33738nE2 = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + iHashCode4) * 31) + (c33738nE2 != null ? c33738nE2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33819nH.class != obj.getClass()) {
            return false;
        }
        C33819nH c33819nH = (C33819nH) obj;
        return Intrinsics.EZpvd(this.KWHzl, c33819nH.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c33819nH.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c33819nH.copydefault) && Intrinsics.EZpvd(this.EZpvd, c33819nH.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, c33819nH.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, c33819nH.djBIcL);
    }

    public static /* synthetic */ C33819nH copy$default(C33819nH c33819nH, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ExpenseField$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33819nH.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33819nH.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c33819nH);
        function1.invoke(actionBar);
        return actionBar.EZpvd();
    }

    /* JADX INFO: renamed from: o.nH$ActionBar */
    public static final class ActionBar {
        public java.lang.Integer AEQbTJ;
        public C33738nE AYXKKw;
        public C33738nE EZpvd;
        public C33765nF KWHzl;
        public java.util.List<C33792nG> OLrzqt;
        public C33927nL copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C33792nG> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33927nL AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33738nE KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C33765nF c33765nF) {
            this.KWHzl = c33765nF;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33765nF OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C33738nE c33738nE) {
            this.EZpvd = c33738nE;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C33792nG> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33738nE c33738nE) {
            this.AYXKKw = c33738nE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33927nL c33927nL) {
            this.copydefault = c33927nL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33738nE gEmmrt() {
            return this.AYXKKw;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C33819nH c33819nH) {
            this();
            Intrinsics.checkNotNullParameter(c33819nH, "");
            this.KWHzl = c33819nH.KWHzl();
            this.OLrzqt = c33819nH.AEQbTJ();
            this.EZpvd = c33819nH.OLrzqt();
            this.AEQbTJ = c33819nH.copydefault();
            this.copydefault = c33819nH.EZpvd();
            this.AYXKKw = c33819nH.AhwBna();
        }

        public final C33819nH EZpvd() {
            return new C33819nH(this, null);
        }
    }
}
