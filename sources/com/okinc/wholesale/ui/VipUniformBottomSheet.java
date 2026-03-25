package com.okinc.wholesale.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.okinc.business.rewards.wholesale.VipLandingPageBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core_api.ResultBackStatus;
import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserProfile;
import com.okinc.wholesale.bean.ActivateResult;
import com.okinc.wholesale.bean.InviteInfo;
import com.okinc.wholesale.bean.VipActivateConfig;
import com.okinc.wholesale.net.UDGrowthImageApiService;
import com.okinc.wholesale.ui.VipUniformBottomSheet;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC43238rlX;
import o.ActivityC57550ykY;
import o.C28102kOz;
import o.C32979mnm;
import o.C33024moe;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33492mxV;
import o.C38307pTy;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55051xce;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55328xhq;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56444yFp;
import o.C56548yJl;
import o.C57626ylv;
import o.C57627ylw;
import o.C58113yvE;
import o.C58156yvv;
import o.C7323ahf;
import o.InterfaceC43294rma;
import o.InterfaceC47230tmC;
import o.InterfaceC47278tmy;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58217yxC;
import o.InterfaceC7298ahG;
import o.kOH;
import o.kOU;
import o.pTB;
import o.pUU;
import o.rTU;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class VipUniformBottomSheet extends BottomSheetDialogFragment {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public InterfaceC58217yxC AEQbTJ;
    public boolean AYXKKw;
    public VipLandingPageBean DbNXlk;
    public kOU KWHzl;
    public VipActivateConfig OLrzqt;
    public Boolean djBIcL;
    public int gEmmrt;
    public final Application valueOf = new Application();
    public PageType EZpvd = PageType.MAC;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.yll
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return VipUniformBottomSheet.DbNXlk();
        }
    });

    public static final class Application extends BottomSheetBehavior.BottomSheetCallback {
        public Application() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            Intrinsics.checkNotNullParameter(view, "");
            if (i == 5) {
                VipUniformBottomSheet vipUniformBottomSheet = VipUniformBottomSheet.this;
                vipUniformBottomSheet.KWHzl(vipUniformBottomSheet.gEmmrt);
            } else {
                VipUniformBottomSheet.this.AEQbTJ(C33492mxV.OLrzqt());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
            Intrinsics.checkNotNullParameter(view, "");
            VipUniformBottomSheet.this.AEQbTJ(C33492mxV.OLrzqt());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PageType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PageType[] $VALUES;
        public static final PageType MAC = new PageType("MAC", 0);
        public static final PageType TRIAL = new PageType("TRIAL", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PageType[] $values() {
            return new PageType[]{MAC, TRIAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PageType> getEntries() {
            return $ENTRIES;
        }

        private PageType(String str, int i) {
        }

        static {
            PageType[] pageTypeArr$values = $values();
            $VALUES = pageTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pageTypeArr$values);
        }

        public static PageType valueOf(String str) {
            return (PageType) Enum.valueOf(PageType.class, str);
        }

        public static PageType[] values() {
            return (PageType[]) $VALUES.clone();
        }
    }

    private final InterfaceC47278tmy values() {
        return (InterfaceC47278tmy) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC47278tmy DbNXlk() {
        return ((InterfaceC47230tmC) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), InterfaceC47230tmC.class)).fmB();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wholesale.ui.VipUniformBottomSheet.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final VipUniformBottomSheet EZpvd(@NotNull VipActivateConfig vipActivateConfig) {
            Intrinsics.checkNotNullParameter(vipActivateConfig, "");
            VipUniformBottomSheet vipUniformBottomSheet = new VipUniformBottomSheet();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vipActivateConfig", vipActivateConfig);
            vipUniformBottomSheet.setArguments(bundle);
            return vipUniformBottomSheet;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate(Bundle bundle) {
        VipLandingPageBean vipLandingPageBean;
        Window window;
        super.onCreate(bundle);
        int statusBarColor = 0;
        setStyle(0, C52761wXj.LoaderManager.call);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            statusBarColor = window.getStatusBarColor();
        }
        this.gEmmrt = statusBarColor;
        int i = Build.VERSION.SDK_INT;
        VipActivateConfig vipActivateConfig = null;
        if (i >= 33) {
            Bundle arguments = getArguments();
            vipLandingPageBean = arguments != null ? (VipLandingPageBean) arguments.getParcelable("wholeSaleVipLandingPageBean", VipLandingPageBean.class) : null;
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                vipLandingPageBean = (VipLandingPageBean) arguments2.getParcelable("wholeSaleVipLandingPageBean");
            }
        }
        this.DbNXlk = vipLandingPageBean;
        if (i >= 33) {
            Bundle arguments3 = getArguments();
            if (arguments3 != null) {
                vipActivateConfig = (VipActivateConfig) arguments3.getParcelable("vipActivateConfig", VipActivateConfig.class);
            }
        } else {
            Bundle arguments4 = getArguments();
            if (arguments4 != null) {
                vipActivateConfig = (VipActivateConfig) arguments4.getParcelable("vipActivateConfig");
            }
        }
        this.OLrzqt = vipActivateConfig;
        this.EZpvd = this.DbNXlk != null ? PageType.MAC : PageType.TRIAL;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        kOU kouAEQbTJ = kOU.AEQbTJ(layoutInflater, viewGroup, false);
        this.KWHzl = kouAEQbTJ;
        if (kouAEQbTJ == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ConstraintLayout root = kouAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        FrameLayout frameLayout;
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            AEQbTJ(window);
        }
        Dialog dialog2 = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog2 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog2 : null;
        if (bottomSheetDialog != null && (frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet)) != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                layoutParams.width = -1;
            } else {
                layoutParams = null;
            }
            frameLayout.setLayoutParams(layoutParams);
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "");
            bottomSheetBehaviorFrom.setFitToContents(false);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
            bottomSheetBehaviorFrom.setDraggable(false);
            bottomSheetBehaviorFrom.setState(3);
            Resources resources = requireContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            bottomSheetBehaviorFrom.setPeekHeight(C55302xhQ.AEQbTJ(resources));
            bottomSheetBehaviorFrom.setExpandedOffset(0);
        }
        Dialog dialog3 = getDialog();
        BottomSheetDialog bottomSheetDialog2 = dialog3 instanceof BottomSheetDialog ? (BottomSheetDialog) dialog3 : null;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog2 != null ? bottomSheetDialog2.getBehavior() : null;
        if (behavior != null) {
            behavior.removeBottomSheetCallback(this.valueOf);
        }
        if (behavior != null) {
            behavior.addBottomSheetCallback(this.valueOf);
        }
        AEQbTJ(C33492mxV.OLrzqt());
    }

    public final void AEQbTJ(boolean z) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        if (this.AYXKKw && window.getStatusBarColor() == 0 && Intrinsics.EZpvd(this.djBIcL, Boolean.valueOf(z))) {
            return;
        }
        this.AYXKKw = true;
        this.djBIcL = Boolean.valueOf(z);
        window.setStatusBarColor(0);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                if (z) {
                    insetsController.setSystemBarsAppearance(0, 8);
                    return;
                } else {
                    insetsController.setSystemBarsAppearance(8, 8);
                    return;
                }
            }
            return;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }

    public final void KWHzl(int i) {
        Window window;
        boolean z = ColorUtils.calculateLuminance(i) < 0.5d;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(i);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                if (z) {
                    insetsController.setSystemBarsAppearance(0, 8);
                    return;
                } else {
                    insetsController.setSystemBarsAppearance(8, 8);
                    return;
                }
            }
            return;
        }
        int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
        window.getDecorView().setSystemUiVisibility(z ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext(), getTheme());
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.yli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                VipUniformBottomSheet.copydefault(dialogInterface);
            }
        });
        Window window = bottomSheetDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = bottomSheetDialog.getWindow();
        if (window2 != null) {
            AEQbTJ(window2);
        }
        return bottomSheetDialog;
    }

    public static final void copydefault(DialogInterface dialogInterface) {
        Intrinsics.copydefault(dialogInterface, "");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogInterface;
        FrameLayout frameLayout = (FrameLayout) bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        if (frameLayout != null) {
            BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "");
            bottomSheetBehaviorFrom.setState(3);
            bottomSheetBehaviorFrom.setSkipCollapsed(true);
        }
        View viewFindViewById = bottomSheetDialog.findViewById(R.id.container);
        if (viewFindViewById != null) {
            viewFindViewById.setFitsSystemWindows(false);
            viewFindViewById.setPadding(0, 0, 0, 0);
        }
        View viewFindViewById2 = bottomSheetDialog.findViewById(R.id.coordinator);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setFitsSystemWindows(false);
            viewFindViewById2.setPadding(0, 0, 0, 0);
        }
        View viewFindViewById3 = bottomSheetDialog.findViewById(R.id.design_bottom_sheet);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setFitsSystemWindows(false);
            viewFindViewById3.setPadding(0, 0, 0, 0);
        }
    }

    public final void AEQbTJ(Window window) {
        window.addFlags(768);
        window.clearFlags(65536);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = i >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes.layoutInDisplayCutoutMode != i2) {
                attributes.layoutInDisplayCutoutMode = i2;
                window.setAttributes(attributes);
            }
        }
        if (i >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() == null || this.KWHzl == null) {
            return;
        }
        KWHzl();
        kOU kou = this.KWHzl;
        if (kou != null) {
            C55051xce c55051xce = C55051xce.OLrzqt;
            Typeface typefaceDjBIcL = c55051xce.djBIcL();
            if (typefaceDjBIcL != null) {
                kou.gEmmrt.setTypeface(typefaceDjBIcL);
                kou.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            }
            Typeface typefaceCopydefault = c55051xce.copydefault();
            if (typefaceCopydefault != null) {
                kou.djBIcL.setTypeface(typefaceCopydefault);
                kou.djBIcL.setTextColor(C33070mpX.copydefault(C28102kOz.Application.KWHzl));
            }
        }
        if (this.EZpvd == PageType.MAC) {
            gEmmrt();
        } else {
            AhwBna();
        }
        isConnected();
        view.post(new Runnable() { // from class: o.ylm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                VipUniformBottomSheet.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(VipUniformBottomSheet vipUniformBottomSheet) {
        rVN.reportFullyDrawn$default((Fragment) vipUniformBottomSheet, true, (String) null, 2, (Object) null);
    }

    public final void KWHzl() {
        final kOU kou = this.KWHzl;
        if (kou == null) {
            return;
        }
        final ImageView imageView = kou.AhwBna;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        final ImageView imageView2 = kou.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        kou.getRoot().post(new Runnable() { // from class: o.ylh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                VipUniformBottomSheet.AEQbTJ(kou, imageView, imageView2);
            }
        });
    }

    public static final void AEQbTJ(kOU kou, ImageView imageView, ImageView imageView2) {
        float fKWHzl = C56548yJl.KWHzl((imageView.getBottom() + C55298xhM.dp2pxFloat$default(340.0f, null, 1, null)) - imageView2.getTop(), 0.0f, C56548yJl.copydefault(kou.getRoot().getHeight(), 0.0f));
        if (imageView2.getTranslationY() == fKWHzl) {
            return;
        }
        imageView2.setTranslationY(fKWHzl);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.EZpvd != PageType.MAC) {
            VipActivateConfig vipActivateConfig = this.OLrzqt;
            if (vipActivateConfig == null) {
                return;
            }
            C57626ylv.AEQbTJ.KWHzl(vipActivateConfig.getActivateState());
            return;
        }
        VipLandingPageBean vipLandingPageBean = this.DbNXlk;
        if (vipLandingPageBean == null) {
            return;
        }
        Integer vipLevel = vipLandingPageBean.getVipLevel();
        C57626ylv.AEQbTJ.KWHzl((vipLevel != null && vipLevel.intValue() == 1) ? "viptrial" : "levelup");
    }

    public final void gEmmrt() {
        kOU kou;
        Map mapEZpvd;
        Pair pairOLrzqt;
        VipLandingPageBean vipLandingPageBean = this.DbNXlk;
        if (vipLandingPageBean == null || (kou = this.KWHzl) == null) {
            return;
        }
        kou.copydefault.setAnimation(C33492mxV.OLrzqt() ? C28102kOz.TaskDescription.copydefault : C28102kOz.TaskDescription.EZpvd);
        kou.copydefault.playAnimation();
        String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(vipLandingPageBean.getDiscountPercentage()), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 28, null);
        Integer vipLevel = vipLandingPageBean.getVipLevel();
        if (vipLevel != null && vipLevel.intValue() == 1) {
            mapEZpvd = C56424yEw.gEmmrt(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(vipLandingPageBean.getVipLevel())), C56390yDp.OLrzqt("percentage", iCUPercent$default));
        } else {
            mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("percentage", iCUPercent$default));
        }
        Integer vipLevel2 = vipLandingPageBean.getVipLevel();
        if (vipLevel2 != null && vipLevel2.intValue() == 1) {
            pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(C28102kOz.Fragment.getFieldNames), Integer.valueOf(C28102kOz.Fragment.getNewProxyInstance));
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(C28102kOz.Fragment.getFieldNames), Integer.valueOf(C28102kOz.Fragment.iwGUEr));
        }
        int iIntValue = ((Number) pairOLrzqt.component1()).intValue();
        int iIntValue2 = ((Number) pairOLrzqt.component2()).intValue();
        TextView textView = kou.gEmmrt;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        textView.setText(C33069mpW.copydefault(resources, iIntValue, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(vipLandingPageBean.getVipLevel())))));
        TextView textView2 = kou.djBIcL;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "");
        textView2.setText(C33069mpW.copydefault(resources2, iIntValue2, (Map<String, ? extends Object>) mapEZpvd));
        kou.AEQbTJ.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.djBIcL));
        kou.KWHzl.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.KWHzl));
    }

    public final void AhwBna() {
        kOU kou;
        VipActivateConfig vipActivateConfig = this.OLrzqt;
        if (vipActivateConfig == null || (kou = this.KWHzl) == null) {
            return;
        }
        kou.copydefault.setAnimation((C33492mxV.OLrzqt() || vipActivateConfig.isFromLanding()) ? C28102kOz.TaskDescription.copydefault : C28102kOz.TaskDescription.EZpvd);
        int activateState = vipActivateConfig.getActivateState();
        if (activateState == 1) {
            copydefault(vipActivateConfig);
        } else if (activateState == 2) {
            kou.copydefault.playAnimation();
            EZpvd(vipActivateConfig);
        } else {
            copydefault(vipActivateConfig);
        }
    }

    public final void copydefault(VipActivateConfig vipActivateConfig) {
        String strCopydefault;
        String feePercentage;
        kOU kou = this.KWHzl;
        if (kou != null) {
            String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(vipActivateConfig.getFeePercentage()), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 28, null);
            String inviterName = vipActivateConfig.getInviterName();
            if (inviterName == null) {
                inviterName = "";
            }
            Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("vipName", inviterName), C56390yDp.OLrzqt("percentage", iCUPercent$default));
            if (inviterName.length() == 0 && ((feePercentage = vipActivateConfig.getFeePercentage()) == null || feePercentage.length() == 0)) {
                strCopydefault = C33070mpX.AYXKKw(C28102kOz.Fragment.valueOf);
            } else {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                strCopydefault = C33069mpW.copydefault(resources, C28102kOz.Fragment.gEmmrt, (Map<String, ? extends Object>) mapGEmmrt);
            }
            kou.gEmmrt.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.values));
            kou.djBIcL.setText(strCopydefault);
            kou.AEQbTJ.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.AhwBna));
            kou.KWHzl.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.AYXKKw));
        }
    }

    public final void EZpvd(VipActivateConfig vipActivateConfig) {
        kOU kou = this.KWHzl;
        if (kou != null) {
            TextView textView = kou.gEmmrt;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            textView.setText(C33069mpW.copydefault(resources, C28102kOz.Fragment.AkhnZx, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("vipLevel", C33129mqd.gEmmrt(vipActivateConfig.getVipLevel())))));
            String trialDays = vipActivateConfig.getTrialDays();
            if (trialDays == null) {
                trialDays = "";
            }
            Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("num", trialDays));
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "");
            kou.djBIcL.setText(C33069mpW.copydefault(resources2, C28102kOz.Fragment.isConnected, (Map<String, ? extends Object>) mapEZpvd));
            kou.AEQbTJ.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.djBIcL));
            kou.KWHzl.setText(C33070mpX.AYXKKw(C28102kOz.Fragment.KWHzl));
        }
    }

    private final void isConnected() {
        kOU kou = this.KWHzl;
        if (kou == null) {
            return;
        }
        kou.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ylg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                VipUniformBottomSheet.djBIcL(this.OLrzqt, view);
            }
        });
        if (this.EZpvd == PageType.MAC) {
            AYXKKw();
        } else {
            djBIcL();
        }
    }

    public static final void djBIcL(VipUniformBottomSheet vipUniformBottomSheet, View view) {
        vipUniformBottomSheet.valueOf();
    }

    public final void AYXKKw() {
        kOU kou = this.KWHzl;
        if (kou == null) {
            return;
        }
        kou.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.yls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                VipUniformBottomSheet.AhwBna(this.KWHzl, view);
            }
        });
        kou.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.ylj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                VipUniformBottomSheet.gEmmrt(this.KWHzl, view);
            }
        });
    }

    public static final void AhwBna(VipUniformBottomSheet vipUniformBottomSheet, View view) {
        FragmentActivity activity;
        VipLandingPageBean vipLandingPageBean = vipUniformBottomSheet.DbNXlk;
        if (vipLandingPageBean == null || (activity = vipUniformBottomSheet.getActivity()) == null) {
            return;
        }
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), activity, vipLandingPageBean.getButton().getHref(), null, new Function1() { // from class: o.yln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VipUniformBottomSheet.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
        vipUniformBottomSheet.valueOf();
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void gEmmrt(VipUniformBottomSheet vipUniformBottomSheet, View view) {
        boolean zIsVip;
        String str;
        UserProfile profile;
        VipLandingPageBean vipLandingPageBean = vipUniformBottomSheet.DbNXlk;
        if (vipLandingPageBean != null) {
            User userOLrzqt = vipUniformBottomSheet.values().OLrzqt();
            Integer vipLevel = vipLandingPageBean.getVipLevel();
            if (vipLevel != null) {
                zIsVip = vipLevel.intValue() > 0;
            } else if (userOLrzqt != null) {
                zIsVip = userOLrzqt.isVip();
            }
            boolean z = zIsVip;
            String nickname = vipLandingPageBean.getShareInfo().getNickname();
            if (!C33129mqd.OLrzqt((CharSequence) nickname)) {
                nickname = null;
            }
            if (nickname != null) {
                str = nickname;
            } else if (userOLrzqt != null) {
                nickname = userOLrzqt.getNickname();
                str = nickname;
            } else {
                str = null;
            }
            String avatar = vipLandingPageBean.getShareInfo().getAvatar();
            if (!C33129mqd.OLrzqt((CharSequence) avatar)) {
                avatar = null;
            }
            String profilePictureUrl = avatar == null ? (userOLrzqt == null || (profile = userOLrzqt.getProfile()) == null) ? null : profile.getProfilePictureUrl() : avatar;
            String url = vipLandingPageBean.getShareInfo().getUrl();
            FragmentActivity activity = vipUniformBottomSheet.getActivity();
            if (activity != null) {
                C57627ylw.AEQbTJ.copydefault(activity, z, (128 & 4) != 0 ? null : str, url, (128 & 16) != 0 ? null : profilePictureUrl, "vip_home_popup", (128 & 64) != 0 ? "" : "", (128 & 128) != 0 ? null : null);
                vipUniformBottomSheet.valueOf();
            }
        }
    }

    public final void djBIcL() {
        kOU kou = this.KWHzl;
        if (kou == null) {
            return;
        }
        kou.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.yld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                VipUniformBottomSheet.valueOf(this.EZpvd, view);
            }
        });
        kou.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.ylf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                VipUniformBottomSheet.AYXKKw(this.EZpvd, view);
            }
        });
    }

    public static final void valueOf(VipUniformBottomSheet vipUniformBottomSheet, View view) {
        VipActivateConfig vipActivateConfig = vipUniformBottomSheet.OLrzqt;
        if (vipActivateConfig == null) {
            return;
        }
        int activateState = vipActivateConfig.getActivateState();
        if (activateState == 1) {
            vipUniformBottomSheet.AEQbTJ();
        } else if (activateState == 2) {
            if (!vipActivateConfig.isFromLanding()) {
                FragmentActivity activity = vipUniformBottomSheet.getActivity();
                if (activity == null) {
                    return;
                }
                kOH koh = (kOH) C43251rlk.OLrzqt(kOH.class);
                if (koh != null) {
                    koh.OLrzqt(activity, false);
                }
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
                if (interfaceC7298ahGKWHzl != null) {
                    interfaceC7298ahGKWHzl.AEQbTJ("growthVipCloseActivatePage", null, linkedHashMap);
                }
            }
            vipUniformBottomSheet.valueOf();
        } else {
            vipUniformBottomSheet.valueOf();
        }
        C57626ylv.AEQbTJ.copydefault(vipActivateConfig.getActivateState());
    }

    public static final void AYXKKw(VipUniformBottomSheet vipUniformBottomSheet, View view) {
        VipActivateConfig vipActivateConfig = vipUniformBottomSheet.OLrzqt;
        if (vipActivateConfig == null) {
            return;
        }
        if (vipActivateConfig.getActivateState() == 2) {
            FragmentActivity activity = vipUniformBottomSheet.getActivity();
            if (activity == null) {
                return;
            }
            C57627ylw c57627ylw = C57627ylw.AEQbTJ;
            String nickName = vipActivateConfig.getNickName();
            String qrCodeUrl = vipActivateConfig.getQrCodeUrl();
            if (qrCodeUrl == null) {
                qrCodeUrl = "";
            }
            c57627ylw.copydefault(activity, true, (128 & 4) != 0 ? null : nickName, qrCodeUrl, (128 & 16) != 0 ? null : vipActivateConfig.getAvatarUrl(), "vip_activation_popup", (128 & 64) != 0 ? "" : "", (128 & 128) != 0 ? null : null);
        }
        vipUniformBottomSheet.valueOf();
    }

    public final void AEQbTJ() {
        final VipActivateConfig vipActivateConfig;
        final kOU kou = this.KWHzl;
        if (kou == null || (vipActivateConfig = this.OLrzqt) == null) {
            return;
        }
        InviteInfo inviteInfo = new InviteInfo(vipActivateConfig.getInviteCode());
        C52794wYp.startLoading$default(kou.AEQbTJ, 0L, 1, null);
        kou.copydefault.playAnimation();
        this.AEQbTJ = C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(UDGrowthImageApiService.Companion.OLrzqt().activateVip(inviteInfo), this), new Function1() { // from class: o.ylk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VipUniformBottomSheet.copydefault(this.AEQbTJ, kou, vipActivateConfig, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.ylo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return VipUniformBottomSheet.AEQbTJ(this.KWHzl, kou, vipActivateConfig, (ResponseData) obj);
            }
        }, 2, (Object) null);
    }

    public static final Unit AEQbTJ(VipUniformBottomSheet vipUniformBottomSheet, kOU kou, VipActivateConfig vipActivateConfig, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (!vipUniformBottomSheet.copydefault()) {
            pUU.valueOf("VipUniformBottomSheet", "Fragment is not valid, skip success handling");
            return Unit.INSTANCE;
        }
        try {
            kou.AEQbTJ.fIwbmz();
            vipActivateConfig.setActivateState(2);
            ActivateResult activateResult = (ActivateResult) responseData.getData();
            if (activateResult != null) {
                String uuid = activateResult.getUuid();
                int iAhwBna = C33129mqd.AhwBna(activateResult.getVipLevel());
                VipActivateConfig vipActivateConfig2 = new VipActivateConfig((String) null, uuid, Integer.valueOf(iAhwBna), (String) null, (String) null, activateResult.getNumberOfDays(), 2, false, activateResult.getAvatarUrl(), activateResult.getNickName(), activateResult.getShareUrl(), 25, (DefaultConstructorMarker) null);
                vipUniformBottomSheet.OLrzqt = vipActivateConfig2;
                vipUniformBottomSheet.EZpvd(vipActivateConfig2);
            }
            C57626ylv.AEQbTJ.KWHzl(vipActivateConfig.getActivateState());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
            if (interfaceC7298ahGKWHzl != null) {
                interfaceC7298ahGKWHzl.AEQbTJ("growthVipActivateSuccess", null, linkedHashMap);
            }
            pUU.EZpvd("VipUniformBottomSheet", "VIP activation successful");
        } catch (Exception e) {
            pUU.AEQbTJ("VipUniformBottomSheet", "Error in success callback", e);
            vipUniformBottomSheet.valueOf();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(VipUniformBottomSheet vipUniformBottomSheet, kOU kou, VipActivateConfig vipActivateConfig, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (!vipUniformBottomSheet.copydefault()) {
            pUU.valueOf("VipUniformBottomSheet", "Fragment is not valid, skip error handling");
            return Unit.INSTANCE;
        }
        try {
            if ((th instanceof OKServerException) && ((OKServerException) th).getCode() == 4007) {
                vipUniformBottomSheet.EZpvd();
                vipUniformBottomSheet.valueOf();
            } else {
                kou.AEQbTJ.fIwbmz();
                FragmentActivity activity = vipUniformBottomSheet.getActivity();
                if (activity != null) {
                    ActivityC57550ykY.Companion.KWHzl(activity, vipActivateConfig.isFromLanding(), th.getMessage());
                    vipUniformBottomSheet.valueOf();
                } else {
                    pUU.valueOf("VipUniformBottomSheet", "Activity is null, cannot start VipActivateFailActivity");
                    vipUniformBottomSheet.valueOf();
                }
            }
        } catch (Exception e) {
            pUU.AEQbTJ("VipUniformBottomSheet", "Error in error callback", e);
            vipUniformBottomSheet.valueOf();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        rTU rtu = (rTU) C43251rlk.OLrzqt(rTU.class);
        if (rtu != null) {
            Context context = getContext();
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity == null) {
                return;
            }
            rTU.Application.checkAndRestrictsDistributary$default(rtu, fragmentActivity, new Function1() { // from class: o.ylq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return VipUniformBottomSheet.OLrzqt(((java.lang.Boolean) obj).booleanValue());
                }
            }, null, null, new Function1() { // from class: o.ylp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return VipUniformBottomSheet.KWHzl((java.lang.String) obj);
                }
            }, new Function1() { // from class: o.ylt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return VipUniformBottomSheet.AEQbTJ((ResultBackStatus) obj);
                }
            }, 12, null);
        }
    }

    public static final Unit OLrzqt(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ResultBackStatus resultBackStatus) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(String str) {
        if (str == null) {
            return null;
        }
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        return null;
    }

    public final boolean copydefault() {
        return (!isAdded() || isDetached() || isRemoving() || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED || getView() == null) ? false : true;
    }

    public final void valueOf() {
        try {
            if (!isAdded() || isDetached() || isRemoving()) {
                pUU.valueOf("VipUniformBottomSheet", "Fragment is not in valid state for dismiss");
            } else {
                dismiss();
            }
        } catch (Exception e) {
            pUU.AEQbTJ("VipUniformBottomSheet", "Error dismissing fragment", e);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        InterfaceC58217yxC interfaceC58217yxC = this.AEQbTJ;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.AEQbTJ = null;
        kOU kou = this.KWHzl;
        if (kou != null && kou.copydefault.isAnimating()) {
            kou.copydefault.cancelAnimation();
        }
        this.KWHzl = null;
    }
}
