package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.kyc.api.biz.callback.ExtParams;
import com.okinc.ok_kyc_core_api.Playbook;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.ok_kyc_core_api.facial.FacialInfoResult;
import com.okinc.ok_kyc_core_api.model.FeatureRestrictionDialogType;
import com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rTU extends InterfaceC43217rlC {
    java.lang.Object AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void AEQbTJ(@NotNull android.app.Activity activity, @NotNull Playbook playbook, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void AEQbTJ(FragmentActivity fragmentActivity, ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher, FacialExtParams facialExtParams);

    void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1, boolean z, @NotNull java.lang.String str, @NotNull Function1<? super ResultBackStatus, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Function1<? super java.lang.Integer, Unit> function14, java.lang.Boolean bool, java.lang.Integer num);

    FacialInfoResult EZpvd(@NotNull android.os.Bundle bundle);

    void EZpvd(@NotNull android.app.Activity activity, @NotNull java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher, Function0<Unit> function0);

    void EZpvd(@NotNull android.content.Context context, java.lang.Boolean bool);

    void EZpvd(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, ActivityResultLauncher<android.content.Intent> activityResultLauncher, int i, @NotNull Function1<? super java.lang.Boolean, Unit> function1, @NotNull Function1<? super java.lang.Integer, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull FeatureRestrictionDialogType featureRestrictionDialogType, Function1<? super java.lang.Boolean, Unit> function1, Function0<Unit> function0);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull Function0<Unit> function0, java.lang.Boolean bool, @NotNull Function1<? super java.lang.Integer, Unit> function1);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1, java.lang.Boolean bool, java.lang.Integer num, ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Function1<? super java.lang.Integer, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, @NotNull Function1<? super ResultBackStatus, Unit> function14);

    void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull Function1<? super java.lang.Boolean, Unit> function1, java.lang.Boolean bool, @NotNull Function1<? super java.lang.Integer, Unit> function12, @NotNull Function1<? super java.lang.String, Unit> function13, @NotNull Function1<? super ResultBackStatus, Unit> function14);

    void EZpvd(@NotNull java.lang.String str, @NotNull FragmentActivity fragmentActivity, @NotNull Function2<? super java.lang.String, ? super UrlVendorTokenResp, Unit> function2, java.lang.Boolean bool);

    java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull android.net.Uri uri, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void KWHzl(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void KWHzl(@NotNull java.lang.String str, @NotNull FragmentActivity fragmentActivity, ActivityResultLauncher<android.content.Intent> activityResultLauncher, @NotNull Function1<? super java.lang.String, Unit> function1, java.lang.Boolean bool);

    java.lang.Object OLrzqt(@NotNull android.content.Context context, @NotNull android.net.Uri uri, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation);

    void OLrzqt(@NotNull android.app.Activity activity, @NotNull java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> map, ActivityResultLauncher<android.content.Intent> activityResultLauncher);

    void OLrzqt(@NotNull FragmentActivity fragmentActivity, java.lang.Boolean bool, java.lang.Boolean bool2, @NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.Integer, Unit> function1, @NotNull Function1<? super ResultBackStatus, Unit> function12);

    java.lang.Object copydefault(@NotNull android.content.Context context, @NotNull pHD phd, java.lang.Integer num, ExtParams extParams, @NotNull Continuation<? super Unit> continuation);

    void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, FacialExtParams facialExtParams);

    void copydefault(@NotNull FragmentActivity fragmentActivity, boolean z, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, @NotNull Function1<? super java.lang.Integer, Unit> function1);

    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void profileAndCollectNew$default(rTU rtu, android.app.Activity activity, Playbook playbook, java.util.HashMap map, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profileAndCollectNew");
            }
            if ((i & 8) != 0) {
                activityResultLauncher = null;
            }
            rtu.AEQbTJ(activity, playbook, (java.util.HashMap<java.lang.String, java.lang.String>) map, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void profileAndCollectNew$default(rTU rtu, android.app.Activity activity, java.lang.String str, java.util.HashMap map, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: profileAndCollectNew");
            }
            if ((i & 8) != 0) {
                activityResultLauncher = null;
            }
            rtu.OLrzqt(activity, str, map, activityResultLauncher);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openTravelRuleFlow$default(rTU rtu, android.app.Activity activity, java.lang.String str, java.util.HashMap map, ActivityResultLauncher activityResultLauncher, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openTravelRuleFlow");
            }
            rtu.EZpvd(activity, str, map, (i & 8) != 0 ? null : activityResultLauncher, (i & 16) != 0 ? null : function0);
        }

        public static /* synthetic */ void openKYCUserCenter$default(rTU rtu, android.content.Context context, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openKYCUserCenter");
            }
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            rtu.EZpvd(context, bool);
        }

        public static Unit KWHzl(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkDerivativesQuestion$default(rTU rtu, FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher, int i, Function1 function1, Function1 function12, Function1 function13, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkDerivativesQuestion");
            }
            if ((i2 & 2) != 0) {
                activityResultLauncher = null;
            }
            ActivityResultLauncher activityResultLauncher2 = activityResultLauncher;
            if ((i2 & 8) != 0) {
                function1 = new Function1() { // from class: o.rUe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.KWHzl(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
            }
            Function1 function14 = function1;
            if ((i2 & 16) != 0) {
                function12 = new Function1() { // from class: o.rUd
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.djBIcL(((java.lang.Integer) obj2).intValue());
                    }
                };
            }
            Function1 function15 = function12;
            if ((i2 & 32) != 0) {
                function13 = new Function1() { // from class: o.rUf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.djBIcL((java.lang.String) obj2);
                    }
                };
            }
            rtu.EZpvd(fragmentActivity, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher2, i, (Function1<? super java.lang.Boolean, Unit>) function14, (Function1<? super java.lang.Integer, Unit>) function15, (Function1<? super java.lang.String, Unit>) function13);
        }

        public static Unit djBIcL(int i) {
            return Unit.INSTANCE;
        }

        public static Unit djBIcL(java.lang.String str) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void startOKFace$default(rTU rtu, FragmentActivity fragmentActivity, java.lang.String str, ActivityResultLauncher activityResultLauncher, FacialExtParams facialExtParams, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOKFace");
            }
            if ((i & 8) != 0) {
                facialExtParams = null;
            }
            rtu.AEQbTJ(fragmentActivity, str, (ActivityResultLauncher<android.content.Intent>) activityResultLauncher, facialExtParams);
        }

        public static /* synthetic */ void startOKFace$default(rTU rtu, android.content.Context context, java.lang.String str, FacialExtParams facialExtParams, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startOKFace");
            }
            if ((i & 4) != 0) {
                facialExtParams = null;
            }
            rtu.copydefault(context, str, facialExtParams);
        }

        public static Unit AYXKKw(boolean z) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkUKRiskStatus$default(rTU rtu, FragmentActivity fragmentActivity, Function1 function1, java.lang.Boolean bool, java.lang.Integer num, ActivityResultLauncher activityResultLauncher, Function1 function12, Function1 function13, Function1 function14, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUKRiskStatus");
            }
            rtu.EZpvd(fragmentActivity, (i & 2) != 0 ? new Function1() { // from class: o.rTW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.AYXKKw(((java.lang.Boolean) obj2).booleanValue());
                }
            } : function1, (i & 4) != 0 ? java.lang.Boolean.TRUE : bool, (i & 8) != 0 ? null : num, (i & 16) == 0 ? activityResultLauncher : null, (i & 32) != 0 ? new Function1() { // from class: o.rTT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.AhwBna(((java.lang.Integer) obj2).intValue());
                }
            } : function12, (i & 64) != 0 ? new Function1() { // from class: o.rUh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.gEmmrt((java.lang.String) obj2);
                }
            } : function13, (i & 128) != 0 ? new Function1() { // from class: o.rUg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.djBIcL((ResultBackStatus) obj2);
                }
            } : function14);
        }

        public static Unit AhwBna(int i) {
            return Unit.INSTANCE;
        }

        public static Unit gEmmrt(java.lang.String str) {
            return Unit.INSTANCE;
        }

        public static Unit djBIcL(ResultBackStatus resultBackStatus) {
            return Unit.INSTANCE;
        }

        public static Unit OLrzqt() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkFinalConsentStatus$default(rTU rtu, FragmentActivity fragmentActivity, Function0 function0, java.lang.Boolean bool, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkFinalConsentStatus");
            }
            if ((i & 2) != 0) {
                function0 = new Function0() { // from class: o.rTV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rTU.Application.OLrzqt();
                    }
                };
            }
            if ((i & 4) != 0) {
                bool = java.lang.Boolean.TRUE;
            }
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.rUa
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.AYXKKw(((java.lang.Integer) obj2).intValue());
                    }
                };
            }
            rtu.EZpvd(fragmentActivity, (Function0<Unit>) function0, bool, (Function1<? super java.lang.Integer, Unit>) function1);
        }

        public static Unit AYXKKw(int i) {
            return Unit.INSTANCE;
        }

        public static Unit copydefault() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void goToKycOnboarding$default(rTU rtu, FragmentActivity fragmentActivity, java.lang.Boolean bool, java.lang.Boolean bool2, Function0 function0, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToKycOnboarding");
            }
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            java.lang.Boolean bool3 = bool;
            if ((i & 4) != 0) {
                bool2 = java.lang.Boolean.TRUE;
            }
            java.lang.Boolean bool4 = bool2;
            if ((i & 8) != 0) {
                function0 = new Function0() { // from class: o.rUm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return rTU.Application.copydefault();
                    }
                };
            }
            Function0 function02 = function0;
            if ((i & 16) != 0) {
                function1 = new Function1() { // from class: o.rUi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.DbNXlk(((java.lang.Integer) obj2).intValue());
                    }
                };
            }
            Function1 function13 = function1;
            if ((i & 32) != 0) {
                function12 = new Function1() { // from class: o.rUk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.valueOf((ResultBackStatus) obj2);
                    }
                };
            }
            rtu.OLrzqt(fragmentActivity, bool3, bool4, function02, function13, function12);
        }

        public static Unit DbNXlk(int i) {
            return Unit.INSTANCE;
        }

        public static Unit valueOf(ResultBackStatus resultBackStatus) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkAndRestrictsDistributary$default(rTU rtu, FragmentActivity fragmentActivity, Function1 function1, java.lang.Boolean bool, Function1 function12, Function1 function13, Function1 function14, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkAndRestrictsDistributary");
            }
            if ((i & 2) != 0) {
                function1 = new Function1() { // from class: o.rUl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.copydefault(((java.lang.Boolean) obj2).booleanValue());
                    }
                };
            }
            Function1 function15 = function1;
            if ((i & 4) != 0) {
                bool = java.lang.Boolean.TRUE;
            }
            java.lang.Boolean bool2 = bool;
            if ((i & 8) != 0) {
                function12 = new Function1() { // from class: o.rUj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.valueOf(((java.lang.Integer) obj2).intValue());
                    }
                };
            }
            Function1 function16 = function12;
            if ((i & 16) != 0) {
                function13 = new Function1() { // from class: o.rUo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.AYXKKw((java.lang.String) obj2);
                    }
                };
            }
            Function1 function17 = function13;
            if ((i & 32) != 0) {
                function14 = new Function1() { // from class: o.rTX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.AEQbTJ((ResultBackStatus) obj2);
                    }
                };
            }
            rtu.EZpvd(fragmentActivity, (Function1<? super java.lang.Boolean, Unit>) function15, bool2, (Function1<? super java.lang.Integer, Unit>) function16, (Function1<? super java.lang.String, Unit>) function17, (Function1<? super ResultBackStatus, Unit>) function14);
        }

        public static Unit copydefault(boolean z) {
            return Unit.INSTANCE;
        }

        public static Unit valueOf(int i) {
            return Unit.INSTANCE;
        }

        public static Unit AYXKKw(java.lang.String str) {
            return Unit.INSTANCE;
        }

        public static Unit AEQbTJ(ResultBackStatus resultBackStatus) {
            return Unit.INSTANCE;
        }

        public static /* synthetic */ java.lang.Object startAliFacialVerification$default(rTU rtu, android.content.Context context, pHD phd, java.lang.Integer num, ExtParams extParams, Continuation continuation, int i, java.lang.Object obj) {
            if (obj == null) {
                return rtu.copydefault(context, phd, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : extParams, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAliFacialVerification");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openUrlVendor$default(rTU rtu, java.lang.String str, FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher, Function1 function1, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openUrlVendor");
            }
            ActivityResultLauncher activityResultLauncher2 = (i & 4) != 0 ? null : activityResultLauncher;
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.rUc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return rTU.Application.valueOf((java.lang.String) obj2);
                    }
                };
            }
            rtu.KWHzl(str, fragmentActivity, activityResultLauncher2, function1, (i & 16) != 0 ? null : bool);
        }

        public static Unit valueOf(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Unit.INSTANCE;
        }

        public static /* synthetic */ void openUrlVendorNoPollingPage$default(rTU rtu, java.lang.String str, FragmentActivity fragmentActivity, Function2 function2, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openUrlVendorNoPollingPage");
            }
            if ((i & 8) != 0) {
                bool = null;
            }
            rtu.EZpvd(str, fragmentActivity, (Function2<? super java.lang.String, ? super UrlVendorTokenResp, Unit>) function2, bool);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showRegisterOrLoginRestrictionDialog$default(rTU rtu, FragmentActivity fragmentActivity, FeatureRestrictionDialogType featureRestrictionDialogType, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showRegisterOrLoginRestrictionDialog");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                function0 = null;
            }
            rtu.EZpvd(fragmentActivity, featureRestrictionDialogType, (Function1<? super java.lang.Boolean, Unit>) function1, (Function0<Unit>) function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showPermissionConsent$default(rTU rtu, FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showPermissionConsent");
            }
            if ((i & 1) != 0) {
                fragmentActivity = null;
            }
            if ((i & 2) != 0) {
                activityResultLauncher = null;
            }
            rtu.AEQbTJ(fragmentActivity, activityResultLauncher);
        }

        public static Unit AhwBna(ResultBackStatus resultBackStatus) {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.rTU */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void checkUserRiskStatus$default(rTU rtu, FragmentActivity fragmentActivity, Function1 function1, boolean z, java.lang.String str, Function1 function12, Function1 function13, ActivityResultLauncher activityResultLauncher, Function1 function14, java.lang.Boolean bool, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkUserRiskStatus");
            }
            rtu.AEQbTJ(fragmentActivity, function1, z, str, (i & 16) != 0 ? new Function1() { // from class: o.rTY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.AhwBna((ResultBackStatus) obj2);
                }
            } : function12, (i & 32) != 0 ? new Function1() { // from class: o.rTZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.AhwBna((java.lang.String) obj2);
                }
            } : function13, (i & 64) != 0 ? null : activityResultLauncher, (i & 128) != 0 ? new Function1() { // from class: o.rUb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return rTU.Application.AkhnZx(((java.lang.Integer) obj2).intValue());
                }
            } : function14, (i & 256) != 0 ? java.lang.Boolean.FALSE : bool, (i & 512) != 0 ? null : num);
        }

        public static Unit AhwBna(java.lang.String str) {
            return Unit.INSTANCE;
        }

        public static Unit AkhnZx(int i) {
            return Unit.INSTANCE;
        }
    }
}
