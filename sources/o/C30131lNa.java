package o;

import android.view.View;
import androidx.core.widget.ImageViewCompat;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.assets.api.model.TransferDetail;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.select.SelectPaymentMethodViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.fiat.api.bean.CoinType;
import com.okinc.fiat.api.bean.FiatCryptoCoinBean;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okpaymentapi.data.remote.model.management.BalanceAccountType;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okx.paymentapi.service.DepositWithdrawLandingPage;
import com.okinc.okx.paymentapi.service.DepositWithdrawPageParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C30107lMd;
import o.C31351lsQ;
import o.InterfaceC47251tmX;
import o.InterfaceC8224ayh;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30131lNa extends C43318rmy<InterfaceC30133lNc, AbstractC31577lwf> {
    public final Function0<Unit> AEQbTJ;
    public final SelectPaymentMethodViewModel AhwBna;
    public final boolean EZpvd;
    public final androidx.fragment.app.FragmentManager KWHzl;
    public final FragmentActivity OLrzqt;
    public final Function1<InterfaceC30133lNc, Unit> copydefault;
    public final PaymentMethodSelectionViewModel valueOf;

    @Override // o.AbstractC43310rmq
    public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, java.lang.Object obj) {
        onBindViewHolder((C43312rms<AbstractC31577lwf>) c43312rms, (InterfaceC30133lNc) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super o.lNc, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C30131lNa(@NotNull FragmentActivity fragmentActivity, boolean z, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull SelectPaymentMethodViewModel selectPaymentMethodViewModel, @NotNull PaymentMethodSelectionViewModel paymentMethodSelectionViewModel, @NotNull Function0<Unit> function0, @NotNull Function1<? super InterfaceC30133lNc, Unit> function1) {
        super(C31351lsQ.ActionBar.DAIeex, 0);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(selectPaymentMethodViewModel, "");
        Intrinsics.checkNotNullParameter(paymentMethodSelectionViewModel, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = fragmentActivity;
        this.EZpvd = z;
        this.KWHzl = fragmentManager;
        this.AhwBna = selectPaymentMethodViewModel;
        this.valueOf = paymentMethodSelectionViewModel;
        this.AEQbTJ = function0;
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    public C43312rms<AbstractC31577lwf> onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C43312rms<AbstractC31577lwf> c43312rmsOnCreateViewHolder = super.onCreateViewHolder(layoutInflater, viewGroup);
        if (this.EZpvd) {
            ViewDataBinding viewDataBindingOLrzqt = c43312rmsOnCreateViewHolder.OLrzqt();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingOLrzqt, "");
            C31899mIa.applyTouchFeedback$default(viewDataBindingOLrzqt, (android.view.View) null, false, 0, 7, (java.lang.Object) null);
        }
        Intrinsics.checkNotNullExpressionValue(c43312rmsOnCreateViewHolder, "");
        return c43312rmsOnCreateViewHolder;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq, o.AbstractC59533zio
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC31577lwf> c43312rms, @NotNull final InterfaceC30133lNc interfaceC30133lNc) {
        java.lang.String currency;
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(interfaceC30133lNc, "");
        final AbstractC31577lwf abstractC31577lwf = (AbstractC31577lwf) c43312rms.OLrzqt();
        if (!interfaceC30133lNc.isConnected()) {
            ImageViewCompat.setImageTintList(abstractC31577lwf.KWHzl, null);
            android.widget.ImageView imageView = abstractC31577lwf.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            lMZ.OLrzqt(interfaceC30133lNc, imageView);
        }
        abstractC31577lwf.AkhnZx.setText(interfaceC30133lNc.djBIcL());
        abstractC31577lwf.AkhnZx.setContentDescription(interfaceC30133lNc.fARcdN().getDepositPlatformCode());
        android.widget.TextView textView = abstractC31577lwf.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        lMZ.OLrzqt(interfaceC30133lNc, textView);
        android.widget.TextView textView2 = abstractC31577lwf.values;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        lMZ.KWHzl(interfaceC30133lNc, textView2);
        abstractC31577lwf.fetchVPNInfo.setVisibility(8);
        if (interfaceC30133lNc.gEmmrt()) {
            abstractC31577lwf.getRoot().setEnabled(true);
            abstractC31577lwf.getRoot().setAlpha(1.0f);
        } else {
            abstractC31577lwf.getRoot().setEnabled(false);
            abstractC31577lwf.getRoot().setAlpha(0.3f);
        }
        abstractC31577lwf.EZpvd.setVisibility(8);
        if (interfaceC30133lNc.AYXKKw()) {
            abstractC31577lwf.getRoot().setBackgroundResource(mDC.StateListAnimator.fetchVPNInfo);
            if (interfaceC30133lNc.DbNXlk()) {
                SelectPaymentMethodViewModel.trackPageView$default(this.AhwBna, "deposit", null, null, 6, null);
                abstractC31577lwf.valueOf.setVisibility(0);
                abstractC31577lwf.djBIcL.setVisibility(8);
            } else {
                abstractC31577lwf.valueOf.setVisibility(8);
            }
            if (interfaceC30133lNc.AkhnZx()) {
                SelectPaymentMethodViewModel.trackPageView$default(this.AhwBna, ExtJson.BRC20TYPE_TRANSFER, null, null, 6, null);
                abstractC31577lwf.AhwBna.setVisibility(0);
                abstractC31577lwf.djBIcL.setVisibility(8);
            } else {
                abstractC31577lwf.AhwBna.setVisibility(8);
            }
            C34745niJ c34745niJ = C34745niJ.AEQbTJ;
            CoinType coinType = CoinType.COIN_TYPE_BUY;
            final FiatCryptoCoinBean fiatCryptoCoinBeanEZpvd = c34745niJ.EZpvd(coinType);
            final FiatCryptoCoinBean fiatCryptoCoinBeanOLrzqt = c34745niJ.OLrzqt(coinType);
            final java.lang.String str = (fiatCryptoCoinBeanEZpvd == null || (currency = fiatCryptoCoinBeanEZpvd.getCurrency()) == null) ? "" : currency;
            abstractC31577lwf.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.lNf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30131lNa.AEQbTJ(this.AEQbTJ, interfaceC30133lNc, fiatCryptoCoinBeanOLrzqt, fiatCryptoCoinBeanEZpvd, str, view);
                }
            });
            abstractC31577lwf.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.lNg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30131lNa.KWHzl(this.EZpvd, interfaceC30133lNc, fiatCryptoCoinBeanOLrzqt, fiatCryptoCoinBeanEZpvd, view);
                }
            });
            if (interfaceC30133lNc.values()) {
                abstractC31577lwf.AEQbTJ.setVisibility(0);
                abstractC31577lwf.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.lNm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C30131lNa.KWHzl(interfaceC30133lNc, this, view);
                    }
                });
            } else {
                abstractC31577lwf.AEQbTJ.setVisibility(8);
            }
            if (interfaceC30133lNc.OLrzqt()) {
                abstractC31577lwf.AYXKKw.setVisibility(8);
                java.util.List<AbstractC30156lNz> listAuCTel = interfaceC30133lNc.AuCTel();
                if (listAuCTel != null && !listAuCTel.isEmpty()) {
                    Intrinsics.copydefault(listAuCTel);
                    int iFindIndexOfMethodToSelect$default = findIndexOfMethodToSelect$default(this, null, listAuCTel, 1, null);
                    java.util.Iterator<T> it = listAuCTel.iterator();
                    while (it.hasNext()) {
                        ((AbstractC30156lNz) it.next()).EZpvd(false);
                    }
                    if (iFindIndexOfMethodToSelect$default != -1) {
                        listAuCTel.get(iFindIndexOfMethodToSelect$default).EZpvd(true);
                        this.valueOf.KWHzl(listAuCTel.get(iFindIndexOfMethodToSelect$default).iwGUEr());
                        abstractC31577lwf.EZpvd.setVisibility(EZpvd(interfaceC30133lNc) ? 0 : 8);
                    }
                } else {
                    this.valueOf.KWHzl((PaymentMethod) null);
                }
            } else {
                abstractC31577lwf.AYXKKw.setVisibility(0);
                if (interfaceC30133lNc.AhwBna()) {
                    abstractC31577lwf.djBIcL.setVisibility(0);
                    abstractC31577lwf.valueOf.setVisibility(8);
                    abstractC31577lwf.AhwBna.setVisibility(8);
                    abstractC31577lwf.djBIcL.setText(interfaceC30133lNc.EZpvd());
                } else {
                    abstractC31577lwf.djBIcL.setVisibility(8);
                }
                C52794wYp c52794wYp = abstractC31577lwf.djBIcL;
                c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, interfaceC30133lNc, this));
                Intrinsics.copydefault(abstractC31577lwf);
                C59534zip c59534zipKWHzl = KWHzl(abstractC31577lwf);
                java.util.List<AbstractC30156lNz> listAuCTel2 = interfaceC30133lNc.AuCTel();
                if (listAuCTel2 != null && !listAuCTel2.isEmpty()) {
                    Intrinsics.copydefault(listAuCTel2);
                    copydefault(listAuCTel2, interfaceC30133lNc, c59534zipKWHzl);
                }
                if (listAuCTel2 == null || listAuCTel2.isEmpty()) {
                    this.valueOf.KWHzl((PaymentMethod) null);
                }
            }
        } else {
            abstractC31577lwf.getRoot().setBackgroundResource(mDC.StateListAnimator.AuCTel);
            abstractC31577lwf.djBIcL.setVisibility(8);
            abstractC31577lwf.valueOf.setVisibility(8);
            abstractC31577lwf.AhwBna.setVisibility(8);
            abstractC31577lwf.AYXKKw.setVisibility(8);
            abstractC31577lwf.AEQbTJ.setVisibility(8);
        }
        abstractC31577lwf.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.lNj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C30131lNa.OLrzqt(interfaceC30133lNc, this, view);
            }
        });
        abstractC31577lwf.copydefault.setVisibility(8);
        if (interfaceC30133lNc.ejfBZ() && (!C31662lzj.copydefault(interfaceC30133lNc.fARcdN()).isEmpty())) {
            abstractC31577lwf.OLrzqt.setVisibility(0);
            abstractC31577lwf.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.lNi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30131lNa.copydefault(abstractC31577lwf, this, interfaceC30133lNc, view);
                }
            });
        } else {
            abstractC31577lwf.OLrzqt.setVisibility(8);
        }
    }

    public static final void AEQbTJ(C30131lNa c30131lNa, InterfaceC30133lNc interfaceC30133lNc, FiatCryptoCoinBean fiatCryptoCoinBean, FiatCryptoCoinBean fiatCryptoCoinBean2, java.lang.String str, android.view.View view) {
        java.lang.String currency = fiatCryptoCoinBean != null ? fiatCryptoCoinBean.getCurrency() : null;
        java.lang.String str2 = currency == null ? "" : currency;
        java.lang.String currency2 = fiatCryptoCoinBean2 != null ? fiatCryptoCoinBean2.getCurrency() : null;
        c30131lNa.OLrzqt(interfaceC30133lNc, str2, currency2 == null ? "" : currency2, "deposit", CoinType.COIN_TYPE_BUY);
        InterfaceC47251tmX.StateListAnimator.goToDepositWithdrawPage$default((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class), c30131lNa.OLrzqt, new DepositWithdrawPageParameters(new DepositWithdrawLandingPage.DepositPaymentSelectionPage(str), OKPaymentSource.PAYMENT_INTERNAL_FLOW), null, null, 12, null);
    }

    public static final void KWHzl(C30131lNa c30131lNa, InterfaceC30133lNc interfaceC30133lNc, FiatCryptoCoinBean fiatCryptoCoinBean, FiatCryptoCoinBean fiatCryptoCoinBean2, android.view.View view) {
        java.lang.String currency = fiatCryptoCoinBean != null ? fiatCryptoCoinBean.getCurrency() : null;
        java.lang.String str = currency == null ? "" : currency;
        java.lang.String currency2 = fiatCryptoCoinBean2 != null ? fiatCryptoCoinBean2.getCurrency() : null;
        c30131lNa.OLrzqt(interfaceC30133lNc, str, currency2 == null ? "" : currency2, ExtJson.BRC20TYPE_TRANSFER, CoinType.COIN_TYPE_BUY);
        InterfaceC8224ayh.TaskDescription.goToTransfer$default((InterfaceC8224ayh) C43251rlk.copydefault(InterfaceC8224ayh.class), c30131lNa.OLrzqt, new TransferDetail(null, new TransferDetail.Target(6), java.lang.Integer.valueOf(C33129mqd.AhwBna(fiatCryptoCoinBean2 != null ? fiatCryptoCoinBean2.getDigitalCurrencyId() : null)), null, false, false, null, 121, null), null, 4, null);
    }

    public static final void KWHzl(InterfaceC30133lNc interfaceC30133lNc, C30131lNa c30131lNa, android.view.View view) {
        interfaceC30133lNc.OLrzqt("manage_account_button");
        c30131lNa.copydefault();
    }

    /* JADX INFO: renamed from: o.lNa$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ InterfaceC30133lNc EZpvd;
        public final /* synthetic */ C30131lNa KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, InterfaceC30133lNc interfaceC30133lNc, C30131lNa c30131lNa) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = interfaceC30133lNc;
            this.KWHzl = c30131lNa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.OLrzqt("add_account_button");
                this.KWHzl.valueOf.KWHzl("add_account");
                this.KWHzl.valueOf.zsXlph();
            }
        }
    }

    public static final void OLrzqt(InterfaceC30133lNc interfaceC30133lNc, C30131lNa c30131lNa, android.view.View view) {
        if (interfaceC30133lNc.AYXKKw() || !interfaceC30133lNc.gEmmrt()) {
            return;
        }
        c30131lNa.copydefault.invoke(interfaceC30133lNc);
        c30131lNa.valueOf.KWHzl(interfaceC30133lNc.fARcdN());
    }

    public static final void copydefault(AbstractC31577lwf abstractC31577lwf, C30131lNa c30131lNa, InterfaceC30133lNc interfaceC30133lNc, android.view.View view) {
        abstractC31577lwf.getRoot().callOnClick();
        c30131lNa.valueOf.AEQbTJ(interfaceC30133lNc.fARcdN());
    }

    public final void copydefault(java.util.List<? extends AbstractC30156lNz> list, InterfaceC30133lNc interfaceC30133lNc, C59534zip c59534zip) {
        this.AhwBna.djBIcL(list);
        int iEZpvd = EZpvd(this.valueOf.AuCTel(), list);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC30156lNz) it.next()).EZpvd(false);
        }
        if (iEZpvd != -1) {
            list.get(iEZpvd).EZpvd(true);
            this.valueOf.KWHzl(list.get(iEZpvd).iwGUEr());
            if (interfaceC30133lNc.fJNWhG()) {
                c59534zip.setItems(list);
            } else {
                c59534zip.setItems(C56402yEa.EZpvd(list.get(iEZpvd)));
            }
        }
    }

    public final C59534zip KWHzl(AbstractC31577lwf abstractC31577lwf) {
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(AbstractC30156lNz.class, new C30155lNy(this.KWHzl, this.AhwBna, this.valueOf, this.AEQbTJ));
        abstractC31577lwf.AYXKKw.setAdapter(c59534zip);
        RecyclerView recyclerView = abstractC31577lwf.AYXKKw;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.OLrzqt, 1, false);
        linearLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        abstractC31577lwf.AYXKKw.setHasFixedSize(false);
        abstractC31577lwf.AYXKKw.setNestedScrollingEnabled(false);
        return c59534zip;
    }

    public static /* synthetic */ int findIndexOfMethodToSelect$default(C30131lNa c30131lNa, PaymentMethod paymentMethod, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            paymentMethod = null;
        }
        return c30131lNa.EZpvd(paymentMethod, (java.util.List<? extends InterfaceC30154lNx>) list);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.lMd.Application.newInstance$default(o.lMd$Application, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.management.Channel, com.okinc.okpaymentapi.data.remote.model.management.TradeType, int, java.lang.Object):o.lMd */
    public final void copydefault() {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN;
        C30107lMd.Application application = C30107lMd.Companion;
        Function0 function0 = new Function0() { // from class: o.lMY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30131lNa.EZpvd(this.AEQbTJ);
            }
        };
        Function1 function1 = new Function1() { // from class: o.lNb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30131lNa.KWHzl(this.AEQbTJ, (PaymentMethod) obj);
            }
        };
        Function1 function12 = new Function1() { // from class: o.lNh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30131lNa.copydefault(this.copydefault, (PaymentMethod) obj);
            }
        };
        Function0 function02 = new Function0() { // from class: o.lNe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30131lNa.KWHzl(this.OLrzqt);
            }
        };
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN2 = this.valueOf.fARcdN();
        C30107lMd c30107lMdNewInstance$default = C30107lMd.Application.newInstance$default(application, function0, function1, function12, function02, (channelFARcdN2 != null && channelFARcdN2.getDepositToWithdraw()) || ((channelFARcdN = this.valueOf.fARcdN()) != null && channelFARcdN.getAllowManualAddition()), false, null, null, 224, null);
        c30107lMdNewInstance$default.show(this.KWHzl, C56524yIo.AEQbTJ(c30107lMdNewInstance$default.getClass()).valueOf());
    }

    public static final Unit EZpvd(C30131lNa c30131lNa) {
        c30131lNa.valueOf.zsXlph();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C30131lNa c30131lNa, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = c30131lNa.valueOf.fARcdN();
        if (channelFARcdN != null) {
            c30131lNa.AhwBna.AYXKKw(channelFARcdN, paymentMethod);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30131lNa c30131lNa, PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        com.okinc.okpaymentapi.data.remote.model.management.Channel channelFARcdN = c30131lNa.valueOf.fARcdN();
        if (channelFARcdN != null) {
            c30131lNa.AhwBna.AYXKKw(channelFARcdN, paymentMethod);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C30131lNa c30131lNa) {
        c30131lNa.AEQbTJ.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public final void OLrzqt(final InterfaceC30133lNc interfaceC30133lNc, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final CoinType coinType) {
        java.util.List<AbstractC30156lNz> listAuCTel = interfaceC30133lNc.AuCTel();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        if (listAuCTel != null && !listAuCTel.isEmpty()) {
            Intrinsics.copydefault(listAuCTel);
            int iFindIndexOfMethodToSelect$default = findIndexOfMethodToSelect$default(this, null, listAuCTel, 1, null);
            if (iFindIndexOfMethodToSelect$default != -1) {
                objectRef.element = listAuCTel.get(iFindIndexOfMethodToSelect$default).iwGUEr().getPayment();
            }
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PaymentMethod_Btm_Next_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lNd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30131lNa.OLrzqt(interfaceC30133lNc, objectRef, str, str2, str3, coinType, (EventParamsList) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(InterfaceC30133lNc interfaceC30133lNc, Ref.ObjectRef objectRef, java.lang.String str, java.lang.String str2, java.lang.String str3, CoinType coinType, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "payment_channel", interfaceC30133lNc.fARcdN().getDepositName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.EXTRA_PAYMENT_METHOD, (java.lang.String) objectRef.element, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str3, false, 4, null);
        eventParamsList.put("flow", coinType == CoinType.COIN_TYPE_BUY ? "buy" : "sell", true);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(InterfaceC30133lNc interfaceC30133lNc) {
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        if (interfaceC30133lNc.fARcdN().getCategoryCode() == ChannelCategoryCode.BALANCE) {
            PaymentMethod paymentMethodAuCTel = this.valueOf.AuCTel();
            if (Intrinsics.EZpvd((java.lang.Object) ((paymentMethodAuCTel == null || (account = paymentMethodAuCTel.getAccount()) == null) ? null : account.getBalanceAccountType()), (java.lang.Object) BalanceAccountType.TRADING.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final int EZpvd(PaymentMethod paymentMethod, java.util.List<? extends InterfaceC30154lNx> list) {
        int i;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        java.util.Iterator<? extends InterfaceC30154lNx> it = list.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            InterfaceC30154lNx next = it.next();
            com.okinc.okpaymentapi.data.remote.model.management.Account account2 = next.iwGUEr().getAccount();
            java.lang.String paymentAccountId = null;
            java.lang.String paymentAccountId2 = account2 != null ? account2.getPaymentAccountId() : null;
            if (paymentMethod != null && (account = paymentMethod.getAccount()) != null) {
                paymentAccountId = account.getPaymentAccountId();
            }
            if (Intrinsics.EZpvd((java.lang.Object) paymentAccountId2, (java.lang.Object) paymentAccountId) || next.KWHzl() || Intrinsics.EZpvd(this.valueOf.AuCTel(), next.iwGUEr())) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        java.util.Iterator<? extends InterfaceC30154lNx> it2 = list.iterator();
        int i3 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (it2.next().iwGUEr().getBestOption()) {
                i = i3;
                break;
            }
            i3++;
        }
        if (i >= 0) {
            return i;
        }
        return 0;
    }
}
