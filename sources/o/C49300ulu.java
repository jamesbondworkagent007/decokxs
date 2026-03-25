package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.api.preview.PreviewBottomTipsMode;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareFooterInfo;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.platforms.SharePlatform;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48908ueZ;
import o.C48931uew;
import o.C49340umh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49300ulu extends AbstractC48925ueq implements InterfaceC48892ueJ {
    public static C49300ulu values;
    public BottomSheetBehavior<android.view.View> DbNXlk;
    public boolean fARcdN;
    public Function1<? super java.lang.Boolean, Unit> fetchVPNInfo = new Function1() { // from class: o.ulr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return C49300ulu.OLrzqt(((java.lang.Boolean) obj).booleanValue());
        }
    };
    public C49024ugj isConnected;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AkhnZx = 8;

    /* JADX INFO: renamed from: o.ulu$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ImagePreviewType.values().length];
            try {
                iArr[ImagePreviewType.CENTER_INSIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ImagePreviewType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[SharePreviewMode.values().length];
            try {
                iArr2[SharePreviewMode.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[SharePreviewMode.CUSTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SharePreviewMode.CUSTOM_LUA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr2;
            int[] iArr3 = new int[ShareType.values().length];
            try {
                iArr3[ShareType.SHARE_IMAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[ShareType.SHARE_WEBPAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr3[ShareType.SHARE_TEXT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            EZpvd = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC48892ueJ
    public void EZpvd(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fetchVPNInfo = function1;
    }

    @Override // o.AbstractC48925ueq
    public android.view.View isConnected() {
        return null;
    }

    /* JADX INFO: renamed from: o.ulu$TaskDescription */
    public static final class TaskDescription {

        /* JADX INFO: renamed from: o.ulu$TaskDescription$StateListAnimator */
        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PreviewBottomTipsMode.values().length];
                try {
                    iArr[PreviewBottomTipsMode.DEFAULT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PreviewBottomTipsMode.FORCE_INVITER.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                AEQbTJ = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulu.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C49300ulu AEQbTJ(@NotNull MultiShareConfig multiShareConfig) {
            Intrinsics.checkNotNullParameter(multiShareConfig, "");
            C49300ulu c49300ulu = new C49300ulu();
            android.os.Bundle bundle = new android.os.Bundle();
            KWHzl(multiShareConfig);
            bundle.putParcelable("config", multiShareConfig);
            c49300ulu.setArguments(bundle);
            return c49300ulu;
        }

        public final void KWHzl(MultiShareConfig multiShareConfig) {
            java.util.ArrayList<ShareConfig> configList = multiShareConfig.getConfigList();
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
            boolean z = interfaceC33171mrS.fIwbmz() || interfaceC33171mrS.fJNWhG();
            if (configList == null || configList.isEmpty() || z) {
                return;
            }
            ShareFooterInfo shareFooterInfoORxRYg = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).ORxRYg();
            for (ShareConfig shareConfig : configList) {
                if (shareConfig.getShareParams().getShareType() == ShareType.SHARE_IMAGE) {
                    TaskDescription taskDescription = C49300ulu.Companion;
                    taskDescription.AEQbTJ(shareConfig, shareFooterInfoORxRYg);
                    taskDescription.copydefault(shareConfig, shareFooterInfoORxRYg);
                }
            }
        }

        public final void copydefault(ShareConfig shareConfig, ShareFooterInfo shareFooterInfo) {
            java.lang.String body = shareConfig.getShareParams().getBody();
            java.lang.String inviteeShareText = shareFooterInfo != null ? shareFooterInfo.getInviteeShareText() : null;
            if ((body != null && body.length() != 0) || inviteeShareText == null || inviteeShareText.length() == 0) {
                return;
            }
            java.lang.String shareFrom = shareConfig.getShareParams().getShareFrom();
            java.lang.String shareUrl = shareFooterInfo != null ? shareFooterInfo.getShareUrl() : null;
            java.lang.String downloadUrl = shareFooterInfo != null ? shareFooterInfo.getDownloadUrl() : null;
            if (shareUrl != null && shareUrl.length() != 0) {
                java.lang.String strEZpvd = C49003ugO.AEQbTJ.EZpvd(shareUrl, shareFrom);
                if (strEZpvd != null) {
                    shareUrl = strEZpvd;
                }
            } else if (downloadUrl == null || downloadUrl.length() == 0) {
                shareUrl = "";
            } else {
                shareUrl = C49003ugO.AEQbTJ.EZpvd(downloadUrl, shareFrom);
                if (shareUrl == null) {
                    shareUrl = downloadUrl;
                }
            }
            shareConfig.getShareParams().setBody(inviteeShareText + " " + shareUrl);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void AEQbTJ(ShareConfig shareConfig, ShareFooterInfo shareFooterInfo) {
            ISharePreviewConfig previewConfig = shareConfig.getPreviewConfig();
            java.lang.CharSequence body = shareConfig.getShareParams().getBody();
            PreviewBottomTipsMode previewBottomTipsMode = previewConfig.getPreviewBottomTipsMode();
            if (previewBottomTipsMode == null) {
                previewBottomTipsMode = PreviewBottomTipsMode.DEFAULT;
            }
            int i = StateListAnimator.AEQbTJ[previewBottomTipsMode.ordinal()];
            if (i == 1) {
                java.lang.CharSequence previewBottomTips = previewConfig.getPreviewBottomTips();
                if (previewBottomTips != null) {
                    body = previewBottomTips;
                } else if (body.length() == 0) {
                    if (shareFooterInfo != null) {
                        body = shareFooterInfo.getInviterShareText();
                    }
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                body = previewConfig.getPreviewBottomTips();
                if (body == null) {
                    body = shareFooterInfo != null ? shareFooterInfo.getInviterShareText() : null;
                }
            }
            previewConfig.setPreviewBottomTips(body);
        }

        public final boolean AEQbTJ() {
            return C49300ulu.values != null;
        }

        public final void OLrzqt() {
            C49300ulu c49300ulu = C49300ulu.values;
            if (c49300ulu != null) {
                c49300ulu.dismissAllowingStateLoss();
            }
        }
    }

    @Override // o.AbstractC48925ueq, o.C32995moB, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        values = this;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        values = null;
    }

    public static final Unit OLrzqt(boolean z) {
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C49024ugj c49024ugj = null;
        C49024ugj c49024ugjKWHzl = C49024ugj.KWHzl(layoutInflater, null, false);
        this.isConnected = c49024ugjKWHzl;
        if (c49024ugjKWHzl == null) {
            Intrinsics.gEmmrt("");
            c49024ugjKWHzl = null;
        }
        c49024ugjKWHzl.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.ulv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49300ulu.EZpvd(this.copydefault, view);
            }
        });
        C49024ugj c49024ugj2 = this.isConnected;
        if (c49024ugj2 == null) {
            Intrinsics.gEmmrt("");
            c49024ugj2 = null;
        }
        ConstraintLayout constraintLayout = c49024ugj2.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        AEQbTJ(constraintLayout);
        AEQbTJ(AhwBna());
        values();
        KWHzl((androidx.fragment.app.Fragment) C49261ulH.Companion.AEQbTJ(AhwBna()));
        C49024ugj c49024ugj3 = this.isConnected;
        if (c49024ugj3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c49024ugj = c49024ugj3;
        }
        return c49024ugj.getRoot();
    }

    public static final void EZpvd(C49300ulu c49300ulu, android.view.View view) {
        if (c49300ulu.fARcdN()) {
            return;
        }
        c49300ulu.copydefault();
    }

    public final void AEQbTJ(android.view.View view) {
        this.DbNXlk = copydefault(view);
    }

    @Override // o.AbstractC48925ueq, o.InterfaceC48892ueJ
    public void AuCTel() {
        if (gEmmrt()) {
            return;
        }
        copydefault(true);
        android.view.View viewKWHzl = KWHzl();
        viewKWHzl.setVisibility(0);
        C33570myu.OLrzqt(viewKWHzl, true, new java.lang.Runnable() { // from class: o.ulq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49300ulu.copydefault(this.AEQbTJ);
            }
        });
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void copydefault(final C49300ulu c49300ulu) {
        c49300ulu.OLrzqt(new java.lang.Runnable() { // from class: o.uly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49300ulu.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(C49300ulu c49300ulu) {
        C49024ugj c49024ugj = c49300ulu.isConnected;
        if (c49024ugj == null) {
            Intrinsics.gEmmrt("");
            c49024ugj = null;
        }
        c49024ugj.copydefault.requestLayout();
    }

    @Override // o.AbstractC48925ueq, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf().AEQbTJ().observe(getViewLifecycleOwner(), new Activity());
    }

    /* JADX INFO: renamed from: o.ulu$Activity */
    public static final class Activity extends AbstractC32992mnz<java.util.List<? extends SharePlatform>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean KWHzl(java.util.List<? extends SharePlatform> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return false;
        }

        public Activity() {
            super(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<? extends SharePlatform> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, java.util.List<? extends SharePlatform> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C49300ulu.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            C49300ulu.this.copydefault();
        }
    }

    @Override // o.AbstractC48925ueq, o.InterfaceC48892ueJ
    public void ejfBZ() {
        if (getNewProxyInstance()) {
            return;
        }
        super.ejfBZ();
    }

    public final boolean getNewProxyInstance() {
        if (!fARcdN()) {
            return false;
        }
        final InterfaceC48897ueO interfaceC48897ueOAEQbTJ = AEQbTJ();
        if (interfaceC48897ueOAEQbTJ != null && interfaceC48897ueOAEQbTJ.copydefault()) {
            OLrzqt(new Function0() { // from class: o.ult
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49300ulu.OLrzqt(interfaceC48897ueOAEQbTJ);
                }
            }, new Function0() { // from class: o.uls
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C49300ulu.getFieldNames();
                }
            });
        } else {
            fIwbmz();
        }
        return true;
    }

    public static final Unit OLrzqt(InterfaceC48897ueO interfaceC48897ueO) {
        interfaceC48897ueO.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames() {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final Function0<Unit> function0, final Function0<Unit> function02) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C48931uew.Activity.DTwDnp);
        viewOnClickListenerC54939xaY.copydefault(C48931uew.Activity.QOLQEE);
        viewOnClickListenerC54939xaY.EZpvd(C48931uew.Activity.sSMYrx, new View.OnClickListener() { // from class: o.ulx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49300ulu.KWHzl(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C48931uew.Activity.AwvSrB, new View.OnClickListener() { // from class: o.ulz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C49300ulu.EZpvd(viewOnClickListenerC54939xaY, function02, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    @Override // o.AbstractC48925ueq
    public android.view.View KWHzl() {
        C49024ugj c49024ugj = this.isConnected;
        if (c49024ugj == null) {
            Intrinsics.gEmmrt("");
            c49024ugj = null;
        }
        ConstraintLayout constraintLayout = c49024ugj.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        return constraintLayout;
    }

    @Override // o.InterfaceC48892ueJ
    public void KWHzl(@NotNull java.util.List<? extends InterfaceC48901ueS> list, @NotNull InterfaceC48898ueP interfaceC48898ueP) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC48898ueP, "");
        try {
            C49024ugj c49024ugj = this.isConnected;
            BottomSheetBehavior<android.view.View> bottomSheetBehavior = null;
            if (c49024ugj == null) {
                Intrinsics.gEmmrt("");
                c49024ugj = null;
            }
            int height = c49024ugj.EZpvd.getHeight();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("platforms_panel_tag");
            androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = childFragmentManager.findFragmentByTag("edit_panel_tag");
            C49257ulD c49257ulDCopydefault = C49257ulD.Companion.copydefault(list, interfaceC48898ueP, java.lang.Integer.valueOf(height));
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            if (fragmentFindFragmentByTag2 != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag2);
            }
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag);
            }
            fragmentTransactionBeginTransaction.add(C48931uew.StateListAnimator.fZBcTu, c49257ulDCopydefault, "edit_panel_tag");
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            EZpvd(true);
            BottomSheetBehavior<android.view.View> bottomSheetBehavior2 = this.DbNXlk;
            if (bottomSheetBehavior2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                bottomSheetBehavior = bottomSheetBehavior2;
            }
            bottomSheetBehavior.setDraggable(false);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("OKShare", "enterEditMode->error:" + e.getMessage());
        }
    }

    @Override // o.InterfaceC48892ueJ
    public void fIwbmz() {
        try {
            BottomSheetBehavior<android.view.View> bottomSheetBehavior = this.DbNXlk;
            if (bottomSheetBehavior == null) {
                Intrinsics.gEmmrt("");
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.setDraggable(true);
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = childFragmentManager.findFragmentByTag("edit_panel_tag");
            androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = childFragmentManager.findFragmentByTag("platforms_panel_tag");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            if (fragmentFindFragmentByTag != null) {
                fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
            }
            if (fragmentFindFragmentByTag2 != null) {
                fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag2);
            }
            fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
            EZpvd(false);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("OKShare", "exitEditMode->error:" + e.getMessage());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onCancel(dialogInterface);
        this.fARcdN = true;
    }

    @Override // o.AbstractC48925ueq, o.C32995moB, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.fetchVPNInfo.invoke(java.lang.Boolean.valueOf(this.fARcdN));
        this.fARcdN = false;
        this.fetchVPNInfo = new Function1() { // from class: o.ulw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49300ulu.AhwBna(((java.lang.Boolean) obj).booleanValue());
            }
        };
    }

    public static final Unit AhwBna(boolean z) {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull MultiShareConfig multiShareConfig) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
        Intrinsics.checkNotNullParameter(multiShareConfig, "");
        ShareConfig firstShareConfig = multiShareConfig.getFirstShareConfig();
        ShareType shareType = firstShareConfig.getShareParams().getShareType();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        int i = StateListAnimator.EZpvd[shareType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C49275ulV c49275ulV = new C49275ulV();
                AbstractC48908ueZ.Companion.AEQbTJ(firstShareConfig, 0, false, c49275ulV);
                childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, c49275ulV, "preview_panel_tag").commitNowAllowingStateLoss();
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                C49335umc c49335umc = new C49335umc();
                AbstractC48908ueZ.Companion.AEQbTJ(firstShareConfig, 0, false, c49335umc);
                childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, c49335umc, "preview_panel_tag").commitNowAllowingStateLoss();
                return;
            }
        }
        if (multiShareConfig.getConfigList().size() > 1) {
            childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, C49340umh.ActionBar.newInstance$default(C49340umh.Companion, multiShareConfig, 0, 2, null), "preview_panel_tag").commitNowAllowingStateLoss();
            return;
        }
        ISharePreviewConfig previewConfig = firstShareConfig.getPreviewConfig();
        int i2 = StateListAnimator.OLrzqt[previewConfig.getSharePreviewMode().ordinal()];
        if (i2 == 1) {
            Intrinsics.copydefault(previewConfig, "");
            int i3 = StateListAnimator.copydefault[((ImageDefaultPreviewConfig) previewConfig).getImagePreviewType().ordinal()];
            if (i3 == 1) {
                childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, C49271ulR.Companion.copydefault(firstShareConfig, 0, false), "preview_panel_tag").commitNowAllowingStateLoss();
                return;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, C49265ulL.Companion.KWHzl(firstShareConfig, 0, false), "preview_panel_tag").commitNowAllowingStateLoss();
                return;
            }
        }
        if (i2 == 2) {
            Intrinsics.copydefault(previewConfig, "");
            AbstractC48902ueT<? extends ISharePreviewConfig> abstractC48902ueTNewInstance = ((ImageCustomPreviewConfig) previewConfig).getCustomFragmentClass().newInstance();
            AbstractC48908ueZ.StateListAnimator stateListAnimator = AbstractC48908ueZ.Companion;
            Intrinsics.copydefault(abstractC48902ueTNewInstance);
            stateListAnimator.AEQbTJ(firstShareConfig, 0, false, abstractC48902ueTNewInstance);
            childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, abstractC48902ueTNewInstance, "preview_panel_tag").commitNowAllowingStateLoss();
            return;
        }
        if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.copydefault(previewConfig, "");
        C49044uhC c49044uhCOLrzqt = C49044uhC.Companion.OLrzqt();
        AbstractC48908ueZ.Companion.AEQbTJ(firstShareConfig, 0, false, c49044uhCOLrzqt);
        childFragmentManager.beginTransaction().replace(C48931uew.StateListAnimator.dvKsVJ, c49044uhCOLrzqt, "preview_panel_tag").commitNowAllowingStateLoss();
    }
}
