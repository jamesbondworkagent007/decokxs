package o;

import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37668oyF {
    public final java.util.List<java.lang.String> EZpvd;
    public final java.util.List<GroupTagType> KWHzl;
    public final byte[] OLrzqt;
    public final int copydefault;
    public final java.lang.String gEmmrt;
    public final boolean valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.oyF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37668oyF copy$default(C37668oyF c37668oyF, java.lang.String str, int i, byte[] bArr, java.util.List list, java.util.List list2, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c37668oyF.gEmmrt;
        }
        if ((i2 & 2) != 0) {
            i = c37668oyF.copydefault;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bArr = c37668oyF.OLrzqt;
        }
        byte[] bArr2 = bArr;
        if ((i2 & 8) != 0) {
            list = c37668oyF.EZpvd;
        }
        java.util.List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = c37668oyF.KWHzl;
        }
        java.util.List list4 = list2;
        if ((i2 & 32) != 0) {
            z = c37668oyF.valueOf;
        }
        return c37668oyF.AEQbTJ(str, i3, bArr2, list3, list4, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37668oyF AEQbTJ(@NotNull java.lang.String str, int i, byte[] bArr, @NotNull java.util.List<java.lang.String> list, java.util.List<? extends GroupTagType> list2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C37668oyF(str, i, bArr, list, list2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<GroupTagType> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FileTypeConfig(mimeType=" + this.gEmmrt + ", maxSizeMB=" + this.copydefault + ", magicBytes=" + java.util.Arrays.toString(this.OLrzqt) + ", extensions=" + this.EZpvd + ", allowedGroupTypes=" + this.KWHzl + ", officialOnly=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.okinc.okimcore.model.room.inhouseim.GroupTagType> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37668oyF(@NotNull java.lang.String str, int i, byte[] bArr, @NotNull java.util.List<java.lang.String> list, java.util.List<? extends GroupTagType> list2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = str;
        this.copydefault = i;
        this.OLrzqt = bArr;
        this.EZpvd = list;
        this.KWHzl = list2;
        this.valueOf = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 byte[])
  (r11v0 java.util.List)
  (wrap:java.util.List:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.lang.String, int, byte[], java.util.List<java.lang.String>, java.util.List<? extends com.okinc.okimcore.model.room.inhouseim.GroupTagType>, boolean):void (m)] (LINE:18) call: o.oyF.<init>(java.lang.String, int, byte[], java.util.List, java.util.List, boolean):void type: THIS */
    public /* synthetic */ C37668oyF(java.lang.String str, int i, byte[] bArr, java.util.List list, java.util.List list2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, bArr, list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? false : z);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C37668oyF.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        C37668oyF c37668oyF = (C37668oyF) obj;
        if (!Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c37668oyF.gEmmrt) || this.copydefault != c37668oyF.copydefault) {
            return false;
        }
        byte[] bArr = this.OLrzqt;
        if (bArr != null) {
            byte[] bArr2 = c37668oyF.OLrzqt;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (c37668oyF.OLrzqt != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.EZpvd, c37668oyF.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c37668oyF.KWHzl) && this.valueOf == c37668oyF.valueOf;
    }

    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int i = this.copydefault;
        byte[] bArr = this.OLrzqt;
        int iHashCode2 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        int iHashCode3 = this.EZpvd.hashCode();
        java.util.List<GroupTagType> list = this.KWHzl;
        return (((((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.valueOf);
    }

    /* JADX INFO: renamed from: o.oyF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oyF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
