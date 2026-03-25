package com.immomo.mls.fun.lt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.immomo.mls.InitData;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import com.immomo.mls.fun.constants.NavigatorAnimType;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.ActivityC7293ahB;
import o.C7264agZ;
import o.C7322ahe;
import o.C7327ahj;
import o.C7343ahz;
import o.C7872ary;
import o.InterfaceC7339ahv;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SINavigator implements NavigatorAnimType {
    public static final String LUA_CLASS_NAME = "Navigator";
    public Globals globals;
    public int requestCode = Integer.MAX_VALUE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        int i = this.requestCode - 1;
        this.requestCode = i;
        return i;
    }

    public void KWHzl(String str, Bundle bundle, int i) {
    }

    public void KWHzl(String str, Bundle bundle, int i, int i2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt(int i) {
        switch (i) {
            case 2:
                return C7343ahz.ActionBar.isConnected;
            case 3:
                return C7343ahz.ActionBar.djBIcL;
            case 4:
                return C7343ahz.ActionBar.valueOf;
            case 5:
                return C7343ahz.ActionBar.AkhnZx;
            case 6:
                return C7343ahz.ActionBar.KWHzl;
            case 7:
                return C7343ahz.ActionBar.EZpvd;
            default:
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault(int i) {
        switch (i) {
            case 2:
                return C7343ahz.ActionBar.AhwBna;
            case 3:
                return C7343ahz.ActionBar.gEmmrt;
            case 4:
                return C7343ahz.ActionBar.AYXKKw;
            case 5:
                return C7343ahz.ActionBar.AEQbTJ;
            case 6:
                return C7343ahz.ActionBar.copydefault;
            case 7:
                return C7343ahz.ActionBar.OLrzqt;
            default:
                return 0;
        }
    }

    public SINavigator(Globals globals, LuaValue[] luaValueArr) {
        this.globals = globals;
    }

    @LuaBridge
    public void gotoCurrentPage(String str, Map map, int i) {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe == null) {
            return;
        }
        KWHzl(new File(c7322ahe.EZpvd, str + ".lua").getAbsolutePath(), KWHzl(map), i);
    }

    @LuaBridge
    public void gotoPage(String str, Map map, int i) {
        KWHzl(str, map, i);
    }

    @LuaBridge
    public void gotoAndCloseSelf(String str, Map map, int i) {
        closeSelf(i);
        KWHzl(str, map, i);
    }

    @LuaBridge
    public void closeSelf(int i) {
        Activity activityCopydefault = copydefault();
        if (activityCopydefault == null) {
            return;
        }
        activityCopydefault.finish();
        int iOLrzqt = OLrzqt(i);
        if (iOLrzqt != 0) {
            activityCopydefault.overridePendingTransition(0, iOLrzqt);
        }
    }

    @LuaBridge
    public void gotoAndGetResult(String str, Map map, int i, LuaFunction luaFunction) {
        C7264agZ c7264agZ = new C7264agZ(luaFunction);
        int iEZpvd = EZpvd();
        AEQbTJ(iEZpvd, c7264agZ);
        KWHzl(str, KWHzl(map), i, iEZpvd);
    }

    public void KWHzl(String str, Map map, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!str.endsWith(".lua")) {
            str = str + ".lua";
        }
        if (C7872ary.gEmmrt(str)) {
            if (!str.startsWith("file://android_asset/")) {
                str = C7872ary.OLrzqt(str);
            }
        } else if (C7872ary.EZpvd(str)) {
            str = "file://android_asset/" + C7872ary.copydefault(str);
        } else if (!str.startsWith("http")) {
            File file = new File(((C7322ahe) this.globals.AuCTel()).EZpvd, str);
            if (file.exists()) {
                str = file.getAbsolutePath();
            }
        }
        Activity activityCopydefault = copydefault();
        Intent intent = new Intent(activityCopydefault, (Class<?>) ActivityC7293ahB.class);
        InitData initDataCopydefault = C7327ahj.copydefault(str);
        if (initDataCopydefault.KWHzl == null) {
            initDataCopydefault.KWHzl = new HashMap();
        }
        initDataCopydefault.KWHzl.putAll(map);
        intent.putExtras(C7327ahj.OLrzqt(initDataCopydefault));
        if (activityCopydefault != null) {
            activityCopydefault.startActivity(intent);
            activityCopydefault.overridePendingTransition(copydefault(i), OLrzqt(i));
        }
    }

    public boolean AEQbTJ(int i, InterfaceC7339ahv interfaceC7339ahv) {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        if (c7322ahe == null) {
            return false;
        }
        c7322ahe.EZpvd(i, interfaceC7339ahv);
        return true;
    }

    public Bundle KWHzl(Map map) {
        Object value;
        if (map == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        Bundle bundle = new Bundle();
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            if (key != null && (value = entry.getValue()) != null) {
                KWHzl(bundle, key.toString(), value);
            }
        }
        return bundle;
    }

    public Activity copydefault() {
        C7322ahe c7322ahe = (C7322ahe) this.globals.AuCTel();
        Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static void KWHzl(Bundle bundle, String str, Object obj) {
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, obj.toString());
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }
}
