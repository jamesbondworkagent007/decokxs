package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieListener;
import com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsActivity$onCreate$4;
import com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState;
import com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsViewModel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iVU extends iVV {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm gEmmrt;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InvestOrderDetailsState.Status.values().length];
            try {
                iArr[InvestOrderDetailsState.Status.PENDING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InvestOrderDetailsState.Status.COMPLETED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestOrderDetailsState.Status.FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public iVU() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(InvestOrderDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.iVV.AEQbTJ()V */
    public final InvestOrderDetailsViewModel AEQbTJ() {
        return (InvestOrderDetailsViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractActivityC33041mov
    public void handleIntent(@NotNull final android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.handleIntent(intent);
        C27570jxg.investEvent$default("YieldHistoryDetail_Full_Page_View", null, new Function1() { // from class: o.iWa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iVU.AEQbTJ(intent, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(android.content.Intent intent, EventParamsList eventParamsList) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        android.os.Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("source")) == null) {
            string = "defi";
        }
        EventParamsList.put$default(eventParamsList, "source", string, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.iVV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setForceDismiss(false);
        setLoadingCancelable(false);
        iGW igwEZpvd = iGW.EZpvd(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(igwEZpvd, "");
        setContentView(igwEZpvd.getRoot());
        iVZ ivz = new iVZ();
        igwEZpvd.KWHzl.setAdapter(ivz);
        android.widget.TextView title = igwEZpvd.OLrzqt.getTitle();
        Intrinsics.copydefault(title);
        ViewGroup.LayoutParams layoutParams = title.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
            title.setLayoutParams(layoutParams);
            title.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, (android.content.Context) this));
            TextViewCompat.setTextAppearance(title, C52761wXj.LoaderManager.hrNTAI);
            C55173xeu c55173xeu = igwEZpvd.EZpvd;
            java.lang.String string = getString(C25493ixk.FragmentManager.AEQbTJ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setRetry(string);
            igwEZpvd.EZpvd.AEQbTJ().setVisibility(0);
            igwEZpvd.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.iVS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    iVU.AEQbTJ(this.EZpvd, view);
                }
            });
            igwEZpvd.AEQbTJ.OLrzqt(new InterfaceC57903yrG() { // from class: o.iVT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    iVU.AEQbTJ(this.EZpvd, interfaceC57934yrl);
                }
            });
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new InvestOrderDetailsActivity$onCreate$4(this, igwEZpvd, title, ivz, null), 3, null);
            AEQbTJ().EZpvd();
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void AEQbTJ(iVU ivu, android.view.View view) {
        ivu.AEQbTJ().EZpvd();
    }

    public static final void AEQbTJ(iVU ivu, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        ivu.AEQbTJ().EZpvd();
    }

    public final void KWHzl(final android.widget.TextView textView, InvestOrderDetailsState.Status status) {
        int i = ActionBar.copydefault[status.ordinal()];
        if (i == 1) {
            LottieCompositionFactory.fromRawRes(textView.getContext(), C52761wXj.PendingIntent.isConnected).addListener(new LottieListener() { // from class: o.iVY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(java.lang.Object obj) {
                    iVU.KWHzl(textView, (LottieComposition) obj);
                }
            });
            textView.setText(C25493ixk.FragmentManager.FHvxmb);
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.gLWkOL));
        } else if (i == 2) {
            copydefault(textView, C52761wXj.Activity.gLWkOL, C52761wXj.TaskDescription.setPageName, C25493ixk.FragmentManager.gCZUJG);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            copydefault(textView, C52761wXj.Activity.fhUrPt, C52761wXj.TaskDescription.OijiEz, C25493ixk.FragmentManager.hdpuIA);
        }
    }

    public static final void KWHzl(android.widget.TextView textView, LottieComposition lottieComposition) {
        LottieDrawable lottieDrawable = new LottieDrawable();
        lottieDrawable.setRepeatCount(-1);
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iOLrzqt = C55298xhM.OLrzqt(24, context);
        android.content.Context context2 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        lottieDrawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(24, context2));
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.playAnimation();
        textView.setCompoundDrawablesRelative(lottieDrawable, null, null, null);
    }

    public final void copydefault(android.widget.TextView textView, @androidx.annotation.ColorRes int i, @androidx.annotation.DrawableRes int i2, @androidx.annotation.StringRes int i3) {
        int color = ContextCompat.getColor(textView.getContext(), i);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(textView.getContext(), i2);
        if (drawable != null) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iOLrzqt = C55298xhM.OLrzqt(24, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(24, context2));
        }
        TextViewCompat.setCompoundDrawableTintList(textView, android.content.res.ColorStateList.valueOf(color));
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
        textView.setTextColor(color);
        textView.setText(i3);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        C27569jxf.setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf.OLrzqt, this, 0, 1, null);
    }

    @Override // o.iVV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.iVV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.iVV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.iVV, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
