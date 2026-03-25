package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C9940bf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9940bf {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.Float AEQbTJ;
    public final boolean OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bf$Application) A[MD:(o.bf$Application):void (m)] call: o.bf.<init>(o.bf$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9940bf(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.AEQbTJ;
    }

    public C9940bf(Application application) {
        this.AEQbTJ = application.copydefault();
        this.OLrzqt = application.EZpvd();
    }

    /* JADX INFO: renamed from: o.bf$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bf.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Smile(");
        sb.append("confidence=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("value=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.AEQbTJ;
        return ((f != null ? f.hashCode() : 0) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9940bf.class != obj.getClass()) {
            return false;
        }
        C9940bf c9940bf = (C9940bf) obj;
        return Intrinsics.copydefault(this.AEQbTJ, c9940bf.AEQbTJ) && this.OLrzqt == c9940bf.OLrzqt;
    }

    public static /* synthetic */ C9940bf copy$default(C9940bf c9940bf, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Smile$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9940bf.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9940bf.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c9940bf);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.bf$Application */
    public static final class Application {
        public boolean KWHzl;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C9940bf c9940bf) {
            this();
            Intrinsics.checkNotNullParameter(c9940bf, "");
            this.copydefault = c9940bf.EZpvd();
            this.KWHzl = c9940bf.AEQbTJ();
        }

        public final C9940bf OLrzqt() {
            return new C9940bf(this, null);
        }
    }
}
