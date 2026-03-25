package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbsoluteLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AbsoluteLayout {
    public static final Activity OLrzqt = new Activity(null);
    public final AbstractC6105aJ AEQbTJ;
    public final C25615j EZpvd;
    public final java.lang.Float KWHzl;
    public final C25615j copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AbsoluteLayout$Application) A[MD:(o.AbsoluteLayout$Application):void (m)] call: o.AbsoluteLayout.<init>(o.AbsoluteLayout$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbsoluteLayout(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC6105aJ KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25615j copydefault() {
        return this.EZpvd;
    }

    public AbsoluteLayout(Application application) {
        this.AEQbTJ = application.KWHzl();
        this.KWHzl = application.AEQbTJ();
        this.EZpvd = application.EZpvd();
        this.copydefault = application.OLrzqt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AbsoluteLayout.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompareFacesRequest(");
        sb.append("qualityFilter=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("similarityThreshold=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("sourceImage=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("targetImage=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC6105aJ abstractC6105aJ = this.AEQbTJ;
        int iHashCode = abstractC6105aJ != null ? abstractC6105aJ.hashCode() : 0;
        java.lang.Float f = this.KWHzl;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        C25615j c25615j = this.EZpvd;
        int iHashCode3 = c25615j != null ? c25615j.hashCode() : 0;
        C25615j c25615j2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c25615j2 != null ? c25615j2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AbsoluteLayout.class != obj.getClass()) {
            return false;
        }
        AbsoluteLayout absoluteLayout = (AbsoluteLayout) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, absoluteLayout.AEQbTJ) && Intrinsics.copydefault(this.KWHzl, absoluteLayout.KWHzl) && Intrinsics.EZpvd(this.EZpvd, absoluteLayout.EZpvd) && Intrinsics.EZpvd(this.copydefault, absoluteLayout.copydefault);
    }

    public static /* synthetic */ AbsoluteLayout copy$default(AbsoluteLayout absoluteLayout, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CompareFacesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AbsoluteLayout.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AbsoluteLayout.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(absoluteLayout);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public C25615j AEQbTJ;
        public java.lang.Float EZpvd;
        public C25615j KWHzl;
        public AbstractC6105aJ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC6105aJ KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C25615j OLrzqt() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AbsoluteLayout absoluteLayout) {
            this();
            Intrinsics.checkNotNullParameter(absoluteLayout, "");
            this.copydefault = absoluteLayout.KWHzl();
            this.EZpvd = absoluteLayout.OLrzqt();
            this.AEQbTJ = absoluteLayout.copydefault();
            this.KWHzl = absoluteLayout.AEQbTJ();
        }

        public final AbsoluteLayout copydefault() {
            return new AbsoluteLayout(this, null);
        }
    }
}
