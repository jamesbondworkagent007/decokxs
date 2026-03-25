package com.okinc.okapm.okqpl.reporter;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.okinc.base.thread.TPM;
import com.okinc.okapm.okqpl.QPLEvent;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import com.okinc.okapm.okqpl.reporter.OkQPLReporter;
import com.okinc.okapm.okqpl.util.QPLConstants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C32864mld;
import o.C35202nqq;
import o.C42530rWg;
import o.C42533rWj;
import o.C42540rWq;
import o.C42543rWt;
import o.C42548rWy;
import o.C43346rnZ;
import o.C56392yDr;
import o.InterfaceC35203nqr;
import o.InterfaceC35209nqx;
import o.InterfaceC42541rWr;
import o.InterfaceC42542rWs;
import o.InterfaceC56387yDm;
import o.xVW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class OkQPLReporter implements InterfaceC42542rWs {
    public final QPLReportMetricApi AYXKKw;
    public final long KWHzl;
    public final InterfaceC35203nqr OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final Gson djBIcL;
    public final InterfaceC42541rWr gEmmrt;
    public boolean valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final InterfaceC56387yDm<OkQPLReporter> AEQbTJ = C56392yDr.EZpvd(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: o.rWn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return OkQPLReporter.OLrzqt();
        }
    });

    public OkQPLReporter(@NotNull QPLReportMetricApi qPLReportMetricApi, @NotNull InterfaceC42541rWr interfaceC42541rWr, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC35203nqr interfaceC35203nqr, long j) {
        Intrinsics.checkNotNullParameter(qPLReportMetricApi, "");
        Intrinsics.checkNotNullParameter(interfaceC42541rWr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC35203nqr, "");
        this.AYXKKw = qPLReportMetricApi;
        this.gEmmrt = interfaceC42541rWr;
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC35203nqr;
        this.KWHzl = j;
        this.djBIcL = new Gson();
        this.valueOf = interfaceC35203nqr.AEQbTJ(QPLConstants.CONFIG_KEY);
        interfaceC35203nqr.AEQbTJ(QPLConstants.CONFIG_KEY, new InterfaceC35209nqx() { // from class: com.okinc.okapm.okqpl.reporter.OkQPLReporter.3
            @Override // o.InterfaceC35209nqx
            public void AEQbTJ(boolean z) {
                OkQPLReporter.this.valueOf = z;
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 com.okinc.okapm.okqpl.reporter.QPLReportMetricApi)
  (r9v0 o.rWr)
  (r10v0 kotlinx.coroutines.CoroutineDispatcher)
  (r11v0 o.nqr)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (30000 long) : (r12v0 long))
 A[MD:(com.okinc.okapm.okqpl.reporter.QPLReportMetricApi, o.rWr, kotlinx.coroutines.CoroutineDispatcher, o.nqr, long):void (m)] (LINE:67) call: com.okinc.okapm.okqpl.reporter.OkQPLReporter.<init>(com.okinc.okapm.okqpl.reporter.QPLReportMetricApi, o.rWr, kotlinx.coroutines.CoroutineDispatcher, o.nqr, long):void type: THIS */
    public /* synthetic */ OkQPLReporter(QPLReportMetricApi qPLReportMetricApi, InterfaceC42541rWr interfaceC42541rWr, CoroutineDispatcher coroutineDispatcher, InterfaceC35203nqr interfaceC35203nqr, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qPLReportMetricApi, interfaceC42541rWr, coroutineDispatcher, interfaceC35203nqr, (i & 16) != 0 ? 30000L : j);
    }

    public final boolean KWHzl() {
        Function0<Boolean> function0AkhnZx;
        return this.valueOf && ((function0AkhnZx = C32864mld.OLrzqt.AkhnZx()) == null || !function0AkhnZx.invoke().booleanValue());
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okapm.okqpl.reporter.OkQPLReporter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OkQPLReporter copydefault() {
            return (OkQPLReporter) OkQPLReporter.AEQbTJ.getValue();
        }
    }

    public static final OkQPLReporter OLrzqt() {
        return new OkQPLReporter(QPLReportMetricApi.Companion.EZpvd(), new C42533rWj(), ExecutorsKt.from(TPM.AEQbTJ.AhwBna()), C35202nqq.OLrzqt, 0L, 16, null);
    }

    @Override // o.InterfaceC42542rWs
    public void AEQbTJ(@NotNull QPLEvent qPLEvent) {
        Intrinsics.checkNotNullParameter(qPLEvent, "");
        if (this.valueOf) {
            if (!C42543rWt.KWHzl.DbNXlk() && (Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.DESTROYED.getValue()) || Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.PAUSE.getValue()) || Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.PAGE_LOADED.getValue()) || Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.LOADING_DISAPPEAR.getValue()) || Intrinsics.EZpvd((Object) qPLEvent.getQplMarker(), (Object) QPLMarker.PAGE_NOT_LOADED.getValue()))) {
                EZpvd();
            }
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.copydefault), null, null, new OkQPLReporter$report$1(qPLEvent, this, null), 3, null);
        }
    }

    @Override // o.InterfaceC42542rWs
    public void AEQbTJ(@NotNull List<QPLEvent> list, C42530rWg c42530rWg) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.valueOf) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.copydefault), null, null, new OkQPLReporter$cleanAndReport$1(list, c42530rWg, this, null), 3, null);
        }
    }

    public final boolean OLrzqt(C42530rWg c42530rWg) {
        if (c42530rWg != null) {
            return c42530rWg.EZpvd() > 0 || c42530rWg.OLrzqt() > 0 || c42530rWg.AEQbTJ() > 0;
        }
        return false;
    }

    public final String KWHzl(long j) {
        return C43346rnZ.KWHzl.OLrzqt(xVW.copydefault() + "iopu34e" + ((j / ((long) 1000)) / ((long) 15)));
    }

    public final Flow<List<C42540rWq>> EZpvd(List<C42540rWq> list) {
        return FlowKt.flow(new OkQPLReporter$processReport$1(this, list, null));
    }

    public final Flow<Boolean> OLrzqt(QPLEvent qPLEvent) {
        return FlowKt.flow(new OkQPLReporter$isNetworkQplInBlackList$1(qPLEvent, null));
    }

    public final void EZpvd() {
        C42543rWt c42543rWt = C42543rWt.KWHzl;
        String strCopydefault = c42543rWt.copydefault();
        if (strCopydefault != null) {
            QPLEvent qPLEvent = new QPLEvent(strCopydefault, QPLType.LIFE_CYCLE.getValue(), QPLMarker.CREATE.getValue(), QPLConstants.APP_NAME, Math.abs(c42543rWt.AEQbTJ() - C42548rWy.AEQbTJ.AhwBna()), null, 32, null);
            c42543rWt.values();
            AEQbTJ(qPLEvent);
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class QplLogs {

        @SerializedName("data")
        private final List<QPLData> data;

        @SerializedName("env")
        private final String env;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okapm.okqpl.reporter.OkQPLReporter$QplLogs */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QplLogs copy$default(QplLogs qplLogs, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = qplLogs.data;
            }
            if ((i & 2) != 0) {
                str = qplLogs.env;
            }
            return qplLogs.copy(list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<QPLData> component1() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.env;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final QplLogs copy(@NotNull List<QPLData> list, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new QplLogs(list, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QplLogs)) {
                return false;
            }
            QplLogs qplLogs = (QplLogs) obj;
            return Intrinsics.EZpvd(this.data, qplLogs.data) && Intrinsics.EZpvd((Object) this.env, (Object) qplLogs.env);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<QPLData> getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEnv() {
            return this.env;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.data.hashCode() * 31) + this.env.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "QplLogs(data=" + this.data + ", env=" + this.env + ")";
        }

        public QplLogs(@NotNull List<QPLData> list, @NotNull String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.data = list;
            this.env = str;
        }
    }
}
