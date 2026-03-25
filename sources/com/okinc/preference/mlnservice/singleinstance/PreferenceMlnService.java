package com.okinc.preference.mlnservice.singleinstance;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.core.util.SPUtils;
import com.okinc.okuser.data.User;
import com.okinc.preference.mlnservice.model.UDCurrencyModel;
import java.util.Locale;
import o.C33512mxp;
import o.C43246rlf;
import o.C43251rlk;
import o.C58113yvE;
import o.InterfaceC46553tYp;
import o.InterfaceC47230tmC;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@LuaClass
public class PreferenceMlnService {
    public static final String LUA_CLASS_NAME = "PreferenceMlnService";
    private Globals globals;
    private UDCurrencyModel okCurrencyModel;

    public PreferenceMlnService(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public LuaValue[] riseRed(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(C33512mxp.AEQbTJ.isConnected() != 0);
    }

    @LuaBridge
    public UDCurrencyModel currencyModel(LuaValue[] luaValueArr) {
        UDCurrencyModel uDCurrencyModel = this.okCurrencyModel;
        if (uDCurrencyModel != null) {
            uDCurrencyModel.destroy();
        }
        UDCurrencyModel uDCurrencyModelCreateOkCurrencyModel = createOkCurrencyModel();
        this.okCurrencyModel = uDCurrencyModelCreateOkCurrencyModel;
        return uDCurrencyModelCreateOkCurrencyModel;
    }

    private UDCurrencyModel createOkCurrencyModel() {
        return new UDCurrencyModel(this.globals, ((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).zLjUOn());
    }

    @LuaBridge
    public LuaValue[] currencyUnit(LuaValue[] luaValueArr) {
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        String string = SPUtils.getString((userOLrzqt != null ? userOLrzqt.getLoginName() : "") + "total_assets_unit", "");
        if (TextUtils.equals(string, "BTC") || TextUtils.equals(string, "USDT")) {
            return LuaValue.rString(string);
        }
        return LuaValue.rString(((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).QUSxYX());
    }

    @LuaBridge
    public LuaValue[] currencySymbolUnit(LuaValue[] luaValueArr) {
        User userOLrzqt = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().OLrzqt();
        String string = SPUtils.getString((userOLrzqt != null ? userOLrzqt.getLoginName() : "") + "total_assets_unit", "");
        Locale locale = Locale.US;
        if (TextUtils.equals(string.toUpperCase(locale), "BTC")) {
            return LuaValue.rString("฿");
        }
        if (TextUtils.equals(string.toUpperCase(locale), "USDT")) {
            return LuaValue.rString("₮");
        }
        return LuaValue.rString(((InterfaceC46553tYp) C43251rlk.copydefault(InterfaceC46553tYp.class)).RJOkX());
    }
}
