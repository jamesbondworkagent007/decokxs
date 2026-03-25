package com.okinc.unify_find.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class Plate {
    public static final int $stable = 8;

    @SerializedName("ids")
    private final List<String> ids;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_find.bean.Plate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Plate copy$default(Plate plate, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = plate.ids;
        }
        return plate.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.ids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Plate copy(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new Plate(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Plate) && Intrinsics.EZpvd(this.ids, ((Plate) obj).ids);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIds() {
        return this.ids;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.ids.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Plate(ids=" + this.ids + ")";
    }

    public Plate(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.ids = list;
    }
}
