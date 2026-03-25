package com.okinc.business.appupdate.mln;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.business.appupdate.api.AppUpdateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43248rlh;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public final class OKUpgrade {
    public static final String LuaClassName = "OKUpgrade";
    private final Globals globals;
    private final LuaValue[] init;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public OKUpgrade(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
        this.init = luaValueArr;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.mln.OKUpgrade.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @LuaBridge
    public final void requestLatestAppVersion(@NotNull final LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        ((AppUpdateService) C43248rlh.KWHzl.AEQbTJ(AppUpdateService.class)).getLatestVersion(new Function1() { // from class: com.okinc.business.appupdate.mln.OKUpgrade$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OKUpgrade.requestLatestAppVersion$lambda$0(luaValueArr, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestLatestAppVersion$lambda$0(LuaValue[] luaValueArr, String str) {
        LuaFunction luaFunction;
        Intrinsics.checkNotNullParameter(str, "");
        LuaValue luaValue = (LuaValue) yDV.zsXlph(luaValueArr);
        if (luaValue != null && (luaFunction = luaValue.toLuaFunction()) != null) {
            luaFunction.invoke(LuaValue.rString(str));
        }
        return Unit.INSTANCE;
    }
}
