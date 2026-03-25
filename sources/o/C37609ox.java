package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C37609ox;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C37609ox {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.util.List<C37662oy> EZpvd;
    public final java.util.List<C37662oy> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ox$Application) A[MD:(o.ox$Application):void (m)] call: o.ox.<init>(o.ox$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C37609ox(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C37662oy> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C37662oy> EZpvd() {
        return this.OLrzqt;
    }

    public C37609ox(Application application) {
        java.util.List<C37662oy> listOLrzqt = application.OLrzqt();
        if (listOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for pageNumber".toString());
        }
        this.EZpvd = listOLrzqt;
        java.util.List<C37662oy> listAEQbTJ = application.AEQbTJ();
        if (listAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for pageType".toString());
        }
        this.OLrzqt = listAEQbTJ;
    }

    /* JADX INFO: renamed from: o.ox$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ox.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PageClassification(");
        sb.append("pageNumber=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("pageType=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37609ox.class != obj.getClass()) {
            return false;
        }
        C37609ox c37609ox = (C37609ox) obj;
        return Intrinsics.EZpvd(this.EZpvd, c37609ox.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c37609ox.OLrzqt);
    }

    public static /* synthetic */ C37609ox copy$default(C37609ox c37609ox, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.PageClassification$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37609ox.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37609ox.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c37609ox);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.ox$Application */
    public static final class Application {
        public java.util.List<C37662oy> KWHzl;
        public java.util.List<C37662oy> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C37662oy> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C37662oy> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C37662oy> OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C37662oy> list) {
            this.copydefault = list;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C37609ox c37609ox) {
            this();
            Intrinsics.checkNotNullParameter(c37609ox, "");
            this.KWHzl = c37609ox.AEQbTJ();
            this.copydefault = c37609ox.EZpvd();
        }

        public final C37609ox KWHzl() {
            return new C37609ox(this, null);
        }

        public final Application EZpvd() {
            if (this.KWHzl == null) {
                this.KWHzl = yDY.AhwBna();
            }
            if (this.copydefault == null) {
                this.copydefault = yDY.AhwBna();
            }
            return this;
        }
    }
}
