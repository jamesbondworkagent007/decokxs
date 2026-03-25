package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18837fpu implements InterfaceC18801fpK {
    public final Gson AEQbTJ;
    public java.lang.String AhwBna;
    public final AbstractActivityC33041mov EZpvd;
    public MPCWalletBackupBean KWHzl;
    public Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> OLrzqt;
    public int copydefault;
    public java.lang.String djBIcL;

    /* JADX INFO: renamed from: o.fpu$Application */
    public static final class Application extends TypeToken<MPCWalletShareBean> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2) {
        this.OLrzqt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(MPCWalletBackupBean mPCWalletBackupBean) {
        this.KWHzl = mPCWalletBackupBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    public C18837fpu(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.EZpvd = abstractActivityC33041mov;
        this.AhwBna = "";
        this.djBIcL = "";
        this.copydefault = 1;
        this.AEQbTJ = C14637dpH.getGson$default(null, 1, null);
    }

    @Override // o.InterfaceC18801fpK
    public void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.KWHzl == null) {
            function1.invoke(java.lang.Boolean.TRUE);
            copydefault();
            return;
        }
        java.lang.String strEZpvd = xXX.EZpvd.EZpvd(str);
        MPCWalletBackupBean mPCWalletBackupBean = this.KWHzl;
        Intrinsics.copydefault(mPCWalletBackupBean);
        if (Intrinsics.EZpvd((java.lang.Object) mPCWalletBackupBean.getPasswordHash(), (java.lang.Object) strEZpvd)) {
            xXW xxw = xXW.OLrzqt;
            MPCWalletBackupBean mPCWalletBackupBean2 = this.KWHzl;
            Intrinsics.copydefault(mPCWalletBackupBean2);
            java.lang.String strAEQbTJ = xxw.AEQbTJ(str, strEZpvd, mPCWalletBackupBean2.getData(), false);
            try {
                MPCWalletShareBean mPCWalletShareBean = (MPCWalletShareBean) this.AEQbTJ.fromJson(strAEQbTJ, new Application().getType());
                if (mPCWalletShareBean.getEcdsaShare3().length() > 0 && mPCWalletShareBean.getEd25519Share3().length() > 0) {
                    MPCWalletBackupBean mPCWalletBackupBean3 = this.KWHzl;
                    Intrinsics.copydefault(mPCWalletBackupBean3);
                    mPCWalletBackupBean3.setBackupTypeBean(mPCWalletShareBean);
                }
                MPCWalletBackupBean mPCWalletBackupBean4 = this.KWHzl;
                Intrinsics.copydefault(mPCWalletBackupBean4);
                pUU.copydefault("EscapeMpcVerifyCloudPasswordStrategy", "mpcCloudBackupBean!!.data length = " + mPCWalletBackupBean4.getData().length() + " jsonString length = " + strAEQbTJ.length() + " ecdsaShare3 length = " + mPCWalletShareBean.getEcdsaShare3().length() + " ed25519Share3 length = " + mPCWalletShareBean.getEd25519Share3().length() + "  ecdsaP3 length = " + mPCWalletShareBean.getEcdsaP3().length() + " ");
                function1.invoke(java.lang.Boolean.TRUE);
                Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2 = this.OLrzqt;
                if (function2 != null) {
                    MPCWalletBackupBean mPCWalletBackupBean5 = this.KWHzl;
                    Intrinsics.copydefault(mPCWalletBackupBean5);
                    MPCWalletShareBean backupTypeBean = mPCWalletBackupBean5.getBackupTypeBean();
                    Intrinsics.copydefault(backupTypeBean);
                    function2.invoke(backupTypeBean, this.djBIcL);
                    Unit unit = Unit.INSTANCE;
                    return;
                }
                return;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                pUU.copydefault("EscapeMpcVerifyCloudPasswordStrategy", " try  error message :" + e.getMessage());
                function1.invoke(java.lang.Boolean.TRUE);
                copydefault();
                Unit unit2 = Unit.INSTANCE;
                return;
            }
        }
        function1.invoke(java.lang.Boolean.FALSE);
    }

    public final void copydefault() {
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(this.EZpvd, this.copydefault);
        if (interfaceC14334djWOLrzqt != null) {
            interfaceC14334djWOLrzqt.KWHzl(this.EZpvd);
        }
    }
}
