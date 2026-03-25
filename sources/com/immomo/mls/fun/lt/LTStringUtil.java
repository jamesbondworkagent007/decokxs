package com.immomo.mls.fun.lt;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDMap;
import com.immomo.mls.fun.ud.UDSize;
import java.util.List;
import java.util.Map;
import o.C7322ahe;
import o.C7323ahf;
import o.C7350aiF;
import o.C7862aro;
import o.C7865arr;
import o.C7869arv;
import o.InterfaceC7304ahM;
import o.pTD;
import o.pUU;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(isStatic = true)
public class LTStringUtil {
    @LuaBridge
    public static LuaValue md5(String str) {
        if (str == null) {
            return LuaValue.Nil();
        }
        return LuaString.copydefault(C7862aro.copydefault(str));
    }

    @LuaBridge
    public static int length(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    @LuaBridge
    public static Map jsonToMap(LuaValue luaValue) {
        try {
            String javaString = luaValue.isString() ? luaValue.toJavaString() : null;
            luaValue.destroy();
            if (TextUtils.isEmpty(javaString)) {
                return null;
            }
            return C7869arv.KWHzl(new JSONObject(javaString));
        } catch (JSONException e) {
            pUU.copydefault("tag", Log.getStackTraceString(e));
            return null;
        }
    }

    @LuaBridge
    public static List jsonToArray(LuaValue luaValue) {
        try {
            String javaString = luaValue.isString() ? luaValue.toJavaString() : null;
            luaValue.destroy();
            if (TextUtils.isEmpty(javaString)) {
                return null;
            }
            return C7869arv.KWHzl(new JSONArray(javaString));
        } catch (JSONException e) {
            pUU.copydefault("tag", Log.getStackTraceString(e));
            return null;
        }
    }

    @LuaBridge
    public static String arrayToJSON(LuaValue luaValue) {
        if (luaValue == null) {
            return null;
        }
        List listEZpvd = luaValue instanceof UDArray ? ((UDArray) luaValue).EZpvd() : null;
        luaValue.destroy();
        if (listEZpvd == null) {
            return null;
        }
        return C7869arv.copydefault(listEZpvd).toString();
    }

    @LuaBridge
    public static String mapToJSON(LuaValue luaValue) {
        if (luaValue == null) {
            return null;
        }
        Map mapEZpvd = luaValue instanceof UDMap ? ((UDMap) luaValue).EZpvd() : null;
        luaValue.destroy();
        if (mapEZpvd == null) {
            return null;
        }
        return C7869arv.copydefault(mapEZpvd).toString();
    }

    @LuaBridge
    public static UDSize sizeWithContentFontSize(Globals globals, String str, float f) {
        return AEQbTJ(globals, str, f, null);
    }

    @LuaBridge
    public static UDSize sizeWithContentFontNameSize(Globals globals, String str, String str2, float f) {
        return AEQbTJ(globals, str, f, str2);
    }

    public static UDSize AEQbTJ(Globals globals, String str, float f, @Nullable String str2) {
        InterfaceC7304ahM interfaceC7304ahMEjfBZ;
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        String str3 = null;
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context == null || TextUtils.isEmpty(str) || f <= 0.0f) {
            return new UDSize(globals, new C7350aiF());
        }
        int length = 1;
        Paint paint = new Paint(1);
        paint.setTextSize(TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics()));
        if (!TextUtils.isEmpty(str2) && (interfaceC7304ahMEjfBZ = C7323ahf.ejfBZ()) != null) {
            paint.setTypeface(interfaceC7304ahMEjfBZ.KWHzl(str2));
        }
        if (str.contains("\n")) {
            String[] strArrSplit = str.split("\n");
            length = strArrSplit.length;
            for (String str4 : strArrSplit) {
                if (str3 == null || paint.measureText(str3) < paint.measureText(str4)) {
                    str3 = str4;
                }
            }
            str = str3;
        }
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float f2 = (fontMetricsInt.descent - fontMetricsInt.ascent) * length;
        UDSize uDSize = new UDSize(globals, new C7350aiF());
        uDSize.AEQbTJ((float) Math.ceil(C7865arr.AEQbTJ(paint.measureText(str))));
        uDSize.KWHzl((float) Math.ceil(C7865arr.AEQbTJ(f2)));
        return uDSize;
    }

    @LuaBridge
    public static LuaTable rangeOfString(Globals globals, String str, String str2) {
        if ((!(!TextUtils.isEmpty(str)) || !(!TextUtils.isEmpty(str2))) || !str.contains(str2)) {
            return null;
        }
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        luaTableAEQbTJ.set(1, str.indexOf(str2));
        luaTableAEQbTJ.set(2, str2.length());
        return luaTableAEQbTJ;
    }

    @LuaBridge
    public static String prependSign(String str, String str2) {
        return pTD.KWHzl(str, str2);
    }

    @LuaBridge
    public static String appendSymbol(String str, String str2) {
        return pTD.AEQbTJ(str, str2);
    }
}
