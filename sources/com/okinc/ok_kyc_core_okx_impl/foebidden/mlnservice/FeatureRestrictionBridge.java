package com.okinc.ok_kyc_core_okx_impl.foebidden.mlnservice;

import androidx.annotation.NonNull;
import com.google.gson.JsonParser;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import java.util.ArrayList;
import o.C43248rlh;
import o.C7869arv;
import o.C7910asj;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes10.dex */
@LuaClass
public class FeatureRestrictionBridge {
    public Globals AEQbTJ;

    public FeatureRestrictionBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.AEQbTJ = globals;
    }

    @LuaBridge
    public LuaValue getFeatureRestrictionWithFeatures(LuaValue[] luaValueArr) {
        try {
            if (luaValueArr.length > 0) {
                return C7869arv.KWHzl(this.AEQbTJ, ((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).KWHzl((ArrayList) C7910asj.EZpvd(luaValueArr[0])));
            }
            return LuaTable.AEQbTJ(this.AEQbTJ);
        } catch (Exception unused) {
            return LuaTable.AEQbTJ(this.AEQbTJ);
        }
    }

    @LuaBridge
    public LuaValue getForbidCountriesMap(LuaValue[] luaValueArr) {
        try {
            return C7869arv.copydefault(this.AEQbTJ, JsonParser.parseString(((OKComplianceRestrictionService) C43248rlh.KWHzl.AEQbTJ(OKComplianceRestrictionService.class)).hDKMBd()).getAsJsonObject());
        } catch (Exception unused) {
            return LuaTable.AEQbTJ(this.AEQbTJ);
        }
    }
}
