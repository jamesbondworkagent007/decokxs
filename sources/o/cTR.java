package o;

import androidx.lifecycle.Lifecycle;
import com.google.gson.Gson;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletBackupBean;
import com.okinc.business.defi.biz.drivers.bean.MPCWalletShareBean;
import com.okinc.business.defi.biz.model.wallet.MpcWalletDecodeInfo;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.SyncShareRequestBody;
import com.okinc.business.defi.biz.net.bean.SyncShareResponse;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.response.ResponseData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cTR extends AbstractC43215rlA implements InterfaceC13650dTe {
    public final java.lang.String EZpvd = "ok_mpc_backup_wallet";

    @Override // o.InterfaceC13650dTe
    public AbstractC58260yxt<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(str, true);
        final cTQ ctq = new cTQ(this, str2, str3, objectRef);
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.cTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTR.fetchVPNInfo(ctq, obj);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.cTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.KWHzl(objectRef, (com.google.api.services.drive.model.File) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt2.copydefault((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO() { // from class: o.cTV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTR.DbNXlk(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final InterfaceC58261yxu fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    public static final InterfaceC58261yxu copydefault(cTR ctr, java.lang.String str, java.lang.String str2, Ref.ObjectRef objectRef, AbstractC12782ctV abstractC12782ctV) throws java.lang.Exception {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (abstractC12782ctV.QwvEab() != WalletType.MPCWallet) {
            throw new java.lang.Exception(" unsupported wallet type");
        }
        final MPCWalletBackupBean mPCWalletBackupBeanCopydefault = ctr.copydefault(abstractC12782ctV, str, str2);
        final java.lang.String strKWHzl = ctr.KWHzl(mPCWalletBackupBeanCopydefault.getUId());
        objectRef.element = mPCWalletBackupBeanCopydefault.getMpcId();
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(0).OLrzqt(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.cUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.OLrzqt(mPCWalletBackupBeanCopydefault, strKWHzl, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.cTS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTR.AhwBna(function1, obj);
            }
        });
    }

    public static final com.google.api.services.drive.model.File AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (com.google.api.services.drive.model.File) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cTg.saveNewFile$default(o.cTg, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):com.google.api.services.drive.model.File */
    public static final com.google.api.services.drive.model.File OLrzqt(MPCWalletBackupBean mPCWalletBackupBean, java.lang.String str, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        C11573cTg c11573cTg = C11573cTg.KWHzl;
        java.lang.String mpcId = mPCWalletBackupBean.getMpcId();
        java.lang.String json = new Gson().toJson(mPCWalletBackupBean);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return C11573cTg.saveNewFile$default(c11573cTg, mpcId, str, json, false, 8, null);
    }

    public static final java.lang.String DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String KWHzl(Ref.ObjectRef objectRef, com.google.api.services.drive.model.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return (java.lang.String) objectRef.element;
    }

    public static final InterfaceC60096zvd isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    @Override // o.InterfaceC13650dTe
    public AbstractC58185ywX<java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58260yxt.copydefault(str).EZpvd();
        final Function1 function1 = new Function1() { // from class: o.cUe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.AEQbTJ((java.lang.String) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.cUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTR.isConnected(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.cUc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.EZpvd(str2, str3, (SyncShareResponse) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.cUa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return cTR.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl2, "");
        return C33024moe.KWHzl(abstractC58185ywXKWHzl2);
    }

    public static final InterfaceC60096zvd AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("uploadShare3AndUpdateData", "MPC wallet upload share3 to server mpcId = " + str + JwtUtilsKt.JWT_DELIMITER);
        return C32962mnV.unwrapResponseData$default(new C13934dbu().copydefault(new SyncShareRequestBody(str, "", 1, 1, 1, (java.lang.String) null, 1, 32, (DefaultConstructorMarker) null)), (Function1) null, 1, (java.lang.Object) null);
    }

    public static final InterfaceC60096zvd values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(java.lang.String str, java.lang.String str2, SyncShareResponse syncShareResponse) {
        Intrinsics.checkNotNullParameter(syncShareResponse, "");
        if (syncShareResponse.getResultCode() == 0) {
            pUU.copydefault("uploadShare3AndUpdateData", "MPC wallet upload share3 syncShareBackupResult success.");
            return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).AEQbTJ(str, str2, 1).EZpvd();
        }
        pUU.copydefault("uploadShare3AndUpdateData", "MPC wallet upload share3 syncShareBackupResult failed resultCode = " + syncShareResponse.getResultCode() + JwtUtilsKt.JWT_DELIMITER);
        return AbstractC58260yxt.copydefault(-100).EZpvd();
    }

    public static final Unit KWHzl(cTR ctr, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, AbstractActivityC33041mov abstractActivityC33041mov, Function2 function2, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        ctr.EZpvd(str, str2, fragmentManager, abstractActivityC33041mov, function2);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC13650dTe
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function2, "");
        new C14461dlr(fragmentManager, "mpcGoogleBackup", new Function1() { // from class: o.cTX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.KWHzl(this.copydefault, str, fragmentManager, abstractActivityC33041mov, function2, (java.lang.String) obj);
            }
        }, null, null, false, 56, null).EZpvd();
    }

    @Override // o.InterfaceC13650dTe
    public void EZpvd(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(function2, "");
        InterfaceC14373dkI interfaceC14373dkIEZpvd = C14392dkb.AEQbTJ.EZpvd(abstractActivityC33041mov, 1);
        if (interfaceC14373dkIEZpvd == null) {
            return;
        }
        abstractActivityC33041mov.showLoading();
        AbstractC58260yxt abstractC58260yxtOLrzqt = C58156yvv.AEQbTJ(interfaceC14373dkIEZpvd.copydefault(str), abstractActivityC33041mov, Lifecycle.Event.ON_DESTROY).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.cTU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.AEQbTJ(abstractActivityC33041mov, fragmentManager, this, str2, str, function2, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cTT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cTR.djBIcL(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.cTZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cTR.copydefault(abstractActivityC33041mov, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cUb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cTR.AYXKKw(function12, obj);
            }
        });
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, androidx.fragment.app.FragmentManager fragmentManager, cTR ctr, java.lang.String str, java.lang.String str2, Function2 function2, ResponseData responseData) {
        if (responseData.getCode() == 200) {
            C18833fpq c18833fpq = new C18833fpq(abstractActivityC33041mov);
            c18833fpq.copydefault(str);
            c18833fpq.EZpvd(str2);
            c18833fpq.copydefault((Function2<? super MPCWalletShareBean, ? super java.lang.String, Unit>) function2);
            c18833fpq.OLrzqt((MPCWalletBackupBean) responseData.getData());
            new C18745foG().AEQbTJ(fragmentManager, c18833fpq.OLrzqt(2));
        } else {
            pUU.copydefault("getCloudDriveShare3", "error message :" + responseData.getCode() + " " + responseData.getMsg());
            ctr.KWHzl(abstractActivityC33041mov);
        }
        abstractActivityC33041mov.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractActivityC33041mov abstractActivityC33041mov, java.lang.Throwable th) {
        abstractActivityC33041mov.dismissLoading();
        pUU.copydefault("getCloudDriveShare3", "error message :" + th.getMessage());
        C11572cTf c11572cTf = C11572cTf.copydefault;
        java.lang.String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        C55326xho.toast$default(c11572cTf.EZpvd(message), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final MPCWalletBackupBean copydefault(AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2) throws OKWException {
        MPCWalletBackupBean mPCWalletBackupBean = new MPCWalletBackupBean(null, null, null, null, null, null, null, null, 255, null);
        mPCWalletBackupBean.setCreateTime(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        xXX xxx = xXX.EZpvd;
        java.lang.String strEZpvd = xxx.EZpvd(str2);
        java.lang.String strEZpvd2 = xxx.EZpvd(str);
        mPCWalletBackupBean.setPasswordHash(strEZpvd);
        final MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
        if (mpcWalletEncodeInfoQSBOWP != null) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP2);
            MpcWalletDecodeInfo mpcWalletDecodeInfoOLrzqt = C10964byQ.OLrzqt(str, strEZpvd2, mpcWalletEncodeInfoQSBOWP2);
            mPCWalletBackupBean.setAccountName(mpcWalletEncodeInfoQSBOWP.getAccountName());
            mPCWalletBackupBean.setUId(mpcWalletEncodeInfoQSBOWP.getUid());
            mPCWalletBackupBean.setMpcId(mpcWalletEncodeInfoQSBOWP.getMpcId());
            mPCWalletBackupBean.setVersion(C32979mnm.EZpvd.EZpvd());
            MPCWalletShareBean mPCWalletShareBean = new MPCWalletShareBean(null, null, null, 7, null);
            mPCWalletShareBean.setEcdsaP3(mpcWalletDecodeInfoOLrzqt.getEcdsaP3());
            mPCWalletShareBean.setEd25519Share3(mpcWalletDecodeInfoOLrzqt.getEd25519Share3());
            mPCWalletShareBean.setEcdsaShare3(mpcWalletDecodeInfoOLrzqt.getEcdsaShare3());
            int length = mPCWalletShareBean.getEcdsaShare3().length();
            int length2 = mPCWalletShareBean.getEd25519Share3().length();
            int length3 = mPCWalletShareBean.getEcdsaP3().length();
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
            Intrinsics.copydefault(mpcWalletEncodeInfoQSBOWP3);
            final java.lang.String str3 = "google ecdsaShare3 length = " + length + " ed25519Share3 length = " + length2 + "  ecdsaP3 length = " + length3 + " wallet.mpcShareEncodeInfo.encryptShareKey length = " + mpcWalletEncodeInfoQSBOWP3.getEncryptShareKey().length() + " ";
            if (mpcWalletDecodeInfoOLrzqt.getEcdsaP3().length() == 0 || mpcWalletDecodeInfoOLrzqt.getEd25519Share3().length() == 0 || mpcWalletDecodeInfoOLrzqt.getEcdsaShare3().length() == 0) {
                C32866mlf.onEvent$default("mpc_wallet_upload_share_data_empty", (TrackChannel[]) null, new Function1() { // from class: o.cUh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return cTR.EZpvd(mpcWalletEncodeInfoQSBOWP, str3, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                throw new OKWException("upload share3 is empty,please check or feedback", null);
            }
            pUU.copydefault("createCloudBackupBean", str3);
            java.lang.String json = new Gson().toJson(mPCWalletShareBean);
            Intrinsics.checkNotNullExpressionValue(json, "");
            mPCWalletBackupBean.setData(xxx.AEQbTJ(str2, strEZpvd, json, false));
        }
        return mPCWalletBackupBean;
    }

    public static final Unit EZpvd(MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("mpcId", mpcWalletEncodeInfo.getMpcId(), false));
        eventParamsList.add(new EventParam("dataLength", str, false));
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        return this.EZpvd + "/" + str;
    }

    public final void KWHzl(AbstractActivityC33041mov abstractActivityC33041mov) {
        InterfaceC14334djW interfaceC14334djWOLrzqt = C14392dkb.AEQbTJ.OLrzqt(abstractActivityC33041mov, 1);
        if (interfaceC14334djWOLrzqt != null) {
            interfaceC14334djWOLrzqt.KWHzl(abstractActivityC33041mov);
        }
    }
}
