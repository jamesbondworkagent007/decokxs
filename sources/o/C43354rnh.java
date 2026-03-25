package o;

import com.just.agentweb.DefaultWebClient;
import com.okinc.network.okg.cor.SingleExecutor;
import com.okinc.network.okg.dns.DohTypeEnum;
import com.okinc.network.okg.dns.executor.OKDohConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43354rnh {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public final ConcurrentHashMap<java.lang.String, SingleExecutor> KWHzl = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.String str) {
        this.AEQbTJ = str;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SingleExecutor singleExecutor = this.KWHzl.get(str);
        if (singleExecutor == null) {
            return;
        }
        pUU.KWHzl("H5CORExecutors", "removeExecutors, site:" + str);
        singleExecutor.getExecutor().copydefault().setActive(false);
        singleExecutor.getExecutor().gEmmrt();
        this.KWHzl.remove(str);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.containsKey(str);
    }

    public final boolean copydefault() {
        return this.KWHzl.isEmpty();
    }

    public final void AEQbTJ() {
        java.util.Enumeration<java.lang.String> enumerationKeys = this.KWHzl.keys();
        Intrinsics.checkNotNullExpressionValue(enumerationKeys, "");
        java.util.Iterator itAEQbTJ = yDX.AEQbTJ(enumerationKeys);
        while (itAEQbTJ.hasNext()) {
            java.lang.String str = (java.lang.String) itAEQbTJ.next();
            Intrinsics.copydefault((java.lang.Object) str);
            KWHzl(str);
        }
    }

    public final SingleExecutor EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.get(str);
    }

    public final SingleExecutor EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("H5CORExecutors", "getOrCreate, create executors for site:" + str);
        SingleExecutor singleExecutorEZpvd = EZpvd(str);
        if (singleExecutorEZpvd != null) {
            if (copydefault(singleExecutorEZpvd, str2)) {
                pUU.KWHzl("H5CORExecutors", "getOrCreate, return exist one for site:" + str);
                return singleExecutorEZpvd;
            }
            KWHzl(str);
        }
        SingleExecutor singleExecutor = new SingleExecutor(str, DohTypeEnum.HTTP, AEQbTJ(new com.okinc.network.request.Uri(DefaultWebClient.HTTPS_SCHEME + str2), str));
        this.KWHzl.put(str, singleExecutor);
        return singleExecutor;
    }

    public final boolean copydefault(SingleExecutor singleExecutor, java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) singleExecutor.getExecutor().copydefault().getQueryHost(), (java.lang.Object) str);
    }

    public final C43326rnF AEQbTJ(com.okinc.network.request.Uri uri, java.lang.String str) {
        ReentrantLock reentrantLock = new ReentrantLock();
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        OKDohConfig oKDohConfig = new OKDohConfig(uri, str);
        Intrinsics.copydefault(conditionNewCondition);
        return new C43326rnF(oKDohConfig, reentrantLock, conditionNewCondition, null, 8, null);
    }

    public static /* synthetic */ void startTimer$default(C43354rnh c43354rnh, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c43354rnh.EZpvd(j);
    }

    public final Map.Entry<java.lang.String, SingleExecutor> OLrzqt() {
        java.util.Set<Map.Entry<java.lang.String, SingleExecutor>> setEntrySet = this.KWHzl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        return (Map.Entry) CollectionsKt___CollectionsKt.RcXXUw(setEntrySet);
    }

    /* JADX INFO: renamed from: o.rnh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void EZpvd(long j) {
        java.util.Iterator<Map.Entry<java.lang.String, SingleExecutor>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getExecutor().KWHzl(j);
        }
    }

    public final void KWHzl() {
        java.util.Iterator<Map.Entry<java.lang.String, SingleExecutor>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getExecutor().gEmmrt();
        }
    }
}
