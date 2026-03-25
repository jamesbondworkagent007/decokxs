package o;

import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18833fpq {
    public HDWalletCloudBackupBean AEQbTJ;
    public MPCWalletBackupBean AhwBna;
    public Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> EZpvd;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> KWHzl;
    public int OLrzqt;
    public final AbstractActivityC33041mov copydefault;
    public java.lang.String djBIcL;
    public boolean gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        this.AEQbTJ = hDWalletCloudBackupBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        this.KWHzl = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(MPCWalletBackupBean mPCWalletBackupBean) {
        this.AhwBna = mPCWalletBackupBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2) {
        this.EZpvd = function2;
    }

    public C18833fpq(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.copydefault = abstractActivityC33041mov;
        this.valueOf = "";
        this.djBIcL = "";
        this.gEmmrt = true;
        this.OLrzqt = 1;
    }

    public final InterfaceC18801fpK OLrzqt(int i) {
        if (i == 0) {
            C18799fpI c18799fpI = new C18799fpI(this.copydefault);
            c18799fpI.copydefault(this.AEQbTJ);
            c18799fpI.KWHzl(this.KWHzl);
            c18799fpI.OLrzqt(java.lang.Integer.valueOf(this.OLrzqt));
            return c18799fpI;
        }
        if (i == 1) {
            C18794fpD c18794fpD = new C18794fpD(this.copydefault);
            c18794fpD.AEQbTJ(this.gEmmrt);
            c18794fpD.copydefault(this.djBIcL);
            c18794fpD.AEQbTJ(this.OLrzqt);
            c18794fpD.OLrzqt(this.AhwBna);
            c18794fpD.OLrzqt(this.KWHzl);
            return c18794fpD;
        }
        if (i == 2) {
            C18837fpu c18837fpu = new C18837fpu(this.copydefault);
            c18837fpu.KWHzl(this.valueOf);
            c18837fpu.KWHzl(this.OLrzqt);
            c18837fpu.OLrzqt(this.djBIcL);
            c18837fpu.EZpvd(this.AhwBna);
            c18837fpu.AEQbTJ(this.EZpvd);
            return c18837fpu;
        }
        C18799fpI c18799fpI2 = new C18799fpI(this.copydefault);
        c18799fpI2.copydefault(this.AEQbTJ);
        c18799fpI2.KWHzl(this.KWHzl);
        return c18799fpI2;
    }
}
