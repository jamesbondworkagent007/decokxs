package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.unify_trade.biz.SignalBotSignParamsResult;
import com.okinc.unify_trade.bot.config.SignalBotActionType;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotSignParamsPresenter;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vYm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50710vYm extends AbstractC54505xKx<AbstractC50801vax, SignalBotSignParamsPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.vYm$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.iWlNch;
    }

    public static final /* synthetic */ AbstractC50801vax EZpvd(C50710vYm c50710vYm) {
        return c50710vYm.gGvvIC();
    }

    public static final /* synthetic */ SignalBotSignParamsPresenter OLrzqt(C50710vYm c50710vYm) {
        return c50710vYm.dxcTrN();
    }

    /* JADX INFO: renamed from: o.vYm$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vYm.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C50710vYm copydefault(java.lang.String str) {
            C50710vYm c50710vYm = new C50710vYm();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("id", str);
            c50710vYm.setArguments(bundle);
            return c50710vYm;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
        AEQbTJ();
        copydefault();
        android.os.Bundle arguments = getArguments();
        EZpvd(arguments != null ? arguments.getString("id") : null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(java.lang.String str) {
        dxcTrN().EZpvd(str);
    }

    public final void copydefault() {
        gGvvIC().AhwBna.setOffscreenPageLimit(1);
        gGvvIC().AhwBna.setUserInputEnabled(false);
        final C55254xgV c55254xgV = gGvvIC().EZpvd;
        c55254xgV.post(new java.lang.Runnable() { // from class: o.vYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C50710vYm.EZpvd(c55254xgV);
            }
        });
        TabLayout.Tab text = c55254xgV.gEmmrt().setText(C33070mpX.AYXKKw(SignalBotActionType.TV_ACTION_MAP.getShowName()));
        Intrinsics.checkNotNullExpressionValue(text, "");
        c55254xgV.EZpvd(text);
        TabLayout.Tab text2 = c55254xgV.gEmmrt().setText(C33070mpX.AYXKKw(SignalBotActionType.ACTION_MAPS.getShowName()));
        Intrinsics.checkNotNullExpressionValue(text2, "");
        c55254xgV.EZpvd(text2);
        c55254xgV.AEQbTJ(new Application());
    }

    public static final void EZpvd(C55254xgV c55254xgV) {
        android.view.ViewParent parent;
        android.view.ViewParent parent2 = c55254xgV.getParent();
        if (parent2 == null || (parent = parent2.getParent()) == null) {
            return;
        }
        boolean z = parent instanceof android.view.ViewGroup;
        android.view.ViewGroup viewGroup = z ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
        android.view.ViewGroup viewGroup2 = z ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipToPadding(false);
        }
    }

    /* JADX INFO: renamed from: o.vYm$Application */
    public static final class Application implements TabLayout.OnTabSelectedListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            int position = tab.getPosition();
            if (position == 0) {
                C50710vYm.this.EZpvd(12.0f);
                C50710vYm.EZpvd(C50710vYm.this).AhwBna.setCurrentItem(0);
                if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(C50710vYm.OLrzqt(C50710vYm.this).OLrzqt().size()), (java.lang.Object) 1)) {
                    C50710vYm c50710vYm = C50710vYm.this;
                    android.view.View view = C50710vYm.OLrzqt(c50710vYm).OLrzqt().get(0).getView();
                    ViewPager2 viewPager2 = C50710vYm.EZpvd(C50710vYm.this).AhwBna;
                    Intrinsics.checkNotNullExpressionValue(viewPager2, "");
                    c50710vYm.EZpvd(view, viewPager2);
                    return;
                }
                return;
            }
            if (position != 1) {
                return;
            }
            C50710vYm.this.EZpvd(3.0f);
            C50710vYm.EZpvd(C50710vYm.this).AhwBna.setCurrentItem(1);
            if (C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(C50710vYm.OLrzqt(C50710vYm.this).OLrzqt().size()), (java.lang.Object) 2)) {
                C50710vYm c50710vYm2 = C50710vYm.this;
                android.view.View view2 = C50710vYm.OLrzqt(c50710vYm2).OLrzqt().get(1).getView();
                ViewPager2 viewPager22 = C50710vYm.EZpvd(C50710vYm.this).AhwBna;
                Intrinsics.checkNotNullExpressionValue(viewPager22, "");
                c50710vYm2.EZpvd(view2, viewPager22);
            }
        }
    }

    public final void EZpvd(final android.view.View view, final ViewPager2 viewPager2) {
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.vYn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C50710vYm.AEQbTJ(view, viewPager2);
                }
            });
        }
    }

    public static final void AEQbTJ(android.view.View view, ViewPager2 viewPager2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
            ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
            layoutParams.height = view.getMeasuredHeight();
            viewPager2.setLayoutParams(layoutParams);
        }
    }

    private final void AEQbTJ() {
        C56111xwe<SignalBotSignParamsResult> c56111xweCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweCopydefault.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50710vYm.copydefault(this.KWHzl, (SignalBotSignParamsResult) obj);
            }
        }));
    }

    public static final Unit copydefault(C50710vYm c50710vYm, SignalBotSignParamsResult signalBotSignParamsResult) {
        Intrinsics.checkNotNullParameter(signalBotSignParamsResult, "");
        c50710vYm.gGvvIC().AEQbTJ.setText(signalBotSignParamsResult.getWebhookUrl());
        c50710vYm.gGvvIC().AhwBna.setAdapter(new C47976uAj(c50710vYm, C50716vYs.Companion.KWHzl(signalBotSignParamsResult, c50710vYm.dxcTrN().OLrzqt()), null, 4, null));
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        android.widget.ImageView imageView = gGvvIC().copydefault;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        android.widget.TextView textView = gGvvIC().OLrzqt;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
    }

    public final void EZpvd(float f) {
        ViewGroup.LayoutParams layoutParams = gGvvIC().AhwBna.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = C55298xhM.dp2px$default(f, null, 1, null);
        gGvvIC().AhwBna.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: o.vYm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C50710vYm KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50710vYm c50710vYm) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c50710vYm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C33570myu.EZpvd(this.KWHzl.requireContext(), C50710vYm.EZpvd(this.KWHzl).AEQbTJ.getText().toString());
                C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.addQueueItem), 0, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vYm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50710vYm KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50710vYm c50710vYm) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c50710vYm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C55688xof.Application.hijVBL)));
                FragmentActivity activity = this.KWHzl.getActivity();
                if (activity != null) {
                    WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activity, bundleBundleOf, null, 4, null);
                }
            }
        }
    }
}
