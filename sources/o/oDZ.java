package o;

import com.okinc.im.usecase.kyc.GetIsKycPassesUseCase$execute$1;
import com.okinc.kyc.api.biz.bean.KycInfoListBean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDZ {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC37981pHw OLrzqt;

    @yCM
    public oDZ(@yCL(AEQbTJ = "IMComplianceService") InterfaceC37981pHw interfaceC37981pHw) {
        this.OLrzqt = interfaceC37981pHw;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        GetIsKycPassesUseCase$execute$1 getIsKycPassesUseCase$execute$1;
        oDZ odz;
        KycInfoListBean kycInfoListBean;
        Flow<KycInfoListBean> flowEZpvd;
        Flow<KycInfoListBean> flowAEQbTJ;
        KycInfoListBean kycInfoListBean2;
        boolean zCopydefault;
        if (continuation instanceof GetIsKycPassesUseCase$execute$1) {
            getIsKycPassesUseCase$execute$1 = (GetIsKycPassesUseCase$execute$1) continuation;
            int i = getIsKycPassesUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getIsKycPassesUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                getIsKycPassesUseCase$execute$1 = new GetIsKycPassesUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objFirst = getIsKycPassesUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getIsKycPassesUseCase$execute$1.label;
        boolean z = false;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFirst);
            if (!C44157sFk.gEmmrt().values()) {
                return C56443yFo.KWHzl(false);
            }
            InterfaceC37981pHw interfaceC37981pHw = this.OLrzqt;
            if (interfaceC37981pHw != null && (flowEZpvd = interfaceC37981pHw.EZpvd()) != null) {
                getIsKycPassesUseCase$execute$1.L$0 = this;
                getIsKycPassesUseCase$execute$1.label = 1;
                objFirst = FlowKt.first(flowEZpvd, getIsKycPassesUseCase$execute$1);
                if (objFirst == objCopydefault) {
                    return objCopydefault;
                }
                odz = this;
            } else {
                odz = this;
                kycInfoListBean = null;
                if (kycInfoListBean == null) {
                    numAEQbTJ = C56443yFo.AEQbTJ(kycInfoListBean.getLevel());
                } else {
                    InterfaceC37981pHw interfaceC37981pHw2 = odz.OLrzqt;
                    if (interfaceC37981pHw2 != null && (flowAEQbTJ = interfaceC37981pHw2.AEQbTJ()) != null) {
                        getIsKycPassesUseCase$execute$1.L$0 = kycInfoListBean;
                        getIsKycPassesUseCase$execute$1.label = 2;
                        java.lang.Object objFirst2 = FlowKt.first(flowAEQbTJ, getIsKycPassesUseCase$execute$1);
                        if (objFirst2 == objCopydefault) {
                            return objCopydefault;
                        }
                        kycInfoListBean2 = kycInfoListBean;
                        objFirst = objFirst2;
                        KycInfoListBean kycInfoListBean3 = (KycInfoListBean) objFirst;
                        if (kycInfoListBean3 != null) {
                        }
                        kycInfoListBean = kycInfoListBean2;
                    }
                }
                zCopydefault = sSI.copydefault.copydefault();
                if (zCopydefault) {
                    z = true;
                }
                pUU.KWHzl("GetIsKycPassesUseCase", "kycCacheValue: " + kycInfoListBean + ", kycLevel:" + numAEQbTJ + ", isKycPasses = " + z + ", isInternalAccount: " + zCopydefault);
                return C56443yFo.KWHzl(z);
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kycInfoListBean2 = (KycInfoListBean) getIsKycPassesUseCase$execute$1.L$0;
                C56391yDq.AEQbTJ(objFirst);
                KycInfoListBean kycInfoListBean32 = (KycInfoListBean) objFirst;
                numAEQbTJ = kycInfoListBean32 != null ? C56443yFo.AEQbTJ(kycInfoListBean32.getLevel()) : null;
                kycInfoListBean = kycInfoListBean2;
                zCopydefault = sSI.copydefault.copydefault();
                if (zCopydefault || (numAEQbTJ != null && numAEQbTJ.intValue() >= 2)) {
                    z = true;
                }
                pUU.KWHzl("GetIsKycPassesUseCase", "kycCacheValue: " + kycInfoListBean + ", kycLevel:" + numAEQbTJ + ", isKycPasses = " + z + ", isInternalAccount: " + zCopydefault);
                return C56443yFo.KWHzl(z);
            }
            odz = (oDZ) getIsKycPassesUseCase$execute$1.L$0;
            C56391yDq.AEQbTJ(objFirst);
        }
        kycInfoListBean = (KycInfoListBean) objFirst;
        if (kycInfoListBean == null) {
        }
        zCopydefault = sSI.copydefault.copydefault();
        if (zCopydefault) {
        }
        pUU.KWHzl("GetIsKycPassesUseCase", "kycCacheValue: " + kycInfoListBean + ", kycLevel:" + numAEQbTJ + ", isKycPasses = " + z + ", isInternalAccount: " + zCopydefault);
        return C56443yFo.KWHzl(z);
    }
}
