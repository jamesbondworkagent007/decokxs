package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC15452eIw;
import o.C13754dXa;
import o.C18012faP;
import o.C52761wXj;
import o.eSW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15452eIw extends eIN {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.eIA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15452eIw.AhwBna();
        }
    });
    public final InterfaceC56387yDm KWHzl;
    public AbstractC16348eiI OLrzqt;

    public ActivityC15452eIw() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(eIY.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.DefiWalletHistoryActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.DefiWalletHistoryActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.DefiWalletHistoryActivity$special$$inlined$viewModels$default$3
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
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(eIL.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.history.DefiWalletHistoryActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.history.DefiWalletHistoryActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.history.DefiWalletHistoryActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: renamed from: o.eIw$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIw.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ void startActivity$default(ActionBar actionBar, android.content.Context context, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                j = Long.MIN_VALUE;
            }
            actionBar.KWHzl(context, str, j);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC15452eIw.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("chain_id", j);
            context.startActivity(intent);
        }
    }

    public final eIY EZpvd() {
        return (eIY) this.KWHzl.getValue();
    }

    /* JADX DEBUG: Possible override for method o.eIN.OLrzqt()V */
    public final eIL OLrzqt() {
        return (eIL) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9772bbr> valueOf() {
        return (java.util.List) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List AhwBna() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9772bbr.class));
    }

    @Override // o.eIN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16348eiI) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.ODWQjV);
        C12827cuN c12827cuNAkhnZx = EZpvd().AkhnZx();
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = c12827cuNAkhnZx.OLrzqt(stringExtra, false);
        final Function1 function1 = new Function1() { // from class: o.eIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15452eIw.OLrzqt(this.copydefault, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eIE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15452eIw.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eID
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15452eIw.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eIC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC15452eIw.copydefault(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final ActivityC15452eIw activityC15452eIw, AbstractC12782ctV abstractC12782ctV) {
        eIY eiyEZpvd = activityC15452eIw.EZpvd();
        Intrinsics.copydefault(abstractC12782ctV);
        eiyEZpvd.EZpvd(abstractC12782ctV, activityC15452eIw.getIntent().getLongExtra("chain_id", Long.MIN_VALUE));
        AbstractC16348eiI abstractC16348eiI = null;
        C32866mlf.onEvent$default("Web3WalletHomepage_Top_History_View", (TrackChannel[]) null, new Function1() { // from class: o.eIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15452eIw.KWHzl(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (activityC15452eIw.EZpvd().isConnected()) {
            activityC15452eIw.new Activity().copydefault();
        } else {
            activityC15452eIw.new Application().copydefault();
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15452eIw, true, (java.lang.String) null, 2, (java.lang.Object) null);
        AbstractC16348eiI abstractC16348eiI2 = activityC15452eIw.OLrzqt;
        if (abstractC16348eiI2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16348eiI = abstractC16348eiI2;
        }
        AppCompatImageView appCompatImageView = abstractC16348eiI.KWHzl;
        appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, activityC15452eIw));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC15452eIw activityC15452eIw, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(activityC15452eIw.EZpvd().isConnected()), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC15452eIw activityC15452eIw, java.lang.Throwable th) {
        C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.skipToQueueItem, 0, 1, (java.lang.Object) null);
        activityC15452eIw.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eIw$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Activity {
        public final java.util.List<java.lang.String> EZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnContextAvailableListener), C33070mpX.AYXKKw(C13754dXa.FragmentManager.addOnPictureInPictureModeChangedListener));
        public androidx.fragment.app.Fragment KWHzl;
        public final eSW OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            AbstractC16348eiI abstractC16348eiI2 = null;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            TabLayout tabLayoutCopydefault = abstractC16348eiI.OLrzqt.copydefault();
            AbstractC16348eiI abstractC16348eiI3 = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16348eiI2 = abstractC16348eiI3;
            }
            this.OLrzqt = new eSW(tabLayoutCopydefault, abstractC16348eiI2.valueOf, true, false, new eSW.Activity() { // from class: o.eIH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.eSW.Activity
                public final void KWHzl(TabLayout.Tab tab, int i) {
                    ActivityC15452eIw.Activity.OLrzqt(this.KWHzl, tab, i);
                }
            });
        }

        public static final void OLrzqt(Activity activity, TabLayout.Tab tab, int i) {
            Intrinsics.checkNotNullParameter(tab, "");
            tab.setText(activity.EZpvd.get(i));
        }

        public final void copydefault() {
            AEQbTJ();
            KWHzl();
            OLrzqt();
            EZpvd();
            this.OLrzqt.KWHzl();
        }

        public final void EZpvd() {
            AhwBna();
            AbstractC16348eiI abstractC16348eiI = null;
            if (ActivityC15452eIw.this.EZpvd().DbNXlk()) {
                AbstractC16348eiI abstractC16348eiI2 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI2 = null;
                }
                abstractC16348eiI2.AEQbTJ.setClickable(true);
            } else {
                AbstractC16348eiI abstractC16348eiI3 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI3 = null;
                }
                abstractC16348eiI3.AEQbTJ.setClickable(false);
            }
            AbstractC16348eiI abstractC16348eiI4 = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16348eiI = abstractC16348eiI4;
            }
            android.widget.ImageView imageView = abstractC16348eiI.AEQbTJ;
            imageView.setOnClickListener(new ViewOnClickListenerC0835Activity(imageView, 1000L, ActivityC15452eIw.this, this));
        }

        /* JADX INFO: renamed from: o.eIw$Activity$StateListAnimator */
        public static final class StateListAnimator implements Function2<C18012faP.ActionBar, java.lang.Integer, Unit> {
            public final /* synthetic */ ActivityC15452eIw AEQbTJ;
            public final /* synthetic */ Activity EZpvd;
            public final /* synthetic */ C18012faP copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(ActivityC15452eIw activityC15452eIw, Activity activity, C18012faP c18012faP) {
                this.AEQbTJ = activityC15452eIw;
                this.EZpvd = activity;
                this.copydefault = c18012faP;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(C18012faP.ActionBar actionBar, java.lang.Integer num) {
                AEQbTJ(actionBar, num.intValue());
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(C18012faP.ActionBar actionBar, int i) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                this.AEQbTJ.EZpvd().KWHzl(actionBar.AEQbTJ());
                this.EZpvd.AhwBna();
                this.AEQbTJ.EZpvd().EZpvd(eIL.getDefaultStartTime$default(this.AEQbTJ.OLrzqt(), false, 1, null).getTimeInMillis());
                this.AEQbTJ.EZpvd().copydefault(eIL.getDefaultEndTime$default(this.AEQbTJ.OLrzqt(), false, 1, null).getTimeInMillis());
                this.AEQbTJ.EZpvd().OLrzqt(this.AEQbTJ.OLrzqt().AEQbTJ().getTimeInMillis());
                this.AEQbTJ.EZpvd().AEQbTJ().setValue(java.lang.Integer.valueOf(C33129mqd.AhwBna(C54862xYb.KWHzl((java.lang.Object) this.AEQbTJ.EZpvd().AEQbTJ().getValue(), (java.lang.Object) 1))));
                eIY.refresh$default(this.AEQbTJ.EZpvd(), false, 1, null);
                this.EZpvd.AEQbTJ(actionBar.OLrzqt(), actionBar.AEQbTJ());
                this.copydefault.dismissAllowingStateLoss();
            }
        }

        public final void AEQbTJ(long j, long j2) {
            ActivityResultCaller activityResultCaller = this.KWHzl;
            InterfaceC54847xXn interfaceC54847xXn = activityResultCaller instanceof InterfaceC54847xXn ? (InterfaceC54847xXn) activityResultCaller : null;
            if (interfaceC54847xXn != null) {
                interfaceC54847xXn.KWHzl(j, j2, false);
            }
        }

        /* JADX INFO: renamed from: o.eIw$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0835Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ ActivityC15452eIw OLrzqt;
            public final /* synthetic */ Activity copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0835Activity(android.view.View view, long j, ActivityC15452eIw activityC15452eIw, Activity activity) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.OLrzqt = activityC15452eIw;
                this.copydefault = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    C18012faP c18012faPAEQbTJ = C18012faP.Companion.AEQbTJ();
                    c18012faPAEQbTJ.AEQbTJ(new StateListAnimator(this.OLrzqt, this.copydefault, c18012faPAEQbTJ));
                    androidx.fragment.app.FragmentManager supportFragmentManager = this.OLrzqt.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    AbstractC12782ctV abstractC12782ctVDjBIcL = this.OLrzqt.EZpvd().djBIcL();
                    C10854bwM c10854bwMCopydefault = this.OLrzqt.EZpvd().copydefault();
                    c18012faPAEQbTJ.copydefault(supportFragmentManager, "chooseNetwork", abstractC12782ctVDjBIcL, c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : Long.MIN_VALUE, false, false);
                }
            }
        }

        public final void AhwBna() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            AbstractC16348eiI abstractC16348eiI2 = null;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            android.widget.ImageView imageView = abstractC16348eiI.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            if (ActivityC15452eIw.this.EZpvd().copydefault() == null) {
                AbstractC16348eiI abstractC16348eiI3 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI3 = null;
                }
                C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.KWHzl(abstractC16348eiI3.AEQbTJ).OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.createSocket));
                AbstractC16348eiI abstractC16348eiI4 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16348eiI2 = abstractC16348eiI4;
                }
                Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(abstractC16348eiI2.AEQbTJ));
                return;
            }
            AbstractC16348eiI abstractC16348eiI5 = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI5 = null;
            }
            android.widget.ImageView imageView2 = abstractC16348eiI5.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            C10854bwM c10854bwMCopydefault = ActivityC15452eIw.this.EZpvd().copydefault();
            C57659ymb.loadFixSizeBorderImage$default(imageView2, c10854bwMCopydefault != null ? c10854bwMCopydefault.copydefault() : null, C52761wXj.TaskDescription.fERRXa, 0.0f, 24.0f, 4, null);
        }

        /* JADX INFO: renamed from: o.eIw$Activity$ActionBar */
        public static final class ActionBar implements TabLayout.OnTabSelectedListener {
            public final /* synthetic */ ActivityC15452eIw AEQbTJ;

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            public ActionBar(ActivityC15452eIw activityC15452eIw) {
                this.AEQbTJ = activityC15452eIw;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(final TabLayout.Tab tab) {
                final ActivityC15452eIw activityC15452eIw = this.AEQbTJ;
                C32866mlf.onEvent$default("Web3Wallet_History_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.eIJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC15452eIw.Activity.ActionBar.OLrzqt(tab, activityC15452eIw, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            }

            public static final Unit OLrzqt(TabLayout.Tab tab, ActivityC15452eIw activityC15452eIw, EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
                EventParamsList.put$default(eventParamsList, "module", "history", false, 4, null);
                EventParamsList.put$default(eventParamsList, "page_name", (tab == null || tab.getPosition() != 0) ? "wallet" : "trades", false, 4, null);
                EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, (tab == null || tab.getPosition() != 0) ? "wallet" : "trades", false, 4, null);
                EventParamsList.put$default(eventParamsList, "is_tee", java.lang.String.valueOf(activityC15452eIw.EZpvd().isConnected()), false, 4, null);
                return Unit.INSTANCE;
            }
        }

        public final void OLrzqt() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            abstractC16348eiI.OLrzqt.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar(ActivityC15452eIw.this));
        }

        public final void AEQbTJ() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            C55254xgV c55254xgV = abstractC16348eiI.OLrzqt;
            Intrinsics.copydefault(c55254xgV);
            c55254xgV.setVisibility(0);
            c55254xgV.copydefault().addTab(c55254xgV.copydefault().newTab().setText(this.EZpvd.get(0)));
            c55254xgV.copydefault().addTab(c55254xgV.copydefault().newTab().setText(this.EZpvd.get(1)));
        }

        public final void KWHzl() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            ViewPager2 viewPager2 = abstractC16348eiI.valueOf;
            ActivityC15452eIw activityC15452eIw = ActivityC15452eIw.this;
            Intrinsics.copydefault(viewPager2);
            viewPager2.setVisibility(0);
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC15452eIw.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            viewPager2.setAdapter(new TaskDescription(this, supportFragmentManager));
        }

        /* JADX INFO: renamed from: o.eIw$Activity$TaskDescription */
        /* JADX INFO: loaded from: classes18.dex */
        public final class TaskDescription extends FragmentStateAdapter {
            public final /* synthetic */ Activity copydefault;

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return 2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull Activity activity, androidx.fragment.app.FragmentManager fragmentManager) {
                super(fragmentManager, ActivityC15452eIw.this.getLifecycle());
                Intrinsics.checkNotNullParameter(fragmentManager, "");
                this.copydefault = activity;
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public androidx.fragment.app.Fragment createFragment(int i) {
                androidx.fragment.app.Fragment fragmentCopydefault;
                InterfaceC9772bbr interfaceC9772bbr;
                if (i == 0) {
                    java.util.List listValueOf = ActivityC15452eIw.this.valueOf();
                    if (listValueOf != null && (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(listValueOf)) != null) {
                        C10854bwM c10854bwMCopydefault = ActivityC15452eIw.this.EZpvd().copydefault();
                        fragmentCopydefault = interfaceC9772bbr.copydefault(C33129mqd.gEmmrt(c10854bwMCopydefault != null ? java.lang.Long.valueOf(c10854bwMCopydefault.fetchVPNInfo()) : null));
                        if (fragmentCopydefault == null) {
                        }
                    } else {
                        fragmentCopydefault = C15480eJx.Companion.copydefault();
                    }
                    this.copydefault.KWHzl = fragmentCopydefault;
                    return fragmentCopydefault;
                }
                return C15480eJx.Companion.copydefault();
            }
        }
    }

    /* JADX INFO: renamed from: o.eIw$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Application {

        /* JADX INFO: renamed from: o.eIw$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ ActivityC15452eIw EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ Application OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, ActivityC15452eIw activityC15452eIw, Application application) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = activityC15452eIw;
                this.OLrzqt = application;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    C18012faP c18012faPAEQbTJ = C18012faP.Companion.AEQbTJ();
                    c18012faPAEQbTJ.AEQbTJ(new Activity(this.EZpvd, this.OLrzqt, c18012faPAEQbTJ));
                    androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    AbstractC12782ctV abstractC12782ctVDjBIcL = this.EZpvd.EZpvd().djBIcL();
                    C10854bwM c10854bwMCopydefault = this.EZpvd.EZpvd().copydefault();
                    c18012faPAEQbTJ.copydefault(supportFragmentManager, "chooseNetwork", abstractC12782ctVDjBIcL, c10854bwMCopydefault != null ? c10854bwMCopydefault.AEQbTJ() : Long.MIN_VALUE, false, false);
                }
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        public final void copydefault() {
            KWHzl();
            AEQbTJ();
        }

        public final void KWHzl() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            AbstractC16348eiI abstractC16348eiI2 = null;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            android.widget.ImageView imageView = abstractC16348eiI.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            if (ActivityC15452eIw.this.EZpvd().copydefault() == null) {
                AbstractC16348eiI abstractC16348eiI3 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI3 = null;
                }
                C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.KWHzl(abstractC16348eiI3.AEQbTJ).OLrzqt(java.lang.Integer.valueOf(C52761wXj.TaskDescription.createSocket));
                AbstractC16348eiI abstractC16348eiI4 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI4 = null;
                }
                Intrinsics.copydefault(c5335NtOLrzqt.EZpvd(abstractC16348eiI4.AEQbTJ));
            } else {
                AbstractC16348eiI abstractC16348eiI5 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI5 = null;
                }
                android.widget.ImageView imageView2 = abstractC16348eiI5.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                C10854bwM c10854bwMCopydefault = ActivityC15452eIw.this.EZpvd().copydefault();
                C57659ymb.loadFixSizeBorderImage$default(imageView2, c10854bwMCopydefault != null ? c10854bwMCopydefault.copydefault() : null, C52761wXj.TaskDescription.fERRXa, 0.0f, 24.0f, 4, null);
            }
            if (ActivityC15452eIw.this.EZpvd().DbNXlk()) {
                AbstractC16348eiI abstractC16348eiI6 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI6 = null;
                }
                abstractC16348eiI6.AEQbTJ.setClickable(true);
            } else {
                AbstractC16348eiI abstractC16348eiI7 = ActivityC15452eIw.this.OLrzqt;
                if (abstractC16348eiI7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16348eiI7 = null;
                }
                abstractC16348eiI7.AEQbTJ.setClickable(false);
            }
            AbstractC16348eiI abstractC16348eiI8 = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16348eiI2 = abstractC16348eiI8;
            }
            android.widget.ImageView imageView3 = abstractC16348eiI2.AEQbTJ;
            imageView3.setOnClickListener(new ActionBar(imageView3, 500L, ActivityC15452eIw.this, this));
        }

        /* JADX INFO: renamed from: o.eIw$Application$Activity */
        public static final class Activity implements Function2<C18012faP.ActionBar, java.lang.Integer, Unit> {
            public final /* synthetic */ Application KWHzl;
            public final /* synthetic */ C18012faP OLrzqt;
            public final /* synthetic */ ActivityC15452eIw copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(ActivityC15452eIw activityC15452eIw, Application application, C18012faP c18012faP) {
                this.copydefault = activityC15452eIw;
                this.KWHzl = application;
                this.OLrzqt = c18012faP;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Unit invoke(C18012faP.ActionBar actionBar, java.lang.Integer num) {
                copydefault(actionBar, num.intValue());
                return Unit.INSTANCE;
            }

            public final void copydefault(C18012faP.ActionBar actionBar, int i) {
                Intrinsics.checkNotNullParameter(actionBar, "");
                this.copydefault.EZpvd().KWHzl(actionBar.AEQbTJ());
                this.KWHzl.KWHzl();
                this.copydefault.EZpvd().EZpvd(eIL.getDefaultStartTime$default(this.copydefault.OLrzqt(), false, 1, null).getTimeInMillis());
                this.copydefault.EZpvd().copydefault(eIL.getDefaultEndTime$default(this.copydefault.OLrzqt(), false, 1, null).getTimeInMillis());
                this.copydefault.EZpvd().OLrzqt(this.copydefault.OLrzqt().AEQbTJ().getTimeInMillis());
                this.copydefault.EZpvd().AEQbTJ().setValue(java.lang.Integer.valueOf(C33129mqd.AhwBna(C54862xYb.KWHzl((java.lang.Object) this.copydefault.EZpvd().AEQbTJ().getValue(), (java.lang.Object) 1))));
                eIY.refresh$default(this.copydefault.EZpvd(), false, 1, null);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }

        public final void AEQbTJ() {
            AbstractC16348eiI abstractC16348eiI = ActivityC15452eIw.this.OLrzqt;
            if (abstractC16348eiI == null) {
                Intrinsics.gEmmrt("");
                abstractC16348eiI = null;
            }
            FragmentContainerView fragmentContainerView = abstractC16348eiI.copydefault;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
            fragmentContainerView.setVisibility(0);
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = ActivityC15452eIw.this.getSupportFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.ActionBar, C15480eJx.Companion.copydefault());
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: o.eIw$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC15452eIw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC15452eIw activityC15452eIw) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC15452eIw;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    @Override // o.eIN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eIN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eIN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eIN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
