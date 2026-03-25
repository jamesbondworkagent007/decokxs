package o;

import android.content.DialogInterface;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_home.feed_tab.FeedPage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47887tyb;
import o.C52761wXj;
import o.InterfaceC55274xgp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47887tyb extends AbstractC52792wYn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public C55198xfS AEQbTJ;
    public final boolean EZpvd;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.tyb$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FeedPage.values().length];
            try {
                iArr[FeedPage.FOR_YOU.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FeedPage.FOLLOWING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FeedPage.NEWS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.tyb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tyb$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C47887tyb show$default(ActionBar actionBar, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function0 = null;
            }
            return actionBar.OLrzqt(fragmentManager, function0);
        }

        public final C47887tyb OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, final Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C47887tyb c47887tyb = new C47887tyb();
            c47887tyb.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.tyf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(android.content.DialogInterface dialogInterface) {
                    C47887tyb.ActionBar.KWHzl(function0, dialogInterface);
                }
            });
            c47887tyb.show(fragmentManager, C47887tyb.class.getSimpleName());
            return c47887tyb;
        }

        public static final void KWHzl(Function0 function0, android.content.DialogInterface dialogInterface) {
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public C47887tyb() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47911tyz.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedSelectBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedSelectBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_home.feed_tab.PlanetFeedSelectBottomSheet$special$$inlined$activityViewModels$default$3
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

    private final C47911tyz KWHzl() {
        return (C47911tyz) this.copydefault.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.AbstractC52792wYn, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.AbstractC52792wYn
    public void EZpvd(@NotNull C55198xfS c55198xfS) {
        Intrinsics.checkNotNullParameter(c55198xfS, "");
        this.AEQbTJ = c55198xfS;
        c55198xfS.setType(1);
        java.util.List<C55276xgr> listCopydefault = copydefault();
        InterfaceC55274xgp.StateListAnimator.setSingleOneColumnData$default(c55198xfS, listCopydefault, null, 2, null);
        copydefault(listCopydefault);
        copydefault(new Function2() { // from class: o.tyi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C47887tyb.EZpvd(this.copydefault, ((java.lang.Integer) obj).intValue(), (C55276xgr) obj2);
            }
        });
    }

    public static final Unit EZpvd(C47887tyb c47887tyb, int i, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
        Intrinsics.copydefault(objOLrzqt, "");
        FeedPage feedPage = (FeedPage) objOLrzqt;
        int i2 = TaskDescription.OLrzqt[feedPage.ordinal()];
        if (i2 == 1) {
            C32866mlf.onEvent$default("Feeds_Top_FeedTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else if (i2 == 2) {
            C32866mlf.onEvent$default("Feeds_Top_FollowingTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C32866mlf.onEvent$default("Feeds_Top_NewsTab_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
        c47887tyb.KWHzl().EZpvd(feedPage.ordinal());
        c47887tyb.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public final java.util.List<C55276xgr> copydefault() {
        FeedPage[] feedPageArrValues = FeedPage.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(feedPageArrValues.length);
        for (FeedPage feedPage : feedPageArrValues) {
            arrayList.add(new C55276xgr(C33070mpX.AYXKKw(feedPage.getTitleResId()), feedPage, null, false, false, null, feedPage.getContentDescriptionId(), 60, null));
        }
        return arrayList;
    }

    private final void copydefault(final java.util.List<C55276xgr> list) {
        C55276xgr c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.AkhnZx(list, KWHzl().AEQbTJ());
        if (c55276xgr == null) {
            c55276xgr = (C55276xgr) CollectionsKt___CollectionsKt.firstOrNull(list);
        }
        if (c55276xgr != null) {
            copydefault(c55276xgr, new Function1() { // from class: o.tye
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(C47887tyb.copydefault(this.copydefault, list, (C55276xgr) obj));
                }
            });
        }
    }

    public static final int copydefault(C47887tyb c47887tyb, java.util.List list, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        return c47887tyb.OLrzqt(list, c55276xgr);
    }

    private final int OLrzqt(java.util.List<C55276xgr> list, C55276xgr c55276xgr) {
        java.util.Iterator<C55276xgr> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            java.lang.Object objOLrzqt = it.next().OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            FeedPage feedPage = (FeedPage) objOLrzqt;
            java.lang.Object objOLrzqt2 = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt2, "");
            if (feedPage == ((FeedPage) objOLrzqt2)) {
                break;
            }
            i++;
        }
        return java.lang.Math.max(0, i);
    }
}
