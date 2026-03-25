package com.bytedance.dr;

import android.content.Context;
import com.bytedance.bdtracker.n5;
import com.bytedance.dr.impl.b;

/* JADX INFO: loaded from: classes2.dex */
public final class OaidFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OaidApi createOaidImpl(Context context) {
        if (n5.c()) {
            return new b();
        }
        return null;
    }
}
