package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.google.firebase.messaging.Constants;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDNativeLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C43248rlh;
import o.C58266yxz;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC60044zuT;
import o.InterfaceC9731bbC;
import o.InterfaceC9737bbI;
import o.InterfaceC9852bdR;
import o.yBP;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDMetaManager extends LuaUserdata<InterfaceC9737bbI> {
    public static final String LUA_CLASS_NAME = "UDMetaManager";
    public static final String[] methods = {"coinById", "chainMetaByCoinId", "chainMetaByNetworkName", "chainMetaWithRealChainId", "chainMetaWithRealEvmChainId", "getTokenWithContractAddress", "getCoinMetaWithRealChainIdAndSymbol", "getCoinMetaWithRealChainIdAndSymbolAndTickerId", "getTokenWithContractAddressAndChainId", "forceRefreshCustomChainInfo", "getChainCoinsAttribute"};
    public InterfaceC9737bbI manager;

    @InterfaceC60044zuT
    public UDMetaManager(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDMetaManager(@NonNull Globals globals, InterfaceC9737bbI interfaceC9737bbI) {
        super(globals, interfaceC9737bbI);
        this.manager = interfaceC9737bbI;
    }

    @InterfaceC60044zuT
    public LuaValue[] coinById(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCCopydefault = this.manager.copydefault(Long.valueOf(luaValueArr[0].toLong()), true);
        if (interfaceC9731bbCCopydefault == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCCopydefault));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainMetaByCoinId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCAEQbTJ = this.manager.AEQbTJ(luaValueArr[0].toLong(), true);
        if (interfaceC9731bbCAEQbTJ == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCAEQbTJ));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainMetaByNetworkName(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCEZpvd = this.manager.EZpvd(luaValueArr[0].toString(), true);
        if (interfaceC9731bbCEZpvd == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCEZpvd));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainMetaWithRealChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCEZpvd = this.manager.EZpvd(luaValueArr[0].toLong(), true);
        if (interfaceC9731bbCEZpvd == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCEZpvd));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainMetaWithRealEvmChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCOLrzqt = this.manager.OLrzqt(luaValueArr[0].toLong(), true);
        if (interfaceC9731bbCOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCOLrzqt));
    }

    @InterfaceC60044zuT
    public LuaValue[] getCoinMetaWithRealChainIdAndSymbol(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCAEQbTJ = this.manager.AEQbTJ(luaValueArr[1].toJavaString(), luaValueArr.length > 2 ? luaValueArr[2].toJavaString() : null, true);
        if (interfaceC9731bbCAEQbTJ == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCAEQbTJ));
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] getCoinMetaWithRealChainIdAndSymbolAndTickerId(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 3) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCAEQbTJ = this.manager.AEQbTJ(luaValueArr[1].toJavaString(), luaValueArr[2].toJavaString(), true);
        if (interfaceC9731bbCAEQbTJ == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCAEQbTJ));
    }

    @InterfaceC60044zuT
    public LuaValue[] getTokenWithContractAddress(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        InterfaceC9731bbC interfaceC9731bbCOLrzqt = this.manager.OLrzqt(luaValueArr[0].toJavaString(), true);
        if (interfaceC9731bbCOLrzqt == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCOLrzqt));
    }

    @InterfaceC60044zuT
    public LuaValue[] getTokenWithContractAddressAndChainId(LuaValue[] luaValueArr) {
        if (luaValueArr == null) {
            return null;
        }
        if (luaValueArr.length <= 1) {
            return getTokenWithContractAddress(luaValueArr);
        }
        InterfaceC9731bbC interfaceC9731bbCKWHzl = this.manager.KWHzl(luaValueArr[0].toJavaString(), luaValueArr[1].toLong(), true);
        if (interfaceC9731bbCKWHzl == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, interfaceC9731bbCKWHzl));
    }

    @InterfaceC60044zuT
    public LuaValue[] forceRefreshCustomChainInfo(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, (Object) null);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.wallet.mln.service.UDMetaManager.3
            public InterfaceC58217yxC AEQbTJ;

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
                this.AEQbTJ = ((InterfaceC9852bdR) C43248rlh.KWHzl.AEQbTJ(InterfaceC9852bdR.class)).EZpvd().EZpvd(true).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt()).AEQbTJ(new InterfaceC58227yxM<Boolean>() { // from class: com.okinc.wallet.mln.service.UDMetaManager.3.1
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public void accept(Boolean bool) {
                        if (bool.booleanValue()) {
                            application.copydefault(null);
                        } else {
                            activity.KWHzl(-1, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                        }
                    }
                }, new InterfaceC58227yxM<Throwable>() { // from class: com.okinc.wallet.mln.service.UDMetaManager.3.5
                    /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
                    @Override // o.InterfaceC58227yxM
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public void accept(Throwable th) {
                        activity.KWHzl(-1, th.getMessage());
                    }
                });
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
                InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                }
            }
        });
        return LuaValue.varargsOf(uDNativeLoader);
    }

    @InterfaceC60044zuT
    public LuaValue[] getChainCoinsAttribute(LuaValue[] luaValueArr) {
        List<InterfaceC9731bbC> listCopydefault = this.manager.copydefault(true);
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC9731bbC> it = listCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(new UDCoinMeta(this.globals, it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }
}
