package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.constant.WalletStatus;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.ApproveItem;
import com.okinc.business.defi.biz.net.bean.ApproveToken;
import com.okinc.business.defi.biz.net.bean.EIP7702RevokeInfo;
import com.okinc.business.defi.wallet.approve.ApproveListItem;
import com.okinc.components.track.TrackChannel;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC13761dXh;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.dXD;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eMK extends AbstractC32998moE implements InterfaceC54847xXn {
    public AbstractC16587emj djBIcL;
    public AbstractC12782ctV valueOf;
    public C59534zip AhwBna = new C59534zip();
    public final StateListAnimator AEQbTJ = new StateListAnimator(new xZA(0, 300, null, 4, null));
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.eMN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eMK.AEQbTJ();
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eMM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eMK.OLrzqt();
        }
    });
    public long KWHzl = Long.MIN_VALUE;
    public final int EZpvd = C13754dXa.TaskDescription.dzCpvv;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public static final class StateListAnimator extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public StateListAnimator(xZA xza) {
            super("TxHistorySub-approveManager", xza);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.eLm.refresh$default(o.eLm, java.lang.String, boolean, int, java.lang.Object):void */
        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            eMK emk = eMK.this;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                WalletTxHistorySubManager.SubResponse subResponse = (WalletTxHistorySubManager.SubResponse) next;
                if (subResponse.getTxType() == 4 || subResponse.getTxType() == 6) {
                    AbstractC12782ctV abstractC12782ctV = emk.valueOf;
                    Intrinsics.copydefault(abstractC12782ctV);
                    java.lang.String address = subResponse.getAddress();
                    Intrinsics.copydefault((java.lang.Object) address);
                    if (abstractC12782ctV.DbNXlk(address)) {
                        break;
                    }
                }
            }
            if (((WalletTxHistorySubManager.SubResponse) next) != null) {
                C15523eLm.refresh$default(C15523eLm.KWHzl, null, false, 2, null);
            }
        }
    }

    public static final java.util.ArrayList AEQbTJ() {
        return new java.util.ArrayList();
    }

    private final java.util.ArrayList<ApproveListItem> valueOf() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public static final java.util.ArrayList OLrzqt() {
        return new java.util.ArrayList();
    }

    public final java.util.ArrayList<ApproveListItem> KWHzl() {
        return (java.util.ArrayList) this.copydefault.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC16587emj abstractC16587emj = (AbstractC16587emj) DataBindingUtil.bind(view);
        this.djBIcL = abstractC16587emj;
        if (abstractC16587emj != null && (recyclerView2 = abstractC16587emj.EZpvd) != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        AbstractC16587emj abstractC16587emj2 = this.djBIcL;
        if (abstractC16587emj2 != null && (recyclerView = abstractC16587emj2.EZpvd) != null) {
            recyclerView.setAdapter(this.AhwBna);
        }
        this.AhwBna.register(ApproveListItem.class, new Application());
        this.AhwBna.register(java.lang.String.class, new Activity());
        C15523eLm.KWHzl.AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.eMP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eMK.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        }));
        AYXKKw();
        gEmmrt();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.eMV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eMK.OLrzqt(this.AEQbTJ, (xXO) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eMT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eMK.djBIcL(function1, obj);
            }
        });
    }

    public static final class Application extends AbstractC13764dXk {
        public Application() {
            super(false);
        }

        @Override // o.AbstractC13764dXk
        public void KWHzl(ApproveListItem approveListItem) {
            Intrinsics.checkNotNullParameter(approveListItem, "");
            ActivityC13761dXh.Application application = ActivityC13761dXh.Companion;
            FragmentActivity fragmentActivityRequireActivity = eMK.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            application.copydefault(fragmentActivityRequireActivity, approveListItem, java.lang.Long.valueOf(eMK.this.KWHzl));
        }
    }

    public static final class Activity extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {

        public static final class TaskDescription extends RecyclerView.ViewHolder {
            public TaskDescription(android.view.View view) {
                super(view);
            }
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return new TaskDescription(layoutInflater.inflate(C13754dXa.TaskDescription.run, viewGroup, false));
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.String str) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(str, "");
            viewHolder.itemView.setVisibility(4);
        }
    }

    public static final Unit OLrzqt(eMK emk, java.util.List list) {
        C17108ewa c17108ewa;
        ConstraintLayout constraintLayoutKWHzl;
        java.util.ArrayList arrayList;
        java.lang.String str;
        AbstractC16966etr abstractC16966etr;
        android.view.View root;
        C17108ewa c17108ewa2;
        ConstraintLayout constraintLayoutKWHzl2;
        AbstractC16966etr abstractC16966etr2;
        android.view.View root2;
        C17108ewa c17108ewa3;
        ConstraintLayout constraintLayoutKWHzl3;
        if (list == null) {
            emk.AhwBna.setItems(new java.util.ArrayList());
            AbstractC16587emj abstractC16587emj = emk.djBIcL;
            if (abstractC16587emj != null && (c17108ewa3 = abstractC16587emj.OLrzqt) != null && (constraintLayoutKWHzl3 = c17108ewa3.getRoot()) != null) {
                constraintLayoutKWHzl3.setVisibility(8);
            }
            emk.valueOf().clear();
            emk.KWHzl().clear();
            AbstractC16587emj abstractC16587emj2 = emk.djBIcL;
            if (abstractC16587emj2 != null && (abstractC16966etr2 = abstractC16587emj2.AEQbTJ) != null && (root2 = abstractC16966etr2.getRoot()) != null) {
                root2.setVisibility(8);
            }
        } else if (list.isEmpty()) {
            emk.AhwBna.setItems(new java.util.ArrayList());
            AbstractC16587emj abstractC16587emj3 = emk.djBIcL;
            if (abstractC16587emj3 != null && (c17108ewa2 = abstractC16587emj3.OLrzqt) != null && (constraintLayoutKWHzl2 = c17108ewa2.getRoot()) != null) {
                constraintLayoutKWHzl2.setVisibility(0);
            }
            emk.valueOf().clear();
            emk.KWHzl().clear();
            AbstractC16587emj abstractC16587emj4 = emk.djBIcL;
            if (abstractC16587emj4 != null && (abstractC16966etr = abstractC16587emj4.AEQbTJ) != null && (root = abstractC16966etr.getRoot()) != null) {
                root.setVisibility(8);
            }
        } else {
            emk.valueOf().clear();
            if (Intrinsics.EZpvd(emk.AhwBna.getItems(), emk.valueOf())) {
                emk.AhwBna.notifyDataSetChanged();
            }
            java.util.ArrayList<ApproveListItem> arrayListValueOf = emk.valueOf();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ApproveItem approveItem = (ApproveItem) it.next();
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(C33129mqd.valueOf(approveItem.getCoinId()));
                java.lang.String strDjBIcL = c10854bwMKWHzl != null ? c10854bwMKWHzl.djBIcL() : null;
                if (strDjBIcL == null) {
                    strDjBIcL = "";
                }
                java.lang.String coinId = approveItem.getCoinId();
                java.lang.String str2 = coinId == null ? "" : coinId;
                android.content.res.Resources resources = emk.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                java.lang.String showProjectIconUri = approveItem.getShowProjectIconUri(resources, C13754dXa.Activity.aKErDB);
                java.lang.String string = emk.getString(C13754dXa.FragmentManager.RckOJh);
                Intrinsics.checkNotNullExpressionValue(string, "");
                java.lang.String showProjectName = approveItem.getShowProjectName(string);
                boolean zIsEIP7702Upgrade = approveItem.isEIP7702Upgrade();
                java.util.List<EIP7702RevokeInfo> chainList = approveItem.getChainList();
                if (chainList != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(chainList, 10));
                    java.util.Iterator<T> it2 = chainList.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(java.lang.Long.valueOf(C11600cUg.copydefault(((EIP7702RevokeInfo) it2.next()).getChainIndex())));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                java.lang.String str3 = (approveItem.isEIP7702Upgrade() && (strDjBIcL = approveItem.getProjectDesc()) == null) ? "" : strDjBIcL;
                java.lang.String projectName = approveItem.getProjectName();
                java.lang.String network = approveItem.getNetwork();
                java.lang.String approvalAddress = approveItem.getApprovalAddress();
                java.lang.String linkApprovalAddress = approveItem.getLinkApprovalAddress();
                boolean zIsRiskyProject = approveItem.isRiskyProject();
                java.lang.Integer blackTagType = approveItem.getBlackTagType();
                java.lang.Long blackTagAlarmTime = approveItem.getBlackTagAlarmTime();
                java.util.List<ApproveToken> tokens = approveItem.getTokens();
                int iCopydefault = C11600cUg.copydefault(tokens != null ? java.lang.Integer.valueOf(tokens.size()) : null);
                java.lang.Integer blackTagLongTimeDayLimit = approveItem.getBlackTagLongTimeDayLimit();
                java.util.List<ApproveToken> tokens2 = approveItem.getTokens();
                if (tokens2 == null || tokens2.isEmpty()) {
                    str = "2";
                } else {
                    java.util.Iterator<T> it3 = tokens2.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((ApproveToken) it3.next()).getStatus(), (java.lang.Object) "1")) {
                            str = "1";
                            break;
                        }
                    }
                    str = "2";
                }
                arrayList2.add(new ApproveListItem(str2, showProjectIconUri, showProjectName, str3, projectName, network, approvalAddress, linkApprovalAddress, zIsRiskyProject, blackTagType, blackTagAlarmTime, iCopydefault, blackTagLongTimeDayLimit, str, false, null, zIsEIP7702Upgrade, arrayList, null, 311296, null));
            }
            arrayListValueOf.addAll(arrayList2);
            AbstractC16587emj abstractC16587emj5 = emk.djBIcL;
            if (abstractC16587emj5 != null && (c17108ewa = abstractC16587emj5.OLrzqt) != null && (constraintLayoutKWHzl = c17108ewa.getRoot()) != null) {
                constraintLayoutKWHzl.setVisibility(8);
            }
            emk.EZpvd(emk.valueOf(), emk.KWHzl);
        }
        emk.AhwBna.notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(eMK emk, xXO xxo) {
        emk.djBIcL();
        emk.gEmmrt();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ eMK EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, eMK emk) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = emk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3Approvals_Mid_Revoke_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.EZpvd.AhwBna();
            }
        }
    }

    public final void AYXKKw() {
        AbstractC16966etr abstractC16966etr;
        android.widget.TextView textView;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        c55279xgu.AkhnZx(0);
        c55279xgu.isConnected(ContextCompat.getColor(contextRequireContext, C52761wXj.Activity.invokespecialaKhcqp));
        c55279xgu.OLrzqt(C55298xhM.EZpvd(6.0f, contextRequireContext));
        AbstractC16587emj abstractC16587emj = this.djBIcL;
        Intrinsics.copydefault(abstractC16587emj);
        android.view.View root = abstractC16587emj.AEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        c55280xgv.KWHzl(root, c55279xgu);
        AbstractC16587emj abstractC16587emj2 = this.djBIcL;
        if (abstractC16587emj2 == null || (abstractC16966etr = abstractC16587emj2.AEQbTJ) == null || (textView = abstractC16966etr.copydefault) == null) {
            return;
        }
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
    }

    public final void AhwBna() {
        dXD.Application application = dXD.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        application.copydefault(fragmentActivityRequireActivity);
    }

    private final void AEQbTJ(java.util.ArrayList<ApproveListItem> arrayList) {
        C17108ewa c17108ewa;
        ConstraintLayout constraintLayoutKWHzl;
        AbstractC16966etr abstractC16966etr;
        AbstractC12782ctV abstractC12782ctV;
        C17108ewa c17108ewa2;
        ConstraintLayout constraintLayoutKWHzl2;
        int i = 8;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            AbstractC16587emj abstractC16587emj = this.djBIcL;
            if (abstractC16587emj != null && (c17108ewa2 = abstractC16587emj.OLrzqt) != null && (constraintLayoutKWHzl2 = c17108ewa2.getRoot()) != null) {
                constraintLayoutKWHzl2.setVisibility(0);
            }
            this.AhwBna.setItems(arrayList);
            this.AhwBna.notifyDataSetChanged();
        } else {
            AbstractC16587emj abstractC16587emj2 = this.djBIcL;
            if (abstractC16587emj2 != null && (c17108ewa = abstractC16587emj2.OLrzqt) != null && (constraintLayoutKWHzl = c17108ewa.getRoot()) != null) {
                constraintLayoutKWHzl.setVisibility(8);
            }
            if (C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).fetchVPNInfo() == WalletStatus.DemoWallet) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() + 1);
                arrayList2.addAll(arrayList);
                arrayList2.add("Demo wallet bottom space");
                this.AhwBna.setItems(arrayList2);
            } else {
                this.AhwBna.setItems(arrayList);
            }
            this.AhwBna.notifyDataSetChanged();
        }
        AbstractC16587emj abstractC16587emj3 = this.djBIcL;
        if (abstractC16587emj3 == null || (abstractC16966etr = abstractC16587emj3.AEQbTJ) == null) {
            return;
        }
        AbstractC12782ctV abstractC12782ctV2 = this.valueOf;
        if ((abstractC12782ctV2 != null && abstractC12782ctV2.zsXlph()) || ((abstractC12782ctV = this.valueOf) != null && abstractC12782ctV.QfsBiF())) {
            android.view.View root = abstractC16966etr.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
            return;
        }
        android.view.View root2 = abstractC16966etr.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        if (!arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ApproveListItem) it.next()).fARcdN()) {
                        i = 0;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        root2.setVisibility(i);
        AppCompatTextView appCompatTextView = abstractC16966etr.AEQbTJ;
        int iCopydefault = 0;
        for (ApproveListItem approveListItem : arrayList) {
            iCopydefault += approveListItem.fARcdN() ? approveListItem.copydefault() : 0;
        }
        appCompatTextView.setText(java.lang.String.valueOf(iCopydefault));
        AppCompatTextView appCompatTextView2 = abstractC16966etr.OLrzqt;
        int i3 = C13754dXa.Dialog.EZpvd;
        if (!arrayList.isEmpty()) {
            java.util.Iterator<T> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((ApproveListItem) it2.next()).fARcdN() && (i2 = i2 + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        appCompatTextView2.setText(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) pTD.KWHzl(this, i3, i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", "")))).toString());
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        EZpvd(valueOf(), j);
        this.KWHzl = j;
    }

    public final void EZpvd(java.util.ArrayList<ApproveListItem> arrayList, long j) {
        java.util.List<java.lang.Long> listAhwBna;
        C10854bwM c10854bwMKWHzl;
        if (j == Long.MIN_VALUE) {
            if (this.KWHzl == Long.MIN_VALUE) {
                AEQbTJ(arrayList);
                return;
            }
            KWHzl().clear();
            this.AhwBna.notifyDataSetChanged();
            KWHzl().addAll(arrayList);
            AEQbTJ(KWHzl());
            return;
        }
        KWHzl().clear();
        this.AhwBna.notifyDataSetChanged();
        for (ApproveListItem approveListItem : arrayList) {
            if (approveListItem.fetchVPNInfo() || (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(approveListItem.djBIcL())))) == null || c10854bwMKWHzl.AEQbTJ() != j) {
                if (approveListItem.fetchVPNInfo() && (listAhwBna = approveListItem.AhwBna()) != null) {
                    C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(j);
                    if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) listAhwBna), c10854bwMKWHzl2 != null ? java.lang.Long.valueOf(c10854bwMKWHzl2.fetchVPNInfo()) : null)) {
                    }
                }
            }
            KWHzl().add(approveListItem);
        }
        AEQbTJ(KWHzl());
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C15523eLm.refresh$default(C15523eLm.KWHzl, null, false, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        djBIcL();
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void gEmmrt() {
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false), this);
        final Function1 function1 = new Function1() { // from class: o.eMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eMK.OLrzqt(this.KWHzl, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eMK.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.eMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eMK.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eMQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eMK.copydefault(function12, obj);
            }
        });
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.AEQbTJ);
    }

    public static final Unit OLrzqt(eMK emk, AbstractC12782ctV abstractC12782ctV) {
        emk.valueOf = abstractC12782ctV;
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.AEQbTJ);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C15523eLm.KWHzl.AEQbTJ(true);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C15523eLm.KWHzl.AEQbTJ(false);
    }
}
