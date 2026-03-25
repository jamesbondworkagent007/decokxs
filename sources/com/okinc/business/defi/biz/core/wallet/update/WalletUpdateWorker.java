package com.okinc.business.defi.biz.core.wallet.update;

import android.content.Context;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo;
import com.okinc.business.defi.biz.model.wallet.OneKeyAddress;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyResp;
import com.okinc.business.defi.biz.net.bean.EosAccountResp;
import com.okinc.business.defi.biz.net.bean.GetNearAccountIdResp;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.hardware.api.keystone.KeystoneAccount;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC12784ctX;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C10854bwM;
import o.C10954byG;
import o.C11161cDz;
import o.C11495cQj;
import o.C11600cUg;
import o.C11607cUn;
import o.C12827cuN;
import o.C12974cxB;
import o.C13058cyg;
import o.C13458dMb;
import o.C13847daM;
import o.C13852daR;
import o.C13854daT;
import o.C13912dbY;
import o.C13934dbu;
import o.C32866mlf;
import o.C33024moe;
import o.C33129mqd;
import o.C54908xZu;
import o.C54910xZw;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56406yEe;
import o.C56444yFp;
import o.C59449zhJ;
import o.C59467zhb;
import o.C8322bAY;
import o.C9678baC;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58223yxI;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC58261yxu;
import o.InterfaceC60096zvd;
import o.InterfaceC9738bbJ;
import o.cCD;
import o.cQM;
import o.pUU;
import o.xXN;
import o.xYQ;
import o.xYW;
import o.xZX;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletUpdateWorker {
    public final cQM AYXKKw;
    public final C12827cuN AhwBna;
    public final CoroutineScope EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final ConcurrentSkipListSet<Long> OLrzqt;
    public final C11495cQj copydefault;
    public final C13058cyg djBIcL;
    public final C13934dbu gEmmrt;
    public final ConcurrentSkipListSet<Long> valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.ConnectWallet.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.DemoWallet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            EZpvd = iArr;
        }
    }

    public interface TaskDescription {
        void EZpvd(@NotNull Throwable th);

        void KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ArrayList AEQbTJ(ArrayList arrayList, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ArrayList AhwBna(ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ArrayList KWHzl(ArrayList arrayList, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yDl.AEQbTJ(kotlin.jvm.functions.Function0):o.yDm */
    public WalletUpdateWorker(@NotNull C13934dbu c13934dbu, @NotNull cQM cqm, @NotNull C11495cQj c11495cQj, @NotNull C12827cuN c12827cuN, @NotNull C13058cyg c13058cyg, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(c11495cQj, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c13058cyg, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.gEmmrt = c13934dbu;
        this.AYXKKw = cqm;
        this.copydefault = c11495cQj;
        this.AhwBna = c12827cuN;
        this.djBIcL = c13058cyg;
        this.EZpvd = coroutineScope;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.cDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return WalletUpdateWorker.AEQbTJ();
            }
        });
        this.OLrzqt = new ConcurrentSkipListSet<>();
        this.valueOf = new ConcurrentSkipListSet<>();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ WalletUpdateWorker getInstance$default(Application application, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.copydefault(context);
        }

        public final WalletUpdateWorker copydefault(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).QfsBiF();
        }
    }

    public static final ArrayList AEQbTJ() {
        return new ArrayList();
    }

    public final ArrayList<TaskDescription> valueOf() {
        return (ArrayList) this.KWHzl.getValue();
    }

    public final String AhwBna() {
        String string = SPUtils.getString("user_unique_key", "", "wallet_biz_sp_file");
        if (string == null || string.length() == 0) {
            String string2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            SPUtils.commit("user_unique_key", string2, "wallet_biz_sp_file");
        }
        String string3 = SPUtils.getString("user_unique_key", "", "wallet_biz_sp_file");
        Intrinsics.checkNotNullExpressionValue(string3, "");
        return string3;
    }

    public final void OLrzqt() {
        SPUtils.commit("user_unique_key", "", "wallet_biz_sp_file");
    }

    public final void gEmmrt() {
        djBIcL();
        BuildersKt__Builders_commonKt.launch$default(this.EZpvd, null, null, new WalletUpdateWorker$startUpdate$1(this, null), 3, null);
    }

    public final void djBIcL() {
        if (SPUtils.getBoolean("coins_is_synced", false, "wallet_biz_sp_file")) {
            return;
        }
        AbstractC58185ywX<List<Long>> abstractC58185ywXEZpvd = this.copydefault.AEQbTJ().EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.AYXKKw(this.OLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.giSNqX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXKWHzl2 = C33024moe.KWHzl((AbstractC58185ywX) abstractC58185ywXKWHzl);
        final Function1 function12 = new Function1() { // from class: o.cDP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault((ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cDX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletUpdateWorker.flVtFt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletUpdateWorker.gGvvIC(function13, obj);
            }
        });
    }

    public static final InterfaceC60096zvd giSNqX(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AYXKKw(WalletUpdateWorker walletUpdateWorker, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            SPUtils.put("coins_is_synced", Boolean.TRUE, "wallet_biz_sp_file");
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        return walletUpdateWorker.gEmmrt.EZpvd((List<Long>) list, walletUpdateWorker.AhwBna());
    }

    public static final void flVtFt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ResponseData responseData) {
        if (responseData.getCode() == -1 && responseData.getData() == null && Intrinsics.EZpvd((Object) responseData.getError_code(), (Object) "")) {
            return Unit.INSTANCE;
        }
        SPUtils.put("coins_is_synced", Boolean.TRUE, "wallet_biz_sp_file");
        C10954byG.EZpvd.DbNXlk();
        return Unit.INSTANCE;
    }

    public static final void gGvvIC(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        public final ArrayList<AbstractC58185ywX<ResponseData<Unit>>> EZpvd;
        public final ArrayList<C12974cxB> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                arrayList2 = actionBar.copydefault;
            }
            return actionBar.EZpvd(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<AbstractC58185ywX<ResponseData<Unit>>> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList, @NotNull ArrayList<C12974cxB> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            return new ActionBar(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<C12974cxB> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UpgradeDataBean(flowableSources=" + this.EZpvd + ", walletUpdateParams=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList, @NotNull ArrayList<C12974cxB> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            this.EZpvd = arrayList;
            this.copydefault = arrayList2;
        }
    }

    public final boolean AEQbTJ(boolean z, final AbstractC12782ctV abstractC12782ctV, List<ChainAddress> list, List<C10854bwM> list2) {
        ChainAddress chainAddress;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2 = abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB();
        if (!(!list.isEmpty()) || list.size() == list2.size()) {
            return z;
        }
        ChainAddress chainAddress2 = (ChainAddress) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            C10854bwM c10854bwM = (C10854bwM) it.next();
            Iterator<T> it2 = abstractC12782ctV.valueOf().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                ChainAddress chainAddress3 = (ChainAddress) next;
                if (chainAddress3.getCoinId() == c10854bwM.AhwBna() && chainAddress3.getAddress().length() > 0) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                ChainAddress chainAddress4 = chainAddress2;
                arrayList = arrayList4;
                chainAddress = chainAddress2;
                arrayList2 = arrayList3;
                arrayList2.add(chainAddress4.copy((253 & 1) != 0 ? chainAddress4.coinId : c10854bwM.AEQbTJ(), (253 & 2) != 0 ? chainAddress4.address : null, (253 & 4) != 0 ? chainAddress4.addressType : 0, (253 & 8) != 0 ? chainAddress4.proxyAddres : null, (253 & 16) != 0 ? chainAddress4.eoaAddress : null, (253 & 32) != 0 ? chainAddress4.isDefault : false, (253 & 64) != 0 ? chainAddress4.publicKey : null, (253 & 128) != 0 ? chainAddress4.derivePath : null));
                arrayList.add(Long.valueOf(c10854bwM.fetchVPNInfo()));
                if (z2) {
                    this.OLrzqt.add(Long.valueOf(c10854bwM.fetchVPNInfo()));
                }
            } else {
                chainAddress = chainAddress2;
                arrayList = arrayList4;
                arrayList2 = arrayList3;
            }
            arrayList4 = arrayList;
            arrayList3 = arrayList2;
            chainAddress2 = chainAddress;
        }
        final ArrayList arrayList5 = arrayList4;
        final ArrayList arrayList6 = arrayList3;
        abstractC12782ctV.OLrzqt(new Function1() { // from class: o.cEI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return WalletUpdateWorker.AYXKKw(arrayList6, (java.util.ArrayList) obj2);
            }
        });
        if (!(!arrayList5.isEmpty())) {
            return true;
        }
        C32866mlf.onEvent$default("Wallet_ChainUpdate_Aggr_B", (TrackChannel[]) null, new Function1() { // from class: o.cES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return WalletUpdateWorker.copydefault(abstractC12782ctV, arrayList5, (EventParamsList) obj2);
            }
        }, 1, (Object) null);
        return true;
    }

    public static final ArrayList AYXKKw(ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static final Unit copydefault(AbstractC12782ctV abstractC12782ctV, ArrayList arrayList, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "wallet_id", abstractC12782ctV.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "new_chain_id", CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX upgradeAllWallets$OKWallet_wallet_impl$default(WalletUpdateWorker walletUpdateWorker, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        return walletUpdateWorker.AEQbTJ((List<? extends AbstractC12782ctV>) list);
    }

    public final AbstractC58185ywX<Boolean> AEQbTJ(@NotNull List<? extends AbstractC12782ctV> list) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            abstractC58260yxtCopydefault = C12827cuN.fetchAllWallets$default(this.AhwBna, false, false, false, 6, null);
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(list);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
        }
        final Function1 function1 = new Function1() { // from class: o.cEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.gEmmrt(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.AxsJAYaxsJAY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.valueOf(this.copydefault, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cEZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.iZzfmt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C11607cUn.KWHzl(abstractC58260yxtCopydefault2).EZpvd();
        final Function1 function13 = new Function1() { // from class: o.cFb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.EZpvd((WalletUpdateWorker.ActionBar) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cEY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.iRxXKY(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.KWHzl(this.OLrzqt, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cFg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.QKudOq(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        AbstractC58185ywX abstractC58185ywXKWHzl3 = C11607cUn.KWHzl(abstractC58185ywXKWHzl2);
        final Function1 function15 = new Function1() { // from class: o.cFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.AEQbTJ((java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<Boolean> abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.KWHzl(new InterfaceC58227yxM() { // from class: o.cFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletUpdateWorker.AxsJAYsNCnLh(function15, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
        return abstractC58185ywXKWHzl4;
    }

    public static final InterfaceC58261yxu AxsJAYaxsJAY(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(WalletUpdateWorker walletUpdateWorker, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return walletUpdateWorker.djBIcL.EZpvd(list);
    }

    public static final ActionBar iZzfmt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ActionBar) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bbJ.StateListAnimator.addressFromRealChainId$default(o.bbJ, long, java.lang.Integer, int, java.lang.Object):o.bbz */
    /* JADX WARN: Removed duplicated region for block: B:233:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0675 A[PHI: r0 r2
  0x0675: PHI (r0v16 boolean) = (r0v15 boolean), (r0v35 boolean) binds: [B:284:0x063c, B:289:0x0662] A[DONT_GENERATE, DONT_INLINE]
  0x0675: PHI (r2v18 boolean) = (r2v17 boolean), (r2v28 boolean) binds: [B:284:0x063c, B:289:0x0662] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x06ec A[PHI: r0
  0x06ec: PHI (r0v18 boolean) = (r0v17 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:293:0x067f, B:301:0x06ca, B:303:0x06d0, B:305:0x06d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0764 A[LOOP:10: B:334:0x075e->B:336:0x0764, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x05a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ActionBar valueOf(WalletUpdateWorker walletUpdateWorker, List list) {
        boolean zAEQbTJ;
        String str;
        boolean z;
        String str2;
        ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList;
        String str3;
        boolean z2;
        boolean z3;
        Iterator<T> it;
        Object next;
        String address;
        boolean z4;
        boolean z5;
        AbstractC12782ctV abstractC12782ctV;
        Iterator it2;
        String publicKey;
        String publicKey2;
        C10854bwM c10854bwMKWHzl;
        String address2;
        String address3;
        Object obj;
        String str4 = "";
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            final AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) it3.next();
            ArrayList<ChainAddress> arrayList5 = new ArrayList<>(abstractC12782ctV2.EZpvd());
            if (abstractC12782ctV2.QOLQEE()) {
                List<ChainAddress> listValueOf = abstractC12782ctV2.valueOf();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj2 : listValueOf) {
                    ChainAddress chainAddress = (ChainAddress) obj2;
                    ArrayList arrayList7 = arrayList6;
                    C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(chainAddress.getCoinId());
                    if (c10854bwMKWHzl2 == null || !c10854bwMKWHzl2.fARcdN() || chainAddress.getAddress().length() <= 0) {
                        arrayList6 = arrayList7;
                    } else {
                        arrayList7.add(obj2);
                        arrayList6 = arrayList7;
                    }
                }
                zAEQbTJ = walletUpdateWorker.AEQbTJ(false, abstractC12782ctV2, arrayList6, C10954byG.EZpvd.valueOf().OLrzqt(4));
            } else {
                zAEQbTJ = false;
            }
            if (abstractC12782ctV2.fjfviF()) {
                Iterator<T> it4 = abstractC12782ctV2.valueOf().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next2 = it4.next();
                    C10854bwM c10854bwMKWHzl3 = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) next2).getCoinId());
                    if (c10854bwMKWHzl3 != null && c10854bwMKWHzl3.fIwbmz()) {
                        obj = next2;
                        break;
                    }
                }
                ChainAddress chainAddress2 = (ChainAddress) obj;
                String address4 = chainAddress2 != null ? chainAddress2.getAddress() : null;
                if (address4 == null) {
                    address4 = str4;
                }
                if ((abstractC12782ctV2.AubY() || abstractC12782ctV2.AwvSrB()) && address4.length() > 0 && StringsKt__StringsKt.KWHzl(address4, (CharSequence) EIP1271Verifier.hexPrefix).length() < 64) {
                    String strOLrzqt = xYW.AEQbTJ.OLrzqt(address4);
                    for (ChainAddress chainAddress3 : abstractC12782ctV2.valueOf()) {
                        C10854bwM c10854bwMKWHzl4 = C10954byG.EZpvd.valueOf().KWHzl(chainAddress3.getCoinId());
                        if (c10854bwMKWHzl4 != null && c10854bwMKWHzl4.fIwbmz()) {
                            chainAddress3.setAddress(strOLrzqt);
                        }
                    }
                    zAEQbTJ = true;
                }
                List<ChainAddress> listValueOf2 = abstractC12782ctV2.valueOf();
                ArrayList arrayList8 = new ArrayList();
                Iterator it5 = listValueOf2.iterator();
                while (it5.hasNext()) {
                    Object next3 = it5.next();
                    ChainAddress chainAddress4 = (ChainAddress) next3;
                    Iterator it6 = it5;
                    C10854bwM c10854bwMKWHzl5 = C10954byG.EZpvd.valueOf().KWHzl(chainAddress4.getCoinId());
                    if (c10854bwMKWHzl5 != null && c10854bwMKWHzl5.fIwbmz() && chainAddress4.getAddress().length() > 0) {
                        arrayList8.add(next3);
                    }
                    it5 = it6;
                }
                zAEQbTJ = walletUpdateWorker.AEQbTJ(zAEQbTJ, abstractC12782ctV2, arrayList8, C10954byG.EZpvd.valueOf().OLrzqt(5));
            }
            if (abstractC12782ctV2.AuCTelauCTel() && !abstractC12782ctV2.getFieldNames() && (!abstractC12782ctV2.QfsBiF() || abstractC12782ctV2.DarRvM() != WalletType.TrackingWallet)) {
                List<ChainAddress> listValueOf3 = abstractC12782ctV2.valueOf();
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : listValueOf3) {
                    ChainAddress chainAddress5 = (ChainAddress) obj3;
                    C10854bwM c10854bwMKWHzl6 = C10954byG.EZpvd.valueOf().KWHzl(chainAddress5.getCoinId());
                    if (c10854bwMKWHzl6 != null && c10854bwMKWHzl6.ejfBZ() && chainAddress5.getAddress().length() > 0) {
                        arrayList9.add(obj3);
                    }
                }
                zAEQbTJ = walletUpdateWorker.AEQbTJ(zAEQbTJ, abstractC12782ctV2, arrayList9, C10954byG.EZpvd.valueOf().DbNXlk());
            }
            C10954byG c10954byG = C10954byG.EZpvd;
            final C10854bwM c10854bwMOLrzqt = c10954byG.valueOf().copydefault(2020L);
            if (c10854bwMOLrzqt != null) {
                ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwMOLrzqt.AEQbTJ(), null, 2, null);
                if (chainAddressAddressFromChainId$default == null || (address3 = chainAddressAddressFromChainId$default.getAddress()) == null) {
                    str = null;
                } else {
                    str = null;
                    if (C59449zhJ.startsWith$default(address3, "ronin:", false, 2, null)) {
                        final ArrayList arrayList10 = new ArrayList();
                        abstractC12782ctV2.OLrzqt(new Function1() { // from class: o.cEn
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return WalletUpdateWorker.copydefault(c10854bwMOLrzqt, arrayList10, (java.util.ArrayList) obj4);
                            }
                        });
                        zAEQbTJ = (abstractC12782ctV2.AwvSrB() || abstractC12782ctV2.QfsBiF()) ? walletUpdateWorker.AEQbTJ(true, abstractC12782ctV2, arrayList10, c10954byG.valueOf().DbNXlk()) : true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } else {
                str = null;
            }
            if (abstractC12782ctV2.getFieldNames() || (abstractC12782ctV2.QfsBiF() && abstractC12782ctV2.DarRvM() == WalletType.TrackingWallet)) {
                List<ChainAddress> listValueOf4 = abstractC12782ctV2.valueOf();
                ArrayList arrayList11 = new ArrayList();
                for (Object obj4 : listValueOf4) {
                    C10854bwM c10854bwMKWHzl7 = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddress) obj4).getCoinId());
                    if (c10854bwMKWHzl7 != null && c10854bwMKWHzl7.ejfBZ()) {
                        arrayList11.add(obj4);
                    }
                }
                List<C10854bwM> listOLrzqt = C10954byG.EZpvd.valueOf().OLrzqt();
                ArrayList arrayList12 = new ArrayList();
                for (Object obj5 : listOLrzqt) {
                    if (((C10854bwM) obj5).ejfBZ()) {
                        arrayList12.add(obj5);
                    }
                }
                zAEQbTJ = walletUpdateWorker.AEQbTJ(zAEQbTJ, abstractC12782ctV2, arrayList11, arrayList12);
            }
            if (abstractC12782ctV2.ORxRYg()) {
                List<HDWalletCoin> listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(abstractC12782ctV2.OFhtUX()), new Function1() { // from class: o.cEq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj6) {
                        return java.lang.Boolean.valueOf(WalletUpdateWorker.EZpvd(abstractC12782ctV2, (C10854bwM) obj6));
                    }
                }), new Function1() { // from class: o.cEr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj6) {
                        return WalletUpdateWorker.gEmmrt((C10854bwM) obj6);
                    }
                }));
                if (!listZuBGHE.isEmpty()) {
                    xYQ xyq = xYQ.KWHzl;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV2.QSBOWP();
                    String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : str;
                    String str5 = ecdsaPubkey == null ? str4 : ecdsaPubkey;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV2.QSBOWP();
                    String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : str;
                    String str6 = ecdsaChainCode == null ? str4 : ecdsaChainCode;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV2.QSBOWP();
                    String ed25519Pubkey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEd25519Pubkey() : str;
                    String str7 = ed25519Pubkey == null ? str4 : ed25519Pubkey;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV2.QSBOWP();
                    String ed25519ChainCode = mpcWalletEncodeInfoQSBOWP4 != null ? mpcWalletEncodeInfoQSBOWP4.getEd25519ChainCode() : str;
                    List<WalletAddressList> listOLrzqt2 = xyq.OLrzqt(str5, str6, str7, ed25519ChainCode == null ? str4 : ed25519ChainCode, listZuBGHE);
                    final ArrayList arrayList13 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
                    for (WalletAddressList walletAddressList : listOLrzqt2) {
                        CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList.getAddressList());
                        C10854bwM c10854bwMOLrzqt2 = C10954byG.EZpvd.valueOf().copydefault(walletAddressList.getChainId());
                        long jAhwBna = c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.AhwBna() : 0L;
                        String address5 = coinAddressBean != null ? coinAddressBean.getAddress() : str;
                        arrayList13.add(new ChainAddress(jAhwBna, address5 == null ? str4 : address5, coinAddressBean != null ? coinAddressBean.getType() : AddressType.Legacy.getValue(), null, null, true, walletAddressList.getPubKey(), "", 24, null));
                    }
                    abstractC12782ctV2.OLrzqt(new Function1() { // from class: o.cEt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj6) {
                            return WalletUpdateWorker.EZpvd(arrayList13, (java.util.ArrayList) obj6);
                        }
                    });
                    zAEQbTJ = true;
                }
                walletUpdateWorker.copydefault(abstractC12782ctV2, arrayList2);
            }
            final ArrayList arrayList14 = new ArrayList(abstractC12782ctV2.valueOf());
            if (abstractC12782ctV2.AubY() && walletUpdateWorker.AEQbTJ(abstractC12782ctV2.DbNXlk()) == KavaStatus.DEFAULT) {
                walletUpdateWorker.OLrzqt(abstractC12782ctV2.DbNXlk());
                C10854bwM c10854bwMOLrzqt3 = C10954byG.EZpvd.valueOf().copydefault(459L);
                long jAEQbTJ = c10854bwMOLrzqt3 != null ? c10854bwMOLrzqt3.AEQbTJ() : -1L;
                C56406yEe.AEQbTJ(arrayList14, new Function1() { // from class: o.cEp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj6) {
                        return java.lang.Boolean.valueOf(WalletUpdateWorker.EZpvd((ChainAddress) obj6));
                    }
                });
                arrayList3.add(walletUpdateWorker.AYXKKw.KWHzl(abstractC12782ctV2.DbNXlk(), jAEQbTJ));
                z = true;
            } else {
                z = false;
            }
            C10954byG c10954byG2 = C10954byG.EZpvd;
            C10854bwM c10854bwMOLrzqt4 = c10954byG2.valueOf().copydefault(5757L);
            if (c10854bwMOLrzqt4 != null) {
                str3 = str;
                ChainAddress chainAddressAddressFromChainId$default2 = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV2, c10854bwMOLrzqt4.AEQbTJ(), null, 2, null);
                if (chainAddressAddressFromChainId$default2 == null || (address2 = chainAddressAddressFromChainId$default2.getAddress()) == null) {
                    address2 = str4;
                }
                if ((abstractC12782ctV2.AubY() || abstractC12782ctV2.AwvSrB()) && address2.length() > 0) {
                    str2 = str4;
                    arrayList = arrayList2;
                    if (!new C13847daM(c10854bwMOLrzqt4.fetchVPNInfo()).OLrzqt(address2)) {
                        C56406yEe.AEQbTJ(arrayList14, new Function1() { // from class: o.cEv
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj6) {
                                return java.lang.Boolean.valueOf(WalletUpdateWorker.OLrzqt((ChainAddress) obj6));
                            }
                        });
                        arrayList3.add(walletUpdateWorker.AYXKKw.KWHzl(abstractC12782ctV2.DbNXlk(), c10854bwMOLrzqt4.AEQbTJ()));
                        z = true;
                    }
                } else {
                    str2 = str4;
                    arrayList = arrayList2;
                }
                Unit unit2 = Unit.INSTANCE;
            } else {
                str2 = str4;
                arrayList = arrayList2;
                str3 = str;
            }
            C10854bwM c10854bwMOLrzqt5 = c10954byG2.valueOf().copydefault(70000078L);
            if (c10854bwMOLrzqt5 != null && c10854bwMOLrzqt5.QOLQEE() != 2 && ((abstractC12782ctV2.AubY() || (abstractC12782ctV2.AwvSrB() && (c10854bwMKWHzl = c10954byG2.valueOf().KWHzl(Long.valueOf(abstractC12782ctV2.flVtFt()))) != null && c10854bwMKWHzl.gwTjWJ())) && !SPUtils.getBoolean(abstractC12782ctV2.DbNXlk(), false, "wallet_deleted_initia_address_v3") && abstractC12782ctV2.QCjLjM() != WalletSyncStatus.HasSync.getValue() && C56406yEe.AEQbTJ(arrayList14, new Function1() { // from class: o.cEx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj6) {
                    return java.lang.Boolean.valueOf(WalletUpdateWorker.AhwBna((ChainAddress) obj6));
                }
            }))) {
                AbstractC58260yxt<Integer> abstractC58260yxtKWHzl = walletUpdateWorker.AYXKKw.KWHzl(abstractC12782ctV2.DbNXlk(), c10854bwMOLrzqt5.AEQbTJ());
                final Function1 function1 = new Function1() { // from class: o.cEu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj6) {
                        return WalletUpdateWorker.copydefault(abstractC12782ctV2, (java.lang.Integer) obj6);
                    }
                };
                arrayList3.add(abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cEy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj6) {
                        return WalletUpdateWorker.gkJEwt(function1, obj6);
                    }
                }));
                arrayList3.add(walletUpdateWorker.djBIcL.AEQbTJ(abstractC12782ctV2.DbNXlk(), c10854bwMOLrzqt5.fetchVPNInfo()));
            } else {
                if (z) {
                }
                if (!abstractC12782ctV2.AubY() || abstractC12782ctV2.ORxRYg()) {
                    z2 = false;
                    for (ChainAddress chainAddress6 : abstractC12782ctV2.valueOf()) {
                        C10854bwM c10854bwMKWHzl8 = C10954byG.EZpvd.valueOf().KWHzl(chainAddress6.getCoinId());
                        if (c10854bwMKWHzl8 != null) {
                            z3 = true;
                            if (c10854bwMKWHzl8.AxsJAYaxsJAY()) {
                            }
                            it = abstractC12782ctV2.gGvvIC().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = str3;
                                    break;
                                }
                                next = it.next();
                                ChainAddress chainAddress7 = (ChainAddress) next;
                                if (Intrinsics.EZpvd((Object) chainAddress7.getAddress(), (Object) chainAddress6.getAddress()) && chainAddress7.getCoinId() == c10854bwMKWHzl8.AhwBna()) {
                                    break;
                                }
                            }
                            ChainAddress chainAddress8 = (ChainAddress) next;
                            address = chainAddress8 == null ? chainAddress8.getAddress() : str3;
                            if (address != null || address.length() == 0) {
                                abstractC12782ctV2.gGvvIC().add(chainAddress6.copy((253 & 1) != 0 ? chainAddress6.coinId : 0L, (253 & 2) != 0 ? chainAddress6.address : null, (253 & 4) != 0 ? chainAddress6.addressType : 0, (253 & 8) != 0 ? chainAddress6.proxyAddres : null, (253 & 16) != 0 ? chainAddress6.eoaAddress : null, (253 & 32) != 0 ? chainAddress6.isDefault : false, (253 & 64) != 0 ? chainAddress6.publicKey : null, (253 & 128) != 0 ? chainAddress6.derivePath : null));
                                z2 = true;
                            }
                        } else {
                            z3 = true;
                        }
                        if ((c10854bwMKWHzl8 != null && c10854bwMKWHzl8.DLWbHP() == z3) || (c10854bwMKWHzl8 != null && c10854bwMKWHzl8.flVtFt() == z3)) {
                            it = abstractC12782ctV2.gGvvIC().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                            ChainAddress chainAddress82 = (ChainAddress) next;
                            if (chainAddress82 == null) {
                            }
                            if (address != null) {
                            }
                            abstractC12782ctV2.gGvvIC().add(chainAddress6.copy((253 & 1) != 0 ? chainAddress6.coinId : 0L, (253 & 2) != 0 ? chainAddress6.address : null, (253 & 4) != 0 ? chainAddress6.addressType : 0, (253 & 8) != 0 ? chainAddress6.proxyAddres : null, (253 & 16) != 0 ? chainAddress6.eoaAddress : null, (253 & 32) != 0 ? chainAddress6.isDefault : false, (253 & 64) != 0 ? chainAddress6.publicKey : null, (253 & 128) != 0 ? chainAddress6.derivePath : null));
                            z2 = true;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (C11161cDz.OLrzqt.OLrzqt(abstractC12782ctV2)) {
                    zAEQbTJ = true;
                    z2 = true;
                }
                if (abstractC12782ctV2.ORxRYg()) {
                    for (ChainAddress chainAddress9 : abstractC12782ctV2.valueOf()) {
                        if (chainAddress9.getPublicKey().length() == 0) {
                            chainAddress9.setPublicKey(walletUpdateWorker.AEQbTJ(chainAddress9, abstractC12782ctV2));
                            zAEQbTJ = true;
                        }
                    }
                    for (ChainAddress chainAddress10 : abstractC12782ctV2.gGvvIC()) {
                        if (chainAddress10.getPublicKey().length() == 0) {
                            chainAddress10.setPublicKey(walletUpdateWorker.AEQbTJ(chainAddress10, abstractC12782ctV2));
                            z2 = true;
                        }
                    }
                }
                if (SPUtils.getBoolean("recreate_btc_legacy_address_for_hardware", false)) {
                    C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault();
                    if (abstractC12782ctV2.zuBGHE()) {
                        copydefault(c10854bwMCopydefault, abstractC12782ctV2, abstractC12782ctV2.valueOf());
                        copydefault(c10854bwMCopydefault, abstractC12782ctV2, abstractC12782ctV2.gGvvIC());
                        zAEQbTJ = true;
                        z2 = true;
                    }
                    if (abstractC12782ctV2.AxsJAY()) {
                        KWHzl(c10854bwMCopydefault, abstractC12782ctV2, abstractC12782ctV2.valueOf());
                        KWHzl(c10854bwMCopydefault, abstractC12782ctV2, abstractC12782ctV2.gGvvIC());
                        zAEQbTJ = true;
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                }
                if (SPUtils.getBoolean("update_near_and_sui_pub_key", false, "wallet_biz_sp_file")) {
                    ChainAddress chainAddress11 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, 397L, null, 2, null);
                    ChainAddress chainAddress12 = (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, 784L, null, 2, null);
                    if (chainAddress11 != null && (publicKey2 = chainAddress11.getPublicKey()) != null && C11600cUg.AEQbTJ(publicKey2)) {
                        chainAddress11.setPublicKey("ed25519:" + xYW.AEQbTJ.valueOf(C54910xZw.EZpvd(chainAddress11.getPublicKey())));
                        zAEQbTJ = true;
                    }
                    if (chainAddress12 == null || (publicKey = chainAddress12.getPublicKey()) == null || !C11600cUg.AEQbTJ(publicKey)) {
                        z5 = zAEQbTJ;
                    } else {
                        chainAddress12.setPublicKey(xYW.AEQbTJ.fetchVPNInfo(C54910xZw.EZpvd(chainAddress12.getPublicKey())));
                        z5 = true;
                    }
                }
                if (!z5 || z4 || walletUpdateWorker.copydefault(abstractC12782ctV2)) {
                    abstractC12782ctV = abstractC12782ctV2;
                    arrayList4.add(walletUpdateWorker.copydefault(abstractC12782ctV2, z5, z4, "", arrayList5, abstractC12782ctV2.EZpvd()));
                } else {
                    abstractC12782ctV = abstractC12782ctV2;
                }
                if (!abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB()) {
                    List<C10854bwM> listOFhtUX = abstractC12782ctV.OFhtUX();
                    ArrayList arrayList15 = new ArrayList();
                    for (Object obj6 : listOFhtUX) {
                        C10854bwM c10854bwM = (C10854bwM) obj6;
                        if (!abstractC12782ctV.AhwBna(Long.valueOf(c10854bwM.AEQbTJ())) && !c10854bwM.fIwbmz() && !c10854bwM.ejfBZ() && !c10854bwM.fARcdN()) {
                            arrayList15.add(obj6);
                        }
                    }
                    it2 = arrayList15.iterator();
                    while (it2.hasNext()) {
                        walletUpdateWorker.valueOf.add(Long.valueOf(((C10854bwM) it2.next()).fetchVPNInfo()));
                    }
                }
                ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList16 = arrayList;
                walletUpdateWorker.KWHzl(abstractC12782ctV, arrayList16);
                arrayList2 = arrayList16;
                str4 = str2;
            }
            abstractC12782ctV2.OLrzqt(new Function1() { // from class: o.cEw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj7) {
                    return WalletUpdateWorker.AhwBna(arrayList14, (java.util.ArrayList) obj7);
                }
            });
            if (abstractC12782ctV2.AubY()) {
                z2 = false;
                while (r1.hasNext()) {
                }
            }
            if (C11161cDz.OLrzqt.OLrzqt(abstractC12782ctV2)) {
            }
            if (abstractC12782ctV2.ORxRYg()) {
            }
            if (SPUtils.getBoolean("recreate_btc_legacy_address_for_hardware", false)) {
            }
            if (SPUtils.getBoolean("update_near_and_sui_pub_key", false, "wallet_biz_sp_file")) {
            }
            if (z5) {
                abstractC12782ctV = abstractC12782ctV2;
                arrayList4.add(walletUpdateWorker.copydefault(abstractC12782ctV2, z5, z4, "", arrayList5, abstractC12782ctV2.EZpvd()));
            }
            if (!abstractC12782ctV.AubY()) {
                List<C10854bwM> listOFhtUX2 = abstractC12782ctV.OFhtUX();
                ArrayList arrayList152 = new ArrayList();
                while (r0.hasNext()) {
                }
                it2 = arrayList152.iterator();
                while (it2.hasNext()) {
                }
            }
            ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList162 = arrayList;
            walletUpdateWorker.KWHzl(abstractC12782ctV, arrayList162);
            arrayList2 = arrayList162;
            str4 = str2;
        }
        ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList17 = arrayList2;
        if (!arrayList3.isEmpty()) {
            C11607cUn.KWHzl(arrayList3).bO_();
        }
        return new ActionBar(arrayList17, arrayList4);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.model.ChainAddress.copy$default(com.okinc.business.defi.biz.model.ChainAddress, long, java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.defi.biz.model.ChainAddress */
    public static final ArrayList copydefault(C10854bwM c10854bwM, ArrayList arrayList, ArrayList arrayList2) {
        Object next;
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ChainAddress) next).getCoinId() == c10854bwM.AEQbTJ()) {
                break;
            }
        }
        ChainAddress chainAddress = (ChainAddress) next;
        if (chainAddress != null) {
            arrayList2.remove(chainAddress);
            ChainAddress chainAddressCopy = chainAddress.copy((253 & 1) != 0 ? chainAddress.coinId : 0L, (253 & 2) != 0 ? chainAddress.address : C59449zhJ.replace$default(chainAddress.getAddress(), "ronin:", EIP1271Verifier.hexPrefix, false, 4, (Object) null), (253 & 4) != 0 ? chainAddress.addressType : 0, (253 & 8) != 0 ? chainAddress.proxyAddres : null, (253 & 16) != 0 ? chainAddress.eoaAddress : null, (253 & 32) != 0 ? chainAddress.isDefault : false, (253 & 64) != 0 ? chainAddress.publicKey : null, (253 & 128) != 0 ? chainAddress.derivePath : null);
            arrayList2.add(chainAddressCopy);
            arrayList.add(chainAddressCopy);
        }
        return arrayList2;
    }

    public static final boolean EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        return address == null || address.length() == 0;
    }

    public static final HDWalletCoin gEmmrt(C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), C8322bAY.KWHzl.KWHzl(c10854bwM.fetchVPNInfo(), false), 0, c10854bwM.iwGUEr(), 16, (DefaultConstructorMarker) null);
    }

    public static final ArrayList EZpvd(List list, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.addAll(list);
        return arrayList;
    }

    public static final boolean EZpvd(ChainAddress chainAddress) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(chainAddress.getCoinId()));
        return c10854bwMKWHzl != null && c10854bwMKWHzl.ODXsMY();
    }

    public static final boolean OLrzqt(ChainAddress chainAddress) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(chainAddress.getCoinId()));
        return c10854bwMKWHzl != null && c10854bwMKWHzl.Dmq();
    }

    public static final boolean AhwBna(ChainAddress chainAddress) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(chainAddress.getCoinId()));
        return c10854bwMKWHzl != null && c10854bwMKWHzl.gwTjWJ();
    }

    public static final Integer gkJEwt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Integer) function1.invoke(obj);
    }

    public static final Integer copydefault(AbstractC12782ctV abstractC12782ctV, Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        SPUtils.put(abstractC12782ctV.DbNXlk(), Boolean.TRUE, "wallet_deleted_initia_address_v3");
        return num;
    }

    public static final void copydefault(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, List<ChainAddress> list) {
        Object obj;
        Object next;
        AbstractC12784ctX abstractC12784ctXGwTjWJ;
        C13854daT c13854daTFetchVPNInfo;
        List<OneKeyAccountInfo> listDjBIcL;
        Object next2;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            if (c10854bwM != null && chainAddress.getCoinId() == c10854bwM.AEQbTJ() && chainAddress.getAddressType() == AddressType.Legacy.getValue()) {
                break;
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) next;
        if (chainAddress2 == null || (abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ()) == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null || (listDjBIcL = c13854daTFetchVPNInfo.djBIcL()) == null) {
            return;
        }
        Iterator<T> it2 = listDjBIcL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((OneKeyAccountInfo) next2).getAddressIndex() == abstractC12782ctV.finit()) {
                    break;
                }
            }
        }
        OneKeyAccountInfo oneKeyAccountInfo = (OneKeyAccountInfo) next2;
        if (oneKeyAccountInfo != null) {
            Iterator<T> it3 = oneKeyAccountInfo.getBtcAddresses().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                if (((OneKeyAddress) next3).getType() == AddressType.Legacy.getValue()) {
                    obj = next3;
                    break;
                }
            }
            OneKeyAddress oneKeyAddress = (OneKeyAddress) obj;
            if (oneKeyAddress != null) {
                chainAddress2.setAddress(oneKeyAddress.getAddress());
                chainAddress2.setDerivePath(oneKeyAddress.getPath());
            }
        }
    }

    public static final void KWHzl(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, List<ChainAddress> list) {
        Object obj;
        Object next;
        C13854daT c13854daTFetchVPNInfo;
        KeystoneMultiAccount keystoneMultiAccountAhwBna;
        List<KeystoneAccount> accounts;
        SortedMap<Integer, List<KeystoneAddressInfo>> sortedMapCopydefault;
        List<KeystoneAddressInfo> list2;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            if (c10854bwM != null && chainAddress.getCoinId() == c10854bwM.AEQbTJ() && chainAddress.getAddressType() == AddressType.Legacy.getValue()) {
                break;
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) next;
        if (chainAddress2 != null) {
            xZX xzx = xZX.OLrzqt;
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null || (keystoneMultiAccountAhwBna = c13854daTFetchVPNInfo.AhwBna()) == null || (accounts = keystoneMultiAccountAhwBna.getAccounts()) == null || (sortedMapCopydefault = xzx.copydefault(xzx.EZpvd(accounts))) == null || (list2 = sortedMapCopydefault.get(Integer.valueOf(abstractC12782ctV.finit()))) == null) {
                return;
            }
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                KeystoneAddressInfo keystoneAddressInfo = (KeystoneAddressInfo) next2;
                Long chainId = keystoneAddressInfo.getChainId();
                if (chainId != null && chainId.longValue() == 0) {
                    Integer addressType = keystoneAddressInfo.getAddressType();
                    int value = AddressType.Legacy.getValue();
                    if (addressType != null && addressType.intValue() == value) {
                        obj = next2;
                        break;
                    }
                }
            }
            KeystoneAddressInfo keystoneAddressInfo2 = (KeystoneAddressInfo) obj;
            if (keystoneAddressInfo2 != null) {
                String address = keystoneAddressInfo2.getAddress();
                if (address == null) {
                    address = "";
                }
                chainAddress2.setAddress(address);
                String path = keystoneAddressInfo2.getPath();
                if (path == null) {
                    path = "";
                }
                chainAddress2.setDerivePath(path);
                String publicKey = keystoneAddressInfo2.getPublicKey();
                chainAddress2.setPublicKey(publicKey != null ? publicKey : "");
            }
        }
    }

    public static final InterfaceC60096zvd iRxXKY(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(final ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (actionBar.AEQbTJ().isEmpty()) {
            return AbstractC58185ywX.KWHzl(actionBar.EZpvd());
        }
        ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayListAEQbTJ = actionBar.AEQbTJ();
        final Function1 function1 = new Function1() { // from class: o.cDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.AEQbTJ(actionBar, (java.lang.Object[]) obj);
            }
        };
        return AbstractC58185ywX.EZpvd((Iterable) arrayListAEQbTJ, new InterfaceC58229yxO() { // from class: o.cDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.hUfVAv(function1, obj);
            }
        });
    }

    public static final ArrayList hUfVAv(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final ArrayList AEQbTJ(ActionBar actionBar, Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return actionBar.EZpvd();
    }

    public static final InterfaceC60096zvd QKudOq(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cuN.updateWallets$default(o.cuN, java.util.List, java.lang.String, java.lang.String, int, java.lang.Object):o.ywX */
    public static final InterfaceC60096zvd KWHzl(WalletUpdateWorker walletUpdateWorker, final ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        AbstractC58185ywX abstractC58185ywXUpdateWallets$default = C12827cuN.updateWallets$default(walletUpdateWorker.AhwBna, arrayList, "WalletUpdateWorker update", null, 4, null);
        final Function1 function1 = new Function1() { // from class: o.cDO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.EZpvd(arrayList, (java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXUpdateWallets$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cDN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.DAIeex(function1, obj);
            }
        });
    }

    public static final Boolean DAIeex(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Boolean) function1.invoke(obj);
    }

    public static final Boolean EZpvd(ArrayList arrayList, Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.copydefault(arrayList);
        return Boolean.valueOf(!arrayList.isEmpty());
    }

    public static final void AxsJAYsNCnLh(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Boolean bool) {
        pUU.copydefault("WalletUpdateWorker", "upgradeAllWallets result = " + bool);
        Intrinsics.copydefault(bool);
        RxBus.AEQbTJ(new xXN(bool.booleanValue()));
        return Unit.INSTANCE;
    }

    public final String AEQbTJ(ChainAddress chainAddress, AbstractC12782ctV abstractC12782ctV) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(chainAddress.getCoinId()));
        if (c10854bwMKWHzl == null) {
            return "";
        }
        xYQ xyq = xYQ.KWHzl;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
        if (ecdsaPubkey == null) {
            ecdsaPubkey = "";
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
        if (ecdsaChainCode == null) {
            ecdsaChainCode = "";
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
        String ed25519Pubkey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEd25519Pubkey() : null;
        if (ed25519Pubkey == null) {
            ed25519Pubkey = "";
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
        String ed25519ChainCode = mpcWalletEncodeInfoQSBOWP4 != null ? mpcWalletEncodeInfoQSBOWP4.getEd25519ChainCode() : null;
        if (ed25519ChainCode == null) {
            ed25519ChainCode = "";
        }
        WalletAddressList walletAddressList = (WalletAddressList) CollectionsKt___CollectionsKt.firstOrNull(xyq.OLrzqt(ecdsaPubkey, ecdsaChainCode, ed25519Pubkey, ed25519ChainCode, C56402yEa.EZpvd(new HDWalletCoin(c10854bwMKWHzl.QKVWgx(), c10854bwMKWHzl.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), chainAddress.getAddressType(), 0, c10854bwMKWHzl.iwGUEr(), 16, (DefaultConstructorMarker) null))));
        String pubKey = walletAddressList != null ? walletAddressList.getPubKey() : null;
        return pubKey == null ? "" : pubKey;
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV, ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList) {
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault();
        C8322bAY c8322bAY = C8322bAY.KWHzl;
        C10854bwM c10854bwMCopydefault2 = c10954byG.valueOf().copydefault();
        long jFetchVPNInfo = c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.fetchVPNInfo() : -1L;
        boolean z = false;
        List<Integer> listAEQbTJ = c8322bAY.AEQbTJ(jFetchVPNInfo, false);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAEQbTJ) {
            if (((Number) obj).intValue() != AddressType.P2SHType.getValue()) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (abstractC12782ctV.OLrzqt(c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : -1L, Integer.valueOf(iIntValue)) == null) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new HDWalletCoin(c10854bwMCopydefault != null ? c10854bwMCopydefault.QKVWgx() : -1L, c10854bwMCopydefault != null ? c10854bwMCopydefault.fetchVPNInfo() : -1L, C13912dbY.copydefault.AhwBna(), iIntValue, 0, c10854bwMCopydefault != null ? c10854bwMCopydefault.iwGUEr() : null, 16, (DefaultConstructorMarker) null));
                xYQ xyq = xYQ.KWHzl;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
                String str = ecdsaPubkey == null ? "" : ecdsaPubkey;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
                String str2 = ecdsaChainCode == null ? "" : ecdsaChainCode;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
                String ed25519Pubkey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEd25519Pubkey() : null;
                String str3 = ed25519Pubkey == null ? "" : ed25519Pubkey;
                MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
                String ed25519ChainCode = mpcWalletEncodeInfoQSBOWP4 != null ? mpcWalletEncodeInfoQSBOWP4.getEd25519ChainCode() : null;
                List<WalletAddressList> listOLrzqt = xyq.OLrzqt(str, str2, str3, ed25519ChainCode == null ? "" : ed25519ChainCode, arrayList3);
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                for (WalletAddressList walletAddressList : listOLrzqt) {
                    CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList.getAddressList());
                    long jAhwBna = c10854bwMCopydefault != null ? c10854bwMCopydefault.AhwBna() : -1L;
                    String address = coinAddressBean != null ? coinAddressBean.getAddress() : null;
                    String str4 = address == null ? "" : address;
                    arrayList4.add(new ChainAddress(jAhwBna, str4, iIntValue, null, null, true, walletAddressList.getPubKey(), "", 24, null));
                }
                abstractC12782ctV.gGvvIC().addAll(arrayList4);
                z = true;
            }
        }
        if (z) {
            AbstractC58185ywX<List<Long>> abstractC58185ywXEZpvd = this.AYXKKw.EZpvd(abstractC12782ctV).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.cFh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return WalletUpdateWorker.EZpvd((java.util.List) obj2);
                }
            };
            arrayList.add(abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cFi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return WalletUpdateWorker.fFgQHt(function1, obj2);
                }
            }));
        }
    }

    public static final ResponseData EZpvd(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ResponseData(0, null, null, null, null, null, 62, null);
    }

    public static final ResponseData fFgQHt(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public final void KWHzl(AbstractC12782ctV abstractC12782ctV, ArrayList<AbstractC58185ywX<ResponseData<Unit>>> arrayList) {
        C10854bwM c10854bwMIsConnected;
        if ((abstractC12782ctV.AwvSrB() || abstractC12782ctV.QfsBiF() || abstractC12782ctV.AEQbTJ(WalletType.KeyWallet)) && abstractC12782ctV.AuCTelauCTel() && (c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected()) != null) {
            long jAhwBna = c10854bwMIsConnected.AhwBna();
            if (abstractC12782ctV.flVtFt() == jAhwBna) {
                return;
            }
            AbstractC58185ywX<Integer> abstractC58185ywXEZpvd = this.AYXKKw.OLrzqt(abstractC12782ctV.DbNXlk(), jAhwBna).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.cEm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return WalletUpdateWorker.djBIcL((java.lang.Integer) obj);
                }
            };
            arrayList.add(abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cEo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return WalletUpdateWorker.fvQaOB(function1, obj);
                }
            }));
        }
    }

    public static final ResponseData djBIcL(Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new ResponseData(0, null, null, null, null, null, 62, null);
    }

    public static final ResponseData fvQaOB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public final AbstractC58260yxt<ArrayList<AbstractC12784ctX>> copydefault(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        if (SPUtils.getBoolean("root_wallet_is_init", false, "wallet_biz_sp_file")) {
            AbstractC58260yxt<ArrayList<AbstractC12784ctX>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ArrayList());
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        AbstractC58260yxt<List<AbstractC12782ctV>> abstractC58260yxtValueOf = this.AYXKKw.valueOf();
        final Function1 function1 = new Function1() { // from class: o.cFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault(this.OLrzqt, str, str3, str2, str4, str5, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtValueOf.OLrzqt(new InterfaceC58229yxO() { // from class: o.cFl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.dxcTrN(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.OLrzqt((java.util.ArrayList) obj);
            }
        };
        AbstractC58260yxt<ArrayList<AbstractC12784ctX>> abstractC58260yxtKWHzl = abstractC58260yxtOLrzqt.KWHzl((InterfaceC58227yxM<? super R>) new InterfaceC58227yxM() { // from class: o.cDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletUpdateWorker.gasjUx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl, "");
        return abstractC58260yxtKWHzl;
    }

    public static final InterfaceC58261yxu dxcTrN(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x009c. Please report as an issue. */
    public static final InterfaceC58261yxu copydefault(WalletUpdateWorker walletUpdateWorker, String str, String str2, String str3, String str4, String str5, List list) {
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            WalletType walletTypeQwvEab = ((AbstractC12782ctV) obj).QwvEab();
            Object arrayList2 = linkedHashMap.get(walletTypeQwvEab);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(walletTypeQwvEab, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        int i2 = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
                if (abstractC12782ctV.AubY() || abstractC12782ctV.QVAiDq()) {
                    if (abstractC12782ctV.gwTjWJ() != null && (i = i + 1) < 0) {
                        yDY.djBIcL();
                    }
                }
            }
        }
        final ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i3 = 1;
            switch (StateListAnimator.EZpvd[((WalletType) entry.getKey()).ordinal()]) {
                case 1:
                case 2:
                    if (!((Collection) entry.getValue()).isEmpty()) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterable iterable = (Iterable) entry.getValue();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (((AbstractC12782ctV) obj2).gwTjWJ() == null) {
                                arrayList5.add(obj2);
                            }
                        }
                        int i4 = i2;
                        for (Object obj3 : arrayList5) {
                            if (i4 < 0) {
                                yDY.AYXKKw();
                            }
                            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj3;
                            AbstractC12784ctX abstractC12784ctXKWHzl = cCD.Companion.KWHzl(abstractC12782ctV2.AkhnZx());
                            abstractC12784ctXKWHzl.OLrzqt(i4);
                            abstractC12782ctV2.fARcdN(str5 + " 01");
                            i3 = 1;
                            abstractC12782ctV2.AEQbTJ(1);
                            abstractC12782ctV2.copydefault(abstractC12784ctXKWHzl);
                            arrayList4.add(abstractC12782ctV2);
                            arrayList.add(walletUpdateWorker.AYXKKw.AEQbTJ(abstractC12784ctXKWHzl));
                            arrayList3.add(abstractC12784ctXKWHzl);
                            int i5 = i4;
                            i4++;
                            i = i5;
                        }
                        i += i3;
                        AbstractC58260yxt<Integer> abstractC58260yxtAYXKKw = walletUpdateWorker.AYXKKw.AYXKKw(arrayList4);
                        final Function1 function1 = new Function1() { // from class: o.cEh
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return WalletUpdateWorker.AEQbTJ((java.lang.Integer) obj4);
                            }
                        };
                        arrayList.add(abstractC58260yxtAYXKKw.copydefault(new InterfaceC58229yxO() { // from class: o.cEf
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj4) {
                                return WalletUpdateWorker.fZBcTu(function1, obj4);
                            }
                        }));
                    }
                    i2 = 0;
                    break;
                case 3:
                    AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull((List) entry.getValue());
                    if ((abstractC12782ctV3 != null ? abstractC12782ctV3.gwTjWJ() : null) == null) {
                        Iterable iterable2 = (Iterable) entry.getValue();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj4 : iterable2) {
                            if (((AbstractC12782ctV) obj4).gwTjWJ() == null) {
                                arrayList6.add(obj4);
                            }
                        }
                        arrayList.addAll(walletUpdateWorker.OLrzqt(arrayList6, str, i));
                        if (!((Collection) entry.getValue()).isEmpty()) {
                            i++;
                        } else {
                            i2 = 0;
                        }
                    } else {
                        i2 = 0;
                    }
                    break;
                case 4:
                    arrayList.addAll(walletUpdateWorker.OLrzqt((List<? extends AbstractC12782ctV>) entry.getValue(), str2, i));
                    if (!((Collection) entry.getValue()).isEmpty()) {
                        i++;
                    } else {
                        i2 = 0;
                    }
                    break;
                case 5:
                    arrayList.addAll(walletUpdateWorker.OLrzqt((List<? extends AbstractC12782ctV>) entry.getValue(), str3, i));
                    i2 = 0;
                    break;
                case 6:
                    arrayList.addAll(walletUpdateWorker.OLrzqt((List<? extends AbstractC12782ctV>) entry.getValue(), str4, i2));
                    i2 = 0;
                    break;
                default:
                    i2 = 0;
                    break;
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function12 = new Function1() { // from class: o.cEg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj5) {
                return WalletUpdateWorker.AEQbTJ(arrayList3, (java.util.List) obj5);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj5) {
                return WalletUpdateWorker.dvKsVJ(function12, obj5);
            }
        });
    }

    public static final Long AEQbTJ(Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return Long.valueOf(num.intValue());
    }

    public static final Long fZBcTu(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Long) function1.invoke(obj);
    }

    public static final ArrayList dvKsVJ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final void gasjUx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ArrayList arrayList) {
        SPUtils.put("root_wallet_is_init", Boolean.TRUE, "wallet_biz_sp_file");
        return Unit.INSTANCE;
    }

    public final ArrayList<AbstractC58260yxt<Long>> OLrzqt(List<? extends AbstractC12782ctV> list, String str, int i) {
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<AbstractC58260yxt<Long>> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        AbstractC12784ctX abstractC12784ctXKWHzl = cCD.Companion.KWHzl(str);
        abstractC12784ctXKWHzl.OLrzqt(i);
        arrayList.add(this.AYXKKw.AEQbTJ(abstractC12784ctXKWHzl));
        for (AbstractC12782ctV abstractC12782ctV : list) {
            abstractC12782ctV.copydefault(abstractC12784ctXKWHzl);
            arrayList2.add(abstractC12782ctV);
        }
        AbstractC58260yxt<Integer> abstractC58260yxtAYXKKw = this.AYXKKw.AYXKKw(arrayList2);
        final Function1 function1 = new Function1() { // from class: o.cDM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.KWHzl((java.lang.Integer) obj);
            }
        };
        arrayList.add(abstractC58260yxtAYXKKw.copydefault(new InterfaceC58229yxO() { // from class: o.cDL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.finit(function1, obj);
            }
        }));
        return arrayList;
    }

    public static final Long KWHzl(Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return Long.valueOf(num.intValue());
    }

    public static final Long finit(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Long) function1.invoke(obj);
    }

    public final void KWHzl(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        valueOf().add(taskDescription);
    }

    public final void EZpvd(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        valueOf().remove(taskDescription);
    }

    public static /* synthetic */ void completeWalletsAddresses$OKWallet_wallet_impl$default(WalletUpdateWorker walletUpdateWorker, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        walletUpdateWorker.OLrzqt(str, str2);
    }

    public final void OLrzqt(@NotNull final String str, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.AhwBna, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cDT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.EZpvd(str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtFetchAllWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.cDW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.aKErDB(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cDZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cDV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.ORxRYg(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cDY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault(new InterfaceC58229yxO() { // from class: o.cEd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.QKVWgx(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtEZpvd = C11607cUn.EZpvd(abstractC58260yxtCopydefault);
        final Function1 function14 = new Function1() { // from class: o.cEc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.EZpvd(this.KWHzl, (java.util.ArrayList) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.cEe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.QUSxYX(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(abstractC58260yxtOLrzqt3);
        final Function1 function15 = new Function1() { // from class: o.cEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.AEQbTJ(this.KWHzl, str2, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cEb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.QVAiDq(function15, obj);
            }
        });
        final Function1 function16 = new Function1() { // from class: o.cDU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault(this.copydefault, (java.lang.Integer) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cDQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletUpdateWorker.UeEOUB(function16, obj);
            }
        };
        final Function1 function17 = new Function1() { // from class: o.cDR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletUpdateWorker.djSkpj(function17, obj);
            }
        });
    }

    public static final InterfaceC58261yxu aKErDB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final Pair RcXXUw(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair OLrzqt(AbstractC12782ctV abstractC12782ctV, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(str, abstractC12782ctV);
    }

    public static final Pair dNCPSb(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair KWHzl(AbstractC12782ctV abstractC12782ctV, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C56390yDp.OLrzqt(str, abstractC12782ctV);
    }

    public static final InterfaceC58261yxu ORxRYg(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final List AwvSrB(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (List) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(WalletUpdateWorker walletUpdateWorker, final List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<List<Pair<String, AbstractC12782ctV>>> abstractC58260yxtCopydefault = walletUpdateWorker.djBIcL.copydefault(list);
        final Function1 function1 = new Function1() { // from class: o.cEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.OLrzqt(list, (java.util.List) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.AwvSrB(function1, obj);
            }
        });
    }

    public static final List OLrzqt(List list, List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.copydefault(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((AbstractC12782ctV) ((Pair) obj).getSecond()).QVAiDq()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList QKVWgx(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final ArrayList copydefault(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) pair.component1();
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) pair.component2();
            List<C10854bwM> listOFhtUX = abstractC12782ctV.OFhtUX();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = listOFhtUX.iterator();
            while (true) {
                boolean z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                C10854bwM c10854bwM = (C10854bwM) next;
                if (!c10854bwM.AxsJAYaxsJAY() && !c10854bwM.DLWbHP()) {
                    z = false;
                }
                if (!abstractC12782ctV.AhwBna(Long.valueOf(c10854bwM.AEQbTJ())) || z) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new Triple(str, abstractC12782ctV, arrayList2));
            }
        }
        return arrayList;
    }

    public static final InterfaceC58261yxu QUSxYX(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bAY.getAddressTypeList$default(o.bAY, long, boolean, int, java.lang.Object):java.util.List */
    /* JADX DEBUG: Class process forced to load method for inline: o.daM.generateHDAddress$default(o.daM, java.lang.String, int, int, int, java.lang.Object):com.okinc.business.defi.biz.model.WalletAddressItem */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:187:0x0506 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:221:0x05c2 */
    /* JADX DEBUG: Type inference failed for r0v26. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r0v57. Raw type applied. Possible types: o.ywX<R>, o.ywX */
    /* JADX DEBUG: Type inference failed for r0v80. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r0v88. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r3v57. Raw type applied. Possible types: o.yxO, o.yxO<? super com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.business.defi.biz.net.bean.EosAccountKeyResp>>, ? extends o.zvd<? extends R>> */
    /* JADX DEBUG: Type inference failed for r6v23. Raw type applied. Possible types: o.yxO, o.yxO<? super com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.net.bean.GetNearAccountIdResp>, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x045b  */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.okinc.business.defi.biz.model.ChainAddress] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.okinc.business.defi.biz.model.ChainAddress] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC58261yxu EZpvd(final WalletUpdateWorker walletUpdateWorker, ArrayList arrayList) {
        ArrayList arrayList2;
        Iterator it;
        C10854bwM c10854bwM;
        C10854bwM c10854bwM2;
        boolean z;
        Iterator it2;
        boolean z2;
        boolean z3;
        ArrayList<ChainAddress> arrayList3;
        Long l;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ArrayList arrayList4;
        C10854bwM c10854bwMKWHzl;
        final C10854bwM c10854bwM3;
        int i;
        Object obj;
        AbstractC58185ywX abstractC58185ywXKWHzl;
        C10854bwM c10854bwM4;
        C10854bwM c10854bwM5;
        Intrinsics.checkNotNullParameter(arrayList, "");
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Triple triple = (Triple) it3.next();
            String str = (String) triple.getFirst();
            final AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) triple.getSecond();
            List list = (List) triple.getThird();
            final ArrayList arrayList7 = new ArrayList();
            ArrayList<ChainAddress> arrayList8 = new ArrayList<>(abstractC12782ctV.EZpvd());
            ArrayList arrayList9 = new ArrayList();
            C10854bwM c10854bwM6 = null;
            C10854bwM c10854bwM7 = null;
            for (C10854bwM c10854bwM8 : C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), new Function1() { // from class: o.cED
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(WalletUpdateWorker.AEQbTJ((C10854bwM) obj2));
                }
            })) {
                if (c10854bwM8.OuxcSI()) {
                    Unit unit = Unit.INSTANCE;
                    c10854bwM7 = c10854bwM8;
                } else if (c10854bwM8.QVsKAR()) {
                    Unit unit2 = Unit.INSTANCE;
                    c10854bwM6 = c10854bwM8;
                } else {
                    arrayList9.add(c10854bwM8);
                }
            }
            if (!abstractC12782ctV.AubY()) {
                arrayList2 = arrayList6;
                it = it3;
                c10854bwM = c10854bwM6;
                c10854bwM2 = c10854bwM7;
                if (abstractC12782ctV.AwvSrB()) {
                    Iterator it4 = arrayList9.iterator();
                    z = false;
                    while (it4.hasNext()) {
                        C10854bwM c10854bwM9 = (C10854bwM) it4.next();
                        Iterator it5 = C8322bAY.getAddressTypeList$default(C8322bAY.KWHzl, c10854bwM9.fetchVPNInfo(), false, 2, null).iterator();
                        while (it5.hasNext()) {
                            int iIntValue = ((Number) it5.next()).intValue();
                            WalletAddressItem walletAddressItemKWHzl = new C13847daM(c10854bwM9.fetchVPNInfo()).KWHzl(str, iIntValue, "");
                            String address = walletAddressItemKWHzl != null ? walletAddressItemKWHzl.getAddress() : null;
                            if (address == null || address.length() == 0) {
                                it2 = it4;
                            } else {
                                it2 = it4;
                                ChainAddress chainAddress = new ChainAddress(c10854bwM9.AEQbTJ(), walletAddressItemKWHzl.getAddress(), iIntValue, null, null, iIntValue == C8322bAY.KWHzl.KWHzl(c10854bwM9.fetchVPNInfo(), true), walletAddressItemKWHzl.getPubKey(), "", 24, null);
                                if (chainAddress.isDefault()) {
                                    arrayList7.add(chainAddress);
                                }
                                if (c10854bwM9.DsrFlB()) {
                                    abstractC12782ctV.gGvvIC().add(chainAddress);
                                    z = true;
                                }
                            }
                            it4 = it2;
                        }
                    }
                } else {
                    z = false;
                }
            } else {
                ArrayList arrayList10 = new ArrayList(C56403yEb.AYXKKw(arrayList9, 10));
                Iterator it6 = arrayList9.iterator();
                while (it6.hasNext()) {
                    C10854bwM c10854bwM10 = (C10854bwM) it6.next();
                    List addressTypeList$default = C8322bAY.getAddressTypeList$default(C8322bAY.KWHzl, c10854bwM10.fetchVPNInfo(), false, 2, null);
                    Iterator it7 = it6;
                    Iterator it8 = it3;
                    ArrayList arrayList11 = new ArrayList(C56403yEb.AYXKKw(addressTypeList$default, 10));
                    Iterator it9 = addressTypeList$default.iterator();
                    while (it9.hasNext()) {
                        arrayList11.add(new HDWalletCoin(c10854bwM10.QKVWgx(), c10854bwM10.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), ((Number) it9.next()).intValue(), abstractC12782ctV.finit(), c10854bwM10.iwGUEr()));
                    }
                    arrayList10.add(arrayList11);
                    it6 = it7;
                    it3 = it8;
                }
                it = it3;
                z = false;
                for (WalletAddressList walletAddressList : C54908xZu.AEQbTJ.EZpvd(str, abstractC12782ctV.DCUTEI(), C56403yEb.QOLQEE(arrayList10), abstractC12782ctV.DbNXlk())) {
                    Iterator it10 = walletAddressList.getAddressList().iterator();
                    while (it10.hasNext()) {
                        CoinAddressBean coinAddressBean = (CoinAddressBean) it10.next();
                        ArrayList arrayList12 = arrayList6;
                        Iterator it11 = it10;
                        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(walletAddressList.getChainId());
                        if (coinAddressBean.getAddress().length() == 0 || c10854bwMOLrzqt == null) {
                            c10854bwM4 = c10854bwM6;
                            c10854bwM5 = c10854bwM7;
                        } else {
                            c10854bwM4 = c10854bwM6;
                            c10854bwM5 = c10854bwM7;
                            ChainAddress chainAddress2 = new ChainAddress(c10854bwMOLrzqt.AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), null, null, C8322bAY.KWHzl.KWHzl(c10854bwMOLrzqt.fetchVPNInfo(), true) == coinAddressBean.getType(), walletAddressList.getPubKey(), "", 24, null);
                            if (chainAddress2.isDefault()) {
                                arrayList7.add(chainAddress2);
                            }
                            if (c10854bwMOLrzqt.DsrFlB()) {
                                abstractC12782ctV.gGvvIC().add(chainAddress2);
                                z = true;
                            }
                        }
                        it10 = it11;
                        arrayList6 = arrayList12;
                        c10854bwM7 = c10854bwM5;
                        c10854bwM6 = c10854bwM4;
                    }
                }
                arrayList2 = arrayList6;
                c10854bwM = c10854bwM6;
                c10854bwM2 = c10854bwM7;
            }
            if (abstractC12782ctV.ORxRYg()) {
                List<HDWalletCoin> listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(abstractC12782ctV.OFhtUX()), new Function1() { // from class: o.cEN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return java.lang.Boolean.valueOf(WalletUpdateWorker.AEQbTJ(abstractC12782ctV, (C10854bwM) obj2));
                    }
                }), new Function1() { // from class: o.cEK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletUpdateWorker.KWHzl((C10854bwM) obj2);
                    }
                }));
                if (!listZuBGHE.isEmpty()) {
                    xYQ xyq = xYQ.KWHzl;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                    String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
                    String str2 = ecdsaPubkey == null ? "" : ecdsaPubkey;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                    String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
                    String str3 = ecdsaChainCode == null ? "" : ecdsaChainCode;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
                    String ed25519Pubkey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEd25519Pubkey() : null;
                    String str4 = ed25519Pubkey == null ? "" : ed25519Pubkey;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
                    String ed25519ChainCode = mpcWalletEncodeInfoQSBOWP4 != null ? mpcWalletEncodeInfoQSBOWP4.getEd25519ChainCode() : null;
                    List<WalletAddressList> listOLrzqt = xyq.OLrzqt(str2, str3, str4, ed25519ChainCode == null ? "" : ed25519ChainCode, listZuBGHE);
                    ArrayList arrayList13 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                    for (WalletAddressList walletAddressList2 : listOLrzqt) {
                        CoinAddressBean coinAddressBean2 = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList2.getAddressList());
                        C10854bwM c10854bwMOLrzqt2 = C10954byG.EZpvd.valueOf().copydefault(walletAddressList2.getChainId());
                        long jAhwBna = c10854bwMOLrzqt2 != null ? c10854bwMOLrzqt2.AhwBna() : 0L;
                        String address2 = coinAddressBean2 != null ? coinAddressBean2.getAddress() : null;
                        arrayList13.add(new ChainAddress(jAhwBna, address2 == null ? "" : address2, coinAddressBean2 != null ? coinAddressBean2.getType() : AddressType.Legacy.getValue(), null, null, true, walletAddressList2.getPubKey(), "", 24, null));
                    }
                    arrayList7.addAll(arrayList13);
                }
            }
            boolean z8 = abstractC12782ctV.AubY() && !(c10854bwM2 == null && c10854bwM == null);
            boolean z9 = (arrayList7.isEmpty() ^ true) && c10854bwM2 == null && c10854bwM == null;
            if (z8) {
                if (c10854bwM2 != null) {
                    c10854bwM3 = c10854bwM;
                    final C10854bwM c10854bwM11 = c10854bwM2;
                    final WalletAddressItem walletAddressItemGenerateHDAddress$default = C13847daM.generateHDAddress$default(new C13847daM(c10854bwM2.fetchVPNInfo()), str, abstractC12782ctV.finit(), 0, 4, null);
                    final C13852daR c13852daRODWQjV = abstractC12782ctV.ODWQjV();
                    if (c13852daRODWQjV != null) {
                        final String address3 = walletAddressItemGenerateHDAddress$default != null ? walletAddressItemGenerateHDAddress$default.getAddress() : null;
                        if (address3 == null) {
                            address3 = "";
                        }
                        c13852daRODWQjV.EZpvd(address3);
                        z3 = z;
                        arrayList3 = arrayList8;
                        z2 = z9;
                        AbstractC58185ywX<ResponseData<List<EosAccountKeyResp>>> abstractC58185ywXEZpvd = walletUpdateWorker.gEmmrt.EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), abstractC12782ctV.DbNXlk(), c13852daRODWQjV.copydefault());
                        final Function1 function1 = new Function1() { // from class: o.cER
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return WalletUpdateWorker.copydefault(c13852daRODWQjV, address3, walletUpdateWorker, abstractC12782ctV, (ResponseData) obj2);
                            }
                        };
                        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl((InterfaceC58229yxO<? super ResponseData<List<EosAccountKeyResp>>, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cEP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj2) {
                                return WalletUpdateWorker.OcIXYQ(function1, obj2);
                            }
                        });
                        final Function1 function12 = new Function1() { // from class: o.cEQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                return WalletUpdateWorker.AEQbTJ(c13852daRODWQjV, abstractC12782ctV, c10854bwM11, walletAddressItemGenerateHDAddress$default, (ResponseData) obj2);
                            }
                        };
                        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.cEO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj2) {
                                return WalletUpdateWorker.DTwDnp(function12, obj2);
                            }
                        });
                        if (abstractC58185ywXKWHzl3 != null) {
                            abstractC58185ywXKWHzl = abstractC58185ywXKWHzl3;
                            i = -1;
                            obj = null;
                        }
                        if (abstractC58185ywXKWHzl == null) {
                        }
                        if (c10854bwM3 != null) {
                            final WalletAddressItem walletAddressItemGenerateHDAddress$default2 = C13847daM.generateHDAddress$default(new C13847daM(c10854bwM3.fetchVPNInfo()), str, abstractC12782ctV.finit(), 0, 4, null);
                            C13934dbu c13934dbu = walletUpdateWorker.gEmmrt;
                            String pubKey = walletAddressItemGenerateHDAddress$default2 != null ? walletAddressItemGenerateHDAddress$default2.getPubKey() : null;
                            if (pubKey == null) {
                                pubKey = "";
                            }
                            AbstractC58185ywX<ResponseData<GetNearAccountIdResp>> abstractC58185ywXDbNXlk = c13934dbu.DbNXlk(pubKey);
                            final Function1 function13 = new Function1() { // from class: o.cEX
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return WalletUpdateWorker.copydefault(walletAddressItemGenerateHDAddress$default2, c10854bwM3, (ResponseData) obj2);
                                }
                            };
                            AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXDbNXlk.AEQbTJ((InterfaceC58229yxO<? super ResponseData<GetNearAccountIdResp>, ? extends R>) new InterfaceC58229yxO() { // from class: o.cET
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58229yxO
                                public final java.lang.Object apply(java.lang.Object obj2) {
                                    return WalletUpdateWorker.QfsBiF(function13, obj2);
                                }
                            });
                            if (abstractC58185ywXKWHzl4 == null) {
                                l = null;
                                abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(-1, null));
                                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl4, "");
                            } else {
                                l = null;
                            }
                            final ArrayList arrayList14 = new ArrayList(arrayList7);
                            final Function2 function2 = new Function2() { // from class: o.cEU
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                                    return WalletUpdateWorker.OLrzqt(arrayList14, (kotlin.Pair) obj2, (kotlin.Pair) obj3);
                                }
                            };
                            AbstractC58185ywX abstractC58185ywXEZpvd2 = AbstractC58185ywX.EZpvd(abstractC58185ywXKWHzl, abstractC58185ywXKWHzl4, new InterfaceC58223yxI() { // from class: o.cEF
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58223yxI
                                public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                                    return WalletUpdateWorker.KWHzl(function2, obj2, obj3);
                                }
                            });
                            final Function1 function14 = new Function1() { // from class: o.cEE
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return WalletUpdateWorker.EZpvd(abstractC12782ctV, (java.util.ArrayList) obj2);
                                }
                            };
                            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cEH
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58229yxO
                                public final java.lang.Object apply(java.lang.Object obj2) {
                                    return WalletUpdateWorker.QbewEr(function14, obj2);
                                }
                            });
                            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                            arrayList5.add(abstractC58185ywXAEQbTJ.gEmmrt().AhwBna(new InterfaceC58229yxO() { // from class: o.cEG
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // o.InterfaceC58229yxO
                                public final java.lang.Object apply(java.lang.Object obj2) {
                                    return WalletUpdateWorker.EZpvd((java.lang.Throwable) obj2);
                                }
                            }));
                            z4 = true;
                        }
                    } else {
                        z2 = z9;
                        z3 = z;
                        arrayList3 = arrayList8;
                    }
                    i = -1;
                    obj = null;
                    abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(-1, null));
                    Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
                    if (abstractC58185ywXKWHzl == null) {
                    }
                    if (c10854bwM3 != null) {
                    }
                } else {
                    z2 = z9;
                    z3 = z;
                    c10854bwM3 = c10854bwM;
                    i = -1;
                    arrayList3 = arrayList8;
                    obj = null;
                }
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(Integer.valueOf(i), obj));
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
                if (c10854bwM3 != null) {
                }
            } else {
                z2 = z9;
                z3 = z;
                arrayList3 = arrayList8;
                l = null;
                z4 = false;
            }
            if (z2) {
                abstractC12782ctV.OLrzqt(new Function1() { // from class: o.cEJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletUpdateWorker.djBIcL(arrayList7, (java.util.ArrayList) obj2);
                    }
                });
                z5 = true;
            } else {
                z5 = z4;
            }
            Iterator it12 = abstractC12782ctV.valueOf().iterator();
            while (it12.hasNext()) {
                ?? r2 = (ChainAddress) it12.next();
                C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(r2.getCoinId()));
                if (c10854bwMKWHzl2 != null && r2.getPublicKey().length() == 0) {
                    WalletAddressItem walletAddressItemEZpvd = new C13847daM(c10854bwMKWHzl2.fetchVPNInfo()).EZpvd(str, abstractC12782ctV.finit(), r2.getAddressType());
                    ?? pubKey2 = walletAddressItemEZpvd != null ? walletAddressItemEZpvd.getPubKey() : l;
                    if (pubKey2 == 0) {
                        pubKey2 = "";
                    }
                    r2.setPublicKey(pubKey2);
                    z5 = true;
                }
            }
            if (abstractC12782ctV.AubY()) {
                walletUpdateWorker.EZpvd(abstractC12782ctV.DbNXlk());
            }
            if (abstractC12782ctV.AubY()) {
                C8322bAY c8322bAY = C8322bAY.KWHzl;
                if (c8322bAY.copydefault(abstractC12782ctV.DbNXlk())) {
                    C10954byG c10954byG = C10954byG.EZpvd;
                    C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault();
                    Long lValueOf = c10854bwMCopydefault != null ? Long.valueOf(c10854bwMCopydefault.AhwBna()) : l;
                    C10854bwM c10854bwMEjfBZ = c10954byG.valueOf().ejfBZ();
                    Long lValueOf2 = c10854bwMEjfBZ != null ? Long.valueOf(c10854bwMEjfBZ.AhwBna()) : l;
                    boolean zOLrzqt = walletUpdateWorker.OLrzqt(lValueOf, abstractC12782ctV, str);
                    boolean zOLrzqt2 = walletUpdateWorker.OLrzqt(lValueOf2, abstractC12782ctV, str);
                    if (zOLrzqt || zOLrzqt2) {
                        z3 = true;
                    }
                    c8322bAY.AEQbTJ(abstractC12782ctV.DbNXlk());
                }
            }
            boolean z10 = z3;
            HashMap<Integer, HashSet<Long>> map = new HashMap<>();
            Iterator it13 = abstractC12782ctV.gGvvIC().iterator();
            while (it13.hasNext()) {
                ?? r6 = (ChainAddress) it13.next();
                if (r6.getPublicKey().length() == 0 && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(r6.getCoinId()))) != null) {
                    WalletAddressItem walletAddressItemEZpvd2 = new C13847daM(c10854bwMKWHzl.fetchVPNInfo()).EZpvd(str, abstractC12782ctV.finit(), r6.getAddressType());
                    ?? pubKey3 = walletAddressItemEZpvd2 != null ? walletAddressItemEZpvd2.getPubKey() : l;
                    if (pubKey3 == 0) {
                        pubKey3 = "";
                    }
                    r6.setPublicKey(pubKey3);
                    z10 = true;
                }
                HashSet<Long> hashSet = map.get(Integer.valueOf(r6.getAddressType()));
                if (hashSet == null) {
                    HashSet<Long> hashSet2 = new HashSet<>();
                    hashSet2.add(Long.valueOf(r6.getCoinId()));
                    map.put(Integer.valueOf(r6.getAddressType()), hashSet2);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    hashSet.add(Long.valueOf(r6.getCoinId()));
                }
            }
            C10954byG c10954byG2 = C10954byG.EZpvd;
            if (walletUpdateWorker.EZpvd(abstractC12782ctV, map, str, c10954byG2.valueOf().copydefault())) {
                z10 = true;
            }
            if (walletUpdateWorker.EZpvd(abstractC12782ctV, map, str, c10954byG2.valueOf().ejfBZ())) {
                z10 = true;
            }
            if (walletUpdateWorker.EZpvd(abstractC12782ctV, map, str, c10954byG2.valueOf().gEmmrt())) {
                z10 = true;
            }
            if (walletUpdateWorker.AhwBna(abstractC12782ctV, str)) {
                z6 = true;
                z7 = true;
            } else {
                z6 = z5;
                z7 = z10;
            }
            boolean z11 = walletUpdateWorker.EZpvd(abstractC12782ctV, str) ? true : z7;
            if (z6 || z11 || walletUpdateWorker.copydefault(abstractC12782ctV)) {
                C12974cxB c12974cxBCopydefault = walletUpdateWorker.copydefault(abstractC12782ctV, z6, z11, str, arrayList3, abstractC12782ctV.EZpvd());
                arrayList4 = arrayList2;
                arrayList4.add(c12974cxBCopydefault);
            } else {
                arrayList4 = arrayList2;
            }
            arrayList6 = arrayList4;
            it3 = it;
        }
        final ArrayList arrayList15 = arrayList6;
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList5);
        final Function1 function15 = new Function1() { // from class: o.cEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return WalletUpdateWorker.KWHzl(arrayList15, (java.util.List) obj2);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return WalletUpdateWorker.RJOkX(function15, obj2);
            }
        });
    }

    public static final boolean AEQbTJ(C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return (c10854bwM.AxsJAYaxsJAY() || c10854bwM.DLWbHP()) ? false : true;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ctV.addressFromChainId$default(o.ctV, long, java.lang.Integer, int, java.lang.Object):com.okinc.business.defi.biz.model.ChainAddress */
    public static final boolean AEQbTJ(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        return address == null || address.length() == 0;
    }

    public static final HDWalletCoin KWHzl(C10854bwM c10854bwM) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        return new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), C8322bAY.KWHzl.KWHzl(c10854bwM.fetchVPNInfo(), false), 0, c10854bwM.iwGUEr(), 16, (DefaultConstructorMarker) null);
    }

    public static final InterfaceC60096zvd OcIXYQ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd DTwDnp(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final Pair QOLQEE(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final Pair copydefault(C10854bwM c10854bwM, C13852daR c13852daR, WalletAddressItem walletAddressItem, Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        long jAEQbTJ = c10854bwM.AEQbTJ();
        String strKWHzl = c13852daR.KWHzl();
        int value = AddressType.Legacy.getValue();
        String pubKey = walletAddressItem != null ? walletAddressItem.getPubKey() : null;
        return C56390yDp.OLrzqt(0, new ChainAddress(jAEQbTJ, strKWHzl, value, null, null, true, pubKey == null ? "" : pubKey, "", 24, null));
    }

    public static final Pair QfsBiF(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Pair) function1.invoke(obj);
    }

    public static final ArrayList KWHzl(Function2 function2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ArrayList) function2.invoke(obj, obj2);
    }

    public static final ArrayList OLrzqt(ArrayList arrayList, Pair pair, Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        ArrayList arrayList2 = new ArrayList(arrayList);
        ChainAddress chainAddress = (ChainAddress) pair.getSecond();
        if (chainAddress != null) {
            arrayList2.add(chainAddress);
        }
        ChainAddress chainAddress2 = (ChainAddress) pair2.getSecond();
        if (chainAddress2 != null) {
            arrayList2.add(chainAddress2);
        }
        return arrayList2;
    }

    public static final Integer QbewEr(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Integer) function1.invoke(obj);
    }

    public static final Integer EZpvd(AbstractC12782ctV abstractC12782ctV, final ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        abstractC12782ctV.OLrzqt(new Function1() { // from class: o.cDK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault(arrayList, (java.util.ArrayList) obj);
            }
        });
        return Integer.valueOf(arrayList.size());
    }

    public static final ArrayList copydefault(ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static final Integer EZpvd(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return -1;
    }

    public static final ArrayList djBIcL(ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList2, "");
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public static final ArrayList RJOkX(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd QVAiDq(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(WalletUpdateWorker walletUpdateWorker, String str, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return walletUpdateWorker.AhwBna.copydefault(arrayList, "WalletUpdateWorker pwd", str);
    }

    public static final void UeEOUB(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(WalletUpdateWorker walletUpdateWorker, Integer num) {
        SPUtils.put("recreate_btc_legacy_address_for_key", Boolean.TRUE);
        Iterator<T> it = walletUpdateWorker.valueOf().iterator();
        while (it.hasNext()) {
            ((TaskDescription) it.next()).KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final void djSkpj(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(WalletUpdateWorker walletUpdateWorker, Throwable th) {
        for (TaskDescription taskDescription : walletUpdateWorker.valueOf()) {
            Intrinsics.copydefault(th);
            taskDescription.EZpvd(th);
        }
        return Unit.INSTANCE;
    }

    public final boolean copydefault(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return abstractC12782ctV.QCjLjM() < WalletSyncStatus.HasSync.getValue();
    }

    public final C12974cxB copydefault(AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, String str, ArrayList<ChainAddress> arrayList, ArrayList<ChainAddress> arrayList2) {
        Object next;
        HashSet<ChainAddress> hashSet = new HashSet<>();
        HashSet<ChainAddress> hashSet2 = new HashSet<>();
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMAhwBna = c10954byG.valueOf().AhwBna();
        Long lValueOf = c10854bwMAhwBna != null ? Long.valueOf(c10854bwMAhwBna.fetchVPNInfo()) : null;
        C10854bwM c10854bwMAuCTel = c10954byG.valueOf().AuCTel();
        Long lValueOf2 = c10854bwMAuCTel != null ? Long.valueOf(c10854bwMAuCTel.fetchVPNInfo()) : null;
        for (ChainAddress chainAddress : arrayList2) {
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ChainAddress chainAddress2 = (ChainAddress) next;
                if (chainAddress2.getCoinId() == chainAddress.getCoinId() && chainAddress2.getAddressType() == chainAddress.getAddressType()) {
                    break;
                }
            }
            ChainAddress chainAddress3 = (ChainAddress) next;
            if (chainAddress3 == null) {
                long chainId = chainAddress.getChainId();
                if (lValueOf == null || chainId != lValueOf.longValue()) {
                    long chainId2 = chainAddress.getChainId();
                    if (lValueOf2 == null || chainId2 != lValueOf2.longValue()) {
                        hashSet2.add(chainAddress);
                    }
                }
                hashSet.add(chainAddress);
            } else if (!Intrinsics.EZpvd((Object) chainAddress3.getAddress(), (Object) chainAddress.getAddress())) {
                hashSet.add(chainAddress);
            }
        }
        return new C12974cxB(abstractC12782ctV, z, z2, this.djBIcL.EZpvd(abstractC12782ctV, str, hashSet2), this.djBIcL.EZpvd(abstractC12782ctV, str, hashSet));
    }

    public final boolean AhwBna(AbstractC12782ctV abstractC12782ctV, String str) {
        WalletAddressItem walletAddressItemKWHzl;
        String address;
        C10854bwM c10854bwMKWHzl;
        if (SPUtils.getBoolean("recreate_btc_legacy_address_for_key", false)) {
            return false;
        }
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault();
        if (c10854bwMCopydefault == null) {
            return false;
        }
        if (abstractC12782ctV.AubY()) {
            walletAddressItemKWHzl = new C13847daM(c10854bwMCopydefault.fetchVPNInfo()).EZpvd(str, abstractC12782ctV.finit(), AddressType.Legacy.getValue());
        } else if (abstractC12782ctV.AwvSrB() && (c10854bwMKWHzl = c10954byG.valueOf().KWHzl(abstractC12782ctV.flVtFt())) != null && c10854bwMKWHzl.AxsJAYaxsJAY()) {
            walletAddressItemKWHzl = new C13847daM(c10854bwMCopydefault.fetchVPNInfo()).KWHzl(str, AddressType.Legacy.getValue(), "");
        } else if (abstractC12782ctV.ORxRYg()) {
            xYQ xyq = xYQ.KWHzl;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
            String str2 = ecdsaPubkey == null ? "" : ecdsaPubkey;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
            String str3 = ecdsaChainCode == null ? "" : ecdsaChainCode;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
            String ed25519Pubkey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEd25519Pubkey() : null;
            String str4 = ed25519Pubkey == null ? "" : ed25519Pubkey;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
            String ed25519ChainCode = mpcWalletEncodeInfoQSBOWP4 != null ? mpcWalletEncodeInfoQSBOWP4.getEd25519ChainCode() : null;
            List<WalletAddressList> listOLrzqt = xyq.OLrzqt(str2, str3, str4, ed25519ChainCode == null ? "" : ed25519ChainCode, C56402yEa.EZpvd(new HDWalletCoin(c10854bwMCopydefault.QKVWgx(), c10854bwMCopydefault.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), AddressType.Legacy.getValue(), 0, c10854bwMCopydefault.iwGUEr(), 16, (DefaultConstructorMarker) null)));
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            for (WalletAddressList walletAddressList : listOLrzqt) {
                CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList.getAddressList());
                arrayList.add(new WalletAddressItem(walletAddressList.getChainId(), walletAddressList.getPubKey(), (coinAddressBean == null || (address = coinAddressBean.getAddress()) == null) ? "" : address, coinAddressBean != null ? coinAddressBean.getType() : AddressType.Legacy.getValue(), walletAddressList.getSignature()));
            }
            walletAddressItemKWHzl = (WalletAddressItem) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        } else {
            walletAddressItemKWHzl = null;
        }
        if (walletAddressItemKWHzl == null) {
            return false;
        }
        EZpvd(c10854bwMCopydefault, walletAddressItemKWHzl, abstractC12782ctV.valueOf());
        EZpvd(c10854bwMCopydefault, walletAddressItemKWHzl, abstractC12782ctV.gGvvIC());
        return true;
    }

    public static final void EZpvd(C10854bwM c10854bwM, WalletAddressItem walletAddressItem, List<ChainAddress> list) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ChainAddress chainAddress = (ChainAddress) next;
            if (chainAddress.getCoinId() == c10854bwM.AEQbTJ() && chainAddress.getAddressType() == AddressType.Legacy.getValue()) {
                break;
            }
        }
        ChainAddress chainAddress2 = (ChainAddress) next;
        if (chainAddress2 != null) {
            chainAddress2.setAddress(walletAddressItem.getAddress());
            chainAddress2.setPublicKey(walletAddressItem.getPubKey());
        }
    }

    public final boolean EZpvd(AbstractC12782ctV abstractC12782ctV, String str) {
        C10854bwM c10854bwMEjfBZ;
        if (!abstractC12782ctV.AubY()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault();
        if (c10854bwMCopydefault == null || (c10854bwMEjfBZ = c10954byG.valueOf().ejfBZ()) == null) {
            return false;
        }
        for (ChainAddress chainAddress : abstractC12782ctV.gGvvIC()) {
            long coinId = chainAddress.getCoinId();
            if (coinId == c10854bwMCopydefault.AhwBna()) {
                arrayList.add(chainAddress);
            } else if (coinId == c10854bwMEjfBZ.AhwBna()) {
                arrayList2.add(chainAddress);
            }
        }
        return copydefault(str, abstractC12782ctV, c10854bwMCopydefault, (ArrayList<ChainAddress>) arrayList) || copydefault(str, abstractC12782ctV, c10854bwMEjfBZ, (ArrayList<ChainAddress>) arrayList2);
    }

    public static final boolean copydefault(String str, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, ArrayList<ChainAddress> arrayList) {
        Object next;
        int size = arrayList.size();
        C8322bAY c8322bAY = C8322bAY.KWHzl;
        boolean z = false;
        if (size < c8322bAY.OLrzqt(c10854bwM.fetchVPNInfo(), true)) {
            Iterator<T> it = c8322bAY.AEQbTJ(c10854bwM.fetchVPNInfo(), true).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                Iterator<T> it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((ChainAddress) next).getAddressType() == iIntValue) {
                        break;
                    }
                }
                if (next == null) {
                    WalletAddressItem walletAddressItemEZpvd = new C13847daM(c10854bwM.fetchVPNInfo()).EZpvd(str, abstractC12782ctV.finit(), iIntValue);
                    ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctV.gGvvIC();
                    long jAEQbTJ = c10854bwM.AEQbTJ();
                    String address = walletAddressItemEZpvd != null ? walletAddressItemEZpvd.getAddress() : null;
                    if (address == null) {
                        address = "";
                    }
                    String pubKey = walletAddressItemEZpvd != null ? walletAddressItemEZpvd.getPubKey() : null;
                    arrayListGGvvIC.add(new ChainAddress(jAEQbTJ, address, iIntValue, null, null, false, pubKey == null ? "" : pubKey, "", 24, null));
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean EZpvd(AbstractC12782ctV abstractC12782ctV, HashMap<Integer, HashSet<Long>> map, String str, C10854bwM c10854bwM) {
        WalletAddressItem walletAddressItemEZpvd;
        HashSet hashSetQKudOq = CollectionsKt___CollectionsKt.QKudOq(C8322bAY.KWHzl.AEQbTJ(c10854bwM != null ? c10854bwM.fetchVPNInfo() : -1L, !abstractC12782ctV.ORxRYg()));
        hashSetQKudOq.remove(Integer.valueOf(AddressType.P2SHType.getValue()));
        if (abstractC12782ctV.AubY()) {
            hashSetQKudOq.remove(Integer.valueOf(AddressType.P2SHCommonType.getValue()));
        }
        Iterator it = hashSetQKudOq.iterator();
        boolean z = false;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (map.containsKey(Integer.valueOf(iIntValue))) {
                HashSet<Long> hashSet = map.get(Integer.valueOf(iIntValue));
                if (hashSet != null) {
                    if (!hashSet.contains(Long.valueOf(c10854bwM != null ? c10854bwM.AhwBna() : -1L))) {
                    }
                }
            }
            if (c10854bwM != null) {
                if (abstractC12782ctV.ORxRYg()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), iIntValue, 0, c10854bwM.iwGUEr(), 16, (DefaultConstructorMarker) null));
                    xYQ xyq = xYQ.KWHzl;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
                    String ecdsaPubkey = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getEcdsaPubkey() : null;
                    String str2 = ecdsaPubkey == null ? "" : ecdsaPubkey;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
                    String ecdsaChainCode = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEcdsaChainCode() : null;
                    String str3 = ecdsaChainCode == null ? "" : ecdsaChainCode;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
                    String ed25519Pubkey = mpcWalletEncodeInfoQSBOWP3 != null ? mpcWalletEncodeInfoQSBOWP3.getEd25519Pubkey() : null;
                    String str4 = ed25519Pubkey == null ? "" : ed25519Pubkey;
                    MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
                    String ed25519ChainCode = mpcWalletEncodeInfoQSBOWP4 != null ? mpcWalletEncodeInfoQSBOWP4.getEd25519ChainCode() : null;
                    List<WalletAddressList> listOLrzqt = xyq.OLrzqt(str2, str3, str4, ed25519ChainCode == null ? "" : ed25519ChainCode, arrayList);
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
                    for (WalletAddressList walletAddressList : listOLrzqt) {
                        CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList.getAddressList());
                        long jAhwBna = c10854bwM.AhwBna();
                        String address = coinAddressBean != null ? coinAddressBean.getAddress() : null;
                        arrayList2.add(new ChainAddress(jAhwBna, address == null ? "" : address, iIntValue, null, null, true, walletAddressList.getPubKey(), "", 24, null));
                    }
                    abstractC12782ctV.gGvvIC().addAll(arrayList2);
                } else {
                    C13847daM c13847daM = new C13847daM(c10854bwM.fetchVPNInfo());
                    if (abstractC12782ctV.AwvSrB()) {
                        walletAddressItemEZpvd = c13847daM.KWHzl(str, iIntValue, "");
                    } else {
                        walletAddressItemEZpvd = c13847daM.EZpvd(str, abstractC12782ctV.finit(), iIntValue);
                    }
                    if (walletAddressItemEZpvd != null) {
                        abstractC12782ctV.gGvvIC().add(new ChainAddress(c10854bwM.AEQbTJ(), walletAddressItemEZpvd.getAddress(), walletAddressItemEZpvd.getType(), null, null, false, walletAddressItemEZpvd.getPubKey(), "", 24, null));
                    }
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean OLrzqt(Long l, AbstractC12782ctV abstractC12782ctV, String str) {
        final C10854bwM c10854bwMKWHzl;
        if (l == null || (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(l.longValue())) == null) {
            return false;
        }
        C56406yEe.AEQbTJ(abstractC12782ctV.gGvvIC(), new Function1() { // from class: o.cDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(WalletUpdateWorker.copydefault(c10854bwMKWHzl, (ChainAddress) obj));
            }
        });
        C13847daM c13847daM = new C13847daM(c10854bwMKWHzl.fetchVPNInfo());
        int iFinit = abstractC12782ctV.finit();
        AddressType addressType = AddressType.P2SHCommonType;
        WalletAddressItem walletAddressItemEZpvd = c13847daM.EZpvd(str, iFinit, addressType.getValue());
        long jAEQbTJ = c10854bwMKWHzl.AEQbTJ();
        String address = walletAddressItemEZpvd != null ? walletAddressItemEZpvd.getAddress() : null;
        String str2 = address == null ? "" : address;
        int value = addressType.getValue();
        String pubKey = walletAddressItemEZpvd != null ? walletAddressItemEZpvd.getPubKey() : null;
        abstractC12782ctV.gGvvIC().add(new ChainAddress(jAEQbTJ, str2, value, null, null, false, pubKey == null ? "" : pubKey, "", 24, null));
        return true;
    }

    public static final boolean copydefault(C10854bwM c10854bwM, ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return chainAddress.getCoinId() == c10854bwM.AhwBna() && chainAddress.getAddressType() == AddressType.P2SHCommonType.getValue();
    }

    public final void OLrzqt(String str) {
        SPUtils.put("kava_address_is_fixed_" + str, Integer.valueOf(KavaStatus.DELETED.getValue()), "wallet_biz_sp_file");
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("kava_address_is_fixed_" + str, Integer.valueOf(KavaStatus.FIXED.getValue()), "wallet_biz_sp_file");
    }

    public final KavaStatus AEQbTJ(String str) {
        Integer num = SPUtils.getInt("kava_address_is_fixed_" + str, KavaStatus.DEFAULT.getValue(), "wallet_biz_sp_file");
        KavaStatus.Application application = KavaStatus.Companion;
        Intrinsics.copydefault(num);
        return application.EZpvd(num.intValue());
    }

    public final Set<Long> copydefault() {
        try {
            return CollectionsKt___CollectionsKt.OqFWZa(this.OLrzqt);
        } catch (Exception unused) {
            return yEE.copydefault();
        }
    }

    public final Set<Long> AYXKKw() {
        try {
            return CollectionsKt___CollectionsKt.OqFWZa(this.valueOf);
        } catch (Exception unused) {
            return yEE.copydefault();
        }
    }

    public final void KWHzl() {
        this.OLrzqt.clear();
        this.valueOf.clear();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KavaStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ KavaStatus[] $VALUES;
        public static final Application Companion;
        public static final KavaStatus DEFAULT = new KavaStatus("DEFAULT", 0, 0);
        public static final KavaStatus DELETED = new KavaStatus("DELETED", 1, 1);
        public static final KavaStatus FIXED = new KavaStatus("FIXED", 2, 2);
        private final int value;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ KavaStatus[] $values() {
            return new KavaStatus[]{DEFAULT, DELETED, FIXED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<KavaStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private KavaStatus(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            KavaStatus[] kavaStatusArr$values = $values();
            $VALUES = kavaStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(kavaStatusArr$values);
            Companion = new Application(null);
        }

        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.KavaStatus.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }

            public final KavaStatus EZpvd(int i) {
                if (i == 0) {
                    return KavaStatus.DEFAULT;
                }
                if (i == 1) {
                    return KavaStatus.DELETED;
                }
                if (i == 2) {
                    return KavaStatus.FIXED;
                }
                return KavaStatus.DEFAULT;
            }
        }

        public static KavaStatus valueOf(String str) {
            return (KavaStatus) Enum.valueOf(KavaStatus.class, str);
        }

        public static KavaStatus[] values() {
            return (KavaStatus[]) $VALUES.clone();
        }
    }

    public static final InterfaceC58261yxu EZpvd(String str, List list) {
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList<AbstractC12782ctV> arrayList = new ArrayList();
        for (Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB() || abstractC12782ctV.ORxRYg() || abstractC12782ctV.QVAiDq()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (final AbstractC12782ctV abstractC12782ctV2 : arrayList) {
            if (abstractC12782ctV2.AubY() || abstractC12782ctV2.QVAiDq()) {
                AbstractC58260yxt<String> abstractC58260yxtValues = abstractC12782ctV2.values(str);
                final Function1 function1 = new Function1() { // from class: o.cEA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletUpdateWorker.OLrzqt(abstractC12782ctV2, (java.lang.String) obj2);
                    }
                };
                interfaceC58261yxuCopydefault = abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.cEC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return WalletUpdateWorker.RcXXUw(function1, obj2);
                    }
                });
            } else {
                AbstractC58260yxt<String> abstractC58260yxtEjfBZ = abstractC12782ctV2.ejfBZ(str);
                final Function1 function12 = new Function1() { // from class: o.cEz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return WalletUpdateWorker.KWHzl(abstractC12782ctV2, (java.lang.String) obj2);
                    }
                };
                interfaceC58261yxuCopydefault = abstractC58260yxtEjfBZ.copydefault(new InterfaceC58229yxO() { // from class: o.cEB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return WalletUpdateWorker.dNCPSb(function12, obj2);
                    }
                });
            }
            arrayList2.add(interfaceC58261yxuCopydefault);
        }
        return C11607cUn.KWHzl(arrayList2);
    }

    public static final InterfaceC60096zvd copydefault(C13852daR c13852daR, String str, WalletUpdateWorker walletUpdateWorker, AbstractC12782ctV abstractC12782ctV, ResponseData responseData) {
        EosAccountKeyResp eosAccountKeyResp;
        EosAccountKeyResp eosAccountKeyResp2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            List list = (List) responseData.getData();
            String account = null;
            String account2 = (list == null || (eosAccountKeyResp2 = (EosAccountKeyResp) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : eosAccountKeyResp2.getAccount();
            if (account2 == null || account2.length() == 0) {
                c13852daR.EZpvd(EOSState.Unopened);
                c13852daR.OLrzqt(str);
                c13852daR.KWHzl(str);
                AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
            C13934dbu c13934dbu = walletUpdateWorker.gEmmrt;
            String strUSBtdM = abstractC12782ctV.USBtdM();
            String strAUsmxb = abstractC12782ctV.aUsmxb();
            String strDbNXlk = abstractC12782ctV.DbNXlk();
            List list2 = (List) responseData.getData();
            if (list2 != null && (eosAccountKeyResp = (EosAccountKeyResp) CollectionsKt___CollectionsKt.firstOrNull(list2)) != null) {
                account = eosAccountKeyResp.getAccount();
            }
            return c13934dbu.AEQbTJ(strUSBtdM, strAUsmxb, strDbNXlk, account != null ? account : "");
        }
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, null, null, null, 63, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd AEQbTJ(final C13852daR c13852daR, AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM, final WalletAddressItem walletAddressItem, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            EosAccountResp eosAccountResp = (EosAccountResp) responseData.getData();
            if (C33129mqd.OLrzqt((CharSequence) (eosAccountResp != null ? eosAccountResp.getAccount() : null))) {
                EosAccountResp eosAccountResp2 = (EosAccountResp) responseData.getData();
                if (C33129mqd.OLrzqt((CharSequence) (eosAccountResp2 != null ? eosAccountResp2.getActiveKey() : null))) {
                    EosAccountResp eosAccountResp3 = (EosAccountResp) responseData.getData();
                    if (C33129mqd.OLrzqt((CharSequence) (eosAccountResp3 != null ? eosAccountResp3.getOwnerKey() : null))) {
                        EosAccountResp eosAccountResp4 = (EosAccountResp) responseData.getData();
                        String account = eosAccountResp4 != null ? eosAccountResp4.getAccount() : null;
                        if (account == null) {
                            account = "";
                        }
                        c13852daR.AEQbTJ(account);
                        c13852daR.EZpvd(EOSState.Opened);
                        EosAccountResp eosAccountResp5 = (EosAccountResp) responseData.getData();
                        String activeKey = eosAccountResp5 != null ? eosAccountResp5.getActiveKey() : null;
                        if (activeKey == null) {
                            activeKey = "";
                        }
                        c13852daR.OLrzqt(activeKey);
                        EosAccountResp eosAccountResp6 = (EosAccountResp) responseData.getData();
                        String ownerKey = eosAccountResp6 != null ? eosAccountResp6.getOwnerKey() : null;
                        c13852daR.KWHzl(ownerKey != null ? ownerKey : "");
                    }
                }
            }
        }
        AbstractC58185ywX<Long> abstractC58185ywXEZpvd = abstractC12782ctV.OLrzqt(c13852daR).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cDG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletUpdateWorker.copydefault(c10854bwM, c13852daR, walletAddressItem, (java.lang.Long) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cDJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletUpdateWorker.QOLQEE(function1, obj);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[PHI: r1
  0x0045: PHI (r1v6 java.lang.String) = (r1v2 java.lang.String), (r1v10 java.lang.String) binds: [B:21:0x0041, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Pair copydefault(WalletAddressItem walletAddressItem, C10854bwM c10854bwM, ResponseData responseData) {
        String address;
        String str;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            GetNearAccountIdResp getNearAccountIdResp = (GetNearAccountIdResp) responseData.getData();
            if (C33129mqd.OLrzqt((CharSequence) (getNearAccountIdResp != null ? getNearAccountIdResp.getAccountId() : null))) {
                GetNearAccountIdResp getNearAccountIdResp2 = (GetNearAccountIdResp) responseData.getData();
                address = getNearAccountIdResp2 != null ? getNearAccountIdResp2.getAccountId() : null;
                if (address == null) {
                }
            }
        } else {
            address = walletAddressItem != null ? walletAddressItem.getAddress() : null;
            str = address == null ? "" : address;
        }
        long jAEQbTJ = c10854bwM.AEQbTJ();
        int value = AddressType.Legacy.getValue();
        String pubKey = walletAddressItem != null ? walletAddressItem.getPubKey() : null;
        return C56390yDp.OLrzqt(0, new ChainAddress(jAEQbTJ, str, value, null, null, true, pubKey == null ? "" : pubKey, "", 24, null));
    }
}
