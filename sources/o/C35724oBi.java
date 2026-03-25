package o;

import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oBi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C35724oBi {
    public final int AEQbTJ;
    public final int EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35724oBi() {
        this(0, false, 0, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35724oBi copy$default(C35724oBi c35724oBi, int i, boolean z, int i2, boolean z2, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = c35724oBi.EZpvd;
        }
        if ((i3 & 2) != 0) {
            z = c35724oBi.KWHzl;
        }
        boolean z3 = z;
        if ((i3 & 4) != 0) {
            i2 = c35724oBi.AEQbTJ;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            z2 = c35724oBi.OLrzqt;
        }
        boolean z4 = z2;
        if ((i3 & 16) != 0) {
            visualMediaType = c35724oBi.copydefault;
        }
        return c35724oBi.AEQbTJ(i, z3, i4, z4, visualMediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35724oBi AEQbTJ(int i, boolean z, int i2, boolean z2, @NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        Intrinsics.checkNotNullParameter(visualMediaType, "");
        return new C35724oBi(i, z, i2, z2, visualMediaType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35724oBi)) {
            return false;
        }
        C35724oBi c35724oBi = (C35724oBi) obj;
        return this.EZpvd == c35724oBi.EZpvd && this.KWHzl == c35724oBi.KWHzl && this.AEQbTJ == c35724oBi.AEQbTJ && this.OLrzqt == c35724oBi.OLrzqt && Intrinsics.EZpvd(this.copydefault, c35724oBi.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.EZpvd) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "IMVisualMediaPickerOptions(maxItems=" + this.EZpvd + ", isBroadcast=" + this.KWHzl + ", totalRecipients=" + this.AEQbTJ + ", showPreviewPager=" + this.OLrzqt + ", mediaType=" + this.copydefault + ")";
    }

    public C35724oBi(int i, boolean z, int i2, boolean z2, @NotNull ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        Intrinsics.checkNotNullParameter(visualMediaType, "");
        this.EZpvd = i;
        this.KWHzl = z;
        this.AEQbTJ = i2;
        this.OLrzqt = z2;
        this.copydefault = visualMediaType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 boolean) : false)
  (wrap:androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType:?: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType:0x001e: SGET  A[WRAPPED] (LINE:493) androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$ImageAndVideo) : (r8v0 androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType))
 A[MD:(int, boolean, int, boolean, androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType):void (m)] (LINE:488) call: o.oBi.<init>(int, boolean, int, boolean, androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$VisualMediaType):void type: THIS */
    public /* synthetic */ C35724oBi(int i, boolean z, int i2, boolean z2, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) == 0 ? z2 : false, (i3 & 16) != 0 ? ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE : visualMediaType);
    }
}
