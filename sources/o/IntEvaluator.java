package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IntEvaluator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class IntEvaluator {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String KWHzl;
    public final java.util.List<BackStackRecord> OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IntEvaluator$Activity) A[MD:(o.IntEvaluator$Activity):void (m)] call: o.IntEvaluator.<init>(o.IntEvaluator$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IntEvaluator(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BackStackRecord> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public IntEvaluator(Activity activity) {
        this.KWHzl = activity.EZpvd();
        java.util.List<BackStackRecord> listKWHzl = activity.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for httpHeaders".toString());
        }
        this.OLrzqt = listKWHzl;
        java.lang.String strOLrzqt = activity.OLrzqt();
        if (strOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for ipAddress".toString());
        }
        this.AEQbTJ = strOLrzqt;
        java.lang.String strCopydefault = activity.copydefault();
        if (strCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for serverName".toString());
        }
        this.copydefault = strCopydefault;
        java.lang.String strAYXKKw = activity.AYXKKw();
        if (strAYXKKw == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for serverPath".toString());
        }
        this.AYXKKw = strAYXKKw;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IntEvaluator.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ContextDataType(");
        sb.append("encodedData=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("httpHeaders=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("ipAddress=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("serverName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("serverPath=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = this.OLrzqt.hashCode();
        return (((((((iHashCode * 31) + iHashCode2) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AYXKKw.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IntEvaluator.class != obj.getClass()) {
            return false;
        }
        IntEvaluator intEvaluator = (IntEvaluator) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) intEvaluator.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, intEvaluator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) intEvaluator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) intEvaluator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) intEvaluator.AYXKKw);
    }

    public static /* synthetic */ IntEvaluator copy$default(IntEvaluator intEvaluator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ContextDataType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntEvaluator.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntEvaluator.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(intEvaluator);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.List<BackStackRecord> EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<BackStackRecord> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull IntEvaluator intEvaluator) {
            this();
            Intrinsics.checkNotNullParameter(intEvaluator, "");
            this.AEQbTJ = intEvaluator.copydefault();
            this.EZpvd = intEvaluator.EZpvd();
            this.OLrzqt = intEvaluator.KWHzl();
            this.copydefault = intEvaluator.OLrzqt();
            this.KWHzl = intEvaluator.AEQbTJ();
        }

        public final IntEvaluator AEQbTJ() {
            return new IntEvaluator(this, null);
        }
    }
}
