package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.business.defi.biz.constant.KYSApprovalType;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AddressModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Advance;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ApproveInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.AssetDiffModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.BaseModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DappInfoModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DefaultTx;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DivideModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.MevInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.NetworkFeeModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PreExecTransactionRes;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.RiskPopupInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.SignJsonRouter;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.Tabs;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TextModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TitleModuleModel;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TokenPair;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TriggerPrice;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxExplain;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.TxInfoItem;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.web3Uilib.bean.TransactionAssetInfoBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBeanNew;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC20082gaF;
import o.ActivityC20262gda;
import o.C13754dXa;
import o.C20197gcO;
import o.C52761wXj;
import o.C9694baS;
import o.InterfaceC9730bbB;
import o.InterfaceC9736bbH;
import o.fZU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gdB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC20237gdB<T extends OKWBaseTransaction<?>> extends AbstractC20102gaZ<T> {
    public boolean fARcdN = true;

    public final PreExecTransactionRes KWHzl() {
        PreExecTransactionRes preExecTransactionResQSLkRj = ejfBZ().QSLkRj();
        Intrinsics.copydefault(preExecTransactionResQSLkRj);
        return preExecTransactionResQSLkRj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.gdB<T extends com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        isConnected().copydefault();
        AEQbTJ((AbstractC20082gaF<T>.ActionBar) isConnected(), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.gaF<T>$ActionBar */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC20082gaF
    public final void AEQbTJ(@NotNull AbstractC20082gaF<T>.ActionBar actionBar, boolean z) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        try {
            TxInfoItem txInfo = KWHzl().getTxInfo();
            AEQbTJ((AbstractC20082gaF<T>.ActionBar) actionBar, (java.util.List<? extends BaseModel<?>>) (txInfo != null ? txInfo.getModuleList() : null), z);
        } catch (java.lang.Exception e) {
            C10857bwP.copydefault("OKWBaseTransactionModularizationFragment", e);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public final android.view.View[] KWHzl(java.lang.String str, java.lang.String str2) {
        if (str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return null;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        appCompatTextView.setLayoutParams(marginLayoutParams);
        appCompatTextView.setText(str);
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        Unit unit = Unit.INSTANCE;
        return new android.view.View[]{appCompatTextView, KWHzl(str2)};
    }

    public final android.view.View[] OLrzqt(java.lang.String str, java.lang.String str2, final java.lang.String str3) {
        if (str == null || str.length() == 0 || str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return null;
        }
        android.view.View[] viewArr = new android.view.View[2];
        AppCompatTextView appCompatTextView = new AppCompatTextView(requireContext());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMargins(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        appCompatTextView.setLayoutParams(marginLayoutParams);
        appCompatTextView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        appCompatTextView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        if (str3 == null || str3.length() == 0) {
            appCompatTextView.setText(str);
        } else {
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            C57494yjV c57494yjV = new C57494yjV(C33070mpX.copydefault(C52761wXj.Activity.QwvEab), str);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) str);
            spannableStringBuilder.setSpan(c57494yjV, length, spannableStringBuilder.length(), 17);
            appCompatTextView.setText(new android.text.SpannedString(spannableStringBuilder));
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: o.gdL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20237gdB.copydefault(this.EZpvd, str3, view);
                }
            });
        }
        Unit unit = Unit.INSTANCE;
        viewArr[0] = appCompatTextView;
        viewArr[1] = KWHzl(str2);
        return viewArr;
    }

    public static final void copydefault(AbstractC20237gdB abstractC20237gdB, java.lang.String str, android.view.View view) {
        new mAE(abstractC20237gdB.requireActivity(), str).AEQbTJ(view, AnchorPopupWindow.Style.Gray, AnchorPopupWindow.HorizontalPosition.ALIGN_LEFT, true);
    }

    public final android.view.View KWHzl(java.util.List<Tabs.Children> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StateListAnimator stateListAnimator = new StateListAnimator(this, list);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57432yiM c57432yiM = new C57432yiM(contextRequireContext, null, 0, 6, null);
        c57432yiM.setViewDataBean(new C57411yhs(stateListAnimator));
        return c57432yiM;
    }

    /* JADX INFO: renamed from: o.gdB$StateListAnimator */
    public static final class StateListAnimator extends PagerAdapter {
        public final /* synthetic */ AbstractC20237gdB<T> AEQbTJ;
        public final /* synthetic */ java.util.List<Tabs.Children> EZpvd;

        public StateListAnimator(AbstractC20237gdB<T> abstractC20237gdB, java.util.List<Tabs.Children> list) {
            this.AEQbTJ = abstractC20237gdB;
            this.EZpvd = list;
        }

        private final android.widget.TextView EZpvd(int i) {
            AppCompatTextView appCompatTextViewKWHzl = this.AEQbTJ.KWHzl((java.lang.String) null);
            java.util.List<Tabs.Children> list = this.EZpvd;
            appCompatTextViewKWHzl.setPadding(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), 0);
            ViewPager.LayoutParams layoutParams = new ViewPager.LayoutParams();
            ((ViewGroup.LayoutParams) layoutParams).height = -2;
            appCompatTextViewKWHzl.setText(list.get(i).getData());
            appCompatTextViewKWHzl.setLayoutParams(layoutParams);
            return appCompatTextViewKWHzl;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            java.lang.String title = this.EZpvd.get(i).getTitle();
            return title == null ? "" : title;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.EZpvd.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(obj, "");
            return Intrinsics.EZpvd(view, obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.widget.TextView textViewEZpvd = EZpvd(i);
            viewGroup.addView(textViewEZpvd);
            return textViewEZpvd;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(android.view.ViewGroup viewGroup, int i, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            Intrinsics.checkNotNullParameter(obj, "");
            android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
            if (view == null) {
                return;
            }
            viewGroup.removeView(view);
        }
    }

    public final android.view.View copydefault(final ApproveInfoModuleModel.ApproveInfoItem approveInfoItem) {
        java.lang.String strEZpvd;
        boolean z;
        java.lang.String strCopydefault;
        java.lang.Integer signTokenPrecision;
        java.lang.Integer decimals;
        ApproveInfoModuleModel.AuthQuantity authQuantity;
        java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> approveInfoList = approveInfoItem.getApproveInfoList();
        if (approveInfoList == null || approveInfoList.isEmpty()) {
            return null;
        }
        boolean z2 = true;
        if (approveInfoItem.getApproveInfoList().size() == 1) {
            ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem = approveInfoItem.getApproveInfoList().get(0);
            KYSApprovalType.Application application = KYSApprovalType.Companion;
            ApproveInfoModuleModel.Spender spender = approveInfoListItem.getSpender();
            if (application.OLrzqt(spender != null ? spender.getApprovalType() : null) == KYSApprovalType.CANCEL_AUTHORIZATION) {
                java.lang.String title = approveInfoItem.getTitle();
                if (title == null) {
                    title = "";
                }
                java.lang.String subTitle = approveInfoItem.getSubTitle();
                if (subTitle == null) {
                    subTitle = "";
                }
                RiskPopupInfo riskPopupInfo = approveInfoItem.getRiskPopupInfo();
                Function0<Unit> function0 = (riskPopupInfo != null ? riskPopupInfo.getData() : null) == null ? null : new Function0() { // from class: o.gdA
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AbstractC20237gdB.KWHzl(this.EZpvd, approveInfoItem);
                    }
                };
                ApproveInfoModuleModel.TxInfoItem tokenInfo = approveInfoListItem.getTokenInfo();
                java.lang.String imageUrl = tokenInfo != null ? tokenInfo.getImageUrl() : null;
                ApproveInfoModuleModel.TxInfoItem tokenInfo2 = approveInfoListItem.getTokenInfo();
                java.lang.String symbol = tokenInfo2 != null ? tokenInfo2.getSymbol() : null;
                return OLrzqt(title, subTitle, function0, (android.graphics.drawable.Drawable) null, imageUrl, (symbol == null || symbol.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol);
            }
        }
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C57466yiu c57466yiu = new C57466yiu(contextRequireContext, null, 0, 6, null);
        java.lang.String title2 = approveInfoItem.getTitle();
        java.lang.String str = title2 == null ? "" : title2;
        java.lang.String subTitle2 = approveInfoItem.getSubTitle();
        java.lang.String str2 = subTitle2 == null ? "" : subTitle2;
        RiskPopupInfo riskPopupInfo2 = approveInfoItem.getRiskPopupInfo();
        Function0 function02 = (riskPopupInfo2 != null ? riskPopupInfo2.getData() : null) == null ? null : new Function0() { // from class: o.gdG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20237gdB.copydefault(this.OLrzqt, approveInfoItem);
            }
        };
        java.util.List<ApproveInfoModuleModel.ApproveInfoListItem> approveInfoList2 = approveInfoItem.getApproveInfoList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(approveInfoList2, 10));
        for (final ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem2 : approveInfoList2) {
            if (this.fARcdN && (authQuantity = approveInfoListItem2.getAuthQuantity()) != null && Intrinsics.EZpvd(authQuantity.getAutoEdit(), java.lang.Boolean.TRUE) && (ejfBZ() instanceof InterfaceC9730bbB)) {
                this.fARcdN = false;
                EZpvd(approveInfoListItem2, approveInfoItem.getTxTitle());
            }
            java.lang.String amount = approveInfoListItem2.getAmount();
            if (amount == null) {
                amount = "";
            }
            ApproveInfoModuleModel.TxInfoItem tokenInfo3 = approveInfoListItem2.getTokenInfo();
            int iIntValue = (tokenInfo3 == null || (decimals = tokenInfo3.getDecimals()) == null) ? 0 : decimals.intValue();
            int iIntValue2 = (tokenInfo3 == null || (signTokenPrecision = tokenInfo3.getSignTokenPrecision()) == null) ? 8 : signTokenPrecision.intValue();
            if (!Intrinsics.EZpvd((java.lang.Object) amount, (java.lang.Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                strEZpvd = C54870xYj.EZpvd(amount, iIntValue, iIntValue2, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                z = false;
            } else {
                strEZpvd = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaGOrKO);
                z = z2;
            }
            java.lang.String imageUrl2 = tokenInfo3 != null ? tokenInfo3.getImageUrl() : null;
            C14726dqr c14726dqr = C14726dqr.OLrzqt;
            android.content.Context context = c57466yiu.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.graphics.drawable.Drawable drawableOLrzqt = c14726dqr.OLrzqt(context);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) strEZpvd);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(z ? C52761wXj.Activity.DTeKQX : C52761wXj.Activity.fdOvFl)), 0, strEZpvd.length(), 17);
            Unit unit = Unit.INSTANCE;
            android.text.SpannedString spannedString = new android.text.SpannedString(spannableStringBuilder);
            java.lang.String symbol2 = tokenInfo3 != null ? tokenInfo3.getSymbol() : null;
            java.lang.String strAYXKKw = (symbol2 == null || symbol2.length() == 0) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor) : symbol2;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) approveInfoListItem2.getExpiration())) {
                int i = C13754dXa.FragmentManager.PickVisualMediaRequestdefault;
                java.lang.String expiration = approveInfoListItem2.getExpiration();
                Intrinsics.copydefault((java.lang.Object) expiration);
                strCopydefault = C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", expiration)));
            } else {
                strCopydefault = "";
            }
            ApproveInfoModuleModel.AuthQuantity authQuantity2 = approveInfoListItem2.getAuthQuantity();
            android.graphics.drawable.Drawable drawableKWHzl = (authQuantity2 != null && Intrinsics.EZpvd(authQuantity2.getCanEdit(), java.lang.Boolean.TRUE) && (ejfBZ() instanceof InterfaceC9730bbB)) ? C33070mpX.KWHzl(C52761wXj.TaskDescription.DPhTBN) : null;
            ApproveInfoModuleModel.AuthQuantity authQuantity3 = approveInfoListItem2.getAuthQuantity();
            arrayList.add(new TransactionAssetInfoBean.AssetSimpleDataBean(imageUrl2, drawableOLrzqt, spannedString, strAYXKKw, strCopydefault, drawableKWHzl, (authQuantity3 != null && Intrinsics.EZpvd(authQuantity3.getCanEdit(), java.lang.Boolean.TRUE) && (ejfBZ() instanceof InterfaceC9730bbB)) ? new Function0() { // from class: o.gdI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20237gdB.copydefault(this.AEQbTJ, approveInfoListItem2, approveInfoItem);
                }
            } : null));
            z2 = true;
        }
        c57466yiu.setViewDataBean(new TransactionAssetInfoBean(arrayList, 0, C33070mpX.AYXKKw(C13754dXa.FragmentManager.search), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRoot), str, str2, function02, 2, null));
        return c57466yiu;
    }

    public static final Unit KWHzl(AbstractC20237gdB abstractC20237gdB, ApproveInfoModuleModel.ApproveInfoItem approveInfoItem) {
        androidx.fragment.app.FragmentManager parentFragmentManager = abstractC20237gdB.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i = C13754dXa.ActionBar.DfrfUJ;
        fZU.ActionBar actionBar = fZU.Companion;
        RiskPopupInfo.RiskPopupInfoItem data = approveInfoItem.getRiskPopupInfo().getData();
        Intrinsics.copydefault(data);
        fragmentTransactionBeginTransaction.add(i, actionBar.copydefault(data), (java.lang.String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC20237gdB abstractC20237gdB, ApproveInfoModuleModel.ApproveInfoItem approveInfoItem) {
        androidx.fragment.app.FragmentManager parentFragmentManager = abstractC20237gdB.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i = C13754dXa.ActionBar.DfrfUJ;
        fZU.ActionBar actionBar = fZU.Companion;
        RiskPopupInfo.RiskPopupInfoItem data = approveInfoItem.getRiskPopupInfo().getData();
        Intrinsics.copydefault(data);
        fragmentTransactionBeginTransaction.add(i, actionBar.copydefault(data), (java.lang.String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC20237gdB abstractC20237gdB, ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, ApproveInfoModuleModel.ApproveInfoItem approveInfoItem) {
        abstractC20237gdB.copydefault(approveInfoListItem, approveInfoItem.getTxTitle(), false);
        return Unit.INSTANCE;
    }

    public final void EZpvd(final ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, final TitleModuleModel titleModuleModel) {
        if (ejfBZ().OJuSTm().isChangedCustomRpc()) {
            return;
        }
        android.view.View view = getView();
        if (view != null) {
            view.setVisibility(4);
        }
        fXJ fxj = fXJ.KWHzl;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        fxj.EZpvd(viewLifecycleOwner, activity, KWHzl(), new Function0() { // from class: o.gdK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC20237gdB.copydefault(this.EZpvd, approveInfoListItem, titleModuleModel);
            }
        });
    }

    public static final Unit copydefault(AbstractC20237gdB abstractC20237gdB, ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, TitleModuleModel titleModuleModel) {
        abstractC20237gdB.copydefault(approveInfoListItem, titleModuleModel, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(ApproveInfoModuleModel.ApproveInfoListItem approveInfoListItem, TitleModuleModel titleModuleModel, final boolean z) {
        final int iKWHzl;
        if (!z) {
            AubY();
        }
        final T tEjfBZ = ejfBZ();
        if (tEjfBZ instanceof C8972bMm) {
            C8972bMm c8972bMm = (C8972bMm) tEjfBZ;
            iKWHzl = c8972bMm.heceqZ() ? c8972bMm.KWHzl(approveInfoListItem) : 0;
        }
        C9694baS.Application application = C9694baS.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        ActivityC20262gda.TaskDescription taskDescription = ActivityC20262gda.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.KWHzl(childFragmentManager, taskDescription.EZpvd(contextRequireContext, tEjfBZ, iKWHzl, titleModuleModel, z), new Function2() { // from class: o.gdN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AbstractC20237gdB.KWHzl(tEjfBZ, this, iKWHzl, z, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(OKWBaseTransaction oKWBaseTransaction, AbstractC20237gdB abstractC20237gdB, int i, boolean z, int i2, android.content.Intent intent) {
        FragmentActivity activity;
        if (!(oKWBaseTransaction instanceof AbstractC8601bFm) || !(oKWBaseTransaction instanceof InterfaceC9730bbB)) {
            return Unit.INSTANCE;
        }
        if (i2 == -1) {
            android.view.View view = abstractC20237gdB.getView();
            if (view != null) {
                view.setVisibility(0);
            }
            abstractC20237gdB.OLrzqt();
        } else if (oKWBaseTransaction instanceof C8972bMm) {
            C8972bMm c8972bMm = (C8972bMm) oKWBaseTransaction;
            if (c8972bMm.heceqZ()) {
                java.lang.String approveAmount$default = InterfaceC9736bbH.StateListAnimator.getApproveAmount$default((InterfaceC9736bbH) oKWBaseTransaction, i, false, 2, null);
                if (approveAmount$default.length() > 0) {
                    c8972bMm.copydefault(i, approveAmount$default);
                }
            } else {
                InterfaceC9730bbB interfaceC9730bbB = (InterfaceC9730bbB) oKWBaseTransaction;
                java.lang.String approveAmount$default2 = InterfaceC9730bbB.Application.getApproveAmount$default(interfaceC9730bbB, false, 1, null);
                if (approveAmount$default2.length() > 0) {
                    interfaceC9730bbB.EZpvd(approveAmount$default2);
                }
            }
            if ((z || ((AbstractC8601bFm) oKWBaseTransaction).OJuSTm().isChangedCustomRpc()) && (activity = abstractC20237gdB.getActivity()) != null) {
                activity.finish();
            }
        }
        return Unit.INSTANCE;
    }

    public final java.util.List<android.view.View> AEQbTJ(final AssetDiffModuleModel.AssetDiffItem assetDiffItem) {
        java.util.ArrayList arrayList;
        java.lang.String str;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.String title = assetDiffItem.getTitle();
        if (title != null && title.length() != 0) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C57466yiu c57466yiu = new C57466yiu(contextRequireContext, null, 0, 6, null);
            c57466yiu.setPadding(c57466yiu.getPaddingLeft(), c57466yiu.getPaddingTop(), c57466yiu.getPaddingRight(), C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
            java.lang.String title2 = assetDiffItem.getTitle();
            java.lang.String subTitle = assetDiffItem.getSubTitle();
            java.lang.String str2 = subTitle == null ? "" : subTitle;
            RiskPopupInfo riskPopupInfo = assetDiffItem.getRiskPopupInfo();
            c57466yiu.setViewDataBean(new TransactionAssetInfoBean(null, 0, null, null, title2, str2, (riskPopupInfo != null ? riskPopupInfo.getData() : null) == null ? null : new Function0() { // from class: o.gdJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20237gdB.copydefault(this.OLrzqt, assetDiffItem);
                }
            }, 15, null));
            arrayList2.add(c57466yiu);
        }
        for (AssetDiffModuleModel.AssetDiff assetDiff : assetDiffItem.getAssetDiffList()) {
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            C57428yiI c57428yiI = new C57428yiI(contextRequireContext2, null, 0, 6, null);
            java.lang.String title3 = assetDiff.getTitle();
            java.lang.String str3 = title3 == null ? "" : title3;
            java.util.List<AssetDiffModuleModel.TokenAssetDifflist> tokenAssetDifflist = assetDiff.getTokenAssetDifflist();
            if (tokenAssetDifflist != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(tokenAssetDifflist, 10));
                for (AssetDiffModuleModel.TokenAssetDifflist tokenAssetDifflist2 : tokenAssetDifflist) {
                    java.lang.String imageUrl = tokenAssetDifflist2.getTokenInfo().getImageUrl();
                    C14726dqr c14726dqr = C14726dqr.OLrzqt;
                    android.content.Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                    android.graphics.drawable.Drawable drawableOLrzqt = c14726dqr.OLrzqt(contextRequireContext3);
                    java.lang.String amount = tokenAssetDifflist2.getAmount();
                    if (amount == null || amount.length() == 0) {
                        str = "";
                    } else {
                        java.lang.String type = tokenAssetDifflist2.getType();
                        java.lang.String amount2 = tokenAssetDifflist2.getAmount();
                        int decimals = tokenAssetDifflist2.getTokenInfo().getDecimals();
                        java.lang.Integer signTokenPrecision = tokenAssetDifflist2.getTokenInfo().getSignTokenPrecision();
                        str = type + C54870xYj.EZpvd(amount2, decimals, signTokenPrecision != null ? signTokenPrecision.intValue() : 8, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
                    }
                    java.lang.String symbol = tokenAssetDifflist2.getTokenInfo().getSymbol();
                    if (symbol.length() == 0) {
                        symbol = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ensureSubDecor);
                    }
                    java.lang.String str4 = symbol;
                    java.lang.String usdAmount = tokenAssetDifflist2.getUsdAmount();
                    java.lang.String strCopydefault = usdAmount != null ? ejfBZ().copydefault(usdAmount) : null;
                    arrayList3.add(new TransactionHeaderInfoBeanNew.HeaderSimpleDataBeanNew(0, 0, imageUrl, null, drawableOLrzqt, null, str, str4, true, strCopydefault == null ? "" : strCopydefault, null, null, 0, null, null, null, null, 130091, null));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            c57428yiI.setViewDataBean(new TransactionHeaderInfoBeanNew(str3, arrayList, false, null, null, 0, C33070mpX.AYXKKw(C13754dXa.FragmentManager.search), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRoot), 60, null));
            arrayList2.add(c57428yiI);
        }
        return arrayList2;
    }

    public static final Unit copydefault(AbstractC20237gdB abstractC20237gdB, AssetDiffModuleModel.AssetDiffItem assetDiffItem) {
        androidx.fragment.app.FragmentManager parentFragmentManager = abstractC20237gdB.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i = C13754dXa.ActionBar.DfrfUJ;
        fZU.ActionBar actionBar = fZU.Companion;
        RiskPopupInfo.RiskPopupInfoItem data = assetDiffItem.getRiskPopupInfo().getData();
        Intrinsics.copydefault(data);
        fragmentTransactionBeginTransaction.add(i, actionBar.copydefault(data), (java.lang.String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: java.lang.Integer */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.Object AEQbTJ(@NotNull final BaseModel<?> baseModel, boolean z) {
        java.lang.Object objEZpvd;
        java.lang.String light;
        Intrinsics.checkNotNullParameter(baseModel, "");
        if (baseModel instanceof DivideModuleModel) {
            return yDY.gEmmrt(OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)), AbstractC20102gaZ.lineView$default(this, 0, 0, 3, null), OLrzqt(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null)));
        }
        if ((baseModel instanceof TokenPair) || (baseModel instanceof TriggerPrice)) {
            return null;
        }
        if (baseModel instanceof NetworkFeeModuleModel) {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C57471yiz c57471yiz = new C57471yiz(contextRequireContext, null, 0, 6, null);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.unregister);
            java.lang.String strDjBIcL = ejfBZ().dHguZz().djBIcL();
            java.lang.String strAYXKKw2 = ejfBZ().dHguZz().AYXKKw();
            C14726dqr c14726dqr = C14726dqr.OLrzqt;
            android.content.Context context = c57471yiz.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(strAYXKKw, false, strDjBIcL, null, null, strAYXKKw2, c14726dqr.OLrzqt(context), null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524186, null));
            return c57471yiz;
        }
        final java.lang.Object data = baseModel.getData();
        if (data instanceof MevInfo.MevInfoItem) {
            MevInfo.MevInfoItem mevInfoItem = (MevInfo.MevInfoItem) data;
            if (!Intrinsics.EZpvd(mevInfoItem.getSupportMev(), java.lang.Boolean.TRUE) || !(ejfBZ() instanceof InterfaceC9743bbO)) {
                data = null;
            }
            if (((MevInfo.MevInfoItem) data) != null) {
                return copydefault(z, mevInfoItem.getOpenMev(), mevInfoItem.getMevNodeList());
            }
            return null;
        }
        if (data instanceof TitleModuleModel.TitleModel) {
            if (C33492mxV.OLrzqt()) {
                TitleModuleModel.ImageItem image = ((TitleModuleModel.TitleModel) data).getImage();
                if (image != null) {
                    light = image.getDark();
                    title = light;
                }
            } else {
                TitleModuleModel.ImageItem image2 = ((TitleModuleModel.TitleModel) data).getImage();
                if (image2 != null) {
                    light = image2.getLight();
                    title = light;
                }
            }
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C13754dXa.Activity.ixgjPv);
            TitleModuleModel.TitleModel titleModel = (TitleModuleModel.TitleModel) data;
            java.lang.String text = titleModel.getTitle().getText();
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getAutoTimeNightModeManager);
            if (text != null && text.length() != 0) {
                strAYXKKw3 = text;
            }
            java.lang.String subTitle = titleModel.getSubTitle();
            java.lang.String str = subTitle == null ? "" : subTitle;
            java.lang.String desc = titleModel.getDesc();
            return AbstractC20102gaZ.titleInfoView$default(this, title, strAYXKKw3, null, str, desc == null ? "" : desc, drawableKWHzl, null, 68, null);
        }
        if (data instanceof DappInfoModuleModel.DappItem) {
            DappInfoModuleModel.DappItem dappItem = (DappInfoModuleModel.DappItem) data;
            java.lang.String title = dappItem.getTitle();
            if (title == null) {
                title = "";
            }
            int iQwvEab = ejfBZ().QwvEab();
            if (iQwvEab == 1 || iQwvEab == 3 || iQwvEab == 4 || iQwvEab == 6 || iQwvEab == 7) {
                C14726dqr c14726dqr2 = C14726dqr.OLrzqt;
                android.content.Context context2 = getContext();
                if (context2 == null) {
                    return null;
                }
                objEZpvd = c14726dqr2.EZpvd(context2);
            } else {
                objEZpvd = dappItem.getIcon();
            }
            java.lang.String host = dappItem.getHost();
            return AEQbTJ(title, objEZpvd, host != null ? host : "");
        }
        if (data instanceof AssetDiffModuleModel.AssetDiffItem) {
            return AEQbTJ((AssetDiffModuleModel.AssetDiffItem) data);
        }
        if (data instanceof ApproveInfoModuleModel.ApproveInfoItem) {
            return copydefault((ApproveInfoModuleModel.ApproveInfoItem) data);
        }
        if (data instanceof AddressModuleModel.AddressItem) {
            AddressModuleModel.AddressItem addressItem = (AddressModuleModel.AddressItem) data;
            java.lang.String title2 = addressItem.getTitle();
            java.lang.String address = addressItem.getAddress();
            java.lang.String str2 = address == null ? "" : address;
            title = Intrinsics.EZpvd(addressItem.getRedShow(), java.lang.Boolean.TRUE) ? java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DQzvGN)) : null;
            java.lang.String tag = addressItem.getTag();
            return AbstractC20102gaZ.addressView$default(this, title2, str2, title, null, tag == null ? "" : tag, null, true, null, false, null, 936, null);
        }
        if (data instanceof DefaultTx.DefaultTxItem) {
            DefaultTx.DefaultTxItem defaultTxItem = (DefaultTx.DefaultTxItem) data;
            java.lang.String title3 = defaultTxItem.getTitle();
            if (title3 == null) {
                title3 = "";
            }
            java.lang.String subTitle2 = defaultTxItem.getSubTitle();
            if (subTitle2 == null) {
                subTitle2 = "";
            }
            RiskPopupInfo riskPopupInfo = defaultTxItem.getRiskPopupInfo();
            Function0<Unit> function0 = (riskPopupInfo != null ? riskPopupInfo.getData() : null) == null ? null : new Function0() { // from class: o.gdF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AbstractC20237gdB.KWHzl(this.KWHzl, data);
                }
            };
            C14726dqr c14726dqr3 = C14726dqr.OLrzqt;
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            android.graphics.drawable.Drawable drawableKWHzl2 = c14726dqr3.KWHzl(contextRequireContext2);
            DefaultTx.TxInfoItem txInfo = defaultTxItem.getTxInfo();
            java.lang.String icon = txInfo != null ? txInfo.getIcon() : null;
            DefaultTx.TxInfoItem txInfo2 = defaultTxItem.getTxInfo();
            title = txInfo2 != null ? txInfo2.getTitle() : null;
            return OLrzqt(title3, subTitle2, function0, drawableKWHzl2, (java.lang.Object) icon, (java.lang.String) (title == null ? "" : title));
        }
        if (data instanceof Advance.AdvanceItem) {
            Advance.AdvanceItem advanceItem = (Advance.AdvanceItem) data;
            boolean zEZpvd = Intrinsics.EZpvd(advanceItem.getListExpansion(), java.lang.Boolean.TRUE);
            java.lang.String title4 = advanceItem.getTitle();
            return AEQbTJ(zEZpvd, title4 != null ? title4 : "", new Function1() { // from class: o.gdH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC20237gdB.KWHzl(this.copydefault, data, (AbstractC20082gaF.ActionBar) obj);
                }
            });
        }
        if (data instanceof Tabs.TabItem) {
            return KWHzl(((Tabs.TabItem) data).getChildren());
        }
        if (data instanceof SignJsonRouter.SignJsonRouterItem) {
            SignJsonRouter.SignJsonRouterItem signJsonRouterItem = (SignJsonRouter.SignJsonRouterItem) data;
            return KWHzl(signJsonRouterItem.getTitle(), signJsonRouterItem.getData());
        }
        if (data instanceof TextModuleModel.TextItem) {
            TextModuleModel.TextItem textItem = (TextModuleModel.TextItem) data;
            return OLrzqt(textItem.getTitle(), textItem.getText(), textItem.getTitleHover());
        }
        if (!(data instanceof TxExplain.ExplainItem)) {
            return null;
        }
        KeyEventDispatcher.Component activity = getActivity();
        InterfaceC57493yjU interfaceC57493yjU = activity instanceof InterfaceC57493yjU ? (InterfaceC57493yjU) activity : null;
        if (interfaceC57493yjU == null) {
            return null;
        }
        interfaceC57493yjU.OLrzqt(new Function1() { // from class: o.gdM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20237gdB.copydefault(this.KWHzl, baseModel, (android.widget.ImageView) obj);
            }
        });
        return null;
    }

    public static final Unit KWHzl(AbstractC20237gdB abstractC20237gdB, java.lang.Object obj) {
        androidx.fragment.app.FragmentManager parentFragmentManager = abstractC20237gdB.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = parentFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i = C13754dXa.ActionBar.DfrfUJ;
        fZU.ActionBar actionBar = fZU.Companion;
        RiskPopupInfo.RiskPopupInfoItem data = ((DefaultTx.DefaultTxItem) obj).getRiskPopupInfo().getData();
        Intrinsics.copydefault(data);
        fragmentTransactionBeginTransaction.add(i, actionBar.copydefault(data), (java.lang.String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC20237gdB abstractC20237gdB, java.lang.Object obj, AbstractC20082gaF.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        abstractC20237gdB.AEQbTJ(actionBar, (java.util.List<? extends BaseModel<?>>) ((Advance.AdvanceItem) obj).getChildren(), false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final AbstractC20237gdB abstractC20237gdB, final BaseModel baseModel, android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.v);
        Intrinsics.copydefault(drawableKWHzl);
        drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        imageView.setImageDrawable(drawableKWHzl);
        imageView.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.gdE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20237gdB.OLrzqt(this.copydefault, baseModel, view);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(AbstractC20237gdB abstractC20237gdB, BaseModel baseModel, android.view.View view) {
        if (abstractC20237gdB.getChildFragmentManager().isStateSaved()) {
            return;
        }
        C20197gcO.TaskDescription taskDescription = C20197gcO.Companion;
        Intrinsics.copydefault(baseModel, "");
        C20197gcO c20197gcOKWHzl = taskDescription.KWHzl((TxExplain) baseModel);
        androidx.fragment.app.FragmentManager childFragmentManager = abstractC20237gdB.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c20197gcOKWHzl.show(childFragmentManager);
    }

    @Override // o.AbstractC20082gaF
    public void copydefault(boolean z) {
        TxInfoItem txInfo;
        super.copydefault(z && (txInfo = KWHzl().getTxInfo()) != null && Intrinsics.EZpvd(txInfo.getCanConfirm(), java.lang.Boolean.TRUE));
    }

    @Override // o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (((AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection)) == null) {
            AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
        }
    }

    public final void AEQbTJ(AbstractC20082gaF<T>.ActionBar actionBar, java.util.List<? extends BaseModel<?>> list, boolean z) {
        if (list != null) {
            for (BaseModel<?> baseModel : list) {
                if (baseModel != null) {
                    actionBar.KWHzl(AEQbTJ(baseModel, z));
                }
            }
        }
    }
}
