package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import java.lang.ref.WeakReference;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33625mzw;
import o.C43471rps;
import o.C43679rto;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rto, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43679rto extends AbstractC32998moE {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public LottieAnimationView AEQbTJ;
    public InterfaceC43645rtG AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public boolean EZpvd;
    public C59534zip KWHzl;
    public android.widget.TextView OLrzqt;
    public RecyclerView djBIcL;
    public java.util.List<java.lang.Object> gEmmrt;
    public java.lang.String valueOf;

    /* JADX INFO: renamed from: o.rto$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C43471rps.TaskDescription.AEQbTJ;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    public C43679rto() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.gEmmrt = arrayList;
        this.KWHzl = new C59534zip(arrayList);
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.AudioListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.AudioListFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C43683rts.class), new Function0<ViewModelStore>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.AudioListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.AudioListFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.nft.ui.mediapicker.nftfeature.AudioListFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: renamed from: o.rto$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rto.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C43679rto EZpvd(java.lang.String str, InterfaceC43645rtG interfaceC43645rtG) {
            C43679rto c43679rto = new C43679rto();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("selectedPath", str);
            c43679rto.setArguments(bundle);
            c43679rto.AYXKKw = interfaceC43645rtG;
            return c43679rto;
        }
    }

    public final C43683rts KWHzl() {
        return (C43683rts) this.AhwBna.getValue();
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        if (this.EZpvd) {
            return;
        }
        AEQbTJ();
        this.EZpvd = true;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        android.os.Bundle arguments = getArguments();
        RecyclerView recyclerView = null;
        this.valueOf = arguments != null ? arguments.getString("selectedPath", null) : null;
        this.AEQbTJ = (LottieAnimationView) view.findViewById(C43471rps.Activity.DbNXlk);
        this.djBIcL = (RecyclerView) view.findViewById(C43471rps.Activity.djBIcL);
        this.OLrzqt = (android.widget.TextView) view.findViewById(C43471rps.Activity.AYXKKw);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView2 = this.djBIcL;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.djBIcL;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(this.KWHzl);
        this.KWHzl.register(MediaInfo.class, new Application(this.valueOf, getContext(), KWHzl(), getActivity(), this.AYXKKw));
        copydefault();
    }

    public final void copydefault() {
        KWHzl().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.rtv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43679rto.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }));
    }

    public static final Unit KWHzl(C43679rto c43679rto, java.util.List list) {
        c43679rto.dismissLoading();
        if (list != null) {
            int size = c43679rto.gEmmrt.size();
            c43679rto.gEmmrt.addAll(list);
            c43679rto.KWHzl.notifyItemRangeInserted(size, list.size());
            if (c43679rto.gEmmrt.size() == 0) {
                c43679rto.EZpvd();
            }
        } else if (c43679rto.gEmmrt.size() == 0) {
            c43679rto.EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd() {
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        android.widget.TextView textView = this.OLrzqt;
        if (textView != null) {
            textView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView = this.AEQbTJ;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.AEQbTJ;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.playAnimation();
        }
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void dismissLoading() {
        LottieAnimationView lottieAnimationView = this.AEQbTJ;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = this.AEQbTJ;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.cancelAnimation();
        }
    }

    private final void AEQbTJ() {
        if (getActivity() instanceof AbstractActivityC33041mov) {
            FragmentActivity activity = getActivity();
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).getPermissionHelper().copydefault(getActivity(), 21, new ActionBar(new WeakReference(this)));
        }
    }

    /* JADX INFO: renamed from: o.rto$ActionBar */
    public static final class ActionBar implements C33625mzw.Activity {
        public final WeakReference<C43679rto> AEQbTJ;

        public ActionBar(@NotNull WeakReference<C43679rto> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "");
            this.AEQbTJ = weakReference;
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd() {
            C43683rts c43683rtsKWHzl;
            java.util.List list;
            C43679rto c43679rto;
            C43679rto c43679rto2 = this.AEQbTJ.get();
            if (c43679rto2 != null && (list = c43679rto2.gEmmrt) != null && list.size() == 0 && (c43679rto = this.AEQbTJ.get()) != null) {
                c43679rto.showLoading();
            }
            C43679rto c43679rto3 = this.AEQbTJ.get();
            if (c43679rto3 == null || (c43683rtsKWHzl = c43679rto3.KWHzl()) == null) {
                return;
            }
            c43683rtsKWHzl.KWHzl();
        }

        @Override // o.C33625mzw.Activity
        public void EZpvd(java.util.List<java.lang.String> list) {
            C43679rto c43679rto = this.AEQbTJ.get();
            if (c43679rto != null) {
                c43679rto.EZpvd();
            }
        }
    }

    /* JADX INFO: renamed from: o.rto$Application */
    public static final class Application extends AbstractC43310rmq<MediaInfo, AbstractC43434rpH> {
        public final android.content.Context AEQbTJ;
        public InterfaceC43645rtG EZpvd;
        public final FragmentActivity KWHzl;
        public final C43683rts OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getItemLayoutId() {
            return C43471rps.TaskDescription.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC43310rmq
        public int getVariableId() {
            return C43468rpp.KWHzl;
        }

        public Application(java.lang.String str, android.content.Context context, @NotNull C43683rts c43683rts, FragmentActivity fragmentActivity, InterfaceC43645rtG interfaceC43645rtG) {
            Intrinsics.checkNotNullParameter(c43683rts, "");
            this.copydefault = str;
            this.AEQbTJ = context;
            this.OLrzqt = c43683rts;
            this.KWHzl = fragmentActivity;
            this.EZpvd = interfaceC43645rtG;
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC43434rpH> c43312rms, @NotNull final MediaInfo mediaInfo) {
            java.lang.String str;
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(mediaInfo, "");
            super.onBindViewHolder((C43312rms) c43312rms, mediaInfo);
            if (this.AEQbTJ != null) {
                ((AbstractC43434rpH) c43312rms.OLrzqt()).KWHzl.setText(mediaInfo.EZpvd());
                ((AbstractC43434rpH) c43312rms.OLrzqt()).AhwBna.setText(pTA.formatSimpleDate$default(new Date(mediaInfo.KWHzl() * ((long) 1000)), null, 1, null));
                if (mediaInfo.AhwBna() == MediaPickerType.TYPE_AUDIO) {
                    str = "·" + C43648rtJ.EZpvd(mediaInfo.EZpvd()) + this.AEQbTJ.getString(C43471rps.ActionBar.finit);
                } else {
                    str = "·" + C43648rtJ.EZpvd(mediaInfo.EZpvd()) + this.AEQbTJ.getString(C43471rps.ActionBar.gGvvIC);
                }
                ((AbstractC43434rpH) c43312rms.OLrzqt()).gEmmrt.setText(C43648rtJ.OLrzqt(mediaInfo.copydefault()) + str);
            }
            c43312rms.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.rtt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C43679rto.Application.copydefault(this.AEQbTJ, mediaInfo, view);
                }
            });
            if (mediaInfo.AhwBna() == MediaPickerType.TYPE_AUDIO) {
                ((AbstractC43434rpH) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43471rps.Application.OLrzqt);
            } else {
                ((AbstractC43434rpH) c43312rms.OLrzqt()).copydefault.setBackgroundResource(C43471rps.Application.AEQbTJ);
            }
            if (C59449zhJ.equals$default(this.copydefault, mediaInfo.OLrzqt(), false, 2, null)) {
                ((AbstractC43434rpH) c43312rms.OLrzqt()).EZpvd.setVisibility(8);
            } else {
                ((AbstractC43434rpH) c43312rms.OLrzqt()).EZpvd.setVisibility(8);
            }
        }

        public static final void copydefault(Application application, MediaInfo mediaInfo, android.view.View view) {
            InterfaceC43645rtG interfaceC43645rtG;
            if (application.KWHzl != null) {
                if (mediaInfo.AhwBna() == MediaPickerType.TYPE_AUDIO) {
                    InterfaceC43645rtG interfaceC43645rtG2 = application.EZpvd;
                    if (interfaceC43645rtG2 != null) {
                        java.lang.String strOLrzqt = mediaInfo.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                        java.lang.String strEZpvd = mediaInfo.EZpvd();
                        Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
                        long jCopydefault = mediaInfo.copydefault();
                        java.lang.String strGEmmrt = mediaInfo.gEmmrt();
                        Intrinsics.checkNotNullExpressionValue(strGEmmrt, "");
                        interfaceC43645rtG2.copydefault(3, strOLrzqt, strEZpvd, jCopydefault, strGEmmrt);
                        return;
                    }
                    return;
                }
                if (mediaInfo.AhwBna() != MediaPickerType.TYPE_VIDEO || (interfaceC43645rtG = application.EZpvd) == null) {
                    return;
                }
                java.lang.String strOLrzqt2 = mediaInfo.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(strOLrzqt2, "");
                java.lang.String strEZpvd2 = mediaInfo.EZpvd();
                Intrinsics.checkNotNullExpressionValue(strEZpvd2, "");
                long jCopydefault2 = mediaInfo.copydefault();
                java.lang.String strGEmmrt2 = mediaInfo.gEmmrt();
                Intrinsics.checkNotNullExpressionValue(strGEmmrt2, "");
                interfaceC43645rtG.copydefault(2, strOLrzqt2, strEZpvd2, jCopydefault2, strGEmmrt2);
            }
        }
    }
}
