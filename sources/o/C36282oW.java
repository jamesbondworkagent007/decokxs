package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36282oW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36282oW {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C5173Hn EZpvd;
    public final java.lang.String OLrzqt;
    public final AbstractC34595nf copydefault;
    public final java.util.List<AbstractC33846nI> djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oW$Application) A[MD:(o.oW$Application):void (m)] call: o.oW.<init>(o.oW$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36282oW(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC34595nf EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C36282oW(Application application) {
        this.AEQbTJ = application.AEQbTJ();
        this.OLrzqt = application.EZpvd();
        this.copydefault = application.KWHzl();
        this.EZpvd = application.AYXKKw();
        this.AYXKKw = application.gEmmrt();
        this.djBIcL = application.djBIcL();
    }

    /* JADX INFO: renamed from: o.oW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateAdapterResponse(");
        sb.append("adapterId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("adapterName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("autoUpdate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("creationTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("featureTypes=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        AbstractC34595nf abstractC34595nf = this.copydefault;
        int iHashCode3 = abstractC34595nf != null ? abstractC34595nf.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode4 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.util.List<AbstractC33846nI> list = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36282oW.class != obj.getClass()) {
            return false;
        }
        C36282oW c36282oW = (C36282oW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c36282oW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c36282oW.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c36282oW.copydefault) && Intrinsics.EZpvd(this.EZpvd, c36282oW.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c36282oW.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, c36282oW.djBIcL);
    }

    public static /* synthetic */ C36282oW copy$default(C36282oW c36282oW, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.UpdateAdapterResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36282oW.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36282oW.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c36282oW);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oW$Application */
    public static final class Application {
        public AbstractC34595nf AEQbTJ;
        public java.lang.String EZpvd;
        public C5173Hn KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<? extends AbstractC33846nI> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC34595nf abstractC34595nf) {
            this.AEQbTJ = abstractC34595nf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC34595nf KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        public final Application copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<? extends AbstractC33846nI> list) {
            this.valueOf = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36282oW c36282oW) {
            this();
            Intrinsics.checkNotNullParameter(c36282oW, "");
            this.EZpvd = c36282oW.copydefault();
            this.OLrzqt = c36282oW.KWHzl();
            this.AEQbTJ = c36282oW.EZpvd();
            this.KWHzl = c36282oW.OLrzqt();
            this.copydefault = c36282oW.AEQbTJ();
            this.valueOf = c36282oW.AYXKKw();
        }

        public final C36282oW OLrzqt() {
            return new C36282oW(this, null);
        }
    }
}
