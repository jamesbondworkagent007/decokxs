package com.reown.android.internal.common.signing.signature;

import com.reown.android.internal.common.signing.cacao.UtilsKt;
import com.reown.util.UtilFunctionsKt;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C59454zhO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Signature {
    public static final Companion Companion = new Companion(null);
    public final byte[] r;
    public final byte[] s;
    public final byte[] v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Signature copy$default(Signature signature, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = signature.v;
        }
        if ((i & 2) != 0) {
            bArr2 = signature.r;
        }
        if ((i & 4) != 0) {
            bArr3 = signature.s;
        }
        return signature.copy(bArr, bArr2, bArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] component1() {
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] component2() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] component3() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Signature copy(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        return new Signature(bArr, bArr2, bArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getR() {
        return this.r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getS() {
        return this.s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getV() {
        return this.v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Signature(v=" + Arrays.toString(this.v) + ", r=" + Arrays.toString(this.r) + ", s=" + Arrays.toString(this.s) + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.signing.signature.Signature.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final Signature fromString(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            String strGuaranteeNoHexPrefix = UtilsKt.guaranteeNoHexPrefix(str);
            if (C59454zhO.AYXKKw((CharSequence) strGuaranteeNoHexPrefix, 64).size() != 3) {
                throw new IllegalStateException("Check failed.".toString());
            }
            List listAYXKKw = C59454zhO.AYXKKw((CharSequence) strGuaranteeNoHexPrefix, 64);
            String str2 = (String) listAYXKKw.get(0);
            String str3 = (String) listAYXKKw.get(1);
            int iM = Signature$Companion$$ExternalSyntheticBackport0.m((String) listAYXKKw.get(2), 16);
            if (iM < 27) {
                iM += 27;
            }
            String hexString = Integer.toHexString(iM);
            Intrinsics.copydefault((Object) hexString);
            return new Signature(UtilFunctionsKt.hexToBytes(hexString), UtilFunctionsKt.hexToBytes(str2), UtilFunctionsKt.hexToBytes(str3));
        }
    }

    public Signature(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        this.v = bArr;
        this.r = bArr2;
        this.s = bArr3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && Intrinsics.EZpvd(Signature.class, obj.getClass()) && (obj instanceof Signature)) {
                Signature signature = (Signature) obj;
                if (!Arrays.equals(this.v, signature.v) || !Arrays.equals(this.r, signature.r) || Arrays.equals(this.s, signature.s)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.v);
        return (((iHashCode * 31) + Arrays.hashCode(this.r)) * 31) + Arrays.hashCode(this.s);
    }
}
