package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dkH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14372dkH extends C14367dkC implements InterfaceC14373dkI {
    public final java.lang.String OLrzqt = "ok_mpc_backup_wallet";
    public final Gson EZpvd = C14637dpH.getGson$default(null, 1, null);

    /* JADX INFO: renamed from: o.dkH$TaskDescription */
    public static final class TaskDescription extends TypeToken<MPCWalletBackupBean> {
    }

    public final AbstractC58260yxt<java.lang.String> AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return ((InterfaceC13650dTe) C43251rlk.copydefault(InterfaceC13650dTe.class)).KWHzl(str, str2, str3);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return this.OLrzqt + "/" + str;
    }

    public static final ResponseData AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ResponseData) function1.invoke(obj);
    }

    @Override // o.InterfaceC14373dkI
    public AbstractC58260yxt<ResponseData<MPCWalletBackupBean>> copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = AbstractC58260yxt.copydefault(0).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.dkV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14372dkH.copydefault(str, this, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt<ResponseData<MPCWalletBackupBean>> abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.dkW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14372dkH.AhwBna(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final ResponseData copydefault(java.lang.String str, C14372dkH c14372dkH, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        java.lang.String fileContentByFileName$default = C11573cTg.getFileContentByFileName$default(C11573cTg.KWHzl, str, false, 2, null);
        if (fileContentByFileName$default.length() > 0) {
            try {
                return new ResponseData(200, null, null, null, (MPCWalletBackupBean) c14372dkH.EZpvd.fromJson(fileContentByFileName$default, new TaskDescription().getType()), null, 46, null);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
                return new ResponseData(-5002, "MPC wallet get share3 parse error.", null, null, null, null, 44, null);
            }
        }
        return new ResponseData(-5001, "MPC wallet get share3 failed,the server get nothing. mpcId = " + str, null, null, null, null, 44, null);
    }

    public static final java.util.ArrayList AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.ArrayList) function1.invoke(obj);
    }

    @Override // o.InterfaceC14373dkI
    public AbstractC58260yxt<java.util.ArrayList<java.lang.String>> OLrzqt() {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(0);
        final Function1 function1 = new Function1() { // from class: o.dkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14372dkH.OLrzqt((java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.dkQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14372dkH.AYXKKw(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault2, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault2);
    }

    public static final java.util.ArrayList OLrzqt(java.lang.Integer num) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(num, "");
        java.util.List<java.lang.String> listEZpvd = C11573cTg.KWHzl.EZpvd();
        Intrinsics.copydefault(listEZpvd, "");
        return (java.util.ArrayList) listEZpvd;
    }

    @Override // o.InterfaceC14373dkI
    public void OLrzqt(@NotNull final FragmentActivity fragmentActivity, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final Function1<? super C9697baV, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault(fragmentActivity, new Function1() { // from class: o.dkN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14372dkH.EZpvd(this.EZpvd, str, str2, str3, fragmentActivity, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit EZpvd(final C14372dkH c14372dkH, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, FragmentActivity fragmentActivity, final Function1 function1, boolean z) {
        if (z) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXEZpvd = c14372dkH.AEQbTJ(str, str2, str3).EZpvd();
            final Function1 function12 = new Function1() { // from class: o.dkP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14372dkH.copydefault(str, str2, (java.lang.String) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.dkO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C14372dkH.djBIcL(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            AbstractC58185ywX abstractC58185ywXOLrzqt = C58156yvv.OLrzqt(abstractC58185ywXKWHzl, fragmentActivity, Lifecycle.Event.ON_DESTROY);
            final Function1 function13 = new Function1() { // from class: o.dkU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14372dkH.KWHzl(function1, c14372dkH, str3, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dkS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14372dkH.valueOf(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dkT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14372dkH.OLrzqt(function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dkR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C14372dkH.AkhnZx(function14, obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC60096zvd djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        return ((InterfaceC13650dTe) C43251rlk.copydefault(InterfaceC13650dTe.class)).AEQbTJ(str3, str, str2);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, C14372dkH c14372dkH, java.lang.String str, java.lang.Integer num) {
        function1.invoke(new C9697baV(num == null || num.intValue() != -100, true, null, null, 12, null));
        c14372dkH.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        function1.invoke(new C9697baV(false, true, C11572cTf.copydefault.EZpvd(message), message));
        C10856bwO.EZpvd("NotificationServiceExtension", new OKWException("MPC wallet upload share3 exception.", th));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC14373dkI
    public AbstractC58260yxt<java.lang.String> AEQbTJ(@NotNull MPCWalletShareBean mPCWalletShareBean, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(mPCWalletShareBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        final MPCWalletBackupBean mPCWalletBackupBeanCopydefault = copydefault(mPCWalletShareBean, str, str2, str3, str4);
        AbstractC58260yxt abstractC58260yxtKWHzl = AbstractC58260yxt.copydefault(0).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.dla
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14372dkH.AEQbTJ(this.EZpvd, mPCWalletBackupBeanCopydefault, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.dkX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14372dkH.fetchVPNInfo(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.String fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String AEQbTJ(C14372dkH c14372dkH, MPCWalletBackupBean mPCWalletBackupBean, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        java.lang.String strEZpvd = c14372dkH.EZpvd(mPCWalletBackupBean.getUId());
        C11573cTg c11573cTg = C11573cTg.KWHzl;
        java.lang.String mpcId = mPCWalletBackupBean.getMpcId();
        java.lang.String json = c14372dkH.EZpvd.toJson(mPCWalletBackupBean);
        Intrinsics.checkNotNullExpressionValue(json, "");
        if (C11573cTg.saveNewFile$default(c11573cTg, mpcId, strEZpvd, json, false, 8, null) == null) {
            C10856bwO.EZpvd("NotificationServiceExtension", new OKWException("MPC wallet upload share3 failed. Maybe the google drive server is not enable.", null));
            return "";
        }
        return mPCWalletBackupBean.getMpcId();
    }

    public final MPCWalletBackupBean copydefault(MPCWalletShareBean mPCWalletShareBean, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        MPCWalletBackupBean mPCWalletBackupBean = new MPCWalletBackupBean(null, null, null, null, null, null, null, null, 255, null);
        mPCWalletBackupBean.setCreateTime(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        xXX xxx = xXX.EZpvd;
        java.lang.String strEZpvd = xxx.EZpvd(str4);
        mPCWalletBackupBean.setPasswordHash(strEZpvd);
        mPCWalletBackupBean.setAccountName(str3);
        mPCWalletBackupBean.setUId(str2);
        mPCWalletBackupBean.setMpcId(str);
        mPCWalletBackupBean.setVersion(C32979mnm.EZpvd.EZpvd());
        java.lang.String json = this.EZpvd.toJson(mPCWalletShareBean);
        Intrinsics.checkNotNullExpressionValue(json, "");
        mPCWalletBackupBean.setData(xxx.AEQbTJ(str4, strEZpvd, json, false));
        return mPCWalletBackupBean;
    }

    @Override // o.InterfaceC14373dkI
    public void copydefault(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ((InterfaceC13650dTe) C43251rlk.copydefault(InterfaceC13650dTe.class)).OLrzqt(str, fragmentManager, abstractActivityC33041mov, function2);
    }

    @Override // o.InterfaceC14373dkI
    public void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function2, "");
        ((InterfaceC13650dTe) C43251rlk.copydefault(InterfaceC13650dTe.class)).EZpvd(str, str2, fragmentManager, abstractActivityC33041mov, function2);
    }
}
