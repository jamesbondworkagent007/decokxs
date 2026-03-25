package o;

import com.google.gson.Gson;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.wallet.OneKeyHardwareData;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import com.okinc.wallet.core.keypair.KeyPair;
import com.okinc.wallet.core.keypair.KeyPairParams;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import o.C12821cuH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cyt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13071cyt extends AbstractC12984cxL {
    public final xZW AYXKKw;
    public final C10948byA EZpvd;
    public final C8322bAY KWHzl;
    public final C11495cQj djBIcL;
    public final xYP valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C13071cyt() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String copydefault(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:o.byA:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.byA:0x0006: INVOKE (wrap:o.byG:0x0004: SGET  A[WRAPPED] (LINE:43) o.byG.EZpvd o.byG) VIRTUAL call: o.byG.valueOf():o.byA A[MD:():o.byA (m), WRAPPED] (LINE:43)) : (r5v0 o.byA))
  (wrap:o.bAY:0x0010: TERNARY null = ((wrap:int:0x000a: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bAY:0x000e: SGET  A[WRAPPED] (LINE:44) o.bAY.KWHzl o.bAY) : (r6v0 o.bAY))
  (wrap:o.xYP:0x0017: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xYP:0x0015: SGET  A[WRAPPED] (LINE:45) o.xYP.AEQbTJ o.xYP) : (r7v0 o.xYP))
  (wrap:o.xZW:0x001e: TERNARY null = ((wrap:int:0x0018: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.xZW:0x001c: SGET  A[WRAPPED] (LINE:46) o.xZW.EZpvd o.xZW) : (r8v0 o.xZW))
  (wrap:o.cQM:0x0031: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQM:0x002d: INVOKE 
  (wrap:o.dKx:0x0029: INVOKE 
  (wrap:android.app.Application:0x0025: INVOKE (wrap:o.baC$Activity:0x0023: SGET  A[WRAPPED] (LINE:47) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:47))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:47))
 INTERFACE call: o.dKx.QKVWgx():o.cQM A[MD:():o.cQM (m), WRAPPED] (LINE:47)) : (r9v0 o.cQM))
  (wrap:o.cQj:?: TERNARY null = ((wrap:int:0x0032: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cQj:0x0040: INVOKE 
  (wrap:o.dKx:0x003c: INVOKE 
  (wrap:android.app.Application:0x0038: INVOKE (wrap:o.baC$Activity:0x0036: SGET  A[WRAPPED] (LINE:48) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:48))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:48))
 INTERFACE call: o.dKx.AuCTelauCTel():o.cQj A[MD:():o.cQj (m), WRAPPED] (LINE:48)) : (r10v0 o.cQj))
 A[MD:(o.byA, o.bAY, o.xYP, o.xZW, o.cQM, o.cQj):void (m)] (LINE:42) call: o.cyt.<init>(o.byA, o.bAY, o.xYP, o.xZW, o.cQM, o.cQj):void type: THIS */
    public /* synthetic */ C13071cyt(C10948byA c10948byA, C8322bAY c8322bAY, xYP xyp, xZW xzw, cQM cqm, C11495cQj c11495cQj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10954byG.EZpvd.valueOf() : c10948byA, (i & 2) != 0 ? C8322bAY.KWHzl : c8322bAY, (i & 4) != 0 ? xYP.AEQbTJ : xyp, (i & 8) != 0 ? xZW.EZpvd : xzw, (i & 16) != 0 ? C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).QKVWgx() : cqm, (i & 32) != 0 ? C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).AuCTelauCTel() : c11495cQj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13071cyt(@NotNull C10948byA c10948byA, @NotNull C8322bAY c8322bAY, @NotNull xYP xyp, @NotNull xZW xzw, @NotNull cQM cqm, @NotNull C11495cQj c11495cQj) {
        super(null, null, cqm, 3, null);
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(c8322bAY, "");
        Intrinsics.checkNotNullParameter(xyp, "");
        Intrinsics.checkNotNullParameter(xzw, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(c11495cQj, "");
        this.EZpvd = c10948byA;
        this.KWHzl = c8322bAY;
        this.valueOf = xyp;
        this.AYXKKw = xzw;
        this.djBIcL = c11495cQj;
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, final int i2, @NotNull final java.util.List<ChainAddress> list, @NotNull final C13854daT c13854daT) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c13854daT, "");
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtEZpvd = EZpvd().EZpvd(c13854daT.AYXKKw(), c13854daT.copydefault(), WalletType.HardwareWallet.ordinal());
        final Function1 function1 = new Function1() { // from class: o.czi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.KWHzl(str, i, this, i2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.czj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.QVAiDq(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.czf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.OLrzqt(this.copydefault, list, str2, i2, c13854daT, (C12786ctZ) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.czh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.UeEOUB(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cyw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.OLrzqt(this.AEQbTJ, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cyx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.QUSxYX(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu QVAiDq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(java.lang.String str, int i, final C13071cyt c13071cyt, final int i2, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return AbstractC58260yxt.copydefault(new C12786ctZ(null, str, WalletType.HardwareWallet, 0L, 0, i, 25, null));
        }
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtFetchVPNInfo = c13071cyt.EZpvd().fetchVPNInfo(((cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getNewProxyInstance());
        final Function1 function1 = new Function1() { // from class: o.cyN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.OLrzqt(this.copydefault, list, i2, (java.util.List) obj);
            }
        };
        return abstractC58260yxtFetchVPNInfo.copydefault(new InterfaceC58229yxO() { // from class: o.cyL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.QbewEr(function1, obj);
            }
        });
    }

    public static final C12786ctZ QbewEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12786ctZ) function1.invoke(obj);
    }

    public static final C12786ctZ OLrzqt(C13071cyt c13071cyt, java.util.List list, int i, java.util.List list2) throws WalletImportError {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WalletEntity) next).getAddressIndex() == i) {
                break;
            }
        }
        if (next != null) {
            c13071cyt.KWHzl().AEQbTJ("HardwareWalletCreateManager", "createKeystoneWallet");
            throw WalletImportError.Companion.AEQbTJ();
        }
        Intrinsics.copydefault(list);
        return ((cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).copydefault();
    }

    public static final C12821cuH UeEOUB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH OLrzqt(C13071cyt c13071cyt, java.util.List list, java.lang.String str, int i, C13854daT c13854daT, C12786ctZ c12786ctZ) {
        Intrinsics.checkNotNullParameter(c12786ctZ, "");
        xZW xzw = c13071cyt.AYXKKw;
        java.lang.String json = new Gson().toJson(list);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.String strEZpvd = xzw.EZpvd(json);
        KeyPair keyPairOLrzqt = c13071cyt.valueOf.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, strEZpvd, false, 3, (DefaultConstructorMarker) null));
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        java.lang.String pubKey = keyPairOLrzqt.getPubKey();
        java.lang.String prvKey = keyPairOLrzqt.getPrvKey();
        c13854daT.OLrzqt(c12786ctZ.AEQbTJ());
        Unit unit = Unit.INSTANCE;
        C12821cuH c12821cuHEZpvd = actionBar.EZpvd(str, i, c12786ctZ, strEZpvd, pubKey, prvKey, (192 & 64) != 0 ? new java.util.ArrayList() : null, (192 & 128) != 0 ? new java.util.ArrayList() : null, (192 & 256) != 0 ? null : c13854daT);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ChainAddress chainAddress = (ChainAddress) it.next();
            long coinId = chainAddress.getCoinId();
            C10854bwM c10854bwMCopydefault = c13071cyt.EZpvd.copydefault();
            if (c10854bwMCopydefault != null && coinId == c10854bwMCopydefault.AhwBna()) {
                if (chainAddress.getAddressType() == c13071cyt.KWHzl.KWHzl(0L, false)) {
                    c12821cuHEZpvd.AYXKKw().add(new ChainAddressEntity(c12821cuHEZpvd.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                }
                c12821cuHEZpvd.AuCTel().add(new ChainAddressSegWitEntity(c12821cuHEZpvd.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddressType(), chainAddress.getAddress(), chainAddress.getPublicKey(), chainAddress.getDerivePath()));
            } else {
                C10854bwM c10854bwMIsConnected = c13071cyt.EZpvd.isConnected();
                if (c10854bwMIsConnected == null || coinId != c10854bwMIsConnected.AhwBna()) {
                    c12821cuHEZpvd.AYXKKw().add(new ChainAddressEntity(c12821cuHEZpvd.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                } else {
                    java.util.Iterator<T> it2 = c13071cyt.EZpvd.DbNXlk().iterator();
                    while (it2.hasNext()) {
                        c12821cuHEZpvd.AYXKKw().add(new ChainAddressEntity(c12821cuHEZpvd.AhwBna(), ((C10854bwM) it2.next()).AhwBna(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                    }
                }
            }
        }
        return c12821cuHEZpvd;
    }

    public static final InterfaceC58261yxu QUSxYX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C13071cyt c13071cyt, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13071cyt, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cyA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.gEmmrt(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cyE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.RJOkX(function1, obj);
            }
        });
    }

    public static final java.lang.String RJOkX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String gEmmrt(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, final int i2, @NotNull final java.util.List<ChainAddress> list, @NotNull final C13854daT c13854daT) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c13854daT, "");
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtEZpvd = EZpvd().EZpvd(c13854daT.AYXKKw(), c13854daT.copydefault(), WalletType.HardwareWallet.ordinal());
        final Function1 function1 = new Function1() { // from class: o.cyX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.OLrzqt(str, i, this, c13854daT, i2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.cyZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.dvKsVJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cyY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.AEQbTJ(this.OLrzqt, list, str2, i2, c13854daT, (C12786ctZ) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cyW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.fFgQHt(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.czb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.AYXKKw(this.AEQbTJ, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.czd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.flVtFt(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu dvKsVJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final C12786ctZ finit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12786ctZ) function1.invoke(obj);
    }

    public static final C12786ctZ AhwBna(C13071cyt c13071cyt, java.util.List list, int i, java.util.List list2) throws WalletImportError {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((WalletEntity) next).getAddressIndex() == i) {
                break;
            }
        }
        if (next != null) {
            c13071cyt.KWHzl().AEQbTJ("HardwareWalletCreateManager", "createOneKeyWallet");
            throw WalletImportError.Companion.AEQbTJ();
        }
        return ((cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).copydefault();
    }

    public static final C12821cuH fFgQHt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cuH.ActionBar.newOneKeyWallet$default(o.cuH$ActionBar, java.lang.String, int, o.ctZ, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, o.daT, int, java.lang.Object):o.cuH */
    public static final C12821cuH AEQbTJ(C13071cyt c13071cyt, java.util.List list, java.lang.String str, int i, C13854daT c13854daT, C12786ctZ c12786ctZ) {
        Intrinsics.checkNotNullParameter(c12786ctZ, "");
        xZW xzw = c13071cyt.AYXKKw;
        java.lang.String json = new Gson().toJson(list);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.String strEZpvd = xzw.EZpvd(json);
        KeyPair keyPairOLrzqt = c13071cyt.valueOf.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, strEZpvd, false, 3, (DefaultConstructorMarker) null));
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        java.lang.String pubKey = keyPairOLrzqt.getPubKey();
        java.lang.String prvKey = keyPairOLrzqt.getPrvKey();
        c13854daT.OLrzqt(c12786ctZ.AEQbTJ());
        Unit unit = Unit.INSTANCE;
        C12821cuH c12821cuHCopydefault = actionBar.copydefault(str, i, c12786ctZ, strEZpvd, pubKey, prvKey, (192 & 64) != 0 ? new java.util.ArrayList() : null, (192 & 128) != 0 ? new java.util.ArrayList() : null, (192 & 256) != 0 ? null : c13854daT);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ChainAddress chainAddress = (ChainAddress) it.next();
            long coinId = chainAddress.getCoinId();
            C10854bwM c10854bwMCopydefault = c13071cyt.EZpvd.copydefault();
            if (c10854bwMCopydefault != null && coinId == c10854bwMCopydefault.AhwBna()) {
                if (chainAddress.getAddressType() == c13071cyt.KWHzl.KWHzl(0L, false)) {
                    c12821cuHCopydefault.AYXKKw().add(new ChainAddressEntity(c12821cuHCopydefault.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                }
                c12821cuHCopydefault.AuCTel().add(new ChainAddressSegWitEntity(c12821cuHCopydefault.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddressType(), chainAddress.getAddress(), chainAddress.getPublicKey(), chainAddress.getDerivePath()));
            } else {
                c12821cuHCopydefault.AYXKKw().add(new ChainAddressEntity(c12821cuHCopydefault.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
            }
        }
        return c12821cuHCopydefault;
    }

    public static final InterfaceC58261yxu flVtFt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(C13071cyt c13071cyt, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13071cyt, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.AYXKKw(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cyV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.dxcTrN(function1, obj);
            }
        });
    }

    public static final java.lang.String dxcTrN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String AYXKKw(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, final int i2, @NotNull final java.util.List<ChainAddress> list, @NotNull final C13854daT c13854daT) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c13854daT, "");
        pUU.OLrzqt(">>>ledger createLedgerWallet rootWalletName:" + str + "   createIndex:" + i + " - walletName:" + str2 + " - addressIndex:" + i2 + " - hardwareUniqueId:" + c13854daT);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtEZpvd = EZpvd().EZpvd(c13854daT.AYXKKw(), c13854daT.copydefault(), WalletType.HardwareWallet.ordinal());
        final Function1 function1 = new Function1() { // from class: o.cyy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.AEQbTJ(str, i, this, c13854daT, i2, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtEZpvd.OLrzqt(new InterfaceC58229yxO() { // from class: o.cyz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.aKErDB(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cyJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.KWHzl(str2, i2, c13854daT, list, this, (C12786ctZ) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cyU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.dNCPSb(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cza
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.KWHzl(this.AEQbTJ, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.czg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.fZBcTu(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu aKErDB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(java.lang.String str, int i, final C13071cyt c13071cyt, C13854daT c13854daT, final int i2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.OLrzqt(">>>ledger createLedgerWallet walletDao.queryHardwareRootWalletView list:" + list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            cSX csx = (cSX) it.next();
            pUU.OLrzqt(">>>ledger createLedgerWallet root:" + csx.uzCIH() + " - hardwareUniqueId:" + csx.fIwbmz() + " - hardwareType:" + csx.fARcdN() + " - hardwareSystem:" + csx.fJNWhG());
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (Intrinsics.EZpvd((java.lang.Object) ((cSX) obj).fIwbmz(), (java.lang.Object) c13854daT.AYXKKw())) {
                arrayList.add(obj);
            }
        }
        pUU.OLrzqt(">>>ledger createLedgerWallet rootWallets filtered:" + arrayList.size());
        if (arrayList.isEmpty()) {
            return AbstractC58260yxt.copydefault(new C12786ctZ(null, str, WalletType.HardwareWallet, 0L, 0, i, 25, null));
        }
        java.lang.String newProxyInstance = ((cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getNewProxyInstance();
        pUU.OLrzqt(">>>ledger createLedgerWallet rootWallets exist:" + newProxyInstance + " ");
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtFetchVPNInfo = c13071cyt.EZpvd().fetchVPNInfo(newProxyInstance);
        final Function1 function1 = new Function1() { // from class: o.cyS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C13071cyt.EZpvd(this.KWHzl, arrayList, i2, (java.util.List) obj2);
            }
        };
        return abstractC58260yxtFetchVPNInfo.copydefault(new InterfaceC58229yxO() { // from class: o.cyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C13071cyt.djSkpj(function1, obj2);
            }
        });
    }

    public static final C12786ctZ djSkpj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12786ctZ) function1.invoke(obj);
    }

    public static final C12821cuH dNCPSb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH KWHzl(java.lang.String str, int i, C13854daT c13854daT, java.util.List list, C13071cyt c13071cyt, C12786ctZ c12786ctZ) {
        Intrinsics.checkNotNullParameter(c12786ctZ, "");
        pUU.OLrzqt(">>>ledger createLedgerWallet convertToRootWalletEntityBean rootWallet:" + c12786ctZ);
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        c13854daT.OLrzqt(c12786ctZ.AEQbTJ());
        Unit unit = Unit.INSTANCE;
        C12821cuH c12821cuHAEQbTJ = actionBar.AEQbTJ(str, i, c12786ctZ, "", "", "", (192 & 64) != 0 ? new java.util.ArrayList() : null, (192 & 128) != 0 ? new java.util.ArrayList() : null, (192 & 256) != 0 ? null : c13854daT);
        pUU.OLrzqt(">>>ledger createLedgerWallet wallet:" + c12821cuHAEQbTJ);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ChainAddress chainAddress = (ChainAddress) it.next();
            pUU.OLrzqt(">>>ledger createLedgerWallet chainAddress:" + chainAddress);
            C10854bwM c10854bwMKWHzl = c13071cyt.EZpvd.KWHzl(chainAddress.getCoinId());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.DsrFlB()) {
                if (chainAddress.getAddressType() == c13071cyt.KWHzl.KWHzl(c10854bwMKWHzl.fetchVPNInfo(), true)) {
                    pUU.OLrzqt(">>>ledger createLedgerWallet chainAddress:" + chainAddress);
                    c12821cuHAEQbTJ.AYXKKw().add(new ChainAddressEntity(c12821cuHAEQbTJ.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                }
                c12821cuHAEQbTJ.AuCTel().add(new ChainAddressSegWitEntity(c12821cuHAEQbTJ.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddressType(), chainAddress.getAddress(), chainAddress.getPublicKey(), chainAddress.getDerivePath()));
            } else {
                c12821cuHAEQbTJ.AYXKKw().add(new ChainAddressEntity(c12821cuHAEQbTJ.AhwBna(), chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
            }
        }
        ChainAddressEntity chainAddressEntity = (ChainAddressEntity) CollectionsKt___CollectionsKt.firstOrNull(c12821cuHAEQbTJ.AYXKKw());
        java.lang.String address = chainAddressEntity != null ? chainAddressEntity.getAddress() : null;
        java.lang.String str2 = address != null ? address : "";
        KeyPair keyPairOLrzqt = c13071cyt.valueOf.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, str2, false, 3, (DefaultConstructorMarker) null));
        c12821cuHAEQbTJ.OLrzqt(str2);
        c12821cuHAEQbTJ.AEQbTJ(keyPairOLrzqt.getPrvKey());
        c12821cuHAEQbTJ.copydefault(keyPairOLrzqt.getPubKey());
        pUU.OLrzqt(">>>ledger createLedgerWallet wallet after add:" + c12821cuHAEQbTJ);
        return c12821cuHAEQbTJ;
    }

    public static final InterfaceC58261yxu fZBcTu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C13071cyt c13071cyt, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13071cyt, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.AhwBna(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cyO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.RcXXUw(function1, obj);
            }
        });
    }

    public static final java.lang.String RcXXUw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String AhwBna(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public static final InterfaceC58261yxu QfsBiF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C13071cyt c13071cyt, java.util.ArrayList arrayList, final java.lang.String str, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtEZpvd = c13071cyt.EZpvd().EZpvd(arrayList, str, arrayList2);
        final Function1 function1 = new Function1() { // from class: o.cyB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.copydefault((java.util.List) obj);
            }
        };
        arrayList5.add(abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cyF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.ORxRYg(function1, obj);
            }
        }));
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtOLrzqt = c13071cyt.EZpvd().OLrzqt(arrayList3);
        final Function1 function12 = new Function1() { // from class: o.cyD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.EZpvd((java.util.List) obj);
            }
        };
        arrayList5.add(abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cyC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.OcIXYQ(function12, obj);
            }
        }));
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = c13071cyt.djBIcL.copydefault(arrayList4);
        final Function1 function13 = new Function1() { // from class: o.cyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.djBIcL((java.util.List) obj);
            }
        };
        arrayList5.add(abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cyH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.QOLQEE(function13, obj);
            }
        }));
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList5);
        final Function1 function14 = new Function1() { // from class: o.cyI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.copydefault(str, (java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cyG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.DTwDnp(function14, obj);
            }
        });
    }

    public static final java.lang.Integer ORxRYg(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer OcIXYQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer QOLQEE(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer djBIcL(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.String DTwDnp(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> EZpvd(long j, @NotNull java.util.List<ChainAddress> list, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull final java.lang.String str) {
        java.util.Iterator it;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        C13071cyt c13071cyt = this;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ChainAddress) it2.next()).getAddress());
        }
        C10856bwO.copydefault("HardwareWalletCreateManager", 0, "addNewChainToHardwareWallet  chainAddresses=" + arrayList3);
        C10854bwM c10854bwMKWHzl = c13071cyt.EZpvd.KWHzl(j);
        if (c10854bwMKWHzl == null) {
            KWHzl().EZpvd("HardwareWalletCreateManager", WalletType.HardwareWallet, "chainMeta is null. chainId=" + j, CreateOrImportType.IMPORT_WALLET, "addNewChainToHardwareWallet");
            AbstractC58260yxt<java.lang.String> abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(WalletImportError.Companion.isConnected());
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ, "");
            return abstractC58260yxtAEQbTJ;
        }
        final java.util.ArrayList arrayList4 = new java.util.ArrayList();
        final java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        if (c10854bwMKWHzl.DsrFlB()) {
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ChainAddress chainAddress = (ChainAddress) it3.next();
                if (chainAddress.getAddressType() == c13071cyt.KWHzl.KWHzl(c10854bwMKWHzl.fetchVPNInfo(), true)) {
                    it = it3;
                    str2 = str3;
                    arrayList = arrayList7;
                    arrayList2 = arrayList6;
                    arrayList5.add(new ChainAddressEntity(str, chainAddress.getCoinId(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                } else {
                    it = it3;
                    str2 = str3;
                    arrayList = arrayList7;
                    arrayList2 = arrayList6;
                }
                arrayList2.add(new ChainAddressSegWitEntity(str, chainAddress.getCoinId(), chainAddress.getAddressType(), chainAddress.getAddress(), chainAddress.getPublicKey(), chainAddress.getDerivePath()));
                arrayList4.add(new C11283cIm(chainAddress.getAddressType(), c10854bwMKWHzl.fetchVPNInfo(), "", null, null, 24, null));
                java.lang.String str4 = map.get(chainAddress.getAddress());
                if (str4 != null) {
                    arrayList.add(new WalletCoinAssetEntity(str, c10854bwMKWHzl.AhwBna(), null, str4, null, null, 0, chainAddress.getAddress(), 0, null, null, null, null, null, null, 32628, null));
                }
                it3 = it;
                arrayList7 = arrayList;
                arrayList6 = arrayList2;
                str3 = str2;
                c13071cyt = this;
            }
        }
        java.lang.String str5 = str3;
        final java.util.ArrayList arrayList8 = arrayList7;
        final java.util.ArrayList arrayList9 = arrayList6;
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtFARcdN = EZpvd().fARcdN(str);
        final Function1 function1 = new Function1() { // from class: o.cze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13071cyt.KWHzl(this.copydefault, arrayList5, str, arrayList4, arrayList9, arrayList8, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtFARcdN.OLrzqt(new InterfaceC58229yxO() { // from class: o.czc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13071cyt.QfsBiF(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, str5);
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu OLrzqt(java.lang.String str, int i, final C13071cyt c13071cyt, C13854daT c13854daT, final int i2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            KSerializer<OneKeyHardwareData> kSerializerSerializer = OneKeyHardwareData.Companion.serializer();
            xZW xzw = c13071cyt.AYXKKw;
            java.lang.String strIsConnected = ((cSX) obj).isConnected();
            if (strIsConnected == null) {
                strIsConnected = "";
            }
            if (Intrinsics.EZpvd((java.lang.Object) c13854daT.valueOf(), (java.lang.Object) ((OneKeyHardwareData) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerSerializer, xzw.copydefault(strIsConnected))).getDeviceId())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return AbstractC58260yxt.copydefault(new C12786ctZ(null, str, WalletType.HardwareWallet, 0L, 0, i, 25, null));
        }
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtFetchVPNInfo = c13071cyt.EZpvd().fetchVPNInfo(((cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).getNewProxyInstance());
        final Function1 function1 = new Function1() { // from class: o.cyM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C13071cyt.AhwBna(this.copydefault, arrayList, i2, (java.util.List) obj2);
            }
        };
        return abstractC58260yxtFetchVPNInfo.copydefault(new InterfaceC58229yxO() { // from class: o.cyR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C13071cyt.finit(function1, obj2);
            }
        });
    }

    public static final C12786ctZ EZpvd(C13071cyt c13071cyt, java.util.List list, int i, java.util.List list2) throws WalletImportError {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list2, "");
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            WalletEntity walletEntity = (WalletEntity) it.next();
            pUU.OLrzqt(">>>ledger createLedgerWallet rootWallets exist wallet:" + walletEntity.getName() + " - chainId:" + walletEntity.getChainId() + " - addressIndex:" + walletEntity.getAddressIndex() + " ");
        }
        java.util.Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((WalletEntity) next).getAddressIndex() == i) {
                break;
            }
        }
        WalletEntity walletEntity2 = (WalletEntity) next;
        pUU.OLrzqt(">>>ledger createLedgerWallet walletAtIndex:" + walletEntity2);
        if (walletEntity2 != null) {
            c13071cyt.KWHzl().AEQbTJ("HardwareWalletCreateManager", "createLedgerWallet");
            throw WalletImportError.Companion.AEQbTJ();
        }
        return ((cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).copydefault();
    }
}
