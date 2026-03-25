package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C11053c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C11053c {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final java.lang.String AYXKKw;
    public final java.util.List<C11861cc> AhwBna;
    public final AbstractC11162cE EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final C11108cC djBIcL;
    public final java.lang.String gEmmrt;
    public final C11135cD valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.c$ActionBar) A[MD:(o.c$ActionBar):void (m)] call: o.c.<init>(o.c$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11053c(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C11861cc> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC11162cE EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11135cD valueOf() {
        return this.valueOf;
    }

    public C11053c(ActionBar actionBar) {
        this.copydefault = actionBar.KWHzl();
        this.EZpvd = actionBar.copydefault();
        this.OLrzqt = actionBar.EZpvd();
        this.KWHzl = actionBar.djBIcL();
        this.AYXKKw = actionBar.AYXKKw();
        this.AhwBna = actionBar.AhwBna();
        this.gEmmrt = actionBar.valueOf();
        this.djBIcL = actionBar.gEmmrt();
        this.valueOf = actionBar.isConnected();
    }

    /* JADX INFO: renamed from: o.c$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.c.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetTextDetectionResponse(");
        sb.append("jobId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("textDetections=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("textModelVersion=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("video=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("videoMetadata=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        AbstractC11162cE abstractC11162cE = this.EZpvd;
        int iHashCode2 = abstractC11162cE != null ? abstractC11162cE.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        java.util.List<C11861cc> list = this.AhwBna;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        java.lang.String str5 = this.gEmmrt;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        int iHashCode8 = c11108cC != null ? c11108cC.hashCode() : 0;
        C11135cD c11135cD = this.valueOf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (c11135cD != null ? c11135cD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11053c.class != obj.getClass()) {
            return false;
        }
        C11053c c11053c = (C11053c) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c11053c.copydefault) && Intrinsics.EZpvd(this.EZpvd, c11053c.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11053c.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c11053c.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c11053c.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c11053c.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c11053c.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, c11053c.djBIcL) && Intrinsics.EZpvd(this.valueOf, c11053c.valueOf);
    }

    public static /* synthetic */ C11053c copy$default(C11053c c11053c, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetTextDetectionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11053c.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11053c.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c11053c);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.c$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.util.List<C11861cc> AYXKKw;
        public C11135cD AhwBna;
        public AbstractC11162cE EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public C11108cC gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C11135cD c11135cD) {
            this.AhwBna = c11135cD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC11162cE abstractC11162cE) {
            this.EZpvd = abstractC11162cE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C11861cc> AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.valueOf = str;
        }

        public final ActionBar OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C11861cc> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC11162cE copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C11108cC c11108cC) {
            this.gEmmrt = c11108cC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11135cD isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C11053c c11053c) {
            this();
            Intrinsics.checkNotNullParameter(c11053c, "");
            this.copydefault = c11053c.OLrzqt();
            this.EZpvd = c11053c.EZpvd();
            this.KWHzl = c11053c.KWHzl();
            this.AEQbTJ = c11053c.copydefault();
            this.OLrzqt = c11053c.AEQbTJ();
            this.AYXKKw = c11053c.AYXKKw();
            this.valueOf = c11053c.AhwBna();
            this.gEmmrt = c11053c.djBIcL();
            this.AhwBna = c11053c.valueOf();
        }

        public final C11053c AEQbTJ() {
            return new C11053c(this, null);
        }
    }
}
