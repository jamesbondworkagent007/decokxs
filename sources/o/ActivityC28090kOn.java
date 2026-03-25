package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.Glide;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.business.premarket.PreMarketLandingEmpty;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.market.common.bean.PreMarketLandingBean;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.uilab.stateful.StatefulView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43294rma;
import o.InterfaceC54581xNr;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ActivityC28090kOn extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public qZI KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.kOl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC28090kOn.valueOf();
        }
    });
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.kOn$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull qZI qzi) {
        Intrinsics.checkNotNullParameter(qzi, "");
        this.KWHzl = qzi;
    }

    public ActivityC28090kOn() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(C28101kOy.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.premarket.PreMarketLandingListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.premarket.PreMarketLandingListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.premarket.PreMarketLandingListActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.kOn$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kOn.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC28090kOn.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw valueOf() {
        return new C43316rmw();
    }

    public final C43316rmw AYXKKw() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    public final C28101kOy djBIcL() {
        return (C28101kOy) this.copydefault.getValue();
    }

    public final qZI AhwBna() {
        qZI qzi = this.KWHzl;
        if (qzi != null) {
            return qzi;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault(qZI.OLrzqt(android.view.LayoutInflater.from(this)));
        setContentView(AhwBna().getRoot());
        OLrzqt();
        copydefault();
    }

    public void copydefault() {
        djBIcL().AEQbTJ();
    }

    private final void OLrzqt() {
        KWHzl();
        AhwBna().EZpvd.OLrzqt(new InterfaceC57903yrG() { // from class: o.kOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC28090kOn.EZpvd(this.EZpvd, interfaceC57934yrl);
            }
        });
        AhwBna().EZpvd.AhwBna(false);
        djBIcL().OLrzqt().observe(this, new ActionBar(new Function1() { // from class: o.kOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28090kOn.OLrzqt(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
    }

    public static final void EZpvd(ActivityC28090kOn activityC28090kOn, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC28090kOn.copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kOn */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC28090kOn activityC28090kOn, java.util.ArrayList arrayList) {
        activityC28090kOn.AhwBna().KWHzl.setStatus(StatefulView.Status.Content);
        activityC28090kOn.AhwBna().EZpvd.AEQbTJ();
        if (!C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            activityC28090kOn.AEQbTJ();
        } else if (arrayList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                PreMarketLandingBean preMarketLandingBean = (PreMarketLandingBean) obj;
                if (Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getState(), (java.lang.Object) "live") || Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getState(), (java.lang.Object) "preopen") || Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getState(), (java.lang.Object) EopTrackEvent.CLOSE) || Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getState(), (java.lang.Object) "converted")) {
                    arrayList2.add(obj);
                }
            }
            activityC28090kOn.copydefault((java.util.ArrayList<PreMarketLandingBean>) arrayList2);
        }
        rVN.reportFullyDrawn$default(activityC28090kOn, arrayList != null, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public void AEQbTJ() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new PreMarketLandingEmpty());
        C33064mpR.OLrzqt(AYXKKw(), (java.util.List<? extends java.lang.Object>) arrayList);
    }

    public final void KWHzl(PreMarketLandingBean preMarketLandingBean, android.graphics.drawable.Drawable drawable) {
        C28098kOv c28098kOv = new C28098kOv(this);
        java.lang.String bigIcon = C33129mqd.OLrzqt((java.lang.CharSequence) preMarketLandingBean.getBigIcon()) ? preMarketLandingBean.getBigIcon() : preMarketLandingBean.getIcon();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) bigIcon)) {
            Intrinsics.copydefault(Glide.copydefault((FragmentActivity) this).AEQbTJ().copydefault(bigIcon).OLrzqt(new Activity(c28098kOv, this, preMarketLandingBean, drawable)));
            return;
        }
        android.view.View viewFindViewById = c28098kOv.copydefault().findViewById(qZH.StateListAnimator.FQMcgE);
        Intrinsics.copydefault(viewFindViewById, "");
        ((android.widget.ImageView) viewFindViewById).setImageDrawable(drawable);
        KWHzl(c28098kOv, preMarketLandingBean, drawable);
    }

    /* JADX INFO: renamed from: o.kOn$Activity */
    public static final class Activity extends AbstractC5454Si<android.graphics.drawable.Drawable> {
        public final /* synthetic */ android.graphics.drawable.Drawable AEQbTJ;
        public final /* synthetic */ C28098kOv AYXKKw;
        public final /* synthetic */ PreMarketLandingBean KWHzl;
        public final /* synthetic */ ActivityC28090kOn djBIcL;

        public Activity(C28098kOv c28098kOv, ActivityC28090kOn activityC28090kOn, PreMarketLandingBean preMarketLandingBean, android.graphics.drawable.Drawable drawable) {
            this.AYXKKw = c28098kOv;
            this.djBIcL = activityC28090kOn;
            this.KWHzl = preMarketLandingBean;
            this.AEQbTJ = drawable;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            android.view.View viewFindViewById = this.AYXKKw.copydefault().findViewById(qZH.StateListAnimator.FQMcgE);
            Intrinsics.copydefault(viewFindViewById, "");
            ((android.widget.ImageView) viewFindViewById).setImageDrawable(drawable);
            this.djBIcL.KWHzl(this.AYXKKw, this.KWHzl, this.AEQbTJ);
        }
    }

    public final void KWHzl(C28098kOv c28098kOv, PreMarketLandingBean preMarketLandingBean, android.graphics.drawable.Drawable drawable) {
        c28098kOv.setData(preMarketLandingBean, drawable);
        measure(c28098kOv.copydefault());
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(c28098kOv.copydefault());
        Intrinsics.checkNotNullExpressionValue(bitmapOLrzqt, "");
        ShareFileProvider.Companion.copydefault(bitmapOLrzqt, this, new Function1() { // from class: o.kOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28090kOn.EZpvd((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.kOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28090kOn.copydefault(this.EZpvd, (java.io.File) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC28090kOn activityC28090kOn, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC28090kOn, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.kOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28090kOn.copydefault((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("pre_market");
        return Unit.INSTANCE;
    }

    public final void measure(android.view.View view) {
        getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        C33487mxQ.EZpvd(view, C55298xhM.dp2px$default(375.0f, null, 1, null), C55298xhM.dp2px$default(560.0f, null, 1, null));
    }

    public void KWHzl() {
        AhwBna().copydefault.setAdapter(AYXKKw());
        AhwBna().copydefault.setLayoutManager(new LinearLayoutManager(this));
        AYXKKw().register(PreMarketLandingBean.class, new C28079kOc(new Function1() { // from class: o.kOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28090kOn.AEQbTJ(this.KWHzl, (PreMarketLandingBean) obj);
            }
        }, new Function2() { // from class: o.kOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC28090kOn.copydefault(this.EZpvd, (PreMarketLandingBean) obj, (android.graphics.drawable.Drawable) obj2);
            }
        }));
        AYXKKw().register(PreMarketLandingEmpty.class, new kNY());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0011 A[PHI: r2
  0x0011: PHI (r2v7 java.lang.String) = (r2v0 java.lang.String), (r2v1 java.lang.String) binds: [B:3:0x000f, B:6:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(ActivityC28090kOn activityC28090kOn, PreMarketLandingBean preMarketLandingBean) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(preMarketLandingBean, "");
        java.lang.String str2 = "FUTURES";
        if (Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getInstType(), (java.lang.Object) "FUTURES")) {
            str = str2;
        } else {
            str2 = "SWAP";
            if (!Intrinsics.EZpvd((java.lang.Object) preMarketLandingBean.getInstType(), (java.lang.Object) "SWAP")) {
                java.lang.String instType = preMarketLandingBean.getInstType();
                if (instType != null) {
                    str = instType;
                }
            }
        }
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if ((interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt(str) : null) != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if ((interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str, preMarketLandingBean.getInstId(), null, null, 12, null) : null) == null) {
                activityC28090kOn.copydefault();
                C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCRGtXKC), 0, 1, (java.lang.Object) null);
                return Unit.INSTANCE;
            }
        }
        activityC28090kOn.KWHzl(preMarketLandingBean, str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC28090kOn activityC28090kOn, PreMarketLandingBean preMarketLandingBean, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(preMarketLandingBean, "");
        Intrinsics.checkNotNullParameter(drawable, "");
        activityC28090kOn.KWHzl(preMarketLandingBean, drawable);
        return Unit.INSTANCE;
    }

    public final void KWHzl(PreMarketLandingBean preMarketLandingBean, java.lang.String str) {
        int i = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") ? 3 : 2;
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), this, "trade/main/page?bizType=" + i + "&instId=" + preMarketLandingBean.getInstId(), null, new Function1() { // from class: o.kOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC28090kOn.KWHzl((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public void copydefault(java.util.ArrayList<PreMarketLandingBean> arrayList) {
        if (arrayList != null) {
            C33064mpR.OLrzqt(AYXKKw(), (java.util.List<? extends java.lang.Object>) arrayList);
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
