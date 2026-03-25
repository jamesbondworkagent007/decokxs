package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.gson.GsonBuilder;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.core.wallet.create.impl.WalletCreateManager$checkMnemonicExists$1;
import com.okinc.business.defi.biz.core.wallet.create.impl.WalletCreateManager$checkMnemonicExistsTypes$1;
import com.okinc.business.defi.biz.core.wallet.create.impl.WalletCreateManager$getAddressListByChainId$1;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.model.WalletAddressItem;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.EoaAddress;
import com.okinc.business.defi.wallet.metricsmonitor.CreateOrImportType;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.wallet.api.bean.AddressType;
import com.okinc.wallet.core.keypair.KeyPair;
import com.okinc.wallet.core.keypair.KeyPairParams;
import com.okinc.wallet.core.mpc.CoinAddressBean;
import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.web3.security.bridge.MnemonicKt;
import com.okinc.web3.security.model.Mnemonic;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12821cuH;
import o.C12827cuN;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.czN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13092czN extends AbstractC12984cxL {
    public static final Activity Companion = new Activity(null);
    public final C11010bzJ AhwBna;
    public final java.lang.String EZpvd;
    public final cOG KWHzl;
    public final C11495cQj djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String EZpvd(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt(java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13092czN(@NotNull C13124czt c13124czt, @NotNull cQD cqd, @NotNull cQM cqm, @NotNull C11495cQj c11495cQj, @NotNull cOG cog, @NotNull C11010bzJ c11010bzJ) {
        super(c13124czt, cqd, cqm);
        Intrinsics.checkNotNullParameter(c13124czt, "");
        Intrinsics.checkNotNullParameter(cqd, "");
        Intrinsics.checkNotNullParameter(cqm, "");
        Intrinsics.checkNotNullParameter(c11495cQj, "");
        Intrinsics.checkNotNullParameter(cog, "");
        Intrinsics.checkNotNullParameter(c11010bzJ, "");
        this.djBIcL = c11495cQj;
        this.KWHzl = cog;
        this.AhwBna = c11010bzJ;
        this.EZpvd = "WalletCreateManager";
    }

    /* JADX INFO: renamed from: o.czN$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.czN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C13092czN getInstance$default(Activity activity, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return activity.AEQbTJ(context);
        }

        public final C13092czN AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).sSMYrx();
        }
    }

    public static /* synthetic */ AbstractC58260yxt createHDWallet$default(C13092czN c13092czN, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            str4 = MnemonicKt.MnemonicLanguageEnglish;
        }
        return c13092czN.AEQbTJ(str, i, str2, str3, str4);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createHDWallet  createIndex=" + i);
        AbstractC58260yxt<C12821cuH> abstractC58260yxtKWHzl = KWHzl(new C12786ctZ(null, str, WalletType.HDWallet, 0L, 0, i, 25, null), str2, 0, str3, new Mnemonic(xYS.copydefault.KWHzl(str4), str4, true), true, false, false, false);
        final Function1 function1 = new Function1() { // from class: o.cCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.values(this.copydefault, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.RdAHlO(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu RdAHlO(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String gwTjWJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu values(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.fJNWhG(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.czZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.gwTjWJ(function1, obj);
            }
        });
    }

    public static final java.lang.String fJNWhG(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public static /* synthetic */ AbstractC58260yxt createAccount$default(C13092czN c13092czN, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return c13092czN.AEQbTJ(str, str2, i, str3, z);
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final int i, @NotNull final java.lang.String str3, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createAccount  addressIndex=" + i);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str3);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtValues = EZpvd().values(str);
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtFetchVPNInfo = EZpvd().fetchVPNInfo(str);
        final yHO yho = new yHO() { // from class: o.cAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.copydefault((java.lang.String) obj, (java.util.List) obj2, (java.util.List) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(abstractC58260yxtAhwBna, abstractC58260yxtValues, abstractC58260yxtFetchVPNInfo, new InterfaceC58228yxN() { // from class: o.cAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.AEQbTJ(yho, obj, obj2, obj3);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.AEQbTJ, str2, i, str3, (java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QHmsKR(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.gEmmrt(this.AEQbTJ, z, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QkdxfA(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.util.HashMap AEQbTJ(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (java.util.HashMap) yho.invoke(obj, obj2, obj3);
    }

    public static final java.util.HashMap copydefault(java.lang.String str, java.util.List list, java.util.List list2) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        cSX csx = (cSX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (csx == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        WalletEntity walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list2);
        if (walletEntity == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("passwordHash", str), C56390yDp.OLrzqt("rootWallet", csx), C56390yDp.OLrzqt("existWallet", walletEntity));
    }

    public static final InterfaceC58261yxu QHmsKR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C13092czN c13092czN, java.lang.String str, int i, java.lang.String str2, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("passwordHash");
        Intrinsics.copydefault(obj, "");
        java.lang.Object obj2 = map.get("rootWallet");
        Intrinsics.copydefault(obj2, "");
        cSX csx = (cSX) obj2;
        java.lang.Object obj3 = map.get("existWallet");
        Intrinsics.copydefault(obj3, "");
        WalletEntity walletEntity = (WalletEntity) obj3;
        return c13092czN.KWHzl(new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.HDWallet, csx.KWHzl(), csx.zLjUOn(), csx.AhwBna()), str, i, str2, new Mnemonic(xXW.OLrzqt.AEQbTJ(str2, (java.lang.String) obj, walletEntity.getData(), true), walletEntity.getLanguage(), true), walletEntity.getFromCreate() == 1, C11600cUg.KWHzl(walletEntity.getBackup()), C11600cUg.KWHzl(walletEntity.getCloudBackup()), C11600cUg.KWHzl(walletEntity.getIHuaweiBackup()));
    }

    public static final InterfaceC58261yxu QkdxfA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String RKDWNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(C13092czN c13092czN, boolean z, final C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = c13092czN.copydefault(c12821cuH, z);
        final Function1 function1 = new Function1() { // from class: o.cBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AuCTel(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cBX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.RKDWNf(function1, obj);
            }
        });
    }

    public static final java.lang.String AuCTel(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public static /* synthetic */ AbstractC58260yxt createMPCWalletAccount$default(C13092czN c13092czN, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, boolean z, MpcWalletDecodeInfo mpcWalletDecodeInfo, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = true;
        }
        return c13092czN.OLrzqt(str, str2, str3, i, z, mpcWalletDecodeInfo);
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final int i, final boolean z, @NotNull final MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createMPCWalletAccount  addressIndex=" + i);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtValues = EZpvd().values(str);
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtAuCTel = EZpvd().AuCTel(str);
        final Function2 function2 = new Function2() { // from class: o.cBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.EZpvd((java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtValues, abstractC58260yxtAuCTel, new InterfaceC58223yxI() { // from class: o.cCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.valueOf(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cCv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.copydefault(this.OLrzqt, str2, i, mpcWalletDecodeInfo, str3, (java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.czR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QSLkRj(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cAc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AYXKKw(this.KWHzl, z, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.OxVOHk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.util.HashMap valueOf(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.HashMap) function2.invoke(obj, obj2);
    }

    public static final java.util.HashMap EZpvd(java.util.List list, java.util.List list2) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        cSX csx = (cSX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (csx == null) {
            throw WalletImportError.Companion.EZpvd(2);
        }
        WalletEntity walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list2);
        if (walletEntity == null) {
            throw WalletImportError.Companion.EZpvd(3);
        }
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("rootWallet", csx), C56390yDp.OLrzqt("existWallet", walletEntity));
    }

    public static final InterfaceC58261yxu QSLkRj(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C13092czN c13092czN, java.lang.String str, int i, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str2, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("rootWallet");
        Intrinsics.copydefault(obj, "");
        cSX csx = (cSX) obj;
        java.lang.Object obj2 = map.get("existWallet");
        Intrinsics.copydefault(obj2, "");
        WalletEntity walletEntity = (WalletEntity) obj2;
        return c13092czN.copydefault(new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.MPCWallet, csx.KWHzl(), csx.zLjUOn(), csx.AhwBna()), str, i, mpcWalletDecodeInfo, str2, false, C11600cUg.KWHzl(walletEntity.getBackup()), C11600cUg.KWHzl(walletEntity.getCloudBackup()), C11600cUg.KWHzl(walletEntity.getIHuaweiBackup()));
    }

    public static final InterfaceC58261yxu OxVOHk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AYXKKw(C13092czN c13092czN, boolean z, final C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = c13092czN.copydefault(c12821cuH, z);
        final Function1 function1 = new Function1() { // from class: o.cAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.iwGUEr(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cAg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QVsKAR(function1, obj);
            }
        });
    }

    public static final java.lang.String QVsKAR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String iwGUEr(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    /* JADX DEBUG: Type inference failed for r0v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull MpcWalletDecodeInfo mpcWalletDecodeInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createMPCWallet");
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault = copydefault(new C12786ctZ(null, str, WalletType.MPCWallet, 0L, 0, i, 25, null), str2, 0, mpcWalletDecodeInfo, str3, true, false, false, false);
        final Function1 function1 = new Function1() { // from class: o.cCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.DbNXlk(this.KWHzl, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.OFhtUX(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu OFhtUX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu DbNXlk(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.getFieldNames(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.ODXsMY(function1, obj);
            }
        });
    }

    public static final java.lang.String ODXsMY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String getFieldNames(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull final java.lang.String str2, final int i, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, @NotNull final WalletType walletType, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createSmartAccount  eoaAddress=" + str6);
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str3);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtValues = EZpvd().values(str);
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtFetchVPNInfo = EZpvd().fetchVPNInfo(str);
        final yHO yho = new yHO() { // from class: o.cAI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.KWHzl((java.lang.String) obj, (java.util.List) obj2, (java.util.List) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ = AbstractC58260yxt.AEQbTJ(abstractC58260yxtAhwBna, abstractC58260yxtValues, abstractC58260yxtFetchVPNInfo, new InterfaceC58228yxN() { // from class: o.cAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.djBIcL(yho, obj, obj2, obj3);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt(str3, this, str2, i, str4, str5, str6, walletType, (java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.UlJrfe(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cAO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.djBIcL(this.EZpvd, z, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.aUsmxb(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final java.util.HashMap djBIcL(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (java.util.HashMap) yho.invoke(obj, obj2, obj3);
    }

    public static final java.util.HashMap KWHzl(java.lang.String str, java.util.List list, java.util.List list2) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        cSX csx = (cSX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (csx == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        WalletEntity walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list2);
        if (walletEntity == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("passwordHash", str), C56390yDp.OLrzqt("rootWallet", csx), C56390yDp.OLrzqt("existWallet", walletEntity));
    }

    public static final InterfaceC58261yxu UlJrfe(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(java.lang.String str, C13092czN c13092czN, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, WalletType walletType, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("passwordHash");
        Intrinsics.copydefault(obj, "");
        java.lang.Object obj2 = map.get("rootWallet");
        Intrinsics.copydefault(obj2, "");
        cSX csx = (cSX) obj2;
        java.lang.Object obj3 = map.get("existWallet");
        Intrinsics.copydefault(obj3, "");
        WalletEntity walletEntity = (WalletEntity) obj3;
        return c13092czN.KWHzl(new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.HDWallet, csx.KWHzl(), csx.zLjUOn(), csx.AhwBna()), str2, i, str, new Mnemonic(xXW.OLrzqt.AEQbTJ(str, (java.lang.String) obj, walletEntity.getData(), true), walletEntity.getLanguage(), true), str3, str4, false, str5, walletType, C11600cUg.KWHzl(walletEntity.getBackup()), C11600cUg.KWHzl(walletEntity.getCloudBackup()), C11600cUg.KWHzl(walletEntity.getIHuaweiBackup()));
    }

    public static final InterfaceC58261yxu aUsmxb(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String dUDNAs(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu djBIcL(C13092czN c13092czN, boolean z, final C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = c13092czN.copydefault(c12821cuH, z);
        final Function1 function1 = new Function1() { // from class: o.cBN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.uzCIH(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cBK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.dUDNAs(function1, obj);
            }
        });
    }

    public static final java.lang.String uzCIH(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, @NotNull java.lang.String str3, @NotNull final MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull final java.lang.String str4, @NotNull final WalletType walletType, @NotNull final java.lang.String str5, @NotNull final java.lang.String str6, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createMPCSmartWallet  eoaAddress=" + str4);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtValues = EZpvd().values(str3);
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtAuCTel = EZpvd().AuCTel(str3);
        final Function2 function2 = new Function2() { // from class: o.cBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.AEQbTJ((java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtValues, abstractC58260yxtAuCTel, new InterfaceC58223yxI() { // from class: o.cBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.AYXKKw(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cBe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.AEQbTJ, str, i, mpcWalletDecodeInfo, str2, str4, walletType, str5, str6, (java.util.HashMap) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DLWbHP(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.valueOf(this.copydefault, z, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.hrNTAI(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final java.util.HashMap AYXKKw(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.util.HashMap) function2.invoke(obj, obj2);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.core.error.WalletImportError.Activity.dataError$default(com.okinc.business.defi.biz.core.error.WalletImportError$Activity, java.lang.String, int, int, java.lang.Object):com.okinc.business.defi.biz.core.error.WalletImportError */
    public static final java.util.HashMap AEQbTJ(java.util.List list, java.util.List list2) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        cSX csx = (cSX) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (csx == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        WalletEntity walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(list2);
        if (walletEntity == null) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return C56424yEw.AYXKKw(C56390yDp.OLrzqt("rootWallet", csx), C56390yDp.OLrzqt("existWallet", walletEntity));
    }

    public static final InterfaceC58261yxu DLWbHP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C13092czN c13092czN, java.lang.String str, int i, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str2, java.lang.String str3, WalletType walletType, java.lang.String str4, java.lang.String str5, java.util.HashMap map) {
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.Object obj = map.get("rootWallet");
        Intrinsics.copydefault(obj, "");
        cSX csx = (cSX) obj;
        java.lang.Object obj2 = map.get("existWallet");
        Intrinsics.copydefault(obj2, "");
        WalletEntity walletEntity = (WalletEntity) obj2;
        return c13092czN.copydefault(str, i, new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.MPCWallet, csx.KWHzl(), csx.zLjUOn(), csx.AhwBna()), mpcWalletDecodeInfo, str2, true, str3, walletType, str4, str5, C11600cUg.KWHzl(walletEntity.getBackup()), C11600cUg.KWHzl(walletEntity.getCloudBackup()), C11600cUg.KWHzl(walletEntity.getIHuaweiBackup()));
    }

    public static final InterfaceC58261yxu hrNTAI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String OHqIaq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu valueOf(C13092czN c13092czN, boolean z, final C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = c13092czN.copydefault(c12821cuH, z);
        final Function1 function1 = new Function1() { // from class: o.cAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.ejfBZ(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.cAP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.OHqIaq(function1, obj);
            }
        });
    }

    public static final java.lang.String ejfBZ(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createPrivateKeySmartWallet  eoaAddress=" + str6);
        AbstractC58260yxt<C12821cuH> abstractC58260yxtAEQbTJ = AEQbTJ(str, str2, j, str3, str4, str5, str6, walletType);
        final Function1 function1 = new Function1() { // from class: o.cBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.isConnected(this.KWHzl, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.OJuSTm(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu OJuSTm(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String QCjLjM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu isConnected(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.czQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.hDKMBd(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.czX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QCjLjM(function1, obj);
            }
        });
    }

    public static final java.lang.String hDKMBd(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.String, java.lang.String>> AEQbTJ(@NotNull final java.lang.String str, @NotNull final ChainAddress chainAddress, @NotNull final C13854daT c13854daT, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final WalletType walletType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(c13854daT, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        C10856bwO.copydefault(this.EZpvd, 0, "createHardwareSmartWallet eoaAddress=" + str4);
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtKWHzl = EZpvd().KWHzl(str2, c10854bwMIsConnected != null ? c10854bwMIsConnected.AEQbTJ() : -1L, WalletType.AAWallet.ordinal(), c13854daT.AYXKKw());
        final Function1 function1 = new Function1() { // from class: o.czW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.KWHzl, str, chainAddress, c13854daT, str2, str3, str4, walletType, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.czV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.hBpjJd(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cAa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.fetchVPNInfo(this.copydefault, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.czY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.dHguZz(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu hBpjJd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C13092czN c13092czN, java.lang.String str, ChainAddress chainAddress, C13854daT c13854daT, java.lang.String str2, java.lang.String str3, java.lang.String str4, WalletType walletType, java.util.List list) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            c13092czN.KWHzl().copydefault(c13092czN.EZpvd, WalletType.HardwareWallet, CreateOrImportType.IMPORT_WALLET, "createHardwareSmartWallet");
            throw WalletImportError.Companion.OLrzqt();
        }
        return c13092czN.KWHzl(str, chainAddress, c13854daT, str2, str3, str4, walletType);
    }

    public static final InterfaceC58261yxu dHguZz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final kotlin.Pair dmfpNf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fetchVPNInfo(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.czO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.fARcdN(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.dmfpNf(function1, obj);
            }
        });
    }

    public static final kotlin.Pair fARcdN(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C56390yDp.OLrzqt(c12821cuH.AhwBna(), c12821cuH.fIwbmz().AEQbTJ());
    }

    public final AbstractC58260yxt<EoaAddress> OLrzqt(@NotNull MpcWalletEncodeInfo mpcWalletEncodeInfo, int i, long j) throws WalletImportError {
        Intrinsics.checkNotNullParameter(mpcWalletEncodeInfo, "");
        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(j);
        java.lang.String strIwGUEr = c10854bwMOLrzqt != null ? c10854bwMOLrzqt.iwGUEr() : null;
        java.lang.String str = strIwGUEr == null ? "" : strIwGUEr;
        java.lang.String ecdsaPubkey = mpcWalletEncodeInfo.getEcdsaPubkey();
        java.lang.String ecdsaChainCode = mpcWalletEncodeInfo.getEcdsaChainCode();
        java.lang.String ed25519Pubkey = mpcWalletEncodeInfo.getEd25519Pubkey();
        java.lang.String ed25519ChainCode = mpcWalletEncodeInfo.getEd25519ChainCode();
        WalletAddressList walletAddressList = (WalletAddressList) CollectionsKt___CollectionsKt.firstOrNull(xYQ.KWHzl.OLrzqt(ecdsaPubkey, ecdsaChainCode, ed25519Pubkey, ed25519ChainCode, C56402yEa.EZpvd(new HDWalletCoin(c10854bwMOLrzqt != null ? c10854bwMOLrzqt.QKVWgx() : -1L, c10854bwMOLrzqt != null ? c10854bwMOLrzqt.fetchVPNInfo() : -1L, C13912dbY.copydefault.AhwBna(), AddressType.Legacy.getValue(), i, str))));
        if (walletAddressList == null) {
            C10856bwO.copydefault(this.EZpvd, 0, "MPC wallet Data error 13.");
            throw WalletImportError.Companion.EZpvd(13);
        }
        CoinAddressBean coinAddressBean = (CoinAddressBean) CollectionsKt___CollectionsKt.firstOrNull(walletAddressList.getAddressList());
        if (coinAddressBean == null || coinAddressBean.getAddress().length() == 0 || walletAddressList.getPubKey().length() == 0) {
            throw WalletImportError.Companion.djBIcL();
        }
        AbstractC58260yxt<EoaAddress> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new EoaAddress(coinAddressBean.getAddress(), walletAddressList.getChainId(), walletAddressList.getPubKey(), coinAddressBean.getType()));
        Intrinsics.copydefault(abstractC58260yxtCopydefault);
        return abstractC58260yxtCopydefault;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Exception {
        WalletCreateManager$checkMnemonicExists$1 walletCreateManager$checkMnemonicExists$1;
        C13092czN c13092czN;
        java.lang.String str3;
        java.util.List<WalletEntity> list;
        if (continuation instanceof WalletCreateManager$checkMnemonicExists$1) {
            walletCreateManager$checkMnemonicExists$1 = (WalletCreateManager$checkMnemonicExists$1) continuation;
            int i = walletCreateManager$checkMnemonicExists$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletCreateManager$checkMnemonicExists$1.label = i - Integer.MIN_VALUE;
            } else {
                walletCreateManager$checkMnemonicExists$1 = new WalletCreateManager$checkMnemonicExists$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletCreateManager$checkMnemonicExists$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletCreateManager$checkMnemonicExists$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            cQM cqmEZpvd = EZpvd();
            java.util.List<java.lang.Integer> listGEmmrt = yDY.gEmmrt(C56443yFo.AEQbTJ(WalletType.HDWallet.ordinal()), C56443yFo.AEQbTJ(WalletType.TonWallet.ordinal()));
            walletCreateManager$checkMnemonicExists$1.L$0 = this;
            walletCreateManager$checkMnemonicExists$1.L$1 = str;
            walletCreateManager$checkMnemonicExists$1.L$2 = str2;
            walletCreateManager$checkMnemonicExists$1.label = 1;
            objCopydefault = cqmEZpvd.copydefault(listGEmmrt, walletCreateManager$checkMnemonicExists$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c13092czN = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (java.util.List) walletCreateManager$checkMnemonicExists$1.L$2;
                str2 = (java.lang.String) walletCreateManager$checkMnemonicExists$1.L$1;
                str3 = (java.lang.String) walletCreateManager$checkMnemonicExists$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                java.lang.String str4 = (java.lang.String) objCopydefault;
                if ((list instanceof java.util.Collection) || !list.isEmpty()) {
                    for (WalletEntity walletEntity : list) {
                        C54909xZv c54909xZv = C54909xZv.OLrzqt;
                        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
                        xXW xxw = xXW.OLrzqt;
                        Intrinsics.copydefault((java.lang.Object) str4);
                        if (c54909xZv.copydefault(applicationAEQbTJ, str3, xxw.AEQbTJ(str2, str4, walletEntity.getData(), true))) {
                            break;
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                return C56443yFo.KWHzl(z);
            }
            str2 = (java.lang.String) walletCreateManager$checkMnemonicExists$1.L$2;
            str = (java.lang.String) walletCreateManager$checkMnemonicExists$1.L$1;
            c13092czN = (C13092czN) walletCreateManager$checkMnemonicExists$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List list2 = (java.util.List) objCopydefault;
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c13092czN.AhwBna.AhwBna(str2);
        walletCreateManager$checkMnemonicExists$1.L$0 = str;
        walletCreateManager$checkMnemonicExists$1.L$1 = str2;
        walletCreateManager$checkMnemonicExists$1.L$2 = list2;
        walletCreateManager$checkMnemonicExists$1.label = 2;
        java.lang.Object objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna, walletCreateManager$checkMnemonicExists$1);
        if (objAwait == objCopydefault2) {
            return objCopydefault2;
        }
        str3 = str;
        list = list2;
        objCopydefault = objAwait;
        java.lang.String str42 = (java.lang.String) objCopydefault;
        if (list instanceof java.util.Collection) {
            while (r8.hasNext()) {
            }
            z = false;
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super java.util.List<java.lang.Integer>> continuation) throws java.lang.Exception {
        WalletCreateManager$checkMnemonicExistsTypes$1 walletCreateManager$checkMnemonicExistsTypes$1;
        C13092czN c13092czN;
        java.lang.String str3;
        java.util.List<WalletEntity> list2;
        if (continuation instanceof WalletCreateManager$checkMnemonicExistsTypes$1) {
            walletCreateManager$checkMnemonicExistsTypes$1 = (WalletCreateManager$checkMnemonicExistsTypes$1) continuation;
            int i = walletCreateManager$checkMnemonicExistsTypes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletCreateManager$checkMnemonicExistsTypes$1.label = i - Integer.MIN_VALUE;
            } else {
                walletCreateManager$checkMnemonicExistsTypes$1 = new WalletCreateManager$checkMnemonicExistsTypes$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletCreateManager$checkMnemonicExistsTypes$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletCreateManager$checkMnemonicExistsTypes$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            cQM cqmEZpvd = EZpvd();
            walletCreateManager$checkMnemonicExistsTypes$1.L$0 = this;
            walletCreateManager$checkMnemonicExistsTypes$1.L$1 = str;
            walletCreateManager$checkMnemonicExistsTypes$1.L$2 = str2;
            walletCreateManager$checkMnemonicExistsTypes$1.label = 1;
            objCopydefault = cqmEZpvd.copydefault(list, walletCreateManager$checkMnemonicExistsTypes$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c13092czN = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (java.util.List) walletCreateManager$checkMnemonicExistsTypes$1.L$2;
                str2 = (java.lang.String) walletCreateManager$checkMnemonicExistsTypes$1.L$1;
                str3 = (java.lang.String) walletCreateManager$checkMnemonicExistsTypes$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                java.lang.String str4 = (java.lang.String) objCopydefault;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (WalletEntity walletEntity : list2) {
                    C54909xZv c54909xZv = C54909xZv.OLrzqt;
                    android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
                    xXW xxw = xXW.OLrzqt;
                    Intrinsics.copydefault((java.lang.Object) str4);
                    if (c54909xZv.copydefault(applicationAEQbTJ, str3, xxw.AEQbTJ(str2, str4, walletEntity.getData(), true))) {
                        arrayList.add(C56443yFo.AEQbTJ(walletEntity.getType()));
                    }
                }
                return arrayList;
            }
            str2 = (java.lang.String) walletCreateManager$checkMnemonicExistsTypes$1.L$2;
            str = (java.lang.String) walletCreateManager$checkMnemonicExistsTypes$1.L$1;
            c13092czN = (C13092czN) walletCreateManager$checkMnemonicExistsTypes$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        java.util.List list3 = (java.util.List) objCopydefault;
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c13092czN.AhwBna.AhwBna(str2);
        walletCreateManager$checkMnemonicExistsTypes$1.L$0 = str;
        walletCreateManager$checkMnemonicExistsTypes$1.L$1 = str2;
        walletCreateManager$checkMnemonicExistsTypes$1.L$2 = list3;
        walletCreateManager$checkMnemonicExistsTypes$1.label = 2;
        java.lang.Object objAwait = RxAwaitKt.await(abstractC58260yxtAhwBna, walletCreateManager$checkMnemonicExistsTypes$1);
        if (objAwait == objCopydefault2) {
            return objCopydefault2;
        }
        str3 = str;
        list2 = list3;
        objCopydefault = objAwait;
        java.lang.String str42 = (java.lang.String) objCopydefault;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (r9.hasNext()) {
        }
        return arrayList2;
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C10856bwO.copydefault(this.EZpvd, 0, "importHDWallet  createIndex=" + i);
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtAEQbTJ = EZpvd().AEQbTJ(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.HDWallet.ordinal())));
        final Function1 function1 = new Function1() { // from class: o.cBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.copydefault(this.copydefault, str3, str4, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DCUTEIddSDPG(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.KWHzl(this.AEQbTJ, str, i, str2, str3, str4, str5, z, z2, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cBI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.run(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AkhnZx(this.EZpvd, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.WS(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final InterfaceC58261yxu DCUTEIddSDPG(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final C13092czN c13092czN, final java.lang.String str, final java.lang.String str2, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c13092czN.AhwBna.AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cBW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(list, str2, str, c13092czN, (java.lang.String) obj);
            }
        };
        return abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.zblBkD(function1, obj);
            }
        });
    }

    public static final Unit zblBkD(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.util.List list, java.lang.String str, java.lang.String str2, C13092czN c13092czN, java.lang.String str3) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), str, xXW.OLrzqt.AEQbTJ(str2, str3, ((WalletEntity) it.next()).getData(), true))) {
                c13092czN.KWHzl().copydefault(c13092czN.EZpvd, "importHDWallet");
                throw WalletImportError.Companion.valueOf();
            }
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu run(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C13092czN c13092czN, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c13092czN.KWHzl(new C12786ctZ(null, str, WalletType.HDWallet, 0L, 0, i, 25, null), str2, 0, str3, new Mnemonic(str4, str5, true), false, (z || z2) ? false : true, z, z2);
    }

    public static final InterfaceC58261yxu WS(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cxL.saveWalletAllInfoToDB$default(o.cxL, o.cuH, boolean, int, java.lang.Object):o.yxt */
    public static final InterfaceC58261yxu AkhnZx(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cCE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.getNewProxyInstance(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.czP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.call(function1, obj);
            }
        });
    }

    public static final java.lang.String call(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String getNewProxyInstance(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<kotlin.Pair<java.lang.String, java.lang.String>> AEQbTJ(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, @NotNull final ChainAddress chainAddress, @NotNull final C13854daT c13854daT) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(c13854daT, "");
        C10856bwO.copydefault(this.EZpvd, 0, "importHardwareWallet  chainAddress=" + chainAddress.getAddress());
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtKWHzl = EZpvd().KWHzl(chainAddress.getAddress(), chainAddress.getCoinId(), WalletType.HardwareWallet.ordinal(), c13854daT.AYXKKw());
        final Function1 function1 = new Function1() { // from class: o.cCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt(this.copydefault, str, str2, chainAddress, c13854daT, i, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DGOPHZ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cCu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.fIwbmz(this.OLrzqt, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<kotlin.Pair<java.lang.String, java.lang.String>> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cCy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.KDccX(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu DGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C13092czN c13092czN, java.lang.String str, java.lang.String str2, ChainAddress chainAddress, C13854daT c13854daT, int i, java.util.List list) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            c13092czN.KWHzl().copydefault(c13092czN.EZpvd, WalletType.HardwareWallet, CreateOrImportType.IMPORT_WALLET, "importHardwareWallet");
            throw WalletImportError.Companion.OLrzqt();
        }
        return c13092czN.AEQbTJ(str, str2, chainAddress, c13854daT, i);
    }

    public static final InterfaceC58261yxu KDccX(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final kotlin.Pair fHqPtx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fIwbmz(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cBD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AubY(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cBC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.fHqPtx(function1, obj);
            }
        });
    }

    public static final kotlin.Pair AubY(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return C56390yDp.OLrzqt(c12821cuH.AhwBna(), c12821cuH.fIwbmz().AEQbTJ());
    }

    /* JADX DEBUG: Type inference failed for r0v9. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> EZpvd(@NotNull final ChainAddress chainAddress, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) throws WalletImportError {
        Intrinsics.checkNotNullParameter(chainAddress, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C10856bwO.copydefault(this.EZpvd, 0, "addNewChainToHardwareWallet  chainAddress=" + chainAddress.getAddress());
        C10954byG c10954byG = C10954byG.EZpvd;
        final C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(chainAddress.getCoinId());
        if (c10854bwMKWHzl == null) {
            KWHzl().EZpvd(this.EZpvd, WalletType.HardwareWallet, "chainMeta is null. chainAddress.coinId = " + chainAddress.getCoinId(), CreateOrImportType.IMPORT_WALLET, "addNewChainToHardwareWallet");
            throw WalletImportError.Companion.isConnected();
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!c10854bwMKWHzl.ejfBZ()) {
            arrayList2.add(new ChainAddressEntity(str2, c10854bwMKWHzl.AhwBna(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
            arrayList.add(new C11283cIm(chainAddress.getAddressType(), c10854bwMKWHzl.fetchVPNInfo(), "", null, null, 24, null));
        } else {
            for (java.util.Iterator it = c10954byG.valueOf().DbNXlk().iterator(); it.hasNext(); it = it) {
                C10854bwM c10854bwM = (C10854bwM) it.next();
                arrayList2.add(new ChainAddressEntity(str2, c10854bwM.AhwBna(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
                arrayList.add(new C11283cIm(chainAddress.getAddressType(), c10854bwM.fetchVPNInfo(), "", null, null, 24, null));
            }
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtFARcdN = EZpvd().fARcdN(str2);
        final Function1 function1 = new Function1() { // from class: o.cBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.copydefault(this.AEQbTJ, arrayList2, str2, arrayList, c10854bwMKWHzl, chainAddress, str, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtFARcdN.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QSBOWP(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final InterfaceC58261yxu QSBOWP(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(C13092czN c13092czN, java.util.ArrayList arrayList, final java.lang.String str, java.util.ArrayList arrayList2, C10854bwM c10854bwM, ChainAddress chainAddress, java.lang.String str2, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtEZpvd = c13092czN.EZpvd().EZpvd(arrayList, str, arrayList2);
        final Function1 function1 = new Function1() { // from class: o.cBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.EZpvd((java.util.List) obj);
            }
        };
        arrayList3.add(abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.zuWLRA(function1, obj);
            }
        }));
        java.lang.String str3 = null;
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtEZpvd2 = c13092czN.djBIcL.EZpvd(new WalletCoinAssetEntity(str, c10854bwM.AhwBna(), null, str2, null, null, 0, chainAddress.getAddress(), 0, null, str3, str3, str3, str3, str3, 32628, null));
        final Function1 function12 = new Function1() { // from class: o.cBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt((java.lang.Long) obj);
            }
        };
        arrayList3.add(abstractC58260yxtEZpvd2.copydefault(new InterfaceC58229yxO() { // from class: o.cBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.getPostValueLengthLimit(function12, obj);
            }
        }));
        AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList3);
        final Function1 function13 = new Function1() { // from class: o.cBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt(str, (java.util.List) obj);
            }
        };
        return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.OBJEWx(function13, obj);
            }
        });
    }

    public static final java.lang.Integer EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return java.lang.Integer.valueOf(list.size());
    }

    public static final java.lang.Integer zuWLRA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.Integer OLrzqt(java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return java.lang.Integer.valueOf((int) l.longValue());
    }

    public static final java.lang.Integer getPostValueLengthLimit(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Integer) function1.invoke(obj);
    }

    public static final java.lang.String OBJEWx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r11v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.cuH> */
    public final AbstractC58260yxt<C12821cuH> AEQbTJ(final java.lang.String str, final java.lang.String str2, final ChainAddress chainAddress, final C13854daT c13854daT, final int i) {
        C10856bwO.copydefault(this.EZpvd, 0, "generateHardwareWallet  chainAddress=" + chainAddress.getAddress());
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtEZpvd = EZpvd().EZpvd(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.HardwareWallet.ordinal())), c13854daT.AYXKKw());
        final Function1 function1 = new Function1() { // from class: o.cBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(str, i, str2, chainAddress, c13854daT, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.fdOvFl(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final C12821cuH fdOvFl(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH AEQbTJ(java.lang.String str, int i, java.lang.String str2, ChainAddress chainAddress, C13854daT c13854daT, C13092czN c13092czN, java.util.List list) throws WalletImportError {
        C12786ctZ c12786ctZ;
        Intrinsics.checkNotNullParameter(list, "");
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        if (list.isEmpty()) {
            c12786ctZ = new C12786ctZ(null, str, WalletType.HardwareWallet, 0L, 0, i, 25, null);
        } else {
            cSX csx = (cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            c12786ctZ = new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.HardwareWallet, csx.KWHzl(), csx.zLjUOn(), csx.AhwBna());
        }
        C12821cuH c12821cuHEZpvd = actionBar.EZpvd(str2, c12786ctZ, chainAddress, c13854daT, "", "", false);
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, c12821cuHEZpvd.AhwBna(), false, 3, (DefaultConstructorMarker) null));
        c12821cuHEZpvd.copydefault(keyPairOLrzqt.getPubKey());
        c12821cuHEZpvd.AEQbTJ(keyPairOLrzqt.getPrvKey());
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(chainAddress.getCoinId());
        if (c10854bwMKWHzl == null) {
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, WalletType.HardwareWallet, "chainMeta is null. chainAddress.coinId = " + chainAddress.getCoinId(), CreateOrImportType.IMPORT_WALLET, "generateHardwareWallet");
            throw WalletImportError.Companion.isConnected();
        }
        if (!c10854bwMKWHzl.ejfBZ()) {
            c12821cuHEZpvd.AYXKKw().add(new ChainAddressEntity(c12821cuHEZpvd.AhwBna(), c10854bwMKWHzl.AhwBna(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
        } else {
            java.util.Iterator<T> it = c10954byG.valueOf().DbNXlk().iterator();
            while (it.hasNext()) {
                c12821cuHEZpvd.AYXKKw().add(new ChainAddressEntity(c12821cuHEZpvd.AhwBna(), ((C10854bwM) it.next()).AhwBna(), chainAddress.getAddress(), chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), null, null, 192, null));
            }
        }
        return c12821cuHEZpvd;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.cuH> */
    public final AbstractC58260yxt<C12821cuH> KWHzl(final java.lang.String str, final ChainAddress chainAddress, final C13854daT c13854daT, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final WalletType walletType) {
        C10856bwO.copydefault(this.EZpvd, 0, "generateHardwareSmartWallet");
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtEZpvd = EZpvd().EZpvd(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.HardwareWallet.ordinal())), c13854daT.AYXKKw());
        final Function1 function1 = new Function1() { // from class: o.cAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.KWHzl(str, walletType, chainAddress, c13854daT, this, str2, str3, str4, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.cAY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QwvEab(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final C12821cuH QwvEab(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH KWHzl(java.lang.String str, WalletType walletType, ChainAddress chainAddress, C13854daT c13854daT, C13092czN c13092czN, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        cSX csx = (cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        java.lang.String newProxyInstance = csx.getNewProxyInstance();
        java.lang.String strUzCIH = csx.uzCIH();
        WalletType walletType2 = WalletType.HardwareWallet;
        C12821cuH c12821cuHOLrzqt = actionBar.OLrzqt(str, walletType, new C12786ctZ(newProxyInstance, strUzCIH, walletType2, csx.KWHzl(), csx.zLjUOn(), csx.AhwBna()), chainAddress, c13854daT, "", "", false);
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, c12821cuHOLrzqt.AhwBna(), false, 3, (DefaultConstructorMarker) null));
        c12821cuHOLrzqt.copydefault(keyPairOLrzqt.getPubKey());
        c12821cuHOLrzqt.AEQbTJ(keyPairOLrzqt.getPrvKey());
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(chainAddress.getCoinId());
        if (c10854bwMKWHzl == null) {
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, walletType2, "chainMeta is null. chainAddress.coinId = " + chainAddress.getCoinId(), CreateOrImportType.IMPORT_WALLET, "generateHardwareSmartWallet");
            throw WalletImportError.Companion.isConnected();
        }
        if (!c10854bwMKWHzl.ejfBZ()) {
            c12821cuHOLrzqt.AYXKKw().add(new ChainAddressEntity(c12821cuHOLrzqt.AhwBna(), c10854bwMKWHzl.AhwBna(), str2, chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), str3, str4));
        } else {
            java.util.Iterator<T> it = c10954byG.valueOf().OLrzqt().iterator();
            while (it.hasNext()) {
                c12821cuHOLrzqt.AYXKKw().add(new ChainAddressEntity(c12821cuHOLrzqt.AhwBna(), ((C10854bwM) it.next()).AhwBna(), str2, chainAddress.getAddressType(), chainAddress.getPublicKey(), chainAddress.getDerivePath(), str3, str4));
            }
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuHOLrzqt.AYXKKw().size());
        if (c12821cuHOLrzqt.AYXKKw().isEmpty() || c12821cuHOLrzqt.valueOf().isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return c12821cuHOLrzqt;
    }

    public final AbstractC58260yxt<java.lang.String> KWHzl(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final MpcWalletDecodeInfo mpcWalletDecodeInfo, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(mpcWalletDecodeInfo, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C10856bwO.copydefault(this.EZpvd, 0, "importMPCWallet  oldMpcId=" + str4);
        AbstractC58260yxt<java.util.List<MPCWalletEntity>> abstractC58260yxtValueOf = EZpvd().valueOf(mpcWalletDecodeInfo.getUid());
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtKWHzl = EZpvd().KWHzl(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.MPCWallet.ordinal())));
        final Function2 function2 = new Function2() { // from class: o.cAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.djBIcL((java.util.List) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtValueOf, abstractC58260yxtKWHzl, new InterfaceC58223yxI() { // from class: o.cAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.gEmmrt(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.copydefault(this.AEQbTJ, str, i, str2, mpcWalletDecodeInfo, str3, str4, (kotlin.Pair) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DGOPHZDGOPHZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return C11607cUn.valueOf(abstractC58260yxtOLrzqt2);
    }

    public static final kotlin.Pair gEmmrt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair djBIcL(java.util.List list, java.util.List list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return C56390yDp.OLrzqt(list, list2);
    }

    public static final InterfaceC58261yxu DGOPHZDGOPHZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final C13092czN c13092czN, java.lang.String str, int i, java.lang.String str2, final MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str3, java.lang.String str4, kotlin.Pair pair) throws WalletImportError {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.String rootWalletId;
        Intrinsics.checkNotNullParameter(pair, "");
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        java.util.List list = (java.util.List) first;
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        java.lang.Iterable iterable = (java.lang.Iterable) second;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((cSX) it.next()).getNewProxyInstance());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (Intrinsics.EZpvd((java.lang.Object) ((MPCWalletEntity) obj2).getMpcId(), (java.lang.Object) mpcWalletDecodeInfo.getMpcId())) {
                arrayList2.add(obj2);
            }
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (arrayList.contains(((MPCWalletEntity) next).getRootWalletId())) {
                break;
            }
        }
        if (next != null) {
            c13092czN.KWHzl().OLrzqt(c13092czN.EZpvd, "importMPCWallet");
            throw WalletImportError.Companion.AhwBna();
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list) {
            if (Intrinsics.EZpvd((java.lang.Object) ((MPCWalletEntity) obj3).getMpcId(), (java.lang.Object) str4)) {
                arrayList3.add(obj3);
            }
        }
        java.util.Iterator it3 = arrayList3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            java.lang.Object next2 = it3.next();
            if (arrayList.contains(((MPCWalletEntity) next2).getRootWalletId())) {
                obj = next2;
                break;
            }
        }
        final MPCWalletEntity mPCWalletEntity = (MPCWalletEntity) obj;
        final java.lang.String str5 = (mPCWalletEntity == null || (rootWalletId = mPCWalletEntity.getRootWalletId()) == null) ? "" : rootWalletId;
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault = c13092czN.copydefault(new C12786ctZ(null, str, WalletType.MPCWallet, 0L, 0, i, 25, null), str2, 0, mpcWalletDecodeInfo, str3, false, true, true, true);
        final Function1 function1 = new Function1() { // from class: o.cCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C13092czN.fJNWhG(this.AEQbTJ, (C12821cuH) obj4);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj4) {
                return C13092czN.DWgRXt(function1, obj4);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C13092czN.KWHzl(str5, c13092czN, (java.lang.String) obj4);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cCf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj4) {
                return C13092czN.DGUQLI(function12, obj4);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj4) {
                return C13092czN.copydefault(mPCWalletEntity, mpcWalletDecodeInfo, (java.lang.String) obj4);
            }
        };
        return abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj4) {
                return C13092czN.hCLrkq(function13, obj4);
            }
        });
    }

    public static final InterfaceC58261yxu DWgRXt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String DcqEDu(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fJNWhG(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.wlaJM(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DcqEDu(function1, obj);
            }
        });
    }

    public static final java.lang.String wlaJM(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public static final InterfaceC58261yxu DGUQLI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(java.lang.String str, C13092czN c13092czN, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        if (str == null || str.length() == 0) {
            return AbstractC58260yxt.copydefault(str2);
        }
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtValues = c13092czN.EZpvd().values(str);
        final Function1 function1 = new Function1() { // from class: o.cAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.EZpvd(str2, (java.util.List) obj);
            }
        };
        return abstractC58260yxtValues.copydefault(new InterfaceC58229yxO() { // from class: o.cAp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.UrRBLY(function1, obj);
            }
        });
    }

    public static final java.lang.String UrRBLY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu hCLrkq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(MPCWalletEntity mPCWalletEntity, MpcWalletDecodeInfo mpcWalletDecodeInfo, final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (mPCWalletEntity == null) {
            return AbstractC58260yxt.copydefault(str);
        }
        if (Intrinsics.EZpvd((java.lang.Object) mPCWalletEntity.getUid(), (java.lang.Object) mpcWalletDecodeInfo.getUid()) && mPCWalletEntity.isEscape() != 1 && mPCWalletEntity.getStatus() != MpcShare2Status.SHARE2_VALID.getValue()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(mPCWalletEntity.getRootWalletId());
            final Function1 function1 = new Function1() { // from class: o.cBO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C13092czN.EZpvd(str, (java.lang.Integer) obj);
                }
            };
            return abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cBT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C13092czN.DBxZfM(function1, obj);
                }
            });
        }
        return AbstractC58260yxt.copydefault(str);
    }

    public static final java.lang.String DBxZfM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r5v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<java.lang.String> */
    public final AbstractC58260yxt<java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C10856bwO.copydefault(this.EZpvd, 0, "importPrivateKeyWallet");
        AbstractC58260yxt<C12821cuH> abstractC58260yxtOLrzqt = OLrzqt(str, str2, str3, j, str4);
        final Function1 function1 = new Function1() { // from class: o.cAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.fARcdN(this.copydefault, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DaRZkR(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu DaRZkR(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu fARcdN(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.zLjUOn(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.heceqZ(function1, obj);
            }
        });
    }

    public static final java.lang.String heceqZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String zLjUOn(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<java.lang.String> copydefault(@NotNull final java.lang.String str, final int i, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, @NotNull final java.lang.String str5, final boolean z, final boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        C10856bwO.copydefault(this.EZpvd, 0, "importTonWallet  createIndex=" + i);
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtAEQbTJ = EZpvd().AEQbTJ(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.TonWallet.ordinal())));
        final Function1 function1 = new Function1() { // from class: o.cBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.copydefault, str3, str4, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtAEQbTJ.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DsrFlB(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.OLrzqt, str, i, str2, str3, str4, str5, z, z2, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DNMMPQ(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cBp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AuCTel(this.KWHzl, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QXDzTk(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final InterfaceC58261yxu DsrFlB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(final C13092czN c13092czN, final java.lang.String str, final java.lang.String str2, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = c13092czN.AhwBna.AhwBna(str);
        final Function1 function1 = new Function1() { // from class: o.cAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.KWHzl(list, str2, str, c13092czN, (java.lang.String) obj);
            }
        };
        return abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DGgnkA(function1, obj);
            }
        });
    }

    public static final Unit DGgnkA(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(java.util.List list, java.lang.String str, java.lang.String str2, C13092czN c13092czN, java.lang.String str3) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), str, xXW.OLrzqt.AEQbTJ(str2, str3, ((WalletEntity) it.next()).getData(), true))) {
                c13092czN.KWHzl().copydefault(c13092czN.EZpvd, "importTonWallet");
                throw WalletImportError.Companion.valueOf();
            }
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu DNMMPQ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AEQbTJ(C13092czN c13092czN, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, boolean z2, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c13092czN.AEQbTJ(new C12786ctZ(null, str, WalletType.TonWallet, 0L, 0, i, 25, null), str2, 0, str3, new Mnemonic(str4, str5, true), false, true, z, z2);
    }

    public static final InterfaceC58261yxu QXDzTk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu AuCTel(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cAU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.zsXlph(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cAS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.OTwTPd(function1, obj);
            }
        });
    }

    public static final java.lang.String OTwTPd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String zsXlph(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super java.util.Map<java.lang.Long, ? extends java.util.List<java.lang.String>>> continuation) throws java.lang.Throwable {
        WalletCreateManager$getAddressListByChainId$1 walletCreateManager$getAddressListByChainId$1;
        if (continuation instanceof WalletCreateManager$getAddressListByChainId$1) {
            walletCreateManager$getAddressListByChainId$1 = (WalletCreateManager$getAddressListByChainId$1) continuation;
            int i = walletCreateManager$getAddressListByChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletCreateManager$getAddressListByChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                walletCreateManager$getAddressListByChainId$1 = new WalletCreateManager$getAddressListByChainId$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = walletCreateManager$getAddressListByChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletCreateManager$getAddressListByChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            cOG cog = this.KWHzl;
            walletCreateManager$getAddressListByChainId$1.label = 1;
            objOLrzqt = cog.OLrzqt(list, walletCreateManager$getAddressListByChainId$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (cII cii : (java.lang.Iterable) objOLrzqt) {
            java.lang.Long lKWHzl = C56443yFo.KWHzl(cii.AEQbTJ());
            java.lang.Object arrayList = linkedHashMap.get(lKWHzl);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(lKWHzl, arrayList);
            }
            ((java.util.List) arrayList).add(cii.KWHzl());
        }
        return linkedHashMap;
    }

    public static /* synthetic */ AbstractC58260yxt importTrackingWallet$default(C13092czN c13092czN, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return c13092czN.AEQbTJ(str, str2, j, str3, z);
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, final long j, @NotNull final java.lang.String str3, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58260yxt<java.util.List<WalletEntity>> abstractC58260yxtOLrzqt = this.KWHzl.OLrzqt(j, str3);
        final Function1 function1 = new Function1() { // from class: o.cCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.EZpvd, (java.util.List) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cCk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.RVsVBY(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.KWHzl(this.KWHzl, str, str2, j, str3, z, (Unit) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.cCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QDqgQU(function12, obj);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.cCr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.ejfBZ(this.AEQbTJ, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<java.lang.String> abstractC58260yxtOLrzqt3 = abstractC58260yxtOLrzqt2.OLrzqt(new InterfaceC58229yxO() { // from class: o.cCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.QIZEnU(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt3, "");
        return abstractC58260yxtOLrzqt3;
    }

    public static final Unit RVsVBY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C13092czN c13092czN, java.util.List list) throws WalletImportError {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            c13092czN.KWHzl().copydefault(c13092czN.EZpvd, WalletType.TrackingWallet, CreateOrImportType.IMPORT_WALLET, "importHardwareWallet");
            throw WalletImportError.Companion.OLrzqt();
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu QDqgQU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C13092czN c13092czN, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, boolean z, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c13092czN.OLrzqt(str, str2, j, str3, z);
    }

    public static final InterfaceC58261yxu QIZEnU(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final java.lang.String RKcVTr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu ejfBZ(C13092czN c13092czN, final C12821cuH c12821cuH) {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        AbstractC58260yxt abstractC58260yxtSaveWalletAllInfoToDB$default = AbstractC12984cxL.saveWalletAllInfoToDB$default(c13092czN, c12821cuH, false, 2, null);
        final Function1 function1 = new Function1() { // from class: o.cAT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AuCTelauCTel(c12821cuH, (Unit) obj);
            }
        };
        return abstractC58260yxtSaveWalletAllInfoToDB$default.copydefault(new InterfaceC58229yxO() { // from class: o.cAR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.RKcVTr(function1, obj);
            }
        });
    }

    public static final java.lang.String AuCTelauCTel(C12821cuH c12821cuH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        return c12821cuH.AhwBna();
    }

    public final AbstractC58260yxt<C12821cuH> copydefault(final C12786ctZ c12786ctZ, final java.lang.String str, final int i, final MpcWalletDecodeInfo mpcWalletDecodeInfo, final java.lang.String str2, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        C10856bwO.copydefault(this.EZpvd, 0, "generateMPCWallet");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str2);
        final Function1 function1 = new Function1() { // from class: o.cAh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt(str2, this, mpcWalletDecodeInfo, str, c12786ctZ, i, z, z2, z3, z4, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cAe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.fjfviF(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cAf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AkhnZx(this.EZpvd, z, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cAm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.igXuih(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final C12821cuH fjfviF(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH OLrzqt(java.lang.String str, C13092czN c13092czN, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str2, C12786ctZ c12786ctZ, int i, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str3) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str3, "");
        if (str.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 1.");
            c13092czN.copydefault("MPC wallet Data error 1.");
            throw WalletImportError.Companion.EZpvd(1);
        }
        if (mpcWalletDecodeInfo.getMpcId().length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 2.");
            c13092czN.copydefault("MPC wallet Data error 2.");
            throw WalletImportError.Companion.EZpvd(2);
        }
        if (mpcWalletDecodeInfo.getUid().length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 3.");
            c13092czN.copydefault("MPC wallet Data error 3.");
            throw WalletImportError.Companion.EZpvd(3);
        }
        if (str2.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 8.");
            c13092czN.copydefault("MPC wallet Data error 8.");
            throw WalletImportError.Companion.EZpvd(8);
        }
        MPCWalletEntity mPCWalletEntityConvertToEntity$OKWallet_wallet_impl = C10964byQ.copydefault(str, str3, mpcWalletDecodeInfo).convertToEntity$OKWallet_wallet_impl();
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str3, mpcWalletDecodeInfo.getEcdsaPubkey(), false);
        if (mPCWalletEntityConvertToEntity$OKWallet_wallet_impl.getEncryptShareKey().length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 4.");
            c13092czN.copydefault("MPC wallet Data error 4.");
            throw WalletImportError.Companion.EZpvd(4);
        }
        KeyPair keyPairCopydefault = xYP.AEQbTJ.copydefault(mpcWalletDecodeInfo.getEcdsaPubkey());
        if (keyPairCopydefault.getPubKey().length() == 0 || keyPairCopydefault.getPrvKey().length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 9.");
            c13092czN.copydefault("MPC wallet Data error 9.");
            throw WalletImportError.Companion.EZpvd(9);
        }
        return C12821cuH.Companion.EZpvd(str2, c12786ctZ, i, strAEQbTJ, keyPairCopydefault.getPubKey(), keyPairCopydefault.getPrvKey(), z, z2, z3, z4, mPCWalletEntityConvertToEntity$OKWallet_wallet_impl);
    }

    public static final C12821cuH igXuih(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [T, o.bwM] */
    public static final C12821cuH AkhnZx(C13092czN c13092czN, boolean z, C12821cuH c12821cuH) throws WalletImportError {
        java.lang.String accountName;
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<C10854bwM> listDjBIcL = C10954byG.EZpvd.valueOf().djBIcL();
        java.util.ArrayList<C10854bwM> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listDjBIcL) {
            if (((C10854bwM) obj).hrNTAI()) {
                arrayList2.add(obj);
            }
        }
        for (C10854bwM c10854bwM : arrayList2) {
            if (c10854bwM.AxsJAYaxsJAY()) {
                java.util.List<java.lang.Integer> listAEQbTJ = C8322bAY.KWHzl.AEQbTJ(c10854bwM.fetchVPNInfo(), false);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj2 : listAEQbTJ) {
                    if (((java.lang.Number) obj2).intValue() != AddressType.P2SHType.getValue()) {
                        arrayList3.add(obj2);
                    }
                }
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList.add(new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), ((java.lang.Number) it.next()).intValue(), c12821cuH.KWHzl(), c10854bwM.iwGUEr()));
                }
            } else {
                arrayList.add(new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), AddressType.Legacy.getValue(), c12821cuH.KWHzl(), c10854bwM.iwGUEr()));
            }
        }
        if (arrayList.isEmpty()) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 5.");
            c13092czN.copydefault("MPC wallet Data error 5.");
            throw WalletImportError.Companion.EZpvd(5);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        MPCWalletEntity mPCWalletEntityIsConnected = c12821cuH.isConnected();
        java.lang.Object obj3 = null;
        java.lang.String ecdsaPubkey = mPCWalletEntityIsConnected != null ? mPCWalletEntityIsConnected.getEcdsaPubkey() : null;
        MPCWalletEntity mPCWalletEntityIsConnected2 = c12821cuH.isConnected();
        java.lang.String ecdsaChainCode = mPCWalletEntityIsConnected2 != null ? mPCWalletEntityIsConnected2.getEcdsaChainCode() : null;
        MPCWalletEntity mPCWalletEntityIsConnected3 = c12821cuH.isConnected();
        java.lang.String ed25519Pubkey = mPCWalletEntityIsConnected3 != null ? mPCWalletEntityIsConnected3.getEd25519Pubkey() : null;
        MPCWalletEntity mPCWalletEntityIsConnected4 = c12821cuH.isConnected();
        java.lang.String ed25519ChainCode = mPCWalletEntityIsConnected4 != null ? mPCWalletEntityIsConnected4.getEd25519ChainCode() : null;
        xYQ xyq = xYQ.KWHzl;
        Intrinsics.copydefault((java.lang.Object) ecdsaPubkey);
        Intrinsics.copydefault((java.lang.Object) ecdsaChainCode);
        Intrinsics.copydefault((java.lang.Object) ed25519Pubkey);
        Intrinsics.copydefault((java.lang.Object) ed25519ChainCode);
        java.util.List<WalletAddressList> listOLrzqt = xyq.OLrzqt(ecdsaPubkey, ecdsaChainCode, ed25519Pubkey, ed25519ChainCode, arrayList);
        if (listOLrzqt.isEmpty()) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC wallet Data error 6.");
            c13092czN.copydefault("MPC wallet Data error 6.");
            throw WalletImportError.Companion.EZpvd(6);
        }
        for (WalletAddressList walletAddressList : listOLrzqt) {
            ?? OLrzqt = C10954byG.EZpvd.valueOf().copydefault(walletAddressList.getChainId());
            if (OLrzqt != 0) {
                objectRef.element = OLrzqt;
                for (CoinAddressBean coinAddressBean : walletAddressList.getAddressList()) {
                    if (((C10854bwM) objectRef.element).OuxcSI()) {
                        EOSInfoEntity eOSInfoEntityDjBIcL = c12821cuH.djBIcL();
                        if (eOSInfoEntityDjBIcL != null) {
                            eOSInfoEntityDjBIcL.setPubKey(coinAddressBean.getAddress());
                            eOSInfoEntityDjBIcL.setActiveKey(coinAddressBean.getAddress());
                            eOSInfoEntityDjBIcL.setOwnerKey(coinAddressBean.getAddress());
                        }
                        java.util.ArrayList<ChainAddressEntity> arrayListAYXKKw = c12821cuH.AYXKKw();
                        java.lang.String strAhwBna = c12821cuH.AhwBna();
                        long jAEQbTJ = ((C10854bwM) objectRef.element).AEQbTJ();
                        EOSInfoEntity eOSInfoEntityDjBIcL2 = c12821cuH.djBIcL();
                        arrayListAYXKKw.add(new ChainAddressEntity(strAhwBna, jAEQbTJ, (eOSInfoEntityDjBIcL2 == null || (accountName = eOSInfoEntityDjBIcL2.getAccountName()) == null) ? "" : accountName, coinAddressBean.getType(), walletAddressList.getPubKey(), null, null, null, 224, null));
                    } else if (((C10854bwM) objectRef.element).AxsJAYaxsJAY()) {
                        c12821cuH.AuCTel().add(new ChainAddressSegWitEntity(c12821cuH.AhwBna(), ((C10854bwM) objectRef.element).AEQbTJ(), coinAddressBean.getType(), coinAddressBean.getAddress(), walletAddressList.getPubKey(), null, 32, null));
                        if (z) {
                            C56406yEe.AEQbTJ(c12821cuH.AuCTel(), new Function1() { // from class: o.czS
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj4) {
                                    return java.lang.Boolean.valueOf(C13092czN.gEmmrt(objectRef, (ChainAddressSegWitEntity) obj4));
                                }
                            });
                        }
                        if (coinAddressBean.getType() == C8322bAY.KWHzl.KWHzl(((C10854bwM) objectRef.element).fetchVPNInfo(), false)) {
                            c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), ((C10854bwM) objectRef.element).AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressList.getPubKey(), null, null, null, 224, null));
                        }
                    } else {
                        c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), ((C10854bwM) objectRef.element).AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressList.getPubKey(), null, null, null, 224, null));
                    }
                }
            }
        }
        java.util.Iterator<T> it2 = c12821cuH.AYXKKw().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddressEntity) next).getChainId());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ()) {
                obj3 = next;
                break;
            }
        }
        ChainAddressEntity chainAddressEntity = (ChainAddressEntity) obj3;
        if (chainAddressEntity != null) {
            c13092czN.copydefault(c12821cuH, chainAddressEntity);
        }
        return c12821cuH;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean gEmmrt(Ref.ObjectRef objectRef, ChainAddressSegWitEntity chainAddressSegWitEntity) {
        Intrinsics.checkNotNullParameter(chainAddressSegWitEntity, "");
        return chainAddressSegWitEntity.getChainId() == ((C10854bwM) objectRef.element).AEQbTJ() && chainAddressSegWitEntity.getAddressType() == AddressType.P2SHType.getValue();
    }

    public final AbstractC58260yxt<C12821cuH> copydefault(final java.lang.String str, final int i, final C12786ctZ c12786ctZ, final MpcWalletDecodeInfo mpcWalletDecodeInfo, final java.lang.String str2, final boolean z, final java.lang.String str3, final WalletType walletType, final java.lang.String str4, final java.lang.String str5, final boolean z2, final boolean z3, final boolean z4) {
        C10856bwO.copydefault(this.EZpvd, 0, "generateMPCSmartWallet");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str2);
        final Function1 function1 = new Function1() { // from class: o.cCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.copydefault(str2, this, mpcWalletDecodeInfo, str, i, c12786ctZ, z, z2, z3, z4, walletType, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cCz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.htlTjW(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.EZpvd(this.AEQbTJ, str4, str5, str3, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cCA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.fERRXa(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final C12821cuH htlTjW(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH copydefault(java.lang.String str, C13092czN c13092czN, MpcWalletDecodeInfo mpcWalletDecodeInfo, java.lang.String str2, int i, C12786ctZ c12786ctZ, boolean z, boolean z2, boolean z3, boolean z4, WalletType walletType, java.lang.String str3) throws WalletImportError {
        java.lang.String prvKey;
        Intrinsics.checkNotNullParameter(str3, "");
        if (str == null || str.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 1.");
            c13092czN.EZpvd("MPC AA wallet Data error 1.");
            throw WalletImportError.Companion.EZpvd(1);
        }
        java.lang.String mpcId = mpcWalletDecodeInfo.getMpcId();
        if (mpcId == null || mpcId.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 2.");
            c13092czN.EZpvd("MPC AA wallet Data error 2.");
            throw WalletImportError.Companion.EZpvd(2);
        }
        java.lang.String uid = mpcWalletDecodeInfo.getUid();
        if (uid == null || uid.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 3.");
            c13092czN.EZpvd("MPC AA wallet Data error 3.");
            throw WalletImportError.Companion.EZpvd(3);
        }
        if (str2 == null || str2.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 8.");
            c13092czN.EZpvd("MPC AA wallet Data error 8.");
            throw WalletImportError.Companion.EZpvd(8);
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoCopydefault = C10964byQ.copydefault(str, str3, mpcWalletDecodeInfo);
        MPCWalletEntity mPCWalletEntityConvertToEntity$OKWallet_wallet_impl = mpcWalletEncodeInfoCopydefault.convertToEntity$OKWallet_wallet_impl();
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C10964byQ.OLrzqt(mpcWalletDecodeInfo.getEcdsaShare2())).toString();
        boolean z5 = C33129mqd.OLrzqt((java.lang.CharSequence) string) && string.contentEquals(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C10964byQ.OLrzqt(C10964byQ.OLrzqt(str, str3, mpcWalletEncodeInfoCopydefault).getEcdsaShare2())).toString());
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str3, mpcWalletDecodeInfo.getEcdsaPubkey(), false);
        java.lang.String encryptShareKey = mPCWalletEntityConvertToEntity$OKWallet_wallet_impl.getEncryptShareKey();
        if (encryptShareKey == null || encryptShareKey.length() == 0 || !z5) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 4.");
            c13092czN.EZpvd("MPC AA wallet Data error 4.");
            throw WalletImportError.Companion.EZpvd(4);
        }
        KeyPair keyPairCopydefault = xYP.AEQbTJ.copydefault(mpcWalletDecodeInfo.getEcdsaPubkey());
        java.lang.String pubKey = keyPairCopydefault.getPubKey();
        if (pubKey == null || pubKey.length() == 0 || (prvKey = keyPairCopydefault.getPrvKey()) == null || prvKey.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 9.");
            c13092czN.EZpvd("MPC AA wallet Data error 9.");
            throw WalletImportError.Companion.EZpvd(9);
        }
        return C12821cuH.Companion.OLrzqt(str2, i, c12786ctZ, strAEQbTJ, keyPairCopydefault.getPubKey(), keyPairCopydefault.getPrvKey(), z, z2, z3, z4, mPCWalletEntityConvertToEntity$OKWallet_wallet_impl, walletType);
    }

    public static final C12821cuH fERRXa(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH EZpvd(C13092czN c13092czN, java.lang.String str, java.lang.String str2, java.lang.String str3, C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        java.util.List<C10854bwM> listOLrzqt = C10954byG.EZpvd.valueOf().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (((C10854bwM) obj).hrNTAI()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), ((C10854bwM) it.next()).AhwBna(), str, AddressType.Legacy.getValue(), "", null, str2, str3, 32, null));
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuH.AYXKKw().size());
        if (!c12821cuH.AYXKKw().isEmpty() && !c12821cuH.valueOf().isEmpty()) {
            return c12821cuH;
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "MPC AA wallet Data error 5.");
        c13092czN.EZpvd("MPC AA wallet Data error 5.");
        throw WalletImportError.Companion.EZpvd(5);
    }

    public final AbstractC58260yxt<C12821cuH> KWHzl(final C12786ctZ c12786ctZ, final java.lang.String str, final int i, final java.lang.String str2, final Mnemonic mnemonic, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        C10856bwO.copydefault(this.EZpvd, 0, "generateHDWallet");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtEZpvd = this.AhwBna.EZpvd();
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAEQbTJ = this.AhwBna.AEQbTJ();
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str2);
        final yHO yho = new yHO() { // from class: o.cBf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.KWHzl(str2, mnemonic, this, str, i, c12786ctZ, z, z2, z3, z4, (java.lang.Boolean) obj, (java.lang.Boolean) obj2, (java.lang.String) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ2 = AbstractC58260yxt.AEQbTJ(abstractC58260yxtEZpvd, abstractC58260yxtAEQbTJ, abstractC58260yxtAhwBna, new InterfaceC58228yxN() { // from class: o.cBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.AhwBna(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ2, "");
        AbstractC58260yxt abstractC58260yxtEZpvd2 = C11607cUn.EZpvd(abstractC58260yxtAEQbTJ2);
        final Function1 function1 = new Function1() { // from class: o.cBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.fetchVPNInfo(this.AEQbTJ, z, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault = abstractC58260yxtEZpvd2.copydefault(new InterfaceC58229yxO() { // from class: o.cBL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.USBtdM(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final C12821cuH AhwBna(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (C12821cuH) yho.invoke(obj, obj2, obj3);
    }

    public static final C12821cuH KWHzl(java.lang.String str, Mnemonic mnemonic, C13092czN c13092czN, java.lang.String str2, int i, C12786ctZ c12786ctZ, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3) throws WalletImportError {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str3, mnemonic.getPhrase(), true);
        xXW xxw = xXW.OLrzqt;
        java.lang.String strAEQbTJ2 = xxw.AEQbTJ(str, str3, strAEQbTJ, true);
        boolean zCopydefault = C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ2, mnemonic.getPhrase());
        if (mnemonic.getPhrase().length() == 0 || strAEQbTJ2.length() == 0 || !zCopydefault) {
            java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt("1", "HDWallet"), C56390yDp.OLrzqt("2", java.lang.Integer.valueOf(mnemonic.getPhrase().length())), C56390yDp.OLrzqt("3", java.lang.Integer.valueOf(strAEQbTJ.length())), C56390yDp.OLrzqt("4", java.lang.Integer.valueOf(strAEQbTJ2.length())), C56390yDp.OLrzqt("5", java.lang.Boolean.valueOf(zCopydefault)), C56390yDp.OLrzqt(OrderDetailListItem.SLIP_OUT, bool), C56390yDp.OLrzqt("7", bool2), C56390yDp.OLrzqt("8", java.lang.Integer.valueOf(str.length())), C56390yDp.OLrzqt("9", java.lang.Integer.valueOf(str3.length())), C56390yDp.OLrzqt("10", java.lang.Boolean.valueOf(xxw.AEQbTJ(str, str3))), C56390yDp.OLrzqt("11", java.lang.Boolean.valueOf(C34702nhN.OLrzqt.copydefault())), C56390yDp.OLrzqt("12", xVW.copydefault())));
            java.lang.String str4 = c13092czN.EZpvd;
            Intrinsics.copydefault((java.lang.Object) json);
            C10856bwO.copydefault(str4, 0, json);
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, "generateHDWallet", WalletType.HDWallet, json, CreateOrImportType.CREATE_WALLET);
            throw WalletImportError.Companion.gEmmrt();
        }
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams(mnemonic.getPhrase(), mnemonic.getLanguage(), (java.lang.String) null, true, 4, (DefaultConstructorMarker) null));
        return C12821cuH.Companion.copydefault(str2, i, c12786ctZ, strAEQbTJ, mnemonic.getPhrase(), mnemonic.getLanguage(), keyPairOLrzqt.getPubKey(), keyPairOLrzqt.getPrvKey(), z, z2, z3, z4);
    }

    public static final C12821cuH USBtdM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v21, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r12v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v18, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v9, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r14v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, o.bwM] */
    public static final C12821cuH fetchVPNInfo(C13092czN c13092czN, boolean z, C12821cuH c12821cuH) throws WalletImportError {
        java.lang.String accountName;
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (C10854bwM c10854bwM : C10954byG.EZpvd.valueOf().djBIcL()) {
            if (!c10854bwM.DsrFlB() || c10854bwM.flVtFt()) {
                arrayList.add(new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), AddressType.Legacy.getValue(), c12821cuH.KWHzl(), c10854bwM.iwGUEr()));
            } else {
                java.util.Iterator it = C8322bAY.getAddressTypeList$default(C8322bAY.KWHzl, c10854bwM.fetchVPNInfo(), false, 2, null).iterator();
                while (it.hasNext()) {
                    arrayList.add(new HDWalletCoin(c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), C13912dbY.copydefault.AhwBna(), ((java.lang.Number) it.next()).intValue(), c12821cuH.KWHzl(), c10854bwM.iwGUEr()));
                }
            }
            if (c10854bwM.gwTjWJ()) {
                C10856bwO.copydefault(c13092czN.EZpvd, 0, "generateHDWallet walletId=" + c12821cuH.AhwBna() + " coinId=" + c10854bwM.AhwBna() + " chainId=" + c10854bwM.QKVWgx() + " realChainId=" + c10854bwM.fetchVPNInfo());
            }
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "chain list size is " + arrayList.size());
        java.lang.Object obj = null;
        if (arrayList.isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C54908xZu c54908xZu = C54908xZu.AEQbTJ;
        java.lang.String strFetchVPNInfo = c12821cuH.fetchVPNInfo();
        Intrinsics.copydefault((java.lang.Object) strFetchVPNInfo);
        for (WalletAddressList walletAddressList : c54908xZu.EZpvd(strFetchVPNInfo, c12821cuH.DbNXlk(), arrayList, c12821cuH.AhwBna())) {
            ?? OLrzqt = C10954byG.EZpvd.valueOf().copydefault(walletAddressList.getChainId());
            if (OLrzqt != 0) {
                objectRef.element = OLrzqt;
                for (CoinAddressBean coinAddressBean : walletAddressList.getAddressList()) {
                    if (((C10854bwM) objectRef.element).OuxcSI()) {
                        EOSInfoEntity eOSInfoEntityDjBIcL = c12821cuH.djBIcL();
                        if (eOSInfoEntityDjBIcL != null) {
                            eOSInfoEntityDjBIcL.setPubKey(coinAddressBean.getAddress());
                            eOSInfoEntityDjBIcL.setActiveKey(coinAddressBean.getAddress());
                            eOSInfoEntityDjBIcL.setOwnerKey(coinAddressBean.getAddress());
                        }
                        java.util.ArrayList<ChainAddressEntity> arrayListAYXKKw = c12821cuH.AYXKKw();
                        java.lang.String strAhwBna = c12821cuH.AhwBna();
                        long jAEQbTJ = ((C10854bwM) objectRef.element).AEQbTJ();
                        EOSInfoEntity eOSInfoEntityDjBIcL2 = c12821cuH.djBIcL();
                        arrayListAYXKKw.add(new ChainAddressEntity(strAhwBna, jAEQbTJ, (eOSInfoEntityDjBIcL2 == null || (accountName = eOSInfoEntityDjBIcL2.getAccountName()) == null) ? "" : accountName, coinAddressBean.getType(), walletAddressList.getPubKey(), null, null, null, 224, null));
                        c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean.getType(), ((C10854bwM) objectRef.element).fetchVPNInfo(), walletAddressList.getSignature(), null, null, 24, 0 == true ? 1 : 0));
                    } else if (((C10854bwM) objectRef.element).DsrFlB()) {
                        c12821cuH.AuCTel().add(new ChainAddressSegWitEntity(c12821cuH.AhwBna(), ((C10854bwM) objectRef.element).AEQbTJ(), coinAddressBean.getType(), coinAddressBean.getAddress(), walletAddressList.getPubKey(), null, 32, null));
                        c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean.getType(), ((C10854bwM) objectRef.element).fetchVPNInfo(), walletAddressList.getSignature(), null, null, 24, null));
                        if (((C10854bwM) objectRef.element).flVtFt()) {
                            C56406yEe.AEQbTJ(c12821cuH.AuCTel(), new Function1() { // from class: o.cBP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return java.lang.Boolean.valueOf(C13092czN.EZpvd(objectRef, (ChainAddressSegWitEntity) obj2));
                                }
                            });
                        }
                        if ((((C10854bwM) objectRef.element).AxsJAYaxsJAY() || ((C10854bwM) objectRef.element).DLWbHP()) && z) {
                            C56406yEe.AEQbTJ(c12821cuH.AuCTel(), new Function1() { // from class: o.cBS
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return java.lang.Boolean.valueOf(C13092czN.OLrzqt(objectRef, (ChainAddressSegWitEntity) obj2));
                                }
                            });
                        }
                        if (coinAddressBean.getType() == C8322bAY.KWHzl.KWHzl(((C10854bwM) objectRef.element).fetchVPNInfo(), true)) {
                            c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), ((C10854bwM) objectRef.element).AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressList.getPubKey(), null, null, null, 224, null));
                        }
                    } else {
                        c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), ((C10854bwM) objectRef.element).AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressList.getPubKey(), null, null, null, 224, null));
                        c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean.getType(), ((C10854bwM) objectRef.element).fetchVPNInfo(), walletAddressList.getSignature(), null, null, 24, 0 == true ? 1 : 0));
                    }
                }
            }
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuH.AYXKKw().size());
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "segwit address list size is " + c12821cuH.AuCTel().size());
        if (c12821cuH.AYXKKw().isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        java.util.Iterator<T> it2 = c12821cuH.AYXKKw().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddressEntity) next).getChainId());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.ejfBZ()) {
                obj = next;
                break;
            }
        }
        ChainAddressEntity chainAddressEntity = (ChainAddressEntity) obj;
        if (chainAddressEntity != null) {
            c13092czN.copydefault(c12821cuH, chainAddressEntity);
        }
        return c12821cuH;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean EZpvd(Ref.ObjectRef objectRef, ChainAddressSegWitEntity chainAddressSegWitEntity) {
        Intrinsics.checkNotNullParameter(chainAddressSegWitEntity, "");
        return chainAddressSegWitEntity.getChainId() == ((C10854bwM) objectRef.element).AEQbTJ() && (chainAddressSegWitEntity.getAddressType() == AddressType.P2SHType.getValue() || chainAddressSegWitEntity.getAddressType() == AddressType.P2SHCommonType.getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean OLrzqt(Ref.ObjectRef objectRef, ChainAddressSegWitEntity chainAddressSegWitEntity) {
        Intrinsics.checkNotNullParameter(chainAddressSegWitEntity, "");
        return chainAddressSegWitEntity.getChainId() == ((C10854bwM) objectRef.element).AEQbTJ() && chainAddressSegWitEntity.getAddressType() == AddressType.P2SHType.getValue();
    }

    public final AbstractC58260yxt<C12821cuH> KWHzl(final C12786ctZ c12786ctZ, final java.lang.String str, final int i, final java.lang.String str2, final Mnemonic mnemonic, final java.lang.String str3, final java.lang.String str4, final boolean z, final java.lang.String str5, final WalletType walletType, final boolean z2, final boolean z3, final boolean z4) {
        C10856bwO.copydefault(this.EZpvd, 0, "generateSmartWallet");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str2);
        final Function1 function1 = new Function1() { // from class: o.cCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.copydefault(str2, mnemonic, this, str3, str4, str5, str, i, c12786ctZ, walletType, z, z2, z3, z4, (java.lang.String) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtAhwBna.copydefault(new InterfaceC58229yxO() { // from class: o.cCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.ixgjPv(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cCs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.AEQbTJ(this.OLrzqt, str3, str4, str5, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cCt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.DCUTEIdCUTEI(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return abstractC58260yxtCopydefault2;
    }

    public static final C12821cuH ixgjPv(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH copydefault(java.lang.String str, Mnemonic mnemonic, C13092czN c13092czN, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, C12786ctZ c12786ctZ, WalletType walletType, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str6) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str6, "");
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str6, mnemonic.getPhrase(), true);
        java.lang.String strAEQbTJ2 = xXW.OLrzqt.AEQbTJ(str, str6, strAEQbTJ, true);
        if (mnemonic.getPhrase().length() == 0 || strAEQbTJ2.length() == 0 || !C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ2, mnemonic.getPhrase())) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "Mnemonic is wrong");
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, "generateSmartWallet", WalletType.HDWallet, "Mnemonic is wrong", CreateOrImportType.CREATE_WALLET);
            throw WalletImportError.Companion.gEmmrt();
        }
        if (str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0 || str4 == null || str4.length() == 0) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, (str2 == null || str2.length() == 0) + " " + (str3 == null || str3.length() == 0) + " " + (str4 == null || str4.length() == 0));
            c13092czN.KWHzl().KWHzl(c13092czN.EZpvd, "generateSmartWallet", "aaAddress.isEmpty() " + (str2.length() == 0) + ", verifyingContract.isEmpty() " + (str3.length() == 0) + ", eoaAddress.isEmpty() " + (str4.length() == 0));
            throw WalletImportError.Companion.copydefault();
        }
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams(mnemonic.getPhrase(), mnemonic.getLanguage(), (java.lang.String) null, true, 4, (DefaultConstructorMarker) null));
        return C12821cuH.Companion.KWHzl(str5, i, c12786ctZ, strAEQbTJ, mnemonic.getPhrase(), mnemonic.getLanguage(), keyPairOLrzqt.getPubKey(), keyPairOLrzqt.getPrvKey(), walletType, z, z2, z3, z4);
    }

    public static final C12821cuH DCUTEIdCUTEI(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH AEQbTJ(C13092czN c13092czN, java.lang.String str, java.lang.String str2, java.lang.String str3, C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        java.util.Iterator<T> it = C10954byG.EZpvd.valueOf().OLrzqt().iterator();
        while (it.hasNext()) {
            c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), ((C10854bwM) it.next()).AhwBna(), str, AddressType.Legacy.getValue(), "", null, str2, str3, 32, null));
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuH.AYXKKw().size());
        if (c12821cuH.AYXKKw().isEmpty() || c12821cuH.valueOf().isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return c12821cuH;
    }

    public final AbstractC58260yxt<C12821cuH> AEQbTJ(final java.lang.String str, final java.lang.String str2, final long j, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final WalletType walletType) {
        C10856bwO.copydefault(this.EZpvd, 0, "generatePrivateKeySmartWallet");
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str2);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtKWHzl = EZpvd().KWHzl(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.KeyWallet.ordinal())));
        final Function2 function2 = new Function2() { // from class: o.cBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.EZpvd(str2, str3, this, str, j, walletType, str4, str5, str6, (java.lang.String) obj, (java.util.List) obj2);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtOLrzqt = AbstractC58260yxt.OLrzqt(abstractC58260yxtAhwBna, abstractC58260yxtKWHzl, new InterfaceC58223yxI() { // from class: o.cBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C13092czN.djBIcL(function2, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final C12821cuH djBIcL(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (C12821cuH) function2.invoke(obj, obj2);
    }

    public static final C12821cuH EZpvd(java.lang.String str, java.lang.String str2, C13092czN c13092czN, java.lang.String str3, long j, WalletType walletType, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List list) throws WalletImportError {
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str7, str2, true);
        java.lang.String strAEQbTJ2 = xXW.OLrzqt.AEQbTJ(str, str7, strAEQbTJ, true);
        if (str2.length() == 0 || strAEQbTJ2.length() == 0 || !C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ2, str2)) {
            C10856bwO.copydefault(c13092czN.EZpvd, 0, "privateKey is wrong");
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, "generatePrivateKeySmartWallet", WalletType.KeyWallet, "privateKey is wrong. privateKey is empty= " + (str2.length() == 0) + ", decryptedPrivateKey is empty= " + (strAEQbTJ2.length() == 0), CreateOrImportType.IMPORT_WALLET);
            throw WalletImportError.Companion.gEmmrt();
        }
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, str2, true, 3, (DefaultConstructorMarker) null));
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        cSX csx = (cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        C12821cuH c12821cuHKWHzl = actionBar.KWHzl(str3, j, new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.KeyWallet, csx.KWHzl(), csx.zLjUOn(), 0, 32, null), strAEQbTJ, str2, keyPairOLrzqt.getPubKey(), keyPairOLrzqt.getPrvKey(), walletType, false);
        java.util.List<C10854bwM> listOLrzqt = C10954byG.EZpvd.valueOf().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            if (((C10854bwM) obj).ejfBZ()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c12821cuHKWHzl.AYXKKw().add(new ChainAddressEntity(c12821cuHKWHzl.AhwBna(), ((C10854bwM) it.next()).AhwBna(), str4, AddressType.Legacy.getValue(), "", null, str5, str6, 32, null));
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuHKWHzl.AYXKKw().size());
        if (c12821cuHKWHzl.AYXKKw().isEmpty() || c12821cuHKWHzl.valueOf().isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return c12821cuHKWHzl;
    }

    public final void copydefault(C12821cuH c12821cuH, ChainAddressEntity chainAddressEntity) {
        for (CustomChainCoinMeta customChainCoinMeta : C10598brV.AEQbTJ.AhwBna()) {
            c12821cuH.AEQbTJ().add(new CustomChainAddressEntity(c12821cuH.AhwBna(), customChainCoinMeta.valueOf(), chainAddressEntity.getAddress(), chainAddressEntity.getPublicKey(), "", customChainCoinMeta.gEmmrt()));
        }
    }

    public final AbstractC58260yxt<C12821cuH> OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final long j, final java.lang.String str4) {
        C10856bwO.copydefault(this.EZpvd, 0, "generatePrivateKeyWallet");
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtEZpvd = this.AhwBna.EZpvd();
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAEQbTJ = this.AhwBna.AEQbTJ();
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str3);
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtKWHzl = EZpvd().KWHzl(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.KeyWallet.ordinal())));
        final yHT yht = new yHT() { // from class: o.cAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHT
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C13092czN.EZpvd(str3, str4, this, str2, j, str, (java.lang.Boolean) obj, (java.lang.Boolean) obj2, (java.lang.String) obj3, (java.util.List) obj4);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtAEQbTJ2 = AbstractC58260yxt.AEQbTJ(abstractC58260yxtEZpvd, abstractC58260yxtAEQbTJ, abstractC58260yxtAhwBna, abstractC58260yxtKWHzl, new InterfaceC58230yxP() { // from class: o.cAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58230yxP
            public final java.lang.Object EZpvd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return C13092czN.OLrzqt(yht, obj, obj2, obj3, obj4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ2, "");
        return abstractC58260yxtAEQbTJ2;
    }

    public static final C12821cuH OLrzqt(yHT yht, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        Intrinsics.checkNotNullParameter(obj4, "");
        return (C12821cuH) yht.invoke(obj, obj2, obj3, obj4);
    }

    public static final C12821cuH EZpvd(java.lang.String str, java.lang.String str2, C13092czN c13092czN, java.lang.String str3, long j, java.lang.String str4, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str5, java.util.List list) throws WalletImportError {
        C12786ctZ c12786ctZ;
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str5, str2, true);
        xXW xxw = xXW.OLrzqt;
        java.lang.String strAEQbTJ2 = xxw.AEQbTJ(str, str5, strAEQbTJ, true);
        boolean zCopydefault = C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ2, str2);
        if (str2.length() == 0 || strAEQbTJ2.length() == 0 || !zCopydefault) {
            java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt("1", "KeyWallet"), C56390yDp.OLrzqt("2", java.lang.Integer.valueOf(str2.length())), C56390yDp.OLrzqt("3", java.lang.Integer.valueOf(strAEQbTJ.length())), C56390yDp.OLrzqt("4", java.lang.Integer.valueOf(strAEQbTJ2.length())), C56390yDp.OLrzqt("5", java.lang.Boolean.valueOf(zCopydefault)), C56390yDp.OLrzqt(OrderDetailListItem.SLIP_OUT, bool), C56390yDp.OLrzqt("7", bool2), C56390yDp.OLrzqt("8", java.lang.Integer.valueOf(str.length())), C56390yDp.OLrzqt("9", java.lang.Integer.valueOf(str5.length())), C56390yDp.OLrzqt("10", java.lang.Boolean.valueOf(xxw.AEQbTJ(str, str5))), C56390yDp.OLrzqt("11", java.lang.Boolean.valueOf(C34702nhN.OLrzqt.copydefault())), C56390yDp.OLrzqt("12", xVW.copydefault())));
            java.lang.String str6 = c13092czN.EZpvd;
            Intrinsics.copydefault((java.lang.Object) json);
            C10856bwO.copydefault(str6, 0, json);
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, "generatePrivateKeyWallet", WalletType.KeyWallet, json, CreateOrImportType.IMPORT_WALLET);
            throw WalletImportError.Companion.gEmmrt();
        }
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, str2, true, 3, (DefaultConstructorMarker) null));
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        if (list.isEmpty()) {
            c12786ctZ = new C12786ctZ(null, str4, WalletType.KeyWallet, 0L, 0, 0, 57, null);
        } else {
            cSX csx = (cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            c12786ctZ = new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.KeyWallet, csx.KWHzl(), csx.zLjUOn(), 0, 32, null);
        }
        C12821cuH c12821cuHAEQbTJ = actionBar.AEQbTJ(str3, j, c12786ctZ, strAEQbTJ, str2, keyPairOLrzqt.getPubKey(), keyPairOLrzqt.getPrvKey(), false);
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(j);
        java.lang.Object obj = null;
        if (c10854bwMKWHzl == null) {
            CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(j);
            c10854bwMKWHzl = customChainCoinMetaOLrzqt != null ? customChainCoinMetaOLrzqt.AEQbTJ() : null;
            if (c10854bwMKWHzl == null) {
                c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, WalletType.KeyWallet, "chainMeta is null. chainId = " + j, CreateOrImportType.IMPORT_WALLET, "generatePrivateKeyWallet");
                throw WalletImportError.Companion.isConnected();
            }
        }
        if (!c10854bwMKWHzl.RdAHlO()) {
            EZpvd(c12821cuHAEQbTJ, c10854bwMKWHzl);
        } else {
            java.util.Iterator<T> it = c10954byG.valueOf().OLrzqt(c10854bwMKWHzl.QOLQEE()).iterator();
            while (it.hasNext()) {
                EZpvd(c12821cuHAEQbTJ, (C10854bwM) it.next());
            }
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuHAEQbTJ.AYXKKw());
        if (c12821cuHAEQbTJ.AYXKKw().isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        java.util.Iterator<T> it2 = c12821cuHAEQbTJ.AYXKKw().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            java.lang.Object next = it2.next();
            C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(((ChainAddressEntity) next).getChainId());
            if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.ejfBZ()) {
                obj = next;
                break;
            }
        }
        ChainAddressEntity chainAddressEntity = (ChainAddressEntity) obj;
        if (chainAddressEntity != null) {
            c13092czN.copydefault(c12821cuHAEQbTJ, chainAddressEntity);
        }
        return c12821cuHAEQbTJ;
    }

    public static final void EZpvd(C12821cuH c12821cuH, final C10854bwM c10854bwM) {
        java.lang.String accountName;
        if (c10854bwM.OuxcSI()) {
            C13847daM c13847daM = new C13847daM(c10854bwM.fetchVPNInfo());
            java.lang.String strAkhnZx = c12821cuH.AkhnZx();
            Intrinsics.copydefault((java.lang.Object) strAkhnZx);
            AddressType addressType = AddressType.Legacy;
            WalletAddressItem walletAddressItemKWHzl = c13847daM.KWHzl(strAkhnZx, addressType.getValue(), c12821cuH.AhwBna());
            EOSInfoEntity eOSInfoEntityDjBIcL = c12821cuH.djBIcL();
            if (eOSInfoEntityDjBIcL != null) {
                java.lang.String address = walletAddressItemKWHzl != null ? walletAddressItemKWHzl.getAddress() : null;
                if (address == null) {
                    address = "";
                }
                eOSInfoEntityDjBIcL.setPubKey(address);
            }
            java.util.ArrayList<ChainAddressEntity> arrayListAYXKKw = c12821cuH.AYXKKw();
            java.lang.String strAhwBna = c12821cuH.AhwBna();
            long jAEQbTJ = c10854bwM.AEQbTJ();
            EOSInfoEntity eOSInfoEntityDjBIcL2 = c12821cuH.djBIcL();
            java.lang.String str = (eOSInfoEntityDjBIcL2 == null || (accountName = eOSInfoEntityDjBIcL2.getAccountName()) == null) ? "" : accountName;
            int value = addressType.getValue();
            java.lang.String pubKey = walletAddressItemKWHzl != null ? walletAddressItemKWHzl.getPubKey() : null;
            arrayListAYXKKw.add(new ChainAddressEntity(strAhwBna, jAEQbTJ, str, value, pubKey == null ? "" : pubKey, null, null, null, 224, null));
            java.util.ArrayList<C11283cIm> arrayListOLrzqt = c12821cuH.OLrzqt();
            java.lang.String signature = walletAddressItemKWHzl != null ? walletAddressItemKWHzl.getSignature() : null;
            arrayListOLrzqt.add(new C11283cIm(addressType.getValue(), c10854bwM.fetchVPNInfo(), signature == null ? "" : signature, null, null, 24, null));
            return;
        }
        if (c10854bwM.DsrFlB()) {
            C13847daM c13847daM2 = new C13847daM(c10854bwM.fetchVPNInfo());
            java.lang.String strAkhnZx2 = c12821cuH.AkhnZx();
            Intrinsics.copydefault((java.lang.Object) strAkhnZx2);
            WalletAddressList walletAddressListOLrzqt = c13847daM2.OLrzqt(strAkhnZx2, C8322bAY.KWHzl.KWHzl(c10854bwM.fetchVPNInfo(), true), c12821cuH.AhwBna());
            if (walletAddressListOLrzqt != null) {
                for (CoinAddressBean coinAddressBean : walletAddressListOLrzqt.getAddressList()) {
                    c12821cuH.AuCTel().add(new ChainAddressSegWitEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), coinAddressBean.getType(), coinAddressBean.getAddress(), walletAddressListOLrzqt.getPubKey(), null, 32, null));
                    c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean.getType(), c10854bwM.fetchVPNInfo(), walletAddressListOLrzqt.getSignature(), null, null, 24, null));
                    if (c10854bwM.flVtFt()) {
                        C56406yEe.AEQbTJ(c12821cuH.AuCTel(), new Function1() { // from class: o.cAN
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(C13092czN.copydefault(c10854bwM, (ChainAddressSegWitEntity) obj));
                            }
                        });
                    }
                    if (coinAddressBean.getType() == C8322bAY.KWHzl.KWHzl(c10854bwM.fetchVPNInfo(), true)) {
                        c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressListOLrzqt.getPubKey(), null, null, null, 224, null));
                    }
                }
                return;
            }
            return;
        }
        C13847daM c13847daM3 = new C13847daM(c10854bwM.fetchVPNInfo());
        java.lang.String strAkhnZx3 = c12821cuH.AkhnZx();
        Intrinsics.copydefault((java.lang.Object) strAkhnZx3);
        WalletAddressList walletAddressListOLrzqt2 = c13847daM3.OLrzqt(strAkhnZx3, AddressType.Legacy.getValue(), c12821cuH.AhwBna());
        if (walletAddressListOLrzqt2 != null) {
            for (CoinAddressBean coinAddressBean2 : walletAddressListOLrzqt2.getAddressList()) {
                c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), coinAddressBean2.getAddress(), coinAddressBean2.getType(), walletAddressListOLrzqt2.getPubKey(), null, null, null, 224, null));
                c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean2.getType(), c10854bwM.fetchVPNInfo(), walletAddressListOLrzqt2.getSignature(), null, null, 24, 0 == true ? 1 : 0));
            }
        }
    }

    public static final boolean copydefault(C10854bwM c10854bwM, ChainAddressSegWitEntity chainAddressSegWitEntity) {
        Intrinsics.checkNotNullParameter(chainAddressSegWitEntity, "");
        return chainAddressSegWitEntity.getChainId() == c10854bwM.AEQbTJ() && (chainAddressSegWitEntity.getAddressType() == AddressType.P2SHType.getValue() || chainAddressSegWitEntity.getAddressType() == AddressType.P2SHCommonType.getValue());
    }

    public final AbstractC58260yxt<C12821cuH> AEQbTJ(final C12786ctZ c12786ctZ, final java.lang.String str, final int i, final java.lang.String str2, final Mnemonic mnemonic, boolean z, boolean z2, final boolean z3, final boolean z4) throws WalletImportError {
        C10856bwO.copydefault(this.EZpvd, 0, "generateHDWallet");
        final C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(607L);
        if (c10854bwMOLrzqt == null) {
            throw new WalletImportError(103, "Not support chain.");
        }
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtEZpvd = this.AhwBna.EZpvd();
        AbstractC58260yxt<java.lang.Boolean> abstractC58260yxtAEQbTJ = this.AhwBna.AEQbTJ();
        AbstractC58260yxt<java.lang.String> abstractC58260yxtAhwBna = this.AhwBna.AhwBna(str2);
        final yHO yho = new yHO() { // from class: o.cAi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.copydefault(str2, mnemonic, this, c10854bwMOLrzqt, str, i, c12786ctZ, z3, z4, (java.lang.Boolean) obj, (java.lang.Boolean) obj2, (java.lang.String) obj3);
            }
        };
        AbstractC58260yxt abstractC58260yxtAEQbTJ2 = AbstractC58260yxt.AEQbTJ(abstractC58260yxtEZpvd, abstractC58260yxtAEQbTJ, abstractC58260yxtAhwBna, new InterfaceC58228yxN() { // from class: o.cAj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58228yxN
            public final java.lang.Object AEQbTJ(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C13092czN.gEmmrt(yho, obj, obj2, obj3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtAEQbTJ2, "");
        AbstractC58260yxt abstractC58260yxtEZpvd2 = C11607cUn.EZpvd(abstractC58260yxtAEQbTJ2);
        final Function1 function1 = new Function1() { // from class: o.cAk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt(c10854bwMOLrzqt, this, (C12821cuH) obj);
            }
        };
        AbstractC58260yxt<C12821cuH> abstractC58260yxtCopydefault = abstractC58260yxtEZpvd2.copydefault(new InterfaceC58229yxO() { // from class: o.cAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.Dmq(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final C12821cuH gEmmrt(yHO yho, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        Intrinsics.checkNotNullParameter(obj3, "");
        return (C12821cuH) yho.invoke(obj, obj2, obj3);
    }

    public static final C12821cuH copydefault(java.lang.String str, Mnemonic mnemonic, C13092czN c13092czN, C10854bwM c10854bwM, java.lang.String str2, int i, C12786ctZ c12786ctZ, boolean z, boolean z2, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str3) throws WalletImportError {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strAEQbTJ = xXX.EZpvd.AEQbTJ(str, str3, mnemonic.getPhrase(), true);
        xXW xxw = xXW.OLrzqt;
        java.lang.String strAEQbTJ2 = xxw.AEQbTJ(str, str3, strAEQbTJ, true);
        boolean zCopydefault = C54909xZv.OLrzqt.copydefault(C9678baC.Companion.AEQbTJ(), strAEQbTJ2, mnemonic.getPhrase());
        if (mnemonic.getPhrase().length() == 0 || strAEQbTJ2.length() == 0 || !zCopydefault) {
            java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(C56424yEw.gEmmrt(C56390yDp.OLrzqt("1", "TonWallet"), C56390yDp.OLrzqt("2", java.lang.Integer.valueOf(mnemonic.getPhrase().length())), C56390yDp.OLrzqt("3", java.lang.Integer.valueOf(strAEQbTJ.length())), C56390yDp.OLrzqt("4", java.lang.Integer.valueOf(strAEQbTJ2.length())), C56390yDp.OLrzqt("5", java.lang.Boolean.valueOf(zCopydefault)), C56390yDp.OLrzqt(OrderDetailListItem.SLIP_OUT, bool), C56390yDp.OLrzqt("7", bool2), C56390yDp.OLrzqt("8", java.lang.Integer.valueOf(str.length())), C56390yDp.OLrzqt("9", java.lang.Integer.valueOf(str3.length())), C56390yDp.OLrzqt("10", java.lang.Boolean.valueOf(xxw.AEQbTJ(str, str3))), C56390yDp.OLrzqt("11", java.lang.Boolean.valueOf(C34702nhN.OLrzqt.copydefault())), C56390yDp.OLrzqt("12", xVW.copydefault())));
            java.lang.String str4 = c13092czN.EZpvd;
            Intrinsics.copydefault((java.lang.Object) json);
            C10856bwO.copydefault(str4, 0, json);
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, "generateTonWallet", WalletType.TonWallet, json, CreateOrImportType.CREATE_WALLET);
            throw WalletImportError.Companion.gEmmrt();
        }
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams(mnemonic.getPhrase(), mnemonic.getLanguage(), (java.lang.String) null, true, 4, (DefaultConstructorMarker) null));
        return C12821cuH.Companion.OLrzqt(str2, c10854bwM.AEQbTJ(), c10854bwM, i, c12786ctZ, strAEQbTJ, mnemonic.getPhrase(), mnemonic.getLanguage(), keyPairOLrzqt.getPubKey(), keyPairOLrzqt.getPrvKey(), z, z2);
    }

    public static final C12821cuH Dmq(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH OLrzqt(C10854bwM c10854bwM, C13092czN c13092czN, C12821cuH c12821cuH) throws WalletImportError {
        Intrinsics.checkNotNullParameter(c12821cuH, "");
        C54908xZu c54908xZu = C54908xZu.AEQbTJ;
        java.lang.String strFetchVPNInfo = c12821cuH.fetchVPNInfo();
        Intrinsics.copydefault((java.lang.Object) strFetchVPNInfo);
        WalletAddressList walletAddressListKWHzl = c54908xZu.KWHzl(strFetchVPNInfo, c12821cuH.DbNXlk(), c10854bwM.QKVWgx(), c10854bwM.fetchVPNInfo(), c12821cuH.KWHzl(), AddressType.Legacy.getValue(), c10854bwM.iwGUEr(), (MLKEMEngine.KyberPolyBytes & 128) != 0, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? false : true, c12821cuH.AhwBna());
        if (walletAddressListKWHzl != null) {
            for (CoinAddressBean coinAddressBean : walletAddressListKWHzl.getAddressList()) {
                c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), coinAddressBean.getAddress(), coinAddressBean.getType(), walletAddressListKWHzl.getPubKey(), null, null, null, 224, null));
                c12821cuH.OLrzqt().add(new C11283cIm(coinAddressBean.getType(), c10854bwM.fetchVPNInfo(), walletAddressListKWHzl.getSignature(), null, null, 24, 0 == true ? 1 : 0));
            }
        }
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "default address list size is " + c12821cuH.AYXKKw().size());
        C10856bwO.copydefault(c13092czN.EZpvd, 0, "segwit address list size is " + c12821cuH.AuCTel().size());
        if (c12821cuH.AYXKKw().isEmpty()) {
            throw WalletImportError.Activity.dataError$default(WalletImportError.Companion, null, 2, 1, null);
        }
        return c12821cuH;
    }

    public static /* synthetic */ AbstractC58260yxt generateTrackingWallet$default(C13092czN c13092czN, java.lang.String str, java.lang.String str2, long j, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = false;
        }
        return c13092czN.OLrzqt(str, str2, j, str3, z);
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.cuH> */
    public final AbstractC58260yxt<C12821cuH> OLrzqt(final java.lang.String str, final java.lang.String str2, final long j, final java.lang.String str3, final boolean z) {
        AbstractC58260yxt<java.util.List<cSX>> abstractC58260yxtKWHzl = EZpvd().KWHzl(C56402yEa.EZpvd(java.lang.Integer.valueOf(WalletType.TrackingWallet.ordinal())));
        final Function1 function1 = new Function1() { // from class: o.czU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C13092czN.OLrzqt(str3, str2, j, str, z, this, (java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.czT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C13092czN.spnCvw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final C12821cuH spnCvw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C12821cuH) function1.invoke(obj);
    }

    public static final C12821cuH OLrzqt(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, boolean z, C13092czN c13092czN, java.util.List list) throws WalletImportError {
        C12786ctZ c12786ctZ;
        Intrinsics.checkNotNullParameter(list, "");
        KeyPair keyPairOLrzqt = xYP.AEQbTJ.OLrzqt(new KeyPairParams((java.lang.String) null, (java.lang.String) null, str, false, 3, (DefaultConstructorMarker) null));
        C12821cuH.ActionBar actionBar = C12821cuH.Companion;
        if (list.isEmpty()) {
            c12786ctZ = new C12786ctZ(null, str3, WalletType.TrackingWallet, 0L, 0, 0, 57, null);
        } else {
            cSX csx = (cSX) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
            c12786ctZ = new C12786ctZ(csx.getNewProxyInstance(), csx.uzCIH(), WalletType.TrackingWallet, csx.KWHzl(), csx.zLjUOn(), 0, 32, null);
        }
        C12821cuH c12821cuHEZpvd = actionBar.EZpvd(str2, j, c12786ctZ, z ? WalletType.TrackingWallet : WalletType.AAWallet, str, keyPairOLrzqt.getPubKey(), keyPairOLrzqt.getPrvKey(), false);
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(j);
        if (c10854bwMKWHzl == null) {
            c13092czN.KWHzl().EZpvd(c13092czN.EZpvd, WalletType.TrackingWallet, "chainMeta is null. chainId= " + j, CreateOrImportType.IMPORT_WALLET, "generateTrackingWallet");
            throw WalletImportError.Companion.isConnected();
        }
        if (z) {
            java.util.List<C10854bwM> listOLrzqt = c10954byG.valueOf().OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listOLrzqt) {
                if (((C10854bwM) obj).ejfBZ()) {
                    arrayList.add(obj);
                }
            }
            for (java.util.Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                c12821cuHEZpvd.AYXKKw().add(new ChainAddressEntity(c12821cuHEZpvd.AhwBna(), ((C10854bwM) it.next()).AhwBna(), str, AddressType.Legacy.getValue(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
            }
        } else if (!c10854bwMKWHzl.RdAHlO()) {
            KWHzl(c12821cuHEZpvd, str, c10854bwMKWHzl);
        } else {
            java.util.Iterator<T> it2 = c10954byG.valueOf().OLrzqt(c10854bwMKWHzl.QOLQEE()).iterator();
            while (it2.hasNext()) {
                KWHzl(c12821cuHEZpvd, str, (C10854bwM) it2.next());
            }
        }
        return c12821cuHEZpvd;
    }

    public static final void KWHzl(C12821cuH c12821cuH, java.lang.String str, C10854bwM c10854bwM) {
        if (c10854bwM.DsrFlB()) {
            java.util.ArrayList<ChainAddressEntity> arrayListAYXKKw = c12821cuH.AYXKKw();
            java.lang.String strAhwBna = c12821cuH.AhwBna();
            long jAEQbTJ = c10854bwM.AEQbTJ();
            C8322bAY c8322bAY = C8322bAY.KWHzl;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            arrayListAYXKKw.add(new ChainAddressEntity(strAhwBna, jAEQbTJ, str, c8322bAY.KWHzl(c10854bwM.fetchVPNInfo(), str), str2, str3, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
            c12821cuH.AuCTel().add(new ChainAddressSegWitEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), c8322bAY.KWHzl(c10854bwM.fetchVPNInfo(), str), str, str2, str3, 48, 0 == true ? 1 : 0));
            return;
        }
        c12821cuH.AYXKKw().add(new ChainAddressEntity(c12821cuH.AhwBna(), c10854bwM.AEQbTJ(), str, AddressType.Legacy.getValue(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
    }

    public final void copydefault(java.lang.String str) {
        KWHzl().OLrzqt(this.EZpvd, "generateMPCWallet", str);
    }

    public final void EZpvd(java.lang.String str) {
        KWHzl().OLrzqt(this.EZpvd, "generateMPCSmartWallet", str);
    }
}
