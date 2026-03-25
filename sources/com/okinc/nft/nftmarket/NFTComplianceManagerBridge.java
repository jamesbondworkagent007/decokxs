package com.okinc.nft.nftmarket;

import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDNativeLoader;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import o.C43251rlk;
import o.C56442yFn;
import o.InterfaceC43295rmb;
import o.InterfaceC9769bbo;
import o.InterfaceC9772bbr;
import o.InterfaceC9773bbs;
import o.InterfaceC9774bbt;
import o.gKO;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class NFTComplianceManagerBridge {
    public static final String LUA_CLASS_NAME = "ComplianceManager";
    public Globals globals;

    public NFTComplianceManagerBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public UDNativeLoader isDexFeatureHidden(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.nft.nftmarket.NFTComplianceManagerBridge.1
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                NFTComplianceManagerBridge.this.EZpvd(InterfaceC9772bbr.class, application, activity);
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader isNftFeatureHidden(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.nft.nftmarket.NFTComplianceManagerBridge.5
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                NFTComplianceManagerBridge.this.EZpvd(InterfaceC9773bbs.class, application, activity);
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader isDefiFeatureHidden(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.nft.nftmarket.NFTComplianceManagerBridge.3
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                NFTComplianceManagerBridge.this.EZpvd(InterfaceC9774bbt.class, application, activity);
            }
        });
        return uDNativeLoader;
    }

    @LuaBridge
    public UDNativeLoader isDiscoverFeatureHidden(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new UDNativeLoader.StateListAnimator() { // from class: com.okinc.nft.nftmarket.NFTComplianceManagerBridge.4
            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void OLrzqt() {
            }

            @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
            public void copydefault(UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
                NFTComplianceManagerBridge.this.EZpvd(InterfaceC9769bbo.class, application, activity);
            }
        });
        return uDNativeLoader;
    }

    public final void EZpvd(Class<? extends InterfaceC43295rmb> cls, final UDNativeLoader.Application application, UDNativeLoader.Activity activity) {
        Object objEZpvd;
        List listKWHzl = C43251rlk.KWHzl(cls);
        if (listKWHzl != null && !listKWHzl.isEmpty()) {
            Continuation<? super Boolean> continuation = new Continuation<Object>() { // from class: com.okinc.nft.nftmarket.NFTComplianceManagerBridge.2
                @Override // kotlin.coroutines.Continuation
                public CoroutineContext getContext() {
                    return Dispatchers.getDefault();
                }

                @Override // kotlin.coroutines.Continuation
                public void resumeWith(@NonNull Object obj) {
                    if (obj instanceof Boolean) {
                        application.copydefault(LuaBoolean.AEQbTJ(((Boolean) obj).booleanValue()));
                    } else {
                        application.copydefault(LuaBoolean.AEQbTJ(false));
                    }
                }
            };
            InterfaceC43295rmb interfaceC43295rmb = (InterfaceC43295rmb) listKWHzl.get(0);
            if (interfaceC43295rmb instanceof InterfaceC9772bbr) {
                objEZpvd = ((gKO) C43251rlk.copydefault(gKO.class)).KWHzl(continuation);
            } else if (interfaceC43295rmb instanceof InterfaceC9773bbs) {
                objEZpvd = ((InterfaceC9773bbs) interfaceC43295rmb).OLrzqt(continuation);
            } else if (interfaceC43295rmb instanceof InterfaceC9774bbt) {
                objEZpvd = ((InterfaceC9774bbt) interfaceC43295rmb).KWHzl(continuation);
            } else if (interfaceC43295rmb instanceof InterfaceC9769bbo) {
                objEZpvd = ((InterfaceC9769bbo) interfaceC43295rmb).EZpvd(continuation);
            } else {
                application.copydefault(LuaBoolean.AEQbTJ(false));
                return;
            }
            if (objEZpvd != C56442yFn.copydefault()) {
                if (objEZpvd instanceof Boolean) {
                    application.copydefault(LuaBoolean.AEQbTJ(((Boolean) objEZpvd).booleanValue()));
                    return;
                } else {
                    application.copydefault(LuaBoolean.AEQbTJ(false));
                    return;
                }
            }
            return;
        }
        application.copydefault(LuaBoolean.AEQbTJ(true));
    }
}
