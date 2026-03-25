package o;

import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.work.WorkManager;
import com.okinc.buysell.data.BuySellResultContentData;
import com.okinc.buysell.data.ImageType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lSt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ActivityC30286lSt extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm EZpvd;

    /* JADX INFO: renamed from: o.lSt$Activity */
    public final /* synthetic */ class Activity {
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

    public ActivityC30286lSt() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(lSO.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.result.BuySellResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.result.BuySellResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.result.BuySellResultActivity$special$$inlined$viewModels$default$3
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

    public final lSO OLrzqt() {
        return (lSO) this.EZpvd.getValue();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i;
        super.onCreate(bundle);
        AbstractC31410ltW abstractC31410ltWKWHzl = AbstractC31410ltW.KWHzl(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(abstractC31410ltWKWHzl, "");
        setContentView(abstractC31410ltWKWHzl.getRoot());
        final BuySellResultContentData buySellResultContentData = (BuySellResultContentData) getIntent().getParcelableExtra("EXTRA_CONTENT_DATA");
        if (buySellResultContentData != null) {
            OLrzqt().EZpvd(buySellResultContentData.isConnected(), buySellResultContentData.OLrzqt(), buySellResultContentData.AkhnZx(), buySellResultContentData.valueOf(), buySellResultContentData.djBIcL(), new Function0() { // from class: o.lSw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC30286lSt.copydefault(buySellResultContentData, this);
                }
            });
            int i2 = Activity.EZpvd[buySellResultContentData.copydefault().ordinal()];
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
            abstractC31410ltWKWHzl.OLrzqt.setVisibility(0);
            abstractC31410ltWKWHzl.OLrzqt.setAnimation(i);
            abstractC31410ltWKWHzl.OLrzqt.playAnimation();
        }
        abstractC31410ltWKWHzl.copydefault(OLrzqt());
        lzS lzs = (lzS) new ViewModelProvider(this).get(lzS.class);
        lzS.initialize$default(lzs, buySellResultContentData != null ? buySellResultContentData.AEQbTJ() : null, buySellResultContentData != null ? buySellResultContentData.AhwBna() : null, buySellResultContentData != null ? buySellResultContentData.gEmmrt() : true, false, true, new Function0() { // from class: o.lSs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC30286lSt.copydefault(this.copydefault, buySellResultContentData);
            }
        }, new Function0() { // from class: o.lSB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC30286lSt.AEQbTJ(this.KWHzl, buySellResultContentData);
            }
        }, 8, null);
        abstractC31410ltWKWHzl.djBIcL.AEQbTJ(lzs);
        OLrzqt(this);
    }

    public static final Unit copydefault(BuySellResultContentData buySellResultContentData, ActivityC30286lSt activityC30286lSt) {
        C30290lSx.EZpvd.OLrzqt(buySellResultContentData.EZpvd(), activityC30286lSt);
        activityC30286lSt.finish();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC30286lSt activityC30286lSt, BuySellResultContentData buySellResultContentData) {
        activityC30286lSt.copydefault(buySellResultContentData);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC30286lSt activityC30286lSt, BuySellResultContentData buySellResultContentData) {
        activityC30286lSt.OLrzqt(buySellResultContentData);
        return Unit.INSTANCE;
    }

    public final void copydefault(BuySellResultContentData buySellResultContentData) {
        if (buySellResultContentData != null) {
            C30290lSx.EZpvd.OLrzqt(buySellResultContentData.KWHzl(), this);
            finish();
        }
    }

    public final void OLrzqt(BuySellResultContentData buySellResultContentData) {
        if (buySellResultContentData != null) {
            C30290lSx.EZpvd.OLrzqt(buySellResultContentData.AYXKKw(), this);
            finish();
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        pUU.OLrzqt("PaymentResultActivity onBackPressed, block");
    }

    public final void OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        WorkManager.getInstance(context.getApplicationContext()).cancelAllWorkByTag("simple_trade");
    }

    /* JADX INFO: renamed from: o.lSt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
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
