package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo;
import com.okinc.ok_kyc_core.feature_restriction.HomeFeatureRestrictionCheckUtil;
import com.okinc.ok_kyc_core.presentation.views.KisaPermissionView;
import com.okinc.ok_kyc_core_api.feature_restriction.ButtonActionType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C43662rtX;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rCC {
    public static final rCC copydefault = new rCC();

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HomeFeatureRestrictionCheckUtil.DialogType.values().length];
            try {
                iArr[HomeFeatureRestrictionCheckUtil.DialogType.CEFI_FORBIDDEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HomeFeatureRestrictionCheckUtil.DialogType.REGISTER_FORBIDDEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private rCC() {
    }

    public static /* synthetic */ android.app.Dialog createCefiForbiddenDialog$default(rCC rcc, FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, java.lang.Boolean bool, boolean z, InterfaceC42483rUn interfaceC42483rUn, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return rcc.AEQbTJ(fragmentActivity, featureRestrictionInfo, bool, z, interfaceC42483rUn);
    }

    public final android.app.Dialog AEQbTJ(FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, java.lang.Boolean bool, final boolean z, final InterfaceC42483rUn interfaceC42483rUn) {
        java.lang.Integer kycLevel;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        android.view.View viewInflate = android.view.LayoutInflater.from(fragmentActivity).inflate(C43662rtX.TaskDescription.UrRBLY, (android.view.ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        ((wYK) viewInflate.findViewById(C43662rtX.ActionBar.QHmsKR)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.rCB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                rCC.AEQbTJ(booleanRef, compoundButton, z2);
            }
        });
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        viewOnClickListenerC54939xaY.KWHzl("OKComplianceFRDialog");
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.spnCvw), EZpvd(fragmentActivity, featureRestrictionInfo));
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        if (!z) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.zLjUOn), new View.OnClickListener() { // from class: o.rCz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rCC.EZpvd(interfaceC42483rUn, booleanRef, viewOnClickListenerC54939xaY, view);
                }
            });
        } else if (featureRestrictionInfo == null || (kycLevel = featureRestrictionInfo.getKycLevel()) == null || kycLevel.intValue() < 2) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.DCUTEIdCUTEI), new View.OnClickListener() { // from class: o.rCy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rCC.copydefault(interfaceC42483rUn, booleanRef, viewOnClickListenerC54939xaY, view);
                }
            });
        }
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.fARcdN), new View.OnClickListener() { // from class: o.rCA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rCC.AEQbTJ(viewOnClickListenerC54939xaY, interfaceC42483rUn, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C43662rtX.Dialog.ixgjPv), new View.OnClickListener() { // from class: o.rCF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rCC.copydefault(z, booleanRef, viewOnClickListenerC54939xaY, view);
            }
        });
        if (z) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_restricted_reminder_verify_popup_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
        } else {
            TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("app_restricted_reminder_register_popup_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1) null, 2, (java.lang.Object) null);
        }
        return viewOnClickListenerC54939xaY;
    }

    public static final void AEQbTJ(Ref.BooleanRef booleanRef, android.widget.CompoundButton compoundButton, boolean z) {
        booleanRef.element = z;
        SPUtils.put("forbidden_dialog_time", java.lang.Long.valueOf(z ? java.lang.System.currentTimeMillis() : 0L));
    }

    public static final void copydefault(InterfaceC42483rUn interfaceC42483rUn, Ref.BooleanRef booleanRef, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        interfaceC42483rUn.KWHzl(ButtonActionType.KYC_USER_CENTER);
        HomeFeatureRestrictionCheckUtil.AEQbTJ.EZpvd("app_restricted_reminder_verify_popup_verify_click", booleanRef.element);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(InterfaceC42483rUn interfaceC42483rUn, Ref.BooleanRef booleanRef, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        interfaceC42483rUn.KWHzl(ButtonActionType.SIGN_UP);
        HomeFeatureRestrictionCheckUtil.AEQbTJ.EZpvd("app_restricted_reminder_register_popup_register_click", booleanRef.element);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, InterfaceC42483rUn interfaceC42483rUn, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        interfaceC42483rUn.KWHzl(ButtonActionType.WEB3);
    }

    public static final void copydefault(boolean z, Ref.BooleanRef booleanRef, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (z) {
            HomeFeatureRestrictionCheckUtil.AEQbTJ.EZpvd("app_restricted_reminder_verify_popup_dismiss_click", booleanRef.element);
        } else {
            HomeFeatureRestrictionCheckUtil.AEQbTJ.EZpvd("app_restricted_reminder_register_popup_dismiss_click", booleanRef.element);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ android.app.Dialog createRegisterForbiddenDialog$default(rCC rcc, FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return rcc.EZpvd(fragmentActivity, featureRestrictionInfo, bool);
    }

    public final android.app.Dialog EZpvd(final FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, java.lang.Boolean bool) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(fragmentActivity);
        viewOnClickListenerC54939xaY.KWHzl("OKComplianceRestrictedDialog");
        java.lang.String province = featureRestrictionInfo != null ? featureRestrictionInfo.getProvince() : null;
        if (province == null) {
            province = "";
        }
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C43662rtX.Dialog.uzCIH), C33069mpW.OLrzqt(C33070mpX.AYXKKw(C43662rtX.Dialog.fIwbmz), C56423yEv.EZpvd(C56390yDp.OLrzqt("Province", province))));
        if (!Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.fARcdN), new View.OnClickListener() { // from class: o.rCE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    rCC.copydefault(viewOnClickListenerC54939xaY, fragmentActivity, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C43662rtX.Dialog.AuCTel), new View.OnClickListener() { // from class: o.rCH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                rCC.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        return viewOnClickListenerC54939xaY;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, FragmentActivity fragmentActivity, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        HomeFeatureRestrictionCheckUtil.AEQbTJ.EZpvd(fragmentActivity);
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void showDialog$default(rCC rcc, FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, HomeFeatureRestrictionCheckUtil.DialogType dialogType, java.lang.Boolean bool, boolean z, InterfaceC42483rUn interfaceC42483rUn, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        rcc.KWHzl(fragmentActivity, featureRestrictionInfo, dialogType, bool, z, interfaceC42483rUn);
    }

    public final void KWHzl(@NotNull FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, @NotNull HomeFeatureRestrictionCheckUtil.DialogType dialogType, java.lang.Boolean bool, boolean z, @NotNull InterfaceC42483rUn interfaceC42483rUn) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(dialogType, "");
        Intrinsics.checkNotNullParameter(interfaceC42483rUn, "");
        if (C42459rTq.KWHzl.DbNXlk()) {
            pUU.EZpvd("HomeFeatureRestrictionUIManager", "Compliance E2E | e2e_disable_restricted_location_pop_up -> Disabled");
        } else {
            if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
                return;
            }
            EZpvd(fragmentActivity, featureRestrictionInfo, dialogType, bool, z, interfaceC42483rUn).show();
        }
    }

    public static /* synthetic */ android.app.Dialog createDialog$default(rCC rcc, FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, HomeFeatureRestrictionCheckUtil.DialogType dialogType, java.lang.Boolean bool, boolean z, InterfaceC42483rUn interfaceC42483rUn, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        return rcc.EZpvd(fragmentActivity, featureRestrictionInfo, dialogType, bool, z, interfaceC42483rUn);
    }

    public final android.app.Dialog EZpvd(@NotNull FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo, @NotNull HomeFeatureRestrictionCheckUtil.DialogType dialogType, java.lang.Boolean bool, boolean z, @NotNull InterfaceC42483rUn interfaceC42483rUn) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(dialogType, "");
        Intrinsics.checkNotNullParameter(interfaceC42483rUn, "");
        int i = Activity.copydefault[dialogType.ordinal()];
        if (i == 1) {
            return AEQbTJ(fragmentActivity, featureRestrictionInfo, bool, z, interfaceC42483rUn);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return EZpvd(fragmentActivity, featureRestrictionInfo, bool);
    }

    public final void copydefault(@NotNull android.content.Context context, ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(context, "");
        if (C42459rTq.KWHzl.fetchVPNInfo()) {
            pUU.EZpvd("HomeFeatureRestrictionUIManager", "Compliance E2E | e2e_disable_kisa_compliance_pop_up -> Disabled");
            return;
        }
        android.content.Intent intentEZpvd = rPA.Companion.EZpvd(context, EZpvd());
        if (activityResultLauncher != null) {
            try {
                activityResultLauncher.launch(intentEZpvd);
                return;
            } catch (java.lang.Exception e) {
                pUU.EZpvd("showKisaPermissionActivity", "activityResultLauncher error | " + e.getMessage());
                return;
            }
        }
        context.startActivity(intentEZpvd);
    }

    public final java.util.List<KisaPermissionView.PermissionItem> EZpvd() {
        return yDY.gEmmrt(new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.QSBOWP, C43662rtX.Dialog.AxsJAYsNCnLh, C43662rtX.Dialog.flVtFt), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.dmfpNf, C43662rtX.Dialog.accept, C43662rtX.Dialog.fvQaOB), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.AkhnZx, C43662rtX.Dialog.RlQdEF, C43662rtX.Dialog.gGvvIC), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.aJFbMH, C43662rtX.Dialog.DAIeex, C43662rtX.Dialog.gasjUx), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.GiPPlLQAswws, C43662rtX.Dialog.DCJXGO, C43662rtX.Dialog.iRxXKY), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.gFTCsA, C43662rtX.Dialog.DarRvM, C43662rtX.Dialog.AxsJAYaxsJAY), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.OYuSWK, C43662rtX.Dialog.DXXBbs, C43662rtX.Dialog.hUfVAv), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.hUfVAv, C43662rtX.Dialog.OqFWZa, C43662rtX.Dialog.gkJEwt), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.UeEOUB, C43662rtX.Dialog.ODWQjV, C43662rtX.Dialog.iZzfmt), new KisaPermissionView.PermissionItem(C52761wXj.TaskDescription.fDu, C43662rtX.Dialog.zuWLRA, C43662rtX.Dialog.QKudOq));
    }

    public final java.lang.CharSequence EZpvd(FragmentActivity fragmentActivity, FeatureRestrictionInfo featureRestrictionInfo) {
        java.lang.String strValueOf;
        if (Intrinsics.EZpvd((java.lang.Object) (featureRestrictionInfo != null ? featureRestrictionInfo.getCountry() : null), (java.lang.Object) "HK")) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C43662rtX.Dialog.DGOPHZ);
            return C33574myy.setupSpanStyles$default(C33069mpW.KWHzl(fragmentActivity, C43662rtX.Dialog.zblBkD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("textLink", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.rCD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return rCC.copydefault((java.util.List) obj);
                }
            }, 14, null);
        }
        java.lang.String countryName = featureRestrictionInfo != null ? featureRestrictionInfo.getCountryName() : null;
        java.lang.String province = featureRestrictionInfo != null ? featureRestrictionInfo.getProvince() : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) province) && C33129mqd.OLrzqt((java.lang.CharSequence) countryName)) {
            strValueOf = countryName + " " + province;
        } else {
            strValueOf = java.lang.String.valueOf(countryName);
        }
        return C33069mpW.KWHzl(fragmentActivity, C43662rtX.Dialog.WS, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("countryCode", strValueOf)));
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strCopydefault = C42459rTq.KWHzl.copydefault();
        if (strCopydefault == null || strCopydefault.length() == 0) {
            strCopydefault = "/help/withdrawal-of-okx-hks-vasp-license-application";
        }
        java.lang.String strAEQbTJ = C6813aWU.AEQbTJ(strCopydefault);
        list.add(new C43740ruw(strAEQbTJ));
        pUU.EZpvd("HomeFeatureRestrictionUIManager", "fullUrlPath: " + strAEQbTJ);
        return Unit.INSTANCE;
    }
}
