package com.bytedance.bdtracker;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f147a = new ArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sbA = a.a(str);
        sbA.append(File.separator);
        sbA.append(str2);
        sbA.append(".dat");
        File file = new File(sbA.toString());
        if (file.exists()) {
            file.delete();
        }
    }
}
