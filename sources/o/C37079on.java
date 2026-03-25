package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C37079on;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.on, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C37079on {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final C5173Hn AEQbTJ;
    public final C5173Hn EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.Integer copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.on$Activity) A[MD:(o.on$Activity):void (m)] call: o.on.<init>(o.on$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C37079on(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.AEQbTJ;
    }

    public C37079on(Activity activity) {
        this.EZpvd = activity.copydefault();
        this.AEQbTJ = activity.OLrzqt();
        this.copydefault = activity.EZpvd();
        this.OLrzqt = activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.on$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.on.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37079on KWHzl(@NotNull Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activity = new Activity();
            function1.invoke(activity);
            return activity.KWHzl();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListAdaptersRequest(");
        sb.append("afterCreationTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("beforeCreationTime=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AEQbTJ;
        int iHashCode2 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37079on.class != obj.getClass()) {
            return false;
        }
        C37079on c37079on = (C37079on) obj;
        return Intrinsics.EZpvd(this.EZpvd, c37079on.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c37079on.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c37079on.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c37079on.OLrzqt);
    }

    public static /* synthetic */ C37079on copy$default(C37079on c37079on, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ListAdaptersRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C37079on.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C37079on.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c37079on);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.on$Activity */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public C5173Hn AEQbTJ;
        public java.lang.String EZpvd;
        public C5173Hn KWHzl;
        public java.lang.Integer OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.EZpvd = str;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C37079on c37079on) {
            this();
            Intrinsics.checkNotNullParameter(c37079on, "");
            this.AEQbTJ = c37079on.EZpvd();
            this.KWHzl = c37079on.copydefault();
            this.OLrzqt = c37079on.KWHzl();
            this.EZpvd = c37079on.AEQbTJ();
        }

        public final C37079on KWHzl() {
            return new C37079on(this, null);
        }
    }
}
