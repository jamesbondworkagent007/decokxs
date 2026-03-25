package com.okinc.buysell.ui.transaction.buysell;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.biz.model.SupportService;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.crcore.shared.net.responsebean.bsc.OrderDetailBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32866mlf;
import o.C32989mnw;
import o.InterfaceC31764mDa;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class BuySellOrderDetailViewModel extends ViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final MutableLiveData<C32989mnw<Pair<SupportService, OrderDetailBean>>> EZpvd;
    public MutableLiveData<C32989mnw<TaskDescription>> KWHzl;
    public final InterfaceC31764mDa OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<TaskDescription>> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<Pair<SupportService, OrderDetailBean>>> OLrzqt() {
        return this.EZpvd;
    }

    @yCM
    public BuySellOrderDetailViewModel(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.OLrzqt = interfaceC31764mDa;
        this.KWHzl = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
    }

    public final void copydefault(@NotNull OrderDetailBean orderDetailBean, BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(orderDetailBean, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellOrderDetailViewModel$initSupportService$1(orderDetailBean, buySellTradeType, this, null), 3, null);
    }

    public static /* synthetic */ void requestOrderDetail$default(BuySellOrderDetailViewModel buySellOrderDetailViewModel, String str, BuySellTradeType buySellTradeType, int i, Object obj) {
        if ((i & 2) != 0) {
            buySellTradeType = BuySellTradeType.BUY;
        }
        buySellOrderDetailViewModel.KWHzl(str, buySellTradeType);
    }

    public final void KWHzl(@NotNull String str, BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BuySellOrderDetailViewModel$requestOrderDetail$1(this, str, buySellTradeType, null), 3, null);
    }

    public final void EZpvd(@NotNull final BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        C32866mlf.onEvent$default("Simpletrade_OrderDetails_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.lTh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return BuySellOrderDetailViewModel.EZpvd(buySellTradeType, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit EZpvd(BuySellTradeType buySellTradeType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", buySellTradeType == BuySellTradeType.BUY ? "buy" : "sell", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator extends TaskDescription {
            public static final int OLrzqt = OrderDetailBean.$stable;
            public final OrderDetailBean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, OrderDetailBean orderDetailBean, int i, Object obj) {
                if ((i & 1) != 0) {
                    orderDetailBean = stateListAnimator.EZpvd;
                }
                return stateListAnimator.OLrzqt(orderDetailBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final OrderDetailBean EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull OrderDetailBean orderDetailBean) {
                Intrinsics.checkNotNullParameter(orderDetailBean, "");
                return new StateListAnimator(orderDetailBean);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(detail=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull OrderDetailBean orderDetailBean) {
                super(null);
                Intrinsics.checkNotNullParameter(orderDetailBean, "");
                this.EZpvd = orderDetailBean;
            }
        }

        private TaskDescription() {
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class ActionBar extends TaskDescription {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = actionBar.KWHzl;
                }
                return actionBar.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(String str) {
                return new ActionBar(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((ActionBar) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Fail(message=" + this.KWHzl + ")";
            }

            public ActionBar(String str) {
                super(null);
                this.KWHzl = str;
            }
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.ui.transaction.buysell.BuySellOrderDetailViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
