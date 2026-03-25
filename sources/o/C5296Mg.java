package o;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5296Mg implements InterfaceC5295Mf {
    public final android.content.Context OLrzqt;

    public C5296Mg(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
    }

    @Override // o.InterfaceC5295Mf
    public java.util.Map<java.lang.String, java.lang.String> OLrzqt(@NotNull java.lang.String str) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            android.content.SharedPreferences sharedPreferences = this.OLrzqt.getSharedPreferences(str, 0);
            linkedHashMap = new LinkedHashMap();
            java.util.Map<java.lang.String, ?> all = sharedPreferences.getAll();
            Intrinsics.checkNotNullExpressionValue(all, "");
            for (Map.Entry<java.lang.String, ?> entry : all.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value instanceof java.lang.String) {
                    Intrinsics.checkNotNullExpressionValue(key, "");
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // o.InterfaceC5295Mf
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        synchronized (this) {
            SharedPreferences.Editor editorEdit = this.OLrzqt.getSharedPreferences(str, 0).edit();
            editorEdit.clear();
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                editorEdit.putString(entry.getKey(), entry.getValue());
            }
            editorEdit.commit();
            Unit unit = Unit.INSTANCE;
        }
    }
}
