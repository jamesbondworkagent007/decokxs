package com.okinc.okex.rating.ui.core.submit.content;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment;
import com.okinc.okex.rating.viewmodel.RatingSubmitViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC32996moC;
import o.AbstractC47336toC;
import o.C32989mnw;
import o.C32991mny;
import o.C45809syb;
import o.C45823syp;
import o.C45868szh;
import o.C47315tni;
import o.C55326xho;
import o.C56390yDp;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.rVN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class RatingSubmitContentFragment extends AbstractC32996moC {
    public final int EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public AbstractC47336toC OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sxU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return RatingSubmitContentFragment.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public RatingSubmitContentFragment() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RatingSubmitViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<Fragment> function02 = new Function0<Fragment>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C45868szh.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = C47315tni.ActionBar.QOLQEE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final RatingSubmitContentFragment KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            RatingSubmitContentFragment ratingSubmitContentFragment = new RatingSubmitContentFragment();
            ratingSubmitContentFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_ID", str)));
            return ratingSubmitContentFragment;
        }
    }

    public final String OLrzqt() {
        return (String) this.copydefault.getValue();
    }

    public static final String AEQbTJ(RatingSubmitContentFragment ratingSubmitContentFragment) {
        String string;
        Bundle arguments = ratingSubmitContentFragment.getArguments();
        return (arguments == null || (string = arguments.getString("KEY_ID")) == null) ? "" : string;
    }

    private final RatingSubmitViewModel valueOf() {
        return (RatingSubmitViewModel) this.valueOf.getValue();
    }

    public final C45868szh KWHzl() {
        return (C45868szh) this.KWHzl.getValue();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC47336toC abstractC47336toCOLrzqt = AbstractC47336toC.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC47336toCOLrzqt, "");
        this.OLrzqt = abstractC47336toCOLrzqt;
        View root = abstractC47336toCOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C45868szh c45868szhKWHzl = KWHzl();
        c45868szhKWHzl.copydefault().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.sxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.AhwBna(this.KWHzl, (Unit) obj);
            }
        }));
        c45868szhKWHzl.EZpvd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.sxR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.AYXKKw(this.OLrzqt, (Unit) obj);
            }
        }));
        c45868szhKWHzl.KWHzl().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.sxQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.valueOf(this.AEQbTJ, (Unit) obj);
            }
        }));
        RatingSubmitViewModel ratingSubmitViewModelValueOf = valueOf();
        ratingSubmitViewModelValueOf.zsXlph().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.sxP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.EZpvd((RatingSubmitViewModel.Application) obj);
            }
        }));
        ratingSubmitViewModelValueOf.AkhnZx().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.sxO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.gEmmrt(this.copydefault, (Unit) obj);
            }
        }));
        ratingSubmitViewModelValueOf.hDKMBd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.sxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.djBIcL(this.KWHzl, (Unit) obj);
            }
        }));
        ratingSubmitViewModelValueOf.AuCTel().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.sxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.OLrzqt(this.copydefault, (C32989mnw) obj);
            }
        }));
        ratingSubmitViewModelValueOf.ejfBZ().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.sxX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return RatingSubmitContentFragment.KWHzl(this.AEQbTJ, (C32989mnw) obj);
            }
        }));
        view.post(new Runnable() { // from class: o.sxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                RatingSubmitContentFragment.EZpvd(this.copydefault);
            }
        });
    }

    public static final Unit AhwBna(RatingSubmitContentFragment ratingSubmitContentFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ratingSubmitContentFragment.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(RatingSubmitContentFragment ratingSubmitContentFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ratingSubmitContentFragment.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(RatingSubmitContentFragment ratingSubmitContentFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ratingSubmitContentFragment.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(RatingSubmitViewModel.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        if (Intrinsics.EZpvd(application, RatingSubmitViewModel.Application.C0551Application.KWHzl)) {
            C55326xho.toastWithFailedIcon$default(C47315tni.PendingIntent.AhwBna, 0, 1, (Object) null);
        } else {
            if (!(application instanceof RatingSubmitViewModel.Application.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            C55326xho.toastWithFailedIcon$default(((RatingSubmitViewModel.Application.StateListAnimator) application).copydefault(), 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(RatingSubmitContentFragment ratingSubmitContentFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ratingSubmitContentFragment.KWHzl().AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(RatingSubmitContentFragment ratingSubmitContentFragment, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ratingSubmitContentFragment.KWHzl().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(RatingSubmitContentFragment ratingSubmitContentFragment, C32989mnw c32989mnw) {
        ratingSubmitContentFragment.EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(RatingSubmitContentFragment ratingSubmitContentFragment, C32989mnw c32989mnw) {
        ratingSubmitContentFragment.AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(RatingSubmitContentFragment ratingSubmitContentFragment) {
        rVN.reportFullyDrawn$default((Fragment) ratingSubmitContentFragment, true, (String) null, 2, (Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    public final void AYXKKw() {
        getChildFragmentManager().beginTransaction().replace(C47315tni.TaskDescription.QHmsKR, C45809syb.Companion.OLrzqt()).commitAllowingStateLoss();
    }

    public final void AhwBna() {
        getChildFragmentManager().beginTransaction().replace(C47315tni.TaskDescription.QHmsKR, C45823syp.Companion.copydefault()).commitAllowingStateLoss();
    }

    public final void AEQbTJ() {
        FragmentKt.setFragmentResult(this, OLrzqt(), Event.Companion.AEQbTJ(Event.UpdateStarRating.copydefault));
    }

    public final void EZpvd() {
        FragmentKt.setFragmentResult(this, OLrzqt(), Event.Companion.AEQbTJ(Event.UpdateLabel.OLrzqt));
    }

    public final void copydefault() {
        FragmentKt.setFragmentResult(this, OLrzqt(), Event.Companion.AEQbTJ(Event.Complete.AEQbTJ));
    }

    public static abstract class Event implements Parcelable {
        public static final ActionBar Companion = new ActionBar(null);

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment.Event.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Event() {
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class UpdateStarRating extends Event {
            public static final UpdateStarRating copydefault = new UpdateStarRating();
            public static final Parcelable.Creator<UpdateStarRating> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<UpdateStarRating> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateStarRating createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return UpdateStarRating.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateStarRating[] newArray(int i) {
                    return new UpdateStarRating[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private UpdateStarRating() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class UpdateLabel extends Event {
            public static final UpdateLabel OLrzqt = new UpdateLabel();
            public static final Parcelable.Creator<UpdateLabel> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<UpdateLabel> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateLabel createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return UpdateLabel.OLrzqt;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateLabel[] newArray(int i) {
                    return new UpdateLabel[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private UpdateLabel() {
                super(null);
            }
        }

        public static final class Complete extends Event {
            public static final Complete AEQbTJ = new Complete();
            public static final Parcelable.Creator<Complete> CREATOR = new Creator();

            /* JADX INFO: loaded from: classes19.dex */
            public static final class Creator implements Parcelable.Creator<Complete> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Complete.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Complete[] newArray(int i) {
                    return new Complete[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeInt(1);
            }

            private Complete() {
                super(null);
            }
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.rating.ui.core.submit.content.RatingSubmitContentFragment.Event.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final Event OLrzqt(@NotNull Bundle bundle) {
                Intrinsics.checkNotNullParameter(bundle, "");
                return (Event) BundleCompat.getParcelable(bundle, "KEY_EVENT", Event.class);
            }

            public final Bundle AEQbTJ(@NotNull Event event) {
                Intrinsics.checkNotNullParameter(event, "");
                return BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_EVENT", event));
            }
        }
    }
}
