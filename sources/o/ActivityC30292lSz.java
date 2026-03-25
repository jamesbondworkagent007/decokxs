package o;

import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.WorkManager;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.buysell.data.BSCResultButtonActionType;
import com.okinc.buysell.data.BSCResultContentData;
import com.okinc.buysell.data.ImageType;
import com.okinc.buysell.ui.result.ConvertResultViewModel;
import com.okinc.buysell.ui.result.view.AssetMaxApyEarnInfo;
import com.okinc.buysell.ui.result.view.BSCConvertDetailBannerItem;
import com.okinc.buysell.ui.result.view.BannerClickCallback;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import o.InterfaceC31670lzr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC30292lSz extends lSP {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public AbstractC31397ltJ OLrzqt;

    /* JADX INFO: renamed from: o.lSz$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: o.lSz$TaskDescription */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ImageType.values().length];
            try {
                iArr[ImageType.WARNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ImageType.SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageType.PROCESSING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageType.ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    public ActivityC30292lSz() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(ConvertResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.result.ConvertResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.result.ConvertResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.result.ConvertResultActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.lSP.EZpvd()V */
    public final ConvertResultViewModel EZpvd() {
        return (ConvertResultViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.lSP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AbstractC31397ltJ abstractC31397ltJOLrzqt = AbstractC31397ltJ.OLrzqt(getLayoutInflater());
        this.OLrzqt = abstractC31397ltJOLrzqt;
        AbstractC31397ltJ abstractC31397ltJ = null;
        if (abstractC31397ltJOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC31397ltJOLrzqt = null;
        }
        setContentView(abstractC31397ltJOLrzqt.getRoot());
        final BSCResultContentData bSCResultContentData = (BSCResultContentData) getIntent().getParcelableExtra("EXTRA_CONTENT_DATA");
        java.lang.String stringExtra = getIntent().getStringExtra("CONVERT_TRADE_ID");
        if (bSCResultContentData != null) {
            EZpvd().EZpvd(bSCResultContentData.values(), bSCResultContentData.KWHzl(), bSCResultContentData.AkhnZx(), bSCResultContentData.valueOf(), bSCResultContentData.AhwBna(), new Function0() { // from class: o.lSA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC30292lSz.copydefault(bSCResultContentData, this);
                }
            });
            int i2 = TaskDescription.EZpvd[bSCResultContentData.EZpvd().ordinal()];
            if (i2 == 1) {
                i = C52761wXj.PendingIntent.AhwBna;
            } else if (i2 == 2) {
                i = C52761wXj.PendingIntent.uzCIH;
            } else if (i2 == 3) {
                i = C52761wXj.PendingIntent.fIwbmz;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C52761wXj.PendingIntent.valueOf;
            }
            AbstractC31397ltJ abstractC31397ltJ2 = this.OLrzqt;
            if (abstractC31397ltJ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC31397ltJ2 = null;
            }
            LottieAnimationView lottieAnimationView = abstractC31397ltJ2.AEQbTJ;
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation(i);
            lottieAnimationView.playAnimation();
            AbstractC31397ltJ abstractC31397ltJ3 = this.OLrzqt;
            if (abstractC31397ltJ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC31397ltJ3 = null;
            }
            android.widget.ImageView imageView = abstractC31397ltJ3.EZpvd;
            imageView.setOnClickListener(new Application(imageView, 1000L, bSCResultContentData, this));
        }
        AbstractC31397ltJ abstractC31397ltJ4 = this.OLrzqt;
        if (abstractC31397ltJ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC31397ltJ4 = null;
        }
        abstractC31397ltJ4.EZpvd(EZpvd());
        lzS lzs = (lzS) new ViewModelProvider(this).get(lzS.class);
        lzS.initialize$default(lzs, bSCResultContentData != null ? bSCResultContentData.copydefault() : null, bSCResultContentData != null ? bSCResultContentData.gEmmrt() : null, bSCResultContentData != null ? bSCResultContentData.djBIcL() : true, false, true, new Function0() { // from class: o.lSy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC30292lSz.KWHzl(this.EZpvd, bSCResultContentData);
            }
        }, new Function0() { // from class: o.lSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC30292lSz.djBIcL(this.OLrzqt, bSCResultContentData);
            }
        }, 8, null);
        AbstractC31397ltJ abstractC31397ltJ5 = this.OLrzqt;
        if (abstractC31397ltJ5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31397ltJ = abstractC31397ltJ5;
        }
        AbstractC31595lwx abstractC31595lwx = abstractC31397ltJ.gEmmrt;
        abstractC31595lwx.AEQbTJ(lzs);
        C52794wYp c52794wYp = abstractC31595lwx.AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this, bSCResultContentData));
        C52794wYp c52794wYp2 = abstractC31595lwx.OLrzqt;
        c52794wYp2.setOnClickListener(new StateListAnimator(c52794wYp2, 1000L, this, bSCResultContentData));
        AEQbTJ(this);
        KWHzl();
        if (stringExtra != null) {
            EZpvd().KWHzl(stringExtra);
        }
    }

    public static final Unit copydefault(BSCResultContentData bSCResultContentData, ActivityC30292lSz activityC30292lSz) {
        C30288lSv c30288lSv = C30288lSv.AEQbTJ;
        BSCResultButtonActionType bSCResultButtonActionTypeAEQbTJ = bSCResultContentData.AEQbTJ();
        if (!bSCResultContentData.AYXKKw()) {
            bSCResultButtonActionTypeAEQbTJ = null;
        }
        java.lang.String strFetchVPNInfo = bSCResultContentData.fetchVPNInfo();
        if (strFetchVPNInfo == null) {
            strFetchVPNInfo = "";
        }
        c30288lSv.copydefault(bSCResultButtonActionTypeAEQbTJ, strFetchVPNInfo, bSCResultContentData.DbNXlk(), activityC30292lSz);
        activityC30292lSz.finish();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC30292lSz activityC30292lSz, BSCResultContentData bSCResultContentData) {
        activityC30292lSz.copydefault(bSCResultContentData);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC30292lSz activityC30292lSz, BSCResultContentData bSCResultContentData) {
        activityC30292lSz.KWHzl(bSCResultContentData);
        return Unit.INSTANCE;
    }

    public final void copydefault(BSCResultContentData bSCResultContentData) {
        if (bSCResultContentData != null) {
            C30288lSv c30288lSv = C30288lSv.AEQbTJ;
            BSCResultButtonActionType bSCResultButtonActionTypeAEQbTJ = bSCResultContentData.AEQbTJ();
            java.lang.String strFetchVPNInfo = bSCResultContentData.fetchVPNInfo();
            if (strFetchVPNInfo == null) {
                strFetchVPNInfo = "";
            }
            c30288lSv.copydefault(bSCResultButtonActionTypeAEQbTJ, strFetchVPNInfo, bSCResultContentData.DbNXlk(), this);
            finish();
        }
    }

    public final void KWHzl(BSCResultContentData bSCResultContentData) {
        if (bSCResultContentData != null) {
            C30288lSv c30288lSv = C30288lSv.AEQbTJ;
            BSCResultButtonActionType bSCResultButtonActionTypeOLrzqt = bSCResultContentData.OLrzqt();
            java.lang.String strFetchVPNInfo = bSCResultContentData.fetchVPNInfo();
            if (strFetchVPNInfo == null) {
                strFetchVPNInfo = "";
            }
            c30288lSv.copydefault(bSCResultButtonActionTypeOLrzqt, strFetchVPNInfo, bSCResultContentData.DbNXlk(), this);
            finish();
        }
    }

    public final void KWHzl(int i, final java.lang.String str, final java.lang.String str2) {
        C32866mlf.onEvent$default("Convert_ConvertSuccess_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.lSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC30292lSz.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC31670lzr.TaskDescription.gotoFinanceMyCryptoPage$default((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class), this, i, "convert", false, 8, null);
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "input_currency", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "output_currency", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.lSz$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ BSCResultContentData EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC30292lSz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC30292lSz activityC30292lSz, BSCResultContentData bSCResultContentData) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = activityC30292lSz;
            this.EZpvd = bSCResultContentData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.lSz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ BSCResultContentData AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC30292lSz KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, BSCResultContentData bSCResultContentData, ActivityC30292lSz activityC30292lSz) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = bSCResultContentData;
            this.KWHzl = activityC30292lSz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.widget.ImageView imageView = (android.widget.ImageView) this.copydefault;
                if (!this.AEQbTJ.DbNXlk()) {
                    ConvertResultViewModel convertResultViewModelEZpvd = this.KWHzl.EZpvd();
                    Intrinsics.copydefault(imageView);
                    convertResultViewModelEZpvd.copydefault(imageView);
                } else {
                    RxBus.KWHzl("offshore_bsc_l2_dismiss_event");
                    this.KWHzl.finish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lSz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC30292lSz EZpvd;
        public final /* synthetic */ BSCResultContentData KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC30292lSz activityC30292lSz, BSCResultContentData bSCResultContentData) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC30292lSz;
            this.KWHzl = bSCResultContentData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.KWHzl(this.KWHzl);
            }
        }
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        java.lang.String str3 = ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).EZpvd() + "?bizType=0&strategyType=recurring&instId=BTC-USDT&order=1";
        C32866mlf.onEvent$default("Convert_ConvertSuccess_RecurringBuyBanner_Click", (TrackChannel[]) null, new Function1() { // from class: o.lSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC30292lSz.AEQbTJ(str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC31670lzr.TaskDescription.processDeeplink$default((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class), getMActivity(), str3, null, new Function1() { // from class: o.lSH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC30292lSz.copydefault((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_pair", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateEarnBannerView$default(ActivityC30292lSz activityC30292lSz, java.util.List list, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        activityC30292lSz.AEQbTJ((java.util.List<BSCConvertDetailBannerItem>) list, i, str, str2);
    }

    public final void AEQbTJ(final java.util.List<BSCConvertDetailBannerItem> list, int i, final java.lang.String str, final java.lang.String str2) {
        java.util.List<BSCConvertDetailBannerItem> listAhwBna = list.size() > i ? CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, i) : list;
        AbstractC31397ltJ abstractC31397ltJ = null;
        if (listAhwBna.isEmpty()) {
            AbstractC31397ltJ abstractC31397ltJ2 = this.OLrzqt;
            if (abstractC31397ltJ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31397ltJ = abstractC31397ltJ2;
            }
            abstractC31397ltJ.copydefault.setVisibility(8);
            return;
        }
        AbstractC31397ltJ abstractC31397ltJ3 = this.OLrzqt;
        if (abstractC31397ltJ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC31397ltJ3 = null;
        }
        abstractC31397ltJ3.copydefault.setVisibility(0);
        AbstractC31397ltJ abstractC31397ltJ4 = this.OLrzqt;
        if (abstractC31397ltJ4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31397ltJ = abstractC31397ltJ4;
        }
        abstractC31397ltJ.copydefault.EZpvd(new InterfaceC32975mni() { // from class: o.lSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC32975mni
            public final java.lang.Object OLrzqt() {
                return ActivityC30292lSz.copydefault(list, this, str, str2);
            }
        }, listAhwBna);
    }

    public static final java.lang.Object copydefault(final java.util.List list, final ActivityC30292lSz activityC30292lSz, final java.lang.String str, final java.lang.String str2) {
        return new lSU(new Function1() { // from class: o.lSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC30292lSz.EZpvd(list, activityC30292lSz, str, str2, (BannerClickCallback) obj);
            }
        });
    }

    public static final Unit EZpvd(java.util.List list, ActivityC30292lSz activityC30292lSz, java.lang.String str, java.lang.String str2, BannerClickCallback bannerClickCallback) {
        Intrinsics.checkNotNullParameter(bannerClickCallback, "");
        java.lang.String type = bannerClickCallback.getType();
        if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "convert_banner_type_earn")) {
            C32866mlf.onEvent$default("Convert_Mid_RedirectAssets_Click", (TrackChannel[]) null, new Function1() { // from class: o.lSC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC30292lSz.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            java.lang.Integer currencyId = bannerClickCallback.getCurrencyId();
            if (currencyId != null) {
                activityC30292lSz.KWHzl(currencyId.intValue(), str, str2);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "convert_banner_typ_recurring_buy")) {
            C32866mlf.onEvent$default("Convert_Mid_RedirectAssets_Click", (TrackChannel[]) null, new Function1() { // from class: o.lSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC30292lSz.EZpvd((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                Intrinsics.EZpvd((java.lang.Object) ((BSCConvertDetailBannerItem) obj).getConvertBannerType(), (java.lang.Object) "convert_banner_typ_recurring_buy");
                i++;
            }
            Unit unit = Unit.INSTANCE;
            java.lang.String token = bannerClickCallback.getToken();
            activityC30292lSz.OLrzqt(token != null ? token : "", C33129mqd.gEmmrt(unit));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "convert_banner_type_earn", "convert_banner_type_earn", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "convert_banner_typ_recurring_buy", "convert_banner_typ_recurring_buy", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        EZpvd().OLrzqt().observe(this, new PendingIntent(new Function1() { // from class: o.lSE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC30292lSz.copydefault(this.EZpvd, (C32989mnw) obj);
            }
        }));
    }

    public static final Unit copydefault(ActivityC30292lSz activityC30292lSz, C32989mnw c32989mnw) {
        lSS lss = (lSS) c32989mnw.KWHzl();
        if (lss != null) {
            activityC30292lSz.KWHzl(lss.AEQbTJ(), lss.KWHzl(), lss.OLrzqt());
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WorkManager.getInstance(context.getApplicationContext()).cancelAllWorkByTag("simple_trade");
    }

    /* JADX INFO: renamed from: o.lSz$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl(java.util.List<AssetMaxApyEarnInfo> list, java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        java.util.Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                double dAEQbTJ = C33129mqd.AEQbTJ(((AssetMaxApyEarnInfo) next).getRateRangeMax());
                do {
                    java.lang.Object next2 = it.next();
                    double dAEQbTJ2 = C33129mqd.AEQbTJ(((AssetMaxApyEarnInfo) next2).getRateRangeMax());
                    if (java.lang.Double.compare(dAEQbTJ, dAEQbTJ2) < 0) {
                        next = next2;
                        dAEQbTJ = dAEQbTJ2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        AssetMaxApyEarnInfo assetMaxApyEarnInfo = (AssetMaxApyEarnInfo) obj;
        if (assetMaxApyEarnInfo != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new BSCConvertDetailBannerItem(getString(C31351lsQ.Activity.sVvuFk), assetMaxApyEarnInfo.getCurrencyIcon(), assetMaxApyEarnInfo.getCapitalTypeMsg(), getString(C31351lsQ.Activity.DztXDE), xMR.formatICUPercent$default(xMR.copydefault, C33129mqd.copydefault(assetMaxApyEarnInfo.getRateRangeMax()), null, C38307pTy.Companion.copydefault(2), null, null, null, 58, null), getString(C31351lsQ.Activity.apAOXX), (java.lang.Integer) null, (java.lang.Integer) null, "convert_banner_type_earn", assetMaxApyEarnInfo.getCurrencyId(), 192, (DefaultConstructorMarker) null));
            AEQbTJ(arrayList, 2, str, str2);
        }
    }

    @Override // o.lSP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lSP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lSP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.lSP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
