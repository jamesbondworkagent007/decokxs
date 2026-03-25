package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.LongStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class LongStream {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final MediaRouteActionProvider AEQbTJ;
    public final IntStream EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LongStream$Activity) A[MD:(o.LongStream$Activity):void (m)] call: o.LongStream.<init>(o.LongStream$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LongStream(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntStream KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaRouteActionProvider copydefault() {
        return this.AEQbTJ;
    }

    public LongStream(Activity activity) {
        this.EZpvd = activity.copydefault();
        this.AEQbTJ = activity.AEQbTJ();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LongStream.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccountTakeoverRiskConfigurationType(");
        sb.append("actions=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("notifyConfiguration=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        IntStream intStream = this.EZpvd;
        int iHashCode = intStream != null ? intStream.hashCode() : 0;
        MediaRouteActionProvider mediaRouteActionProvider = this.AEQbTJ;
        return (iHashCode * 31) + (mediaRouteActionProvider != null ? mediaRouteActionProvider.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LongStream.class != obj.getClass()) {
            return false;
        }
        LongStream longStream = (LongStream) obj;
        return Intrinsics.EZpvd(this.EZpvd, longStream.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, longStream.AEQbTJ);
    }

    public static /* synthetic */ LongStream copy$default(LongStream longStream, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AccountTakeoverRiskConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LongStream.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LongStream.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(longStream);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public IntStream KWHzl;
        public MediaRouteActionProvider OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MediaRouteActionProvider AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(MediaRouteActionProvider mediaRouteActionProvider) {
            this.OLrzqt = mediaRouteActionProvider;
        }

        public final Activity OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(IntStream intStream) {
            this.KWHzl = intStream;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IntStream copydefault() {
            return this.KWHzl;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull LongStream longStream) {
            this();
            Intrinsics.checkNotNullParameter(longStream, "");
            this.KWHzl = longStream.KWHzl();
            this.OLrzqt = longStream.copydefault();
        }

        public final LongStream EZpvd() {
            return new LongStream(this, null);
        }
    }
}
