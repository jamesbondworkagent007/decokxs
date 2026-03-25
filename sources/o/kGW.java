package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.market.fragment.CoinTabFragment$onAttach$1;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChargeGroupData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kGW extends AbstractC27884kGx {
    public final InterfaceC56387yDm fARcdN;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.valueOf;
    }

    public kGW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.CoinTabFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.CoinTabFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(qTK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.CoinTabFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.CoinTabFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.CoinTabFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final qTK AuCTel() {
        return (qTK) this.fARcdN.getValue();
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), C40440qVy.Companion.AEQbTJ(), null, new CoinTabFragment$onAttach$1(this, null), 2, null);
    }

    @Override // o.AbstractC27884kGx
    public androidx.fragment.app.Fragment OLrzqt(@NotNull TradeGroupData tradeGroupData) {
        Intrinsics.checkNotNullParameter(tradeGroupData, "");
        return kGP.Companion.EZpvd(tradeGroupData);
    }

    @Override // o.AbstractC27884kGx
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.Object objCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("COIN")) == null || AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null) || (objCopydefault = C55608xnE.copydefault(abstractC54531xLwOLrzqt, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objCopydefault;
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        android.widget.LinearLayout linearLayoutDjBIcL = djBIcL();
        if (linearLayoutDjBIcL != null) {
            linearLayoutDjBIcL.setVisibility(8);
        }
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:33:0x00ad */
    @Override // o.AbstractC27884kGx
    public java.util.ArrayList<ChargeGroupData> copydefault() {
        java.util.List<ChargeGroupData> listAhwBna;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.HashMap map = new java.util.HashMap();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (listAhwBna = interfaceC54581xNrOLrzqt.AEQbTJ()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList<ChargeGroupData> arrayList = new java.util.ArrayList(listAhwBna);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.put(((ChargeGroupData) it.next()).getId(), 0L);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = pWO.KWHzl().OLrzqt();
        java.util.ArrayList<BizInstrument> arrayListEZpvd = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt("SPOT")) == null) ? null : abstractC54531xLwOLrzqt.EZpvd();
        if (arrayListEZpvd != null) {
            for (BizInstrument bizInstrument : arrayListEZpvd) {
                for (ChargeGroupData chargeGroupData : arrayList) {
                    if (chargeGroupData.getTypes().contains(bizInstrument.getQuoteSymbol())) {
                        java.lang.Object obj = (java.lang.Long) map.get(chargeGroupData.getId());
                        if (obj == null) {
                            obj = "0";
                        }
                        map.put(chargeGroupData.getId(), java.lang.Long.valueOf(C33129mqd.valueOf(obj) + 1));
                    }
                }
            }
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                if (C33129mqd.valueOf(map.get(((ChargeGroupData) arrayList.get(size)).getId()), "0")) {
                    arrayList.remove(size);
                }
            } else {
                EZpvd().clear();
                EZpvd().addAll(arrayList);
                return EZpvd();
            }
        }
    }
}
