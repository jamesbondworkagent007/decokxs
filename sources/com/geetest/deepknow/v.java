package com.geetest.deepknow;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f407a = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a() {
        return f407a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context) {
        if (TextUtils.isEmpty(f407a)) {
            try {
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    externalFilesDir = context.getFilesDir();
                }
                f407a = externalFilesDir.getAbsolutePath();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
