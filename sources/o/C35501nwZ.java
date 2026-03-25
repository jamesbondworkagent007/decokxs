package o;

import com.okinc.im.utils.UiText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35501nwZ {
    public final java.lang.String EZpvd;
    public final UiText OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35501nwZ() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C35501nwZ copy$default(C35501nwZ c35501nwZ, java.lang.String str, java.lang.String str2, UiText uiText, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c35501nwZ.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c35501nwZ.EZpvd;
        }
        if ((i & 4) != 0) {
            uiText = c35501nwZ.OLrzqt;
        }
        return c35501nwZ.OLrzqt(str, str2, uiText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiText OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35501nwZ OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull UiText uiText) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(uiText, "");
        return new C35501nwZ(str, str2, uiText);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35501nwZ)) {
            return false;
        }
        C35501nwZ c35501nwZ = (C35501nwZ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c35501nwZ.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c35501nwZ.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c35501nwZ.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChatSettingsAvatarInfo(avatarUrl=" + this.copydefault + ", nickname=" + this.EZpvd + ", username=" + this.OLrzqt + ")";
    }

    public C35501nwZ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull UiText uiText) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(uiText, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.OLrzqt = uiText;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:com.okinc.im.utils.UiText:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.im.utils.UiText:0x0012: CONSTRUCTOR ("") A[MD:(java.lang.String):void (m), WRAPPED] (LINE:8) call: com.okinc.im.utils.UiText.DynamicString.<init>(java.lang.String):void type: CONSTRUCTOR) : (r4v0 com.okinc.im.utils.UiText))
 A[MD:(java.lang.String, java.lang.String, com.okinc.im.utils.UiText):void (m)] (LINE:5) call: o.nwZ.<init>(java.lang.String, java.lang.String, com.okinc.im.utils.UiText):void type: THIS */
    public /* synthetic */ C35501nwZ(java.lang.String str, java.lang.String str2, UiText uiText, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new UiText.DynamicString("") : uiText);
    }
}
