package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAddOrderBottomSheet$initObservers$1;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAddOrderBottomSheet$initObservers$2;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAddOrderBottomSheet$initSeekBarDebounce$1;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaAddOrderPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.whT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53223whT extends AbstractC53220whQ<AbstractC48334uNq, SpotDcaAddOrderPresenter> {
    public wYF AYXKKw;
    public Function2<? super java.lang.String, ? super java.lang.Integer, Unit> AkhnZx;
    public Job isConnected;
    public static final Activity Companion = new Activity(null);
    public static final int AhwBna = 8;
    public final boolean valueOf = true;
    public final int values = C48033uCm.Activity.RcXXUw;
    public final MutableSharedFlow<java.lang.Float> gEmmrt = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (o.uNq) (wrap:Binding:0x0000: INVOKE (r0v0 o.whT) VIRTUAL call: o.uyC.values():androidx.databinding.ViewDataBinding A[MD:():Binding extends androidx.databinding.ViewDataBinding (m), WRAPPED] (LINE:39)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48334uNq copydefault(C53223whT c53223whT) {
        return (AbstractC48334uNq) c53223whT.values();
    }

    /* JADX INFO: renamed from: o.whT$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.whT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.whT$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void newInstance$default(Activity activity, androidx.fragment.app.FragmentManager fragmentManager, TacticsData tacticsData, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                function2 = null;
            }
            activity.KWHzl(fragmentManager, tacticsData, function2);
        }

        public final void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TacticsData tacticsData, Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C53223whT c53223whT = new C53223whT();
            c53223whT.AkhnZx = function2;
            c53223whT.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("tactics_data", tacticsData)));
            c53223whT.show(fragmentManager, C53223whT.class.getSimpleName());
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setVisibility(0);
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
        wxq.setTitle(C33070mpX.OLrzqt(C55688xof.Application.MediaBrowserCompatSubscriptionCallback, wxq.getContext()));
        wxq.AYXKKw().setTextSize(16.0f);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AYXKKw = wyf;
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getFieldNames();
        fARcdN();
        ((SpotDcaAddOrderPresenter) OLrzqt()).copydefault(SpotDcaAddOrderPresenter.Activity.LoaderManager.AEQbTJ);
    }

    public final void fARcdN() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SpotDcaAddOrderBottomSheet$initObservers$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new SpotDcaAddOrderBottomSheet$initObservers$2(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        C55320xhi c55320xhiKWHzl;
        final AbstractC48334uNq abstractC48334uNq = (AbstractC48334uNq) values();
        OKReminder oKReminder = abstractC48334uNq.OLrzqt;
        oKReminder.setStyle(0);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.spnCvw);
        Intrinsics.copydefault(strAYXKKw, "");
        oKReminder.setMessage((java.lang.CharSequence) strAYXKKw);
        oKReminder.setCloseIconVisibility(false);
        C47988uAv c47988uAv = abstractC48334uNq.KWHzl;
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.whS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53223whT.KWHzl(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv.setOnFocusChangeCallback(new Function2() { // from class: o.whR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53223whT.EZpvd(this.KWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C47988uAv c47988uAv2 = abstractC48334uNq.copydefault;
        c47988uAv2.setOnTextChangeCallback(new Function2() { // from class: o.whP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53223whT.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.whW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53223whT.KWHzl(this.OLrzqt, ((java.lang.Float) obj).floatValue());
            }
        });
        fJNWhG();
        C54984xbQ c54984xbQ = abstractC48334uNq.EZpvd;
        c54984xbQ.setOnClickListener(new TaskDescription(c54984xbQ, 1000L, abstractC48334uNq, this));
        C55312xha c55312xhaValueOf = abstractC48334uNq.AhwBna.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setOnClickListener(new Application(c55320xhiKWHzl, 1000L, this));
        }
        abstractC48334uNq.EZpvd.post(new java.lang.Runnable() { // from class: o.whY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C53223whT.copydefault(abstractC48334uNq);
            }
        });
    }

    /* JADX INFO: renamed from: o.whT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C53223whT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53223whT c53223whT) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c53223whT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentActivity activity = this.copydefault.getActivity();
                if (activity != null) {
                    C33054mpH.OLrzqt(activity, this.copydefault.getView());
                }
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.whT$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53223whT EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53223whT c53223whT) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c53223whT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.fIwbmz();
            }
        }
    }

    /* JADX INFO: renamed from: o.whT$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C53223whT KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53223whT c53223whT) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c53223whT;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ((SpotDcaAddOrderPresenter) this.KWHzl.OLrzqt()).copydefault(SpotDcaAddOrderPresenter.Activity.StateListAnimator.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.whT$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AbstractC48334uNq OLrzqt;
        public final /* synthetic */ C53223whT copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC48334uNq abstractC48334uNq, C53223whT c53223whT) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = abstractC48334uNq;
            this.copydefault = c53223whT;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C47988uAv.setInputContent$default(this.OLrzqt.KWHzl, null, false, false, 6, null);
                this.OLrzqt.KWHzl.clearFocus();
                ((SpotDcaAddOrderPresenter) this.copydefault.OLrzqt()).copydefault(SpotDcaAddOrderPresenter.Activity.ActionBar.copydefault);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53223whT c53223whT, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null) {
            ((SpotDcaAddOrderPresenter) c53223whT.OLrzqt()).copydefault(new SpotDcaAddOrderPresenter.Activity.C0656Activity(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C53223whT c53223whT, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (z) {
            ((SpotDcaAddOrderPresenter) c53223whT.OLrzqt()).copydefault(SpotDcaAddOrderPresenter.Activity.PendingIntent.OLrzqt);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C53223whT c53223whT, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (str != null) {
            ((SpotDcaAddOrderPresenter) c53223whT.OLrzqt()).copydefault(new SpotDcaAddOrderPresenter.Activity.TaskDescription(str));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53223whT c53223whT, float f) {
        c53223whT.gEmmrt.tryEmit(java.lang.Float.valueOf(f));
        return Unit.INSTANCE;
    }

    public static final void copydefault(AbstractC48334uNq abstractC48334uNq) {
        C55001xbh c55001xbhDjBIcL = abstractC48334uNq.KWHzl.djBIcL();
        if (c55001xbhDjBIcL.getId() == -1) {
            c55001xbhDjBIcL.setId(android.view.View.generateViewId());
        }
        android.view.ViewParent parent = abstractC48334uNq.EZpvd.getParent();
        Intrinsics.copydefault(parent, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.connect(abstractC48334uNq.EZpvd.getId(), 4, c55001xbhDjBIcL.getId(), 4);
        constraintSet.applyTo(constraintLayout);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(SpotDcaAddOrderPresenter.Fragment fragment) {
        AbstractC48334uNq abstractC48334uNq = (AbstractC48334uNq) values();
        abstractC48334uNq.AYXKKw.setText(fragment.djBIcL());
        abstractC48334uNq.valueOf.setText(fragment.EZpvd());
        C54984xbQ.setSelectedStyle$default(abstractC48334uNq.EZpvd, fragment.isConnected(), 0, 2, null);
        C47988uAv c47988uAv = abstractC48334uNq.KWHzl;
        java.lang.String strOLrzqt = fragment.OLrzqt();
        if (fragment.isConnected()) {
            C47988uAv.setInputContent$default(c47988uAv, null, false, false, 6, null);
            c47988uAv.setInputHint(null);
        } else {
            c47988uAv.setInputHint(strOLrzqt);
        }
        c47988uAv.setFloatingHint(KWHzl(c47988uAv.values(), strOLrzqt));
        c47988uAv.setMaxDecimal(fragment.fetchVPNInfo());
        SpotDcaAddOrderPresenter.ActionBar.InterfaceC0653ActionBar interfaceC0653ActionBarGEmmrt = fragment.gEmmrt();
        if (interfaceC0653ActionBarGEmmrt != null) {
            c47988uAv.setInputErrorMsg(interfaceC0653ActionBarGEmmrt.KWHzl());
        } else {
            c47988uAv.copydefault();
        }
        C47988uAv c47988uAv2 = abstractC48334uNq.copydefault;
        java.lang.String strOLrzqt2 = OLrzqt(fragment.DbNXlk(), fragment.AkhnZx());
        c47988uAv2.setInputHint(strOLrzqt2);
        c47988uAv2.setFloatingHint(KWHzl(c47988uAv2.values(), strOLrzqt2));
        c47988uAv2.setMaxDecimal(fragment.fetchVPNInfo());
        c47988uAv2.setMaxValue(uLP.KWHzl(fragment.values()));
        SpotDcaAddOrderPresenter.ActionBar.Activity activityValueOf = fragment.valueOf();
        if (activityValueOf != null) {
            if (activityValueOf instanceof SpotDcaAddOrderPresenter.ActionBar.Activity.TaskDescription) {
                SpotDcaAddOrderPresenter.ActionBar.Activity.TaskDescription taskDescription = (SpotDcaAddOrderPresenter.ActionBar.Activity.TaskDescription) activityValueOf;
                c47988uAv2.setInputErrorMsg(C33069mpW.copydefault(taskDescription.OLrzqt(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", abstractC48334uNq.copydefault.values()), C56390yDp.OLrzqt("minValue", taskDescription.EZpvd()), C56390yDp.OLrzqt("unit", taskDescription.AEQbTJ()))));
            } else if (activityValueOf instanceof SpotDcaAddOrderPresenter.ActionBar.Activity.StateListAnimator) {
                SpotDcaAddOrderPresenter.ActionBar.Activity.StateListAnimator stateListAnimator = (SpotDcaAddOrderPresenter.ActionBar.Activity.StateListAnimator) activityValueOf;
                c47988uAv2.setInputErrorMsg(C33069mpW.copydefault(stateListAnimator.AEQbTJ(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", abstractC48334uNq.copydefault.values()), C56390yDp.OLrzqt("minValue", stateListAnimator.OLrzqt()), C56390yDp.OLrzqt("unit", stateListAnimator.EZpvd()))));
            } else {
                c47988uAv2.setInputErrorMsg(activityValueOf.KWHzl());
            }
        } else {
            c47988uAv2.copydefault();
        }
        if (fragment.KWHzl() != null) {
            android.widget.TextView textView = abstractC48334uNq.AEQbTJ;
            Intrinsics.copydefault(textView);
            textView.setVisibility(0);
            java.lang.String strKWHzl = fragment.KWHzl().KWHzl();
            textView.setText(strKWHzl != null ? strKWHzl : "");
        } else {
            android.widget.TextView textView2 = abstractC48334uNq.AEQbTJ;
            Intrinsics.copydefault(textView2);
            textView2.setVisibility(8);
            textView2.setText((java.lang.CharSequence) null);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
        }
        abstractC48334uNq.gEmmrt.setText(uLP.AEQbTJ(fragment.values()));
        AEQbTJ(fragment);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(SpotDcaAddOrderPresenter.Fragment fragment) {
        C52794wYp c52794wYpCopydefault;
        AbstractC48334uNq abstractC48334uNq = (AbstractC48334uNq) values();
        boolean z = true;
        if (fragment.isConnected()) {
            if (!abstractC48334uNq.copydefault.hDKMBd() || abstractC48334uNq.copydefault.getFieldNames()) {
                z = false;
            }
        } else {
            boolean z2 = abstractC48334uNq.copydefault.hDKMBd() && !abstractC48334uNq.copydefault.getFieldNames();
            boolean z3 = abstractC48334uNq.KWHzl.hDKMBd() && !abstractC48334uNq.KWHzl.getFieldNames();
            if (!z2 || !z3) {
            }
        }
        wYF wyf = this.AYXKKw;
        if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setEnabled(z);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        return "≥ " + str2 + " " + str;
    }

    private final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        return str + " (" + str2 + ")";
    }

    public final void fJNWhG() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.isConnected = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SpotDcaAddOrderBottomSheet$initSeekBarDebounce$1(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        SpotDcaAddOrderPresenter.Fragment value;
        android.content.Context context = getContext();
        if (context == null || (value = ((SpotDcaAddOrderPresenter) OLrzqt()).AYXKKw().getValue()) == null) {
            return;
        }
        C52653wTj.OLrzqt.OLrzqt(context, uLP.AEQbTJ(value.copydefault()), uLP.AEQbTJ(value.AEQbTJ()), value.DbNXlk());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((SpotDcaAddOrderPresenter) OLrzqt()).KWHzl();
        this.AYXKKw = null;
        Job job = this.isConnected;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.isConnected = null;
        super.onDestroyView();
    }
}
