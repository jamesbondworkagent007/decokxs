package o;

import com.okinc.core.util.SPUtils;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCG implements InterfaceC39921qCs<DefiWebCoins> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public java.util.ArrayList<DefiWebCoins> KWHzl = new java.util.ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<DefiWebCoins> copydefault() {
        return this.KWHzl;
    }

    public qCG() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("defi_web_coin_history_trader", DefiWebCoins.class);
        arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
        if (arrayList.size() != 0) {
            this.KWHzl.addAll(arrayList);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public void OLrzqt(@NotNull DefiWebCoins defiWebCoins) {
        Intrinsics.checkNotNullParameter(defiWebCoins, "");
        if (!this.KWHzl.contains(defiWebCoins)) {
            this.KWHzl.add(0, defiWebCoins);
        } else {
            this.KWHzl.remove(defiWebCoins);
            this.KWHzl.add(0, defiWebCoins);
        }
        OLrzqt();
    }

    public void EZpvd() {
        this.KWHzl.clear();
        SPUtils.put("defi_web_coin_history_trader", this.KWHzl);
    }

    public void OLrzqt() {
        SPUtils.put("defi_web_coin_history_trader", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.KWHzl, 20));
    }
}
