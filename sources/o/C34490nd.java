package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34490nd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34490nd {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final C33657nB AEQbTJ;
    public final java.util.List<C33711nD> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nd$Application) A[MD:(o.nd$Application):void (m)] call: o.nd.<init>(o.nd$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34490nd(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C33711nD> copydefault() {
        return this.copydefault;
    }

    public C34490nd(Application application) {
        this.AEQbTJ = application.KWHzl();
        this.copydefault = application.copydefault();
    }

    /* JADX INFO: renamed from: o.nd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeExpenseResponse(");
        sb.append("documentMetadata=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("expenseDocuments=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C33657nB c33657nB = this.AEQbTJ;
        int iHashCode = c33657nB != null ? c33657nB.hashCode() : 0;
        java.util.List<C33711nD> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34490nd.class != obj.getClass()) {
            return false;
        }
        C34490nd c34490nd = (C34490nd) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c34490nd.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c34490nd.copydefault);
    }

    public static /* synthetic */ C34490nd copy$default(C34490nd c34490nd, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeExpenseResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34490nd.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34490nd.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c34490nd);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.nd$Application */
    public static final class Application {
        public C33657nB EZpvd;
        public java.util.List<C33711nD> OLrzqt;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<C33711nD> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C33711nD> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33657nB c33657nB) {
            this.EZpvd = c33657nB;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C34490nd c34490nd) {
            this();
            Intrinsics.checkNotNullParameter(c34490nd, "");
            this.EZpvd = c34490nd.EZpvd();
            this.OLrzqt = c34490nd.copydefault();
        }

        public final C34490nd OLrzqt() {
            return new C34490nd(this, null);
        }
    }
}
