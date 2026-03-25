package o;

import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13124czt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12984cxL {
    public final C13124czt AEQbTJ;
    public final cQM OLrzqt;
    public final cQD copydefault;

    /* JADX INFO: renamed from: o.cxL$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.HDWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.TonWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.TrackingWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.DemoWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletType.AAWallet.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC12984cxL() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cQD AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cQM EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13124czt KWHzl() {
        return this.AEQbTJ;
    }

    public AbstractC12984cxL(@NotNull C13124czt c13124czt, @NotNull cQD cqd, @NotNull cQM cqm) {
        Intrinsics.checkNotNullParameter(c13124czt, "");
        Intrinsics.checkNotNullParameter(cqd, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        this.AEQbTJ = c13124czt;
        this.copydefault = cqd;
        this.OLrzqt = cqm;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:o.czt:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.czt:0x0008: INVOKE 
  (wrap:o.czt$Application:0x0004: SGET  A[WRAPPED] (LINE:35) o.czt.Companion o.czt$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.czt.Application.getInstance$default(o.czt$Application, android.content.Context, int, java.lang.Object):o.czt A[MD:(o.czt$Application, android.content.Context, int, java.lang.Object):o.czt (m), WRAPPED] (LINE:35)) : (r2v0 o.czt))
  (wrap:o.cQD:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQD:0x0012: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:36) call: o.cQD.<init>():void type: CONSTRUCTOR) : (r3v0 o.cQD))
  (wrap:o.cQM:?: TERNARY null = ((wrap:int:0x0015: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQM:0x0023: INVOKE 
  (wrap:o.dKx:0x001f: INVOKE 
  (wrap:android.app.Application:0x001b: INVOKE (wrap:o.baC$Activity:0x0019: SGET  A[WRAPPED] (LINE:37) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:37))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:37))
 INTERFACE call: o.dKx.QKVWgx():o.cQM A[MD:():o.cQM (m), WRAPPED] (LINE:37)) : (r4v0 o.cQM))
 A[MD:(o.czt, o.cQD, o.cQM):void (m)] (LINE:34) call: o.cxL.<init>(o.czt, o.cQD, o.cQM):void type: THIS */
    /* JADX DEBUG: Class process forced to load method for inline: o.czt.Application.getInstance$default(o.czt$Application, android.content.Context, int, java.lang.Object):o.czt */
    public /* synthetic */ AbstractC12984cxL(C13124czt c13124czt, cQD cqd, cQM cqm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13124czt.Application.getInstance$default(C13124czt.Companion, null, 1, null) : c13124czt, (i & 2) != 0 ? new cQD() : cqd, (i & 4) != 0 ? C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).QKVWgx() : cqm);
    }

    public static /* synthetic */ AbstractC58260yxt saveWalletAllInfoToDB$default(AbstractC12984cxL abstractC12984cxL, C12821cuH c12821cuH, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: saveWalletAllInfoToDB");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return abstractC12984cxL.copydefault(c12821cuH, z);
    }

    public final AbstractC58260yxt<Unit> copydefault(@NotNull final C12821cuH c12821cuH, boolean z) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> abstractC58260yxtDjBIcL = djBIcL(c12821cuH);
        AbstractC58260yxt<kotlin.Pair<WalletEntity, java.util.List<WalletEntity>>> abstractC58260yxtOLrzqt = OLrzqt(c12821cuH, z);
        final Function2 function2 = new Function2() { // from class: o.cxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC12984cxL.OLrzqt((kotlin.Pair) obj, (kotlin.Pair) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtDjBIcL, abstractC58260yxtOLrzqt, new InterfaceC58223yxI() { // from class: o.cxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC12984cxL.OLrzqt(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.AEQbTJ(c12821cuH, this, (java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt<Unit> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cyb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12984cxL.fIwbmz(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.util.HashMap OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.HashMap) function2.invoke(obj, obj2);
    }

    public static final java.util.HashMap OLrzqt(kotlin.Pair pair, kotlin.Pair pair2) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("rootWalletEntity", pair.getFirst()), C56390yDp.OLrzqt("needUpdateRootWallets", pair.getSecond()), C56390yDp.OLrzqt("walletEntity", pair2.getFirst()), C56390yDp.OLrzqt("needUpdateWallets", pair2.getSecond()));
    }

    public static final InterfaceC58261yxu fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final C12821cuH c12821cuH, AbstractC12984cxL abstractC12984cxL, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.ArrayList<C11283cIm> arrayListOLrzqt = c12821cuH.OLrzqt();
        if (arrayListOLrzqt.isEmpty()) {
            arrayListOLrzqt = abstractC12984cxL.copydefault(c12821cuH.AYXKKw(), c12821cuH.AuCTel());
        }
        java.util.List<WalletSignDataEntity> listAEQbTJ = abstractC12984cxL.AEQbTJ(c12821cuH.AhwBna(), arrayListOLrzqt);
        cQD cqd = abstractC12984cxL.copydefault;
        RootWalletEntity rootWalletEntity = (RootWalletEntity) map.get("rootWalletEntity");
        java.util.List<RootWalletEntity> list = (java.util.List) map.get("needUpdateRootWallets");
        java.lang.Object obj = map.get("walletEntity");
        Intrinsics.copydefault(obj, "");
        WalletEntity walletEntity = (WalletEntity) obj;
        java.util.List<WalletEntity> list2 = (java.util.List) map.get("needUpdateWallets");
        java.util.ArrayList<ChainAddressEntity> arrayListAYXKKw = c12821cuH.AYXKKw();
        java.util.ArrayList<CustomChainAddressEntity> arrayListAEQbTJ = c12821cuH.AEQbTJ();
        java.util.ArrayList<ChainAddressSegWitEntity> arrayListAuCTel = c12821cuH.AuCTel();
        EOSInfoEntity eOSInfoEntityDjBIcL = c12821cuH.djBIcL();
        MPCWalletEntity mPCWalletEntityIsConnected = c12821cuH.isConnected();
        java.util.List<MPCWalletEntity> listEZpvd = mPCWalletEntityIsConnected != null ? C56402yEa.EZpvd(mPCWalletEntityIsConnected) : null;
        java.util.ArrayList<SepInfoEntity> arrayListFJNWhG = c12821cuH.fJNWhG();
        C13854daT c13854daTGEmmrt = c12821cuH.gEmmrt();
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = cqd.copydefault(rootWalletEntity, list, walletEntity, list2, arrayListAYXKKw, arrayListAEQbTJ, arrayListAuCTel, eOSInfoEntityDjBIcL, listEZpvd, arrayListFJNWhG, c13854daTGEmmrt != null ? c13854daTGEmmrt.EZpvd() : null, listAEQbTJ);
        final Function1 function1 = new Function1() { // from class: o.cxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return AbstractC12984cxL.AEQbTJ(c12821cuH, (Unit) obj2);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cya
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return AbstractC12984cxL.DbNXlk(function1, obj2);
            }
        });
    }

    public static final Unit DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        if (c12821cuH.fARcdN() == WalletType.HDWallet) {
            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(c12821cuH.AhwBna());
        }
        return Unit.INSTANCE;
    }

    public final java.util.ArrayList<C11283cIm> copydefault(java.util.ArrayList<ChainAddressEntity> arrayList, java.util.ArrayList<ChainAddressSegWitEntity> arrayList2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (ChainAddressEntity chainAddressEntity : arrayList) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(chainAddressEntity.getChainId());
            if (c10854bwMKWHzl != null) {
                hashSet.add(new C11283cIm(chainAddressEntity.getAddressType(), c10854bwMKWHzl.fetchVPNInfo(), "", null, null, 24, null));
            }
        }
        for (ChainAddressSegWitEntity chainAddressSegWitEntity : arrayList2) {
            C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(chainAddressSegWitEntity.getChainId());
            if (c10854bwMKWHzl2 != null) {
                hashSet.add(new C11283cIm(chainAddressSegWitEntity.getAddressType(), c10854bwMKWHzl2.fetchVPNInfo(), "", null, null, 24, null));
            }
        }
        return new java.util.ArrayList<>(hashSet);
    }

    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> djBIcL(@NotNull C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        switch (Application.OLrzqt[c12821cuH.fARcdN().ordinal()]) {
            case 1:
            case 2:
                return EZpvd(c12821cuH);
            case 3:
                return gEmmrt(c12821cuH);
            case 4:
                return AhwBna(c12821cuH);
            case 5:
                return KWHzl(c12821cuH);
            case 6:
                return copydefault(c12821cuH);
            case 7:
                return OLrzqt(c12821cuH);
            case 8:
                return AEQbTJ(c12821cuH);
            default:
                this.AEQbTJ.EZpvd("WalletCreateBaseManager", c12821cuH.fARcdN(), "Chain is not supported for wallet type. walletType = " + c12821cuH.fARcdN(), CreateOrImportType.CREATE_WALLET, "generateRootWalletEntity");
                throw WalletImportError.Companion.isConnected();
        }
    }

    public static final kotlin.Pair AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity>>> */
    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> EZpvd(final C12821cuH c12821cuH) {
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtCopydefault = this.OLrzqt.copydefault();
        final Function1 function1 = new Function1() { // from class: o.cxZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.valueOf(c12821cuH, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cxY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12984cxL.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair valueOf(C12821cuH c12821cuH, java.util.List list) {
        java.lang.Object next;
        int iNextIndex;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((cSX) next).getNewProxyInstance(), (java.lang.Object) c12821cuH.fIwbmz().AEQbTJ())) {
                break;
            }
        }
        if (next != null) {
            return C56390yDp.OLrzqt(null, null);
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            cSX csx = (cSX) listIterator.previous();
            java.lang.Integer numZsXlph = csx.zsXlph();
            int iOrdinal = WalletType.HDWallet.ordinal();
            if (numZsXlph == null || numZsXlph.intValue() != iOrdinal) {
                java.lang.Integer numZsXlph2 = csx.zsXlph();
                int iOrdinal2 = WalletType.TonWallet.ordinal();
                if (numZsXlph2 != null && numZsXlph2.intValue() == iOrdinal2) {
                }
            }
            iNextIndex = listIterator.nextIndex();
        }
        iNextIndex = -1;
        C12786ctZ c12786ctZFIwbmz = c12821cuH.fIwbmz();
        if (c12786ctZFIwbmz != null) {
            c12786ctZFIwbmz.OLrzqt(iNextIndex + 1);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        for (int i = iNextIndex + 1; i < size; i++) {
            cSX csx2 = (cSX) list.get(i);
            csx2.OLrzqt(csx2.zLjUOn() + 1);
            arrayList.add(((cSX) list.get(i)).EZpvd());
        }
        return C56390yDp.OLrzqt(c12821cuH.fIwbmz().KWHzl(), arrayList);
    }

    public static final kotlin.Pair AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity>>> */
    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> gEmmrt(final C12821cuH c12821cuH) {
        AbstractC58260yxt abstractC58260yxtCopydefault = this.OLrzqt.copydefault().copydefault(new C12989cxQ(new Function1() { // from class: o.cxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.AYXKKw(c12821cuH, (java.util.List) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair AYXKKw(C12821cuH c12821cuH, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.Integer numZsXlph = ((cSX) next).zsXlph();
            int iOrdinal = WalletType.KeyWallet.ordinal();
            if (numZsXlph != null && numZsXlph.intValue() == iOrdinal) {
                break;
            }
        }
        if (next != null) {
            return C56390yDp.OLrzqt(null, null);
        }
        java.util.Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            java.lang.Integer numZsXlph2 = ((cSX) it2.next()).zsXlph();
            int iOrdinal2 = WalletType.TrackingWallet.ordinal();
            if (numZsXlph2 != null && numZsXlph2.intValue() == iOrdinal2) {
                break;
            }
            i++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i == -1) {
            c12821cuH.fIwbmz().OLrzqt(list.size());
        } else {
            c12821cuH.fIwbmz().OLrzqt(i);
            int size = list.size();
            while (i < size) {
                cSX csx = (cSX) list.get(i);
                csx.OLrzqt(csx.zLjUOn() + 1);
                arrayList.add(((cSX) list.get(i)).EZpvd());
                i++;
            }
        }
        return C56390yDp.OLrzqt(c12821cuH.fIwbmz().KWHzl(), arrayList);
    }

    public static final kotlin.Pair values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity>>> */
    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> AhwBna(final C12821cuH c12821cuH) {
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtCopydefault = this.OLrzqt.copydefault();
        final Function1 function1 = new Function1() { // from class: o.cxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.gEmmrt(c12821cuH, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12984cxL.values(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair gEmmrt(C12821cuH c12821cuH, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.Integer numZsXlph = ((cSX) next).zsXlph();
            int iOrdinal = WalletType.TrackingWallet.ordinal();
            if (numZsXlph != null && numZsXlph.intValue() == iOrdinal) {
                break;
            }
        }
        if (next != null) {
            return C56390yDp.OLrzqt(null, null);
        }
        java.util.Iterator it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            java.lang.Integer numZsXlph2 = ((cSX) it2.next()).zsXlph();
            int iOrdinal2 = WalletType.ConnectWallet.ordinal();
            if (numZsXlph2 != null && numZsXlph2.intValue() == iOrdinal2) {
                break;
            }
            i++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i == -1) {
            c12821cuH.fIwbmz().OLrzqt(list.size());
        } else {
            c12821cuH.fIwbmz().OLrzqt(i);
            int size = list.size();
            while (i < size) {
                cSX csx = (cSX) list.get(i);
                csx.OLrzqt(csx.zLjUOn() + 1);
                arrayList.add(((cSX) list.get(i)).EZpvd());
                i++;
            }
        }
        return C56390yDp.OLrzqt(c12821cuH.fIwbmz().KWHzl(), arrayList);
    }

    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> KWHzl(C12821cuH c12821cuH) {
        AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(c12821cuH.fIwbmz().KWHzl(), null));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity>>> */
    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> copydefault(final C12821cuH c12821cuH) {
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtCopydefault = this.OLrzqt.copydefault();
        final Function1 function1 = new Function1() { // from class: o.cxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.djBIcL(c12821cuH, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12984cxL.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair djBIcL(C12821cuH c12821cuH, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((cSX) next).getNewProxyInstance(), (java.lang.Object) c12821cuH.fIwbmz().AEQbTJ())) {
                break;
            }
        }
        if (next == null) {
            c12821cuH.fIwbmz().OLrzqt(list.size());
            return C56390yDp.OLrzqt(c12821cuH.fIwbmz().KWHzl(), null);
        }
        return C56390yDp.OLrzqt(null, null);
    }

    public static final kotlin.Pair fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity>>> */
    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> OLrzqt(final C12821cuH c12821cuH) {
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtCopydefault = this.OLrzqt.copydefault();
        final Function1 function1 = new Function1() { // from class: o.cxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.AhwBna(c12821cuH, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12984cxL.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final kotlin.Pair AhwBna(C12821cuH c12821cuH, java.util.List list) {
        java.lang.Object obj;
        java.lang.Object next;
        int iNextIndex;
        int iNextIndex2;
        int iNextIndex3;
        int iNextIndex4;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((cSX) next).getNewProxyInstance(), (java.lang.Object) c12821cuH.fIwbmz().AEQbTJ())) {
                break;
            }
        }
        if (next != null) {
            return C56390yDp.OLrzqt(null, null);
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            java.lang.Object objPrevious = listIterator.previous();
            java.lang.Integer numZsXlph = ((cSX) objPrevious).zsXlph();
            int iOrdinal = WalletType.MPCWallet.ordinal();
            if (numZsXlph != null && numZsXlph.intValue() == iOrdinal) {
                obj = objPrevious;
                break;
            }
        }
        cSX csx = (cSX) obj;
        int iZLjUOn = csx != null ? csx.zLjUOn() : 0;
        java.util.ListIterator listIterator2 = list.listIterator(list.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            java.lang.Integer numZsXlph2 = ((cSX) listIterator2.previous()).zsXlph();
            int iOrdinal2 = WalletType.MPCWallet.ordinal();
            if (numZsXlph2 != null && numZsXlph2.intValue() == iOrdinal2) {
                iNextIndex = listIterator2.nextIndex();
                break;
            }
        }
        java.util.ListIterator listIterator3 = list.listIterator(list.size());
        while (true) {
            if (!listIterator3.hasPrevious()) {
                iNextIndex2 = -1;
                break;
            }
            java.lang.Integer numZsXlph3 = ((cSX) listIterator3.previous()).zsXlph();
            int iOrdinal3 = WalletType.KeyWallet.ordinal();
            if (numZsXlph3 != null && numZsXlph3.intValue() == iOrdinal3) {
                iNextIndex2 = listIterator3.nextIndex();
                break;
            }
        }
        java.util.ListIterator listIterator4 = list.listIterator(list.size());
        while (true) {
            if (!listIterator4.hasPrevious()) {
                iNextIndex3 = -1;
                break;
            }
            java.lang.Integer numZsXlph4 = ((cSX) listIterator4.previous()).zsXlph();
            int iOrdinal4 = WalletType.TrackingWallet.ordinal();
            if (numZsXlph4 != null && numZsXlph4.intValue() == iOrdinal4) {
                iNextIndex3 = listIterator4.nextIndex();
                break;
            }
        }
        java.util.ListIterator listIterator5 = list.listIterator(list.size());
        while (true) {
            if (!listIterator5.hasPrevious()) {
                iNextIndex4 = -1;
                break;
            }
            java.lang.Integer numZsXlph5 = ((cSX) listIterator5.previous()).zsXlph();
            int iOrdinal5 = WalletType.HardwareWallet.ordinal();
            if (numZsXlph5 != null && numZsXlph5.intValue() == iOrdinal5) {
                iNextIndex4 = listIterator5.nextIndex();
                break;
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (iNextIndex != -1) {
            C12786ctZ c12786ctZFIwbmz = c12821cuH.fIwbmz();
            if (c12786ctZFIwbmz != null) {
                c12786ctZFIwbmz.OLrzqt(iZLjUOn + 1);
            }
            int size = list.size();
            for (int i = iNextIndex + 1; i < size; i++) {
                cSX csx2 = (cSX) list.get(i);
                csx2.OLrzqt(csx2.zLjUOn() + 1);
                arrayList.add(((cSX) list.get(i)).EZpvd());
            }
        } else if (iNextIndex2 != -1) {
            c12821cuH.fIwbmz().OLrzqt(iNextIndex2);
            int size2 = list.size();
            while (iNextIndex2 < size2) {
                cSX csx3 = (cSX) list.get(iNextIndex2);
                csx3.OLrzqt(csx3.zLjUOn() + 1);
                arrayList.add(((cSX) list.get(iNextIndex2)).EZpvd());
                iNextIndex2++;
            }
        } else if (iNextIndex4 != -1) {
            c12821cuH.fIwbmz().OLrzqt(iNextIndex4);
            int size3 = list.size();
            while (iNextIndex4 < size3) {
                cSX csx4 = (cSX) list.get(iNextIndex4);
                csx4.OLrzqt(csx4.zLjUOn() + 1);
                arrayList.add(((cSX) list.get(iNextIndex4)).EZpvd());
                iNextIndex4++;
            }
        } else if (iNextIndex3 == -1) {
            c12821cuH.fIwbmz().OLrzqt(list.size());
        } else {
            c12821cuH.fIwbmz().OLrzqt(iNextIndex3);
            int size4 = list.size();
            while (iNextIndex3 < size4) {
                cSX csx5 = (cSX) list.get(iNextIndex3);
                csx5.OLrzqt(csx5.zLjUOn() + 1);
                arrayList.add(((cSX) list.get(iNextIndex3)).EZpvd());
                iNextIndex3++;
            }
        }
        return C56390yDp.OLrzqt(c12821cuH.fIwbmz().KWHzl(), arrayList);
    }

    public final AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> AEQbTJ(C12821cuH c12821cuH) {
        AbstractC58260yxt<kotlin.Pair<RootWalletEntity, java.util.List<RootWalletEntity>>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(C56390yDp.OLrzqt(null, null));
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static /* synthetic */ AbstractC58260yxt generateWalletEntity$default(AbstractC12984cxL abstractC12984cxL, C12821cuH c12821cuH, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateWalletEntity");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return abstractC12984cxL.OLrzqt(c12821cuH, z);
    }

    public static final kotlin.Pair isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<kotlin.Pair<com.okinc.business.defi.biz.database.wallet.entity.WalletEntity, java.util.List<com.okinc.business.defi.biz.database.wallet.entity.WalletEntity>>> */
    public final AbstractC58260yxt<kotlin.Pair<WalletEntity, java.util.List<WalletEntity>>> OLrzqt(final C12821cuH c12821cuH, final boolean z) {
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtDjBIcL = this.OLrzqt.djBIcL();
        final Function1 function1 = new Function1() { // from class: o.cxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC12984cxL.EZpvd(c12821cuH, z, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtDjBIcL.copydefault(new InterfaceC58229yxO() { // from class: o.cxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return AbstractC12984cxL.isConnected(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final kotlin.Pair EZpvd(C12821cuH c12821cuH, boolean z, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        java.util.Iterator it = list.iterator();
        int addressIndex = -1;
        WalletEntity walletEntity = null;
        while (it.hasNext()) {
            WalletEntity walletEntity2 = (WalletEntity) it.next();
            if (C11600cUg.KWHzl(walletEntity2.getMain())) {
                walletEntity = walletEntity2;
            }
            if (walletEntity2.getOrderValue() > size) {
                size = walletEntity2.getOrderValue();
            }
            if (Intrinsics.EZpvd((java.lang.Object) c12821cuH.fIwbmz().AEQbTJ(), (java.lang.Object) walletEntity2.getRootWalletId()) && walletEntity2.getAddressIndex() > addressIndex) {
                addressIndex = walletEntity2.getAddressIndex();
            }
        }
        if (c12821cuH.fARcdN() != WalletType.HDWallet && c12821cuH.fARcdN() != WalletType.MPCWallet && c12821cuH.fARcdN() != WalletType.AAWallet && c12821cuH.fARcdN() == WalletType.HardwareWallet) {
            C13854daT c13854daTGEmmrt = c12821cuH.gEmmrt();
            if ((c13854daTGEmmrt != null ? c13854daTGEmmrt.KWHzl() : null) != HardwareType.Keystone) {
                C13854daT c13854daTGEmmrt2 = c12821cuH.gEmmrt();
                if ((c13854daTGEmmrt2 != null ? c13854daTGEmmrt2.KWHzl() : null) != HardwareType.OneKey) {
                    c12821cuH.OLrzqt(addressIndex + 1);
                }
            }
        }
        if (z && walletEntity != null) {
            walletEntity.setMain(C11600cUg.OLrzqt(false));
            arrayList.add(walletEntity);
        }
        return C56390yDp.OLrzqt(c12821cuH.copydefault(size + 1, C11600cUg.OLrzqt(z)), arrayList);
    }

    public final java.util.List<WalletSignDataEntity> AEQbTJ(java.lang.String str, java.util.List<C11283cIm> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C11283cIm c11283cIm : list) {
            arrayList.add(new WalletSignDataEntity(str, 1, 1, c11283cIm.copydefault(), c11283cIm.KWHzl(), c11283cIm.OLrzqt(), c11283cIm.EZpvd(), c11283cIm.AEQbTJ()));
        }
        return arrayList;
    }
}
