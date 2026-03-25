package com.immomo.mls.fun.ud.view;

import android.R;
import android.widget.CompoundButton;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import kotlinx.coroutines.DebugKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C7540alk;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDSwitch<L extends CompoundButton> extends UDView<L> implements CompoundButton.OnCheckedChangeListener {
    public static final String[] EZpvd = {DebugKt.DEBUG_PROPERTY_VALUE_ON, "setSwitchChangedCallback", "setThumbColor", "setNormalColor", "setSelectedColor"};
    public static final int[] KWHzl = {R.attr.state_checked};
    public int AEQbTJ;
    public int OLrzqt;
    public LuaFunction copydefault;

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setNormalColor(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setSelectedColor(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    @Deprecated
    public LuaValue[] setThumbColor(LuaValue[] luaValueArr) {
        return null;
    }

    @InterfaceC60044zuT
    public UDSwitch(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AEQbTJ = ViewCompat.MEASURED_STATE_MASK;
        this.OLrzqt = SupportMenu.CATEGORY_MASK;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public L AEQbTJ(LuaValue[] luaValueArr) {
        C7540alk c7540alk = new C7540alk(AubY(), this, luaValueArr);
        c7540alk.setTrackResource(C52761wXj.Activity.aBDePw);
        c7540alk.setThumbResource(C52761wXj.Activity.aBDePw);
        c7540alk.setBackground(AppCompatResources.getDrawable(AubY(), C32113mPz.TaskDescription.values));
        return c7540alk;
    }

    @InterfaceC60044zuT
    public LuaValue[] on(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaBoolean.AEQbTJ(f_().isChecked()));
        }
        f_().setChecked(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setSwitchChangedCallback(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = luaValueArr[0].toLuaFunction();
        this.copydefault = luaFunction;
        if (luaFunction != null) {
            f_().setOnCheckedChangeListener(this);
        } else {
            f_().setOnCheckedChangeListener(null);
        }
        return null;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        LuaFunction luaFunction = this.copydefault;
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(z)));
        }
    }
}
