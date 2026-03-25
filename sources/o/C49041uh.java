package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C49041uh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C49041uh {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final AbstractC46078tH AEQbTJ;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final AbstractC46078tH copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.uh$Application) A[MD:(o.uh$Application):void (m)] call: o.uh.<init>(o.uh$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C49041uh(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46078tH EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46078tH copydefault() {
        return this.copydefault;
    }

    public C49041uh(Application application) {
        this.EZpvd = application.AEQbTJ();
        this.AEQbTJ = application.OLrzqt();
        this.KWHzl = application.copydefault();
        this.copydefault = application.AhwBna();
    }

    /* JADX INFO: renamed from: o.uh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateParallelDataResponse(");
        sb.append("latestUpdateAttemptAt=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("latestUpdateAttemptStatus=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        AbstractC46078tH abstractC46078tH = this.AEQbTJ;
        int iHashCode2 = abstractC46078tH != null ? abstractC46078tH.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        AbstractC46078tH abstractC46078tH2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (abstractC46078tH2 != null ? abstractC46078tH2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C49041uh.class != obj.getClass()) {
            return false;
        }
        C49041uh c49041uh = (C49041uh) obj;
        return Intrinsics.EZpvd(this.EZpvd, c49041uh.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c49041uh.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c49041uh.KWHzl) && Intrinsics.EZpvd(this.copydefault, c49041uh.copydefault);
    }

    public static /* synthetic */ C49041uh copy$default(C49041uh c49041uh, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.UpdateParallelDataResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C49041uh.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C49041uh.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c49041uh);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: renamed from: o.uh$Application */
    public static final class Application {
        public C5173Hn AEQbTJ;
        public AbstractC46078tH EZpvd;
        public AbstractC46078tH KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46078tH AhwBna() {
            return this.KWHzl;
        }

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC46078tH abstractC46078tH) {
            this.EZpvd = abstractC46078tH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46078tH OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC46078tH abstractC46078tH) {
            this.KWHzl = abstractC46078tH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C49041uh c49041uh) {
            this();
            Intrinsics.checkNotNullParameter(c49041uh, "");
            this.AEQbTJ = c49041uh.OLrzqt();
            this.EZpvd = c49041uh.EZpvd();
            this.OLrzqt = c49041uh.AEQbTJ();
            this.KWHzl = c49041uh.copydefault();
        }

        public final C49041uh EZpvd() {
            return new C49041uh(this, null);
        }
    }
}
