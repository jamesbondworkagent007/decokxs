package o;

import com.okinc.im.imui.privacy.SettingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37199opN {
    public SettingType AEQbTJ;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public android.text.SpannableString OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingType OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannableString copydefault() {
        return this.OLrzqt;
    }

    public C37199opN(@NotNull SettingType settingType, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, android.text.SpannableString spannableString) {
        Intrinsics.checkNotNullParameter(settingType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = settingType;
        this.EZpvd = str;
        this.KWHzl = z;
        this.copydefault = str2;
        this.OLrzqt = spannableString;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r7v0 com.okinc.im.imui.privacy.SettingType)
  (r8v0 java.lang.String)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r9v0 boolean))
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:android.text.SpannableString:?: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.text.SpannableString) : (r11v0 android.text.SpannableString))
 A[MD:(com.okinc.im.imui.privacy.SettingType, java.lang.String, boolean, java.lang.String, android.text.SpannableString):void (m)] (LINE:5) call: o.opN.<init>(com.okinc.im.imui.privacy.SettingType, java.lang.String, boolean, java.lang.String, android.text.SpannableString):void type: THIS */
    public /* synthetic */ C37199opN(SettingType settingType, java.lang.String str, boolean z, java.lang.String str2, android.text.SpannableString spannableString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(settingType, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : spannableString);
    }
}
