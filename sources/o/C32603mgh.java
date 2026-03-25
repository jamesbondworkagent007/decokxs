package o;

import androidx.camera.video.AudioStats;
import com.okinc.core.util.SPUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mgh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32603mgh implements InterfaceC4812Bry {
    @Override // o.InterfaceC4812Bry
    public java.lang.String valueOf(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return SPUtils.getString(str2, "", str);
    }

    @Override // o.InterfaceC4812Bry
    public void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        SPUtils.put(str2, str3, str);
    }

    @Override // o.InterfaceC4812Bry
    public java.lang.Boolean copydefault(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return java.lang.Boolean.valueOf(SPUtils.getBoolean(str2, false, str));
    }

    @Override // o.InterfaceC4812Bry
    public void KWHzl(java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(str2, java.lang.Boolean.valueOf(z), str);
    }

    @Override // o.InterfaceC4812Bry
    public java.lang.Long EZpvd(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return SPUtils.getLong(str2, 0L, str);
    }

    @Override // o.InterfaceC4812Bry
    public void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, long j) {
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(str2, java.lang.Long.valueOf(j), str);
    }

    @Override // o.InterfaceC4812Bry
    public java.lang.Double AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return java.lang.Double.valueOf(SPUtils.getDouble(str2, AudioStats.AUDIO_AMPLITUDE_NONE, str));
    }

    @Override // o.InterfaceC4812Bry
    public void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, double d) {
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(str2, java.lang.Double.valueOf(d), str);
    }

    @Override // o.InterfaceC4812Bry
    public java.util.List<java.lang.String> AYXKKw(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.Set<java.lang.String> stringSet = SPUtils.getStringSet(str2, yEE.copydefault(), str);
        Intrinsics.checkNotNullExpressionValue(stringSet, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(stringSet);
    }

    @Override // o.InterfaceC4812Bry
    public void KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        SPUtils.putStringSet(str2, CollectionsKt___CollectionsKt.OqFWZa(list), str);
    }

    @Override // o.InterfaceC4812Bry
    public boolean KWHzl(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return SPUtils.contains(str2, str);
    }

    @Override // o.InterfaceC4812Bry
    public void AhwBna(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.remove(str2, str);
    }

    @Override // o.InterfaceC4812Bry
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.clear(str);
    }

    @Override // o.InterfaceC4812Bry
    public java.util.List<java.lang.String> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<java.lang.String> listKeys = SPUtils.keys(str);
        Intrinsics.checkNotNullExpressionValue(listKeys, "");
        return listKeys;
    }

    @Override // o.InterfaceC4812Bry
    public java.lang.Integer OLrzqt(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return SPUtils.getInt(str2, 0, str);
    }

    @Override // o.InterfaceC4812Bry
    public void EZpvd(java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str2, "");
        SPUtils.put(str2, java.lang.Integer.valueOf(i), str);
    }

    @Override // o.InterfaceC4812Bry
    public java.lang.String djBIcL(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String string = SPUtils.getString(str2, "", str);
        if (string == null || string.length() == 0) {
            return null;
        }
        return string;
    }

    @Override // o.InterfaceC4812Bry
    public void EZpvd(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        SPUtils.put(str2, str3, str);
    }
}
