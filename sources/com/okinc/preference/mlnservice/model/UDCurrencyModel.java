package com.okinc.preference.mlnservice.model;

import androidx.annotation.NonNull;
import com.okinc.localization2.bean.AppLocaleInfo;
import com.okinc.localization2.bean.server.AppLanguageLanguageItem;
import com.okinc.preference.data.model.ValuationCurrencyBean;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC60044zuT
public class UDCurrencyModel extends LuaUserdata<ValuationCurrencyBean> {
    public static final String[] OLrzqt = {"currencyId", AppLanguageLanguageItem.KEY_ISO_CODE, AppLocaleInfo.KEY_DISPLAY_NAME, "symbol", "precision", "exchangeRate"};
    public ValuationCurrencyBean KWHzl;

    @InterfaceC60044zuT
    public UDCurrencyModel(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.KWHzl = null;
    }

    public UDCurrencyModel(@NonNull Globals globals, ValuationCurrencyBean valuationCurrencyBean) {
        super(globals, valuationCurrencyBean);
        this.KWHzl = valuationCurrencyBean;
    }

    @InterfaceC60044zuT
    public LuaValue[] currencyId(LuaValue[] luaValueArr) {
        ValuationCurrencyBean valuationCurrencyBean = this.KWHzl;
        if (valuationCurrencyBean == null) {
            return null;
        }
        return LuaValue.rString(String.valueOf(valuationCurrencyBean.getCurrencyId()));
    }

    @InterfaceC60044zuT
    public LuaValue[] isoCode(LuaValue[] luaValueArr) {
        ValuationCurrencyBean valuationCurrencyBean = this.KWHzl;
        if (valuationCurrencyBean == null) {
            return null;
        }
        return LuaValue.rString(valuationCurrencyBean.getIsoCode());
    }

    @InterfaceC60044zuT
    public LuaValue[] displayName(LuaValue[] luaValueArr) {
        ValuationCurrencyBean valuationCurrencyBean = this.KWHzl;
        if (valuationCurrencyBean == null) {
            return null;
        }
        return LuaValue.rString(valuationCurrencyBean.getDisplayName());
    }

    @InterfaceC60044zuT
    public LuaValue[] symbol(LuaValue[] luaValueArr) {
        ValuationCurrencyBean valuationCurrencyBean = this.KWHzl;
        if (valuationCurrencyBean == null) {
            return null;
        }
        return LuaValue.rString(valuationCurrencyBean.getSymbol());
    }

    @InterfaceC60044zuT
    public LuaValue[] precision(LuaValue[] luaValueArr) {
        ValuationCurrencyBean valuationCurrencyBean = this.KWHzl;
        if (valuationCurrencyBean == null) {
            return null;
        }
        return LuaValue.rString(String.valueOf(valuationCurrencyBean.getPrecision()));
    }

    @InterfaceC60044zuT
    public LuaValue[] exchangeRate(LuaValue[] luaValueArr) {
        ValuationCurrencyBean valuationCurrencyBean = this.KWHzl;
        if (valuationCurrencyBean == null) {
            return null;
        }
        return LuaValue.rString(String.valueOf(valuationCurrencyBean.getUsdToThisRate()));
    }
}
