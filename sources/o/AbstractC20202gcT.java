package o;

import android.text.TextUtils;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.ui.contract.approve.OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$1;
import com.okinc.business.defi.wallet.transaction.ui.contract.approve.OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.C57524yjz;
import o.InterfaceC9730bbB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gcT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC20202gcT<T extends OKWBaseTransaction<?>> extends AbstractC20102gaZ<T> {
    public final InterfaceC56387yDm iwGUEr;
    public AbstractC16639eni uzCIH;
    public final int hDKMBd = C13754dXa.TaskDescription.DTeKQX;
    public boolean fARcdN = true;

    public abstract InterfaceC9730bbB.StateListAnimator AEQbTJ();

    public abstract void AEQbTJ(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20082gaF
    public void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
    }

    /* JADX DEBUG: Possible override for method o.gaF.EZpvd()V */
    public java.lang.String EZpvd() {
        return null;
    }

    public abstract java.lang.String EZpvd(boolean z);

    /* JADX DEBUG: Possible override for method o.gaF.OLrzqt()V */
    public abstract java.lang.String OLrzqt();

    public abstract java.lang.String OLrzqt(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
    }

    public abstract TransactionTopHeaderInfoBean djBIcL();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public int getLayoutId() {
        return this.hDKMBd;
    }

    public AbstractC20202gcT() {
        final Function0 function0 = null;
        this.iwGUEr = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C20318ged.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.ui.contract.approve.OKWBaseSetApproveAmountFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.ui.contract.approve.OKWBaseSetApproveAmountFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0() { // from class: o.gcU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20202gcT.copydefault();
            }
        });
    }

    public static final ViewModelProvider.Factory copydefault() {
        return C20318ged.Companion.KWHzl();
    }

    public final C20318ged QUSxYX() {
        return (C20318ged) this.iwGUEr.getValue();
    }

    @Override // o.AbstractC20082gaF, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        zLjUOn();
        this.uzCIH = AbstractC16639eni.AEQbTJ(view);
        dNCPSb();
        QbewEr();
        QVAiDq();
        AbstractC16639eni abstractC16639eni = this.uzCIH;
        if (abstractC16639eni == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni = null;
        }
        abstractC16639eni.AhwBna.post(new java.lang.Runnable() { // from class: o.gcS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20202gcT.gEmmrt(this.OLrzqt);
            }
        });
        view.post(new java.lang.Runnable() { // from class: o.gcQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20202gcT.djBIcL(this.AEQbTJ);
            }
        });
    }

    public static final void gEmmrt(AbstractC20202gcT abstractC20202gcT) {
        AbstractC16639eni abstractC16639eni = abstractC20202gcT.uzCIH;
        if (abstractC16639eni == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni = null;
        }
        abstractC16639eni.AhwBna.fullScroll(130);
    }

    public static final void djBIcL(AbstractC20202gcT abstractC20202gcT) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC20202gcT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void QVAiDq() {
        java.lang.String strEZpvd = EZpvd();
        AbstractC16639eni abstractC16639eni = null;
        if (strEZpvd == null || strEZpvd.length() == 0 || ejfBZ().DCUTEIddSDPG()) {
            AbstractC16639eni abstractC16639eni2 = this.uzCIH;
            if (abstractC16639eni2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni2 = null;
            }
            abstractC16639eni2.AkhnZx.setVisibility(8);
            AbstractC16639eni abstractC16639eni3 = this.uzCIH;
            if (abstractC16639eni3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16639eni = abstractC16639eni3;
            }
            abstractC16639eni.copydefault.setVisibility(8);
            return;
        }
        AbstractC16639eni abstractC16639eni4 = this.uzCIH;
        if (abstractC16639eni4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni4 = null;
        }
        abstractC16639eni4.AkhnZx.setVisibility(0);
        AbstractC16639eni abstractC16639eni5 = this.uzCIH;
        if (abstractC16639eni5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni5 = null;
        }
        abstractC16639eni5.AkhnZx.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.UlpNxW, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, C57484yjL.AEQbTJ.KWHzl(strEZpvd)))));
        AbstractC16639eni abstractC16639eni6 = this.uzCIH;
        if (abstractC16639eni6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni6 = null;
        }
        abstractC16639eni6.copydefault.setVisibility(0);
        AbstractC16639eni abstractC16639eni7 = this.uzCIH;
        if (abstractC16639eni7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16639eni = abstractC16639eni7;
        }
        android.widget.ImageView imageView = abstractC16639eni.copydefault;
        imageView.setOnClickListener(new Dialog(imageView, 1000L, this, strEZpvd));
    }

    private final void dNCPSb() {
        TransactionTopHeaderInfoBean transactionTopHeaderInfoBeanDjBIcL = djBIcL();
        if (transactionTopHeaderInfoBeanDjBIcL == null) {
            return;
        }
        AbstractC16639eni abstractC16639eni = null;
        if (ejfBZ().DCUTEIddSDPG()) {
            AbstractC16639eni abstractC16639eni2 = this.uzCIH;
            if (abstractC16639eni2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni2 = null;
            }
            C57524yjz c57524yjz = abstractC16639eni2.AYXKKw;
            c57524yjz.setVisibility(0);
            c57524yjz.setData(new C57524yjz.TaskDescription(C56402yEa.EZpvd(new C57524yjz.ActionBar(transactionTopHeaderInfoBeanDjBIcL.getTitle())), transactionTopHeaderInfoBeanDjBIcL.getSubTitle(), new C57524yjz.Application(transactionTopHeaderInfoBeanDjBIcL.getMainIcon(), null, 0, 6, null), 0, 8, null));
            AbstractC16639eni abstractC16639eni3 = this.uzCIH;
            if (abstractC16639eni3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni3 = null;
            }
            abstractC16639eni3.DbNXlk.setVisibility(0);
            AbstractC16639eni abstractC16639eni4 = this.uzCIH;
            if (abstractC16639eni4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni4 = null;
            }
            abstractC16639eni4.ejfBZ.setVisibility(0);
            AbstractC16639eni abstractC16639eni5 = this.uzCIH;
            if (abstractC16639eni5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni5 = null;
            }
            abstractC16639eni5.valueOf.setTextSize(14.0f);
            AbstractC16639eni abstractC16639eni6 = this.uzCIH;
            if (abstractC16639eni6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni6 = null;
            }
            abstractC16639eni6.values.setTextSize(14.0f);
            AbstractC16639eni abstractC16639eni7 = this.uzCIH;
            if (abstractC16639eni7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16639eni = abstractC16639eni7;
            }
            abstractC16639eni.isConnected.setTextSize(14.0f);
            return;
        }
        AbstractC16639eni abstractC16639eni8 = this.uzCIH;
        if (abstractC16639eni8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni8 = null;
        }
        C57431yiL c57431yiL = abstractC16639eni8.djBIcL;
        c57431yiL.setVisibility(0);
        c57431yiL.setViewDataBean(transactionTopHeaderInfoBeanDjBIcL);
        c57431yiL.setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
        c57431yiL.EZpvd().setSingleLine();
        c57431yiL.EZpvd().setEllipsize(TextUtils.TruncateAt.END);
        Intrinsics.copydefault(c57431yiL);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        this.fARcdN = ((ActivityC20262gda) context).AkhnZx();
    }

    public final void QbewEr() {
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        Ref.BooleanRef booleanRef;
        AbstractC16639eni abstractC16639eni;
        AbstractC16639eni abstractC16639eni2 = this.uzCIH;
        if (abstractC16639eni2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni2 = null;
        }
        abstractC16639eni2.gEmmrt.setTypeface(ResourcesCompat.getFont(requireContext(), ejfBZ().DCUTEIddSDPG() ? C52761wXj.Dialog.AEQbTJ : C52761wXj.Dialog.KWHzl));
        if (this.fARcdN) {
            strOLrzqt = EZpvd(false);
            strOLrzqt2 = EZpvd(true);
        } else {
            strOLrzqt = OLrzqt(false);
            strOLrzqt2 = OLrzqt(true);
        }
        final java.lang.String str = strOLrzqt2;
        final InterfaceC9730bbB.StateListAnimator stateListAnimatorAEQbTJ = AEQbTJ();
        if (stateListAnimatorAEQbTJ == null) {
            return;
        }
        final java.lang.String strAEQbTJ = C54870xYj.AEQbTJ(strOLrzqt, stateListAnimatorAEQbTJ.copydefault());
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935");
        final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        booleanRef3.element = !booleanRef2.element && Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) stateListAnimatorAEQbTJ.AEQbTJ());
        final Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
        if (booleanRef2.element) {
            AbstractC16639eni abstractC16639eni3 = this.uzCIH;
            if (abstractC16639eni3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni3 = null;
            }
            abstractC16639eni3.gEmmrt.setPlainNumericText("0");
        } else {
            AbstractC16639eni abstractC16639eni4 = this.uzCIH;
            if (abstractC16639eni4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni4 = null;
            }
            abstractC16639eni4.gEmmrt.setPlainNumericText(strAEQbTJ);
        }
        copydefault(booleanRef2.element, strAEQbTJ, str, stateListAnimatorAEQbTJ);
        final Function2 function2 = new Function2() { // from class: o.gcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC20202gcT.copydefault(booleanRef2, booleanRef3, booleanRef4, this, stateListAnimatorAEQbTJ, (C55033xcM) obj, (java.lang.CharSequence) obj2);
            }
        };
        AbstractC16639eni abstractC16639eni5 = this.uzCIH;
        if (abstractC16639eni5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni5 = null;
        }
        abstractC16639eni5.gEmmrt.post(new java.lang.Runnable() { // from class: o.gcZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC20202gcT.AEQbTJ(this.KWHzl, booleanRef2, strAEQbTJ, str, stateListAnimatorAEQbTJ, function2);
            }
        });
        AbstractC16639eni abstractC16639eni6 = this.uzCIH;
        if (abstractC16639eni6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni6 = null;
        }
        abstractC16639eni6.gEmmrt.setGravity(81);
        AbstractC16639eni abstractC16639eni7 = this.uzCIH;
        if (abstractC16639eni7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni7 = null;
        }
        abstractC16639eni7.gEmmrt.setMaxIntegerLength(78);
        AbstractC16639eni abstractC16639eni8 = this.uzCIH;
        if (abstractC16639eni8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni8 = null;
        }
        abstractC16639eni8.gEmmrt.setMaxDecimalValue(stateListAnimatorAEQbTJ.valueOf());
        AbstractC16639eni abstractC16639eni9 = this.uzCIH;
        if (abstractC16639eni9 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni9 = null;
        }
        TextViewCompat.setAutoSizeTextTypeWithDefaults(abstractC16639eni9.gEmmrt, 0);
        int i = ejfBZ().DCUTEIddSDPG() ? 32 : 48;
        AbstractC16639eni abstractC16639eni10 = this.uzCIH;
        if (abstractC16639eni10 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni10 = null;
        }
        abstractC16639eni10.gEmmrt.setTextSize(i);
        AbstractC16639eni abstractC16639eni11 = this.uzCIH;
        if (abstractC16639eni11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni11 = null;
        }
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(abstractC16639eni11.gEmmrt, 20, i, 4, 2);
        AbstractC16639eni abstractC16639eni12 = this.uzCIH;
        if (abstractC16639eni12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni12 = null;
        }
        abstractC16639eni12.gEmmrt.setEllipsize(TextUtils.TruncateAt.START);
        AbstractC16639eni abstractC16639eni13 = this.uzCIH;
        if (abstractC16639eni13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni13 = null;
        }
        C55030xcJ c55030xcJ = abstractC16639eni13.EZpvd;
        AbstractC16639eni abstractC16639eni14 = this.uzCIH;
        if (abstractC16639eni14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni14 = null;
        }
        c55030xcJ.setEditable(abstractC16639eni14.gEmmrt.KWHzl());
        java.lang.String strAEQbTJ2 = stateListAnimatorAEQbTJ.AEQbTJ();
        if (strAEQbTJ2 != null) {
            AbstractC16639eni abstractC16639eni15 = this.uzCIH;
            if (abstractC16639eni15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni15 = null;
            }
            abstractC16639eni15.OLrzqt.setVisibility(0);
            AbstractC16639eni abstractC16639eni16 = this.uzCIH;
            if (abstractC16639eni16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni16 = null;
            }
            abstractC16639eni16.valueOf.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.dxTXDv, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C54870xYj.EZpvd(strAEQbTJ2, stateListAnimatorAEQbTJ.copydefault(), stateListAnimatorAEQbTJ.valueOf(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null)))));
            try {
                AbstractC16639eni abstractC16639eni17 = this.uzCIH;
                if (abstractC16639eni17 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni17 = null;
                }
                android.widget.TextView textView = abstractC16639eni17.values;
                booleanRef = booleanRef3;
                try {
                    textView.setOnClickListener(new ActionBar(textView, 1000L, this, booleanRef3, booleanRef2, booleanRef4, stateListAnimatorAEQbTJ, function2));
                } catch (java.lang.Exception e) {
                    e = e;
                    java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("place", "singleClick outside"));
                    C6777aVl.Companion.OLrzqt(e, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "initApproveAmountView");
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                booleanRef = booleanRef3;
            }
        } else {
            booleanRef = booleanRef3;
        }
        AbstractC16639eni abstractC16639eni18 = this.uzCIH;
        if (abstractC16639eni18 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni18 = null;
        }
        android.widget.TextView textView2 = abstractC16639eni18.isConnected;
        textView2.setOnClickListener(new Application(textView2, 1000L, this, function2, booleanRef2, booleanRef, booleanRef4, stateListAnimatorAEQbTJ));
        AbstractC16639eni abstractC16639eni19 = this.uzCIH;
        if (abstractC16639eni19 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni = null;
        } else {
            abstractC16639eni = abstractC16639eni19;
        }
        C52794wYp c52794wYp = abstractC16639eni.KWHzl;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, booleanRef4, booleanRef2, this, booleanRef, stateListAnimatorAEQbTJ));
    }

    /* JADX INFO: renamed from: o.gcT$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function2 AEQbTJ;
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ Ref.BooleanRef OLrzqt;
        public final /* synthetic */ InterfaceC9730bbB.StateListAnimator copydefault;
        public final /* synthetic */ AbstractC20202gcT djBIcL;
        public final /* synthetic */ android.view.View gEmmrt;
        public final /* synthetic */ long valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC20202gcT abstractC20202gcT, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, InterfaceC9730bbB.StateListAnimator stateListAnimator, Function2 function2) {
            this.gEmmrt = view;
            this.valueOf = j;
            this.djBIcL = abstractC20202gcT;
            this.OLrzqt = booleanRef;
            this.EZpvd = booleanRef2;
            this.KWHzl = booleanRef3;
            this.copydefault = stateListAnimator;
            this.AEQbTJ = function2;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strAEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.gEmmrt) > this.valueOf || (this.gEmmrt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.gEmmrt, jCurrentTimeMillis);
                try {
                    InterfaceC9730bbB.StateListAnimator stateListAnimatorAEQbTJ = this.djBIcL.AEQbTJ();
                    if (stateListAnimatorAEQbTJ != null && (strAEQbTJ = stateListAnimatorAEQbTJ.AEQbTJ()) != null) {
                        this.OLrzqt.element = true;
                        this.EZpvd.element = false;
                        this.KWHzl.element = true;
                        AbstractC16639eni abstractC16639eni = this.djBIcL.uzCIH;
                        AbstractC16639eni abstractC16639eni2 = null;
                        if (abstractC16639eni == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16639eni = null;
                        }
                        abstractC16639eni.gEmmrt.setOnTextWillChange(null);
                        AbstractC16639eni abstractC16639eni3 = this.djBIcL.uzCIH;
                        if (abstractC16639eni3 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16639eni3 = null;
                        }
                        abstractC16639eni3.gEmmrt.setPlainNumericText(C54870xYj.AEQbTJ(strAEQbTJ, this.copydefault.copydefault()));
                        AbstractC16639eni abstractC16639eni4 = this.djBIcL.uzCIH;
                        if (abstractC16639eni4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16639eni2 = abstractC16639eni4;
                        }
                        abstractC16639eni2.gEmmrt.setOnTextWillChange(this.AEQbTJ);
                        this.djBIcL.copydefault(false, (java.lang.CharSequence) C54870xYj.AEQbTJ(strAEQbTJ, this.copydefault.copydefault()), (java.lang.CharSequence) C54870xYj.EZpvd(strAEQbTJ, this.copydefault.copydefault(), this.copydefault.valueOf(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), this.copydefault);
                    }
                } catch (java.lang.Exception e) {
                    java.util.Map<java.lang.String, java.lang.String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("place", "singleClick inside"));
                    C6777aVl.Companion.OLrzqt(e, mapDjBIcL, C33488mxR.EZpvd(mapDjBIcL), "initApproveAmountView");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gcT$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function2 AEQbTJ;
        public final /* synthetic */ android.view.View AYXKKw;
        public final /* synthetic */ long AhwBna;
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ InterfaceC9730bbB.StateListAnimator OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;
        public final /* synthetic */ AbstractC20202gcT valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC20202gcT abstractC20202gcT, Function2 function2, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, InterfaceC9730bbB.StateListAnimator stateListAnimator) {
            this.AYXKKw = view;
            this.AhwBna = j;
            this.valueOf = abstractC20202gcT;
            this.AEQbTJ = function2;
            this.KWHzl = booleanRef;
            this.copydefault = booleanRef2;
            this.EZpvd = booleanRef3;
            this.OLrzqt = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AYXKKw) > this.AhwBna || (this.AYXKKw instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AYXKKw, jCurrentTimeMillis);
                AbstractC16639eni abstractC16639eni = this.valueOf.uzCIH;
                AbstractC16639eni abstractC16639eni2 = null;
                if (abstractC16639eni == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni = null;
                }
                abstractC16639eni.gEmmrt.setOnTextWillChange(null);
                AbstractC16639eni abstractC16639eni3 = this.valueOf.uzCIH;
                if (abstractC16639eni3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni3 = null;
                }
                abstractC16639eni3.gEmmrt.setPlainNumericText("0");
                AbstractC16639eni abstractC16639eni4 = this.valueOf.uzCIH;
                if (abstractC16639eni4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16639eni2 = abstractC16639eni4;
                }
                abstractC16639eni2.gEmmrt.setOnTextWillChange(this.AEQbTJ);
                this.KWHzl.element = true;
                this.copydefault.element = false;
                this.EZpvd.element = true;
                this.valueOf.copydefault(true, (java.lang.CharSequence) C54870xYj.AEQbTJ("115792089237316195423570985008687907853269984665640564039457584007913129639935", this.OLrzqt.copydefault()), (java.lang.CharSequence) "", this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.gcT$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ AbstractC20202gcT OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, AbstractC20202gcT abstractC20202gcT, java.lang.String str) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = abstractC20202gcT;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.OLrzqt.getContext();
                java.lang.Object systemService = context != null ? context.getSystemService("clipboard") : null;
                android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
                if (clipboardManager == null) {
                    return;
                }
                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, this.KWHzl));
                C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo), this.KWHzl).KWHzl(this.OLrzqt.getContext());
            }
        }
    }

    /* JADX INFO: renamed from: o.gcT$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ InterfaceC9730bbB.StateListAnimator AEQbTJ;
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;
        public final /* synthetic */ AbstractC20202gcT djBIcL;
        public final /* synthetic */ long gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, AbstractC20202gcT abstractC20202gcT, Ref.BooleanRef booleanRef3, InterfaceC9730bbB.StateListAnimator stateListAnimator) {
            this.OLrzqt = view;
            this.gEmmrt = j;
            this.EZpvd = booleanRef;
            this.KWHzl = booleanRef2;
            this.djBIcL = abstractC20202gcT;
            this.copydefault = booleanRef3;
            this.AEQbTJ = stateListAnimator;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strAEQbTJ;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.gEmmrt || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AbstractC16639eni abstractC16639eni = null;
                if (this.EZpvd.element) {
                    if (this.KWHzl.element) {
                        this.djBIcL.AEQbTJ("115792089237316195423570985008687907853269984665640564039457584007913129639935");
                    } else if (!this.copydefault.element) {
                        AbstractC20202gcT abstractC20202gcT = this.djBIcL;
                        AbstractC16639eni abstractC16639eni2 = abstractC20202gcT.uzCIH;
                        if (abstractC16639eni2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16639eni2 = null;
                        }
                        abstractC20202gcT.AEQbTJ(C54870xYj.KWHzl(abstractC16639eni2.gEmmrt.valueOf(), this.AEQbTJ.copydefault()));
                    } else {
                        AbstractC20202gcT abstractC20202gcT2 = this.djBIcL;
                        InterfaceC9730bbB.StateListAnimator stateListAnimatorAEQbTJ = abstractC20202gcT2.AEQbTJ();
                        if (stateListAnimatorAEQbTJ == null || (strAEQbTJ = stateListAnimatorAEQbTJ.AEQbTJ()) == null) {
                            strAEQbTJ = "";
                        }
                        abstractC20202gcT2.AEQbTJ(strAEQbTJ);
                    }
                }
                OKWBaseTransaction<?> oKWBaseTransactionEjfBZ = this.djBIcL.ejfBZ();
                if (oKWBaseTransactionEjfBZ instanceof C8972bMm) {
                    AbstractC16639eni abstractC16639eni3 = this.djBIcL.uzCIH;
                    if (abstractC16639eni3 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC16639eni = abstractC16639eni3;
                    }
                    abstractC16639eni.KWHzl.OLrzqt(0L);
                    AbstractC58185ywX<kotlin.Pair<java.lang.Boolean, java.lang.String>> abstractC58185ywXDGgnkA = ((C8972bMm) oKWBaseTransactionEjfBZ).DGgnkA();
                    LifecycleOwner viewLifecycleOwner = this.djBIcL.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    C58156yvv.OLrzqt(abstractC58185ywXDGgnkA, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY).AEQbTJ(new InterfaceC58227yxM(new Activity(oKWBaseTransactionEjfBZ, this.djBIcL)) { // from class: o.gcT.LoaderManager
                        public final /* synthetic */ Function1 copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.copydefault = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.copydefault.invoke(obj);
                        }
                    }, new InterfaceC58227yxM(new TaskDescription(this.djBIcL)) { // from class: o.gcT.LoaderManager
                        public final /* synthetic */ Function1 copydefault;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            Intrinsics.checkNotNullParameter(function1, "");
                            this.copydefault = function1;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final /* synthetic */ void accept(java.lang.Object obj) {
                            this.copydefault.invoke(obj);
                        }
                    });
                    return;
                }
                if (oKWBaseTransactionEjfBZ instanceof C9216bRR) {
                    C9216bRR c9216bRR = (C9216bRR) oKWBaseTransactionEjfBZ;
                    if (c9216bRR.OJuSTm().isChangedCustomRpc()) {
                        FragmentActivity activity = this.djBIcL.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        FragmentActivity activity2 = this.djBIcL.getActivity();
                        if (activity2 != null) {
                            c9216bRR.OJuSTm().setNeedReleaseTransfer(true);
                            activity2.startActivity(fXY.Companion.copydefault(activity2, oKWBaseTransactionEjfBZ));
                            return;
                        }
                        return;
                    }
                    c9216bRR.OJuSTm().setNeedReleaseTransfer(true);
                    FragmentActivity activity3 = this.djBIcL.getActivity();
                    if (activity3 != null) {
                        activity3.setResult(-1);
                    }
                    FragmentActivity activity4 = this.djBIcL.getActivity();
                    if (activity4 != null) {
                        activity4.finish();
                        return;
                    }
                    return;
                }
                FragmentActivity activity5 = this.djBIcL.getActivity();
                if (activity5 != null) {
                    activity5.setResult(-1);
                }
                FragmentActivity activity6 = this.djBIcL.getActivity();
                if (activity6 != null) {
                    activity6.finish();
                }
            }
        }
    }

    public static final Unit copydefault(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, AbstractC20202gcT abstractC20202gcT, InterfaceC9730bbB.StateListAnimator stateListAnimator, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        booleanRef.element = false;
        booleanRef2.element = false;
        booleanRef3.element = true;
        abstractC20202gcT.copydefault(false, (java.lang.CharSequence) c55033xcM.valueOf(), charSequence, stateListAnimator);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(AbstractC20202gcT abstractC20202gcT, Ref.BooleanRef booleanRef, java.lang.String str, java.lang.String str2, InterfaceC9730bbB.StateListAnimator stateListAnimator, Function2 function2) {
        abstractC20202gcT.copydefault(booleanRef.element, str, str2, stateListAnimator);
        AbstractC16639eni abstractC16639eni = abstractC20202gcT.uzCIH;
        if (abstractC16639eni == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni = null;
        }
        abstractC16639eni.gEmmrt.setOnTextWillChange(function2);
    }

    /* JADX INFO: renamed from: o.gcT$Activity */
    public static final class Activity implements Function1<kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String>, Unit> {
        public final /* synthetic */ AbstractC20202gcT<T> AEQbTJ;
        public final /* synthetic */ T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(T t, AbstractC20202gcT<T> abstractC20202gcT) {
            this.OLrzqt = t;
            this.AEQbTJ = abstractC20202gcT;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(kotlin.Pair<? extends java.lang.Boolean, ? extends java.lang.String> pair) {
            AEQbTJ(pair);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(kotlin.Pair<java.lang.Boolean, java.lang.String> pair) {
            if (!pair.getFirst().booleanValue()) {
                AbstractC16639eni abstractC16639eni = this.AEQbTJ.uzCIH;
                if (abstractC16639eni == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni = null;
                }
                abstractC16639eni.KWHzl.fIwbmz();
                java.lang.String second = pair.getSecond();
                if (second != null) {
                    C55326xho.toastWithFailedIcon$default(second, 0, 1, (java.lang.Object) null);
                    return;
                }
                return;
            }
            if (((C8972bMm) this.OLrzqt).OJuSTm().isChangedCustomRpc()) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$1(this.AEQbTJ, this.OLrzqt, null), 3, null);
            } else {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new OKWBaseSetApproveAmountFragment$initApproveAmountView$4$1$2(this.AEQbTJ, this.OLrzqt, null), 3, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.gcT$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ AbstractC20202gcT<T> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(AbstractC20202gcT<T> abstractC20202gcT) {
            this.KWHzl = abstractC20202gcT;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            AbstractC16639eni abstractC16639eni = this.KWHzl.uzCIH;
            if (abstractC16639eni == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni = null;
            }
            abstractC16639eni.KWHzl.fIwbmz();
            Intrinsics.copydefault(th);
            C10857bwP.copydefault("OKWSetApproveAmountFragment", th);
        }
    }

    public final void copydefault(boolean z, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, InterfaceC9730bbB.StateListAnimator stateListAnimator) {
        int iCopydefault;
        java.lang.String strOLrzqt = OLrzqt();
        java.lang.String strAEQbTJ = C14731dqw.AEQbTJ.AEQbTJ(stateListAnimator.AYXKKw(), 12);
        AbstractC16639eni abstractC16639eni = null;
        if (z) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
            AbstractC16639eni abstractC16639eni2 = this.uzCIH;
            if (abstractC16639eni2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni2 = null;
            }
            C57461yip c57461yip = abstractC16639eni2.gEmmrt;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) strAYXKKw);
            if (ejfBZ().DCUTEIddSDPG()) {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            } else {
                iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.OJuSTm);
            }
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iCopydefault), 0, strAYXKKw.length(), 17);
            android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            spannableStringBuilder2.append((java.lang.CharSequence) strAEQbTJ);
            spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, strAEQbTJ.length(), 17);
            Unit unit = Unit.INSTANCE;
            c57461yip.setAmountAndSymbol(spannedString, new android.text.SpannedString(spannableStringBuilder2));
            if (strOLrzqt.length() > 0) {
                AbstractC16639eni abstractC16639eni3 = this.uzCIH;
                if (abstractC16639eni3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni3 = null;
                }
                abstractC16639eni3.fetchVPNInfo.setText(strOLrzqt);
                AbstractC16639eni abstractC16639eni4 = this.uzCIH;
                if (abstractC16639eni4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni4 = null;
                }
                abstractC16639eni4.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            } else {
                AbstractC16639eni abstractC16639eni5 = this.uzCIH;
                if (abstractC16639eni5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni5 = null;
                }
                abstractC16639eni5.fetchVPNInfo.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZAwExL));
                AbstractC16639eni abstractC16639eni6 = this.uzCIH;
                if (abstractC16639eni6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16639eni6 = null;
                }
                abstractC16639eni6.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            }
            AbstractC16639eni abstractC16639eni7 = this.uzCIH;
            if (abstractC16639eni7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16639eni = abstractC16639eni7;
            }
            abstractC16639eni.KWHzl.setEnabled(true);
            return;
        }
        AbstractC16639eni abstractC16639eni8 = this.uzCIH;
        if (abstractC16639eni8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni8 = null;
        }
        C57461yip c57461yip2 = abstractC16639eni8.gEmmrt;
        android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
        spannableStringBuilder3.append(charSequence2);
        spannableStringBuilder3.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, charSequence2.length(), 17);
        android.text.SpannedString spannedString2 = new android.text.SpannedString(spannableStringBuilder3);
        android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder();
        spannableStringBuilder4.append((java.lang.CharSequence) strAEQbTJ);
        spannableStringBuilder4.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)), 0, strAEQbTJ.length(), 17);
        Unit unit2 = Unit.INSTANCE;
        c57461yip2.setAmountAndSymbol(spannedString2, new android.text.SpannedString(spannableStringBuilder4));
        java.lang.String strOLrzqt2 = stateListAnimator.OLrzqt();
        java.lang.String strAEQbTJ2 = strOLrzqt2 != null ? C54870xYj.AEQbTJ(strOLrzqt2, stateListAnimator.copydefault()) : null;
        if (strOLrzqt.length() > 0) {
            AbstractC16639eni abstractC16639eni9 = this.uzCIH;
            if (abstractC16639eni9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni9 = null;
            }
            abstractC16639eni9.fetchVPNInfo.setText(strOLrzqt);
            AbstractC16639eni abstractC16639eni10 = this.uzCIH;
            if (abstractC16639eni10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni10 = null;
            }
            abstractC16639eni10.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            AbstractC16639eni abstractC16639eni11 = this.uzCIH;
            if (abstractC16639eni11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16639eni = abstractC16639eni11;
            }
            abstractC16639eni.KWHzl.setEnabled(!C33129mqd.OLrzqt(charSequence, "0"));
            return;
        }
        if (C33129mqd.OLrzqt(charSequence, "0")) {
            AbstractC16639eni abstractC16639eni12 = this.uzCIH;
            if (abstractC16639eni12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni12 = null;
            }
            abstractC16639eni12.fetchVPNInfo.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ZxnNGp));
            AbstractC16639eni abstractC16639eni13 = this.uzCIH;
            if (abstractC16639eni13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni13 = null;
            }
            abstractC16639eni13.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            AbstractC16639eni abstractC16639eni14 = this.uzCIH;
            if (abstractC16639eni14 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16639eni = abstractC16639eni14;
            }
            abstractC16639eni.KWHzl.setEnabled(false);
            return;
        }
        if (C33129mqd.gEmmrt(charSequence, strAEQbTJ2)) {
            AbstractC16639eni abstractC16639eni15 = this.uzCIH;
            if (abstractC16639eni15 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni15 = null;
            }
            android.widget.TextView textView = abstractC16639eni15.fetchVPNInfo;
            int i = C13754dXa.FragmentManager.ICustomTabsServiceDefault;
            Intrinsics.copydefault((java.lang.Object) strAEQbTJ2);
            textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(strAEQbTJ2, null, 1, null)))));
            AbstractC16639eni abstractC16639eni16 = this.uzCIH;
            if (abstractC16639eni16 == null) {
                Intrinsics.gEmmrt("");
                abstractC16639eni16 = null;
            }
            abstractC16639eni16.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN));
            AbstractC16639eni abstractC16639eni17 = this.uzCIH;
            if (abstractC16639eni17 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16639eni = abstractC16639eni17;
            }
            abstractC16639eni.KWHzl.setEnabled(false);
            return;
        }
        AbstractC16639eni abstractC16639eni18 = this.uzCIH;
        if (abstractC16639eni18 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni18 = null;
        }
        abstractC16639eni18.fetchVPNInfo.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.shErWi));
        AbstractC16639eni abstractC16639eni19 = this.uzCIH;
        if (abstractC16639eni19 == null) {
            Intrinsics.gEmmrt("");
            abstractC16639eni19 = null;
        }
        abstractC16639eni19.fetchVPNInfo.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        AbstractC16639eni abstractC16639eni20 = this.uzCIH;
        if (abstractC16639eni20 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16639eni = abstractC16639eni20;
        }
        abstractC16639eni.KWHzl.setEnabled(true);
    }
}
