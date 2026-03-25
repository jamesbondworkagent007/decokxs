package o;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48068uDu {
    public final SnapshotStateList<wVQ> AEQbTJ;
    public final java.lang.String EZpvd;
    public final MutableState<java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;
    public final ParamSpecUiModel copydefault;
    public final MutableState<java.lang.String> djBIcL;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.uDu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C48068uDu copy$default(C48068uDu c48068uDu, java.lang.String str, java.lang.String str2, MutableState mutableState, MutableState mutableState2, SnapshotStateList snapshotStateList, ParamSpecUiModel paramSpecUiModel, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c48068uDu.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c48068uDu.EZpvd;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            mutableState = c48068uDu.djBIcL;
        }
        MutableState mutableState3 = mutableState;
        if ((i & 8) != 0) {
            mutableState2 = c48068uDu.KWHzl;
        }
        MutableState mutableState4 = mutableState2;
        if ((i & 16) != 0) {
            snapshotStateList = c48068uDu.AEQbTJ;
        }
        SnapshotStateList snapshotStateList2 = snapshotStateList;
        if ((i & 32) != 0) {
            paramSpecUiModel = c48068uDu.copydefault;
        }
        ParamSpecUiModel paramSpecUiModel2 = paramSpecUiModel;
        if ((i & 64) != 0) {
            z = c48068uDu.valueOf;
        }
        return c48068uDu.KWHzl(str, str3, mutableState3, mutableState4, snapshotStateList2, paramSpecUiModel2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableState<java.lang.String> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SnapshotStateList<wVQ> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48068uDu KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableState<java.lang.String> mutableState, @NotNull MutableState<java.lang.String> mutableState2, @NotNull SnapshotStateList<wVQ> snapshotStateList, ParamSpecUiModel paramSpecUiModel, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableState, "");
        Intrinsics.checkNotNullParameter(mutableState2, "");
        Intrinsics.checkNotNullParameter(snapshotStateList, "");
        return new C48068uDu(str, str2, mutableState, mutableState2, snapshotStateList, paramSpecUiModel, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParamSpecUiModel OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableState<java.lang.String> djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48068uDu)) {
            return false;
        }
        C48068uDu c48068uDu = (C48068uDu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c48068uDu.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48068uDu.EZpvd) && Intrinsics.EZpvd(this.djBIcL, c48068uDu.djBIcL) && Intrinsics.EZpvd(this.KWHzl, c48068uDu.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c48068uDu.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c48068uDu.copydefault) && this.valueOf == c48068uDu.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.djBIcL.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        ParamSpecUiModel paramSpecUiModel = this.copydefault;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (paramSpecUiModel == null ? 0 : paramSpecUiModel.hashCode())) * 31) + java.lang.Boolean.hashCode(this.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SettingRow(id=" + this.OLrzqt + ", label=" + this.EZpvd + ", value=" + this.djBIcL + ", error=" + this.KWHzl + ", chips=" + this.AEQbTJ + ", paramSpec=" + this.copydefault + ", showChips=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.valueOf;
    }

    public C48068uDu(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull MutableState<java.lang.String> mutableState, @NotNull MutableState<java.lang.String> mutableState2, @NotNull SnapshotStateList<wVQ> snapshotStateList, ParamSpecUiModel paramSpecUiModel, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(mutableState, "");
        Intrinsics.checkNotNullParameter(mutableState2, "");
        Intrinsics.checkNotNullParameter(snapshotStateList, "");
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.djBIcL = mutableState;
        this.KWHzl = mutableState2;
        this.AEQbTJ = snapshotStateList;
        this.copydefault = paramSpecUiModel;
        this.valueOf = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000c: INVOKE 
  (wrap:java.util.UUID:0x0004: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:473))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:473)) : (r10v0 java.lang.String))
  (r11v0 java.lang.String)
  (r12v0 androidx.compose.runtime.MutableState)
  (r13v0 androidx.compose.runtime.MutableState)
  (r14v0 androidx.compose.runtime.snapshots.SnapshotStateList)
  (r15v0 com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(java.lang.String, java.lang.String, androidx.compose.runtime.MutableState<java.lang.String>, androidx.compose.runtime.MutableState<java.lang.String>, androidx.compose.runtime.snapshots.SnapshotStateList<o.wVQ>, com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel, boolean):void (m)] (LINE:472) call: o.uDu.<init>(java.lang.String, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.snapshots.SnapshotStateList, com.okinc.tradingbot.impl.aiBot.domain.model.ParamSpecUiModel, boolean):void type: THIS */
    public /* synthetic */ C48068uDu(java.lang.String str, java.lang.String str2, MutableState mutableState, MutableState mutableState2, SnapshotStateList snapshotStateList, ParamSpecUiModel paramSpecUiModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? UUID.randomUUID().toString() : str, str2, mutableState, mutableState2, snapshotStateList, paramSpecUiModel, (i & 64) != 0 ? true : z);
    }
}
