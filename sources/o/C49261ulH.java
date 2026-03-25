package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC48907ueY;
import o.AbstractC49100uiF;
import o.C48931uew;
import o.C52761wXj;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49261ulH extends AbstractC32996moC implements InterfaceC48899ueQ {
    public android.widget.TextView AYXKKw;
    public MultiShareConfig EZpvd;
    public final int KWHzl;
    public RecyclerView OLrzqt;
    public android.view.ViewGroup copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ulG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49261ulH.KWHzl();
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ulN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49261ulH.djBIcL(this.KWHzl);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
    }

    /* JADX INFO: renamed from: o.ulH$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C49261ulH AEQbTJ(@NotNull MultiShareConfig multiShareConfig) {
            Intrinsics.checkNotNullParameter(multiShareConfig, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("config", multiShareConfig);
            C49261ulH c49261ulH = new C49261ulH();
            c49261ulH.setArguments(bundle);
            return c49261ulH;
        }
    }

    public static final C59534zip KWHzl() {
        return new C59534zip();
    }

    public final C59534zip copydefault() {
        return (C59534zip) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C48934uez valueOf() {
        return (C48934uez) this.valueOf.getValue();
    }

    public static final C48934uez djBIcL(C49261ulH c49261ulH) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c49261ulH.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (C48934uez) new ViewModelProvider(fragmentRequireParentFragment).get(C48934uez.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC48969ufh<?, ?> AhwBna() {
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof InterfaceC48892ueJ) {
            return ((InterfaceC48892ueJ) parentFragment).AkhnZx();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        android.os.Parcelable parcelable = requireArguments().getParcelable("config");
        Intrinsics.copydefault(parcelable);
        this.EZpvd = (MultiShareConfig) parcelable;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        pUU.KWHzl("OKShare", "SharePlatformsPanelFragmentV2-->onCreateView:" + hashCode());
        android.view.View viewInflate = layoutInflater.inflate(C48931uew.Application.values, viewGroup, false);
        this.AYXKKw = (android.widget.TextView) viewInflate.findViewById(C48931uew.StateListAnimator.getPostValueLengthLimit);
        this.OLrzqt = (RecyclerView) viewInflate.findViewById(C48931uew.StateListAnimator.flVtFt);
        this.copydefault = (android.view.ViewGroup) viewInflate.findViewById(C48931uew.StateListAnimator.sSMYrx);
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.KWHzl(this);
        }
        setListener();
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean djBIcL() {
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            return interfaceC48892ueJCopydefault.fARcdN();
        }
        return false;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf().AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription());
    }

    /* JADX INFO: renamed from: o.ulH$TaskDescription */
    public static final class TaskDescription extends AbstractC32992mnz<java.util.List<? extends SharePlatform>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean KWHzl(java.util.List<? extends SharePlatform> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return false;
        }

        public TaskDescription() {
            super(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        public void AEQbTJ(java.util.List<? extends SharePlatform> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            ShareConfig value = C49261ulH.this.valueOf().OLrzqt().getValue();
            Intrinsics.copydefault(value);
            ShareConfig shareConfig = value;
            C49261ulH c49261ulH = C49261ulH.this;
            c49261ulH.KWHzl(shareConfig, c49261ulH.djBIcL());
            C49261ulH.this.EZpvd(shareConfig);
            C49261ulH.this.OLrzqt();
            C49261ulH c49261ulH2 = C49261ulH.this;
            c49261ulH2.AEQbTJ(c49261ulH2.OLrzqt, list);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C49261ulH.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void KWHzl(java.lang.Throwable th, java.util.List<? extends SharePlatform> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C49261ulH.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.String strAEQbTJ = C49261ulH.this.AEQbTJ(th);
            if (strAEQbTJ != null) {
                C55326xho.toastWithFailedIcon$default(strAEQbTJ, 0, 1, (java.lang.Object) null);
            }
        }
    }

    private final void EZpvd() {
        ActivityResultCaller activityResultCallerRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(activityResultCallerRequireParentFragment, "");
        if (activityResultCallerRequireParentFragment instanceof InterfaceC48892ueJ) {
            ((InterfaceC48892ueJ) activityResultCallerRequireParentFragment).EZpvd().dismissAllowingStateLoss();
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            return th.getMessage();
        }
        if (th instanceof ResponseFailedException) {
            return th.getMessage();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.ulH$Application */
    public final class Application extends C49264ulK {

        /* JADX INFO: renamed from: o.ulH$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ SharePlatform KWHzl;
            public final /* synthetic */ C49261ulH OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C49261ulH c49261ulH, SharePlatform sharePlatform) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = c49261ulH;
                this.KWHzl = sharePlatform;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.OLrzqt.copydefault(this.KWHzl);
                }
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.C49264ulK, o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC49032ugr> c43312rms, @NotNull SharePlatform sharePlatform) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            super.onBindViewHolder(c43312rms, sharePlatform);
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new TaskDescription(view, 1000L, C49261ulH.this, sharePlatform));
        }
    }

    /* JADX INFO: renamed from: o.ulH$StateListAnimator */
    public final class StateListAnimator extends AbstractC43310rmq<C48937ufB, AbstractC49029ugo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C48931uew.Application.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C48927ues.AEQbTJ;
        }

        /* JADX INFO: renamed from: o.ulH$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0979StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C49261ulH KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0979StateListAnimator(android.view.View view, long j, C49261ulH c49261ulH) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.KWHzl = c49261ulH;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    InterfaceC48969ufh interfaceC48969ufhAhwBna = this.KWHzl.AhwBna();
                    if (interfaceC48969ufhAhwBna != null) {
                        interfaceC48969ufhAhwBna.onEditClick();
                    }
                }
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC49029ugo> c43312rms, @NotNull C48937ufB c48937ufB) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c48937ufB, "");
            super.onBindViewHolder((C43312rms) c43312rms, c48937ufB);
            AbstractC49029ugo abstractC49029ugo = (AbstractC49029ugo) c43312rms.OLrzqt();
            abstractC49029ugo.OLrzqt.setText(c48937ufB.KWHzl());
            abstractC49029ugo.EZpvd.setImageDrawable(c48937ufB.copydefault());
            c43312rms.itemView.setContentDescription("editItem");
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new ViewOnClickListenerC0979StateListAnimator(view, 1000L, C49261ulH.this));
        }
    }

    public final void KWHzl(ShareConfig shareConfig, boolean z) {
        pUU.KWHzl("OKShare", "updatePreviewTips->isEdit:" + z + ": config" + shareConfig);
        android.widget.TextView textView = this.AYXKKw;
        if (textView == null) {
            return;
        }
        if (!z) {
            if (shareConfig.getShareParams().getShareType() == ShareType.SHARE_IMAGE) {
                java.lang.CharSequence previewBottomTips = shareConfig.getPreviewConfig().getPreviewBottomTips();
                if (previewBottomTips == null) {
                    previewBottomTips = shareConfig.getShareParams().getBody();
                }
                textView.setText(C49290ulk.EZpvd(previewBottomTips, getResources().getColor(C52761wXj.Activity.dvKsVJ), true));
                if (previewBottomTips != null && previewBottomTips.length() != 0) {
                    textView.setVisibility(0);
                    return;
                } else {
                    textView.setVisibility(8);
                    return;
                }
            }
            textView.setVisibility(8);
            return;
        }
        if (textView.getVisibility() == 0) {
            textView.setVisibility(4);
        }
    }

    public final void OLrzqt() {
        try {
            MultiShareConfig multiShareConfig = this.EZpvd;
            MultiShareConfig multiShareConfig2 = null;
            if (multiShareConfig == null) {
                Intrinsics.gEmmrt("");
                multiShareConfig = null;
            }
            java.lang.Class<? extends AbstractC48907ueY> multiSharedPreviewFragmentClass = multiShareConfig.getMultiSharedPreviewFragmentClass();
            if (multiSharedPreviewFragmentClass != null) {
                androidx.fragment.app.Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag("MultiSharedBottomFragment");
                pUU.KWHzl("OKShare", "installMultiSharedPreviewFragmentIfNeed-->findFragmentByTag:" + fragmentFindFragmentByTag);
                if (fragmentFindFragmentByTag == null) {
                    AbstractC48907ueY abstractC48907ueYNewInstance = multiSharedPreviewFragmentClass.newInstance();
                    AbstractC48907ueY.Activity activity = AbstractC48907ueY.Companion;
                    MultiShareConfig multiShareConfig3 = this.EZpvd;
                    if (multiShareConfig3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        multiShareConfig2 = multiShareConfig3;
                    }
                    activity.OLrzqt(multiShareConfig2, abstractC48907ueYNewInstance);
                    getParentFragmentManager().beginTransaction().replace(C48931uew.StateListAnimator.sSMYrx, abstractC48907ueYNewInstance, "MultiSharedBottomFragment").commitAllowingStateLoss();
                    pUU.KWHzl("OKShare", "installMultiSharedPreviewFragmentIfNeed-->newInstance fragment:" + abstractC48907ueYNewInstance);
                    return;
                }
                pUU.EZpvd("OKShare", "installMultiSharedPreviewFragmentIfNeed-->already exist fragment:" + fragmentFindFragmentByTag);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("OKShare", "installMultiSharedPreviewFragmentIfNeed-->onError:" + e.getMessage());
        }
    }

    public final void EZpvd(ShareConfig shareConfig) {
        java.lang.String string = shareConfig.getShareParams().getExtras().getString("shareBtAreaProviderKey", null);
        if (string == null || string.length() == 0) {
            androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C48931uew.StateListAnimator.gHZMYf);
            if (fragmentFindFragmentById != null) {
                getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentById).commitAllowingStateLoss();
                return;
            }
            return;
        }
        AbstractC32996moC abstractC32996moCOLrzqt = C49006ugR.KWHzl.OLrzqt(string, shareConfig);
        if (abstractC32996moCOLrzqt == null) {
            androidx.fragment.app.Fragment fragmentFindFragmentById2 = getChildFragmentManager().findFragmentById(C48931uew.StateListAnimator.gHZMYf);
            if (fragmentFindFragmentById2 != null) {
                getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentById2).commitAllowingStateLoss();
                return;
            }
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C48931uew.StateListAnimator.gHZMYf, abstractC32996moCOLrzqt).commitAllowingStateLoss();
    }

    public static final java.lang.CharSequence copydefault(java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return obj.toString();
    }

    public final void AEQbTJ(RecyclerView recyclerView, java.util.List<? extends java.lang.Object> list) {
        if (recyclerView == null) {
            return;
        }
        pUU.KWHzl("OKShare", "updateSharePlatformsViews->data:" + CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: o.ulF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49261ulH.copydefault(obj);
            }
        }, 31, null));
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        if (recyclerView.getAdapter() == null) {
            copydefault().register(SharePlatform.class, new Application());
            copydefault().register(C48937ufB.class, new StateListAnimator());
            copydefault().setItems(list);
            recyclerView.setAdapter(copydefault());
            return;
        }
        copydefault().setItems(list);
        copydefault().notifyDataSetChanged();
    }

    @Override // o.InterfaceC48899ueQ
    public void copydefault(boolean z) {
        ShareConfig value = valueOf().OLrzqt().getValue();
        Intrinsics.copydefault(value);
        KWHzl(value, z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        InterfaceC48892ueJ interfaceC48892ueJCopydefault = C49283uld.copydefault(this);
        if (interfaceC48892ueJCopydefault != null) {
            interfaceC48892ueJCopydefault.OLrzqt(this);
        }
    }

    public final void copydefault(SharePlatform sharePlatform) {
        ShareConfig value = valueOf().OLrzqt().getValue();
        if (value == null) {
            return;
        }
        java.lang.Integer numValueOf = valueOf().EZpvd() ? java.lang.Integer.valueOf(valueOf().KWHzl()) : null;
        if (value.getShareParams().getShareType() == ShareType.SHARE_IMAGE) {
            InterfaceC48969ufh<?, ?> interfaceC48969ufhAhwBna = AhwBna();
            if (interfaceC48969ufhAhwBna != null) {
                IShareParams iShareParamsOnRequestPendingShareParams = interfaceC48969ufhAhwBna.onRequestPendingShareParams(sharePlatform);
                if (!(iShareParamsOnRequestPendingShareParams instanceof ImageShareParams) || ((ImageShareParams) iShareParamsOnRequestPendingShareParams).isValidForShare()) {
                    KWHzl(sharePlatform, iShareParamsOnRequestPendingShareParams, numValueOf);
                    return;
                } else {
                    pUU.copydefault("OKShare", "invalid share params");
                    C55326xho.OLrzqt("invalid share params");
                    return;
                }
            }
            pUU.copydefault("OKShare", "parentFragment must implementation IShareDialog");
            C55326xho.OLrzqt("parentFragment must implementation IShareDialog");
            return;
        }
        KWHzl(sharePlatform, value.getShareParams(), numValueOf);
    }

    public final void KWHzl(SharePlatform sharePlatform, IShareParams iShareParams, java.lang.Integer num) {
        C48992ugD c48992ugD = C48992ugD.KWHzl;
        c48992ugD.EZpvd(sharePlatform, iShareParams.getShareFrom());
        c48992ugD.OLrzqt(iShareParams.getTriggerSource(), sharePlatform, iShareParams.getShareFrom(), num);
        C49098uiD c49098uiD = C49098uiD.OLrzqt;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c49098uiD.AEQbTJ(fragmentActivityRequireActivity, iShareParams, sharePlatform, new ActionBar(sharePlatform, iShareParams, this));
        EZpvd();
    }

    /* JADX INFO: renamed from: o.ulH$ActionBar */
    public static final class ActionBar implements InterfaceC49121uia.Activity {
        public final /* synthetic */ SharePlatform KWHzl;
        public final /* synthetic */ IShareParams OLrzqt;
        public final /* synthetic */ C49261ulH copydefault;

        public ActionBar(SharePlatform sharePlatform, IShareParams iShareParams, C49261ulH c49261ulH) {
            this.KWHzl = sharePlatform;
            this.OLrzqt = iShareParams;
            this.copydefault = c49261ulH;
        }

        @Override // o.InterfaceC49121uia.Activity
        public void KWHzl(SharePlatform sharePlatform) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            C48992ugD.KWHzl.OLrzqt(this.KWHzl, this.OLrzqt.getShareFrom());
            C48971ufj.KWHzl(this.copydefault).OLrzqt(AbstractC48925ueq.Companion.EZpvd(), new kotlin.Pair(sharePlatform, AbstractC49100uiF.ActionBar.AEQbTJ));
        }

        @Override // o.InterfaceC49121uia.Activity
        public void EZpvd(SharePlatform sharePlatform, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            Intrinsics.checkNotNullParameter(th, "");
            C48971ufj.KWHzl(this.copydefault).OLrzqt(AbstractC48925ueq.Companion.EZpvd(), new kotlin.Pair(sharePlatform, new AbstractC49100uiF.StateListAnimator(th)));
        }
    }
}
