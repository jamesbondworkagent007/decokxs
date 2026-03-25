package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.tee.converter.ui.fragment.SlippageBottomSheet$onFooterCreated$1$2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C38307pTy;
import o.fUX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUP extends wXX {
    public boolean AEQbTJ;
    public C17036evH EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    public fUP() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fUX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.SlippageBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.SlippageBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.fragment.SlippageBottomSheet$special$$inlined$activityViewModels$default$3
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
    public final fUX AEQbTJ() {
        return (fUX) this.KWHzl.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(8);
        wxq.EZpvd().setVisibility(0);
        android.widget.ImageView imageViewEZpvd = wxq.EZpvd();
        imageViewEZpvd.setOnClickListener(new Activity(imageViewEZpvd, 1000L, this));
        wxq.KWHzl().setVisibility(8);
        wxq.setStyle(6);
        wxq.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.drbYRJ));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C17036evH c17036evHOLrzqt = C17036evH.OLrzqt(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
        this.EZpvd = c17036evHOLrzqt;
        C17036evH c17036evH = null;
        if (c17036evHOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c17036evHOLrzqt = null;
        }
        wYS wys = c17036evHOLrzqt.AEQbTJ;
        fUX.Application application = fUX.Companion;
        double dAEQbTJ = C33129mqd.AEQbTJ(application.EZpvd().get(0));
        C38307pTy.Application application2 = C38307pTy.Companion;
        wys.setText(pTB.formatICUPercent$default(java.lang.Double.valueOf(dAEQbTJ), null, application2.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 21, null));
        C17036evH c17036evH2 = this.EZpvd;
        if (c17036evH2 == null) {
            Intrinsics.gEmmrt("");
            c17036evH2 = null;
        }
        c17036evH2.OLrzqt.setText(pTB.formatICUPercent$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(application.EZpvd().get(1))), null, application2.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 21, null));
        C17036evH c17036evH3 = this.EZpvd;
        if (c17036evH3 == null) {
            Intrinsics.gEmmrt("");
            c17036evH3 = null;
        }
        c17036evH3.EZpvd.setText(pTB.formatICUPercent$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(application.EZpvd().get(2))), null, application2.EZpvd(0), null, java.lang.Double.valueOf(100.0d), null, 21, null));
        C17036evH c17036evH4 = this.EZpvd;
        if (c17036evH4 == null) {
            Intrinsics.gEmmrt("");
            c17036evH4 = null;
        }
        wYS wys2 = c17036evH4.AEQbTJ;
        wys2.setOnClickListener(new ActionBar(wys2, 1000L, this));
        C17036evH c17036evH5 = this.EZpvd;
        if (c17036evH5 == null) {
            Intrinsics.gEmmrt("");
            c17036evH5 = null;
        }
        wYS wys3 = c17036evH5.OLrzqt;
        wys3.setOnClickListener(new StateListAnimator(wys3, 1000L, this));
        C17036evH c17036evH6 = this.EZpvd;
        if (c17036evH6 == null) {
            Intrinsics.gEmmrt("");
            c17036evH6 = null;
        }
        wYS wys4 = c17036evH6.EZpvd;
        wys4.setOnClickListener(new Application(wys4, 1000L, this));
        int iIndexOf = application.EZpvd().indexOf(AEQbTJ().AkhnZx().getValue());
        if (iIndexOf == 0) {
            C17036evH c17036evH7 = this.EZpvd;
            if (c17036evH7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17036evH = c17036evH7;
            }
            c17036evH.AEQbTJ.callOnClick();
            return;
        }
        if (iIndexOf == 1) {
            C17036evH c17036evH8 = this.EZpvd;
            if (c17036evH8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c17036evH = c17036evH8;
            }
            c17036evH.OLrzqt.callOnClick();
            return;
        }
        if (iIndexOf != 2) {
            return;
        }
        C17036evH c17036evH9 = this.EZpvd;
        if (c17036evH9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c17036evH = c17036evH9;
        }
        c17036evH.EZpvd.callOnClick();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DXXBbs));
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this, c52794wYpCopydefault));
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SlippageBottomSheet$onFooterCreated$1$2(this, c52794wYpCopydefault, null), 3, null);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ fUP OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, fUP fup) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = fup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C17036evH c17036evH = this.OLrzqt.EZpvd;
                C17036evH c17036evH2 = null;
                if (c17036evH == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH = null;
                }
                c17036evH.AEQbTJ.setSelected(true);
                C17036evH c17036evH3 = this.OLrzqt.EZpvd;
                if (c17036evH3 == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH3 = null;
                }
                c17036evH3.OLrzqt.setSelected(false);
                C17036evH c17036evH4 = this.OLrzqt.EZpvd;
                if (c17036evH4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c17036evH2 = c17036evH4;
                }
                c17036evH2.EZpvd.setSelected(false);
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ fUP AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, fUP fup) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = fup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ fUP OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, fUP fup) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = fup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C17036evH c17036evH = this.OLrzqt.EZpvd;
                C17036evH c17036evH2 = null;
                if (c17036evH == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH = null;
                }
                c17036evH.AEQbTJ.setSelected(false);
                C17036evH c17036evH3 = this.OLrzqt.EZpvd;
                if (c17036evH3 == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH3 = null;
                }
                c17036evH3.OLrzqt.setSelected(false);
                C17036evH c17036evH4 = this.OLrzqt.EZpvd;
                if (c17036evH4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c17036evH2 = c17036evH4;
                }
                c17036evH2.EZpvd.setSelected(true);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ fUP OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, fUP fup) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = fup;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C17036evH c17036evH = this.OLrzqt.EZpvd;
                C17036evH c17036evH2 = null;
                if (c17036evH == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH = null;
                }
                c17036evH.AEQbTJ.setSelected(false);
                C17036evH c17036evH3 = this.OLrzqt.EZpvd;
                if (c17036evH3 == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH3 = null;
                }
                c17036evH3.OLrzqt.setSelected(true);
                C17036evH c17036evH4 = this.OLrzqt.EZpvd;
                if (c17036evH4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c17036evH2 = c17036evH4;
                }
                c17036evH2.EZpvd.setSelected(false);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ fUP EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C52794wYp copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fUP fup, C52794wYp c52794wYp) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = fup;
            this.copydefault = c52794wYp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C17036evH c17036evH = this.EZpvd.EZpvd;
                C17036evH c17036evH2 = null;
                if (c17036evH == null) {
                    Intrinsics.gEmmrt("");
                    c17036evH = null;
                }
                if (c17036evH.AEQbTJ.isSelected()) {
                    java.lang.String value = this.EZpvd.AEQbTJ().AkhnZx().getValue();
                    fUX.Application application = fUX.Companion;
                    if (!Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) application.EZpvd().get(0))) {
                        this.EZpvd.AEQbTJ = true;
                        this.EZpvd.AEQbTJ().OLrzqt(application.EZpvd().get(0));
                    } else {
                        this.EZpvd.dismissAllowingStateLoss();
                        return;
                    }
                } else {
                    C17036evH c17036evH3 = this.EZpvd.EZpvd;
                    if (c17036evH3 == null) {
                        Intrinsics.gEmmrt("");
                        c17036evH3 = null;
                    }
                    if (c17036evH3.OLrzqt.isSelected()) {
                        java.lang.String value2 = this.EZpvd.AEQbTJ().AkhnZx().getValue();
                        fUX.Application application2 = fUX.Companion;
                        if (!Intrinsics.EZpvd((java.lang.Object) value2, (java.lang.Object) application2.EZpvd().get(1))) {
                            this.EZpvd.AEQbTJ = true;
                            this.EZpvd.AEQbTJ().OLrzqt(application2.EZpvd().get(1));
                        } else {
                            this.EZpvd.dismissAllowingStateLoss();
                            return;
                        }
                    } else {
                        C17036evH c17036evH4 = this.EZpvd.EZpvd;
                        if (c17036evH4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            c17036evH2 = c17036evH4;
                        }
                        if (c17036evH2.EZpvd.isSelected()) {
                            java.lang.String value3 = this.EZpvd.AEQbTJ().AkhnZx().getValue();
                            fUX.Application application3 = fUX.Companion;
                            if (!Intrinsics.EZpvd((java.lang.Object) value3, (java.lang.Object) application3.EZpvd().get(2))) {
                                this.EZpvd.AEQbTJ = true;
                                this.EZpvd.AEQbTJ().OLrzqt(application3.EZpvd().get(2));
                            } else {
                                this.EZpvd.dismissAllowingStateLoss();
                                return;
                            }
                        }
                    }
                }
                this.copydefault.OLrzqt(0L);
            }
        }
    }
}
