package o;

import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.share.view.rtlviewpager.ShareViewPager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48908ueZ;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.umh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49340umh extends AbstractC48902ueT<ISharePreviewConfig> implements InterfaceC48899ueQ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public ShareViewPager AYXKKw;
    public MultiShareConfig KWHzl;
    public wXO OLrzqt;
    public StateListAnimator copydefault;
    public int gEmmrt;
    public final int AEQbTJ = C48931uew.Application.valueOf;
    public final Activity AhwBna = new Activity();

    /* JADX INFO: renamed from: o.umh$Application */
    public interface Application {
        void KWHzl(int i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.umh$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.umh.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C49340umh newInstance$default(ActionBar actionBar, MultiShareConfig multiShareConfig, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return actionBar.OLrzqt(multiShareConfig, i);
        }

        public final C49340umh OLrzqt(@NotNull MultiShareConfig multiShareConfig, int i) {
            Intrinsics.checkNotNullParameter(multiShareConfig, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("config", multiShareConfig);
            bundle.putInt("index", i);
            C49340umh c49340umh = new C49340umh();
            c49340umh.setArguments(bundle);
            return c49340umh;
        }
    }

    /* JADX INFO: renamed from: o.umh$Activity */
    public static final class Activity extends ViewPager.SimpleOnPageChangeListener {
        public Activity() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            StateListAnimator stateListAnimator = C49340umh.this.copydefault;
            wXO wxo = null;
            if (stateListAnimator == null) {
                Intrinsics.gEmmrt("");
                stateListAnimator = null;
            }
            int iCopydefault = i % stateListAnimator.copydefault();
            Application application = (Application) C33062mpP.EZpvd(C49340umh.this, Application.class);
            if (application != null) {
                application.KWHzl(iCopydefault);
            }
            if (C49340umh.this.OLrzqt != null) {
                wXO wxo2 = C49340umh.this.OLrzqt;
                if (wxo2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    wxo = wxo2;
                }
                wxo.setSelectedItem(iCopydefault);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        android.os.Parcelable parcelable = requireArguments().getParcelable("config");
        Intrinsics.copydefault(parcelable);
        this.KWHzl = (MultiShareConfig) parcelable;
        this.gEmmrt = requireArguments().getInt("index", 0);
    }

    @Override // o.InterfaceC48899ueQ
    public void copydefault(boolean z) {
        ShareViewPager shareViewPager = this.AYXKKw;
        wXO wxo = null;
        if (shareViewPager == null) {
            Intrinsics.gEmmrt("");
            shareViewPager = null;
        }
        shareViewPager.setScrollable(java.lang.Boolean.valueOf(!z));
        if (z) {
            wXO wxo2 = this.OLrzqt;
            if (wxo2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wxo = wxo2;
            }
            wxo.setVisibility(4);
            return;
        }
        wXO wxo3 = this.OLrzqt;
        if (wxo3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wxo = wxo3;
        }
        wxo.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    @Override // o.AbstractC32996moC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AYXKKw = (ShareViewPager) view.findViewById(C48931uew.StateListAnimator.dmfpNf);
        this.OLrzqt = (wXO) view.findViewById(C48931uew.StateListAnimator.finit);
        float fAEQbTJ = C33570myu.AEQbTJ();
        MultiShareConfig multiShareConfig = this.KWHzl;
        wXO wxo = null;
        if (multiShareConfig == null) {
            Intrinsics.gEmmrt("");
            multiShareConfig = null;
        }
        float pageWidthPercent = (fAEQbTJ - (multiShareConfig.getPageWidthPercent() * fAEQbTJ)) / 2.0f;
        ShareViewPager shareViewPager = this.AYXKKw;
        if (shareViewPager == null) {
            Intrinsics.gEmmrt("");
            shareViewPager = null;
        }
        ViewBindingAdapter.setPaddingStart(shareViewPager, pageWidthPercent);
        ShareViewPager shareViewPager2 = this.AYXKKw;
        if (shareViewPager2 == null) {
            Intrinsics.gEmmrt("");
            shareViewPager2 = null;
        }
        ViewBindingAdapter.setPaddingEnd(shareViewPager2, pageWidthPercent);
        MultiShareConfig multiShareConfig2 = this.KWHzl;
        if (multiShareConfig2 == null) {
            Intrinsics.gEmmrt("");
            multiShareConfig2 = null;
        }
        java.util.ArrayList<ShareConfig> configList = multiShareConfig2.getConfigList();
        MultiShareConfig multiShareConfig3 = this.KWHzl;
        if (multiShareConfig3 == null) {
            Intrinsics.gEmmrt("");
            multiShareConfig3 = null;
        }
        this.copydefault = new StateListAnimator(this, configList, multiShareConfig3.isLoop());
        ShareViewPager shareViewPager3 = this.AYXKKw;
        if (shareViewPager3 == null) {
            Intrinsics.gEmmrt("");
            shareViewPager3 = null;
        }
        shareViewPager3.addOnPageChangeListener(this.AhwBna);
        ShareViewPager shareViewPager4 = this.AYXKKw;
        if (shareViewPager4 == null) {
            Intrinsics.gEmmrt("");
            shareViewPager4 = null;
        }
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        shareViewPager4.setAdapter(stateListAnimator);
        ShareViewPager shareViewPager5 = this.AYXKKw;
        if (shareViewPager5 == null) {
            Intrinsics.gEmmrt("");
            shareViewPager5 = null;
        }
        shareViewPager5.setCurrentItem(this.gEmmrt);
        MultiShareConfig multiShareConfig4 = this.KWHzl;
        if (multiShareConfig4 == null) {
            Intrinsics.gEmmrt("");
            multiShareConfig4 = null;
        }
        if (multiShareConfig4.getShowIndicator()) {
            MultiShareConfig multiShareConfig5 = this.KWHzl;
            if (multiShareConfig5 == null) {
                Intrinsics.gEmmrt("");
                multiShareConfig5 = null;
            }
            if (multiShareConfig5.getConfigList().size() > 1) {
                wXO wxo2 = this.OLrzqt;
                if (wxo2 == null) {
                    Intrinsics.gEmmrt("");
                    wxo2 = null;
                }
                wxo2.setVisibility(0);
                wXO wxo3 = this.OLrzqt;
                if (wxo3 == null) {
                    Intrinsics.gEmmrt("");
                    wxo3 = null;
                }
                MultiShareConfig multiShareConfig6 = this.KWHzl;
                if (multiShareConfig6 == null) {
                    Intrinsics.gEmmrt("");
                    multiShareConfig6 = null;
                }
                wxo3.setCount(multiShareConfig6.getConfigList().size(), this.gEmmrt);
                wXO wxo4 = this.OLrzqt;
                if (wxo4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    wxo = wxo4;
                }
                wxo.setSelectedItem(this.gEmmrt);
            }
        } else {
            wXO wxo5 = this.OLrzqt;
            if (wxo5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wxo = wxo5;
            }
            wxo.setVisibility(8);
        }
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.KWHzl(this);
        }
        view.post(new java.lang.Runnable() { // from class: o.umg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C49340umh.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(C49340umh c49340umh) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c49340umh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Method merged with bridge method: requireShareParams()Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ImageShareParams requireShareParams() {
        IShareParams shareParams = copydefault().getShareParams();
        Intrinsics.copydefault(shareParams, "");
        return (ImageShareParams) shareParams;
    }

    @Override // o.AbstractC48908ueZ
    public ISharePreviewConfig requirePreviewConfig() {
        return copydefault().getPreviewConfig();
    }

    public final ShareConfig copydefault() {
        StateListAnimator stateListAnimator = this.copydefault;
        ShareViewPager shareViewPager = null;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        ShareViewPager shareViewPager2 = this.AYXKKw;
        if (shareViewPager2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            shareViewPager = shareViewPager2;
        }
        return stateListAnimator.EZpvd(shareViewPager.getCurrentItem());
    }

    /* JADX DEBUG: Method merged with bridge method: onRequestPendingShareParams(Lcom/okinc/share/platforms/SharePlatform;)Lcom/okinc/share/api/params/IShareParams; */
    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ImageShareParams onRequestPendingShareParams(@NotNull SharePlatform sharePlatform) {
        ImageShareParams imageShareParamsOnRequestPendingShareParams;
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        AbstractC48902ueT<?> abstractC48902ueTEZpvd = stateListAnimator.EZpvd();
        return (abstractC48902ueTEZpvd == null || (imageShareParamsOnRequestPendingShareParams = abstractC48902ueTEZpvd.onRequestPendingShareParams(sharePlatform)) == null) ? ImageShareParams.ActionBar.create$default(ImageShareParams.Companion, null, 1, null) : imageShareParamsOnRequestPendingShareParams;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.graphics.Rect getImageBounds() {
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        AbstractC48902ueT<?> abstractC48902ueTEZpvd = stateListAnimator.EZpvd();
        if (abstractC48902ueTEZpvd != null) {
            return abstractC48902ueTEZpvd.getImageBounds();
        }
        return null;
    }

    @Override // o.AbstractC48908ueZ
    public android.graphics.Rect getPreviewBounds() {
        android.graphics.Rect previewBounds;
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        AbstractC48902ueT<?> abstractC48902ueTEZpvd = stateListAnimator.EZpvd();
        return (abstractC48902ueTEZpvd == null || (previewBounds = abstractC48902ueTEZpvd.getPreviewBounds()) == null) ? new android.graphics.Rect() : previewBounds;
    }

    @Override // o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public android.view.ViewGroup getPreviewContainer() {
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        AbstractC48902ueT<?> abstractC48902ueTEZpvd = stateListAnimator.EZpvd();
        Intrinsics.copydefault(abstractC48902ueTEZpvd);
        return abstractC48902ueTEZpvd.getPreviewContainer();
    }

    @Override // o.AbstractC48902ueT, o.AbstractC48908ueZ, o.InterfaceC48969ufh
    public void onEditClick() {
        StateListAnimator stateListAnimator = this.copydefault;
        if (stateListAnimator == null) {
            Intrinsics.gEmmrt("");
            stateListAnimator = null;
        }
        AbstractC48902ueT<?> abstractC48902ueTEZpvd = stateListAnimator.EZpvd();
        if (abstractC48902ueTEZpvd != null) {
            abstractC48902ueTEZpvd.onEditClick();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.OLrzqt(this);
        }
        ShareViewPager shareViewPager = this.AYXKKw;
        if (shareViewPager != null) {
            if (shareViewPager == null) {
                Intrinsics.gEmmrt("");
                shareViewPager = null;
            }
            shareViewPager.removeOnPageChangeListener(this.AhwBna);
        }
    }

    /* JADX INFO: renamed from: o.umh$StateListAnimator */
    public final class StateListAnimator extends AbstractC33000moG {
        public final boolean EZpvd;
        public final /* synthetic */ C49340umh KWHzl;
        public AbstractC48902ueT<?> OLrzqt;
        public java.util.List<ShareConfig> copydefault;

        /* JADX INFO: renamed from: o.umh$StateListAnimator$Application */
        public final /* synthetic */ class Application {
            public static final /* synthetic */ int[] KWHzl;
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[ImagePreviewType.values().length];
                try {
                    iArr[ImagePreviewType.CENTER_INSIDE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[ImagePreviewType.CENTER_CROP.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                OLrzqt = iArr;
                int[] iArr2 = new int[SharePreviewMode.values().length];
                try {
                    iArr2[SharePreviewMode.DEFAULT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr2[SharePreviewMode.CUSTOM.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr2[SharePreviewMode.CUSTOM_LUA.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                KWHzl = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC48902ueT<?> EZpvd() {
            return this.OLrzqt;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i) {
            return 1.0f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C49340umh c49340umh, java.util.List<ShareConfig> list, boolean z) {
            super(c49340umh.getChildFragmentManager());
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = c49340umh;
            this.copydefault = list;
            this.EZpvd = z;
        }

        @Override // o.AbstractC33000moG, androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void setPrimaryItem(@NotNull android.view.ViewGroup viewGroup, int i, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            super.setPrimaryItem(viewGroup, i, obj);
            AbstractC48902ueT<?> abstractC48902ueT = (AbstractC48902ueT) obj;
            if (Intrinsics.EZpvd(abstractC48902ueT, this.OLrzqt)) {
                return;
            }
            this.OLrzqt = abstractC48902ueT;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull android.view.ViewGroup viewGroup, int i, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            super.destroyItem(viewGroup, i, obj);
            if (Intrinsics.EZpvd((AbstractC48902ueT) obj, this.OLrzqt)) {
                this.OLrzqt = null;
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            if (!(!this.copydefault.isEmpty())) {
                return 0;
            }
            if (this.EZpvd) {
                return Integer.MAX_VALUE;
            }
            return this.copydefault.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) throws java.lang.IllegalAccessException, java.lang.InstantiationException {
            AbstractC48902ueT<? extends ISharePreviewConfig> c49271ulR;
            ShareConfig shareConfigEZpvd = EZpvd(i);
            ISharePreviewConfig previewConfig = shareConfigEZpvd.getPreviewConfig();
            int i2 = Application.KWHzl[previewConfig.getSharePreviewMode().ordinal()];
            if (i2 == 1) {
                Intrinsics.copydefault(previewConfig, "");
                int i3 = Application.OLrzqt[((ImageDefaultPreviewConfig) previewConfig).getImagePreviewType().ordinal()];
                if (i3 == 1) {
                    c49271ulR = new C49271ulR();
                    AbstractC48908ueZ.Companion.AEQbTJ(shareConfigEZpvd, i, true, c49271ulR);
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c49271ulR = new C49265ulL();
                    AbstractC48908ueZ.Companion.AEQbTJ(shareConfigEZpvd, i, true, c49271ulR);
                }
            } else if (i2 == 2) {
                Intrinsics.copydefault(previewConfig, "");
                c49271ulR = ((ImageCustomPreviewConfig) previewConfig).getCustomFragmentClass().newInstance();
                AbstractC48908ueZ.StateListAnimator stateListAnimator = AbstractC48908ueZ.Companion;
                Intrinsics.copydefault(c49271ulR);
                stateListAnimator.AEQbTJ(shareConfigEZpvd, i, true, c49271ulR);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.copydefault(previewConfig, "");
                c49271ulR = C49044uhC.Companion.OLrzqt();
                AbstractC48908ueZ.Companion.AEQbTJ(shareConfigEZpvd, i, true, c49271ulR);
            }
            Intrinsics.copydefault(c49271ulR);
            return c49271ulR;
        }

        public final int copydefault() {
            return this.copydefault.size();
        }

        public final int OLrzqt(int i) {
            return i % copydefault();
        }

        public final ShareConfig EZpvd(int i) {
            return this.copydefault.get(OLrzqt(i));
        }

        @Override // o.AbstractC33000moG, androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(@NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return super.getItemPosition(obj);
        }
    }
}
