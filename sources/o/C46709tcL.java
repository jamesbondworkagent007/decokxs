package o;

import com.okinc.core.arch.data.StatefulData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinWatchInstrument;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C46708tcK;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tcL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46709tcL extends AbstractC32952mnL<java.util.List<? extends C46708tcK>> {
    public Function1<? super WatchListData, java.lang.Boolean> copydefault = new Function1() { // from class: o.tcO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return java.lang.Boolean.valueOf(C46709tcL.AEQbTJ((WatchListData) obj));
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ(WatchListData watchListData) {
        Intrinsics.checkNotNullParameter(watchListData, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean>, kotlin.jvm.functions.Function1<com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean> */
    public final Function1<WatchListData, java.lang.Boolean> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function1<? super WatchListData, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    @Override // o.AbstractC32952mnL
    public InterfaceC58217yxC EZpvd(long j) {
        KWHzl();
        return null;
    }

    /* JADX INFO: renamed from: o.tcL$TaskDescription */
    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends WatchListData>> {
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: kotlin.jvm.functions.Function1<com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<WatchListData> list, java.lang.Exception exc) {
            java.util.ArrayList arrayList = null;
            if (z) {
                C46709tcL c46709tcL = C46709tcL.this;
                StatefulData.StateListAnimator stateListAnimator = StatefulData.Companion;
                C46708tcK.Activity activity = C46708tcK.Companion;
                if (list != null) {
                    Function1<WatchListData, java.lang.Boolean> function1AEQbTJ = c46709tcL.AEQbTJ();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (((java.lang.Boolean) function1AEQbTJ.invoke(obj)).booleanValue()) {
                            arrayList2.add(obj);
                        }
                    }
                    arrayList = arrayList2;
                }
                c46709tcL.setValue(stateListAnimator.EZpvd(activity.OLrzqt(c46709tcL.copydefault(arrayList))));
                return;
            }
            C46709tcL.this.setValue(StatefulData.StateListAnimator.error$default(StatefulData.Companion, new java.io.IOException(C33070mpX.AYXKKw(qZH.PendingIntent.OBJEWx)), null, 2, null));
        }
    }

    public final void KWHzl() {
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        if (interfaceC54581xNrCopydefault == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrCopydefault.fetchVPNInfo()) == null) {
            return;
        }
        c56131xwyFetchVPNInfo.OLrzqt(new TaskDescription());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<BizInstrument> copydefault(java.util.List<WatchListData> list) {
        java.util.ArrayList<BizInstrument> arrayList = new java.util.ArrayList<>();
        if (list != null) {
            for (WatchListData watchListData : list) {
                if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                    arrayList.add(new CoinWatchInstrument(watchListData.getInstId(), watchListData.getInstType()));
                } else {
                    InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                    if (interfaceC54581xNrCopydefault != null) {
                        BizInstrument watchMarketInstrument$default = interfaceC54581xNrCopydefault.EZpvd(watchListData.getInstType(), Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES") ? null : watchListData.getInstId(), Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES") ? watchListData.getInstId() : null, watchListData.getAlias());
                        if (watchMarketInstrument$default == null) {
                            watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(watchListData.getInstType(), Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES") ? "" : watchListData.getInstId(), Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES") ? watchListData.getInstId() : "", watchListData.getAlias(), false, 16, null);
                        }
                        if (watchMarketInstrument$default != null) {
                            arrayList.add(watchMarketInstrument$default);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
