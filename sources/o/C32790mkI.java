package o;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.mkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32790mkI {
    public static final int KWHzl(@NotNull java.nio.ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
    }

    public static final long OLrzqt(@NotNull java.nio.ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return ((long) byteBuffer.getInt()) & BodyPartID.bodyIdMax;
    }
}
