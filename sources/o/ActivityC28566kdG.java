package o;

import android.view.View;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.market.features.meme.ui.MemeActivityViewModelV2;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC28637keY;

/* JADX INFO: renamed from: o.kdG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class ActivityC28566kdG extends AbstractActivityC28608kdw {
    public final InterfaceC56387yDm AYXKKw;
    public C23426hxx KWHzl;
    public final InterfaceC56387yDm valueOf = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null);
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kdD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC28566kdG.AYXKKw(this.EZpvd);
        }
    });
    public boolean AhwBna = true;

    public ActivityC28566kdG() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(MemeActivityViewModelV2.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.MemeListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.MemeListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.MemeListActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.kdw.EZpvd()V */
    public final C23426hxx EZpvd() {
        C23426hxx c23426hxx = this.KWHzl;
        Intrinsics.copydefault(c23426hxx);
        return c23426hxx;
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.valueOf.getValue();
    }

    private final C28910kjg djBIcL() {
        return (C28910kjg) this.djBIcL.getValue();
    }

    public static final C28910kjg AYXKKw(ActivityC28566kdG activityC28566kdG) {
        return new C28910kjg(activityC28566kdG, activityC28566kdG.gEmmrt());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeActivityViewModelV2 AYXKKw() {
        return (MemeActivityViewModelV2) this.AYXKKw.getValue();
    }

    @Override // o.AbstractActivityC28608kdw, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = C23426hxx.KWHzl(getLayoutInflater());
        MemeActivityViewModelV2.firstLoad$default(AYXKKw(), false, 1, null);
        setContentView(EZpvd().getRoot());
        values();
        valueOf();
        AhwBna();
    }

    /* JADX INFO: renamed from: o.kdG$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28637keY interfaceC28637keY, Continuation<? super Unit> continuation) {
            C28696kfe c28696kfe;
            android.view.View customView;
            android.widget.TextView textView;
            android.view.View customView2;
            android.widget.TextView textView2;
            android.view.View customView3;
            android.widget.ImageView imageView;
            C23426hxx c23426hxxEZpvd = ActivityC28566kdG.this.EZpvd();
            C55113xdn c55113xdn = c23426hxxEZpvd.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            boolean z = interfaceC28637keY instanceof InterfaceC28637keY.StateListAnimator;
            c55113xdn.setVisibility(z ? 0 : 8);
            C55173xeu c55173xeu = c23426hxxEZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(interfaceC28637keY instanceof InterfaceC28637keY.TaskDescription ? 0 : 8);
            C55254xgV c55254xgV = c23426hxxEZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
            boolean z2 = interfaceC28637keY instanceof InterfaceC28637keY.Activity;
            c55254xgV.setVisibility(z2 ? 0 : 8);
            ViewPager2 viewPager2 = c23426hxxEZpvd.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "");
            viewPager2.setVisibility(z2 ? 0 : 8);
            if (!Intrinsics.EZpvd(interfaceC28637keY, InterfaceC28637keY.TaskDescription.KWHzl) && !z) {
                if (!z2) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.List<C28696kfe> listEZpvd = ((InterfaceC28637keY.Activity) interfaceC28637keY).EZpvd();
                ActivityC28566kdG activityC28566kdG = ActivityC28566kdG.this;
                int i = 0;
                for (T t : listEZpvd) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    C28696kfe c28696kfe2 = (C28696kfe) t;
                    TabLayout.Tab tabCopydefault = activityC28566kdG.EZpvd().copydefault.copydefault(i);
                    if (tabCopydefault != null && (customView3 = tabCopydefault.getCustomView()) != null && (imageView = (android.widget.ImageView) customView3.findViewById(C23274hvD.Application.onSearchResult)) != null) {
                        imageView.setVisibility(c28696kfe2.OLrzqt() ? 0 : 8);
                    }
                    if (tabCopydefault != null && (customView2 = tabCopydefault.getCustomView()) != null && (textView2 = (android.widget.TextView) customView2.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
                        textView2.setText(c28696kfe2.AEQbTJ());
                    }
                    if (tabCopydefault != null) {
                        tabCopydefault.setText(c28696kfe2.AEQbTJ());
                    }
                    if (activityC28566kdG.AhwBna && i == 0) {
                        if (tabCopydefault != null) {
                            tabCopydefault.select();
                        }
                        if (tabCopydefault != null && (customView = tabCopydefault.getCustomView()) != null && (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
                            int i2 = C52761wXj.Activity.fdOvFl;
                            android.content.Context context = activityC28566kdG.EZpvd().getRoot().getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "");
                            textView.setTextColor(C25382ivf.copydefault(i2, context));
                        }
                    }
                    i++;
                }
                if (ActivityC28566kdG.this.AhwBna) {
                    java.util.List<C28696kfe> listAhwBna = ActivityC28566kdG.this.AYXKKw().AhwBna();
                    java.lang.String strAEQbTJ = (listAhwBna == null || (c28696kfe = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, 0)) == null) ? null : c28696kfe.AEQbTJ();
                    C21847hOn.KWHzl(EopTrackEvent.KEY_BUTTON_NAME, strAEQbTJ != null ? strAEQbTJ : "");
                    ActivityC28566kdG.this.AhwBna = false;
                }
                rVN.reportFullyDrawn$default((android.app.Activity) ActivityC28566kdG.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void AhwBna() {
        C25390ivn.collectOnLifecycle$default(this, AYXKKw().KWHzl(), null, new Activity(), 2, null);
    }

    /* JADX INFO: renamed from: o.kdG$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return EZpvd(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object EZpvd(boolean z, Continuation<? super Unit> continuation) {
            android.view.View childAt;
            boolean z2 = !z;
            android.view.View childAt2 = ActivityC28566kdG.this.EZpvd().copydefault.copydefault().getChildAt(0);
            android.view.ViewGroup viewGroup = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
            int childCount = viewGroup != null ? viewGroup.getChildCount() : 0;
            for (int i = 0; i < childCount; i++) {
                if (viewGroup != null && (childAt = viewGroup.getChildAt(i)) != null) {
                    childAt.setEnabled(z2);
                    childAt.setClickable(z2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void valueOf() {
        C25390ivn.collectOnLifecycle$default(this, AYXKKw().gEmmrt(), null, new StateListAnimator(), 2, null);
    }

    private final void values() {
        C23426hxx c23426hxxEZpvd = EZpvd();
        android.content.Context context = c23426hxxEZpvd.getRoot().getContext();
        C33537myN c33537myN = c23426hxxEZpvd.OLrzqt;
        c33537myN.setBackVisible(0);
        c33537myN.setSubDoVisible(0);
        c33537myN.setSubDoImageVisible(0);
        c33537myN.setSubDoImageResource(C52761wXj.TaskDescription.GGlJim);
        c33537myN.getDoImage().setBackground(null);
        c33537myN.getDoImage().setImageTintList(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
        android.widget.ImageView doImage = c33537myN.getDoImage();
        doImage.setOnClickListener(new ActionBar(doImage, 1000L, this));
        c33537myN.getTitle().setText(C33070mpX.OLrzqt(C23274hvD.Fragment.HJWChPRGtXKCDKRTZD, context));
        c33537myN.getTitle().setContentDescription("web3_dex_market_pump_appbar_title_view");
        c23426hxxEZpvd.AYXKKw.setAdapter(djBIcL());
        c23426hxxEZpvd.AYXKKw.setOffscreenPageLimit(2);
        c23426hxxEZpvd.AYXKKw.setUserInputEnabled(false);
        c23426hxxEZpvd.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.kdF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC28566kdG.OLrzqt(this.copydefault, view);
            }
        });
        c23426hxxEZpvd.EZpvd.setSubTitle((java.lang.CharSequence) C33070mpX.OLrzqt(C23274hvD.Fragment.UscePu, context));
        c23426hxxEZpvd.EZpvd.setRetry(C33070mpX.OLrzqt(C23274hvD.Fragment.EZpvd, context));
        new TabLayoutMediator(c23426hxxEZpvd.copydefault.copydefault(), c23426hxxEZpvd.AYXKKw, true, false, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.kdH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ActivityC28566kdG.KWHzl(this.KWHzl, tab, i);
            }
        }).attach();
        c23426hxxEZpvd.copydefault.AEQbTJ(new TaskDescription(context));
    }

    public static final void OLrzqt(ActivityC28566kdG activityC28566kdG, android.view.View view) {
        MemeActivityViewModelV2.firstLoad$default(activityC28566kdG.AYXKKw(), false, 1, null);
    }

    public static final void KWHzl(ActivityC28566kdG activityC28566kdG, TabLayout.Tab tab, int i) {
        android.widget.TextView textView;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setCustomView(C23274hvD.Activity.iLAtSv);
        java.util.List<C28696kfe> listAhwBna = activityC28566kdG.AYXKKw().AhwBna();
        java.lang.String strAEQbTJ = null;
        if (listAhwBna != null) {
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C28696kfe) next).copydefault() == i) {
                        break;
                    }
                }
            }
            C28696kfe c28696kfe = (C28696kfe) next;
            if (c28696kfe != null) {
                strAEQbTJ = c28696kfe.AEQbTJ();
            }
        }
        java.lang.String str = strAEQbTJ != null ? strAEQbTJ : "";
        android.view.View customView = tab.getCustomView();
        if (customView != null && (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
            textView.setText(str);
        }
        tab.setText(str);
    }

    /* JADX INFO: renamed from: o.kdG$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ android.content.Context EZpvd;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public TaskDescription(android.content.Context context) {
            this.EZpvd = context;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strValueOf;
            C28696kfe c28696kfe;
            android.widget.TextView textView;
            java.lang.CharSequence text;
            C28696kfe c28696kfe2;
            Intrinsics.checkNotNullParameter(tab, "");
            ActivityC28566kdG.this.AYXKKw().copydefault(tab.getPosition());
            android.view.View customView = tab.getCustomView();
            if (customView != null && (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) != null) {
                android.content.Context context = this.EZpvd;
                ActivityC28566kdG activityC28566kdG = ActivityC28566kdG.this;
                textView.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
                int i = C52761wXj.Activity.fdOvFl;
                Intrinsics.copydefault(context);
                textView.setTextColor(C25382ivf.copydefault(i, context));
                java.util.List<C28696kfe> listAhwBna = activityC28566kdG.AYXKKw().AhwBna();
                if (listAhwBna == null || (c28696kfe2 = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, tab.getPosition())) == null || (text = c28696kfe2.AEQbTJ()) == null) {
                    text = tab.getText();
                }
                textView.setText(text);
            }
            java.util.List<C28696kfe> listAhwBna2 = ActivityC28566kdG.this.AYXKKw().AhwBna();
            if (listAhwBna2 == null || (c28696kfe = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna2, tab.getPosition())) == null || (strValueOf = c28696kfe.AEQbTJ()) == null) {
                strValueOf = java.lang.String.valueOf(tab.getText());
            }
            C21847hOn.KWHzl(EopTrackEvent.KEY_BUTTON_NAME, strValueOf);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            android.view.View customView;
            android.widget.TextView textView;
            java.lang.CharSequence text;
            C28696kfe c28696kfe;
            if (tab == null || (customView = tab.getCustomView()) == null || (textView = (android.widget.TextView) customView.findViewById(C23274hvD.Application.getChangingConfigurations)) == null) {
                return;
            }
            android.content.Context context = this.EZpvd;
            ActivityC28566kdG activityC28566kdG = ActivityC28566kdG.this;
            textView.setTextAppearance(C52761wXj.LoaderManager.AwvSrB);
            int i = C52761wXj.Activity.QwvEab;
            Intrinsics.copydefault(context);
            textView.setTextColor(C25382ivf.copydefault(i, context));
            java.util.List<C28696kfe> listAhwBna = activityC28566kdG.AYXKKw().AhwBna();
            if (listAhwBna == null || (c28696kfe = (C28696kfe) CollectionsKt___CollectionsKt.AkhnZx(listAhwBna, tab.getPosition())) == null || (text = c28696kfe.AEQbTJ()) == null) {
                text = tab.getText();
            }
            textView.setText(text);
        }
    }

    /* JADX INFO: renamed from: o.kdG$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC28566kdG EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC28566kdG activityC28566kdG) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = activityC28566kdG;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.fetchVPNInfo();
            }
        }
    }

    @Override // o.AbstractActivityC28608kdw, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AYXKKw().AkhnZx();
    }

    @Override // o.AbstractActivityC28608kdw, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AYXKKw().isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        C28703kfl c28703kflOLrzqt = C28703kfl.Companion.OLrzqt();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c28703kflOLrzqt.show(supportFragmentManager);
    }

    @Override // o.AbstractActivityC28608kdw, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC28608kdw, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
