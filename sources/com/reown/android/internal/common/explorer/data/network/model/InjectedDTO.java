package com.reown.android.internal.common.explorer.data.network.model;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@JsonClass(generateAdapter = true)
public final class InjectedDTO {
    public final String injectedId;
    public final String namespace;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InjectedDTO copy$default(InjectedDTO injectedDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = injectedDTO.namespace;
        }
        if ((i & 2) != 0) {
            str2 = injectedDTO.injectedId;
        }
        return injectedDTO.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.injectedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InjectedDTO copy(@Json(name = "namespace") @NotNull String str, @Json(name = "injected_id") @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InjectedDTO(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InjectedDTO)) {
            return false;
        }
        InjectedDTO injectedDTO = (InjectedDTO) obj;
        return Intrinsics.EZpvd((Object) this.namespace, (Object) injectedDTO.namespace) && Intrinsics.EZpvd((Object) this.injectedId, (Object) injectedDTO.injectedId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInjectedId() {
        return this.injectedId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNamespace() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.namespace.hashCode() * 31) + this.injectedId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InjectedDTO(namespace=" + this.namespace + ", injectedId=" + this.injectedId + ")";
    }

    public InjectedDTO(@Json(name = "namespace") @NotNull String str, @Json(name = "injected_id") @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.namespace = str;
        this.injectedId = str2;
    }
}
