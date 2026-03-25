package com.immomo.mls.fun.lt;

import android.content.Context;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.util.NetworkUtil;
import o.C7322ahe;
import o.C7840arS;
import o.C7859arl;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SINetworkReachability implements C7859arl.StateListAnimator {
    public static final String LUA_CLASS_NAME = "NetworkReachability";
    public Globals globals;
    public LuaFunction networkStateCallback;

    public SINetworkReachability(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    public void AEQbTJ() {
        C7840arS.EZpvd(OLrzqt());
        NetworkUtil.AEQbTJ(EZpvd(), this);
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        this.networkStateCallback = null;
    }

    public Context EZpvd() {
        return ((C7322ahe) this.globals.AuCTel()).AEQbTJ;
    }

    @LuaBridge
    public void open() {
        NetworkUtil.KWHzl(EZpvd(), this);
    }

    @LuaBridge
    public void close() {
        NetworkUtil.AEQbTJ(EZpvd(), this);
    }

    /* JADX INFO: renamed from: com.immomo.mls.fun.lt.SINetworkReachability$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[NetworkUtil.NetworkType.values().length];
            copydefault = iArr;
            try {
                iArr[NetworkUtil.NetworkType.NETWORK_2G.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[NetworkUtil.NetworkType.NETWORK_3G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[NetworkUtil.NetworkType.NETWORK_4G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[NetworkUtil.NetworkType.NETWORK_WIFI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[NetworkUtil.NetworkType.NETWORK_UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @LuaBridge
    public int networkState() {
        int i = AnonymousClass1.copydefault[NetworkUtil.copydefault(EZpvd()).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? 1 : 0;
        }
        return 3;
    }

    @LuaBridge
    public void setOnNetworkStateChange(LuaFunction luaFunction) {
        LuaFunction luaFunction2 = this.networkStateCallback;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        this.networkStateCallback = luaFunction;
    }

    private Object OLrzqt() {
        return LUA_CLASS_NAME + hashCode();
    }

    @Override // o.C7859arl.StateListAnimator
    public void values() {
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(1.0d));
        }
    }

    @Override // o.C7859arl.StateListAnimator
    public void DbNXlk() {
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(2.0d));
        }
    }

    @Override // o.C7859arl.StateListAnimator
    public void isConnected() {
        LuaFunction luaFunction = this.networkStateCallback;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.rNumber(3.0d));
        }
    }
}
