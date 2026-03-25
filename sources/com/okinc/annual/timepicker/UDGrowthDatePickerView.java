package com.okinc.annual.timepicker;

import android.graphics.Typeface;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import o.C7829arH;
import o.C8150axM;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDGrowthDatePickerView<T extends C8150axM> extends UDViewGroup<T> {
    public static final String[] KWHzl = {"reloadData", "resultCallBack", "timeZone", "setLineSpacingMultiplier", "rowHeight", "pickerTextColor", "setBgColor", "selectRowTextColor", "pickerTextFont", "setDividerColor", "setItemVisibleCount", "isCyclic", "dateOrder"};
    public LuaFunction EZpvd;

    @InterfaceC60044zuT
    public UDGrowthDatePickerView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        OLrzqt(luaValueArr);
    }

    @InterfaceC60044zuT
    public UDGrowthDatePickerView(Globals globals, T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDGrowthDatePickerView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        return (T) new C8150axM(AubY(), (UDGrowthDatePickerView<?>) this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            ((C8150axM) f_()).setRangDate(luaValueArr[0].toLong() * 1000, luaValueArr[1].toLong() * 1000);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] reloadData(LuaValue[] luaValueArr) {
        ((C8150axM) f_()).AEQbTJ();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] resultCallBack(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return null;
        }
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (!luaValueArr[0].isFunction()) {
            return null;
        }
        this.EZpvd = luaValueArr[0].toLuaFunction();
        ((C8150axM) f_()).EZpvd(this.EZpvd);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] timeZone(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isNumber()) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((C8150axM) f_()).KWHzl()));
        }
        ((C8150axM) f_()).copydefault(luaValueArr[0].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setLineSpacingMultiplier(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1 || !luaValueArr[0].isNumber()) {
            return null;
        }
        ((C8150axM) f_()).setLineSpacingMultiplier(luaValueArr[0].toFloat());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] rowHeight(LuaValue[] luaValueArr) {
        return ((C8150axM) f_()).EZpvd() == null ? LuaValue.rNil() : LuaValue.varargsOf(LuaNumber.copydefault(((C8150axM) f_()).EZpvd().floatValue()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] pickerTextColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDColor)) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        ((C8150axM) f_()).setTextColorOut(uDColor.AEQbTJ().getColor(this.globals));
        uDColor.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] selectRowTextColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDColor)) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        ((C8150axM) f_()).setTextColorCenter(uDColor.AEQbTJ().getColor(this.globals));
        uDColor.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setBgColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDColor)) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        ((C8150axM) f_()).setBgColor(uDColor.AEQbTJ().getColor(this.globals));
        uDColor.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] pickerTextFont(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof LuaString) {
            Typeface typefaceAEQbTJ = C7829arH.KWHzl.AEQbTJ(luaValue.toJavaString(), AubY());
            if (typefaceAEQbTJ != null) {
                ((C8150axM) f_()).setTypeface(typefaceAEQbTJ);
            }
        }
        LuaValue luaValue2 = luaValueArr[1];
        if (!(luaValue2 instanceof LuaNumber)) {
            return null;
        }
        ((C8150axM) f_()).setContentTextSize(luaValue2.toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDividerColor(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof UDColor)) {
            return null;
        }
        UDColor uDColor = (UDColor) luaValue;
        ((C8150axM) f_()).setDividerColor(uDColor.AEQbTJ().getColor(this.globals));
        uDColor.destroy();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setItemVisibleCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        ((C8150axM) f_()).setItemVisibleCount(luaValue.toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isCyclic(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaBoolean)) {
            return null;
        }
        ((C8150axM) f_()).KWHzl(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] dateOrder(LuaValue[] luaValueArr) {
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(AubY());
        StringBuilder sb = new StringBuilder();
        for (char c : dateFormatOrder) {
            if (c == 'y' || c == 'M' || c == 'd') {
                sb.append(c);
            }
        }
        String string = sb.toString();
        string.hashCode();
        return !string.equals("dMy") ? !string.equals(com.ibm.icu.text.DateFormat.YEAR_NUM_MONTH_DAY) ? LuaValue.varargsOf(LuaNumber.valueOf(1)) : LuaValue.varargsOf(LuaNumber.valueOf(0)) : LuaValue.varargsOf(LuaNumber.valueOf(2));
    }

    @Override // org.luaj.vm2.LuaUserdata
    public void __onLuaGc() {
        super.__onLuaGc();
        LuaFunction luaFunction = this.EZpvd;
        if (luaFunction != null) {
            luaFunction.destroy();
            this.EZpvd = null;
        }
    }
}
