package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18794fpD implements InterfaceC18801fpK {
    public int AEQbTJ;
    public final AbstractActivityC33041mov EZpvd;
    public final Gson KWHzl;
    public boolean OLrzqt;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> copydefault;
    public java.lang.String djBIcL;
    public MPCWalletBackupBean gEmmrt;

    /* JADX INFO: renamed from: o.fpD$TaskDescription */
    public static final class TaskDescription extends TypeToken<MPCWalletShareBean> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(MPCWalletBackupBean mPCWalletBackupBean) {
        this.gEmmrt = mPCWalletBackupBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        this.copydefault = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    public C18794fpD(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        this.EZpvd = abstractActivityC33041mov;
        this.djBIcL = "";
        this.OLrzqt = true;
        this.AEQbTJ = 1;
        this.KWHzl = C14637dpH.getGson$default(null, 1, null);
    }

    @Override // o.InterfaceC18801fpK
    public void EZpvd(@NotNull java.lang.String str, @NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (this.gEmmrt == null) {
            function1.invoke(java.lang.Boolean.TRUE);
            EZpvd();
            pUU.copydefault("RestoreMpcVerifyCloudPasswordStrategy", "error message : mpcCloudBackupBean == null");
            return;
        }
        java.lang.String strEZpvd = xXX.EZpvd.EZpvd(str);
        MPCWalletBackupBean mPCWalletBackupBean = this.gEmmrt;
        Intrinsics.copydefault(mPCWalletBackupBean);
        if (Intrinsics.EZpvd((java.lang.Object) mPCWalletBackupBean.getPasswordHash(), (java.lang.Object) strEZpvd)) {
            xXW xxw = xXW.OLrzqt;
            MPCWalletBackupBean mPCWalletBackupBean2 = this.gEmmrt;
            Intrinsics.copydefault(mPCWalletBackupBean2);
            java.lang.String strAEQbTJ = xxw.AEQbTJ(str, strEZpvd, mPCWalletBackupBean2.getData(), false);
            try {
                MPCWalletShareBean mPCWalletShareBean = (MPCWalletShareBean) this.KWHzl.fromJson(strAEQbTJ, new TaskDescription().getType());
                if (mPCWalletShareBean.getEcdsaShare3().length() > 0 && mPCWalletShareBean.getEd25519Share3().length() > 0) {
                    MPCWalletBackupBean mPCWalletBackupBean3 = this.gEmmrt;
                    Intrinsics.copydefault(mPCWalletBackupBean3);
                    mPCWalletBackupBean3.setBackupTypeBean(mPCWalletShareBean);
                }
                MPCWalletBackupBean mPCWalletBackupBean4 = this.gEmmrt;
                Intrinsics.copydefault(mPCWalletBackupBean4);
                pUU.copydefault("RestoreMpcVerifyCloudPasswordStrategy", "mpcCloudBackupBean!!.data length = " + mPCWalletBackupBean4.getData().length() + " jsonString length = " + strAEQbTJ.length() + " ecdsaShare3 length = " + mPCWalletShareBean.getEcdsaShare3().length() + " ed25519Share3 length = " + mPCWalletShareBean.getEd25519Share3().length() + "  ecdsaP3 length = " + mPCWalletShareBean.getEcdsaP3().length() + " ");
                this.EZpvd.dismissLoading();
                function1.invoke(java.lang.Boolean.TRUE);
                MPCWalletBackupBean mPCWalletBackupBean5 = this.gEmmrt;
                Intrinsics.copydefault(mPCWalletBackupBean5);
                AEQbTJ(mPCWalletBackupBean5, str);
                return;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                pUU.copydefault("RestoreMpcVerifyCloudPasswordStrategy", " try  error message :" + e.getMessage());
                function1.invoke(java.lang.Boolean.TRUE);
                EZpvd();
                return;
            }
        }
        function1.invoke(java.lang.Boolean.FALSE);
    }

    public final void AEQbTJ(MPCWalletBackupBean mPCWalletBackupBean, final java.lang.String str) {
        java.lang.String ecdsaShare3;
        java.lang.String ed25519Share3;
        int i = this.OLrzqt ? 3 : 4;
        fFW ffw = new fFW();
        AbstractActivityC33041mov abstractActivityC33041mov = this.EZpvd;
        int i2 = this.AEQbTJ;
        java.lang.String mpcId = mPCWalletBackupBean.getMpcId();
        MPCWalletShareBean backupTypeBean = mPCWalletBackupBean.getBackupTypeBean();
        if (backupTypeBean == null || (ecdsaShare3 = backupTypeBean.getEcdsaShare3()) == null) {
            ecdsaShare3 = "";
        }
        MPCWalletShareBean backupTypeBean2 = mPCWalletBackupBean.getBackupTypeBean();
        ffw.EZpvd(abstractActivityC33041mov, i, i2, mpcId, ecdsaShare3, (backupTypeBean2 == null || (ed25519Share3 = backupTypeBean2.getEd25519Share3()) == null) ? "" : ed25519Share3, str, this.djBIcL, new Function0() { // from class: o.fpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18794fpD.EZpvd(this.KWHzl, str);
            }
        }, new Function1() { // from class: o.fpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18794fpD.EZpvd(this.copydefault, (AbstractC12782ctV) obj);
            }
        });
    }

    public static final Unit EZpvd(C18794fpD c18794fpD, java.lang.String str) {
        Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2 = c18794fpD.copydefault;
        if (function2 != null) {
            function2.invoke(java.lang.Boolean.TRUE, str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C18794fpD c18794fpD, AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV != null && c18794fpD.OLrzqt) {
            dZK.AEQbTJ.AEQbTJ(c18794fpD.EZpvd, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        } else if (!c18794fpD.OLrzqt) {
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).aS_().invoke(java.lang.Boolean.TRUE);
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).AEQbTJ(new Function1() { // from class: o.fpB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18794fpD.KWHzl(((java.lang.Boolean) obj).booleanValue());
                }
            });
            ((MpcWalletService) C43251rlk.copydefault(MpcWalletService.class)).KWHzl(new Function1() { // from class: o.fpz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18794fpD.copydefault(((java.lang.Boolean) obj).booleanValue());
                }
            });
            c18794fpD.EZpvd.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    private final void EZpvd() {
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(this.EZpvd, this.AEQbTJ);
        if (interfaceC14334djWOLrzqt != null) {
            interfaceC14334djWOLrzqt.KWHzl(this.EZpvd);
        }
    }
}
