package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringCoinRatioPresenter;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vTU extends AbstractC49945uyC<AbstractC48409uQk, RecurringCoinRatioPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ = true;
    public vTS OLrzqt;

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.TarCU;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ AbstractC48409uQk copydefault(vTU vtu) {
        return vtu.values();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ vTU newInstance$default(Activity activity, java.lang.String str, java.lang.String str2, java.util.ArrayList arrayList, java.lang.String str3, vTS vts, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                str3 = "average_ratio";
            }
            return activity.AEQbTJ(str, str2, arrayList, str3, vts);
        }

        public final vTU AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.ArrayList<SelectCoinData> arrayList, @NotNull java.lang.String str3, @NotNull vTS vts) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(vts, "");
            vTU vtu = new vTU();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("select_coin_list", arrayList);
            bundle.putString("current_quote_key", str);
            bundle.putString("ratio_type_key", str3);
            bundle.putString("amount_key", str2);
            vtu.setArguments(bundle);
            vtu.OLrzqt = vts;
            return vtu;
        }
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

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21CallbackProxy));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Dialog(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.util.ArrayList<SelectCoinData> arrayList;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        RecurringCoinRatioPresenter recurringCoinRatioPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getParcelableArrayList("select_coin_list")) == null) {
            arrayList = new java.util.ArrayList<>();
        }
        recurringCoinRatioPresenterOLrzqt.copydefault(arrayList);
        RecurringCoinRatioPresenter recurringCoinRatioPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("current_quote_key")) == null) {
            string = "";
        }
        recurringCoinRatioPresenterOLrzqt2.AEQbTJ(string);
        RecurringCoinRatioPresenter recurringCoinRatioPresenterOLrzqt3 = OLrzqt();
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (string2 = arguments3.getString("ratio_type_key")) == null) {
            string2 = "average_ratio";
        }
        recurringCoinRatioPresenterOLrzqt3.EZpvd(string2);
        RecurringCoinRatioPresenter recurringCoinRatioPresenterOLrzqt4 = OLrzqt();
        android.os.Bundle arguments4 = getArguments();
        if (arguments4 == null || (string3 = arguments4.getString("amount_key")) == null) {
            string3 = "";
        }
        recurringCoinRatioPresenterOLrzqt4.copydefault(string3);
        values().copydefault.setArrowIconVisible(false);
        C55376xil c55376xil = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55376xil, "");
        c55376xil.setVisibility(C33129mqd.valueOf(java.lang.Integer.valueOf(OLrzqt().copydefault().size()), 1) ^ true ? 0 : 8);
        if (OLrzqt().AEQbTJ().length() == 0) {
            values().copydefault.setActiveContent("--");
        } else {
            values().copydefault.setActiveContent(xMR.copydefault.copydefault(OLrzqt().AEQbTJ()) + " " + OLrzqt().EZpvd());
        }
        copydefault();
        isConnected();
        values().OLrzqt.setSelectCoins(OLrzqt().copydefault());
        OLrzqt().AEQbTJ(OLrzqt().copydefault());
        C52794wYp c52794wYpAEQbTJ = values().EZpvd.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setEnabled(!OLrzqt().KWHzl());
        }
        values().EZpvd.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.dIjzlO));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void isConnected() {
        TradeLiveData<MinInvestResp> tradeLiveDataValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new LoaderManager(new Function1() { // from class: o.vTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vTU.EZpvd(this.EZpvd, (MinInvestResp) obj);
            }
        }));
    }

    public static final Unit EZpvd(vTU vtu, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        vtu.values().copydefault.setActiveContent(xMR.copydefault.copydefault(minInvestResp.getMinInvestment()));
        return Unit.INSTANCE;
    }

    public static final class TaskDescription implements InterfaceC50659vWp {
        public TaskDescription() {
        }

        @Override // o.InterfaceC50659vWp
        public void copydefault(boolean z) {
            C52794wYp c52794wYpCopydefault = vTU.copydefault(vTU.this).EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setTag(C48033uCm.Application.profile, java.lang.Boolean.valueOf(z));
            }
        }

        @Override // o.InterfaceC50659vWp
        public void KWHzl(java.util.ArrayList<SelectCoinData> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            vTU.this.OLrzqt().copydefault(arrayList);
            C52794wYp c52794wYpAEQbTJ = vTU.copydefault(vTU.this).EZpvd.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setEnabled(!vTU.this.OLrzqt().KWHzl());
            }
        }
    }

    private final void copydefault() {
        values().OLrzqt.setCallback(new TaskDescription());
        C52794wYp c52794wYpCopydefault = values().EZpvd.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = values().EZpvd.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, this));
        }
        C55376xil c55376xil = values().KWHzl;
        c55376xil.setOnClickListener(new StateListAnimator(c55376xil, 1000L, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt = null;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ vTU AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vTU vtu) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = vtu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                RecurringCoinRatioPresenter recurringCoinRatioPresenterOLrzqt = this.AEQbTJ.OLrzqt();
                java.util.ArrayList<SelectCoinData> arrayListOLrzqt = this.AEQbTJ.OLrzqt().OLrzqt();
                java.util.ArrayList<SelectCoinData> arrayList = new java.util.ArrayList<>(C56403yEb.AYXKKw(arrayListOLrzqt, 10));
                for (SelectCoinData selectCoinData : arrayListOLrzqt) {
                    arrayList.add(selectCoinData.copy((8191 & 1) != 0 ? selectCoinData.icon : null, (8191 & 2) != 0 ? selectCoinData.name : null, (8191 & 4) != 0 ? selectCoinData.ratio : null, (8191 & 8) != 0 ? selectCoinData.isSelected : false, (8191 & 16) != 0 ? selectCoinData.isShow : false, (8191 & 32) != 0 ? selectCoinData.isSearchVisible : false, (8191 & 64) != 0 ? selectCoinData.instId : null, (8191 & 128) != 0 ? selectCoinData.minPrice : null, (8191 & 256) != 0 ? selectCoinData.maxPrice : null, (8191 & 512) != 0 ? selectCoinData.primary : null, (8191 & 1024) != 0 ? selectCoinData.primarySimilarity : AudioStats.AUDIO_AMPLITUDE_NONE, (8191 & 2048) != 0 ? selectCoinData.secondary : null, (8191 & 4096) != 0 ? selectCoinData.secondarySimilarity : AudioStats.AUDIO_AMPLITUDE_NONE));
                }
                recurringCoinRatioPresenterOLrzqt.copydefault(arrayList);
                vTU.copydefault(this.AEQbTJ).OLrzqt.setOriginSelectCoins(this.AEQbTJ.OLrzqt().copydefault());
                C52794wYp c52794wYpAEQbTJ = vTU.copydefault(this.AEQbTJ).EZpvd.AEQbTJ();
                if (c52794wYpAEQbTJ != null) {
                    c52794wYpAEQbTJ.setEnabled(!this.AEQbTJ.OLrzqt().KWHzl());
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vTU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vTU vtu) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = vtu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C52794wYp c52794wYpCopydefault = vTU.copydefault(this.copydefault).EZpvd.copydefault();
                java.lang.Object tag = c52794wYpCopydefault != null ? c52794wYpCopydefault.getTag(C48033uCm.Application.profile) : null;
                Intrinsics.copydefault(tag, "");
                if (((java.lang.Boolean) tag).booleanValue()) {
                    vTS vts = this.copydefault.OLrzqt;
                    if (vts != null) {
                        vts.EZpvd(this.copydefault.OLrzqt().copydefault());
                    }
                    this.copydefault.dismiss();
                }
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ vTU KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, vTU vtu) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = vtu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismiss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ vTU AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vTU vtu) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = vtu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                vTS vts = this.AEQbTJ.OLrzqt;
                if (vts != null) {
                    vts.AEQbTJ(this.AEQbTJ.OLrzqt().copydefault());
                }
                this.AEQbTJ.dismiss();
            }
        }
    }
}
