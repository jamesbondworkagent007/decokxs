package o;

import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.tradingbot.impl.order.strategy.recurring.phase.RecurringSelectCoinFragment$extraOnItemSelect$1;
import com.okinc.tradingbot.impl.order.strategy.recurring.phase.RecurringSelectCoinFragment$resetData$1;
import com.okinc.unify_trade.bot.data.SelectCoinData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vTV extends C53565wnr {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public vTS EZpvd;
    public wYF copydefault;
    public java.util.ArrayList<SelectCoinData> AYXKKw = new java.util.ArrayList<>();
    public java.lang.String OLrzqt = "";
    public java.lang.String AEQbTJ = "Recurring_main_page";
    public Function1<? super java.util.ArrayList<SelectCoinData>, Unit> AhwBna = new Function1() { // from class: o.vTT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return vTV.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
        }
    };

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vTV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C53565wnr AEQbTJ(int i, int i2, @NotNull java.util.ArrayList<SelectCoinData> arrayList, @NotNull java.util.ArrayList<SelectCoinData> arrayList2, @NotNull java.lang.String str, @NotNull java.lang.String str2, vTS vts) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            vTV vtv = new vTV();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("select_coin_list", arrayList2);
            bundle.putParcelableArrayList("coin_list", arrayList);
            bundle.putInt("select_min", i);
            bundle.putInt("select_max", i2);
            bundle.putString("default_symbol_key", str);
            bundle.putString("from", str2);
            vtv.setArguments(bundle);
            vtv.EZpvd = vts;
            return vtv;
        }
    }

    public static final Unit AEQbTJ(vTV vtv, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (arrayList.size() == 1) {
            ((SelectCoinData) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).setRatio("100");
            vTS vts = vtv.EZpvd;
            if (vts != null) {
                vts.EZpvd(arrayList);
            }
        } else {
            vTS vts2 = vtv.EZpvd;
            if (vts2 != null) {
                vts2.KWHzl(arrayList);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.C53565wnr, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && (string2 = arguments.getString("default_symbol_key")) != null) {
            str = string2;
        }
        this.OLrzqt = str;
        android.os.Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString("from")) == null) {
            string = "Recurring_main_page";
        }
        this.AEQbTJ = string;
        java.util.ArrayList<SelectCoinData> arrayList = this.AYXKKw;
        java.util.ArrayList<SelectCoinData> arrayListValueOf = valueOf();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListValueOf, 10));
        for (SelectCoinData selectCoinData : arrayListValueOf) {
            arrayList2.add(selectCoinData.copy((8191 & 1) != 0 ? selectCoinData.icon : null, (8191 & 2) != 0 ? selectCoinData.name : null, (8191 & 4) != 0 ? selectCoinData.ratio : null, (8191 & 8) != 0 ? selectCoinData.isSelected : false, (8191 & 16) != 0 ? selectCoinData.isShow : false, (8191 & 32) != 0 ? selectCoinData.isSearchVisible : false, (8191 & 64) != 0 ? selectCoinData.instId : null, (8191 & 128) != 0 ? selectCoinData.minPrice : null, (8191 & 256) != 0 ? selectCoinData.maxPrice : null, (8191 & 512) != 0 ? selectCoinData.primary : null, (8191 & 1024) != 0 ? selectCoinData.primarySimilarity : AudioStats.AUDIO_AMPLITUDE_NONE, (8191 & 2048) != 0 ? selectCoinData.secondary : null, (8191 & 4096) != 0 ? selectCoinData.secondarySimilarity : AudioStats.AUDIO_AMPLITUDE_NONE));
        }
        arrayList.addAll(arrayList2);
        AhwBna().OLrzqt.setText(C33069mpW.copydefault(C48033uCm.Fragment.pauseLocationServices, C56424yEw.gEmmrt(C56390yDp.OLrzqt("minAmount", C33129mqd.gEmmrt(java.lang.Integer.valueOf(DbNXlk()))), C56390yDp.OLrzqt("maxAmount", C33129mqd.gEmmrt(java.lang.Integer.valueOf(isConnected()))))));
        KWHzl(this.AhwBna);
    }

    @Override // o.C53565wnr, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.copydefault = wyf;
        wyf.setType(14);
        wyf.setPrimaryText(C33069mpW.copydefault(C48033uCm.Fragment.dPnHjp, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(valueOf().size()))))));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.SFHvfS));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setEnabled(false);
        }
    }

    @Override // o.C53565wnr
    public void AEQbTJ() {
        vTS vts;
        if (!Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "Recurring_ratio_page") || (vts = this.EZpvd) == null) {
            return;
        }
        vts.KWHzl(this.AYXKKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new RecurringSelectCoinFragment$resetData$1(this, null), 2, null);
    }

    @Override // o.C53565wnr
    public boolean OLrzqt(@NotNull SelectCoinData selectCoinData) {
        C52794wYp c52794wYpAEQbTJ;
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpAEQbTJ2;
        Intrinsics.checkNotNullParameter(selectCoinData, "");
        if (selectCoinData.isSelected()) {
            if (djBIcL() <= DbNXlk()) {
                AhwBna().OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DPhTBN));
                wYF wyf = this.copydefault;
                if (wyf != null && (c52794wYpAEQbTJ2 = wyf.AEQbTJ()) != null) {
                    c52794wYpAEQbTJ2.setEnabled(true);
                }
                return false;
            }
        } else if (djBIcL() >= isConnected()) {
            AhwBna().OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DPhTBN));
            return true;
        }
        AhwBna().OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.aappFQ));
        wYF wyf2 = this.copydefault;
        if (wyf2 != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
            c52794wYpCopydefault.setEnabled(true);
        }
        wYF wyf3 = this.copydefault;
        if (wyf3 != null && (c52794wYpAEQbTJ = wyf3.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setEnabled(true);
        }
        return false;
    }

    @Override // o.C53565wnr
    public void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new RecurringSelectCoinFragment$extraOnItemSelect$1(this, null), 2, null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vTV AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vTV vtv) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = vtv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.fetchVPNInfo();
            }
        }
    }

    @Override // o.C53565wnr
    public boolean OLrzqt() {
        java.util.ArrayList<SelectCoinData> arrayListGEmmrt = gEmmrt();
        if (!(arrayListGEmmrt instanceof java.util.Collection) || !arrayListGEmmrt.isEmpty()) {
            java.util.Iterator<T> it = arrayListGEmmrt.iterator();
            while (it.hasNext()) {
                if (((SelectCoinData) it.next()).isSelected()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.C53565wnr, o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        this.AhwBna = null;
        this.EZpvd = null;
    }
}
