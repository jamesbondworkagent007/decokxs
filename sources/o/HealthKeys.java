package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.HealthKeys;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class HealthKeys {
    public static final Application AEQbTJ = new Application(null);
    public final StatFs EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.HealthKeys$Activity) A[MD:(o.HealthKeys$Activity):void (m)] call: o.HealthKeys.<init>(o.HealthKeys$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HealthKeys(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatFs EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    public HealthKeys(Activity activity) {
        this.EZpvd = activity.KWHzl();
        this.KWHzl = activity.copydefault();
        this.OLrzqt = activity.EZpvd();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.HealthKeys.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final HealthKeys copydefault(@NotNull Function1<? super Activity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Activity activity = new Activity();
            function1.invoke(activity);
            return activity.OLrzqt();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListKeyPhrasesDetectionJobsRequest(");
        sb.append("filter=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
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
        StatFs statFs = this.EZpvd;
        int iHashCode = statFs != null ? statFs.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HealthKeys.class != obj.getClass()) {
            return false;
        }
        HealthKeys healthKeys = (HealthKeys) obj;
        return Intrinsics.EZpvd(this.EZpvd, healthKeys.EZpvd) && Intrinsics.EZpvd(this.KWHzl, healthKeys.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) healthKeys.OLrzqt);
    }

    public static /* synthetic */ HealthKeys copy$default(HealthKeys healthKeys, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListKeyPhrasesDetectionJobsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull HealthKeys.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HealthKeys.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(healthKeys);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public StatFs KWHzl;
        public java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatFs KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull HealthKeys healthKeys) {
            this();
            Intrinsics.checkNotNullParameter(healthKeys, "");
            this.KWHzl = healthKeys.EZpvd();
            this.copydefault = healthKeys.OLrzqt();
            this.AEQbTJ = healthKeys.AEQbTJ();
        }

        public final HealthKeys OLrzqt() {
            return new HealthKeys(this, null);
        }
    }
}
