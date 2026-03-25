package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47647tu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C47647tu {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final AbstractC46856tf EZpvd;
    public final java.lang.Integer OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tu$Application) A[MD:(o.tu$Application):void (m)] call: o.tu.<init>(o.tu$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47647tu(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46856tf KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.OLrzqt;
    }

    public C47647tu(Application application) {
        this.EZpvd = application.KWHzl();
        this.OLrzqt = application.EZpvd();
        this.AEQbTJ = application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.tu$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C47647tu KWHzl(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.AEQbTJ();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListLanguagesRequest(");
        sb.append("displayLanguageCode=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC46856tf abstractC46856tf = this.EZpvd;
        int iHashCode = abstractC46856tf != null ? abstractC46856tf.hashCode() : 0;
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.AEQbTJ;
        return (((iHashCode * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47647tu.class != obj.getClass()) {
            return false;
        }
        C47647tu c47647tu = (C47647tu) obj;
        return Intrinsics.EZpvd(this.EZpvd, c47647tu.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c47647tu.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c47647tu.AEQbTJ);
    }

    public static /* synthetic */ C47647tu copy$default(C47647tu c47647tu, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ListLanguagesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47647tu.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47647tu.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c47647tu);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.tu$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.Integer EZpvd;
        public java.lang.String KWHzl;
        public AbstractC46856tf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46856tf KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C47647tu c47647tu) {
            this();
            Intrinsics.checkNotNullParameter(c47647tu, "");
            this.copydefault = c47647tu.KWHzl();
            this.EZpvd = c47647tu.copydefault();
            this.KWHzl = c47647tu.OLrzqt();
        }

        public final C47647tu AEQbTJ() {
            return new C47647tu(this, null);
        }
    }
}
