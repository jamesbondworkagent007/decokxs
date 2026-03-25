package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ConnectStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ConnectStats {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final ShellCommand KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ConnectStats$Activity) A[MD:(o.ConnectStats$Activity):void (m)] call: o.ConnectStats.<init>(o.ConnectStats$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ConnectStats(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShellCommand copydefault() {
        return this.KWHzl;
    }

    public ConnectStats(Activity activity) {
        this.KWHzl = activity.AEQbTJ();
        java.lang.String strKWHzl = activity.KWHzl();
        if (strKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for s3Uri".toString());
        }
        this.AEQbTJ = strKWHzl;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ConnectStats.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetEntityRecognizerDocuments(");
        sb.append("inputFormat=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("s3Uri=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ShellCommand shellCommand = this.KWHzl;
        return ((shellCommand != null ? shellCommand.hashCode() : 0) * 31) + this.AEQbTJ.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConnectStats.class != obj.getClass()) {
            return false;
        }
        ConnectStats connectStats = (ConnectStats) obj;
        return Intrinsics.EZpvd(this.KWHzl, connectStats.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) connectStats.AEQbTJ);
    }

    public static /* synthetic */ ConnectStats copy$default(ConnectStats connectStats, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DatasetEntityRecognizerDocuments$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ConnectStats.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ConnectStats.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(connectStats);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public ShellCommand AEQbTJ;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ShellCommand AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ConnectStats connectStats) {
            this();
            Intrinsics.checkNotNullParameter(connectStats, "");
            this.AEQbTJ = connectStats.copydefault();
            this.OLrzqt = connectStats.OLrzqt();
        }

        public final ConnectStats OLrzqt() {
            return new ConnectStats(this, null);
        }
    }
}
