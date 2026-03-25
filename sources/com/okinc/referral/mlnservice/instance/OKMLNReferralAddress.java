package com.okinc.referral.mlnservice.instance;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDArray;
import com.okinc.referral.mlnservice.bean.UDAddressItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.C48726ubC;
import o.C7322ahe;
import o.C7869arv;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@LuaClass
public class OKMLNReferralAddress {
    public static final String LUA_CLASS_NAME = "OKReferralAddress";
    public LuaFunction checkPermissionsCallback;
    public LuaFunction getAddressListCallback;
    public LuaFunction getAllAddressListCallback;
    public Globals mGlobals;
    public LuaFunction requestPermissionsCallback;
    public LuaFunction searchAddressListCallback;

    public OKMLNReferralAddress(Globals globals, LuaValue[] luaValueArr) {
        this.mGlobals = globals;
    }

    @LuaBridge
    public LuaValue getAddressListData(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaFunction luaFunction = this.getAddressListCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || !luaValue.isFunction()) {
            return null;
        }
        this.getAddressListCallback = luaValue.toLuaFunction();
        if (EZpvd(this.mGlobals) == null) {
            return null;
        }
        C48726ubC.KWHzl.EZpvd(EZpvd(this.mGlobals), new Function1() { // from class: o.ubw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault((java.util.ArrayList) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit copydefault(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            UDAddressItem uDAddressItem = new UDAddressItem(this.mGlobals, arrayList.get(i));
            arrayList2.add(uDAddressItem);
            uDAddressItem.onJavaRef();
        }
        this.getAddressListCallback.invoke(LuaValue.varargsOf(arrayList2.size() == 0 ? LuaValue.Nil() : new UDArray(this.mGlobals, (List) arrayList2)));
        return null;
    }

    @LuaBridge
    public LuaValue getAddressListDataByTable(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaFunction luaFunction = this.getAllAddressListCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || !luaValue.isFunction()) {
            return null;
        }
        this.getAllAddressListCallback = luaValue.toLuaFunction();
        if (EZpvd(this.mGlobals) == null) {
            return null;
        }
        C48726ubC.KWHzl.EZpvd(EZpvd(this.mGlobals), new Function1() { // from class: o.ubD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ((java.util.ArrayList) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit AEQbTJ(ArrayList arrayList) {
        try {
            this.getAllAddressListCallback.invoke(arrayList.isEmpty() ? LuaValue.varargsOf(LuaValue.Nil()) : LuaValue.varargsOf(C7869arv.EZpvd(this.mGlobals, new Gson().toJsonTree(arrayList).getAsJsonArray())));
            return null;
        } catch (Exception unused) {
            this.getAllAddressListCallback.invoke(LuaValue.varargsOf(LuaValue.Nil()));
            return null;
        }
    }

    @LuaBridge
    public LuaValue checkAddressState(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaFunction luaFunction = this.checkPermissionsCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || !luaValue.isFunction()) {
            return null;
        }
        this.checkPermissionsCallback = luaValue.toLuaFunction();
        C48726ubC.KWHzl.OLrzqt(EZpvd(this.mGlobals), new Function1() { // from class: o.ubz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl((java.lang.Integer) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit KWHzl(Integer num) {
        this.checkPermissionsCallback.invoke(LuaValue.varargsOf(LuaValue.rNumber(num.intValue())));
        return null;
    }

    @LuaBridge
    public LuaValue requestAddressPermission(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaFunction luaFunction = this.requestPermissionsCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 1 || (luaValue = luaValueArr[0]) == null || !luaValue.isFunction()) {
            return null;
        }
        this.requestPermissionsCallback = luaValue.toLuaFunction();
        C48726ubC.KWHzl.AEQbTJ(EZpvd(this.mGlobals), new Function1() { // from class: o.ubv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault((java.lang.Integer) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit copydefault(Integer num) {
        this.requestPermissionsCallback.invoke(LuaValue.varargsOf(LuaValue.rNumber(num.intValue())));
        return null;
    }

    @LuaBridge
    public LuaValue jumpAddressSetting() {
        C48726ubC.KWHzl.EZpvd(EZpvd(this.mGlobals));
        return null;
    }

    @LuaBridge
    public LuaValue searchAddressWithText(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.searchAddressListCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 2) {
            return null;
        }
        final String javaString = luaValueArr[0].toJavaString();
        LuaValue luaValue = luaValueArr[1];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.searchAddressListCallback = luaValue.toLuaFunction();
        C48726ubC.KWHzl.OLrzqt(EZpvd(this.mGlobals), javaString, new Function1() { // from class: o.ubx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.EZpvd(javaString, (java.util.ArrayList) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit EZpvd(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            UDAddressItem uDAddressItem = new UDAddressItem(this.mGlobals, arrayList.get(i));
            arrayList2.add(uDAddressItem);
            uDAddressItem.onJavaRef();
        }
        this.searchAddressListCallback.invoke(LuaValue.varargsOf(LuaString.copydefault(str), arrayList2.size() == 0 ? LuaValue.Nil() : new UDArray(this.mGlobals, (List) arrayList2)));
        return null;
    }

    @LuaBridge
    public LuaValue searchAddressWithTextByTable(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.searchAddressListCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 2) {
            return null;
        }
        final String javaString = luaValueArr[0].toJavaString();
        LuaValue luaValue = luaValueArr[1];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.searchAddressListCallback = luaValue.toLuaFunction();
        C48726ubC.KWHzl.OLrzqt(EZpvd(this.mGlobals), javaString, new Function1() { // from class: o.uby
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.KWHzl(javaString, (java.util.ArrayList) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit KWHzl(String str, ArrayList arrayList) {
        try {
            this.searchAddressListCallback.invoke(LuaValue.varargsOf(arrayList.isEmpty() ? LuaValue.varargsOf(LuaString.copydefault(str), LuaValue.Nil()) : LuaValue.varargsOf(LuaString.copydefault(str), C7869arv.EZpvd(this.mGlobals, new Gson().toJsonTree(arrayList).getAsJsonArray()))));
            return null;
        } catch (Exception unused) {
            this.searchAddressListCallback.invoke(LuaValue.varargsOf(LuaValue.Nil()));
            return null;
        }
    }

    @LuaBridge
    public LuaValue fuzzySearchAddressWithTextByTable(LuaValue[] luaValueArr) {
        LuaFunction luaFunction = this.searchAddressListCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        if (luaValueArr.length != 2) {
            return null;
        }
        final String javaString = luaValueArr[0].toJavaString();
        LuaValue luaValue = luaValueArr[1];
        if (luaValue == null || !luaValue.isFunction()) {
            return null;
        }
        this.searchAddressListCallback = luaValue.toLuaFunction();
        C48726ubC.KWHzl.KWHzl(EZpvd(this.mGlobals), javaString, new Function1() { // from class: o.ubB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.OLrzqt(javaString, (java.util.ArrayList) obj);
            }
        });
        return null;
    }

    public final /* synthetic */ Unit OLrzqt(String str, ArrayList arrayList) {
        try {
            this.searchAddressListCallback.invoke(LuaValue.varargsOf(arrayList.isEmpty() ? LuaValue.varargsOf(LuaString.copydefault(str), LuaValue.Nil()) : LuaValue.varargsOf(LuaString.copydefault(str), C7869arv.EZpvd(this.mGlobals, new Gson().toJsonTree(arrayList).getAsJsonArray()))));
            return null;
        } catch (Exception unused) {
            this.searchAddressListCallback.invoke(LuaValue.varargsOf(LuaValue.Nil()));
            return null;
        }
    }

    @LuaBridge
    public LuaValue jumpSendMessagePage(LuaValue[] luaValueArr) {
        String javaString = "";
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? "" : luaValueArr[0].toJavaString();
        String javaString3 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? "" : luaValueArr[1].toJavaString();
        if (luaValueArr.length > 2 && luaValueArr[2].isString()) {
            javaString = luaValueArr[2].toJavaString();
        }
        C48726ubC.KWHzl.AEQbTJ(EZpvd(this.mGlobals), javaString3, javaString, javaString2);
        return null;
    }

    @LuaBridge
    public LuaValue jumpSendEmailPage(LuaValue[] luaValueArr) {
        String javaString = "";
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? "" : luaValueArr[0].toJavaString();
        String javaString3 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? "" : luaValueArr[1].toJavaString();
        String javaString4 = (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? "" : luaValueArr[2].toJavaString();
        if (luaValueArr.length > 3 && luaValueArr[3].isString()) {
            javaString = luaValueArr[3].toJavaString();
        }
        C48726ubC.KWHzl.EZpvd(EZpvd(this.mGlobals), javaString3, javaString4, javaString, javaString2);
        return null;
    }

    public Context EZpvd(@NonNull Globals globals) {
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null) {
            return c7322ahe.AEQbTJ;
        }
        return null;
    }

    public void OLrzqt() {
        LuaFunction luaFunction = this.getAddressListCallback;
        if (luaFunction != null) {
            luaFunction.destroy();
            this.getAddressListCallback = null;
        }
        LuaFunction luaFunction2 = this.getAllAddressListCallback;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
            this.getAllAddressListCallback = null;
        }
        LuaFunction luaFunction3 = this.checkPermissionsCallback;
        if (luaFunction3 != null) {
            luaFunction3.destroy();
            this.checkPermissionsCallback = null;
        }
        LuaFunction luaFunction4 = this.requestPermissionsCallback;
        if (luaFunction4 != null) {
            luaFunction4.destroy();
            this.requestPermissionsCallback = null;
        }
        LuaFunction luaFunction5 = this.searchAddressListCallback;
        if (luaFunction5 != null) {
            luaFunction5.destroy();
            this.searchAddressListCallback = null;
        }
    }
}
