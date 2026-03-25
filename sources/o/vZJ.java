package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SingleCoinSelectPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.vYG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vZJ extends AbstractC49945uyC<uVG, SingleCoinSelectPresenter> {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final int copydefault = C48033uCm.Activity.ExKek;
    public float KWHzl = 0.95f;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vZH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vZJ.isConnected();
        }
    });

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
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.KWHzl;
    }

    private final C43316rmw AuCTel() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vZJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(java.lang.String str, java.lang.String str2, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vZJ vzj = new vZJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(OtcExtraKeys.ORDER_ID, str);
            bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, str2);
            vzj.setArguments(bundle);
            vzj.show(fragmentManager, vZJ.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
        fIwbmz();
        fJNWhG();
        ejfBZ();
        OLrzqt().AEQbTJ();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.HJWChPfrwjPh));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    private final void fARcdN() {
        SingleCoinSelectPresenter singleCoinSelectPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        singleCoinSelectPresenterOLrzqt.AEQbTJ(arguments != null ? arguments.getString(OtcExtraKeys.ORDER_ID) : null);
        SingleCoinSelectPresenter singleCoinSelectPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        singleCoinSelectPresenterOLrzqt2.EZpvd(arguments2 != null ? arguments2.getString(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE) : null);
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
            bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        }
    }

    public static final class ActionBar implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            java.lang.String string;
            vZJ vzj = vZJ.this;
            SingleCoinSelectPresenter singleCoinSelectPresenterOLrzqt = vzj.OLrzqt();
            if (editable == null || (string = editable.toString()) == null) {
                string = "";
            }
            vzj.KWHzl(singleCoinSelectPresenterOLrzqt.copydefault(string));
        }
    }

    private final void fIwbmz() {
        C52794wYp c52794wYpCopydefault = values().KWHzl.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Activity(c52794wYpCopydefault, 1000L, this));
        }
        values().OLrzqt.EZpvd().addTextChangedListener(new ActionBar());
    }

    private final void fJNWhG() {
        values().AEQbTJ.setAdapter(AuCTel());
        values().AEQbTJ.setLayoutManager(new LinearLayoutManager(getContext()));
        AuCTel().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.vZO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vZJ.OLrzqt(this.EZpvd, (EmptyData) obj);
            }
        }));
        AuCTel().register(SelectCoinData.class, new vZZ(values().OLrzqt.EZpvd().getText().toString(), new Function1() { // from class: o.vZL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vZJ.AEQbTJ(this.OLrzqt, (SelectCoinData) obj);
            }
        }));
    }

    public static final Unit OLrzqt(vZJ vzj, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        vzj.OLrzqt().AEQbTJ();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vZJ vzj, SelectCoinData selectCoinData) {
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        vzj.OLrzqt().KWHzl(selectCoinData);
        vzj.AuCTel().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    private final void ejfBZ() {
        TradeLiveData<java.util.List<FetchMultiInstsResult>> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.vZI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vZJ.OLrzqt(this.AEQbTJ, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.vZK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vZJ.AEQbTJ(this.copydefault, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit OLrzqt(vZJ vzj, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vzj.KWHzl(vzj.OLrzqt().OLrzqt());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) vzj, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vZJ vzj, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        C43316rmw c43316rmwAuCTel = vzj.AuCTel();
        CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
        java.lang.String message = exc.getMessage();
        if (message == null) {
            message = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
        }
        C33064mpR.OLrzqt(c43316rmwAuCTel, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 0, false, null, null, false, 62, null));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) vzj, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(java.util.List<SelectCoinData> list) {
        C49952uyJ.updateDataOrNoResult$default(AuCTel(), list, C33070mpX.AYXKKw(C55688xof.Application.dXcUrg), 0, 4, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vZJ KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vZJ vzj) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = vzj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                vYG.Application application = vYG.Companion;
                DetailsData detailsDataEZpvd = this.KWHzl.OLrzqt().EZpvd();
                androidx.fragment.app.FragmentManager supportFragmentManager = this.KWHzl.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                application.copydefault(detailsDataEZpvd, supportFragmentManager);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vZJ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vZJ vzj) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = vzj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }
}
