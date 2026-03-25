package com.okinc.business.invest_biz.mln;

import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.business.invest_biz.mln.DeFiWSListenerBridge;
import com.okinc.core.livelistener.OKWsConnectionState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractActivityC33041mov;
import o.C23599iCi;
import o.C7322ahe;
import o.InterfaceC60037zuM;
import o.InterfaceC60044zuT;
import o.pUU;
import o.yDV;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC60044zuT
public final class DeFiWSListenerBridge extends LuaUserdata<C23599iCi> {
    public static final String LUA_CLASS_NAME = "InvestWSListener";
    private static final double STATE_CLOSED = 0.0d;
    private static final double STATE_FAILURE = 2.0d;
    private static final double STATE_OPEN = 1.0d;
    private LuaFunction dataCallback;
    private C23599iCi investWsClient;
    private LuaFunction stateCallback;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final String[] methods = {"createListener", TtmlNode.START, "stop"};

    @InterfaceC60044zuT
    public DeFiWSListenerBridge(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.mln.DeFiWSListenerBridge.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] createListener(LuaValue[] luaValueArr) {
        String javaString;
        LuaValue luaValue;
        try {
            C23599iCi c23599iCi = this.investWsClient;
            if (c23599iCi != null) {
                if (c23599iCi != null) {
                    c23599iCi.gEmmrt();
                }
                this.investWsClient = null;
            }
            if (luaValueArr == null || (luaValue = luaValueArr[0]) == null || (javaString = luaValue.toJavaString()) == null) {
                javaString = "";
            }
            if ((luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 2) : null) instanceof LuaFunction) {
                LuaValue luaValue2 = luaValueArr[2];
                this.dataCallback = luaValue2 != null ? luaValue2.toLuaFunction() : null;
            }
            if ((luaValueArr != null ? (LuaValue) yDV.gEmmrt(luaValueArr, 3) : null) instanceof LuaFunction) {
                LuaValue luaValue3 = luaValueArr[3];
                this.stateCallback = luaValue3 != null ? luaValue3.toLuaFunction() : null;
            }
            this.investWsClient = new C23599iCi(javaString, new Function1() { // from class: o.iOp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DeFiWSListenerBridge.createListener$lambda$0(this.AEQbTJ, (java.lang.String) obj);
                }
            }, new Function1() { // from class: o.iOo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DeFiWSListenerBridge.createListener$lambda$1(this.KWHzl, (OKWsConnectionState) obj);
                }
            });
        } catch (Exception e) {
            pUU.AEQbTJ("DeFiWSListenerBridge", "Error creating listener", e);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createListener$lambda$0(DeFiWSListenerBridge deFiWSListenerBridge, String str) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractActivityC33041mov activity = deFiWSListenerBridge.getActivity();
        if (activity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activity)) != null) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new DeFiWSListenerBridge$createListener$1$1(deFiWSListenerBridge, str, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createListener$lambda$1(DeFiWSListenerBridge deFiWSListenerBridge, OKWsConnectionState oKWsConnectionState) {
        LifecycleCoroutineScope lifecycleScope;
        Intrinsics.checkNotNullParameter(oKWsConnectionState, "");
        LuaFunction luaFunction = deFiWSListenerBridge.stateCallback;
        if (luaFunction != null) {
            pUU.copydefault("DeFiWSListenerBridge", oKWsConnectionState + " " + luaFunction);
            AbstractActivityC33041mov activity = deFiWSListenerBridge.getActivity();
            if (activity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(activity)) != null) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new DeFiWSListenerBridge$createListener$2$1(oKWsConnectionState, deFiWSListenerBridge, null), 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    @InterfaceC60044zuT
    public final LuaValue[] start(LuaValue[] luaValueArr) {
        C23599iCi c23599iCi = this.investWsClient;
        if (c23599iCi == null || c23599iCi == null) {
            return null;
        }
        c23599iCi.AEQbTJ();
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] stop(LuaValue[] luaValueArr) {
        C23599iCi c23599iCi = this.investWsClient;
        if (c23599iCi == null || c23599iCi == null) {
            return null;
        }
        c23599iCi.gEmmrt();
        return null;
    }

    public final AbstractActivityC33041mov getActivity() {
        Globals globals = this.globals;
        InterfaceC60037zuM interfaceC60037zuMAuCTel = globals != null ? globals.AuCTel() : null;
        C7322ahe c7322ahe = interfaceC60037zuMAuCTel instanceof C7322ahe ? (C7322ahe) interfaceC60037zuMAuCTel : null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof AbstractActivityC33041mov) {
            return (AbstractActivityC33041mov) context;
        }
        return null;
    }
}
