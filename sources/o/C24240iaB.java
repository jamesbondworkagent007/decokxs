package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo;
import com.okinc.business.dexlogic.main.swap.history.bean.AccelerateBean;
import com.okinc.business.dexui.main.swap.history.list.itemviewbinding.DexBridgeHistoryListViewBinder$1;
import com.okinc.wallet.api.bean.WalletTxDetailBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.iaB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24240iaB extends AbstractC25436iwg<DefiBridgeOrderInfo, C23425hxw> {
    public final boolean EZpvd;
    public final LifecycleOwner KWHzl;
    public final Function1<DefiBridgeOrderInfo, Unit> OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dexlogic.bean.DefiBridgeOrderInfo, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C24240iaB(boolean z, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super DefiBridgeOrderInfo, Unit> function1) {
        super(DexBridgeHistoryListViewBinder$1.INSTANCE);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = z;
        this.KWHzl = lifecycleOwner;
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.iaB$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iaB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
            return "web3_dex_history_swap_bridge_" + str + "_" + str2;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C25435iwf<C23425hxw> c25435iwf, @NotNull final DefiBridgeOrderInfo defiBridgeOrderInfo) {
        java.lang.String anyTokenSymbol;
        Intrinsics.checkNotNullParameter(c25435iwf, "");
        Intrinsics.checkNotNullParameter(defiBridgeOrderInfo, "");
        final C23425hxw c23425hxw = (C23425hxw) c25435iwf.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) defiBridgeOrderInfo.getFormatTime()) && !this.EZpvd) {
            c23425hxw.isConnected.setText(defiBridgeOrderInfo.getFormatTime());
            c23425hxw.isConnected.setVisibility(0);
            android.view.View view = c23425hxw.EZpvd;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(Intrinsics.EZpvd(getAdapter().getItems().get(0), defiBridgeOrderInfo) ^ true ? 0 : 8);
        } else {
            c23425hxw.isConnected.setVisibility(8);
            c23425hxw.EZpvd.setVisibility(8);
        }
        c23425hxw.fetchVPNInfo.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.QhsCdEQhsCdE));
        if (C33129mqd.OLrzqt((java.lang.CharSequence) defiBridgeOrderInfo.getReplaceTokenSymbol())) {
            anyTokenSymbol = defiBridgeOrderInfo.getReplaceTokenSymbol();
        } else {
            anyTokenSymbol = C33129mqd.OLrzqt((java.lang.CharSequence) defiBridgeOrderInfo.getAnyTokenSymbol()) ? defiBridgeOrderInfo.getAnyTokenSymbol() : defiBridgeOrderInfo.getToTokenSymbol();
        }
        ((C23425hxw) c25435iwf.EZpvd()).getRoot().setContentDescription(Companion.OLrzqt(defiBridgeOrderInfo.getFromChainName(), defiBridgeOrderInfo.getToChainName()));
        c23425hxw.valueOf.setText(defiBridgeOrderInfo.getFromChainName() + " " + C33070mpX.AYXKKw(C23274hvD.Fragment.WS) + " " + defiBridgeOrderInfo.getToChainName());
        c23425hxw.AYXKKw.setState(defiBridgeOrderInfo.getStatus());
        c23425hxw.DbNXlk.setCountDownState(defiBridgeOrderInfo);
        AppCompatTextView appCompatTextView = c23425hxw.values;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(Intrinsics.EZpvd((java.lang.Object) defiBridgeOrderInfo.getStatus(), (java.lang.Object) "1") ? 0 : 8);
        AppCompatTextView appCompatTextView2 = c23425hxw.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(Intrinsics.EZpvd((java.lang.Object) defiBridgeOrderInfo.getStatus(), (java.lang.Object) "1") ? 0 : 8);
        C23273hvC c23273hvC = C23273hvC.AEQbTJ;
        c23425hxw.values.setText(pTF.KWHzl.AEQbTJ(c23273hvC.EZpvd("-" + KWHzl(defiBridgeOrderInfo), defiBridgeOrderInfo.getFromTokenSymbol(), " ")));
        AppCompatTextView appCompatTextView3 = c23425hxw.AkhnZx;
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        android.content.Context context = c23425hxw.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatTextView3.setTextColor(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null));
        c23425hxw.AkhnZx.setText(c23273hvC.EZpvd(Marker.ANY_NON_NULL_MARKER + OLrzqt(defiBridgeOrderInfo), anyTokenSymbol, " "));
        c23425hxw.ejfBZ.EZpvd(defiBridgeOrderInfo.getFromIcon());
        c23425hxw.ejfBZ.KWHzl(defiBridgeOrderInfo.getToIcon());
        c23425hxw.fJNWhG.setAccelerateSize(28);
        c23425hxw.fJNWhG.copydefault(new AccelerateBean(defiBridgeOrderInfo.isShowSpeedUp(), defiBridgeOrderInfo.isShowCancel(), defiBridgeOrderInfo.isShowSpeedUpCancel(), (java.lang.String) null, false, 24, (DefaultConstructorMarker) null), defiBridgeOrderInfo.getStatus(), copydefault(), defiBridgeOrderInfo.getSpeedUpTxHash());
        copydefault(c23425hxw, defiBridgeOrderInfo);
        c23425hxw.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.iaD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C24240iaB.AEQbTJ(this.OLrzqt, defiBridgeOrderInfo, view2);
            }
        });
        C52794wYp c52794wYp = c23425hxw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        c52794wYp.setVisibility(defiBridgeOrderInfo.showFacetSwapButton("default_trade") ? 0 : 8);
        if (Intrinsics.EZpvd((java.lang.Object) defiBridgeOrderInfo.getStatus(), (java.lang.Object) "200") || Intrinsics.EZpvd((java.lang.Object) defiBridgeOrderInfo.getStatus(), (java.lang.Object) "202")) {
            c23425hxw.KWHzl.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.AuCTelauCTel));
        } else {
            c23425hxw.KWHzl.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.aJZHYI));
        }
        C25352ivB.setOnDoubleCheckClickListener$default(c23425hxw.KWHzl, 0L, new Function1() { // from class: o.iaC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24240iaB.EZpvd(defiBridgeOrderInfo, c23425hxw, this, (android.view.View) obj);
            }
        }, 1, null);
        OLrzqt(c23425hxw);
    }

    public static final void AEQbTJ(C24240iaB c24240iaB, DefiBridgeOrderInfo defiBridgeOrderInfo, android.view.View view) {
        c24240iaB.OLrzqt.invoke(defiBridgeOrderInfo);
    }

    public static final Unit EZpvd(DefiBridgeOrderInfo defiBridgeOrderInfo, C23425hxw c23425hxw, C24240iaB c24240iaB, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C52794wYp c52794wYp = c23425hxw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52794wYp, "");
        android.content.Context context = c23425hxw.KWHzl.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C25352ivB.OLrzqt(defiBridgeOrderInfo, "default_trade", c52794wYp, context, c24240iaB.KWHzl);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final C23425hxw c23425hxw) {
        c23425hxw.getRoot().post(new java.lang.Runnable() { // from class: o.iaG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C24240iaB.AEQbTJ(c23425hxw);
            }
        });
    }

    public static final void AEQbTJ(C23425hxw c23425hxw) {
        int measuredWidth = c23425hxw.AEQbTJ.getMeasuredWidth();
        int minimumWidth = c23425hxw.djBIcL.getMinimumWidth();
        int iDpInt$default = (measuredWidth - minimumWidth) - C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        if (measuredWidth != 0 && minimumWidth != 0 && c23425hxw.AkhnZx.getMaxWidth() != iDpInt$default) {
            c23425hxw.AkhnZx.setMaxWidth(iDpInt$default);
        }
        int measuredWidth2 = c23425hxw.OLrzqt.getMeasuredWidth();
        int minimumWidth2 = c23425hxw.valueOf.getMinimumWidth();
        int i = measuredWidth2 - minimumWidth2;
        if (measuredWidth2 == 0 || minimumWidth2 == 0 || c23425hxw.DbNXlk.getMaxWidth() == i) {
            return;
        }
        c23425hxw.DbNXlk.setMaxWidth(i);
        c23425hxw.values.setMaxWidth(i);
    }

    public final java.lang.String KWHzl(DefiBridgeOrderInfo defiBridgeOrderInfo) {
        return C23271hvA.copydefault.EZpvd(defiBridgeOrderInfo.getFromAmount(), "12");
    }

    public final java.lang.String OLrzqt(DefiBridgeOrderInfo defiBridgeOrderInfo) {
        return !KWHzl(defiBridgeOrderInfo.getStatus(), defiBridgeOrderInfo.getToAmount()) ? C23271hvA.getShowData$default(C23271hvA.copydefault, defiBridgeOrderInfo.getToAmount(), false, RoundingMode.DOWN, false, false, 16, null) : C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestCompanionCREATOR1);
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        return !Intrinsics.EZpvd((java.lang.Object) "1", (java.lang.Object) str) || Intrinsics.EZpvd((java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL, (java.lang.Object) str2);
    }

    public final boolean copydefault() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault("default_trade").fARcdN().valueOf();
        return interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.QfsBiF() || interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.zsXlph();
    }

    public final void copydefault(C23425hxw c23425hxw, final DefiBridgeOrderInfo defiBridgeOrderInfo) {
        InterfaceC9731bbC chainMetaWithRealChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault(), C33129mqd.valueOf(defiBridgeOrderInfo.getChainId()), false, 2, null);
        long jAhwBna = chainMetaWithRealChainId$default != null ? chainMetaWithRealChainId$default.AhwBna() : 0L;
        android.content.Context context = c23425hxw.getRoot().getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            C24328ibk c24328ibk = c23425hxw.fJNWhG;
            androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            java.lang.String orderId = defiBridgeOrderInfo.getOrderId();
            java.lang.String speedUpTxHash = defiBridgeOrderInfo.getSpeedUpTxHash();
            java.lang.String userWalletAddress = defiBridgeOrderInfo.getUserWalletAddress();
            C22380heK c22380heK = C22380heK.OLrzqt;
            InterfaceC9738bbJ interfaceC9738bbJValueOf = c22380heK.copydefault("default_trade").fARcdN().valueOf();
            long j = jAhwBna;
            c24328ibk.copydefault(supportFragmentManager, new WalletTxDetailBean("", speedUpTxHash, userWalletAddress, jAhwBna, interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.DbNXlk() : null, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), orderId, new yHO() { // from class: o.iaE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C24240iaB.KWHzl(defiBridgeOrderInfo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
            C24328ibk c24328ibk2 = c23425hxw.fJNWhG;
            androidx.fragment.app.FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            java.lang.String orderId2 = defiBridgeOrderInfo.getOrderId();
            java.lang.String speedUpTxHash2 = defiBridgeOrderInfo.getSpeedUpTxHash();
            java.lang.String userWalletAddress2 = defiBridgeOrderInfo.getUserWalletAddress();
            InterfaceC9738bbJ interfaceC9738bbJValueOf2 = c22380heK.copydefault("default_trade").fARcdN().valueOf();
            c24328ibk2.EZpvd(supportFragmentManager2, new WalletTxDetailBean("", speedUpTxHash2, userWalletAddress2, j, interfaceC9738bbJValueOf2 != null ? interfaceC9738bbJValueOf2.DbNXlk() : null, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), orderId2, new yHO() { // from class: o.iaF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C24240iaB.AhwBna(defiBridgeOrderInfo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
            C24328ibk c24328ibk3 = c23425hxw.fJNWhG;
            androidx.fragment.app.FragmentManager supportFragmentManager3 = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            java.lang.String orderId3 = defiBridgeOrderInfo.getOrderId();
            java.lang.String speedUpTxHash3 = defiBridgeOrderInfo.getSpeedUpTxHash();
            java.lang.String userWalletAddress3 = defiBridgeOrderInfo.getUserWalletAddress();
            InterfaceC9738bbJ interfaceC9738bbJValueOf3 = c22380heK.copydefault("default_trade").fARcdN().valueOf();
            c24328ibk3.KWHzl(supportFragmentManager3, new WalletTxDetailBean("", speedUpTxHash3, userWalletAddress3, j, interfaceC9738bbJValueOf3 != null ? interfaceC9738bbJValueOf3.DbNXlk() : null, (java.lang.String) null, (java.lang.String) null, 96, (DefaultConstructorMarker) null), orderId3, new yHO() { // from class: o.iaJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return C24240iaB.OLrzqt(defiBridgeOrderInfo, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, (java.lang.String) obj3);
                }
            });
        }
    }

    public static final Unit KWHzl(DefiBridgeOrderInfo defiBridgeOrderInfo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            defiBridgeOrderInfo.setSpeedUpTxHash(str2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(DefiBridgeOrderInfo defiBridgeOrderInfo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            defiBridgeOrderInfo.setSpeedUpTxHash(str2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DefiBridgeOrderInfo defiBridgeOrderInfo, boolean z, java.lang.String str, java.lang.String str2) {
        if (z && str2 != null) {
            defiBridgeOrderInfo.setSpeedUpTxHash(str2);
        }
        return Unit.INSTANCE;
    }
}
