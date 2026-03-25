package o;

import com.google.common.primitives.UnsignedBytes;
import com.okinc.components.security.scanner.utils.StringPool$Companion$readStrings$parseFn$1;
import com.okinc.components.security.scanner.utils.StringPool$Companion$readStrings$parseFn$2;
import java.nio.ByteOrder;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.asn1.cmc.BodyPartID;

/* JADX INFO: renamed from: o.mkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32793mkL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C32795mkN AEQbTJ;
    public final java.util.List<java.lang.String> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.KWHzl;
    }

    public C32793mkL(@NotNull C32795mkN c32795mkN, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(c32795mkN, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = c32795mkN;
        this.KWHzl = list;
    }

    /* JADX INFO: renamed from: o.mkL$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mkL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C32793mkL KWHzl(@NotNull java.nio.ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            C32795mkN c32795mkNKWHzl = C32795mkN.Companion.KWHzl(byteBuffer);
            return new C32793mkL(c32795mkNKWHzl, AEQbTJ(c32795mkNKWHzl, byteBuffer));
        }

        public final java.util.List<java.lang.String> AEQbTJ(C32795mkN c32795mkN, java.nio.ByteBuffer byteBuffer) throws java.io.IOException {
            long j = 28;
            int iOLrzqt = (int) (c32795mkN.OLrzqt().OLrzqt() - j);
            byte[] bArr = new byte[iOLrzqt];
            new C5615Yn(byteBuffer).read(bArr);
            java.util.List<java.lang.Long> listKWHzl = KWHzl(bArr, (int) c32795mkN.AEQbTJ());
            byte[] bArrAEQbTJ = yDT.AEQbTJ(bArr, (int) (c32795mkN.KWHzl() - j), iOLrzqt);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            Function2 stringPool$Companion$readStrings$parseFn$1 = (c32795mkN.copydefault() & 256) != 0 ? new StringPool$Companion$readStrings$parseFn$1(C32793mkL.Companion) : new StringPool$Companion$readStrings$parseFn$2(C32793mkL.Companion);
            java.util.Iterator<java.lang.Long> it = listKWHzl.iterator();
            while (it.hasNext()) {
                arrayList.add(stringPool$Companion$readStrings$parseFn$1.invoke(bArrAEQbTJ, java.lang.Integer.valueOf((int) it.next().longValue())));
            }
            return arrayList;
        }

        public final java.util.List<java.lang.Long> KWHzl(byte[] bArr, int i) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(java.lang.Long.valueOf(((long) byteBufferOrder.getInt()) & BodyPartID.bodyIdMax));
            }
            return arrayList;
        }

        public final java.lang.String AEQbTJ(byte[] bArr, int i) {
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.position(i);
            int i2 = byteBufferOrder.getShort() & HPKE.aead_EXPORT_ONLY;
            char[] cArr = new char[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                byteBufferOrder.position((i3 * 2) + i + 2);
                cArr[i3] = (char) byteBufferOrder.getShort();
            }
            return new java.lang.String(cArr);
        }

        public final java.lang.String EZpvd(byte[] bArr, int i) {
            return new java.lang.String(bArr, i + 2, bArr[i + 1] & UnsignedBytes.MAX_VALUE, Charsets.UTF_8);
        }
    }
}
