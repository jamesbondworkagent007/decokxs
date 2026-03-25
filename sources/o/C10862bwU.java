package o;

import androidx.work.PeriodicWorkRequest;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.extra.entity.FullAssetCoinRelationEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import com.okinc.business.defi.biz.net.bean.AddCoinReq;
import com.okinc.business.defi.biz.net.bean.CoinMetaBean;
import com.okinc.business.defi.biz.net.bean.PlatformCoinCDNUrlBean;
import com.okinc.business.defi.biz.wallethardware.ledger.LedgerSignHelper;
import com.okinc.business.defi.wallet.BuildConfig;
import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JvmStreamsKt;
import o.C10948byA;
import o.cQM;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bwU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10862bwU {
    public final C12812ctz AEQbTJ;
    public final cQB AYXKKw;
    public final int AhwBna;
    public final cQM DbNXlk;
    public final C10948byA EZpvd;
    public final C11275cIe KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;
    public final int djBIcL;
    public final C13934dbu fetchVPNInfo;
    public final int gEmmrt;
    public final WalletUpdateWorker isConnected;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10862bwU() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public C10862bwU(@NotNull C10948byA c10948byA, @NotNull WalletUpdateWorker walletUpdateWorker, @NotNull C13934dbu c13934dbu, @NotNull cQM cqm, @NotNull C11275cIe c11275cIe, @NotNull cQB cqb, @NotNull C12812ctz c12812ctz) {
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(walletUpdateWorker, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(c11275cIe, "");
        Intrinsics.checkNotNullParameter(cqb, "");
        Intrinsics.checkNotNullParameter(c12812ctz, "");
        this.EZpvd = c10948byA;
        this.isConnected = walletUpdateWorker;
        this.fetchVPNInfo = c13934dbu;
        this.DbNXlk = cqm;
        this.KWHzl = c11275cIe;
        this.AYXKKw = cqb;
        this.AEQbTJ = c12812ctz;
        this.copydefault = "CoinMetaLoadManager";
        this.OLrzqt = c12812ctz.EZpvd(BuildConfig.WALLET_VERSION);
        this.AhwBna = 1;
        this.gEmmrt = 2;
        this.valueOf = 3;
        this.djBIcL = 4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0006: INVOKE (wrap:o.byG:0x0004: SGET  A[WRAPPED] (LINE:40) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:40)) : (r6v0 o.byA))
  (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker:0x0016: TERNARY null = ((wrap:int:0x000a: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker:0x0012: INVOKE 
  (wrap:com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application:0x0010: SGET  A[WRAPPED] (LINE:41) com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Companion com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.Application.getInstance$default(com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application, android.content.Context, int, java.lang.Object):com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker A[MD:(com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker$Application, android.content.Context, int, java.lang.Object):com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker (m), WRAPPED] (LINE:41)) : (r7v0 com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker))
  (wrap:o.dbu:0x0020: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.dbu:0x001d: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:42) call: o.dbu.<init>():void type: CONSTRUCTOR) : (r8v0 o.dbu))
  (wrap:o.cQM:0x002b: TERNARY null = ((wrap:int:0x0021: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQM:0x0027: INVOKE 
  (wrap:o.cQM$Application:0x0025: SGET  A[WRAPPED] (LINE:43) o.cQM.Companion o.cQM$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cQM.Application.getInstance$default(o.cQM$Application, android.content.Context, int, java.lang.Object):o.cQM A[MD:(o.cQM$Application, android.content.Context, int, java.lang.Object):o.cQM (m), WRAPPED] (LINE:43)) : (r9v0 o.cQM))
  (wrap:o.cIe:0x0035: TERNARY null = ((wrap:int:0x002c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cIe:0x0032: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:44) call: o.cIe.<init>():void type: CONSTRUCTOR) : (r10v0 o.cIe))
  (wrap:o.cQB:0x003f: TERNARY null = ((wrap:int:0x0036: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQB:0x003c: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:45) call: o.cQB.<init>():void type: CONSTRUCTOR) : (r11v0 o.cQB))
  (wrap:o.ctz:?: TERNARY null = ((wrap:int:0x0040: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ctz:0x0044: SGET  A[WRAPPED] (LINE:46) o.ctz.EZpvd o.ctz) : (r12v0 o.ctz))
 A[MD:(o.byA, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.dbu, o.cQM, o.cIe, o.cQB, o.ctz):void (m)] (LINE:39) call: o.bwU.<init>(o.byA, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.dbu, o.cQM, o.cIe, o.cQB, o.ctz):void type: THIS */
    public /* synthetic */ C10862bwU(C10948byA c10948byA, WalletUpdateWorker walletUpdateWorker, C13934dbu c13934dbu, cQM cqm, C11275cIe c11275cIe, cQB cqb, C12812ctz c12812ctz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA, (i & 2) != 0 ? WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null) : walletUpdateWorker, (i & 4) != 0 ? new C13934dbu() : c13934dbu, (i & 8) != 0 ? cQM.Application.getInstance$default(cQM.Companion, null, 1, null) : cqm, (i & 16) != 0 ? new C11275cIe() : c11275cIe, (i & 32) != 0 ? new cQB() : cqb, (i & 64) != 0 ? C12812ctz.EZpvd : c12812ctz);
    }

    public final AbstractC58185ywX<java.lang.Boolean> AEQbTJ() {
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ;
        if (this.EZpvd.fJNWhG().AkhnZx().isEmpty()) {
            C10856bwO.copydefault(this.copydefault, 0, "initCoinMetas");
            if (valueOf() || copydefault().length() == 0) {
                AbstractC58185ywX<java.util.List<CoinMetaBean>> abstractC58185ywXCopydefault = AhwBna().copydefault(yBP.AEQbTJ());
                final Function1 function1 = new Function1() { // from class: o.bxY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10862bwU.copydefault(this.AEQbTJ, (java.util.List) obj);
                    }
                };
                interfaceC60096zvdAEQbTJ = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.byd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10862bwU.UeEOUB(function1, obj);
                    }
                });
            } else {
                AbstractC58185ywX<java.util.List<CoinMetaBean>> abstractC58185ywXCopydefault2 = djBIcL().copydefault(yBP.AEQbTJ());
                AbstractC58185ywX<java.util.List<FullAssetCoinRelationEntity>> abstractC58185ywXCopydefault3 = AYXKKw().copydefault(yBP.AEQbTJ());
                final Function2 function2 = new Function2() { // from class: o.byc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return C10862bwU.copydefault((java.util.List) obj, (java.util.List) obj2);
                    }
                };
                interfaceC60096zvdAEQbTJ = AbstractC58185ywX.EZpvd(abstractC58185ywXCopydefault2, abstractC58185ywXCopydefault3, new InterfaceC58223yxI() { // from class: o.byb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58223yxI
                    public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                        return C10862bwU.KWHzl(function2, obj, obj2);
                    }
                });
            }
            AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXCopydefault4 = OLrzqt(true).copydefault(yBP.AEQbTJ());
            final Function2 function22 = new Function2() { // from class: o.bxZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C10862bwU.OLrzqt(this.EZpvd, (kotlin.Pair) obj, (ResponseData) obj2);
                }
            };
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = AbstractC58185ywX.EZpvd(interfaceC60096zvdAEQbTJ, abstractC58185ywXCopydefault4, new InterfaceC58223yxI() { // from class: o.bya
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C10862bwU.gEmmrt(function22, obj, obj2);
                }
            }).OLrzqt(new InterfaceC58222yxH() { // from class: o.byf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58222yxH
                public final void run() {
                    C10862bwU.gEmmrt(this.copydefault);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXOLrzqt);
            return abstractC58185ywXOLrzqt;
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final kotlin.Pair UeEOUB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair copydefault(C10862bwU c10862bwU, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c10862bwU.AEQbTJ(false);
        return C56390yDp.OLrzqt(list, yDY.AhwBna());
    }

    public static final kotlin.Pair KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return C56390yDp.OLrzqt(list, list2);
    }

    public static final java.lang.Boolean gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Boolean) function2.invoke(obj, obj2);
    }

    public static final java.lang.Boolean OLrzqt(C10862bwU c10862bwU, kotlin.Pair pair, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List<CoinMetaBean> list = (java.util.List) pair.getFirst();
        java.util.List<CoinMetaBean> list2 = (java.util.List) responseData.getData();
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        c10862bwU.OLrzqt(list, list2, (java.util.List<FullAssetCoinRelationEntity>) second);
        return java.lang.Boolean.valueOf(!c10862bwU.EZpvd.fJNWhG().AkhnZx().isEmpty());
    }

    public static final void gEmmrt(final C10862bwU c10862bwU) {
        AbstractC58185ywX<kotlin.Pair<java.lang.String, java.util.List<CoinMetaBean>>> abstractC58185ywXKWHzl = c10862bwU.KWHzl(true);
        final Function1 function1 = new Function1() { // from class: o.bxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AEQbTJ(this.copydefault, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<R> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.dxcTrN(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.byh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AEQbTJ(this.EZpvd, (Unit) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.byq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.finit(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.byz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.KWHzl(this.EZpvd, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl4 = abstractC58185ywXKWHzl3.KWHzl(new InterfaceC58229yxO() { // from class: o.bwS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.djSkpj(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.bwV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AhwBna(this.EZpvd, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bwY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10862bwU.fZBcTu(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.bwZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AEQbTJ(this.copydefault, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl4.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bwW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10862bwU.fFgQHt(function15, obj);
            }
        });
    }

    public static final InterfaceC60096zvd dxcTrN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C10862bwU c10862bwU, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        parseAndSetupCoins$default(c10862bwU, c10862bwU.AhwBna, (java.util.List) pair.getSecond(), null, null, false, null, 60, null);
        return c10862bwU.AEQbTJ((java.lang.String) pair.getFirst(), (java.util.List<CoinMetaBean>) pair.getSecond());
    }

    public static final InterfaceC60096zvd finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(C10862bwU c10862bwU, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c10862bwU.KWHzl();
    }

    public static final InterfaceC60096zvd djSkpj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C10862bwU c10862bwU, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        return c10862bwU.copydefault(true);
    }

    public static final void fZBcTu(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(C10862bwU c10862bwU, java.lang.Boolean bool) {
        C10856bwO.copydefault(c10862bwU.copydefault, 0, "initCoinMetas loadPlatformCoinsFromServer success");
        return Unit.INSTANCE;
    }

    public static final void fFgQHt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C10862bwU c10862bwU, java.lang.Throwable th) {
        C10856bwO.copydefault(c10862bwU.copydefault, -1, "initCoinMetas loadPlatformCoinsFromServer error " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.lang.Boolean> isConnected() {
        C10856bwO.copydefault(this.copydefault, 0, "refreshPlatformCoins");
        if (!C10954byG.EZpvd.fetchVPNInfo()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.String, java.util.List<CoinMetaBean>>> abstractC58185ywXKWHzl2 = KWHzl(false);
        final Function1 function1 = new Function1() { // from class: o.bxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AYXKKw(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.accept(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final java.lang.Boolean accept(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean AYXKKw(final C10862bwU c10862bwU, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        parseAndSetupCoins$default(c10862bwU, c10862bwU.AhwBna, (java.util.List) pair.getSecond(), null, null, false, null, 60, null);
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) c10862bwU.AEQbTJ((java.lang.String) pair.getFirst(), (java.util.List<CoinMetaBean>) pair.getSecond()));
        final Function1 function1 = new Function1() { // from class: o.byw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.KWHzl(this.copydefault, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.byy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10862bwU.RlQdEF(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.byB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.gEmmrt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.byC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10862bwU.QKudOq(function12, obj);
            }
        });
        return java.lang.Boolean.valueOf(!c10862bwU.EZpvd.fJNWhG().KWHzl().isEmpty());
    }

    public static final void RlQdEF(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C10862bwU c10862bwU, Unit unit) {
        C10856bwO.copydefault(c10862bwU.copydefault, 0, "refreshPlatformCoins  saveToDB  success");
        return Unit.INSTANCE;
    }

    public static final void QKudOq(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(C10862bwU c10862bwU, java.lang.Throwable th) {
        C10856bwO.copydefault(c10862bwU.copydefault, 0, "refreshPlatformCoins  saveToDB  error  " + th.getMessage());
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.lang.Boolean> gEmmrt() {
        C10856bwO.copydefault(this.copydefault, 0, "refreshCustomCoins");
        if (!C10954byG.EZpvd.fetchVPNInfo()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXOLrzqt = OLrzqt(false);
        final Function1 function1 = new Function1() { // from class: o.bxu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AhwBna(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault = abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.AxsJAYaxsJAY(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final java.lang.Boolean AxsJAYaxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean AhwBna(C10862bwU c10862bwU, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        parseAndSetupCoins$default(c10862bwU, c10862bwU.gEmmrt, null, (java.util.List) responseData.getData(), null, false, null, 58, null);
        return java.lang.Boolean.valueOf(!c10862bwU.EZpvd.fJNWhG().KWHzl().isEmpty());
    }

    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(final boolean z, @NotNull java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Long>> map) {
        Intrinsics.checkNotNullParameter(map, "");
        C10856bwO.copydefault(this.copydefault, 0, "updateFullAssetCoins isAll:" + z);
        if (!C10954byG.EZpvd.fetchVPNInfo()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, java.util.List<CoinMetaBean>>>> abstractC58185ywXCopydefault = copydefault(map);
        final Function1 function1 = new Function1() { // from class: o.bxF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.copydefault(this.OLrzqt, z, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.DarRvM(function1, obj);
            }
        }).copydefault(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault2, "");
        return abstractC58185ywXCopydefault2;
    }

    public static final java.lang.Boolean DarRvM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(final C10862bwU c10862bwU, boolean z, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        parseAndSetupCoins$default(c10862bwU, c10862bwU.valueOf, null, null, (java.util.Map) responseData.getData(), z, null, 38, null);
        AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) c10862bwU.AEQbTJ(z, (java.util.Map<java.lang.String, ? extends java.util.List<CoinMetaBean>>) responseData.getData()));
        final Function1 function1 = new Function1() { // from class: o.bxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.djBIcL(this.AEQbTJ, (Unit) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.bxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10862bwU.OqFWZa(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.bxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.djBIcL(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.bxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C10862bwU.DXXBbs(function12, obj);
            }
        });
        return java.lang.Boolean.valueOf(!c10862bwU.EZpvd.fJNWhG().KWHzl().isEmpty());
    }

    public static final void OqFWZa(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C10862bwU c10862bwU, Unit unit) {
        C10856bwO.copydefault(c10862bwU.copydefault, 0, "updateFullAssetCoins  saveToDB  success");
        return Unit.INSTANCE;
    }

    public static final void DXXBbs(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(C10862bwU c10862bwU, java.lang.Throwable th) {
        C10856bwO.copydefault(c10862bwU.copydefault, 0, "updateFullAssetCoins  saveToDB  error " + th.getMessage());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r3v2. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> OLrzqt(AbstractC12782ctV abstractC12782ctV, @NotNull java.util.List<AddCoinReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXCopydefault = copydefault(abstractC12782ctV, list);
        final Function1 function1 = new Function1() { // from class: o.bye
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.gEmmrt(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.byg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.RJOkX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.Boolean> */
    public final AbstractC58185ywX<java.lang.Boolean> AEQbTJ(@NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C10856bwO.copydefault(this.copydefault, 0, "addTemporaryCoins");
        if (!C10954byG.EZpvd.fetchVPNInfo()) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXOLrzqt = this.fetchVPNInfo.OLrzqt(list);
        final Function1 function1 = new Function1() { // from class: o.bxg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AYXKKw((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXDjBIcL = abstractC58185ywXOLrzqt.djBIcL(new InterfaceC58229yxO() { // from class: o.bxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.RcXXUw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.djBIcL(this.OLrzqt, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.aKErDB(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final ResponseData AYXKKw(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 47, null);
    }

    public static final ResponseData RcXXUw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final java.lang.Boolean aKErDB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean djBIcL(C10862bwU c10862bwU, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        parseAndSetupCoins$default(c10862bwU, c10862bwU.djBIcL, null, null, null, false, (java.util.List) responseData.getData(), 30, null);
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.util.ArrayList, java.util.Collection] */
    public final void OLrzqt(java.util.List<CoinMetaBean> list, java.util.List<CoinMetaBean> list2, java.util.List<FullAssetCoinRelationEntity> list3) {
        C10856bwO.copydefault(this.copydefault, 0, "parseAndSetupCoinsWhenInit");
        if (list == null || list.isEmpty()) {
            OLrzqt("");
            return;
        }
        C10948byA.StateListAnimator stateListAnimator = new C10948byA.StateListAnimator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        for (CoinMetaBean coinMetaBean : list) {
            C10854bwM c10854bwMKWHzl = KWHzl(stateListAnimator, coinMetaBean);
            if (c10854bwMKWHzl != null) {
                if (coinMetaBean.getCoinCategory() != 2) {
                    stateListAnimator.AkhnZx().add(c10854bwMKWHzl);
                } else {
                    ?? arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list3) {
                        if (((FullAssetCoinRelationEntity) obj).getCoinId() == c10854bwMKWHzl.AhwBna()) {
                            arrayList.add(obj);
                        }
                    }
                    objectRef.element = arrayList;
                    for (FullAssetCoinRelationEntity fullAssetCoinRelationEntity : (java.util.List) arrayList) {
                        if (stateListAnimator.values().get(fullAssetCoinRelationEntity.getWalletId()) == null) {
                            stateListAnimator.values().put(fullAssetCoinRelationEntity.getWalletId(), new java.util.ArrayList<>());
                        }
                        java.util.ArrayList<C10854bwM> arrayList2 = stateListAnimator.values().get(fullAssetCoinRelationEntity.getWalletId());
                        if (arrayList2 != null) {
                            arrayList2.add(c10854bwMKWHzl);
                        }
                    }
                }
            }
        }
        if (list2 != null) {
            for (CoinMetaBean coinMetaBean2 : list2) {
                if (!stateListAnimator.KWHzl().containsKey(java.lang.Long.valueOf(coinMetaBean2.getCoinId()))) {
                    coinMetaBean2.setCoinCategory(3);
                    C10854bwM c10854bwMKWHzl2 = KWHzl(stateListAnimator, coinMetaBean2);
                    if (c10854bwMKWHzl2 != null) {
                        stateListAnimator.gEmmrt().add(c10854bwMKWHzl2);
                    }
                }
            }
        }
        this.EZpvd.KWHzl("initCoinMetas", stateListAnimator, this.isConnected);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.bwU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void parseAndSetupCoins$default(C10862bwU c10862bwU, int i, java.util.List list, java.util.List list2, java.util.Map map, boolean z, java.util.List list3, int i2, java.lang.Object obj) {
        c10862bwU.AEQbTJ(i, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : list2, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? false : z, (i2 & 32) == 0 ? list3 : null);
    }

    public final void AEQbTJ(int i, java.util.List<CoinMetaBean> list, java.util.List<CoinMetaBean> list2, java.util.Map<java.lang.String, ? extends java.util.List<CoinMetaBean>> map, boolean z, java.util.List<CoinMetaBean> list3) {
        java.util.ArrayList<C10854bwM> arrayList;
        java.util.ArrayList<C10854bwM> arrayList2;
        java.util.ArrayList<C10854bwM> arrayList3;
        java.util.ArrayList<C10854bwM> arrayList4;
        C10856bwO.copydefault(this.copydefault, 0, "parseAndSetupCoins type:" + i + " " + (list != null ? java.lang.Integer.valueOf(list.size()) : null) + " " + (list2 != null ? java.lang.Integer.valueOf(list2.size()) : null) + " " + (map != null ? java.lang.Integer.valueOf(map.size()) : null) + " " + z + " " + (list3 != null ? java.lang.Integer.valueOf(list3.size()) : null));
        C10948byA.StateListAnimator stateListAnimator = new C10948byA.StateListAnimator(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        if (i == this.AhwBna) {
            if (list == null || list.isEmpty()) {
                return;
            }
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C10854bwM c10854bwMKWHzl = KWHzl(stateListAnimator, (CoinMetaBean) it.next());
                if (c10854bwMKWHzl != null) {
                    stateListAnimator.AkhnZx().add(c10854bwMKWHzl);
                }
            }
        } else {
            java.util.Iterator<T> it2 = this.EZpvd.fJNWhG().AkhnZx().iterator();
            while (it2.hasNext()) {
                C10854bwM c10854bwMCopydefault = copydefault(stateListAnimator, (C10854bwM) it2.next());
                if (c10854bwMCopydefault != null) {
                    stateListAnimator.AkhnZx().add(c10854bwMCopydefault);
                }
            }
        }
        if (i == this.gEmmrt) {
            if (list2 == null) {
                return;
            }
            for (CoinMetaBean coinMetaBean : list2) {
                if (!stateListAnimator.KWHzl().containsKey(java.lang.Long.valueOf(coinMetaBean.getCoinId()))) {
                    coinMetaBean.setCoinCategory(3);
                    C10854bwM c10854bwMKWHzl2 = KWHzl(stateListAnimator, coinMetaBean);
                    if (c10854bwMKWHzl2 != null) {
                        stateListAnimator.gEmmrt().add(c10854bwMKWHzl2);
                    }
                }
            }
        } else {
            java.util.Iterator<T> it3 = this.EZpvd.fJNWhG().gEmmrt().iterator();
            while (it3.hasNext()) {
                C10854bwM c10854bwMCopydefault2 = copydefault(stateListAnimator, (C10854bwM) it3.next());
                if (c10854bwMCopydefault2 != null) {
                    stateListAnimator.gEmmrt().add(c10854bwMCopydefault2);
                }
            }
        }
        if (i != this.valueOf) {
            for (Map.Entry<java.lang.String, java.util.ArrayList<C10854bwM>> entry : this.EZpvd.fJNWhG().values().entrySet()) {
                java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> mapValues = stateListAnimator.values();
                java.lang.String key = entry.getKey();
                if (mapValues.get(key) == null) {
                    mapValues.put(key, new java.util.ArrayList<>());
                }
                java.util.Iterator<T> it4 = entry.getValue().iterator();
                while (it4.hasNext()) {
                    C10854bwM c10854bwMCopydefault3 = copydefault(stateListAnimator, (C10854bwM) it4.next());
                    if (c10854bwMCopydefault3 != null && (arrayList = stateListAnimator.values().get(entry.getKey())) != null) {
                        arrayList.add(c10854bwMCopydefault3);
                    }
                }
            }
        } else {
            if (map == null) {
                return;
            }
            if (z) {
                for (Map.Entry<java.lang.String, ? extends java.util.List<CoinMetaBean>> entry2 : map.entrySet()) {
                    java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> mapValues2 = stateListAnimator.values();
                    java.lang.String key2 = entry2.getKey();
                    if (mapValues2.get(key2) == null) {
                        mapValues2.put(key2, new java.util.ArrayList<>());
                    }
                    for (CoinMetaBean coinMetaBean2 : entry2.getValue()) {
                        coinMetaBean2.setCoinCategory(2);
                        C10854bwM c10854bwMKWHzl3 = KWHzl(stateListAnimator, coinMetaBean2);
                        if (c10854bwMKWHzl3 != null && (arrayList4 = stateListAnimator.values().get(entry2.getKey())) != null) {
                            arrayList4.add(c10854bwMKWHzl3);
                        }
                    }
                }
            } else {
                for (Map.Entry<java.lang.String, java.util.ArrayList<C10854bwM>> entry3 : this.EZpvd.fJNWhG().values().entrySet()) {
                    java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> mapValues3 = stateListAnimator.values();
                    java.lang.String key3 = entry3.getKey();
                    if (mapValues3.get(key3) == null) {
                        mapValues3.put(key3, new java.util.ArrayList<>());
                    }
                    java.util.Iterator<T> it5 = entry3.getValue().iterator();
                    while (it5.hasNext()) {
                        C10854bwM c10854bwMCopydefault4 = copydefault(stateListAnimator, (C10854bwM) it5.next());
                        if (c10854bwMCopydefault4 != null && (arrayList3 = stateListAnimator.values().get(entry3.getKey())) != null) {
                            arrayList3.add(c10854bwMCopydefault4);
                        }
                    }
                }
                for (Map.Entry<java.lang.String, ? extends java.util.List<CoinMetaBean>> entry4 : map.entrySet()) {
                    java.util.HashMap<java.lang.String, java.util.ArrayList<C10854bwM>> mapValues4 = stateListAnimator.values();
                    java.lang.String key4 = entry4.getKey();
                    if (mapValues4.get(key4) == null) {
                        mapValues4.put(key4, new java.util.ArrayList<>());
                    }
                    for (CoinMetaBean coinMetaBean3 : entry4.getValue()) {
                        coinMetaBean3.setCoinCategory(2);
                        C10854bwM c10854bwMKWHzl4 = KWHzl(stateListAnimator, coinMetaBean3);
                        if (c10854bwMKWHzl4 != null && (arrayList2 = stateListAnimator.values().get(entry4.getKey())) != null) {
                            arrayList2.add(c10854bwMKWHzl4);
                        }
                    }
                }
            }
        }
        if (i == this.djBIcL) {
            if (list3 == null) {
                return;
            }
            java.util.Iterator<T> it6 = this.EZpvd.fJNWhG().fetchVPNInfo().iterator();
            while (it6.hasNext()) {
                C10854bwM c10854bwMCopydefault5 = copydefault(stateListAnimator, (C10854bwM) it6.next());
                if (c10854bwMCopydefault5 != null) {
                    stateListAnimator.fetchVPNInfo().add(c10854bwMCopydefault5);
                }
            }
            for (CoinMetaBean coinMetaBean4 : list3) {
                coinMetaBean4.setCoinCategory(4);
                C10854bwM c10854bwMKWHzl5 = KWHzl(stateListAnimator, coinMetaBean4);
                if (c10854bwMKWHzl5 != null) {
                    stateListAnimator.fetchVPNInfo().add(c10854bwMKWHzl5);
                }
            }
        } else {
            java.util.Iterator<T> it7 = this.EZpvd.fJNWhG().fetchVPNInfo().iterator();
            while (it7.hasNext()) {
                C10854bwM c10854bwMCopydefault6 = copydefault(stateListAnimator, (C10854bwM) it7.next());
                if (c10854bwMCopydefault6 != null) {
                    stateListAnimator.fetchVPNInfo().add(c10854bwMCopydefault6);
                }
            }
        }
        this.EZpvd.KWHzl(java.lang.String.valueOf(i), stateListAnimator, this.isConnected);
    }

    public final C10854bwM KWHzl(C10948byA.StateListAnimator stateListAnimator, CoinMetaBean coinMetaBean) {
        long j = this.OLrzqt;
        java.lang.Long supportVersion = coinMetaBean.getSupportVersion();
        if (j >= (supportVersion != null ? supportVersion.longValue() : 0L)) {
            return copydefault(stateListAnimator, new C10854bwM(coinMetaBean));
        }
        return null;
    }

    public final C10854bwM copydefault(C10948byA.StateListAnimator stateListAnimator, C10854bwM c10854bwM) {
        if (stateListAnimator.KWHzl().put(java.lang.Long.valueOf(c10854bwM.AhwBna()), c10854bwM) != null) {
            return null;
        }
        stateListAnimator.AhwBna().add(c10854bwM);
        if (c10854bwM.DCUTEI()) {
            stateListAnimator.djBIcL().add(c10854bwM);
        }
        if (c10854bwM.giSNqX()) {
            if (stateListAnimator.AEQbTJ().get(c10854bwM.fJNWhG()) == null) {
                stateListAnimator.AEQbTJ().put(c10854bwM.fJNWhG(), new java.util.ArrayList<>());
            }
            java.util.ArrayList<C10854bwM> arrayList = stateListAnimator.AEQbTJ().get(c10854bwM.fJNWhG());
            if (arrayList != null) {
                arrayList.add(c10854bwM);
            }
        }
        if (c10854bwM.zsXlph()) {
            stateListAnimator.EZpvd().put(java.lang.Integer.valueOf(c10854bwM.AxsJAY()), c10854bwM);
        }
        if (c10854bwM.AuCTel()) {
            stateListAnimator.copydefault().add(c10854bwM);
            if (c10854bwM.QkdxfA()) {
                stateListAnimator.AYXKKw().add(c10854bwM);
            }
            if (LedgerSignHelper.AEQbTJ.KWHzl(c10854bwM)) {
                stateListAnimator.DbNXlk().add(c10854bwM);
            }
            if (c10854bwM.getFieldNames()) {
                stateListAnimator.OLrzqt().add(c10854bwM);
            }
            if (c10854bwM.RdAHlO()) {
                if (stateListAnimator.valueOf().get(java.lang.Integer.valueOf(c10854bwM.QOLQEE())) == null) {
                    stateListAnimator.valueOf().put(java.lang.Integer.valueOf(c10854bwM.QOLQEE()), new java.util.ArrayList<>());
                }
                java.util.ArrayList<C10854bwM> arrayList2 = stateListAnimator.valueOf().get(java.lang.Integer.valueOf(c10854bwM.QOLQEE()));
                if (arrayList2 != null) {
                    arrayList2.add(c10854bwM);
                }
            }
        }
        return c10854bwM;
    }

    public final AbstractC58185ywX<java.util.List<CoinMetaBean>> AhwBna() {
        C10856bwO.copydefault(this.copydefault, 0, "loadPlatformCoinsFromRaw");
        AbstractC58185ywX<java.util.List<CoinMetaBean>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.byr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10862bwU.AYXKKw(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List AYXKKw(C10862bwU c10862bwU) {
        return c10862bwU.copydefault(C14639dpJ.KWHzl.EZpvd());
    }

    public final AbstractC58185ywX<java.util.List<CoinMetaBean>> djBIcL() {
        C10856bwO.copydefault(this.copydefault, 0, "loadPlatformAndFullAssetCoinsFromDB");
        AbstractC58185ywX<java.util.List<CoinMetaBean>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bwT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10862bwU.valueOf(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List valueOf(C10862bwU c10862bwU) {
        return c10862bwU.KWHzl.OLrzqt();
    }

    public final AbstractC58185ywX<java.util.List<FullAssetCoinRelationEntity>> AYXKKw() {
        C10856bwO.copydefault(this.copydefault, 0, "loadFullAssetCoinRelationsFromDB");
        AbstractC58185ywX<java.util.List<FullAssetCoinRelationEntity>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10862bwU.djBIcL(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List djBIcL(C10862bwU c10862bwU) {
        return c10862bwU.KWHzl.AEQbTJ();
    }

    /* JADX DEBUG: Type inference failed for r4v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Pair<java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.CoinMetaBean>>> */
    public final AbstractC58185ywX<kotlin.Pair<java.lang.String, java.util.List<CoinMetaBean>>> KWHzl(boolean z) {
        C10856bwO.copydefault(this.copydefault, 0, "loadPlatformCoinsFromServer isInit:" + z);
        AbstractC58185ywX<ResponseData<PlatformCoinCDNUrlBean>> abstractC58185ywXDjBIcL = this.fetchVPNInfo.djBIcL();
        final Function1 function1 = new Function1() { // from class: o.byu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.valueOf((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<PlatformCoinCDNUrlBean>> abstractC58185ywXDjBIcL2 = abstractC58185ywXDjBIcL.djBIcL(new InterfaceC58229yxO() { // from class: o.byx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.iRxXKY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.byt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AYXKKw(this.AEQbTJ, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXDjBIcL2.KWHzl(new InterfaceC58229yxO() { // from class: o.byv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.hUfVAv(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final ResponseData iRxXKY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData valueOf(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 47, null);
    }

    public static final InterfaceC60096zvd hUfVAv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AYXKKw(final C10862bwU c10862bwU, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        PlatformCoinCDNUrlBean platformCoinCDNUrlBean = (PlatformCoinCDNUrlBean) responseData.getData();
        java.lang.String url = platformCoinCDNUrlBean != null ? platformCoinCDNUrlBean.getUrl() : null;
        if (url == null || url.length() == 0) {
            C10856bwO.copydefault(c10862bwU.copydefault, 0, "loadPlatformCoinsFromServer cdn url is empty");
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt("", null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        final java.lang.String strCopydefault = C7862aro.copydefault(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) url).toString());
        java.lang.String strCopydefault2 = c10862bwU.copydefault();
        Intrinsics.copydefault((java.lang.Object) strCopydefault);
        if (strCopydefault.contentEquals(strCopydefault2)) {
            C10856bwO.copydefault(c10862bwU.copydefault, 0, "loadPlatformCoinsFromServer cdn url is equal");
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt("", null));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        AbstractC58185ywX<ResponseBody> abstractC58185ywXAkhnZx = c10862bwU.fetchVPNInfo.AkhnZx(url);
        final Function1 function1 = new Function1() { // from class: o.bxq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AYXKKw(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseBody> abstractC58185ywXDjBIcL = abstractC58185ywXAkhnZx.djBIcL(new InterfaceC58229yxO() { // from class: o.bxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.gkJEwt(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bxs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.OLrzqt(strCopydefault, c10862bwU, (ResponseBody) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.iZzfmt(function12, obj);
            }
        });
        Intrinsics.copydefault(interfaceC60096zvdAEQbTJ);
        return interfaceC60096zvdAEQbTJ;
    }

    public static final ResponseBody gkJEwt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseBody) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: okhttp3.ResponseBody.Companion.create$default(okhttp3.ResponseBody$Companion, byte[], okhttp3.MediaType, int, java.lang.Object):okhttp3.ResponseBody */
    public static final ResponseBody AYXKKw(C10862bwU c10862bwU, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        C10856bwO.copydefault(c10862bwU.copydefault, 0, "loadPlatformCoinsFromServer  onErrorReturn  " + th.getMessage());
        return ResponseBody.Companion.create$default(ResponseBody.Companion, new byte[0], (MediaType) null, 1, (java.lang.Object) null);
    }

    public static final kotlin.Pair iZzfmt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair OLrzqt(java.lang.String str, C10862bwU c10862bwU, ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "");
        return C56390yDp.OLrzqt(str, c10862bwU.copydefault(responseBody.byteStream()));
    }

    /* JADX DEBUG: Type inference failed for r10v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<com.okinc.network.okg.response.ResponseData<java.util.List<com.okinc.business.defi.biz.net.bean.CoinMetaBean>>> */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> OLrzqt(final boolean z) {
        boolean z2;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        if (z) {
            z2 = false;
        } else {
            booleanRef.element = OLrzqt();
            long jEZpvd = EZpvd();
            if (jEZpvd == 0) {
                fetchVPNInfo();
            }
            z2 = true;
            boolean z3 = jEZpvd > 0 && java.lang.System.currentTimeMillis() - jEZpvd > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
            booleanRef2.element = z3;
            if (!booleanRef.element && !z3) {
            }
        }
        C10856bwO.copydefault(this.copydefault, 0, "loadCustomCoins isInit:" + z + " hasNewCustomCoin:" + booleanRef.element + " updateCustomCoinTimeMoreThanFifteenMinutes:" + booleanRef2.element);
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXAEQbTJ = this.fetchVPNInfo.AEQbTJ(this.isConnected.AhwBna(), z2);
        final Function1 function1 = new Function1() { // from class: o.bxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.gEmmrt((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.bxG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.dvKsVJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.KWHzl(z, booleanRef, this, booleanRef2, (ResponseData) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ2 = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.gGvvIC(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final ResponseData dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData gEmmrt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 47, null);
    }

    public static final ResponseData gGvvIC(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public final AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, java.util.List<CoinMetaBean>>>> copydefault(final java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Long>> map) {
        C10856bwO.copydefault(this.copydefault, 0, "loadFullAssetCoins");
        AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bxi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10862bwU.EZpvd(map);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.KWHzl(this.OLrzqt, (java.util.HashMap) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXAEQbTJ.KWHzl(new InterfaceC58229yxO() { // from class: o.bxo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.fvQaOB(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.OLrzqt((kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.Map<java.lang.String, java.util.List<CoinMetaBean>>>> abstractC58185ywXAEQbTJ2 = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.flVtFt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ2, "");
        return abstractC58185ywXAEQbTJ2;
    }

    public static final java.util.HashMap EZpvd(java.util.Map map) {
        java.util.HashMap map2 = new java.util.HashMap();
        for (Map.Entry entry : map.entrySet()) {
            java.util.Iterator it = ((java.lang.Iterable) entry.getValue()).iterator();
            while (it.hasNext()) {
                java.lang.Long lValueOf = java.lang.Long.valueOf(((java.lang.Number) it.next()).longValue());
                java.lang.Object arrayList = map2.get(lValueOf);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    map2.put(lValueOf, arrayList);
                }
                ((java.util.ArrayList) arrayList).add(entry.getKey());
            }
        }
        return map2;
    }

    public static final InterfaceC60096zvd fvQaOB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C10862bwU c10862bwU, final java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.Set<java.lang.Long> setKeySet = map.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        int i = 0;
        for (java.lang.Long l : setKeySet) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            java.lang.Object arrayList = map2.get(numValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                map2.put(numValueOf, arrayList);
            }
            ((java.util.ArrayList) arrayList).add(l);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) map2.get(java.lang.Integer.valueOf(i));
            if (arrayList2 != null && arrayList2.size() == 500) {
                i++;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXOLrzqt = c10862bwU.fetchVPNInfo.OLrzqt((java.util.List<java.lang.Long>) ((Map.Entry) it.next()).getValue());
            final Function1 function1 = new Function1() { // from class: o.bxw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10862bwU.djBIcL((java.lang.Throwable) obj);
                }
            };
            arrayList3.add(abstractC58185ywXOLrzqt.djBIcL(new InterfaceC58229yxO() { // from class: o.bxy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10862bwU.gasjUx(function1, obj);
                }
            }));
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = C11607cUn.copydefault((java.util.List) arrayList3);
        final Function1 function12 = new Function1() { // from class: o.bxD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.EZpvd(map, (java.util.List) obj);
            }
        };
        return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.giSNqX(function12, obj);
            }
        });
    }

    public static final ResponseData djBIcL(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 47, null);
    }

    public static final ResponseData gasjUx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final kotlin.Pair giSNqX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final kotlin.Pair EZpvd(java.util.HashMap map, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56390yDp.OLrzqt(map, list);
    }

    public static final ResponseData flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData OLrzqt(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        java.util.HashMap map = (java.util.HashMap) pair.getFirst();
        java.util.List list = (java.util.List) pair.getSecond();
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ResponseData) it.next()).getCode() != 0) {
                    return new ResponseData(0, null, null, null, null, null, 47, null);
                }
            }
        }
        java.util.HashMap map2 = new java.util.HashMap();
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            java.util.List<CoinMetaBean> list2 = (java.util.List) ((ResponseData) it2.next()).getData();
            if (list2 != null) {
                for (CoinMetaBean coinMetaBean : list2) {
                    java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) map.get(java.lang.Long.valueOf(coinMetaBean.getCoinId()));
                    if (arrayList != null) {
                        for (java.lang.String str : arrayList) {
                            if (map2.get(str) == null) {
                                map2.put(str, new java.util.ArrayList());
                            }
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) map2.get(str);
                            if (arrayList2 != null) {
                                arrayList2.add(coinMetaBean);
                            }
                        }
                    }
                }
            }
        }
        return new ResponseData(0, null, null, null, map2, null, 47, null);
    }

    public final AbstractC58185ywX<java.lang.Boolean> KWHzl() {
        AbstractC58185ywX abstractC58185ywXEZpvd;
        if (SPUtils.getBoolean("wallet_posted_opened_brc20_to_server", false)) {
            abstractC58185ywXEZpvd = AbstractC58185ywX.KWHzl(new java.util.ArrayList());
        } else {
            AbstractC58185ywX<java.util.List<WalletOpenedCoinEntity>> abstractC58185ywXEZpvd2 = this.AYXKKw.EZpvd();
            AbstractC58185ywX<java.util.List<WalletClosedCoinEntity>> abstractC58185ywXAEQbTJ = this.AYXKKw.AEQbTJ();
            final Function2 function2 = new Function2() { // from class: o.bxM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C10862bwU.AEQbTJ(this.AEQbTJ, (java.util.List) obj, (java.util.List) obj2);
                }
            };
            abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXEZpvd2, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.bxO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C10862bwU.EZpvd(function2, obj, obj2);
                }
            });
        }
        final Function1 function1 = new Function1() { // from class: o.bxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.copydefault(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.QfsBiF(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.KWHzl(this.EZpvd, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.bxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.dNCPSb(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return abstractC58185ywXKWHzl2;
    }

    public static final java.util.ArrayList EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.ArrayList) function2.invoke(obj, obj2);
    }

    public static final java.util.ArrayList AEQbTJ(C10862bwU c10862bwU, java.util.List list, java.util.List list2) {
        java.lang.Object obj;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            WalletOpenedCoinEntity walletOpenedCoinEntity = (WalletOpenedCoinEntity) it.next();
            java.util.Iterator it2 = list2.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((WalletClosedCoinEntity) next).getCoinId() == walletOpenedCoinEntity.getCoinId()) {
                    break;
                }
            }
            if (next == null) {
                java.util.Iterator<T> it3 = c10862bwU.EZpvd.fJNWhG().AhwBna().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it3.next();
                    if (((C10854bwM) next2).AhwBna() == walletOpenedCoinEntity.getCoinId()) {
                        obj = next2;
                        break;
                    }
                }
                if (obj == null) {
                    arrayList.add(walletOpenedCoinEntity);
                }
            }
        }
        return arrayList;
    }

    public static final InterfaceC60096zvd QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(C10862bwU c10862bwU, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (arrayList.isEmpty()) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            SPUtils.put("wallet_posted_opened_brc20_to_server", bool);
            return AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(bool, java.lang.Boolean.FALSE));
        }
        java.lang.String strAhwBna = c10862bwU.isConnected.AhwBna();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WalletOpenedCoinEntity walletOpenedCoinEntity = (WalletOpenedCoinEntity) it.next();
            arrayList2.add(new AddCoinReq((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, 0, strAhwBna, walletOpenedCoinEntity.getWalletId(), (java.lang.Integer) null, java.lang.Long.valueOf(walletOpenedCoinEntity.getCoinId()), 79, (DefaultConstructorMarker) null));
        }
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXCopydefault = c10862bwU.copydefault((AbstractC12782ctV) null, arrayList2);
        final Function1 function1 = new Function1() { // from class: o.bxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AEQbTJ((ResponseData) obj);
            }
        };
        return abstractC58185ywXCopydefault.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.QVAiDq(function1, obj);
            }
        });
    }

    public static final kotlin.Pair QVAiDq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd dNCPSb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(C10862bwU c10862bwU, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue() && ((java.lang.Boolean) pair.getSecond()).booleanValue()) {
            return c10862bwU.gEmmrt();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(pair.getFirst());
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public final AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> copydefault(AbstractC12782ctV abstractC12782ctV, final java.util.List<AddCoinReq> list) {
        AbstractC58260yxt abstractC58260yxtCopydefault;
        C10856bwO.copydefault(this.copydefault, 0, "addCustomCoinsExist " + (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null));
        if (abstractC12782ctV == null) {
            AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtKWHzl = this.DbNXlk.KWHzl();
            final Function1 function1 = new Function1() { // from class: o.byn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10862bwU.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
                }
            };
            abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.byo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10862bwU.DTwDnp(function1, obj);
                }
            });
        } else {
            abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Triple(abstractC12782ctV.DbNXlk(), abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb()));
        }
        final Function1 function12 = new Function1() { // from class: o.bys
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.EZpvd(this.OLrzqt, list, (Triple) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.byp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.QbewEr(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC58261yxu DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C10862bwU c10862bwU, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtEZpvd = c10862bwU.DbNXlk.EZpvd(false);
            final Function1 function1 = new Function1() { // from class: o.bxC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C10862bwU.KWHzl((AbstractC12782ctV) obj);
                }
            };
            return abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.bxB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C10862bwU.OcIXYQ(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(new Triple("00D7E6E1-4124-4E8F-9473-3E966D26665C", "4a6bf6c5e461341e16f25be7207c4575595a49a3c1d572f4cb47f54b99b83bff", "03ecc3999dd47e2ea8105b767305abfaf1d65b111f250e2b6d947409123405d68c"));
    }

    public static final Triple OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Triple) function1.invoke(obj);
    }

    public static final Triple KWHzl(AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new Triple(abstractC12782ctV.DbNXlk(), abstractC12782ctV.USBtdM(), abstractC12782ctV.aUsmxb());
    }

    public static final InterfaceC60096zvd EZpvd(final C10862bwU c10862bwU, java.util.List list, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        java.lang.String str = (java.lang.String) triple.component1();
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXKWHzl = c10862bwU.fetchVPNInfo.KWHzl((java.lang.String) triple.component2(), str, (java.util.List<AddCoinReq>) list, (java.lang.String) triple.component3());
        final Function1 function1 = new Function1() { // from class: o.bwR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.AhwBna((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<ResponseData<java.util.List<CoinMetaBean>>> abstractC58185ywXDjBIcL = abstractC58185ywXKWHzl.djBIcL(new InterfaceC58229yxO() { // from class: o.bxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.ORxRYg(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bxp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.valueOf(this.copydefault, (ResponseData) obj);
            }
        };
        return abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.QUSxYX(function12, obj);
            }
        });
    }

    public static final InterfaceC60096zvd QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final ResponseData ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public static final ResponseData AhwBna(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return new ResponseData(0, null, null, null, null, null, 47, null);
    }

    public static final ResponseData QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.lang.Boolean> copydefault(boolean z) {
        C10856bwO.copydefault(this.copydefault, 0, "updateAllFullAssetCoins isInit:" + z);
        java.lang.Long l = SPUtils.getLong("wallet_refresh_full_asset_coin_time", 0L);
        if (l != null && l.longValue() == 0) {
            SPUtils.put("wallet_refresh_full_asset_coin_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        if (z) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            Intrinsics.copydefault(l);
            if (jCurrentTimeMillis - l.longValue() > 3600000) {
                AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtAhwBna = this.DbNXlk.AhwBna();
                final Function1 function1 = new Function1() { // from class: o.byi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10862bwU.EZpvd(this.OLrzqt, (java.util.List) obj);
                    }
                };
                AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.byk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10862bwU.AxsJAYsNCnLh(function1, obj);
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.byl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10862bwU.AEQbTJ(this.OLrzqt, (java.util.HashMap) obj);
                    }
                };
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58260yxtCopydefault.KWHzl((InterfaceC58229yxO<? super R, ? extends InterfaceC60096zvd<? extends R>>) new InterfaceC58229yxO() { // from class: o.bym
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C10862bwU.ODWQjV(function12, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
                return abstractC58185ywXKWHzl;
            }
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final java.util.HashMap AxsJAYsNCnLh(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.HashMap) function1.invoke(obj);
    }

    public static final java.util.HashMap EZpvd(C10862bwU c10862bwU, java.util.List list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.HashMap map = new java.util.HashMap();
        for (Map.Entry<java.lang.String, java.util.ArrayList<C10854bwM>> entry : c10862bwU.EZpvd.fJNWhG().values().entrySet()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((WalletEntity) next).getId(), (java.lang.Object) entry.getKey())) {
                    break;
                }
            }
            if (next != null) {
                java.lang.String key = entry.getKey();
                if (map.get(key) == null) {
                    java.util.ArrayList<C10854bwM> value = entry.getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
                    java.util.Iterator<T> it2 = value.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(java.lang.Long.valueOf(((C10854bwM) it2.next()).AhwBna()));
                    }
                    map.put(key, arrayList);
                }
            }
        }
        return map;
    }

    public static final InterfaceC60096zvd ODWQjV(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(final C10862bwU c10862bwU, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bwX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return C10862bwU.AhwBna(this.AEQbTJ);
                }
            });
        }
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = c10862bwU.OLrzqt(true, (java.util.Map<java.lang.String, ? extends java.util.List<java.lang.Long>>) map);
        final Function1 function1 = new Function1() { // from class: o.bxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10862bwU.copydefault((java.lang.Boolean) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bxb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10862bwU.DAIeex(function1, obj);
            }
        });
    }

    public static final java.lang.Boolean AhwBna(C10862bwU c10862bwU) {
        c10862bwU.KWHzl.copydefault();
        c10862bwU.EZpvd.fJNWhG().values().clear();
        return java.lang.Boolean.TRUE;
    }

    public static final java.lang.Boolean DAIeex(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean copydefault(java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (bool.booleanValue()) {
            SPUtils.put("wallet_refresh_full_asset_coin_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        return bool;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final java.util.List<CoinMetaBean> copydefault(java.io.InputStream inputStream) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            java.io.InputStream inputStreamCopydefault = this.AEQbTJ.copydefault(inputStream);
            try {
                Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
                jsonAEQbTJ.getSerializersModule();
                java.util.List list = (java.util.List) JvmStreamsKt.decodeFromStream(jsonAEQbTJ, new ArrayListSerializer(CoinMetaBean.Companion.serializer()), inputStreamCopydefault);
                yFA.copydefault(inputStreamCopydefault, null);
                objM7377constructorimpl = Result.m7377constructorimpl(list);
            } finally {
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C10856bwO.copydefault(this.copydefault, 0, "unZipAndParseCoins  error: " + thM7380exceptionOrNullimpl.getMessage());
        }
        return (java.util.List) (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) == null ? objM7377constructorimpl : null);
    }

    public final AbstractC58185ywX<Unit> AEQbTJ(final java.lang.String str, final java.util.List<CoinMetaBean> list) {
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.bxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10862bwU.KWHzl(list, this, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit KWHzl(java.util.List list, C10862bwU c10862bwU, java.lang.String str) {
        if (list != null && !list.isEmpty() && (!c10862bwU.KWHzl.EZpvd(list).isEmpty())) {
            c10862bwU.OLrzqt(str);
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<Unit> AEQbTJ(final boolean z, final java.util.Map<java.lang.String, ? extends java.util.List<CoinMetaBean>> map) {
        AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.byj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C10862bwU.OLrzqt(map, this, z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final Unit OLrzqt(java.util.Map map, C10862bwU c10862bwU, boolean z) {
        if (map != null && !map.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                for (CoinMetaBean coinMetaBean : (java.util.List) entry.getValue()) {
                    coinMetaBean.setCoinCategory(2);
                    arrayList.add(new FullAssetCoinRelationEntity(str, coinMetaBean.getCoinId()));
                    arrayList2.add(coinMetaBean);
                }
            }
            c10862bwU.KWHzl.KWHzl(z, arrayList, arrayList2);
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String copydefault() {
        java.lang.String string = SPUtils.getString("wallet_coin_cdn_url_mdf", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void OLrzqt(java.lang.String str) {
        SPUtils.put("wallet_coin_cdn_url_mdf", str);
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("wallet_add_new_custom_coin", java.lang.Boolean.valueOf(z));
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("wallet_add_new_custom_coin", false);
    }

    public final long EZpvd() {
        java.lang.Long l = SPUtils.getLong("wallet_add_new_custom_coin_time", 0L);
        Intrinsics.checkNotNullExpressionValue(l, "");
        return l.longValue();
    }

    public final void fetchVPNInfo() {
        SPUtils.put("wallet_add_new_custom_coin_time", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final boolean valueOf() {
        return SPUtils.getBoolean("wallet_first_upgrade_to_full_asset_coin_new", true);
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.put("wallet_first_upgrade_to_full_asset_coin_new", java.lang.Boolean.valueOf(z));
    }

    public static final InterfaceC60096zvd gEmmrt(C10862bwU c10862bwU, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            return c10862bwU.gEmmrt();
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.FALSE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final ResponseData KWHzl(boolean z, Ref.BooleanRef booleanRef, C10862bwU c10862bwU, Ref.BooleanRef booleanRef2, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && !z) {
            if (booleanRef.element) {
                c10862bwU.EZpvd(false);
            }
            if (booleanRef2.element) {
                c10862bwU.fetchVPNInfo();
            }
        }
        return responseData;
    }

    public static final kotlin.Pair AEQbTJ(ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            SPUtils.put("wallet_posted_opened_brc20_to_server", bool);
            return C56390yDp.OLrzqt(bool, bool);
        }
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        return C56390yDp.OLrzqt(bool2, bool2);
    }

    public static final ResponseData valueOf(C10862bwU c10862bwU, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            c10862bwU.EZpvd(true);
        }
        return responseData;
    }
}
