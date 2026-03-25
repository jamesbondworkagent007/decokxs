package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.web3Uilib.bean.RiskPageInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17944fYb {
    public static final C17944fYb AEQbTJ = new C17944fYb();

    private C17944fYb() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.fYb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showSafeRiskTipProcess$default(C17944fYb c17944fYb, FragmentActivity fragmentActivity, androidx.fragment.app.FragmentManager fragmentManager, int i, RiskPageInfoBean riskPageInfoBean, C9789bcH c9789bcH, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 32) != 0) {
            function0 = null;
        }
        c17944fYb.OLrzqt(fragmentActivity, fragmentManager, i, riskPageInfoBean, c9789bcH, function0);
    }

    /* JADX INFO: renamed from: o.fYb$Activity */
    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ C9789bcH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C9789bcH c9789bcH) {
            this.copydefault = c9789bcH;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            C9789bcH c9789bcH = this.copydefault;
            if (c9789bcH instanceof C9870bdj) {
                C32866mlf.onEvent$default("Confirmationpage_NormalBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Activity.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        copydefault(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_continue_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9871bdk) {
                C32866mlf.onEvent$default("Confirmationpage_ZeroValuePurchaseAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Activity.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_continue_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9873bdm) {
                C32866mlf.onEvent$default("Confirmationpage_WithdrawalAddressChangeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Activity.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_continue_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9814bcg) {
                C32866mlf.onEvent$default("Confirmationpage_EOAAuthorizationAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Activity.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        copydefault(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_continue_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9839bdE) {
                C32866mlf.onEvent$default("Confirmationpage_TronAccountPermissionUpgradeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Activity.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        KWHzl(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_continue_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fYb$Application */
    public static final class Application implements Function0<Unit> {
        public final /* synthetic */ C9789bcH KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C9789bcH c9789bcH) {
            this.KWHzl = c9789bcH;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }

        public final void EZpvd() {
            C9789bcH c9789bcH = this.KWHzl;
            if (c9789bcH instanceof C9870bdj) {
                C32866mlf.onEvent$default("Confirmationpage_NormalBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Application.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9871bdk) {
                C32866mlf.onEvent$default("Confirmationpage_ZeroValuePurchaseAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Application.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        copydefault(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9873bdm) {
                C32866mlf.onEvent$default("Confirmationpage_WithdrawalAddressChangeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Application.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9814bcg) {
                C32866mlf.onEvent$default("Confirmationpage_EOAAuthorizationAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Application.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        EZpvd(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void EZpvd(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9839bdE) {
                C32866mlf.onEvent$default("Confirmationpage_TronAccountPermissionUpgradeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.Application.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fYb$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ C9789bcH copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(C9789bcH c9789bcH) {
            this.copydefault = c9789bcH;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            C9789bcH c9789bcH = this.copydefault;
            if (c9789bcH instanceof C9870bdj) {
                C32866mlf.onEvent$default("Confirmationpage_NormalBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.StateListAnimator.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        KWHzl(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9871bdk) {
                C32866mlf.onEvent$default("Confirmationpage_ZeroValuePurchaseAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.StateListAnimator.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        EZpvd(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void EZpvd(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9873bdm) {
                C32866mlf.onEvent$default("Confirmationpage_WithdrawalAddressChangeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.StateListAnimator.1
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9814bcg) {
                C32866mlf.onEvent$default("Confirmationpage_EOAAuthorizationAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.StateListAnimator.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9839bdE) {
                C32866mlf.onEvent$default("Confirmationpage_TronAccountPermissionUpgradeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.StateListAnimator.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        copydefault(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_advanced_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fYb$TaskDescription */
    public static final class TaskDescription implements Function0<Unit> {
        public final /* synthetic */ C9789bcH KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C9789bcH c9789bcH) {
            this.KWHzl = c9789bcH;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C9789bcH c9789bcH = this.KWHzl;
            if (c9789bcH instanceof C9870bdj) {
                if (((C9870bdj) c9789bcH).AEQbTJ()) {
                    C32866mlf.onEvent$default("Confirmationpage_HighAccuracyBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.5
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                            copydefault(eventParamsList);
                            return Unit.INSTANCE;
                        }

                        public final void copydefault(EventParamsList eventParamsList) {
                            Intrinsics.checkNotNullParameter(eventParamsList, "");
                            eventParamsList.put("is_click_cancel_link", "true", true);
                        }
                    }, 1, (java.lang.Object) null);
                    return;
                } else {
                    C32866mlf.onEvent$default("Confirmationpage_NormalBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.1
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                            copydefault(eventParamsList);
                            return Unit.INSTANCE;
                        }

                        public final void copydefault(EventParamsList eventParamsList) {
                            Intrinsics.checkNotNullParameter(eventParamsList, "");
                            eventParamsList.put("is_click_cancel_link", "true", true);
                        }
                    }, 1, (java.lang.Object) null);
                    return;
                }
            }
            if (c9789bcH instanceof C9831bcx) {
                C32866mlf.onEvent$default("Confirmationpage_EthsignSignatureAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.2
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9871bdk) {
                C32866mlf.onEvent$default("Confirmationpage_ZeroValuePurchaseAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.3
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        KWHzl(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9877bdq) {
                C32866mlf.onEvent$default("Confirmationpage_SOLAccountOwnershipChangeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.4
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
            if (c9789bcH instanceof C9873bdm) {
                C32866mlf.onEvent$default("Confirmationpage_WithdrawalAddressChangeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.6
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        OLrzqt(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9814bcg) {
                C32866mlf.onEvent$default("Confirmationpage_EOAAuthorizationAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.8
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        copydefault(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void copydefault(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            } else if (c9789bcH instanceof C9839bdE) {
                C32866mlf.onEvent$default("Confirmationpage_TronAccountPermissionUpgradeAlert_Popup_View", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.fYb.TaskDescription.7
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                        AEQbTJ(eventParamsList);
                        return Unit.INSTANCE;
                    }

                    public final void AEQbTJ(EventParamsList eventParamsList) {
                        Intrinsics.checkNotNullParameter(eventParamsList, "");
                        eventParamsList.put("is_click_cancel_link", "true", true);
                    }
                }, 1, (java.lang.Object) null);
            }
        }
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.IdRes int i, @NotNull RiskPageInfoBean riskPageInfoBean, @NotNull C9789bcH c9789bcH, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(riskPageInfoBean, "");
        Intrinsics.checkNotNullParameter(c9789bcH, "");
        C57445yiZ.copydefault.copydefault(fragmentActivity, fragmentManager, i, riskPageInfoBean, new TaskDescription(c9789bcH), new Application(c9789bcH), new Activity(c9789bcH), new StateListAnimator(c9789bcH), function0);
    }
}
