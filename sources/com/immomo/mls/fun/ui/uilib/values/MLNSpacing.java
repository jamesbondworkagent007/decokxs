package com.immomo.mls.fun.ui.uilib.values;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55298xhM;
import o.C7594aml;
import o.InterfaceC60044zuT;
import o.wYG;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNSpacing {
    public static final Activity Companion = new Activity(null);
    public static final String[] EZpvd = {"spacing"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @InterfaceC60044zuT
    public static final LuaValue[] spacing(long j, @NotNull LuaValue[] luaValueArr) {
        return Companion.OLrzqt(j, luaValueArr);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.values.MLNSpacing.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final int KWHzl(Globals globals, int i) {
            Context contextAEQbTJ = C7594aml.AEQbTJ(globals);
            if (contextAEQbTJ == null) {
                return 0;
            }
            Resources resources = contextAEQbTJ.getResources();
            return C55298xhM.AEQbTJ(resources != null ? resources.getDimension(i) : 0.0f, contextAEQbTJ);
        }

        @InterfaceC60044zuT
        public final LuaValue[] OLrzqt(long j, @NotNull LuaValue[] luaValueArr) {
            Intrinsics.checkNotNullParameter(luaValueArr, "");
            Globals globalsEZpvd = Globals.EZpvd(j);
            if (globalsEZpvd == null) {
                return LuaValue.rNil();
            }
            LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globalsEZpvd);
            if (wYG.copydefault(C7594aml.safeGetJavaString$default(luaValueArr, 0, null, 3, null)) != null) {
                luaTableAEQbTJ.set("value", MLNSpacing.Companion.KWHzl(globalsEZpvd, r7.intValue()));
            }
            return LuaValue.varargsOf(luaTableAEQbTJ);
        }

        public final String[] copydefault() {
            return MLNSpacing.EZpvd;
        }
    }
}
