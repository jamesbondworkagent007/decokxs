package com.reown.android.internal.common.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ProjectId {
    public final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProjectId copy$default(ProjectId projectId, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectId.value;
        }
        return projectId.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectId copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ProjectId(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProjectId) && Intrinsics.EZpvd((Object) this.value, (Object) ((ProjectId) obj).value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProjectId(value=" + this.value + ")";
    }

    public ProjectId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }
}
