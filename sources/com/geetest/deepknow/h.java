package com.geetest.deepknow;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes17.dex */
public class h {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Method f393a = a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private static Method a() {
            try {
                return SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                return null;
            }
        }

        public static void a(SharedPreferences.Editor editor) {
            try {
                Method method = f393a;
                if (method != null) {
                    method.invoke(editor, new Object[0]);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            editor.commit();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, String str, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ggd_data", 0);
            if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
                return;
            }
            if (obj instanceof String) {
                editorEdit.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                editorEdit.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                editorEdit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                editorEdit.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Long) {
                editorEdit.putLong(str, ((Long) obj).longValue());
            } else {
                editorEdit.putString(str, obj.toString());
            }
            a.a(editorEdit);
        } catch (Exception unused) {
        }
    }

    public static String a(Context context, String str, String str2) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ggd_data", 0);
            if (sharedPreferences == null) {
                return "$unknown";
            }
            return sharedPreferences.getString(str, str2);
        } catch (Exception unused) {
            return "$unknown";
        }
    }
}
