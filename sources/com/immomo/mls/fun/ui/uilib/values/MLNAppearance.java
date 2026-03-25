package com.immomo.mls.fun.ui.uilib.values;

import android.content.Context;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C52771wXt;
import o.C55298xhM;
import o.C7594aml;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public final class MLNAppearance {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public C52771wXt KWHzl;
    public final Globals copydefault;

    public MLNAppearance(Globals globals, LuaValue[] luaValueArr) {
        this.copydefault = globals;
        Context contextAEQbTJ = C7594aml.AEQbTJ(globals);
        if (contextAEQbTJ != null) {
            this.KWHzl = new C52771wXt(contextAEQbTJ);
        }
    }

    @LuaBridge
    public final int marginHorizontal() {
        C52771wXt c52771wXt = this.KWHzl;
        return C55298xhM.px2dp$default(c52771wXt != null ? c52771wXt.EZpvd() : 0, (Context) null, 1, (Object) null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.values.MLNAppearance.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
