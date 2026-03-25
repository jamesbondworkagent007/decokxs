package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34947nm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34947nm {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public final AbstractC34595nf EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<AbstractC33846nI> djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nm$Application) A[MD:(o.nm$Application):void (m)] call: o.nm.<init>(o.nm$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34947nm(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC34595nf OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public C34947nm(Application application) {
        this.AEQbTJ = application.EZpvd();
        this.EZpvd = application.KWHzl();
        this.OLrzqt = application.OLrzqt();
        this.copydefault = application.copydefault();
        this.djBIcL = application.gEmmrt();
        this.AYXKKw = application.djBIcL();
    }

    /* JADX INFO: renamed from: o.nm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAdapterRequest(");
        sb.append("adapterName=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("autoUpdate=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("featureTypes=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        AbstractC34595nf abstractC34595nf = this.EZpvd;
        int iHashCode2 = abstractC34595nf != null ? abstractC34595nf.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.util.List<AbstractC33846nI> list = this.djBIcL;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34947nm.class != obj.getClass()) {
            return false;
        }
        C34947nm c34947nm = (C34947nm) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c34947nm.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c34947nm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34947nm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34947nm.copydefault) && Intrinsics.EZpvd(this.djBIcL, c34947nm.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, c34947nm.AYXKKw);
    }

    public static /* synthetic */ C34947nm copy$default(C34947nm c34947nm, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.CreateAdapterRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34947nm.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34947nm.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c34947nm);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.nm$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.util.List<? extends AbstractC33846nI> OLrzqt;
        public AbstractC34595nf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC34595nf KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> gEmmrt() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34947nm c34947nm) {
            this();
            Intrinsics.checkNotNullParameter(c34947nm, "");
            this.KWHzl = c34947nm.copydefault();
            this.copydefault = c34947nm.OLrzqt();
            this.EZpvd = c34947nm.EZpvd();
            this.AEQbTJ = c34947nm.AEQbTJ();
            this.OLrzqt = c34947nm.KWHzl();
            this.AhwBna = c34947nm.AYXKKw();
        }

        public final C34947nm AEQbTJ() {
            return new C34947nm(this, null);
        }
    }
}
