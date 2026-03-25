package com.okinc.auth.impl.passkey.ui.management.cefi;

import androidx.lifecycle.MutableLiveData;
import com.okinc.auth.impl.passkey.model.AuthenticatorDisplayModel;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import com.okinc.auth.impl.passkey.ui.management.cefi.SecurityFido2AuthenticatorViewModel;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC32955mnO;
import o.C32989mnw;
import o.C33492mxV;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC8196ayF;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2 extends SuspendLambda implements Function2<AbstractC32955mnO<GetAuthenticatorListResponse>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SecurityFido2AuthenticatorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2(SecurityFido2AuthenticatorViewModel securityFido2AuthenticatorViewModel, Continuation<? super SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2> continuation) {
        super(2, continuation);
        this.this$0 = securityFido2AuthenticatorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2 securityFido2AuthenticatorViewModel$refreshAuthenticatorList$2 = new SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2(this.this$0, continuation);
        securityFido2AuthenticatorViewModel$refreshAuthenticatorList$2.L$0 = obj;
        return securityFido2AuthenticatorViewModel$refreshAuthenticatorList$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC32955mnO<GetAuthenticatorListResponse> abstractC32955mnO, Continuation<? super Unit> continuation) {
        return ((SecurityFido2AuthenticatorViewModel$refreshAuthenticatorList$2) create(abstractC32955mnO, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0188  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        MutableLiveData mutableLiveData;
        GetAuthenticatorListResponse getAuthenticatorListResponse;
        boolean z2;
        Object objAEQbTJ;
        AbstractC32955mnO abstractC32955mnO;
        List<GetAuthenticatorListResponse.TaskDescription> authenticators;
        Integer numDjBIcL;
        List<GetAuthenticatorListResponse.TaskDescription> authenticators2;
        Integer numDjBIcL2;
        boolean z3;
        GetAuthenticatorListResponse getAuthenticatorListResponse2;
        List<AuthenticatorDisplayModel> listAhwBna;
        List list;
        UserInfo info;
        List<GetAuthenticatorListResponse.TaskDescription> authenticators3;
        Integer numDjBIcL3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z4 = false;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC32955mnO abstractC32955mnO2 = (AbstractC32955mnO) this.L$0;
            if (!(abstractC32955mnO2 instanceof AbstractC32955mnO.TaskDescription)) {
                if (abstractC32955mnO2 instanceof AbstractC32955mnO.ActionBar) {
                    MutableLiveData mutableLiveData2 = this.this$0.copydefault;
                    AbstractC32955mnO.ActionBar actionBar = (AbstractC32955mnO.ActionBar) abstractC32955mnO2;
                    GetAuthenticatorListResponse getAuthenticatorListResponse3 = (GetAuthenticatorListResponse) actionBar.AEQbTJ();
                    if (getAuthenticatorListResponse3 == null || (authenticators2 = getAuthenticatorListResponse3.getAuthenticators()) == null || authenticators2.isEmpty()) {
                        z = false;
                        mutableLiveData2.setValue(C56443yFo.KWHzl(z));
                        mutableLiveData = this.this$0.KWHzl;
                        getAuthenticatorListResponse = (GetAuthenticatorListResponse) actionBar.AEQbTJ();
                        if (getAuthenticatorListResponse != null || (authenticators = getAuthenticatorListResponse.getAuthenticators()) == null || authenticators.isEmpty()) {
                            z2 = false;
                            mutableLiveData.setValue(C56443yFo.KWHzl(z2));
                            InterfaceC8196ayF interfaceC8196ayF = this.this$0.fARcdN;
                            this.L$0 = abstractC32955mnO2;
                            this.label = 1;
                            objAEQbTJ = interfaceC8196ayF.AEQbTJ(this);
                            if (objAEQbTJ == objCopydefault) {
                                return objCopydefault;
                            }
                            abstractC32955mnO = abstractC32955mnO2;
                            obj = objAEQbTJ;
                        } else {
                            for (GetAuthenticatorListResponse.TaskDescription taskDescription : authenticators) {
                                if (taskDescription != null && Intrinsics.EZpvd(taskDescription.gEmmrt(), C56443yFo.KWHzl(true)) && (numDjBIcL = taskDescription.djBIcL()) != null && numDjBIcL.intValue() == 2) {
                                    z2 = true;
                                    break;
                                }
                            }
                            z2 = false;
                            mutableLiveData.setValue(C56443yFo.KWHzl(z2));
                            InterfaceC8196ayF interfaceC8196ayF2 = this.this$0.fARcdN;
                            this.L$0 = abstractC32955mnO2;
                            this.label = 1;
                            objAEQbTJ = interfaceC8196ayF2.AEQbTJ(this);
                            if (objAEQbTJ == objCopydefault) {
                            }
                        }
                    } else {
                        for (GetAuthenticatorListResponse.TaskDescription taskDescription2 : authenticators2) {
                            if (taskDescription2 != null && Intrinsics.EZpvd(taskDescription2.gEmmrt(), C56443yFo.KWHzl(true)) && (numDjBIcL2 = taskDescription2.djBIcL()) != null && numDjBIcL2.intValue() == 1) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        mutableLiveData2.setValue(C56443yFo.KWHzl(z));
                        mutableLiveData = this.this$0.KWHzl;
                        getAuthenticatorListResponse = (GetAuthenticatorListResponse) actionBar.AEQbTJ();
                        if (getAuthenticatorListResponse != null) {
                            z2 = false;
                            mutableLiveData.setValue(C56443yFo.KWHzl(z2));
                            InterfaceC8196ayF interfaceC8196ayF22 = this.this$0.fARcdN;
                            this.L$0 = abstractC32955mnO2;
                            this.label = 1;
                            objAEQbTJ = interfaceC8196ayF22.AEQbTJ(this);
                            if (objAEQbTJ == objCopydefault) {
                            }
                        }
                    }
                } else if (abstractC32955mnO2 instanceof AbstractC32955mnO.Activity) {
                    MutableLiveData mutableLiveData3 = this.this$0.EZpvd;
                    String strOLrzqt = ((AbstractC32955mnO.Activity) abstractC32955mnO2).OLrzqt();
                    mutableLiveData3.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.LoaderManager(strOLrzqt != null ? strOLrzqt : "")));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        abstractC32955mnO = (AbstractC32955mnO) this.L$0;
        C56391yDq.AEQbTJ(obj);
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        AbstractC32955mnO.ActionBar actionBar2 = (AbstractC32955mnO.ActionBar) abstractC32955mnO;
        GetAuthenticatorListResponse getAuthenticatorListResponse4 = (GetAuthenticatorListResponse) actionBar2.AEQbTJ();
        if (getAuthenticatorListResponse4 == null || (authenticators3 = getAuthenticatorListResponse4.getAuthenticators()) == null || authenticators3.isEmpty()) {
            z3 = false;
            this.this$0.DbNXlk.setValue(C56443yFo.KWHzl(z3));
            MutableLiveData mutableLiveData4 = this.this$0.OLrzqt;
            getAuthenticatorListResponse2 = (GetAuthenticatorListResponse) actionBar2.AEQbTJ();
            if (getAuthenticatorListResponse2 == null) {
                boolean zOLrzqt = C33492mxV.OLrzqt();
                User userOLrzqt = this.this$0.QUSxYX.OLrzqt();
                listAhwBna = getAuthenticatorListResponse2.toDisplayModelList(zOLrzqt, false, zBooleanValue, (userOLrzqt == null || (info = userOLrzqt.getInfo()) == null || !info.isInHousePasskeyV1GreyScaleOn()) ? false : true, z3);
            } else {
                listAhwBna = null;
            }
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            mutableLiveData4.setValue(listAhwBna);
            list = (List) this.this$0.OLrzqt.getValue();
            if (list != null && list.isEmpty()) {
                z4 = true;
            }
            boolean zEZpvd = Intrinsics.EZpvd(this.this$0.AYXKKw.getValue(), C56443yFo.KWHzl(true));
            if (!z4 && Intrinsics.EZpvd(this.this$0.djBIcL.getValue(), C56443yFo.KWHzl(true)) && this.this$0.gEmmrt()) {
                this.this$0.EZpvd.setValue(new C32989mnw(new SecurityFido2AuthenticatorViewModel.StateListAnimator.Application("")));
            } else if (z4 && !zEZpvd) {
                this.this$0.fetchVPNInfo.setValue(Unit.INSTANCE);
            }
        } else {
            for (GetAuthenticatorListResponse.TaskDescription taskDescription3 : authenticators3) {
                if (taskDescription3 != null && Intrinsics.EZpvd(taskDescription3.gEmmrt(), C56443yFo.KWHzl(true)) && (numDjBIcL3 = taskDescription3.djBIcL()) != null && numDjBIcL3.intValue() == 2 && Intrinsics.EZpvd(taskDescription3.OLrzqt(), C56443yFo.KWHzl(false))) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
            this.this$0.DbNXlk.setValue(C56443yFo.KWHzl(z3));
            MutableLiveData mutableLiveData42 = this.this$0.OLrzqt;
            getAuthenticatorListResponse2 = (GetAuthenticatorListResponse) actionBar2.AEQbTJ();
            if (getAuthenticatorListResponse2 == null) {
            }
            if (listAhwBna == null) {
            }
            mutableLiveData42.setValue(listAhwBna);
            list = (List) this.this$0.OLrzqt.getValue();
            if (list != null) {
                z4 = true;
            }
            boolean zEZpvd2 = Intrinsics.EZpvd(this.this$0.AYXKKw.getValue(), C56443yFo.KWHzl(true));
            if (!z4) {
                if (z4) {
                    this.this$0.fetchVPNInfo.setValue(Unit.INSTANCE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
