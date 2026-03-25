package o;

import com.okinc.kline.ui.unlock.data.po.UnlockTokenAllocation;
import com.okinc.kline.ui.unlock.data.po.UnlockTokenAllocationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39660pwY extends AbstractC49400uno<kotlin.Pair<? extends UnlockTokenAllocation, ? extends java.util.Map<java.lang.String, kotlin.Pair<? extends java.lang.Integer, ? extends java.lang.Integer>>>, java.util.List<? extends C39708pxT>> {
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C39660pwY(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<UnlockTokenAllocation, ? extends java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>>> pair, @NotNull Continuation<? super java.util.List<C39708pxT>> continuation) {
        java.util.List<UnlockTokenAllocationInfo> list = pair.getFirst().getList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.lang.Double.parseDouble(((UnlockTokenAllocationInfo) it.next()).getPercOfUnlocked());
        }
        int size = C39650pwO.KWHzl().size();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            UnlockTokenAllocationInfo unlockTokenAllocationInfo = (UnlockTokenAllocationInfo) obj;
            java.util.Map<java.lang.String, kotlin.Pair<java.lang.Integer, java.lang.Integer>> second = pair.getSecond();
            java.lang.String label = unlockTokenAllocationInfo.getLabel();
            kotlin.Pair<java.lang.Integer, java.lang.Integer> pairOLrzqt = second.get(label);
            if (pairOLrzqt == null) {
                pairOLrzqt = C56390yDp.OLrzqt(C39650pwO.KWHzl().get(i % size), C56443yFo.AEQbTJ(i));
                second.put(label, pairOLrzqt);
            }
            arrayList.add(new C39708pxT(unlockTokenAllocationInfo.getLabel(), C33129mqd.djBIcL(unlockTokenAllocationInfo.getPercOfLabel()), pairOLrzqt.getFirst().intValue(), java.lang.Float.parseFloat(unlockTokenAllocationInfo.getProgress()), C33129mqd.djBIcL(unlockTokenAllocationInfo.getPercOfUnlocked()), C33129mqd.valueOf(pair.getFirst().getMaxSupply())));
            i++;
        }
        return arrayList;
    }
}
