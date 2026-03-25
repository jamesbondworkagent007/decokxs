package com.reown.android.internal.common.di;

import com.reown.utils.UtilFunctionsKt;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56529yIt;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DatabaseConfig {
    public final List<String> dbNames;
    public final String storagePrefix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DatabaseConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDbNames() {
        return this.dbNames;
    }

    public DatabaseConfig(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.storagePrefix = str;
        this.dbNames = yDY.gEmmrt(getANDROID_CORE_DB_NAME(), getSIGN_SDK_DB_NAME(), getNOTIFY_SDK_DB_NAME());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE (wrap:o.yIt:0x0004: SGET  A[WRAPPED] (LINE:8) o.yIt.KWHzl o.yIt) STATIC call: com.reown.utils.UtilFunctionsKt.getEmpty(o.yIt):java.lang.String A[MD:(o.yIt):java.lang.String (m), WRAPPED] (LINE:8)) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:8) call: com.reown.android.internal.common.di.DatabaseConfig.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ DatabaseConfig(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UtilFunctionsKt.getEmpty(C56529yIt.KWHzl) : str);
    }

    public final String getANDROID_CORE_DB_NAME() {
        return this.storagePrefix + "WalletConnectAndroidCore.db";
    }

    public final String getSIGN_SDK_DB_NAME() {
        return this.storagePrefix + "WalletConnectV2.db";
    }

    public final String getNOTIFY_SDK_DB_NAME() {
        return this.storagePrefix + "WalletConnectV2_notify.db";
    }
}
