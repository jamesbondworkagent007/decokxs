package com.bytedance.dr;

import android.content.Context;
import androidx.annotation.NonNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public interface OaidApi {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f315a;
        public boolean b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            StringBuilder sbA = com.bytedance.bdtracker.a.a("Result{oaid='");
            sbA.append(this.f315a);
            sbA.append('\'');
            sbA.append(", isTrackLimit=");
            sbA.append(this.b);
            sbA.append(AbstractJsonLexerKt.END_OBJ);
            return sbA.toString();
        }
    }

    String getName();

    a getOaid(@NonNull Context context);

    boolean support(Context context);
}
