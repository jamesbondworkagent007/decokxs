package com.okinc.business.defi.wallet.mine.search.ui.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionSet;
import com.google.android.material.transition.MaterialContainerTransform;
import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC32998moE;
import o.C13754dXa;
import o.C16687eod;
import o.C19095fun;
import o.C33570myu;
import o.C55097xdX;
import o.C56391yDq;
import o.C57656ymY;
import o.InterfaceC18922frZ;
import o.pUU;
import o.rVN;
import o.xWQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchContainerFragment extends AbstractC32998moE implements InterfaceC18922frZ, xWQ.Activity {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C16687eod OLrzqt;
    public final int copydefault = C13754dXa.TaskDescription.Rtjmuc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public int OLrzqt() {
        return C13754dXa.ActionBar.XW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public Fragment KWHzl() {
        return InterfaceC18922frZ.StateListAnimator.KWHzl(this);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public void KWHzl(@NotNull Fragment fragment, @NotNull String str, @NotNull WalletNavigator.Application application) {
        InterfaceC18922frZ.StateListAnimator.KWHzl(this, fragment, str, application);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public void OLrzqt(@NotNull Fragment fragment, @NotNull String str, @NotNull WalletNavigator.Application application) {
        InterfaceC18922frZ.StateListAnimator.copydefault(this, fragment, str, application);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public boolean OLrzqt(@NotNull String str, boolean z, boolean z2) {
        return InterfaceC18922frZ.StateListAnimator.copydefault(this, str, z, z2);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public void copydefault(@NotNull Fragment fragment, @NotNull String str, @NotNull WalletNavigator.Application application) {
        InterfaceC18922frZ.StateListAnimator.EZpvd(this, fragment, str, application);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public boolean copydefault(boolean z) {
        return InterfaceC18922frZ.StateListAnimator.EZpvd(this, z);
    }

    @Override // com.okinc.business.defi.wallet.home.navigation.WalletNavigator
    public FragmentManager EZpvd() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return childFragmentManager;
    }

    private final String AYXKKw() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("source") : null;
        return string == null ? "" : string;
    }

    public final boolean copydefault() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_banner", false);
        }
        return false;
    }

    public final String AEQbTJ() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("search_bar_transition_name") : null;
        return string == null ? "" : string;
    }

    public final C19095fun valueOf() {
        Fragment fragmentFindFragmentByTag = EZpvd().findFragmentByTag("tag_manage_search");
        if (fragmentFindFragmentByTag instanceof C19095fun) {
            return (C19095fun) fragmentFindFragmentByTag;
        }
        return null;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final WalletSearchContainerFragment OLrzqt(@NotNull Config config) {
            Intrinsics.checkNotNullParameter(config, "");
            WalletSearchContainerFragment walletSearchContainerFragment = new WalletSearchContainerFragment();
            Bundle bundle = new Bundle();
            bundle.putString("source", config.getSource());
            bundle.putBoolean("show_banner", config.getShowBanner());
            Config.DisplayOptions displayOptions = config.getDisplayOptions();
            bundle.putString("search_bar_transition_name", displayOptions != null ? displayOptions.getSearchBarTransitionName() : null);
            Config.DisplayOptions displayOptions2 = config.getDisplayOptions();
            bundle.putBoolean("show_status_bar", displayOptions2 != null ? displayOptions2.getShowStatusBar() : false);
            walletSearchContainerFragment.setArguments(bundle);
            return walletSearchContainerFragment;
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.OLrzqt = C16687eod.AEQbTJ(layoutInflater, viewGroup, false);
        AhwBna();
        C16687eod c16687eod = this.OLrzqt;
        if (c16687eod != null) {
            return c16687eod.getRoot();
        }
        return null;
    }

    public final void AhwBna() {
        if (StringsKt__StringsKt.fARcdN((CharSequence) AEQbTJ())) {
            return;
        }
        try {
            setAllowEnterTransitionOverlap(false);
            setAllowReturnTransitionOverlap(false);
            TransitionSet transitionSet = new TransitionSet();
            MaterialContainerTransform materialContainerTransform = new MaterialContainerTransform();
            materialContainerTransform.setDuration(300L);
            materialContainerTransform.setScrimColor(0);
            materialContainerTransform.setFadeMode(3);
            transitionSet.addTransition(materialContainerTransform);
            transitionSet.addListener((Transition.TransitionListener) new Activity());
            setSharedElementEnterTransition(transitionSet);
            MaterialContainerTransform materialContainerTransform2 = new MaterialContainerTransform();
            materialContainerTransform2.setDuration(300L);
            materialContainerTransform2.setScrimColor(0);
            materialContainerTransform2.setFadeMode(3);
            setSharedElementReturnTransition(materialContainerTransform2);
        } catch (Exception e) {
            pUU.copydefault("zqh", "initTransition e: " + e.getMessage());
        }
    }

    public static final class Activity extends TransitionListenerAdapter {
        public Activity() {
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            Intrinsics.checkNotNullParameter(transition, "");
            super.onTransitionEnd(transition);
            if (WalletSearchContainerFragment.this.isAdded()) {
                C19095fun c19095funValueOf = WalletSearchContainerFragment.this.valueOf();
                if (c19095funValueOf != null) {
                    c19095funValueOf.values();
                }
                pUU.EZpvd(WalletSearchContainerFragment.this.getTAG(), "Transition ended, notified WalletManageSearchFragment");
                return;
            }
            pUU.valueOf(WalletSearchContainerFragment.this.getTAG(), "Transition ended before fragment attached, skipping notification");
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        Bundle arguments = getArguments();
        KWHzl(arguments != null ? arguments.getBoolean("show_status_bar", true) : true);
        djBIcL();
        if (bundle == null) {
            C19095fun c19095funKWHzl = C19095fun.Companion.KWHzl(copydefault(), AYXKKw(), AEQbTJ());
            FragmentTransaction fragmentTransactionBeginTransaction = EZpvd().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(OLrzqt(), c19095funKWHzl, "tag_manage_search");
            fragmentTransactionBeginTransaction.setReorderingAllowed(true);
            fragmentTransactionBeginTransaction.commit();
        }
        view.post(new Runnable() { // from class: o.fva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                WalletSearchContainerFragment.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(WalletSearchContainerFragment walletSearchContainerFragment) {
        rVN.reportFullyDrawn$default((Fragment) walletSearchContainerFragment, true, (String) null, 2, (Object) null);
    }

    public final void KWHzl(boolean z) {
        C16687eod c16687eod;
        View view;
        View view2;
        C16687eod c16687eod2 = this.OLrzqt;
        if (c16687eod2 != null && (view2 = c16687eod2.AEQbTJ) != null) {
            view2.setVisibility(z ? 0 : 8);
        }
        if (!z || (c16687eod = this.OLrzqt) == null || (view = c16687eod.AEQbTJ) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            Context context = getContext();
            if (context == null) {
                return;
            }
            layoutParams.height = C33570myu.gEmmrt(context);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void djBIcL() {
        EZpvd().setFragmentResultListener("request_key_history_cleared", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.fuZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                WalletSearchContainerFragment.copydefault(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void copydefault(WalletSearchContainerFragment walletSearchContainerFragment, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (bundle.getBoolean("result_key_history_cleared", false)) {
            walletSearchContainerFragment.gEmmrt();
            C19095fun c19095funValueOf = walletSearchContainerFragment.valueOf();
            if (c19095funValueOf != null) {
                c19095funValueOf.isConnected();
            }
        }
    }

    public final void gEmmrt() {
        try {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 6, null);
            c55097xdX.setState(2);
            c55097xdX.setMessage(c55097xdX.getContext().getString(C13754dXa.FragmentManager.Ranim));
            c55097xdX.setCloseBtnShow(true);
            C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 2000L, 48, 0, 0, 24, null);
        } catch (Exception unused) {
        }
    }

    @Override // o.InterfaceC18922frZ
    public boolean AEQbTJ(boolean z) {
        Object objM7377constructorimpl;
        Object objValueOf;
        Object objM7377constructorimpl2;
        boolean zPopBackStackImmediate = true;
        if (EZpvd().getBackStackEntryCount() > 0) {
            try {
                Result.Application application = Result.Companion;
                if (z) {
                    objValueOf = Boolean.valueOf(EZpvd().popBackStackImmediate((String) null, 1));
                } else {
                    EZpvd().popBackStack((String) null, 1);
                    objValueOf = Unit.INSTANCE;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(objValueOf);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ(getTAG(), "Failed to clear internal back stack during dismiss", thM7380exceptionOrNullimpl);
            }
        }
        if (getParentFragmentManager().getBackStackEntryCount() == 0) {
            pUU.valueOf(getTAG(), "Parent back stack is empty, container may not be in back stack");
            return false;
        }
        try {
            Result.Application application3 = Result.Companion;
            if (z) {
                zPopBackStackImmediate = getParentFragmentManager().popBackStackImmediate();
            } else {
                getParentFragmentManager().popBackStack();
            }
            objM7377constructorimpl2 = Result.m7377constructorimpl(Boolean.valueOf(zPopBackStackImmediate));
        } catch (Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            pUU.AEQbTJ(getTAG(), "Failed to dismiss search container from parent", thM7380exceptionOrNullimpl2);
            objM7377constructorimpl2 = Boolean.FALSE;
        }
        return ((Boolean) objM7377constructorimpl2).booleanValue();
    }

    @Override // o.InterfaceC18922frZ, o.xWQ.Activity
    public void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchContainerFragment$dismissSearchContainer$1(this, z, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.OLrzqt = null;
    }

    @Serializable
    public static final class Config implements Parcelable {
        public static final int $stable = 0;
        private final DisplayOptions displayOptions;
        private final boolean showBanner;
        private final String source;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Config(parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : DisplayOptions.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Config() {
            this(false, (String) null, (DisplayOptions) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Config copy$default(Config config, boolean z, String str, DisplayOptions displayOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                z = config.showBanner;
            }
            if ((i & 2) != 0) {
                str = config.source;
            }
            if ((i & 4) != 0) {
                displayOptions = config.displayOptions;
            }
            return config.copy(z, str, displayOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.showBanner;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DisplayOptions component3() {
            return this.displayOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Config copy(boolean z, String str, DisplayOptions displayOptions) {
            return new Config(z, str, displayOptions);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.showBanner == config.showBanner && Intrinsics.EZpvd((Object) this.source, (Object) config.source) && Intrinsics.EZpvd(this.displayOptions, config.displayOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DisplayOptions getDisplayOptions() {
            return this.displayOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShowBanner() {
            return this.showBanner;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.showBanner);
            String str = this.source;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            DisplayOptions displayOptions = this.displayOptions;
            return (((iHashCode * 31) + iHashCode2) * 31) + (displayOptions != null ? displayOptions.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Config(showBanner=" + this.showBanner + ", source=" + this.source + ", displayOptions=" + this.displayOptions + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.showBanner ? 1 : 0);
            parcel.writeString(this.source);
            DisplayOptions displayOptions = this.displayOptions;
            if (displayOptions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                displayOptions.writeToParcel(parcel, i);
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment.Config.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Config> serializer() {
                return WalletSearchContainerFragment$Config$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Config(int i, boolean z, String str, DisplayOptions displayOptions, SerializationConstructorMarker serializationConstructorMarker) {
            this.showBanner = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.source = null;
            } else {
                this.source = str;
            }
            if ((i & 4) == 0) {
                this.displayOptions = null;
            } else {
                this.displayOptions = displayOptions;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Config config, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || config.showBanner) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 0, config.showBanner);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || config.source != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, config.source);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && config.displayOptions == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, WalletSearchContainerFragment$Config$DisplayOptions$$serializer.INSTANCE, config.displayOptions);
        }

        public Config(boolean z, String str, DisplayOptions displayOptions) {
            this.showBanner = z;
            this.source = str;
            this.displayOptions = displayOptions;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment$Config$DisplayOptions:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment$Config$DisplayOptions) : (r4v0 com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment$Config$DisplayOptions))
 A[MD:(boolean, java.lang.String, com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment$Config$DisplayOptions):void (m)] (LINE:263) call: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment.Config.<init>(boolean, java.lang.String, com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment$Config$DisplayOptions):void type: THIS */
        public /* synthetic */ Config(boolean z, String str, DisplayOptions displayOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : displayOptions);
        }

        @Serializable
        public static final class DisplayOptions implements Parcelable {
            public static final int $stable = 0;
            private final String searchBarTransitionName;
            private final boolean showStatusBar;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<DisplayOptions> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<DisplayOptions> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOptions createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new DisplayOptions(parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DisplayOptions[] newArray(int i) {
                    return new DisplayOptions[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public DisplayOptions() {
                this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ DisplayOptions copy$default(DisplayOptions displayOptions, String str, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = displayOptions.searchBarTransitionName;
                }
                if ((i & 2) != 0) {
                    z = displayOptions.showStatusBar;
                }
                return displayOptions.copy(str, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.searchBarTransitionName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component2() {
                return this.showStatusBar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DisplayOptions copy(String str, boolean z) {
                return new DisplayOptions(str, z);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplayOptions)) {
                    return false;
                }
                DisplayOptions displayOptions = (DisplayOptions) obj;
                return Intrinsics.EZpvd((Object) this.searchBarTransitionName, (Object) displayOptions.searchBarTransitionName) && this.showStatusBar == displayOptions.showStatusBar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSearchBarTransitionName() {
                return this.searchBarTransitionName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getShowStatusBar() {
                return this.showStatusBar;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.searchBarTransitionName;
                return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.showStatusBar);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DisplayOptions(searchBarTransitionName=" + this.searchBarTransitionName + ", showStatusBar=" + this.showStatusBar + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.searchBarTransitionName);
                parcel.writeInt(this.showStatusBar ? 1 : 0);
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment.Config.DisplayOptions.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<DisplayOptions> serializer() {
                    return WalletSearchContainerFragment$Config$DisplayOptions$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ DisplayOptions(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
                this.searchBarTransitionName = (i & 1) == 0 ? null : str;
                if ((i & 2) == 0) {
                    this.showStatusBar = false;
                } else {
                    this.showStatusBar = z;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DisplayOptions displayOptions, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || displayOptions.searchBarTransitionName != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, displayOptions.searchBarTransitionName);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || displayOptions.showStatusBar) {
                    compositeEncoder.encodeBooleanElement(serialDescriptor, 1, displayOptions.showStatusBar);
                }
            }

            public DisplayOptions(String str, boolean z) {
                this.searchBarTransitionName = str;
                this.showStatusBar = z;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:271) call: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment.Config.DisplayOptions.<init>(java.lang.String, boolean):void type: THIS */
            public /* synthetic */ DisplayOptions(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
            }
        }
    }
}
