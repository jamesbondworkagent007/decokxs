package o;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyAddress;
import com.okinc.business.defi.biz.net.bean.AddressAsset;
import com.okinc.business.defi.biz.net.bean.AssetReq;
import com.okinc.business.defi.biz.net.bean.AssetRsp;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeySelectAccountViewModel$createOneKeyWallet$1;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeySelectAccountViewModel$generateAddresses$1;
import com.okinc.business.defi.wallet.hardware.onekey.OneKeySelectAccountViewModel$generateAddresses$3;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.other.ChainInfo;
import com.okinc.wallet.core.other.DerivePath;
import com.okinc.wallet.hardware.api.onekey.BTCAddress;
import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.EVMAddress;
import com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.MultisigRedeemScriptType;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxSingleKt;
import o.C12827cuN;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eHu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15423eHu extends AbstractC33073mpa {
    public int AEQbTJ;
    public final int AYXKKw;
    public final java.lang.String AhwBna;
    public final MutableLiveData<java.lang.Boolean> EZpvd;
    public final MutableLiveData<Application> KWHzl;
    public final java.lang.String OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final java.lang.String djBIcL;
    public final C13934dbu gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<Application> KWHzl() {
        return this.KWHzl;
    }

    public C15423eHu(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = new C13934dbu();
        this.KWHzl = new MutableLiveData<>();
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15423eHu.EZpvd();
            }
        });
        java.lang.String str = (java.lang.String) savedStateHandle.get("deviceId");
        this.valueOf = str == null ? "" : str;
        java.lang.String str2 = (java.lang.String) savedStateHandle.get("connectId");
        this.OLrzqt = str2 == null ? "" : str2;
        java.lang.String str3 = (java.lang.String) savedStateHandle.get("deviceType");
        this.djBIcL = str3 == null ? "" : str3;
        java.lang.String str4 = (java.lang.String) savedStateHandle.get("label");
        this.AhwBna = str4 != null ? str4 : "";
        this.AYXKKw = 5;
        this.EZpvd = new MutableLiveData<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC57039yar AYXKKw() {
        return ((InterfaceC57001yaF) C43251rlk.copydefault(InterfaceC57001yaF.class)).OLrzqt();
    }

    public static final java.util.ArrayList EZpvd() {
        return new java.util.ArrayList();
    }

    public final java.util.ArrayList<TaskDescription.ActionBar> AEQbTJ() {
        return (java.util.ArrayList) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void djBIcL() {
        this.EZpvd.setValue(java.lang.Boolean.FALSE);
    }

    public final void gEmmrt() {
        if (!valueOf()) {
            this.KWHzl.setValue(new Application.C0834Application(new java.lang.IllegalStateException("Invalid device(deviceId: " + this.valueOf + ", connectId: " + this.OLrzqt + ")")));
            return;
        }
        if (this.AEQbTJ == 0) {
            this.KWHzl.setValue(Application.TaskDescription.copydefault);
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(WalletType.HardwareWallet);
        final Function1 function1 = new Function1() { // from class: o.eHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.eHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15423eHu.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        call().AEQbTJ(yBI.KWHzl(abstractC58185ywXKWHzl, new Function1() { // from class: o.eHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }, new Function0() { // from class: o.eHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15423eHu.EZpvd(linkedHashMap, this);
            }
        }, new Function1() { // from class: o.eHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.EZpvd(linkedHashMap, this, (java.util.List) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final Unit EZpvd(LinkedHashMap linkedHashMap, C15423eHu c15423eHu, java.util.List list) {
        java.util.Iterator it;
        java.util.ArrayList<ChainAddress> arrayListCopydefault;
        TaskDescription.ActionBar actionBar;
        java.util.ArrayList<ChainAddress> arrayListDjBIcL;
        Intrinsics.copydefault(list);
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            StateListAnimator stateListAnimator = (StateListAnimator) it2.next();
            int iKWHzl = stateListAnimator.KWHzl();
            java.util.List<ChainAddress> listCopydefault = stateListAnimator.copydefault();
            boolean zOLrzqt = stateListAnimator.OLrzqt();
            if (linkedHashMap.get(java.lang.Integer.valueOf(iKWHzl)) == null) {
                it = it2;
                linkedHashMap.put(java.lang.Integer.valueOf(iKWHzl), new TaskDescription.ActionBar(iKWHzl, null, null, null, null, zOLrzqt, false, 30, null));
            } else {
                it = it2;
            }
            for (ChainAddress chainAddress : listCopydefault) {
                if (c15423eHu.EZpvd(chainAddress)) {
                    TaskDescription.ActionBar actionBar2 = (TaskDescription.ActionBar) linkedHashMap.get(java.lang.Integer.valueOf(iKWHzl));
                    if (actionBar2 != null && (arrayListCopydefault = actionBar2.copydefault()) != null) {
                        arrayListCopydefault.add(chainAddress);
                    }
                } else if (c15423eHu.KWHzl(chainAddress) && (actionBar = (TaskDescription.ActionBar) linkedHashMap.get(java.lang.Integer.valueOf(iKWHzl))) != null && (arrayListDjBIcL = actionBar.djBIcL()) != null) {
                    arrayListDjBIcL.add(chainAddress);
                }
            }
            it2 = it;
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(LinkedHashMap linkedHashMap, C15423eHu c15423eHu) {
        if (linkedHashMap.size() == c15423eHu.AYXKKw) {
            java.util.Collection collectionValues = linkedHashMap.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            c15423eHu.EZpvd(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues));
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15423eHu c15423eHu, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c15423eHu.KWHzl.setValue(new Application.C0834Application(th));
        return Unit.INSTANCE;
    }

    public static final java.util.List<DerivePath> AEQbTJ(java.util.List<ChainInfo> list) {
        java.util.List<DerivePath> listOLrzqt = xYW.AEQbTJ.OLrzqt(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (DerivePath derivePath : listOLrzqt) {
            arrayList.add(DerivePath.copy$default(derivePath, 0L, "m/" + derivePath.getPath(), 0, 0, 13, null));
        }
        return arrayList;
    }

    public final Activity copydefault(int i, int i2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (int i3 = i; i3 < i2; i3++) {
            java.util.List<DerivePath> listAEQbTJ = AEQbTJ((java.util.List<ChainInfo>) yDY.gEmmrt(new ChainInfo(0L, i3, AddressType.Legacy.getValue()), new ChainInfo(0L, i3, AddressType.P2SHCommonType.getValue()), new ChainInfo(0L, i3, AddressType.Bech32Type.getValue())));
            arrayList3.addAll(listAEQbTJ);
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                arrayList4.add(new BTCGetAddressParams(((DerivePath) it.next()).getPath(), "btc", java.lang.Boolean.FALSE, (MultisigRedeemScriptType) null, (java.lang.String) null, 24, (DefaultConstructorMarker) null));
            }
            arrayList.addAll(arrayList4);
            java.util.List<DerivePath> listAEQbTJ2 = AEQbTJ((java.util.List<ChainInfo>) C56402yEa.EZpvd(new ChainInfo(-2000L, i3, AddressType.Legacy.getValue())));
            arrayList3.addAll(listAEQbTJ2);
            java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ2, 10));
            java.util.Iterator<T> it2 = listAEQbTJ2.iterator();
            while (it2.hasNext()) {
                arrayList5.add(new EVMGetAddressParams(((DerivePath) it2.next()).getPath(), java.lang.Boolean.FALSE, (java.lang.Integer) null, 4, (DefaultConstructorMarker) null));
            }
            arrayList2.addAll(arrayList5);
        }
        return new Activity(arrayList, arrayList2, arrayList3);
    }

    public final AbstractC58185ywX<java.util.List<StateListAnimator>> OLrzqt(final java.util.List<? extends AbstractC12782ctV> list, int i, int i2) {
        final Activity activityCopydefault = copydefault(i, i2);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(RxSingleKt.rxSingle(Dispatchers.getMain().getImmediate(), new OneKeySelectAccountViewModel$generateAddresses$1(this, activityCopydefault, null)));
        final Function1 function1 = new Function1() { // from class: o.eHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.copydefault(this.KWHzl, activityCopydefault, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.eHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15423eHu.valueOf(function1, obj);
            }
        });
        AbstractC58260yxt abstractC58260yxtKWHzl2 = C11607cUn.KWHzl(RxSingleKt.rxSingle(Dispatchers.getMain().getImmediate(), new OneKeySelectAccountViewModel$generateAddresses$3(this, activityCopydefault, null)));
        final Function1 function12 = new Function1() { // from class: o.eHy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58260yxt.copydefault(abstractC58260yxtCopydefault, abstractC58260yxtKWHzl2.copydefault(new InterfaceC58229yxO() { // from class: o.eHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15423eHu.gEmmrt(function12, obj);
            }
        }));
        final Function1 function13 = new Function1() { // from class: o.eHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.KWHzl(list, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<StateListAnimator>> abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15423eHu.djBIcL(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List copydefault(C15423eHu c15423eHu, final Activity activity, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c15423eHu.KWHzl((java.util.List<BTCAddress>) list, new Function1() { // from class: o.eHs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C15423eHu.AEQbTJ(activity, (BTCAddress) obj));
            }
        });
    }

    public static final int AEQbTJ(Activity activity, BTCAddress bTCAddress) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(bTCAddress, "");
        java.util.Iterator<T> it = activity.KWHzl().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) bTCAddress.getPath(), (java.lang.Object) ((DerivePath) next).getPath())) {
                break;
            }
        }
        DerivePath derivePath = (DerivePath) next;
        return derivePath != null ? derivePath.getAddressType() : AddressType.Legacy.getValue();
    }

    public static final java.util.List gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List OLrzqt(C15423eHu c15423eHu, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c15423eHu.KWHzl((java.util.List<EVMAddress>) list);
    }

    public static final java.util.List djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final ResponseData AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final Unit EZpvd(C15423eHu c15423eHu, ResponseData responseData) {
        Intrinsics.copydefault(responseData);
        c15423eHu.OLrzqt((ResponseData<java.util.List<TaskDescription.ActionBar>>) responseData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C15423eHu c15423eHu, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c15423eHu.KWHzl.setValue(new Application.C0834Application(th));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(ResponseData<java.util.List<TaskDescription.ActionBar>> responseData) {
        this.AEQbTJ++;
        java.util.ArrayList<TaskDescription.ActionBar> arrayListAEQbTJ = AEQbTJ();
        java.util.List<TaskDescription.ActionBar> data = responseData.getData();
        if (data == null) {
            data = yDY.AhwBna();
        }
        arrayListAEQbTJ.addAll(data);
        MutableLiveData<Application> mutableLiveData = this.KWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(TaskDescription.StateListAnimator.OLrzqt);
        arrayList.addAll(AEQbTJ());
        mutableLiveData.setValue(new Application.StateListAnimator(arrayList));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getMsg())) {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, int i, @NotNull android.app.Activity activity, @NotNull TaskDescription.ActionBar actionBar, @NotNull Function1<? super AbstractC12782ctV, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OneKeySelectAccountViewModel$createOneKeyWallet$1(activity, actionBar, i, this, fragmentManager, function1, null), 3, null);
    }

    public final java.util.List<OneKeyAccountInfo> OLrzqt() {
        java.util.ArrayList<TaskDescription.ActionBar> arrayListAEQbTJ = AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
        for (TaskDescription.ActionBar actionBar : arrayListAEQbTJ) {
            int iKWHzl = actionBar.KWHzl();
            java.util.ArrayList<ChainAddress> arrayListCopydefault = actionBar.copydefault();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList<ChainAddress> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListCopydefault) {
                if (hashSet.add(((ChainAddress) obj).getDerivePath())) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (ChainAddress chainAddress : arrayList2) {
                arrayList3.add(new OneKeyAddress(chainAddress.getCoinId(), chainAddress.getDerivePath(), chainAddress.getAddress(), chainAddress.getAddressType()));
            }
            java.util.ArrayList<ChainAddress> arrayListDjBIcL = actionBar.djBIcL();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.ArrayList<ChainAddress> arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListDjBIcL) {
                if (hashSet2.add(((ChainAddress) obj2).getDerivePath())) {
                    arrayList4.add(obj2);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
            for (ChainAddress chainAddress2 : arrayList4) {
                arrayList5.add(new OneKeyAddress(chainAddress2.getCoinId(), chainAddress2.getDerivePath(), chainAddress2.getAddress(), chainAddress2.getAddressType()));
            }
            arrayList.add(new OneKeyAccountInfo(iKWHzl, arrayList3, arrayList5));
        }
        return arrayList;
    }

    public final boolean valueOf() {
        return this.OLrzqt.length() > 0 && this.valueOf.length() > 0;
    }

    public final java.util.List<StateListAnimator> KWHzl(java.util.List<BTCAddress> list, Function1<? super BTCAddress, java.lang.Integer> function1) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
        if (c10854bwMCopydefault == null) {
            throw new java.lang.IllegalStateException("not supported chain");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(OLrzqt(((BTCAddress) obj).getPath()));
            java.lang.Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            java.util.List<BTCAddress> list2 = (java.util.List) entry.getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (BTCAddress bTCAddress : list2) {
                arrayList3.add(new ChainAddress(c10854bwMCopydefault.AhwBna(), bTCAddress.getAddress(), function1.invoke(bTCAddress).intValue(), null, null, false, "", bTCAddress.getPath(), 24, null));
            }
            arrayList2.add(new StateListAnimator(iIntValue, arrayList3, false, 4, null));
        }
        return arrayList2;
    }

    public final java.util.List<StateListAnimator> AEQbTJ(java.util.List<OneKeyAccountInfo> list, java.util.List<? extends AbstractC12782ctV> list2) {
        boolean z;
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
        if (c10854bwMCopydefault == null) {
            throw new java.lang.IllegalStateException("not supported chain");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (OneKeyAccountInfo oneKeyAccountInfo : list) {
            int addressIndex = oneKeyAccountInfo.getAddressIndex();
            java.util.List<OneKeyAddress> btcAddresses = oneKeyAccountInfo.getBtcAddresses();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(btcAddresses, 10));
            for (OneKeyAddress oneKeyAddress : btcAddresses) {
                arrayList2.add(new ChainAddress(c10854bwMCopydefault.AhwBna(), oneKeyAddress.getAddress(), oneKeyAddress.getType(), null, null, false, "", oneKeyAddress.getPath(), 24, null));
            }
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((AbstractC12782ctV) it.next()).finit() == oneKeyAccountInfo.getAddressIndex()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            arrayList.add(new StateListAnimator(addressIndex, arrayList2, z));
        }
        return arrayList;
    }

    public final boolean EZpvd(ChainAddress chainAddress) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(chainAddress.getCoinId());
        return c10854bwMKWHzl != null && c10854bwMKWHzl.AxsJAYaxsJAY();
    }

    public final boolean KWHzl(ChainAddress chainAddress) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(chainAddress.getCoinId());
        return c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ();
    }

    /* JADX INFO: renamed from: o.eHu$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        public final java.util.ArrayList<EVMGetAddressParams> KWHzl;
        public final java.util.ArrayList<BTCGetAddressParams> OLrzqt;
        public final java.util.ArrayList<DerivePath> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eHu$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                arrayList = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                arrayList2 = activity.KWHzl;
            }
            if ((i & 4) != 0) {
                arrayList3 = activity.copydefault;
            }
            return activity.copydefault(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<EVMGetAddressParams> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<DerivePath> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<BTCGetAddressParams> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.util.ArrayList<BTCGetAddressParams> arrayList, @NotNull java.util.ArrayList<EVMGetAddressParams> arrayList2, @NotNull java.util.ArrayList<DerivePath> arrayList3) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(arrayList3, "");
            return new Activity(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GetAddressParams(btcAddressParamsList=" + this.OLrzqt + ", evmAddressParamsList=" + this.KWHzl + ", derivePaths=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.util.ArrayList<BTCGetAddressParams> arrayList, @NotNull java.util.ArrayList<EVMGetAddressParams> arrayList2, @NotNull java.util.ArrayList<DerivePath> arrayList3) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(arrayList3, "");
            this.OLrzqt = arrayList;
            this.KWHzl = arrayList2;
            this.copydefault = arrayList3;
        }
    }

    /* JADX INFO: renamed from: o.eHu$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class StateListAnimator {
        public final java.util.List<ChainAddress> AEQbTJ;
        public final boolean EZpvd;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eHu$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, java.util.List list, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.KWHzl;
            }
            if ((i2 & 2) != 0) {
                list = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                z = stateListAnimator.EZpvd;
            }
            return stateListAnimator.copydefault(i, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChainAddress> copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(int i, @NotNull java.util.List<ChainAddress> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            return new StateListAnimator(i, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.KWHzl == stateListAnimator.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.EZpvd == stateListAnimator.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((java.lang.Integer.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AddressInfo(addressIndex=" + this.KWHzl + ", addresses=" + this.AEQbTJ + ", isAdded=" + this.EZpvd + ")";
        }

        public StateListAnimator(int i, @NotNull java.util.List<ChainAddress> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = i;
            this.AEQbTJ = list;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.util.List)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, java.util.List<com.okinc.business.defi.biz.model.ChainAddress>, boolean):void (m)] (LINE:439) call: o.eHu.StateListAnimator.<init>(int, java.util.List, boolean):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, java.util.List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, list, (i2 & 4) != 0 ? false : z);
        }
    }

    /* JADX INFO: renamed from: o.eHu$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public interface TaskDescription {

        /* JADX INFO: renamed from: o.eHu$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements TaskDescription {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.eHu$TaskDescription$ActionBar */
        public static final class ActionBar implements TaskDescription {
            public final int AEQbTJ;
            public final boolean AYXKKw;
            public java.lang.String EZpvd;
            public java.lang.String KWHzl;
            public final java.util.ArrayList<ChainAddress> OLrzqt;
            public final java.util.ArrayList<ChainAddress> copydefault;
            public boolean valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.eHu$TaskDescription$ActionBar */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i2, java.lang.Object obj) {
                if ((i2 & 1) != 0) {
                    i = actionBar.AEQbTJ;
                }
                if ((i2 & 2) != 0) {
                    arrayList = actionBar.copydefault;
                }
                java.util.ArrayList arrayList3 = arrayList;
                if ((i2 & 4) != 0) {
                    arrayList2 = actionBar.OLrzqt;
                }
                java.util.ArrayList arrayList4 = arrayList2;
                if ((i2 & 8) != 0) {
                    str = actionBar.KWHzl;
                }
                java.lang.String str3 = str;
                if ((i2 & 16) != 0) {
                    str2 = actionBar.EZpvd;
                }
                java.lang.String str4 = str2;
                if ((i2 & 32) != 0) {
                    z = actionBar.AYXKKw;
                }
                boolean z3 = z;
                if ((i2 & 64) != 0) {
                    z2 = actionBar.valueOf;
                }
                return actionBar.AEQbTJ(i, arrayList3, arrayList4, str3, str4, z3, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar AEQbTJ(int i, @NotNull java.util.ArrayList<ChainAddress> arrayList, @NotNull java.util.ArrayList<ChainAddress> arrayList2, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(arrayList, "");
                Intrinsics.checkNotNullParameter(arrayList2, "");
                return new ActionBar(i, arrayList, arrayList2, str, str2, z, z2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void EZpvd(java.lang.String str) {
                this.EZpvd = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void OLrzqt(java.lang.String str) {
                this.KWHzl = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.ArrayList<ChainAddress> copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void copydefault(boolean z) {
                this.valueOf = z;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.ArrayList<ChainAddress> djBIcL() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return this.AEQbTJ == actionBar.AEQbTJ && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && this.AYXKKw == actionBar.AYXKKw && this.valueOf == actionBar.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean gEmmrt() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
                int iHashCode2 = this.copydefault.hashCode();
                int iHashCode3 = this.OLrzqt.hashCode();
                java.lang.String str = this.KWHzl;
                int iHashCode4 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.EZpvd;
                return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.valueOf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "AccountInfo(addressIndex=" + this.AEQbTJ + ", btcAddressList=" + this.copydefault + ", evmAddressList=" + this.OLrzqt + ", asset=" + this.KWHzl + ", displayAsset=" + this.EZpvd + ", isAdded=" + this.AYXKKw + ", isSelected=" + this.valueOf + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean valueOf() {
                return this.AYXKKw;
            }

            public ActionBar(int i, @NotNull java.util.ArrayList<ChainAddress> arrayList, @NotNull java.util.ArrayList<ChainAddress> arrayList2, java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(arrayList, "");
                Intrinsics.checkNotNullParameter(arrayList2, "");
                this.AEQbTJ = i;
                this.copydefault = arrayList;
                this.OLrzqt = arrayList2;
                this.KWHzl = str;
                this.EZpvd = str2;
                this.AYXKKw = z;
                this.valueOf = z2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r10v0 int)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0009: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:450) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r11v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:451) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r12v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (r15v0 boolean)
  (r16v0 boolean)
 A[MD:(int, java.util.ArrayList<com.okinc.business.defi.biz.model.ChainAddress>, java.util.ArrayList<com.okinc.business.defi.biz.model.ChainAddress>, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:448) call: o.eHu.TaskDescription.ActionBar.<init>(int, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
            public /* synthetic */ ActionBar(int i, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, java.lang.String str2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? new java.util.ArrayList() : arrayList, (i2 & 4) != 0 ? new java.util.ArrayList() : arrayList2, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2, z, z2);
            }

            public final java.util.List<ChainAddress> OLrzqt() {
                return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.copydefault, (java.lang.Iterable) this.OLrzqt);
            }

            public final java.lang.String EZpvd() {
                return C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null), null, this.AEQbTJ + 1, false, 5, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.eHu$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public interface Application {

        /* JADX INFO: renamed from: o.eHu$Application$TaskDescription */
        public static final class TaskDescription implements Application {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
            }
        }

        /* JADX INFO: renamed from: o.eHu$Application$StateListAnimator */
        public static final class StateListAnimator implements Application {
            public final java.util.ArrayList<TaskDescription> KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eHu$Application$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    arrayList = stateListAnimator.KWHzl;
                }
                return stateListAnimator.KWHzl(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.ArrayList<TaskDescription> KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull java.util.ArrayList<TaskDescription> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, "");
                return new StateListAnimator(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(data=" + this.KWHzl + ")";
            }

            public StateListAnimator(@NotNull java.util.ArrayList<TaskDescription> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, "");
                this.KWHzl = arrayList;
            }
        }

        /* JADX INFO: renamed from: o.eHu$Application$Application, reason: collision with other inner class name */
        public static final class C0834Application implements Application {
            public final java.lang.Throwable EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0834Application copy$default(C0834Application c0834Application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = c0834Application.EZpvd;
                }
                return c0834Application.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0834Application copydefault(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new C0834Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0834Application) && Intrinsics.EZpvd(this.EZpvd, ((C0834Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(throwable=" + this.EZpvd + ")";
            }

            public C0834Application(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                this.EZpvd = th;
            }
        }
    }

    public final void EZpvd(final java.util.List<TaskDescription.ActionBar> list) {
        C13934dbu c13934dbu = this.gEmmrt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TaskDescription.ActionBar actionBar : list) {
            java.util.ArrayList<ChainAddress> arrayListDjBIcL = actionBar.djBIcL();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListDjBIcL, 10));
            java.util.Iterator<T> it = arrayListDjBIcL.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ChainAddress) it.next()).getAddress());
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(CollectionsKt___CollectionsKt.QbewEr(arrayList2));
            java.util.ArrayList<ChainAddress> arrayListCopydefault = actionBar.copydefault();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
            java.util.Iterator<T> it2 = arrayListCopydefault.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((ChainAddress) it2.next()).getAddress());
            }
            arrayList.add(new AssetReq(arrayList3, new java.util.ArrayList(CollectionsKt___CollectionsKt.QbewEr(arrayList4)), (java.util.ArrayList) null, (java.util.ArrayList) null, (java.util.ArrayList) null, (java.util.ArrayList) null, 60, (DefaultConstructorMarker) null));
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = C11607cUn.copydefault((AbstractC58185ywX) c13934dbu.AEQbTJ(arrayList));
        final Function1 function1 = new Function1() { // from class: o.eHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.copydefault(list, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C15423eHu.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        call().AEQbTJ(yBI.subscribeBy$default(C11607cUn.KWHzl(abstractC58185ywXAEQbTJ), new Function1() { // from class: o.eHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.AEQbTJ(this.OLrzqt, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.eHt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15423eHu.EZpvd(this.EZpvd, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null));
    }

    public final int OLrzqt(java.lang.String str) {
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (str.charAt(length) == '/') {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return 0;
        }
        java.lang.String strSubstring = str.substring(length + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return java.lang.Integer.parseInt(strSubstring);
    }

    public final java.util.List<StateListAnimator> KWHzl(java.util.List<EVMAddress> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(OLrzqt(((EVMAddress) obj).OLrzqt()));
            java.lang.Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            java.util.List<EVMAddress> list2 = (java.util.List) entry.getValue();
            java.util.List<C10854bwM> listDbNXlk = C10954byG.EZpvd.valueOf().DbNXlk();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
            for (C10854bwM c10854bwM : listDbNXlk) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                for (EVMAddress eVMAddress : list2) {
                    long jAhwBna = c10854bwM.AhwBna();
                    java.lang.String lowerCase = eVMAddress.EZpvd().toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    arrayList4.add(new ChainAddress(jAhwBna, lowerCase, AddressType.Legacy.getValue(), null, null, false, "", eVMAddress.OLrzqt(), 24, null));
                }
                arrayList3.add(arrayList4);
            }
            arrayList2.add(new StateListAnimator(iIntValue, C56403yEb.QOLQEE(arrayList3), false, 4, null));
        }
        return arrayList2;
    }

    public final java.util.List<StateListAnimator> copydefault(java.util.List<OneKeyAccountInfo> list, java.util.List<? extends AbstractC12782ctV> list2) {
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (OneKeyAccountInfo oneKeyAccountInfo : list) {
            int addressIndex = oneKeyAccountInfo.getAddressIndex();
            java.util.List<C10854bwM> listDbNXlk = C10954byG.EZpvd.valueOf().DbNXlk();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
            for (C10854bwM c10854bwM : listDbNXlk) {
                java.util.List<OneKeyAddress> evmAddresses = oneKeyAccountInfo.getEvmAddresses();
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(evmAddresses, 10));
                for (OneKeyAddress oneKeyAddress : evmAddresses) {
                    long jAhwBna = c10854bwM.AhwBna();
                    java.lang.String lowerCase = oneKeyAddress.getAddress().toLowerCase(java.util.Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    arrayList3.add(new ChainAddress(jAhwBna, lowerCase, oneKeyAddress.getType(), null, null, false, "", oneKeyAddress.getPath(), 24, null));
                }
                arrayList2.add(arrayList3);
            }
            java.util.List listQOLQEE = C56403yEb.QOLQEE(arrayList2);
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (((AbstractC12782ctV) it.next()).finit() == oneKeyAccountInfo.getAddressIndex()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            arrayList.add(new StateListAnimator(addressIndex, listQOLQEE, z));
        }
        return arrayList;
    }

    public static final InterfaceC60096zvd KWHzl(C15423eHu c15423eHu, java.util.List list) {
        java.lang.Integer numValueOf;
        java.lang.Object next;
        C13854daT c13854daTFetchVPNInfo;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            numValueOf = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) next;
            if (abstractC12784ctX.zsXlph()) {
                C13854daT c13854daTFetchVPNInfo2 = abstractC12784ctX.fetchVPNInfo();
                if (Intrinsics.EZpvd((java.lang.Object) (c13854daTFetchVPNInfo2 != null ? c13854daTFetchVPNInfo2.AYXKKw() : null), (java.lang.Object) c15423eHu.OLrzqt)) {
                    C13854daT c13854daTFetchVPNInfo3 = abstractC12784ctX.fetchVPNInfo();
                    if (Intrinsics.EZpvd((java.lang.Object) (c13854daTFetchVPNInfo3 != null ? c13854daTFetchVPNInfo3.valueOf() : null), (java.lang.Object) c15423eHu.valueOf)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) next;
        java.util.List<? extends AbstractC12782ctV> listKWHzl = abstractC12784ctX2 != null ? abstractC12784ctX2.KWHzl() : null;
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        java.util.List<OneKeyAccountInfo> listDjBIcL = (abstractC12784ctX2 == null || (c13854daTFetchVPNInfo = abstractC12784ctX2.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.djBIcL();
        if (listDjBIcL == null) {
            listDjBIcL = yDY.AhwBna();
        }
        java.util.Iterator<T> it2 = listDjBIcL.iterator();
        if (it2.hasNext()) {
            numValueOf = java.lang.Integer.valueOf(((OneKeyAccountInfo) it2.next()).getAddressIndex());
            while (it2.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((OneKeyAccountInfo) it2.next()).getAddressIndex());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        int i = c15423eHu.AEQbTJ;
        int i2 = c15423eHu.AYXKKw;
        int i3 = i * i2;
        int i4 = (i + 1) * i2;
        if (iIntValue + 1 < i4) {
            return c15423eHu.OLrzqt(listKWHzl, i3, i4);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listDjBIcL) {
            int addressIndex = ((OneKeyAccountInfo) obj).getAddressIndex();
            if (i3 <= addressIndex && addressIndex < i4) {
                arrayList.add(obj);
            }
        }
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(c15423eHu.AEQbTJ(arrayList, listKWHzl), c15423eHu.copydefault(arrayList, listKWHzl));
        Intrinsics.copydefault(abstractC58185ywXEZpvd);
        return abstractC58185ywXEZpvd;
    }

    public static final java.util.List KWHzl(java.util.List list, java.util.List list2) {
        boolean z;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            StateListAnimator stateListAnimator = (StateListAnimator) it.next();
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                z = false;
            } else {
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((AbstractC12782ctV) it2.next()).finit() == stateListAnimator.KWHzl()) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            arrayList.add(StateListAnimator.copy$default(stateListAnimator, 0, null, z, 3, null));
        }
        return arrayList;
    }

    public static final ResponseData copydefault(java.util.List list, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            TaskDescription.ActionBar actionBar = (TaskDescription.ActionBar) it.next();
            if (responseData.getCode() != 0 || responseData.getData() == null) {
                actionBar.OLrzqt("0");
                actionBar.EZpvd("--");
            } else {
                BigDecimal bigDecimal = new BigDecimal("0");
                java.util.List<AssetRsp> list2 = (java.util.List) responseData.getData();
                if (list2 != null) {
                    for (AssetRsp assetRsp : list2) {
                        java.util.List<AddressAsset> evm = assetRsp.getEvm();
                        if (evm != null) {
                            for (AddressAsset addressAsset : evm) {
                                java.util.ArrayList<ChainAddress> arrayListDjBIcL = actionBar.djBIcL();
                                if (!(arrayListDjBIcL instanceof java.util.Collection) || !arrayListDjBIcL.isEmpty()) {
                                    java.util.Iterator<T> it2 = arrayListDjBIcL.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        if (Intrinsics.EZpvd((java.lang.Object) ((ChainAddress) it2.next()).getAddress(), (java.lang.Object) addressAsset.getAddress())) {
                                            bigDecimal = C54862xYb.KWHzl(bigDecimal, addressAsset.getAmount());
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        java.util.List<AddressAsset> bitcoin = assetRsp.getBitcoin();
                        if (bitcoin != null) {
                            for (AddressAsset addressAsset2 : bitcoin) {
                                java.util.ArrayList<ChainAddress> arrayListCopydefault = actionBar.copydefault();
                                if (!(arrayListCopydefault instanceof java.util.Collection) || !arrayListCopydefault.isEmpty()) {
                                    java.util.Iterator<T> it3 = arrayListCopydefault.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            break;
                                        }
                                        if (Intrinsics.EZpvd((java.lang.Object) ((ChainAddress) it3.next()).getAddress(), (java.lang.Object) addressAsset2.getAddress())) {
                                            bigDecimal = C54862xYb.KWHzl(bigDecimal, addressAsset2.getAmount());
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                java.lang.String strConvertToString$default = C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
                actionBar.OLrzqt(strConvertToString$default);
                actionBar.EZpvd(C54880xYt.formatValuationFromAsset$default(strConvertToString$default, null, false, 0, false, 15, null));
            }
        }
        return new ResponseData(0, responseData.getMsg(), null, null, list, null, 44, null);
    }
}
