package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RtlSpacingHelper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RtlSpacingHelper {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final java.lang.Float AEQbTJ;
    public final java.lang.Float EZpvd;
    public final java.lang.Float OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RtlSpacingHelper$Application) A[MD:(o.RtlSpacingHelper$Application):void (m)] call: o.RtlSpacingHelper.<init>(o.RtlSpacingHelper$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RtlSpacingHelper(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.OLrzqt;
    }

    public RtlSpacingHelper(Application application) {
        this.EZpvd = application.AEQbTJ();
        this.AEQbTJ = application.copydefault();
        this.OLrzqt = application.EZpvd();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RtlSpacingHelper.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectionFilter(");
        sb.append("minBoundingBoxHeight=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("minBoundingBoxWidth=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("minConfidence=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.EZpvd;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.lang.Float f2 = this.AEQbTJ;
        int iHashCode2 = f2 != null ? f2.hashCode() : 0;
        java.lang.Float f3 = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RtlSpacingHelper.class != obj.getClass()) {
            return false;
        }
        RtlSpacingHelper rtlSpacingHelper = (RtlSpacingHelper) obj;
        return Intrinsics.copydefault(this.EZpvd, rtlSpacingHelper.EZpvd) && Intrinsics.copydefault(this.AEQbTJ, rtlSpacingHelper.AEQbTJ) && Intrinsics.copydefault(this.OLrzqt, rtlSpacingHelper.OLrzqt);
    }

    public static /* synthetic */ RtlSpacingHelper copy$default(RtlSpacingHelper rtlSpacingHelper, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DetectionFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RtlSpacingHelper.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RtlSpacingHelper.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(rtlSpacingHelper);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.Float KWHzl;
        public java.lang.Float OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull RtlSpacingHelper rtlSpacingHelper) {
            this();
            Intrinsics.checkNotNullParameter(rtlSpacingHelper, "");
            this.OLrzqt = rtlSpacingHelper.EZpvd();
            this.copydefault = rtlSpacingHelper.KWHzl();
            this.KWHzl = rtlSpacingHelper.copydefault();
        }

        public final RtlSpacingHelper KWHzl() {
            return new RtlSpacingHelper(this, null);
        }
    }
}
