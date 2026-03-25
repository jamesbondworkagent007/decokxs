package com.keystone.module;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class NativeResult {
    private final String result;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NativeResult copy$default(NativeResult nativeResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeResult.result;
        }
        return nativeResult.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NativeResult copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new NativeResult(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NativeResult) && Intrinsics.EZpvd((Object) this.result, (Object) ((NativeResult) obj).result);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResult() {
        return this.result;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.result.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NativeResult(result=" + this.result + ')';
    }

    public NativeResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.result = str;
    }
}
