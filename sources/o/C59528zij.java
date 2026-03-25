package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import kotlin.uuid.UuidSerialized;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59528zij {
    public static final java.lang.Object AEQbTJ(@NotNull Uuid uuid) {
        Intrinsics.checkNotNullParameter(uuid, "");
        return new UuidSerialized(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }
}
