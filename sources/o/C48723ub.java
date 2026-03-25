package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C48723ub;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C48723ub {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final java.lang.String AYXKKw;
    public final C48882ue EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.List<java.lang.String> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ub$Application) A[MD:(o.ub$Application):void (m)] call: o.ub.<init>(o.ub$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C48723ub(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48882ue EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C48723ub(Application application) {
        this.EZpvd = application.EZpvd();
        this.KWHzl = application.OLrzqt();
        this.copydefault = application.copydefault();
        this.OLrzqt = application.AEQbTJ();
        this.AYXKKw = application.AhwBna();
    }

    /* JADX INFO: renamed from: o.ub$ActionBar */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ub.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TranslateTextRequest(");
        sb.append("settings=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCode=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("terminologyNames=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("text=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C48882ue c48882ue = this.EZpvd;
        int iHashCode = c48882ue != null ? c48882ue.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.util.List<java.lang.String> list = this.OLrzqt;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C48723ub.class != obj.getClass()) {
            return false;
        }
        C48723ub c48723ub = (C48723ub) obj;
        return Intrinsics.EZpvd(this.EZpvd, c48723ub.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48723ub.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c48723ub.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c48723ub.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c48723ub.AYXKKw);
    }

    public static /* synthetic */ C48723ub copy$default(C48723ub c48723ub, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TranslateTextRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C48723ub.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C48723ub.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c48723ub);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.ub$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public C48882ue EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48882ue EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C48723ub c48723ub) {
            this();
            Intrinsics.checkNotNullParameter(c48723ub, "");
            this.EZpvd = c48723ub.EZpvd();
            this.AEQbTJ = c48723ub.copydefault();
            this.OLrzqt = c48723ub.OLrzqt();
            this.copydefault = c48723ub.KWHzl();
            this.KWHzl = c48723ub.AEQbTJ();
        }

        public final C48723ub KWHzl() {
            return new C48723ub(this, null);
        }
    }
}
