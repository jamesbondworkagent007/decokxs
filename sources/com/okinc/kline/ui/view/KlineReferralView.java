package com.okinc.kline.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.news.data.KlineCampaignData;
import com.okinc.kline.ui.view.KlineReferralView;
import com.okinc.web.WebActivity;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32866mlf;
import o.C32868mlh;
import o.C33129mqd;
import o.C35964oKf;
import o.C52794wYp;
import o.C55296xhK;
import o.C56390yDp;
import o.InterfaceC35974oKp;
import o.oPC;
import o.pAN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class KlineReferralView extends LinearLayout implements DefaultLifecycleObserver, InterfaceC35974oKp {
    public LifecycleOwner AEQbTJ;
    public String EZpvd;
    public final String KWHzl;
    public oPC OLrzqt;
    public Function1<? super Integer, Unit> copydefault;
    public final pAN valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlineReferralView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KlineReferralView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC35974oKp
    public void setDataDidLoadedCallBack(Function1<? super Integer, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: com.okinc.kline.ui.view.KlineReferralView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ KlineReferralView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineReferralView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(LayoutInflater.from(context), C35964oKf.Application.DQzvGNdrmXxudrmXxu, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (oPC) viewDataBindingInflate;
        this.valueOf = new pAN();
        this.KWHzl = "KlineReferralView";
        KWHzl();
        this.EZpvd = "";
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Lifecycle lifecycle;
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        this.AEQbTJ = lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        copydefault();
    }

    private final void copydefault() {
        LifecycleCoroutineScope lifecycleScope;
        LifecycleOwner lifecycleOwner = this.AEQbTJ;
        if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new KlineReferralView$requestData$1(this, null), 3, null);
    }

    public final void EZpvd() {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.EZpvd)), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Overview_Campaign_Click", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pzr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return KlineReferralView.OLrzqt(this.EZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(KlineReferralView klineReferralView, EventParamsList eventParamsList) {
        String activeId;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token", klineReferralView.valueOf.copydefault(), false, 4, null);
        KlineCampaignData klineCampaignDataAEQbTJ = klineReferralView.valueOf.AEQbTJ();
        EventParamsList.put$default(eventParamsList, "campaign_id", (klineCampaignDataAEQbTJ == null || (activeId = klineCampaignDataAEQbTJ.getActiveId()) == null) ? "" : activeId, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void setContent() {
        String urlSlug;
        KlineCampaignData klineCampaignDataAEQbTJ = this.valueOf.AEQbTJ();
        this.OLrzqt.KWHzl.setText(klineCampaignDataAEQbTJ != null ? klineCampaignDataAEQbTJ.getSeoTitle() : null);
        if (klineCampaignDataAEQbTJ == null || (urlSlug = klineCampaignDataAEQbTJ.getUrlSlug()) == null) {
            urlSlug = "";
        }
        this.EZpvd = urlSlug;
        if (C33129mqd.OLrzqt((CharSequence) (klineCampaignDataAEQbTJ != null ? klineCampaignDataAEQbTJ.getSeoDescription() : null))) {
            this.OLrzqt.AEQbTJ.setText(klineCampaignDataAEQbTJ != null ? klineCampaignDataAEQbTJ.getSeoDescription() : null);
        }
    }

    @Override // o.InterfaceC35974oKp
    public void setParam(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf.KWHzl(str);
        this.valueOf.OLrzqt(str2);
        this.valueOf.AEQbTJ(str3);
    }

    private final void KWHzl() {
        setVisibility(8);
        C52794wYp c52794wYp = this.OLrzqt.EZpvd;
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, this));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ KlineReferralView EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, KlineReferralView klineReferralView) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = klineReferralView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.EZpvd();
                this.EZpvd.AEQbTJ();
            }
        }
    }
}
