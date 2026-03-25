package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NetworkQuotaInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkQuotaInfo {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.Integer KWHzl;
    public final java.util.List<IncidentReportArgs> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkQuotaInfo$Application) A[MD:(o.NetworkQuotaInfo$Application):void (m)] call: o.NetworkQuotaInfo.<init>(o.NetworkQuotaInfo$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkQuotaInfo(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<IncidentReportArgs> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    public NetworkQuotaInfo(Application application) {
        this.copydefault = application.AEQbTJ();
        this.KWHzl = application.EZpvd();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkQuotaInfo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BatchDetectEntitiesItemResult(");
        sb.append("entities=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("index=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<IncidentReportArgs> list = this.copydefault;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        return (iHashCode * 31) + (num != null ? num.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkQuotaInfo.class != obj.getClass()) {
            return false;
        }
        NetworkQuotaInfo networkQuotaInfo = (NetworkQuotaInfo) obj;
        return Intrinsics.EZpvd(this.copydefault, networkQuotaInfo.copydefault) && Intrinsics.EZpvd(this.KWHzl, networkQuotaInfo.KWHzl);
    }

    public static /* synthetic */ NetworkQuotaInfo copy$default(NetworkQuotaInfo networkQuotaInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.BatchDetectEntitiesItemResult$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkQuotaInfo.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkQuotaInfo.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(networkQuotaInfo);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.Integer AEQbTJ;
        public java.util.List<IncidentReportArgs> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<IncidentReportArgs> AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<IncidentReportArgs> list) {
            this.copydefault = list;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull NetworkQuotaInfo networkQuotaInfo) {
            this();
            Intrinsics.checkNotNullParameter(networkQuotaInfo, "");
            this.copydefault = networkQuotaInfo.KWHzl();
            this.AEQbTJ = networkQuotaInfo.OLrzqt();
        }

        public final NetworkQuotaInfo KWHzl() {
            return new NetworkQuotaInfo(this, null);
        }
    }
}
