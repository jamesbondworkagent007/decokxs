package o;

import com.tencent.mmkv.MMKV;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38304pTv {
    public static final C38304pTv KWHzl = new C38304pTv();

    private C38304pTv() {
    }

    public final void KWHzl(@NotNull MMKV mmkv) {
        Intrinsics.checkNotNullParameter(mmkv, "");
        mmkv.AhwBna();
    }

    public final void copydefault(@NotNull MMKV mmkv, @NotNull java.lang.String[] strArr) {
        Intrinsics.checkNotNullParameter(mmkv, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        mmkv.removeValuesForKeys(strArr);
    }
}
