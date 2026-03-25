package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.uhE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49046uhE {
    public static final C49046uhE EZpvd = new C49046uhE();

    private C49046uhE() {
    }

    public final LuaFunction EZpvd(@NotNull LuaValue[] luaValueArr, int i) {
        Intrinsics.checkNotNullParameter(luaValueArr, "");
        if (i >= 0 && i < luaValueArr.length) {
            LuaValue luaValue = luaValueArr[i];
            if (luaValue.isFunction()) {
                return luaValue.toLuaFunction();
            }
        }
        return null;
    }

    public final <T> T KWHzl(java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object obj = map != null ? map.get(str) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }
}
