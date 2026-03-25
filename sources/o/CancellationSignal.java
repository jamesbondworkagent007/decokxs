package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CancellationSignal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CancellationSignal {
    public static final Application copydefault = new Application(null);
    public final java.lang.String AEQbTJ;
    public final SynchronousResultReceiver OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CancellationSignal$Activity) A[MD:(o.CancellationSignal$Activity):void (m)] call: o.CancellationSignal.<init>(o.CancellationSignal$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CancellationSignal(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    public CancellationSignal(Activity activity) {
        this.OLrzqt = activity.KWHzl();
        this.AEQbTJ = activity.OLrzqt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CancellationSignal.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectTargetedSentimentRequest(");
        sb.append("languageCode=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SynchronousResultReceiver synchronousResultReceiver = this.OLrzqt;
        int iHashCode = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CancellationSignal.class != obj.getClass()) {
            return false;
        }
        CancellationSignal cancellationSignal = (CancellationSignal) obj;
        return Intrinsics.EZpvd(this.OLrzqt, cancellationSignal.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) cancellationSignal.AEQbTJ);
    }

    public static /* synthetic */ CancellationSignal copy$default(CancellationSignal cancellationSignal, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DetectTargetedSentimentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CancellationSignal.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CancellationSignal.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(cancellationSignal);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public SynchronousResultReceiver AEQbTJ;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull CancellationSignal cancellationSignal) {
            this();
            Intrinsics.checkNotNullParameter(cancellationSignal, "");
            this.AEQbTJ = cancellationSignal.AEQbTJ();
            this.OLrzqt = cancellationSignal.KWHzl();
        }

        public final CancellationSignal EZpvd() {
            return new CancellationSignal(this, null);
        }
    }
}
