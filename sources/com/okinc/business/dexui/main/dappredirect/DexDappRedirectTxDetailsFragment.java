package com.okinc.business.dexui.main.dappredirect;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.main.market.bean.DAppInfo;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC21692hIu;
import o.AbstractC22406hek;
import o.C21697hIz;
import o.C22380heK;
import o.C23274hvD;
import o.C23533hzy;
import o.C25352ivB;
import o.C25386ivj;
import o.C25448iws;
import o.C32113mPz;
import o.C33054mpH;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C43251rlk;
import o.C52794wYp;
import o.C55097xdX;
import o.C55296xhK;
import o.C56390yDp;
import o.C56424yEw;
import o.C57656ymY;
import o.InterfaceC23194htd;
import o.InterfaceC54828xWv;
import o.InterfaceC9738bbJ;
import o.hHT;
import o.rVN;
import o.wXQ;
import o.wYF;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexDappRedirectTxDetailsFragment extends AbstractC21692hIu {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public DAppRedirectFrom AEQbTJ;
    public int AYXKKw;
    public String AhwBna = "";
    public C23533hzy AkhnZx;
    public DAppInfo EZpvd;
    public List<DAppInfo> OLrzqt;
    public C21697hIz copydefault;
    public boolean djBIcL;
    public C21697hIz gEmmrt;

    @yCM
    public C25448iws handleEventTrackUtils;
    public boolean valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DAppRedirectFrom.values().length];
            try {
                iArr[DAppRedirectFrom.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DAppRedirectFrom.SWAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DAppRedirectFrom.BRIDGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DAppRedirectFrom.LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DAppRedirectFrom.MEME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DAppRedirectFrom.EASY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DAppRedirectFrom.QUICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            KWHzl = iArr;
        }
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public final C25448iws KWHzl() {
        C25448iws c25448iws = this.handleEventTrackUtils;
        if (c25448iws != null) {
            return c25448iws;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.dappredirect.DexDappRedirectTxDetailsFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final DexDappRedirectTxDetailsFragment EZpvd(List<DAppInfo> list, C21697hIz c21697hIz, C21697hIz c21697hIz2, @NotNull DAppRedirectFrom dAppRedirectFrom, @NotNull DAppInfo dAppInfo, @NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(dAppRedirectFrom, "");
            Intrinsics.checkNotNullParameter(dAppInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment = new DexDappRedirectTxDetailsFragment();
            dexDappRedirectTxDetailsFragment.OLrzqt = list;
            dexDappRedirectTxDetailsFragment.copydefault = c21697hIz;
            dexDappRedirectTxDetailsFragment.gEmmrt = c21697hIz2;
            dexDappRedirectTxDetailsFragment.AEQbTJ = dAppRedirectFrom;
            dexDappRedirectTxDetailsFragment.EZpvd = dAppInfo;
            dexDappRedirectTxDetailsFragment.AhwBna = str;
            dexDappRedirectTxDetailsFragment.AYXKKw = i;
            return dexDappRedirectTxDetailsFragment;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(2);
        wxq.EZpvd().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
        wxq.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatApi23));
        ImageView imageViewEZpvd = wxq.EZpvd();
        imageViewEZpvd.setOnClickListener(new StateListAnimator(imageViewEZpvd, 1000L, this));
        ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DAppRedirectFrom dAppRedirectFrom = this.AEQbTJ;
        DAppRedirectFrom dAppRedirectFrom2 = DAppRedirectFrom.MARKET;
        if (dAppRedirectFrom != dAppRedirectFrom2 || this.djBIcL || this.valueOf) {
            return;
        }
        DexDappRedirectListFragment.Activity.newInstance$default(DexDappRedirectListFragment.Companion, this.OLrzqt, this.copydefault, this.gEmmrt, dAppRedirectFrom2, null, null, null, this.AhwBna, null, 0, 0, 1904, null).show(getParentFragmentManager(), "javaClass");
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setContentDescription("web3_dex_dapp_token_info_confirm_button");
        }
        wyf.setType(6);
        wyf.setOKDSSize(52);
        if (this.AEQbTJ == DAppRedirectFrom.MARKET) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatItemCallbackItemCallbackApi23);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.addSubscription);
        }
        wyf.setPrimaryText(strAYXKKw);
        C25352ivB.setOnDoubleCheckClickListener$default(wyf, 0L, new Function1() { // from class: o.hIn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return DexDappRedirectTxDetailsFragment.KWHzl(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
    }

    public static final Unit KWHzl(DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (dexDappRedirectTxDetailsFragment.AEQbTJ == DAppRedirectFrom.MARKET) {
            C21697hIz c21697hIz = dexDappRedirectTxDetailsFragment.copydefault;
            String strKWHzl = c21697hIz != null ? c21697hIz.KWHzl() : null;
            dexDappRedirectTxDetailsFragment.copydefault(strKWHzl != null ? strKWHzl : "");
        }
        dexDappRedirectTxDetailsFragment.OLrzqt(EventPageNameType.GO_DAPP_CONFIRMATION.getPageName());
        dexDappRedirectTxDetailsFragment.AhwBna();
        dexDappRedirectTxDetailsFragment.KWHzl(TrackButtonName.GO_TO_DAPP.getButtonName());
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        String strDbNXlk;
        if (this.AEQbTJ == DAppRedirectFrom.MARKET) {
            hHT hht = hHT.KWHzl;
            DAppInfo dAppInfo = this.EZpvd;
            if (dAppInfo == null) {
                Intrinsics.gEmmrt("");
                dAppInfo = null;
            }
            String dappName = dAppInfo.getDappName();
            DAppInfo dAppInfo2 = this.EZpvd;
            if (dAppInfo2 == null) {
                Intrinsics.gEmmrt("");
                dAppInfo2 = null;
            }
            String projectId = dAppInfo2.getProjectId();
            C21697hIz c21697hIz = this.copydefault;
            String strKWHzl = c21697hIz != null ? c21697hIz.KWHzl() : null;
            String str = strKWHzl == null ? "" : strKWHzl;
            C21697hIz c21697hIz2 = this.copydefault;
            String strAYXKKw = c21697hIz2 != null ? c21697hIz2.AYXKKw() : null;
            String str2 = strAYXKKw == null ? "" : strAYXKKw;
            C21697hIz c21697hIz3 = this.copydefault;
            String strAEQbTJ = c21697hIz3 != null ? c21697hIz3.AEQbTJ() : null;
            String str3 = strAEQbTJ == null ? "" : strAEQbTJ;
            C21697hIz c21697hIz4 = this.copydefault;
            String strEZpvd = c21697hIz4 != null ? c21697hIz4.EZpvd() : null;
            hht.AEQbTJ(dappName, projectId, str, str2, str3, strEZpvd == null ? "" : strEZpvd);
            this.djBIcL = true;
            dismissAllowingStateLoss();
        } else {
            hHT hht2 = hHT.KWHzl;
            DAppInfo dAppInfo3 = this.EZpvd;
            if (dAppInfo3 == null) {
                Intrinsics.gEmmrt("");
                dAppInfo3 = null;
            }
            String dappName2 = dAppInfo3.getDappName();
            DAppInfo dAppInfo4 = this.EZpvd;
            if (dAppInfo4 == null) {
                Intrinsics.gEmmrt("");
                dAppInfo4 = null;
            }
            hht2.AEQbTJ(dappName2, dAppInfo4.getProjectId());
        }
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.AhwBna).fARcdN().valueOf();
        InterfaceC54828xWv interfaceC54828xWv = (InterfaceC54828xWv) C43251rlk.copydefault(InterfaceC54828xWv.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        DAppInfo dAppInfo5 = this.EZpvd;
        if (dAppInfo5 == null) {
            Intrinsics.gEmmrt("");
            dAppInfo5 = null;
        }
        String dappSwapUrl = dAppInfo5.getDappSwapUrl();
        String str4 = (interfaceC9738bbJValueOf == null || (strDbNXlk = interfaceC9738bbJValueOf.DbNXlk()) == null) ? "" : strDbNXlk;
        C21697hIz c21697hIz5 = this.copydefault;
        InterfaceC54828xWv.ActionBar.enterDAppWebView$default(interfaceC54828xWv, fragmentActivityRequireActivity, dappSwapUrl, str4, Long.valueOf(C33129mqd.valueOf(c21697hIz5 != null ? c21697hIz5.AEQbTJ() : null)), new Function0() { // from class: o.hIm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexDappRedirectTxDetailsFragment.AEQbTJ();
            }
        }, null, null, "dex", 96, null);
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AkhnZx = C23533hzy.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        gEmmrt();
        OLrzqt(EventPageNameType.TOKEN_INFO.getPageName());
        constraintLayout.post(new Runnable() { // from class: o.hIe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                DexDappRedirectTxDetailsFragment.EZpvd(this.KWHzl);
            }
        });
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ C21697hIz EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ DexDappRedirectTxDetailsFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment, C21697hIz c21697hIz) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = dexDappRedirectTxDetailsFragment;
            this.EZpvd = c21697hIz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.copydefault(this.EZpvd.KWHzl());
                this.copydefault.KWHzl(TrackButtonName.COPY_FROM_TOKEN.getButtonName());
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ DexDappRedirectTxDetailsFragment AEQbTJ;
        public final /* synthetic */ C21697hIz EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment, C21697hIz c21697hIz) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = dexDappRedirectTxDetailsFragment;
            this.EZpvd = c21697hIz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.copydefault(this.EZpvd.KWHzl());
                this.AEQbTJ.KWHzl(TrackButtonName.COPY_TO_TOKEN.getButtonName());
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ DexDappRedirectTxDetailsFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = dexDappRedirectTxDetailsFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
                this.copydefault.KWHzl(TrackButtonName.BACK.getButtonName());
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ DexDappRedirectTxDetailsFragment AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = dexDappRedirectTxDetailsFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.valueOf = true;
                this.AEQbTJ.dismissAllowingStateLoss();
                this.AEQbTJ.KWHzl(TrackButtonName.CLOSE.getButtonName());
            }
        }
    }

    public static final void EZpvd(DexDappRedirectTxDetailsFragment dexDappRedirectTxDetailsFragment) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) dexDappRedirectTxDetailsFragment, true, (String) null, 2, (Object) null);
    }

    private final void gEmmrt() {
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        DAppRedirectFrom dAppRedirectFrom = this.AEQbTJ;
        if (dAppRedirectFrom != null) {
            switch (ActionBar.KWHzl[dAppRedirectFrom.ordinal()]) {
                case 1:
                    EZpvd();
                    C21697hIz c21697hIz = this.copydefault;
                    if (c21697hIz != null) {
                        AEQbTJ(c21697hIz);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    C21697hIz c21697hIz2 = this.copydefault;
                    if (c21697hIz2 != null) {
                        AEQbTJ(c21697hIz2);
                    }
                    C21697hIz c21697hIz3 = this.gEmmrt;
                    if (c21697hIz3 != null) {
                        C23533hzy c23533hzy = this.AkhnZx;
                        if (c23533hzy != null && (textView5 = c23533hzy.DbNXlk) != null) {
                            textView5.setText(c21697hIz3.AYXKKw());
                        }
                        C23533hzy c23533hzy2 = this.AkhnZx;
                        if (c23533hzy2 != null && (textView4 = c23533hzy2.gEmmrt) != null) {
                            textView4.setVisibility(c21697hIz3.djBIcL() ? 8 : 0);
                        }
                        C23533hzy c23533hzy3 = this.AkhnZx;
                        if (c23533hzy3 != null && (textView3 = c23533hzy3.gEmmrt) != null) {
                            textView3.setText(c21697hIz3.KWHzl());
                        }
                        C23533hzy c23533hzy4 = this.AkhnZx;
                        if (c23533hzy4 != null && (textView2 = c23533hzy4.copydefault) != null) {
                            textView2.setText(c21697hIz3.EZpvd());
                        }
                        C23533hzy c23533hzy5 = this.AkhnZx;
                        if (c23533hzy5 != null && (imageView2 = c23533hzy5.isConnected) != null) {
                            C25386ivj.loadImageWithBorder$default(imageView2, c21697hIz3.gEmmrt(), null, 2, null);
                        }
                        C23533hzy c23533hzy6 = this.AkhnZx;
                        if (c23533hzy6 != null && (imageView = c23533hzy6.EZpvd) != null) {
                            C33054mpH.AEQbTJ(imageView, c21697hIz3.OLrzqt());
                        }
                        C23533hzy c23533hzy7 = this.AkhnZx;
                        if (c23533hzy7 == null || (textView = c23533hzy7.gEmmrt) == null) {
                            return;
                        }
                        textView.setOnClickListener(new Fragment(textView, 1000L, this, c21697hIz3));
                        return;
                    }
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(String str) {
        C25448iws c25448iwsKWHzl = KWHzl();
        String pageName = EventPageNameType.TOKEN_INFO.getPageName();
        C21697hIz c21697hIz = this.copydefault;
        String strAEQbTJ = c21697hIz != null ? c21697hIz.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        String str2 = strAEQbTJ;
        hHT hht = hHT.KWHzl;
        c25448iwsKWHzl.AEQbTJ(new AbstractC22406hek.TaskDescription(str2, pageName, hht.AEQbTJ(this.AEQbTJ), hht.AEQbTJ(this.AEQbTJ, this.AYXKKw), TrackOrderType.SWAP.getType(), hht.EZpvd(this.copydefault, this.gEmmrt), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.OTHERS.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str), C56390yDp.OLrzqt("popup_source", MemeQuickPopUpSource.Companion.EZpvd().getSource()))));
    }

    public final void OLrzqt(String str) {
        C25448iws c25448iwsKWHzl = KWHzl();
        C21697hIz c21697hIz = this.copydefault;
        String strAEQbTJ = c21697hIz != null ? c21697hIz.AEQbTJ() : null;
        String str2 = strAEQbTJ == null ? "" : strAEQbTJ;
        hHT hht = hHT.KWHzl;
        String strAEQbTJ2 = hht.AEQbTJ(this.AEQbTJ);
        String strAEQbTJ3 = hht.AEQbTJ(this.AEQbTJ, this.AYXKKw);
        String type = TrackOrderType.SWAP.getType();
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(this.AhwBna).fARcdN();
        C21697hIz c21697hIz2 = this.copydefault;
        String strAEQbTJ4 = c21697hIz2 != null ? c21697hIz2.AEQbTJ() : null;
        c25448iwsKWHzl.AEQbTJ(new AbstractC22406hek.Application(str2, str, strAEQbTJ2, strAEQbTJ3, type, interfaceC23194htdFARcdN.KWHzl(strAEQbTJ4 != null ? strAEQbTJ4 : ""), hht.EZpvd(this.copydefault, this.gEmmrt), null, 128, null));
    }

    public final void AEQbTJ(C21697hIz c21697hIz) {
        C23533hzy c23533hzy;
        TextView textView;
        ImageView imageView;
        ImageView imageView2;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        C23533hzy c23533hzy2 = this.AkhnZx;
        if (c23533hzy2 != null && (textView5 = c23533hzy2.AkhnZx) != null) {
            textView5.setText(c21697hIz.AYXKKw());
        }
        C23533hzy c23533hzy3 = this.AkhnZx;
        if (c23533hzy3 != null && (textView4 = c23533hzy3.valueOf) != null) {
            textView4.setVisibility(c21697hIz.djBIcL() ? 8 : 0);
        }
        C23533hzy c23533hzy4 = this.AkhnZx;
        if (c23533hzy4 != null && (textView3 = c23533hzy4.valueOf) != null) {
            textView3.setText(c21697hIz.KWHzl());
        }
        C23533hzy c23533hzy5 = this.AkhnZx;
        if (c23533hzy5 != null && (textView2 = c23533hzy5.KWHzl) != null) {
            textView2.setText(c21697hIz.EZpvd());
        }
        C23533hzy c23533hzy6 = this.AkhnZx;
        if (c23533hzy6 != null && (imageView2 = c23533hzy6.values) != null) {
            C25386ivj.loadImageWithBorder$default(imageView2, c21697hIz.gEmmrt(), null, 2, null);
        }
        C23533hzy c23533hzy7 = this.AkhnZx;
        if (c23533hzy7 != null && (imageView = c23533hzy7.AEQbTJ) != null) {
            C33054mpH.AEQbTJ(imageView, c21697hIz.OLrzqt());
        }
        if (this.AEQbTJ == DAppRedirectFrom.MARKET || (c23533hzy = this.AkhnZx) == null || (textView = c23533hzy.valueOf) == null) {
            return;
        }
        textView.setOnClickListener(new Application(textView, 1000L, this, c21697hIz));
    }

    public final void copydefault(String str) {
        if (this.AEQbTJ != DAppRedirectFrom.MARKET) {
            hHT.KWHzl.EZpvd(str);
        }
        C33570myu.EZpvd(getContext(), str);
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 6, null);
        c55097xdX.setLeadingIcon(C33070mpX.KWHzl(C32113mPz.TaskDescription.AkhnZx));
        c55097xdX.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.playFromMediaId));
        c55097xdX.setState(2);
        c55097xdX.setMessage(str);
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public final void EZpvd() {
        TextView textView;
        LinearLayout linearLayout;
        ImageView imageView;
        C23533hzy c23533hzy = this.AkhnZx;
        if (c23533hzy != null && (imageView = c23533hzy.AhwBna) != null) {
            imageView.setVisibility(8);
        }
        C23533hzy c23533hzy2 = this.AkhnZx;
        if (c23533hzy2 != null && (linearLayout = c23533hzy2.AYXKKw) != null) {
            linearLayout.setVisibility(8);
        }
        C23533hzy c23533hzy3 = this.AkhnZx;
        if (c23533hzy3 == null || (textView = c23533hzy3.valueOf) == null) {
            return;
        }
        textView.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AkhnZx = null;
        super.onDestroyView();
    }
}
