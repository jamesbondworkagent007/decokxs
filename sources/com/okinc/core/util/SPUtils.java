package com.okinc.core.util;

import QfgSZK.DCJXGO;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.MapFieldLite;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import o.C33488mxR;
import o.C33490mxT;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public class SPUtils {
    private static String defaultFileName = "config";
    private static SharedPreferences mPrefs;
    private static Context sContext;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static Context getContext() {
        return sContext;
    }

    public static void init(Context context) {
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
    }

    public static void put(String str, Object obj) {
        put(str, obj, (String) null);
    }

    public static void put(String str, Object obj, String str2) {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(str2 != null ? str2 : defaultFileName, 0);
        mPrefs = sharedPreferences;
        if (obj == null) {
            remove(str, str2);
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).apply();
            return;
        }
        if (obj instanceof Long) {
            sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).apply();
            return;
        }
        if (obj instanceof String) {
            sharedPreferences.edit().putString(str, (String) obj).apply();
            return;
        }
        if (obj instanceof Float) {
            sharedPreferences.edit().putFloat(str, ((Float) obj).floatValue()).apply();
        } else if (obj instanceof Double) {
            sharedPreferences.edit().putString(str, String.valueOf(obj)).apply();
        } else {
            sharedPreferences.edit().putString(str, C33490mxT.OLrzqt(obj)).apply();
        }
    }

    public static boolean commit(String str, Object obj) {
        return commit(str, obj, null);
    }

    public static boolean commit(String str, Object obj, String str2) {
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(str2 != null ? str2 : defaultFileName, 0);
        mPrefs = sharedPreferences;
        if (obj == null) {
            remove(str, str2);
            return false;
        }
        if (obj instanceof Boolean) {
            return sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        }
        if (obj instanceof Integer) {
            return sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (obj instanceof Long) {
            return sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        }
        if (obj instanceof String) {
            return sharedPreferences.edit().putString(str, (String) obj).commit();
        }
        if (obj instanceof Float) {
            return sharedPreferences.edit().putFloat(str, ((Float) obj).floatValue()).commit();
        }
        if (obj instanceof Double) {
            return sharedPreferences.edit().putString(str, String.valueOf(obj)).commit();
        }
        return sharedPreferences.edit().putString(str, C33490mxT.OLrzqt(obj)).commit();
    }

    public static boolean put(String str, String str2, String str3) {
        Context context = getContext();
        if (str3 == null) {
            str3 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str3, 0);
        mPrefs = sharedPreferences;
        if (str2 == null) {
            return false;
        }
        return sharedPreferences.edit().putString(str, str2).commit();
    }

    public static Long getLong(String str, long j) {
        return getLong(str, j, null);
    }

    public static Long getLong(String str, long j, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        return Long.valueOf(sharedPreferences.getLong(str, j));
    }

    public static float getFloat(String str, float f) {
        return getFloat(str, f, null);
    }

    public static float getFloat(String str, float f, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        return sharedPreferences.getFloat(str, f);
    }

    public static double getDouble(String str, double d) {
        return getDouble(str, d, null);
    }

    public static double getDouble(String str, double d, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        return Double.valueOf(sharedPreferences.getString(str, String.valueOf(d))).doubleValue();
    }

    public static boolean getBoolean(String str, boolean z) {
        return getBoolean(str, z, null);
    }

    public static boolean getBoolean(String str, boolean z, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        return sharedPreferences.getBoolean(str, z);
    }

    public static String getString(String str, String str2) {
        return getString(str, str2, null);
    }

    public static String getString(String str, String str2, String str3) {
        Context context = getContext();
        if (str3 == null) {
            str3 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str3, 0);
        mPrefs = sharedPreferences;
        return sharedPreferences.getString(str, str2);
    }

    public static Integer getInt(String str, int i) {
        return getInt(str, i, null);
    }

    public static Integer getInt(String str, int i, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        return Integer.valueOf(sharedPreferences.getInt(str, i));
    }

    public static <T> T getObject(String str, Class<T> cls) {
        return (T) getObject(str, cls, null, null);
    }

    public static <T> T getObject(String str, Class<T> cls, T t) {
        return (T) getObject(str, cls, t, null);
    }

    public static <T> T getObject(String str, Class<T> cls, String str2) {
        return (T) getObject(str, cls, null, str2);
    }

    public static <T> T getObject(String str, Class<T> cls, T t, String str2) {
        try {
            Context context = getContext();
            if (str2 == null) {
                str2 = defaultFileName;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            mPrefs = sharedPreferences;
            String string = sharedPreferences.getString(str, null);
            return TextUtils.isEmpty(string) ? t : (T) C33490mxT.EZpvd(string, (Class) cls);
        } catch (Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static <ItemType> LinkedHashMap<Object, ItemType> getLinkedHashMap(String str, Class<ItemType> cls) {
        return getLinkedHashMap(str, cls, null);
    }

    public static <ItemType> LinkedHashMap<Object, ItemType> getLinkedHashMap(String str, Class<ItemType> cls, String str2) {
        try {
            Context context = getContext();
            if (str2 == null) {
                str2 = defaultFileName;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            mPrefs = sharedPreferences;
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            MapFieldLite mapFieldLite = (LinkedHashMap<Object, ItemType>) new LinkedHashMap();
            JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(string);
            if (jsonObjectOLrzqt == null) {
                return null;
            }
            for (String str3 : jsonObjectOLrzqt.keySet()) {
                JsonElement jsonElement = jsonObjectOLrzqt.get(str3);
                if (jsonElement != null) {
                    mapFieldLite.put(str3, C33488mxR.AEQbTJ(jsonElement, cls));
                }
            }
            return mapFieldLite;
        } catch (Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static <ItemType> LinkedList<ItemType> getLinkedList(String str, Class<ItemType> cls) {
        return getLinkedList(str, cls, null);
    }

    public static <ItemType> LinkedList<ItemType> getLinkedList(String str, Class<ItemType> cls, String str2) {
        try {
            Context context = getContext();
            if (str2 == null) {
                str2 = defaultFileName;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            mPrefs = sharedPreferences;
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return new LinkedList<>((ArrayList) C33490mxT.AEQbTJ(string, cls));
        } catch (Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static <ItemType> ArrayList<ItemType> getArrayList(String str, Class<ItemType> cls) {
        return getArrayList(str, cls, null);
    }

    public static <ItemType> ArrayList<ItemType> getArrayList(String str, Class<ItemType> cls, String str2) {
        try {
            Context context = getContext();
            if (str2 == null) {
                str2 = defaultFileName;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            mPrefs = sharedPreferences;
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return (ArrayList) C33490mxT.AEQbTJ(string, cls);
        } catch (Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static <ValueType> HashMap<Object, ValueType> getHashMap(String str, Class<ValueType> cls) {
        return getHashMap(str, cls, null);
    }

    public static <ValueType> HashMap<Object, ValueType> getHashMap(String str, Class<ValueType> cls, String str2) {
        try {
            Context context = getContext();
            if (str2 == null) {
                str2 = defaultFileName;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            mPrefs = sharedPreferences;
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            DCJXGO dcjxgo = (HashMap<Object, ValueType>) new HashMap();
            JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(string);
            for (String str3 : jsonObjectOLrzqt.keySet()) {
                JsonElement jsonElement = jsonObjectOLrzqt.get(str3);
                if (jsonElement != null) {
                    dcjxgo.put(str3, C33488mxR.AEQbTJ(jsonElement, cls));
                }
            }
            return dcjxgo;
        } catch (Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public static void remove(String str) {
        remove(str, null);
    }

    public static void remove(String str, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        sharedPreferences.edit().remove(str).commit();
    }

    public static boolean clear(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        SharedPreferences sharedPreferences = getContext().getSharedPreferences(str, 0);
        mPrefs = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        return editorEdit.commit();
    }

    public static boolean contains(String str) {
        return contains(str, null);
    }

    public static boolean contains(String str, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
        mPrefs = sharedPreferences;
        return sharedPreferences.contains(str);
    }

    public static void putStringSet(String str, Set<String> set) {
        putStringSet(str, set, null);
    }

    public static void putStringSet(String str, Set<String> set, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        context.getSharedPreferences(str2, 0).edit().putStringSet(str, set).apply();
    }

    public static Set<String> getStringSet(String str, Set<String> set) {
        return getStringSet(str, set, null);
    }

    public static Set<String> getStringSet(String str, Set<String> set, String str2) {
        Context context = getContext();
        if (str2 == null) {
            str2 = defaultFileName;
        }
        return context.getSharedPreferences(str2, 0).getStringSet(str, set);
    }

    public static Set<String> getStringSet(String str) {
        return getStringSet(str, null, null);
    }

    public static void registerOnSPChangeListener(String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        Context context = getContext();
        if (str == null) {
            str = defaultFileName;
        }
        context.getSharedPreferences(str, 0).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public static List<String> keys(String str) {
        Context context = getContext();
        if (str == null) {
            str = defaultFileName;
        }
        mPrefs = context.getSharedPreferences(str, 0);
        return new ArrayList(mPrefs.getAll().keySet());
    }
}
