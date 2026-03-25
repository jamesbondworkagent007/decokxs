package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AnticipateInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AnticipateInterpolator {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String EZpvd;
    public final java.util.List<BaseInterpolator> KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AnticipateInterpolator$Application) A[MD:(o.AnticipateInterpolator$Application):void (m)] call: o.AnticipateInterpolator.<init>(o.AnticipateInterpolator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AnticipateInterpolator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BaseInterpolator> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public AnticipateInterpolator(Application application) {
        this.KWHzl = application.EZpvd();
        this.EZpvd = application.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AnticipateInterpolator.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListLexiconsResponse(");
        sb.append("lexicons=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<BaseInterpolator> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnticipateInterpolator.class != obj.getClass()) {
            return false;
        }
        AnticipateInterpolator anticipateInterpolator = (AnticipateInterpolator) obj;
        return Intrinsics.EZpvd(this.KWHzl, anticipateInterpolator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) anticipateInterpolator.EZpvd);
    }

    public static /* synthetic */ AnticipateInterpolator copy$default(AnticipateInterpolator anticipateInterpolator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.polly.model.ListLexiconsResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnticipateInterpolator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnticipateInterpolator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(anticipateInterpolator);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        public java.util.List<BaseInterpolator> KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<BaseInterpolator> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<BaseInterpolator> EZpvd() {
            return this.KWHzl;
        }

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AnticipateInterpolator anticipateInterpolator) {
            this();
            Intrinsics.checkNotNullParameter(anticipateInterpolator, "");
            this.KWHzl = anticipateInterpolator.EZpvd();
            this.OLrzqt = anticipateInterpolator.copydefault();
        }

        public final AnticipateInterpolator AEQbTJ() {
            return new AnticipateInterpolator(this, null);
        }
    }
}
