package com.okinc.auth.impl.reset2fa.ui;

import com.okinc.account.api.model.security.otp.OtpInputType;
import com.okinc.account.api.model.uploadpersonalinfo.PersonalInfo;
import com.okinc.account.api.model.uploadpersonalinfo.UploadPersonalInfoEntryPoint;
import com.okinc.auth.api.reset2fa.RebindMfaEntryPoint;
import com.okinc.auth.api.reset2fa.data.model.ResetMfaInitiateResponse;
import com.okinc.auth.impl.reset2fa.ui.ResetMfaNextPage;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC6596aSN;
import o.C56391yDq;
import o.C56442yFn;
import o.C6982aZe;

/* JADX INFO: loaded from: classes3.dex */
public final class ResetMfaViewModel$nextStepAction$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $nextStep;
    int label;
    final /* synthetic */ ResetMfaViewModel this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ResetMfaNextPage.values().length];
            try {
                iArr[ResetMfaNextPage.MFA_VERIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResetMfaNextPage.UPLOAD_DOCUMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResetMfaNextPage.UPLOAD_DOCUMENTS_WITHOUT_SELFIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ResetMfaNextPage.TICKET_SUBMITTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ResetMfaNextPage.LINK_NEW_MFA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ResetMfaNextPage.SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetMfaViewModel$nextStepAction$1(String str, ResetMfaViewModel resetMfaViewModel, Continuation<? super ResetMfaViewModel$nextStepAction$1> continuation) {
        super(2, continuation);
        this.$nextStep = str;
        this.this$0 = resetMfaViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ResetMfaViewModel$nextStepAction$1(this.$nextStep, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ResetMfaViewModel$nextStepAction$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v4, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v33, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        PersonalInfo personalInfo;
        UploadPersonalInfoEntryPoint rebind2fa;
        UserInfo info;
        UserInfo info2;
        UserInfo info3;
        Object activity;
        String str;
        String strValueOf;
        String str2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ResetMfaNextPage.ActionBar actionBar = ResetMfaNextPage.Companion;
            switch (StateListAnimator.AEQbTJ[actionBar.copydefault(this.$nextStep).ordinal()]) {
                case 1:
                    ResetMfaInitiateResponse resetMfaInitiateResponse = (ResetMfaInitiateResponse) this.this$0.copydefault.getValue();
                    String business = resetMfaInitiateResponse != null ? resetMfaInitiateResponse.getBusiness() : null;
                    activity = new AbstractC6596aSN.ActionBar(business != null ? business : "");
                    break;
                case 2:
                case 3:
                    RebindMfaEntryPoint rebindMfaEntryPoint = this.this$0.isConnected;
                    if (rebindMfaEntryPoint instanceof RebindMfaEntryPoint.ForgetPassword) {
                        RebindMfaEntryPoint.ForgetPassword forgetPassword = (RebindMfaEntryPoint.ForgetPassword) rebindMfaEntryPoint;
                        String loginName = forgetPassword.getLoginName();
                        if (loginName != null && C6982aZe.KWHzl(loginName)) {
                            strValueOf = String.valueOf(forgetPassword.getLoginName());
                            str = "";
                            str2 = str;
                        } else {
                            String loginName2 = forgetPassword.getLoginName();
                            if (loginName2 == null) {
                                loginName2 = "";
                            }
                            String areaCode = forgetPassword.getAreaCode();
                            if (areaCode == null) {
                                areaCode = "";
                            }
                            str = areaCode;
                            strValueOf = "";
                            str2 = loginName2;
                        }
                        personalInfo = new PersonalInfo(strValueOf, str, str2, null, 8, null);
                        ResetMfaInitiateResponse resetMfaInitiateResponse2 = (ResetMfaInitiateResponse) this.this$0.copydefault.getValue();
                        String workflowToken = resetMfaInitiateResponse2 != null ? resetMfaInitiateResponse2.getWorkflowToken() : null;
                        rebind2fa = new UploadPersonalInfoEntryPoint.NonAuthRebind2fa(7, workflowToken != null ? workflowToken : "");
                    } else {
                        User userOLrzqt = this.this$0.fIwbmz().OLrzqt();
                        String email = (userOLrzqt == null || (info3 = userOLrzqt.getInfo()) == null) ? null : info3.getEmail();
                        User userOLrzqt2 = this.this$0.fIwbmz().OLrzqt();
                        String phone = (userOLrzqt2 == null || (info2 = userOLrzqt2.getInfo()) == null) ? null : info2.getPhone();
                        User userOLrzqt3 = this.this$0.fIwbmz().OLrzqt();
                        personalInfo = new PersonalInfo(email, (userOLrzqt3 == null || (info = userOLrzqt3.getInfo()) == null) ? null : info.getAreaCode(), phone, null, 8, null);
                        ResetMfaInitiateResponse resetMfaInitiateResponse3 = (ResetMfaInitiateResponse) this.this$0.copydefault.getValue();
                        String workflowToken2 = resetMfaInitiateResponse3 != null ? resetMfaInitiateResponse3.getWorkflowToken() : null;
                        rebind2fa = new UploadPersonalInfoEntryPoint.Rebind2fa(7, workflowToken2 != null ? workflowToken2 : "");
                    }
                    activity = new AbstractC6596aSN.Activity(personalInfo, rebind2fa, actionBar.copydefault(this.$nextStep) == ResetMfaNextPage.UPLOAD_DOCUMENTS);
                    break;
                case 4:
                    activity = AbstractC6596aSN.Dialog.OLrzqt;
                    break;
                case 5:
                    String workflowToken3 = this.this$0.KWHzl().getWorkflowToken();
                    String str3 = workflowToken3 != null ? workflowToken3 : "";
                    OtpInputType.Companion companion = OtpInputType.Companion;
                    ResetMfaInitiateResponse resetMfaInitiateResponse4 = (ResetMfaInitiateResponse) this.this$0.copydefault.getValue();
                    activity = new AbstractC6596aSN.TaskDescription(str3, companion.findTypeByList(resetMfaInitiateResponse4 != null ? resetMfaInitiateResponse4.getNew2FaType() : null));
                    break;
                case 6:
                    activity = AbstractC6596aSN.StateListAnimator.AEQbTJ;
                    break;
                default:
                    activity = AbstractC6596aSN.Application.AEQbTJ;
                    break;
            }
            MutableSharedFlow mutableSharedFlow = this.this$0.djBIcL;
            this.label = 1;
            if (mutableSharedFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
