package o;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import com.okinc.okex.common.navigator.CommonServiceKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45397soy {
    public final C45300snG AEQbTJ;

    /* JADX INFO: renamed from: o.soy$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SelfServiceScenario.values().length];
            try {
                iArr[SelfServiceScenario.MY_TICKETS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SelfServiceScenario.CHANGE_LOGIN_PASSWORD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfServiceScenario.CHANGE_PHONE_NUMBER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfServiceScenario.GOOGLE_AUTHENTICATION.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfServiceScenario.CHANGE_EMAIL_ADDRESS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfServiceScenario.FREEZE_ACCOUNT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfServiceScenario.CLOSE_ACCOUNT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfServiceScenario.DEPOSIT_NOT_CREDITED_DIAGNOSTIC.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfServiceScenario.DEPOSIT_NOT_CREDITED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfServiceScenario.WITHDRAWAL_NOT_ARRIVED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfServiceScenario.WITHDRAW_ASSET.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfServiceScenario.KYC_USER_CENTER.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[SelfServiceScenario.GENERAL_BOT_START.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[SelfServiceScenario.FEEDBACK_BOUNTY.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[SelfServiceScenario.SECURITY_ISSUE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[SelfServiceScenario.ERROR_LOG_UPLOAD.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[SelfServiceScenario.PRODUCT_DOCUMENT.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[SelfServiceScenario.VIDEO_CALL_APPOINTMENT.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[SelfServiceScenario.P2P_REORDER.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[SelfServiceScenario.CAMPAIGNS.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            KWHzl = iArr;
        }
    }

    @yCM
    public C45397soy(@NotNull C45300snG c45300snG) {
        Intrinsics.checkNotNullParameter(c45300snG, "");
        this.AEQbTJ = c45300snG;
    }

    public static /* synthetic */ java.lang.Object invoke$default(C45397soy c45397soy, android.content.Context context, SelfServiceToolBean selfServiceToolBean, java.lang.Object obj, Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            obj = null;
        }
        return c45397soy.KWHzl(context, selfServiceToolBean, obj, continuation);
    }

    public final java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull SelfServiceToolBean selfServiceToolBean, java.lang.Object obj, @NotNull Continuation<? super Unit> continuation) {
        C44760scx.log$default("SelfServiceUseCase: data: " + selfServiceToolBean, null, 2, null);
        C44760scx.log$default("SelfServiceUseCase: has extra: " + (obj != null), null, 2, null);
        switch (Application.KWHzl[selfServiceToolBean.getScenario().ordinal()]) {
            case 1:
                java.lang.Object objCopydefault = this.AEQbTJ.copydefault(CommonServiceKey.TicketHistory, context, selfServiceToolBean.getExtra(), continuation);
                return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
            case 2:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.ChangeLoginPassword, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default : Unit.INSTANCE;
            case 3:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default2 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.ChangePhoneNumber, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default2 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default2 : Unit.INSTANCE;
            case 4:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default3 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.ChangeGoogleAuth, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default3 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default3 : Unit.INSTANCE;
            case 5:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default4 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.ChangeEmail, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default4 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default4 : Unit.INSTANCE;
            case 6:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default5 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.OpenFreezeAccount, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default5 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default5 : Unit.INSTANCE;
            case 7:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default6 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.OpenCloseAccount, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default6 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default6 : Unit.INSTANCE;
            case 8:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default7 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.DepositDiagnostic, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default7 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default7 : Unit.INSTANCE;
            case 9:
            case 10:
                java.lang.Object objCopydefault2 = this.AEQbTJ.copydefault(CommonServiceKey.LoggedInChatbot, context, C44855sem.copydefault(selfServiceToolBean), continuation);
                return objCopydefault2 == C56442yFn.copydefault() ? objCopydefault2 : Unit.INSTANCE;
            case 11:
                java.lang.Object objCopydefault3 = this.AEQbTJ.copydefault(CommonServiceKey.OpenWithdrawDetail, context, obj instanceof C45299snF ? (C45299snF) obj : null, continuation);
                return objCopydefault3 == C56442yFn.copydefault() ? objCopydefault3 : Unit.INSTANCE;
            case 12:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default8 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.KycUserCenter, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default8 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default8 : Unit.INSTANCE;
            case 13:
                java.lang.Object objCopydefault4 = this.AEQbTJ.copydefault(CommonServiceKey.Chatbot, context, C44855sem.copydefault(selfServiceToolBean), continuation);
                return objCopydefault4 == C56442yFn.copydefault() ? objCopydefault4 : Unit.INSTANCE;
            case 14:
                java.lang.Object objCopydefault5 = this.AEQbTJ.copydefault(CommonServiceKey.FeedbackBounty, context, C56443yFo.KWHzl(true), continuation);
                return objCopydefault5 == C56442yFn.copydefault() ? objCopydefault5 : Unit.INSTANCE;
            case 15:
                java.lang.Object objCopydefault6 = this.AEQbTJ.copydefault(CommonServiceKey.FeedbackBounty, context, C56443yFo.KWHzl(false), continuation);
                return objCopydefault6 == C56442yFn.copydefault() ? objCopydefault6 : Unit.INSTANCE;
            case 16:
                JsonObject extra = selfServiceToolBean.getExtra();
                if (extra != null) {
                    java.lang.String strCopydefault = C45361soO.copydefault(extra, "formId");
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    java.lang.String strCopydefault2 = C45361soO.copydefault(extra, "fieldId");
                    if (strCopydefault2 == null) {
                        strCopydefault2 = "";
                    }
                    java.lang.String strCopydefault3 = C45361soO.copydefault(extra, "fieldIdLogStatus");
                    sbz = new sBZ(strCopydefault, strCopydefault2, strCopydefault3 != null ? strCopydefault3 : "");
                }
                java.lang.Object objCopydefault7 = this.AEQbTJ.copydefault(CommonServiceKey.ErrorLogUpload, context, sbz, continuation);
                return objCopydefault7 == C56442yFn.copydefault() ? objCopydefault7 : Unit.INSTANCE;
            case 17:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default9 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.OpenProductDocs, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default9 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default9 : Unit.INSTANCE;
            case 18:
                java.lang.Object objCopydefault8 = this.AEQbTJ.copydefault(CommonServiceKey.VideoMeetingOtp, context, obj instanceof C45345snz ? (C45345snz) obj : null, continuation);
                return objCopydefault8 == C56442yFn.copydefault() ? objCopydefault8 : Unit.INSTANCE;
            case 19:
                java.lang.Object objCopydefault9 = this.AEQbTJ.copydefault(CommonServiceKey.P2pReorder, context, obj instanceof java.lang.String ? (java.lang.String) obj : null, continuation);
                return objCopydefault9 == C56442yFn.copydefault() ? objCopydefault9 : Unit.INSTANCE;
            case 20:
                java.lang.Object objRunCommonService$OKSupport_support_impl$default10 = C45300snG.runCommonService$OKSupport_support_impl$default(this.AEQbTJ, CommonServiceKey.Campaign, context, null, continuation, 4, null);
                return objRunCommonService$OKSupport_support_impl$default10 == C56442yFn.copydefault() ? objRunCommonService$OKSupport_support_impl$default10 : Unit.INSTANCE;
            default:
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) selfServiceToolBean.getDeeplink())) {
                    java.lang.Object objCopydefault10 = this.AEQbTJ.copydefault(CommonServiceKey.OpenDeeplink, context, selfServiceToolBean.getDeeplink(), continuation);
                    return objCopydefault10 == C56442yFn.copydefault() ? objCopydefault10 : Unit.INSTANCE;
                }
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) selfServiceToolBean.getUrl())) {
                    java.lang.Object objCopydefault11 = this.AEQbTJ.copydefault(CommonServiceKey.OpenWebView, context, selfServiceToolBean.getUrl(), continuation);
                    return objCopydefault11 == C56442yFn.copydefault() ? objCopydefault11 : Unit.INSTANCE;
                }
                C44760scx.log$default("SelfServiceUseCase: Undefined scenario with no deeplink or URL provided; no action taken.", null, 2, null);
                return Unit.INSTANCE;
        }
    }
}
