package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$createOrder$1;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onCreateContent$5;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onCreateContent$6;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onFooterCreated$1$2;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$onFooterCreated$1$3;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC17837fUc;
import o.C13754dXa;
import o.C38307pTy;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUF extends wXX implements fUG {
    public boolean AEQbTJ;
    public final boolean EZpvd = true;
    public wYF KWHzl;
    public final InterfaceC56387yDm OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public fUF() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fUX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.OrderConfirmBottomSheet$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final fUX gEmmrt() {
        return (fUX) this.OLrzqt.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = getString(C13754dXa.FragmentManager.setFlags);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C17030evB c17030evBAEQbTJ = C17030evB.AEQbTJ(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        Intrinsics.checkNotNullExpressionValue(c17030evBAEQbTJ, "");
        C55258xgZ c55258xgZ = c17030evBAEQbTJ.gEmmrt;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
        Function0 function0 = new Function0() { // from class: o.fUI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fUF.AhwBna(this.EZpvd);
            }
        };
        android.widget.TextView textView = c17030evBAEQbTJ.valueOf;
        textView.setOnClickListener(new Application(textView, 1000L, function0));
        android.widget.ImageView imageView = c17030evBAEQbTJ.AYXKKw;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, function0));
        C55258xgZ c55258xgZ2 = c17030evBAEQbTJ.AhwBna;
        c55258xgZ2.setOnClickListener(new StateListAnimator(c55258xgZ2, 1000L, this));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OrderConfirmBottomSheet$onCreateContent$5(this, c17030evBAEQbTJ, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new OrderConfirmBottomSheet$onCreateContent$6(this, c17030evBAEQbTJ, null), 3, null);
    }

    public static final Unit AhwBna(fUF fuf) {
        fUP fup = new fUP();
        androidx.fragment.app.FragmentManager childFragmentManager = fuf.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        fup.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.KWHzl = wyf;
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DXXBbs));
            c52794wYpCopydefault.setOnClickListener(new PendingIntent(c52794wYpCopydefault, 1000L, this));
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OrderConfirmBottomSheet$onFooterCreated$1$2(this, c52794wYpCopydefault, null), 3, null);
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new OrderConfirmBottomSheet$onFooterCreated$1$3(this, c52794wYpCopydefault, null), 3, null);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.invoke();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ fUF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, fUF fuf) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = fuf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                AbstractC43419rot<SmallAssetQuoteData, OKServerException> value = this.copydefault.gEmmrt().values().getValue();
                SmallAssetQuoteData smallAssetQuoteDataCopydefault = value != null ? value.copydefault() : null;
                if (!C33129mqd.gEmmrt(smallAssetQuoteDataCopydefault != null ? smallAssetQuoteDataCopydefault.getTotalExpectedAmountOutUsd() : null, smallAssetQuoteDataCopydefault != null ? smallAssetQuoteDataCopydefault.getEstimatedGasFeeUsd() : null)) {
                    this.copydefault.EZpvd();
                    return;
                }
                fUM fum = new fUM();
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                fum.show(childFragmentManager);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ fUF KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fUF fuf) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = fuf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.copydefault();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ fUF KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fUF fuf) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = fuf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.KWHzl();
            }
        }
    }

    public final void EZpvd() {
        C52794wYp c52794wYpCopydefault;
        wYF wyf = this.KWHzl;
        if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.OLrzqt(0L);
        }
        gEmmrt().uzCIH();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new OrderConfirmBottomSheet$createOrder$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.AEQbTJ) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.overridePendingTransition(0, 0);
            }
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            ActivityC17837fUc.StateListAnimator stateListAnimator = ActivityC17837fUc.Companion;
            FragmentActivity activity3 = getActivity();
            if (activity3 == null) {
                return;
            }
            stateListAnimator.AEQbTJ(activity3, false);
        }
    }

    @Override // o.wXX, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        android.view.Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
        }
        return dialogOnCreateDialog;
    }

    public final void KWHzl() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.createView));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C13754dXa.FragmentManager.requestWindowFeature));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), new View.OnClickListener() { // from class: o.fUD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fUF.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault() {
        java.lang.String string;
        java.lang.String originalServiceFeeRate;
        SmallAssetQuoteData smallAssetQuoteDataCopydefault;
        java.lang.String discountedServiceFeeRate;
        SmallAssetQuoteData smallAssetQuoteDataCopydefault2;
        android.content.Context context = getContext();
        if (context == null || (string = context.getString(C13754dXa.FragmentManager.jFiva)) == null) {
            string = "";
        }
        AbstractC43419rot<SmallAssetQuoteData, OKServerException> value = gEmmrt().values().getValue();
        java.lang.String str = "--";
        if (value == null || (smallAssetQuoteDataCopydefault2 = value.copydefault()) == null || (originalServiceFeeRate = smallAssetQuoteDataCopydefault2.getOriginalServiceFeeRate()) == null) {
            originalServiceFeeRate = "--";
        }
        AbstractC43419rot<SmallAssetQuoteData, OKServerException> value2 = gEmmrt().values().getValue();
        if (value2 != null && (smallAssetQuoteDataCopydefault = value2.copydefault()) != null && (discountedServiceFeeRate = smallAssetQuoteDataCopydefault.getDiscountedServiceFeeRate()) != null) {
            str = discountedServiceFeeRate;
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.removeActivityDelegate));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.copydefault(this, C13754dXa.FragmentManager.IYdWPz, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("pct", copydefault(originalServiceFeeRate, str, true, false)), C56390yDp.OLrzqt("article", string))));
        java.lang.String string2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) string2, string, 0, false, 6, (java.lang.Object) null);
        spannableStringBuilder.setSpan(new LoaderManager(viewOnClickListenerC54939xaY), iLastIndexOf$default, string.length() + iLastIndexOf$default, 17);
        viewOnClickListenerC54939xaY.EZpvd(spannableStringBuilder);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DarRvM), new View.OnClickListener() { // from class: o.fUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fUF.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final class LoaderManager extends android.text.style.ClickableSpan {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            fUF.this.OLrzqt(this.copydefault.getContext().getString(C13754dXa.FragmentManager.hasWindowFeature));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(ContextCompat.getColor(this.copydefault.getContext(), C52761wXj.Activity.fdOvFl));
        }
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final java.lang.CharSequence copydefault(java.lang.String str, java.lang.String str2, boolean z, boolean z2) {
        boolean zEZpvd = EZpvd(str, str2);
        java.lang.Double dValueOf = java.lang.Double.valueOf(100.0d);
        if (zEZpvd) {
            double dAEQbTJ = C33129mqd.AEQbTJ(str);
            C38307pTy.Application application = C38307pTy.Companion;
            java.lang.String iCUPercent$default = pTB.formatICUPercent$default(java.lang.Double.valueOf(dAEQbTJ), null, application.AEQbTJ(2), null, dValueOf, null, 21, null);
            double dAEQbTJ2 = C33129mqd.AEQbTJ(str2);
            return EZpvd(iCUPercent$default, pTB.formatICUPercent$default(java.lang.Double.valueOf(dAEQbTJ2), null, application.AEQbTJ(2), null, dValueOf, null, 21, null), z, z2);
        }
        double dAEQbTJ3 = C33129mqd.AEQbTJ(str);
        return pTB.formatICUPercent$default(java.lang.Double.valueOf(dAEQbTJ3), null, C38307pTy.Companion.AEQbTJ(2), null, dValueOf, null, 21, null);
    }

    public final boolean EZpvd(java.lang.String str, java.lang.String str2) {
        return str2.length() > 0 && C33129mqd.AEQbTJ(str2) > AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.AEQbTJ(str2) != C33129mqd.AEQbTJ(str);
    }

    public final java.lang.CharSequence EZpvd(java.lang.String str, java.lang.String str2, boolean z, final boolean z2) {
        java.lang.String str3;
        if (z) {
            str3 = "(" + str + ")";
        } else {
            str3 = str;
        }
        return C33061mpO.setupSpanStyles$default(str2 + " " + str3, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.fUL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fUF.EZpvd(z2, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ boolean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity(boolean z) {
            this.EZpvd = z;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            int iOLrzqt;
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            textPaint.setStrikeThruText(true);
            if (this.EZpvd) {
                iOLrzqt = C33070mpX.OLrzqt(C52761wXj.Activity.UlJrfe, C43246rlf.OLrzqt.valueOf());
            } else {
                iOLrzqt = C33070mpX.OLrzqt(C52761wXj.Activity.fdOvFl, C43246rlf.OLrzqt.valueOf());
            }
            textPaint.setColor(iOLrzqt);
        }
    }

    public static final Unit EZpvd(boolean z, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new Activity(z));
        return Unit.INSTANCE;
    }

    @Override // o.fUG
    public void OLrzqt() {
        EZpvd();
    }

    @Override // o.fUG
    public void AEQbTJ() {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        android.content.Context context;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) || (context = getContext()) == null) {
            return;
        }
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
    }
}
