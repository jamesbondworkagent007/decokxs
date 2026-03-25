package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.okinc.core.util.SPUtils;
import com.okinc.wallet.mln.service.UDWalletManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C43248rlh;
import o.C7910asj;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC58258yxr;
import o.InterfaceC60044zuT;
import o.InterfaceC9735bbG;
import o.InterfaceC9738bbJ;
import o.InterfaceC9741bbM;
import o.InterfaceC9852bdR;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDWalletManager extends LuaUserdata<InterfaceC9741bbM> {
    public static final String LUA_CLASS_NAME = "WalletManager";
    public static final String[] methods = {"refreshAssets", "refreshAssetsOfWallet", "refreshTokenAssets", "refreshTokenAssetsOfWallet", "allWallets", "getMainWallet", "getMainWalletAsync", "getWalletById", "getWalletsByRealChainId", "formatValuationFromAsset", "allRootWallets", "fetchMainWalletAsync", "refreshAllWalletCoinAssets"};
    public InterfaceC9738bbJ mainWallet;
    public InterfaceC9741bbM manager;
    public InterfaceC58217yxC refreshAssetDisposable;
    public UDNativeLoader refreshAssetLoader;

    @InterfaceC60044zuT
    public UDWalletManager(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDWalletManager(@NonNull Globals globals, InterfaceC9741bbM interfaceC9741bbM) {
        super(globals, interfaceC9741bbM);
        this.manager = interfaceC9741bbM;
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshAssetsOfWallet(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = this.refreshAssetLoader;
        if (uDNativeLoader != null) {
            uDNativeLoader.destroy();
            InterfaceC58217yxC interfaceC58217yxC = this.refreshAssetDisposable;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
        this.refreshAssetLoader = new UDNativeLoader(this.globals, luaValueArr);
        this.refreshAssetLoader.copydefault(new AnonymousClass1(luaValueArr[0].toJavaString()));
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, this.refreshAssetLoader));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletManager$1, reason: invalid class name */
    public class AnonymousClass1 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ String OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass1(String str) {
            this.OLrzqt = str;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            UDWalletManager.this.refreshAssetDisposable = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).KWHzl(this.OLrzqt).AEQbTJ(new InterfaceC58227yxM() { // from class: o.yee
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault("");
                }
            }, new InterfaceC58227yxM() { // from class: o.yeh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletManager.AnonymousClass1.KWHzl(activity, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void KWHzl(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            if (UDWalletManager.this.refreshAssetDisposable != null) {
                UDWalletManager.this.refreshAssetDisposable.dispose();
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshAssets(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = this.refreshAssetLoader;
        if (uDNativeLoader != null) {
            uDNativeLoader.destroy();
            InterfaceC58217yxC interfaceC58217yxC = this.refreshAssetDisposable;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
        UDNativeLoader uDNativeLoader2 = new UDNativeLoader(this.globals, luaValueArr);
        this.refreshAssetLoader = uDNativeLoader2;
        uDNativeLoader2.copydefault(new AnonymousClass3());
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, this.refreshAssetLoader));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletManager$3, reason: invalid class name */
    public class AnonymousClass3 implements UDNativeLoader.StateListAnimator {
        public AnonymousClass3() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            UDWalletManager.this.refreshAssetDisposable = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).AYXKKw().AEQbTJ(new InterfaceC58227yxM() { // from class: o.yei
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault("");
                }
            }, new InterfaceC58227yxM() { // from class: o.yem
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletManager.AnonymousClass3.copydefault(activity, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void copydefault(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            if (UDWalletManager.this.refreshAssetDisposable != null) {
                UDWalletManager.this.refreshAssetDisposable.dispose();
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshAllWalletCoinAssets(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = this.refreshAssetLoader;
        if (uDNativeLoader != null) {
            uDNativeLoader.destroy();
            InterfaceC58217yxC interfaceC58217yxC = this.refreshAssetDisposable;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        LuaTable luaTable = luaValueArr.length > 0 ? luaValueArr[0].toLuaTable() : null;
        if (luaTable != null) {
            while (i < luaTable.zLjUOn()) {
                i++;
                arrayList.add(Long.valueOf(luaTable.get(i).toLong()));
            }
        }
        UDNativeLoader uDNativeLoader2 = new UDNativeLoader(this.globals, luaValueArr);
        this.refreshAssetLoader = uDNativeLoader2;
        uDNativeLoader2.copydefault(new AnonymousClass5(arrayList));
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, this.refreshAssetLoader));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletManager$5, reason: invalid class name */
    public class AnonymousClass5 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ ArrayList OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass5(ArrayList arrayList) {
            this.OLrzqt = arrayList;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            UDWalletManager.this.refreshAssetDisposable = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault(this.OLrzqt).AEQbTJ(new InterfaceC58227yxM() { // from class: o.yej
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault("");
                }
            }, new InterfaceC58227yxM() { // from class: o.yel
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletManager.AnonymousClass5.OLrzqt(activity, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void OLrzqt(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            if (UDWalletManager.this.refreshAssetDisposable != null) {
                UDWalletManager.this.refreshAssetDisposable.dispose();
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshTokenAssetsOfWallet(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = this.refreshAssetLoader;
        if (uDNativeLoader != null) {
            uDNativeLoader.destroy();
            InterfaceC58217yxC interfaceC58217yxC = this.refreshAssetDisposable;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
        this.refreshAssetLoader = new UDNativeLoader(this.globals, luaValueArr);
        this.refreshAssetLoader.copydefault(new AnonymousClass4(luaValueArr[0].toJavaString(), luaValueArr.length > 1 ? Long.valueOf(luaValueArr[1].toLong()) : null));
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, this.refreshAssetLoader));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletManager$4, reason: invalid class name */
    public class AnonymousClass4 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ Long AEQbTJ;
        public final /* synthetic */ String EZpvd;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass4(String str, Long l) {
            this.EZpvd = str;
            this.AEQbTJ = l;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            UDWalletManager.this.refreshAssetDisposable = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).OLrzqt(this.EZpvd, this.AEQbTJ).AEQbTJ(new InterfaceC58227yxM() { // from class: o.yen
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault("");
                }
            }, new InterfaceC58227yxM() { // from class: o.yek
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletManager.AnonymousClass4.copydefault(activity, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void copydefault(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            if (UDWalletManager.this.refreshAssetDisposable != null) {
                UDWalletManager.this.refreshAssetDisposable.dispose();
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] refreshTokenAssets(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = this.refreshAssetLoader;
        if (uDNativeLoader != null) {
            uDNativeLoader.destroy();
            InterfaceC58217yxC interfaceC58217yxC = this.refreshAssetDisposable;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
        }
        UDNativeLoader uDNativeLoader2 = new UDNativeLoader(this.globals, luaValueArr);
        this.refreshAssetLoader = uDNativeLoader2;
        uDNativeLoader2.copydefault(new AnonymousClass2());
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, this.refreshAssetLoader));
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDWalletManager$2, reason: invalid class name */
    public class AnonymousClass2 implements UDNativeLoader.StateListAnimator {
        public AnonymousClass2() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            UDWalletManager.this.refreshAssetDisposable = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).valueOf().AEQbTJ(new InterfaceC58227yxM() { // from class: o.yeq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    application.copydefault("");
                }
            }, new InterfaceC58227yxM() { // from class: o.yes
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) throws java.lang.Exception {
                    UDWalletManager.AnonymousClass2.copydefault(activity, (java.lang.Throwable) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void copydefault(UDNativeLoader.Activity activity, Throwable th) throws Exception {
            activity.KWHzl(-1, th.getMessage());
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
            if (UDWalletManager.this.refreshAssetDisposable != null) {
                UDWalletManager.this.refreshAssetDisposable.dispose();
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] formatValuationFromAsset(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr == null || (luaValue = luaValueArr[0]) == null) {
            return null;
        }
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).copydefault(luaValue.toJavaString())));
    }

    @InterfaceC60044zuT
    public LuaValue[] allWallets(LuaValue[] luaValueArr) {
        List<InterfaceC9738bbJ> listCopydefault = SPUtils.getBoolean("SINGLE_WALLET", false, "mln") ? this.manager.copydefault() : this.manager.OLrzqt();
        ArrayList arrayList = new ArrayList();
        if (listCopydefault.isEmpty()) {
            return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
        }
        Iterator<InterfaceC9738bbJ> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(new UDWallet(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] allRootWallets(LuaValue[] luaValueArr) {
        List<InterfaceC9735bbG> listAEQbTJ = this.manager.AEQbTJ();
        ArrayList arrayList = new ArrayList();
        if (listAEQbTJ.isEmpty()) {
            return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
        }
        Iterator<InterfaceC9735bbG> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(new UDRootWallet(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] getWalletById(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = this.manager.OLrzqt(luaValueArr[0].toJavaString());
        return interfaceC9738bbJOLrzqt == null ? LuaValue.varargsOf(new LuaValue[0]) : LuaValue.varargsOf(new UDWallet(this.globals, interfaceC9738bbJOLrzqt));
    }

    @InterfaceC60044zuT
    public LuaValue[] getMainWalletAsync(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaFunction)) {
            return null;
        }
        final LuaFunction luaFunction = luaValue.toLuaFunction();
        this.manager.KWHzl().copydefault(new InterfaceC58258yxr<InterfaceC9738bbJ>() { // from class: com.okinc.wallet.mln.service.UDWalletManager.10
            @Override // o.InterfaceC58258yxr
            public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
            }

            /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
            @Override // o.InterfaceC58258yxr
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public void onSuccess(InterfaceC9738bbJ interfaceC9738bbJ) {
                luaFunction.invoke(LuaValue.varargsOf(new UDWallet(UDWalletManager.this.globals, interfaceC9738bbJ)));
            }

            @Override // o.InterfaceC58258yxr
            public void onError(Throwable th) {
                luaFunction.invoke(LuaValue.varargsOf(LuaValue.Nil()));
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] getMainWallet(LuaValue[] luaValueArr) {
        List<InterfaceC9738bbJ> listCopydefault = this.manager.copydefault();
        if (listCopydefault.size() > 0) {
            this.mainWallet = listCopydefault.get(0);
        }
        return this.mainWallet == null ? LuaValue.varargsOf(LuaValue.Nil()) : LuaValue.varargsOf(new UDWallet(this.globals, this.mainWallet));
    }

    @InterfaceC60044zuT
    public LuaValue[] fetchMainWalletAsync(LuaValue[] luaValueArr) {
        final UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDWalletManager.7
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                UDWalletManager.this.manager.KWHzl().copydefault(new InterfaceC58258yxr<InterfaceC9738bbJ>() { // from class: com.okinc.wallet.mln.service.UDWalletManager.7.1
                    @Override // o.InterfaceC58258yxr
                    public void onSubscribe(InterfaceC58217yxC interfaceC58217yxC) {
                    }

                    /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58258yxr
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(InterfaceC9738bbJ interfaceC9738bbJ) {
                        application.copydefault(C7910asj.KWHzl(UDWalletManager.this.globals, new UDWallet(UDWalletManager.this.globals, interfaceC9738bbJ)));
                    }

                    @Override // o.InterfaceC58258yxr
                    public void onError(Throwable th) {
                        if (th != null) {
                            activity.KWHzl(-1, th.getMessage());
                        }
                    }
                });
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
                UDNativeLoader uDNativeLoader2 = uDNativeLoader;
                if (uDNativeLoader2 != null) {
                    uDNativeLoader2.destroy();
                }
            }
        });
        return LuaValue.varargsOf(C7910asj.KWHzl(this.globals, uDNativeLoader));
    }

    @InterfaceC60044zuT
    public LuaValue[] getWalletsByRealChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        List<InterfaceC9738bbJ> listAEQbTJ = this.manager.AEQbTJ(luaValueArr[0].toLong());
        ArrayList arrayList = new ArrayList();
        if (listAEQbTJ.isEmpty()) {
            return LuaValue.varargsOf(new UDArray(getGlobals(), (List) arrayList));
        }
        Iterator<InterfaceC9738bbJ> it = listAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(new UDWallet(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(getGlobals(), (List) arrayList));
    }
}
