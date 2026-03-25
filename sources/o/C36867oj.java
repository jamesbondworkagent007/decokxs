package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36867oj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36867oj {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final C37609ox AEQbTJ;
    public final java.util.List<C33900nK> EZpvd;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oj$Application) A[MD:(o.oj$Application):void (m)] call: o.oj.<init>(o.oj$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36867oj(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C33900nK> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37609ox EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.copydefault;
    }

    public C36867oj(Application application) {
        this.EZpvd = application.EZpvd();
        this.copydefault = application.KWHzl();
        this.AEQbTJ = application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LendingResult(");
        sb.append("extractions=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("page=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("pageClassification=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C33900nK> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        C37609ox c37609ox = this.AEQbTJ;
        return (((iHashCode * 31) + iIntValue) * 31) + (c37609ox != null ? c37609ox.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36867oj.class != obj.getClass()) {
            return false;
        }
        C36867oj c36867oj = (C36867oj) obj;
        return Intrinsics.EZpvd(this.EZpvd, c36867oj.EZpvd) && Intrinsics.EZpvd(this.copydefault, c36867oj.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c36867oj.AEQbTJ);
    }

    public static /* synthetic */ C36867oj copy$default(C36867oj c36867oj, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.LendingResult$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36867oj.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36867oj.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c36867oj);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.oj$Application */
    public static final class Application {
        public C37609ox AEQbTJ;
        public java.util.List<C33900nK> EZpvd;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C37609ox c37609ox) {
            this.AEQbTJ = c37609ox;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C33900nK> EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C33900nK> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37609ox OLrzqt() {
            return this.AEQbTJ;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36867oj c36867oj) {
            this();
            Intrinsics.checkNotNullParameter(c36867oj, "");
            this.EZpvd = c36867oj.AEQbTJ();
            this.OLrzqt = c36867oj.OLrzqt();
            this.AEQbTJ = c36867oj.EZpvd();
        }

        public final C36867oj AEQbTJ() {
            return new C36867oj(this, null);
        }
    }
}
