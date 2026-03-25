package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BizResp;
import com.okinc.unify_trade.biz.WatchListBean;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.paM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC38484paM extends AbstractActivityC38560pbj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public InterfaceC37934pGc AEQbTJ;
    public AbstractC36017oMe AYXKKw;
    public android.widget.ImageView AkhnZx;
    public android.view.View AuCTel;
    public java.lang.String DbNXlk;
    public android.widget.ImageView djBIcL;
    public java.lang.String ejfBZ;
    public C55254xgV fARcdN;
    public boolean gEmmrt;
    public C57596ylR getNewProxyInstance;
    public Application isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public java.lang.String valueOf;
    public android.widget.ImageView values;
    public java.util.ArrayList<WatchListData> fetchVPNInfo = new java.util.ArrayList<>();
    public java.util.ArrayList<java.lang.String> fIwbmz = new java.util.ArrayList<>();
    public java.util.ArrayList<AbstractC32996moC> copydefault = new java.util.ArrayList<>();
    public final java.util.ArrayList<java.lang.String> KWHzl = new java.util.ArrayList<>();
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.paI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC38484paM.gEmmrt(this.EZpvd);
        }
    });
    public final android.os.Handler AhwBna = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.lang.Runnable fJNWhG = new java.lang.Runnable() { // from class: o.paJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            ActivityC38484paM.values(this.AEQbTJ);
        }
    };

    /* JADX INFO: renamed from: o.paM$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Runnable AEQbTJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method o.pbj.OLrzqt()V */
    public final android.os.Handler OLrzqt() {
        return this.AhwBna;
    }

    public ActivityC38484paM() {
        final Function0 function0 = null;
        this.iwGUEr = new ViewModelLazy(C56524yIo.AEQbTJ(C37858pDh.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.CoinTabInfoActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.CoinTabInfoActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.CoinTabInfoActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.paM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.paM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final C37858pDh fetchVPNInfo() {
        return (C37858pDh) this.iwGUEr.getValue();
    }

    /* JADX DEBUG: Possible override for method o.pbj.EZpvd()V */
    public final android.view.View EZpvd() {
        return (android.view.View) this.EZpvd.getValue();
    }

    public static final android.view.View gEmmrt(ActivityC38484paM activityC38484paM) {
        android.view.View viewInflate = android.view.View.inflate(activityC38484paM, C35964oKf.Application.RgLUBD, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activityC38484paM.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        return viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    @Override // o.AbstractActivityC38560pbj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.DbNXlk = getIntent().getStringExtra("coin");
        this.ejfBZ = getIntent().getStringExtra("symbol");
        this.valueOf = getIntent().getStringExtra("from");
        this.AYXKKw = (AbstractC36017oMe) DataBindingUtil.setContentView(this, C35964oKf.Application.KWHzl);
        isConnected();
        C32866mlf.onEvent$default("Token_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.pba
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.valueOf(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.paX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC38484paM.valueOf(this.copydefault);
            }
        });
    }

    public static final Unit valueOf(ActivityC38484paM activityC38484paM, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("tab", "info", true);
        eventParamsList.put("timeframe", "24h", true);
        java.lang.String str2 = activityC38484paM.valueOf;
        if (str2 == null) {
            str2 = "";
        }
        eventParamsList.put("from_page", str2, true);
        java.lang.String str3 = activityC38484paM.DbNXlk;
        if (str3 == null) {
            java.lang.String str4 = activityC38484paM.ejfBZ;
            if (str4 != null) {
                str = str4;
            }
        } else {
            str = str3;
        }
        eventParamsList.put("token", str, true);
        return Unit.INSTANCE;
    }

    public static final void valueOf(ActivityC38484paM activityC38484paM) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC38484paM, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void isConnected() {
        InterfaceC54577xNn interfaceC54577xNn;
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        android.widget.LinearLayout linearLayout;
        AbstractC36017oMe abstractC36017oMe = this.AYXKKw;
        if (abstractC36017oMe != null && (linearLayout = abstractC36017oMe.AEQbTJ) != null) {
            linearLayout.setPadding(0, C33570myu.OLrzqt(), 0, 0);
        }
        AbstractC36017oMe abstractC36017oMe2 = this.AYXKKw;
        if (abstractC36017oMe2 != null && (c52794wYp2 = abstractC36017oMe2.OLrzqt) != null) {
            c52794wYp2.setOnClickListener(new View.OnClickListener() { // from class: o.paR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC38484paM.djBIcL(this.EZpvd, view);
                }
            });
        }
        AbstractC36017oMe abstractC36017oMe3 = this.AYXKKw;
        if (abstractC36017oMe3 != null && (c52794wYp = abstractC36017oMe3.djBIcL) != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.paW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC38484paM.AhwBna(this.KWHzl, view);
                }
            });
        }
        this.fARcdN = (C55254xgV) findViewById(C35964oKf.StateListAnimator.aHXSQp);
        this.getNewProxyInstance = (C57596ylR) findViewById(C35964oKf.StateListAnimator.MediaSessionCompatMediaSessionImplApi191);
        this.AuCTel = findViewById(C35964oKf.StateListAnimator.AudioAttributesImplApi21Parcelizer);
        this.djBIcL = (android.widget.ImageView) findViewById(C35964oKf.StateListAnimator.fGsPTM);
        this.values = (android.widget.ImageView) findViewById(C35964oKf.StateListAnimator.hBUiXU);
        this.AkhnZx = (android.widget.ImageView) findViewById(C35964oKf.StateListAnimator.vqBjd);
        android.widget.ImageView imageView = this.djBIcL;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: o.paV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC38484paM.AYXKKw(this.AEQbTJ, view);
                }
            });
        }
        android.widget.ImageView imageView2 = this.values;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.paT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC38484paM.copydefault(this.KWHzl, view);
                }
            });
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) {
            android.widget.ImageView imageView3 = this.values;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            djBIcL();
        }
        DbNXlk();
        values();
    }

    public static final void djBIcL(final ActivityC38484paM activityC38484paM, android.view.View view) {
        activityC38484paM.fetchVPNInfo().EZpvd(activityC38484paM);
        C32866mlf.onEvent$default("Token_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.AYXKKw(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AYXKKw(ActivityC38484paM activityC38484paM, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "kline", true);
        java.lang.String str2 = activityC38484paM.DbNXlk;
        if (str2 == null) {
            java.lang.String str3 = activityC38484paM.ejfBZ;
            if (str3 != null) {
                str = str3;
            }
        } else {
            str = str2;
        }
        eventParamsList.put("token", str, true);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(final ActivityC38484paM activityC38484paM, android.view.View view) {
        activityC38484paM.fetchVPNInfo().KWHzl((android.app.Activity) activityC38484paM);
        C32866mlf.onEvent$default("Token_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.paU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.djBIcL(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit djBIcL(ActivityC38484paM activityC38484paM, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", ExtJson.BRC20TYPE_TRADE, true);
        java.lang.String str2 = activityC38484paM.DbNXlk;
        if (str2 == null) {
            java.lang.String str3 = activityC38484paM.ejfBZ;
            if (str3 != null) {
                str = str3;
            }
        } else {
            str = str2;
        }
        eventParamsList.put("token", str, true);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(ActivityC38484paM activityC38484paM, android.view.View view) {
        activityC38484paM.finish();
    }

    /* JADX INFO: renamed from: o.paM$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC38484paM KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC38484paM activityC38484paM) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = activityC38484paM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC38484paM activityC38484paM = this.KWHzl;
                try {
                    Result.Application application = Result.Companion;
                    InterfaceC37934pGc interfaceC37934pGc = activityC38484paM.AEQbTJ;
                    if (interfaceC37934pGc != null) {
                        interfaceC37934pGc.KWHzl();
                    }
                    activityC38484paM.OLrzqt().removeCallbacks(activityC38484paM.AEQbTJ());
                    objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(activityC38484paM.OLrzqt().postDelayed(activityC38484paM.AEQbTJ(), activityC38484paM.AEQbTJ instanceof ViewOnClickListenerC38513pap ? 32 : 0)));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ(this.KWHzl.getTAG(), " share error", thM7380exceptionOrNullimpl);
                }
            }
        }
    }

    public static final void copydefault(final ActivityC38484paM activityC38484paM, android.view.View view) {
        java.lang.String str = activityC38484paM.DbNXlk;
        if (str != null) {
            activityC38484paM.copydefault(str, !activityC38484paM.gEmmrt);
        }
        C32866mlf.onEvent$default("Token_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.paY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.AhwBna(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(ActivityC38484paM activityC38484paM, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "favorites", true);
        java.lang.String str2 = activityC38484paM.DbNXlk;
        if (str2 == null) {
            java.lang.String str3 = activityC38484paM.ejfBZ;
            if (str3 != null) {
                str = str3;
            }
        } else {
            str = str2;
        }
        eventParamsList.put("token", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.paM$ActionBar */
    public static final class ActionBar extends ViewPager.SimpleOnPageChangeListener {
        public ActionBar() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            ActivityC38484paM activityC38484paM = ActivityC38484paM.this;
            java.lang.Object obj = activityC38484paM.copydefault.get(i);
            Intrinsics.copydefault(obj, "");
            activityC38484paM.AEQbTJ = (InterfaceC37934pGc) obj;
        }
    }

    private final void values() {
        C57596ylR c57596ylR = this.getNewProxyInstance;
        if (c57596ylR != null) {
            c57596ylR.addOnPageChangeListener(new ActionBar());
        }
        android.widget.ImageView imageView = this.AkhnZx;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        C55254xgV c55254xgV = this.fARcdN;
        if (c55254xgV != null) {
            c55254xgV.AEQbTJ(new Activity());
        }
    }

    /* JADX INFO: renamed from: o.paM$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            C32866mlf.EZpvd("token_tab_click", new EventParam("type", C33129mqd.gEmmrt(tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null), true));
        }
    }

    public static final void values(ActivityC38484paM activityC38484paM) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            activityC38484paM.valueOf();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(activityC38484paM.getTAG(), "share run error", thM7380exceptionOrNullimpl);
        }
    }

    public final void valueOf() {
        java.util.List<android.view.View> listOLrzqt;
        C32866mlf.onEvent$default("Token_Full_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pbg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.gEmmrt(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC37934pGc interfaceC37934pGc = this.AEQbTJ;
        if (interfaceC37934pGc == null || (listOLrzqt = interfaceC37934pGc.OLrzqt()) == null) {
            return;
        }
        android.view.View viewFindViewById = findViewById(C35964oKf.StateListAnimator.DCUTEI);
        java.util.ArrayList<android.view.View> arrayList = new java.util.ArrayList(listOLrzqt);
        android.view.View viewFindViewById2 = findViewById(C35964oKf.StateListAnimator.onConnectionSuspended);
        if (viewFindViewById2 != null) {
            arrayList.add(0, viewFindViewById2);
        }
        if (viewFindViewById != null) {
            arrayList.add(0, viewFindViewById);
        }
        java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.view.View view : arrayList) {
            if (view.getBackground() == null) {
                arrayList2.add(view);
                AEQbTJ(view, true);
            }
        }
        java.util.Iterator it = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 2).iterator();
        int height = 1900;
        while (it.hasNext()) {
            height += ((android.view.View) it.next()).getHeight();
        }
        java.lang.System.currentTimeMillis();
        android.view.View[] viewArr = (android.view.View[]) arrayList.toArray(new android.view.View[0]);
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt((android.view.View[]) java.util.Arrays.copyOf(viewArr, viewArr.length));
        android.graphics.Bitmap bitmapOLrzqt2 = C33487mxQ.OLrzqt(EZpvd());
        java.lang.System.currentTimeMillis();
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AEQbTJ((android.view.View) it2.next(), false);
        }
        java.lang.System.currentTimeMillis();
        showLoading();
        android.graphics.Bitmap bitmap = (!Intrinsics.EZpvd(this.AEQbTJ, CollectionsKt___CollectionsKt.firstOrNull(this.copydefault)) || bitmapOLrzqt.getHeight() <= height) ? null : bitmapOLrzqt;
        if (bitmap != null) {
            android.view.View view2 = this.AuCTel;
            bitmapOLrzqt = view2 != null ? C33487mxQ.OLrzqt(view2) : null;
            if (bitmapOLrzqt != null) {
                bitmapOLrzqt = C33487mxQ.copydefault(android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), height), bitmapOLrzqt);
            } else {
                bitmapOLrzqt = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), height);
            }
        }
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        if (bitmapOLrzqt != null) {
            bitmapOLrzqt = bitmapOLrzqt;
        }
        android.graphics.Bitmap bitmapOLrzqt3 = C33487mxQ.OLrzqt(bitmapOLrzqt, bitmapOLrzqt2);
        Intrinsics.checkNotNullExpressionValue(bitmapOLrzqt3, "");
        stateListAnimator.copydefault(bitmapOLrzqt3, this, new Function1() { // from class: o.pbe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.copydefault(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.paO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.KWHzl(this.OLrzqt, (java.io.File) obj);
            }
        });
        java.lang.System.currentTimeMillis();
    }

    public static final Unit gEmmrt(ActivityC38484paM activityC38484paM, EventParamsList eventParamsList) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button_type", "share", true);
        java.lang.String str2 = activityC38484paM.DbNXlk;
        if (str2 == null) {
            java.lang.String str3 = activityC38484paM.ejfBZ;
            if (str3 != null) {
                str = str3;
            }
        } else {
            str = str2;
        }
        eventParamsList.put("token", str, true);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(android.view.View view, boolean z) {
        if (z) {
            view.setBackgroundColor(view.getResources().getColor(C52761wXj.Activity.DGgkXd));
        } else {
            view.setBackground(null);
        }
    }

    public static final Unit copydefault(ActivityC38484paM activityC38484paM, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        activityC38484paM.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final ActivityC38484paM activityC38484paM, final java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        activityC38484paM.dismissLoading();
        android.widget.ImageView imageView = activityC38484paM.AkhnZx;
        if (imageView == null) {
            Intrinsics.gEmmrt("");
            imageView = null;
        }
        imageView.post(new java.lang.Runnable() { // from class: o.paP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC38484paM.AEQbTJ(file, activityC38484paM);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(java.io.File file, ActivityC38484paM activityC38484paM) {
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC38484paM, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.paZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38484paM.AEQbTJ((ImageShareParams) obj);
            }
        }), null, 2, null));
    }

    public static final Unit AEQbTJ(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_coininfo_poster");
        return Unit.INSTANCE;
    }

    private final void DbNXlk() {
        this.fIwbmz.clear();
        this.copydefault.clear();
        this.KWHzl.clear();
        this.copydefault.add(ViewOnClickListenerC38513pap.Companion.EZpvd());
        this.copydefault.add(C38516pas.Companion.AEQbTJ());
        this.copydefault.add(C39409prl.Companion.AEQbTJ());
        java.util.ArrayList<java.lang.String> arrayList = this.fIwbmz;
        arrayList.add(getString(C35964oKf.Fragment.isElapsedRealtimeNanosAvailable));
        arrayList.add(getString(C35964oKf.Fragment.QSAYLr));
        arrayList.add(getString(C35964oKf.Fragment.HJWChPdIKEqB));
        this.KWHzl.add("KLineTabCoin");
        this.KWHzl.add("KLineTabTrade");
        this.KWHzl.add("KLineTabEarn");
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        this.isConnected = new Application(supportFragmentManager, this.fIwbmz, this.copydefault);
        C57596ylR c57596ylR = this.getNewProxyInstance;
        if (c57596ylR != null) {
            c57596ylR.removeAllViews();
        }
        C57596ylR c57596ylR2 = this.getNewProxyInstance;
        if (c57596ylR2 != null) {
            c57596ylR2.setAdapter(this.isConnected);
        }
        C55254xgV c55254xgV = this.fARcdN;
        if (c55254xgV != null) {
            c55254xgV.setupWithViewPager(this.getNewProxyInstance);
        }
        C57596ylR c57596ylR3 = this.getNewProxyInstance;
        if (c57596ylR3 != null) {
            Application application = this.isConnected;
            c57596ylR3.setOffscreenPageLimit(application != null ? application.getCount() : 1);
        }
        C57596ylR c57596ylR4 = this.getNewProxyInstance;
        if (c57596ylR4 != null) {
            c57596ylR4.setCurrentItem(0);
        }
        ActivityResultCaller activityResultCaller = this.copydefault.get(0);
        Intrinsics.copydefault(activityResultCaller, "");
        this.AEQbTJ = (InterfaceC37934pGc) activityResultCaller;
        final C55254xgV c55254xgV2 = this.fARcdN;
        if (c55254xgV2 != null) {
            C39214poA.observeTabLayoutCompleted$default(c55254xgV2.copydefault(), 0L, new Function0() { // from class: o.paS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC38484paM.EZpvd(c55254xgV2, this);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(C55254xgV c55254xgV, ActivityC38484paM activityC38484paM) {
        Application application = activityC38484paM.isConnected;
        if (application != null && c55254xgV.copydefault().getTabCount() == application.getCount()) {
            int tabCount = c55254xgV.copydefault().getTabCount();
            for (int i = 0; i < tabCount; i++) {
                TabLayout.Tab tabAt = c55254xgV.copydefault().getTabAt(i);
                java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(activityC38484paM.KWHzl, i);
                if (str != null && tabAt != null) {
                    tabAt.setContentDescription(str);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.paM$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application extends AbstractC33000moG {
        public final java.util.List<androidx.fragment.app.Fragment> OLrzqt;
        public java.util.ArrayList<java.lang.String> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull java.util.List<? extends androidx.fragment.app.Fragment> list) {
            super(fragmentManager);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = arrayList;
            this.OLrzqt = list;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            return this.OLrzqt.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.copydefault.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return this.copydefault.get(i);
        }
    }

    public final void copydefault(java.lang.String str, final boolean z) {
        if (KWHzl()) {
            final C54771xUs c54771xUs = new C54771xUs(null);
            Function2 function2 = new Function2() { // from class: o.paQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC38484paM.KWHzl(z, c54771xUs, (BizInstrument) obj, (MutableLiveData) obj2);
                }
            };
            BizInstrument bizInstrumentKWHzl = c54771xUs.KWHzl(str);
            MutableLiveData mutableLiveData = new MutableLiveData();
            mutableLiveData.observe(this, new LoaderManager(new Function1() { // from class: o.paN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38484paM.EZpvd(this.copydefault, z, (BizResp) obj);
                }
            }));
            Unit unit = Unit.INSTANCE;
            function2.invoke(bizInstrumentKWHzl, mutableLiveData);
        }
    }

    public static final Unit KWHzl(boolean z, C54771xUs c54771xUs, BizInstrument bizInstrument, MutableLiveData<BizResp> mutableLiveData) {
        if (z) {
            c54771xUs.AEQbTJ(bizInstrument, mutableLiveData);
        } else {
            c54771xUs.AEQbTJ(bizInstrument, mutableLiveData, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC38484paM activityC38484paM, boolean z, BizResp bizResp) {
        if (bizResp.isSuccess()) {
            activityC38484paM.djBIcL();
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(z ? C35964oKf.Fragment.aUsmxb : C35964oKf.Fragment.hrNTAI));
        } else {
            C33134mqi.AEQbTJ(bizResp.getErrorMsg());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.paM$PendingIntent */
    public static final class PendingIntent implements InterfaceC55701xos<java.util.List<? extends WatchListData>> {
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<WatchListData> list, java.lang.Exception exc) {
            java.lang.Object pwp;
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            BizInstrument suggestedInstrument$default;
            if (!z || list == null) {
                return;
            }
            ActivityC38484paM.this.fetchVPNInfo.clear();
            ActivityC38484paM.this.fetchVPNInfo.addAll(list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (Intrinsics.EZpvd((java.lang.Object) ((WatchListData) obj).getInstType(), (java.lang.Object) "COIN")) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                pwp = null;
                if (!it.hasNext()) {
                    break;
                }
                WatchListData watchListData = (WatchListData) it.next();
                if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "FUTURES")) {
                    InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListData.getInstId(), watchListData.getAlias(), 2, null)) != null) {
                        pwp = new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
                    }
                } else {
                    pwp = new pWP(watchListData.getInstId(), watchListData.getInstType(), null, null, null, 28, null);
                }
                arrayList2.add(pwp);
            }
            ActivityC38484paM activityC38484paM = ActivityC38484paM.this;
            java.util.Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                java.lang.Object next = it2.next();
                pWP pwp2 = (pWP) next;
                if (Intrinsics.EZpvd((java.lang.Object) (pwp2 != null ? pwp2.AEQbTJ() : null), (java.lang.Object) activityC38484paM.DbNXlk)) {
                    if (Intrinsics.EZpvd((java.lang.Object) (pwp2 != null ? pwp2.KWHzl() : null), (java.lang.Object) "COIN")) {
                        pwp = next;
                        break;
                    }
                }
            }
            activityC38484paM.gEmmrt = pwp != null;
            android.widget.ImageView imageView = ActivityC38484paM.this.values;
            if (imageView != null) {
                imageView.setSelected(ActivityC38484paM.this.gEmmrt);
            }
        }
    }

    public final void djBIcL() {
        java.util.ArrayList arrayList;
        pWP pwp;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        BizInstrument suggestedInstrument$default;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        C56131xwy c56131xwyFetchVPNInfo2;
        java.lang.Object obj = null;
        if (pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) == null || (c56131xwyFetchVPNInfo2 = interfaceC54581xNrOLrzqt3.fetchVPNInfo()) == null) {
                return;
            }
            c56131xwyFetchVPNInfo2.OLrzqt(new PendingIntent());
            return;
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        java.util.ArrayList<WatchListBean> arrayListAEQbTJ = (interfaceC49425uoM2 == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt2.fetchVPNInfo()) == null) ? null : c56131xwyFetchVPNInfo.AEQbTJ();
        if (arrayListAEQbTJ != null) {
            java.util.ArrayList<WatchListBean> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayListAEQbTJ) {
                if (Intrinsics.EZpvd((java.lang.Object) ((WatchListBean) obj2).getInstType(), (java.lang.Object) "COIN")) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (WatchListBean watchListBean : arrayList2) {
                if (Intrinsics.EZpvd((java.lang.Object) watchListBean.getInstType(), (java.lang.Object) "FUTURES")) {
                    InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                    pwp = (interfaceC49425uoM3 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "FUTURES", null, watchListBean.getInstId(), watchListBean.getAlias(), 2, null)) == null) ? null : new pWP(suggestedInstrument$default.getInstId(), suggestedInstrument$default.getInstType(), null, null, null, 28, null);
                } else {
                    pwp = new pWP(watchListBean.getInstId(), watchListBean.getInstType(), null, null, null, 28, null);
                }
                arrayList.add(pwp);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                pWP pwp2 = (pWP) next;
                if (Intrinsics.EZpvd((java.lang.Object) (pwp2 != null ? pwp2.AEQbTJ() : null), (java.lang.Object) this.DbNXlk)) {
                    if (Intrinsics.EZpvd((java.lang.Object) (pwp2 != null ? pwp2.KWHzl() : null), (java.lang.Object) "COIN")) {
                        obj = next;
                        break;
                    }
                }
            }
            obj = (pWP) obj;
        }
        boolean z = obj != null;
        this.gEmmrt = z;
        android.widget.ImageView imageView = this.values;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    @Override // o.AbstractActivityC33041mov
    public void handleIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.handleIntent(intent);
        C37858pDh c37858pDhFetchVPNInfo = fetchVPNInfo();
        java.lang.String stringExtra = intent.getStringExtra("coin");
        c37858pDhFetchVPNInfo.KWHzl(stringExtra != null ? stringExtra : "", intent.getStringExtra("symbol"));
    }

    public final boolean KWHzl() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn2.KWHzl()) {
            return true;
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        return (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || !interfaceC54577xNn.EZpvd()) ? false : true;
    }

    @Override // o.AbstractActivityC38560pbj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        oLF.EZpvd.AEQbTJ();
        this.AhwBna.removeCallbacksAndMessages(null);
    }

    @Override // o.AbstractActivityC38560pbj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38560pbj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC38560pbj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC38560pbj, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
