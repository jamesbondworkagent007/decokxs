package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.planet.biz_positions.data.YieldDetails;
import com.okinc.planet.format.InstId;
import com.okinc.planet.serializer.PlanetNumericString;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C46036tFl;
import o.C47501trL;
import o.C55688xof;
import o.InterfaceC46072tGu;
import o.tRU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tFl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46036tFl extends androidx.recyclerview.widget.ListAdapter<InterfaceC46072tGu, RecyclerView.ViewHolder> {
    public static final ActionBar Companion = new ActionBar(null);
    public final Function2<java.lang.String, java.lang.String, Unit> AEQbTJ;
    public final Function1<YieldDetails.Activity, Unit> AhwBna;
    public final Function0<Unit> EZpvd;
    public final Function1<InterfaceC46069tGr, Unit> KWHzl;
    public final Function0<Unit> OLrzqt;
    public final Function0<Unit> copydefault;
    public final Function2<InstId, java.lang.String, Unit> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super com.okinc.planet.format.InstId, ? super java.lang.String, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.planet.biz_positions.data.YieldDetails$Activity, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.tGr, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46036tFl(@NotNull Function2<? super InstId, ? super java.lang.String, Unit> function2, @NotNull Function1<? super YieldDetails.Activity, Unit> function1, @NotNull Function1<? super InterfaceC46069tGr, Unit> function12, @NotNull Function0<Unit> function0, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function22, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        super(C46044tFt.KWHzl);
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.valueOf = function2;
        this.AhwBna = function1;
        this.KWHzl = function12;
        this.copydefault = function0;
        this.AEQbTJ = function22;
        this.OLrzqt = function02;
        this.EZpvd = function03;
    }

    /* JADX INFO: renamed from: o.tFl$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tFl.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 0) {
            C46280tOm c46280tOmAEQbTJ = C46280tOm.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c46280tOmAEQbTJ, "");
            return new TaskDescription(c46280tOmAEQbTJ);
        }
        if (i == 1) {
            C46283tOp c46283tOpAEQbTJ = C46283tOp.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c46283tOpAEQbTJ, "");
            return new StateListAnimator(this, c46283tOpAEQbTJ);
        }
        if (i == 2) {
            C46281tOn c46281tOnAEQbTJ = C46281tOn.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c46281tOnAEQbTJ, "");
            return new Application(this, c46281tOnAEQbTJ);
        }
        if (i == 3) {
            C46287tOt c46287tOtCopydefault = C46287tOt.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c46287tOtCopydefault, "");
            return new Activity(this, c46287tOtCopydefault);
        }
        throw new java.lang.IllegalArgumentException("Unknown viewType: " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof TaskDescription) {
            InterfaceC46072tGu item = getItem(i);
            if (item instanceof InterfaceC46072tGu.StateListAnimator) {
                ((TaskDescription) viewHolder).EZpvd((InterfaceC46072tGu.StateListAnimator) item);
                return;
            } else {
                EZpvd(i, "CurrentPositionHeader", item.AhwBna());
                return;
            }
        }
        if (viewHolder instanceof StateListAnimator) {
            InterfaceC46072tGu item2 = getItem(i);
            if (item2 instanceof InterfaceC46072tGu.Activity) {
                ((StateListAnimator) viewHolder).OLrzqt((InterfaceC46072tGu.Activity) item2);
            } else {
                EZpvd(i, "CurrentPositionItem", item2.AhwBna());
            }
        }
    }

    public final void EZpvd(int i, java.lang.String str, java.lang.String str2) {
        pUU.copydefault("ProfilePositionsAdapter", "sendBugReport: position " + i + ": expected " + str + ", but was " + str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        InterfaceC46072tGu item = getItem(i);
        if (item instanceof InterfaceC46072tGu.StateListAnimator) {
            return 0;
        }
        if (item instanceof InterfaceC46072tGu.Activity) {
            return 1;
        }
        if (item instanceof InterfaceC46072tGu.ActionBar) {
            return 2;
        }
        if (item instanceof InterfaceC46072tGu.Application) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.tFl$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C46280tOm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C46280tOm c46280tOm) {
            super(c46280tOm.getRoot());
            Intrinsics.checkNotNullParameter(c46280tOm, "");
            this.copydefault = c46280tOm;
        }

        public final void EZpvd(@NotNull InterfaceC46072tGu.StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
            java.lang.String strCopydefault = stateListAnimator.copydefault();
            C55251xgS c55251xgS = this.copydefault.copydefault;
            Intrinsics.copydefault(c55251xgS);
            c55251xgS.setVisibility(C33129mqd.AhwBna(strAEQbTJ, 0) ? 0 : 8);
            c55251xgS.setText(C33069mpW.copydefault(C47501trL.Fragment.RSDDiY, C56423yEv.EZpvd(C56390yDp.OLrzqt(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, C46367tRs.OLrzqt(strAEQbTJ, false)))));
            C55251xgS c55251xgS2 = this.copydefault.EZpvd;
            Intrinsics.copydefault(c55251xgS2);
            c55251xgS2.setVisibility(C33129mqd.AhwBna(strCopydefault, 0) ? 0 : 8);
            c55251xgS2.setText(C33069mpW.copydefault(C47501trL.Fragment.DQzvGNdrmXxudrmXxu, C56423yEv.EZpvd(C56390yDp.OLrzqt(HiAnalyticsConstant.HaKey.BI_KEY_TRANSTYPE, C46367tRs.OLrzqt(strCopydefault, false)))));
        }
    }

    /* JADX INFO: renamed from: o.tFl$Application */
    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ C46036tFl AEQbTJ;

        /* JADX INFO: renamed from: o.tFl$Application$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ C46036tFl AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, android.view.View view2, C46036tFl c46036tFl) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.EZpvd = view2;
                this.AEQbTJ = c46036tFl;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.AEQbTJ.EZpvd.invoke();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C46036tFl c46036tFl, C46281tOn c46281tOn) {
            super(c46281tOn.getRoot());
            Intrinsics.checkNotNullParameter(c46281tOn, "");
            this.AEQbTJ = c46036tFl;
            wYE wye = c46281tOn.AEQbTJ;
            wye.setOnClickListener(new TaskDescription(wye, 300L, wye, c46036tFl));
        }
    }

    /* JADX INFO: renamed from: o.tFl$StateListAnimator */
    public final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C46283tOp AEQbTJ;
        public final /* synthetic */ C46036tFl KWHzl;

        /* JADX INFO: renamed from: o.tFl$StateListAnimator$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ InterfaceC46072tGu.Activity KWHzl;
            public final /* synthetic */ C46036tFl OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, android.view.View view2, C46036tFl c46036tFl, InterfaceC46072tGu.Activity activity) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.copydefault = view2;
                this.OLrzqt = c46036tFl;
                this.KWHzl = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.OLrzqt.valueOf.invoke(InstId.copydefault(this.KWHzl.AEQbTJ()), this.KWHzl.EZpvd());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46036tFl c46036tFl, C46283tOp c46283tOp) {
            super(c46283tOp.getRoot());
            Intrinsics.checkNotNullParameter(c46283tOp, "");
            this.KWHzl = c46036tFl;
            this.AEQbTJ = c46283tOp;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.tRP.getPNLConverter-4MWxQ20$default(java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):o.xMV */
        public final void OLrzqt(@NotNull final InterfaceC46072tGu.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            xMV xmvM8742getPNLConverter4MWxQ20$default = tRP.m8742getPNLConverter4MWxQ20$default(activity.AEQbTJ(), activity.EZpvd(), null, 2, null);
            xMS xmsEZpvd = tRR.EZpvd(activity.AEQbTJ(), activity.EZpvd());
            C46283tOp c46283tOp = this.AEQbTJ;
            final C46036tFl c46036tFl = this.KWHzl;
            c46283tOp.getRoot().setPadding(0, 0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
            c46283tOp.hDKMBd.setText(tRQ.m8743getCoinTitlejjRfxO4$default(activity.AEQbTJ(), activity.EZpvd(), false, 2, null));
            C55376xil c55376xil = c46283tOp.hDKMBd;
            c55376xil.setOnClickListener(new Activity(c55376xil, 300L, c55376xil, c46036tFl, activity));
            AppCompatImageView appCompatImageView = c46283tOp.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            c46283tOp.isConnected.setText(activity.iwGUEr().AEQbTJ());
            C55251xgS c55251xgS = c46283tOp.isConnected;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            C46044tFt.AEQbTJ(c55251xgS, activity.iwGUEr() instanceof tRU.ActionBar);
            c46283tOp.DbNXlk.setText(activity.fetchVPNInfo());
            c46283tOp.gEmmrt.setText(tIX.KWHzl.OLrzqt(activity.valueOf()));
            android.widget.TextView textView = c46283tOp.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            int i = C47501trL.Fragment.QUSxYX;
            java.lang.String strDbNXlk = activity.DbNXlk();
            java.lang.String strFIwbmz = activity.fIwbmz();
            if (strDbNXlk == null || strDbNXlk.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk)) {
                strDbNXlk = strFIwbmz;
            }
            java.lang.String strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strDbNXlk)));
            kotlin.Pair pNL$default = tRP.formatPNL$default(xmvM8742getPNLConverter4MWxQ20$default, activity.fARcdN(), false, false, 0, 14, null);
            java.lang.String str = (java.lang.String) pNL$default.component1();
            int iIntValue = ((java.lang.Number) pNL$default.component2()).intValue();
            c46283tOp.AkhnZx.setContent(C56390yDp.OLrzqt(strCopydefault, str));
            c46283tOp.AkhnZx.setContentColor(iIntValue);
            c46283tOp.AkhnZx.setHint(true);
            c46283tOp.AkhnZx.setHintClickListener(new Function0() { // from class: o.tFo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46036tFl.StateListAnimator.OLrzqt(c46036tFl, activity);
                }
            });
            java.lang.String percentTruncateWithSymbol$default = C46367tRs.formatPercentTruncateWithSymbol$default(activity.AuCTel(), 0, false, 3, null);
            int percentColor$default = C46368tRt.getPercentColor$default(C33129mqd.djBIcL(activity.AuCTel()), 0, 1, null);
            c46283tOp.fIwbmz.setContent(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.ORxRYg), percentTruncateWithSymbol$default));
            c46283tOp.fIwbmz.setContentColor(percentColor$default);
            kotlin.Pair pairOLrzqt = tRS.OLrzqt(activity.copydefault(), activity.EZpvd(), activity.AEQbTJ(), activity.AYXKKw(), (48 & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : null, (48 & 16) != 0 ? false : false, (48 & 32) != 0 ? null : null, (48 & 64) != 0 ? null : null);
            java.lang.String str2 = (java.lang.String) pairOLrzqt.component1();
            c46283tOp.fJNWhG.setContent(C56390yDp.OLrzqt(C33069mpW.copydefault(C47501trL.Fragment.aKErDB, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", (java.lang.String) pairOLrzqt.component2()))), str2));
            c46283tOp.fJNWhG.setHint(true);
            c46283tOp.fJNWhG.setHintClickListener(new Function0() { // from class: o.tFk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46036tFl.StateListAnimator.KWHzl(c46036tFl, activity);
                }
            });
            kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = C46367tRs.copydefault(activity.values(), activity.EZpvd(), activity.AEQbTJ());
            java.lang.String strComponent1 = pairCopydefault.component1();
            java.lang.String strComponent2 = pairCopydefault.component2();
            int i2 = C47501trL.Fragment.zLAIeZ;
            java.lang.String strDbNXlk2 = activity.DbNXlk();
            if (strDbNXlk2 != null && strDbNXlk2.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDbNXlk2)) {
                strComponent2 = strDbNXlk2;
            }
            c46283tOp.AuCTel.setContent(C56390yDp.OLrzqt(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strComponent2))), strComponent1));
            c46283tOp.fARcdN.setContent(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.onStart), pTB.formatICUPercent$default(activity.fJNWhG(), RoundingMode.DOWN, null, null, java.lang.Double.valueOf(100.0d), null, 22, null)));
            c46283tOp.fARcdN.setHint(true);
            c46283tOp.fARcdN.setHintClickListener(new Function0() { // from class: o.tFr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46036tFl.StateListAnimator.OLrzqt(c46036tFl);
                }
            });
            final java.lang.String strM8752formatPricePlaineLEVFN8$default = tRR.m8752formatPricePlaineLEVFN8$default(xmsEZpvd, activity.AYXKKw(), activity.iwGUEr(), false, false, 12, null);
            final java.lang.String strM8752formatPricePlaineLEVFN8$default2 = tRR.m8752formatPricePlaineLEVFN8$default(xmsEZpvd, activity.djBIcL(), activity.iwGUEr(), true, false, 8, null);
            c46283tOp.ejfBZ.setContent(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.QKVWgx), strM8752formatPricePlaineLEVFN8$default));
            c46283tOp.ejfBZ.setHint(true);
            c46283tOp.ejfBZ.setHintClickListener(new Function0() { // from class: o.tFp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46036tFl.StateListAnimator.copydefault(c46036tFl, strM8752formatPricePlaineLEVFN8$default, strM8752formatPricePlaineLEVFN8$default2);
                }
            });
            c46283tOp.iwGUEr.setContent(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.OcIXYQ), tRR.m8747formatMarkOrLastPricePlainP8q7UIc$default(xmsEZpvd, activity.AkhnZx(), false, false, 6, null)));
            c46283tOp.uzCIH.setContent(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C47501trL.Fragment.fcfzuX), tRR.m8754formatSLOrLiqPricePlaineLEVFN8$default(xmsEZpvd, activity.isConnected(), activity.iwGUEr(), false, false, 12, null)));
            c46283tOp.uzCIH.setHint(true);
            c46283tOp.uzCIH.setHintClickListener(new Function0() { // from class: o.tFq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C46036tFl.StateListAnimator.KWHzl(c46036tFl);
                }
            });
            c46283tOp.AYXKKw.setPadding(0, 0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
            Flow flow = c46283tOp.valueOf;
            Intrinsics.checkNotNullExpressionValue(flow, "");
            flow.setVisibility(8);
        }

        public static final Unit OLrzqt(C46036tFl c46036tFl, InterfaceC46072tGu.Activity activity) {
            c46036tFl.AhwBna.invoke(activity.uzCIH());
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C46036tFl c46036tFl, InterfaceC46072tGu.Activity activity) {
            c46036tFl.KWHzl.invoke(activity);
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(C46036tFl c46036tFl) {
            c46036tFl.copydefault.invoke();
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(C46036tFl c46036tFl, java.lang.String str, java.lang.String str2) {
            c46036tFl.AEQbTJ.invoke(str, str2);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(C46036tFl c46036tFl) {
            c46036tFl.OLrzqt.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.tFl$Activity */
    public final class Activity extends RecyclerView.ViewHolder {
        public final /* synthetic */ C46036tFl AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C46036tFl c46036tFl, C46287tOt c46287tOt) {
            super(c46287tOt.getRoot());
            Intrinsics.checkNotNullParameter(c46287tOt, "");
            this.AEQbTJ = c46036tFl;
        }
    }
}
