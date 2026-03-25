package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.market.market.fragment.PerpetuaTabFragment$onVisible$1;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.ChargeGroupData;
import com.okinc.unify_trade.biz.FutureGroupInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kHU extends AbstractC27884kGx {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int fARcdN = 8;
    public final InterfaceC56387yDm getFieldNames;
    public boolean hDKMBd;
    public final InterfaceC56387yDm iwGUEr;
    public final InterfaceC56387yDm uzCIH;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.valueOf;
    }

    public kHU() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$2
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
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(qTK.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$5
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
        Function0 function03 = new Function0() { // from class: o.kHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kHU.hDKMBd();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C40395qUg.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.market.fragment.PerpetuaTabFragment$special$$inlined$viewModels$default$9
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function03);
        this.uzCIH = C56392yDr.copydefault(new Function0() { // from class: o.kHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kHU.getFieldNames();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qTK iwGUEr() {
        return (qTK) this.getFieldNames.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C40395qUg zsXlph() {
        return (C40395qUg) this.iwGUEr.getValue();
    }

    public static final ViewModelProvider.Factory hDKMBd() {
        return new C40392qUd("SWAP", "FUTURES");
    }

    public final java.util.List<java.lang.String> uzCIH() {
        return (java.util.List) this.uzCIH.getValue();
    }

    public static final java.util.List getFieldNames() {
        java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> listOLrzqt = C27953kJl.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((kotlin.Pair) it.next()).getSecond());
        }
        return arrayList;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kHU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractC27884kGx
    public androidx.fragment.app.Fragment OLrzqt(@NotNull TradeGroupData tradeGroupData) {
        Intrinsics.checkNotNullParameter(tradeGroupData, "");
        return kHI.Companion.AEQbTJ(tradeGroupData);
    }

    @Override // o.AbstractC27884kGx
    public java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.Object objCopydefault;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        return (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt("SWAP")) == null || AbstractC54531xLw.isInitFun$default(abstractC54531xLwOLrzqt, false, 1, null) || (objCopydefault = C55608xnE.copydefault(abstractC54531xLwOLrzqt, continuation)) != C56442yFn.copydefault()) ? Unit.INSTANCE : objCopydefault;
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        android.widget.LinearLayout linearLayoutDjBIcL = djBIcL();
        if (linearLayoutDjBIcL != null) {
            linearLayoutDjBIcL.setOnClickListener(new StateListAnimator(linearLayoutDjBIcL, 1000L, this));
        }
        android.widget.LinearLayout linearLayoutDjBIcL2 = djBIcL();
        if (linearLayoutDjBIcL2 != null) {
            linearLayoutDjBIcL2.setVisibility(8);
        }
    }

    public final void KWHzl(int i) {
        C27862kGb c27862kGbKWHzl;
        try {
            java.util.Iterator<ChargeGroupData> it = EZpvd().iterator();
            int i2 = 0;
            while (true) {
                c27862kGbKWHzl = null;
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                java.lang.String id = it.next().getId();
                ChargeGroupData chargeGroupDataOLrzqt = OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (chargeGroupDataOLrzqt != null ? chargeGroupDataOLrzqt.getId() : null))) {
                    break;
                } else {
                    i2++;
                }
            }
            if (getContext() != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("key.request_key_perpetual_type", "request_key_perpetual_type");
                bundle.putInt("key.select_unit_index", i2);
                bundle.putInt("key.select_type_index", i);
                bundle.putParcelableArrayList("key_select_unit_data_list", copydefault());
                java.util.List<java.lang.String> listUzCIH = uzCIH();
                Intrinsics.copydefault(listUzCIH, "");
                bundle.putStringArrayList("key_select_type_data_list", (java.util.ArrayList) listUzCIH);
                c27862kGbKWHzl = C27862kGb.Companion.KWHzl();
                if (c27862kGbKWHzl != null) {
                    c27862kGbKWHzl.setArguments(bundle);
                }
            }
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            if (c27862kGbKWHzl != null) {
                c27862kGbKWHzl.show(childFragmentManager, C27862kGb.class.getName());
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // o.AbstractC27884kGx
    public java.util.ArrayList<ChargeGroupData> copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        java.util.List<FutureGroupInfo> listFARcdN = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.fARcdN() : null;
        if (listFARcdN != null) {
            for (FutureGroupInfo futureGroupInfo : listFARcdN) {
                java.lang.String ccyType = futureGroupInfo.getCcyType();
                java.lang.String str = ccyType == null ? "" : ccyType;
                java.lang.String text = futureGroupInfo.getText();
                arrayList.add(new ChargeGroupData(str, text == null ? "" : text, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (DefaultConstructorMarker) null));
            }
        }
        EZpvd().clear();
        EZpvd().addAll(arrayList);
        return EZpvd();
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        getChildFragmentManager().setFragmentResultListener("request_key_perpetual_type", this, new FragmentResultListener() { // from class: o.kHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                kHU.KWHzl(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void KWHzl(kHU khu, java.lang.String str, android.os.Bundle bundle) {
        int i;
        android.widget.ImageView imageViewAEQbTJ;
        android.widget.ImageView imageViewAEQbTJ2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        int i2 = bundle.getInt("key.select_type_index");
        bundle.getString("key.select_type_data");
        java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it = C27953kJl.OLrzqt().iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getFirst(), (java.lang.Object) khu.valueOf().copydefault().getValue())) {
                break;
            } else {
                i4++;
            }
        }
        if (C56548yJl.copydefault(i4, 0) != i2 && (imageViewAEQbTJ2 = khu.AEQbTJ()) != null) {
            imageViewAEQbTJ2.setImageResource(C52761wXj.TaskDescription.RcvFxC);
        }
        try {
            Result.Application application = Result.Companion;
            khu.valueOf().copydefault().postValue(C27953kJl.OLrzqt().get(i2).getFirst());
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        int i5 = bundle.getInt("key.select_unit_index");
        ChargeGroupData chargeGroupData = (ChargeGroupData) bundle.getParcelable("key.select_unit_data");
        java.util.Iterator<ChargeGroupData> it2 = khu.EZpvd().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.String id = it2.next().getId();
            ChargeGroupData chargeGroupDataOLrzqt = khu.OLrzqt();
            if (Intrinsics.EZpvd((java.lang.Object) id, (java.lang.Object) (chargeGroupDataOLrzqt != null ? chargeGroupDataOLrzqt.getId() : null))) {
                i = i3;
                break;
            }
            i3++;
        }
        if (i != i5 && (imageViewAEQbTJ = khu.AEQbTJ()) != null) {
            imageViewAEQbTJ.setImageResource(C52761wXj.TaskDescription.RcvFxC);
        }
        khu.KWHzl(chargeGroupData);
        khu.values();
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        android.widget.LinearLayout linearLayoutDjBIcL = djBIcL();
        if (linearLayoutDjBIcL != null) {
            linearLayoutDjBIcL.setVisibility(0);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), C40440qVy.Companion.AEQbTJ(), null, new PerpetuaTabFragment$onVisible$1(this, null), 2, null);
    }

    @Override // o.AbstractC27884kGx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
    }

    @Override // o.AbstractC27884kGx
    public void copydefault(boolean z) {
        super.copydefault(z);
        this.hDKMBd = z;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ kHU KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, kHU khu) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = khu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                kHU khu = this.KWHzl;
                java.util.Iterator<kotlin.Pair<java.lang.String, java.lang.String>> it = C27953kJl.OLrzqt().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getFirst(), (java.lang.Object) this.KWHzl.valueOf().copydefault().getValue())) {
                        break;
                    } else {
                        i++;
                    }
                }
                khu.KWHzl(C56548yJl.copydefault(i, 0));
            }
        }
    }
}
