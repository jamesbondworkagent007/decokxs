package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DescItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DescListItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.FeedbackInfo;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.FeedbackRequestParam;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.ImageItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.LinkItem;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.PopupInfoItem;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.JsonObject;
import o.C13754dXa;
import o.C52761wXj;
import o.fZS;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class fZS extends androidx.fragment.app.Fragment {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public Function0<Unit> AEQbTJ;
    public AbstractC16879esJ DbNXlk;
    public Function0<Unit> copydefault;
    public final InterfaceC56387yDm fetchVPNInfo;
    public PopupInfoItem gEmmrt;
    public java.lang.CharSequence djBIcL = "";
    public java.lang.CharSequence AhwBna = "";
    public java.lang.CharSequence AYXKKw = "";
    public java.lang.String valueOf = "";
    public java.lang.String KWHzl = "";
    public java.lang.String OLrzqt = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<Unit> function0) {
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupInfoItem OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    public fZS() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fXM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.moduleModel.ui.KysRiskTipFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.moduleModel.ui.KysRiskTipFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.moduleModel.ui.KysRiskTipFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fZS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final fZS OLrzqt(@NotNull PopupInfoItem popupInfoItem) {
            Intrinsics.checkNotNullParameter(popupInfoItem, "");
            fZS fzs = new fZS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("pop_up_info_item", popupInfoItem);
            fzs.setArguments(bundle);
            return fzs;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fXM<?> copydefault() {
        return (fXM) this.fetchVPNInfo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        AbstractC16879esJ abstractC16879esJOLrzqt = AbstractC16879esJ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(abstractC16879esJOLrzqt, "");
        this.DbNXlk = abstractC16879esJOLrzqt;
        return abstractC16879esJOLrzqt.getRoot();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        PopupInfoItem popupInfoItem;
        java.lang.String title;
        java.lang.String highlightBtnText;
        java.lang.String grayBtnText;
        java.lang.String btnLayout;
        java.lang.String text;
        RecyclerView recyclerView;
        android.view.View view2;
        java.util.List<DescListItem> descList;
        AbstractC16879esJ abstractC16879esJ;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        android.view.View view3;
        android.widget.LinearLayout linearLayout;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        ImageItem image;
        AbstractC16879esJ abstractC16879esJ2;
        AppCompatImageView appCompatImageView;
        DescItem desc;
        LinkItem link;
        DescItem desc2;
        OnBackPressedDispatcher onBackPressedDispatcher;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
            OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, getViewLifecycleOwner(), false, new Function1() { // from class: o.gaa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fZS.AEQbTJ(this.AEQbTJ, (OnBackPressedCallback) obj);
                }
            }, 2, null);
        }
        android.os.Bundle arguments = getArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            popupInfoItem = arguments != null ? (PopupInfoItem) arguments.getParcelable("pop_up_info_item", PopupInfoItem.class) : null;
        } else if (arguments != null) {
            popupInfoItem = (PopupInfoItem) arguments.getParcelable("pop_up_info_item");
        }
        this.gEmmrt = popupInfoItem;
        if (popupInfoItem == null || (title = popupInfoItem.getTitle()) == null) {
            title = "";
        }
        this.djBIcL = title;
        PopupInfoItem popupInfoItem2 = this.gEmmrt;
        if (popupInfoItem2 == null || (highlightBtnText = popupInfoItem2.getHighlightBtnText()) == null) {
            highlightBtnText = "";
        }
        this.valueOf = highlightBtnText;
        PopupInfoItem popupInfoItem3 = this.gEmmrt;
        if (popupInfoItem3 == null || (grayBtnText = popupInfoItem3.getGrayBtnText()) == null) {
            grayBtnText = "";
        }
        this.KWHzl = grayBtnText;
        PopupInfoItem popupInfoItem4 = this.gEmmrt;
        if (popupInfoItem4 == null || (btnLayout = popupInfoItem4.getBtnLayout()) == null) {
            btnLayout = "vertical";
        }
        this.OLrzqt = btnLayout;
        PopupInfoItem popupInfoItem5 = this.gEmmrt;
        if (popupInfoItem5 == null || (desc2 = popupInfoItem5.getDesc()) == null || (text = desc2.getText()) == null) {
            text = "";
        }
        this.AhwBna = text;
        PopupInfoItem popupInfoItem6 = this.gEmmrt;
        java.lang.String text2 = (popupInfoItem6 == null || (desc = popupInfoItem6.getDesc()) == null || (link = desc.getLink()) == null) ? null : link.getText();
        if (text2 != null && text2.length() != 0) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            Dialog dialog = new Dialog();
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) text2);
            spannableStringBuilder.setSpan(dialog, length, spannableStringBuilder.length(), 17);
            this.AYXKKw = new android.text.SpannedString(spannableStringBuilder);
        }
        PopupInfoItem popupInfoItem7 = this.gEmmrt;
        if (popupInfoItem7 != null && (image = popupInfoItem7.getImage()) != null && (abstractC16879esJ2 = this.DbNXlk) != null && (appCompatImageView = abstractC16879esJ2.AYXKKw) != null) {
            C33054mpH.AEQbTJ(appCompatImageView, EZpvd(image));
        }
        AbstractC16879esJ abstractC16879esJ3 = this.DbNXlk;
        if (abstractC16879esJ3 != null && (textView3 = abstractC16879esJ3.djBIcL) != null) {
            textView3.setText(this.djBIcL);
        }
        AbstractC16879esJ abstractC16879esJ4 = this.DbNXlk;
        int i = 8;
        if (abstractC16879esJ4 != null && (textView2 = abstractC16879esJ4.AhwBna) != null) {
            textView2.setVisibility(this.AhwBna.length() == 0 ? 8 : 0);
            textView2.setText(this.AhwBna);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView2.setClickable(true);
        }
        AbstractC16879esJ abstractC16879esJ5 = this.DbNXlk;
        if (abstractC16879esJ5 != null && (textView = abstractC16879esJ5.values) != null) {
            if (this.AYXKKw.length() > 0) {
                textView.setVisibility(0);
                textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                textView.setText(this.AYXKKw);
                textView.setClickable(true);
            } else {
                textView.setVisibility(8);
            }
        }
        PopupInfoItem popupInfoItem8 = this.gEmmrt;
        java.util.List<DescListItem> descList2 = popupInfoItem8 != null ? popupInfoItem8.getDescList() : null;
        if (descList2 == null || descList2.isEmpty()) {
            AbstractC16879esJ abstractC16879esJ6 = this.DbNXlk;
            if (abstractC16879esJ6 != null && (view2 = abstractC16879esJ6.isConnected) != null) {
                view2.setVisibility(8);
            }
            AbstractC16879esJ abstractC16879esJ7 = this.DbNXlk;
            if (abstractC16879esJ7 != null && (recyclerView = abstractC16879esJ7.gEmmrt) != null) {
                recyclerView.setVisibility(8);
            }
        } else {
            AbstractC16879esJ abstractC16879esJ8 = this.DbNXlk;
            if (abstractC16879esJ8 != null && (linearLayout = abstractC16879esJ8.valueOf) != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
                    linearLayout.setLayoutParams(marginLayoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            AbstractC16879esJ abstractC16879esJ9 = this.DbNXlk;
            if (abstractC16879esJ9 != null && (view3 = abstractC16879esJ9.isConnected) != null) {
                view3.setVisibility(0);
            }
            AbstractC16879esJ abstractC16879esJ10 = this.DbNXlk;
            if (abstractC16879esJ10 != null && (recyclerView3 = abstractC16879esJ10.gEmmrt) != null) {
                recyclerView3.setVisibility(0);
            }
            PopupInfoItem popupInfoItem9 = this.gEmmrt;
            if (popupInfoItem9 != null && (descList = popupInfoItem9.getDescList()) != null && (abstractC16879esJ = this.DbNXlk) != null && (recyclerView2 = abstractC16879esJ.gEmmrt) != null) {
                recyclerView2.setAdapter(new ActionBar(descList));
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) "vertical")) {
            AbstractC16879esJ abstractC16879esJ11 = this.DbNXlk;
            if (abstractC16879esJ11 != null) {
                abstractC16879esJ11.KWHzl.setVisibility(8);
                abstractC16879esJ11.OLrzqt.setVisibility(0);
                abstractC16879esJ11.copydefault.setText(this.valueOf);
                abstractC16879esJ11.AEQbTJ.setText(this.KWHzl);
                C52794wYp c52794wYp = abstractC16879esJ11.copydefault;
                java.lang.CharSequence text3 = c52794wYp.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "");
                c52794wYp.setVisibility(text3.length() > 0 ? 0 : 8);
                C52794wYp c52794wYp2 = abstractC16879esJ11.AEQbTJ;
                java.lang.CharSequence text4 = c52794wYp2.getText();
                Intrinsics.checkNotNullExpressionValue(text4, "");
                c52794wYp2.setVisibility(text4.length() > 0 ? 0 : 8);
                android.view.View view4 = abstractC16879esJ11.EZpvd;
                C52794wYp c52794wYp3 = abstractC16879esJ11.copydefault;
                Intrinsics.checkNotNullExpressionValue(c52794wYp3, "");
                if (c52794wYp3.getVisibility() == 0) {
                    C52794wYp c52794wYp4 = abstractC16879esJ11.AEQbTJ;
                    Intrinsics.checkNotNullExpressionValue(c52794wYp4, "");
                    if (c52794wYp4.getVisibility() == 0) {
                        i = 0;
                    }
                }
                view4.setVisibility(i);
                AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(abstractC16879esJ11.copydefault);
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                abstractC58247yxgCopydefault.throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fZX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        fZS.copydefault(this.AEQbTJ, obj);
                    }
                });
                C8003auW.copydefault(abstractC16879esJ11.AEQbTJ).throttleFirst(1L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.fZW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        fZS.KWHzl(this.KWHzl, obj);
                    }
                });
            }
        } else {
            AbstractC16879esJ abstractC16879esJ12 = this.DbNXlk;
            if (abstractC16879esJ12 != null) {
                abstractC16879esJ12.KWHzl.setVisibility(0);
                abstractC16879esJ12.OLrzqt.setVisibility(8);
                C57468yiw c57468yiw = abstractC16879esJ12.KWHzl;
                c57468yiw.setPrimaryButtonText(this.KWHzl);
                c57468yiw.setSecondaryButtonText(this.valueOf);
                c57468yiw.setPrimaryButtonCallBack(new Function0() { // from class: o.fZZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return fZS.djBIcL(this.EZpvd);
                    }
                });
                c57468yiw.setSecondaryButtonCallBack(new Function0() { // from class: o.fZY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return fZS.valueOf(this.KWHzl);
                    }
                });
            }
        }
        EZpvd();
        view.post(new java.lang.Runnable() { // from class: o.gaf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                fZS.AYXKKw(this.KWHzl);
            }
        });
    }

    public static final Unit AEQbTJ(fZS fzs, OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        FragmentActivity activity = fzs.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final class Dialog extends android.text.style.ClickableSpan {
        public Dialog() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            java.lang.String strAYXKKw;
            DescItem desc;
            LinkItem link;
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = fZS.this.getContext();
            if (context != null) {
                fZS fzs = fZS.this;
                WebActivity.TaskDescription taskDescription = WebActivity.Companion;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                PopupInfoItem popupInfoItemOLrzqt = fzs.OLrzqt();
                if (popupInfoItemOLrzqt == null || (desc = popupInfoItemOLrzqt.getDesc()) == null || (link = desc.getLink()) == null || (strAYXKKw = link.getHref()) == null) {
                    strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDescription);
                }
                pairArr[0] = C56390yDp.OLrzqt("url", strAYXKKw);
                pairArr[1] = C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString());
                WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(pairArr), null, 4, null);
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            android.content.Context context = fZS.this.getContext();
            if (context != null) {
                textPaint.setColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ FeedbackInfo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ fZS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, fZS fzs, FeedbackInfo feedbackInfo) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = fzs;
            this.KWHzl = feedbackInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AbstractC12782ctV abstractC12782ctVDUDNAs;
            java.lang.Integer reportType;
            java.lang.Long chainIndex;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                OKWBaseTransaction oKWBaseTransactionAEQbTJ = this.copydefault.copydefault().AEQbTJ();
                if (oKWBaseTransactionAEQbTJ == null || (abstractC12782ctVDUDNAs = oKWBaseTransactionAEQbTJ.dUDNAs()) == null) {
                    return;
                }
                FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.showLoading();
                }
                FeedbackRequestParam feedbackRequestParam = this.KWHzl.getFeedbackRequestParam();
                java.util.HashMap map = new java.util.HashMap();
                java.lang.String address = feedbackRequestParam != null ? feedbackRequestParam.getAddress() : null;
                if (address == null) {
                    address = "";
                }
                map.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, address);
                java.lang.String reportedAddress = feedbackRequestParam != null ? feedbackRequestParam.getReportedAddress() : null;
                if (reportedAddress == null) {
                    reportedAddress = "";
                }
                map.put("reportedAddress", reportedAddress);
                map.put("chainIndex", java.lang.Long.valueOf((feedbackRequestParam == null || (chainIndex = feedbackRequestParam.getChainIndex()) == null) ? -1L : chainIndex.longValue()));
                map.put("reportType", java.lang.Integer.valueOf((feedbackRequestParam == null || (reportType = feedbackRequestParam.getReportType()) == null) ? -1 : reportType.intValue()));
                java.util.Map mapValues = C56424yEw.values(map);
                fZS fzs = this.copydefault;
                java.lang.String method = this.KWHzl.getMethod();
                java.lang.String url = this.KWHzl.getUrl();
                if (url == null) {
                    return;
                }
                AbstractC58185ywX abstractC58185ywXCopydefault = fzs.copydefault(abstractC12782ctVDUDNAs, method, url, mapValues);
                LifecycleOwner viewLifecycleOwner = this.copydefault.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                C58156yvv.OLrzqt(abstractC58185ywXCopydefault, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY).AEQbTJ(new InterfaceC58227yxM(new Activity(abstractActivityC33041mov, this.copydefault, this.KWHzl)) { // from class: o.fZS.LoaderManager
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(new PendingIntent(abstractActivityC33041mov)) { // from class: o.fZS.LoaderManager
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                });
            }
        }
    }

    public static final void copydefault(fZS fzs, java.lang.Object obj) {
        Function0<Unit> function0 = fzs.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void KWHzl(fZS fzs, java.lang.Object obj) {
        Function0<Unit> function0 = fzs.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final Unit djBIcL(fZS fzs) {
        Function0<Unit> function0 = fzs.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(fZS fzs) {
        Function0<Unit> function0 = fzs.AEQbTJ;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(fZS fzs) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) fzs, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd() {
        FeedbackInfo feedbackInfo;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        PopupInfoItem popupInfoItem = this.gEmmrt;
        if (popupInfoItem == null || (feedbackInfo = popupInfoItem.getFeedbackInfo()) == null) {
            return;
        }
        AbstractC16879esJ abstractC16879esJ = this.DbNXlk;
        if (abstractC16879esJ != null && (textView3 = abstractC16879esJ.AkhnZx) != null) {
            textView3.setText(feedbackInfo.getFeedbackEntryText());
        }
        AbstractC16879esJ abstractC16879esJ2 = this.DbNXlk;
        if (abstractC16879esJ2 != null && (textView2 = abstractC16879esJ2.AkhnZx) != null) {
            textView2.setVisibility(0);
        }
        AbstractC16879esJ abstractC16879esJ3 = this.DbNXlk;
        if (abstractC16879esJ3 == null || (textView = abstractC16879esJ3.AkhnZx) == null) {
            return;
        }
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this, feedbackInfo));
    }

    public static final class Activity implements Function1<JSONObject, Unit> {
        public final /* synthetic */ FeedbackInfo KWHzl;
        public final /* synthetic */ AbstractActivityC33041mov OLrzqt;
        public final /* synthetic */ fZS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(AbstractActivityC33041mov abstractActivityC33041mov, fZS fzs, FeedbackInfo feedbackInfo) {
            this.OLrzqt = abstractActivityC33041mov;
            this.copydefault = fzs;
            this.KWHzl = feedbackInfo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(JSONObject jSONObject) {
            KWHzl(jSONObject);
            return Unit.INSTANCE;
        }

        public final void KWHzl(JSONObject jSONObject) {
            android.widget.TextView textView;
            java.lang.String feedbackResultText;
            AbstractActivityC33041mov abstractActivityC33041mov = this.OLrzqt;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            fZS fzs = this.copydefault;
            AbstractC16879esJ abstractC16879esJ = fzs.DbNXlk;
            if (abstractC16879esJ == null || (textView = abstractC16879esJ.AkhnZx) == null || (feedbackResultText = this.KWHzl.getFeedbackResultText()) == null) {
                return;
            }
            fzs.EZpvd(textView, feedbackResultText);
        }
    }

    public static final class PendingIntent implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ AbstractActivityC33041mov KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(AbstractActivityC33041mov abstractActivityC33041mov) {
            this.KWHzl = abstractActivityC33041mov;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            AbstractActivityC33041mov abstractActivityC33041mov = this.KWHzl;
            if (abstractActivityC33041mov != null) {
                abstractActivityC33041mov.dismissLoading();
            }
            Intrinsics.copydefault(th);
            C10857bwP.copydefault("KysRiskTipFragment", th);
        }
    }

    public final void EZpvd(android.view.View view, java.lang.String str) {
        Unit unit;
        android.widget.TextView textView;
        try {
            Result.Application application = Result.Companion;
            C55284xgz c55284xgzKWHzl = C55284xgz.Companion.KWHzl(view, str);
            if (c55284xgzKWHzl != null) {
                c55284xgzKWHzl.isConnected(0);
                c55284xgzKWHzl.djBIcL(0);
                c55284xgzKWHzl.AEQbTJ(str);
                AbstractC16879esJ abstractC16879esJ = this.DbNXlk;
                if (abstractC16879esJ == null || (textView = abstractC16879esJ.AkhnZx) == null) {
                    return;
                }
                c55284xgzKWHzl.AEQbTJ(textView);
                c55284xgzKWHzl.hDKMBd();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7377constructorimpl(unit);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    private final java.lang.String EZpvd(ImageItem imageItem) {
        return !C33492mxV.OLrzqt() ? imageItem.getLight() : imageItem.getDark();
    }

    public static final class ActionBar extends RecyclerView.Adapter<Application> {
        public final java.util.List<DescListItem> EZpvd;

        public ActionBar(@NotNull java.util.List<DescListItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(C13754dXa.TaskDescription.dXcUrg, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Application(viewInflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.EZpvd.size();
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull Application application, int i) {
            Intrinsics.checkNotNullParameter(application, "");
            if (i < this.EZpvd.size()) {
                application.EZpvd(this.EZpvd.get(i));
            }
        }
    }

    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<org.json.JSONObject> */
    public final AbstractC58185ywX<JSONObject> copydefault(AbstractC12782ctV abstractC12782ctV, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        AbstractC58185ywX<JsonObject> abstractC58185ywXKWHzl;
        C13934dbu c13934dbu = new C13934dbu();
        if (C59449zhJ.OLrzqt((java.lang.CharSequence) str, (java.lang.CharSequence) "post", true)) {
            abstractC58185ywXKWHzl = c13934dbu.copydefault(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), str2, map);
        } else {
            abstractC58185ywXKWHzl = c13934dbu.KWHzl(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), str2, map);
        }
        final Function1 function1 = new Function1() { // from class: o.fZV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fZS.KWHzl((JsonObject) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.fZT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return fZS.EZpvd(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final JSONObject EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (JSONObject) function1.invoke(obj);
    }

    public static final JSONObject KWHzl(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        return new JSONObject(jsonObject.toString());
    }

    public static final class Application extends RecyclerView.ViewHolder {
        public final android.widget.TextView AEQbTJ;
        public final android.widget.TextView EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull android.view.View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.PlaybackStateCompatBuilder);
            this.AEQbTJ = (android.widget.TextView) view.findViewById(C13754dXa.ActionBar.getRccStateFromState);
        }

        public final void EZpvd(@NotNull DescListItem descListItem) {
            Intrinsics.checkNotNullParameter(descListItem, "");
            this.EZpvd.setText(descListItem.getText());
            this.AEQbTJ.setText(AEQbTJ(descListItem));
        }

        public final java.lang.CharSequence AEQbTJ(DescListItem descListItem) {
            java.lang.String highLightLogic = descListItem.getHighLightLogic();
            if (highLightLogic == null || highLightLogic.length() == 0) {
                java.lang.String desc = descListItem.getDesc();
                return desc != null ? desc : "";
            }
            kotlin.Pair<java.lang.Integer, java.lang.Integer> pairCopydefault = copydefault(descListItem.getHighLightLogic());
            return EZpvd(descListItem.getDesc(), pairCopydefault.getFirst().intValue() + pairCopydefault.getSecond().intValue(), pairCopydefault.getFirst().intValue(), pairCopydefault.getSecond().intValue());
        }

        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> copydefault(java.lang.String str) {
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null);
            if (listSplit$default.size() == 2) {
                try {
                    return C56390yDp.OLrzqt(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(0))), java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(1))));
                } catch (java.lang.Exception unused) {
                    return C56390yDp.OLrzqt(4, 6);
                }
            }
            return C56390yDp.OLrzqt(4, 6);
        }

        public final java.lang.CharSequence EZpvd(java.lang.String str, int i, int i2, int i3) {
            if (str == null || str.length() == 0 || C33129mqd.valueOf(java.lang.Integer.valueOf(str.length()), java.lang.Integer.valueOf(i))) {
                return str == null ? "" : str;
            }
            java.lang.String strSubstring = str.substring(i3, C33129mqd.AhwBna(C54862xYb.AEQbTJ(java.lang.Integer.valueOf(str.length()), java.lang.Integer.valueOf(i2))));
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.gae
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fZS.Application.KWHzl((java.util.List) obj);
                }
            }, 14, null), new java.lang.String[]{strSubstring}, 0, null, false, new Function1() { // from class: o.gad
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return fZS.Application.EZpvd((java.util.List) obj);
                }
            }, 14, null);
        }

        public static final Unit KWHzl(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
            return Unit.INSTANCE;
        }
    }
}
