package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.buysell.common.HistoryOrderStatus;
import com.okinc.buysell.ui.pro.transaction.list.bean.ConvertOrderDetailData;
import com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30196lPk;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lPk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30196lPk extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final android.content.Context AEQbTJ;
    public final java.lang.String EZpvd;
    public java.util.List<FiatThirdPartyOrder> KWHzl;
    public final Function1<FiatThirdPartyOrder, Unit> OLrzqt;

    /* JADX INFO: renamed from: o.lPk$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lPk.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.buysell.ui.pro.transaction.list.bean.FiatThirdPartyOrder, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C30196lPk(@NotNull java.lang.String str, android.content.Context context, @NotNull Function1<? super FiatThirdPartyOrder, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = str;
        this.AEQbTJ = context;
        this.OLrzqt = function1;
        this.KWHzl = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        if (i == 1) {
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C31351lsQ.ActionBar.QKudOq, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new StateListAnimator(viewInflate);
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C31351lsQ.ActionBar.AxsJAYsNCnLh, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        return new TaskDescription((AbstractC31582lwk) viewDataBindingInflate, this.AEQbTJ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        if (viewHolder instanceof TaskDescription) {
            ((TaskDescription) viewHolder).EZpvd(this.EZpvd, this.AEQbTJ, this.KWHzl.get(i), this.OLrzqt);
        } else if (viewHolder instanceof StateListAnimator) {
            ((StateListAnimator) viewHolder).KWHzl();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i, @NotNull java.util.List<java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(viewHolder, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            if ((viewHolder instanceof TaskDescription) && (list.get(0) instanceof java.lang.Integer)) {
                java.lang.Object obj = list.get(0);
                Intrinsics.copydefault(obj, "");
                int iIntValue = i - ((java.lang.Integer) obj).intValue();
                if (iIntValue < 0 || iIntValue >= this.KWHzl.size()) {
                    return;
                }
                ((TaskDescription) viewHolder).copydefault(this.AEQbTJ, this.KWHzl.get(iIntValue));
                return;
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }

    public final void OLrzqt(@NotNull java.util.List<FiatThirdPartyOrder> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        if (z) {
            this.KWHzl.addAll(list);
        } else {
            this.KWHzl = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.KWHzl.isEmpty() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.KWHzl.isEmpty()) {
            return 1;
        }
        return this.KWHzl.size();
    }

    /* JADX INFO: renamed from: o.lPk$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.content.Context KWHzl;
        public final AbstractC31582lwk OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull AbstractC31582lwk abstractC31582lwk, android.content.Context context) {
            super(abstractC31582lwk.getRoot());
            Intrinsics.checkNotNullParameter(abstractC31582lwk, "");
            this.OLrzqt = abstractC31582lwk;
            this.KWHzl = context;
        }

        public final void EZpvd(android.content.Context context, int i, boolean z, FiatThirdPartyOrder fiatThirdPartyOrder) {
            int displayName;
            int color;
            HistoryOrderStatus historyOrderStatus = HistoryOrderStatus.PENDING;
            if (i == historyOrderStatus.getValue()) {
                color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.Ufzxmz);
                displayName = historyOrderStatus.getDisplayName();
            } else {
                HistoryOrderStatus historyOrderStatus2 = HistoryOrderStatus.PROCESSING;
                if (i == historyOrderStatus2.getValue()) {
                    color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.Ufzxmz);
                    displayName = historyOrderStatus2.getDisplayName();
                } else {
                    HistoryOrderStatus historyOrderStatus3 = HistoryOrderStatus.COMPLETED;
                    if (i == historyOrderStatus3.getValue()) {
                        color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.call);
                        displayName = historyOrderStatus3.getDisplayName();
                    } else {
                        HistoryOrderStatus historyOrderStatus4 = HistoryOrderStatus.FAILED;
                        if (i == historyOrderStatus4.getValue()) {
                            color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.akftKQ);
                            displayName = historyOrderStatus4.getDisplayName();
                        } else {
                            HistoryOrderStatus historyOrderStatus5 = HistoryOrderStatus.EXPIRED;
                            if (i == historyOrderStatus5.getValue()) {
                                color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.aappFQ);
                                displayName = historyOrderStatus5.getDisplayName();
                            } else {
                                HistoryOrderStatus historyOrderStatus6 = HistoryOrderStatus.REFUNDED;
                                if (i == historyOrderStatus6.getValue()) {
                                    color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.aappFQ);
                                    displayName = historyOrderStatus6.getDisplayName();
                                } else {
                                    HistoryOrderStatus historyOrderStatus7 = HistoryOrderStatus.CANCELLED;
                                    if (i == historyOrderStatus7.getValue()) {
                                        color = ContextCompat.getColor(C43246rlf.OLrzqt.valueOf(), C52761wXj.Activity.aappFQ);
                                        displayName = historyOrderStatus7.getDisplayName();
                                    } else {
                                        displayName = -1;
                                        color = -1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            AbstractC31582lwk abstractC31582lwk = this.OLrzqt;
            if (color != -1) {
                abstractC31582lwk.AuCTel.setTextColor(color);
                abstractC31582lwk.djBIcL.setColorFilter(color);
            }
            abstractC31582lwk.AuCTel.setText(displayName != -1 ? C33070mpX.AYXKKw(displayName) : "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lPk$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bind$default(TaskDescription taskDescription, java.lang.String str, android.content.Context context, FiatThirdPartyOrder fiatThirdPartyOrder, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function1 = new Function1() { // from class: o.lPm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return C30196lPk.TaskDescription.copydefault((FiatThirdPartyOrder) obj2);
                    }
                };
            }
            taskDescription.EZpvd(str, context, fiatThirdPartyOrder, (Function1<? super FiatThirdPartyOrder, Unit>) function1);
        }

        public static final Unit copydefault(FiatThirdPartyOrder fiatThirdPartyOrder) {
            Intrinsics.checkNotNullParameter(fiatThirdPartyOrder, "");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0106  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void EZpvd(@NotNull java.lang.String str, android.content.Context context, @NotNull final FiatThirdPartyOrder fiatThirdPartyOrder, @NotNull final Function1<? super FiatThirdPartyOrder, Unit> function1) {
            java.lang.String strAYXKKw;
            ConvertOrderDetailData convertOrderDetail;
            ConvertOrderDetailData convertOrderDetail2;
            ConvertOrderDetailData convertOrderDetail3;
            java.lang.String upperCase;
            java.lang.String convertBaseAmount;
            java.lang.String convertBaseCurrency;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fiatThirdPartyOrder, "");
            Intrinsics.checkNotNullParameter(function1, "");
            TradeType type = fiatThirdPartyOrder.getType();
            java.lang.String upperCase2 = null;
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (type != null ? type.getType() : null), (java.lang.Object) com.okinc.crcore.coreapi.enums.TradeType.BUY.getType());
            if (zEZpvd) {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DQYQgr);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.DQzvGN);
            }
            AbstractC31582lwk abstractC31582lwk = this.OLrzqt;
            if (!fiatThirdPartyOrder.isConvert()) {
                android.widget.TextView textView = abstractC31582lwk.fJNWhG;
                java.lang.String baseCurrencySymbol = fiatThirdPartyOrder.getBaseCurrencySymbol();
                if (baseCurrencySymbol != null) {
                    java.util.Locale locale = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "");
                    java.lang.String upperCase3 = baseCurrencySymbol.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                    if (upperCase3 == null) {
                        upperCase3 = "";
                    }
                    textView.setText(upperCase3);
                    abstractC31582lwk.fARcdN.setText(C31661lzi.copydefault(fiatThirdPartyOrder.getBaseAmount(), false));
                }
            } else {
                ConvertOrderDetailData convertOrderDetail4 = fiatThirdPartyOrder.getConvertOrderDetail();
                if ((convertOrderDetail4 != null && convertOrderDetail4.getOrderStatus() == -1) || (((convertOrderDetail = fiatThirdPartyOrder.getConvertOrderDetail()) != null && convertOrderDetail.getOrderStatus() == -2) || (((convertOrderDetail2 = fiatThirdPartyOrder.getConvertOrderDetail()) != null && convertOrderDetail2.getOrderStatus() == -3) || ((convertOrderDetail3 = fiatThirdPartyOrder.getConvertOrderDetail()) != null && convertOrderDetail3.getOrderStatus() == 3)))) {
                    android.widget.TextView textView2 = abstractC31582lwk.fJNWhG;
                    java.lang.String baseCurrencySymbol2 = fiatThirdPartyOrder.getBaseCurrencySymbol();
                    if (baseCurrencySymbol2 != null) {
                        java.util.Locale locale2 = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        java.lang.String upperCase4 = baseCurrencySymbol2.toUpperCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                        if (upperCase4 == null) {
                            upperCase4 = "";
                        }
                        textView2.setText(upperCase4);
                        abstractC31582lwk.fARcdN.setText(C31661lzi.copydefault(fiatThirdPartyOrder.getBaseAmount(), false));
                    }
                } else {
                    android.widget.TextView textView3 = abstractC31582lwk.fJNWhG;
                    ConvertOrderDetailData convertOrderDetail5 = fiatThirdPartyOrder.getConvertOrderDetail();
                    if (convertOrderDetail5 == null || (convertBaseCurrency = convertOrderDetail5.getConvertBaseCurrency()) == null) {
                        upperCase = "";
                        textView3.setText(upperCase);
                        android.widget.TextView textView4 = abstractC31582lwk.fARcdN;
                        ConvertOrderDetailData convertOrderDetail6 = fiatThirdPartyOrder.getConvertOrderDetail();
                        textView4.setText((convertOrderDetail6 != null || (convertBaseAmount = convertOrderDetail6.getConvertBaseAmount()) == null) ? null : C31661lzi.copydefault(convertBaseAmount, false));
                    } else {
                        java.util.Locale locale3 = java.util.Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale3, "");
                        upperCase = convertBaseCurrency.toUpperCase(locale3);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "");
                        if (upperCase == null) {
                        }
                        textView3.setText(upperCase);
                        android.widget.TextView textView42 = abstractC31582lwk.fARcdN;
                        ConvertOrderDetailData convertOrderDetail62 = fiatThirdPartyOrder.getConvertOrderDetail();
                        if (convertOrderDetail62 != null) {
                            textView42.setText((convertOrderDetail62 != null || (convertBaseAmount = convertOrderDetail62.getConvertBaseAmount()) == null) ? null : C31661lzi.copydefault(convertBaseAmount, false));
                        }
                    }
                }
            }
            abstractC31582lwk.DbNXlk.setText(strAYXKKw);
            abstractC31582lwk.AkhnZx.setText(fiatThirdPartyOrder.getCreateDate() > 0 ? pTA.format$default(new Date(fiatThirdPartyOrder.getCreateDate()), OKDateEnum.DATE_FORMAT_STANDARD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null) : "");
            abstractC31582lwk.AkhnZx.setVisibility(0);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) fiatThirdPartyOrder.getQuoteCurrencySymbol()) && C33129mqd.OLrzqt((java.lang.CharSequence) fiatThirdPartyOrder.getBaseCurrencySymbol())) {
                android.widget.TextView textView5 = abstractC31582lwk.fetchVPNInfo;
                java.lang.String strCopydefault = C31661lzi.copydefault(fiatThirdPartyOrder.getQuoteAmount(), false);
                java.lang.String quoteCurrencySymbol = fiatThirdPartyOrder.getQuoteCurrencySymbol();
                if (quoteCurrencySymbol != null) {
                    java.util.Locale locale4 = java.util.Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale4, "");
                    upperCase2 = quoteCurrencySymbol.toUpperCase(locale4);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "");
                }
                textView5.setText(strCopydefault + " " + upperCase2);
            }
            android.widget.TextView textView6 = abstractC31582lwk.isConnected;
            java.lang.String depositName = fiatThirdPartyOrder.getDepositName();
            if (depositName == null) {
                depositName = "";
            }
            textView6.setText(depositName);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) fiatThirdPartyOrder.getIcon())) {
                android.widget.ImageView imageView = abstractC31582lwk.values;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C33054mpH.loadUrl$default(imageView, C33492mxV.OLrzqt() ? fiatThirdPartyOrder.getIconNight() : fiatThirdPartyOrder.getIcon(), null, 0, 0, 14, null);
            }
            abstractC31582lwk.djBIcL.setVisibility(0);
            EZpvd(context, fiatThirdPartyOrder.getStatus(), zEZpvd, fiatThirdPartyOrder);
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.lPl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30196lPk.TaskDescription.EZpvd(function1, fiatThirdPartyOrder, view);
                }
            });
        }

        public static final void EZpvd(Function1 function1, FiatThirdPartyOrder fiatThirdPartyOrder, android.view.View view) {
            function1.invoke(fiatThirdPartyOrder);
        }

        public final void copydefault(android.content.Context context, @NotNull FiatThirdPartyOrder fiatThirdPartyOrder) {
            Intrinsics.checkNotNullParameter(fiatThirdPartyOrder, "");
            EZpvd(context, fiatThirdPartyOrder.getStatus(), true, fiatThirdPartyOrder);
        }
    }

    /* JADX INFO: renamed from: o.lPk$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.ViewHolder {
        public final android.view.View KWHzl;

        public final void KWHzl() {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl = view;
        }
    }
}
