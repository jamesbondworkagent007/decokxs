package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseModel<T> {
    public static final int $stable = 8;
    private T data;
    private transient String moduleId;
    private final String moduleName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleId() {
        return this.moduleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(T t) {
        this.data = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModuleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.moduleId = str;
    }

    public BaseModel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.moduleName = str;
        this.moduleId = "";
    }
}
