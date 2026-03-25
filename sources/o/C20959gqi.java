package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.constant.MultiTransferMode;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.constant.XRCTokenType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressGroupBean;
import com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressSourceGroup;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import java.util.LinkedHashMap;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9739bbK;
import o.InterfaceC9742bbN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gqi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C20959gqi extends AbstractC33073mpa {
    public int AhwBna;
    public boolean AkhnZx;
    public java.lang.Integer DbNXlk;
    public java.lang.String OLrzqt;
    public ExchangeAddressData djBIcL;
    public int valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public boolean AYXKKw = true;
    public java.util.ArrayList<AddressGroupBean> KWHzl = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> gEmmrt = new java.util.ArrayList<>();
    public final MutableLiveData<java.util.ArrayList<AddressGroupBean>> copydefault = new MutableLiveData<>();
    public final MutableLiveData<java.util.Map<java.lang.Integer, java.lang.Boolean>> values = new MutableLiveData<>();
    public java.lang.String EZpvd = "";
    public java.util.HashMap<java.lang.String, java.lang.Boolean> fetchVPNInfo = new java.util.HashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeAddressData AEQbTJ() {
        if (this.AYXKKw) {
            return this.djBIcL;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.Map<java.lang.Integer, java.lang.Boolean>> AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<AddressGroupBean>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.Boolean> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.String> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer valueOf() {
        return this.DbNXlk;
    }

    /* JADX INFO: renamed from: o.gqi$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gqi.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ void init$default(C20959gqi c20959gqi, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z, java.util.ArrayList arrayList, int i, ExchangeAddressData exchangeAddressData, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        c20959gqi.copydefault(fragment, str, str2, str3, num, (i2 & 32) != 0 ? false : z, arrayList, i, exchangeAddressData);
    }

    public final void copydefault(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final java.lang.String str, final java.lang.String str2, java.lang.String str3, java.lang.Integer num, final boolean z, @NotNull java.util.ArrayList<java.lang.String> arrayList, int i, ExchangeAddressData exchangeAddressData) {
        java.lang.String str4 = str3;
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = str4;
        this.DbNXlk = num;
        this.gEmmrt = arrayList;
        this.valueOf = i;
        this.djBIcL = exchangeAddressData;
        this.AYXKKw = exchangeAddressData == null;
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        if (str4 == null) {
            str4 = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        final C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(java.lang.Long.valueOf(java.lang.Long.parseLong(str4)));
        if (c10854bwMKWHzl == null) {
            return;
        }
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.gqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.KWHzl(this.copydefault, fragment, str, c10854bwMKWHzl, z, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEnsureInitialized$default.KWHzl(new InterfaceC58229yxO() { // from class: o.gqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20959gqi.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXKWHzl2 = C33527myD.KWHzl(abstractC58185ywXKWHzl);
        final Function1 function12 = new Function1() { // from class: o.gqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.EZpvd(this.EZpvd, str2, (Triple) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20959gqi.fetchVPNInfo(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C20959gqi.DbNXlk(function13, obj);
            }
        }));
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C20959gqi c20959gqi, androidx.fragment.app.Fragment fragment, java.lang.String str, C10854bwM c10854bwM, boolean z, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return c20959gqi.KWHzl(fragment, str, c10854bwM, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C20959gqi c20959gqi, java.lang.String str, Triple triple) {
        c20959gqi.djBIcL = (ExchangeAddressData) triple.getSecond();
        java.util.ArrayList<AddressGroupBean> arrayList = (java.util.ArrayList) triple.getThird();
        c20959gqi.KWHzl = arrayList;
        if (C10854bwM.isXRCToken$default((C10854bwM) triple.getFirst(), null, 1, null)) {
            MutableLiveData<java.util.ArrayList<AddressGroupBean>> mutableLiveData = c20959gqi.copydefault;
            java.util.ArrayList<AddressGroupBean> arrayList2 = new java.util.ArrayList<>();
            for (AddressGroupBean addressGroupBean : arrayList) {
                int addressGroup = addressGroupBean.getAddressGroup();
                java.lang.String title = addressGroupBean.getTitle();
                java.util.ArrayList<AddressChildBean> dataList = addressGroupBean.getDataList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : dataList) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((AddressChildBean) obj).getAddress(), (java.lang.Object) str)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2.add(new AddressGroupBean(addressGroup, title, arrayList3, addressGroupBean.getRootWalletId(), false, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null));
            }
            mutableLiveData.setValue(arrayList2);
        } else {
            c20959gqi.copydefault.setValue(arrayList);
        }
        c20959gqi.EZpvd = AddressGroupBean.Companion.EZpvd(((AddressGroupBean) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getAddressGroup());
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            c20959gqi.fetchVPNInfo.put(AddressGroupBean.Companion.EZpvd(((AddressGroupBean) it.next()).getAddressGroup()), java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C20959gqi c20959gqi, java.lang.Throwable th) {
        Activity activity = c20959gqi.new Activity();
        activity.OLrzqt(false);
        Intrinsics.copydefault(th);
        activity.AEQbTJ(C10857bwP.KWHzl("MultiSelectReceiveAddressViewModel", th));
        return Unit.INSTANCE;
    }

    public final java.util.List<C20832goN> AEQbTJ(@NotNull java.util.ArrayList<AddressGroupBean> arrayList) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((AddressGroupBean) obj2).getAddressGroup() == 3) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!((AddressGroupBean) next).getDataList().isEmpty()) {
                break;
            }
        }
        if (((AddressGroupBean) next) != null) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityServiceStubProxy);
            AddressSourceGroup addressSourceGroup = AddressSourceGroup.RECENT;
            listOLrzqt.add(new C20832goN(strAYXKKw, addressSourceGroup.getGroup(), addressSourceGroup));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            AddressGroupBean addressGroupBean = (AddressGroupBean) obj3;
            if (addressGroupBean.getAddressGroup() == 4 || addressGroupBean.getAddressGroup() == 1 || addressGroupBean.getAddressGroup() == 5) {
                arrayList3.add(obj3);
            }
        }
        java.util.Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (!((AddressGroupBean) next2).getDataList().isEmpty()) {
                break;
            }
        }
        if (((AddressGroupBean) next2) != null) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getActiveNotifications);
            AddressSourceGroup addressSourceGroup2 = AddressSourceGroup.MY_WALLET;
            listOLrzqt.add(new C20832goN(strAYXKKw2, addressSourceGroup2.getGroup(), addressSourceGroup2));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList) {
            if (((AddressGroupBean) obj4).getAddressGroup() == 2) {
                arrayList4.add(obj4);
            }
        }
        java.util.Iterator it3 = arrayList4.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next3 = it3.next();
            if (!((AddressGroupBean) next3).getDataList().isEmpty()) {
                obj = next3;
                break;
            }
        }
        if (((AddressGroupBean) obj) != null) {
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSmallIconBitmap);
            AddressSourceGroup addressSourceGroup3 = AddressSourceGroup.ADDRESS_BOOKS;
            listOLrzqt.add(new C20832goN(strAYXKKw3, addressSourceGroup3.getGroup(), addressSourceGroup3));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static /* synthetic */ AbstractC58185ywX createAddressInformation$default(C20959gqi c20959gqi, androidx.fragment.app.Fragment fragment, java.lang.String str, C10854bwM c10854bwM, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createAddressInformation");
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return c20959gqi.KWHzl(fragment, str, c10854bwM, z);
    }

    public final AbstractC58185ywX<Triple<C10854bwM, ExchangeAddressData, java.util.ArrayList<AddressGroupBean>>> KWHzl(final androidx.fragment.app.Fragment fragment, final java.lang.String str, final C10854bwM c10854bwM, final boolean z) {
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.gqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C20959gqi.copydefault(this.KWHzl, fragment, c10854bwM, interfaceC58257yxq);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.gqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.OLrzqt(this.OLrzqt, str, c10854bwM, z, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<Triple<C10854bwM, ExchangeAddressData, java.util.ArrayList<AddressGroupBean>>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20959gqi.AhwBna(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final void copydefault(C20959gqi c20959gqi, androidx.fragment.app.Fragment fragment, C10854bwM c10854bwM, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        if (c20959gqi.AYXKKw) {
            ((C21113gtd) new ViewModelProvider(fragment).get(C21113gtd.class)).AEQbTJ((80 & 1) != 0 ? false : c10854bwM.zsXlph(), fragment, java.lang.Integer.valueOf(c10854bwM.AxsJAY()), c10854bwM, (80 & 16) != 0 ? false : false, (80 & 32) != 0 ? false : dZP.OLrzqt.AhwBna().length() == 0, (80 & 64) != 0, (80 & 128) != 0 ? null : new Function1() { // from class: o.gqk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C20959gqi.AEQbTJ(interfaceC58257yxq, (ExchangeAddressData) obj);
                }
            });
            return;
        }
        interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, c20959gqi.djBIcL));
    }

    public static final Unit AEQbTJ(InterfaceC58257yxq interfaceC58257yxq, ExchangeAddressData exchangeAddressData) {
        interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, exchangeAddressData));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C20959gqi c20959gqi, java.lang.String str, C10854bwM c10854bwM, boolean z, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return c20959gqi.AEQbTJ((ExchangeAddressData) pair.getSecond(), dZP.OLrzqt.AhwBna(), str, c10854bwM, z);
    }

    public static /* synthetic */ AbstractC58260yxt handleCreateAddressInformation$default(C20959gqi c20959gqi, ExchangeAddressData exchangeAddressData, java.lang.String str, java.lang.String str2, C10854bwM c10854bwM, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleCreateAddressInformation");
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return c20959gqi.AEQbTJ(exchangeAddressData, str, str2, c10854bwM, z);
    }

    public final AbstractC58260yxt<Triple<C10854bwM, ExchangeAddressData, java.util.ArrayList<AddressGroupBean>>> AEQbTJ(final ExchangeAddressData exchangeAddressData, final java.lang.String str, final java.lang.String str2, final C10854bwM c10854bwM, final boolean z) {
        final java.util.ArrayList arrayList = new java.util.ArrayList(12);
        final java.util.HashMap map = new java.util.HashMap();
        final java.lang.String strDjBIcL = c10854bwM.djBIcL();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final boolean zDarRvM = c10854bwM.DarRvM();
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.gqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.KWHzl(arrayList, z, strDjBIcL, objectRef, c10854bwM, this, zDarRvM, str2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = allRootWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.gqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20959gqi.valueOf(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.OLrzqt(arrayList, z, strDjBIcL, objectRef, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20959gqi.djBIcL(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.gqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C20959gqi.EZpvd(exchangeAddressData, c10854bwM, arrayList, str, str2, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<Triple<C10854bwM, ExchangeAddressData, java.util.ArrayList<AddressGroupBean>>> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.gqr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C20959gqi.values(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu OLrzqt(java.util.ArrayList arrayList, boolean z, java.lang.String str, Ref.ObjectRef objectRef, java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AddressBookEntity addressBookEntity = (AddressBookEntity) it.next();
                arrayList2.add(new AddressChildBean(addressBookEntity.getName(), addressBookEntity.getAddress(), addressBookEntity.getName(), false, null, 0, false, addressBookEntity.isSmartContract(), null, 2, null, false, false, false, null, 32120, null));
                map.put(addressBookEntity.getAddress(), addressBookEntity.getName());
            }
            ((AddressChildBean) CollectionsKt___CollectionsKt.AubY(arrayList2)).setLineShow(false);
            arrayList.add(new AddressGroupBean(2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fDu), arrayList2, "", false, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null));
        }
        if (z) {
            return cGL.KWHzl.KWHzl(str, (java.lang.String) objectRef.element);
        }
        return cGL.KWHzl.AEQbTJ(str, (java.lang.String) objectRef.element);
    }

    public static final Triple values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple EZpvd(ExchangeAddressData exchangeAddressData, C10854bwM c10854bwM, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.util.HashMap map, java.util.List list) {
        java.util.List<ExchangeAddressData.AddressBean> exChangeAddressList;
        Intrinsics.checkNotNullParameter(list, "");
        if (exchangeAddressData != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (Intrinsics.EZpvd(exchangeAddressData.isExchangeSupport(), java.lang.Boolean.TRUE) && (exChangeAddressList = exchangeAddressData.getExChangeAddressList()) != null && (!exChangeAddressList.isEmpty()) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                for (ExchangeAddressData.AddressBean addressBean : exchangeAddressData.getExChangeAddressList()) {
                    java.lang.String address = addressBean.getAddress();
                    java.lang.String str3 = address == null ? "" : address;
                    java.lang.String tag = addressBean.getTag();
                    arrayList2.add(new AddressChildBean(str, str3, str, false, null, 0, false, false, str2, 1, tag == null ? "" : tag, false, false, false, null, 30840, null));
                }
                ((AddressChildBean) CollectionsKt___CollectionsKt.AubY(arrayList2)).setLineShow(false);
                arrayList.add(0, new AddressGroupBean(1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getIntentSender), arrayList2, "", false, false, true, 48, null));
            }
        }
        if (list.isEmpty()) {
            return new Triple(c10854bwM, exchangeAddressData, arrayList);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        arrayList.add(0, new AddressGroupBean(3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.gFTCsA), arrayList3, "", false, false, false, WalletImportError.ERROR_CODE_AA_EXIST, null));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            SendCoinRecordEntity sendCoinRecordEntity = (SendCoinRecordEntity) it.next();
            if (map.containsKey(sendCoinRecordEntity.getAddress())) {
                java.lang.String str4 = (java.lang.String) map.get(sendCoinRecordEntity.getAddress());
                arrayList3.add(new AddressChildBean(str4 == null ? "" : str4, sendCoinRecordEntity.getAddress(), null, false, null, 0, false, sendCoinRecordEntity.isSmartContract(), sendCoinRecordEntity.getWalletId(), 3, null, false, false, false, null, 31868, null));
            } else {
                arrayList3.add(new AddressChildBean("", sendCoinRecordEntity.getAddress(), null, false, null, 0, false, sendCoinRecordEntity.isSmartContract(), sendCoinRecordEntity.getWalletId(), 3, null, false, false, false, null, 31868, null));
            }
        }
        if (!arrayList3.isEmpty()) {
            ((AddressChildBean) CollectionsKt___CollectionsKt.AubY(arrayList3)).setLineShow(false);
        }
        return new Triple(c10854bwM, exchangeAddressData, arrayList);
    }

    private final void OLrzqt(java.util.ArrayList<AddressGroupBean> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!((AddressGroupBean) CollectionsKt___CollectionsKt.AubY(arrayList)).getDataList().isEmpty()) {
            ((AddressChildBean) CollectionsKt___CollectionsKt.AubY(((AddressGroupBean) CollectionsKt___CollectionsKt.AubY(arrayList)).getDataList())).setLineShow(false);
        } else {
            Intrinsics.copydefault(arrayList.remove(yDY.AuCTel(arrayList)));
        }
    }

    public final void EZpvd(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AkhnZx = false;
        java.util.ArrayList<AddressGroupBean> value = this.copydefault.getValue();
        if (value != null) {
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                for (AddressChildBean addressChildBean : ((AddressGroupBean) it.next()).getDataList()) {
                    if (addressChildBean.isSelected()) {
                        addressChildBean.setSelected(false);
                    }
                    if (i == 1 || i == 2 || i == 3) {
                        if (addressChildBean.getAddressGroup() == i && Intrinsics.EZpvd((java.lang.Object) addressChildBean.getAddress(), (java.lang.Object) str2)) {
                            addressChildBean.setSelected(true);
                            if (addressChildBean.getAddressGroup() == 1) {
                                this.AkhnZx = true;
                            }
                        }
                    } else if (i == 4 || i == 5) {
                        if (addressChildBean.getAddressGroup() == i && Intrinsics.EZpvd((java.lang.Object) addressChildBean.getWalletId(), (java.lang.Object) str)) {
                            addressChildBean.setSelected(true);
                        }
                    }
                }
            }
        }
        MutableLiveData<java.util.ArrayList<AddressGroupBean>> mutableLiveData = this.copydefault;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    public final void AEQbTJ(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int size = EZpvd().size();
        int i4 = (100 - this.valueOf) - size;
        int size2 = (this.gEmmrt.size() - this.valueOf) - size;
        this.AkhnZx = false;
        java.util.ArrayList<AddressGroupBean> value = this.copydefault.getValue();
        int i5 = 5;
        if (value != null) {
            java.util.ArrayList<AddressGroupBean> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                if (((AddressGroupBean) obj).getAddressGroup() == i) {
                    arrayList.add(obj);
                }
            }
            loop1: for (AddressGroupBean addressGroupBean : arrayList) {
                if (i == 1 || i == 2 || i == 3) {
                    Ref.IntRef intRef = new Ref.IntRef();
                    java.util.ArrayList<AddressChildBean> dataList = addressGroupBean.getDataList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : dataList) {
                        if (((AddressChildBean) obj2).isSelected()) {
                            arrayList2.add(obj2);
                        }
                    }
                    intRef.element = arrayList2.size();
                    for (AddressChildBean addressChildBean : addressGroupBean.getDataList()) {
                        if (addressChildBean.getAddressGroup() == i && Intrinsics.EZpvd((java.lang.Object) addressChildBean.getAddress(), (java.lang.Object) str2)) {
                            if (AEQbTJ(i4, size2, 0, addressChildBean.isSelected())) {
                                break loop1;
                            }
                            addressChildBean.setSelected(!addressChildBean.isSelected());
                            intRef.element = addressChildBean.isSelected() ? intRef.element + 1 : intRef.element - 1;
                            if (addressChildBean.getAddressGroup() == 1) {
                                this.AkhnZx = addressChildBean.isSelected();
                            }
                        }
                    }
                    boolean z = intRef.element == addressGroupBean.getDataList().size();
                    if (i == 1) {
                        addressGroupBean.setSelected(z);
                    } else {
                        this.fetchVPNInfo.put(AddressGroupBean.Companion.EZpvd(addressGroupBean.getAddressGroup()), java.lang.Boolean.valueOf(z));
                    }
                    i5 = 5;
                } else {
                    if (i == 4 || i == i5) {
                        Ref.IntRef intRef2 = new Ref.IntRef();
                        java.util.ArrayList<AddressChildBean> dataList2 = addressGroupBean.getDataList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : dataList2) {
                            if (((AddressChildBean) obj3).isSelected()) {
                                arrayList3.add(obj3);
                            }
                        }
                        intRef2.element = arrayList3.size();
                        for (AddressChildBean addressChildBean2 : addressGroupBean.getDataList()) {
                            if (addressChildBean2.getAddressGroup() == i && Intrinsics.EZpvd((java.lang.Object) addressChildBean2.getWalletId(), (java.lang.Object) str)) {
                                if (AEQbTJ(i4, size2, 0, addressChildBean2.isSelected())) {
                                    break loop1;
                                }
                                addressChildBean2.setSelected(!addressChildBean2.isSelected());
                                intRef2.element = addressChildBean2.isSelected() ? intRef2.element + 1 : intRef2.element - 1;
                            }
                        }
                        boolean z2 = intRef2.element == addressGroupBean.getDataList().size();
                        if (i == 3) {
                            this.fetchVPNInfo.put(AddressGroupBean.Companion.EZpvd(addressGroupBean.getAddressGroup()), java.lang.Boolean.valueOf(z2));
                        } else {
                            addressGroupBean.setSelected(z2);
                        }
                    }
                    i5 = 5;
                }
            }
        }
        if (i == 1 || i == 4 || i == 5) {
            java.util.ArrayList<AddressGroupBean> value2 = this.copydefault.getValue();
            if (value2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj4 : value2) {
                    AddressGroupBean addressGroupBean2 = (AddressGroupBean) obj4;
                    if (addressGroupBean2.getAddressGroup() == 1 || addressGroupBean2.getAddressGroup() == 4) {
                        arrayList4.add(obj4);
                    } else if (addressGroupBean2.getAddressGroup() == 5) {
                        arrayList4.add(obj4);
                    }
                }
                java.util.Iterator it = arrayList4.iterator();
                i2 = 0;
                i3 = 0;
                while (it.hasNext()) {
                    i2++;
                    if (((AddressGroupBean) it.next()).isSelected()) {
                        i3++;
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
            this.fetchVPNInfo.put(AddressGroupBean.Companion.EZpvd(i), java.lang.Boolean.valueOf(i2 == i3));
        }
        MutableLiveData<java.util.ArrayList<AddressGroupBean>> mutableLiveData = this.copydefault;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    public final boolean AEQbTJ(int i, int i2, int i3, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<java.lang.Integer, java.lang.Boolean> value = this.values.getValue();
        if (value != null) {
            linkedHashMap.putAll(value);
        }
        boolean z2 = false;
        boolean z3 = true;
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i3)) && !z) {
            linkedHashMap.put(0, java.lang.Boolean.TRUE);
            this.values.postValue(linkedHashMap);
            z2 = true;
        } else {
            linkedHashMap.put(0, java.lang.Boolean.FALSE);
        }
        if (C33129mqd.valueOf(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)) && values() && !z) {
            linkedHashMap.put(1, java.lang.Boolean.TRUE);
        } else {
            linkedHashMap.put(1, java.lang.Boolean.FALSE);
            z3 = z2;
        }
        this.values.postValue(linkedHashMap);
        return z3;
    }

    public final void KWHzl(@NotNull java.lang.String str, int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(str, "");
        int i5 = 0;
        this.AkhnZx = false;
        int size = EZpvd().size();
        int i6 = this.valueOf;
        int size2 = this.gEmmrt.size();
        int i7 = this.valueOf;
        java.util.ArrayList<AddressGroupBean> value = this.copydefault.getValue();
        int i8 = 5;
        int i9 = 4;
        int i10 = 1;
        if (value != null) {
            java.util.ArrayList<AddressGroupBean> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                if (((AddressGroupBean) obj).getAddressGroup() == i) {
                    arrayList.add(obj);
                }
            }
            for (AddressGroupBean addressGroupBean : arrayList) {
                if (addressGroupBean.getAddressGroup() == i10 || ((addressGroupBean.getAddressGroup() == i8 || addressGroupBean.getAddressGroup() == i9) && Intrinsics.EZpvd((java.lang.Object) addressGroupBean.getRootWalletId(), (java.lang.Object) str))) {
                    int i11 = i5;
                    int i12 = i11;
                    for (AddressChildBean addressChildBean : addressGroupBean.getDataList()) {
                        if (AEQbTJ((100 - i6) - size, (size2 - i7) - size, i12, addressChildBean.isSelected())) {
                            i4 = 1;
                            i11 = 1;
                        } else {
                            boolean zIsSelected = addressChildBean.isSelected();
                            addressChildBean.setSelected(!addressGroupBean.isSelected());
                            if (addressChildBean.isSelected() && !zIsSelected) {
                                i12++;
                            }
                            i4 = 1;
                            if (addressChildBean.getAddressGroup() == 1) {
                                this.AkhnZx = addressChildBean.isSelected();
                            }
                        }
                        i10 = i4;
                    }
                    int i13 = i10;
                    if (i11 == 0) {
                        addressGroupBean.setSelected(addressGroupBean.isSelected() ^ i13);
                    }
                }
                i5 = 0;
                i8 = 5;
                i9 = 4;
                i10 = 1;
            }
        }
        java.util.ArrayList<AddressGroupBean> value2 = this.copydefault.getValue();
        if (value2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : value2) {
                AddressGroupBean addressGroupBean2 = (AddressGroupBean) obj2;
                if (addressGroupBean2.getAddressGroup() == 1 || addressGroupBean2.getAddressGroup() == 4 || addressGroupBean2.getAddressGroup() == 5) {
                    arrayList2.add(obj2);
                }
            }
            z = true;
            java.util.Iterator it = arrayList2.iterator();
            i2 = 0;
            i3 = 0;
            while (it.hasNext()) {
                i2++;
                if (((AddressGroupBean) it.next()).isSelected()) {
                    i3++;
                }
            }
        } else {
            z = true;
            i2 = 0;
            i3 = 0;
        }
        this.fetchVPNInfo.put(AddressGroupBean.Companion.EZpvd(i), java.lang.Boolean.valueOf(i2 == i3 ? z : false));
        MutableLiveData<java.util.ArrayList<AddressGroupBean>> mutableLiveData = this.copydefault;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = false;
        this.AkhnZx = false;
        int size = EZpvd().size();
        int i = this.valueOf;
        int size2 = this.gEmmrt.size();
        int i2 = this.valueOf;
        java.util.List<java.lang.Integer> listCopydefault = AddressGroupBean.Companion.copydefault(str);
        java.lang.Boolean bool = this.fetchVPNInfo.get(str);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        java.util.ArrayList<AddressGroupBean> value = this.copydefault.getValue();
        if (value != null) {
            java.util.ArrayList<AddressGroupBean> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : value) {
                if (listCopydefault.contains(java.lang.Integer.valueOf(((AddressGroupBean) obj).getAddressGroup()))) {
                    arrayList.add(obj);
                }
            }
            int i3 = 0;
            for (AddressGroupBean addressGroupBean : arrayList) {
                java.util.Iterator<T> it = addressGroupBean.getDataList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        AddressChildBean addressChildBean = (AddressChildBean) it.next();
                        if (AEQbTJ((100 - i) - size, (size2 - i2) - size, i3, addressChildBean.isSelected())) {
                            z = true;
                            break;
                        }
                        boolean zIsSelected = addressChildBean.isSelected();
                        addressChildBean.setSelected(!zBooleanValue);
                        if (addressChildBean.isSelected() && !zIsSelected) {
                            i3++;
                        }
                        if (addressChildBean.getAddressGroup() == 1) {
                            this.AkhnZx = addressChildBean.isSelected();
                        }
                    } else if (!z) {
                        addressGroupBean.setSelected(!zBooleanValue);
                    }
                }
            }
            if (!z) {
                this.fetchVPNInfo.put(str, java.lang.Boolean.valueOf(true ^ zBooleanValue));
            }
        }
        MutableLiveData<java.util.ArrayList<AddressGroupBean>> mutableLiveData = this.copydefault;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<AddressGroupBean> value = this.copydefault.getValue();
        if (value != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
            for (AddressGroupBean addressGroupBean : value) {
                if (Intrinsics.EZpvd((java.lang.Object) addressGroupBean.getRootWalletId(), (java.lang.Object) str)) {
                    addressGroupBean.setExpanded(z);
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        MutableLiveData<java.util.ArrayList<AddressGroupBean>> mutableLiveData = this.copydefault;
        mutableLiveData.postValue(mutableLiveData.getValue());
    }

    public final java.util.ArrayList<AddressChildBean> EZpvd() {
        java.util.ArrayList<AddressChildBean> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<AddressGroupBean> value = this.copydefault.getValue();
        if (value != null) {
            java.util.Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                for (AddressChildBean addressChildBean : ((AddressGroupBean) it.next()).getDataList()) {
                    if (addressChildBean.isSelected()) {
                        arrayList.add(addressChildBean);
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean AkhnZx() {
        return DbNXlk() || values();
    }

    public final boolean DbNXlk() {
        java.lang.Integer num = this.DbNXlk;
        return num != null && num.intValue() == MultiTransferMode.MODE_ONE_TO_MANY.getValue();
    }

    public final boolean values() {
        java.lang.Integer num = this.DbNXlk;
        return num != null && num.intValue() == MultiTransferMode.MODE_MANY_TO_MANY.getValue();
    }

    /* JADX INFO: renamed from: o.gqi$Activity */
    public final class Activity {
        public boolean AEQbTJ;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(boolean z) {
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.CharSequence] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC58261yxu KWHzl(java.util.ArrayList arrayList, boolean z, java.lang.String str, Ref.ObjectRef objectRef, C10854bwM c10854bwM, C20959gqi c20959gqi, boolean z2, java.lang.String str2, java.util.List list) {
        java.lang.String str3;
        java.util.Iterator it;
        java.lang.String str4;
        java.util.Iterator it2;
        C10525bqB c10525bqB;
        java.util.Iterator it3;
        C10854bwM c10854bwMKWHzl;
        C10525bqB c10525bqB2;
        java.lang.String str5;
        java.util.Iterator it4;
        C10854bwM c10854bwM2 = c10854bwM;
        java.lang.String str6 = "";
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it5.next();
            if ((abstractC12784ctX.AEQbTJ() || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) && !(C10854bwM.isXRCToken$default(c10854bwM2, null, 1, null) && abstractC12784ctX.fJNWhG() == WalletType.HardwareWallet)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                    if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                        if ((abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) && abstractC12782ctV.Dmq()) {
                            if (c10854bwM2 != null) {
                                str5 = str6;
                                it4 = it5;
                                if (c10854bwM2.copydefault(XRCTokenType.Brc20sToken, XRCTokenType.Arc20Token, XRCTokenType.SRC20Token, XRCTokenType.RunesToken, XRCTokenType.RunesMainToken)) {
                                }
                            } else {
                                str5 = str6;
                                it4 = it5;
                            }
                            if (!z2 || !abstractC12782ctV.getFieldNames()) {
                                arrayList3.add(obj);
                            }
                        } else {
                            str5 = str6;
                            it4 = it5;
                        }
                    }
                    str6 = str5;
                    it5 = it4;
                }
                str3 = str6;
                it = it5;
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) it6.next();
                    if (c10854bwM.DarRvM()) {
                        ChainAddress chainAddressOLrzqt = abstractC12782ctV2.OLrzqt(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                        if (chainAddressOLrzqt != null) {
                            java.lang.String address = chainAddressOLrzqt.getAddress();
                            str4 = address;
                            if (address == null) {
                                str4 = str3;
                            }
                        }
                    } else {
                        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, C33129mqd.valueOf(java.lang.Long.valueOf(c10854bwM.AEQbTJ())), null, 2, null);
                        if (chainAddressAddressFromChainId$default != null) {
                            java.lang.String address2 = chainAddressAddressFromChainId$default.getAddress();
                            str4 = address2;
                            if (address2 == null) {
                            }
                        }
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV2.DbNXlk(), (java.lang.Object) str2)) {
                        objectRef.element = str4;
                    }
                    if (str4.length() == 0) {
                        it2 = it6;
                    } else {
                        long j = -1;
                        if (c10854bwM.dxcTrN()) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            for (ChainAddress chainAddress : abstractC12782ctV2.EZpvd()) {
                                if (c10854bwM.fetchVPNInfo() == chainAddress.getChainId() && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null && c10854bwMKWHzl.AhwBna() == chainAddress.getCoinId()) {
                                    java.lang.Object objValueOf = c20959gqi.OLrzqt;
                                    if (objValueOf == null) {
                                        objValueOf = java.lang.Long.valueOf(j);
                                    }
                                    java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV2.AYXKKw(C33129mqd.valueOf(objValueOf));
                                    if (listAYXKKw == null || (c10525bqB2 = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw)) == null) {
                                        it3 = it6;
                                    } else {
                                        it3 = it6;
                                        java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB2, false, false, 3, null);
                                        java.lang.String str7 = displayAmount$default != null ? displayAmount$default : "0";
                                        arrayList4.add(new AddressChildBean(abstractC12782ctV2.AkhnZx(), chainAddress.getAddress(), abstractC12782ctV2.AYXKKw(), false, new AddressData(chainAddress.getAddressType(), false, false, null, 14, null).getAddressFormat(), chainAddress.getAddressType(), false, abstractC12782ctV2.getFieldNames(), abstractC12782ctV2.DbNXlk(), 4, null, false, false, true, str7, 7168, null));
                                    }
                                    arrayList4.add(new AddressChildBean(abstractC12782ctV2.AkhnZx(), chainAddress.getAddress(), abstractC12782ctV2.AYXKKw(), false, new AddressData(chainAddress.getAddressType(), false, false, null, 14, null).getAddressFormat(), chainAddress.getAddressType(), false, abstractC12782ctV2.getFieldNames(), abstractC12782ctV2.DbNXlk(), 4, null, false, false, true, str7, 7168, null));
                                } else {
                                    it3 = it6;
                                }
                                it6 = it3;
                                j = -1;
                            }
                            it2 = it6;
                            if (!arrayList4.isEmpty()) {
                                java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList4, C10536bqM.AEQbTJ);
                                ((AddressChildBean) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd)).setAccountNameShow(true);
                                arrayList2.addAll(listEZpvd);
                                ((AddressChildBean) CollectionsKt___CollectionsKt.AubY(arrayList2)).setLineShow(true);
                            }
                            it6 = it2;
                        } else {
                            it2 = it6;
                            java.lang.Object obj2 = c20959gqi.OLrzqt;
                            if (obj2 == null) {
                                obj2 = -1L;
                            }
                            java.util.List<C10525bqB> listAYXKKw2 = abstractC12782ctV2.AYXKKw(C33129mqd.valueOf(obj2));
                            if (listAYXKKw2 != null && (c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw2)) != null) {
                                java.lang.String displayAmount$default2 = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, false, 3, null);
                                java.lang.String str8 = displayAmount$default2 != null ? displayAmount$default2 : "0";
                                arrayList2.add(new AddressChildBean(abstractC12782ctV2.AkhnZx(), str4, abstractC12782ctV2.AYXKKw(), false, null, 0, false, abstractC12782ctV2.getFieldNames(), abstractC12782ctV2.DbNXlk(), 4, null, false, false, true, str8, 7288, null));
                                it6 = it2;
                            }
                            arrayList2.add(new AddressChildBean(abstractC12782ctV2.AkhnZx(), str4, abstractC12782ctV2.AYXKKw(), false, null, 0, false, abstractC12782ctV2.getFieldNames(), abstractC12782ctV2.DbNXlk(), 4, null, false, false, true, str8, 7288, null));
                            it6 = it2;
                        }
                    }
                    it6 = it2;
                }
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new AddressGroupBean(4, abstractC12784ctX.AuCTel(), arrayList2, abstractC12784ctX.EZpvd(), false, false, true, 48, null));
                    c20959gqi.OLrzqt((java.util.ArrayList<AddressGroupBean>) arrayList);
                }
            } else {
                str3 = str6;
                it = it5;
            }
            c10854bwM2 = c10854bwM;
            str6 = str3;
            it5 = it;
        }
        AddressGroupBean addressGroupBean = (AddressGroupBean) CollectionsKt___CollectionsKt.wlaJM(arrayList);
        if (addressGroupBean != null) {
            addressGroupBean.setShowDivider(false);
        }
        if (z) {
            return cGN.EZpvd.copydefault(str, (java.lang.String) objectRef.element);
        }
        return cGN.EZpvd.OLrzqt(str, (java.lang.String) objectRef.element);
    }
}
