package o;

import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet.utils.CheckUtils$checkPublicRules$1;
import com.okinc.planet.utils.PublishPreCheck;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C46388tSm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tTM {
    public static final tTM EZpvd = new tTM();

    private tTM() {
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super PublishPreCheck> continuation) throws java.lang.Throwable {
        CheckUtils$checkPublicRules$1 checkUtils$checkPublicRules$1;
        InterfaceC37981pHw interfaceC37981pHw;
        android.app.Activity activity;
        KycInfoListBean kycInfoListBean;
        android.app.Activity activity2;
        android.app.Activity activity3;
        PublishPermissionResp publishPermissionResp;
        if (continuation instanceof CheckUtils$checkPublicRules$1) {
            checkUtils$checkPublicRules$1 = (CheckUtils$checkPublicRules$1) continuation;
            int i = checkUtils$checkPublicRules$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkUtils$checkPublicRules$1.label = i - Integer.MIN_VALUE;
            } else {
                checkUtils$checkPublicRules$1 = new CheckUtils$checkPublicRules$1(this, continuation);
            }
        }
        java.lang.Object objFirst = checkUtils$checkPublicRules$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkUtils$checkPublicRules$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFirst);
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            interfaceC37981pHw = (InterfaceC37981pHw) C43251rlk.copydefault(InterfaceC37981pHw.class);
            Flow<KycInfoListBean> flowEZpvd = interfaceC37981pHw.EZpvd();
            checkUtils$checkPublicRules$1.L$0 = activityAEQbTJ;
            checkUtils$checkPublicRules$1.L$1 = interfaceC37981pHw;
            checkUtils$checkPublicRules$1.label = 1;
            java.lang.Object objFirst2 = FlowKt.first(flowEZpvd, checkUtils$checkPublicRules$1);
            if (objFirst2 == objCopydefault) {
                return objCopydefault;
            }
            activity = activityAEQbTJ;
            objFirst = objFirst2;
        } else if (i2 == 1) {
            interfaceC37981pHw = (InterfaceC37981pHw) checkUtils$checkPublicRules$1.L$1;
            activity = (android.app.Activity) checkUtils$checkPublicRules$1.L$0;
            C56391yDq.AEQbTJ(objFirst);
        } else if (i2 == 2) {
            activity2 = (android.app.Activity) checkUtils$checkPublicRules$1.L$0;
            C56391yDq.AEQbTJ(objFirst);
            kycInfoListBean = (KycInfoListBean) objFirst;
            if (activity2 instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) activity2).dismissLoading();
            }
            Unit unit = Unit.INSTANCE;
            if (kycInfoListBean == null) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                activity3 = (android.app.Activity) checkUtils$checkPublicRules$1.L$0;
                C56391yDq.AEQbTJ(objFirst);
                publishPermissionResp = (PublishPermissionResp) ((kotlin.Pair) objFirst).component1();
                if (activity3 instanceof AbstractActivityC33041mov) {
                    ((AbstractActivityC33041mov) activity3).dismissLoading();
                }
                if (publishPermissionResp == null) {
                    if (Intrinsics.EZpvd(publishPermissionResp.getPermission(), C56443yFo.KWHzl(true))) {
                        if (Intrinsics.EZpvd(publishPermissionResp.getAgreeTnc(), C56443yFo.KWHzl(true))) {
                            if (C46388tSm.Companion.KWHzl().valueOf()) {
                                return PublishPreCheck.CHECK_SUCCESS;
                            }
                            return PublishPreCheck.NEED_MODIFY_PROFILE;
                        }
                        return PublishPreCheck.CHECK_SHOW_AGREE_TNC;
                    }
                    return PublishPreCheck.USER_MUTED;
                }
                return PublishPreCheck.CHECK_NET_ERROR;
            }
            KycInfoListBean kycInfoListBean2 = (KycInfoListBean) checkUtils$checkPublicRules$1.L$1;
            android.app.Activity activity4 = (android.app.Activity) checkUtils$checkPublicRules$1.L$0;
            C56391yDq.AEQbTJ(objFirst);
            kycInfoListBean = kycInfoListBean2;
            activity2 = activity4;
            if (kycInfoListBean == null) {
                if (kycInfoListBean.getLevel() < 2) {
                    return PublishPreCheck.NOT_DO_KYC;
                }
                C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
                PublishPermissionResp publishPermissionRespKWHzl = taskDescription.KWHzl().KWHzl();
                if (publishPermissionRespKWHzl != null) {
                    if (Intrinsics.EZpvd(publishPermissionRespKWHzl.getPermission(), C56443yFo.KWHzl(true))) {
                        if (Intrinsics.EZpvd(publishPermissionRespKWHzl.getAgreeTnc(), C56443yFo.KWHzl(true))) {
                            if (taskDescription.KWHzl().valueOf()) {
                                return PublishPreCheck.CHECK_SUCCESS;
                            }
                            return PublishPreCheck.NEED_MODIFY_PROFILE;
                        }
                        return PublishPreCheck.CHECK_SHOW_AGREE_TNC;
                    }
                    return PublishPreCheck.USER_MUTED;
                }
                if (activity2 instanceof AbstractActivityC33041mov) {
                    ((AbstractActivityC33041mov) activity2).showLoading();
                }
                C46388tSm c46388tSmKWHzl = taskDescription.KWHzl();
                checkUtils$checkPublicRules$1.L$0 = activity2;
                checkUtils$checkPublicRules$1.L$1 = null;
                checkUtils$checkPublicRules$1.label = 4;
                objFirst = c46388tSmKWHzl.KWHzl(checkUtils$checkPublicRules$1);
                if (objFirst == objCopydefault) {
                    return objCopydefault;
                }
                activity3 = activity2;
                publishPermissionResp = (PublishPermissionResp) ((kotlin.Pair) objFirst).component1();
                if (activity3 instanceof AbstractActivityC33041mov) {
                }
                if (publishPermissionResp == null) {
                }
            } else {
                return PublishPreCheck.CHECK_NET_ERROR;
            }
        }
        kycInfoListBean = (KycInfoListBean) objFirst;
        if (kycInfoListBean == null) {
            if (activity instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) activity).showLoading();
            }
            Flow<KycInfoListBean> flowAEQbTJ = interfaceC37981pHw.AEQbTJ();
            checkUtils$checkPublicRules$1.L$0 = activity;
            checkUtils$checkPublicRules$1.L$1 = null;
            checkUtils$checkPublicRules$1.label = 2;
            objFirst = FlowKt.first(flowAEQbTJ, checkUtils$checkPublicRules$1);
            if (objFirst == objCopydefault) {
                return objCopydefault;
            }
            activity2 = activity;
            kycInfoListBean = (KycInfoListBean) objFirst;
            if (activity2 instanceof AbstractActivityC33041mov) {
            }
            Unit unit2 = Unit.INSTANCE;
            if (kycInfoListBean == null) {
            }
        } else {
            Flow<KycInfoListBean> flowAEQbTJ2 = interfaceC37981pHw.AEQbTJ();
            checkUtils$checkPublicRules$1.L$0 = activity;
            checkUtils$checkPublicRules$1.L$1 = kycInfoListBean;
            checkUtils$checkPublicRules$1.label = 3;
            if (FlowKt.first(flowAEQbTJ2, checkUtils$checkPublicRules$1) == objCopydefault) {
                return objCopydefault;
            }
            activity2 = activity;
            if (kycInfoListBean == null) {
            }
        }
    }
}
