package o;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C58157yvw {
    public byte[] AEQbTJ;
    public int EZpvd;
    public final ByteOrder KWHzl;

    public C58157yvw() {
        this(new byte[0], ByteOrder.LITTLE_ENDIAN);
    }

    public C58157yvw(@NotNull byte[] bArr, @NotNull ByteOrder byteOrder) {
        this(bArr, 0, byteOrder);
    }

    public C58157yvw(@NotNull byte[] bArr, int i, @NotNull ByteOrder byteOrder) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset must be greater or equal to zero");
        }
        Objects.requireNonNull(byteOrder);
        if (byteOrder != ByteOrder.LITTLE_ENDIAN && byteOrder != ByteOrder.BIG_ENDIAN) {
            throw new java.lang.IllegalArgumentException("unsupported ByteOrder value");
        }
        Objects.requireNonNull(bArr);
        this.AEQbTJ = bArr;
        this.EZpvd = i;
        this.KWHzl = byteOrder;
    }

    public static java.lang.String AEQbTJ(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            sb.append(java.lang.String.format("%02x", java.lang.Integer.valueOf(b & UnsignedBytes.MAX_VALUE)));
        }
        return sb.toString();
    }

    public java.lang.String toString() {
        return AEQbTJ(this.AEQbTJ);
    }
}
