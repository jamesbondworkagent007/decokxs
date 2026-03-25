package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.market_place.home.view.MarketPlaceToolBar$initListener$2$2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C52761wXj;
import o.InterfaceC49496upe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51623vqX extends ConstraintLayout {
    public AbstractC50945vdi AEQbTJ;
    public boolean KWHzl;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51623vqX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51623vqX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitleLayoutClickCallback(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:42) call: o.vqX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51623vqX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51623vqX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AYXKKw();
        valueOf();
    }

    private final void AYXKKw() {
        AbstractC50945vdi abstractC50945vdi = (AbstractC50945vdi) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.gCiISl, this, true);
        this.AEQbTJ = abstractC50945vdi;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        abstractC50945vdi.AEQbTJ.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.RgLUBD), C33070mpX.AYXKKw(C48033uCm.Fragment.dvImUD));
        C57585ylG c57585ylG = abstractC50945vdi.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c57585ylG, "");
        c57585ylG.setVisibility(C54589xNz.EZpvd.EZpvd() ? 0 : 8);
        C57585ylG c57585ylG2 = abstractC50945vdi.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c57585ylG2, "");
        C56071xvr c56071xvr = C56071xvr.gEmmrt;
        wPQ.EZpvd(c57585ylG2, c56071xvr.fJNWhG(), 0);
        android.widget.LinearLayout linearLayout = abstractC50945vdi.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        wPQ.copydefault(linearLayout);
        AppCompatImageView appCompatImageView = abstractC50945vdi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        wPQ.EZpvd(appCompatImageView, 0, c56071xvr.DbNXlk());
        AppCompatImageView appCompatImageView2 = abstractC50945vdi.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(c56071xvr.ejfBZ() ^ true ? 0 : 8);
    }

    private final void valueOf() {
        AbstractC50945vdi abstractC50945vdi = this.AEQbTJ;
        AbstractC50945vdi abstractC50945vdi2 = null;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        abstractC50945vdi.AEQbTJ.setUserIconClick(new Function0() { // from class: o.vrc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51623vqX.copydefault(this.copydefault);
            }
        });
        AbstractC50945vdi abstractC50945vdi3 = this.AEQbTJ;
        if (abstractC50945vdi3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi3 = null;
        }
        abstractC50945vdi3.AEQbTJ.setOnRealChangeClick(new Function0() { // from class: o.vrd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51623vqX.valueOf(this.copydefault);
            }
        });
        AbstractC50945vdi abstractC50945vdi4 = this.AEQbTJ;
        if (abstractC50945vdi4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi4 = null;
        }
        AppCompatImageView appCompatImageView = abstractC50945vdi4.copydefault;
        appCompatImageView.setOnClickListener(new Activity(appCompatImageView, 1000L, this));
        AbstractC50945vdi abstractC50945vdi5 = this.AEQbTJ;
        if (abstractC50945vdi5 == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi5 = null;
        }
        AppCompatImageView appCompatImageView2 = abstractC50945vdi5.KWHzl;
        appCompatImageView2.setOnClickListener(new TaskDescription(appCompatImageView2, 1000L, this));
        AbstractC50945vdi abstractC50945vdi6 = this.AEQbTJ;
        if (abstractC50945vdi6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50945vdi2 = abstractC50945vdi6;
        }
        android.widget.LinearLayout linearLayout = abstractC50945vdi2.gEmmrt;
        linearLayout.setOnClickListener(new Application(linearLayout, 1000L, this));
    }

    public static final Unit copydefault(C51623vqX c51623vqX) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_demo_trading_header_user_center_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.vrb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51623vqX.copydefault((EventParamsList) obj);
            }
        });
        InterfaceC35160nqA interfaceC35160nqA = (InterfaceC35160nqA) C43251rlk.OLrzqt(InterfaceC35160nqA.class);
        if (interfaceC35160nqA != null) {
            android.content.Context context = c51623vqX.getContext();
            Intrinsics.copydefault(context, "");
            interfaceC35160nqA.KWHzl((AbstractActivityC33041mov) context);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", ExtJson.BRC20TYPE_TRADE, false);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C51623vqX c51623vqX) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_demo_trading_header_switch_mode_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.vre
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51623vqX.EZpvd((EventParamsList) obj);
            }
        });
        android.content.Context context = c51623vqX.getContext();
        Intrinsics.copydefault(context, "");
        ((AbstractActivityC33041mov) context).showLoading();
        android.content.Context context2 = c51623vqX.getContext();
        Intrinsics.copydefault(context2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((AbstractActivityC33041mov) context2), null, null, new MarketPlaceToolBar$initListener$2$2(c51623vqX, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", ExtJson.BRC20TYPE_TRADE, false);
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        AbstractC50945vdi abstractC50945vdi = this.AEQbTJ;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        abstractC50945vdi.EZpvd.setText(charSequence);
    }

    public final void setTitleFilterStatus(boolean z) {
        this.KWHzl = z;
        AbstractC50945vdi abstractC50945vdi = this.AEQbTJ;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        abstractC50945vdi.OLrzqt.setImageResource(z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm);
    }

    public final void OLrzqt(boolean z) {
        AbstractC50945vdi abstractC50945vdi = this.AEQbTJ;
        AbstractC50945vdi abstractC50945vdi2 = null;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        AppCompatImageView appCompatImageView = abstractC50945vdi.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(z ? 0 : 8);
        AbstractC50945vdi abstractC50945vdi3 = this.AEQbTJ;
        if (abstractC50945vdi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50945vdi2 = abstractC50945vdi3;
        }
        abstractC50945vdi2.gEmmrt.setEnabled(z);
    }

    public final void OLrzqt() {
        if (this.AEQbTJ == null || !C48291uMa.Companion.AEQbTJ().copydefault()) {
            return;
        }
        AbstractC50945vdi abstractC50945vdi = this.AEQbTJ;
        AbstractC50945vdi abstractC50945vdi2 = null;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        AppCompatImageView appCompatImageView = abstractC50945vdi.copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(8);
        AbstractC50945vdi abstractC50945vdi3 = this.AEQbTJ;
        if (abstractC50945vdi3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50945vdi2 = abstractC50945vdi3;
        }
        AppCompatImageView appCompatImageView2 = abstractC50945vdi2.KWHzl;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(8);
    }

    public final void AEQbTJ() {
        wXX wxxProvideMoreToolsBottomFragment$default = InterfaceC49496upe.Application.provideMoreToolsBottomFragment$default(C53685wqE.copydefault.copydefault(), null, "botHome", 1, null);
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        wxxProvideMoreToolsBottomFragment$default.show(((FragmentActivity) context).getSupportFragmentManager(), "MoreToolsBottomFragment");
    }

    public final void copydefault() {
        C32866mlf.onEvent$default("TradingBot_Mid_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.vra
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51623vqX.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab_name", "academy", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        AbstractC50945vdi abstractC50945vdi = this.AEQbTJ;
        if (abstractC50945vdi == null) {
            Intrinsics.gEmmrt("");
            abstractC50945vdi = null;
        }
        C57585ylG c57585ylG = abstractC50945vdi.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c57585ylG, "");
        c57585ylG.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.vqX$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51623vqX AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51623vqX c51623vqX) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c51623vqX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.copydefault();
                C52689wUs.KWHzl.EZpvd(C35334ntP.KWHzl(this.AEQbTJ));
            }
        }
    }

    /* JADX INFO: renamed from: o.vqX$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51623vqX KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51623vqX c51623vqX) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = c51623vqX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0<Unit> function0EZpvd = this.KWHzl.EZpvd();
                if (function0EZpvd != null) {
                    function0EZpvd.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vqX$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51623vqX KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51623vqX c51623vqX) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c51623vqX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ();
            }
        }
    }
}
