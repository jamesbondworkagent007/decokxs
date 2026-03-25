package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CpuUsageInfo;
import o.DropBoxManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CpuUsageInfo {
    public static final Application AEQbTJ = new Application(null);
    public final DropBoxManager EZpvd;
    public final java.util.List<java.lang.String> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CpuUsageInfo$Activity) A[MD:(o.CpuUsageInfo$Activity):void (m)] call: o.CpuUsageInfo.<init>(o.CpuUsageInfo$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CpuUsageInfo(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DropBoxManager KWHzl() {
        return this.EZpvd;
    }

    public CpuUsageInfo(Activity activity) {
        this.OLrzqt = activity.EZpvd();
        DropBoxManager dropBoxManagerOLrzqt = activity.OLrzqt();
        if (dropBoxManagerOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for mode".toString());
        }
        this.EZpvd = dropBoxManagerOLrzqt;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CpuUsageInfo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentClassificationConfig(");
        sb.append("labels=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("mode=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.OLrzqt;
        return ((list != null ? list.hashCode() : 0) * 31) + this.EZpvd.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CpuUsageInfo.class != obj.getClass()) {
            return false;
        }
        CpuUsageInfo cpuUsageInfo = (CpuUsageInfo) obj;
        return Intrinsics.EZpvd(this.OLrzqt, cpuUsageInfo.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, cpuUsageInfo.EZpvd);
    }

    public static /* synthetic */ CpuUsageInfo copy$default(CpuUsageInfo cpuUsageInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentClassificationConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CpuUsageInfo.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CpuUsageInfo.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(cpuUsageInfo);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public DropBoxManager EZpvd;
        public java.util.List<java.lang.String> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DropBoxManager OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(DropBoxManager dropBoxManager) {
            this.EZpvd = dropBoxManager;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull CpuUsageInfo cpuUsageInfo) {
            this();
            Intrinsics.checkNotNullParameter(cpuUsageInfo, "");
            this.OLrzqt = cpuUsageInfo.EZpvd();
            this.EZpvd = cpuUsageInfo.KWHzl();
        }

        public final CpuUsageInfo KWHzl() {
            return new CpuUsageInfo(this, null);
        }

        public final Activity copydefault() {
            if (this.EZpvd == null) {
                this.EZpvd = new DropBoxManager.Activity("no value provided");
            }
            return this;
        }
    }
}
