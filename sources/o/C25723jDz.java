package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerViewModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressLabel;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25723jDz extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public Function0<Unit> AEQbTJ;
    public C21621hGd EZpvd;
    public jDB KWHzl;
    public jDB copydefault;
    public final InterfaceC56387yDm valueOf;
    public java.util.List<TrackerAddressLabel> AhwBna = yDY.AhwBna();
    public java.lang.String AYXKKw = "";
    public java.lang.String gEmmrt = "";

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 40.0f;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C25723jDz() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerAddressGroupSettingFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerAddressGroupSettingFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker_sa.ui.tracker.TrackerAddressGroupSettingFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final TrackerViewModel KWHzl() {
        return (TrackerViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: o.jDz$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jDz.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C25723jDz newInstance$default(ActionBar actionBar, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            return actionBar.KWHzl(list, str);
        }

        public final C25723jDz KWHzl(@NotNull java.util.List<TrackerAddressLabel> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C25723jDz c25723jDz = new C25723jDz();
            android.os.Bundle bundle = new android.os.Bundle();
            c25723jDz.AhwBna = list;
            c25723jDz.AYXKKw = str;
            c25723jDz.setArguments(bundle);
            return c25723jDz;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = wxq.getContext().getString(C23274hvD.Fragment.OHsvZP);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        copydefault();
        AEQbTJ();
        OLrzqt();
        EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.jDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25723jDz.AhwBna(this.KWHzl);
            }
        });
    }

    public static final void AhwBna(C25723jDz c25723jDz) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c25723jDz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = C21621hGd.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
    }

    public final void AEQbTJ() {
        C21621hGd c21621hGd = this.EZpvd;
        if (c21621hGd != null) {
            android.widget.TextView textView = c21621hGd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(KWHzl().djBIcL().isEmpty() ^ true ? 0 : 8);
            android.widget.TextView textView2 = c21621hGd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(KWHzl().AhwBna().isEmpty() ^ true ? 0 : 8);
        }
    }

    public final void OLrzqt() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.KWHzl = new jDB(KWHzl().djBIcL(), (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(KWHzl().values(), new java.util.ArrayList()), new Function0() { // from class: o.jDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25723jDz.djBIcL(this.OLrzqt);
            }
        });
        C21621hGd c21621hGd = this.EZpvd;
        if (c21621hGd != null && (recyclerView2 = c21621hGd.copydefault) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 1, false));
            recyclerView2.setAdapter(this.KWHzl);
        }
        this.copydefault = new jDB(KWHzl().AhwBna(), (java.util.ArrayList) CollectionsKt___CollectionsKt.OLrzqt(KWHzl().KWHzl(), new java.util.ArrayList()), new Function0() { // from class: o.jDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25723jDz.AYXKKw(this.AEQbTJ);
            }
        });
        C21621hGd c21621hGd2 = this.EZpvd;
        if (c21621hGd2 == null || (recyclerView = c21621hGd2.AEQbTJ) == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.copydefault);
    }

    public static final Unit djBIcL(C25723jDz c25723jDz) {
        c25723jDz.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C25723jDz c25723jDz) {
        c25723jDz.gEmmrt();
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void copydefault() {
        C32866mlf.onEvent$default(this.gEmmrt, (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    private final void gEmmrt() {
        C52794wYp c52794wYp;
        jDB jdb = this.copydefault;
        java.util.List listCopydefault = jdb != null ? jdb.copydefault() : null;
        if (listCopydefault == null) {
            listCopydefault = yDY.AhwBna();
        }
        jDB jdb2 = this.KWHzl;
        java.util.List listCopydefault2 = jdb2 != null ? jdb2.copydefault() : null;
        if (listCopydefault2 == null) {
            listCopydefault2 = yDY.AhwBna();
        }
        C21621hGd c21621hGd = this.EZpvd;
        if (c21621hGd == null || (c52794wYp = c21621hGd.AYXKKw) == null) {
            return;
        }
        c52794wYp.setEnabled(listCopydefault.size() + listCopydefault2.size() > 0);
    }

    private final void EZpvd() {
        C52794wYp c52794wYp;
        C21621hGd c21621hGd = this.EZpvd;
        if (c21621hGd == null || (c52794wYp = c21621hGd.AYXKKw) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.jDz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C25723jDz copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25723jDz c25723jDz) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c25723jDz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                jDB jdb = this.copydefault.copydefault;
                java.util.List<java.lang.String> listCopydefault = jdb != null ? jdb.copydefault() : null;
                if (listCopydefault == null) {
                    listCopydefault = yDY.AhwBna();
                }
                jDB jdb2 = this.copydefault.KWHzl;
                java.util.List<java.lang.String> listCopydefault2 = jdb2 != null ? jdb2.copydefault() : null;
                if (listCopydefault2 == null) {
                    listCopydefault2 = yDY.AhwBna();
                }
                jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.ADDRESS_SOURCES_FILTER, CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) this.copydefault.KWHzl().KWHzl(), (java.lang.Iterable) this.copydefault.KWHzl().values()), ",", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) listCopydefault2), ",", null, null, 0, null, null, 62, null), false, 8, null);
                this.copydefault.KWHzl().KWHzl(listCopydefault, listCopydefault2);
                this.copydefault.dismiss();
            }
        }
    }
}
