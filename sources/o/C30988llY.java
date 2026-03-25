package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PresetLevelBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetLevelEditViewModel;
import com.okinc.business.trade.features.home.ui.meme.preset.dialog.PresetAmountLevelEditDialog$QuickBuySellBinder$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.llY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30988llY extends AbstractC30989llZ {
    public wYF AhwBna;
    public final java.util.ArrayList<PresetLevelBean> AkhnZx;
    public C43316rmw DbNXlk;
    public final java.util.List<java.lang.String> fetchVPNInfo;
    public C21566hEc gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public Function0<Unit> valueOf;
    public final InterfaceC56387yDm values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm AuCTel = C56392yDr.copydefault(new Function0() { // from class: o.lma
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C30988llY.values(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.lmb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C30988llY.gEmmrt(this.OLrzqt);
        }
    });

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C30988llY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.dialog.PresetAmountLevelEditDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.dialog.PresetAmountLevelEditDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetLevelEditViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.dialog.PresetAmountLevelEditDialog$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.dialog.PresetAmountLevelEditDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.dialog.PresetAmountLevelEditDialog$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.llX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30988llY.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.DbNXlk = new C43316rmw();
        this.AkhnZx = new java.util.ArrayList<>();
        this.fetchVPNInfo = new java.util.ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int AYXKKw() {
        return ((java.lang.Number) this.AuCTel.getValue()).intValue();
    }

    public static final int values(C30988llY c30988llY) {
        android.os.Bundle arguments = c30988llY.getArguments();
        if (arguments != null) {
            return arguments.getInt("key.transaction_type");
        }
        return 0;
    }

    private final java.lang.String gEmmrt() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String gEmmrt(C30988llY c30988llY) {
        java.lang.String string;
        android.os.Bundle arguments = c30988llY.getArguments();
        return (arguments == null || (string = arguments.getString("chain_id")) == null) ? "" : string;
    }

    public final PresetLevelEditViewModel AhwBna() {
        return (PresetLevelEditViewModel) this.isConnected.getValue();
    }

    /* JADX DEBUG: Possible override for method o.llZ.KWHzl()V */
    public final DexMultiTokenInfoBean KWHzl() {
        return (DexMultiTokenInfoBean) this.values.getValue();
    }

    public static final DexMultiTokenInfoBean fetchVPNInfo(C30988llY c30988llY) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl = c30988llY.AhwBna().KWHzl(c30988llY.gEmmrt());
        return dexMultiTokenInfoBeanKWHzl == null ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBeanKWHzl;
    }

    /* JADX INFO: renamed from: o.llY$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.llY.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: newInstance-hulS_a4$default, reason: not valid java name */
        public static /* synthetic */ C30988llY m8682newInstancehulS_a4$default(TaskDescription taskDescription, int i, java.lang.String str, int i2, Function0 function0, int i3, java.lang.Object obj) {
            if ((i3 & 4) != 0) {
                i2 = C31172lox.Companion.KWHzl();
            }
            return taskDescription.AEQbTJ(i, str, i2, function0);
        }

        public final C30988llY AEQbTJ(int i, @NotNull java.lang.String str, int i2, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C30988llY c30988llY = new C30988llY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key.transaction_type", i);
            bundle.putString("chain_id", str);
            C31125loC.copydefault(bundle, i2);
            c30988llY.setArguments(bundle);
            c30988llY.valueOf = function0;
            return c30988llY;
        }
    }

    /* JADX INFO: renamed from: o.llY$Activity */
    public final class Activity extends AbstractC25436iwg<PresetLevelBean, C21642hGy> {

        /* JADX INFO: renamed from: o.llY$Activity$Activity, reason: collision with other inner class name */
        public static final class C0872Activity implements android.text.TextWatcher {
            public final /* synthetic */ C25435iwf EZpvd;
            public final /* synthetic */ C55001xbh OLrzqt;
            public final /* synthetic */ C30988llY copydefault;

            @Override // android.text.TextWatcher
            public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            }

            public C0872Activity(C55001xbh c55001xbh, C30988llY c30988llY, C25435iwf c25435iwf) {
                this.OLrzqt = c55001xbh;
                this.copydefault = c30988llY;
                this.EZpvd = c25435iwf;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(android.text.Editable editable) {
                C52794wYp c52794wYpCopydefault;
                boolean z;
                java.lang.String strIsConnected = this.OLrzqt.isConnected();
                this.copydefault.fetchVPNInfo.set(this.EZpvd.getLayoutPosition(), strIsConnected);
                int i = 0;
                boolean z2 = strIsConnected.length() > 0 && C23313hvq.OLrzqt(strIsConnected, 0);
                wYF wyf = this.copydefault.AhwBna;
                if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                    java.util.List<java.lang.String> list = this.copydefault.fetchVPNInfo;
                    if ((list instanceof java.util.Collection) && list.isEmpty()) {
                        z = true;
                        c52794wYpCopydefault.setEnabled(z);
                    } else {
                        for (java.lang.String str : list) {
                            if (str.length() <= 0 || !C23313hvq.OLrzqt(str, 0)) {
                                z = false;
                                break;
                            }
                        }
                        z = true;
                        c52794wYpCopydefault.setEnabled(z);
                    }
                }
                C21566hEc c21566hEc = this.copydefault.gEmmrt;
                if (c21566hEc == null) {
                    Intrinsics.gEmmrt("");
                    c21566hEc = null;
                }
                android.widget.TextView textView = c21566hEc.EZpvd;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                java.util.List<java.lang.String> list2 = this.copydefault.fetchVPNInfo;
                if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                    i = 8;
                } else {
                    for (java.lang.String str2 : list2) {
                        if (str2.length() > 0 && C23313hvq.copydefault(str2, 0)) {
                            break;
                        }
                    }
                    i = 8;
                }
                textView.setVisibility(i);
                if (z2) {
                    java.lang.Object obj = this.copydefault.AkhnZx.get(this.EZpvd.getLayoutPosition());
                    Intrinsics.checkNotNullExpressionValue(obj, "");
                    PresetLevelBean presetLevelBean = (PresetLevelBean) obj;
                    if (this.copydefault.AYXKKw() == TransactionType.Buy.getType()) {
                        presetLevelBean.setValue(strIsConnected);
                        presetLevelBean.setFormatValue(pTB.formatLocalized$default(strIsConnected, null, 1, null));
                    } else {
                        presetLevelBean.setValue(C23313hvq.divCheckS$default(strIsConnected, 100, null, null, null, 14, null));
                        presetLevelBean.setFormatValue(C23311hvo.formatPercent$default(strIsConnected, false, 0, 0, null, null, 30, null));
                    }
                }
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
            super(PresetAmountLevelEditDialog$QuickBuySellBinder$1.INSTANCE);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull C25435iwf<C21642hGy> c25435iwf, @NotNull PresetLevelBean presetLevelBean) {
            java.lang.String strMulCheckS$default;
            Intrinsics.checkNotNullParameter(c25435iwf, "");
            Intrinsics.checkNotNullParameter(presetLevelBean, "");
            C55009xbp c55009xbpFIwbmz = ((C21642hGy) c25435iwf.EZpvd()).AEQbTJ.fIwbmz();
            if (c55009xbpFIwbmz != null) {
                c55009xbpFIwbmz.KWHzl();
            }
            C55001xbh c55001xbhAkhnZx = ((C21642hGy) c25435iwf.EZpvd()).AEQbTJ.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                ViewGroup.LayoutParams layoutParams = c55001xbhAkhnZx.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    android.content.Context context = c55001xbhAkhnZx.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    marginLayoutParams.setMarginEnd(C55298xhM.OLrzqt(12, context));
                    c55001xbhAkhnZx.setLayoutParams(marginLayoutParams);
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setGravity(17);
            }
            int iAYXKKw = C30988llY.this.AYXKKw();
            TransactionType transactionType = TransactionType.Buy;
            if (iAYXKKw == transactionType.getType()) {
                strMulCheckS$default = presetLevelBean.getValue();
            } else {
                strMulCheckS$default = C23313hvq.mulCheckS$default(presetLevelBean.getValue(), 100, null, null, null, 14, null);
            }
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setPlainNumericText(strMulCheckS$default);
            }
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setText(pTB.formatLocalized$default(strMulCheckS$default, null, 1, null));
            }
            if (C30988llY.this.AYXKKw() == transactionType.getType()) {
                if (c55001xbhAkhnZx != null) {
                    copydefault(c55001xbhAkhnZx);
                }
            } else if (c55001xbhAkhnZx != null) {
                AEQbTJ(c55001xbhAkhnZx);
            }
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.addTextChangedListener(new C0872Activity(c55001xbhAkhnZx, C30988llY.this, c25435iwf));
            }
        }

        public final void copydefault(C55001xbh c55001xbh) {
            c55001xbh.setFilters(null);
            c55001xbh.setMaxDecimalValue(C22370heA.OLrzqt(C30988llY.this.KWHzl().getDecimals()));
            c55001xbh.setShowThousandsSeparator(true);
        }

        public final void AEQbTJ(C55001xbh c55001xbh) {
            c55001xbh.setShowThousandsSeparator(false);
            c55001xbh.setFilters(C31063lmu.Companion.OLrzqt());
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.EZpvd().setVisibility(8);
        wxq.setStyle(2);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        if (AYXKKw() == TransactionType.Buy.getType()) {
            strAYXKKw = C33069mpW.copydefault(C23274hvD.Fragment.IResultReceiver_Parcel, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", KWHzl().getTokenSymbol())));
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IResultReceiver2Default);
        }
        textViewAYXKKw.setText(strAYXKKw);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = C21566hEc.KWHzl(getLayoutInflater(), constraintLayout, true);
        djBIcL();
        valueOf();
    }

    private final void valueOf() {
        if (AYXKKw() == TransactionType.Buy.getType()) {
            PresetLevelEditViewModel presetLevelEditViewModelAhwBna = AhwBna();
            java.lang.String strGEmmrt = gEmmrt();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl = AhwBna().KWHzl(gEmmrt());
            java.lang.String tokenContractAddress = dexMultiTokenInfoBeanKWHzl != null ? dexMultiTokenInfoBeanKWHzl.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            for (java.lang.String str : presetLevelEditViewModelAhwBna.AEQbTJ(strGEmmrt, tokenContractAddress)) {
                this.AkhnZx.add(new PresetLevelBean(pTB.formatLocalized$default(str, null, 1, null), str, false, 4, (DefaultConstructorMarker) null));
            }
        } else {
            for (java.lang.String str2 : AhwBna().OLrzqt(gEmmrt())) {
                this.AkhnZx.add(new PresetLevelBean(C23311hvo.formatPercent$default(str2, false, 0, 0, null, null, 31, null), str2, false, 4, (DefaultConstructorMarker) null));
            }
        }
        this.DbNXlk.setItems(this.AkhnZx);
        java.util.ArrayList<PresetLevelBean> arrayList = this.AkhnZx;
        java.util.List<java.lang.String> list = this.fetchVPNInfo;
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            list.add(((PresetLevelBean) it.next()).getValue());
        }
        this.DbNXlk.notifyDataSetChanged();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AhwBna = wyf;
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(getString(C23274hvD.Fragment.fXYAwm));
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setContentDescription("web3_dex_meme_edit_confirm_btn");
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new View.OnClickListener() { // from class: o.lmc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C30988llY.OLrzqt(this.copydefault, view);
                }
            });
        }
    }

    public static final void OLrzqt(C30988llY c30988llY, android.view.View view) {
        if (c30988llY.AYXKKw() == TransactionType.Buy.getType()) {
            PresetLevelEditViewModel presetLevelEditViewModelAhwBna = c30988llY.AhwBna();
            java.lang.String strGEmmrt = c30988llY.gEmmrt();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanKWHzl = c30988llY.AhwBna().KWHzl(c30988llY.gEmmrt());
            java.lang.String tokenContractAddress = dexMultiTokenInfoBeanKWHzl != null ? dexMultiTokenInfoBeanKWHzl.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            java.util.ArrayList<PresetLevelBean> arrayList = c30988llY.AkhnZx;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((PresetLevelBean) it.next()).getValue());
            }
            presetLevelEditViewModelAhwBna.OLrzqt(strGEmmrt, tokenContractAddress, arrayList2);
        } else {
            PresetLevelEditViewModel presetLevelEditViewModelAhwBna2 = c30988llY.AhwBna();
            java.lang.String strGEmmrt2 = c30988llY.gEmmrt();
            java.util.ArrayList<PresetLevelBean> arrayList3 = c30988llY.AkhnZx;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            java.util.Iterator<T> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((PresetLevelBean) it2.next()).getValue());
            }
            presetLevelEditViewModelAhwBna2.EZpvd(strGEmmrt2, arrayList4);
        }
        Function0<Unit> function0 = c30988llY.valueOf;
        if (function0 != null) {
            function0.invoke();
        }
        c30988llY.dismiss();
    }

    private final void djBIcL() {
        C21566hEc c21566hEc = this.gEmmrt;
        C21566hEc c21566hEc2 = null;
        if (c21566hEc == null) {
            Intrinsics.gEmmrt("");
            c21566hEc = null;
        }
        c21566hEc.AEQbTJ.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.DbNXlk.register(PresetLevelBean.class, new Activity());
        C21566hEc c21566hEc3 = this.gEmmrt;
        if (c21566hEc3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c21566hEc2 = c21566hEc3;
        }
        c21566hEc2.AEQbTJ.setAdapter(this.DbNXlk);
        this.DbNXlk.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AhwBna = null;
    }
}
