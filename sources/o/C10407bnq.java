package o;

import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.asset.WalletAssetManager$saveWalletAssetCache$1;
import com.okinc.business.defi.biz.core.asset.WalletAssetManager$updateDefaultAddress$2$2;
import com.okinc.business.defi.biz.core.error.OKWAssetAllException;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.AssetAll;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.ContractAddressResp;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyResp;
import com.okinc.business.defi.biz.net.bean.NftAll;
import com.okinc.business.defi.biz.net.bean.NftBean;
import com.okinc.business.defi.biz.net.bean.Portfolio;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBean;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBeanRes;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import com.okinc.business.defi.biz.net.bean.WalletCoinAddrRegisterBean;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import com.okinc.wallet.api.bean.AddressType;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.RxSingleKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C10525bqB;
import o.C13754dXa;
import o.dTK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bnq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10407bnq {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final java.lang.String AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC57023yab AhwBna;
    public final C10954byG AkhnZx;
    public final cQB DbNXlk;
    public final java.util.List<C10525bqB> EZpvd;
    public final java.util.List<C10594brR> OLrzqt;
    public final java.util.HashSet<java.lang.Long> copydefault;
    public final C10403bnm djBIcL;
    public final C12827cuN ejfBZ;
    public final C13058cyg fIwbmz;
    public final WalletUpdateWorker fJNWhG;
    public final C13934dbu fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public volatile boolean isConnected;
    public final C11495cQj valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.bnq$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.DemoWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List AEQbTJ(java.util.List list, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final ResponseData EZpvd(ResponseData responseData, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C10404bnn KWHzl(C10404bnn c10404bnn, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        Intrinsics.checkNotNullParameter(l, "");
        return c10404bnn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Long OLrzqt(java.lang.Long l, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11495cQj KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10403bnm copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.isConnected;
    }

    public C10407bnq(@NotNull InterfaceC57023yab interfaceC57023yab, @NotNull C13934dbu c13934dbu, @NotNull C12827cuN c12827cuN, @NotNull WalletUpdateWorker walletUpdateWorker, @NotNull C10954byG c10954byG, @NotNull C13058cyg c13058cyg, @NotNull C11495cQj c11495cQj, @NotNull cQB cqb, @NotNull C10403bnm c10403bnm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC57023yab, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(walletUpdateWorker, "");
        Intrinsics.checkNotNullParameter(c10954byG, "");
        Intrinsics.checkNotNullParameter(c13058cyg, "");
        Intrinsics.checkNotNullParameter(c11495cQj, "");
        Intrinsics.checkNotNullParameter(cqb, "");
        Intrinsics.checkNotNullParameter(c10403bnm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AhwBna = interfaceC57023yab;
        this.fetchVPNInfo = c13934dbu;
        this.ejfBZ = c12827cuN;
        this.fJNWhG = walletUpdateWorker;
        this.AkhnZx = c10954byG;
        this.fIwbmz = c13058cyg;
        this.valueOf = c11495cQj;
        this.DbNXlk = cqb;
        this.djBIcL = c10403bnm;
        this.gEmmrt = coroutineDispatcher;
        this.AEQbTJ = "WalletAssetManager";
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.boF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10407bnq.EZpvd(this.OLrzqt);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.boH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C10407bnq.AEQbTJ();
            }
        });
        this.EZpvd = Collections.synchronizedList(new java.util.ArrayList());
        this.OLrzqt = Collections.synchronizedList(new java.util.ArrayList());
        this.copydefault = new java.util.HashSet<>();
    }

    /* JADX INFO: renamed from: o.bnq$Application */
    public static final class Application<T> implements java.util.Comparator {
        public final /* synthetic */ java.util.Map KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.util.Map map) {
            this.KWHzl = map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer num = (java.lang.Integer) this.KWHzl.get(java.lang.Long.valueOf(((C10525bqB) t).OLrzqt()));
            int iIntValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            java.lang.Integer num2 = (java.lang.Integer) this.KWHzl.get(java.lang.Long.valueOf(((C10525bqB) t2).OLrzqt()));
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
        }
    }

    /* JADX INFO: renamed from: o.bnq$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bnq.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C10407bnq getInstance$default(ActionBar actionBar, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return actionBar.OLrzqt(context);
        }

        public final C10407bnq OLrzqt(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AubY();
        }
    }

    public final C10948byA gEmmrt() {
        return (C10948byA) this.AYXKKw.getValue();
    }

    public static final C10948byA EZpvd(C10407bnq c10407bnq) {
        return c10407bnq.AkhnZx.valueOf();
    }

    /* JADX INFO: renamed from: o.bnq$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C10527bqD) t2).OLrzqt())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C10527bqD) t).OLrzqt())));
        }
    }

    /* JADX INFO: renamed from: o.bnq$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C10528bqE) t2).OLrzqt(false))), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((C10528bqE) t).OLrzqt(false))));
        }
    }

    public final java.util.Set<java.lang.Long> AYXKKw() {
        return (java.util.Set) this.values.getValue();
    }

    public static final java.util.Set AEQbTJ() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static /* synthetic */ AbstractC58260yxt getCustomAssetForManagement$default(C10407bnq c10407bnq, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MIN_VALUE;
        }
        return c10407bnq.copydefault(j);
    }

    public static final java.util.List dHguZz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<C10594brR>> copydefault(final long j) {
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C11607cUn.AEQbTJ((AbstractC58260yxt) this.ejfBZ.copydefault(true));
        final Function1 function1 = new Function1() { // from class: o.bnP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.EZpvd(this.AEQbTJ, j, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<java.util.List<C10594brR>> abstractC58260yxtCopydefault = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.boc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.dHguZz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List EZpvd(C10407bnq c10407bnq, long j, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        c10407bnq.OLrzqt.clear();
        for (C10594brR c10594brR : abstractC12782ctV.OxVOHk()) {
            if (c10594brR.AEQbTJ() == j) {
                c10407bnq.OLrzqt.add(c10594brR);
                if (abstractC12782ctV.AkhnZx(c10594brR.fetchVPNInfo().AkhnZx())) {
                    c10407bnq.copydefault.add(java.lang.Long.valueOf(c10594brR.OLrzqt()));
                }
            }
        }
        return c10407bnq.OLrzqt;
    }

    public static /* synthetic */ AbstractC58260yxt getAssetAllForManagement$default(C10407bnq c10407bnq, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = Long.MIN_VALUE;
        }
        return c10407bnq.KWHzl(j);
    }

    public final AbstractC58260yxt<C10404bnn> KWHzl(final long j) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.ejfBZ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bpT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bpW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.RdAHlO(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bpZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.AEQbTJ, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bpX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.OBJEWx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        AbstractC58260yxt abstractC58260yxtAEQbTJ = C11607cUn.AEQbTJ(abstractC58260yxtOLrzqt2);
        final Function1 function13 = new Function1() { // from class: o.bpY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.OLrzqt, j, (Triple) obj);
            }
        };
        AbstractC58260yxt<C10404bnn> abstractC58260yxtCopydefault2 = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.bpV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.RKDWNf(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final InterfaceC58261yxu RdAHlO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C10407bnq c10407bnq, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58260yxt<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, WalletCoinAssetEntity>>>> abstractC58260yxtOLrzqt = c10407bnq.valueOf.OLrzqt(abstractC12782ctV.DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.bot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(abstractC12782ctV, (java.util.HashMap) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.gwTjWJ(function1, obj);
            }
        });
    }

    public static final kotlin.Pair copydefault(AbstractC12782ctV abstractC12782ctV, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, map);
    }

    public static final kotlin.Pair gwTjWJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OBJEWx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C10407bnq c10407bnq, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC58260yxt<java.util.List<WalletClosedCoinEntity>> abstractC58260yxtEZpvd = c10407bnq.DbNXlk.EZpvd(((AbstractC12782ctV) pair.getFirst()).DbNXlk());
        final Function1 function1 = new Function1() { // from class: o.boD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(pair, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.boG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.QSBOWP(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Triple QSBOWP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple AEQbTJ(kotlin.Pair pair, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new Triple(pair.getFirst(), pair.getSecond(), list);
    }

    public static final C10404bnn RKDWNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    public static final C10404bnn AEQbTJ(C10407bnq c10407bnq, long j, Triple triple) {
        long j2;
        int i;
        int i2;
        java.util.List list;
        java.lang.Boolean bool;
        Intrinsics.checkNotNullParameter(triple, "");
        java.lang.Object first = triple.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) first;
        java.lang.Object second = triple.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        c10407bnq.EZpvd.clear();
        java.util.Iterator<T> it = abstractC12782ctV.AEQbTJ(yDY.AhwBna(), (java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, WalletCoinAssetEntity>>>) second).iterator();
        while (true) {
            j2 = Long.MIN_VALUE;
            if (!it.hasNext()) {
                break;
            }
            C10525bqB c10525bqB = (C10525bqB) it.next();
            if (j == Long.MIN_VALUE || c10525bqB.AEQbTJ() == j) {
                c10407bnq.EZpvd.add(c10525bqB);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = new java.util.HashMap();
        for (C10525bqB c10525bqB2 : abstractC12782ctV.QHmsKR()) {
            if (j == Long.MIN_VALUE || c10525bqB2.AEQbTJ() == j) {
                arrayList.add(c10525bqB2);
                map.put(java.lang.Long.valueOf(c10525bqB2.OLrzqt()), java.lang.Boolean.TRUE);
            }
        }
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI = abstractC12782ctV.hrNTAI();
        java.util.List<java.lang.Integer> listGEmmrt = yDY.gEmmrt(1, 2);
        Intrinsics.copydefault(mapHrNTAI, "");
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(c10407bnq.EZpvd(arrayList, listGEmmrt, yDY.gEmmrt(mapHrNTAI, C56424yEw.KWHzl())), C10534bqK.copydefault);
        c10407bnq.copydefault.clear();
        java.util.HashSet<java.lang.Long> hashSet = c10407bnq.copydefault;
        int i3 = 10;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator it2 = listEZpvd.iterator();
        while (it2.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((C10525bqB) it2.next()).OLrzqt()));
        }
        hashSet.addAll(arrayList3);
        java.util.Iterator<T> it3 = abstractC12782ctV.QVsKAR().iterator();
        while (true) {
            i = 0;
            if (!it3.hasNext()) {
                break;
            }
            C10854bwM c10854bwM = (C10854bwM) it3.next();
            boolean z = j == j2 || c10854bwM.AEQbTJ() == j;
            java.lang.Object obj = map2.get(java.lang.Long.valueOf(c10854bwM.AhwBna()));
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            boolean z2 = Intrinsics.EZpvd(obj, bool2) || Intrinsics.EZpvd(map.get(java.lang.Long.valueOf(c10854bwM.AhwBna())), bool2);
            if (!z || z2) {
                i2 = i3;
                list = listEZpvd;
            } else {
                if (arrayList2.size() >= 100) {
                    break;
                }
                if (c10854bwM.giSNqX()) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.List<C10525bqB> list2 = mapHrNTAI.get(c10854bwM.fJNWhG());
                    if (list2 != null) {
                        for (C10525bqB c10525bqB3 : list2) {
                            arrayList4.add(c10525bqB3);
                            map2.put(java.lang.Long.valueOf(c10525bqB3.OLrzqt()), java.lang.Boolean.TRUE);
                        }
                    }
                    java.util.Iterator<T> it4 = c10407bnq.EZpvd(arrayList4, yDY.gEmmrt(1, 2), yDY.gEmmrt(mapHrNTAI, C56424yEw.KWHzl())).iterator();
                    while (it4.hasNext()) {
                        arrayList2.add((C10525bqB) it4.next());
                    }
                } else if (c10854bwM.DcqEDu()) {
                    C10525bqB c10525bqBAYXKKw = abstractC12782ctV.AYXKKw(java.lang.Long.valueOf(c10854bwM.AhwBna()));
                    if (c10525bqBAYXKKw == null) {
                        bool = bool2;
                        i2 = i3;
                        list = listEZpvd;
                        c10525bqBAYXKKw = C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM, abstractC12782ctV, null, 4, null);
                    } else {
                        bool = bool2;
                        i2 = i3;
                        list = listEZpvd;
                    }
                    arrayList2.add(c10525bqBAYXKKw);
                    map2.put(java.lang.Long.valueOf(c10525bqBAYXKKw.OLrzqt()), bool);
                }
                i2 = i3;
                list = listEZpvd;
            }
            i3 = i2;
            listEZpvd = list;
            j2 = Long.MIN_VALUE;
        }
        int i4 = i3;
        java.util.List list3 = listEZpvd;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.Object third = triple.getThird();
        Intrinsics.checkNotNullExpressionValue(third, "");
        java.util.List list4 = (java.util.List) third;
        for (C10854bwM c10854bwM2 : abstractC12782ctV.iZzfmt()) {
            if (j == Long.MIN_VALUE || c10854bwM2.AEQbTJ() == j) {
                arrayList5.add(C10525bqB.StateListAnimator.fromCoinMeta$default(C10525bqB.Companion, c10854bwM2, abstractC12782ctV, null, 4, null));
            }
        }
        java.util.List<C10525bqB> listEZpvd2 = c10407bnq.EZpvd(arrayList5, yDY.gEmmrt(1, 2), yDY.gEmmrt(mapHrNTAI, C56424yEw.KWHzl()));
        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(list4, i4));
        for (java.lang.Object obj2 : list4) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList6.add(C56390yDp.OLrzqt(java.lang.Long.valueOf(((WalletClosedCoinEntity) obj2).getCoinId()), java.lang.Integer.valueOf(i)));
            i++;
        }
        return new C10404bnn(abstractC12782ctV.DbNXlk(), false, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list3, (java.lang.Iterable) arrayList2), yDY.AhwBna(), CollectionsKt___CollectionsKt.EZpvd(listEZpvd2, new Application(C56424yEw.copydefault(arrayList6))), yDY.AhwBna(), yDY.AhwBna());
    }

    public final java.util.List<C10594brR> djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<C10594brR> list = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C10594brR c10594brR = (C10594brR) obj;
            if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10594brR.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true)) {
                ChainAddress chainAddressCopydefault = c10594brR.DbNXlk().copydefault(java.lang.Long.valueOf(c10594brR.AEQbTJ()));
                if (C59449zhJ.gEmmrt(chainAddressCopydefault != null ? chainAddressCopydefault.getAddress() : null, str, true)) {
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final java.util.List<C10525bqB> AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<C10525bqB> list = this.EZpvd;
        Intrinsics.checkNotNullExpressionValue(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C10525bqB c10525bqB = (C10525bqB) obj;
            if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c10525bqB.KWHzl().fJNWhG(), (java.lang.CharSequence) str, true) && !C59449zhJ.gEmmrt(c10525bqB.KWHzl().OLrzqt(), str, true)) {
                if (c10525bqB.KWHzl().fetchVPNInfo() == 607) {
                    java.util.Iterator<T> it = C14079deg.EZpvd.OLrzqt(c10525bqB.KWHzl().OLrzqt()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (C59449zhJ.gEmmrt(((C9756bbb) next).OLrzqt(), str, true)) {
                            break;
                        }
                    }
                    if (next != null) {
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<AbstractC12782ctV> listCopydefault = this.ejfBZ.copydefault();
        if (!(listCopydefault instanceof java.util.Collection) || !listCopydefault.isEmpty()) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                if (((AbstractC12782ctV) it.next()).fetchVPNInfo(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<AbstractC12782ctV> listCopydefault = this.ejfBZ.copydefault();
        if (!(listCopydefault instanceof java.util.Collection) || !listCopydefault.isEmpty()) {
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                if (((AbstractC12782ctV) it.next()).AkhnZx(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) C10953byF.KWHzl.AEQbTJ(str), (java.lang.Object) "coin")) {
            java.util.List<AbstractC12782ctV> listCopydefault = this.ejfBZ.copydefault();
            if ((listCopydefault instanceof java.util.Collection) && listCopydefault.isEmpty()) {
                if (this.copydefault.size() < 1) {
                    break;
                }
            } else {
                java.util.Iterator<T> it = listCopydefault.iterator();
                while (it.hasNext()) {
                    if (!((AbstractC12782ctV) it.next()).AEQbTJ(str)) {
                        break;
                    }
                }
                if (this.copydefault.size() < 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(str);
    }

    public final boolean gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) C10953byF.KWHzl.AEQbTJ(str), (java.lang.Object) "coin") && this.copydefault.size() > 1;
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> copydefault(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.ejfBZ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bqi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(str, z, this, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bqj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.htlTjW(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bqh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bqf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.fERRXa(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return C11607cUn.valueOf(abstractC58260yxtOLrzqt2);
    }

    public static final InterfaceC58261yxu htlTjW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC58261yxu copydefault(java.lang.String str, boolean z, C10407bnq c10407bnq, AbstractC12782ctV abstractC12782ctV) {
        java.util.Collection collectionEZpvd;
        java.util.Collection collectionEZpvd2;
        java.lang.Object next;
        java.lang.String strFJNWhG;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        C10953byF c10953byF = C10953byF.KWHzl;
        long jEZpvd = Intrinsics.EZpvd((java.lang.Object) c10953byF.AEQbTJ(str), (java.lang.Object) "coin") ? c10953byF.EZpvd(str) : -1L;
        if (z && abstractC12782ctV.KWHzl(str) && !abstractC12782ctV.fetchVPNInfo(str)) {
            C10854bwM c10854bwMKWHzl = c10407bnq.gEmmrt().KWHzl(java.lang.Long.valueOf(jEZpvd));
            C10948byA c10948byAGEmmrt = c10407bnq.gEmmrt();
            if (c10854bwMKWHzl != null && (strFJNWhG = c10854bwMKWHzl.fJNWhG()) != null) {
                str2 = strFJNWhG;
            }
            java.util.List<C10854bwM> listAEQbTJ = c10948byAGEmmrt.AEQbTJ(str2);
            if (c10854bwMKWHzl != null) {
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((C10854bwM) next).AhwBna() == jEZpvd) {
                        break;
                    }
                }
                if (next == null) {
                    collectionEZpvd2 = C56402yEa.EZpvd(abstractC12782ctV.OLrzqt(str, true));
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : listAEQbTJ) {
                        if (abstractC12782ctV.KWHzl(((C10854bwM) obj).OcIXYQ())) {
                            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl.AEQbTJ(), null, 2, null);
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) (chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null))) {
                                arrayList2.add(obj);
                            }
                        }
                    }
                    collectionEZpvd2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                    java.util.Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        collectionEZpvd2.add(abstractC12782ctV.OLrzqt(((C10854bwM) it2.next()).OcIXYQ(), true));
                    }
                }
                c10407bnq.copydefault.add(java.lang.Long.valueOf(jEZpvd));
                arrayList.addAll(collectionEZpvd2);
            }
        } else if (!z && abstractC12782ctV.AEQbTJ(str) && abstractC12782ctV.fetchVPNInfo(str)) {
            C10854bwM c10854bwMKWHzl2 = c10407bnq.gEmmrt().KWHzl(java.lang.Long.valueOf(jEZpvd));
            if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.giSNqX()) {
                java.util.List<C10525bqB> list = abstractC12782ctV.hrNTAI().get(c10854bwMKWHzl2.fJNWhG());
                if (list == null) {
                    collectionEZpvd = yDY.AhwBna();
                } else {
                    collectionEZpvd = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    java.util.Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        collectionEZpvd.add(((C10525bqB) it3.next()).wlaJM());
                    }
                }
            } else {
                collectionEZpvd = C56402yEa.EZpvd(str);
            }
            c10407bnq.copydefault.remove(java.lang.Long.valueOf(jEZpvd));
            java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(collectionEZpvd, 10));
            java.util.Iterator it4 = collectionEZpvd.iterator();
            while (it4.hasNext()) {
                arrayList3.add(abstractC12782ctV.EZpvd((java.lang.String) it4.next(), true));
            }
            arrayList.addAll(arrayList3);
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final InterfaceC58261yxu fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C10407bnq c10407bnq, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c10407bnq.ejfBZ.copydefault(true);
        final Function1 function1 = new Function1() { // from class: o.bpd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(list, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.fdOvFl(function1, obj);
            }
        });
    }

    public static final java.util.List fdOvFl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu igXuih(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.lang.Long> AEQbTJ(@NotNull final java.lang.String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.ejfBZ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bqc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(str, z, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.bqe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.igXuih(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bqb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.KWHzl(this.copydefault, (java.lang.Long) obj);
            }
        };
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bqd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.Dmq(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu AEQbTJ(java.lang.String str, boolean z, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        long jEZpvd = C10953byF.KWHzl.EZpvd(str);
        if (z && !abstractC12782ctV.AkhnZx(str)) {
            return abstractC12782ctV.getNewProxyInstance(jEZpvd);
        }
        if (!z && abstractC12782ctV.KWHzl(str)) {
            return abstractC12782ctV.values(jEZpvd);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C10407bnq c10407bnq, final java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c10407bnq.ejfBZ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(l, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bpD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.fjfviF(function1, obj);
            }
        });
    }

    public static final java.lang.Long fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Long) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd QHmsKR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r1v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<com.okinc.business.defi.biz.net.bean.ContractAddressResp>> */
    public final AbstractC58185ywX<ResponseData<ContractAddressResp>> copydefault(final long j, @NotNull final java.lang.String str, final java.lang.Integer num, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.ejfBZ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bpH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.copydefault, j, str, num, str2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bpK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.QHmsKR(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dbu.checkContractAddress$default(o.dbu, java.lang.String, java.lang.String, long, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, int, java.lang.Object):o.ywX */
    public static final InterfaceC60096zvd AEQbTJ(C10407bnq c10407bnq, long j, java.lang.String str, java.lang.Integer num, java.lang.String str2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return C33527myD.KWHzl(c10407bnq.fetchVPNInfo.KWHzl(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), j, str, (32 & 16) != 0 ? null : num, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? null : str2));
    }

    /* JADX DEBUG: Type inference failed for r0v9. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Integer> */
    public final AbstractC58185ywX<java.lang.Integer> OLrzqt() {
        java.util.List<WalletCoinAddrRegisterBean> list = null;
        java.lang.String string = SPUtils.getString("wallet_coinaddr_register_list", null);
        if (string != null) {
            try {
                list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(WalletCoinAddrRegisterBean.Companion.serializer()), string);
            } catch (java.lang.Exception e) {
                pUU.copydefault("checkAndSyncFailedRegisterToken", ">>>Json failed :" + e.getMessage());
                AhwBna();
            }
            if (list != null) {
                AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXAhwBna = this.fetchVPNInfo.AhwBna(list);
                final Function1 function1 = new Function1() { // from class: o.boh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10407bnq.EZpvd((java.lang.Throwable) obj);
                    }
                };
                AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXDjBIcL = abstractC58185ywXAhwBna.djBIcL(new InterfaceC58229yxO() { // from class: o.bof
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10407bnq.DCUTEI(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.bok
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10407bnq.gEmmrt(this.KWHzl, (ResponseData) obj);
                    }
                };
                AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bol
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10407bnq.getPostValueLengthLimit(function12, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                return abstractC58185ywXAEQbTJ;
            }
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(0);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(0);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final ResponseData DCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(-1, null, null, null, null, null, 62, null);
    }

    public static final java.lang.Integer getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer gEmmrt(C10407bnq c10407bnq, ResponseData responseData) {
        int i;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() != 0) {
            pUU.copydefault("checkAndSyncFailedRegisterToken", ">>>API failed :" + responseData.getCode());
            i = 1;
        } else {
            c10407bnq.AhwBna();
            i = 0;
        }
        return java.lang.Integer.valueOf(i);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Integer> */
    public final AbstractC58185ywX<java.lang.Integer> copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.List<WalletCoinAddrRegisterBean> listEZpvd = C56402yEa.EZpvd(new WalletCoinAddrRegisterBean(str, java.lang.Long.valueOf(j)));
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXAhwBna = this.fetchVPNInfo.AhwBna(listEZpvd);
        final Function1 function1 = new Function1() { // from class: o.boy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.djBIcL((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.lang.Object>> abstractC58185ywXDjBIcL = abstractC58185ywXAhwBna.djBIcL(new InterfaceC58229yxO() { // from class: o.boC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.heceqZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.boB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.KWHzl(listEZpvd, this, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.boA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.hCLrkq(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData heceqZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(-1, null, null, null, null, null, 62, null);
    }

    public static final java.lang.Integer hCLrkq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xZt.encodeToString$default(kotlinx.serialization.SerializationStrategy, java.lang.Object, boolean, int, java.lang.Object):java.lang.String */
    public static final java.lang.Integer KWHzl(java.util.List list, C10407bnq c10407bnq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        int i = 0;
        if (responseData.getCode() != 0) {
            pUU.copydefault("registerToken", ">>>API failed :" + responseData.getCode());
            java.lang.String strEncodeToString$default = null;
            java.lang.String string = SPUtils.getString("wallet_coinaddr_register_list", null);
            if (string != null) {
                try {
                    list = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(WalletCoinAddrRegisterBean.Companion.serializer()), string), (java.lang.Iterable) list);
                } catch (java.lang.Exception e) {
                    pUU.copydefault("registerToken", ">>>Json failed :" + e.getMessage());
                    c10407bnq.AhwBna();
                }
            }
            try {
                strEncodeToString$default = C54907xZt.encodeToString$default(BuiltinSerializersKt.ListSerializer(WalletCoinAddrRegisterBean.Companion.serializer()), list, false, 2, null);
            } catch (java.lang.Exception e2) {
                pUU.copydefault("registerToken", ">>>Json encodeToString failed :" + e2.getMessage());
            }
            if (strEncodeToString$default != null) {
                SPUtils.put("wallet_coinaddr_register_list", strEncodeToString$default);
            }
            i = 1;
        }
        return java.lang.Integer.valueOf(i);
    }

    public final void AhwBna() {
        SPUtils.remove("wallet_coinaddr_register_list");
    }

    public final AbstractC58185ywX<ResponseData<? extends C10854bwM>> OLrzqt(long j, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final int i, final java.lang.Integer num, AbstractC12782ctV abstractC12782ctV, final java.lang.Long l) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final C10854bwM c10854bwMKWHzl = gEmmrt().KWHzl(java.lang.Long.valueOf(j));
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (abstractC12782ctV == null) {
            abstractC58260yxtCopydefault = this.ejfBZ.copydefault(false);
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(abstractC12782ctV);
        }
        final Function1 function1 = new Function1() { // from class: o.boN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(objectRef, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.boR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.OqFWZa(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.boP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(this.EZpvd, objectRef, c10854bwMKWHzl, str, str2, i, num, l, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtCopydefault2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.boS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DarRvM(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.boV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.valueOf(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.boU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.ffGIBT(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.boT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(objectRef, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywXKWHzl2.copydefault(new InterfaceC58229yxO() { // from class: o.boW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.zuWLRA(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return C33527myD.KWHzl(abstractC58185ywXCopydefault);
    }

    public static final Unit OqFWZa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.ctV */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(Ref.ObjectRef objectRef, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        objectRef.element = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC60096zvd OLrzqt(C10407bnq c10407bnq, Ref.ObjectRef objectRef, C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, int i, java.lang.Integer num, java.lang.Long l, Unit unit) {
        java.lang.String strUSBtdM;
        java.lang.String strDbNXlk;
        java.lang.String strAUsmxb;
        Intrinsics.checkNotNullParameter(unit, "");
        C13934dbu c13934dbu = c10407bnq.fetchVPNInfo;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objectRef.element;
        if (abstractC12782ctV == null || (strUSBtdM = abstractC12782ctV.USBtdM()) == null) {
            strUSBtdM = "";
        }
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) objectRef.element;
        if (abstractC12782ctV2 == null || (strDbNXlk = abstractC12782ctV2.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        java.lang.Long lValueOf = c10854bwM != null ? java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()) : null;
        java.lang.String strAhwBna = c10407bnq.fJNWhG.AhwBna();
        AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) objectRef.element;
        if (abstractC12782ctV3 == null || (strAUsmxb = abstractC12782ctV3.aUsmxb()) == null) {
            strAUsmxb = " ";
        }
        return c13934dbu.EZpvd(strUSBtdM, strDbNXlk, lValueOf, str, str2, i, strAhwBna, num, l, strAUsmxb);
    }

    public static final InterfaceC60096zvd ffGIBT(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final ResponseData DXXBbs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData copydefault(C10407bnq c10407bnq, ResponseData responseData, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        C10948byA c10948byAGEmmrt = c10407bnq.gEmmrt();
        CoinMetaBean coinMetaBean = (CoinMetaBean) responseData.getData();
        return new ResponseData(0, null, null, null, c10948byAGEmmrt.KWHzl(coinMetaBean != null ? java.lang.Long.valueOf(coinMetaBean.getCoinId()) : null), null, 47, null);
    }

    public static final InterfaceC58261yxu zuWLRA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC58261yxu AEQbTJ(Ref.ObjectRef objectRef, ResponseData responseData) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(responseData, "");
        final C10854bwM c10854bwM = (C10854bwM) responseData.getData();
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objectRef.element;
        if (c10854bwM != null && abstractC12782ctV != null && abstractC12782ctV.KWHzl(c10854bwM.OcIXYQ()) && !abstractC12782ctV.fetchVPNInfo(c10854bwM.OcIXYQ())) {
            AbstractC58260yxt<java.lang.Long> abstractC58260yxtOLrzqt = abstractC12782ctV.OLrzqt(c10854bwM.OcIXYQ(), true);
            final Function1 function1 = new Function1() { // from class: o.boZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.OLrzqt(c10854bwM, (java.lang.Long) obj);
                }
            };
            InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bpa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.OuxcSI(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58261yxuCopydefault);
            return interfaceC58261yxuCopydefault;
        }
        java.lang.String errorMsg = responseData.getErrorMsg();
        if (errorMsg == null || errorMsg.length() == 0) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DxnCrt);
        } else {
            strAYXKKw = responseData.getErrorMsg();
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new ResponseData(0, null, null, strAYXKKw, null, null, 39, null));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final ResponseData OuxcSI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(C10854bwM c10854bwM, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return new ResponseData(0, null, null, null, c10854bwM, null, 46, null);
    }

    public static /* synthetic */ AbstractC58185ywX getMainWalletHomeAssets$default(C10407bnq c10407bnq, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return c10407bnq.EZpvd(z, num);
    }

    public final AbstractC58185ywX<C10405bno> EZpvd(final boolean z, final java.lang.Integer num) {
        C10856bwO.copydefault(this.AEQbTJ, 0, "getMainWalletHomeAssets start, cacheFirst: " + z + ", type: " + num);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.ejfBZ.copydefault(false);
        final Function1 function1 = new Function1() { // from class: o.bpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(this.KWHzl, num, z, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.hrNTAI(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.EZpvd(this.AEQbTJ, z, num, (C10404bnn) obj);
            }
        };
        AbstractC58185ywX<C10405bno> abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.copydefault((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.ODXsMY(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final InterfaceC60096zvd hrNTAI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(final C10407bnq c10407bnq, final java.lang.Integer num, boolean z, final AbstractC12782ctV abstractC12782ctV) {
        InterfaceC60096zvd interfaceC60096zvdKWHzl;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58185ywX<C10404bnn> abstractC58185ywXEZpvd = c10407bnq.OLrzqt(abstractC12782ctV, C10329bmR.EZpvd(), true, false).EZpvd();
        if (num == null) {
            interfaceC60096zvdKWHzl = null;
        } else if (num.intValue() == 0 || num.intValue() == 1) {
            AbstractC58185ywX<Unit> abstractC58185ywXEZpvd2 = c10407bnq.EZpvd(abstractC12782ctV);
            final Function1 function1 = new Function1() { // from class: o.bop
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.EZpvd(this.KWHzl, abstractC12782ctV, num, (Unit) obj);
                }
            };
            interfaceC60096zvdKWHzl = abstractC58185ywXEZpvd2.KWHzl(new InterfaceC58229yxO() { // from class: o.bos
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.dmfpNf(function1, obj);
                }
            });
        } else {
            AbstractC58185ywX<java.util.List<C10404bnn>> abstractC58185ywXKWHzl = c10407bnq.KWHzl(C56402yEa.EZpvd(abstractC12782ctV), abstractC12782ctV.DbNXlk(), abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), num.intValue(), C10329bmR.EZpvd(), true, c10407bnq.KWHzl(abstractC12782ctV), "getHome2");
            final Function1 function12 = new Function1() { // from class: o.boq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.gEmmrt(abstractC12782ctV, (java.util.List) obj);
                }
            };
            interfaceC60096zvdKWHzl = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.box
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.OHqIaq(function12, obj);
                }
            });
        }
        return interfaceC60096zvdKWHzl == null ? abstractC58185ywXEZpvd : z ? AbstractC58185ywX.KWHzl(abstractC58185ywXEZpvd, interfaceC60096zvdKWHzl) : interfaceC60096zvdKWHzl;
    }

    public static final InterfaceC60096zvd dmfpNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(C10407bnq c10407bnq, final AbstractC12782ctV abstractC12782ctV, java.lang.Integer num, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        java.util.List<? extends AbstractC12782ctV> listEZpvd = C56402yEa.EZpvd(abstractC12782ctV);
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
        java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
        int iIntValue = num.intValue();
        java.util.List<java.lang.Integer> listEZpvd2 = C10329bmR.EZpvd();
        Intrinsics.copydefault(abstractC12782ctV);
        AbstractC58185ywX<java.util.List<C10404bnn>> abstractC58185ywXKWHzl = c10407bnq.KWHzl(listEZpvd, strDbNXlk, strUSBtdM, strAUsmxb, iIntValue, listEZpvd2, true, c10407bnq.KWHzl(abstractC12782ctV), "getHome1");
        final Function1 function1 = new Function1() { // from class: o.bpz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(abstractC12782ctV, (java.util.List) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.hBpjJd(function1, obj);
            }
        });
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXOLrzqt = c10407bnq.OLrzqt(abstractC12782ctV);
        final Function2 function2 = new Function2() { // from class: o.bpE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10407bnq.KWHzl((C10404bnn) obj, (java.lang.Long) obj2);
            }
        };
        return AbstractC58185ywX.KWHzl(interfaceC60096zvdAEQbTJ, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.bpF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C10407bnq.AhwBna(function2, obj, obj2);
            }
        });
    }

    public static final C10404bnn hBpjJd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    public static final C10404bnn copydefault(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C10404bnn) next).gEmmrt(), (java.lang.Object) abstractC12782ctV.DbNXlk())) {
                break;
            }
        }
        return (C10404bnn) next;
    }

    public static final C10404bnn AhwBna(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (C10404bnn) function2.invoke(obj, obj2);
    }

    public static final C10404bnn OHqIaq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    public static final C10404bnn gEmmrt(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C10404bnn) next).gEmmrt(), (java.lang.Object) abstractC12782ctV.DbNXlk())) {
                break;
            }
        }
        return (C10404bnn) next;
    }

    public static final InterfaceC58261yxu ODXsMY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C10407bnq c10407bnq, boolean z, java.lang.Integer num, final C10404bnn c10404bnn) {
        Intrinsics.checkNotNullParameter(c10404bnn, "");
        C10856bwO.copydefault(c10407bnq.AEQbTJ, 0, "getMainWalletHomeAssets finish, cacheFirst: " + z + ", type: " + num);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = c10407bnq.ejfBZ.OLrzqt(c10404bnn.gEmmrt(), false);
        final Function1 function1 = new Function1() { // from class: o.bob
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(c10404bnn, (AbstractC12782ctV) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bnZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DLWbHP(function1, obj);
            }
        });
    }

    public static final C10531bqH values(java.util.List<C10528bqE> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (C10528bqE c10528bqE : list) {
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(c10528bqE.AkhnZx()), "0")) {
                if (c10528bqE.AhwBna()) {
                    arrayList2.add(c10528bqE);
                } else {
                    arrayList.add(c10528bqE);
                }
            }
        }
        return new C10531bqH(arrayList, arrayList2);
    }

    public static final C10405bno DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10405bno) function1.invoke(obj);
    }

    public static final C10405bno AEQbTJ(C10404bnn c10404bnn, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new C10405bno(abstractC12782ctV, c10404bnn.AhwBna(), c10404bnn.OLrzqt(), c10404bnn.valueOf(), c10404bnn.AEQbTJ(), values(c10404bnn.EZpvd()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bnq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX refreshAllWalletAsset$default(C10407bnq c10407bnq, int i, java.util.List list, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            list = C10329bmR.EZpvd();
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        return c10407bnq.AEQbTJ(i, (java.util.List<java.lang.Integer>) list, z);
    }

    public static final InterfaceC60096zvd ixgjPv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.util.List<C10404bnn>> AEQbTJ(final int i, @NotNull final java.util.List<java.lang.Integer> list, final boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.ejfBZ, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.boE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.EZpvd, i, list, z, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<C10404bnn>> abstractC58185ywXKWHzl = abstractC58260yxtFetchAllWallets$default.KWHzl(new InterfaceC58229yxO() { // from class: o.boQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.ixgjPv(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(C10407bnq c10407bnq, int i, java.util.List list, boolean z, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(list2);
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        java.lang.String strAUsmxb = abstractC12782ctV != null ? abstractC12782ctV.aUsmxb() : null;
        if (strAUsmxb == null) {
            strAUsmxb = "";
        }
        java.lang.String strUSBtdM = abstractC12782ctV != null ? abstractC12782ctV.USBtdM() : null;
        return c10407bnq.KWHzl(list2, strDbNXlk, strUSBtdM != null ? strUSBtdM : "", strAUsmxb, i, list, z, false, "refreshAll");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bnq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX refreshWalletAsset$default(C10407bnq c10407bnq, java.lang.String str, int i, java.util.List list, boolean z, boolean z2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            list = C10329bmR.EZpvd();
        }
        java.util.List list2 = list;
        if ((i2 & 8) != 0) {
            z = true;
        }
        return c10407bnq.AEQbTJ(str, i3, (java.util.List<java.lang.Integer>) list2, z, z2);
    }

    public static final InterfaceC60096zvd fHqPtx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<o.bnn, o.ctV>> */
    public final AbstractC58185ywX<kotlin.Pair<C10404bnn, AbstractC12782ctV>> AEQbTJ(@NotNull final java.lang.String str, final int i, @NotNull final java.util.List<java.lang.Integer> list, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.ejfBZ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.bqk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.EZpvd, i, list, z, z2, str, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bqm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.fHqPtx(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd AEQbTJ(C10407bnq c10407bnq, int i, java.util.List list, boolean z, boolean z2, final java.lang.String str, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58185ywX<java.util.List<C10404bnn>> abstractC58185ywXKWHzl = c10407bnq.KWHzl(C56402yEa.EZpvd(abstractC12782ctV), abstractC12782ctV.DbNXlk(), abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb(), i, list, z, z2, "refreshWallet");
        final Function1 function1 = new Function1() { // from class: o.bom
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.KWHzl(abstractC12782ctV, str, (java.util.List) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DcqEDu(function1, obj);
            }
        });
    }

    public static final kotlin.Pair DcqEDu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair KWHzl(AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((C10404bnn) next).gEmmrt(), (java.lang.Object) str)) {
                break;
            }
        }
        return C56390yDp.OLrzqt((C10404bnn) next, abstractC12782ctV);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.bnq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX refreshWalletSingleCoinAsset$default(C10407bnq c10407bnq, java.lang.String str, long j, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = C10329bmR.EZpvd();
        }
        java.util.List list2 = list;
        if ((i & 8) != 0) {
            z = true;
        }
        return c10407bnq.KWHzl(str, j, (java.util.List<java.lang.Integer>) list2, z, z2);
    }

    public final AbstractC58185ywX<C10404bnn> KWHzl(@NotNull java.lang.String str, long j, @NotNull java.util.List<java.lang.Integer> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return OLrzqt(str, C56402yEa.EZpvd(java.lang.Long.valueOf(j)), list, z, z2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bnq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX refreshAllWalletsCoinAsset$default(C10407bnq c10407bnq, java.util.List list, java.util.List list2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            list2 = C10329bmR.EZpvd();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return c10407bnq.copydefault((java.util.List<java.lang.Long>) list, (java.util.List<java.lang.Integer>) list2, z, z2);
    }

    public static final InterfaceC60096zvd DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.util.List<C10404bnn>> copydefault(@NotNull final java.util.List<java.lang.Long> list, @NotNull final java.util.List<java.lang.Integer> list2, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.ejfBZ, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.bnC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AhwBna(this.KWHzl, list, z2, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58260yxtFetchAllWallets$default.KWHzl(new InterfaceC58229yxO() { // from class: o.bnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DCUTEIdCUTEI(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(this.OLrzqt, z2, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bnG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.spnCvw(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bnI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.EZpvd(this.AEQbTJ, list2, z, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<C10404bnn>> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bnF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.zblBkD(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return abstractC58185ywXCopydefault2;
    }

    public static final InterfaceC60096zvd AhwBna(C10407bnq c10407bnq, java.util.List list, boolean z, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        final java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
            map.put(abstractC12782ctV.DbNXlk(), abstractC12782ctV);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((AbstractC12782ctV) it2.next()).DbNXlk());
        }
        AbstractC58185ywX<java.util.List<AssetAll>> abstractC58185ywXKWHzl = c10407bnq.KWHzl(arrayList, (java.util.List<java.lang.Long>) list, ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).USBtdM(), ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).DbNXlk(), z);
        final Function1 function1 = new Function1() { // from class: o.bqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(map, (java.util.List) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bqy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DCUTEIddSDPG(function1, obj);
            }
        });
    }

    public static final kotlin.Pair DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AEQbTJ(java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(map, list);
    }

    public static final InterfaceC58261yxu spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C10407bnq c10407bnq, boolean z, kotlin.Pair pair) {
        AbstractC12782ctV abstractC12782ctV;
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        for (AssetAll assetAll : (java.lang.Iterable) second) {
            java.util.ArrayList<TokenAsset> tokens = assetAll.getTokens();
            if (tokens != null && (abstractC12782ctV = (AbstractC12782ctV) ((java.util.HashMap) pair.getFirst()).get(assetAll.getAccountId())) != null) {
                arrayList.add(c10407bnq.KWHzl(abstractC12782ctV, (java.util.List<TokenAsset>) tokens, false, false, z));
            }
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final InterfaceC58261yxu zblBkD(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C10407bnq c10407bnq, java.util.List list, boolean z, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return c10407bnq.AEQbTJ((java.util.List<java.lang.Integer>) list, z, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bnq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AbstractC58185ywX refreshWalletCoinAsset$default(C10407bnq c10407bnq, java.lang.String str, java.util.List list, java.util.List list2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = C10329bmR.EZpvd();
        }
        java.util.List list3 = list2;
        if ((i & 8) != 0) {
            z = true;
        }
        return c10407bnq.OLrzqt(str, (java.util.List<java.lang.Long>) list, (java.util.List<java.lang.Integer>) list3, z, z2);
    }

    public static final InterfaceC60096zvd KDccX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public final AbstractC58185ywX<C10404bnn> OLrzqt(@NotNull final java.lang.String str, @NotNull final java.util.List<java.lang.Long> list, @NotNull final java.util.List<java.lang.Integer> list2, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.ejfBZ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.bpG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.EZpvd(this.KWHzl, list, z2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58260yxtOLrzqt.KWHzl(new InterfaceC58229yxO() { // from class: o.bpQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.KDccX(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bqa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(this.KWHzl, z2, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXCopydefault = abstractC58185ywXKWHzl.copydefault((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bqq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DGOPHZDGOPHZ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bnr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(this.KWHzl, str, list2, z, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<C10404bnn> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bnE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DBxZfM(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return abstractC58185ywXCopydefault2;
    }

    public static final InterfaceC60096zvd EZpvd(C10407bnq c10407bnq, java.util.List list, boolean z, final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC58185ywX<java.util.List<AssetAll>> abstractC58185ywXKWHzl = c10407bnq.KWHzl(C56402yEa.EZpvd(abstractC12782ctV.DbNXlk()), (java.util.List<java.lang.Long>) list, abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), z);
        final Function1 function1 = new Function1() { // from class: o.bpJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AYXKKw(abstractC12782ctV, (java.util.List) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bpI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DWgRXt(function1, obj);
            }
        });
    }

    public static final kotlin.Pair DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair AYXKKw(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, list);
    }

    public static final InterfaceC58261yxu DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C10407bnq c10407bnq, boolean z, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.util.Iterator it = ((java.lang.Iterable) second).iterator();
        while (it.hasNext()) {
            java.util.ArrayList<TokenAsset> tokens = ((AssetAll) it.next()).getTokens();
            if (tokens != null) {
                java.lang.Object first = pair.getFirst();
                Intrinsics.checkNotNullExpressionValue(first, "");
                arrayList.add(c10407bnq.KWHzl((AbstractC12782ctV) first, (java.util.List<TokenAsset>) tokens, false, false, z));
            }
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final InterfaceC58261yxu DBxZfM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C10407bnq c10407bnq, java.lang.String str, java.util.List list, boolean z, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        return c10407bnq.copydefault(str, (java.util.List<java.lang.Integer>) list, z, true);
    }

    public static final InterfaceC58261yxu QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C10407bnq c10407bnq, java.util.List list, boolean z, java.util.List list2) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            AssetAll assetAll = (AssetAll) it.next();
            java.util.Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((AbstractC12782ctV) next).DbNXlk(), (java.lang.Object) assetAll.getAccountId())) {
                    break;
                }
            }
            arrayList.add(c10407bnq.copydefault((AbstractC12782ctV) next, assetAll, false, z));
        }
        return C11607cUn.KWHzl(arrayList);
    }

    public static final InterfaceC58261yxu OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C10407bnq c10407bnq, java.util.List list, java.util.List list2, boolean z, java.util.List list3) {
        Intrinsics.checkNotNullParameter(list3, "");
        C10856bwO.copydefault(c10407bnq.AEQbTJ, 0, "getWalletAssetFromServerAndCache finish");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c10407bnq.AEQbTJ(((AbstractC12782ctV) it.next()).DbNXlk(), (java.util.List<java.lang.Integer>) list2, z, true));
        }
        return C11607cUn.valueOf(C11607cUn.KWHzl(arrayList));
    }

    public final C10404bnn KWHzl(AbstractC12782ctV abstractC12782ctV, java.util.List<java.lang.Integer> list, boolean z, boolean z2) {
        java.util.List<C10525bqB> listOHqIaq = abstractC12782ctV.OHqIaq();
        java.util.List<C10525bqB> listEZpvd = EZpvd(CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) abstractC12782ctV.QHmsKR(), (java.lang.Iterable) listOHqIaq), list);
        if (z) {
            return new C10404bnn(abstractC12782ctV.DbNXlk(), z2, getNewProxyInstance(listEZpvd), getNewProxyInstance(listOHqIaq), yDY.AhwBna(), iwGUEr(abstractC12782ctV.RdAHlO()), zsXlph(abstractC12782ctV.fARcdN()));
        }
        return new C10404bnn(abstractC12782ctV.DbNXlk(), z2, listEZpvd, listOHqIaq, yDY.AhwBna(), abstractC12782ctV.RdAHlO(), abstractC12782ctV.fARcdN());
    }

    public final AbstractC58260yxt<C10404bnn> OLrzqt(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final java.util.List<java.lang.Integer> list, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.boa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10407bnq.KWHzl(this.copydefault, abstractC12782ctV, list, z, z2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final C10404bnn KWHzl(C10407bnq c10407bnq, AbstractC12782ctV abstractC12782ctV, java.util.List list, boolean z, boolean z2) {
        return c10407bnq.KWHzl(abstractC12782ctV, (java.util.List<java.lang.Integer>) list, z, z2);
    }

    public static final C10404bnn OFhtUX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.bnn> */
    public final AbstractC58260yxt<C10404bnn> copydefault(java.lang.String str, final java.util.List<java.lang.Integer> list, final boolean z, final boolean z2) {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.ejfBZ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.boe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.OLrzqt(this.KWHzl, list, z, z2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.boi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.OFhtUX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final C10404bnn OLrzqt(C10407bnq c10407bnq, java.util.List list, boolean z, boolean z2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c10407bnq.KWHzl(abstractC12782ctV, (java.util.List<java.lang.Integer>) list, z, z2);
    }

    public static final C10404bnn OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C10404bnn) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.bnn> */
    public final AbstractC58260yxt<C10404bnn> AEQbTJ(@NotNull java.lang.String str, @NotNull final java.util.List<java.lang.Integer> list, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.ejfBZ.copydefault(str, false);
        final Function1 function1 = new Function1() { // from class: o.bpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.KWHzl(this.KWHzl, list, z, z2, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.OJuSTm(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final C10404bnn KWHzl(C10407bnq c10407bnq, java.util.List list, boolean z, boolean z2, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c10407bnq.KWHzl(abstractC12782ctV, (java.util.List<java.lang.Integer>) list, z, z2);
    }

    public static final java.util.List QkdxfA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final AbstractC58260yxt<java.util.List<C10404bnn>> AEQbTJ(final java.util.List<java.lang.Integer> list, final boolean z, final boolean z2) {
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(this.ejfBZ, false, false, false, 7, null);
        final Function1 function1 = new Function1() { // from class: o.bpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(this.copydefault, list, z, z2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.util.List<C10404bnn>> abstractC58260yxtCopydefault = abstractC58260yxtFetchAllWallets$default.copydefault(new InterfaceC58229yxO() { // from class: o.bpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.QkdxfA(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public final java.util.List<C10525bqB> getNewProxyInstance(@NotNull java.util.List<C10525bqB> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return CollectionsKt___CollectionsKt.EZpvd(list, C10534bqK.copydefault);
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(AbstractC12782ctV abstractC12782ctV, @NotNull AssetAll assetAll, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(assetAll, "");
        return RxSingleKt.rxSingle(this.gEmmrt, new WalletAssetManager$saveWalletAssetCache$1(assetAll, abstractC12782ctV, this, z, z2, null));
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(AbstractC12782ctV abstractC12782ctV, @NotNull AssetAll assetAll, boolean z, boolean z2) {
        NftAll nftAll;
        java.util.ArrayList<NftBean> collections;
        Intrinsics.checkNotNullParameter(assetAll, "");
        if (assetAll.getTokens() == null && assetAll.getDefis() == null && assetAll.getNfts() == null) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        java.util.List listSynchronizedList = Collections.synchronizedList(new java.util.ArrayList());
        if (Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null), (java.lang.Object) assetAll.getAccountId())) {
            java.util.ArrayList<TokenAsset> tokens = assetAll.getTokens();
            if (tokens != null) {
                listSynchronizedList.add(KWHzl(abstractC12782ctV, (java.util.List<TokenAsset>) tokens, true, z, z2));
            }
            java.util.ArrayList<Portfolio> defis = assetAll.getDefis();
            if (defis != null) {
                listSynchronizedList.add(djBIcL(abstractC12782ctV, defis));
            }
            java.util.ArrayList<NftAll> nfts = assetAll.getNfts();
            if (nfts != null && (nftAll = (NftAll) CollectionsKt___CollectionsKt.firstOrNull(nfts)) != null && (collections = nftAll.getCollections()) != null) {
                listSynchronizedList.add(AhwBna(abstractC12782ctV, collections));
            }
        }
        Intrinsics.copydefault(listSynchronizedList);
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(listSynchronizedList);
        final Function1 function1 = new Function1() { // from class: o.bnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.ejfBZ((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault2 = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.DNMMPQ(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer DNMMPQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer ejfBZ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final InterfaceC58261yxu QXDzTk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r10v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull java.lang.String str, @NotNull final java.util.List<TokenAsset> list, final boolean z, final boolean z2, final boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.ejfBZ.OLrzqt(str, false);
        final Function1 function1 = new Function1() { // from class: o.bnY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.AEQbTJ, list, z, z2, z3, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.QXDzTk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu AEQbTJ(C10407bnq c10407bnq, java.util.List list, boolean z, boolean z2, boolean z3, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c10407bnq.KWHzl(abstractC12782ctV, (java.util.List<TokenAsset>) list, z, z2, z3);
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final java.util.List<TokenAsset> list, final boolean z, boolean z2, final boolean z3) {
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault2 = copydefault(abstractC12782ctV);
        if (z) {
            abstractC58260yxtCopydefault = AEQbTJ(abstractC12782ctV, list, z2);
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
        }
        final Function2 function2 = new Function2() { // from class: o.bph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10407bnq.copydefault((java.lang.Boolean) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtCopydefault2, abstractC58260yxtCopydefault, new InterfaceC58223yxI() { // from class: o.bpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C10407bnq.DbNXlk(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.EZpvd(this.EZpvd, abstractC12782ctV, (java.lang.Boolean) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.bpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.QIZEnU(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(z, list, this, z3, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.bpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.Ufzxmz(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.lang.Boolean DbNXlk(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Boolean) function2.invoke(obj, obj2);
    }

    public static final java.lang.Boolean copydefault(java.lang.Boolean bool, java.lang.Boolean bool2) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        return java.lang.Boolean.valueOf(bool.booleanValue() || bool2.booleanValue());
    }

    public static final InterfaceC58261yxu QIZEnU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C10407bnq c10407bnq, AbstractC12782ctV abstractC12782ctV, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            return c10407bnq.ejfBZ.OLrzqt(abstractC12782ctV.DbNXlk(), false);
        }
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(abstractC12782ctV);
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    public static final InterfaceC58261yxu Ufzxmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(boolean z, java.util.List list, C10407bnq c10407bnq, boolean z2, AbstractC12782ctV abstractC12782ctV) {
        C10525bqB c10525bqBEZpvd;
        java.util.HashMap<java.lang.String, TokenAsset> map;
        C10525bqB c10525bqBEZpvd2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (z) {
            if (list.isEmpty()) {
                c10407bnq.djBIcL.KWHzl(abstractC12782ctV.DbNXlk(), new java.util.HashMap<>());
                return c10407bnq.valueOf.EZpvd(abstractC12782ctV.DbNXlk());
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, TokenAsset>> map2 = new java.util.HashMap<>();
            java.util.Iterator it = list.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                TokenAsset tokenAsset = (TokenAsset) it.next();
                if (!z3 && C33129mqd.AEQbTJ(tokenAsset.getCoinAmount(), "0")) {
                    z3 = true;
                }
                if (map2.get(java.lang.Long.valueOf(tokenAsset.getCoinId())) == null) {
                    map = new java.util.HashMap<>();
                    map2.put(java.lang.Long.valueOf(tokenAsset.getCoinId()), map);
                } else {
                    map = map2.get(java.lang.Long.valueOf(tokenAsset.getCoinId()));
                }
                if (map != null) {
                    map.put(tokenAsset.getAddress(), tokenAsset);
                }
                if (tokenAsset.getVoucherToken()) {
                    c10407bnq.AEQbTJ(tokenAsset.getCoinId());
                } else {
                    c10407bnq.EZpvd(tokenAsset.getCoinId());
                }
                C10854bwM c10854bwMKWHzl = c10407bnq.gEmmrt().KWHzl(java.lang.Long.valueOf(tokenAsset.getCoinId()));
                if (c10854bwMKWHzl != null) {
                    WalletCoinAssetEntity walletCoinAssetEntityAkhnZx = C10525bqB.Companion.AEQbTJ(tokenAsset, c10854bwMKWHzl, abstractC12782ctV).AkhnZx();
                    if (!z2 && (c10525bqBEZpvd2 = abstractC12782ctV.EZpvd(tokenAsset.getCoinId(), tokenAsset.getAddress())) != null) {
                        java.lang.String strSSMYrx = c10525bqBEZpvd2.sSMYrx();
                        if (strSSMYrx == null) {
                            strSSMYrx = "";
                        }
                        walletCoinAssetEntityAkhnZx.setUnPnl(strSSMYrx);
                        java.lang.String strGHZMYf = c10525bqBEZpvd2.gHZMYf();
                        if (strGHZMYf == null) {
                            strGHZMYf = "";
                        }
                        walletCoinAssetEntityAkhnZx.setUnPnlYield(strGHZMYf);
                        java.lang.String strZsXlph = c10525bqBEZpvd2.zsXlph();
                        if (strZsXlph == null) {
                            strZsXlph = "";
                        }
                        walletCoinAssetEntityAkhnZx.setSpotBalance(strZsXlph);
                        java.lang.String strZLjUOn = c10525bqBEZpvd2.zLjUOn();
                        if (strZLjUOn == null) {
                            strZLjUOn = "";
                        }
                        walletCoinAssetEntityAkhnZx.setHoldAvgPrice(strZLjUOn);
                    }
                    arrayList.add(walletCoinAssetEntityAkhnZx);
                }
            }
            if (z3) {
                c10407bnq.valueOf(abstractC12782ctV.DbNXlk());
            }
            c10407bnq.djBIcL.KWHzl(abstractC12782ctV.DbNXlk(), map2);
            AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtOLrzqt = c10407bnq.valueOf.OLrzqt(abstractC12782ctV.DbNXlk(), arrayList);
            final Function1 function1 = new Function1() { // from class: o.boj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.fARcdN((java.util.List) obj);
                }
            };
            InterfaceC58261yxu interfaceC58261yxuCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.bon
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.QDqgQU(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC58261yxuCopydefault);
            return interfaceC58261yxuCopydefault;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TokenAsset tokenAsset2 = (TokenAsset) it2.next();
            c10407bnq.djBIcL.OLrzqt(abstractC12782ctV.DbNXlk(), tokenAsset2.getCoinId(), tokenAsset2);
            if (tokenAsset2.getVoucherToken()) {
                c10407bnq.AEQbTJ(tokenAsset2.getCoinId());
            } else {
                c10407bnq.EZpvd(tokenAsset2.getCoinId());
            }
            C10854bwM c10854bwMKWHzl2 = c10407bnq.gEmmrt().KWHzl(java.lang.Long.valueOf(tokenAsset2.getCoinId()));
            if (c10854bwMKWHzl2 != null) {
                WalletCoinAssetEntity walletCoinAssetEntityAkhnZx2 = C10525bqB.Companion.AEQbTJ(tokenAsset2, c10854bwMKWHzl2, abstractC12782ctV).AkhnZx();
                if (!z2 && (c10525bqBEZpvd = abstractC12782ctV.EZpvd(tokenAsset2.getCoinId(), tokenAsset2.getAddress())) != null) {
                    java.lang.String strSSMYrx2 = c10525bqBEZpvd.sSMYrx();
                    if (strSSMYrx2 == null) {
                        strSSMYrx2 = "";
                    }
                    walletCoinAssetEntityAkhnZx2.setUnPnl(strSSMYrx2);
                    java.lang.String strGHZMYf2 = c10525bqBEZpvd.gHZMYf();
                    if (strGHZMYf2 == null) {
                        strGHZMYf2 = "";
                    }
                    walletCoinAssetEntityAkhnZx2.setUnPnlYield(strGHZMYf2);
                }
                arrayList2.add(walletCoinAssetEntityAkhnZx2);
            }
        }
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtDjBIcL = c10407bnq.valueOf.djBIcL(arrayList2);
        final Function1 function12 = new Function1() { // from class: o.boo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.getFieldNames((java.util.List) obj);
            }
        };
        InterfaceC58261yxu interfaceC58261yxuCopydefault2 = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.bor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.ULRxlR(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC58261yxuCopydefault2);
        return interfaceC58261yxuCopydefault2;
    }

    public static final java.lang.Integer QDqgQU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer fARcdN(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer ULRxlR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer getFieldNames(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public final AbstractC58260yxt<java.lang.Boolean> copydefault(AbstractC12782ctV abstractC12782ctV) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Map<java.lang.String, java.util.List<java.lang.Long>> mapDLWbHP = abstractC12782ctV.DLWbHP();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C10854bwM c10854bwM : abstractC12782ctV.RKDWNf()) {
            if (c10854bwM.giSNqX()) {
                java.lang.String strFJNWhG = c10854bwM.fJNWhG();
                java.lang.Object arrayList3 = linkedHashMap.get(strFJNWhG);
                if (arrayList3 == null) {
                    arrayList3 = new java.util.ArrayList();
                    linkedHashMap.put(strFJNWhG, arrayList3);
                }
                ((java.util.List) arrayList3).add(java.lang.Long.valueOf(c10854bwM.AhwBna()));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.util.List<java.lang.Long> list = mapDLWbHP.get(entry.getKey());
            if (list != null) {
                java.util.Iterator it = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa((java.lang.Iterable) entry.getValue())).iterator();
                while (it.hasNext()) {
                    arrayList2.add(new WalletOpenedCoinEntity(abstractC12782ctV.DbNXlk(), ((java.lang.Number) it.next()).longValue()));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(this.valueOf.OLrzqt(arrayList2));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (C10854bwM c10854bwM2 : abstractC12782ctV.iZzfmt()) {
            if (c10854bwM2.giSNqX()) {
                java.lang.String strFJNWhG2 = c10854bwM2.fJNWhG();
                java.lang.Object arrayList5 = linkedHashMap2.get(strFJNWhG2);
                if (arrayList5 == null) {
                    arrayList5 = new java.util.ArrayList();
                    linkedHashMap2.put(strFJNWhG2, arrayList5);
                }
                ((java.util.List) arrayList5).add(java.lang.Long.valueOf(c10854bwM2.AhwBna()));
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            java.util.List<java.lang.Long> list2 = mapDLWbHP.get(entry2.getKey());
            if (list2 != null) {
                java.util.Iterator it2 = CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list2, (java.lang.Iterable) CollectionsKt___CollectionsKt.OqFWZa((java.lang.Iterable) entry2.getValue())).iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new WalletClosedCoinEntity(abstractC12782ctV.DbNXlk(), ((java.lang.Number) it2.next()).longValue()));
                }
            }
        }
        if (!arrayList4.isEmpty()) {
            arrayList.add(this.valueOf.KWHzl(arrayList4));
        }
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
        final Function1 function1 = new Function1() { // from class: o.bqn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.fIwbmz((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bqs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.RVsVBY(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Boolean RVsVBY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean fIwbmz(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Boolean.valueOf(!list.isEmpty());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v34, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, o.bwM] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, com.okinc.business.defi.biz.model.ChainAddress] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, o.bwM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58260yxt<java.lang.Boolean> AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.util.List<TokenAsset> list, boolean z) {
        boolean z2;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        boolean z3 = false;
        if (SPUtils.getBoolean("has_default_address_" + abstractC12782ctV.DbNXlk(), false, "wallet_biz_sp_file")) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(java.lang.Boolean.FALSE);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }
        SPUtils.commit("has_default_address_" + abstractC12782ctV.DbNXlk(), java.lang.Boolean.TRUE, "wallet_biz_sp_file");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TokenAsset tokenAsset = (TokenAsset) it.next();
            ?? KWHzl2 = gEmmrt().KWHzl(java.lang.Long.valueOf(tokenAsset.getCoinId()));
            if (KWHzl2 != 0) {
                objectRef.element = KWHzl2;
                if (KWHzl2.DsrFlB()) {
                    java.lang.String coinAmount = tokenAsset.getCoinAmount();
                    TokenAsset tokenAsset2 = (TokenAsset) map.get(java.lang.Long.valueOf(tokenAsset.getCoinId()));
                    if (C33129mqd.AEQbTJ(coinAmount, tokenAsset2 != null ? tokenAsset2.getCoinAmount() : null)) {
                        map.put(java.lang.Long.valueOf(tokenAsset.getCoinId()), tokenAsset);
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        for (Map.Entry entry : map.entrySet()) {
            ?? AddressFromAddress$default = AbstractC12782ctV.addressFromAddress$default(abstractC12782ctV, ((TokenAsset) entry.getValue()).getAddress(), null, 2, null);
            if (AddressFromAddress$default == 0) {
                z2 = z3;
            } else {
                objectRef2.element = AddressFromAddress$default;
                if (z) {
                    ?? KWHzl3 = gEmmrt().KWHzl(java.lang.Long.valueOf(((TokenAsset) entry.getValue()).getCoinId()));
                    if (KWHzl3 != 0) {
                        objectRef.element = KWHzl3;
                        cOG cogValueOf = this.ejfBZ.valueOf();
                        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                        C10854bwM c10854bwM = (C10854bwM) objectRef.element;
                        AbstractC58260yxt<java.lang.Long> abstractC58260yxtKWHzl = cogValueOf.KWHzl(strDbNXlk, c10854bwM != null ? c10854bwM.AEQbTJ() : 0L, ((ChainAddress) objectRef2.element).getAddress(), ((ChainAddress) objectRef2.element).getAddressType());
                        final Function1 function1 = new Function1() { // from class: o.bpO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C10407bnq.KWHzl((java.lang.Long) obj);
                            }
                        };
                        arrayList.add(abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bpM
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C10407bnq.DGgnkA(function1, obj);
                            }
                        }));
                        AbstractC58260yxt abstractC58260yxtRxSingle$default = RxSingleKt.rxSingle$default(null, new WalletAssetManager$updateDefaultAddress$2$2(this, abstractC12782ctV, objectRef, objectRef2, null), 1, null);
                        final Function1 function12 = new Function1() { // from class: o.bpN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return C10407bnq.AuCTel((java.util.List) obj);
                            }
                        };
                        arrayList.add(abstractC58260yxtRxSingle$default.copydefault(new InterfaceC58229yxO() { // from class: o.bpP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj) {
                                return C10407bnq.DaRZkR(function12, obj);
                            }
                        }));
                        z2 = false;
                    }
                } else {
                    C10854bwM c10854bwMKWHzl = gEmmrt().KWHzl(java.lang.Long.valueOf(((TokenAsset) entry.getValue()).getCoinId()));
                    z2 = false;
                    arrayList.add(abstractC12782ctV.OLrzqt(c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 0L, ((ChainAddress) objectRef2.element).getAddress(), ((ChainAddress) objectRef2.element).getAddressType()).OLrzqt(0));
                }
            }
            z3 = z2;
        }
        if (z && (!map.isEmpty())) {
            arrayList.add(this.ejfBZ.AhwBna().OLrzqt(abstractC12782ctV.DbNXlk(), WalletSyncOperation.UpdateDefaultAddress));
        }
        AbstractC58260yxt abstractC58260yxtKWHzl2 = C11607cUn.KWHzl(arrayList);
        final Function1 function13 = new Function1() { // from class: o.bpL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.fJNWhG((java.util.List) obj);
            }
        };
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtCopydefault2 = abstractC58260yxtKWHzl2.copydefault(new InterfaceC58229yxO() { // from class: o.bpU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.RKcVTr(function13, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtCopydefault2);
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer DGgnkA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer KWHzl(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return 0;
    }

    public static final java.lang.Integer AuCTel(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return 0;
    }

    public static final java.lang.Integer DaRZkR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Boolean RKcVTr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean fJNWhG(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Boolean.valueOf(!list.isEmpty());
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> djBIcL(AbstractC12782ctV abstractC12782ctV, java.util.List<Portfolio> list) {
        if (list == null) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10527bqD((Portfolio) it.next(), abstractC12782ctV).EZpvd());
        }
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtEZpvd = this.ejfBZ.AhwBna().EZpvd(abstractC12782ctV.DbNXlk(), arrayList);
        final Function1 function1 = new Function1() { // from class: o.bnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.uzCIH((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.UhxbNG(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer UhxbNG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer uzCIH(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.Integer> */
    public final AbstractC58260yxt<java.lang.Integer> AhwBna(AbstractC12782ctV abstractC12782ctV, java.util.List<NftBean> list) {
        if (list == null) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C10528bqE.Companion.EZpvd((NftBean) it.next(), abstractC12782ctV).EZpvd());
        }
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtAEQbTJ = this.ejfBZ.AhwBna().AEQbTJ(abstractC12782ctV.DbNXlk(), arrayList);
        final Function1 function1 = new Function1() { // from class: o.bow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.hDKMBd((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.boz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.TarCU(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final java.lang.Integer TarCU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer hDKMBd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public final java.util.List<C10525bqB> KWHzl(java.util.List<C10525bqB> list, boolean z, int i, java.util.Map<java.lang.Object, ? extends java.util.List<C10525bqB>> map) {
        java.lang.Object objValueOf;
        java.util.List<C10525bqB> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10525bqB c10525bqB : list) {
            if (i == 1 && c10525bqB.KWHzl().giSNqX()) {
                objValueOf = c10525bqB.KWHzl().fJNWhG();
            } else {
                objValueOf = (i == 2 && c10525bqB.KWHzl().dxcTrN()) ? java.lang.Long.valueOf(c10525bqB.KWHzl().AhwBna()) : null;
            }
            if (objValueOf == null) {
                arrayList.add(c10525bqB);
            } else {
                C10525bqB c10525bqBFetchVPNInfo = c10525bqB.fetchVPNInfo();
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(objValueOf);
                if (num == null) {
                    linkedHashMap.put(objValueOf, java.lang.Integer.valueOf(arrayList.size()));
                    if (z && (list2 = map.get(objValueOf)) != null && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list2.size()), 1)) {
                        c10525bqBFetchVPNInfo.DbNXlk();
                    }
                    arrayList.add(c10525bqBFetchVPNInfo);
                } else {
                    ((C10525bqB) arrayList.get(num.intValue())).EZpvd(c10525bqBFetchVPNInfo);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<C10854bwM> AEQbTJ(@NotNull final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        WalletType walletTypeQwvEab = abstractC12782ctV.QwvEab();
        int[] iArr = StateListAnimator.AEQbTJ;
        switch (iArr[walletTypeQwvEab.ordinal()]) {
            case 1:
                return gEmmrt().AYXKKw();
            case 2:
                return gEmmrt().fIwbmz();
            case 3:
            case 5:
            case 6:
                return gEmmrt().valueOf(abstractC12782ctV.flVtFt());
            case 4:
                return gEmmrt().AEQbTJ(new Function1() { // from class: o.boX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(C10407bnq.EZpvd(abstractC12782ctV, ((java.lang.Long) obj).longValue()));
                    }
                });
            case 7:
                if (abstractC12782ctV.DarRvM() == WalletType.TrackingWallet) {
                    return gEmmrt().AYXKKw(abstractC12782ctV.flVtFt());
                }
                return gEmmrt().valueOf(abstractC12782ctV.flVtFt());
            case 8:
                int i = iArr[abstractC12782ctV.DarRvM().ordinal()];
                if (i == 1) {
                    return gEmmrt().getNewProxyInstance();
                }
                if (i == 2) {
                    return gEmmrt().fARcdN();
                }
                if (i == 3) {
                    return gEmmrt().AYXKKw(abstractC12782ctV.flVtFt());
                }
                if (i == 4) {
                    return gEmmrt().EZpvd(new Function1() { // from class: o.boY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return java.lang.Boolean.valueOf(C10407bnq.KWHzl(abstractC12782ctV, ((java.lang.Long) obj).longValue()));
                        }
                    });
                }
            default:
                return null;
        }
    }

    public static final boolean EZpvd(AbstractC12782ctV abstractC12782ctV, long j) {
        return abstractC12782ctV.AhwBna(java.lang.Long.valueOf(j));
    }

    public static final boolean KWHzl(AbstractC12782ctV abstractC12782ctV, long j) {
        return abstractC12782ctV.AhwBna(java.lang.Long.valueOf(j));
    }

    public final AbstractC58185ywX<java.util.List<AssetAll>> copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, final int i) {
        AbstractC58185ywX abstractC58185ywXCopydefault;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int i2 = 0;
        C10856bwO.copydefault(this.AEQbTJ, 0, "loadAsset start, walletIds: " + list + ", type: " + i);
        if (list.size() > 50) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = list.size() / 2;
            for (java.lang.Object obj : list) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str4 = (java.lang.String) obj;
                if (i2 < size) {
                    arrayList.add(str4);
                } else {
                    arrayList2.add(str4);
                }
                i2++;
            }
            AbstractC58185ywX abstractC58185ywXCopydefault2 = this.fetchVPNInfo.EZpvd(str, str2, str3, (java.util.List<java.lang.String>) arrayList, this.fJNWhG.AhwBna(), (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? null : java.lang.Boolean.valueOf(z), (32 & 128) != 0 ? 0 : i).copydefault(yBP.AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
            AbstractC58185ywX abstractC58185ywXCopydefault3 = this.fetchVPNInfo.EZpvd(str, str2, str3, (java.util.List<java.lang.String>) arrayList2, this.fJNWhG.AhwBna(), (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? null : java.lang.Boolean.valueOf(z), (32 & 128) != 0 ? 0 : i).copydefault(yBP.AEQbTJ());
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault3, "");
            final Function2 function2 = new Function2() { // from class: o.bnK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C10407bnq.EZpvd((ResponseData) obj2, (ResponseData) obj3);
                }
            };
            abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(abstractC58185ywXCopydefault2, abstractC58185ywXCopydefault3, new InterfaceC58223yxI() { // from class: o.bnN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                    return C10407bnq.AYXKKw(function2, obj2, obj3);
                }
            });
        } else {
            abstractC58185ywXCopydefault = this.fetchVPNInfo.EZpvd(str, str2, str3, (java.util.List<java.lang.String>) list, this.fJNWhG.AhwBna(), (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? null : java.lang.Boolean.valueOf(z), (32 & 128) != 0 ? 0 : i).copydefault(yBP.AEQbTJ());
        }
        final Function1 function1 = new Function1() { // from class: o.bnL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C10407bnq.AEQbTJ(this.EZpvd, i, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.bnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C10407bnq.QSLkRj(function1, obj2);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        AbstractC58185ywX<ResponseData<java.util.List<ValuationCurrencyBean>>> abstractC58185ywXOLrzqt = this.AhwBna.OLrzqt();
        final Function1 function12 = new Function1() { // from class: o.bnR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C10407bnq.gEmmrt((java.lang.Throwable) obj2);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<ValuationCurrencyBean>>> abstractC58185ywXDjBIcL = abstractC58185ywXOLrzqt.djBIcL(new InterfaceC58229yxO() { // from class: o.bnT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C10407bnq.USBtdM(function12, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXDjBIcL, "");
        if (C54864xYd.AEQbTJ.djBIcL()) {
            final Function1 function13 = new Function1() { // from class: o.bnS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C10407bnq.djBIcL(this.KWHzl, (ResponseData) obj2);
                }
            };
            AbstractC58185ywX<java.util.List<AssetAll>> abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bnW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C10407bnq.QwvEab(function13, obj2);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        final Function2 function22 = new Function2() { // from class: o.bnX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return C10407bnq.AEQbTJ(this.KWHzl, (ResponseData) obj2, (ResponseData) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(abstractC58185ywXKWHzl, abstractC58185ywXDjBIcL, new InterfaceC58223yxI() { // from class: o.bnV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                return C10407bnq.valueOf(function22, obj2, obj3);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.bnO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C10407bnq.AhwBna(this.AEQbTJ, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX<java.util.List<AssetAll>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bnM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C10407bnq.dUDNAs(function14, obj2);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final InterfaceC60096zvd QSLkRj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C10407bnq c10407bnq, int i, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.HashMap map = new java.util.HashMap();
        java.util.List<AssetAll> list = (java.util.List) responseData.getData();
        if (list != null) {
            for (AssetAll assetAll : list) {
                java.util.ArrayList<TokenAsset> tokens = assetAll.getTokens();
                if (tokens != null) {
                    for (TokenAsset tokenAsset : tokens) {
                        if (!C10954byG.EZpvd.valueOf().fJNWhG().KWHzl().containsKey(java.lang.Long.valueOf(tokenAsset.getCoinId()))) {
                            if (map.get(assetAll.getAccountId()) == null) {
                                map.put(assetAll.getAccountId(), new java.util.ArrayList());
                            }
                            java.util.ArrayList arrayList = (java.util.ArrayList) map.get(assetAll.getAccountId());
                            if (arrayList != null) {
                                arrayList.add(java.lang.Long.valueOf(tokenAsset.getCoinId()));
                            }
                        }
                    }
                }
                java.lang.String str = c10407bnq.AEQbTJ;
                java.lang.String accountId = assetAll.getAccountId();
                java.util.ArrayList<TokenAsset> tokens2 = assetAll.getTokens();
                C10856bwO.copydefault(str, 0, "loadAsset finish, walletId: " + accountId + ", type: " + i + ", size: " + (tokens2 != null ? java.lang.Integer.valueOf(tokens2.size()) : null));
            }
        }
        if (!map.isEmpty()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = c10407bnq.AkhnZx.AYXKKw().OLrzqt(false, (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Long>>) map);
            final Function1 function1 = new Function1() { // from class: o.bpS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.EZpvd(responseData, (java.lang.Boolean) obj);
                }
            };
            return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bpR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.QVsKAR(function1, obj);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(responseData);
    }

    public static final ResponseData QVsKAR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 63, null);
    }

    public static final java.util.List QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List djBIcL(C10407bnq c10407bnq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c10407bnq.KWHzl((ResponseData<java.util.List<AssetAll>>) responseData);
    }

    public static final ResponseData valueOf(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final ResponseData AEQbTJ(C10407bnq c10407bnq, ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        c10407bnq.EZpvd((ResponseData<java.util.List<ValuationCurrencyBean>>) responseData2);
        return responseData;
    }

    public static final java.util.List dUDNAs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List AhwBna(C10407bnq c10407bnq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c10407bnq.KWHzl((ResponseData<java.util.List<AssetAll>>) responseData);
    }

    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.util.List<com.okinc.business.defi.biz.net.bean.AssetAll>> */
    public final AbstractC58185ywX<java.util.List<AssetAll>> KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull java.util.List<java.lang.Long> list2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> abstractC58185ywXEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (list.size() > 50) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = list.size() / 2;
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str3 = (java.lang.String) obj;
                if (i < size) {
                    arrayList.add(str3);
                } else {
                    arrayList2.add(str3);
                }
                i++;
            }
            AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> abstractC58185ywXEZpvd2 = this.fetchVPNInfo.EZpvd(str, str2, arrayList, list2, this.fJNWhG.AhwBna(), z);
            AbstractC58185ywX<ResponseData<java.util.List<AssetAll>>> abstractC58185ywXEZpvd3 = this.fetchVPNInfo.EZpvd(str, str2, arrayList2, list2, this.fJNWhG.AhwBna(), z);
            final Function2 function2 = new Function2() { // from class: o.bqz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return C10407bnq.KWHzl((ResponseData) obj2, (ResponseData) obj3);
                }
            };
            abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(abstractC58185ywXEZpvd2, abstractC58185ywXEZpvd3, new InterfaceC58223yxI() { // from class: o.bns
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                    return C10407bnq.djBIcL(function2, obj2, obj3);
                }
            });
        } else {
            abstractC58185ywXEZpvd = this.fetchVPNInfo.EZpvd(str, str2, list, list2, this.fJNWhG.AhwBna(), z);
        }
        if (C54864xYd.AEQbTJ.djBIcL()) {
            final Function1 function1 = new Function1() { // from class: o.bnz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C10407bnq.DbNXlk(this.AEQbTJ, (ResponseData) obj2);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bnx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return C10407bnq.aUsmxb(function1, obj2);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<ResponseData<java.util.List<ValuationCurrencyBean>>> abstractC58185ywXOLrzqt = this.AhwBna.OLrzqt();
        final Function2 function22 = new Function2() { // from class: o.bny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return C10407bnq.OLrzqt(this.KWHzl, (ResponseData) obj2, (ResponseData) obj3);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(abstractC58185ywXEZpvd, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.bnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj2, java.lang.Object obj3) {
                return C10407bnq.isConnected(function22, obj2, obj3);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bnw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C10407bnq.values(this.AEQbTJ, (ResponseData) obj2);
            }
        };
        AbstractC58185ywX<java.util.List<AssetAll>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C10407bnq.UlJrfe(function12, obj2);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ2);
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData djBIcL(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final java.util.List aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List DbNXlk(C10407bnq c10407bnq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c10407bnq.KWHzl((ResponseData<java.util.List<AssetAll>>) responseData);
    }

    public static final ResponseData isConnected(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (ResponseData) function2.invoke(obj, obj2);
    }

    public static final ResponseData OLrzqt(C10407bnq c10407bnq, ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        c10407bnq.EZpvd((ResponseData<java.util.List<ValuationCurrencyBean>>) responseData2);
        return responseData;
    }

    public static final java.util.List UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List values(C10407bnq c10407bnq, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        return c10407bnq.KWHzl((ResponseData<java.util.List<AssetAll>>) responseData);
    }

    public static final void AEQbTJ(C10407bnq c10407bnq, AbstractC12782ctV abstractC12782ctV, SegWitInfoBeanRes segWitInfoBeanRes) {
        int value;
        final int value2;
        final java.lang.Long lAEQbTJ = segWitInfoBeanRes.AEQbTJ();
        java.lang.Integer numKWHzl = segWitInfoBeanRes.KWHzl();
        AddressType addressType = AddressType.P2SHCommonType;
        int value3 = addressType.getValue();
        if (numKWHzl != null && numKWHzl.intValue() == value3) {
            value = addressType.getValue();
            value2 = AddressType.P2SHType.getValue();
        } else {
            value = AddressType.P2SHType.getValue();
            value2 = addressType.getValue();
        }
        C10854bwM c10854bwMKWHzl = c10407bnq.gEmmrt().KWHzl(lAEQbTJ);
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwMKWHzl != null ? c10854bwMKWHzl.AEQbTJ() : 0L, null, 2, null);
        if (chainAddressAddressFromChainId$default != null && chainAddressAddressFromChainId$default.getAddressType() == value2) {
            java.lang.String address = "";
            java.lang.String address2 = "";
            for (ChainAddress chainAddress : abstractC12782ctV.gGvvIC()) {
                long coinId = chainAddress.getCoinId();
                if (lAEQbTJ != null && coinId == lAEQbTJ.longValue() && chainAddress.getAddressType() == AddressType.Legacy.getValue()) {
                    address2 = chainAddress.getAddress();
                }
                long coinId2 = chainAddress.getCoinId();
                if (lAEQbTJ != null && coinId2 == lAEQbTJ.longValue() && chainAddress.getAddressType() == value) {
                    address = chainAddress.getAddress();
                }
            }
            if (address.length() > 0) {
                abstractC12782ctV.OLrzqt(lAEQbTJ, address, value);
            } else {
                abstractC12782ctV.OLrzqt(lAEQbTJ, address2, AddressType.Legacy.getValue());
            }
        }
        C56406yEe.AEQbTJ(abstractC12782ctV.gGvvIC(), new Function1() { // from class: o.bql
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10407bnq.EZpvd(lAEQbTJ, value2, (ChainAddress) obj));
            }
        });
        abstractC12782ctV.OLrzqt(new Function1() { // from class: o.bqo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.EZpvd(lAEQbTJ, value2, (java.util.ArrayList) obj);
            }
        });
    }

    public static final boolean EZpvd(java.lang.Long l, int i, ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return l != null && chainAddress.getCoinId() == l.longValue() && chainAddress.getAddressType() == i;
    }

    public static final java.util.ArrayList EZpvd(final java.lang.Long l, final int i, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C56406yEe.AEQbTJ(arrayList, new Function1() { // from class: o.bqg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10407bnq.copydefault(l, i, (ChainAddress) obj));
            }
        });
        return arrayList;
    }

    public static final boolean copydefault(java.lang.Long l, int i, ChainAddress chainAddress) {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        return l != null && chainAddress.getCoinId() == l.longValue() && chainAddress.getAddressType() == i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.rox.unwrapResponseData$default(o.ywX, kotlin.jvm.functions.Function1, int, java.lang.Object):o.ywX */
    public final AbstractC58185ywX<Unit> EZpvd(@NotNull final AbstractC12782ctV abstractC12782ctV) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        AbstractC58185ywX<Unit> abstractC58185ywXOLrzqt;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        C10854bwM c10854bwMCopydefault = gEmmrt().copydefault();
        java.lang.Long lValueOf = c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.AhwBna()) : null;
        C10854bwM c10854bwMEjfBZ = gEmmrt().ejfBZ();
        java.lang.Long lValueOf2 = c10854bwMEjfBZ != null ? java.lang.Long.valueOf(c10854bwMEjfBZ.AhwBna()) : null;
        java.util.ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctV.gGvvIC();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListGGvvIC) {
            ChainAddress chainAddress = (ChainAddress) obj;
            long coinId = chainAddress.getCoinId();
            if (lValueOf != null && coinId == lValueOf.longValue() && (chainAddress.getAddressType() == AddressType.P2SHType.getValue() || chainAddress.getAddressType() == AddressType.P2SHCommonType.getValue())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<ChainAddress> arrayListGGvvIC2 = abstractC12782ctV.gGvvIC();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayListGGvvIC2) {
            ChainAddress chainAddress2 = (ChainAddress) obj2;
            long coinId2 = chainAddress2.getCoinId();
            if (lValueOf2 != null && coinId2 == lValueOf2.longValue() && (chainAddress2.getAddressType() == AddressType.P2SHType.getValue() || chainAddress2.getAddressType() == AddressType.P2SHCommonType.getValue())) {
                arrayList2.add(obj2);
            }
        }
        if ((C8322bAY.KWHzl.EZpvd(abstractC12782ctV.DbNXlk()) && arrayList.size() < 2 && arrayList2.size() < 2) || !abstractC12782ctV.AubY()) {
            abstractC58185ywXOLrzqt = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        } else {
            java.util.ArrayList<ChainAddress> arrayListGGvvIC3 = abstractC12782ctV.gGvvIC();
            java.util.ArrayList<ChainAddress> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : arrayListGGvvIC3) {
                ChainAddress chainAddress3 = (ChainAddress) obj3;
                long coinId3 = chainAddress3.getCoinId();
                if (lValueOf == null || coinId3 != lValueOf.longValue()) {
                    long coinId4 = chainAddress3.getCoinId();
                    if (lValueOf2 != null && coinId4 == lValueOf2.longValue()) {
                    }
                }
                if (chainAddress3.getAddressType() == AddressType.P2SHType.getValue() || chainAddress3.getAddressType() == AddressType.P2SHCommonType.getValue()) {
                    arrayList3.add(obj3);
                }
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            for (ChainAddress chainAddress4 : arrayList3) {
                arrayList4.add(new SegWitInfoBean(abstractC12782ctV.DbNXlk(), java.lang.Long.valueOf(chainAddress4.getCoinId()), chainAddress4.getAddress(), java.lang.Integer.valueOf(chainAddress4.getAddressType())));
            }
            if (arrayList4.isEmpty()) {
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                AddressType addressType = AddressType.P2SHCommonType;
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.gEmmrt(new SegWitInfoBeanRes(strDbNXlk, lValueOf, (java.lang.String) null, java.lang.Integer.valueOf(addressType.getValue()), 4, (DefaultConstructorMarker) null), new SegWitInfoBeanRes(abstractC12782ctV.DbNXlk(), lValueOf2, (java.lang.String) (0 == true ? 1 : 0), java.lang.Integer.valueOf(addressType.getValue()), 4, (DefaultConstructorMarker) null)));
                final Function1 function1 = new Function1() { // from class: o.boO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return C10407bnq.OLrzqt(abstractC12782ctV, this, this, (java.util.List) obj4);
                    }
                };
                abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bpb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj4) {
                        return C10407bnq.OTwTPd(function1, obj4);
                    }
                }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(Unit.INSTANCE));
            } else {
                java.util.Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    java.lang.Integer numCopydefault = ((SegWitInfoBean) it.next()).copydefault();
                    int value = AddressType.P2SHCommonType.getValue();
                    if (numCopydefault == null || numCopydefault.intValue() != value) {
                        if (arrayList4.size() == 4) {
                            abstractC58185ywXKWHzl = C43423rox.unwrapResponseData$default(this.fetchVPNInfo.gEmmrt(arrayList4), (Function1) null, 1, (java.lang.Object) null);
                        } else {
                            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
                        }
                        final Function1 function12 = new Function1() { // from class: o.boO
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj4) {
                                return C10407bnq.OLrzqt(abstractC12782ctV, this, this, (java.util.List) obj4);
                            }
                        };
                        abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bpb
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58229yxO
                            public final java.lang.Object apply(java.lang.Object obj4) {
                                return C10407bnq.OTwTPd(function12, obj4);
                            }
                        }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(Unit.INSTANCE));
                    }
                }
                java.lang.String strDbNXlk2 = abstractC12782ctV.DbNXlk();
                AddressType addressType2 = AddressType.P2SHCommonType;
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.gEmmrt(new SegWitInfoBeanRes(strDbNXlk2, lValueOf, (java.lang.String) null, java.lang.Integer.valueOf(addressType2.getValue()), 4, (DefaultConstructorMarker) null), new SegWitInfoBeanRes(abstractC12782ctV.DbNXlk(), lValueOf2, (java.lang.String) (0 == true ? 1 : 0), java.lang.Integer.valueOf(addressType2.getValue()), 4, (DefaultConstructorMarker) null)));
                final Function1 function122 = new Function1() { // from class: o.boO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        return C10407bnq.OLrzqt(abstractC12782ctV, this, this, (java.util.List) obj4);
                    }
                };
                abstractC58185ywXOLrzqt = abstractC58185ywXKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bpb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj4) {
                        return C10407bnq.OTwTPd(function122, obj4);
                    }
                }).OLrzqt((InterfaceC60096zvd) AbstractC58185ywX.KWHzl(Unit.INSTANCE));
            }
        }
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXOLrzqt, "");
        return abstractC58185ywXOLrzqt;
    }

    public static final InterfaceC58261yxu OTwTPd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(AbstractC12782ctV abstractC12782ctV, C10407bnq c10407bnq, C10407bnq c10407bnq2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            C8322bAY.KWHzl.OLrzqt(abstractC12782ctV.DbNXlk());
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AEQbTJ(c10407bnq2, abstractC12782ctV, (SegWitInfoBeanRes) it.next());
            }
            AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt = c10407bnq.ejfBZ.AhwBna().OLrzqt(abstractC12782ctV, "WalletAssetManager");
            AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtEZpvd = c10407bnq.ejfBZ.AhwBna().EZpvd(abstractC12782ctV);
            final Function1 function1 = new Function1() { // from class: o.bps
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.DbNXlk((java.util.List) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(yDY.gEmmrt(abstractC58260yxtOLrzqt, abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bpr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.DGUQLI(function1, obj);
                }
            })));
            final Function1 function12 = new Function1() { // from class: o.bpu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.isConnected((java.util.List) obj);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.bpt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.DsrFlB(function12, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(Unit.INSTANCE);
    }

    public static final Unit DGUQLI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit DbNXlk(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public static final Unit DsrFlB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit isConnected(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.lang.Long> OLrzqt(@NotNull final AbstractC12782ctV abstractC12782ctV) {
        AbstractC58185ywX abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        final C10854bwM c10854bwMAhwBna = gEmmrt().AhwBna();
        if (c10854bwMAhwBna == null) {
            C10856bwO.copydefault(this.AEQbTJ, 0, "refreshEosState return");
            AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(0L);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
            return abstractC58185ywXKWHzl2;
        }
        if (abstractC12782ctV.AubY() || (abstractC12782ctV.igXuih() && abstractC12782ctV.AwvSrB())) {
            C13852daR c13852daRODWQjV = abstractC12782ctV.ODWQjV();
            java.lang.String strCopydefault = c13852daRODWQjV != null ? c13852daRODWQjV.copydefault() : null;
            if (strCopydefault == null || strCopydefault.length() == 0) {
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
            } else {
                C13934dbu c13934dbu = this.fetchVPNInfo;
                java.lang.String strUSBtdM = abstractC12782ctV.USBtdM();
                java.lang.String strAUsmxb = abstractC12782ctV.aUsmxb();
                java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                C13852daR c13852daRODWQjV2 = abstractC12782ctV.ODWQjV();
                java.lang.String strCopydefault2 = c13852daRODWQjV2 != null ? c13852daRODWQjV2.copydefault() : null;
                if (strCopydefault2 == null) {
                    strCopydefault2 = "";
                }
                AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(c13934dbu.EZpvd(strUSBtdM, strAUsmxb, strDbNXlk, strCopydefault2), (Function1) null, 1, (java.lang.Object) null);
                final Function1 function1 = new Function1() { // from class: o.bqt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10407bnq.valueOf((java.lang.Throwable) obj);
                    }
                };
                abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.djBIcL(new InterfaceC58229yxO() { // from class: o.bqr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10407bnq.call(function1, obj);
                    }
                });
            }
        } else {
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(yDY.AhwBna());
        }
        final Function1 function12 = new Function1() { // from class: o.bqp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.valueOf(abstractC12782ctV, (java.util.List) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bqu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.WS(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.bqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.copydefault(this.AEQbTJ, c10854bwMAhwBna, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl3 = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bqx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.UrRBLY(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        return abstractC58185ywXKWHzl3;
    }

    public static final java.util.List call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List valueOf(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return yDY.AhwBna();
    }

    public static final kotlin.Pair WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair valueOf(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(abstractC12782ctV, list);
    }

    public static final InterfaceC60096zvd UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, com.okinc.business.defi.biz.model.ChainAddress] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, com.okinc.business.defi.biz.model.ChainAddress] */
    public static final InterfaceC60096zvd copydefault(C10407bnq c10407bnq, C10854bwM c10854bwM, kotlin.Pair pair) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        Intrinsics.checkNotNullParameter(pair, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) pair.component1();
        java.lang.Object objComponent2 = pair.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "");
        C10856bwO.copydefault(c10407bnq.AEQbTJ, 0, "refreshEosState finish");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        EosAccountKeyResp eosAccountKeyResp = (EosAccountKeyResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objComponent2);
        java.lang.Object obj = null;
        java.lang.String account = eosAccountKeyResp != null ? eosAccountKeyResp.getAccount() : null;
        if (account != null) {
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null), (java.lang.Object) account);
            C13852daR c13852daRODWQjV = abstractC12782ctV.ODWQjV();
            if (c13852daRODWQjV != null) {
                c13852daRODWQjV.AEQbTJ(account);
            }
            C13852daR c13852daRODWQjV2 = abstractC12782ctV.ODWQjV();
            if (c13852daRODWQjV2 != null) {
                c13852daRODWQjV2.EZpvd(EOSState.Opened);
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            java.util.Iterator<T> it = abstractC12782ctV.valueOf().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((ChainAddress) next).getCoinId() == c10854bwM.AhwBna()) {
                    obj = next;
                    break;
                }
            }
            ?? r10 = (ChainAddress) obj;
            if (r10 != 0) {
                r10.setAddress(account);
                objectRef.element = r10;
            } else {
                objectRef.element = new ChainAddress(c10854bwM.AhwBna(), account, AddressType.Legacy.getValue(), null, null, true, "", "", 24, null);
                abstractC12782ctV.OLrzqt(new Function1() { // from class: o.boK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C10407bnq.copydefault(objectRef, (java.util.ArrayList) obj2);
                    }
                });
            }
            if (abstractC12782ctV.ODWQjV() != null) {
                C13852daR c13852daRODWQjV3 = abstractC12782ctV.ODWQjV();
                Intrinsics.copydefault(c13852daRODWQjV3);
                arrayList.add(abstractC12782ctV.OLrzqt(c13852daRODWQjV3));
                if (!zEZpvd) {
                    AbstractC58185ywX<java.lang.Integer> abstractC58185ywXCopydefault = c10407bnq.ejfBZ.copydefault(C56402yEa.EZpvd(new C12974cxB(abstractC12782ctV, true, false, yDY.AhwBna(), C56402yEa.EZpvd(new C11283cIm(((ChainAddress) objectRef.element).getAddressType(), ((ChainAddress) objectRef.element).getChainId(), "", null, null, 24, null)))), "assetManager eos", abstractC12782ctV.DbNXlk());
                    final Function1 function1 = new Function1() { // from class: o.boJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return C10407bnq.AEQbTJ((java.lang.Integer) obj2);
                        }
                    };
                    arrayList.add(abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.boI
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58229yxO
                        public final java.lang.Object apply(java.lang.Object obj2) {
                            return C10407bnq.DGOPHZ(function1, obj2);
                        }
                    }).OLrzqt(0L));
                }
                AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
                final Function1 function12 = new Function1() { // from class: o.boL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C10407bnq.fetchVPNInfo((java.util.List) obj2);
                    }
                };
                abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.boM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        return C10407bnq.run(function12, obj2);
                    }
                });
            } else {
                abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0L);
            }
            return abstractC58260yxtCopydefault.EZpvd();
        }
        return AbstractC58185ywX.KWHzl(0L);
    }

    public static final java.util.ArrayList copydefault(Ref.ObjectRef objectRef, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.add(objectRef.element);
        return arrayList;
    }

    public static final java.lang.Long AEQbTJ(java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return java.lang.Long.valueOf(C33129mqd.valueOf(num));
    }

    public static final java.lang.Long DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Long) function1.invoke(obj);
    }

    public static final java.lang.Long fetchVPNInfo(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Long.valueOf(list.size());
    }

    public static final java.lang.Long run(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Long) function1.invoke(obj);
    }

    public final void AEQbTJ(long j) {
        AYXKKw().add(java.lang.Long.valueOf(j));
    }

    public final void EZpvd(long j) {
        AYXKKw().remove(java.lang.Long.valueOf(j));
    }

    public final boolean OLrzqt(long j) {
        java.util.Set<java.lang.Long> setAYXKKw = AYXKKw();
        Intrinsics.checkNotNullExpressionValue(setAYXKKw, "");
        java.util.Set<java.lang.Long> set = setAYXKKw;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            for (java.lang.Long l : set) {
                if (l != null && l.longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getBoolean(str + "_has_asset_ever", false, "wallet_biz_sp_file");
    }

    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str + "_has_asset_ever", java.lang.Boolean.TRUE, "wallet_biz_sp_file");
    }

    public final boolean KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return C17922fXg.EZpvd(abstractC12782ctV) instanceof dTK.TaskDescription;
    }

    public final AbstractC58185ywX<java.util.List<C10404bnn>> KWHzl(final java.util.List<? extends AbstractC12782ctV> list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, final java.util.List<java.lang.Integer> list2, final boolean z, final boolean z2, java.lang.String str4) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC12782ctV) it.next()).DbNXlk());
        }
        AbstractC58185ywX<java.util.List<AssetAll>> abstractC58185ywXCopydefault = copydefault(arrayList, str2, str3, str, z2, i);
        final Function1 function1 = new Function1() { // from class: o.bpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.AEQbTJ(this.OLrzqt, list, z2, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.bpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.QCjLjM(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10407bnq.KWHzl(this.OLrzqt, list, list2, z, (java.util.List) obj);
            }
        };
        AbstractC58185ywX<java.util.List<C10404bnn>> abstractC58185ywXCopydefault3 = abstractC58185ywXCopydefault2.copydefault((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.bpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10407bnq.OxVOHk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault3, "");
        return abstractC58185ywXCopydefault3;
    }

    public final java.util.List<C10527bqD> iwGUEr(java.util.List<C10527bqD> list) {
        return CollectionsKt___CollectionsKt.EZpvd(list, new Activity());
    }

    public final java.util.List<C10528bqE> zsXlph(java.util.List<C10528bqE> list) {
        return CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription());
    }

    public final java.util.List<C10525bqB> EZpvd(@NotNull java.util.List<C10525bqB> list, @NotNull java.util.List<java.lang.Integer> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            list = KWHzl(list, false, ((java.lang.Number) it.next()).intValue(), C56424yEw.KWHzl());
        }
        return list;
    }

    public final java.util.List<C10525bqB> EZpvd(java.util.List<C10525bqB> list, java.util.List<java.lang.Integer> list2, java.util.List<? extends java.util.Map<java.lang.Object, ? extends java.util.List<C10525bqB>>> list3) {
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            list = KWHzl(list, true, ((java.lang.Number) obj).intValue(), list3.get(i));
            i++;
        }
        return list;
    }

    public final java.util.List<AssetAll> KWHzl(ResponseData<java.util.List<AssetAll>> responseData) throws OKWAssetAllException {
        if (responseData.getCode() != 0 && responseData.getCode() != 91000 && C33129mqd.OLrzqt((java.lang.CharSequence) responseData.getMsg())) {
            C55326xho.toast$default(responseData.getMsg(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        if (responseData.getCode() == 91000 || responseData.getCode() == 1000000 || responseData.getData() == null) {
            this.isConnected = false;
            if (responseData.getCode() == 1000000) {
                throw new OKWAssetAllException();
            }
            return yDY.AhwBna();
        }
        this.isConnected = true;
        java.util.List<AssetAll> data = responseData.getData();
        return data == null ? yDY.AhwBna() : data;
    }

    public final void EZpvd(ResponseData<java.util.List<ValuationCurrencyBean>> responseData) {
        java.util.List<ValuationCurrencyBean> data;
        if (responseData.getCode() != 0 || responseData.getData() == null || (data = responseData.getData()) == null || !(!data.isEmpty())) {
            return;
        }
        C54864xYd.AEQbTJ.copydefault(true);
        java.util.List<ValuationCurrencyBean> data2 = responseData.getData();
        if (data2 != null) {
            this.AhwBna.OLrzqt(data2);
        }
        this.AhwBna.copydefault();
    }

    public static final InterfaceC60096zvd valueOf(final C10407bnq c10407bnq, final ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 || responseData.getCode() == 40001) {
            c10407bnq.AkhnZx.AYXKKw().EZpvd(true);
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXGEmmrt = c10407bnq.AkhnZx.AYXKKw().gEmmrt();
            final Function1 function1 = new Function1() { // from class: o.bod
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10407bnq.copydefault(this.AEQbTJ, responseData, (java.lang.Boolean) obj);
                }
            };
            InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXGEmmrt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bog
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10407bnq.DXXBbs(function1, obj);
                }
            });
            Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
            return interfaceC60096zvdAEQbTJ;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new ResponseData(0, null, null, responseData.getErrorMsg(), null, null, 39, null));
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final java.util.List copydefault(C10407bnq c10407bnq, java.util.List list, boolean z, boolean z2, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(c10407bnq.KWHzl((AbstractC12782ctV) it.next(), (java.util.List<java.lang.Integer>) list, z, z2));
        }
        return arrayList;
    }

    public static final ResponseData EZpvd(ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        if (responseData.getCode() != 0 || responseData.getData() == null || responseData2.getCode() != 0 || responseData2.getData() == null) {
            return (responseData.getCode() != 0 || responseData.getData() == null) ? responseData2 : responseData;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listAhwBna = (java.util.List) responseData.getData();
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        arrayList.addAll(listAhwBna);
        java.util.List listAhwBna2 = (java.util.List) responseData2.getData();
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        arrayList.addAll(listAhwBna2);
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), arrayList, responseData.getError_code(), responseData.isFromCache());
    }

    public static final ResponseData KWHzl(ResponseData responseData, ResponseData responseData2) {
        Intrinsics.checkNotNullParameter(responseData, "");
        Intrinsics.checkNotNullParameter(responseData2, "");
        if (responseData.getCode() != 0 || responseData.getData() == null || responseData2.getCode() != 0 || responseData2.getData() == null) {
            return (responseData.getCode() != 0 || responseData.getData() == null) ? responseData2 : responseData;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List listAhwBna = (java.util.List) responseData.getData();
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        arrayList.addAll(listAhwBna);
        java.util.List listAhwBna2 = (java.util.List) responseData2.getData();
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        arrayList.addAll(listAhwBna2);
        return new ResponseData(responseData.getCode(), responseData.getMsg(), responseData.getDetailMsg(), responseData.getErrorMsg(), arrayList, responseData.getError_code(), responseData.isFromCache());
    }
}
