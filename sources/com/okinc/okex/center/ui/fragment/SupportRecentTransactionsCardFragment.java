package com.okinc.okex.center.ui.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayout;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.LandingTransactionDisplayModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.center.ui.fragment.SupportRecentTransactionsCardFragment;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC45037siI;
import o.ActivityC44878sfI;
import o.C33070mpX;
import o.C33129mqd;
import o.C44857seo;
import o.C44901sff;
import o.C44962sgn;
import o.C44995shT;
import o.C45073sis;
import o.C45146skL;
import o.C45363soQ;
import o.C45397soy;
import o.C47315tni;
import o.C47351toR;
import o.C52761wXj;
import o.C52794wYp;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56403yEb;
import o.InterfaceC56387yDm;
import o.rVN;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SupportRecentTransactionsCardFragment extends AbstractC45037siI implements C44995shT.ActionBar {
    public static final String gEmmrt;
    public boolean AhwBna;
    public C47351toR djBIcL;

    @yCM
    public C45397soy selfServiceUseCase;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sjM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportRecentTransactionsCardFragment.AYXKKw(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.sjQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportRecentTransactionsCardFragment.djBIcL(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.sjP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SupportRecentTransactionsCardFragment.AhwBna(this.KWHzl);
        }
    });
    public final int valueOf = C47315tni.ActionBar.QUSxYX;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public final C45397soy djBIcL() {
        C45397soy c45397soy = this.selfServiceUseCase;
        if (c45397soy != null) {
            return c45397soy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.ui.fragment.SupportRecentTransactionsCardFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SupportRecentTransactionsCardFragment OLrzqt(@NotNull String str, @NotNull List<LandingTransactionDisplayModel> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment = new SupportRecentTransactionsCardFragment();
            supportRecentTransactionsCardFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key_feature", str), C56390yDp.OLrzqt("key_transactions_item", new ArrayList(list))));
            return supportRecentTransactionsCardFragment;
        }
    }

    static {
        String simpleName = SupportRecentTransactionsCardFragment.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        gEmmrt = simpleName;
    }

    public final C44995shT gEmmrt() {
        return (C44995shT) this.fetchVPNInfo.getValue();
    }

    public static final C44995shT AYXKKw(SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
        C44995shT c44995shT = new C44995shT();
        c44995shT.EZpvd(supportRecentTransactionsCardFragment);
        return c44995shT;
    }

    /* JADX DEBUG: Possible override for method o.siI.OLrzqt()V */
    public final String OLrzqt() {
        return (String) this.AkhnZx.getValue();
    }

    public static final String djBIcL(SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
        Bundle arguments = supportRecentTransactionsCardFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("key_feature", "");
        }
        return null;
    }

    public final List<LandingTransactionDisplayModel> valueOf() {
        return (List) this.isConnected.getValue();
    }

    public static final List AhwBna(SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
        Bundle arguments = supportRecentTransactionsCardFragment.getArguments();
        if (arguments == null) {
            return yDY.AhwBna();
        }
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("key_transactions_item", LandingTransactionDisplayModel.class);
            return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
        }
        ArrayList parcelableArrayList2 = arguments.getParcelableArrayList("key_transactions_item");
        return parcelableArrayList2 == null ? yDY.AhwBna() : parcelableArrayList2;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        ConstraintLayout constraintLayout2;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        Intrinsics.checkNotNullParameter(view, "");
        this.djBIcL = C47351toR.copydefault(view);
        String strOLrzqt = OLrzqt();
        if (C44857seo.copydefault(strOLrzqt != null ? strOLrzqt : "")) {
            C47351toR c47351toR = this.djBIcL;
            if (c47351toR != null && (linearLayout5 = c47351toR.gEmmrt) != null) {
                linearLayout5.setVisibility(C33129mqd.KWHzl((Collection) valueOf()) ? 8 : 0);
            }
            C47351toR c47351toR2 = this.djBIcL;
            if (c47351toR2 != null && (linearLayout4 = c47351toR2.AhwBna) != null) {
                linearLayout4.setVisibility(valueOf().isEmpty() ? 8 : 0);
            }
            C47351toR c47351toR3 = this.djBIcL;
            if (c47351toR3 != null && (constraintLayout2 = c47351toR3.djBIcL) != null) {
                constraintLayout2.setVisibility(8);
            }
            if (C33129mqd.KWHzl((Collection) valueOf())) {
                AYXKKw();
            }
        } else {
            C47351toR c47351toR4 = this.djBIcL;
            if (c47351toR4 != null && (linearLayout2 = c47351toR4.gEmmrt) != null) {
                linearLayout2.setVisibility(0);
            }
            C47351toR c47351toR5 = this.djBIcL;
            if (c47351toR5 != null && (linearLayout = c47351toR5.AhwBna) != null) {
                linearLayout.setVisibility(8);
            }
            C47351toR c47351toR6 = this.djBIcL;
            if (c47351toR6 != null && (constraintLayout = c47351toR6.djBIcL) != null) {
                constraintLayout.setVisibility(valueOf().isEmpty() ? 8 : 0);
            }
            if (C33129mqd.KWHzl((Collection) valueOf())) {
                AhwBna();
            }
        }
        C47351toR c47351toR7 = this.djBIcL;
        if (c47351toR7 != null && (linearLayout3 = c47351toR7.gEmmrt) != null) {
            linearLayout3.setOnClickListener(new FragmentManager(linearLayout3, 1000L, this));
        }
        view.post(new Runnable() { // from class: o.sjJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SupportRecentTransactionsCardFragment.valueOf(this.KWHzl);
            }
        });
    }

    public static final void valueOf(SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
        rVN.reportFullyDrawn$default((Fragment) supportRecentTransactionsCardFragment, true, (String) null, 2, (Object) null);
    }

    public final void AhwBna() {
        C47351toR c47351toR = this.djBIcL;
        if (c47351toR != null) {
            LandingTransactionDisplayModel landingTransactionDisplayModel = (LandingTransactionDisplayModel) CollectionsKt___CollectionsKt.AuCTelauCTel(valueOf());
            TransactionBean transaction = landingTransactionDisplayModel.getTransaction();
            TransactionDisplayModel transactionDisplayModel$default = transaction != null ? C45073sis.toTransactionDisplayModel$default(transaction, landingTransactionDisplayModel.getContextualScenario(), null, 2, null) : null;
            ContextualScenarioModel contextualScenario = landingTransactionDisplayModel.getContextualScenario();
            final String dataTrackingKey = contextualScenario != null ? contextualScenario.getDataTrackingKey() : null;
            if (dataTrackingKey == null) {
                dataTrackingKey = "";
            }
            if (transactionDisplayModel$default != null) {
                LinearLayout linearLayout = c47351toR.valueOf;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                TextView textView = c47351toR.isConnected;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                TextView textView2 = c47351toR.DbNXlk;
                String label = transactionDisplayModel$default.getLabel();
                if (label == null) {
                    label = "";
                }
                textView2.setText(label);
                TextView textView3 = c47351toR.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                String labelColor = transactionDisplayModel$default.getLabelColor();
                if (labelColor == null) {
                    labelColor = "";
                }
                KWHzl(textView3, labelColor);
                c47351toR.fetchVPNInfo.setText(transactionDisplayModel$default.getDisplayAmount());
                c47351toR.isConnected.setText(transactionDisplayModel$default.getDisplayDescription());
                FlexboxLayout flexboxLayout = c47351toR.EZpvd;
                Intrinsics.checkNotNullExpressionValue(flexboxLayout, "");
                AEQbTJ(flexboxLayout, transactionDisplayModel$default, landingTransactionDisplayModel.getSelfServiceTools(), dataTrackingKey);
                ConstraintLayout constraintLayout = c47351toR.djBIcL;
                constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this, transactionDisplayModel$default, dataTrackingKey));
                C45363soQ.onSessionIdEvent$default("SupportCenter_OneDayTxn_Card_View", false, new Function1() { // from class: o.sjL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return SupportRecentTransactionsCardFragment.KWHzl(dataTrackingKey, (EventParamsList) obj);
                    }
                }, 1, null);
            } else {
                LinearLayout linearLayout2 = c47351toR.valueOf;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(8);
                TextView textView4 = c47351toR.isConnected;
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setVisibility(8);
            }
            LinearLayout linearLayout3 = c47351toR.gEmmrt;
            linearLayout3.setOnClickListener(new Activity(linearLayout3, 1000L, this));
        }
    }

    public static final class Application implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ TransactionDisplayModel KWHzl;
        public final /* synthetic */ String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(String str, TransactionDisplayModel transactionDisplayModel) {
            this.OLrzqt = str;
            this.KWHzl = transactionDisplayModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "index", this.OLrzqt, false, 4, null);
            EventParamsList.put$default(eventParamsList, "click_area", "entire_card", false, 4, null);
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, this.KWHzl.getId(), false, 4, null);
        }
    }

    public static final Unit KWHzl(String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "index", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        C47351toR c47351toR = this.djBIcL;
        if (c47351toR != null) {
            C45146skL c45146skL = c47351toR.OLrzqt;
            c45146skL.setOnClickListener(new ActionBar(c45146skL, 1000L, this));
            RecyclerView recyclerView = c47351toR.AkhnZx;
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(gEmmrt());
            C44995shT c44995shTGEmmrt = gEmmrt();
            RecyclerView recyclerView2 = c47351toR.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
            c44995shTGEmmrt.copydefault(recyclerView2, (List) valueOf());
            AEQbTJ(valueOf());
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ SupportRecentTransactionsCardFragment OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = supportRecentTransactionsCardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.fetchVPNInfo();
            }
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ SupportRecentTransactionsCardFragment AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = supportRecentTransactionsCardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.fetchVPNInfo();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ SupportRecentTransactionsCardFragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = supportRecentTransactionsCardFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.fetchVPNInfo();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ String AEQbTJ;
        public final /* synthetic */ SupportRecentTransactionsCardFragment AYXKKw;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ SelfServiceToolBean OLrzqt;
        public final /* synthetic */ TransactionDisplayModel copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, TransactionDisplayModel transactionDisplayModel, SelfServiceToolBean selfServiceToolBean, SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment, String str) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = transactionDisplayModel;
            this.OLrzqt = selfServiceToolBean;
            this.AYXKKw = supportRecentTransactionsCardFragment;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C45363soQ.onSessionIdEvent$default("SupportCenter_OneDayTxn_Card_Click", false, new Dialog(this.AEQbTJ, this.OLrzqt, this.copydefault), 1, null);
                TransactionDisplayModel transactionDisplayModel = this.copydefault;
                this.AYXKKw.OLrzqt(this.OLrzqt, transactionDisplayModel != null ? C45073sis.KWHzl(transactionDisplayModel, this.OLrzqt) : null);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ TransactionDisplayModel AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ SupportRecentTransactionsCardFragment KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, SupportRecentTransactionsCardFragment supportRecentTransactionsCardFragment, TransactionDisplayModel transactionDisplayModel, String str) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = supportRecentTransactionsCardFragment;
            this.AEQbTJ = transactionDisplayModel;
            this.EZpvd = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.EZpvd(this.AEQbTJ);
                C45363soQ.onSessionIdEvent$default("SupportCenter_OneDayTxn_Card_Click", false, new Application(this.EZpvd, this.AEQbTJ), 1, null);
            }
        }
    }

    public final void KWHzl(@NotNull TextView textView, @NotNull String str) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) "red")) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gsvlRV));
        } else if (Intrinsics.EZpvd((Object) str, (Object) "green")) {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.finishInit));
        } else {
            textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.gqOnQv));
        }
    }

    public final void AEQbTJ(@NotNull FlexboxLayout flexboxLayout, TransactionDisplayModel transactionDisplayModel, List<SelfServiceToolBean> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(flexboxLayout, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean zKWHzl = C33129mqd.KWHzl((Collection) list);
        int i = 0;
        flexboxLayout.setVisibility(C33129mqd.KWHzl((Collection) list) ? 0 : 8);
        if (zKWHzl) {
            int i2 = 1;
            int iDp2px$default = C55298xhM.dp2px$default(8.0f, null, 1, null);
            flexboxLayout.removeAllViews();
            Intrinsics.copydefault(list);
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) list, 2);
            int size = listAhwBna.size();
            int i3 = 0;
            for (Object obj : listAhwBna) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                SelfServiceToolBean selfServiceToolBean = (SelfServiceToolBean) obj;
                Context context = flexboxLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C52794wYp c52794wYp = new C52794wYp(context, null, 0, 6, null);
                c52794wYp.setText(selfServiceToolBean.getTitle());
                c52794wYp.setOKDSSize(32);
                if (Intrinsics.EZpvd(selfServiceToolBean.getPrimary(), Boolean.TRUE)) {
                    c52794wYp.setOKDSType(259);
                } else {
                    c52794wYp.setOKDSType(260);
                }
                FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(i, c52794wYp.AkhnZx());
                layoutParams.setFlexBasisPercent((size <= i2 || ((size % 2 != i2 || i3 != size + (-1)) ? i : i2) != 0) ? 1.0f : 0.48f);
                layoutParams.setMargins(i, i3 < 2 ? i : iDp2px$default, i, i);
                c52794wYp.setLayoutParams(layoutParams);
                c52794wYp.setOnClickListener(new PendingIntent(c52794wYp, 1000L, transactionDisplayModel, selfServiceToolBean, this, str));
                flexboxLayout.addView(c52794wYp);
                i3++;
                i = 0;
                i2 = 1;
            }
        }
    }

    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ SelfServiceToolBean AEQbTJ;
        public final /* synthetic */ String KWHzl;
        public final /* synthetic */ TransactionDisplayModel OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(String str, SelfServiceToolBean selfServiceToolBean, TransactionDisplayModel transactionDisplayModel) {
            this.KWHzl = str;
            this.AEQbTJ = selfServiceToolBean;
            this.OLrzqt = transactionDisplayModel;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "index", this.KWHzl, false, 4, null);
            EventParamsList.put$default(eventParamsList, "click_area", "cta_button", false, 4, null);
            EventParamsList.put$default(eventParamsList, "cta_button_index", this.AEQbTJ.getDataTrackingKey(), false, 4, null);
            TransactionDisplayModel transactionDisplayModel = this.OLrzqt;
            String id = transactionDisplayModel != null ? transactionDisplayModel.getId() : null;
            EventParamsList.put$default(eventParamsList, OtcExtraKeys.ORDER_ID, id == null ? "" : id, false, 4, null);
        }
    }

    public final void fetchVPNInfo() {
        C44901sff.copydefault.EZpvd();
        ActivityC44878sfI.StateListAnimator stateListAnimator = ActivityC44878sfI.Companion;
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        startActivity(ActivityC44878sfI.StateListAnimator.createIntent$default(stateListAnimator, applicationContext, null, 2, null));
    }

    @Override // o.C44995shT.ActionBar
    public void EZpvd(@NotNull TransactionDisplayModel transactionDisplayModel) {
        Intrinsics.checkNotNullParameter(transactionDisplayModel, "");
        Context context = getContext();
        if (context != null) {
            startActivity(C44962sgn.KWHzl.KWHzl(context, (26 & 2) != 0 ? null : transactionDisplayModel, (26 & 4) != 0 ? null : null, (26 & 8) != 0 ? null : null, (26 & 16) != 0 ? null : null, IntegratedSolutionPageType.Transaction));
        }
    }

    @Override // o.C44995shT.ActionBar
    public void OLrzqt(@NotNull SelfServiceToolBean selfServiceToolBean, Object obj) {
        Intrinsics.checkNotNullParameter(selfServiceToolBean, "");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new SupportRecentTransactionsCardFragment$onSelfServiceItemClicked$1$1(this, activity, selfServiceToolBean, obj, null), 3, null);
        }
    }

    public final void AEQbTJ(final List<LandingTransactionDisplayModel> list) {
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        C45363soQ.onSessionIdEvent$default("SupportCenter_Transaction_LandingPage_View", false, new Function1() { // from class: o.sjI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentTransactionsCardFragment.copydefault(list, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final CharSequence AEQbTJ(TransactionType transactionType) {
        return String.valueOf(transactionType);
    }

    public static final Unit copydefault(List list, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TransactionBean transaction = ((LandingTransactionDisplayModel) it.next()).getTransaction();
            arrayList.add(transaction != null ? transaction.getTransactionType() : null);
        }
        EventParamsList.put$default(eventParamsList, "transaction_type", "[" + CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.QbewEr(arrayList), ",", null, null, 0, null, new Function1() { // from class: o.sjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SupportRecentTransactionsCardFragment.AEQbTJ((TransactionType) obj);
            }
        }, 30, null) + "]", false, 4, null);
        return Unit.INSTANCE;
    }
}
