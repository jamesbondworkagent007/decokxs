package com.immomo.mls.fun.lt;

import android.content.SharedPreferences;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7322ahe;
import org.luaj.vm2.Globals;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass(isStatic = true)
public class LTPreferenceUtils {
    @LuaBridge
    public static void save(Globals globals, String str, String str2) {
        KWHzl(globals, str, str2);
    }

    @LuaBridge
    public static String get(Globals globals, String str, String str2) {
        return AEQbTJ(globals, str, str2);
    }

    public static void KWHzl(Globals globals, String str, String str2) {
        SharedPreferences.Editor editorOLrzqt = OLrzqt(globals);
        editorOLrzqt.putString(str, str2);
        editorOLrzqt.apply();
    }

    public static String AEQbTJ(Globals globals, String str, String str2) {
        return copydefault(globals).getString(str, str2);
    }

    public static SharedPreferences copydefault(Globals globals) {
        return ((C7322ahe) globals.AuCTel()).AEQbTJ.getSharedPreferences("MLS_PREFERENCE", 0);
    }

    public static SharedPreferences.Editor OLrzqt(Globals globals) {
        return copydefault(globals).edit();
    }
}
