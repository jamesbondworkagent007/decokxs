package com.okinc.okex.center.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Checkable;
import android.widget.RelativeLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.center.bean.SupportBannerBean;
import com.okinc.okex.center.ui.SupportHomeBaseActivity;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.fragment.ContactUsBottomSheetFragment;
import com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import com.okinc.web.WebActivity;
import com.reown.android.pulse.model.EventType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractActivityC44871sfB;
import o.AbstractC47283tnC;
import o.AbstractC47302tnV;
import o.ActivityC44038sBa;
import o.C32991mny;
import o.C33070mpX;
import o.C44901sff;
import o.C45136skB;
import o.C45144skJ;
import o.C45359soM;
import o.C47315tni;
import o.C52761wXj;
import o.C52794wYp;
import o.C55173xeu;
import o.C55296xhK;
import o.C56390yDp;
import o.C56392yDr;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes10.dex */
public class SupportHomeBaseActivity extends AbstractActivityC44871sfB {
    public final InterfaceC56387yDm isConnected;
    public AnnouncementPopupDisplayModel valueOf;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sgd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportHomeBaseActivity.AkhnZx(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sge
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportHomeBaseActivity.DbNXlk(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sgg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportHomeBaseActivity.isConnected(this.copydefault);
        }
    });
    public final Handler djBIcL = new Handler(Looper.getMainLooper());
    public OnBackPressedCallback DbNXlk = new PendingIntent();
    public final String AkhnZx = "landing";
    public boolean fetchVPNInfo = true;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContactUsBottomSheetFragment.ContactUsType.values().length];
            try {
                iArr[ContactUsBottomSheetFragment.ContactUsType.CHAT_BOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactUsBottomSheetFragment.ContactUsType.TOLL_FREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public SupportHomeBaseActivity() {
        final Function0 function0 = null;
        this.isConnected = new ViewModelLazy(C56524yIo.AEQbTJ(SupportCenterHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.SupportHomeBaseActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.SupportHomeBaseActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.SupportHomeBaseActivity$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final AbstractC47302tnV gEmmrt() {
        return (AbstractC47302tnV) this.AhwBna.getValue();
    }

    public static final AbstractC47302tnV AkhnZx(SupportHomeBaseActivity supportHomeBaseActivity) {
        return AbstractC47302tnV.OLrzqt(supportHomeBaseActivity.getLayoutInflater());
    }

    /* JADX DEBUG: Possible override for method o.sfB.AEQbTJ()V */
    public final AbstractC47283tnC AEQbTJ() {
        return (AbstractC47283tnC) this.AYXKKw.getValue();
    }

    public static final AbstractC47283tnC DbNXlk(SupportHomeBaseActivity supportHomeBaseActivity) {
        return AbstractC47283tnC.copydefault(supportHomeBaseActivity.getLayoutInflater());
    }

    public final C45136skB AYXKKw() {
        return (C45136skB) this.gEmmrt.getValue();
    }

    public static final C45136skB isConnected(SupportHomeBaseActivity supportHomeBaseActivity) {
        return new C45136skB(supportHomeBaseActivity.AEQbTJ(), supportHomeBaseActivity.gEmmrt());
    }

    public final SupportCenterHomeViewModel valueOf() {
        return (SupportCenterHomeViewModel) this.isConnected.getValue();
    }

    public static final class PendingIntent extends OnBackPressedCallback {
        public PendingIntent() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            C45359soM.copydefault.KWHzl();
            setEnabled(false);
            SupportHomeBaseActivity.this.getOnBackPressedDispatcher().onBackPressed();
        }
    }

    @Override // o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OnBackPressedCallback onBackPressedCallback = this.DbNXlk;
        if (onBackPressedCallback != null) {
            getOnBackPressedDispatcher().addCallback(this, onBackPressedCallback);
        }
        values();
        djBIcL();
        AhwBna();
        DbNXlk();
    }

    @Override // o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (isReenter()) {
            valueOf().EZpvd(true, getIntent().getStringExtra("slug"));
        }
        valueOf().AEQbTJ();
        if (!getIntent().getBooleanExtra("is_web3_app", false)) {
            valueOf().EZpvd();
        }
        valueOf().copydefault();
    }

    @Override // o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.djBIcL.removeCallbacksAndMessages(null);
        OnBackPressedCallback onBackPressedCallback = this.DbNXlk;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.remove();
        }
        this.DbNXlk = null;
    }

    public final void values() {
        AbstractC47283tnC abstractC47283tnCAEQbTJ = AEQbTJ();
        setContentView(abstractC47283tnCAEQbTJ.getRoot());
        abstractC47283tnCAEQbTJ.djBIcL.addView(gEmmrt().getRoot());
        C45136skB c45136skBAYXKKw = AYXKKw();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c45136skBAYXKKw.copydefault(supportFragmentManager);
    }

    public final void djBIcL() {
        AbstractC47283tnC abstractC47283tnCAEQbTJ = AEQbTJ();
        RelativeLayout relativeLayout = abstractC47283tnCAEQbTJ.AkhnZx;
        AYXKKw().copydefault(this.fetchVPNInfo);
        abstractC47283tnCAEQbTJ.values.setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.DBxZfM));
        relativeLayout.setOnClickListener(new LoaderManager(relativeLayout, 1000L, this));
        abstractC47283tnCAEQbTJ.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.sgf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportHomeBaseActivity.AYXKKw(this.KWHzl, view);
            }
        });
    }

    public static final void AYXKKw(SupportHomeBaseActivity supportHomeBaseActivity, View view) {
        supportHomeBaseActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    public final void AhwBna() {
        AbstractC47302tnV abstractC47302tnVGEmmrt = gEmmrt();
        C55173xeu c55173xeu = abstractC47302tnVGEmmrt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        new C45144skJ(c55173xeu).KWHzl(new View.OnClickListener() { // from class: o.sfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportHomeBaseActivity.EZpvd(this.copydefault, view);
            }
        });
        C52794wYp c52794wYp = abstractC47302tnVGEmmrt.KWHzl;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = abstractC47302tnVGEmmrt.AEQbTJ;
        c52794wYp2.setOnClickListener(new Activity(c52794wYp2, 1000L, this));
        AYXKKw().EZpvd(this.fetchVPNInfo, C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sfZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportHomeBaseActivity.AhwBna(this.copydefault, view);
            }
        });
        AYXKKw().KWHzl(getIntent().getBooleanExtra("is_web3_app", false), C47315tni.Application.DbNXlk, new View.OnClickListener() { // from class: o.sga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                SupportHomeBaseActivity.valueOf(this.EZpvd, view);
            }
        });
        TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton = AEQbTJ().valueOf;
        transformableFloatingUnReadMsgActionButton.setOnClickListener(new TaskDescription(transformableFloatingUnReadMsgActionButton, 1000L, transformableFloatingUnReadMsgActionButton, this));
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel.getSupportLandingCards$default(com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel, boolean, java.lang.String, int, java.lang.Object):void */
    public static final void EZpvd(SupportHomeBaseActivity supportHomeBaseActivity, View view) {
        SupportCenterHomeViewModel.getSupportLandingCards$default(supportHomeBaseActivity.valueOf(), false, supportHomeBaseActivity.getIntent().getStringExtra("slug"), 1, null);
    }

    public static final void AhwBna(SupportHomeBaseActivity supportHomeBaseActivity, View view) {
        supportHomeBaseActivity.valueOf().AkhnZx();
        supportHomeBaseActivity.startActivity(ActivityC44038sBa.Application.createIntent$default(ActivityC44038sBa.Companion, supportHomeBaseActivity, supportHomeBaseActivity.AkhnZx, null, 4, null));
    }

    public static final void valueOf(SupportHomeBaseActivity supportHomeBaseActivity, View view) {
        C44901sff.copydefault.OLrzqt();
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, supportHomeBaseActivity, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C47315tni.PendingIntent.values))), null, 4, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ SupportHomeBaseActivity KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, SupportHomeBaseActivity supportHomeBaseActivity) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = supportHomeBaseActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.isConnected();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ SupportHomeBaseActivity EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, SupportHomeBaseActivity supportHomeBaseActivity) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = supportHomeBaseActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AkhnZx();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ SupportHomeBaseActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, SupportHomeBaseActivity supportHomeBaseActivity) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = supportHomeBaseActivity;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.sBa.Application.createIntent$default(o.sBa$Application, android.content.Context, java.lang.String, java.lang.String, int, java.lang.Object):android.content.Intent */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC44038sBa.Application application = ActivityC44038sBa.Companion;
                SupportHomeBaseActivity supportHomeBaseActivity = this.copydefault;
                this.copydefault.startActivity(ActivityC44038sBa.Application.createIntent$default(application, supportHomeBaseActivity, supportHomeBaseActivity.AkhnZx, null, 4, null));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ TransformableFloatingUnReadMsgActionButton AEQbTJ;
        public final /* synthetic */ SupportHomeBaseActivity EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, TransformableFloatingUnReadMsgActionButton transformableFloatingUnReadMsgActionButton, SupportHomeBaseActivity supportHomeBaseActivity) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = transformableFloatingUnReadMsgActionButton;
            this.EZpvd = supportHomeBaseActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (Intrinsics.EZpvd(this.AEQbTJ.getTag(), StateListAnimator.TaskDescription.OLrzqt)) {
                    this.EZpvd.isConnected();
                } else {
                    this.EZpvd.AkhnZx();
                }
            }
        }
    }

    private final void DbNXlk() {
        valueOf().EZpvd(false, getIntent().getStringExtra("slug"));
        valueOf().AYXKKw().observe(this, new C32991mny(new Function1() { // from class: o.sgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportHomeBaseActivity.AEQbTJ(this.copydefault, (SupportBannerBean) obj);
            }
        }));
        valueOf().valueOf().observe(this, new C32991mny(new Function1() { // from class: o.sgj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportHomeBaseActivity.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        valueOf().OLrzqt().observe(this, new C32991mny(new Function1() { // from class: o.sgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportHomeBaseActivity.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        valueOf().AhwBna().observe(this, new C32991mny(new Function1() { // from class: o.sgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportHomeBaseActivity.copydefault(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportHomeBaseActivity$initViewModel$5(this, null), 3, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.skB.setupSupportBanner$default(o.skB, java.lang.String, java.lang.String, int, int, int, java.lang.Object):void */
    public static final Unit AEQbTJ(SupportHomeBaseActivity supportHomeBaseActivity, SupportBannerBean supportBannerBean) {
        Intrinsics.checkNotNullParameter(supportBannerBean, "");
        C45136skB.setupSupportBanner$default(supportHomeBaseActivity.AYXKKw(), "", supportBannerBean.getText(), 0, 0, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SupportHomeBaseActivity supportHomeBaseActivity, boolean z) {
        supportHomeBaseActivity.AYXKKw().AEQbTJ(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportHomeBaseActivity supportHomeBaseActivity, boolean z) {
        supportHomeBaseActivity.AYXKKw().OLrzqt(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SupportHomeBaseActivity supportHomeBaseActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C45136skB c45136skBAYXKKw = supportHomeBaseActivity.AYXKKw();
        FragmentManager supportFragmentManager = supportHomeBaseActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c45136skBAYXKKw.AEQbTJ(supportFragmentManager, pair);
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        final String strGEmmrt = valueOf().gEmmrt();
        ContactUsBottomSheetFragment.ActionBar actionBar = ContactUsBottomSheetFragment.Companion;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        actionBar.AEQbTJ(supportFragmentManager, strGEmmrt, new Function1() { // from class: o.sgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportHomeBaseActivity.AEQbTJ(this.OLrzqt, strGEmmrt, (ContactUsBottomSheetFragment.ContactUsType) obj);
            }
        });
    }

    public static final Unit AEQbTJ(SupportHomeBaseActivity supportHomeBaseActivity, String str, ContactUsBottomSheetFragment.ContactUsType contactUsType) {
        Intrinsics.checkNotNullParameter(contactUsType, "");
        int i = ActionBar.copydefault[contactUsType.ordinal()];
        if (i == 1) {
            supportHomeBaseActivity.AkhnZx();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C45359soM.copydefault.KWHzl();
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + str));
            supportHomeBaseActivity.startActivity(intent);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        C45359soM.copydefault.KWHzl();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportHomeBaseActivity$onChatbotClicked$1(this, valueOf().KWHzl(), null), 3, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class PageState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PageState[] $VALUES;
        public static final PageState CONTENT = new PageState("CONTENT", 0);
        public static final PageState LOADING = new PageState("LOADING", 1);
        public static final PageState ERROR = new PageState(EventType.ERROR, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PageState[] $values() {
            return new PageState[]{CONTENT, LOADING, ERROR};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PageState> getEntries() {
            return $ENTRIES;
        }

        private PageState(String str, int i) {
        }

        static {
            PageState[] pageStateArr$values = $values();
            $VALUES = pageStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pageStateArr$values);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: com.okinc.okex.center.ui.SupportHomeBaseActivity$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0533StateListAnimator implements StateListAnimator {
            public static final C0533StateListAnimator copydefault = new C0533StateListAnimator();

            private C0533StateListAnimator() {
            }
        }

        public static final class TaskDescription implements StateListAnimator {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
            }
        }
    }

    @Override // o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
