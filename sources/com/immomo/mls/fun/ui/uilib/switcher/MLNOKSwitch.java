package com.immomo.mls.fun.ui.uilib.switcher;

import android.content.Context;
import android.widget.CompoundButton;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ui.uilib.switcher.MLNOKSwitch;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C55239xgG;
import o.InterfaceC60044zuT;
import o.yDV;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public final class MLNOKSwitch extends UDView<C55239xgG> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final String[] OLrzqt = {"setSize", "enabled", DebugKt.DEBUG_PROPERTY_VALUE_ON, "setSwitchChangedCallback"};
    public static final Integer[] KWHzl = {-3, -5};
    public static final String AEQbTJ = MLNOKSwitch.class.getSimpleName();

    @InterfaceC60044zuT
    public MLNOKSwitch(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C55239xgG AEQbTJ(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        Context contextAubY = AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        C55239xgG c55239xgG = new C55239xgG(contextAubY, null, 0, 6, null);
        c55239xgG.setOKDSSize(KWHzl[0].intValue());
        return c55239xgG;
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSwitchChangedCallback(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        OLrzqt(luaValueArr, "setSwitchChangedCallback", new UDView.TaskDescription() { // from class: o.apw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.immomo.mls.fun.ud.view.UDView.TaskDescription
            public final void OLrzqt(LuaFunction luaFunction) {
                MLNOKSwitch.KWHzl(this.EZpvd, luaFunction);
            }
        });
        return null;
    }

    public static final void KWHzl(MLNOKSwitch mLNOKSwitch, final LuaFunction luaFunction) {
        ((C55239xgG) mLNOKSwitch.dHguZz).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.apF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                MLNOKSwitch.copydefault(luaFunction, compoundButton, z);
            }
        });
    }

    public static final void copydefault(LuaFunction luaFunction, CompoundButton compoundButton, boolean z) {
        if (luaFunction != null) {
            luaFunction.KWHzl(z);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.immomo.mls.fun.ui.uilib.switcher.MLNOKSwitch.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String[] EZpvd() {
            return MLNOKSwitch.OLrzqt;
        }
    }

    @InterfaceC60044zuT
    public final LuaValue[] setSize(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isInt()) {
            return null;
        }
        Integer num = (Integer) yDV.gEmmrt(KWHzl, luaValue.toInt());
        if (num == null) {
            return null;
        }
        ((C55239xgG) this.dHguZz).setOKDSSize(num.intValue());
        return null;
    }

    @InterfaceC60044zuT
    public final LuaValue[] on(@NotNull LuaValue[] luaValueArr) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        LuaValue luaValue = (LuaValue) yDV.gEmmrt(luaValueArr, 0);
        if (luaValue == null || !luaValue.isBoolean()) {
            return LuaValue.rBoolean(((C55239xgG) this.dHguZz).isChecked());
        }
        ((C55239xgG) this.dHguZz).setChecked(luaValue.toBoolean());
        return null;
    }
}
