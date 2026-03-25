package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C35000nn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C35000nn {
    public static final ActionBar copydefault = new ActionBar(null);
    public final float AEQbTJ;
    public final float EZpvd;
    public final float KWHzl;
    public final float OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nn$Application) A[MD:(o.nn$Application):void (m)] call: o.nn.<init>(o.nn$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C35000nn(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float copydefault() {
        return this.EZpvd;
    }

    public C35000nn(Application application) {
        this.KWHzl = application.AEQbTJ();
        this.OLrzqt = application.copydefault();
        this.EZpvd = application.EZpvd();
        this.AEQbTJ = application.valueOf();
    }

    /* JADX INFO: renamed from: o.nn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BoundingBox(");
        sb.append("height=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("left=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("top=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("width=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = java.lang.Float.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Float.hashCode(this.OLrzqt);
        return (((((iHashCode * 31) + iHashCode2) * 31) + java.lang.Float.hashCode(this.EZpvd)) * 31) + java.lang.Float.hashCode(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C35000nn.class != obj.getClass()) {
            return false;
        }
        C35000nn c35000nn = (C35000nn) obj;
        return this.KWHzl == c35000nn.KWHzl && this.OLrzqt == c35000nn.OLrzqt && this.EZpvd == c35000nn.EZpvd && this.AEQbTJ == c35000nn.AEQbTJ;
    }

    public static /* synthetic */ C35000nn copy$default(C35000nn c35000nn, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.BoundingBox$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C35000nn.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C35000nn.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c35000nn);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.nn$Application */
    public static final class Application {
        public float EZpvd;
        public float KWHzl;
        public float OLrzqt;
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(float f) {
            this.copydefault = f;
        }

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float valueOf() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C35000nn c35000nn) {
            this();
            Intrinsics.checkNotNullParameter(c35000nn, "");
            this.KWHzl = c35000nn.EZpvd();
            this.EZpvd = c35000nn.AEQbTJ();
            this.copydefault = c35000nn.copydefault();
            this.OLrzqt = c35000nn.OLrzqt();
        }

        public final C35000nn OLrzqt() {
            return new C35000nn(this, null);
        }
    }
}
