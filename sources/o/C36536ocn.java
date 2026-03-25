package o;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.LiveChatRoomConfig;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$1;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$2;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$3;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$4;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$5;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$6;
import com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$observeViewModel$7;
import com.okinc.uilab.edit.OKEditText;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.InterfaceC36545ocw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ocn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C36536ocn extends AbstractC32996moC implements InterfaceC35183nqX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public nJT AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public int AhwBna;
    public C36531oci EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public boolean djBIcL;
    public final int gEmmrt;
    public int valueOf;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nJT copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.gEmmrt;
    }

    public C36536ocn() {
        Function0 function0 = new Function0() { // from class: o.ocq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36536ocn.fetchVPNInfo(this.KWHzl);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C36547ocy.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.livestream.fragment.LivestreamChatFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.djBIcL = true;
        this.values = true;
        this.valueOf = -1;
        this.gEmmrt = C35399nuc.Dialog.OHqIaq;
    }

    /* JADX INFO: renamed from: o.ocn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ocn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C36536ocn EZpvd(@NotNull LiveChatRoomConfig liveChatRoomConfig) {
            Intrinsics.checkNotNullParameter(liveChatRoomConfig, "");
            C36536ocn c36536ocn = new C36536ocn();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("ARG_CONFIG", liveChatRoomConfig);
            c36536ocn.setArguments(bundle);
            return c36536ocn;
        }
    }

    public final C36547ocy KWHzl() {
        return (C36547ocy) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.ocn$PendingIntent */
    public static final class PendingIntent extends AbstractSavedStateViewModelFactory {
        public final /* synthetic */ C36536ocn EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(C36536ocn c36536ocn, C36536ocn c36536ocn2, android.os.Bundle bundle) {
            super(c36536ocn, bundle);
            this.EZpvd = c36536ocn2;
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        public <T extends ViewModel> T create(java.lang.String str, java.lang.Class<T> cls, SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(savedStateHandle, "");
            android.content.Context applicationContext = this.EZpvd.requireContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            InterfaceC35328ntJ interfaceC35328ntJ = (InterfaceC35328ntJ) C58114yvF.OLrzqt(applicationContext, InterfaceC35328ntJ.class);
            return new C36547ocy(interfaceC35328ntJ.hBpjJd(), interfaceC35328ntJ.dmfpNf(), interfaceC35328ntJ.OBJEWx(), interfaceC35328ntJ.RdAHlO(), interfaceC35328ntJ.ODXsMY(), interfaceC35328ntJ.gwTjWJ(), interfaceC35328ntJ.dHguZz(), savedStateHandle);
        }
    }

    public static final ViewModelProvider.Factory fetchVPNInfo(C36536ocn c36536ocn) {
        return new PendingIntent(c36536ocn, c36536ocn, c36536ocn.getArguments());
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AEQbTJ = nJT.KWHzl(layoutInflater, viewGroup, false);
        nJT njtCopydefault = copydefault();
        Intrinsics.copydefault(njtCopydefault);
        android.view.View root = njtCopydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        nJT njtCopydefault = copydefault();
        if (njtCopydefault != null) {
            ViewCompat.setOnApplyWindowInsetsListener(njtCopydefault.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.ocr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(android.view.View view2, WindowInsetsCompat windowInsetsCompat) {
                    return C36536ocn.EZpvd(this.copydefault, view2, windowInsetsCompat);
                }
            });
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C59541ziw.EZpvd(fragmentActivityRequireActivity, viewLifecycleOwner, new InterfaceC59496ziD() { // from class: o.ocp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC59496ziD
                public final void OLrzqt(boolean z) {
                    C36536ocn.gEmmrt(this.AEQbTJ, z);
                }
            });
            AkhnZx();
            gEmmrt();
            fetchVPNInfo();
            values();
        }
    }

    public static final WindowInsetsCompat EZpvd(C36536ocn c36536ocn, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "");
        boolean zIsVisible = windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime());
        int i = zIsVisible ? insets.bottom - insets2.bottom : 0;
        nJT njtCopydefault = c36536ocn.copydefault();
        android.view.View viewFindViewByPosition = null;
        RecyclerView recyclerView = njtCopydefault != null ? njtCopydefault.djBIcL : null;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (zIsVisible && recyclerView != null && recyclerView.isShown() && recyclerView.getHeight() >= 100) {
            c36536ocn.values = c36536ocn.djBIcL;
            int iFindFirstVisibleItemPosition = linearLayoutManager != null ? linearLayoutManager.findFirstVisibleItemPosition() : -1;
            c36536ocn.valueOf = iFindFirstVisibleItemPosition;
            if (iFindFirstVisibleItemPosition != -1 && linearLayoutManager != null) {
                viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            }
            c36536ocn.AhwBna = viewFindViewByPosition != null ? recyclerView.getHeight() - viewFindViewByPosition.getBottom() : 0;
        }
        view.setPadding(insets2.left, 0, insets2.right, i);
        return WindowInsetsCompat.CONSUMED;
    }

    public static final void gEmmrt(final C36536ocn c36536ocn, boolean z) {
        final RecyclerView recyclerView;
        C34041nPf c34041nPf;
        OKEditText oKEditText;
        nJT njtCopydefault = c36536ocn.copydefault();
        if (njtCopydefault == null || (recyclerView = njtCopydefault.djBIcL) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        final LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null && recyclerView.isShown() && recyclerView.getHeight() >= 100) {
            if (z) {
                recyclerView.post(new java.lang.Runnable() { // from class: o.ocs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C36536ocn.OLrzqt(this.OLrzqt, linearLayoutManager, recyclerView);
                    }
                });
                return;
            }
            nJT njtCopydefault2 = c36536ocn.copydefault();
            if (njtCopydefault2 != null && (c34041nPf = njtCopydefault2.AEQbTJ) != null && (oKEditText = c34041nPf.EZpvd) != null) {
                oKEditText.clearFocus();
            }
            c36536ocn.KWHzl().copydefault(InterfaceC36545ocw.Activity.OLrzqt);
            recyclerView.post(new java.lang.Runnable() { // from class: o.oct
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36536ocn.copydefault(recyclerView, c36536ocn);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.ocn$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C36536ocn EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C36536ocn c36536ocn) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c36536ocn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.KWHzl().copydefault(new InterfaceC36545ocw.Application(false, 1, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.ocn$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C36536ocn KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C36536ocn c36536ocn) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c36536ocn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.DbNXlk();
            }
        }
    }

    /* JADX INFO: renamed from: o.ocn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C36536ocn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C36536ocn c36536ocn) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c36536ocn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.AYXKKw();
            }
        }
    }

    public static final void OLrzqt(final C36536ocn c36536ocn, LinearLayoutManager linearLayoutManager, final RecyclerView recyclerView) {
        if (c36536ocn.values) {
            c36536ocn.AYXKKw();
            return;
        }
        int i = c36536ocn.valueOf;
        if (i != -1) {
            linearLayoutManager.scrollToPositionWithOffset(i, c36536ocn.AhwBna);
            recyclerView.post(new java.lang.Runnable() { // from class: o.ocm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36536ocn.AEQbTJ(recyclerView, c36536ocn);
                }
            });
        }
    }

    public static final void AEQbTJ(RecyclerView recyclerView, C36536ocn c36536ocn) {
        boolean z = !recyclerView.canScrollVertically(1);
        c36536ocn.djBIcL = z;
        c36536ocn.EZpvd(z);
    }

    public static final void copydefault(RecyclerView recyclerView, C36536ocn c36536ocn) {
        boolean z = !recyclerView.canScrollVertically(1);
        c36536ocn.djBIcL = z;
        c36536ocn.EZpvd(z);
    }

    private final void AkhnZx() {
        final RecyclerView recyclerView;
        this.EZpvd = new C36531oci();
        nJT njtCopydefault = copydefault();
        if (njtCopydefault == null || (recyclerView = njtCopydefault.djBIcL) == null) {
            return;
        }
        C36531oci c36531oci = this.EZpvd;
        if (c36531oci == null) {
            Intrinsics.gEmmrt("");
            c36531oci = null;
        }
        recyclerView.setAdapter(c36531oci);
        recyclerView.setItemAnimator(null);
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: o.ocl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C36536ocn.OLrzqt(this.OLrzqt, view, motionEvent);
            }
        });
        recyclerView.addOnScrollListener(new LoaderManager());
        recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o.ocj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C36536ocn.KWHzl(recyclerView, this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public static final boolean OLrzqt(C36536ocn c36536ocn, android.view.View view, android.view.MotionEvent motionEvent) {
        c36536ocn.AEQbTJ();
        return false;
    }

    /* JADX INFO: renamed from: o.ocn$LoaderManager */
    public static final class LoaderManager extends RecyclerView.OnScrollListener {
        public LoaderManager() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            if (!recyclerView.isShown() || recyclerView.getHeight() < 100) {
                return;
            }
            C36536ocn.this.djBIcL = !recyclerView.canScrollVertically(1);
            C36536ocn c36536ocn = C36536ocn.this;
            c36536ocn.EZpvd(c36536ocn.djBIcL);
        }
    }

    public static final void KWHzl(final RecyclerView recyclerView, final C36536ocn c36536ocn, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!recyclerView.isShown() || recyclerView.getHeight() < 100) {
            return;
        }
        recyclerView.post(new java.lang.Runnable() { // from class: o.oco
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C36536ocn.gEmmrt(recyclerView, c36536ocn);
            }
        });
    }

    public static final void gEmmrt(RecyclerView recyclerView, C36536ocn c36536ocn) {
        if (!recyclerView.isShown() || recyclerView.getHeight() < 100) {
            return;
        }
        boolean z = !recyclerView.canScrollVertically(1);
        c36536ocn.djBIcL = z;
        c36536ocn.EZpvd(z);
    }

    public final void gEmmrt() {
        C33546myW c33546myW;
        nJT njtCopydefault = copydefault();
        if (njtCopydefault == null || (c33546myW = njtCopydefault.valueOf) == null) {
            return;
        }
        c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.ocx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C36536ocn.copydefault(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(C36536ocn c36536ocn, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c36536ocn.KWHzl().isConnected();
    }

    private final void fetchVPNInfo() {
        nJT njtCopydefault = copydefault();
        if (njtCopydefault != null) {
            if (Intrinsics.EZpvd(KWHzl().AEQbTJ().getValue(), InterfaceC36545ocw.Dialog.EZpvd)) {
                njtCopydefault.fetchVPNInfo.OLrzqt.setGravity(17);
            } else {
                njtCopydefault.fetchVPNInfo.OLrzqt.setGravity(getResources().getConfiguration().orientation != 2 ? 8388611 : 17);
            }
            android.widget.FrameLayout frameLayout = njtCopydefault.copydefault;
            frameLayout.setOnClickListener(new StateListAnimator(frameLayout, 1000L, this));
            C34041nPf c34041nPf = njtCopydefault.AEQbTJ;
            OKEditText oKEditText = c34041nPf.EZpvd;
            oKEditText.setFocusable(false);
            oKEditText.setFocusableInTouchMode(false);
            oKEditText.setOnClickListener(new Dialog(oKEditText, 1000L, this));
            oKEditText.setInputType(1);
            oKEditText.setMaxLines(1);
            oKEditText.setImeOptions(268435460);
            oKEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.ock
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                    return C36536ocn.EZpvd(this.KWHzl, textView, i, keyEvent);
                }
            });
            oKEditText.addTextChangedListener(new Application(c34041nPf));
            android.widget.ImageView imageView = c34041nPf.AEQbTJ;
            imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        }
    }

    public static final boolean EZpvd(C36536ocn c36536ocn, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        c36536ocn.DbNXlk();
        return true;
    }

    /* JADX INFO: renamed from: o.ocn$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ C34041nPf AEQbTJ;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C34041nPf c34041nPf) {
            this.AEQbTJ = c34041nPf;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            InterfaceC36545ocw value = C36536ocn.this.KWHzl().AEQbTJ().getValue();
            InterfaceC36545ocw.Application application = value instanceof InterfaceC36545ocw.Application ? (InterfaceC36545ocw.Application) value : null;
            boolean z = application != null && application.AEQbTJ();
            LinearLayoutCompat linearLayoutCompat = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility((charSequence != null && charSequence.length() == 0) ^ true ? 0 : 8);
            C55113xdn c55113xdn = this.AEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(z ? 0 : 8);
            android.widget.ImageView imageView = this.AEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(z ^ true ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DbNXlk() {
        C34041nPf c34041nPf;
        OKEditText oKEditText;
        nJT njtCopydefault = copydefault();
        java.lang.String strEZpvd = EZpvd(java.lang.String.valueOf((njtCopydefault == null || (c34041nPf = njtCopydefault.AEQbTJ) == null || (oKEditText = c34041nPf.EZpvd) == null) ? null : oKEditText.getText()));
        if (android.text.TextUtils.isEmpty(strEZpvd)) {
            return;
        }
        this.OLrzqt = true;
        KWHzl().OLrzqt(strEZpvd);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) new Regex("[\r\n]+").replace(str, " ")).toString();
    }

    public final void AEQbTJ() {
        C34041nPf c34041nPf;
        OKEditText oKEditText;
        if (KWHzl().AEQbTJ().getValue() instanceof InterfaceC36545ocw.Application) {
            C33054mpH.copydefault(this);
            KWHzl().copydefault(InterfaceC36545ocw.Activity.OLrzqt);
            nJT njtCopydefault = copydefault();
            if (njtCopydefault == null || (c34041nPf = njtCopydefault.AEQbTJ) == null || (oKEditText = c34041nPf.EZpvd) == null) {
                return;
            }
            oKEditText.clearFocus();
        }
    }

    private final void values() {
        C37721ozF.collectOnLifecycle$default(KWHzl().AYXKKw(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$1(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(KWHzl().OLrzqt(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$2(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(KWHzl().gEmmrt(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$3(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(KWHzl().AEQbTJ(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$4(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(KWHzl().djBIcL(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$5(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(KWHzl().AhwBna(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$6(this, null), 2, (java.lang.Object) null);
        C37721ozF.collectOnLifecycle$default(KWHzl().KWHzl(), this, (Lifecycle.State) null, new LivestreamChatFragment$observeViewModel$7(this, null), 2, (java.lang.Object) null);
    }

    public final void EZpvd(boolean z) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (this.KWHzl) {
            return;
        }
        this.djBIcL = z;
        nJT njtCopydefault = copydefault();
        RecyclerView.LayoutManager layoutManager = (njtCopydefault == null || (recyclerView2 = njtCopydefault.djBIcL) == null) ? null : recyclerView2.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || linearLayoutManager.getItemCount() == 0 || copydefault() == null) {
            valueOf();
            return;
        }
        nJT njtCopydefault2 = copydefault();
        boolean zCanScrollVertically = (njtCopydefault2 == null || (recyclerView = njtCopydefault2.djBIcL) == null) ? false : recyclerView.canScrollVertically(1);
        if (!z && zCanScrollVertically) {
            djBIcL();
        } else {
            valueOf();
        }
    }

    public final void djBIcL() {
        android.widget.FrameLayout frameLayout;
        nJT njtCopydefault = copydefault();
        if (njtCopydefault == null || (frameLayout = njtCopydefault.copydefault) == null || frameLayout.getVisibility() == 0) {
            return;
        }
        frameLayout.animate().cancel();
        frameLayout.setVisibility(0);
        frameLayout.setAlpha(0.0f);
        frameLayout.animate().alpha(1.0f).setDuration(300L).setListener(null).start();
    }

    public final void valueOf() {
        android.widget.FrameLayout frameLayout;
        nJT njtCopydefault = copydefault();
        if (njtCopydefault == null || (frameLayout = njtCopydefault.copydefault) == null || frameLayout.getVisibility() != 0) {
            return;
        }
        frameLayout.animate().cancel();
        frameLayout.animate().alpha(0.0f).setDuration(300L).setListener(new ActionBar()).start();
    }

    /* JADX INFO: renamed from: o.ocn$ActionBar */
    public static final class ActionBar extends android.animation.AnimatorListenerAdapter {
        public ActionBar() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            android.widget.FrameLayout frameLayout;
            Intrinsics.checkNotNullParameter(animator, "");
            nJT njtCopydefault = C36536ocn.this.copydefault();
            if (njtCopydefault == null || (frameLayout = njtCopydefault.copydefault) == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    public final void AYXKKw() {
        RecyclerView recyclerView;
        C36531oci c36531oci = this.EZpvd;
        if (c36531oci == null) {
            Intrinsics.gEmmrt("");
            c36531oci = null;
        }
        if (c36531oci.getItemCount() > 0) {
            this.KWHzl = true;
            this.djBIcL = true;
            AhwBna();
            nJT njtCopydefault = copydefault();
            if (njtCopydefault == null || (recyclerView = njtCopydefault.djBIcL) == null) {
                return;
            }
            recyclerView.scrollToPosition(0);
        }
    }

    public final void AhwBna() {
        android.widget.FrameLayout frameLayout;
        nJT njtCopydefault = copydefault();
        if (njtCopydefault == null || (frameLayout = njtCopydefault.copydefault) == null) {
            this.KWHzl = false;
            return;
        }
        frameLayout.animate().cancel();
        if (frameLayout.getVisibility() == 0) {
            frameLayout.animate().alpha(0.0f).setDuration(300L).setListener(new Activity()).start();
        } else {
            frameLayout.postDelayed(new java.lang.Runnable() { // from class: o.ocu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C36536ocn.djBIcL(this.KWHzl);
                }
            }, 300L);
        }
    }

    /* JADX INFO: renamed from: o.ocn$Activity */
    public static final class Activity extends android.animation.AnimatorListenerAdapter {
        public Activity() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            android.widget.FrameLayout frameLayout;
            Intrinsics.checkNotNullParameter(animator, "");
            nJT njtCopydefault = C36536ocn.this.copydefault();
            if (njtCopydefault != null && (frameLayout = njtCopydefault.copydefault) != null) {
                frameLayout.setVisibility(8);
            }
            C36536ocn.this.KWHzl = false;
        }
    }

    public static final void djBIcL(C36536ocn c36536ocn) {
        c36536ocn.KWHzl = false;
    }

    @Override // o.InterfaceC35183nqX
    public void OLrzqt() {
        KWHzl().copydefault(InterfaceC36545ocw.Dialog.EZpvd);
    }

    @Override // o.InterfaceC35183nqX
    public void OLrzqt(boolean z) {
        KWHzl().copydefault(z ? InterfaceC36545ocw.ActionBar.copydefault : InterfaceC36545ocw.Activity.OLrzqt);
    }

    @Override // o.InterfaceC35183nqX
    public void EZpvd() {
        AEQbTJ();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        KWHzl().copydefault();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        KWHzl().EZpvd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }
}
