package com.okinc.liveness.lca;

import android.content.Context;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43215rlA;
import o.C32866mlf;
import o.C32868mlh;
import o.InterfaceC42441rSz;
import o.pUU;
import o.rSA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LcaDynamicImpl extends AbstractC43215rlA implements rSA {
    public static final int $stable = 0;

    @Override // o.rSA
    public void startLca(@NotNull Context context, LcaSdkLivenessConfig lcaSdkLivenessConfig, String str, String str2, @NotNull final String str3, @NotNull final String str4, @NotNull final String str5, @NotNull final String str6, FacialExtParams facialExtParams, @NotNull final InterfaceC42441rSz interfaceC42441rSz) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(interfaceC42441rSz, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(KycSdkEventConst.FaceLiveness_Router_LcaStart_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LcaDynamicImpl.startLca$lambda$0(str3, str4, str5, str6, (EventParamsList) obj);
            }
        });
        LcaSdkCollaborator companion = LcaSdkCollaborator.Companion.getInstance();
        LcaSdkConfiguration.Companion companion2 = LcaSdkConfiguration.Companion;
        LcaSdkCollaborator.startLivenessCheck$default(companion, context, new LcaSdkConfiguration(companion2.getAPI_COMPLIANCE(), lcaSdkLivenessConfig, str, str2, null, null, true, true, null, null, false, false, false, companion2.getFACE_OVAL_ANIMATION_B(), false, facialExtParams, 24368, null), new Function2() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LcaDynamicImpl.startLca$lambda$14(this.f$0, interfaceC42441rSz, str3, str4, str5, str6, (LcaLivenessCheckResult) obj, (Function0) obj2);
            }
        }, null, 8, null);
    }

    public static final Unit startLca$lambda$0(String str, String str2, String str3, String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14(LcaDynamicImpl lcaDynamicImpl, InterfaceC42441rSz interfaceC42441rSz, final String str, final String str2, final String str3, final String str4, final LcaLivenessCheckResult lcaLivenessCheckResult, Function0 function0) {
        Intrinsics.checkNotNullParameter(lcaLivenessCheckResult, "");
        if (lcaLivenessCheckResult instanceof LcaLivenessCheckSuccess) {
            pUU.KWHzl("kyc_in_house", "lca liveness callback success");
            LcaLivenessCheckSuccess lcaLivenessCheckSuccess = (LcaLivenessCheckSuccess) lcaLivenessCheckResult;
            interfaceC42441rSz.EZpvd(lcaDynamicImpl.convertToErrorDetail("success", null, lcaLivenessCheckSuccess.getDetectionInfo(), Integer.valueOf(lcaLivenessCheckSuccess.getSplashCount()), Integer.valueOf(lcaLivenessCheckSuccess.getSplashInterruptCount())), function0);
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnCancel) {
            LcaLivenessCheckOnCancel lcaLivenessCheckOnCancel = (LcaLivenessCheckOnCancel) lcaLivenessCheckResult;
            pUU.KWHzl("kyc_in_house", "lca liveness callback cancelled, processState=" + lcaLivenessCheckOnCancel.getProcessState() + ", detectionInfo=" + lcaLivenessCheckOnCancel.getDetectionInfo());
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_Close_Button_Click, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$1(str, str2, str3, lcaLivenessCheckResult, str4, (EventParamsList) obj);
                }
            });
            interfaceC42441rSz.EZpvd();
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnStartingUpView) {
            pUU.KWHzl("kyc_in_house", "lca liveness callback on starting up view");
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_StartingUp_Flow_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$2(str, str2, str3, str4, (EventParamsList) obj);
                }
            });
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnFarSelfieView) {
            pUU.KWHzl("kyc_in_house", "lca liveness callback on far selfie view");
            TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_FarSelfieCheck_Flow_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda7
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$3(str, str2, str3, str4, (EventParamsList) obj);
                }
            });
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnCloseSelfieView) {
            pUU.KWHzl("kyc_in_house", "lca liveness callback on close selfie view");
            TrackChannel[] trackChannelArrCopydefault4 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_CloseSelfieCheck_Flow_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault4, trackChannelArrCopydefault4.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda8
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$4(str, str2, str3, str4, lcaLivenessCheckResult, (EventParamsList) obj);
                }
            });
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnFirstFreshnessView) {
            pUU.KWHzl("kyc_in_house", "lca liveness callback on first freshness trigger");
            TrackChannel[] trackChannelArrCopydefault5 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_FreshnessFirstTrigger_Flow_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault5, trackChannelArrCopydefault5.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$5(str, str2, str3, str4, lcaLivenessCheckResult, (EventParamsList) obj);
                }
            });
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnFinalCheckView) {
            pUU.KWHzl("kyc_in_house", "lca liveness callback on final check view");
            TrackChannel[] trackChannelArrCopydefault6 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_FinalCheck_Flow_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault6, trackChannelArrCopydefault6.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda10
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$6(str, str2, str3, str4, lcaLivenessCheckResult, (EventParamsList) obj);
                }
            });
        } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnReloadScreenView) {
            LcaLivenessCheckOnReloadScreenView lcaLivenessCheckOnReloadScreenView = (LcaLivenessCheckOnReloadScreenView) lcaLivenessCheckResult;
            final String strConvertToErrorDetail = lcaDynamicImpl.convertToErrorDetail(lcaLivenessCheckOnReloadScreenView.getErrorName(), lcaLivenessCheckOnReloadScreenView.getErrorDetail(), lcaLivenessCheckOnReloadScreenView.getDetectionInfo(), Integer.valueOf(lcaLivenessCheckOnReloadScreenView.getSplashCount()), Integer.valueOf(lcaLivenessCheckOnReloadScreenView.getSplashInterruptCount()));
            pUU.KWHzl("kyc_in_house", "lca liveness callback on reload screen view, processState=" + lcaLivenessCheckOnReloadScreenView.getProcessState() + ", errorName=" + lcaLivenessCheckOnReloadScreenView.getErrorName() + ", errorDetail=" + strConvertToErrorDetail);
            C32868mlh c32868mlh = C32868mlh.OLrzqt;
            TrackChannel[] trackChannelArrCopydefault7 = c32868mlh.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.LCA_RetryScreen_Page_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault7, trackChannelArrCopydefault7.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda11
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$7(str, str2, str3, lcaLivenessCheckResult, strConvertToErrorDetail, str4, (EventParamsList) obj);
                }
            });
            TrackChannel[] trackChannelArrCopydefault8 = c32868mlh.copydefault();
            C32866mlf.EZpvd(KycSdkEventConst.FaceLiveness_Router_LcaError_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault8, trackChannelArrCopydefault8.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda12
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LcaDynamicImpl.startLca$lambda$14$lambda$8(str, str2, str3, lcaLivenessCheckResult, strConvertToErrorDetail, str4, (EventParamsList) obj);
                }
            });
            String errorName = lcaLivenessCheckOnReloadScreenView.getErrorName();
            String errorName2 = lcaLivenessCheckOnReloadScreenView.getErrorName();
            LcaSdkConfiguration.Companion companion = LcaSdkConfiguration.Companion;
            interfaceC42441rSz.EZpvd(strConvertToErrorDetail, errorName, Intrinsics.EZpvd((Object) errorName2, (Object) companion.getRETRY_REASON_RESUME_FROM_BACKGROUND()) || Intrinsics.EZpvd((Object) lcaLivenessCheckOnReloadScreenView.getErrorName(), (Object) companion.getRETRY_REASON_RESUME_FROM_PAUSE()));
        } else {
            if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnReloadScreenClicked) {
                LcaLivenessCheckOnReloadScreenClicked lcaLivenessCheckOnReloadScreenClicked = (LcaLivenessCheckOnReloadScreenClicked) lcaLivenessCheckResult;
                final String strConvertToErrorDetail2 = lcaDynamicImpl.convertToErrorDetail(lcaLivenessCheckOnReloadScreenClicked.getErrorName(), lcaLivenessCheckOnReloadScreenClicked.getErrorDetail(), null, null, null);
                String processState = lcaLivenessCheckOnReloadScreenClicked.getProcessState();
                String errorName3 = lcaLivenessCheckOnReloadScreenClicked.getErrorName();
                Throwable errorDetail = lcaLivenessCheckOnReloadScreenClicked.getErrorDetail();
                pUU.KWHzl("kyc_in_house", "lca liveness callback on reload screen clicked, processState=" + processState + ", errorName=" + errorName3 + ", errorDetail=" + (errorDetail != null ? errorDetail.getMessage() : null));
                TrackChannel[] trackChannelArrCopydefault9 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd(KycSdkEventConst.LCA_RetryScreen_Button_Click, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault9, trackChannelArrCopydefault9.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda13
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LcaDynamicImpl.startLca$lambda$14$lambda$9(str, str2, str3, lcaLivenessCheckResult, strConvertToErrorDetail2, str4, (EventParamsList) obj);
                    }
                });
                interfaceC42441rSz.AEQbTJ(function0);
            } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnRetryDialogPop) {
                LcaLivenessCheckOnRetryDialogPop lcaLivenessCheckOnRetryDialogPop = (LcaLivenessCheckOnRetryDialogPop) lcaLivenessCheckResult;
                final String strConvertToErrorDetail3 = lcaDynamicImpl.convertToErrorDetail(lcaLivenessCheckOnRetryDialogPop.getErrorName(), lcaLivenessCheckOnRetryDialogPop.getErrorDetail(), lcaLivenessCheckOnRetryDialogPop.getDetectionInfo(), Integer.valueOf(lcaLivenessCheckOnRetryDialogPop.getSplashCount()), Integer.valueOf(lcaLivenessCheckOnRetryDialogPop.getSplashInterruptCount()));
                pUU.KWHzl("kyc_in_house", "lca liveness callback on retry dialog pop, processState=" + lcaLivenessCheckOnRetryDialogPop.getProcessState() + ", errorName=" + lcaLivenessCheckOnRetryDialogPop.getErrorName() + ", errorDetail=" + strConvertToErrorDetail3);
                C32868mlh c32868mlh2 = C32868mlh.OLrzqt;
                TrackChannel[] trackChannelArrCopydefault10 = c32868mlh2.copydefault();
                C32866mlf.EZpvd(KycSdkEventConst.LCA_RetryDialog_Pop_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault10, trackChannelArrCopydefault10.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda14
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LcaDynamicImpl.startLca$lambda$14$lambda$10(str, str2, str3, lcaLivenessCheckResult, strConvertToErrorDetail3, str4, (EventParamsList) obj);
                    }
                });
                TrackChannel[] trackChannelArrCopydefault11 = c32868mlh2.copydefault();
                C32866mlf.EZpvd(KycSdkEventConst.FaceLiveness_Router_LcaError_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault11, trackChannelArrCopydefault11.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda3
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LcaDynamicImpl.startLca$lambda$14$lambda$11(str, str2, str3, lcaLivenessCheckResult, strConvertToErrorDetail3, str4, (EventParamsList) obj);
                    }
                });
                String errorName4 = lcaLivenessCheckOnRetryDialogPop.getErrorName();
                String errorName5 = lcaLivenessCheckOnRetryDialogPop.getErrorName();
                LcaSdkConfiguration.Companion companion2 = LcaSdkConfiguration.Companion;
                interfaceC42441rSz.EZpvd(strConvertToErrorDetail3, errorName4, Intrinsics.EZpvd((Object) errorName5, (Object) companion2.getRETRY_REASON_RESUME_FROM_BACKGROUND()) || Intrinsics.EZpvd((Object) lcaLivenessCheckOnRetryDialogPop.getErrorName(), (Object) companion2.getRETRY_REASON_RESUME_FROM_PAUSE()));
            } else if (lcaLivenessCheckResult instanceof LcaLivenessCheckOnRestartDialogClicked) {
                LcaLivenessCheckOnRestartDialogClicked lcaLivenessCheckOnRestartDialogClicked = (LcaLivenessCheckOnRestartDialogClicked) lcaLivenessCheckResult;
                final String strConvertToErrorDetail4 = lcaDynamicImpl.convertToErrorDetail(lcaLivenessCheckOnRestartDialogClicked.getErrorName(), lcaLivenessCheckOnRestartDialogClicked.getErrorDetail(), null, null, null);
                String processState2 = lcaLivenessCheckOnRestartDialogClicked.getProcessState();
                String errorName6 = lcaLivenessCheckOnRestartDialogClicked.getErrorName();
                Throwable errorDetail2 = lcaLivenessCheckOnRestartDialogClicked.getErrorDetail();
                pUU.KWHzl("kyc_in_house", "lca liveness callback retry dialog clicked, processState=" + processState2 + ", errorName=" + errorName6 + ", errorDetail=" + (errorDetail2 != null ? errorDetail2.getMessage() : null));
                TrackChannel[] trackChannelArrCopydefault12 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd(KycSdkEventConst.LCA_RetryDialog_Button_Click, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault12, trackChannelArrCopydefault12.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LcaDynamicImpl.startLca$lambda$14$lambda$12(str, str2, str3, lcaLivenessCheckResult, strConvertToErrorDetail4, str4, (EventParamsList) obj);
                    }
                });
                interfaceC42441rSz.EZpvd(function0);
            } else {
                if (!(lcaLivenessCheckResult instanceof LcaLivenessCheckOnSocketConnected)) {
                    throw new NoWhenBranchMatchedException();
                }
                pUU.KWHzl("kyc_in_house", "lca liveness callback on websocket connected");
                TrackChannel[] trackChannelArrCopydefault13 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd(KycSdkEventConst.LCA_Socket_Connected_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault13, trackChannelArrCopydefault13.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: com.okinc.liveness.lca.LcaDynamicImpl$$ExternalSyntheticLambda5
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LcaDynamicImpl.startLca$lambda$14$lambda$13(str, str2, str3, str4, lcaLivenessCheckResult, (EventParamsList) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$1(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnCancel lcaLivenessCheckOnCancel = (LcaLivenessCheckOnCancel) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnCancel.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_DETECTION_INFO, lcaLivenessCheckOnCancel.getDetectionInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH, String.valueOf(lcaLivenessCheckOnCancel.getSplashCount()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH_INTERRUPT, String.valueOf(lcaLivenessCheckOnCancel.getSplashInterruptCount()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$2(String str, String str2, String str3, String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$3(String str, String str2, String str3, String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$4(String str, String str2, String str3, String str4, LcaLivenessCheckResult lcaLivenessCheckResult, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        LcaLivenessCheckOnCloseSelfieView lcaLivenessCheckOnCloseSelfieView = (LcaLivenessCheckOnCloseSelfieView) lcaLivenessCheckResult;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_DETECTION_INFO, lcaLivenessCheckOnCloseSelfieView.getDetectionInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH, String.valueOf(lcaLivenessCheckOnCloseSelfieView.getSplashCount()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH_INTERRUPT, String.valueOf(lcaLivenessCheckOnCloseSelfieView.getSplashInterruptCount()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$5(String str, String str2, String str3, String str4, LcaLivenessCheckResult lcaLivenessCheckResult, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_DETECTION_INFO, ((LcaLivenessCheckOnFirstFreshnessView) lcaLivenessCheckResult).getDetectionInfo(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$6(String str, String str2, String str3, String str4, LcaLivenessCheckResult lcaLivenessCheckResult, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        LcaLivenessCheckOnFinalCheckView lcaLivenessCheckOnFinalCheckView = (LcaLivenessCheckOnFinalCheckView) lcaLivenessCheckResult;
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_DETECTION_INFO, lcaLivenessCheckOnFinalCheckView.getDetectionInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH, String.valueOf(lcaLivenessCheckOnFinalCheckView.getSplashCount()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH_INTERRUPT, String.valueOf(lcaLivenessCheckOnFinalCheckView.getSplashInterruptCount()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$7(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnReloadScreenView lcaLivenessCheckOnReloadScreenView = (LcaLivenessCheckOnReloadScreenView) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnReloadScreenView.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_NAME, lcaLivenessCheckOnReloadScreenView.getErrorName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_DETAIL, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$8(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnReloadScreenView lcaLivenessCheckOnReloadScreenView = (LcaLivenessCheckOnReloadScreenView) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnReloadScreenView.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_NAME, lcaLivenessCheckOnReloadScreenView.getErrorName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_DETAIL, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_DETECTION_INFO, lcaLivenessCheckOnReloadScreenView.getDetectionInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH, String.valueOf(lcaLivenessCheckOnReloadScreenView.getSplashCount()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH_INTERRUPT, String.valueOf(lcaLivenessCheckOnReloadScreenView.getSplashInterruptCount()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$9(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnReloadScreenClicked lcaLivenessCheckOnReloadScreenClicked = (LcaLivenessCheckOnReloadScreenClicked) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnReloadScreenClicked.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_NAME, lcaLivenessCheckOnReloadScreenClicked.getErrorName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_DETAIL, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$10(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnRetryDialogPop lcaLivenessCheckOnRetryDialogPop = (LcaLivenessCheckOnRetryDialogPop) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnRetryDialogPop.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_NAME, lcaLivenessCheckOnRetryDialogPop.getErrorName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_DETAIL, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$11(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnRetryDialogPop lcaLivenessCheckOnRetryDialogPop = (LcaLivenessCheckOnRetryDialogPop) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnRetryDialogPop.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_NAME, lcaLivenessCheckOnRetryDialogPop.getErrorName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_DETAIL, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str5, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_DETECTION_INFO, lcaLivenessCheckOnRetryDialogPop.getDetectionInfo(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH, String.valueOf(lcaLivenessCheckOnRetryDialogPop.getSplashCount()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SPLASH_INTERRUPT, String.valueOf(lcaLivenessCheckOnRetryDialogPop.getSplashInterruptCount()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$12(String str, String str2, String str3, LcaLivenessCheckResult lcaLivenessCheckResult, String str4, String str5, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        LcaLivenessCheckOnRestartDialogClicked lcaLivenessCheckOnRestartDialogClicked = (LcaLivenessCheckOnRestartDialogClicked) lcaLivenessCheckResult;
        eventParamsList.put(EopTrackEvent.KEY_PROCESS_STATE, lcaLivenessCheckOnRestartDialogClicked.getProcessState(), true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_NAME, lcaLivenessCheckOnRestartDialogClicked.getErrorName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_DETAIL, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str5, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit startLca$lambda$14$lambda$13(String str, String str2, String str3, String str4, LcaLivenessCheckResult lcaLivenessCheckResult, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, str4, false, 4, null);
        EventParamsList.put$default(eventParamsList, "duration", String.valueOf((int) Math.ceil(((LcaLivenessCheckOnSocketConnected) lcaLivenessCheckResult).getDuration() / 1000.0d)), false, 4, null);
        return Unit.INSTANCE;
    }

    public final String convertToErrorDetail(String str, Throwable th, String str2, Integer num, Integer num2) {
        String message;
        String str3;
        if (th == null) {
            str3 = "";
            message = str;
        } else {
            String string = th.toString();
            message = th.getMessage();
            str3 = string;
        }
        return str + ": {\"code\":\"" + str3 + "\",\"msg\":\"" + message + "\", \"di\":\"" + str2 + "\", \"sc\":\"" + num + "\", \"sic\":\"" + num2 + "\"}";
    }
}
