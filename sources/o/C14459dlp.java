package o;

import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dlp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14459dlp implements InterfaceC14457dln {
    public final android.app.Activity AEQbTJ;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC14457dln
    public boolean OLrzqt() {
        return this.copydefault;
    }

    public C14459dlp(@NotNull android.app.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ = activity;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.app.Activity)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
 A[MD:(android.app.Activity, boolean):void (m)] (LINE:12) call: o.dlp.<init>(android.app.Activity, boolean):void type: THIS */
    public /* synthetic */ C14459dlp(android.app.Activity activity, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i & 2) != 0 ? true : z);
    }

    @Override // o.InterfaceC14457dln
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        dZK.AEQbTJ.AEQbTJ(this.AEQbTJ, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        this.AEQbTJ.overridePendingTransition(0, 0);
    }
}
