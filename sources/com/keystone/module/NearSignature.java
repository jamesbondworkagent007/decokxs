package com.keystone.module;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class NearSignature {
    private final String requestId;
    private final ArrayList<String> signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.keystone.module.NearSignature */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NearSignature copy$default(NearSignature nearSignature, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nearSignature.requestId;
        }
        if ((i & 2) != 0) {
            arrayList = nearSignature.signature;
        }
        return nearSignature.copy(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NearSignature copy(@NotNull String str, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new NearSignature(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearSignature)) {
            return false;
        }
        NearSignature nearSignature = (NearSignature) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) nearSignature.requestId) && Intrinsics.EZpvd(this.signature, nearSignature.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.requestId.hashCode() * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NearSignature(requestId=" + this.requestId + ", signature=" + this.signature + ')';
    }

    public NearSignature(@NotNull String str, @NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.requestId = str;
        this.signature = arrayList;
    }
}
