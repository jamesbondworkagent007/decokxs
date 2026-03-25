package o;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.constant.XRCTokenType;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.tx.wallet.OkTransactionWallet;
import com.okinc.business.defi.biz.database.addressbook.entity.AddressBookEntity;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AABook;
import com.okinc.business.defi.biz.net.bean.ChainInfo;
import com.okinc.business.defi.biz.net.bean.CheckAddressResp;
import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import com.okinc.business.defi.biz.net.bean.Notice;
import com.okinc.business.defi.biz.net.bean.ParseENSResp;
import com.okinc.business.defi.biz.net.bean.TxToastCheckReq;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import com.okinc.business.defi.wallet.tx.send.adapter.SendCoinGroup;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.AddressType;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C12827cuN;
import o.C13754dXa;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19589gHz extends AbstractC33073mpa {
    public boolean AYXKKw;
    public java.lang.String EZpvd;
    public final InterfaceC14674dps OLrzqt;
    public ExchangeAddressData copydefault;
    public boolean djBIcL;
    public boolean gEmmrt;
    public boolean valueOf;
    public final C12394cmC fetchVPNInfo = new C12394cmC();
    public final C13934dbu values = new C13934dbu();
    public java.lang.String isConnected = "";
    public boolean AhwBna = true;
    public java.util.ArrayList<C19574gHk> KWHzl = new java.util.ArrayList<>();
    public final MutableLiveData<java.util.ArrayList<C19574gHk>> AEQbTJ = new MutableLiveData<>();
    public final MutableLiveData<StateListAnimator> DbNXlk = new MutableLiveData<>();
    public final MutableLiveData<C19577gHn> AkhnZx = new MutableLiveData<>();
    public int fIwbmz = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C19577gHn> AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AhwBna = z;
    }

    public final boolean KWHzl(char c) {
        return c == 0 || c == '\t' || c == '\n' || c == '\r' || (c >= ' ' && c <= 55295) || ((c >= 57344 && c <= 65533) || (c >= 0 && c <= 65535));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<C19574gHk>> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.djBIcL = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<StateListAnimator> gEmmrt() {
        return this.DbNXlk;
    }

    public C19589gHz() {
        java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
        Intrinsics.copydefault(objEZpvd, "");
        this.OLrzqt = new C14679dpx((android.content.ClipboardManager) objEZpvd);
    }

    public final void OLrzqt(@NotNull final androidx.fragment.app.Fragment fragment, @NotNull final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final TransactionInfo transactionInfo, final boolean z, int i) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str3;
        this.fIwbmz = i;
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        final Function1 function1 = new Function1() { // from class: o.gHN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.EZpvd(this.EZpvd, str, str2, str3, transactionInfo, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEnsureInitialized$default.KWHzl(new InterfaceC58229yxO() { // from class: o.gHW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.wlaJM(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.copydefault(this.AEQbTJ, fragment, str, z, (OkTransactionWallet) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.gIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.AuCTelauCTel(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXKWHzl3 = C33527myD.KWHzl(abstractC58185ywXKWHzl2);
        final Function1 function13 = new Function1() { // from class: o.gHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.OLrzqt(this.copydefault, str2, (kotlin.Pair) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gIa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19589gHz.iwGUEr(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.gHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.EZpvd(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        call().AEQbTJ(abstractC58185ywXKWHzl3.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19589gHz.getFieldNames(function14, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C19589gHz c19589gHz, java.lang.String str, java.lang.String str2, java.lang.String str3, TransactionInfo transactionInfo, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return c19589gHz.fetchVPNInfo.EZpvd(str, str2, str3, transactionInfo).EZpvd();
    }

    public static final InterfaceC60096zvd AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C19589gHz c19589gHz, final androidx.fragment.app.Fragment fragment, java.lang.String str, boolean z, final OkTransactionWallet okTransactionWallet) {
        Intrinsics.checkNotNullParameter(okTransactionWallet, "");
        AbstractC58185ywX<kotlin.Pair<ExchangeAddressData, java.util.ArrayList<C19574gHk>>> abstractC58185ywXCopydefault = c19589gHz.copydefault(fragment, str, okTransactionWallet.getCoinMeta(), z);
        final Function1 function1 = new Function1() { // from class: o.gHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.AEQbTJ(fragment, c19589gHz, okTransactionWallet, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.gHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.AubY(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(androidx.fragment.app.Fragment fragment, final C19589gHz c19589gHz, final OkTransactionWallet okTransactionWallet, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        android.content.Context context = fragment.getContext();
        if (context == null || !C43453rpa.AEQbTJ.KWHzl(context)) {
            StateListAnimator stateListAnimator = c19589gHz.new StateListAnimator();
            stateListAnimator.EZpvd(false);
            stateListAnimator.AEQbTJ(false);
            stateListAnimator.EZpvd(okTransactionWallet);
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(stateListAnimator, pair));
        }
        Intrinsics.copydefault(okTransactionWallet);
        AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<ChainInfo>>> abstractC58185ywXKWHzl = c19589gHz.KWHzl(okTransactionWallet);
        final Function1 function1 = new Function1() { // from class: o.gHV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.KWHzl(this.OLrzqt, pair, okTransactionWallet, (kotlin.Pair) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gHX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.getNewProxyInstance(function1, obj);
            }
        });
    }

    public static final kotlin.Pair getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(C19589gHz c19589gHz, kotlin.Pair pair, OkTransactionWallet okTransactionWallet, kotlin.Pair pair2) {
        java.lang.String withdrawMsg;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(pair2, "");
        StateListAnimator stateListAnimator = c19589gHz.new StateListAnimator();
        stateListAnimator.EZpvd(okTransactionWallet);
        if (((java.lang.Boolean) pair2.getFirst()).booleanValue()) {
            stateListAnimator.EZpvd(true);
        } else {
            stateListAnimator.EZpvd(false);
            ChainInfo chainInfo = (ChainInfo) ((ResponseData) pair2.getSecond()).getData();
            if (chainInfo != null && !chainInfo.getCanWithdraw()) {
                stateListAnimator.KWHzl(false);
                ChainInfo chainInfo2 = (ChainInfo) ((ResponseData) pair2.getSecond()).getData();
                if (chainInfo2 != null && (withdrawMsg = chainInfo2.getWithdrawMsg()) != null) {
                    str = withdrawMsg;
                }
                stateListAnimator.OLrzqt(str);
            } else {
                stateListAnimator.KWHzl(true);
                stateListAnimator.OLrzqt(((ResponseData) pair2.getSecond()).getMsg());
            }
        }
        return C56390yDp.OLrzqt(stateListAnimator, pair);
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C19589gHz c19589gHz, java.lang.String str, kotlin.Pair pair) {
        StateListAnimator stateListAnimator = (StateListAnimator) pair.getFirst();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        kotlin.Pair pair2 = (kotlin.Pair) second;
        java.util.ArrayList<C19574gHk> arrayList = (java.util.ArrayList) pair2.getSecond();
        c19589gHz.DbNXlk.setValue(stateListAnimator);
        c19589gHz.copydefault = (ExchangeAddressData) pair2.getFirst();
        c19589gHz.KWHzl = arrayList;
        if (C10854bwM.isXRCToken$default(stateListAnimator.OLrzqt().getCoinMeta(), null, 1, null)) {
            MutableLiveData<java.util.ArrayList<C19574gHk>> mutableLiveData = c19589gHz.AEQbTJ;
            java.util.ArrayList<C19574gHk> arrayList2 = new java.util.ArrayList<>();
            for (C19574gHk c19574gHk : arrayList) {
                int iKWHzl = c19574gHk.KWHzl();
                java.lang.String strAEQbTJ = c19574gHk.AEQbTJ();
                java.util.ArrayList<C19577gHn> arrayListCopydefault = c19574gHk.copydefault();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayListCopydefault) {
                    if (!Intrinsics.EZpvd((java.lang.Object) ((C19577gHn) obj).OLrzqt(), (java.lang.Object) str)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2.add(new C19574gHk(iKWHzl, strAEQbTJ, arrayList3));
            }
            mutableLiveData.setValue(arrayList2);
        } else {
            c19589gHz.AEQbTJ.setValue(arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C19589gHz c19589gHz, java.lang.Throwable th) {
        StateListAnimator stateListAnimator = c19589gHz.new StateListAnimator();
        stateListAnimator.EZpvd(false);
        stateListAnimator.KWHzl(true);
        Intrinsics.copydefault(th);
        stateListAnimator.OLrzqt(C10857bwP.KWHzl("SendCoinAddressViewModel", th));
        c19589gHz.DbNXlk.setValue(stateListAnimator);
        return Unit.INSTANCE;
    }

    public final java.util.List<C19579gHp> EZpvd(@NotNull java.util.ArrayList<C19574gHk> arrayList) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (((C19574gHk) obj2).KWHzl() == 3) {
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
            if (!((C19574gHk) next).copydefault().isEmpty()) {
                break;
            }
        }
        if (((C19574gHk) next) != null) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityServiceStubProxy);
            SendCoinGroup sendCoinGroup = SendCoinGroup.RECENT;
            listOLrzqt.add(new C19579gHp(strAYXKKw, sendCoinGroup.getGroup(), sendCoinGroup));
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            C19574gHk c19574gHk = (C19574gHk) obj3;
            if (c19574gHk.KWHzl() == 4 || c19574gHk.KWHzl() == 1 || c19574gHk.KWHzl() == 5) {
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
            if (!((C19574gHk) next2).copydefault().isEmpty()) {
                break;
            }
        }
        if (((C19574gHk) next2) != null) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getActiveNotifications);
            SendCoinGroup sendCoinGroup2 = SendCoinGroup.MY_WALLET;
            listOLrzqt.add(new C19579gHp(strAYXKKw2, sendCoinGroup2.getGroup(), sendCoinGroup2));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList) {
            if (((C19574gHk) obj4).KWHzl() == 2) {
                arrayList4.add(obj4);
            }
        }
        java.util.Iterator it3 = arrayList4.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next3 = it3.next();
            if (!((C19574gHk) next3).copydefault().isEmpty()) {
                obj = next3;
                break;
            }
        }
        if (((C19574gHk) obj) != null) {
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getSmallIconBitmap);
            SendCoinGroup sendCoinGroup3 = SendCoinGroup.ADDRESS_BOOKS;
            listOLrzqt.add(new C19579gHp(strAYXKKw3, sendCoinGroup3.getGroup(), sendCoinGroup3));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    /* JADX DEBUG: Type inference failed for r13v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.Boolean, com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.net.bean.ChainInfo>>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<ChainInfo>>> KWHzl(OkTransactionWallet okTransactionWallet) {
        if (okTransactionWallet.getCoinMeta().DarRvM()) {
            AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, ResponseData<ChainInfo>>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, new ResponseData(0, null, null, null, new ChainInfo(false, (java.lang.String) null, true, (java.lang.String) null, (Notice) null, 27, (DefaultConstructorMarker) null), null, 46, null)));
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<ChainInfo>> abstractC58185ywXAEQbTJ = this.values.AEQbTJ(okTransactionWallet.getWallet().USBtdM(), okTransactionWallet.getWallet().DbNXlk(), okTransactionWallet.getCoinMeta().AhwBna(), okTransactionWallet.getAddress(), this.fIwbmz);
        final Function1 function1 = new Function1() { // from class: o.gHU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.KWHzl((ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.gHT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final kotlin.Pair fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static /* synthetic */ AbstractC58185ywX createAddressInformation$default(C19589gHz c19589gHz, androidx.fragment.app.Fragment fragment, java.lang.String str, C10854bwM c10854bwM, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return c19589gHz.copydefault(fragment, str, c10854bwM, z);
    }

    private final AbstractC58185ywX<kotlin.Pair<ExchangeAddressData, java.util.ArrayList<C19574gHk>>> copydefault(final androidx.fragment.app.Fragment fragment, final java.lang.String str, final C10854bwM c10854bwM, final boolean z) {
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(new InterfaceC58259yxs() { // from class: o.gHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58259yxs
            public final void subscribe(InterfaceC58257yxq interfaceC58257yxq) {
                C19589gHz.AEQbTJ(fragment, c10854bwM, interfaceC58257yxq);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.gHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.copydefault(this.OLrzqt, str, c10854bwM, z, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<ExchangeAddressData, java.util.ArrayList<C19574gHk>>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.fARcdN(function1, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final void AEQbTJ(androidx.fragment.app.Fragment fragment, C10854bwM c10854bwM, final InterfaceC58257yxq interfaceC58257yxq) {
        Intrinsics.checkNotNullParameter(interfaceC58257yxq, "");
        ((C21113gtd) new ViewModelProvider(fragment).get(C21113gtd.class)).AEQbTJ((80 & 1) != 0 ? false : c10854bwM.zsXlph(), fragment, java.lang.Integer.valueOf(c10854bwM.AxsJAY()), c10854bwM, (80 & 16) != 0 ? false : true, (80 & 32) != 0 ? false : dZP.OLrzqt.AhwBna().length() == 0, (80 & 64) != 0, (80 & 128) != 0 ? null : new Function1() { // from class: o.gHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.AEQbTJ(interfaceC58257yxq, (ExchangeAddressData) obj);
            }
        });
    }

    public static final Unit AEQbTJ(InterfaceC58257yxq interfaceC58257yxq, ExchangeAddressData exchangeAddressData) {
        interfaceC58257yxq.onSuccess(C56390yDp.OLrzqt(java.lang.Boolean.TRUE, exchangeAddressData));
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C19589gHz c19589gHz, java.lang.String str, C10854bwM c10854bwM, boolean z, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return c19589gHz.KWHzl((ExchangeAddressData) pair.getSecond(), dZP.OLrzqt.AhwBna(), str, c10854bwM, z);
    }

    public static /* synthetic */ AbstractC58260yxt handleCreateAddressInformation$default(C19589gHz c19589gHz, ExchangeAddressData exchangeAddressData, java.lang.String str, java.lang.String str2, C10854bwM c10854bwM, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return c19589gHz.KWHzl(exchangeAddressData, str, str2, c10854bwM, z);
    }

    private final AbstractC58260yxt<kotlin.Pair<ExchangeAddressData, java.util.ArrayList<C19574gHk>>> KWHzl(final ExchangeAddressData exchangeAddressData, final java.lang.String str, final java.lang.String str2, final C10854bwM c10854bwM, final boolean z) {
        final java.util.ArrayList arrayList = new java.util.ArrayList(12);
        final java.util.HashMap map = new java.util.HashMap();
        final java.lang.String strDjBIcL = c10854bwM.djBIcL();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final boolean zDarRvM = c10854bwM.DarRvM();
        AbstractC58260yxt allRootWallets$default = C12827cuN.getAllRootWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, 3, null);
        final Function1 function1 = new Function1() { // from class: o.gHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.OLrzqt(z, strDjBIcL, objectRef, c10854bwM, arrayList, this, zDarRvM, str2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = allRootWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.gHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.AuCTel(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.gHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.OLrzqt(arrayList, z, strDjBIcL, objectRef, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.gHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.hDKMBd(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.gHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.OLrzqt(exchangeAddressData, arrayList, str, str2, map, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<ExchangeAddressData, java.util.ArrayList<C19574gHk>>> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.gHS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.uzCIH(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu hDKMBd(Function1 function1, java.lang.Object obj) {
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
                arrayList2.add(new C19577gHn(addressBookEntity.getName(), addressBookEntity.getAddress(), addressBookEntity.getName(), false, null, 0, false, addressBookEntity.isSmartContract(), null, 2, null, 1400, null));
                map.put(addressBookEntity.getAddress(), addressBookEntity.getName());
            }
            if (!arrayList2.isEmpty()) {
                ((C19577gHn) CollectionsKt___CollectionsKt.AubY(arrayList2)).copydefault(false);
                arrayList.add(new C19574gHk(2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fDu), arrayList2));
            }
        }
        if (z) {
            return cGL.KWHzl.OLrzqt(str, (java.lang.String) objectRef.element);
        }
        return cGL.KWHzl.copydefault(str, (java.lang.String) objectRef.element);
    }

    public static final kotlin.Pair uzCIH(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(ExchangeAddressData exchangeAddressData, java.util.ArrayList arrayList, java.lang.String str, java.lang.String str2, java.util.HashMap map, java.util.List list) {
        java.util.List<ExchangeAddressData.AddressBean> exChangeAddressList;
        Intrinsics.checkNotNullParameter(list, "");
        if (exchangeAddressData != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (Intrinsics.EZpvd(exchangeAddressData.isExchangeSupport(), java.lang.Boolean.TRUE) && (exChangeAddressList = exchangeAddressData.getExChangeAddressList()) != null && (!exChangeAddressList.isEmpty()) && C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                for (ExchangeAddressData.AddressBean addressBean : exchangeAddressData.getExChangeAddressList()) {
                    java.lang.String address = addressBean.getAddress();
                    java.lang.String str3 = address == null ? "" : address;
                    java.lang.String tag = addressBean.getTag();
                    arrayList2.add(new C19577gHn(str, str3, str, false, null, 0, false, false, str2, 1, tag == null ? "" : tag, 120, null));
                }
                ((C19577gHn) CollectionsKt___CollectionsKt.AubY(arrayList2)).copydefault(false);
                arrayList.add(0, new C19574gHk(1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.getIntentSender), arrayList2));
            }
        }
        if (list.isEmpty()) {
            return C56390yDp.OLrzqt(exchangeAddressData, arrayList);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(3);
        arrayList.add(0, new C19574gHk(3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.gFTCsA), arrayList3));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            SendCoinRecordEntity sendCoinRecordEntity = (SendCoinRecordEntity) it.next();
            if (map.containsKey(sendCoinRecordEntity.getAddress())) {
                java.lang.String str4 = (java.lang.String) map.get(sendCoinRecordEntity.getAddress());
                arrayList3.add(new C19577gHn(str4 == null ? "" : str4, sendCoinRecordEntity.getAddress(), null, false, null, 0, false, sendCoinRecordEntity.isSmartContract(), sendCoinRecordEntity.getWalletId(), 3, null, 1148, null));
            } else {
                arrayList3.add(new C19577gHn("", sendCoinRecordEntity.getAddress(), null, false, null, 0, false, sendCoinRecordEntity.isSmartContract(), sendCoinRecordEntity.getWalletId(), 3, null, 1148, null));
            }
        }
        if (!arrayList3.isEmpty()) {
            ((C19577gHn) CollectionsKt___CollectionsKt.AubY(arrayList3)).copydefault(false);
        }
        return C56390yDp.OLrzqt(exchangeAddressData, arrayList);
    }

    private final void AEQbTJ(java.util.ArrayList<C19574gHk> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!((C19574gHk) CollectionsKt___CollectionsKt.AubY(arrayList)).copydefault().isEmpty()) {
            ((C19577gHn) CollectionsKt___CollectionsKt.AubY(((C19574gHk) CollectionsKt___CollectionsKt.AubY(arrayList)).copydefault())).copydefault(false);
        } else {
            Intrinsics.copydefault(arrayList.remove(yDY.AuCTel(arrayList)));
        }
    }

    public final java.lang.String valueOf(@NotNull java.lang.String str) {
        java.lang.Object next;
        java.lang.Object next2;
        ExchangeAddressData exchangeAddressData;
        java.lang.String depositLimit;
        Intrinsics.checkNotNullParameter(str, "");
        ExchangeAddressData exchangeAddressData2 = this.copydefault;
        if (exchangeAddressData2 == null) {
            return "0";
        }
        if (exchangeAddressData2 != null && Intrinsics.EZpvd(exchangeAddressData2.isExchangeSupport(), java.lang.Boolean.FALSE)) {
            return "0";
        }
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C19574gHk) next).AEQbTJ(), (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getIntentSender))) {
                break;
            }
        }
        C19574gHk c19574gHk = (C19574gHk) next;
        if (c19574gHk == null) {
            return "0";
        }
        java.lang.String strKWHzl = KWHzl(str);
        java.util.Iterator<T> it2 = c19574gHk.copydefault().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            C19577gHn c19577gHn = (C19577gHn) next2;
            if (Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString()) || Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strKWHzl).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString())) {
                break;
            }
        }
        C19577gHn c19577gHn2 = (C19577gHn) next2;
        return (!C33129mqd.OLrzqt((java.lang.CharSequence) (c19577gHn2 != null ? c19577gHn2.copydefault() : null)) || (exchangeAddressData = this.copydefault) == null || (depositLimit = exchangeAddressData.getDepositLimit()) == null) ? "0" : depositLimit;
    }

    public final java.lang.String djBIcL(@NotNull java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        ExchangeAddressData exchangeAddressData = this.copydefault;
        if (exchangeAddressData == null) {
            return "";
        }
        if (exchangeAddressData != null && Intrinsics.EZpvd(exchangeAddressData.isExchangeSupport(), java.lang.Boolean.FALSE)) {
            return "";
        }
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C19574gHk) next).AEQbTJ(), (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getIntentSender))) {
                break;
            }
        }
        C19574gHk c19574gHk = (C19574gHk) next;
        if (c19574gHk == null) {
            return "";
        }
        java.lang.String strKWHzl = KWHzl(str);
        for (java.lang.Object obj2 : c19574gHk.copydefault()) {
            C19577gHn c19577gHn = (C19577gHn) obj2;
            if (Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString()) || Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strKWHzl).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString())) {
                obj = obj2;
                break;
            }
        }
        C19577gHn c19577gHn2 = (C19577gHn) obj;
        return (c19577gHn2 == null || (strCopydefault = c19577gHn2.copydefault()) == null) ? "" : strCopydefault;
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.String strAhwBna;
        Intrinsics.checkNotNullParameter(str, "");
        ExchangeAddressData exchangeAddressData = this.copydefault;
        if (exchangeAddressData == null) {
            return "";
        }
        if (exchangeAddressData != null && Intrinsics.EZpvd(exchangeAddressData.isExchangeSupport(), java.lang.Boolean.FALSE)) {
            return "";
        }
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C19574gHk) next).AEQbTJ(), (java.lang.Object) C33070mpX.AYXKKw(C13754dXa.FragmentManager.getIntentSender))) {
                break;
            }
        }
        C19574gHk c19574gHk = (C19574gHk) next;
        if (c19574gHk == null) {
            return "";
        }
        java.lang.String strKWHzl = KWHzl(str);
        for (java.lang.Object obj2 : c19574gHk.copydefault()) {
            C19577gHn c19577gHn = (C19577gHn) obj2;
            if (Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString()) || Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strKWHzl).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString())) {
                obj = obj2;
                break;
            }
        }
        C19577gHn c19577gHn2 = (C19577gHn) obj;
        return (c19577gHn2 == null || (strAhwBna = c19577gHn2.AhwBna()) == null) ? "" : strAhwBna;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        java.lang.Object next;
        C19577gHn c19577gHn;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<C19574gHk> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            C19574gHk next2 = it.next();
            Intrinsics.checkNotNullExpressionValue(next2, "");
            java.util.Iterator<C19577gHn> it2 = next2.copydefault().iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "");
            while (it2.hasNext()) {
                C19577gHn next3 = it2.next();
                Intrinsics.checkNotNullExpressionValue(next3, "");
                C19577gHn c19577gHn2 = next3;
                java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn2.OLrzqt()).toString();
                if (Intrinsics.EZpvd((java.lang.Object) string, (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString())) {
                    arrayList.add(c19577gHn2);
                } else if (Intrinsics.EZpvd((java.lang.Object) KWHzl(string), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) KWHzl(str)).toString())) {
                    arrayList2.add(c19577gHn2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = arrayList2;
        }
        java.lang.String strCopydefault = null;
        if (str2.length() == 0) {
            c19577gHn = (C19577gHn) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        } else {
            java.util.Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C19577gHn) next).copydefault(), (java.lang.Object) str2)) {
                    break;
                }
            }
            c19577gHn = (C19577gHn) next;
            if (c19577gHn == null) {
                c19577gHn = (C19577gHn) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
            }
        }
        if (c19577gHn != null) {
            strCopydefault = (c19577gHn.AEQbTJ() != 1 || i == 1) ? c19577gHn.copydefault() : "";
        }
        return strCopydefault == null ? "" : strCopydefault;
    }

    public final java.lang.Boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strKWHzl = KWHzl(str);
        java.util.ArrayList<C19574gHk> arrayList = this.KWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList2, ((C19574gHk) it.next()).copydefault());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            C19577gHn c19577gHn = (C19577gHn) obj;
            if (Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString()) || Intrinsics.EZpvd((java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strKWHzl).toString(), (java.lang.Object) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) c19577gHn.OLrzqt()).toString())) {
                arrayList3.add(obj);
            }
        }
        if (str2.length() == 0) {
            C19577gHn c19577gHn2 = (C19577gHn) CollectionsKt___CollectionsKt.firstOrNull(arrayList3);
            if (c19577gHn2 != null) {
                return java.lang.Boolean.valueOf(c19577gHn2.valueOf());
            }
            return null;
        }
        java.util.Iterator it2 = arrayList3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C19577gHn) next).copydefault(), (java.lang.Object) str2)) {
                break;
            }
        }
        C19577gHn c19577gHn3 = (C19577gHn) next;
        if (c19577gHn3 != null) {
            return java.lang.Boolean.valueOf(c19577gHn3.valueOf());
        }
        C19577gHn c19577gHn4 = (C19577gHn) CollectionsKt___CollectionsKt.firstOrNull(arrayList3);
        if (c19577gHn4 != null) {
            return java.lang.Boolean.valueOf(c19577gHn4.valueOf());
        }
        return null;
    }

    public final AbstractC58185ywX<ResponseData<ParseENSResp>> AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.values.OLrzqt(java.lang.String.valueOf(this.EZpvd), str);
    }

    public final AbstractC58185ywX<ResponseData<CheckAddressResp>> OLrzqt(@NotNull java.lang.String str) {
        OkTransactionWallet okTransactionWalletOLrzqt;
        C10854bwM chainMeta;
        Intrinsics.checkNotNullParameter(str, "");
        StateListAnimator value = this.DbNXlk.getValue();
        return this.values.OLrzqt((value == null || (okTransactionWalletOLrzqt = value.OLrzqt()) == null || (chainMeta = okTransactionWalletOLrzqt.getChainMeta()) == null) ? 0L : chainMeta.AhwBna(), str);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.net.bean.EosAccountResp>> */
    public final AbstractC58185ywX<ResponseData<EosAccountResp>> copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<AbstractC12782ctV> abstractC58185ywXEZpvd = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.gHA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.EZpvd(this.OLrzqt, str, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.gHB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C19589gHz.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C19589gHz c19589gHz, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c19589gHz.values.AEQbTJ(abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), abstractC12782ctV.DbNXlk(), str);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, JwtUtilsKt.JWT_DELIMITER, 0, false, 6, (java.lang.Object) null);
        if (str.length() < 16 || iLastIndexOf$default < 11 || AEQbTJ(str)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = str.substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        sb.append("....");
        java.lang.String strSubstring2 = str.substring(iLastIndexOf$default - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        sb.append(strSubstring2);
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final OkTransactionWallet EZpvd() {
        StateListAnimator value = this.DbNXlk.getValue();
        if ((value == null || !value.AEQbTJ()) && (value == null || value.EZpvd())) {
            return null;
        }
        return value.OLrzqt();
    }

    public final InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull final Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        AbstractC58185ywX<ResponseData<AABook>> abstractC58185ywXKWHzl = this.values.KWHzl(KWHzl(str));
        final Function1 function1 = new Function1() { // from class: o.gHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.KWHzl(function2, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<AABook>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19589gHz.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19589gHz.OLrzqt(function2, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gHM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19589gHz.fIwbmz(function12, obj);
            }
        });
        call().AEQbTJ(interfaceC58217yxCAEQbTJ);
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        return interfaceC58217yxCAEQbTJ;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function2 function2, java.lang.Throwable th) {
        function2.invoke(null, th.getMessage());
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.util.List<TxToastCheckRes>> AkhnZx(@NotNull java.lang.String str) {
        OkTransactionWallet okTransactionWalletOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        StateListAnimator value = this.DbNXlk.getValue();
        if (value == null || (okTransactionWalletOLrzqt = value.OLrzqt()) == null) {
            AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        C10854bwM coinMeta = okTransactionWalletOLrzqt.getCoinMeta();
        if (coinMeta.DarRvM()) {
            AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        C10854bwM chainMeta = okTransactionWalletOLrzqt.getChainMeta();
        if (chainMeta != null && chainMeta.QkdxfA()) {
            AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
            return abstractC58185ywXKWHzl3;
        }
        if (chainMeta != null && chainMeta.fARcdN()) {
            AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
            return abstractC58185ywXKWHzl4;
        }
        if (chainMeta != null && chainMeta.fIwbmz()) {
            AbstractC58185ywX<java.util.List<TxToastCheckRes>> abstractC58185ywXKWHzl5 = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl5, "");
            return abstractC58185ywXKWHzl5;
        }
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(3);
        long jAhwBna = coinMeta.AhwBna();
        C10854bwM chainMeta2 = okTransactionWalletOLrzqt.getChainMeta();
        return C43423rox.unwrapResponseData$default(this.values.copydefault(new TxToastCheckReq(arrayListCopydefault, java.lang.Long.valueOf(jAhwBna), 1, null, okTransactionWalletOLrzqt.getAddress(), KWHzl(str), "0", null, null, null, coinMeta.DCUTEIddSDPG() ? coinMeta.OLrzqt() : null, null, null, 0, null, null, chainMeta2 != null ? chainMeta2.fetchVPNInfo() : -1L, null, null, null, null, null, 4119040, null)), (Function1) null, 1, (java.lang.Object) null);
    }

    public final java.lang.String KWHzl() {
        return this.OLrzqt.copydefault();
    }

    public final boolean valueOf() {
        return this.OLrzqt.KWHzl();
    }

    public final void OLrzqt(@NotNull C19577gHn c19577gHn) {
        Intrinsics.checkNotNullParameter(c19577gHn, "");
        this.AkhnZx.setValue(c19577gHn);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        C10854bwM chainMeta;
        Intrinsics.checkNotNullParameter(str, "");
        OkTransactionWallet okTransactionWalletEZpvd = EZpvd();
        return (okTransactionWalletEZpvd == null || (chainMeta = okTransactionWalletEZpvd.getChainMeta()) == null || !chainMeta.OLrzqt(str)) ? str : C59449zhJ.KWHzl(str, chainMeta.zLjUOn(), EIP1271Verifier.hexPrefix, true);
    }

    /* JADX INFO: renamed from: o.gHz$StateListAnimator */
    public final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public boolean EZpvd = true;
        public boolean KWHzl;
        public boolean OLrzqt;
        public OkTransactionWallet copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull OkTransactionWallet okTransactionWallet) {
            Intrinsics.checkNotNullParameter(okTransactionWallet, "");
            this.copydefault = okTransactionWallet;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(boolean z) {
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        public final OkTransactionWallet OLrzqt() {
            OkTransactionWallet okTransactionWallet = this.copydefault;
            if (okTransactionWallet != null) {
                return okTransactionWallet;
            }
            Intrinsics.gEmmrt("");
            return null;
        }
    }

    public final boolean AEQbTJ(java.lang.String str) {
        boolean zKWHzl = false;
        for (int i = 0; i < str.length(); i++) {
            zKWHzl = KWHzl(str.charAt(i));
        }
        return zKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.Pair KWHzl(ResponseData responseData) {
        boolean z;
        ChainInfo chainInfo;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0 || responseData.getData() == null || (chainInfo = (ChainInfo) responseData.getData()) == null) {
            z = false;
        } else {
            z = true;
            if (!chainInfo.getCanWithdraw()) {
            }
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.valueOf(z), responseData);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, java.lang.CharSequence, java.lang.String] */
    public static final InterfaceC58261yxu OLrzqt(boolean z, java.lang.String str, Ref.ObjectRef objectRef, C10854bwM c10854bwM, java.util.ArrayList arrayList, C19589gHz c19589gHz, boolean z2, java.lang.String str2, java.util.List list) {
        ChainAddress chainAddressAddressFromChainId$default;
        java.lang.String address;
        boolean z3;
        C10854bwM c10854bwMKWHzl;
        C10854bwM c10854bwMKWHzl2;
        ChainAddress chainAddressOLrzqt;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            if (abstractC12784ctX.AEQbTJ() || abstractC12784ctX.fJNWhG() == WalletType.MPCWallet) {
                boolean z4 = true;
                if (!C10854bwM.isXRCToken$default(c10854bwM, null, 1, null) || abstractC12784ctX.fJNWhG() != WalletType.HardwareWallet) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
                    java.util.ArrayList<AbstractC12782ctV> arrayList3 = new java.util.ArrayList();
                    for (java.lang.Object obj : listKWHzl) {
                        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                        if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                            if (abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) {
                                if (!abstractC12782ctV.Dmq() || (c10854bwM != null && c10854bwM.copydefault(XRCTokenType.Brc20sToken, XRCTokenType.Arc20Token, XRCTokenType.SRC20Token, XRCTokenType.RunesToken, XRCTokenType.RunesMainToken, XRCTokenType.Brc20ForFBTCToken, XRCTokenType.RunesMainForFBTCToken))) {
                                }
                            }
                        }
                        if (!z2 || !abstractC12782ctV.getFieldNames()) {
                            arrayList3.add(obj);
                        }
                    }
                    for (AbstractC12782ctV abstractC12782ctV2 : arrayList3) {
                        if (!c10854bwM.DarRvM() ? (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwM.AEQbTJ(), null, 2, null)) == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null : (chainAddressOLrzqt = abstractC12782ctV2.OLrzqt(java.lang.Long.valueOf(c10854bwM.AhwBna()))) == null || (address = chainAddressOLrzqt.getAddress()) == null) {
                            address = "";
                        }
                        if (!abstractC12782ctV2.QfsBiF()) {
                            address = c10854bwM.KWHzl(address);
                        }
                        ?? r14 = address;
                        if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV2.DbNXlk(), (java.lang.Object) str2)) {
                            objectRef.element = r14;
                        }
                        if (r14.length() != 0) {
                            if (c10854bwM.dxcTrN() == z4) {
                                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                                for (ChainAddress chainAddress : abstractC12782ctV2.EZpvd()) {
                                    if (c10854bwM.fetchVPNInfo() == chainAddress.getChainId() && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null && c10854bwMKWHzl.AhwBna() == chainAddress.getCoinId()) {
                                        if (!abstractC12782ctV2.AxsJAY() || (c10854bwMKWHzl2 = c10854bwM.KWHzl()) == null || c10854bwMKWHzl2.iRxXKY() != z4 || chainAddress.getAddressType() != AddressType.P2TRType.getValue()) {
                                            arrayList4.add(new C19577gHn(abstractC12782ctV2.AkhnZx(), chainAddress.getAddress(), abstractC12782ctV2.AYXKKw(), false, new AddressData(chainAddress.getAddressType(), false, false, null, 14, null).getAddressFormat(), chainAddress.getAddressType(), false, abstractC12782ctV2.getFieldNames(), abstractC12782ctV2.DbNXlk(), 4, null, 1024, null));
                                        }
                                        z4 = true;
                                    }
                                }
                                if (arrayList4.isEmpty()) {
                                    z4 = true;
                                } else {
                                    java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList4, C10539bqP.AEQbTJ);
                                    z3 = true;
                                    ((C19577gHn) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd)).OLrzqt(true);
                                    arrayList2.addAll(listEZpvd);
                                    ((C19577gHn) CollectionsKt___CollectionsKt.AubY(arrayList2)).copydefault(true);
                                }
                            } else {
                                z3 = z4;
                                arrayList2.add(new C19577gHn(abstractC12782ctV2.AkhnZx(), r14, abstractC12782ctV2.AYXKKw(), false, null, 0, false, abstractC12782ctV2.getFieldNames(), abstractC12782ctV2.DbNXlk(), 4, null, 1144, null));
                            }
                            z4 = z3;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new C19574gHk(4, abstractC12784ctX.AuCTel(), arrayList2));
                        c19589gHz.AEQbTJ((java.util.ArrayList<C19574gHk>) arrayList);
                    }
                }
            }
        }
        if (z) {
            return cGN.EZpvd.copydefault(str, (java.lang.String) objectRef.element);
        }
        return cGN.EZpvd.OLrzqt(str, (java.lang.String) objectRef.element);
    }

    public static final Unit KWHzl(Function2 function2, ResponseData responseData) {
        java.lang.Boolean boolIsSmartContract;
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            AABook aABook = (AABook) responseData.getData();
            function2.invoke(java.lang.Boolean.valueOf((aABook == null || (boolIsSmartContract = aABook.isSmartContract()) == null) ? false : boolIsSmartContract.booleanValue()), null);
        } else {
            function2.invoke(null, responseData.getMsg());
        }
        return Unit.INSTANCE;
    }
}
