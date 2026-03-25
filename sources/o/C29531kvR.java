package o;

import android.graphics.Color;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.camera.video.AudioStats;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC29579kwM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kvR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29531kvR {

    /* JADX INFO: renamed from: o.kvR$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ InterfaceC29581kwO OLrzqt;
        public final /* synthetic */ SignalOverviewUiModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, InterfaceC29581kwO interfaceC29581kwO, SignalOverviewUiModel signalOverviewUiModel) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = interfaceC29581kwO;
            this.copydefault = signalOverviewUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC29581kwO interfaceC29581kwO = this.OLrzqt;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.StateListAnimator(this.copydefault.valueOf(), this.copydefault.values(), this.copydefault.OLrzqt().AEQbTJ()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kvR$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ SignalOverviewUiModel OLrzqt;
        public final /* synthetic */ InterfaceC29581kwO copydefault;
        public final /* synthetic */ long djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, SignalOverviewUiModel signalOverviewUiModel, boolean z, InterfaceC29581kwO interfaceC29581kwO, java.lang.String str) {
            this.AEQbTJ = view;
            this.djBIcL = j;
            this.OLrzqt = signalOverviewUiModel;
            this.EZpvd = z;
            this.copydefault = interfaceC29581kwO;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.djBIcL || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C29531kvR.KWHzl(this.copydefault, this.KWHzl, this.OLrzqt);
                if (this.EZpvd) {
                    C29408ktA.KWHzl.copydefault(this.OLrzqt.fetchVPNInfo(), "token_logo");
                } else {
                    C29408ktA.KWHzl.KWHzl(this.OLrzqt.fetchVPNInfo(), "token_logo");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kvR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ InterfaceC29581kwO AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ SignalOverviewUiModel OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, SignalOverviewUiModel signalOverviewUiModel, InterfaceC29581kwO interfaceC29581kwO, java.lang.String str) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = signalOverviewUiModel;
            this.AEQbTJ = interfaceC29581kwO;
            this.copydefault = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C29531kvR.KWHzl(this.AEQbTJ, this.copydefault, this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.kvR$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ SignalOverviewUiModel EZpvd;
        public final /* synthetic */ InterfaceC29581kwO KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, InterfaceC29581kwO interfaceC29581kwO, SignalOverviewUiModel signalOverviewUiModel) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = interfaceC29581kwO;
            this.EZpvd = signalOverviewUiModel;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC29581kwO interfaceC29581kwO = this.KWHzl;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Dialog(this.EZpvd.valueOf(), this.EZpvd.values()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kvR$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ SignalOverviewUiModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, android.content.Context context, SignalOverviewUiModel signalOverviewUiModel, boolean z) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = context;
            this.copydefault = signalOverviewUiModel;
            this.OLrzqt = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                hSW.copyAddress$default(C23274hvD.Fragment.playFromMediaId, this.AEQbTJ, this.copydefault.values(), null, null, 24, null);
                if (this.OLrzqt) {
                    C29408ktA.KWHzl.copydefault(this.copydefault.fetchVPNInfo(), "copy_address");
                } else {
                    C29408ktA.KWHzl.KWHzl(this.copydefault.fetchVPNInfo(), "copy_address");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.kvR$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ SignalUiModel EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ InterfaceC29581kwO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, InterfaceC29581kwO interfaceC29581kwO, SignalUiModel signalUiModel, boolean z) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = interfaceC29581kwO;
            this.EZpvd = signalUiModel;
            this.AEQbTJ = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC29581kwO interfaceC29581kwO = this.copydefault;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Fragment(this.EZpvd, this.AEQbTJ ? MemeQuickPopUpSource.MarketSignalOverviewDetail : MemeQuickPopUpSource.MarketSignalOverview));
                }
                if (this.AEQbTJ) {
                    C29408ktA.KWHzl.copydefault(this.EZpvd.fIwbmz(), "quick_trade");
                } else {
                    C29408ktA.KWHzl.KWHzl(this.EZpvd.fIwbmz(), "quick_trade");
                }
            }
        }
    }

    public static final void AEQbTJ(android.content.Context context, SignalOverviewUiModel signalOverviewUiModel, java.lang.String str, java.lang.String str2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawableEZpvd;
        double dAEQbTJ = ((C33129mqd.AEQbTJ(str) - C33129mqd.AEQbTJ(str2)) * ((double) 100)) / C33129mqd.AEQbTJ(str2);
        int i = dAEQbTJ >= AudioStats.AUDIO_AMPLITUDE_NONE ? C52761wXj.TaskDescription.fObYrO : C52761wXj.TaskDescription.ddhgMB;
        int iAEQbTJ = signalOverviewUiModel.AEQbTJ(str, str2, context);
        textView.setTextColor(iAEQbTJ);
        textView2.setTextColor(iAEQbTJ);
        textView2.setText(kLY.formatPercentage$default(C33129mqd.gEmmrt(java.lang.Double.valueOf(dAEQbTJ)), DisplaySign.ALWAYS, false, null, null, 14, null));
        imageView.setImageResource(i);
        imageView.setColorFilter(iAEQbTJ);
        if (dAEQbTJ >= AudioStats.AUDIO_AMPLITUDE_NONE) {
            drawableEZpvd = C33070mpX.EZpvd(C23274hvD.ActionBar.gGvvIC, context);
        } else {
            drawableEZpvd = C33070mpX.EZpvd(C23274hvD.ActionBar.flVtFt, context);
        }
        textView2.setBackground(drawableEZpvd);
    }

    public static final void OLrzqt(@NotNull C21600hFj c21600hFj, @NotNull SignalOverviewUiModel signalOverviewUiModel, InterfaceC29581kwO interfaceC29581kwO) {
        Intrinsics.checkNotNullParameter(c21600hFj, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        TimeIntervalSelector[] timeIntervalSelectorArrValues = TimeIntervalSelector.values();
        TimeIntervalSelector timeIntervalSelectorAEQbTJ = signalOverviewUiModel.OLrzqt().AEQbTJ();
        C55244xgL c55244xgL = c21600hFj.isConnected;
        c55244xgL.KWHzl();
        c55244xgL.fetchVPNInfo();
        for (TimeIntervalSelector timeIntervalSelector : timeIntervalSelectorArrValues) {
            TabLayout.Tab text = c55244xgL.values().setText(timeIntervalSelector.getStringRes());
            Intrinsics.checkNotNullExpressionValue(text, "");
            c55244xgL.AEQbTJ(text);
        }
        TabLayout.Tab tabKWHzl = c55244xgL.KWHzl(yDV.gEmmrt(timeIntervalSelectorArrValues, timeIntervalSelectorAEQbTJ));
        if (tabKWHzl != null) {
            tabKWHzl.select();
        }
        c55244xgL.copydefault(new StateListAnimator(timeIntervalSelectorArrValues, interfaceC29581kwO, signalOverviewUiModel));
        android.widget.ImageView imageView = c21600hFj.getNewProxyInstance;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, interfaceC29581kwO, signalOverviewUiModel));
    }

    /* JADX INFO: renamed from: o.kvR$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ TimeIntervalSelector[] AEQbTJ;
        public final /* synthetic */ SignalOverviewUiModel KWHzl;
        public final /* synthetic */ InterfaceC29581kwO OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(TimeIntervalSelector[] timeIntervalSelectorArr, InterfaceC29581kwO interfaceC29581kwO, SignalOverviewUiModel signalOverviewUiModel) {
            this.AEQbTJ = timeIntervalSelectorArr;
            this.OLrzqt = interfaceC29581kwO;
            this.KWHzl = signalOverviewUiModel;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            int position = tab.getPosition();
            TimeIntervalSelector[] timeIntervalSelectorArr = this.AEQbTJ;
            if (position < timeIntervalSelectorArr.length) {
                TimeIntervalSelector timeIntervalSelector = timeIntervalSelectorArr[position];
                InterfaceC29581kwO interfaceC29581kwO = this.OLrzqt;
                if (interfaceC29581kwO != null) {
                    interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.StateListAnimator(this.KWHzl.valueOf(), this.KWHzl.values(), timeIntervalSelector));
                }
                C29408ktA.KWHzl.EZpvd(this.KWHzl.fetchVPNInfo(), timeIntervalSelector.getEventTrackingValue());
            }
        }
    }

    public static final void copydefault(@NotNull C21600hFj c21600hFj, @NotNull android.content.Context context, @NotNull SignalOverviewUiModel signalOverviewUiModel) {
        Intrinsics.checkNotNullParameter(c21600hFj, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        java.util.List<SignalUiModel> listDjBIcL = signalOverviewUiModel.djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            BuySellMarker buySellMarkerCopydefault = BuySellMarker.Companion.copydefault(context, (SignalUiModel) it.next());
            if (buySellMarkerCopydefault != null) {
                arrayList.add(buySellMarkerCopydefault);
            }
        }
        c21600hFj.fJNWhG.KWHzl(signalOverviewUiModel.OLrzqt().EZpvd(), arrayList, signalOverviewUiModel.OLrzqt().AEQbTJ(), signalOverviewUiModel.gEmmrt().djBIcL());
    }

    public static final void AEQbTJ(@NotNull C21600hFj c21600hFj, @NotNull android.content.Context context, @NotNull SignalOverviewUiModel signalOverviewUiModel) {
        Intrinsics.checkNotNullParameter(c21600hFj, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        if (signalOverviewUiModel.OLrzqt().KWHzl()) {
            C55113xdn c55113xdn = c21600hFj.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            c55113xdn.setVisibility(0);
            android.widget.ImageView imageView = c21600hFj.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(4);
            C29665kxt c29665kxt = c21600hFj.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c29665kxt, "");
            c29665kxt.setVisibility(4);
            return;
        }
        C55113xdn c55113xdn2 = c21600hFj.getFieldNames;
        Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
        c55113xdn2.setVisibility(4);
        if (signalOverviewUiModel.OLrzqt().copydefault()) {
            android.widget.ImageView imageView2 = c21600hFj.getNewProxyInstance;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(0);
            C29665kxt c29665kxt2 = c21600hFj.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c29665kxt2, "");
            c29665kxt2.setVisibility(4);
            return;
        }
        android.widget.ImageView imageView3 = c21600hFj.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(imageView3, "");
        imageView3.setVisibility(4);
        C29665kxt c29665kxt3 = c21600hFj.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(c29665kxt3, "");
        c29665kxt3.setVisibility(0);
        java.util.List<SignalUiModel> listDjBIcL = signalOverviewUiModel.djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            BuySellMarker buySellMarkerCopydefault = BuySellMarker.Companion.copydefault(context, (SignalUiModel) it.next());
            if (buySellMarkerCopydefault != null) {
                arrayList.add(buySellMarkerCopydefault);
            }
        }
        C29665kxt.setData$default(c21600hFj.fJNWhG, signalOverviewUiModel.OLrzqt().EZpvd(), arrayList, signalOverviewUiModel.OLrzqt().AEQbTJ(), signalOverviewUiModel.gEmmrt().djBIcL(), null, 16, null);
    }

    public static final void KWHzl(InterfaceC29581kwO interfaceC29581kwO, java.lang.String str, SignalOverviewUiModel signalOverviewUiModel) {
        if (interfaceC29581kwO != null) {
            interfaceC29581kwO.AEQbTJ(new InterfaceC29579kwM.Application(null, 0, new TokenBase(signalOverviewUiModel.valueOf(), signalOverviewUiModel.values(), signalOverviewUiModel.isConnected(), signalOverviewUiModel.AkhnZx(), signalOverviewUiModel.AYXKKw(), signalOverviewUiModel.fetchVPNInfo(), signalOverviewUiModel.fetchVPNInfo(), 0, 0, 0, 0, null, "default_trade", null, null, null, null, 0, 0, false, null, null, false, false, str, null, null, 0, false, null, null, false, -16781568, null), "signal", 3, null));
        }
    }

    public static final void copydefault(@NotNull C21600hFj c21600hFj, @NotNull android.content.Context context, @NotNull SignalOverviewUiModel signalOverviewUiModel, InterfaceC29581kwO interfaceC29581kwO, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(c21600hFj, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.FrameLayout frameLayout = c21600hFj.sSMYrx;
        frameLayout.setOnClickListener(new Activity(frameLayout, 1000L, signalOverviewUiModel, z, interfaceC29581kwO, str));
        android.widget.TextView textView = c21600hFj.finit;
        textView.setOnClickListener(new Application(textView, 1000L, signalOverviewUiModel, interfaceC29581kwO, str));
        android.widget.ImageView imageView = c21600hFj.AuCTel;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C25386ivj.loadImageWithBorder$default(imageView, signalOverviewUiModel.isConnected(), null, 2, null);
        android.widget.ImageView imageView2 = c21600hFj.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        C25386ivj.KWHzl(imageView2, signalOverviewUiModel.AYXKKw(), new C25385ivi(C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), null, 0.0f, 0, 14, null));
        c21600hFj.finit.setText(signalOverviewUiModel.fetchVPNInfo());
        c21600hFj.RcXXUw.setText(C25352ivB.formatAddress$default(signalOverviewUiModel.values(), 4, 4, null, 4, null));
        c21600hFj.values.copydefault(signalOverviewUiModel.AhwBna());
        C29630kxK c29630kxK = c21600hFj.values;
        c29630kxK.setOnClickListener(new LoaderManager(c29630kxK, 1000L, interfaceC29581kwO, signalOverviewUiModel));
        AppCompatImageView appCompatImageView = c21600hFj.DbNXlk;
        appCompatImageView.setOnClickListener(new PendingIntent(appCompatImageView, 1000L, context, signalOverviewUiModel, z));
        java.lang.String strDbNXlk = signalOverviewUiModel.DbNXlk();
        if (strDbNXlk != null) {
            c21600hFj.dxcTrN.setText(C25322iuY.OLrzqt.EZpvd(strDbNXlk));
        }
        c21600hFj.dvKsVJ.setText(C23272hvB.getFormattedLocalCurrencyInICU$default(C23272hvB.KWHzl, signalOverviewUiModel.AEQbTJ(), null, null, false, 14, null));
        c21600hFj.djSkpj.setText(C23319hvw.getNumberICU$default(signalOverviewUiModel.KWHzl(), RoundingMode.HALF_DOWN, null, null, null, 14, null));
        c21600hFj.AhwBna.setCompoundDrawablePadding(C55298xhM.copydefault(8.0f, context));
        c21600hFj.AhwBna.setCompoundDrawablesWithIntrinsicBounds(C57406yhn.Activity.aKErDB, 0, 0, 0);
        c21600hFj.AhwBna.setOKDSType(257);
    }

    public static final void OLrzqt(@NotNull C21600hFj c21600hFj, @NotNull android.content.Context context, @NotNull SignalOverviewUiModel signalOverviewUiModel, InterfaceC29581kwO interfaceC29581kwO, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(c21600hFj, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        SignalUiModel signalUiModelGEmmrt = signalOverviewUiModel.gEmmrt();
        c21600hFj.giSNqX.setText(kLY.formatPercentage$default(signalOverviewUiModel.ejfBZ(), DisplaySign.AUTO, false, null, null, 14, null));
        java.lang.String strAEQbTJ = signalOverviewUiModel.AEQbTJ();
        java.lang.String strDbNXlk = signalUiModelGEmmrt.DbNXlk();
        android.widget.TextView textView = c21600hFj.dvKsVJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        android.widget.TextView textView2 = c21600hFj.fZBcTu;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        android.widget.ImageView imageView = c21600hFj.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        AEQbTJ(context, signalOverviewUiModel, strAEQbTJ, strDbNXlk, textView, textView2, imageView);
        java.lang.String strKWHzl = signalOverviewUiModel.KWHzl();
        java.lang.String strAhwBna = signalUiModelGEmmrt.AhwBna();
        android.widget.TextView textView3 = c21600hFj.djSkpj;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        android.widget.TextView textView4 = c21600hFj.aKErDB;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        android.widget.ImageView imageView2 = c21600hFj.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        AEQbTJ(context, signalOverviewUiModel, strKWHzl, strAhwBna, textView3, textView4, imageView2);
        int color = Color.parseColor(signalUiModelGEmmrt.ejfBZ() == TxType.BUY ? "#0D2508" : "#4D1E38");
        int iKWHzl = C25382ivf.KWHzl(context, C52761wXj.Activity.invokespecialaKhcqp);
        LinearLayoutCompat linearLayoutCompat = c21600hFj.hDKMBd;
        if (!C33492mxV.OLrzqt()) {
            color = iKWHzl;
        }
        linearLayoutCompat.setBackground(new C29530kvQ(color, iKWHzl, !z));
        C52794wYp c52794wYp = c21600hFj.AhwBna;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, interfaceC29581kwO, signalUiModelGEmmrt, z));
        if (z2) {
            c21600hFj.fJNWhG.AEQbTJ(signalUiModelGEmmrt.djBIcL());
        }
    }
}
