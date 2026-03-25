package com.okinc.wallet.mln.service;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.mln.service.UDWallet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C10954byG;
import o.C33129mqd;
import o.C43246rlf;
import o.C43248rlh;
import o.InterfaceC54825xWs;
import o.InterfaceC60044zuT;
import o.InterfaceC9731bbC;
import o.InterfaceC9738bbJ;
import o.InterfaceC9742bbN;
import o.InterfaceC9744bbP;
import o.InterfaceC9780bbz;
import o.InterfaceC9852bdR;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDWallet extends LuaUserdata<InterfaceC9738bbJ> {
    public static final String LUA_CLASS_NAME = "Wallet";
    public static final String[] methods = {"addressForRealChainId", "addressForRealEvmChainId", "addressForCoinId", "walletId", "walletName", "walletAccountName", "walletType", "canTrade", "imageUrl", "nftAsset", "coinAsset", "allCoinAsset", "coinAssetForRealChainId", "coinAssetForRealEvmChainId", "coinAssetForCoinId", "getWalletAllChainAddresses", "isSupportContractWithChainId", "isBackup", "handleMpcWalletStatus", "isSupportNFTBRC20", "isSupportNFTXRC", "asynGetMpcWalletStatus", "handleMpcWalletStatus", "synchronizationGetMpcWalletStatus", "shouldChainUpgrade", "addressModelArrayForCoinId", "addressModelForCoinId", "addressModelFromAddress", "getCoinAllValidAssetFromCoinId", "getTotalAmountWithCoinId", "getTotalCurrencyAmountWithCoinId", "getTotalDisplayAmountWithCoinId", "isAAWalletOfMPC", "isAAWalletOfHardware", "isEVMCompatible", "isHardwareKeyStoneWallet", "supportedChainMetas", "isHardwareOneKeyWallet", "isHardwareNeed712EncodedWallet", "totalAssetValuation", "isHardwareNeed712EncodedWallet", "getMPCStatusDescription", "getAAStatusDescription", "handleMPCWalletUnavailableStatusNoAlert", "isSupportNFTARC20", "getBTCCompressedPublicKey"};
    public InterfaceC9738bbJ wallet;

    public final int KWHzl(int i) {
        if (i == 4) {
            return 3;
        }
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 6;
        }
        if (i == 3) {
            return 4;
        }
        return i == 6 ? 8 : -1;
    }

    @InterfaceC60044zuT
    public UDWallet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDWallet(@NonNull Globals globals, InterfaceC9738bbJ interfaceC9738bbJ) {
        super(globals, interfaceC9738bbJ);
        this.wallet = interfaceC9738bbJ;
    }

    @InterfaceC60044zuT
    public LuaValue[] asynGetMpcWalletStatus(LuaValue[] luaValueArr) {
        InterfaceC9738bbJ interfaceC9738bbJ = this.wallet;
        if (interfaceC9738bbJ == null || (!interfaceC9738bbJ.ORxRYg() && !this.wallet.wlaJM())) {
            return LuaValue.rNil();
        }
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass4());
        return LuaValue.varargsOf(uDNativeLoader);
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWallet$4, reason: invalid class name */
    public class AnonymousClass4 implements UDNativeLoader.StateListAnimator {
        public final AppCompatActivity KWHzl;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        public AnonymousClass4() {
            this.KWHzl = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWallet.this.globals);
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            ((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).copydefault(UDWallet.this.wallet, this.KWHzl, new Function1() { // from class: o.ydK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDWallet.AnonymousClass4.AEQbTJ(application, (MpcWalletService.MpcWalletAbleStatus) obj);
                }
            });
        }

        public static /* synthetic */ Unit AEQbTJ(UDNativeLoader.Application application, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
            application.copydefault(LuaNumber.valueOf(mpcWalletAbleStatus.ordinal()));
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] shouldChainUpgrade(LuaValue[] luaValueArr) {
        InterfaceC9738bbJ interfaceC9738bbJ;
        if (luaValueArr == null || luaValueArr.length == 0 || (interfaceC9738bbJ = this.wallet) == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rBoolean(interfaceC9738bbJ.fetchVPNInfo(luaValueArr[0].toLong()));
    }

    @InterfaceC60044zuT
    public LuaValue[] synchronizationGetMpcWalletStatus(LuaValue[] luaValueArr) {
        InterfaceC9738bbJ interfaceC9738bbJ = this.wallet;
        return (interfaceC9738bbJ == null || !(interfaceC9738bbJ.ORxRYg() || this.wallet.wlaJM())) ? LuaValue.rNil() : LuaValue.varargsOf(LuaNumber.valueOf(((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).copydefault(this.wallet).ordinal()));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWallet$2, reason: invalid class name */
    public class AnonymousClass2 implements UDNativeLoader.StateListAnimator {
        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        public AnonymousClass2() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            final AppCompatActivity appCompatActivity = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWallet.this.globals);
            if (appCompatActivity == null) {
                return;
            }
            ((MpcWalletService) C43248rlh.KWHzl.AEQbTJ(MpcWalletService.class)).KWHzl(UDWallet.this.wallet, appCompatActivity, new Function1() { // from class: o.ydN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDWallet.AnonymousClass2.EZpvd(appCompatActivity, application, (java.lang.Boolean) obj);
                }
            });
        }

        public static /* synthetic */ Unit EZpvd(AppCompatActivity appCompatActivity, final UDNativeLoader.Application application, final Boolean bool) {
            if (appCompatActivity == null) {
                return null;
            }
            appCompatActivity.runOnUiThread(new Runnable() { // from class: o.ydL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDWallet.AnonymousClass2.KWHzl(application, bool);
                }
            });
            return null;
        }

        public static /* synthetic */ void KWHzl(UDNativeLoader.Application application, Boolean bool) {
            application.copydefault(LuaBoolean.AEQbTJ(bool.booleanValue()));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] handleMpcWalletStatus(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass2());
        return LuaValue.varargsOf(uDNativeLoader);
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWallet$1, reason: invalid class name */
    public class AnonymousClass1 implements UDNativeLoader.StateListAnimator {
        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        public AnonymousClass1() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
            final AppCompatActivity appCompatActivity = (AppCompatActivity) UDWalletCoreNew.KWHzl(UDWallet.this.globals);
            if (appCompatActivity == null) {
                return;
            }
            C43248rlh c43248rlh = C43248rlh.KWHzl;
            ((MpcWalletService) c43248rlh.AEQbTJ(MpcWalletService.class)).KWHzl(((MpcWalletService) c43248rlh.AEQbTJ(MpcWalletService.class)).copydefault(UDWallet.this.wallet), UDWallet.this.wallet, appCompatActivity, new Function1() { // from class: o.ydQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDWallet.AnonymousClass1.EZpvd(appCompatActivity, application, (java.lang.Boolean) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit EZpvd(AppCompatActivity appCompatActivity, final UDNativeLoader.Application application, final Boolean bool) {
            if (appCompatActivity == null) {
                return null;
            }
            appCompatActivity.runOnUiThread(new Runnable() { // from class: o.ydO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    UDWallet.AnonymousClass1.OLrzqt(application, bool);
                }
            });
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(UDNativeLoader.Application application, Boolean bool) {
            application.copydefault(LuaBoolean.AEQbTJ(bool.booleanValue()));
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] handleMPCWalletUnavailableStatusNoAlert(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass1());
        return LuaValue.varargsOf(uDNativeLoader);
    }

    @InterfaceC60044zuT
    public LuaValue[] isBackup(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.zLjUOn());
    }

    @InterfaceC60044zuT
    public LuaValue[] isSupportContractWithChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        return LuaValue.rBoolean(this.wallet.AhwBna(luaValueArr[0].toLong()));
    }

    @InterfaceC60044zuT
    public LuaValue[] isSupportNFTBRC20(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.QKVWgx());
    }

    @InterfaceC60044zuT
    public LuaValue[] isSupportNFTXRC(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || luaValueArr.length < 3 || this.wallet == null || (luaValue = luaValueArr[0]) == null || luaValueArr[1] == null || luaValueArr[2] == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rBoolean(this.wallet.KWHzl(luaValue.toInt(), KWHzl(luaValueArr[1].toInt()), luaValueArr[2].toBoolean()));
    }

    @InterfaceC60044zuT
    public LuaValue[] isSupportNFTARC20(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.OcIXYQ());
    }

    @InterfaceC60044zuT
    public LuaValue[] addressForRealChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : null;
        InterfaceC9780bbz interfaceC9780bbzEZpvd = this.wallet.EZpvd(luaValueArr[0].toLong(), javaString != null ? Integer.valueOf(Integer.parseInt(javaString)) : null);
        if (interfaceC9780bbzEZpvd == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(interfaceC9780bbzEZpvd.getAddress());
    }

    @InterfaceC60044zuT
    public LuaValue[] addressForRealEvmChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        InterfaceC9780bbz interfaceC9780bbzCopydefault = this.wallet.copydefault(luaValueArr[0].toLong());
        if (interfaceC9780bbzCopydefault == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(interfaceC9780bbzCopydefault.getAddress());
    }

    @InterfaceC60044zuT
    public LuaValue[] addressForCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        InterfaceC9731bbC interfaceC9731bbCCopydefault = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().copydefault(Long.valueOf(luaValueArr[0].toLong()), true);
        if (interfaceC9731bbCCopydefault == null) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : null;
        InterfaceC9780bbz interfaceC9780bbzEZpvd = this.wallet.EZpvd(interfaceC9731bbCCopydefault.fetchVPNInfo(), javaString != null ? Integer.valueOf(Integer.parseInt(javaString)) : null);
        if (interfaceC9780bbzEZpvd == null) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(interfaceC9780bbzEZpvd.getAddress());
    }

    @InterfaceC60044zuT
    public LuaValue[] walletId(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.wallet.DbNXlk());
    }

    @InterfaceC60044zuT
    public LuaValue[] walletName(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.wallet.AYXKKw());
    }

    @InterfaceC60044zuT
    public LuaValue[] walletAccountName(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.wallet.AkhnZx());
    }

    @InterfaceC60044zuT
    public LuaValue[] walletType(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.wallet.getNewProxyInstance()));
    }

    @InterfaceC60044zuT
    public LuaValue[] canTrade(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.djSkpj());
    }

    @InterfaceC60044zuT
    public LuaValue[] isAAWalletOfMPC(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.wlaJM());
    }

    @InterfaceC60044zuT
    public LuaValue[] isAAWalletOfHardware(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.iwGUEr());
    }

    @InterfaceC60044zuT
    public LuaValue[] isEVMCompatible(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.AuCTelauCTel());
    }

    @InterfaceC60044zuT
    public LuaValue[] isHardwareKeyStoneWallet(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.AxsJAY());
    }

    @InterfaceC60044zuT
    public LuaValue[] isHardwareOneKeyWallet(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.zuBGHE());
    }

    @InterfaceC60044zuT
    public LuaValue[] isHardwareNeed712EncodedWallet(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.wallet.sSMYrx());
    }

    @InterfaceC60044zuT
    public LuaValue[] imageUrl(LuaValue[] luaValueArr) {
        String strFetchVPNInfo = this.wallet.fetchVPNInfo();
        if (C33129mqd.AhwBna(strFetchVPNInfo) > 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("android.resource://");
            stringBuffer.append(C43246rlf.OLrzqt.valueOf().getPackageName());
            stringBuffer.append("/");
            stringBuffer.append(strFetchVPNInfo);
            strFetchVPNInfo = stringBuffer.toString();
        }
        return LuaValue.rString(strFetchVPNInfo);
    }

    @InterfaceC60044zuT
    public LuaValue[] nftAsset(LuaValue[] luaValueArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC9744bbP> it = this.wallet.fARcdN().iterator();
        while (it.hasNext()) {
            arrayList.add(new UDWalletNFTAsset(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] coinAsset(LuaValue[] luaValueArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC9742bbN> it = this.wallet.gEmmrt().iterator();
        while (it.hasNext()) {
            arrayList.add(new UDWalletCoinAsset(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] allCoinAsset(LuaValue[] luaValueArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC9742bbN> it = this.wallet.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new UDWalletCoinAsset(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] coinAssetForRealChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        Long lValueOf = Long.valueOf(luaValueArr[0].toLong());
        long jAhwBna = C10954byG.EZpvd.valueOf().copydefault(lValueOf.longValue()).AhwBna();
        String javaString = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : null;
        List<InterfaceC9742bbN> listKWHzl = this.wallet.KWHzl(Long.valueOf(jAhwBna).longValue());
        if (listKWHzl != null && listKWHzl.size() > 0) {
            if (listKWHzl.size() == 1) {
                return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, listKWHzl.get(0)));
            }
            InterfaceC9780bbz interfaceC9780bbzEZpvd = this.wallet.EZpvd(lValueOf.longValue(), javaString == null ? null : Integer.valueOf(Integer.parseInt(javaString)));
            if (interfaceC9780bbzEZpvd == null) {
                return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, (InterfaceC9742bbN) null));
            }
            int addressType = interfaceC9780bbzEZpvd.getAddressType();
            for (InterfaceC9742bbN interfaceC9742bbN : listKWHzl) {
                if (interfaceC9742bbN.EZpvd().getAddressType() == Integer.valueOf(addressType).intValue()) {
                    return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, interfaceC9742bbN));
                }
            }
        }
        return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, (InterfaceC9742bbN) null));
    }

    @InterfaceC60044zuT
    public LuaValue[] coinAssetForRealEvmChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        Long lValueOf = Long.valueOf(luaValueArr[0].toLong());
        long jAhwBna = C10954byG.EZpvd.valueOf().AEQbTJ(lValueOf.longValue()).AhwBna();
        String javaString = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : null;
        List<InterfaceC9742bbN> listKWHzl = this.wallet.KWHzl(Long.valueOf(jAhwBna).longValue());
        if (listKWHzl != null && listKWHzl.size() > 0) {
            if (listKWHzl.size() == 1) {
                return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, listKWHzl.get(0)));
            }
            InterfaceC9780bbz interfaceC9780bbzEZpvd = this.wallet.EZpvd(lValueOf.longValue(), javaString == null ? null : Integer.valueOf(Integer.parseInt(javaString)));
            if (interfaceC9780bbzEZpvd == null) {
                return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, (InterfaceC9742bbN) null));
            }
            int addressType = interfaceC9780bbzEZpvd.getAddressType();
            for (InterfaceC9742bbN interfaceC9742bbN : listKWHzl) {
                if (interfaceC9742bbN.EZpvd().getAddressType() == Integer.valueOf(addressType).intValue()) {
                    return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, interfaceC9742bbN));
                }
            }
        }
        return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, (InterfaceC9742bbN) null));
    }

    @InterfaceC60044zuT
    public LuaValue[] coinAssetForCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        long j = luaValueArr[0].toLong();
        long jFetchVPNInfo = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault().AEQbTJ(j, true).fetchVPNInfo();
        String javaString = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : null;
        List<InterfaceC9742bbN> listKWHzl = this.wallet.KWHzl(j);
        if (listKWHzl != null && listKWHzl.size() > 0) {
            if (listKWHzl.size() == 1) {
                return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, listKWHzl.get(0)));
            }
            InterfaceC9780bbz interfaceC9780bbzEZpvd = this.wallet.EZpvd(jFetchVPNInfo, javaString == null ? null : Integer.valueOf(Integer.parseInt(javaString)));
            if (interfaceC9780bbzEZpvd == null) {
                return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, (InterfaceC9742bbN) null));
            }
            int addressType = interfaceC9780bbzEZpvd.getAddressType();
            for (InterfaceC9742bbN interfaceC9742bbN : listKWHzl) {
                if (interfaceC9742bbN.EZpvd().getAddressType() == addressType) {
                    return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, interfaceC9742bbN));
                }
            }
        }
        return LuaValue.varargsOf(new UDWalletCoinAsset(this.globals, (InterfaceC9742bbN) null));
    }

    @InterfaceC60044zuT
    public LuaValue[] getWalletAllChainAddresses(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(new UDArray(this.globals, (Set) this.wallet.isConnected().stream().map(new Function<InterfaceC9780bbz, String>() { // from class: com.okinc.wallet.mln.service.UDWallet.5
            /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public String apply(InterfaceC9780bbz interfaceC9780bbz) {
                return interfaceC9780bbz.getAddress();
            }
        }).filter(new Predicate<String>() { // from class: com.okinc.wallet.mln.service.UDWallet.3
            /* JADX DEBUG: Method merged with bridge method: test(Ljava/lang/Object;)Z */
            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public boolean test(String str) {
                return C33129mqd.OLrzqt((CharSequence) str);
            }
        }).collect(Collectors.toSet())));
    }

    @InterfaceC60044zuT
    public LuaValue[] addressModelArrayForCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        long j = luaValueArr[0].toLong();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC9780bbz interfaceC9780bbz : (ArrayList) this.wallet.isConnected()) {
            if (interfaceC9780bbz.getCoinId() == Long.valueOf(j).longValue()) {
                arrayList.add(new UDChainAddress(getGlobals(), interfaceC9780bbz));
            }
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] addressModelForCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        Long lValueOf = Long.valueOf(luaValueArr[0].toLong());
        String javaString = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : null;
        ArrayList<InterfaceC9780bbz> arrayList = (ArrayList) this.wallet.isConnected();
        if (arrayList == null || arrayList.isEmpty()) {
            return LuaValue.rNil();
        }
        InterfaceC9780bbz interfaceC9780bbzEZpvd = this.wallet.EZpvd(Long.valueOf(C10954byG.EZpvd.valueOf().KWHzl(lValueOf.longValue()).fetchVPNInfo()).longValue(), javaString != null ? Integer.valueOf(Integer.parseInt(javaString)) : null);
        if (interfaceC9780bbzEZpvd != null) {
            javaString = String.valueOf(interfaceC9780bbzEZpvd.getAddressType());
        }
        if (!TextUtils.isEmpty(javaString)) {
            for (InterfaceC9780bbz interfaceC9780bbz : arrayList) {
                if (interfaceC9780bbz.getCoinId() == lValueOf.longValue() && String.valueOf(interfaceC9780bbz.getAddressType()).equals(javaString)) {
                    return LuaValue.varargsOf(new UDChainAddress(this.globals, interfaceC9780bbz));
                }
            }
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] addressModelFromAddress(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        String javaString = luaValueArr[0].toJavaString();
        String javaString2 = luaValueArr.length > 1 ? luaValueArr[1].toJavaString() : "";
        for (InterfaceC9780bbz interfaceC9780bbz : (ArrayList) this.wallet.isConnected()) {
            if (TextUtils.isEmpty(javaString2)) {
                if (interfaceC9780bbz.getAddress().equals(javaString) && interfaceC9780bbz.getChainId() != 70000061) {
                    return LuaValue.varargsOf(new UDChainAddress(this.globals, interfaceC9780bbz));
                }
            } else if (interfaceC9780bbz.getAddress().equals(javaString) && TextUtils.equals(String.valueOf(interfaceC9780bbz.getChainId()), javaString2)) {
                return LuaValue.varargsOf(new UDChainAddress(this.globals, interfaceC9780bbz));
            }
        }
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] getCoinAllValidAssetFromCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        long j = luaValueArr[0].toLong();
        ArrayList arrayList = new ArrayList();
        List<InterfaceC9742bbN> listKWHzl = this.wallet.KWHzl(Long.valueOf(j).longValue());
        if (listKWHzl != null && !listKWHzl.isEmpty()) {
            Iterator<InterfaceC9742bbN> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList.add(new UDWalletCoinAsset(getGlobals(), it.next()));
            }
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] getTotalAmountWithCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(this.wallet.valueOf(Long.valueOf(luaValueArr[0].toLong()).longValue()).copydefault());
    }

    @InterfaceC60044zuT
    public LuaValue[] getTotalCurrencyAmountWithCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(this.wallet.valueOf(Long.valueOf(luaValueArr[0].toLong()).longValue()).AhwBna());
    }

    @InterfaceC60044zuT
    public LuaValue[] getTotalDisplayAmountWithCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(this.wallet.valueOf(Long.valueOf(luaValueArr[0].toLong()).longValue()).AYXKKw());
    }

    @InterfaceC60044zuT
    public LuaValue[] supportedChainMetas(LuaValue[] luaValueArr) {
        try {
            List<InterfaceC9731bbC> listRcXXUw = this.wallet.RcXXUw();
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC9731bbC> it = listRcXXUw.iterator();
            while (it.hasNext()) {
                arrayList.add(new UDCoinMeta(this.globals, it.next()));
            }
            return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
        } catch (Exception unused) {
            return LuaValue.rNil();
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] getMPCStatusDescription(LuaValue[] luaValueArr) {
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        return LuaValue.rString(((MpcWalletService) c43248rlh.AEQbTJ(MpcWalletService.class)).EZpvd(((MpcWalletService) c43248rlh.AEQbTJ(MpcWalletService.class)).copydefault(this.wallet), this.wallet));
    }

    @InterfaceC60044zuT
    public LuaValue[] getAAStatusDescription(LuaValue[] luaValueArr) {
        C43248rlh c43248rlh = C43248rlh.KWHzl;
        return LuaValue.rString(((InterfaceC54825xWs) c43248rlh.AEQbTJ(InterfaceC54825xWs.class)).copydefault(((InterfaceC54825xWs) c43248rlh.AEQbTJ(InterfaceC54825xWs.class)).OLrzqt(this.wallet).getAaState(), this.wallet));
    }

    @InterfaceC60044zuT
    public LuaValue[] totalAssetValuation(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.wallet.OLrzqt((luaValueArr == null || luaValueArr.length <= 0) ? "all" : luaValueArr[0].toJavaString()));
    }

    @InterfaceC60044zuT
    public LuaValue[] getBTCCompressedPublicKey(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.rNil();
        }
        return LuaValue.rString(this.wallet.EZpvd(luaValueArr[0].toJavaString()));
    }
}
