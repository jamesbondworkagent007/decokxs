package com.okinc.mlnservice.singleinstance;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.okinc.homepage.bean.Interaction;
import com.okinc.homepage.bean.InteractionList;
import com.okinc.homepage.bean.InteractionType;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.AbstractActivityC33041mov;
import o.C43173rkL;
import o.C43179rkR;
import o.C43248rlh;
import o.C43386roM;
import o.C7322ahe;
import o.C7910asj;
import o.InterfaceC35160nqA;
import o.InterfaceC46553tYp;
import o.InterfaceC49499uph;
import o.kOG;
import o.yHO;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@LuaClass
public class OKGrowthBridge {
    public static final String LUA_CLASS_NAME = "OKGrowthBridge";
    public LuaFunction changeTradeMarginTypeCallback;
    public LuaFunction getCurrentTradeMarginTypeCallback;
    public Globals globals;
    public LuaFunction goToTradeModePageCallback;
    public LuaFunction imUnReadCountCallback;
    public LuaFunction inviteeCommissionCallback;

    public OKGrowthBridge(@NonNull Globals globals, @NonNull LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public LuaBoolean isInDemoTrading(LuaValue[] luaValueArr) {
        return (LuaBoolean) LuaBoolean.AEQbTJ(C43173rkL.EZpvd.EZpvd());
    }

    @LuaBridge
    public void switchTradeMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && luaValueArr[0].isBoolean()) {
            C43173rkL.EZpvd.AEQbTJ(luaValueArr[0].toBoolean());
        }
    }

    @LuaBridge
    public LuaBoolean useNewMiniApp(LuaValue[] luaValueArr) {
        return (LuaBoolean) LuaBoolean.AEQbTJ(true);
    }

    @LuaBridge
    public LuaString getCurrencyDCISOCodeLowercase(LuaValue[] luaValueArr) {
        return (LuaString) LuaString.copydefault(((InterfaceC46553tYp) C43248rlh.KWHzl.AEQbTJ(InterfaceC46553tYp.class)).QUSxYX().toLowerCase());
    }

    @LuaBridge
    public LuaString getCurrencyDCISOCodeUppercase(LuaValue[] luaValueArr) {
        return (LuaString) LuaString.copydefault(((InterfaceC46553tYp) C43248rlh.KWHzl.AEQbTJ(InterfaceC46553tYp.class)).QUSxYX().toUpperCase());
    }

    @LuaBridge
    public LuaString getCurrencyDCSymbol(LuaValue[] luaValueArr) {
        return (LuaString) LuaString.copydefault(((InterfaceC46553tYp) C43248rlh.KWHzl.AEQbTJ(InterfaceC46553tYp.class)).RJOkX());
    }

    @LuaBridge
    public LuaString getXCdnHeaderDomain(LuaValue[] luaValueArr) {
        String strEZpvd = C43386roM.EZpvd.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = "";
        }
        return (LuaString) LuaString.copydefault(strEZpvd);
    }

    @LuaBridge
    public LuaValue goToTradeModePageWithType(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.goToTradeModePageCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 2) {
            return null;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaValue luaValue = luaValueArr[1];
        if (luaValue == null || !luaValue.isFunction() || EZpvd(this.globals) == null) {
            return null;
        }
        this.goToTradeModePageCallback = luaValue.toLuaFunction();
        ((InterfaceC49499uph) C43248rlh.KWHzl.AEQbTJ(InterfaceC49499uph.class)).copydefault(EZpvd(this.globals), javaString, Boolean.TRUE, "growth/bonus", null, new yHO() { // from class: o.rkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return this.EZpvd.copydefault((java.lang.Boolean) obj, (java.lang.Boolean) obj2, (java.lang.String) obj3);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit copydefault(Boolean bool, Boolean bool2, String str) {
        if (bool2.booleanValue()) {
            this.goToTradeModePageCallback.invoke(null);
        }
        return null;
    }

    @LuaBridge
    public LuaValue getCurrentTradeMarginType(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaFunction luaFunction = this.getCurrentTradeMarginTypeCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || !luaValue.isFunction()) {
            return null;
        }
        this.getCurrentTradeMarginTypeCallback = luaValue.toLuaFunction();
        ((InterfaceC49499uph) C43248rlh.KWHzl.AEQbTJ(InterfaceC49499uph.class)).OLrzqt(new yHO() { // from class: o.rkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return this.OLrzqt.OLrzqt((java.lang.Boolean) obj, (java.lang.Boolean) obj2, (java.lang.String) obj3);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit OLrzqt(Boolean bool, Boolean bool2, String str) {
        this.getCurrentTradeMarginTypeCallback.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(bool2.booleanValue())));
        return null;
    }

    @LuaBridge
    public LuaValue changeTradeMarginType(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.changeTradeMarginTypeCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 2) {
            return null;
        }
        String javaString = luaValueArr[0].toJavaString();
        LuaValue luaValue = luaValueArr[1];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.changeTradeMarginTypeCallback = luaValue.toLuaFunction();
        ((InterfaceC49499uph) C43248rlh.KWHzl.AEQbTJ(InterfaceC49499uph.class)).OLrzqt(new yHO() { // from class: o.rkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return this.copydefault.OLrzqt((java.lang.Boolean) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        }, javaString);
        return null;
    }

    public final /* synthetic */ Unit OLrzqt(Boolean bool, String str, String str2) {
        this.changeTradeMarginTypeCallback.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(bool.booleanValue()), LuaString.copydefault(str)));
        return null;
    }

    @LuaBridge
    public void reportPopupInteraction(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && luaValueArr[0].isInt()) {
            int i = luaValueArr[0].toInt();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Interaction(i, InteractionType.VIEW.getType(), null, null));
            try {
                ((InterfaceC35160nqA) C43248rlh.KWHzl.AEQbTJ(InterfaceC35160nqA.class)).KWHzl(new InteractionList(arrayList)).DbNXlk();
            } catch (IllegalStateException unused) {
            }
        }
    }

    @LuaBridge
    public LuaValue homeOnBoardingIsTreatment(LuaValue[] luaValueArr) {
        return LuaBoolean.AEQbTJ(((InterfaceC35160nqA) C43248rlh.KWHzl.AEQbTJ(InterfaceC35160nqA.class)).OLrzqt());
    }

    public Context EZpvd(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    @LuaBridge
    public LuaValue appendOKTSBaggageValues(LuaValue[] luaValueArr) {
        try {
            if (luaValueArr.length != 1 || !luaValueArr[0].isTable()) {
                return null;
            }
            Map<String, String> mapAEQbTJ = C7910asj.AEQbTJ(luaValueArr[0].toLuaTable());
            if (mapAEQbTJ.isEmpty()) {
                return null;
            }
            kOG kog = (kOG) C43248rlh.KWHzl.OLrzqt(kOG.class);
            Objects.requireNonNull(kog);
            kog.EZpvd(mapAEQbTJ);
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @LuaBridge
    public LuaValue setGrowthSoftInputMode(LuaValue[] luaValueArr) {
        Context contextEZpvd = EZpvd(this.globals);
        if (luaValueArr.length <= 0 || !(contextEZpvd instanceof Activity)) {
            return null;
        }
        Activity activity = (Activity) contextEZpvd;
        int i = luaValueArr[0].toInt();
        if (i == 1) {
            activity.getWindow().setSoftInputMode(48);
            return null;
        }
        if (i == 2) {
            activity.getWindow().setSoftInputMode(16);
            return null;
        }
        if (i != 3) {
            return null;
        }
        activity.getWindow().setSoftInputMode(32);
        return null;
    }

    @LuaBridge
    public LuaValue getIMGroupUnreadCount(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 2) {
            return null;
        }
        String javaString = luaValueArr[0].isString() ? luaValueArr[0].toJavaString() : "";
        if (luaValueArr[1].isFunction()) {
            this.imUnReadCountCallback = luaValueArr[1].toLuaFunction();
        }
        Context contextEZpvd = EZpvd(this.globals);
        if (TextUtils.isEmpty(javaString) || this.imUnReadCountCallback == null || !(contextEZpvd instanceof AbstractActivityC33041mov)) {
            return null;
        }
        C43179rkR.OLrzqt.copydefault((AbstractActivityC33041mov) contextEZpvd, javaString, new Function1() { // from class: o.rkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.EZpvd((java.lang.Integer) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit EZpvd(Integer num) {
        LuaFunction luaFunction;
        if (num == null || (luaFunction = this.imUnReadCountCallback) == null) {
            return null;
        }
        luaFunction.invoke(LuaValue.rNumber(num.intValue()));
        return null;
    }

    @LuaBridge
    public LuaValue jumpToChatActivity(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length <= 0) {
            return null;
        }
        String javaString = luaValueArr[0].isString() ? luaValueArr[0].toJavaString() : "";
        Context contextEZpvd = EZpvd(this.globals);
        if (TextUtils.isEmpty(javaString) || !(contextEZpvd instanceof AbstractActivityC33041mov)) {
            return null;
        }
        C43179rkR.OLrzqt.OLrzqt((AbstractActivityC33041mov) contextEZpvd, javaString);
        return null;
    }

    public void KWHzl() {
        LuaFunction luaFunction = this.goToTradeModePageCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
            this.goToTradeModePageCallback = null;
        }
        LuaFunction luaFunction2 = this.getCurrentTradeMarginTypeCallback;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
            this.getCurrentTradeMarginTypeCallback = null;
        }
        LuaFunction luaFunction3 = this.changeTradeMarginTypeCallback;
        if (luaFunction3 != null) {
            luaFunction3.destroy();
            this.changeTradeMarginTypeCallback = null;
        }
        LuaFunction luaFunction4 = this.inviteeCommissionCallback;
        if (luaFunction4 != null) {
            luaFunction4.destroy();
            this.inviteeCommissionCallback = null;
        }
        LuaFunction luaFunction5 = this.imUnReadCountCallback;
        if (luaFunction5 != null) {
            luaFunction5.destroy();
            this.imUnReadCountCallback = null;
            C43179rkR.OLrzqt.copydefault();
        }
    }
}
