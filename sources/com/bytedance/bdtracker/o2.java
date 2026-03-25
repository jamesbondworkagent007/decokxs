package com.bytedance.bdtracker;

import com.bytedance.applog.InitConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o2 {
    public static final o2 b = new o2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<InitConfig, Boolean> f237a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean a(@NotNull InitConfig initConfig) {
        Intrinsics.EZpvd((Object) initConfig, "");
        Boolean bool = f237a.get(initConfig);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Object b(@NotNull InitConfig initConfig) {
        Intrinsics.EZpvd((Object) initConfig, "");
        Map<InitConfig, Boolean> map = f237a;
        Boolean bool = map.get(initConfig);
        if (bool != null) {
            return bool;
        }
        map.put(initConfig, Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
