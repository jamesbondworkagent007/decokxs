package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56292y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C56292y {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.Long AEQbTJ;
    public final java.lang.Long EZpvd;
    public final java.lang.Long OLrzqt;
    public final C45887t copydefault;
    public final long djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.y$Activity) A[MD:(o.y$Activity):void (m)] call: o.y.<init>(o.y$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C56292y(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45887t AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.djBIcL;
    }

    public C56292y(Activity activity) {
        this.EZpvd = activity.OLrzqt();
        this.OLrzqt = activity.EZpvd();
        this.copydefault = activity.KWHzl();
        this.AEQbTJ = activity.djBIcL();
        this.djBIcL = activity.valueOf();
    }

    /* JADX INFO: renamed from: o.y$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.y.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LabelDetection(");
        sb.append("durationMillis=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endTimestampMillis=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("label=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("startTimestampMillis=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("timestamp=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Long l = this.EZpvd;
        int iHashCode = l != null ? l.hashCode() : 0;
        java.lang.Long l2 = this.OLrzqt;
        int iHashCode2 = l2 != null ? l2.hashCode() : 0;
        C45887t c45887t = this.copydefault;
        int iHashCode3 = c45887t != null ? c45887t.hashCode() : 0;
        java.lang.Long l3 = this.AEQbTJ;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.djBIcL);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C56292y.class != obj.getClass()) {
            return false;
        }
        C56292y c56292y = (C56292y) obj;
        return Intrinsics.EZpvd(this.EZpvd, c56292y.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c56292y.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c56292y.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c56292y.AEQbTJ) && this.djBIcL == c56292y.djBIcL;
    }

    public static /* synthetic */ C56292y copy$default(C56292y c56292y, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.LabelDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C56292y.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C56292y.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c56292y);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: renamed from: o.y$Activity */
    public static final class Activity {
        public java.lang.Long AEQbTJ;
        public java.lang.Long EZpvd;
        public java.lang.Long KWHzl;
        public long OLrzqt;
        public C45887t copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(long j) {
            this.OLrzqt = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Long l) {
            this.AEQbTJ = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45887t KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Long l) {
            this.EZpvd = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Long l) {
            this.KWHzl = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C45887t c45887t) {
            this.copydefault = c45887t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long djBIcL() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long valueOf() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C56292y c56292y) {
            this();
            Intrinsics.checkNotNullParameter(c56292y, "");
            this.EZpvd = c56292y.EZpvd();
            this.AEQbTJ = c56292y.KWHzl();
            this.copydefault = c56292y.AEQbTJ();
            this.KWHzl = c56292y.OLrzqt();
            this.OLrzqt = c56292y.copydefault();
        }

        public final C56292y copydefault() {
            return new C56292y(this, null);
        }
    }
}
