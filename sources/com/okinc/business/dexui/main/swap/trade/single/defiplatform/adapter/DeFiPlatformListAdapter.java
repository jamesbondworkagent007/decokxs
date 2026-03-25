package com.okinc.business.dexui.main.swap.trade.single.defiplatform.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.adapter.DeFiPlatformListAdapter;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C22361hds;
import o.C22380heK;
import o.C22416heu;
import o.C23271hvA;
import o.C23272hvB;
import o.C23274hvD;
import o.C23311hvo;
import o.C23421hxs;
import o.C23422hxt;
import o.C23423hxu;
import o.C24695iig;
import o.C24997ioR;
import o.C25382ivf;
import o.C25385ivi;
import o.C25386ivj;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55113xdn;
import o.C55258xgZ;
import o.C55296xhK;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DeFiPlatformListAdapter extends ListAdapter<ActionBar, RecyclerView.ViewHolder> {
    public final Function0<Unit> AEQbTJ;
    public final String AhwBna;
    public final Function0<Unit> EZpvd;
    public final Function0<Unit> KWHzl;
    public final Function0<Unit> OLrzqt;
    public final yHO<String, String, Boolean, Unit> copydefault;
    public final DexMultiTokenInfoBean valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeFiPlatformListAdapter(@NotNull String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull yHO<? super String, ? super String, ? super Boolean, Unit> yho, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04) {
        super(new TaskDescription());
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        Intrinsics.checkNotNullParameter(function04, "");
        this.AhwBna = str;
        this.valueOf = dexMultiTokenInfoBean;
        this.copydefault = yho;
        this.KWHzl = function0;
        this.OLrzqt = function02;
        this.EZpvd = function03;
        this.AEQbTJ = function04;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ActionBar item = getItem(i);
        if (item instanceof ActionBar.Activity) {
            return ViewType.DE_FI_PLATFORM.ordinal();
        }
        if (item instanceof ActionBar.C0332ActionBar) {
            return ViewType.LOADING.ordinal();
        }
        if (item instanceof ActionBar.Application) {
            return ViewType.REMINDER.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == ViewType.DE_FI_PLATFORM.ordinal()) {
            C23423hxu c23423hxuCopydefault = C23423hxu.copydefault(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c23423hxuCopydefault, "");
            return new Activity(c23423hxuCopydefault);
        }
        if (i == ViewType.LOADING.ordinal()) {
            C23421hxs c23421hxsOLrzqt = C23421hxs.OLrzqt(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(c23421hxsOLrzqt, "");
            return new Application(c23421hxsOLrzqt);
        }
        C23422hxt c23422hxtKWHzl = C23422hxt.KWHzl(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c23422hxtKWHzl, "");
        return new StateListAnimator(c23422hxtKWHzl);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof Activity) {
            Activity activity = (Activity) viewHolder;
            String str = this.AhwBna;
            ActionBar item = getItem(i);
            Intrinsics.copydefault(item, "");
            activity.AEQbTJ(str, (ActionBar.Activity) item, this.valueOf, this.copydefault, this.KWHzl, this.OLrzqt, this.EZpvd, this.AEQbTJ);
            return;
        }
        if (viewHolder instanceof Application) {
            ((Application) viewHolder).KWHzl();
        } else if (viewHolder instanceof StateListAnimator) {
            ActionBar item2 = getItem(i);
            Intrinsics.copydefault(item2, "");
            ((StateListAnimator) viewHolder).AEQbTJ((ActionBar.Application) item2);
        }
    }

    public static final class Activity extends RecyclerView.ViewHolder {
        public final C23423hxu EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C23423hxu c23423hxu) {
            super(c23423hxu.getRoot());
            Intrinsics.checkNotNullParameter(c23423hxu, "");
            this.EZpvd = c23423hxu;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: android.widget.TextView */
        /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: android.widget.ImageView */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: o.xgZ */
        /* JADX DEBUG: Multi-variable search result rejected for r4v29, resolved type: android.widget.TextView */
        /* JADX DEBUG: Multi-variable search result rejected for r4v39, resolved type: android.widget.TextView */
        /* JADX DEBUG: Multi-variable search result rejected for r4v41, resolved type: androidx.recyclerview.widget.RecyclerView */
        /* JADX DEBUG: Multi-variable search result rejected for r4v43, resolved type: android.widget.ImageView */
        /* JADX DEBUG: Multi-variable search result rejected for r4v49, resolved type: android.widget.TextView */
        /* JADX DEBUG: Multi-variable search result rejected for r4v53, resolved type: android.widget.TextView */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v41 */
        /* JADX WARN: Type inference failed for: r7v42, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v43 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void AEQbTJ(@NotNull String str, @NotNull ActionBar.Activity activity, DexMultiTokenInfoBean dexMultiTokenInfoBean, yHO<? super String, ? super String, ? super Boolean, Unit> yho, Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03, @NotNull Function0<Unit> function04) {
            String strAhwBna;
            String decimals;
            ?? r7;
            Pair pairOLrzqt;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(function02, "");
            Intrinsics.checkNotNullParameter(function03, "");
            Intrinsics.checkNotNullParameter(function04, "");
            if (C22416heu.wlaJM() && activity.gEmmrt()) {
                this.EZpvd.AEQbTJ.setVisibility(0);
                this.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.setShuffleMode));
                this.EZpvd.AEQbTJ.setOKDSStyle(7);
                if (activity.valueOf()) {
                    this.EZpvd.copydefault.setVisibility(0);
                } else {
                    this.EZpvd.copydefault.setVisibility(8);
                }
            } else if (C33129mqd.OLrzqt(activity.AhwBna(), "0") || (strAhwBna = activity.AhwBna()) == null || strAhwBna.length() == 0) {
                this.EZpvd.copydefault.setVisibility(8);
                if (activity.valueOf()) {
                    this.EZpvd.AEQbTJ.setVisibility(0);
                    this.EZpvd.AEQbTJ.setOKDSStyle(6);
                    this.EZpvd.AEQbTJ.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.removeQueueItemAt));
                } else {
                    this.EZpvd.AEQbTJ.setVisibility(8);
                }
            } else {
                if (activity.valueOf()) {
                    this.EZpvd.copydefault.setVisibility(0);
                } else {
                    this.EZpvd.copydefault.setVisibility(8);
                }
                this.EZpvd.AEQbTJ.setVisibility(0);
                this.EZpvd.AEQbTJ.setText("-" + C23311hvo.formatPercent$default(activity.AhwBna(), false, 0, 0, null, null, 30, null));
                this.EZpvd.AEQbTJ.setOKDSStyle(13);
            }
            ConstraintLayout root = this.EZpvd.getRoot();
            root.setOnClickListener(new ViewOnClickListenerC0333Activity(root, 1000L, yho, activity));
            LinearLayout linearLayout = this.EZpvd.ejfBZ;
            linearLayout.setOnClickListener(new StateListAnimator(linearLayout, 1000L, function0));
            ImageView imageView = this.EZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            String strCopydefault = activity.copydefault();
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            C25386ivj.KWHzl(imageView, strCopydefault, new C25385ivi(C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx), null, 0.0f, 0, 14, null));
            ImageView imageView2 = this.EZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(Intrinsics.EZpvd((Object) activity.KWHzl(), (Object) "11") ? 0 : 8);
            ImageView imageView3 = this.EZpvd.EZpvd;
            imageView3.setOnClickListener(new ActionBar(imageView3, 1000L, function04));
            this.EZpvd.gEmmrt.setText(activity.OLrzqt());
            this.EZpvd.gEmmrt.setContentDescription("web3_dex_swap_de_fi_provider_id_" + activity.KWHzl());
            this.EZpvd.getRoot().setSelected(activity.AkhnZx());
            TextView textView = this.EZpvd.OLrzqt;
            C23271hvA c23271hvA = C23271hvA.copydefault;
            String strAEQbTJ = activity.AEQbTJ();
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            if (dexMultiTokenInfoBean == null || (decimals = dexMultiTokenInfoBean.getDecimals()) == null) {
                decimals = "12";
            }
            textView.setText(c23271hvA.EZpvd(strAEQbTJ, decimals));
            TextView textView2 = this.EZpvd.fJNWhG;
            String tokenSymbol = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            textView2.setText(tokenSymbol);
            String strAYXKKw = activity.AYXKKw();
            if (strAYXKKw == null || strAYXKKw.length() == 0) {
                r7 = 0;
                this.EZpvd.djBIcL.setVisibility(8);
            } else {
                r7 = 0;
                this.EZpvd.djBIcL.setVisibility(0);
                if (activity.values()) {
                    pairOLrzqt = C56390yDp.OLrzqt(activity.AYXKKw(), "");
                } else if (C33129mqd.copydefault(activity.AYXKKw(), activity.EZpvd())) {
                    pairOLrzqt = C56390yDp.OLrzqt(C33129mqd.subS$default(activity.AYXKKw(), activity.EZpvd(), null, null, null, 14, null), "");
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(C33129mqd.subS$default(activity.EZpvd(), activity.AYXKKw(), null, null, null, 14, null), "-");
                }
                String str2 = (String) pairOLrzqt.component1();
                String str3 = (String) pairOLrzqt.component2();
                String showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, str2, false, false, null, false, 30, null);
                this.EZpvd.djBIcL.setText(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.sendMediaButton), C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str3 + showDataWithPrefix$default))));
            }
            if (activity.values()) {
                this.EZpvd.DbNXlk.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DQzvGN));
                this.EZpvd.fetchVPNInfo.setVisibility(r7);
                if (C33129mqd.OLrzqt(activity.EZpvd(), "0")) {
                    this.EZpvd.isConnected.setVisibility(8);
                } else {
                    this.EZpvd.isConnected.setVisibility(r7);
                    TextView textView3 = this.EZpvd.isConnected;
                    C23272hvB c23272hvB = C23272hvB.KWHzl;
                    String strEZpvd = activity.EZpvd();
                    textView3.setText(C23272hvB.getShowDataWithPrefix$default(c23272hvB, strEZpvd == null ? "" : strEZpvd, false, false, null, false, 30, null));
                    TextView textView4 = this.EZpvd.isConnected;
                    textView4.setPaintFlags(textView4.getPaintFlags() | 16);
                    this.EZpvd.isConnected.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
                }
            } else {
                this.EZpvd.DbNXlk.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.hlkKmr));
                this.EZpvd.fetchVPNInfo.setVisibility(8);
                this.EZpvd.isConnected.setVisibility(r7);
                TextView textView5 = this.EZpvd.isConnected;
                C23272hvB c23272hvB2 = C23272hvB.KWHzl;
                String strEZpvd2 = activity.EZpvd();
                String showDataWithPrefix$default2 = C23272hvB.getShowDataWithPrefix$default(c23272hvB2, strEZpvd2 == null ? "" : strEZpvd2, false, false, null, false, 30, null);
                if (!C33129mqd.OLrzqt((CharSequence) activity.EZpvd())) {
                    showDataWithPrefix$default2 = null;
                }
                if (showDataWithPrefix$default2 == null) {
                    showDataWithPrefix$default2 = "--";
                }
                textView5.setText(showDataWithPrefix$default2);
                TextView textView6 = this.EZpvd.isConnected;
                textView6.setPaintFlags(textView6.getPaintFlags() & (-17));
                this.EZpvd.isConnected.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
            if (activity.djBIcL().isEmpty()) {
                this.EZpvd.fARcdN.setVisibility(8);
                this.EZpvd.fIwbmz.setVisibility(8);
                this.EZpvd.AuCTel.setVisibility(8);
            } else {
                this.EZpvd.fARcdN.setVisibility(r7);
                this.EZpvd.fIwbmz.setVisibility(r7);
                this.EZpvd.AuCTel.setVisibility(r7);
                RecyclerView recyclerView = this.EZpvd.fIwbmz;
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), r7, r7));
                recyclerView.setAdapter(new C24997ioR(activity.djBIcL(), function0));
                recyclerView.setContentDescription("web3_dex_swap_provider_route_row");
                Intrinsics.copydefault(recyclerView);
            }
            if (Intrinsics.EZpvd((Object) activity.KWHzl(), (Object) "11")) {
                this.EZpvd.valueOf.setVisibility(r7);
                this.EZpvd.valueOf.setHelperLabelType(1);
                this.EZpvd.valueOf.setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.DSiOMJ));
                C55258xgZ c55258xgZ = this.EZpvd.valueOf;
                c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, function02));
                this.EZpvd.AkhnZx.setVisibility(r7);
                this.EZpvd.AYXKKw.setVisibility(r7);
                this.EZpvd.AkhnZx.setText(C24695iig.copydefault(str, C22380heK.OLrzqt.copydefault(str).EZpvd(true).gEmmrt().OLrzqt().getValue(), true));
                this.EZpvd.AkhnZx.setContentDescription("web3_dex_swap_provider_liquidity_row");
                TextView textView7 = this.EZpvd.AkhnZx;
                textView7.setOnClickListener(new TaskDescription(textView7, 1000L, function03));
                ImageView imageView4 = this.EZpvd.AYXKKw;
                imageView4.setOnClickListener(new Fragment(imageView4, 1000L, function03));
                return;
            }
            this.EZpvd.valueOf.setVisibility(8);
            this.EZpvd.AkhnZx.setVisibility(8);
            this.EZpvd.AYXKKw.setVisibility(8);
        }

        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ Function0 KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(View view, long j, Function0 function0) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.KWHzl = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.KWHzl.invoke();
                }
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.defiplatform.adapter.DeFiPlatformListAdapter$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0333Activity implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ ActionBar.Activity KWHzl;
            public final /* synthetic */ yHO OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0333Activity(View view, long j, yHO yho, ActionBar.Activity activity) {
                this.AEQbTJ = view;
                this.EZpvd = j;
                this.OLrzqt = yho;
                this.KWHzl = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    yHO yho = this.OLrzqt;
                    if (yho != null) {
                        String strKWHzl = this.KWHzl.KWHzl();
                        if (strKWHzl == null) {
                            strKWHzl = "";
                        }
                        String strOLrzqt = this.KWHzl.OLrzqt();
                        yho.invoke(strKWHzl, strOLrzqt != null ? strOLrzqt : "", Boolean.TRUE);
                    }
                }
            }
        }

        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ View AEQbTJ;
            public final /* synthetic */ Function0 KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(View view, long j, Function0 function0) {
                this.AEQbTJ = view;
                this.OLrzqt = j;
                this.KWHzl = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.KWHzl.invoke();
                }
            }
        }

        public static final class Fragment implements View.OnClickListener {
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ View KWHzl;
            public final /* synthetic */ Function0 OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Fragment(View view, long j, Function0 function0) {
                this.KWHzl = view;
                this.EZpvd = j;
                this.OLrzqt = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.OLrzqt.invoke();
                }
            }
        }

        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ View EZpvd;
            public final /* synthetic */ long OLrzqt;
            public final /* synthetic */ Function0 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(View view, long j, Function0 function0) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.copydefault = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    Function0 function0 = this.copydefault;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }

        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ Function0 AEQbTJ;
            public final /* synthetic */ View OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(View view, long j, Function0 function0) {
                this.OLrzqt = view;
                this.copydefault = j;
                this.AEQbTJ = function0;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    this.AEQbTJ.invoke();
                }
            }
        }
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final C23421hxs OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C23421hxs c23421hxs) {
            super(c23421hxs.getRoot());
            Intrinsics.checkNotNullParameter(c23421hxs, "");
            this.OLrzqt = c23421hxs;
        }

        public final void KWHzl() {
            C55113xdn root = this.OLrzqt.getRoot();
            Intrinsics.copydefault(root);
            C22361hds.OLrzqt(root, CDNSourceManager.LottieSource.DEFI_PLATFORMS_LOADING);
            root.setAutoMirrored(true);
            C55113xdn.showLoading$default(root, 0L, 1, null);
        }
    }

    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final C23422hxt EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C23422hxt c23422hxt) {
            super(c23422hxt.getRoot());
            Intrinsics.checkNotNullParameter(c23422hxt, "");
            this.EZpvd = c23422hxt;
        }

        public final void AEQbTJ(@NotNull final ActionBar.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            OKReminder root = this.EZpvd.getRoot();
            root.setStyle(2);
            root.OLrzqt().setVisibility(8);
            root.setTitle(application.KWHzl());
            root.setMessage(application.EZpvd());
            root.setPrimaryAction(application.copydefault(), new Function0() { // from class: o.ioS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DeFiPlatformListAdapter.StateListAnimator.OLrzqt(application);
                }
            });
        }

        public static final Unit OLrzqt(ActionBar.Application application) {
            application.AEQbTJ().invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription extends DiffUtil.ItemCallback<ActionBar> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull ActionBar actionBar, @NotNull ActionBar actionBar2) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(actionBar2, "");
            if ((actionBar instanceof ActionBar.Activity) && (actionBar2 instanceof ActionBar.Activity)) {
                return Intrinsics.EZpvd((Object) ((ActionBar.Activity) actionBar).KWHzl(), (Object) ((ActionBar.Activity) actionBar2).KWHzl());
            }
            return Intrinsics.EZpvd(actionBar, actionBar2);
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull ActionBar actionBar, @NotNull ActionBar actionBar2) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(actionBar2, "");
            return Intrinsics.EZpvd(actionBar, actionBar2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ViewType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType DE_FI_PLATFORM = new ViewType("DE_FI_PLATFORM", 0);
        public static final ViewType LOADING = new ViewType("LOADING", 1);
        public static final ViewType REMINDER = new ViewType("REMINDER", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{DE_FI_PLATFORM, LOADING, REMINDER};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ViewType> getEntries() {
            return $ENTRIES;
        }

        private ViewType(String str, int i) {
        }

        static {
            ViewType[] viewTypeArr$values = $values();
            $VALUES = viewTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(viewTypeArr$values);
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    public interface ActionBar {

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.defiplatform.adapter.DeFiPlatformListAdapter$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0332ActionBar implements ActionBar {
            public static final C0332ActionBar KWHzl = new C0332ActionBar();

            private C0332ActionBar() {
            }
        }

        public static final class Application implements ActionBar {
            public final String AEQbTJ;
            public final CharSequence EZpvd;
            public final CharSequence KWHzl;
            public final Function0<Unit> OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.defiplatform.adapter.DeFiPlatformListAdapter$ActionBar$Application */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Application copy$default(Application application, CharSequence charSequence, CharSequence charSequence2, String str, Function0 function0, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = application.EZpvd;
                }
                if ((i & 2) != 0) {
                    charSequence2 = application.KWHzl;
                }
                if ((i & 4) != 0) {
                    str = application.AEQbTJ;
                }
                if ((i & 8) != 0) {
                    function0 = application.OLrzqt;
                }
                return application.OLrzqt(charSequence, charSequence2, str, function0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Function0<Unit> AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CharSequence EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CharSequence KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull String str, @NotNull Function0<Unit> function0) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                Intrinsics.checkNotNullParameter(charSequence2, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(function0, "");
                return new Application(charSequence, charSequence2, str, function0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                CharSequence charSequence = this.EZpvd;
                CharSequence charSequence2 = this.KWHzl;
                return "Reminder(title=" + ((Object) charSequence) + ", message=" + ((Object) charSequence2) + ", actionText=" + this.AEQbTJ + ", action=" + this.OLrzqt + ")";
            }

            public Application(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull String str, @NotNull Function0<Unit> function0) {
                Intrinsics.checkNotNullParameter(charSequence, "");
                Intrinsics.checkNotNullParameter(charSequence2, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(function0, "");
                this.EZpvd = charSequence;
                this.KWHzl = charSequence2;
                this.AEQbTJ = str;
                this.OLrzqt = function0;
            }
        }

        public static final class Activity implements ActionBar {
            public final boolean AEQbTJ;
            public final String AYXKKw;
            public final String AhwBna;
            public final String AkhnZx;
            public final boolean EZpvd;
            public final boolean KWHzl;
            public final boolean OLrzqt;
            public final String copydefault;
            public final String djBIcL;
            public final String gEmmrt;
            public final List<String> isConnected;
            public final String valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AYXKKw() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AkhnZx() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(String str, String str2, String str3, String str4, String str5, String str6, @NotNull List<String> list, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(str, str2, str3, str4, str5, str6, list, str7, z, z2, z3, z4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> djBIcL() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((Object) this.copydefault, (Object) activity.copydefault) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) activity.djBIcL) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) activity.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) activity.valueOf) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) activity.AkhnZx) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) activity.AYXKKw) && Intrinsics.EZpvd(this.isConnected, activity.isConnected) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) activity.gEmmrt) && this.OLrzqt == activity.OLrzqt && this.AEQbTJ == activity.AEQbTJ && this.EZpvd == activity.EZpvd && this.KWHzl == activity.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean gEmmrt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.copydefault;
                int iHashCode = str == null ? 0 : str.hashCode();
                String str2 = this.djBIcL;
                int iHashCode2 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.AhwBna;
                int iHashCode3 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.valueOf;
                int iHashCode4 = str4 == null ? 0 : str4.hashCode();
                String str5 = this.AkhnZx;
                int iHashCode5 = str5 == null ? 0 : str5.hashCode();
                String str6 = this.AYXKKw;
                int iHashCode6 = str6 == null ? 0 : str6.hashCode();
                int iHashCode7 = this.isConnected.hashCode();
                String str7 = this.gEmmrt;
                return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "DeFiPlatformItem(id=" + this.copydefault + ", name=" + this.djBIcL + ", logo=" + this.AhwBna + ", receiveAmount=" + this.valueOf + ", toTokenPrice=" + this.AkhnZx + ", quoteNetWorkFeeOfMoney=" + this.AYXKKw + ", route=" + this.isConnected + ", reducePercent=" + this.gEmmrt + ", isBest=" + this.OLrzqt + ", isApproved=" + this.AEQbTJ + ", isSelected=" + this.EZpvd + ", isPMM=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean valueOf() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean values() {
                return this.KWHzl;
            }

            public Activity(String str, String str2, String str3, String str4, String str5, String str6, @NotNull List<String> list, String str7, boolean z, boolean z2, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(list, "");
                this.copydefault = str;
                this.djBIcL = str2;
                this.AhwBna = str3;
                this.valueOf = str4;
                this.AkhnZx = str5;
                this.AYXKKw = str6;
                this.isConnected = list;
                this.gEmmrt = str7;
                this.OLrzqt = z;
                this.AEQbTJ = z2;
                this.EZpvd = z3;
                this.KWHzl = z4;
            }
        }
    }
}
