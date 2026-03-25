package com.okinc.business.appupdate.update;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.business.appupdate.R;
import com.okinc.business.appupdate.impl.AppUpdateServiceImplKt;
import com.okinc.business.appupdate.ui.SlideLock;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import com.okinc.rxutils.SubHelper;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58260yxt;
import o.C32866mlf;
import o.C32868mlh;
import o.C32995moB;
import o.C33054mpH;
import o.C33070mpX;
import o.C33129mqd;
import o.C33472mxB;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55302xhQ;
import o.C56392yDr;
import o.InterfaceC33171mrS;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC6804aWL;
import o.pUU;
import o.xWO;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateFragment extends C32995moB implements View.OnClickListener {
    private static final String DESCRIPTION_UPGRADE_DIALOG = "OKUpgradeDialog";
    private static final String KEY_BUTTON_NAME = "button_name";
    private static final String PARAM_APP_UPDATE_INFO = "update_info";
    public static final String PROCESS_VALUE = "value";
    private static final String TYPE_FORCE_UPDATE = "2";
    private static final String UPDATE_BUTTON_EVENT = "AppUpdate_Pop_Button_Click";
    private InterfaceC58217yxC disposable;
    private C52794wYp downloadProgress;
    private ImageView ivCustomerService;
    private Integer progress;
    private FrameLayout scChangeMode;
    private SlideLock slideLock;
    private TextView tvBackup;
    private C52794wYp updateButton;
    private ImageView updateClose;
    private RecyclerView updateContent;
    private final InterfaceC56387yDm updateInfo$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AppUpdateFragment.updateInfo_delegate$lambda$0(this.f$0);
        }
    });
    private final InterfaceC56387yDm updateListener$delegate = C56392yDr.copydefault(new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.f$0.createUpdateStateListener();
        }
    });
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.UpgradeDialog;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.appupdate.update.AppUpdateFragment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AppUpdateFragment newInstance(@NotNull AppUpdateInfo appUpdateInfo, Integer num) {
            Intrinsics.checkNotNullParameter(appUpdateInfo, "");
            AppUpdateFragment appUpdateFragment = new AppUpdateFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(AppUpdateFragment.PARAM_APP_UPDATE_INFO, appUpdateInfo);
            if (num != null) {
                bundle.putInt("value", num.intValue());
            }
            appUpdateFragment.setArguments(bundle);
            return appUpdateFragment;
        }
    }

    private final AppUpdateInfo getUpdateInfo() {
        return (AppUpdateInfo) this.updateInfo$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppUpdateInfo updateInfo_delegate$lambda$0(AppUpdateFragment appUpdateFragment) {
        Bundle arguments = appUpdateFragment.getArguments();
        if (arguments != null) {
            return (AppUpdateInfo) arguments.getParcelable(PARAM_APP_UPDATE_INFO);
        }
        return null;
    }

    private final IUpdateStateChange getUpdateListener() {
        return (IUpdateStateChange) this.updateListener$delegate.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "");
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(C52761wXj.LoaderManager.copydefault);
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C33472mxB c33472mxB = new C33472mxB(contextRequireContext, window);
        c33472mxB.AEQbTJ();
        AppUpdateInfo updateInfo = getUpdateInfo();
        if (updateInfo == null || !updateInfo.isForcedUpdate()) {
            return;
        }
        window.setDimAmount(0.0f);
        c33472mxB.EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AppUpdateInfo updateInfo = getUpdateInfo();
        if (updateInfo != null && updateInfo.isForcedUpdate()) {
            return layoutInflater.inflate(R.layout.fragment_app_force_update, viewGroup, false);
        }
        return layoutInflater.inflate(R.layout.fragment_app_update, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        List<String> listAhwBna;
        AlertContent alertContent;
        UpgradeTypeDetail upgradeTypeDetail;
        UpgradeTypeDetail upgradeTypeDetail2;
        Bundle arguments;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments2 = getArguments();
        web3 = null;
        String web3 = null;
        this.progress = (arguments2 == null || !arguments2.containsKey("value") || (arguments = getArguments()) == null) ? null : Integer.valueOf(arguments.getInt("value"));
        if (getUpdateInfo() == null) {
            return;
        }
        view.setContentDescription(DESCRIPTION_UPGRADE_DIALOG);
        AppUpdateInfo updateInfo = getUpdateInfo();
        if (updateInfo != null && updateInfo.isForcedUpdate()) {
            this.scChangeMode = (FrameLayout) C33054mpH.copydefault(view, R.id.sc_change_mode);
            this.ivCustomerService = (ImageView) C33054mpH.copydefault(view, R.id.iv_customer_service);
            TextView textView = (TextView) C33054mpH.copydefault(view, R.id.tv_backup);
            this.tvBackup = textView;
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            ImageView imageView = this.ivCustomerService;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
            boolean zValueOf = interfaceC33171mrS != null ? interfaceC33171mrS.valueOf() : false;
            AppUpdateInfo updateInfo2 = getUpdateInfo();
            boolean zEquals = TextUtils.equals("2", (updateInfo2 == null || (upgradeTypeDetail2 = updateInfo2.getUpgradeTypeDetail()) == null) ? null : upgradeTypeDetail2.getMainSite());
            AppUpdateInfo updateInfo3 = getUpdateInfo();
            if (updateInfo3 != null && (upgradeTypeDetail = updateInfo3.getUpgradeTypeDetail()) != null) {
                web3 = upgradeTypeDetail.getWeb3();
            }
            boolean zEquals2 = TextUtils.equals("2", web3);
            if (zValueOf || (zEquals && zEquals2)) {
                FrameLayout frameLayout = this.scChangeMode;
                if (frameLayout != null) {
                    frameLayout.setVisibility(4);
                }
                setBackUpVisibility();
            } else if (zEquals && !zEquals2) {
                FrameLayout frameLayout2 = this.scChangeMode;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                TextView textView2 = this.tvBackup;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                }
            } else if (!zEquals && zEquals2) {
                FrameLayout frameLayout3 = this.scChangeMode;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                setBackUpVisibility();
            }
            setTabSelect();
            C52794wYp c52794wYp = (C52794wYp) C33054mpH.copydefault(view, R.id.update_button);
            this.updateButton = c52794wYp;
            if (c52794wYp != null) {
                c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f$0.doUpdate();
                    }
                });
            }
            setCancelable(false);
        } else {
            ImageView imageView2 = (ImageView) C33054mpH.copydefault(view, R.id.update_close);
            this.updateClose = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this);
            }
            final TextView textView3 = (TextView) C33054mpH.copydefault(view, R.id.title);
            final MotionLayout motionLayout = (MotionLayout) C33054mpH.copydefault(view, R.id.slide_lock);
            Intrinsics.copydefault(motionLayout);
            SlideLock slideLock = new SlideLock(motionLayout);
            this.slideLock = slideLock;
            slideLock.setOnUnlockListener(new Function0() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AppUpdateFragment.onViewCreated$lambda$4(this.f$0);
                }
            });
            AppUpdateInfo updateInfo4 = getUpdateInfo();
            if (updateInfo4 == null || (alertContent = updateInfo4.getAlertContent()) == null || (listAhwBna = alertContent.getMessages()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            FragmentActivity activity = getActivity();
            AppUpdateAdapter appUpdateAdapter = activity != null ? new AppUpdateAdapter(activity, listAhwBna) : null;
            RecyclerView recyclerView = (RecyclerView) C33054mpH.copydefault(view, R.id.update_rl);
            this.updateContent = recyclerView;
            if (recyclerView != null) {
                recyclerView.setAdapter(appUpdateAdapter);
            }
            View viewFindViewById = view.findViewById(R.id.fragment_app_update_ly);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            if (ViewCompat.isLaidOut(viewFindViewById) && !viewFindViewById.isLayoutRequested()) {
                RecyclerView recyclerView2 = this.updateContent;
                Intrinsics.copydefault(recyclerView2);
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                RecyclerView recyclerView3 = this.updateContent;
                Intrinsics.copydefault(recyclerView3);
                ViewGroup.LayoutParams layoutParams2 = recyclerView3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i2 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
                int height = textView3.getHeight();
                Intrinsics.copydefault(textView3);
                ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                int i3 = marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0;
                ViewGroup.LayoutParams layoutParams4 = textView3.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
                int height2 = motionLayout.getHeight();
                ViewGroup.LayoutParams layoutParams5 = motionLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                int i5 = marginLayoutParams5 != null ? marginLayoutParams5.topMargin : 0;
                ViewGroup.LayoutParams layoutParams6 = motionLayout.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams6 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams6 : null;
                int i6 = i + i2 + height + i3 + i4 + height2 + i5 + (marginLayoutParams6 != null ? marginLayoutParams6.bottomMargin : 0);
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                int iAEQbTJ = C55302xhQ.AEQbTJ(contextRequireContext) / 2;
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                int iAEQbTJ2 = (C55302xhQ.AEQbTJ(contextRequireContext2) * 3) / 5;
                RecyclerView recyclerView4 = this.updateContent;
                Intrinsics.copydefault(recyclerView4);
                ViewGroup.LayoutParams layoutParams7 = recyclerView4.getLayoutParams();
                if (layoutParams7 != null) {
                    ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
                    layoutParams8.matchConstraintMinHeight = iAEQbTJ - i6;
                    layoutParams8.matchConstraintMaxHeight = iAEQbTJ2 - i6;
                    recyclerView4.setLayoutParams(layoutParams8);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            } else {
                viewFindViewById.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$onViewCreated$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                        Intrinsics.checkNotNullParameter(view2, "");
                        view2.removeOnLayoutChangeListener(this);
                        RecyclerView recyclerView5 = this.this$0.updateContent;
                        Intrinsics.copydefault(recyclerView5);
                        ViewGroup.LayoutParams layoutParams9 = recyclerView5.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : null;
                        int i15 = marginLayoutParams7 != null ? marginLayoutParams7.topMargin : 0;
                        RecyclerView recyclerView6 = this.this$0.updateContent;
                        Intrinsics.copydefault(recyclerView6);
                        ViewGroup.LayoutParams layoutParams10 = recyclerView6.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams10 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams10 : null;
                        int i16 = marginLayoutParams8 != null ? marginLayoutParams8.bottomMargin : 0;
                        int height3 = textView3.getHeight();
                        Intrinsics.copydefault(textView3);
                        ViewGroup.LayoutParams layoutParams11 = textView3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams11 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams11 : null;
                        int i17 = marginLayoutParams9 != null ? marginLayoutParams9.topMargin : 0;
                        Intrinsics.copydefault(textView3);
                        ViewGroup.LayoutParams layoutParams12 = textView3.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams12 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams12 : null;
                        int i18 = marginLayoutParams10 != null ? marginLayoutParams10.bottomMargin : 0;
                        int height4 = motionLayout.getHeight();
                        Intrinsics.copydefault(motionLayout);
                        ViewGroup.LayoutParams layoutParams13 = motionLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams13 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams13 : null;
                        int i19 = marginLayoutParams11 != null ? marginLayoutParams11.topMargin : 0;
                        Intrinsics.copydefault(motionLayout);
                        ViewGroup.LayoutParams layoutParams14 = motionLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams14 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams14 : null;
                        int i20 = i15 + i16 + height3 + i17 + i18 + height4 + i19 + (marginLayoutParams12 != null ? marginLayoutParams12.bottomMargin : 0);
                        Context contextRequireContext3 = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                        int iAEQbTJ3 = C55302xhQ.AEQbTJ(contextRequireContext3) / 2;
                        Context contextRequireContext4 = this.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                        int iAEQbTJ4 = (C55302xhQ.AEQbTJ(contextRequireContext4) * 3) / 5;
                        RecyclerView recyclerView7 = this.this$0.updateContent;
                        Intrinsics.copydefault(recyclerView7);
                        ViewGroup.LayoutParams layoutParams15 = recyclerView7.getLayoutParams();
                        if (layoutParams15 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        }
                        ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
                        layoutParams16.matchConstraintMinHeight = iAEQbTJ3 - i20;
                        layoutParams16.matchConstraintMaxHeight = iAEQbTJ4 - i20;
                        recyclerView7.setLayoutParams(layoutParams16);
                    }
                });
            }
            setCancelable(true);
        }
        this.downloadProgress = (C52794wYp) C33054mpH.copydefault(view, R.id.download_progress);
        AppUpdateServiceImplKt.getAppUpdateService().addUpdateStateChangeListener(getUpdateListener());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(AppUpdateFragment appUpdateFragment) {
        appUpdateFragment.doUpdate();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doUpdate() {
        AppUpdateInfo updateInfo;
        if (getActivity() != null && this.progress == null && (updateInfo = getUpdateInfo()) != null) {
            pUU.KWHzl(IUpdate2Kt.TAG, "do update");
            AppUpdateServiceImplKt.getAppUpdateService().updateApp(this, updateInfo);
        }
        sendEvent();
    }

    private final void sendEvent() {
        AppUpdateInfo updateInfo = getUpdateInfo();
        final String str = (updateInfo == null || !updateInfo.isForcedUpdate()) ? "update" : "force_update";
        C32866mlf.onEvent$default(UPDATE_BUTTON_EVENT, (TrackChannel[]) null, new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateFragment.sendEvent$lambda$10(str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendEvent$lambda$10(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_name", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.C32995moB, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        updateProgress(this.progress);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        SubHelper.AEQbTJ(this);
        AppUpdateServiceImplKt.getAppUpdateService().removeUpdateStateChangeListener(getUpdateListener());
        InterfaceC58217yxC interfaceC58217yxC = this.disposable;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IUpdateStateChange createUpdateStateListener() {
        return new IUpdateStateChange() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment.createUpdateStateListener.1
            @Override // com.okinc.business.appupdate.api.IUpdateStateChange
            public void onDownloadProgressChange(int i) {
                AppUpdateFragment.this.updateProgress(C33129mqd.AEQbTJ(Integer.valueOf(i), 0) ? Integer.valueOf(i) : null);
            }

            @Override // com.okinc.business.appupdate.api.IUpdateStateChange
            public void onDownloadFailed() {
                AppUpdateFragment.this.dismissAllowingStateLoss();
                AppUpdateFragment.this.updateProgress(null);
            }

            @Override // com.okinc.business.appupdate.api.IUpdateStateChange
            public void onDownloadSuccess() {
                AppUpdateFragment.this.dismissAllowingStateLoss();
                AppUpdateFragment.this.updateProgress(null);
            }

            @Override // com.okinc.business.appupdate.api.IUpdateStateChange
            public void onDownloadCanceled() {
                SlideLock slideLock = AppUpdateFragment.this.slideLock;
                if (slideLock != null) {
                    slideLock.reset();
                }
                AppUpdateFragment.this.updateProgress(null);
            }

            @Override // com.okinc.business.appupdate.api.IUpdateStateChange
            public void onDownLoadStart() {
                AppUpdateFragment.this.updateProgress(0);
            }
        };
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        AppUpdateInfo updateInfo = getUpdateInfo();
        if (updateInfo == null || !updateInfo.isForcedUpdate()) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        AppUpdateInfo updateInfo = getUpdateInfo();
        if (updateInfo == null || !updateInfo.isForcedUpdate()) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissNow() {
        AppUpdateInfo updateInfo = getUpdateInfo();
        if (updateInfo == null || !updateInfo.isForcedUpdate()) {
            super.dismissNow();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(Integer num) {
        this.progress = num;
        if (num == null) {
            C52794wYp c52794wYp = this.downloadProgress;
            if (c52794wYp != null) {
                c52794wYp.setVisibility(8);
                return;
            }
            return;
        }
        C52794wYp c52794wYp2 = this.downloadProgress;
        if (c52794wYp2 != null) {
            c52794wYp2.setVisibility(0);
        }
        C52794wYp c52794wYp3 = this.downloadProgress;
        if (c52794wYp3 != null) {
            c52794wYp3.setText(C33070mpX.AYXKKw(R.string.pr_appupdate_alert_downloading) + this.progress + "%");
        }
    }

    private final void setBackUpVisibility() {
        AbstractC58260yxt<Boolean> abstractC58260yxtAN_ = ((xWO) C43251rlk.copydefault(xWO.class)).aN_();
        final Function1 function1 = new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateFragment.setBackUpVisibility$lambda$11(this.f$0, (Boolean) obj);
            }
        };
        InterfaceC58227yxM<? super Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppUpdateFragment.setBackUpVisibility$lambda$13((Throwable) obj);
            }
        };
        this.disposable = abstractC58260yxtAN_.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(Object obj) {
                function12.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBackUpVisibility$lambda$11(AppUpdateFragment appUpdateFragment, Boolean bool) {
        if (bool.booleanValue()) {
            TextView textView = appUpdateFragment.tvBackup;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            TextView textView2 = appUpdateFragment.tvBackup;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setBackUpVisibility$lambda$13(Throwable th) {
        return Unit.INSTANCE;
    }

    private final void setTabSelect() {
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class);
        FrameLayout frameLayout = this.scChangeMode;
        if (frameLayout != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            frameLayout.addView(InterfaceC33171mrS.Activity.getAppModeSwitchView$default(interfaceC33171mrS, contextRequireContext, childFragmentManager, viewLifecycleOwner, AppModeSwitchViewSource.Upgrade, null, 16, null));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i = R.id.iv_customer_service;
        if (numValueOf != null && numValueOf.intValue() == i) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.onEvent$default("SupportCenter_Btm_Chatbot_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (Object) null);
            InterfaceC6804aWL interfaceC6804aWL = (InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC6804aWL.copydefault(fragmentActivityRequireActivity, new ChatBotRequest());
            return;
        }
        int i2 = R.id.tv_backup;
        if (numValueOf != null && numValueOf.intValue() == i2) {
            xWO xwo = (xWO) C43251rlk.copydefault(xWO.class);
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            xwo.copydefault(fragmentActivityRequireActivity2);
            return;
        }
        int i3 = R.id.update_close;
        if (numValueOf != null && numValueOf.intValue() == i3) {
            dismiss();
            C32866mlf.onEvent$default(UPDATE_BUTTON_EVENT, (TrackChannel[]) null, new Function1() { // from class: com.okinc.business.appupdate.update.AppUpdateFragment$$ExternalSyntheticLambda5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AppUpdateFragment.onClick$lambda$15((EventParamsList) obj);
                }
            }, 1, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$15(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_name", EopTrackEvent.CLOSE, true);
        return Unit.INSTANCE;
    }
}
