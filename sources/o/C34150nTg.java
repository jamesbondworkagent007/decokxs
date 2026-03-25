package o;

import com.okinc.im.imui.group.management.registry.ProfileSettingKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nTg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34150nTg {
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.util.List<ProfileSettingKeys> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.nTg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C34150nTg copy$default(C34150nTg c34150nTg, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c34150nTg.copydefault;
        }
        if ((i & 2) != 0) {
            z = c34150nTg.KWHzl;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            z2 = c34150nTg.OLrzqt;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            z3 = c34150nTg.EZpvd;
        }
        boolean z7 = z3;
        if ((i & 16) != 0) {
            z4 = c34150nTg.AEQbTJ;
        }
        return c34150nTg.KWHzl(list, z5, z6, z7, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34150nTg KWHzl(@NotNull java.util.List<? extends ProfileSettingKeys> list, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C34150nTg(list, z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ProfileSettingKeys> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34150nTg)) {
            return false;
        }
        C34150nTg c34150nTg = (C34150nTg) obj;
        return Intrinsics.EZpvd(this.copydefault, c34150nTg.copydefault) && this.KWHzl == c34150nTg.KWHzl && this.OLrzqt == c34150nTg.OLrzqt && this.EZpvd == c34150nTg.EZpvd && this.AEQbTJ == c34150nTg.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupProfileSettingListDisplayModel(settingsList=" + this.copydefault + ", isAllowUpdateGroupSetting=" + this.KWHzl + ", isAllowUpdateGroupProfile=" + this.OLrzqt + ", isDoNotDisturb=" + this.EZpvd + ", isPinToTop=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.im.imui.group.management.registry.ProfileSettingKeys> */
    /* JADX WARN: Multi-variable type inference failed */
    public C34150nTg(@NotNull java.util.List<? extends ProfileSettingKeys> list, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.EZpvd = z3;
        this.AEQbTJ = z4;
    }
}
