package com.okinc.tradingbot.impl.order.strategy.recurring.presenter;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringPriceRangePresenter;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.refactor.presenter.AbsPresenter;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C52680wUj;
import o.C54282xCq;
import o.C55801xqm;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C58114yvF;
import o.InterfaceC51009vet;
import o.InterfaceC56387yDm;
import o.xKK;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringPriceRangePresenter extends AbsPresenter {
    public Job AEQbTJ;
    public C54282xCq EZpvd;
    public final InterfaceC56387yDm copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringPriceRangePresenter(@NotNull Application application, @NotNull SavedStateHandle savedStateHandle) {
        super(application, savedStateHandle);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.EZpvd = new C54282xCq();
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.vUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RecurringPriceRangePresenter.OLrzqt(this.KWHzl);
            }
        });
    }

    private final C52680wUj OLrzqt() {
        return (C52680wUj) this.copydefault.getValue();
    }

    public static final C52680wUj OLrzqt(RecurringPriceRangePresenter recurringPriceRangePresenter) {
        return ((InterfaceC51009vet) C58114yvF.OLrzqt(recurringPriceRangePresenter.getApplication(), InterfaceC51009vet.class)).iKEqwx();
    }

    public final ArrayList<C55801xqm> AEQbTJ(ArrayList<SelectCoinData> arrayList) {
        ArrayList<C55801xqm> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                SelectCoinData selectCoinData = (SelectCoinData) obj;
                C55801xqm c55801xqm = new C55801xqm(null, null, null, null, null, null, false, 127, null);
                String instId = selectCoinData.getInstId();
                String str = "";
                if (instId == null) {
                    instId = "";
                }
                c55801xqm.copydefault(instId);
                String icon = selectCoinData.getIcon();
                if (icon == null) {
                    icon = "";
                }
                c55801xqm.EZpvd(icon);
                String name = selectCoinData.getName();
                if (name == null) {
                    name = "";
                }
                c55801xqm.AEQbTJ(name);
                String minPrice = selectCoinData.getMinPrice();
                if (minPrice == null) {
                    minPrice = "";
                }
                c55801xqm.AhwBna(minPrice);
                String maxPrice = selectCoinData.getMaxPrice();
                if (maxPrice != null) {
                    str = maxPrice;
                }
                c55801xqm.OLrzqt(str);
                arrayList2.add(c55801xqm);
                i++;
            }
        }
        return arrayList2;
    }

    public final void KWHzl(@NotNull final ArrayList<C55801xqm> arrayList, final Function1<? super ArrayList<C55801xqm>, Unit> function1, yHO<? super Integer, ? super String, ? super String, Unit> yho) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (arrayList.isEmpty()) {
            return;
        }
        AEQbTJ();
        ArrayList<String> arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C55801xqm) it.next()).KWHzl());
        }
        C54282xCq c54282xCq = this.EZpvd;
        c54282xCq.KWHzl(arrayList2);
        c54282xCq.KWHzl(new Function1() { // from class: o.vUM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RecurringPriceRangePresenter.EZpvd(arrayList, function1, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54282xCq, 0L, 1, null);
        ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        for (String str : arrayList2) {
            C52680wUj c52680wUjOLrzqt = OLrzqt();
            arrayList3.add(c52680wUjOLrzqt.AEQbTJ(BuiltinSerializersKt.ListSerializer(TickersData.Companion.serializer()), new WsArgV5("tickers-3s", str, null, "SPOT", null, null, null, null, 244, null), c52680wUjOLrzqt.copydefault(), StateListAnimator.EZpvd));
        }
        this.AEQbTJ = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new RecurringPriceRangePresenter$bindTicker$2(arrayList3, arrayList, yho, null), 2, null);
    }

    public static final class StateListAnimator implements Function1<List<? extends TickersData>, TickersData> {
        public static final StateListAnimator EZpvd = new StateListAnimator();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        /* JADX WARN: Type inference failed for: r2v1, types: [com.okinc.unify_trade.biz.subscribe.TickersData, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final TickersData invoke(List<? extends TickersData> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        }
    }

    public final void AEQbTJ() {
        this.EZpvd.AYXKKw();
        Job job = this.AEQbTJ;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.AEQbTJ = null;
    }

    @Override // com.okinc.unify_trade.refactor.presenter.AbsPresenter
    public List<xKK> getUseCaseList() {
        return C56402yEa.EZpvd(this.EZpvd);
    }

    public final boolean copydefault(ArrayList<C55801xqm> arrayList) {
        if (arrayList == null) {
            return true;
        }
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (((C55801xqm) obj).EZpvd()) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static final Unit EZpvd(ArrayList arrayList, Function1 function1, ResponseData responseData) {
        TickersData tickersData;
        Object next;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            int i = 0;
            for (Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C55801xqm c55801xqm = (C55801xqm) obj;
                List list = (List) responseData.getData();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((TickersData) next).getInstId(), (Object) c55801xqm.KWHzl())) {
                            break;
                        }
                    }
                    tickersData = (TickersData) next;
                } else {
                    tickersData = null;
                }
                String last = tickersData != null ? tickersData.getLast() : null;
                if (last == null) {
                    last = "";
                }
                c55801xqm.KWHzl(last);
                i++;
            }
            if (function1 != null) {
                function1.invoke(arrayList);
            }
        }
        return Unit.INSTANCE;
    }
}
