package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDNativeLoader;
import com.okinc.wallet.mln.service.UDRPCManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C43248rlh;
import o.InterfaceC9846bdL;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@LuaClass
public class UDRPCManager {
    public static final String LUA_CLASS_NAME = "RPCManager";
    public Globals globals;

    public UDRPCManager(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDRPCManager$4, reason: invalid class name */
    public class AnonymousClass4 implements UDNativeLoader.StateListAnimator {
        public final /* synthetic */ LuaValue[] KWHzl;

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass4(LuaValue[] luaValueArr) {
            this.KWHzl = luaValueArr;
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            ((InterfaceC9846bdL) C43248rlh.KWHzl.AEQbTJ(InterfaceC9846bdL.class)).copydefault(this.KWHzl[0].toJavaString(), new Function1() { // from class: o.ydr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDRPCManager.AnonymousClass4.OLrzqt(application, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.ydu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDRPCManager.AnonymousClass4.copydefault(activity, (java.lang.String) obj);
                }
            });
        }

        public static /* synthetic */ Unit OLrzqt(UDNativeLoader.Application application, String str) {
            application.copydefault(str);
            return null;
        }

        public static /* synthetic */ Unit copydefault(UDNativeLoader.Activity activity, String str) {
            activity.KWHzl(-1, str);
            return null;
        }
    }

    @LuaBridge
    public UDNativeLoader getRpcUrlLoader(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass4(luaValueArr));
        return uDNativeLoader;
    }

    /* JADX INFO: renamed from: com.okinc.wallet.mln.service.UDRPCManager$5, reason: invalid class name */
    public class AnonymousClass5 implements UDNativeLoader.StateListAnimator {
        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void OLrzqt() {
        }

        public AnonymousClass5() {
        }

        @Override // com.immomo.mls.fun.ud.UDNativeLoader.StateListAnimator
        public void copydefault(final UDNativeLoader.Application application, final UDNativeLoader.Activity activity) {
            ((InterfaceC9846bdL) C43248rlh.KWHzl.AEQbTJ(InterfaceC9846bdL.class)).EZpvd(new Function1() { // from class: o.ydv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDRPCManager.AnonymousClass5.OLrzqt(application, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.ydx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return UDRPCManager.AnonymousClass5.copydefault(activity, (java.lang.String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit OLrzqt(UDNativeLoader.Application application, String str) {
            application.copydefault(str);
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Unit copydefault(UDNativeLoader.Activity activity, String str) {
            activity.KWHzl(-1, str);
            return null;
        }
    }

    @LuaBridge
    public UDNativeLoader getUpdateRpcUrlLoader(LuaValue[] luaValueArr) {
        UDNativeLoader uDNativeLoader = new UDNativeLoader(this.globals, luaValueArr);
        uDNativeLoader.copydefault(new AnonymousClass5());
        return uDNativeLoader;
    }
}
