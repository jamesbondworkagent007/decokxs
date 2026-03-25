package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34648ng;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34648ng {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final C37503ov AEQbTJ;
    public final java.lang.Float EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ng$Activity) A[MD:(o.ng$Activity):void (m)] call: o.ng.<init>(o.ng$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34648ng(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37503ov KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C34648ng(Activity activity) {
        this.EZpvd = activity.copydefault();
        this.AEQbTJ = activity.OLrzqt();
        java.lang.String strAEQbTJ = activity.AEQbTJ();
        if (strAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for text".toString());
        }
        this.OLrzqt = strAEQbTJ;
    }

    /* JADX INFO: renamed from: o.ng$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ng.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeIdDetections(");
        sb.append("confidence=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("normalizedValue=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("text=");
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
        C37503ov c37503ov = this.AEQbTJ;
        return (((iHashCode * 31) + (c37503ov != null ? c37503ov.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34648ng.class != obj.getClass()) {
            return false;
        }
        C34648ng c34648ng = (C34648ng) obj;
        return Intrinsics.copydefault(this.EZpvd, c34648ng.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c34648ng.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34648ng.OLrzqt);
    }

    public static /* synthetic */ C34648ng copy$default(C34648ng c34648ng, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeIdDetections$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34648ng.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34648ng.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c34648ng);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    /* JADX INFO: renamed from: o.ng$Activity */
    public static final class Activity {
        public java.lang.String KWHzl;
        public java.lang.Float OLrzqt;
        public C37503ov copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl() {
            if (this.KWHzl == null) {
                this.KWHzl = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37503ov OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C37503ov c37503ov) {
            this.copydefault = c37503ov;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C34648ng c34648ng) {
            this();
            Intrinsics.checkNotNullParameter(c34648ng, "");
            this.OLrzqt = c34648ng.EZpvd();
            this.copydefault = c34648ng.KWHzl();
            this.KWHzl = c34648ng.copydefault();
        }

        public final C34648ng EZpvd() {
            return new C34648ng(this, null);
        }
    }
}
