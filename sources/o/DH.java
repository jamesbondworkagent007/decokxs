package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56393yDs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DH extends DJ {
    public final byte[] OLrzqt;
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public static final DH AEQbTJ = new DH(127, 0, 0, 1, null);
    public static final DH KWHzl = new DH(0, 0, 0, 0, null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 byte), (r2v0 byte), (r3v0 byte), (r4v0 byte) A[MD:(byte, byte, byte, byte):void (m)] call: o.DH.<init>(byte, byte, byte, byte):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DH(byte b, byte b2, byte b3, byte b4, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, b2, b3, b4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DH copy$default(DH dh, byte[] bArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bArr = dh.OLrzqt;
        }
        return dh.EZpvd(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DH EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new DH(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.DJ
    public byte[] OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DH(@NotNull byte[] bArr) {
        super(null);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.OLrzqt = bArr;
        if (OLrzqt().length == 4) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid IPv4 repr: " + OLrzqt() + "; expected 4 bytes").toString());
    }

    public DH(byte b, byte b2, byte b3, byte b4) {
        this(new byte[]{b, b2, b3, b4});
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final DH copydefault() {
            return DH.AEQbTJ;
        }
    }

    public java.lang.String KWHzl() {
        return yDV.joinToString$default(OLrzqt(), (java.lang.CharSequence) JwtUtilsKt.JWT_DELIMITER, (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (Function1) new Function1<java.lang.Byte, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.net.IpV4Addr$address$1
            public final CharSequence invoke(byte b) {
                return C56393yDs.AEQbTJ(C56393yDs.copydefault(b));
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ CharSequence invoke(Byte b) {
                return invoke(b.byteValue());
            }
        }, 30, (java.lang.Object) null);
    }

    public java.lang.String toString() {
        return KWHzl();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DH.class == obj.getClass() && java.util.Arrays.equals(OLrzqt(), ((DH) obj).OLrzqt());
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(OLrzqt());
    }

    public final DG AEQbTJ() {
        byte[] bArr = new byte[16];
        bArr[10] = -1;
        bArr[11] = -1;
        bArr[12] = OLrzqt()[0];
        bArr[13] = OLrzqt()[1];
        bArr[14] = OLrzqt()[2];
        bArr[15] = OLrzqt()[3];
        return new DG(bArr, null, 2, 0 == true ? 1 : 0);
    }
}
