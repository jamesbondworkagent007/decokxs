package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.unify_trade.biz.FundingFeeApyItem;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC50900vcq;
import o.AbstractC53029wdl;
import o.C33070mpX;
import o.C33129mqd;
import o.C48033uCm;
import o.C52761wXj;
import o.C55052xcf;
import o.C55258xgZ;
import o.C55276xgr;
import o.C55296xhK;
import o.C55688xof;
import o.C56033xvF;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.ViewOnClickListenerC54939xaY;
import o.vMU;
import o.xMR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SmartArbitrageCalStakingApyView extends AbstractC53029wdl {
    public StrategyConfigInfo AEQbTJ;
    public List<FundingFeeApyItem> EZpvd;
    public boolean KWHzl;
    public final AbstractC50900vcq OLrzqt;
    public boolean copydefault;
    public PnLDuration djBIcL;
    public Function2<? super String, ? super String, Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageCalStakingApyView(@NotNull Context context) {
        this(context, null, 0, false, false, null, 62, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageCalStakingApyView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, false, null, 60, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageCalStakingApyView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, false, null, 56, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function2<? super String, ? super String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PnLDuration KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfig(StrategyConfigInfo strategyConfigInfo) {
        this.AEQbTJ = strategyConfigInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC53029wdl
    public void setFirstApyViewExplainClickListener(@NotNull Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIsLeverage(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIsStaking(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedDuration(@NotNull PnLDuration pnLDuration) {
        Intrinsics.checkNotNullParameter(pnLDuration, "");
        this.djBIcL = pnLDuration;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r7v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r8v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r11v0 boolean) : false)
  (wrap:com.okinc.unify_trade.biz.StrategyConfigInfo:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r12v0 com.okinc.unify_trade.biz.StrategyConfigInfo) : (null com.okinc.unify_trade.biz.StrategyConfigInfo))
 A[MD:(android.content.Context, android.util.AttributeSet, int, boolean, boolean, com.okinc.unify_trade.biz.StrategyConfigInfo):void (m)] (LINE:40) call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.view.SmartArbitrageCalStakingApyView.<init>(android.content.Context, android.util.AttributeSet, int, boolean, boolean, com.okinc.unify_trade.biz.StrategyConfigInfo):void type: THIS */
    public /* synthetic */ SmartArbitrageCalStakingApyView(Context context, AttributeSet attributeSet, int i, boolean z, boolean z2, StrategyConfigInfo strategyConfigInfo, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? z2 : false, (i2 & 32) == 0 ? strategyConfigInfo : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbitrageCalStakingApyView(@NotNull Context context, AttributeSet attributeSet, int i, boolean z, boolean z2, StrategyConfigInfo strategyConfigInfo) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = z;
        this.KWHzl = z2;
        this.AEQbTJ = strategyConfigInfo;
        AbstractC50900vcq abstractC50900vcqKWHzl = AbstractC50900vcq.KWHzl(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50900vcqKWHzl, "");
        this.OLrzqt = abstractC50900vcqKWHzl;
        this.djBIcL = PnLDuration.APY_90DAYS;
        copydefault();
        OLrzqt();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PnLDuration {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ PnLDuration[] $VALUES;
        public static final ActionBar Companion;
        private final String data;
        private final String title;
        public static final PnLDuration APY_3DAYS = new PnLDuration("APY_3DAYS", 0, C33070mpX.AYXKKw(C48033uCm.Fragment.compare), "3d");
        public static final PnLDuration APY_30DAYS = new PnLDuration("APY_30DAYS", 1, C33070mpX.AYXKKw(C48033uCm.Fragment.OmYuqg), "30d");
        public static final PnLDuration APY_90DAYS = new PnLDuration("APY_90DAYS", 2, C33070mpX.AYXKKw(C48033uCm.Fragment.UJpkuA), "90d");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ PnLDuration[] $values() {
            return new PnLDuration[]{APY_3DAYS, APY_30DAYS, APY_90DAYS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<PnLDuration> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        private PnLDuration(String str, int i, String str2, String str3) {
            this.title = str2;
            this.data = str3;
        }

        static {
            PnLDuration[] pnLDurationArr$values = $values();
            $VALUES = pnLDurationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(pnLDurationArr$values);
            Companion = new ActionBar(null);
        }

        public static final class ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.smartarbitrage.view.SmartArbitrageCalStakingApyView.PnLDuration.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private ActionBar() {
            }

            public final PnLDuration KWHzl(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                for (PnLDuration pnLDuration : PnLDuration.values()) {
                    if (Intrinsics.EZpvd((Object) pnLDuration.getData(), (Object) str)) {
                        return pnLDuration;
                    }
                }
                return null;
            }
        }

        public static PnLDuration valueOf(String str) {
            return (PnLDuration) Enum.valueOf(PnLDuration.class, str);
        }

        public static PnLDuration[] values() {
            return (PnLDuration[]) $VALUES.clone();
        }
    }

    public final void EZpvd(FragmentManager fragmentManager) {
        this.OLrzqt.EZpvd.setTitle(this.djBIcL.getData());
        C55052xcf c55052xcf = this.OLrzqt.EZpvd;
        c55052xcf.setOnClickListener(new StateListAnimator(c55052xcf, 1000L, fragmentManager, this));
    }

    public static final class Activity implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            Object objOLrzqt = c55276xgr.OLrzqt();
            PnLDuration pnLDuration = objOLrzqt instanceof PnLDuration ? (PnLDuration) objOLrzqt : null;
            if (pnLDuration != null) {
                SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView = SmartArbitrageCalStakingApyView.this;
                smartArbitrageCalStakingApyView.setSelectedDuration(pnLDuration);
                Function2 function2 = smartArbitrageCalStakingApyView.gEmmrt;
                if (function2 != null) {
                    function2.invoke(smartArbitrageCalStakingApyView.KWHzl().getData(), "");
                }
                smartArbitrageCalStakingApyView.EZpvd();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() {
        String strAYXKKw;
        C55258xgZ c55258xgZ = this.OLrzqt.gEmmrt;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
        StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
        if (C33129mqd.KWHzl((Collection) (strategyConfigInfo != null ? strategyConfigInfo.getAutoStaking() : null))) {
            StrategyConfigInfo strategyConfigInfo2 = this.AEQbTJ;
            if (C33129mqd.KWHzl((Collection) (strategyConfigInfo2 != null ? strategyConfigInfo2.getAutoEarn() : null))) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.NRYds);
            }
        } else {
            StrategyConfigInfo strategyConfigInfo3 = this.AEQbTJ;
            if (C33129mqd.KWHzl((Collection) (strategyConfigInfo3 != null ? strategyConfigInfo3.getAutoStaking() : null))) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.UJEglR);
            } else {
                StrategyConfigInfo strategyConfigInfo4 = this.AEQbTJ;
                if (C33129mqd.KWHzl((Collection) (strategyConfigInfo4 != null ? strategyConfigInfo4.getAutoEarn() : null))) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.FYtjSf);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.FYtjSf);
                }
            }
        }
        this.OLrzqt.values.setText(strAYXKKw);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.KWHzl.dismiss();
        }
    }

    public final void OLrzqt() {
        View view = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(this.KWHzl ^ true ? 4 : 0);
        LinearLayoutCompat linearLayoutCompat2 = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(0);
        LinearLayoutCompat linearLayoutCompat3 = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat3, "");
        linearLayoutCompat3.setVisibility(0);
    }

    @Override // o.AbstractC53029wdl
    public void AEQbTJ(List<FundingFeeApyItem> list, boolean z, boolean z2) {
        this.EZpvd = list;
        EZpvd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        String apy;
        String arbApy;
        String stakingApy;
        String strAYXKKw;
        FundingFeeApyItem fundingFeeApyItem;
        int iOLrzqt;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        this.OLrzqt.EZpvd.setTitle(this.djBIcL.getTitle());
        TextView textView = this.OLrzqt.fetchVPNInfo;
        List<FundingFeeApyItem> list = this.EZpvd;
        String debitYearRate = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next4 = null;
                    break;
                } else {
                    next4 = it.next();
                    if (Intrinsics.EZpvd((Object) ((FundingFeeApyItem) next4).getPeriod(), (Object) this.djBIcL.getData())) {
                        break;
                    }
                }
            }
            FundingFeeApyItem fundingFeeApyItem2 = (FundingFeeApyItem) next4;
            apy = fundingFeeApyItem2 != null ? fundingFeeApyItem2.getApy() : null;
        }
        textView.setText(getFormatedRatio$default(this, apy, null, false, 6, null));
        textView.setTextColor(C56033xvF.OLrzqt((Object) apy));
        TextView textView2 = this.OLrzqt.DbNXlk;
        List<FundingFeeApyItem> list2 = this.EZpvd;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                } else {
                    next3 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((FundingFeeApyItem) next3).getPeriod(), (Object) this.djBIcL.getData())) {
                        break;
                    }
                }
            }
            FundingFeeApyItem fundingFeeApyItem3 = (FundingFeeApyItem) next3;
            arbApy = fundingFeeApyItem3 != null ? fundingFeeApyItem3.getArbApy() : null;
        }
        textView2.setText(getFormatedRatio$default(this, arbApy, null, false, 6, null));
        textView2.setTextColor(C56033xvF.OLrzqt((Object) arbApy));
        TextView textView3 = this.OLrzqt.AYXKKw;
        List<FundingFeeApyItem> list3 = this.EZpvd;
        if (list3 != null) {
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    if (Intrinsics.EZpvd((Object) ((FundingFeeApyItem) next2).getPeriod(), (Object) this.djBIcL.getData())) {
                        break;
                    }
                }
            }
            FundingFeeApyItem fundingFeeApyItem4 = (FundingFeeApyItem) next2;
            stakingApy = fundingFeeApyItem4 != null ? fundingFeeApyItem4.getStakingApy() : null;
        }
        textView3.setText(getFormatedRatio$default(this, stakingApy, null, false, 6, null));
        textView3.setTextColor(C56033xvF.OLrzqt((Object) stakingApy));
        C55258xgZ c55258xgZ = this.OLrzqt.isConnected;
        if (!this.KWHzl) {
            c55258xgZ.setHelperLabelType(2);
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.dbUqJD);
        } else {
            c55258xgZ.setHelperLabelType(1);
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.getAdvertisingId);
        }
        c55258xgZ.setText(strAYXKKw);
        C55258xgZ c55258xgZ2 = this.OLrzqt.isConnected;
        c55258xgZ2.setOnClickListener(new PendingIntent(c55258xgZ2, 1000L, this, c55258xgZ));
        TextView textView4 = this.OLrzqt.AkhnZx;
        List<FundingFeeApyItem> list4 = this.EZpvd;
        if (list4 != null) {
            Iterator<T> it4 = list4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it4.next();
                    if (Intrinsics.EZpvd((Object) ((FundingFeeApyItem) next).getPeriod(), (Object) this.djBIcL.getData())) {
                        break;
                    }
                }
            }
            fundingFeeApyItem = (FundingFeeApyItem) next;
        } else {
            fundingFeeApyItem = null;
        }
        boolean z = !this.KWHzl;
        if (z) {
            if (fundingFeeApyItem != null) {
                debitYearRate = fundingFeeApyItem.getArbApy();
            }
        } else if (fundingFeeApyItem != null) {
            debitYearRate = fundingFeeApyItem.getDebitYearRate();
        }
        textView4.setText(getFormatedRatio$default(this, debitYearRate, null, false, 6, null));
        textView4.setTag(xMR.copydefault.AEQbTJ(debitYearRate == null ? "" : debitYearRate, 2, RoundingMode.HALF_UP));
        if (!z) {
            iOLrzqt = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        } else {
            iOLrzqt = C56033xvF.OLrzqt((Object) debitYearRate);
        }
        textView4.setTextColor(iOLrzqt);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ SmartArbitrageCalStakingApyView KWHzl;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView) {
            this.copydefault = view;
            this.EZpvd = j;
            this.KWHzl = smartArbitrageCalStakingApyView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Context context = this.KWHzl.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IconCompatParcelizer));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.gVEiQJ));
                viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ C55258xgZ OLrzqt;
        public final /* synthetic */ SmartArbitrageCalStakingApyView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView, C55258xgZ c55258xgZ) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = smartArbitrageCalStakingApyView;
            this.OLrzqt = c55258xgZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.AEQbTJ()) {
                    Context context = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(this.OLrzqt.DbNXlk());
                    viewOnClickListenerC54939xaY.EZpvd(!this.copydefault.AEQbTJ() ? C33070mpX.AYXKKw(C48033uCm.Fragment.FSMca) : C33070mpX.AYXKKw(C48033uCm.Fragment.setPageName));
                    viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new Application(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ SmartArbitrageCalStakingApyView EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ FragmentManager copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, FragmentManager fragmentManager, SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = fragmentManager;
            this.EZpvd = smartArbitrageCalStakingApyView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                vMU vmu = new vMU();
                PnLDuration[] pnLDurationArrValues = PnLDuration.values();
                ArrayList arrayList = new ArrayList(pnLDurationArrValues.length);
                int length = pnLDurationArrValues.length;
                for (int i = 0; i < length; i++) {
                    PnLDuration pnLDuration = pnLDurationArrValues[i];
                    arrayList.add(new C55276xgr(pnLDuration.getTitle(), pnLDuration, null, pnLDuration == this.EZpvd.KWHzl(), false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null));
                }
                vmu.OLrzqt(arrayList);
                vmu.AEQbTJ(this.EZpvd.new Activity());
                FragmentManager fragmentManager = this.copydefault;
                if (fragmentManager != null) {
                    vmu.show(fragmentManager);
                }
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.copydefault.dismiss();
        }
    }

    public static /* synthetic */ String getFormatedRatio$default(SmartArbitrageCalStakingApyView smartArbitrageCalStakingApyView, String str, RoundingMode roundingMode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.FLOOR;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return smartArbitrageCalStakingApyView.EZpvd(str, roundingMode, z);
    }

    public final String EZpvd(String str, RoundingMode roundingMode, boolean z) {
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            return "--";
        }
        if (z) {
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            return xmr.copydefault(str, 2, 0, roundingMode);
        }
        xMR xmr2 = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr2.EZpvd(str, 2, 0, roundingMode);
    }
}
