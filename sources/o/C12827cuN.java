package o;

import com.google.gson.GsonBuilder;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.EmptyMpcInfoException;
import com.okinc.business.defi.biz.core.error.EmptyResultException;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.wallet.WalletManager$fetchMainWallet$1;
import com.okinc.business.defi.biz.core.wallet.WalletManager$fetchMainWallet$getMainWalletInCallThread$1;
import com.okinc.business.defi.biz.core.wallet.WalletManager$fetchMainWallets$2;
import com.okinc.business.defi.biz.core.wallet.WalletManager$getWalletByAddress$3;
import com.okinc.business.defi.biz.core.wallet.WalletManager$initializeAllWallets$1;
import com.okinc.business.defi.biz.core.wallet.WalletManager$updateDefaultAddress$1$1;
import com.okinc.business.defi.biz.core.wallet.WalletManager$updateWallets$1$1$4;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.EsCapeData;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AAStatus;
import com.okinc.business.defi.biz.net.bean.EoaAddress;
import com.okinc.business.defi.biz.net.bean.EscapeCoinMetaBean;
import com.okinc.business.defi.wallet.mpc.MpcPrivateKeyItem;
import com.okinc.core.util.SPUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.MpcPrivateKey;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.mln.service.UDWalletManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C13062cyk;
import o.C13092czN;
import o.C14140dfo;
import o.InterfaceC9739bbK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cuN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12827cuN implements InterfaceC9741bbM {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final CompletableDeferred<java.util.List<AbstractC12782ctV>> AEQbTJ;
    public final C12783ctW AYXKKw;
    public final C10948byA AhwBna;
    public final cQM AkhnZx;
    public final cQD DbNXlk;
    public final cOG EZpvd;
    public final C11495cQj KWHzl;
    public CopyOnWriteArrayList<AbstractC12782ctV> copydefault;
    public java.util.ArrayList<AbstractC12782ctV> djBIcL;
    public WalletStatus ejfBZ;
    public final C13062cyk fARcdN;
    public final C13058cyg fetchVPNInfo;
    public final C13934dbu gEmmrt;
    public final Mutex isConnected;
    public final CoroutineDispatcher valueOf;
    public final C11010bzJ values;

    /* JADX INFO: renamed from: o.cuN$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer AYXKKw(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C12827cuN AYXKKw() {
        return Companion.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List KWHzl(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AbstractC12782ctV KWHzl(AbstractC12782ctV abstractC12782ctV, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer djBIcL(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer fetchVPNInfo(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer gEmmrt(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer valueOf(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Integer values(java.lang.Integer num, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cQM AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull WalletStatus walletStatus) {
        Intrinsics.checkNotNullParameter(walletStatus, "");
        this.ejfBZ = walletStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9741bbM
    public java.util.List<AbstractC12782ctV> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9741bbM
    public java.util.List<AbstractC12782ctV> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletStatus fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cOG valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableDeferred */
    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.sync.MutexKt.Mutex$default(boolean, int, java.lang.Object):kotlinx.coroutines.sync.Mutex */
    public C12827cuN(@NotNull C13934dbu c13934dbu, @NotNull cQM cqm, @NotNull cOG cog, @NotNull C10948byA c10948byA, @NotNull C12783ctW c12783ctW, @NotNull C13062cyk c13062cyk, @NotNull C11495cQj c11495cQj, @NotNull C11010bzJ c11010bzJ, @NotNull C13058cyg c13058cyg, @NotNull cQD cqd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(cog, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c12783ctW, "");
        Intrinsics.checkNotNullParameter(c13062cyk, "");
        Intrinsics.checkNotNullParameter(c11495cQj, "");
        Intrinsics.checkNotNullParameter(c11010bzJ, "");
        Intrinsics.checkNotNullParameter(c13058cyg, "");
        Intrinsics.checkNotNullParameter(cqd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.gEmmrt = c13934dbu;
        this.AkhnZx = cqm;
        this.EZpvd = cog;
        this.AhwBna = c10948byA;
        this.AYXKKw = c12783ctW;
        this.fARcdN = c13062cyk;
        this.KWHzl = c11495cQj;
        this.values = c11010bzJ;
        this.fetchVPNInfo = c13058cyg;
        this.DbNXlk = cqd;
        this.valueOf = coroutineDispatcher;
        this.ejfBZ = WalletStatus.NoWallet;
        this.djBIcL = new java.util.ArrayList<>();
        this.copydefault = new CopyOnWriteArrayList<>();
        this.AEQbTJ = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.isConnected = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: renamed from: o.cuN$StateListAnimator */
    public static final class StateListAnimator<T> implements java.util.Comparator {
        public final /* synthetic */ boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) t;
            int i = 1;
            int i2 = (this.EZpvd && (abstractC12782ctV.gHZMYf() || abstractC12782ctV.iwGUEr())) ? 1 : 0;
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) t2;
            if (!this.EZpvd || (!abstractC12782ctV2.gHZMYf() && !abstractC12782ctV2.iwGUEr())) {
                i = 0;
            }
            return yET.KWHzl(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: o.cuN$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Integer.valueOf(((AbstractC12784ctX) t).fARcdN()), java.lang.Integer.valueOf(((AbstractC12784ctX) t2).fARcdN()));
        }
    }

    /* JADX INFO: renamed from: o.cuN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cuN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C12827cuN AEQbTJ() {
            return getInstance$default(this, null, 1, null);
        }

        private Application() {
        }

        public static /* synthetic */ C12827cuN getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.OLrzqt(context);
        }

        public final C12827cuN OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).OcIXYQ();
        }
    }

    /* JADX INFO: renamed from: o.cuN$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((C12786ctZ) t2).copydefault()), java.lang.Long.valueOf(((C12786ctZ) t).copydefault()));
        }
    }

    public final AbstractC58185ywX<java.lang.Integer> EZpvd(@NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = this.AkhnZx.KWHzl(str, str2);
        final Function1 function1 = new Function1() { // from class: o.cwX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AYXKKw(this.copydefault, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.run(function1, obj);
            }
        }).EZpvd();
        final Function1 function12 = new Function1() { // from class: o.cwU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.copydefault(this.KWHzl, str, (WalletEntity) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.fHqPtx(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.ejfBZ(this.EZpvd, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cxb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DWgRXt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC58261yxu run(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(C12827cuN c12827cuN, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return c12827cuN.AkhnZx.AkhnZx(str);
    }

    public static final InterfaceC60096zvd fHqPtx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C12827cuN c12827cuN, final java.lang.String str, WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        if (walletEntity.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue()) {
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = c12827cuN.AkhnZx.OLrzqt(walletEntity.getId(), WalletSyncOperation.Rename).EZpvd();
            final Function1 function1 = new Function1() { // from class: o.cvD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12827cuN.AhwBna(this.KWHzl, str, (java.lang.Integer) obj);
                }
            };
            return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cvG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12827cuN.DGOPHZ(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(0);
    }

    public static final InterfaceC60096zvd DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AhwBna(C12827cuN c12827cuN, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return c12827cuN.fARcdN.OLrzqt(true, true, "updateWalletName", new C13062cyk.LoaderManager.Application(C56402yEa.EZpvd(str)));
    }

    public static final InterfaceC60096zvd DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Integer DcqEDu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd ejfBZ(C12827cuN c12827cuN, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = fetchAllWallets$default(c12827cuN, false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.values(num, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DcqEDu(function1, obj);
            }
        });
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull AAStatus aAStatus) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aAStatus, "");
        return this.AkhnZx.KWHzl(str, aAStatus);
    }

    public final AbstractC58185ywX<java.lang.Integer> OLrzqt(@NotNull final java.lang.String str, final long j, @NotNull java.lang.String str2, int i) {
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtAEQbTJ;
        InterfaceC58261yxu interfaceC58261yxuCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C10854bwM c10854bwMKWHzl = this.AhwBna.KWHzl(java.lang.Long.valueOf(j));
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = this.EZpvd.KWHzl(str, j, str2, i);
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN()) {
            abstractC58260yxtAEQbTJ = AbstractC58260yxt.copydefault(yDY.AhwBna());
            Intrinsics.copydefault(abstractC58260yxtAEQbTJ);
        } else {
            abstractC58260yxtAEQbTJ = this.KWHzl.AEQbTJ(str, j, str2);
        }
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.DsrFlB()) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = OLrzqt(str, true);
            final Function1 function1 = new Function1() { // from class: o.cwp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12827cuN.KWHzl(this.KWHzl, str, j, (AbstractC12782ctV) obj);
                }
            };
            interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12827cuN.Dmq(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58261yxuCopydefault);
        } else {
            interfaceC58261yxuCopydefault = AbstractC58260yxt.copydefault(0);
            Intrinsics.copydefault(interfaceC58261yxuCopydefault);
        }
        final yHO yho = new yHO() { // from class: o.cwq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C12827cuN.AEQbTJ((java.lang.Long) obj, (java.util.List) obj2, obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ2 = AbstractC58260yxt.AEQbTJ(abstractC58260yxtKWHzl, abstractC58260yxtAEQbTJ, interfaceC58261yxuCopydefault, new InterfaceC58228yxN() { // from class: o.cwt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C12827cuN.AEQbTJ(yho, obj, obj2, obj3);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cwr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.OLrzqt(this.EZpvd, str, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58260yxtAEQbTJ2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DCUTEIdCUTEI(function12, obj);
            }
        }).EZpvd();
        final Function1 function13 = new Function1() { // from class: o.cwy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.KWHzl(this.OLrzqt, str, (WalletEntity) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cww
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.WS(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.cwx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.fARcdN(this.OLrzqt, (java.lang.Integer) obj);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cwv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.call(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC58261yxu Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.rx2.RxSingleKt.rxSingle$default(kotlin.coroutines.CoroutineContext, kotlin.jvm.functions.Function2, int, java.lang.Object):o.yxt */
    public static final InterfaceC58261yxu KWHzl(C12827cuN c12827cuN, java.lang.String str, long j, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return RxSingleKt.rxSingle$default(null, new WalletManager$updateDefaultAddress$1$1(c12827cuN, str, abstractC12782ctV, j, null), 1, null);
    }

    public static final Unit AEQbTJ(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (Unit) yho.invoke(obj, obj2, obj3);
    }

    public static final Unit AEQbTJ(java.lang.Long l, java.util.List list, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(l, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C12827cuN c12827cuN, java.lang.String str, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12827cuN.AkhnZx.AkhnZx(str);
    }

    public static final InterfaceC60096zvd WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final C12827cuN c12827cuN, final java.lang.String str, WalletEntity walletEntity) {
        Intrinsics.checkNotNullParameter(walletEntity, "");
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = c12827cuN.AkhnZx.OLrzqt(str, WalletSyncOperation.UpdateDefaultAddress).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.gEmmrt(this.AEQbTJ, str, (java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cuY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.ixgjPv(function1, obj);
            }
        });
    }

    public static final InterfaceC60096zvd ixgjPv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd gEmmrt(C12827cuN c12827cuN, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return c12827cuN.fARcdN.OLrzqt(true, true, "updateDefaultAddress", new C13062cyk.LoaderManager.Application(C56402yEa.EZpvd(str)));
    }

    public static final InterfaceC60096zvd call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Integer DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd fARcdN(C12827cuN c12827cuN, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = fetchAllWallets$default(c12827cuN, false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cvn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AYXKKw(num, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cvt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DCUTEIddSDPG(function1, obj);
            }
        });
    }

    public static /* synthetic */ AbstractC58185ywX updateWallets$default(C12827cuN c12827cuN, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return c12827cuN.copydefault((java.util.List<C12974cxB>) list, str, str2);
    }

    public final AbstractC58185ywX<java.lang.Integer> copydefault(@NotNull final java.util.List<C12974cxB> list, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (list.isEmpty()) {
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(0);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String strDbNXlk = ((C12974cxB) obj).AEQbTJ().DbNXlk();
            java.lang.Object arrayList = linkedHashMap.get(strDbNXlk);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strDbNXlk, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtCopydefault = this.AkhnZx.copydefault(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap.keySet()));
        final Function1 function1 = new Function1() { // from class: o.cwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C12827cuN.OLrzqt(linkedHashMap, this, str, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C12827cuN.heceqZ(function1, obj2);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C12827cuN.copydefault(this.AEQbTJ, str2, list, (java.lang.Integer) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58260yxtOLrzqt.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.cxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C12827cuN.hCLrkq(function12, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C12827cuN.fIwbmz(this.OLrzqt, (java.lang.Integer) obj2);
            }
        };
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.cxi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C12827cuN.DGOPHZDGOPHZ(function13, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final InterfaceC58261yxu heceqZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(java.util.Map map, C12827cuN c12827cuN, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            WalletEntity walletEntity = (WalletEntity) it.next();
            java.lang.Object obj = map.get(walletEntity.getId());
            Intrinsics.copydefault(obj);
            C12974cxB c12974cxB = (C12974cxB) CollectionsKt___CollectionsKt.AuCTelauCTel((java.util.List) obj);
            if (c12974cxB.EZpvd()) {
                AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = c12827cuN.AkhnZx.OLrzqt(c12974cxB.AEQbTJ(), str);
                AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt2 = c12827cuN.AkhnZx.OLrzqt(walletEntity.getId(), WalletSyncOperation.UpgradeAddress);
                final Function2 function2 = new Function2() { // from class: o.cwh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return C12827cuN.AEQbTJ((Unit) obj2, (java.lang.Integer) obj3);
                    }
                };
                arrayList.add(AbstractC58260yxt.OLrzqt(abstractC58260yxtOLrzqt, abstractC58260yxtOLrzqt2, new InterfaceC58223yxI() { // from class: o.cws
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58223yxI
                    public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                        return C12827cuN.AYXKKw(function2, obj2, obj3);
                    }
                }));
            }
            if (c12974cxB.copydefault()) {
                AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtEZpvd = c12827cuN.AkhnZx.EZpvd(c12974cxB.AEQbTJ());
                final Function1 function1 = new Function1() { // from class: o.cwE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C12827cuN.getNewProxyInstance((java.util.List) obj2);
                    }
                };
                arrayList.add(abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cwM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return C12827cuN.UrRBLY(function1, obj2);
                    }
                }));
            }
            if ((!c12974cxB.KWHzl().isEmpty()) || (!c12974cxB.OLrzqt().isEmpty())) {
                AbstractC58260yxt abstractC58260yxtRxSingle$default = RxSingleKt.rxSingle$default(null, new WalletManager$updateWallets$1$1$4(c12827cuN, c12974cxB, null), 1, null);
                final Function1 function12 = new Function1() { // from class: o.cwW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C12827cuN.getFieldNames((java.util.List) obj2);
                    }
                };
                arrayList.add(abstractC58260yxtRxSingle$default.copydefault(new InterfaceC58229yxO() { // from class: o.cxl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return C12827cuN.KDccX(function12, obj2);
                    }
                }));
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function13 = new Function1() { // from class: o.cuJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C12827cuN.AubY((java.util.List) obj2);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cuT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C12827cuN.DBxZfM(function13, obj2);
            }
        });
    }

    public static final Unit AEQbTJ(Unit unit, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(unit, "");
        Intrinsics.checkNotNullParameter(num, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (Unit) function2.invoke(obj, obj2);
    }

    public static final Unit UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit getNewProxyInstance(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public static final Unit KDccX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit getFieldNames(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public static final java.lang.Integer AubY(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer DBxZfM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd hCLrkq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C12827cuN c12827cuN, java.lang.String str, java.util.List list, java.lang.Integer num) {
        java.util.List arrayList;
        Intrinsics.checkNotNullParameter(num, "");
        C13062cyk c13062cyk = c12827cuN.fARcdN;
        if (str.length() > 0) {
            arrayList = C56402yEa.EZpvd(str);
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12974cxB) it.next()).AEQbTJ().DbNXlk());
            }
        }
        return c13062cyk.OLrzqt(true, true, "updateAddress", new C13062cyk.LoaderManager.Application(arrayList));
    }

    public static final InterfaceC60096zvd DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final java.lang.Integer DGUQLI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd fIwbmz(C12827cuN c12827cuN, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = fetchAllWallets$default(c12827cuN, false, false, false, 7, null).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.fetchVPNInfo(num, (java.util.List) obj);
            }
        };
        return abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DGUQLI(function1, obj);
            }
        });
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull java.lang.String str, @NotNull WalletSyncOperation walletSyncOperation) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletSyncOperation, "");
        return this.AkhnZx.OLrzqt(str, walletSyncOperation);
    }

    @Override // o.InterfaceC9741bbM
    public boolean OLrzqt(@NotNull InterfaceC9738bbJ interfaceC9738bbJ, int i) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        int i2 = Activity.AEQbTJ[WalletType.Companion.KWHzl(i).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                if (interfaceC9738bbJ.gHZMYf() || interfaceC9738bbJ.iwGUEr()) {
                    return true;
                }
            } else if (interfaceC9738bbJ.getNewProxyInstance() == i) {
                return true;
            }
        } else if (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.wlaJM()) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ AbstractC58260yxt deleteDemoWallet$default(C12827cuN c12827cuN, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c12827cuN.EZpvd(z);
    }

    public static final InterfaceC58261yxu OqFWZa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> EZpvd(final boolean z) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = KWHzl(WalletType.DemoWallet);
        final Function1 function1 = new Function1() { // from class: o.cuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.OLrzqt(this.KWHzl, z, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OqFWZa(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.lang.Integer accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer values(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final InterfaceC58261yxu RlQdEF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.Integer AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C12827cuN c12827cuN, boolean z, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, z, 3, null);
        final Function1 function1 = new Function1() { // from class: o.cxq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.gEmmrt(num, (java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.AxsJAYsNCnLh(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu OuxcSI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(final long j, @NotNull final java.util.List<ChainAddress> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = KWHzl(WalletType.TrackingWallet);
        final Function1 function1 = new Function1() { // from class: o.cvH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(this.OLrzqt, j, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cvO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OuxcSI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu EZpvd(final C12827cuN c12827cuN, long j, java.util.List list, java.util.List list2) {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAuCTelauCTel;
        java.util.Iterator it;
        Intrinsics.checkNotNullParameter(list2, "");
        if (list2.isEmpty()) {
            abstractC58260yxtAuCTelauCTel = AbstractC58260yxt.copydefault(0);
        } else {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) CollectionsKt___CollectionsKt.AuCTelauCTel(list2);
            java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it2 = listKWHzl.iterator();
            while (it2.hasNext()) {
                java.lang.Object next = it2.next();
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
                if (!abstractC12782ctV.AhwBna(java.lang.Long.valueOf(j)) || ((list instanceof java.util.Collection) && list.isEmpty())) {
                    it = it2;
                } else {
                    java.util.Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        java.lang.String address = ((ChainAddress) it3.next()).getAddress();
                        it = it2;
                        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, j, null, 2, null);
                        if (C59449zhJ.gEmmrt(address, chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null, true)) {
                            arrayList.add(next);
                            break;
                        }
                        it2 = it;
                    }
                    it = it2;
                }
                it2 = it;
            }
            if (arrayList.isEmpty()) {
                abstractC58260yxtAuCTelauCTel = AbstractC58260yxt.copydefault(0);
            } else if (abstractC12784ctX.KWHzl().size() <= 1) {
                abstractC58260yxtAuCTelauCTel = abstractC12784ctX.KWHzl("");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                java.util.Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((AbstractC12782ctV) it4.next()).DbNXlk());
                }
                abstractC58260yxtAuCTelauCTel = c12827cuN.AuCTelauCTel(arrayList2);
            }
        }
        final Function1 function1 = new Function1() { // from class: o.cuX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.fetchVPNInfo(this.EZpvd, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtAuCTelauCTel.OLrzqt(new InterfaceC58229yxO() { // from class: o.cuV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DCUTEI(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu DCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fetchVPNInfo(C12827cuN c12827cuN, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cuK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.djBIcL(num, (java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.getPostValueLengthLimit(function1, obj);
            }
        });
    }

    public static final java.lang.Integer getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AkhnZx.AEQbTJ(str, z);
    }

    public final AbstractC58260yxt<AbstractC12782ctV> copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AkhnZx.KWHzl(str, z);
    }

    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<InterfaceC9738bbJ> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = OLrzqt(str, true);
        Intrinsics.copydefault(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final AbstractC12782ctV QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<InterfaceC9738bbJ> AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(this, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.djBIcL(str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cvf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.QCjLjM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        Intrinsics.copydefault(abstractC58260yxtValueOf, "");
        return abstractC58260yxtValueOf;
    }

    public static final java.util.List QVsKAR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> AkhnZx(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(this, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.gEmmrt(str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.QVsKAR(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static /* synthetic */ AbstractC58260yxt fetchAllWallets$default(C12827cuN c12827cuN, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        return c12827cuN.EZpvd(z, z2, z3);
    }

    public static final InterfaceC58261yxu QSBOWP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> EZpvd(final boolean z, final boolean z2, boolean z3) {
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtOLrzqt = C10337bmZ.KWHzl.AEQbTJ(!z3).OLrzqt(java.lang.Boolean.TRUE);
        final Function1 function1 = new Function1() { // from class: o.cxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(this.copydefault, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.QSBOWP(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cxs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.KWHzl(this.KWHzl, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cxv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.dmfpNf(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(abstractC58260yxtOLrzqt3);
        final Function1 function13 = new Function1() { // from class: o.cuL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AEQbTJ(this.copydefault, z, z2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.RdAHlO(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu EZpvd(C12827cuN c12827cuN, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return c12827cuN.AkhnZx.valueOf();
    }

    public static final InterfaceC58261yxu dmfpNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C12827cuN c12827cuN, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return c12827cuN.zsXlph(list);
    }

    public static final java.util.List RdAHlO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AEQbTJ(C12827cuN c12827cuN, boolean z, boolean z2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c12827cuN.copydefault.clear();
        c12827cuN.copydefault.addAll(list);
        c12827cuN.AEQbTJ.complete(list);
        java.util.ArrayList<AbstractC12782ctV> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12782ctV) obj).zuWLRA()) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(arrayList2);
        c12827cuN.djBIcL = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj2;
            if (!z || !abstractC12782ctV.zblBkD()) {
                arrayList3.add(obj2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList3) {
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) obj3;
            if (!z2 || abstractC12782ctV2.zuWLRA()) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super java.util.List<? extends AbstractC12782ctV>> continuation) throws java.lang.Throwable {
        WalletManager$initializeAllWallets$1 walletManager$initializeAllWallets$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof WalletManager$initializeAllWallets$1) {
            walletManager$initializeAllWallets$1 = (WalletManager$initializeAllWallets$1) continuation;
            int i = walletManager$initializeAllWallets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletManager$initializeAllWallets$1.label = i - Integer.MIN_VALUE;
            } else {
                walletManager$initializeAllWallets$1 = new WalletManager$initializeAllWallets$1(this, continuation);
            }
        }
        java.lang.Object objAwait = walletManager$initializeAllWallets$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletManager$initializeAllWallets$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                CompletableDeferred<java.util.List<AbstractC12782ctV>> completableDeferred = this.AEQbTJ;
                walletManager$initializeAllWallets$1.label = 1;
                objAwait = completableDeferred.await(walletManager$initializeAllWallets$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ(UDWalletManager.LUA_CLASS_NAME, "initializedAllWallets error", thM7380exceptionOrNullimpl);
        C6777aVl.Companion.OLrzqt(new OKWException("initializedAllWallets error", thM7380exceptionOrNullimpl), null, C56443yFo.KWHzl(true));
        return yDY.AhwBna();
    }

    public static final AbstractC12782ctV OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public final AbstractC58260yxt<InterfaceC9738bbJ> EZpvd(@NotNull final java.lang.String str, final java.lang.Long l, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtValueOf = this.AkhnZx.valueOf();
        final Function1 function1 = new Function1() { // from class: o.cvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AEQbTJ(str, z, l, z2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.cvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OxVOHk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtValueOf2 = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        Intrinsics.copydefault(abstractC58260yxtValueOf2, "");
        return abstractC58260yxtValueOf2;
    }

    public final java.lang.Object EZpvd(@NotNull C10854bwM c10854bwM, @NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends AbstractC12782ctV>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new WalletManager$getWalletByAddress$3(set, this, c10854bwM, null), continuation);
    }

    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> gEmmrt() {
        AbstractC58260yxt<java.util.List<InterfaceC9738bbJ>> abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(this, false, false, false, 7, null);
        Intrinsics.copydefault(abstractC58260yxtFetchAllWallets$default, "");
        return abstractC58260yxtFetchAllWallets$default;
    }

    @Override // o.InterfaceC9741bbM
    public java.util.List<InterfaceC9735bbG> AEQbTJ() {
        java.util.List<AbstractC12782ctV> listOLrzqt = OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            AbstractC12784ctX abstractC12784ctXGwTjWJ = ((AbstractC12782ctV) next).gwTjWJ();
            java.lang.String strEZpvd = abstractC12784ctXGwTjWJ != null ? abstractC12784ctXGwTjWJ.EZpvd() : null;
            java.lang.Object arrayList = linkedHashMap.get(strEZpvd);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strEZpvd, arrayList);
            }
            ((java.util.List) arrayList).add(next);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        java.util.Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) ((Map.Entry) it2.next()).getValue());
            arrayList2.add(abstractC12782ctV != null ? abstractC12782ctV.gwTjWJ() : null);
        }
        return CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.QfsBiF(arrayList2), new TaskDescription());
    }

    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<java.util.List<InterfaceC9735bbG>> EZpvd() {
        AbstractC58260yxt<java.util.List<InterfaceC9735bbG>> allRootWallets$default = getAllRootWallets$default(this, false, false, 2, null);
        Intrinsics.copydefault(allRootWallets$default, "");
        return allRootWallets$default;
    }

    public static /* synthetic */ AbstractC58260yxt getAllRootWallets$default(C12827cuN c12827cuN, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return c12827cuN.EZpvd(z, z2);
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.ctX>> */
    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> EZpvd(final boolean z, boolean z2) {
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtEZpvd;
        if (z2) {
            abstractC58260yxtEZpvd = this.AkhnZx.gEmmrt();
        } else {
            abstractC58260yxtEZpvd = this.AkhnZx.EZpvd();
        }
        final Function1 function1 = new Function1() { // from class: o.cuU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.copydefault(z, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.gwTjWJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List gwTjWJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ctX> */
    public final AbstractC58260yxt<AbstractC12784ctX> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtIsConnected = this.AkhnZx.isConnected(str);
        final Function1 function1 = new Function1() { // from class: o.cvP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.hDKMBd((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtIsConnected.copydefault(new InterfaceC58229yxO() { // from class: o.cvN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.ODXsMY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final AbstractC12784ctX ODXsMY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12784ctX) function1.invoke(obj);
    }

    public static final AbstractC12784ctX hDKMBd(java.util.List list) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (abstractC12784ctX != null) {
            return abstractC12784ctX;
        }
        throw EmptyResultException.Companion.KWHzl();
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ctX> */
    public final AbstractC58260yxt<AbstractC12784ctX> gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtDbNXlk = this.AkhnZx.DbNXlk(str);
        final Function1 function1 = new Function1() { // from class: o.cvr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.uzCIH((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtDbNXlk.copydefault(new InterfaceC58229yxO() { // from class: o.cvo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OHqIaq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final AbstractC12784ctX OHqIaq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12784ctX) function1.invoke(obj);
    }

    public static final AbstractC12784ctX uzCIH(java.util.List list) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (abstractC12784ctX != null) {
            return abstractC12784ctX;
        }
        throw EmptyResultException.Companion.KWHzl();
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.database.wallet.entity.WalletEntity> */
    public final AbstractC58260yxt<WalletEntity> isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtAuCTel = this.AkhnZx.AuCTel(str);
        final Function1 function1 = new Function1() { // from class: o.cvi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.iwGUEr((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAuCTel.copydefault(new InterfaceC58229yxO() { // from class: o.cvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.fdOvFl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final WalletEntity fdOvFl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletEntity) function1.invoke(obj);
    }

    public static final WalletEntity iwGUEr(java.util.List list) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(list, "");
        WalletEntity walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (walletEntity != null) {
            return walletEntity;
        }
        throw EmptyResultException.Companion.KWHzl();
    }

    public static /* synthetic */ AbstractC58260yxt getMaxWalletIndex$default(C12827cuN c12827cuN, java.lang.String str, WalletType walletType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            walletType = WalletType.HDWallet;
        }
        return c12827cuN.OLrzqt(str, walletType);
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull java.lang.String str, @NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        return this.AkhnZx.AEQbTJ(str, walletType.ordinal());
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.AkhnZx.copydefault(str, WalletType.MPCWallet.ordinal(), continuation);
    }

    public final AbstractC58260yxt<java.lang.Integer> AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AkhnZx.AhwBna(str);
    }

    public static final java.util.List fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> KWHzl(@NotNull final java.lang.String str, @NotNull final WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtValueOf = this.AkhnZx.valueOf();
        final Function1 function1 = new Function1() { // from class: o.cwP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(walletType, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtValueOf.copydefault(new InterfaceC58229yxO() { // from class: o.cwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.fjfviF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.ctV>> */
    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> EZpvd(@NotNull final java.lang.String str, @NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtCopydefault = this.AkhnZx.copydefault(WalletType.AAWallet.ordinal(), walletType.ordinal());
        final Function1 function1 = new Function1() { // from class: o.cvR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AYXKKw(str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cvS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.igXuih(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.util.List igXuih(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List QSLkRj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.ctX>> */
    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> KWHzl(@NotNull final WalletType walletType) {
        Intrinsics.checkNotNullParameter(walletType, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtEZpvd = this.AkhnZx.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(walletType, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cwf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.QSLkRj(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.ctX>> */
    public final AbstractC58260yxt<java.util.List<AbstractC12784ctX>> wlaJM(@NotNull final java.util.List<? extends WalletType> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtEZpvd = this.AkhnZx.EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cvB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cvF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OJuSTm(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> zsXlph(final java.util.List<? extends AbstractC12782ctV> list) {
        java.lang.Object next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AbstractC12782ctV) next).dmfpNf() == 0) {
                break;
            }
        }
        if (next == null) {
            AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(list);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((AbstractC12782ctV) obj).AEQbTJ(i2);
            i = i2;
        }
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AbstractC12782ctV) it2.next()).DCUTEIddSDPG());
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.cwm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C12827cuN.KWHzl(list, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtCopydefault2 = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cwn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C12827cuN.htlTjW(function1, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.util.List htlTjW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(C12827cuN c12827cuN, boolean z, Continuation<? super AbstractC12782ctV> continuation) throws java.lang.Throwable {
        WalletManager$fetchMainWallet$getMainWalletInCallThread$1 walletManager$fetchMainWallet$getMainWalletInCallThread$1;
        if (continuation instanceof WalletManager$fetchMainWallet$getMainWalletInCallThread$1) {
            walletManager$fetchMainWallet$getMainWalletInCallThread$1 = (WalletManager$fetchMainWallet$getMainWalletInCallThread$1) continuation;
            int i = walletManager$fetchMainWallet$getMainWalletInCallThread$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletManager$fetchMainWallet$getMainWalletInCallThread$1.label = i - Integer.MIN_VALUE;
            } else {
                walletManager$fetchMainWallet$getMainWalletInCallThread$1 = new WalletManager$fetchMainWallet$getMainWalletInCallThread$1(continuation);
            }
        }
        java.lang.Object objAwait = walletManager$fetchMainWallet$getMainWalletInCallThread$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletManager$fetchMainWallet$getMainWalletInCallThread$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwait);
            AbstractC58260yxt abstractC58260yxtOLrzqt = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null).OLrzqt(C56443yFo.KWHzl(true));
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
            walletManager$fetchMainWallet$getMainWalletInCallThread$1.L$0 = c12827cuN;
            walletManager$fetchMainWallet$getMainWalletInCallThread$1.Z$0 = z;
            walletManager$fetchMainWallet$getMainWalletInCallThread$1.label = 1;
            if (RxAwaitKt.await(abstractC58260yxtOLrzqt, walletManager$fetchMainWallet$getMainWalletInCallThread$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objAwait;
                Intrinsics.copydefault(abstractC12782ctV);
                return abstractC12782ctV;
            }
            z = walletManager$fetchMainWallet$getMainWalletInCallThread$1.Z$0;
            c12827cuN = (C12827cuN) walletManager$fetchMainWallet$getMainWalletInCallThread$1.L$0;
            C56391yDq.AEQbTJ(objAwait);
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtEZpvd = c12827cuN.AkhnZx.EZpvd(z);
        walletManager$fetchMainWallet$getMainWalletInCallThread$1.L$0 = null;
        walletManager$fetchMainWallet$getMainWalletInCallThread$1.label = 2;
        objAwait = RxAwaitKt.await(abstractC58260yxtEZpvd, walletManager$fetchMainWallet$getMainWalletInCallThread$1);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objAwait;
        Intrinsics.copydefault(abstractC12782ctV2);
        return abstractC12782ctV2;
    }

    public final AbstractC58260yxt<AbstractC12782ctV> copydefault(boolean z) {
        return C11607cUn.KWHzl(RxSingleKt.rxSingle(this.valueOf, new WalletManager$fetchMainWallet$1(this, z, java.lang.Thread.currentThread().getStackTrace(), null)));
    }

    public final AbstractC58260yxt<AbstractC12782ctV> KWHzl(boolean z) {
        return this.AkhnZx.EZpvd(z);
    }

    public final java.lang.Object AEQbTJ(Continuation<? super java.util.List<? extends AbstractC12782ctV>> continuation) {
        return BuildersKt.withContext(this.valueOf, new WalletManager$fetchMainWallets$2(this, null), continuation);
    }

    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<InterfaceC9738bbJ> KWHzl() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = copydefault(false);
        Intrinsics.copydefault(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean QkdxfA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<java.lang.Boolean> OLrzqt(boolean z) {
        if (z) {
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(this, false, false, false, 2, null);
            final Function1 function1 = new Function1() { // from class: o.cvV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12827cuN.ejfBZ((java.util.List) obj);
                }
            };
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cvT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12827cuN.QkdxfA(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        return this.AkhnZx.AEQbTJ();
    }

    public static final WalletStatus hBpjJd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (WalletStatus) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.constant.WalletStatus> */
    public final AbstractC58260yxt<WalletStatus> djBIcL() {
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAkhnZx = this.AkhnZx.AkhnZx();
        final Function1 function1 = new Function1() { // from class: o.cwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AEQbTJ((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAkhnZx.copydefault(new InterfaceC58229yxO() { // from class: o.cwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.hBpjJd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final WalletStatus AEQbTJ(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        if (num.intValue() == 0) {
            return WalletStatus.NoWallet;
        }
        return WalletStatus.RealWallets;
    }

    public static final java.lang.Boolean RKDWNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.Boolean> copydefault(final java.lang.Long l, @NotNull final java.util.List<ChainAddress> list, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(this, false, false, false, 4, null);
        final Function1 function1 = new Function1() { // from class: o.cvp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(str, l, list, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cvq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.RKDWNf(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final boolean OLrzqt(java.lang.Long l, ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return l != null && chainAddress.getCoinId() == l.longValue();
    }

    public static final java.lang.String OLrzqt(ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return chainAddress.getAddress();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.cuN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58260yxt getWalletsToMergeIn$default(C12827cuN c12827cuN, long j, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return c12827cuN.KWHzl(j, str, (java.util.List<ChainAddress>) list);
    }

    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> KWHzl(final long j, @NotNull final java.lang.String str, final java.util.List<ChainAddress> list) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.OLrzqt(">>>ledger getWalletsToMergeIn chainId:" + j + " - deviceId:" + str + " - chainAddress:" + list);
        final C10854bwM c10854bwMKWHzl = this.AhwBna.KWHzl(java.lang.Long.valueOf(j));
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(this, false, false, false, 4, null);
        final Function1 function1 = new Function1() { // from class: o.cvs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(c10854bwMKWHzl, j, list, str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cvz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.UlJrfe(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> zLjUOn(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAEQbTJ = this.AYXKKw.AEQbTJ(list);
        final Function1 function1 = new Function1() { // from class: o.cxg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.isConnected(this.AEQbTJ, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DXXBbs(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.lang.Integer DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer fJNWhG(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final InterfaceC58261yxu isConnected(C12827cuN c12827cuN, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cwO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.fJNWhG((java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DarRvM(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu ODWQjV(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = this.AYXKKw.KWHzl(str);
        final Function1 function1 = new Function1() { // from class: o.cvJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.gEmmrt(this.copydefault, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cvU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.ODWQjV(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.lang.Integer AuCTel(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer DCJXGO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(C12827cuN c12827cuN, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cvb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AuCTel((java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cuZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DCJXGO(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu zuWLRA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtAEQbTJ = this.AYXKKw.AEQbTJ(str);
        final Function1 function1 = new Function1() { // from class: o.cwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.values(this.KWHzl, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.zuWLRA(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.lang.Integer fARcdN(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer ffGIBT(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu values(C12827cuN c12827cuN, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.fARcdN((java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cvL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.ffGIBT(function1, obj);
            }
        });
    }

    public static final InterfaceC58261yxu OBJEWx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> AuCTelauCTel(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = this.AYXKKw.KWHzl(list);
        final Function1 function1 = new Function1() { // from class: o.cvQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AkhnZx(this.EZpvd, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cvM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OBJEWx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu AkhnZx(C12827cuN c12827cuN, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cwo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.fIwbmz((java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cwl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.QHmsKR(function1, obj);
            }
        });
    }

    public static final java.lang.Integer QHmsKR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer fIwbmz(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.util.List hrNTAI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.util.List<o.ctV>> */
    public final AbstractC58260yxt<java.util.List<AbstractC12782ctV>> AYXKKw(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<AbstractC12784ctX>> abstractC58260yxtKWHzl = KWHzl(WalletType.MPCWallet);
        final Function1 function1 = new Function1() { // from class: o.cvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.copydefault(str, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.hrNTAI(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List copydefault(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
            MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
            if (Intrinsics.EZpvd((java.lang.Object) (mpcWalletEncodeInfoIsConnected != null ? mpcWalletEncodeInfoIsConnected.getUid() : null), (java.lang.Object) str)) {
                java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : listKWHzl) {
                    if (((AbstractC12782ctV) obj).QwvEab() != WalletType.AAWallet) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }

    public static final java.lang.Integer fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    @Override // o.InterfaceC9741bbM
    public AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtFARcdN = this.AkhnZx.fARcdN(str);
        final Function1 function1 = new Function1() { // from class: o.cwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.copydefault(this.copydefault, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtFARcdN.copydefault(new InterfaceC58229yxO() { // from class: o.cvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.fERRXa(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer copydefault(C12827cuN c12827cuN, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        for (AbstractC12782ctV abstractC12782ctV : c12827cuN.copydefault) {
            if (abstractC12782ctV.zuWLRA()) {
                abstractC12782ctV.AEQbTJ(false);
            }
            if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV.DbNXlk(), (java.lang.Object) str)) {
                abstractC12782ctV.AEQbTJ(true);
            }
            if (abstractC12782ctV.zuWLRA()) {
                java.util.ArrayList<AbstractC12782ctV> arrayList = new java.util.ArrayList<>();
                arrayList.add(abstractC12782ctV);
                c12827cuN.djBIcL = arrayList;
            }
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(c12827cuN.djBIcL);
        if (abstractC12782ctV2 != null) {
            C17920fXe.EZpvd.KWHzl(abstractC12782ctV2);
            SPUtils.put("tee_latest_wallet", java.lang.Boolean.valueOf(abstractC12782ctV2.QbewEr()));
            dTI dti = (dTI) C43251rlk.OLrzqt(dTI.class);
            if (dti != null) {
                dti.copydefault(C17922fXg.EZpvd(abstractC12782ctV2));
            }
        }
        RxBus.AEQbTJ(new xXO());
        return num;
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.values.AhwBna(str2);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtAEQbTJ = this.AkhnZx.AEQbTJ(str, true);
        final Function2 function2 = new Function2() { // from class: o.cwC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12827cuN.AEQbTJ(str2, (java.lang.String) obj, (AbstractC12782ctV) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtAhwBna, abstractC58260yxtAEQbTJ, new InterfaceC58223yxI() { // from class: o.cwA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12827cuN.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cwD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.KWHzl(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.dUDNAs(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cwI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.copydefault(i, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.USBtdM(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final AbstractC12782ctV KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (AbstractC12782ctV) function2.invoke(obj, obj2);
    }

    public static final AbstractC12782ctV AEQbTJ(java.lang.String str, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) throws EmptyMpcInfoException {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.QSBOWP() == null) {
            throw new EmptyMpcInfoException();
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP != null) {
            mpcWalletEncodeInfoQSBOWP.setStatus(MpcShare2Status.SHARE2_VALID.getValue());
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP2);
        MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP2);
        mpcWalletDecodeInfoOLrzqt.setEcdsaP3("");
        mpcWalletDecodeInfoOLrzqt.setEcdsaShare3("");
        mpcWalletDecodeInfoOLrzqt.setEd25519Share3("");
        abstractC12782ctV.AEQbTJ(C10964byQ.copydefault(str, str2, mpcWalletDecodeInfoOLrzqt));
        return abstractC12782ctV;
    }

    public static final InterfaceC58261yxu dUDNAs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cQM.updateMpcWalletInfo$default(o.cQM, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, int, java.lang.Object):o.yxt */
    public static final InterfaceC58261yxu KWHzl(C12827cuN c12827cuN, final AbstractC12782ctV abstractC12782ctV) throws EmptyMpcInfoException {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        java.lang.Integer numValueOf = mpcWalletEncodeInfoQSBOWP != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP.getStatus()) : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        java.lang.String encryptShareKey = mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getEncryptShareKey() : null;
        cQM cqm = c12827cuN.AkhnZx;
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null && (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) != null) {
            AbstractC58260yxt abstractC58260yxtKWHzl = cqm.KWHzl(strEZpvd, (220 & 2) != 0 ? null : numValueOf, (220 & 4) != 0 ? null : null, (220 & 8) != 0 ? null : null, (220 & 16) != 0 ? null : null, (220 & 32) != 0 ? null : encryptShareKey, (220 & 64) != 0 ? null : null, (220 & 128) == 0 ? null : null);
            final Function1 function1 = new Function1() { // from class: o.cwQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C12827cuN.KWHzl(abstractC12782ctV, (java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cwT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C12827cuN.QwvEab(function1, obj);
                }
            });
        }
        throw new EmptyMpcInfoException();
    }

    public static final AbstractC12782ctV QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12782ctV) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(int i, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        abstractC12782ctV.EZpvd(true);
        if (i == 1) {
            abstractC12782ctV.OLrzqt(true);
        } else if (i == 2) {
            abstractC12782ctV.copydefault(true);
        }
        return abstractC12782ctV.DCUTEIddSDPG();
    }

    public static final MpcWalletDecodeInfo OFhtUX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (MpcWalletDecodeInfo) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo> */
    public final AbstractC58260yxt<MpcWalletDecodeInfo> KWHzl(final AbstractC12782ctV abstractC12782ctV, final java.lang.String str) {
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.values.AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.EZpvd(abstractC12782ctV, str, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.OFhtUX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final MpcWalletDecodeInfo EZpvd(AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2) throws EmptyMpcInfoException {
        Intrinsics.checkNotNullParameter(str2, "");
        if (abstractC12782ctV.QSBOWP() == null) {
            throw new EmptyMpcInfoException();
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        return C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP);
    }

    public static final kotlin.Pair dHguZz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo, java.lang.String>> */
    public final AbstractC58260yxt<kotlin.Pair<MpcWalletDecodeInfo, java.lang.String>> AEQbTJ(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.values.AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AEQbTJ(abstractC12782ctV, str, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.dHguZz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair AEQbTJ(AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2) throws EmptyMpcInfoException {
        Intrinsics.checkNotNullParameter(str2, "");
        if (abstractC12782ctV.QSBOWP() == null) {
            throw new EmptyMpcInfoException();
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP);
        return C56390yDp.OLrzqt(C10964byQ.OLrzqt(str, str2, mpcWalletEncodeInfoQSBOWP), str2);
    }

    public static /* synthetic */ AbstractC58260yxt getMpcShare$default(C12827cuN c12827cuN, AbstractC12782ctV abstractC12782ctV, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return c12827cuN.copydefault(abstractC12782ctV, str, i);
    }

    public static final InterfaceC58261yxu DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> copydefault(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, final int i) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<MpcWalletDecodeInfo> abstractC58260yxtKWHzl = KWHzl(abstractC12782ctV, str);
        final Function1 function1 = new Function1() { // from class: o.cvy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.OLrzqt(i, (MpcWalletDecodeInfo) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DLWbHP(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu OLrzqt(int i, MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        java.util.HashMap map = new java.util.HashMap();
        if (i == 2) {
            map.put("ed25519Share2", mpcWalletDecodeInfo.getEd25519Share2());
            map.put("ecdsaShare2", mpcWalletDecodeInfo.getEcdsaShare2());
            map.put("ecdsaP2", mpcWalletDecodeInfo.getEcdsaP2());
        } else if (i == 3) {
            map.put("ed25519Share3", mpcWalletDecodeInfo.getEd25519Share3());
            map.put("ecdsaShare3", mpcWalletDecodeInfo.getEcdsaShare3());
            map.put("ecdsaP3", mpcWalletDecodeInfo.getEcdsaP3());
        } else {
            map.put("ed25519Share2", mpcWalletDecodeInfo.getEd25519Share2());
            map.put("ed25519Share3", mpcWalletDecodeInfo.getEd25519Share3());
            map.put("ecdsaShare2", mpcWalletDecodeInfo.getEcdsaShare2());
            map.put("ecdsaShare3", mpcWalletDecodeInfo.getEcdsaShare3());
            map.put("ecdsaP2", mpcWalletDecodeInfo.getEcdsaP2());
            map.put("ecdsaP3", mpcWalletDecodeInfo.getEcdsaP3());
        }
        return AbstractC58260yxt.copydefault(new GsonBuilder().disableHtmlEscaping().create().toJson(map));
    }

    public static final InterfaceC58261yxu spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> EZpvd(@NotNull LinkedHashMap<java.lang.String, java.util.List<java.lang.String>> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = this.AkhnZx.OLrzqt(linkedHashMap);
        final Function1 function1 = new Function1() { // from class: o.cvj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.DbNXlk(this.KWHzl, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cvu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.spnCvw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu DbNXlk(C12827cuN c12827cuN, final java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = fetchAllWallets$default(c12827cuN, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.cwH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.valueOf(num, (java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.cwN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.zblBkD(function1, obj);
            }
        });
    }

    public static final java.lang.Integer zblBkD(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AkhnZx.copydefault(str, str2);
    }

    public final AbstractC58260yxt<java.util.List<WalletRepairEntity>> EZpvd(int i, int i2) {
        return this.AkhnZx.EZpvd(i, i2);
    }

    public final void isConnected() {
        this.djBIcL.clear();
        this.copydefault.clear();
        this.ejfBZ = WalletStatus.NoWallet;
        SPUtils.put("tee_latest_wallet", java.lang.Boolean.FALSE);
        C17922fXg.KWHzl();
    }

    public final AbstractC58260yxt<java.lang.Integer> AkhnZx() {
        return this.AkhnZx.isConnected();
    }

    public final AbstractC58260yxt<java.lang.Integer> values() {
        return this.AkhnZx.DbNXlk();
    }

    public static /* synthetic */ AbstractC58185ywX decodeMPCPrivateKeys$default(C12827cuN c12827cuN, MpcWalletDecodeInfo mpcWalletDecodeInfo, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i2 = AddressType.P2SHCommonType.getValue();
        }
        return c12827cuN.copydefault(mpcWalletDecodeInfo, i, i2);
    }

    public final AbstractC58185ywX<java.util.List<MpcPrivateKeyItem>> copydefault(@NotNull final MpcWalletDecodeInfo mpcWalletDecodeInfo, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(this.gEmmrt.djBIcL(mpcWalletDecodeInfo.getMpcId()), (Function1) null, 1, (java.lang.Object) null);
        final Function1 function1 = new Function1() { // from class: o.cvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AEQbTJ(this.KWHzl, mpcWalletDecodeInfo, i2, i, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<MpcPrivateKeyItem>> abstractC58185ywXAEQbTJ = abstractC58185ywXUnwrapResponseData$default.AEQbTJ(new InterfaceC58229yxO() { // from class: o.cvv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.DAIeex(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AEQbTJ(C12827cuN c12827cuN, MpcWalletDecodeInfo mpcWalletDecodeInfo, int i, int i2, java.util.List list) {
        java.lang.String strCopydefault;
        java.lang.String strDjBIcL;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.List<C10854bwM> listOLrzqt = c12827cuN.AhwBna.OLrzqt((java.util.List<EscapeCoinMetaBean>) list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (C10854bwM c10854bwM : listOLrzqt) {
            map.put(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()), c10854bwM);
            arrayList.add(new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), c10854bwM.AxsJAYaxsJAY() ? i : AddressType.Legacy.getValue(), i2, c10854bwM.iwGUEr()));
        }
        java.util.List<WalletAddressList> listOLrzqt2 = xYQ.KWHzl.OLrzqt(mpcWalletDecodeInfo.getEcdsaPubkey(), mpcWalletDecodeInfo.getEcdsaChainCode(), mpcWalletDecodeInfo.getEd25519Pubkey(), mpcWalletDecodeInfo.getEd25519ChainCode(), arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt2, 10));
        for (WalletAddressList walletAddressList : listOLrzqt2) {
            map2.put(java.lang.Long.valueOf(walletAddressList.getChainId()), walletAddressList.getAddressList());
            arrayList2.add(Unit.INSTANCE);
        }
        java.util.List<MpcPrivateKey> listKWHzl = xYQ.KWHzl.KWHzl(mpcWalletDecodeInfo.getEcdsaShare2(), mpcWalletDecodeInfo.getEcdsaShare3(), mpcWalletDecodeInfo.getEd25519Share2(), mpcWalletDecodeInfo.getEd25519Share3(), arrayList);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (MpcPrivateKey mpcPrivateKey : listKWHzl) {
            C10854bwM c10854bwMOLrzqt = c12827cuN.AhwBna.copydefault(mpcPrivateKey.getChainId());
            java.util.List list2 = (java.util.List) map2.get(java.lang.Long.valueOf(mpcPrivateKey.getChainId()));
            java.lang.String address = null;
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((CoinAddressBean) next).getType() == ((c10854bwMOLrzqt == null || !c10854bwMOLrzqt.AxsJAYaxsJAY()) ? AddressType.Legacy.getValue() : i)) {
                        break;
                    }
                }
                CoinAddressBean coinAddressBean = (CoinAddressBean) next;
                if (coinAddressBean != null) {
                    address = coinAddressBean.getAddress();
                }
            }
            C10854bwM c10854bwM2 = (C10854bwM) map.get(java.lang.Long.valueOf(mpcPrivateKey.getChainId()));
            arrayList3.add(new MpcPrivateKeyItem(mpcPrivateKey.getChainId(), mpcPrivateKey.getPrivateKey(), address == null ? "" : address, false, false, (c10854bwM2 == null || (strDjBIcL = c10854bwM2.djBIcL()) == null) ? "" : strDjBIcL, (c10854bwM2 == null || (strCopydefault = c10854bwM2.copydefault()) == null) ? "" : strCopydefault, 24, (DefaultConstructorMarker) null));
        }
        return arrayList3;
    }

    public final AbstractC58260yxt<java.util.List<EsCapeData>> EZpvd(@NotNull AbstractC12784ctX abstractC12784ctX, int i) throws WalletImportError {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        C10854bwM c10854bwMIsConnected = this.AhwBna.isConnected();
        long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        int i2 = 0;
        if (mpcWalletEncodeInfoIsConnected == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, "账户地址生成失败", 0, 2, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i >= 0) {
            while (true) {
                arrayList.add(C13092czN.Activity.getInstance$default(C13092czN.Companion, null, 1, null).OLrzqt(mpcWalletEncodeInfoIsConnected, i2, jFetchVPNInfo));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.cvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.isConnected((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<EsCapeData>> abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.QKudOq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List QKudOq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<Unit> DbNXlk() {
        AbstractC58260yxt<kotlin.Pair<java.util.List<cSX>, java.util.List<WalletEntity>>> abstractC58260yxtAYXKKw = this.AkhnZx.AYXKKw();
        AbstractC58260yxt<java.util.List<MpcWalletEncodeInfo>> abstractC58260yxtOLrzqt = this.AkhnZx.OLrzqt();
        final Function2 function2 = new Function2() { // from class: o.cwg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C12827cuN.AEQbTJ((kotlin.Pair) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtAYXKKw, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.cwi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C12827cuN.copydefault(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cwj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cwk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.aUsmxb(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final kotlin.Pair copydefault(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair AEQbTJ(kotlin.Pair pair, java.util.List list) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(pair, list);
    }

    public static final InterfaceC58261yxu aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo.copy$default(com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, int, int, java.lang.Object):com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo */
    /* JADX DEBUG: Class process forced to load method for inline: o.dfo.TaskDescription.getInstance$default(o.dfo$TaskDescription, android.content.Context, int, java.lang.Object):o.dfo */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03bc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC58261yxu AEQbTJ(C12827cuN c12827cuN, kotlin.Pair pair) {
        int iNextIndex;
        int iNextIndex2;
        int iNextIndex3;
        int iNextIndex4;
        java.lang.String newProxyInstance;
        java.lang.String str;
        java.util.Iterator it;
        java.lang.Object next;
        java.lang.String str2;
        java.lang.String str3;
        LinkedHashMap linkedHashMap;
        WalletEntity walletEntity;
        java.lang.String uid;
        LinkedHashMap linkedHashMap2;
        java.lang.String name;
        java.util.Iterator it2;
        java.lang.Object obj;
        java.lang.String str4 = "";
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        kotlin.Pair pair2 = (kotlin.Pair) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.List<MpcWalletEncodeInfo> list = (java.util.List) second;
        boolean zIsEmpty = list.isEmpty();
        java.lang.String str5 = UDWalletManager.LUA_CLASS_NAME;
        if (zIsEmpty) {
            C10856bwO.copydefault(UDWalletManager.LUA_CLASS_NAME, 0, "mpcInfoList is empty");
            return AbstractC58260yxt.copydefault(Unit.INSTANCE);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        java.util.List list2 = (java.util.List) pair2.getFirst();
        java.util.List list3 = (java.util.List) pair2.getSecond();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list2) {
            java.lang.Integer numZsXlph = ((cSX) obj2).zsXlph();
            int iOrdinal = WalletType.MPCWallet.ordinal();
            if (numZsXlph != null && numZsXlph.intValue() == iOrdinal) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            C10856bwO.copydefault(UDWalletManager.LUA_CLASS_NAME, 0, "mpcRootWallets is empty");
            return AbstractC58260yxt.copydefault(Unit.INSTANCE);
        }
        cSX csx = (cSX) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        java.util.ListIterator listIterator = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            java.lang.Integer numZsXlph2 = ((cSX) listIterator.previous()).zsXlph();
            int iOrdinal2 = WalletType.HDWallet.ordinal();
            if (numZsXlph2 != null && numZsXlph2.intValue() == iOrdinal2) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        java.util.ListIterator listIterator2 = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            java.lang.Integer numZsXlph3 = ((cSX) listIterator2.previous()).zsXlph();
            int iOrdinal3 = WalletType.KeyWallet.ordinal();
            if (numZsXlph3 != null && numZsXlph3.intValue() == iOrdinal3) {
                iNextIndex2 = listIterator2.nextIndex();
                break;
            }
        }
        java.util.ListIterator listIterator3 = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                iNextIndex3 = -1;
                break;
            }
            java.lang.Integer numZsXlph4 = ((cSX) listIterator3.previous()).zsXlph();
            int iOrdinal4 = WalletType.HardwareWallet.ordinal();
            if (numZsXlph4 != null && numZsXlph4.intValue() == iOrdinal4) {
                iNextIndex3 = listIterator3.nextIndex();
                break;
            }
        }
        java.util.ListIterator listIterator4 = list2.listIterator(list2.size());
        while (true) {
            if (!listIterator4.hasPrevious()) {
                iNextIndex4 = -1;
                break;
            }
            java.lang.Integer numZsXlph5 = ((cSX) listIterator4.previous()).zsXlph();
            int iOrdinal5 = WalletType.TrackingWallet.ordinal();
            if (numZsXlph5 != null && numZsXlph5.intValue() == iOrdinal5) {
                iNextIndex4 = listIterator4.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            iNextIndex2 = iNextIndex + 1;
        } else if (iNextIndex2 == -1) {
            iNextIndex2 = iNextIndex3 == -1 ? iNextIndex4 == -1 ? 0 : iNextIndex4 : iNextIndex3;
        }
        if (csx == null || (newProxyInstance = csx.getNewProxyInstance()) == null) {
            newProxyInstance = "";
        }
        for (MpcWalletEncodeInfo mpcWalletEncodeInfo : list) {
            java.util.Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                java.lang.Object next2 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((WalletEntity) next2).getId(), (java.lang.Object) mpcWalletEncodeInfo.getRootWalletId())) {
                    obj = next2;
                    break;
                }
            }
            WalletEntity walletEntity2 = (WalletEntity) obj;
            if (walletEntity2 != null) {
                if (linkedHashMap3.containsKey(mpcWalletEncodeInfo.getMpcId())) {
                    java.util.List arrayList2 = (java.util.List) linkedHashMap3.get(mpcWalletEncodeInfo.getMpcId());
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(C56390yDp.OLrzqt(walletEntity2, mpcWalletEncodeInfo));
                    linkedHashMap3.put(mpcWalletEncodeInfo.getMpcId(), arrayList2);
                } else {
                    linkedHashMap3.put(mpcWalletEncodeInfo.getMpcId(), yDY.AhwBna(C56390yDp.OLrzqt(walletEntity2, mpcWalletEncodeInfo)));
                }
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        for (java.lang.Object obj3 : list) {
            java.lang.String uid2 = ((MpcWalletEncodeInfo) obj3).getUid();
            java.lang.Object obj4 = linkedHashMap4.get(uid2);
            if (obj4 == null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                linkedHashMap4.put(uid2, arrayList8);
                obj4 = arrayList8;
            }
            ((java.util.List) obj4).add(obj3);
        }
        java.util.HashMap map = new java.util.HashMap();
        java.util.Collection collectionValues = linkedHashMap3.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        java.util.Iterator it4 = collectionValues.iterator();
        while (it4.hasNext()) {
            java.util.List list4 = (java.util.List) it4.next();
            Intrinsics.copydefault(list4);
            java.util.Iterator it5 = list4.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    str = str4;
                    it = it4;
                    next = null;
                    break;
                }
                next = it5.next();
                WalletEntity walletEntity3 = (WalletEntity) ((kotlin.Pair) next).getFirst();
                str = str4;
                if (walletEntity3 != null) {
                    it = it4;
                    if (walletEntity3.getType() == WalletType.MPCWallet.ordinal()) {
                        break;
                    }
                } else {
                    it = it4;
                }
                str4 = str;
                it4 = it;
            }
            kotlin.Pair pair3 = (kotlin.Pair) next;
            if (pair3 == null || (walletEntity = (WalletEntity) pair3.getFirst()) == null) {
                str2 = str5;
                str3 = newProxyInstance;
                linkedHashMap = linkedHashMap4;
            } else {
                kotlin.Pair pair4 = (kotlin.Pair) CollectionsKt___CollectionsKt.firstOrNull(list4);
                MpcWalletEncodeInfo mpcWalletEncodeInfo2 = pair4 != null ? (MpcWalletEncodeInfo) pair4.getSecond() : null;
                long createAt = ((WalletEntity) ((kotlin.Pair) CollectionsKt___CollectionsKt.AubY(list4)).getFirst()).getCreateAt();
                if (mpcWalletEncodeInfo2 == null || (uid = mpcWalletEncodeInfo2.getUid()) == null) {
                    uid = str;
                }
                java.lang.Integer num = (java.lang.Integer) map.get(uid);
                int iIntValue = num != null ? num.intValue() : 0;
                int i = iIntValue + 1;
                str3 = newProxyInstance;
                java.lang.String str6 = i > 9 ? str : "0";
                java.util.List list5 = (java.util.List) linkedHashMap4.get(uid);
                if (list5 != null) {
                    linkedHashMap2 = linkedHashMap4;
                    str2 = str5;
                    if (list5.size() > 1) {
                        name = walletEntity.getName() + " " + str6 + i;
                    }
                    linkedHashMap = linkedHashMap2;
                    C12786ctZ c12786ctZ = new C12786ctZ(null, name, WalletType.MPCWallet, createAt, iNextIndex2, iIntValue, 1, null);
                    map.put(uid, java.lang.Integer.valueOf(i));
                    it2 = list4.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        java.lang.Object next3 = it2.next();
                        if (i2 < 0) {
                            yDY.AYXKKw();
                        }
                        kotlin.Pair pair5 = (kotlin.Pair) next3;
                        WalletEntity walletEntity4 = (WalletEntity) pair5.getFirst();
                        MpcWalletEncodeInfo mpcWalletEncodeInfo3 = (MpcWalletEncodeInfo) pair5.getSecond();
                        MpcWalletEncodeInfo mpcWalletEncodeInfoCopy = mpcWalletEncodeInfo3.copy((65535 & 1) != 0 ? mpcWalletEncodeInfo3.rootWalletId : null, (65535 & 2) != 0 ? mpcWalletEncodeInfo3.copiedEscapeList : null, (65535 & 4) != 0 ? mpcWalletEncodeInfo3.mpcId : null, (65535 & 8) != 0 ? mpcWalletEncodeInfo3.uid : null, (65535 & 16) != 0 ? mpcWalletEncodeInfo3.status : 0, (65535 & 32) != 0 ? mpcWalletEncodeInfo3.version : null, (65535 & 64) != 0 ? mpcWalletEncodeInfo3.accountName : null, (65535 & 128) != 0 ? mpcWalletEncodeInfo3.displayAccountName : null, (65535 & 256) != 0 ? mpcWalletEncodeInfo3.encryptShareKey : null, (65535 & 512) != 0 ? mpcWalletEncodeInfo3.ecdsaPubkey : null, (65535 & 1024) != 0 ? mpcWalletEncodeInfo3.ecdsaChainCode : null, (65535 & 2048) != 0 ? mpcWalletEncodeInfo3.ed25519Pubkey : null, (65535 & 4096) != 0 ? mpcWalletEncodeInfo3.ed25519ChainCode : null, (65535 & 8192) != 0 ? mpcWalletEncodeInfo3.isEscape : 0, (65535 & 16384) != 0 ? mpcWalletEncodeInfo3.mpcCreateAt : 0L, (65535 & 32768) != 0 ? mpcWalletEncodeInfo3.createType : 0);
                        java.util.Iterator it6 = it2;
                        walletEntity4.setName(C14140dfo.createWalletName$default(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null), null, 1, walletEntity4.getType() == WalletType.AAWallet.ordinal(), 1, null));
                        walletEntity4.setRootWalletId(c12786ctZ.AEQbTJ());
                        arrayList5.add(walletEntity4);
                        arrayList6.add(mpcWalletEncodeInfoCopy);
                        i2++;
                        it2 = it6;
                    }
                    arrayList3.add(c12786ctZ);
                    if (mpcWalletEncodeInfo2 == null) {
                        mpcWalletEncodeInfo2.setRootWalletId(c12786ctZ.AEQbTJ());
                        arrayList4.add(mpcWalletEncodeInfo2);
                    }
                } else {
                    str2 = str5;
                    linkedHashMap2 = linkedHashMap4;
                }
                name = walletEntity.getName();
                linkedHashMap = linkedHashMap2;
                C12786ctZ c12786ctZ2 = new C12786ctZ(null, name, WalletType.MPCWallet, createAt, iNextIndex2, iIntValue, 1, null);
                map.put(uid, java.lang.Integer.valueOf(i));
                it2 = list4.iterator();
                int i22 = 0;
                while (it2.hasNext()) {
                }
                arrayList3.add(c12786ctZ2);
                if (mpcWalletEncodeInfo2 == null) {
                }
            }
            str4 = str;
            it4 = it;
            newProxyInstance = str3;
            str5 = str2;
            linkedHashMap4 = linkedHashMap;
        }
        java.lang.String str7 = str5;
        java.lang.String str8 = newProxyInstance;
        int size = list2.size();
        while (iNextIndex2 < size) {
            cSX csx2 = (cSX) list2.get(iNextIndex2);
            csx2.OLrzqt(csx2.zLjUOn() + 1);
            arrayList7.add(((cSX) list2.get(iNextIndex2)).EZpvd());
            iNextIndex2++;
        }
        CollectionsKt___CollectionsKt.EZpvd(arrayList3, new ActionBar());
        C10856bwO.copydefault(str7, 0, "mpc update data is ready");
        return c12827cuN.DbNXlk.EZpvd(str8, arrayList7, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return this.AkhnZx.AEQbTJ(continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/String;)Lo/bbJ; */
    @Override // o.InterfaceC9741bbM
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public AbstractC12782ctV OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) str)) {
                break;
            }
        }
        return (AbstractC12782ctV) next;
    }

    @Override // o.InterfaceC9741bbM
    public java.util.List<InterfaceC9738bbJ> AEQbTJ(long j) {
        CopyOnWriteArrayList<AbstractC12782ctV> copyOnWriteArrayList = this.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : copyOnWriteArrayList) {
            if (((AbstractC12782ctV) obj).EZpvd(java.lang.Long.valueOf(j))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final AbstractC58260yxt<java.lang.Integer> gHZMYf(@NotNull java.util.List<? extends AbstractC12782ctV> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (AbstractC12782ctV abstractC12782ctV : list) {
            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
            int value = abstractC12782ctV.getPostValueLengthLimit().getValue();
            int value2 = abstractC12782ctV.hBpjJd().getValue();
            java.lang.String strDHguZz = abstractC12782ctV.dHguZz();
            java.lang.String str = strDHguZz == null ? "" : strDHguZz;
            java.lang.String strOqFWZa = abstractC12782ctV.OqFWZa();
            java.lang.String str2 = strOqFWZa == null ? "" : strOqFWZa;
            java.lang.Long lQSLkRj = abstractC12782ctV.QSLkRj();
            arrayList.add(new WalletRepairEntity(strDbNXlk, value, value2, str, str2, lQSLkRj != null ? lQSLkRj.longValue() : java.lang.System.currentTimeMillis()));
        }
        return this.AkhnZx.djBIcL(arrayList);
    }

    public static final InterfaceC58261yxu OLrzqt(final C12827cuN c12827cuN, final boolean z, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC12784ctX) it.next()).KWHzl(""));
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.cva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.values((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.accept(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cve
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C12827cuN.OLrzqt(this.EZpvd, z, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C12827cuN.RlQdEF(function12, obj);
            }
        });
    }

    public static final AbstractC12782ctV djBIcL(java.lang.String str, java.util.List list) throws java.lang.Exception {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.Iterator<T> it2 = ((AbstractC12782ctV) next).valueOf().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it2.next();
                if (C59449zhJ.gEmmrt(((ChainAddress) next2).getAddress(), str, true)) {
                    obj = next2;
                    break;
                }
            }
            if (obj != null) {
                obj = next;
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        if (abstractC12782ctV != null) {
            return abstractC12782ctV;
        }
        throw EmptyResultException.Companion.KWHzl();
    }

    public static final java.util.List gEmmrt(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12782ctV) obj).isConnected(str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final AbstractC12782ctV AEQbTJ(java.lang.String str, boolean z, java.lang.Long l, boolean z2, java.util.List list) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.util.ArrayList<ChainAddress> arrayListFvQaOB = ((AbstractC12782ctV) obj).EZpvd();
            if (!(arrayListFvQaOB instanceof java.util.Collection) || !arrayListFvQaOB.isEmpty()) {
                java.util.Iterator<T> it = arrayListFvQaOB.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ChainAddress chainAddress = (ChainAddress) it.next();
                        if (C59449zhJ.gEmmrt(chainAddress.getAddress(), str, z)) {
                            long chainId = chainAddress.getChainId();
                            if (l != null && chainId == l.longValue()) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.EZpvd(arrayList, new StateListAnimator(z2)));
        if (abstractC12782ctV != null) {
            return abstractC12782ctV;
        }
        throw EmptyResultException.Companion.KWHzl();
    }

    public static final java.util.List copydefault(boolean z, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!z) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!((AbstractC12784ctX) obj).wlaJM()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List EZpvd(WalletType walletType, java.lang.String str, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            if (abstractC12782ctV.QwvEab() == WalletType.AAWallet && abstractC12782ctV.DarRvM() == walletType) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.util.List<ChainAddress> listValueOf = ((AbstractC12782ctV) next).valueOf();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            java.util.Iterator<T> it2 = listValueOf.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((ChainAddress) it2.next()).getEoaAddress());
            }
            if (arrayList2.contains(str)) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) next;
        if (abstractC12782ctV2 != null) {
            return C56402yEa.EZpvd(abstractC12782ctV2);
        }
        return yDY.AhwBna();
    }

    public static final java.util.List AYXKKw(java.lang.String str, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.util.List<ChainAddress> listValueOf = ((AbstractC12782ctV) next).valueOf();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
            java.util.Iterator<T> it2 = listValueOf.iterator();
            while (it2.hasNext()) {
                arrayList.add(((ChainAddress) it2.next()).getEoaAddress());
            }
            if (arrayList.contains(str)) {
                break;
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) next;
        if (abstractC12782ctV != null) {
            return C56402yEa.EZpvd(abstractC12782ctV);
        }
        return yDY.AhwBna();
    }

    public static final java.util.List EZpvd(WalletType walletType, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((AbstractC12784ctX) obj).fJNWhG() == walletType) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.util.List EZpvd(java.util.List list, java.util.List list2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) obj;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (abstractC12784ctX.fJNWhG() == ((WalletType) next)) {
                    break;
                }
            }
            if (next != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.lang.Boolean ejfBZ(java.util.List list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                z = true;
                if (!((AbstractC12782ctV) it.next()).zblBkD()) {
                    break;
                }
            }
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final java.lang.Boolean EZpvd(java.lang.String str, final java.lang.Long l, java.util.List list, java.util.List list2) {
        boolean z;
        C13854daT c13854daTFetchVPNInfo;
        Intrinsics.checkNotNullParameter(list2, "");
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
                if (abstractC12782ctV.gHZMYf() || abstractC12782ctV.iwGUEr()) {
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                    if (Intrinsics.EZpvd((java.lang.Object) ((abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) ? null : c13854daTFetchVPNInfo.AYXKKw()), (java.lang.Object) str) && abstractC12782ctV.AhwBna(l)) {
                        java.util.List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(abstractC12782ctV.EZpvd()), new Function1() { // from class: o.cvl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(C12827cuN.OLrzqt(l, (ChainAddress) obj));
                            }
                        }), new Function1() { // from class: o.cvk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C12827cuN.OLrzqt((ChainAddress) obj);
                            }
                        }));
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                        java.util.Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((ChainAddress) it2.next()).getAddress());
                        }
                        if (listZuBGHE.containsAll(arrayList)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public static final java.util.List EZpvd(C10854bwM c10854bwM, long j, java.util.List list, java.lang.String str, java.util.List list2) {
        C13854daT c13854daTFetchVPNInfo;
        java.util.List listAhwBna;
        C13854daT c13854daTFetchVPNInfo2;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
            java.lang.String strAYXKKw = null;
            if (c10854bwM != null && c10854bwM.call()) {
                boolean zAhwBna = abstractC12782ctV.AhwBna(java.lang.Long.valueOf(j));
                java.util.ArrayList<ChainAddress> arrayListFvQaOB = abstractC12782ctV.EZpvd();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : arrayListFvQaOB) {
                    if (((ChainAddress) obj2).getCoinId() == j) {
                        arrayList2.add(obj2);
                    }
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ChainAddress) it.next()).getAddress());
                }
                if (list != null) {
                    listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        listAhwBna.add(((ChainAddress) it2.next()).getAddress());
                    }
                } else {
                    listAhwBna = null;
                }
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                boolean zContainsAll = arrayList3.containsAll(listAhwBna);
                if (abstractC12782ctV.gHZMYf()) {
                    AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
                    if (abstractC12784ctXGwTjWJ != null && (c13854daTFetchVPNInfo2 = abstractC12784ctXGwTjWJ.fetchVPNInfo()) != null) {
                        strAYXKKw = c13854daTFetchVPNInfo2.AYXKKw();
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) str) && !zAhwBna && !zContainsAll) {
                        arrayList.add(obj);
                    }
                }
            } else {
                boolean zAhwBna2 = abstractC12782ctV.AhwBna(java.lang.Long.valueOf(j));
                if (abstractC12782ctV.gHZMYf()) {
                    AbstractC12784ctX abstractC12784ctXGwTjWJ2 = abstractC12782ctV.gwTjWJ();
                    if (abstractC12784ctXGwTjWJ2 != null && (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ2.fetchVPNInfo()) != null) {
                        strAYXKKw = c13854daTFetchVPNInfo.AYXKKw();
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) str) && !zAhwBna2) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final java.util.List isConnected(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(new EsCapeData(((EoaAddress) obj).getEoaAddress(), i, false, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            i++;
        }
        return arrayList;
    }
}
