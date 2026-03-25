package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RemoteCallbackList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RemoteCallbackList {
    public static final Application EZpvd = new Application(null);
    public final java.lang.Double AEQbTJ;
    public final java.lang.Double KWHzl;
    public final java.lang.Double OLrzqt;
    public final java.lang.Double copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RemoteCallbackList$Activity) A[MD:(o.RemoteCallbackList$Activity):void (m)] call: o.RemoteCallbackList.<init>(o.RemoteCallbackList$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RemoteCallbackList(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double OLrzqt() {
        return this.copydefault;
    }

    public RemoteCallbackList(Activity activity) {
        this.AEQbTJ = activity.EZpvd();
        this.copydefault = activity.KWHzl();
        this.OLrzqt = activity.AEQbTJ();
        this.KWHzl = activity.AhwBna();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RemoteCallbackList.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FlywheelModelEvaluationMetrics(");
        sb.append("averageAccuracy=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("averageF1Score=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("averagePrecision=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("averageRecall=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Double d = this.AEQbTJ;
        int iHashCode = d != null ? d.hashCode() : 0;
        java.lang.Double d2 = this.copydefault;
        int iHashCode2 = d2 != null ? d2.hashCode() : 0;
        java.lang.Double d3 = this.OLrzqt;
        int iHashCode3 = d3 != null ? d3.hashCode() : 0;
        java.lang.Double d4 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d4 != null ? d4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RemoteCallbackList.class != obj.getClass()) {
            return false;
        }
        RemoteCallbackList remoteCallbackList = (RemoteCallbackList) obj;
        return Intrinsics.OLrzqt(this.AEQbTJ, remoteCallbackList.AEQbTJ) && Intrinsics.OLrzqt(this.copydefault, remoteCallbackList.copydefault) && Intrinsics.OLrzqt(this.OLrzqt, remoteCallbackList.OLrzqt) && Intrinsics.OLrzqt(this.KWHzl, remoteCallbackList.KWHzl);
    }

    public static /* synthetic */ RemoteCallbackList copy$default(RemoteCallbackList remoteCallbackList, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.FlywheelModelEvaluationMetrics$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RemoteCallbackList.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RemoteCallbackList.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(remoteCallbackList);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.Double AEQbTJ;
        public java.lang.Double EZpvd;
        public java.lang.Double OLrzqt;
        public java.lang.Double copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Double d) {
            this.OLrzqt = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Double d) {
            this.EZpvd = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Double KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Double d) {
            this.copydefault = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Double d) {
            this.AEQbTJ = d;
        }

        public final Activity copydefault() {
            return this;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull RemoteCallbackList remoteCallbackList) {
            this();
            Intrinsics.checkNotNullParameter(remoteCallbackList, "");
            this.OLrzqt = remoteCallbackList.KWHzl();
            this.EZpvd = remoteCallbackList.OLrzqt();
            this.copydefault = remoteCallbackList.EZpvd();
            this.AEQbTJ = remoteCallbackList.AEQbTJ();
        }

        public final RemoteCallbackList OLrzqt() {
            return new RemoteCallbackList(this, null);
        }
    }
}
