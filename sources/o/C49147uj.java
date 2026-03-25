package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C49147uj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C49147uj {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final C45943tC OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.uj$Application) A[MD:(o.uj$Application):void (m)] call: o.uj.<init>(o.uj$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C49147uj(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45943tC AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C49147uj(Application application) {
        this.AEQbTJ = application.AEQbTJ();
        this.KWHzl = application.OLrzqt();
        this.copydefault = application.EZpvd();
        this.OLrzqt = application.copydefault();
    }

    /* JADX INFO: renamed from: o.uj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateParallelDataRequest(");
        sb.append("clientToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("parallelDataConfig=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        C45943tC c45943tC = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c45943tC != null ? c45943tC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C49147uj.class != obj.getClass()) {
            return false;
        }
        C49147uj c49147uj = (C49147uj) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c49147uj.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c49147uj.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c49147uj.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c49147uj.OLrzqt);
    }

    public static /* synthetic */ C49147uj copy$default(C49147uj c49147uj, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.UpdateParallelDataRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C49147uj.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C49147uj.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c49147uj);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.uj$Application */
    public static final class Application {
        public C45943tC AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45943tC copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C49147uj c49147uj) {
            this();
            Intrinsics.checkNotNullParameter(c49147uj, "");
            this.EZpvd = c49147uj.EZpvd();
            this.KWHzl = c49147uj.copydefault();
            this.copydefault = c49147uj.KWHzl();
            this.AEQbTJ = c49147uj.AEQbTJ();
        }

        public final C49147uj KWHzl() {
            return new C49147uj(this, null);
        }
    }
}
