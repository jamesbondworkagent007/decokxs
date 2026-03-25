package com.okinc.okex.common.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.okex.center.bean.SupportBannerBean;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import com.okinc.okex.common.viewmodel.OKSupportBaseViewModel;
import com.okinc.uilab.banner.OKAlertBanner;
import com.reown.android.pulse.model.EventType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractActivityC45319snZ;
import o.AbstractC47327tnu;
import o.ActivityC44038sBa;
import o.C32113mPz;
import o.C32991mny;
import o.C33070mpX;
import o.C33129mqd;
import o.C33537myN;
import o.C45144skJ;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55173xeu;
import o.C55230xfy;
import o.C55296xhK;
import o.C56444yFp;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OKSupportBaseActivity extends AbstractActivityC45319snZ {
    public static final Activity Companion = new Activity(null);
    public static final int getFieldNames = 8;
    public final InterfaceC56387yDm AuCTelauCTel;
    public AbstractC47327tnu hDKMBd;
    public final boolean zLjUOn;
    public final String AubY = "";
    public float uzCIH = 1.0f;
    public final AppBarLayout.OnOffsetChangedListener wlaJM = new AppBarLayout.OnOffsetChangedListener() { // from class: o.soh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
            OKSupportBaseActivity.EZpvd(this.KWHzl, appBarLayout, i);
        }
    };
    public boolean getNewProxyInstance = true;
    public final Handler iwGUEr = new Handler(Looper.getMainLooper());
    public final Runnable zsXlph = new Runnable() { // from class: o.sof
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            OKSupportBaseActivity.copydefault(this.EZpvd);
        }
    };

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PageState.values().length];
            try {
                iArr[PageState.CONTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PageState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PageState.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    public abstract boolean AYXKKw();

    public abstract View AkhnZx();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String AwvSrB() {
        return this.AubY;
    }

    public abstract void initFrameContent(@NotNull View view);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zuBGHE() {
        return this.zLjUOn;
    }

    public OKSupportBaseActivity() {
        final Function0 function0 = null;
        this.AuCTelauCTel = new ViewModelLazy(C56524yIo.AEQbTJ(OKSupportBaseViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.common.ui.OKSupportBaseActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.common.ui.OKSupportBaseActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.common.ui.OKSupportBaseActivity$special$$inlined$viewModels$default$3
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

    public final OKSupportBaseViewModel gHZMYf() {
        return (OKSupportBaseViewModel) this.AuCTelauCTel.getValue();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.common.ui.OKSupportBaseActivity.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final void AEQbTJ(float f) {
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            float totalScrollRange = abstractC47327tnu.EZpvd.getTotalScrollRange();
            float f2 = this.uzCIH;
            if (1.0f > f2 || f2 > totalScrollRange) {
                return;
            }
            this.uzCIH = f;
        }
    }

    public static final void EZpvd(OKSupportBaseActivity oKSupportBaseActivity, AppBarLayout appBarLayout, int i) {
        AbstractC47327tnu abstractC47327tnu = oKSupportBaseActivity.hDKMBd;
        if (abstractC47327tnu != null) {
            float totalScrollRange = abstractC47327tnu.EZpvd.getTotalScrollRange() + i;
            float f = oKSupportBaseActivity.uzCIH;
            oKSupportBaseActivity.OLrzqt(totalScrollRange < f ? 1 - (totalScrollRange / f) : 0.0f);
        }
    }

    public final void OLrzqt(float f) {
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            C33537myN c33537myN = abstractC47327tnu.copydefault;
            c33537myN.getTitle().setAlpha(f);
            if (zuBGHE()) {
                c33537myN.getDoImage().setAlpha(f);
                c33537myN.setDoClickable(f > 0.0f);
            }
        }
    }

    @Override // o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        AEQbTJ();
    }

    @Override // o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (AYXKKw()) {
            gHZMYf().AEQbTJ();
        }
    }

    public final AppBarLayout AubY() {
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            return abstractC47327tnu.EZpvd;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(@NotNull String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        final AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                abstractC47327tnu.djBIcL.setText(str);
                C33537myN c33537myN = abstractC47327tnu.copydefault;
                c33537myN.setAppBarTitle(str);
                OLrzqt(0.0f);
                c33537myN.post(new Runnable() { // from class: o.sob
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        OKSupportBaseActivity.AEQbTJ(this.OLrzqt, abstractC47327tnu);
                    }
                });
                AppBarLayout appBarLayout = abstractC47327tnu.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appBarLayout, "");
                if (!(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
                    CharSequence text = abstractC47327tnu.valueOf.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "");
                    i = StringsKt__StringsKt.fARcdN(text) ^ true ? 0 : 8;
                }
                appBarLayout.setVisibility(i);
                return;
            }
            AppBarLayout appBarLayout2 = abstractC47327tnu.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appBarLayout2, "");
            appBarLayout2.setVisibility(8);
            TextView title = abstractC47327tnu.copydefault.getTitle();
            if (title != null) {
                title.setVisibility(8);
            }
        }
    }

    public static final void AEQbTJ(OKSupportBaseActivity oKSupportBaseActivity, AbstractC47327tnu abstractC47327tnu) {
        oKSupportBaseActivity.AEQbTJ(abstractC47327tnu.EZpvd.getTotalScrollRange() * 0.5f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            abstractC47327tnu.valueOf.setText(str);
            TextView textView = abstractC47327tnu.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            if (!(!StringsKt__StringsKt.fARcdN((CharSequence) str))) {
                CharSequence text = abstractC47327tnu.djBIcL.getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                i = StringsKt__StringsKt.fARcdN(text) ^ true ? 0 : 8;
            }
            textView.setVisibility(i);
        }
    }

    public final void OLrzqt(@NotNull String str) {
        C33537myN c33537myN;
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c33537myN = abstractC47327tnu.copydefault) == null) {
            return;
        }
        c33537myN.setAppBarTitle(str);
    }

    public final void EZpvd(int i, int i2) {
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            abstractC47327tnu.djBIcL.setTextAppearance(i);
            abstractC47327tnu.valueOf.setTextAppearance(i2);
        }
    }

    public boolean bo_() {
        return zuBGHE();
    }

    public final void EZpvd(@DrawableRes int i, @ColorRes int i2, @NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            C33537myN c33537myN = abstractC47327tnu.copydefault;
            c33537myN.setSubDoImageDrawable(i);
            c33537myN.getDoImage().setColorFilter(C33070mpX.copydefault(i2));
            OLrzqt(bo_());
            c33537myN.setDoClickable(true);
            c33537myN.setSubDoListener(onClickListener);
            if (zuBGHE()) {
                float alpha = c33537myN.getTitle().getAlpha();
                c33537myN.getDoImage().setAlpha(alpha);
                c33537myN.setDoClickable(alpha > 0.0f);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ OKSupportBaseActivity EZpvd;
        public final /* synthetic */ C55230xfy KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, OKSupportBaseActivity oKSupportBaseActivity, C55230xfy c55230xfy) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = oKSupportBaseActivity;
            this.KWHzl = c55230xfy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                ActivityC44038sBa.Application application = ActivityC44038sBa.Companion;
                OKSupportBaseActivity oKSupportBaseActivity = this.EZpvd;
                Intent intentCreateIntent$default = ActivityC44038sBa.Application.createIntent$default(application, oKSupportBaseActivity, oKSupportBaseActivity.AwvSrB(), null, 4, null);
                intentCreateIntent$default.putExtra("search_bar_height", this.KWHzl.OLrzqt());
                intentCreateIntent$default.putExtra("search_bar_hint", this.KWHzl.KWHzl().getHint());
                intentCreateIntent$default.putExtra("search_bar_only_icon", false);
                ActivityOptionsCompat activityOptionsCompatMakeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.EZpvd, this.KWHzl, "shared_element_name");
                Intrinsics.checkNotNullExpressionValue(activityOptionsCompatMakeSceneTransitionAnimation, "");
                this.EZpvd.startActivity(intentCreateIntent$default, activityOptionsCompatMakeSceneTransitionAnimation.toBundle());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ Function0 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ OKAlertBanner copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, OKAlertBanner oKAlertBanner) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = oKAlertBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.setVisibility(8);
            }
        }
    }

    public final void KWHzl(boolean z) {
        C33537myN c33537myN;
        View viewFindViewById;
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c33537myN = abstractC47327tnu.copydefault) == null || (viewFindViewById = c33537myN.findViewById(C32113mPz.FragmentManager.dNCPSb)) == null) {
            return;
        }
        viewFindViewById.setVisibility(z ? 0 : 8);
    }

    @Override // o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.iwGUEr.removeCallbacksAndMessages(null);
        this.hDKMBd = null;
        super.onDestroy();
    }

    public static /* synthetic */ void setupSupportBanner$default(OKSupportBaseActivity oKSupportBaseActivity, String str, String str2, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupSupportBanner");
        }
        if ((i3 & 4) != 0) {
            i = 4;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        oKSupportBaseActivity.EZpvd(str, str2, i, i2);
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, int i, int i2) {
        OKAlertBanner oKAlertBanner;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (oKAlertBanner = abstractC47327tnu.OLrzqt) == null) {
            return;
        }
        oKAlertBanner.setType(i);
        oKAlertBanner.setStyle(i2);
        oKAlertBanner.setTitle(str);
        oKAlertBanner.setMessage(str2);
        ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
        imageViewOLrzqt.setOnClickListener(new TaskDescription(imageViewOLrzqt, 1000L, oKAlertBanner));
        oKAlertBanner.setVisibility(0);
    }

    private final void EZpvd() {
        AbstractC47327tnu abstractC47327tnuAEQbTJ = AbstractC47327tnu.AEQbTJ(getLayoutInflater());
        this.hDKMBd = abstractC47327tnuAEQbTJ;
        if (abstractC47327tnuAEQbTJ != null) {
            setContentView(abstractC47327tnuAEQbTJ.getRoot());
            TextView title = abstractC47327tnuAEQbTJ.copydefault.getTitle();
            if (title != null) {
                title.setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
            }
            abstractC47327tnuAEQbTJ.EZpvd.addOnOffsetChangedListener(this.wlaJM);
            C55230xfy c55230xfy = abstractC47327tnuAEQbTJ.gEmmrt;
            AEQbTJ(zuBGHE());
            c55230xfy.setOnClickListener(new Application(c55230xfy, 1000L, this, c55230xfy));
            View root = abstractC47327tnuAEQbTJ.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            initFrameContent(root);
            abstractC47327tnuAEQbTJ.AYXKKw.addView(AkhnZx());
        }
    }

    public final void EZpvd(boolean z, boolean z2) {
        AEQbTJ(z);
        OLrzqt(z2);
    }

    private final void AEQbTJ(boolean z) {
        C55230xfy c55230xfy;
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c55230xfy = abstractC47327tnu.gEmmrt) == null) {
            return;
        }
        c55230xfy.setVisibility(z ? 0 : 8);
    }

    public final void OLrzqt(boolean z) {
        C33537myN c33537myN;
        int i = z ? 0 : 8;
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c33537myN = abstractC47327tnu.copydefault) == null) {
            return;
        }
        c33537myN.setSubDoVisible(i);
        c33537myN.setSubDoImageVisible(i);
    }

    private final void AEQbTJ() {
        gHZMYf().EZpvd().observe(this, new C32991mny(new Function1() { // from class: o.sod
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OKSupportBaseActivity.OLrzqt(this.KWHzl, (SupportBannerBean) obj);
            }
        }));
    }

    public static final Unit OLrzqt(OKSupportBaseActivity oKSupportBaseActivity, SupportBannerBean supportBannerBean) {
        Intrinsics.checkNotNullParameter(supportBannerBean, "");
        setupSupportBanner$default(oKSupportBaseActivity, "", supportBannerBean.getText(), 0, 0, 12, null);
        return Unit.INSTANCE;
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

    public static final void copydefault(OKSupportBaseActivity oKSupportBaseActivity) {
        AbstractC47327tnu abstractC47327tnu = oKSupportBaseActivity.hDKMBd;
        if (abstractC47327tnu != null) {
            FrameLayout frameLayout = abstractC47327tnu.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(8);
            C55173xeu c55173xeu = abstractC47327tnu.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
            C55113xdn c55113xdn = abstractC47327tnu.fetchVPNInfo;
            c55113xdn.playAnimation();
            Intrinsics.copydefault(c55113xdn);
            c55113xdn.setVisibility(0);
        }
    }

    public final void EZpvd(@NotNull PageState pageState) {
        Intrinsics.checkNotNullParameter(pageState, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu != null) {
            int i = ActionBar.KWHzl[pageState.ordinal()];
            if (i == 1) {
                this.iwGUEr.removeCallbacks(this.zsXlph);
                C55173xeu c55173xeu = abstractC47327tnu.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                c55173xeu.setVisibility(8);
                C55113xdn c55113xdn = abstractC47327tnu.fetchVPNInfo;
                Intrinsics.copydefault(c55113xdn);
                c55113xdn.setVisibility(8);
                c55113xdn.pauseAnimation();
                FrameLayout frameLayout = abstractC47327tnu.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                frameLayout.setVisibility(0);
                return;
            }
            if (i == 2) {
                this.iwGUEr.postDelayed(this.zsXlph, this.getNewProxyInstance ? 0L : 300L);
                this.getNewProxyInstance = false;
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            this.iwGUEr.removeCallbacks(this.zsXlph);
            FrameLayout frameLayout2 = abstractC47327tnu.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            frameLayout2.setVisibility(8);
            C55113xdn c55113xdn2 = abstractC47327tnu.fetchVPNInfo;
            Intrinsics.copydefault(c55113xdn2);
            c55113xdn2.setVisibility(8);
            c55113xdn2.pauseAnimation();
            C55173xeu c55173xeu2 = abstractC47327tnu.AhwBna;
            C52794wYp c52794wYpAEQbTJ = c55173xeu2.AEQbTJ();
            c52794wYpAEQbTJ.setVisibility(c52794wYpAEQbTJ.hasOnClickListeners() ? 0 : 8);
            Intrinsics.copydefault(c55173xeu2);
            c55173xeu2.setVisibility(0);
        }
    }

    public static /* synthetic */ void setErrorRetryClickListener$default(OKSupportBaseActivity oKSupportBaseActivity, int i, Function0 function0, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setErrorRetryClickListener");
        }
        if ((i2 & 1) != 0) {
            i = 8;
        }
        oKSupportBaseActivity.OLrzqt(i, (Function0<Unit>) function0);
    }

    public final void OLrzqt(int i, @NotNull final Function0<Unit> function0) {
        C55173xeu c55173xeu;
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c55173xeu = abstractC47327tnu.AhwBna) == null) {
            return;
        }
        c55173xeu.setEmptyTypeImage(i);
        new C45144skJ(c55173xeu).KWHzl(new View.OnClickListener() { // from class: o.soa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKSupportBaseActivity.AEQbTJ(function0, view);
            }
        });
    }

    public static final void AEQbTJ(Function0 function0, View view) {
        function0.invoke();
    }

    public final void AEQbTJ(@NotNull String str, @NotNull Function0<Unit> function0) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c52794wYp = abstractC47327tnu.AEQbTJ) == null) {
            return;
        }
        c52794wYp.setText(str);
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, function0));
    }

    public final void valueOf(boolean z) {
        C52794wYp c52794wYp;
        AbstractC47327tnu abstractC47327tnu = this.hDKMBd;
        if (abstractC47327tnu == null || (c52794wYp = abstractC47327tnu.AEQbTJ) == null) {
            return;
        }
        c52794wYp.setVisibility(z ? 0 : 8);
    }

    @Override // o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
