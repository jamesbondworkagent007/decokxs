package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$handleLoginFlow$1;
import com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$prepareUpdateAlias$1;
import com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$updateAlias$1;
import com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25633jAq extends wXX {
    public C23398hxV EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public Function1<? super java.lang.String, Unit> copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.jAq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jAq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.jAq$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C25633jAq newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            return activity.AEQbTJ(str, str2, function1);
        }

        public final C25633jAq AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C25633jAq c25633jAq = new C25633jAq();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.address_alias_input", new TrackerAddressAliasInputParams(str, str2));
            c25633jAq.setArguments(bundle);
            c25633jAq.copydefault = function1;
            return c25633jAq;
        }
    }

    public C25633jAq() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.address_tracker.TrackerAddressAliasInputBottomSheet$special$$inlined$activityViewModels$default$3
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

    public final TrackerAddressAliasInputParams KWHzl() {
        TrackerAddressAliasInputParams trackerAddressAliasInputParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (trackerAddressAliasInputParams = (TrackerAddressAliasInputParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.address_alias_input", TrackerAddressAliasInputParams.class))) == null) ? new TrackerAddressAliasInputParams(null, null, 3, null) : trackerAddressAliasInputParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingAddressViewModel AEQbTJ() {
        return (TrackingAddressViewModel) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setDividerVisibility(false);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistry3));
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.EZpvd().setImageResource(0);
        wxq.KWHzl().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new FragmentManager(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C55008xbo c55008xbo;
        final C55001xbh c55001xbhAkhnZx;
        C55008xbo c55008xbo2;
        C55009xbp c55009xbpFIwbmz;
        C55008xbo c55008xbo3;
        C55001xbh c55001xbhAkhnZx2;
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        wYF wyf2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        java.lang.String strOLrzqt = KWHzl().OLrzqt();
        this.EZpvd = C23398hxV.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, false);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C52794wYp c52794wYp = new C52794wYp(contextRequireContext, null, 0, 6, null);
        c52794wYp.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getOptionsList));
        c52794wYp.setOKDSType(260);
        c52794wYp.setOKDSSize(28);
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
        C23398hxV c23398hxV = this.EZpvd;
        if (c23398hxV != null && (wyf2 = c23398hxV.AEQbTJ) != null) {
            C52794wYp c52794wYpAEQbTJ = wyf2.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setText(getString(C23274hvD.Fragment.ORxRYg));
            }
            C52794wYp c52794wYpAEQbTJ2 = wyf2.AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setVisibility(0);
            }
            C52794wYp c52794wYpCopydefault2 = wyf2.copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setText(getString(C23274hvD.Fragment.ejfBZ));
            }
            C52794wYp c52794wYpCopydefault3 = wyf2.copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setVisibility(0);
            }
            C52794wYp c52794wYpAEQbTJ3 = wyf2.AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setOnClickListener(new Application(c52794wYpAEQbTJ3, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ4 = wyf2.AEQbTJ();
            if (c52794wYpAEQbTJ4 != null) {
                c52794wYpAEQbTJ4.setOKDSType(260);
            }
            C52794wYp c52794wYpCopydefault4 = wyf2.copydefault();
            if (c52794wYpCopydefault4 != null) {
                c52794wYpCopydefault4.setOnClickListener(new TaskDescription(c52794wYpCopydefault4, 1000L, this));
            }
        }
        C23398hxV c23398hxV2 = this.EZpvd;
        if (c23398hxV2 != null && (c55008xbo3 = c23398hxV2.EZpvd) != null && (c55001xbhAkhnZx2 = c55008xbo3.AkhnZx()) != null) {
            if (strOLrzqt != null && C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
                c55001xbhAkhnZx2.setText(strOLrzqt);
            } else {
                c52794wYp.setEnabled(false);
            }
            c55001xbhAkhnZx2.setHintText(KWHzl().EZpvd());
            C23398hxV c23398hxV3 = this.EZpvd;
            if (c23398hxV3 != null && (wyf = c23398hxV3.AEQbTJ) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                c52794wYpCopydefault.setEnabled(false);
            }
            c55001xbhAkhnZx2.addTextChangedListener(new StateListAnimator(c52794wYp, this, strOLrzqt));
        }
        C23398hxV c23398hxV4 = this.EZpvd;
        if (c23398hxV4 != null && (c55008xbo2 = c23398hxV4.EZpvd) != null && (c55009xbpFIwbmz = c55008xbo2.fIwbmz()) != null) {
            c55009xbpFIwbmz.EZpvd(c52794wYp);
        }
        C23398hxV c23398hxV5 = this.EZpvd;
        constraintLayout.addView(c23398hxV5 != null ? c23398hxV5.getRoot() : null);
        C23398hxV c23398hxV6 = this.EZpvd;
        if (c23398hxV6 == null || (c55008xbo = c23398hxV6.EZpvd) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) {
            return;
        }
        c55001xbhAkhnZx.post(new java.lang.Runnable() { // from class: o.jAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25633jAq.KWHzl(c55001xbhAkhnZx, this);
            }
        });
    }

    /* JADX INFO: renamed from: o.jAq$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        public final /* synthetic */ C25633jAq KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ C52794wYp copydefault;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator(C52794wYp c52794wYp, C25633jAq c25633jAq, java.lang.String str) {
            this.copydefault = c52794wYp;
            this.KWHzl = c25633jAq;
            this.OLrzqt = str;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            wYF wyf;
            C52794wYp c52794wYpCopydefault;
            C55008xbo c55008xbo;
            java.lang.CharSequence charSequenceHDKMBd = charSequence != null ? StringsKt__StringsKt.hDKMBd(charSequence) : null;
            if (charSequenceHDKMBd == null || !C33129mqd.OLrzqt(charSequenceHDKMBd)) {
                C23398hxV c23398hxV = this.KWHzl.EZpvd;
                if (c23398hxV != null && (c55008xbo = c23398hxV.EZpvd) != null) {
                    c55008xbo.values();
                }
                this.copydefault.setEnabled(false);
                C23398hxV c23398hxV2 = this.KWHzl.EZpvd;
                if (c23398hxV2 == null || (wyf = c23398hxV2.AEQbTJ) == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
                    return;
                }
                c52794wYpCopydefault.setEnabled(true);
                return;
            }
            this.copydefault.setEnabled(true);
            C23398hxV c23398hxV3 = this.KWHzl.EZpvd;
            if (c23398hxV3 != null) {
                java.lang.String str = this.OLrzqt;
                if (charSequenceHDKMBd.length() > 30) {
                    c23398hxV3.EZpvd.setErrorText(C33070mpX.AYXKKw(C23274hvD.Fragment.registerOnBackInvokedCallback));
                    C52794wYp c52794wYpCopydefault2 = c23398hxV3.AEQbTJ.copydefault();
                    if (c52794wYpCopydefault2 != null) {
                        c52794wYpCopydefault2.setEnabled(false);
                        return;
                    }
                    return;
                }
                if (Intrinsics.EZpvd((java.lang.Object) charSequenceHDKMBd.toString(), (java.lang.Object) str)) {
                    c23398hxV3.EZpvd.values();
                    C52794wYp c52794wYpCopydefault3 = c23398hxV3.AEQbTJ.copydefault();
                    if (c52794wYpCopydefault3 != null) {
                        c52794wYpCopydefault3.setEnabled(false);
                        return;
                    }
                    return;
                }
                c23398hxV3.EZpvd.values();
                C52794wYp c52794wYpCopydefault4 = c23398hxV3.AEQbTJ.copydefault();
                if (c52794wYpCopydefault4 != null) {
                    c52794wYpCopydefault4.setEnabled(true);
                }
            }
        }
    }

    public static final void KWHzl(final C55001xbh c55001xbh, final C25633jAq c25633jAq) {
        c55001xbh.requestFocus();
        android.text.Editable text = c55001xbh.getText();
        java.lang.String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        c55001xbh.setSelection(string.length());
        c55001xbh.postDelayed(new java.lang.Runnable() { // from class: o.jAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25633jAq.OLrzqt(this.AEQbTJ, c55001xbh);
            }
        }, 100L);
    }

    public static final void OLrzqt(C25633jAq c25633jAq, C55001xbh c55001xbh) {
        C33570myu.AEQbTJ(c25633jAq.getContext(), (android.widget.EditText) c55001xbh);
    }

    /* JADX INFO: renamed from: o.jAq$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25633jAq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25633jAq c25633jAq) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c25633jAq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C55008xbo c55008xbo;
            C55008xbo c55008xbo2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C23398hxV c23398hxV = this.OLrzqt.EZpvd;
                if (c23398hxV != null && (c55008xbo2 = c23398hxV.EZpvd) != null) {
                    c55008xbo2.setText("");
                }
                C23398hxV c23398hxV2 = this.OLrzqt.EZpvd;
                if (c23398hxV2 == null || (c55008xbo = c23398hxV2.EZpvd) == null) {
                    return;
                }
                c55008xbo.values();
            }
        }
    }

    /* JADX INFO: renamed from: o.jAq$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25633jAq KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25633jAq c25633jAq) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c25633jAq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.jAq$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C25633jAq KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C25633jAq c25633jAq) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c25633jAq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.jAq$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C25633jAq OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C25633jAq c25633jAq) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c25633jAq;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.EZpvd();
            }
        }
    }

    public final void EZpvd() {
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        android.text.Editable text;
        C23398hxV c23398hxV = this.EZpvd;
        java.lang.String strValueOf = java.lang.String.valueOf((c23398hxV == null || (c55008xbo = c23398hxV.EZpvd) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null || (text = c55001xbhAkhnZx.getText()) == null) ? null : StringsKt__StringsKt.hDKMBd(text));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TrackerAddressAliasInputBottomSheet$prepareUpdateAlias$1(this, strValueOf, null), 3, null);
    }

    public static /* synthetic */ void handleLoginFlow$default(C25633jAq c25633jAq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        c25633jAq.EZpvd(str, str2);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TrackerAddressAliasInputBottomSheet$handleLoginFlow$1(this, str, str2, null), 3, null);
    }

    public static /* synthetic */ void updateAlias$default(C25633jAq c25633jAq, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        c25633jAq.KWHzl(str, str2);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new TrackerAddressAliasInputBottomSheet$updateAlias$1(this, str, str2, null), 3, null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        C33570myu.AEQbTJ(getContext(), getView());
    }
}
