package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.Bitmap;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10216bkK extends C33005moL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC16577emZ KWHzl;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.bkH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10216bkK.copydefault();
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bkI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10216bkK.EZpvd(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.bkO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10216bkK.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.bkL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10216bkK.AYXKKw(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.bkP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10216bkK.AhwBna(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.bkK$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public C10216bkK() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C10257bkz.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.assets.mywallets.MyWalletsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.assets.mywallets.MyWalletsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.assets.mywallets.MyWalletsFragment$special$$inlined$activityViewModels$default$3
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

    public static final java.util.ArrayList copydefault() {
        return new java.util.ArrayList();
    }

    private final java.util.ArrayList<C10219bkN> isConnected() {
        return (java.util.ArrayList) this.AEQbTJ.getValue();
    }

    public static final C59534zip EZpvd(C10216bkK c10216bkK) {
        return c10216bkK.fetchVPNInfo();
    }

    private final C59534zip values() {
        return (C59534zip) this.EZpvd.getValue();
    }

    public final C10257bkz OLrzqt() {
        return (C10257bkz) this.djBIcL.getValue();
    }

    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String djBIcL(C10216bkK c10216bkK) {
        java.lang.String string;
        android.os.Bundle arguments = c10216bkK.getArguments();
        return (arguments == null || (string = arguments.getString("current_wallet_id")) == null) ? "" : string;
    }

    private final java.lang.String DbNXlk() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String AYXKKw(C10216bkK c10216bkK) {
        java.lang.String string;
        android.os.Bundle arguments = c10216bkK.getArguments();
        return (arguments == null || (string = arguments.getString("meta_id")) == null) ? "" : string;
    }

    private final java.lang.String AkhnZx() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String AhwBna(C10216bkK c10216bkK) {
        java.lang.String string;
        android.os.Bundle arguments = c10216bkK.getArguments();
        return (arguments == null || (string = arguments.getString("source")) == null) ? "" : string;
    }

    @Override // o.C33005moL, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C13754dXa.LoaderManager.OLrzqt);
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16577emZ abstractC16577emZCopydefault = AbstractC16577emZ.copydefault(layoutInflater, viewGroup, false);
        this.KWHzl = abstractC16577emZCopydefault;
        if (abstractC16577emZCopydefault != null) {
            return abstractC16577emZCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        EZpvd();
        fARcdN();
        fIwbmz();
        OLrzqt().KWHzl(DbNXlk());
        OLrzqt().AEQbTJ(AkhnZx());
        OLrzqt().AEQbTJ();
    }

    private final void fIwbmz() {
        OLrzqt().OLrzqt().observe(this, new Activity(new Function1() { // from class: o.bkJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10216bkK.OLrzqt(this.KWHzl, (Bitmap) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C10216bkK c10216bkK, Bitmap bitmap) {
        if (bitmap == null) {
            return Unit.INSTANCE;
        }
        if (!(bitmap instanceof Bitmap.TaskDescription)) {
            if (bitmap instanceof Bitmap.StateListAnimator) {
                c10216bkK.isConnected().clear();
                java.util.ArrayList<C10219bkN> arrayListIsConnected = c10216bkK.isConnected();
                T tOLrzqt = ((Bitmap.StateListAnimator) bitmap).OLrzqt();
                Intrinsics.copydefault(tOLrzqt);
                arrayListIsConnected.addAll((java.util.Collection) tOLrzqt);
                c10216bkK.values().notifyDataSetChanged();
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10216bkK, true, (java.lang.String) null, 2, (java.lang.Object) null);
            } else {
                if (!(bitmap instanceof Bitmap.ActionBar)) {
                    throw new NoWhenBranchMatchedException();
                }
                C33134mqi.copydefault(c10216bkK, ((Bitmap.ActionBar) bitmap).AEQbTJ());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c10216bkK, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        AppCompatImageView appCompatImageView;
        AbstractC16577emZ abstractC16577emZ = this.KWHzl;
        if (abstractC16577emZ == null || (appCompatImageView = abstractC16577emZ.copydefault) == null) {
            return;
        }
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: o.bkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C10216bkK.AEQbTJ(this.KWHzl, view);
            }
        });
    }

    public static final void AEQbTJ(C10216bkK c10216bkK, android.view.View view) {
        c10216bkK.dismiss();
    }

    private final void fARcdN() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        ViewGroup.LayoutParams layoutParams;
        RecyclerView recyclerView4;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC16577emZ abstractC16577emZ = this.KWHzl;
        if (abstractC16577emZ != null && (recyclerView3 = abstractC16577emZ.KWHzl) != null && (layoutParams = recyclerView3.getLayoutParams()) != null) {
            layoutParams.height = (int) (((double) C33566myq.EZpvd.OLrzqt(context)) * 0.8d);
            AbstractC16577emZ abstractC16577emZ2 = this.KWHzl;
            if (abstractC16577emZ2 != null && (recyclerView4 = abstractC16577emZ2.KWHzl) != null) {
                recyclerView4.requestLayout();
            }
        }
        AbstractC16577emZ abstractC16577emZ3 = this.KWHzl;
        if (abstractC16577emZ3 != null && (recyclerView2 = abstractC16577emZ3.KWHzl) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(context));
        }
        AbstractC16577emZ abstractC16577emZ4 = this.KWHzl;
        if (abstractC16577emZ4 == null || (recyclerView = abstractC16577emZ4.KWHzl) == null) {
            return;
        }
        recyclerView.setAdapter(values());
    }

    private final C59534zip fetchVPNInfo() {
        C59534zip c59534zip = new C59534zip(isConnected());
        c59534zip.register(C10219bkN.class, new C10250bks(AEQbTJ(), new Function1() { // from class: o.bkM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10216bkK.EZpvd(this.OLrzqt, ((java.lang.Integer) obj).intValue());
            }
        }));
        return c59534zip;
    }

    public static final Unit EZpvd(C10216bkK c10216bkK, int i) {
        c10216bkK.OLrzqt().OLrzqt(c10216bkK.isConnected().get(i).AEQbTJ());
        c10216bkK.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.bkK$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bkK.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C10216bkK newInstance$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return actionBar.copydefault(str, str2, str3);
        }

        public final C10216bkK copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            C10216bkK c10216bkK = new C10216bkK();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("source", str);
            bundle.putString("current_wallet_id", str2);
            bundle.putString("meta_id", str3);
            c10216bkK.setArguments(bundle);
            return c10216bkK;
        }
    }
}
