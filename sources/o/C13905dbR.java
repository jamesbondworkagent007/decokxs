package o;

import com.okinc.business.defi.biz.setting.SettingType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C13905dbR {
    public final boolean AEQbTJ;
    public android.text.SpannableString AYXKKw;
    public java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public SettingType copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingType KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.SpannableString copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    public C13905dbR(@NotNull SettingType settingType, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2, android.text.SpannableString spannableString, @androidx.annotation.DrawableRes java.lang.Integer num, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(settingType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = settingType;
        this.gEmmrt = str;
        this.AEQbTJ = z;
        this.EZpvd = str2;
        this.AYXKKw = spannableString;
        this.OLrzqt = num;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (r10v0 com.okinc.business.defi.biz.setting.SettingType)
  (r11v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:android.text.SpannableString:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.text.SpannableString) : (r14v0 android.text.SpannableString))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
 A[MD:(com.okinc.business.defi.biz.setting.SettingType, java.lang.String, boolean, java.lang.String, android.text.SpannableString, java.lang.Integer, java.lang.String):void (m)] (LINE:6) call: o.dbR.<init>(com.okinc.business.defi.biz.setting.SettingType, java.lang.String, boolean, java.lang.String, android.text.SpannableString, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ C13905dbR(SettingType settingType, java.lang.String str, boolean z, java.lang.String str2, android.text.SpannableString spannableString, java.lang.Integer num, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(settingType, str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : spannableString, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str3);
    }
}
