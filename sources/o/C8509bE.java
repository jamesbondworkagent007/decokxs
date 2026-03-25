package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C8509bE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C8509bE {
    public static final Application EZpvd = new Application(null);
    public final java.util.List<C6158aK> KWHzl;
    public final RtlSpacingHelper OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bE$Activity) A[MD:(o.bE$Activity):void (m)] call: o.bE.<init>(o.bE$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C8509bE(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RtlSpacingHelper AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C6158aK> OLrzqt() {
        return this.KWHzl;
    }

    public C8509bE(Activity activity) {
        this.KWHzl = activity.AEQbTJ();
        this.OLrzqt = activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.bE$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTextDetectionFilters(");
        sb.append("regionsOfInterest=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("wordFilter=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C6158aK> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        RtlSpacingHelper rtlSpacingHelper = this.OLrzqt;
        return (iHashCode * 31) + (rtlSpacingHelper != null ? rtlSpacingHelper.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8509bE.class != obj.getClass()) {
            return false;
        }
        C8509bE c8509bE = (C8509bE) obj;
        return Intrinsics.EZpvd(this.KWHzl, c8509bE.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c8509bE.OLrzqt);
    }

    public static /* synthetic */ C8509bE copy$default(C8509bE c8509bE, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartTextDetectionFilters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C8509bE.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C8509bE.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c8509bE);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: renamed from: o.bE$Activity */
    public static final class Activity {
        public RtlSpacingHelper AEQbTJ;
        public java.util.List<C6158aK> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C6158aK> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RtlSpacingHelper KWHzl() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C8509bE c8509bE) {
            this();
            Intrinsics.checkNotNullParameter(c8509bE, "");
            this.OLrzqt = c8509bE.OLrzqt();
            this.AEQbTJ = c8509bE.AEQbTJ();
        }

        public final C8509bE copydefault() {
            return new C8509bE(this, null);
        }
    }
}
