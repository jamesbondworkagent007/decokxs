package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43264rlx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43300rmg extends AbstractC43215rlA implements InterfaceC43264rlx {
    public final java.lang.String EZpvd;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43300rmg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43264rlx
    public void KWHzl(boolean z) {
        this.copydefault = z;
    }

    public C43300rmg(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:14) call: o.rmg.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C43300rmg(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // o.InterfaceC43264rlx
    public int AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.KWHzl(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.OLrzqt(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.KWHzl(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public java.lang.String EZpvd(java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.EZpvd(this, th);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.OLrzqt(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.copydefault(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        return InterfaceC43264rlx.Activity.AEQbTJ(this, str, str2, th);
    }

    @Override // o.InterfaceC43264rlx
    public int copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        return InterfaceC43264rlx.Activity.AEQbTJ(this, str, str2);
    }

    @Override // o.InterfaceC43264rlx
    public int KWHzl(int i, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (this.copydefault) {
            return android.util.Log.println(i, OLrzqt(str), str2);
        }
        return 0;
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String str2 = this.EZpvd;
        if (str2 == null) {
            return str;
        }
        java.lang.String str3 = "[" + str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str + "]";
        return str3 == null ? str : str3;
    }
}
