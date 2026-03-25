package com.okinc.localization2.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class StringKVDTO {
    public static final int $stable = 0;
    private final boolean isPlural;
    private final String key;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StringKVDTO copy$default(StringKVDTO stringKVDTO, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stringKVDTO.key;
        }
        if ((i & 2) != 0) {
            str2 = stringKVDTO.value;
        }
        if ((i & 4) != 0) {
            z = stringKVDTO.isPlural;
        }
        return stringKVDTO.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isPlural;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringKVDTO copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new StringKVDTO(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringKVDTO)) {
            return false;
        }
        StringKVDTO stringKVDTO = (StringKVDTO) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) stringKVDTO.key) && Intrinsics.EZpvd((Object) this.value, (Object) stringKVDTO.value) && this.isPlural == stringKVDTO.isPlural;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + Boolean.hashCode(this.isPlural);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPlural() {
        return this.isPlural;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StringKVDTO(key=" + this.key + ", value=" + this.value + ", isPlural=" + this.isPlural + ")";
    }

    public StringKVDTO(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.key = str;
        this.value = str2;
        this.isPlural = z;
    }
}
