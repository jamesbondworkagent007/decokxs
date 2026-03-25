package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34437nc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C34437nc {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final C34250nX AEQbTJ;
    public final C34331na EZpvd;
    public final java.util.List<AbstractC33846nI> KWHzl;
    public final C35318nt OLrzqt;
    public final C37715oz djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nc$Application) A[MD:(o.nc$Application):void (m)] call: o.nc.<init>(o.nc$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34437nc(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37715oz EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35318nt KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34250nX OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34331na copydefault() {
        return this.EZpvd;
    }

    public C34437nc(Application application) {
        this.EZpvd = application.KWHzl();
        this.OLrzqt = application.OLrzqt();
        this.KWHzl = application.EZpvd();
        this.AEQbTJ = application.AEQbTJ();
        this.djBIcL = application.AhwBna();
    }

    /* JADX INFO: renamed from: o.nc$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeDocumentRequest(");
        sb.append("adaptersConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("document=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("featureTypes=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("humanLoopConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("queriesConfig=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C34331na c34331na = this.EZpvd;
        int iHashCode = c34331na != null ? c34331na.hashCode() : 0;
        C35318nt c35318nt = this.OLrzqt;
        int iHashCode2 = c35318nt != null ? c35318nt.hashCode() : 0;
        java.util.List<AbstractC33846nI> list = this.KWHzl;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        C34250nX c34250nX = this.AEQbTJ;
        int iHashCode4 = c34250nX != null ? c34250nX.hashCode() : 0;
        C37715oz c37715oz = this.djBIcL;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (c37715oz != null ? c37715oz.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34437nc.class != obj.getClass()) {
            return false;
        }
        C34437nc c34437nc = (C34437nc) obj;
        return Intrinsics.EZpvd(this.EZpvd, c34437nc.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c34437nc.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c34437nc.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c34437nc.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, c34437nc.djBIcL);
    }

    public static /* synthetic */ C34437nc copy$default(C34437nc c34437nc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeDocumentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34437nc.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34437nc.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c34437nc);
        function1.invoke(application);
        return application.copydefault();
    }

    /* JADX INFO: renamed from: o.nc$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public C35318nt AEQbTJ;
        public C34250nX EZpvd;
        public java.util.List<? extends AbstractC33846nI> KWHzl;
        public C34331na OLrzqt;
        public C37715oz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34250nX AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<? extends AbstractC33846nI> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37715oz AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34331na KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C35318nt c35318nt) {
            this.AEQbTJ = c35318nt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35318nt OLrzqt() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34437nc c34437nc) {
            this();
            Intrinsics.checkNotNullParameter(c34437nc, "");
            this.OLrzqt = c34437nc.copydefault();
            this.AEQbTJ = c34437nc.KWHzl();
            this.KWHzl = c34437nc.AEQbTJ();
            this.EZpvd = c34437nc.OLrzqt();
            this.copydefault = c34437nc.EZpvd();
        }

        public final C34437nc copydefault() {
            return new C34437nc(this, null);
        }
    }
}
