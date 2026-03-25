package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39922qCt implements InterfaceC39921qCs<SearchTradeBizInfo> {
    public java.util.ArrayList<SearchTradeBizInfo> copydefault = new java.util.ArrayList<>();
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<SearchTradeBizInfo> OLrzqt() {
        return this.copydefault;
    }

    public C39922qCt() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("trade_search_history", SearchTradeBizInfo.class);
        arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
        if (arrayList.size() != 0) {
            this.copydefault.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: o.qCt$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void EZpvd(@NotNull SearchTradeBizInfo searchTradeBizInfo) {
        Intrinsics.checkNotNullParameter(searchTradeBizInfo, "");
        if (!this.copydefault.contains(searchTradeBizInfo)) {
            this.copydefault.add(0, searchTradeBizInfo);
        } else {
            this.copydefault.remove(searchTradeBizInfo);
            this.copydefault.add(0, searchTradeBizInfo);
        }
        AEQbTJ();
    }

    public void KWHzl() {
        this.copydefault.clear();
        SPUtils.put("trade_search_history", this.copydefault);
    }

    public void AEQbTJ() {
        SPUtils.put("trade_search_history", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.copydefault, 20));
    }
}
