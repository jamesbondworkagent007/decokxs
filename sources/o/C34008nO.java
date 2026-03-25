package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34008nO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34008nO {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.util.List<AbstractC33846nI> AYXKKw;
    public final java.lang.String AhwBna;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final AbstractC34595nf copydefault;
    public final java.util.Map<java.lang.String, java.lang.String> gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nO$Application) A[MD:(o.nO$Application):void (m)] call: o.nO.<init>(o.nO$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34008nO(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC34595nf copydefault() {
        return this.copydefault;
    }

    public C34008nO(Application application) {
        this.KWHzl = application.OLrzqt();
        this.OLrzqt = application.AEQbTJ();
        this.copydefault = application.KWHzl();
        this.EZpvd = application.gEmmrt();
        this.AhwBna = application.valueOf();
        this.AYXKKw = application.AhwBna();
        this.gEmmrt = application.djBIcL();
    }

    /* JADX INFO: renamed from: o.nO$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetAdapterResponse(");
        sb.append("adapterId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("adapterName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("autoUpdate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("creationTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("featureTypes=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        AbstractC34595nf abstractC34595nf = this.copydefault;
        int iHashCode3 = abstractC34595nf != null ? abstractC34595nf.hashCode() : 0;
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode4 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.util.List<AbstractC33846nI> list = this.AYXKKw;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34008nO.class != obj.getClass()) {
            return false;
        }
        C34008nO c34008nO = (C34008nO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c34008nO.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34008nO.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c34008nO.copydefault) && Intrinsics.EZpvd(this.EZpvd, c34008nO.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c34008nO.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, c34008nO.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, c34008nO.gEmmrt);
    }

    public static /* synthetic */ C34008nO copy$default(C34008nO c34008nO, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetAdapterResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34008nO.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34008nO.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c34008nO);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: renamed from: o.nO$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.List<? extends AbstractC33846nI> AYXKKw;
        public AbstractC34595nf EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;
        public java.util.Map<java.lang.String, java.lang.String> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> AhwBna() {
            return this.AYXKKw;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map) {
            this.valueOf = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC34595nf KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<? extends AbstractC33846nI> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC34595nf abstractC34595nf) {
            this.EZpvd = abstractC34595nf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34008nO c34008nO) {
            this();
            Intrinsics.checkNotNullParameter(c34008nO, "");
            this.copydefault = c34008nO.OLrzqt();
            this.KWHzl = c34008nO.AEQbTJ();
            this.EZpvd = c34008nO.copydefault();
            this.OLrzqt = c34008nO.EZpvd();
            this.AEQbTJ = c34008nO.KWHzl();
            this.AYXKKw = c34008nO.AYXKKw();
            this.valueOf = c34008nO.AhwBna();
        }

        public final C34008nO copydefault() {
            return new C34008nO(this, null);
        }
    }
}
