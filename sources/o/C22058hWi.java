package o;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.DexBridgeOrderInfoVo;
import com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexlogic.main.swap.history.detail.DexOrderDetailViewModel;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hWi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C22058hWi extends AbstractC59533zio<DexMultiChildOrderInfoVo, TaskDescription> {
    public final android.content.Context AEQbTJ;
    public final java.lang.String AhwBna;
    public final InterfaceC9738bbJ EZpvd;
    public boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final androidx.fragment.app.FragmentManager copydefault;
    public final Function2<java.lang.String, DexMultiChildOrderInfoVo, Unit> djBIcL;
    public final DexOrderDetailViewModel valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.okinc.business.dexlogic.bean.DexMultiChildOrderInfoVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22058hWi(@NotNull java.lang.String str, @NotNull android.content.Context context, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str2, InterfaceC9738bbJ interfaceC9738bbJ, DexOrderDetailViewModel dexOrderDetailViewModel, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.AhwBna = str;
        this.AEQbTJ = context;
        this.copydefault = fragmentManager;
        this.OLrzqt = str2;
        this.EZpvd = interfaceC9738bbJ;
        this.valueOf = dexOrderDetailViewModel;
        this.djBIcL = function2;
        this.KWHzl = true;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public TaskDescription onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21474hAs c21474hAsOLrzqt = C21474hAs.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21474hAsOLrzqt, "");
        return new TaskDescription(c21474hAsOLrzqt);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull TaskDescription taskDescription, @NotNull DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModel;
        Intrinsics.checkNotNullParameter(taskDescription, "");
        Intrinsics.checkNotNullParameter(dexMultiChildOrderInfoVo, "");
        dexMultiChildOrderInfoVo.setRefundAmountShow(C22689hkB.EZpvd.copydefault(this.AhwBna, dexMultiChildOrderInfoVo.getRefundAmount(), dexMultiChildOrderInfoVo.getStatus()));
        OLrzqt(this.AEQbTJ, taskDescription.OLrzqt(), dexMultiChildOrderInfoVo, this.djBIcL);
        if (dexMultiChildOrderInfoVo.getFirstOrder() && (dexOrderDetailViewModel = this.valueOf) != null && dexOrderDetailViewModel.EZpvd()) {
            taskDescription.OLrzqt().djBIcL.AEQbTJ(true);
            AEQbTJ(taskDescription, dexMultiChildOrderInfoVo);
            OLrzqt(taskDescription, dexMultiChildOrderInfoVo);
        }
    }

    public final void AEQbTJ(final TaskDescription taskDescription, final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        DexOrderDetailViewModel dexOrderDetailViewModel = this.valueOf;
        if (dexOrderDetailViewModel != null) {
            if (C23313hvq.OLrzqt(java.lang.Integer.valueOf(dexOrderDetailViewModel.OLrzqt().size()), 1)) {
                if (C22822hmc.EZpvd(dexMultiChildOrderInfoVo.getMainStatus()) && this.KWHzl) {
                    taskDescription.OLrzqt().djBIcL.setExpand(false);
                }
                taskDescription.OLrzqt().copydefault.setVisibility(0);
            } else if (dexOrderDetailViewModel.OLrzqt().size() == 1) {
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.OLrzqt().get(0);
                Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
                if (dexMultiChildOrderInfoVo3.getLocalFromChildTag()) {
                    if (C22822hmc.EZpvd(dexMultiChildOrderInfoVo.getMainStatus()) && this.KWHzl) {
                        taskDescription.OLrzqt().djBIcL.setExpand(false);
                    }
                    taskDescription.OLrzqt().OLrzqt.setVisibility(0);
                } else if (dexMultiChildOrderInfoVo3.getLocalBridgeToTag()) {
                    if (C22822hmc.EZpvd(dexMultiChildOrderInfoVo.getMainStatus()) && this.KWHzl) {
                        taskDescription.OLrzqt().djBIcL.setExpand(false);
                    }
                    taskDescription.OLrzqt().EZpvd.setVisibility(0);
                }
            }
        }
        taskDescription.OLrzqt().djBIcL.AEQbTJ(new Function1() { // from class: o.hWo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22058hWi.AEQbTJ(this.KWHzl, dexMultiChildOrderInfoVo, taskDescription, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(C22058hWi c22058hWi, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, TaskDescription taskDescription, boolean z) {
        DexOrderDetailViewModel dexOrderDetailViewModel = c22058hWi.valueOf;
        if (dexOrderDetailViewModel != null) {
            if (C23313hvq.OLrzqt(java.lang.Integer.valueOf(dexOrderDetailViewModel.OLrzqt().size()), 1)) {
                if (dexMultiChildOrderInfoVo.getFirstOrder()) {
                    taskDescription.OLrzqt().djBIcL.copydefault(c22058hWi.valueOf.KWHzl(z), dexOrderDetailViewModel.OLrzqt().get(0).getStatus());
                }
                C24278ian c24278ian = taskDescription.OLrzqt().copydefault;
                DexOrderDetailViewModel dexOrderDetailViewModel2 = c22058hWi.valueOf;
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.OLrzqt().get(0);
                Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4 = dexOrderDetailViewModel.OLrzqt().get(1);
                Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo4, "");
                c24278ian.OLrzqt(z, dexOrderDetailViewModel2, dexMultiChildOrderInfoVo3, dexMultiChildOrderInfoVo4, (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna()));
                if (dexOrderDetailViewModel.OLrzqt().get(0).isProgressDoneStatus()) {
                    taskDescription.OLrzqt().djBIcL.setProgress(C56390yDp.OLrzqt(-100L, -100L));
                }
            } else if (dexOrderDetailViewModel.OLrzqt().size() == 1) {
                if (dexOrderDetailViewModel.OLrzqt().get(0).getLocalFromChildTag()) {
                    C22141hZk c22141hZk = taskDescription.OLrzqt().OLrzqt;
                    DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo5 = dexOrderDetailViewModel.OLrzqt().get(0);
                    Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo5, "");
                    DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo6 = dexOrderDetailViewModel.AhwBna().get(1);
                    Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo6, "");
                    c22141hZk.KWHzl(z, dexMultiChildOrderInfoVo5, dexMultiChildOrderInfoVo6);
                    if (dexOrderDetailViewModel.OLrzqt().get(0).isProgressDoneStatus()) {
                        taskDescription.OLrzqt().djBIcL.setProgress(C56390yDp.OLrzqt(-100L, -100L));
                    }
                    if (dexMultiChildOrderInfoVo.getFirstOrder()) {
                        taskDescription.OLrzqt().djBIcL.copydefault(c22058hWi.valueOf.KWHzl(z), dexOrderDetailViewModel.OLrzqt().get(0).getStatus());
                    }
                } else if (dexOrderDetailViewModel.OLrzqt().get(0).getLocalBridgeToTag()) {
                    if (dexMultiChildOrderInfoVo.getFirstOrder()) {
                        taskDescription.OLrzqt().djBIcL.copydefault(c22058hWi.valueOf.KWHzl(z), (dexOrderDetailViewModel.AhwBna().get(0).isOpenPackUpViewStatus() ? dexOrderDetailViewModel.AhwBna() : dexOrderDetailViewModel.OLrzqt()).get(0).getStatus());
                    }
                    hZI hzi = taskDescription.OLrzqt().EZpvd;
                    DexOrderDetailViewModel dexOrderDetailViewModel3 = c22058hWi.valueOf;
                    DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo7 = dexOrderDetailViewModel.AhwBna().get(0);
                    Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo7, "");
                    DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo8 = dexMultiChildOrderInfoVo7;
                    DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo9 = dexOrderDetailViewModel.OLrzqt().get(0);
                    Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo9, "");
                    hzi.copydefault(z, dexOrderDetailViewModel3, dexMultiChildOrderInfoVo8, dexMultiChildOrderInfoVo9, (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna()));
                    if (dexOrderDetailViewModel.OLrzqt().get(0).isProgressDoneStatus()) {
                        taskDescription.OLrzqt().djBIcL.setProgress(C56390yDp.OLrzqt(-100L, -100L));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final TaskDescription taskDescription, final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        OrderDetailBean value;
        DexOrderDetailViewModel dexOrderDetailViewModel = this.valueOf;
        if (dexOrderDetailViewModel != null) {
            if (C23313hvq.OLrzqt(java.lang.Integer.valueOf(dexOrderDetailViewModel.OLrzqt().size()), 1)) {
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2 = dexOrderDetailViewModel.OLrzqt().get(0);
                Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo2, "");
                final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4 = dexOrderDetailViewModel.OLrzqt().get(1);
                Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo4, "");
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo5 = dexMultiChildOrderInfoVo4;
                taskDescription.OLrzqt().copydefault.AEQbTJ(this.valueOf, dexMultiChildOrderInfoVo3, dexMultiChildOrderInfoVo5, (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna()), taskDescription.OLrzqt().djBIcL.EZpvd(), this.AhwBna, new Function1() { // from class: o.hWg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C22058hWi.AEQbTJ(dexMultiChildOrderInfoVo3, this, taskDescription, (kotlin.Pair) obj);
                    }
                });
                taskDescription.OLrzqt().copydefault.setInstructionInfo(dexMultiChildOrderInfoVo3, dexMultiChildOrderInfoVo5, this.djBIcL);
                taskDescription.OLrzqt().copydefault.AEQbTJ(dexMultiChildOrderInfoVo3, this.copydefault, this.OLrzqt, dexOrderDetailViewModel.AEQbTJ());
                if (dexMultiChildOrderInfoVo3.isProgressDoneStatus()) {
                    taskDescription.OLrzqt().djBIcL.setProgress(C56390yDp.OLrzqt(-100L, -100L));
                    taskDescription.OLrzqt().djBIcL.OLrzqt();
                    return;
                }
                return;
            }
            if (dexOrderDetailViewModel.OLrzqt().size() == 1) {
                DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo6 = dexOrderDetailViewModel.OLrzqt().get(0);
                Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo6, "");
                final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo7 = dexMultiChildOrderInfoVo6;
                final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo8 = (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(this.valueOf.AhwBna());
                if (dexMultiChildOrderInfoVo7.getLocalFromChildTag()) {
                    taskDescription.OLrzqt().OLrzqt.EZpvd(this.valueOf, dexMultiChildOrderInfoVo7, taskDescription.OLrzqt().djBIcL.EZpvd(), this.AhwBna, new Function1() { // from class: o.hWj
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C22058hWi.OLrzqt(this.copydefault, dexMultiChildOrderInfoVo7, taskDescription, (kotlin.Pair) obj);
                        }
                    });
                    taskDescription.OLrzqt().OLrzqt.setInstructionInfo(dexMultiChildOrderInfoVo7, this.djBIcL);
                    taskDescription.OLrzqt().OLrzqt.copydefault(dexMultiChildOrderInfoVo7, this.copydefault, this.OLrzqt, dexOrderDetailViewModel.AEQbTJ());
                    if (dexMultiChildOrderInfoVo7.isProgressDoneStatus()) {
                        taskDescription.OLrzqt().djBIcL.setProgress(C56390yDp.OLrzqt(-100L, -100L));
                        taskDescription.OLrzqt().djBIcL.OLrzqt();
                        return;
                    }
                    return;
                }
                if (dexMultiChildOrderInfoVo7.getLocalBridgeToTag()) {
                    DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo9 = dexOrderDetailViewModel.AhwBna().get(0);
                    Intrinsics.checkNotNullExpressionValue(dexMultiChildOrderInfoVo9, "");
                    final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo10 = dexMultiChildOrderInfoVo9;
                    taskDescription.OLrzqt().EZpvd.AEQbTJ(this.valueOf, dexMultiChildOrderInfoVo10, dexMultiChildOrderInfoVo7, (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.AubY(dexOrderDetailViewModel.AhwBna()), taskDescription.OLrzqt().djBIcL.EZpvd(), this.AhwBna, new Function1() { // from class: o.hWk
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C22058hWi.OLrzqt(dexMultiChildOrderInfoVo, this, dexMultiChildOrderInfoVo10, dexMultiChildOrderInfoVo7, dexMultiChildOrderInfoVo8, taskDescription, (kotlin.Pair) obj);
                        }
                    });
                    taskDescription.OLrzqt().EZpvd.OLrzqt(dexMultiChildOrderInfoVo10, this.copydefault, this.OLrzqt, dexOrderDetailViewModel.AEQbTJ());
                    OrderDetailBean value2 = this.valueOf.djBIcL().getValue();
                    AEQbTJ(dexMultiChildOrderInfoVo10, dexMultiChildOrderInfoVo7, dexMultiChildOrderInfoVo8, value2 != null && value2.isFromTimeOut() && (value = this.valueOf.djBIcL().getValue()) != null && value.isBridgeTimeOut(), this.valueOf, taskDescription);
                    taskDescription.OLrzqt().EZpvd.setInstructionInfo(dexMultiChildOrderInfoVo7, this.djBIcL);
                    if (dexMultiChildOrderInfoVo10.isMainProgressDoneStatus() || dexMultiChildOrderInfoVo7.isProgressDoneStatus()) {
                        taskDescription.OLrzqt().djBIcL.setProgress(C56390yDp.OLrzqt(-100L, -100L));
                    }
                }
            }
        }
    }

    public static final Unit AEQbTJ(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, C22058hWi c22058hWi, TaskDescription taskDescription, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean z = ((java.lang.Number) pair.getFirst()).longValue() == -1 && ((java.lang.Number) pair.getSecond()).longValue() == -1;
        c22058hWi.KWHzl(z, dexMultiChildOrderInfoVo, c22058hWi.valueOf, C25352ivB.EZpvd(dexMultiChildOrderInfoVo.isSupportAccelerate(c22058hWi.valueOf.fJNWhG()), z), dexMultiChildOrderInfoVo.isSupportAccelerate(c22058hWi.valueOf.fJNWhG()), taskDescription);
        taskDescription.OLrzqt().djBIcL.setProgress(pair);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C22058hWi c22058hWi, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, TaskDescription taskDescription, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        boolean z = ((java.lang.Number) pair.getFirst()).longValue() == -1;
        c22058hWi.KWHzl(z, dexMultiChildOrderInfoVo, c22058hWi.valueOf, C25352ivB.EZpvd(dexMultiChildOrderInfoVo.isSupportAccelerate(c22058hWi.valueOf.fJNWhG()), z), dexMultiChildOrderInfoVo.isSupportAccelerate(c22058hWi.valueOf.fJNWhG()), taskDescription);
        taskDescription.OLrzqt().djBIcL.setProgress(pair);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, C22058hWi c22058hWi, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo4, TaskDescription taskDescription, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (dexMultiChildOrderInfoVo.getFirstOrder()) {
            c22058hWi.AEQbTJ(dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo3, dexMultiChildOrderInfoVo4, ((java.lang.Number) pair.getFirst()).longValue() == -1 && ((java.lang.Number) pair.getSecond()).longValue() == -1, c22058hWi.valueOf, taskDescription);
        }
        taskDescription.OLrzqt().djBIcL.setProgress(pair);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3, boolean z, DexOrderDetailViewModel dexOrderDetailViewModel, TaskDescription taskDescription) {
        java.lang.String bridgeName;
        if (dexMultiChildOrderInfoVo.isOpenPackUpViewStatus()) {
            KWHzl(z, dexMultiChildOrderInfoVo, dexOrderDetailViewModel, C25352ivB.EZpvd(dexMultiChildOrderInfoVo.isSupportAccelerate(dexOrderDetailViewModel.fJNWhG()), z), dexMultiChildOrderInfoVo.isSupportAccelerate(dexOrderDetailViewModel.fJNWhG()), taskDescription);
            return;
        }
        if (dexMultiChildOrderInfoVo2.isOpenPackUpViewStatus()) {
            boolean zOLrzqt = OLrzqt(z);
            DexBridgeOrderInfoVo bridgeOrderInfoVo = dexMultiChildOrderInfoVo2.getBridgeOrderInfoVo();
            if (bridgeOrderInfoVo == null || (bridgeName = bridgeOrderInfoVo.getBridgeName()) == null) {
                bridgeName = "";
            }
            KWHzl(z, dexMultiChildOrderInfoVo2, dexOrderDetailViewModel, C25352ivB.OLrzqt(zOLrzqt, bridgeName, dexMultiChildOrderInfoVo2.getToChainName()), false, taskDescription);
            return;
        }
        if (dexMultiChildOrderInfoVo3.isOpenPackUpViewStatus()) {
            taskDescription.OLrzqt().djBIcL.OLrzqt();
            if (dexOrderDetailViewModel.fetchVPNInfo()) {
                taskDescription.OLrzqt().EZpvd.setToTimeOutDescView(dexMultiChildOrderInfoVo3);
            }
        }
    }

    public final boolean OLrzqt(boolean z) {
        MutableLiveData<OrderDetailBean> mutableLiveDataDjBIcL;
        OrderDetailBean value;
        DexOrderDetailViewModel dexOrderDetailViewModel = this.valueOf;
        if (dexOrderDetailViewModel == null || (mutableLiveDataDjBIcL = dexOrderDetailViewModel.djBIcL()) == null || (value = mutableLiveDataDjBIcL.getValue()) == null || !value.isOrderInRedeemStatus()) {
            return z;
        }
        return false;
    }

    public final void KWHzl(boolean z, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, DexOrderDetailViewModel dexOrderDetailViewModel, java.lang.String str, boolean z2, TaskDescription taskDescription) {
        dexOrderDetailViewModel.KWHzl(dexMultiChildOrderInfoVo.getStatus(), z, str, z2);
        taskDescription.OLrzqt().djBIcL.EZpvd(str, z2, z, dexMultiChildOrderInfoVo.getStatus(), dexMultiChildOrderInfoVo.isErrorCodeNormal());
    }

    public final void OLrzqt(@NotNull android.content.Context context, C21474hAs c21474hAs, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, @NotNull Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2) {
        InterfaceC9738bbJ interfaceC9738bbJ;
        java.util.ArrayList<DexMultiChildOrderInfoVo> arrayListOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (dexMultiChildOrderInfoVo == null || c21474hAs == null) {
            return;
        }
        AEQbTJ(c21474hAs, dexMultiChildOrderInfoVo, dexMultiChildOrderInfoVo, function2, context);
        copydefault(context, c21474hAs, dexMultiChildOrderInfoVo);
        if (dexMultiChildOrderInfoVo.isPayOrder()) {
            DexOrderDetailViewModel dexOrderDetailViewModel = this.valueOf;
            dexMultiChildOrderInfoVo = (dexOrderDetailViewModel == null || (arrayListOLrzqt = dexOrderDetailViewModel.OLrzqt()) == null) ? null : (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(arrayListOLrzqt);
        }
        InterfaceC9738bbJ interfaceC9738bbJ2 = this.EZpvd;
        OLrzqt(c21474hAs, dexMultiChildOrderInfoVo, interfaceC9738bbJ2 == null || interfaceC9738bbJ2.QfsBiF() || (interfaceC9738bbJ = this.EZpvd) == null || interfaceC9738bbJ.zsXlph());
    }

    public final void AEQbTJ(C21474hAs c21474hAs, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2, Function2<? super java.lang.String, ? super DexMultiChildOrderInfoVo, Unit> function2, final android.content.Context context) {
        C22117hYn c22117hYn = c21474hAs.djBIcL;
        c22117hYn.KWHzl(dexMultiChildOrderInfoVo.getToTokenIcon());
        c22117hYn.setChainName(dexMultiChildOrderInfoVo.getToChainName());
        if (dexMultiChildOrderInfoVo.getFirstOrder()) {
            c22117hYn.setValue(dexMultiChildOrderInfoVo.getCoinFromValueShow(this.AhwBna), dexMultiChildOrderInfoVo.getToTokenSymbol());
        } else {
            c22117hYn.setValue(dexMultiChildOrderInfoVo.getCoinValueShow(this.AhwBna), dexMultiChildOrderInfoVo.getToTokenSymbol());
            c22117hYn.setFinalOrderState(dexMultiChildOrderInfoVo.getStatus());
        }
        c22117hYn.EZpvd(dexMultiChildOrderInfoVo.isShowChildOrderLink());
        c22117hYn.setInstructionInfo(dexMultiChildOrderInfoVo, function2);
        c22117hYn.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.hWn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C22058hWi.AEQbTJ(context, dexMultiChildOrderInfoVo2, view);
            }
        });
        c22117hYn.AEQbTJ(dexMultiChildOrderInfoVo.getFinalOrder() ? 0 : 8);
        if (dexMultiChildOrderInfoVo.getFirstOrder()) {
            c22117hYn.copydefault(true);
            c22117hYn.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.apNbdB));
        } else if (dexMultiChildOrderInfoVo.getFinalOrder()) {
            c22117hYn.copydefault(true);
            c22117hYn.setOrderSideMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.gSBher));
        } else {
            c22117hYn.copydefault(false);
        }
        Intrinsics.copydefault(c22117hYn);
        AEQbTJ(c22117hYn, dexMultiChildOrderInfoVo2, dexMultiChildOrderInfoVo);
    }

    public static final void AEQbTJ(android.content.Context context, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, android.view.View view) {
        C25352ivB.OLrzqt(context, dexMultiChildOrderInfoVo.getExploreUrl());
    }

    public final void AEQbTJ(C22117hYn c22117hYn, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, final DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo2) {
        DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo3;
        java.lang.String strDbNXlk;
        java.util.ArrayList<DexMultiChildOrderInfoVo> arrayListOLrzqt;
        if (dexMultiChildOrderInfoVo.isPayOrder()) {
            DexOrderDetailViewModel dexOrderDetailViewModel = this.valueOf;
            dexMultiChildOrderInfoVo3 = (dexOrderDetailViewModel == null || (arrayListOLrzqt = dexOrderDetailViewModel.OLrzqt()) == null) ? null : (DexMultiChildOrderInfoVo) CollectionsKt___CollectionsKt.firstOrNull(arrayListOLrzqt);
        } else {
            dexMultiChildOrderInfoVo3 = dexMultiChildOrderInfoVo2;
        }
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(dexMultiChildOrderInfoVo3 != null ? dexMultiChildOrderInfoVo3.getFromChainId() : null), false, 2, null);
        long jAhwBna = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L;
        androidx.fragment.app.FragmentManager fragmentManager = this.copydefault;
        java.lang.String transactionHash = dexMultiChildOrderInfoVo3 != null ? dexMultiChildOrderInfoVo3.getTransactionHash() : null;
        java.lang.String str = this.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJ = this.EZpvd;
        if (interfaceC9738bbJ == null || (strDbNXlk = interfaceC9738bbJ.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        c22117hYn.KWHzl(fragmentManager, new WalletTxDetailBean("", transactionHash, str, jAhwBna, strDbNXlk, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), new yHO() { // from class: o.hWh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C22058hWi.EZpvd(dexMultiChildOrderInfoVo2, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit EZpvd(DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            dexMultiChildOrderInfoVo.setTransactionHash(str2);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(android.content.Context context, C21474hAs c21474hAs, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo) {
        if (dexMultiChildOrderInfoVo != null) {
            C22822hmc.EZpvd(dexMultiChildOrderInfoVo.getStatus(), new C22763hlW(context, new C22766hlZ(c21474hAs), dexMultiChildOrderInfoVo));
        }
    }

    public final void OLrzqt(C21474hAs c21474hAs, DexMultiChildOrderInfoVo dexMultiChildOrderInfoVo, boolean z) {
        C22117hYn c22117hYn;
        C22117hYn c22117hYn2;
        if (dexMultiChildOrderInfoVo != null) {
            if (c21474hAs != null && (c22117hYn2 = c21474hAs.djBIcL) != null) {
                c22117hYn2.setAccelerateViewSize(24);
            }
            if (c21474hAs == null || (c22117hYn = c21474hAs.djBIcL) == null) {
                return;
            }
            C22117hYn.updateAccelerateState$default(c22117hYn, new AccelerateBean(dexMultiChildOrderInfoVo.isShowSpeedUp(), dexMultiChildOrderInfoVo.isShowCancel(), dexMultiChildOrderInfoVo.isShowSpeedUpCancel(), (java.lang.String) null, C22420hey.OLrzqt(dexMultiChildOrderInfoVo.getSwapTradeType()), 8, (DefaultConstructorMarker) null), dexMultiChildOrderInfoVo.getStatus(), z, null, 8, null);
        }
    }

    /* JADX INFO: renamed from: o.hWi$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final C21474hAs KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C21474hAs OLrzqt() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C21474hAs c21474hAs) {
            super(c21474hAs.getRoot());
            Intrinsics.checkNotNullParameter(c21474hAs, "");
            this.KWHzl = c21474hAs;
        }
    }
}
