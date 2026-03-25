package o;

import android.view.View;
import androidx.fragment.app.FragmentResultListener;
import com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingDownFragment$registerSubscribers$2;
import com.okinc.market.ranking.features.main.viewmodel.RankingViewModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C41724qwH extends AbstractC41768qwz {
    public static final Activity Companion = new Activity(null);

    @Override // o.AbstractC41759qwq
    public boolean AhwBna() {
        return true;
    }

    @Override // o.AbstractC41759qwq
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(qZH.PendingIntent.DcMfJKDSqxTE);
    }

    /* JADX INFO: renamed from: o.qwH$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qwH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractC41759qwq, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        C41820qxy c41820qxy;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42828rdl c42828rdlAYXKKw = AYXKKw();
        if (c42828rdlAYXKKw != null && (c41820qxy = c42828rdlAYXKKw.AYXKKw) != null) {
            c41820qxy.setPeriodClickListener$OKMarket_market_impl(new View.OnClickListener() { // from class: o.qwI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C41724qwH.AEQbTJ(this.AEQbTJ, view2);
                }
            });
        }
        getChildFragmentManager().setFragmentResultListener("request_key_down_rank_period", this, new FragmentResultListener() { // from class: o.qwF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                this.OLrzqt.copydefault(str, bundle2);
            }
        });
    }

    public static final void AEQbTJ(C41724qwH c41724qwH, android.view.View view) {
        C41675qvL c41675qvLAEQbTJ = C41675qvL.Companion.AEQbTJ();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key.request_key_ranking", "request_key_down_rank_period");
        bundle.putString("key.current_select_period", c41724qwH.valueOf().EZpvd());
        c41675qvLAEQbTJ.setArguments(bundle);
        c41675qvLAEQbTJ.show(c41724qwH.getChildFragmentManager(), C41724qwH.class.getName());
        view.setSelected(true);
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(c41724qwH);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.AEQbTJ(c41724qwH.AkhnZx().getTrackSubType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str, android.os.Bundle bundle) {
        C41820qxy c41820qxy;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "request_key_down_rank_period")) {
            java.lang.String string = bundle.getString("key.select_period");
            if (string != null) {
                valueOf().AEQbTJ(string);
                gEmmrt();
            }
            java.lang.String string2 = bundle.getString("key.select_period_string");
            C42828rdl c42828rdlAYXKKw = AYXKKw();
            if (c42828rdlAYXKKw != null && (c41820qxy = c42828rdlAYXKKw.AYXKKw) != null) {
                if (string2 == null) {
                    string2 = "";
                }
                c41820qxy.setPeriodText$OKMarket_market_impl(string2);
            }
            InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(this);
            if (interfaceC41634quXEZpvd != null) {
                interfaceC41634quXEZpvd.copydefault(valueOf().KWHzl().getTrackEvent(), AkhnZx().getTrackSubType());
            }
        }
    }

    @Override // o.AbstractC41759qwq, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        InterfaceC41634quX interfaceC41634quXEZpvd = C41701qvl.EZpvd(this);
        if (interfaceC41634quXEZpvd != null) {
            interfaceC41634quXEZpvd.OLrzqt(AkhnZx().getTrackSubType(), "", valueOf().KWHzl().getTrackEvent());
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.unB.Activity.collectLatestOnLifecycle$default(o.unB, o.unz, o.yJx, androidx.lifecycle.Lifecycle$State, kotlin.jvm.functions.Function2, int, java.lang.Object):kotlinx.coroutines.Job */
    @Override // o.AbstractC41759qwq
    public void djBIcL() {
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, isConnected(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.ranking.features.main.ui.sub.list.spot.RankingDownFragment$registerSubscribers$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((RankingViewModel.ActionBar) obj).AEQbTJ();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((RankingViewModel.ActionBar) obj).AEQbTJ((InterfaceC49371unL) obj2);
            }
        }, null, new RankingDownFragment$registerSubscribers$2(this, null), 2, null);
    }

    @Override // o.AbstractC41759qwq
    public void gEmmrt() {
        valueOf().copydefault("1");
        isConnected().EZpvd(valueOf());
    }
}
