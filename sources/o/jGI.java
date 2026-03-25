package o;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.alert.AlertDataUiItem;
import com.okinc.business.market.data.model.alert.AlertGroupUiItem;
import com.okinc.business.market.data.model.alert.AlertPromptType;
import com.okinc.business.market.data.model.alert.AlertRepeatType;
import com.okinc.business.market.data.model.alert.AlertTimeFrame;
import com.okinc.business.market.data.model.alert.AlertType;
import com.okinc.business.market.data.model.alert.AlertUiItem;
import com.okinc.business.market.data.model.alert.PromptTypes;
import com.okinc.business.market.data.model.alert.TokenInfoForAlert;
import com.okinc.business.market.features.alert.create.coinselect.tokenlist.data.AlertMarketCapUnit;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.C22366hdx;
import o.C23274hvD;
import o.C25804jGz;
import o.C52761wXj;
import o.InterfaceC25800jGv;
import o.jGT;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes15.dex */
public final class jGI extends wXX {
    public final java.util.List<C25801jGw> AEQbTJ;
    public boolean AhwBna;
    public int djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public C22326hdJ gEmmrt;
    public Function1<? super AlertUiItem, Unit> valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final AlertPromptType copydefault = AlertPromptType.PRICE_REACHES;
    public static final AlertType OLrzqt = AlertType.MARKETCAP;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.jGJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jGI.AkhnZx(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.jGL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return jGI.DbNXlk(this.OLrzqt);
        }
    });

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AlertPromptType.values().length];
            try {
                iArr[AlertPromptType.PRICE_REACHES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AlertPromptType.PRICE_MOVE_BELOW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertPromptType.PRICE_MOVE_ABOVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super AlertUiItem, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    public static final class Dialog implements android.text.TextWatcher {
        public final /* synthetic */ C22326hdJ AEQbTJ;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Dialog(C22326hdJ c22326hdJ) {
            this.AEQbTJ = c22326hdJ;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            jGX.updateInputs$default(jGI.this.AYXKKw(), null, null, this.AEQbTJ.fIwbmz.isConnected(), null, null, 27, null);
        }
    }

    public static final class LoaderManager implements android.text.TextWatcher {
        public final /* synthetic */ C22326hdJ OLrzqt;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public LoaderManager(C22326hdJ c22326hdJ) {
            this.OLrzqt = c22326hdJ;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            jGX.updateInputs$default(jGI.this.AYXKKw(), null, null, this.OLrzqt.AuCTel.isConnected(), null, null, 27, null);
        }
    }

    public static final class TaskStackBuilder implements android.text.TextWatcher {
        public final /* synthetic */ jGI EZpvd;
        public final /* synthetic */ C22326hdJ KWHzl;

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public TaskStackBuilder(C22326hdJ c22326hdJ, jGI jgi) {
            this.KWHzl = c22326hdJ;
            this.EZpvd = jgi;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            java.lang.String strIsConnected = this.KWHzl.ejfBZ.isConnected();
            if (strIsConnected.length() <= 0) {
                jGX.updateInputs$default(this.EZpvd.AYXKKw(), null, null, strIsConnected, null, null, 27, null);
            } else {
                jGX.updateInputs$default(this.EZpvd.AYXKKw(), null, null, C23313hvq.mulCheckS$default(strIsConnected, java.lang.Integer.valueOf(this.EZpvd.AYXKKw().KWHzl()), null, null, null, 14, null), null, null, 27, null);
            }
        }
    }

    public jGI() {
        Function0 function0 = new Function0() { // from class: o.jGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jGI.isConnected();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(jGX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.alert.create.ui.Web3NewOrModifyAlertFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.djBIcL = 16;
        this.AEQbTJ = yDY.gEmmrt(new C25801jGw(".5", false), new C25801jGw(".25", false), new C25801jGw(".5", true), new C25801jGw("1", true), new C25801jGw("2", true));
    }

    public final AlertDataUiItem EZpvd() {
        return (AlertDataUiItem) this.KWHzl.getValue();
    }

    public static final AlertDataUiItem AkhnZx(jGI jgi) {
        android.os.Bundle arguments = jgi.getArguments();
        if (arguments != null) {
            return (AlertDataUiItem) BundleCompat.getParcelable(arguments, "alert_data_item", AlertDataUiItem.class);
        }
        return null;
    }

    public final TokenInfoForAlert KWHzl() {
        return (TokenInfoForAlert) this.AYXKKw.getValue();
    }

    public static final TokenInfoForAlert DbNXlk(jGI jgi) {
        android.os.Bundle arguments = jgi.getArguments();
        if (arguments != null) {
            return (TokenInfoForAlert) BundleCompat.getParcelable(arguments, "token_info_for_alert", TokenInfoForAlert.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory isConnected() {
        return new C25808jHc();
    }

    public final jGX AYXKKw() {
        return (jGX) this.fetchVPNInfo.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(2);
        wxq.KWHzl().setVisibility(8);
        if (EZpvd() == null) {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.UlpNxW);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DXTac);
        }
        wxq.setTitle(strAYXKKw);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.gEmmrt = C22326hdJ.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        jGX jgxAYXKKw = AYXKKw();
        TokenInfoForAlert tokenInfoForAlertKWHzl = KWHzl();
        if (tokenInfoForAlertKWHzl == null) {
            tokenInfoForAlertKWHzl = new TokenInfoForAlert(null, null, null, null, null, null, null, null, null, false, 1023, null);
        }
        jgxAYXKKw.copydefault(tokenInfoForAlertKWHzl, EZpvd());
        TokenInfoForAlert tokenInfoForAlertKWHzl2 = KWHzl();
        if (tokenInfoForAlertKWHzl2 != null && C33129mqd.OLrzqt((java.lang.CharSequence) tokenInfoForAlertKWHzl2.AhwBna())) {
            this.AhwBna = true;
            this.djBIcL = jHS.EZpvd.OLrzqt(tokenInfoForAlertKWHzl2.AhwBna());
        }
        AkhnZx();
        AhwBna();
        fetchVPNInfo();
        gEmmrt();
    }

    private final void AkhnZx() {
        java.lang.String string;
        final C22326hdJ c22326hdJ = this.gEmmrt;
        if (c22326hdJ != null) {
            c22326hdJ.getRoot().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jGQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    jGI.EZpvd(this.OLrzqt, c22326hdJ, view, z);
                }
            });
            int i = 1;
            c22326hdJ.fIwbmz.setShowThousandsSeparator(true);
            c22326hdJ.ejfBZ.setShowThousandsSeparator(true);
            c22326hdJ.ejfBZ.setContentDescription("web3_dex_market_alert_mcap_input");
            c22326hdJ.AYXKKw.setContentDescription("web3_dex_market_alert_mcap_unit");
            c22326hdJ.AuCTel.setShowThousandsSeparator(true);
            TokenInfoForAlert tokenInfoForAlertKWHzl = KWHzl();
            if (tokenInfoForAlertKWHzl != null && tokenInfoForAlertKWHzl.AEQbTJ()) {
                c22326hdJ.hDKMBd.setEnabled(false);
                c22326hdJ.zLjUOn.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
                android.widget.ImageView imageView = c22326hdJ.AubY;
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.OJuSTm);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
                c22326hdJ.zsXlph.setImageAlpha(128);
                c22326hdJ.OLrzqt.setImageAlpha(128);
            } else {
                c22326hdJ.hDKMBd.setEnabled(true);
                c22326hdJ.zLjUOn.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                android.widget.ImageView imageView2 = c22326hdJ.AubY;
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.OJuSTm);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                } else {
                    drawableKWHzl2 = null;
                }
                imageView2.setImageDrawable(drawableKWHzl2);
                c22326hdJ.zsXlph.setImageAlpha(255);
                c22326hdJ.OLrzqt.setImageAlpha(255);
            }
            AlertDataUiItem alertDataUiItemEZpvd = EZpvd();
            if (alertDataUiItemEZpvd != null) {
                copydefault(alertDataUiItemEZpvd.copydefault(), alertDataUiItemEZpvd.djBIcL(), alertDataUiItemEZpvd.AEQbTJ());
            }
            int i2 = 0;
            for (java.lang.Object obj : this.AEQbTJ) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                C25801jGw c25801jGw = (C25801jGw) obj;
                android.widget.LinearLayout linearLayout = c22326hdJ.values;
                android.widget.TextView textView = new android.widget.TextView(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                layoutParams.weight = 1.0f;
                if (i2 < this.AEQbTJ.size() - i) {
                    layoutParams.setMarginEnd(C55298xhM.dp2px$default(8.0f, null, i, null));
                }
                textView.setLayoutParams(layoutParams);
                textView.setGravity(17);
                textView.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
                textView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                textView.setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.fZBcTu));
                textView.setText(C33069mpW.copydefault(c25801jGw.KWHzl() ? C22366hdx.StateListAnimator.iwGUEr : C22366hdx.StateListAnimator.fARcdN, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(c25801jGw.EZpvd(), false, 0, 0, null, null, 31, null)))));
                textView.setOnClickListener(new Intent(textView, 1000L, this, c25801jGw, c22326hdJ));
                linearLayout.addView(textView);
                i2++;
                i = 1;
            }
            c22326hdJ.ejfBZ.AkhnZx();
            c22326hdJ.EZpvd.setType(14);
            C52794wYp c52794wYpCopydefault = c22326hdJ.EZpvd.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setVisibility(0);
                c52794wYpCopydefault.setContentDescription("web3_dex_market_alert_save_button");
                c52794wYpCopydefault.setText(EZpvd() != null ? C33070mpX.AYXKKw(C23274hvD.Fragment.getFieldNames) : C33070mpX.AYXKKw(C23274hvD.Fragment.ComponentActivity2));
                c52794wYpCopydefault.setOnClickListener(new DialogInterface(c52794wYpCopydefault, 1000L, this));
            }
            C52794wYp c52794wYpAEQbTJ = c22326hdJ.EZpvd.AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(0);
                if (EZpvd() != null) {
                    string = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy);
                } else {
                    string = getString(C23274hvD.Fragment.sanrWj);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                }
                c52794wYpAEQbTJ.setText(string);
                c52794wYpAEQbTJ.setOKDSType(260);
                c52794wYpAEQbTJ.setOnClickListener(new ContextWrapper(c52794wYpAEQbTJ, 1000L, this, c52794wYpAEQbTJ));
            }
        }
    }

    public static final void EZpvd(jGI jgi, C22326hdJ c22326hdJ, android.view.View view, boolean z) {
        android.content.Context context;
        if (!z || (context = jgi.getContext()) == null) {
            return;
        }
        C33570myu.AEQbTJ(context, c22326hdJ.getRoot());
    }

    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jGI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, jGI jgi) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = jgi;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.jGz.StateListAnimator.newInstance$default(o.jGz$StateListAnimator, java.util.List, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):o.jGz */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (this.copydefault.AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
                    jGT value = this.copydefault.AYXKKw().OLrzqt().getValue();
                    Intrinsics.copydefault(value, "");
                    jGT.Fragment fragment = (jGT.Fragment) value;
                    C25804jGz.StateListAnimator.newInstance$default(C25804jGz.Companion, this.copydefault.AYXKKw().copydefault(fragment.EZpvd()), false, this.copydefault.new PendingIntent(fragment), 2, null).show(this.copydefault.getChildFragmentManager(), C25804jGz.class.getName());
                }
            }
        }
    }

    public static final class BroadcastReceiver implements View.OnClickListener {
        public final /* synthetic */ jGI AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(android.view.View view, long j, jGI jgi) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.AEQbTJ.AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
                    jGT value = this.AEQbTJ.AYXKKw().OLrzqt().getValue();
                    Intrinsics.copydefault(value, "");
                    C25804jGz.Companion.EZpvd(this.AEQbTJ.AYXKKw().KWHzl(((jGT.Fragment) value).AYXKKw()), true, this.AEQbTJ.new Fragment()).show(this.AEQbTJ.getChildFragmentManager(), C25804jGz.class.getName());
                }
            }
        }
    }

    public static final class ComponentCallbacks implements View.OnClickListener {
        public final /* synthetic */ jGI EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks(android.view.View view, long j, jGI jgi) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt(AlertRepeatType.REPEAT);
            }
        }
    }

    public static final class ComponentCallbacks2 implements View.OnClickListener {
        public final /* synthetic */ jGI AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(android.view.View view, long j, jGI jgi) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt(AlertRepeatType.ONCE);
            }
        }
    }

    public static final class ComponentName implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jGI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName(android.view.View view, long j, jGI jgi) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.OLrzqt.AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
                    jGT value = this.OLrzqt.AYXKKw().OLrzqt().getValue();
                    Intrinsics.copydefault(value, "");
                    jGT.Fragment fragment = (jGT.Fragment) value;
                    C25804jGz.StateListAnimator stateListAnimator = C25804jGz.Companion;
                    jGX jgxAYXKKw = this.OLrzqt.AYXKKw();
                    AlertPromptType alertPromptTypeEZpvd = fragment.EZpvd();
                    AlertType alertTypeCopydefault = fragment.copydefault();
                    TokenInfoForAlert tokenInfoForAlertKWHzl = this.OLrzqt.KWHzl();
                    C25804jGz.StateListAnimator.newInstance$default(stateListAnimator, jgxAYXKKw.KWHzl(alertPromptTypeEZpvd, alertTypeCopydefault, tokenInfoForAlertKWHzl != null ? tokenInfoForAlertKWHzl.EZpvd() : null), false, new Application(fragment, this.OLrzqt), 2, null).show(this.OLrzqt.getChildFragmentManager(), C25804jGz.class.getName());
                }
            }
        }
    }

    public static final class ContextWrapper implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C52794wYp OLrzqt;
        public final /* synthetic */ jGI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(android.view.View view, long j, jGI jgi, C52794wYp c52794wYp) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = jgi;
            this.OLrzqt = c52794wYp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TokenInfoForAlert tokenInfoForAlertKWHzl = this.copydefault.KWHzl();
                if (tokenInfoForAlertKWHzl != null) {
                    if (this.copydefault.EZpvd() == null) {
                        this.copydefault.copydefault(jGI.copydefault, "", jGI.OLrzqt);
                        this.copydefault.AYXKKw().KWHzl(tokenInfoForAlertKWHzl);
                        return;
                    }
                    android.content.Context context = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C22366hdx.StateListAnimator.fetchVPNInfo);
                    viewOnClickListenerC54939xaY.copydefault(C22366hdx.StateListAnimator.AkhnZx);
                    viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.MediaControllerCompatApi21CallbackProxy, new Context(viewOnClickListenerC54939xaY, this.copydefault));
                    viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.ORxRYg, new ContentResolver(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public static final class DialogInterface implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ jGI OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(android.view.View view, long j, jGI jgi) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.OLrzqt.AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
                    jGT value = this.OLrzqt.AYXKKw().OLrzqt().getValue();
                    Intrinsics.copydefault(value, "");
                    jGT.Fragment fragment = (jGT.Fragment) value;
                    if (!C33129mqd.copydefault((java.lang.Object) fragment.OLrzqt(), (java.lang.Object) 100) || !yDY.gEmmrt(AlertPromptType.LOSS_EXCEEDS_5MIN, AlertPromptType.LOSS_EXCEEDS_1H, AlertPromptType.LOSS_EXCEEDS_4H, AlertPromptType.LOSS_EXCEEDS_24H).contains(fragment.EZpvd())) {
                        if (!this.OLrzqt.copydefault(fragment.OLrzqt())) {
                            if (this.OLrzqt.EZpvd() != null) {
                                this.OLrzqt.AYXKKw().copydefault();
                                return;
                            } else {
                                this.OLrzqt.AYXKKw().AEQbTJ();
                                return;
                            }
                        }
                        C55326xho.toastWithFailedIcon$default(C22366hdx.StateListAnimator.values, 0, 1, (java.lang.Object) null);
                        return;
                    }
                    C55326xho.toastWithFailedIcon$default(C22366hdx.StateListAnimator.OLrzqt, 0, 1, (java.lang.Object) null);
                }
            }
        }
    }

    public static final class Intent implements View.OnClickListener {
        public final /* synthetic */ C22326hdJ AEQbTJ;
        public final /* synthetic */ C25801jGw EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ jGI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(android.view.View view, long j, jGI jgi, C25801jGw c25801jGw, C22326hdJ c22326hdJ) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = jgi;
            this.EZpvd = c25801jGw;
            this.AEQbTJ = c22326hdJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault.AYXKKw().djBIcL().getValue())) {
                    java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(this.copydefault.AYXKKw().djBIcL().getValue(), this.EZpvd.KWHzl() ? C33129mqd.addS$default("1", this.EZpvd.EZpvd(), null, null, null, 14, null) : C33129mqd.subS$default("1", this.EZpvd.EZpvd(), null, null, null, 14, null), null, null, null, 14, null);
                    this.AEQbTJ.fIwbmz.setLocalizedNumericText(pTB.formatLocalized$default(strMulCheckS$default, null, 1, null));
                    C55001xbh c55001xbh = this.AEQbTJ.fIwbmz;
                    c55001xbh.setSelection(c55001xbh.isConnected().length());
                    this.copydefault.valueOf();
                    jGX.updateInputs$default(this.copydefault.AYXKKw(), null, null, strMulCheckS$default, null, null, 27, null);
                    C32866mlf.onEvent$default("DEXMarket_Token_AlertPricePresetButton_Click", (TrackChannel[]) null, new ClipData(this.copydefault.AYXKKw().AYXKKw(), this.EZpvd), 1, (java.lang.Object) null);
                }
            }
        }
    }

    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ jGI AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, jGI jgi) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("DEXMarket_Token_Alert_Select_Token_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                InterfaceC25629jAm interfaceC25629jAm = (InterfaceC25629jAm) C43251rlk.copydefault(InterfaceC25629jAm.class);
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                TradingBizType tradingBizType = TradingBizType.AdvancedMarket;
                TokenInfoForAlert tokenInfoForAlertAYXKKw = this.AEQbTJ.AYXKKw().AYXKKw();
                java.lang.String strCopydefault = tokenInfoForAlertAYXKKw != null ? tokenInfoForAlertAYXKKw.copydefault() : null;
                java.lang.String str = strCopydefault == null ? "" : strCopydefault;
                TokenInfoForAlert tokenInfoForAlertAYXKKw2 = this.AEQbTJ.AYXKKw().AYXKKw();
                java.lang.String strCopydefault2 = tokenInfoForAlertAYXKKw2 != null ? tokenInfoForAlertAYXKKw2.copydefault() : null;
                interfaceC25629jAm.KWHzl(childFragmentManager, new C28385kZl(tradingBizType, str, strCopydefault2 == null ? "" : strCopydefault2, true, true, null, null, null, 224, null), this.AEQbTJ.new FragmentManager());
            }
        }
    }

    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C22326hdJ KWHzl;
        public final /* synthetic */ jGI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(android.view.View view, long j, jGI jgi, C22326hdJ c22326hdJ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = jgi;
            this.KWHzl = c22326hdJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.AYXKKw().AhwBna().getValue())) {
                    java.lang.String value = this.OLrzqt.AYXKKw().AhwBna().getValue();
                    if (this.OLrzqt.AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
                        int iKWHzl = this.OLrzqt.AYXKKw().KWHzl();
                        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(value, java.lang.Integer.valueOf(iKWHzl), null, null, null, 14, null);
                        this.KWHzl.ejfBZ.setLocalizedNumericText(strDivCheckS$default);
                        C22326hdJ c22326hdJ = this.KWHzl;
                        c22326hdJ.ejfBZ.setSelection(c22326hdJ.fIwbmz.isConnected().length());
                        BigDecimal scale = new BigDecimal(strDivCheckS$default).setScale(6, RoundingMode.HALF_UP);
                        Intrinsics.checkNotNullExpressionValue(scale, "");
                        jGX.updateInputs$default(this.OLrzqt.AYXKKw(), null, null, C23313hvq.mulCheckS$default(scale, java.lang.Integer.valueOf(iKWHzl), null, null, null, 14, null), null, null, 27, null);
                        this.OLrzqt.djBIcL();
                        C32866mlf.onEvent$default("DEXMarket_Alert_AlertCurrentMcp_Click", (TrackChannel[]) null, new ActionBar(this.OLrzqt.AYXKKw().AYXKKw()), 1, (java.lang.Object) null);
                    }
                }
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C22326hdJ EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ jGI copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, jGI jgi, C22326hdJ c22326hdJ) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = jgi;
            this.EZpvd = c22326hdJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault.AYXKKw().djBIcL().getValue())) {
                    java.lang.String value = this.copydefault.AYXKKw().djBIcL().getValue();
                    this.EZpvd.fIwbmz.setLocalizedNumericText(pTB.formatLocalized$default(value, null, 1, null));
                    C55001xbh c55001xbh = this.EZpvd.fIwbmz;
                    c55001xbh.setSelection(c55001xbh.isConnected().length());
                    this.copydefault.valueOf();
                    jGX.updateInputs$default(this.copydefault.AYXKKw(), null, null, value, null, null, 27, null);
                    C32866mlf.onEvent$default("DEXMarket_Token_AlertPricePresetButton_Click", (TrackChannel[]) null, new StateListAnimator(this.copydefault.AYXKKw().AYXKKw()), 1, (java.lang.Object) null);
                }
            }
        }
    }

    public static final class ClipData implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ C25801jGw EZpvd;
        public final /* synthetic */ TokenInfoForAlert KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(TokenInfoForAlert tokenInfoForAlert, C25801jGw c25801jGw) {
            this.KWHzl = tokenInfoForAlert;
            this.EZpvd = c25801jGw;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            TokenInfoForAlert tokenInfoForAlert = this.KWHzl;
            java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
            EventParamsList.put$default(eventParamsList, "token_address", strValueOf == null ? "" : strValueOf, false, 4, null);
            TokenInfoForAlert tokenInfoForAlert2 = this.KWHzl;
            java.lang.String strDjBIcL = tokenInfoForAlert2 != null ? tokenInfoForAlert2.djBIcL() : null;
            EventParamsList.put$default(eventParamsList, "token_symbol", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
            java.lang.String str = this.EZpvd.KWHzl() ? Marker.ANY_NON_NULL_MARKER : "-";
            EventParamsList.put$default(eventParamsList, "button_click", str + C23311hvo.formatPercent$default(this.EZpvd.EZpvd(), false, 0, 0, null, null, 31, null), false, 4, null);
        }
    }

    public static final class Context implements View.OnClickListener {
        public final /* synthetic */ jGI AEQbTJ;
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, jGI jgi) {
            this.copydefault = viewOnClickListenerC54939xaY;
            this.AEQbTJ = jgi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
            this.AEQbTJ.AYXKKw().EZpvd();
        }
    }

    public static final class ContentResolver implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    public final boolean copydefault(java.lang.String str) {
        return ((java.lang.String) StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{JwtUtilsKt.JWT_DELIMITER}, false, 0, 6, (java.lang.Object) null).get(0)).length() > 16;
    }

    public final void copydefault(AlertPromptType alertPromptType, java.lang.String str, AlertType alertType) {
        C22326hdJ c22326hdJ = this.gEmmrt;
        if (c22326hdJ != null) {
            int i = Activity.copydefault[alertPromptType.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                if (alertType == AlertType.PRICE) {
                    if (str.length() == 0) {
                        c22326hdJ.fIwbmz.setText("");
                    } else {
                        c22326hdJ.fIwbmz.setLocalizedNumericText(pTB.formatLocalized$default(str, null, 1, null));
                    }
                    valueOf();
                    return;
                }
                if (str.length() == 0) {
                    c22326hdJ.ejfBZ.setText("");
                } else {
                    c22326hdJ.ejfBZ.setLocalizedNumericText(pTB.formatLocalized$default(C23313hvq.divCheckS$default(str, java.lang.Integer.valueOf(AYXKKw().KWHzl()), null, null, null, 14, null), null, 1, null));
                }
                djBIcL();
                return;
            }
            if (str.length() == 0) {
                c22326hdJ.AuCTel.setText("");
            } else {
                c22326hdJ.AuCTel.setLocalizedNumericText(pTB.formatLocalized$default(str, null, 1, null));
            }
        }
    }

    private final void AhwBna() {
        final C22326hdJ c22326hdJ = this.gEmmrt;
        if (c22326hdJ != null) {
            android.widget.TextView textView = c22326hdJ.fARcdN;
            textView.setOnClickListener(new VoiceInteractor(textView, 1000L, this, c22326hdJ));
            android.widget.TextView textView2 = c22326hdJ.wlaJM;
            textView2.setOnClickListener(new SharedElementCallback(textView2, 1000L, this, c22326hdJ));
            c22326hdJ.fIwbmz.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.jGP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView3, int i, android.view.KeyEvent keyEvent) {
                    return jGI.copydefault(textView3, i, keyEvent);
                }
            });
            c22326hdJ.AuCTel.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.jGS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView3, int i, android.view.KeyEvent keyEvent) {
                    return jGI.KWHzl(textView3, i, keyEvent);
                }
            });
            c22326hdJ.ejfBZ.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.jGR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(android.widget.TextView textView3, int i, android.view.KeyEvent keyEvent) {
                    return jGI.djBIcL(textView3, i, keyEvent);
                }
            });
            FragmentActivity activity = getActivity();
            if (activity != null) {
                LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                C59541ziw.EZpvd(activity, viewLifecycleOwner, new InterfaceC59496ziD() { // from class: o.jGW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC59496ziD
                    public final void OLrzqt(boolean z) {
                        jGI.KWHzl(c22326hdJ, z);
                    }
                });
            }
            android.widget.LinearLayout linearLayout = c22326hdJ.hDKMBd;
            linearLayout.setOnClickListener(new PictureInPictureParams(linearLayout, 1000L, this));
            android.widget.LinearLayout linearLayout2 = c22326hdJ.AhwBna;
            linearLayout2.setOnClickListener(new AssistContent(linearLayout2, 1000L, this));
            android.widget.LinearLayout linearLayout3 = c22326hdJ.AYXKKw;
            linearLayout3.setOnClickListener(new BroadcastReceiver(linearLayout3, 1000L, this));
            android.widget.LinearLayout linearLayout4 = c22326hdJ.iwGUEr;
            linearLayout4.setOnClickListener(new ComponentName(linearLayout4, 1000L, this));
            android.widget.TextView textView3 = c22326hdJ.AEQbTJ;
            textView3.setOnClickListener(new ComponentCallbacks2(textView3, 1000L, this));
            android.widget.TextView textView4 = c22326hdJ.KWHzl;
            textView4.setOnClickListener(new ComponentCallbacks(textView4, 1000L, this));
            C55001xbh c55001xbh = c22326hdJ.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
            c55001xbh.addTextChangedListener(new Dialog(c22326hdJ));
            C55001xbh c55001xbh2 = c22326hdJ.AuCTel;
            Intrinsics.checkNotNullExpressionValue(c55001xbh2, "");
            c55001xbh2.addTextChangedListener(new LoaderManager(c22326hdJ));
            C55001xbh c55001xbh3 = c22326hdJ.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55001xbh3, "");
            c55001xbh3.addTextChangedListener(new TaskStackBuilder(c22326hdJ, this));
            c22326hdJ.ejfBZ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jGU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    jGI.OLrzqt(c22326hdJ, this, view, z);
                }
            });
            c22326hdJ.AuCTel.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jGN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    jGI.copydefault(c22326hdJ, view, z);
                }
            });
            c22326hdJ.fIwbmz.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jGK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    jGI.copydefault(c22326hdJ, this, view, z);
                }
            });
        }
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ TokenInfoForAlert copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(TokenInfoForAlert tokenInfoForAlert) {
            this.copydefault = tokenInfoForAlert;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            TokenInfoForAlert tokenInfoForAlert = this.copydefault;
            java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
            EventParamsList.put$default(eventParamsList, "token_address", strValueOf == null ? "" : strValueOf, false, 4, null);
            TokenInfoForAlert tokenInfoForAlert2 = this.copydefault;
            java.lang.String strDjBIcL = tokenInfoForAlert2 != null ? tokenInfoForAlert2.djBIcL() : null;
            EventParamsList.put$default(eventParamsList, "token_symbol", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
            EventParamsList.put$default(eventParamsList, "button_click", "Market", false, 4, null);
        }
    }

    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ TokenInfoForAlert KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(TokenInfoForAlert tokenInfoForAlert) {
            this.KWHzl = tokenInfoForAlert;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            TokenInfoForAlert tokenInfoForAlert = this.KWHzl;
            java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
            EventParamsList.put$default(eventParamsList, "token_address", strValueOf == null ? "" : strValueOf, false, 4, null);
            TokenInfoForAlert tokenInfoForAlert2 = this.KWHzl;
            java.lang.String strDjBIcL = tokenInfoForAlert2 != null ? tokenInfoForAlert2.djBIcL() : null;
            EventParamsList.put$default(eventParamsList, "token_symbol", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
        }
    }

    public static final boolean copydefault(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        textView.clearFocus();
        return false;
    }

    public static final boolean KWHzl(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        textView.clearFocus();
        return false;
    }

    public static final boolean djBIcL(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        textView.clearFocus();
        return false;
    }

    public static final void KWHzl(C22326hdJ c22326hdJ, boolean z) {
        if (z) {
            return;
        }
        c22326hdJ.fIwbmz.clearFocus();
        c22326hdJ.AuCTel.clearFocus();
        c22326hdJ.ejfBZ.clearFocus();
    }

    public static final class FragmentManager implements Function1<DexMultiTokenInfoBean, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            KWHzl(dexMultiTokenInfoBean);
            return Unit.INSTANCE;
        }

        public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
            Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
            jGX jgxAYXKKw = jGI.this.AYXKKw();
            java.lang.String chainId = dexMultiTokenInfoBean.getChainId();
            java.lang.String chainName = dexMultiTokenInfoBean.getChainName();
            java.lang.String tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress();
            java.lang.String tokenLogoUrl = dexMultiTokenInfoBean.getTokenLogoUrl();
            java.lang.String chainLogoUrl = dexMultiTokenInfoBean.getChainLogoUrl();
            java.lang.String tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol();
            java.lang.String price = dexMultiTokenInfoBean.getPrice();
            java.lang.String marketCap = dexMultiTokenInfoBean.getMarketCap();
            jgxAYXKKw.EZpvd(new TokenInfoForAlert(chainId, chainName, tokenContractAddress, tokenLogoUrl, chainLogoUrl, tokenSymbol, price, marketCap == null ? "" : marketCap, null, false, 256, null));
        }
    }

    public static final class PendingIntent implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ jGT.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(jGT.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            AEQbTJ(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            jGX jgxAYXKKw = jGI.this.AYXKKw();
            AlertPromptType alertPromptTypeEZpvd = this.OLrzqt.EZpvd();
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            jGX.updateInputs$default(jgxAYXKKw, alertPromptTypeEZpvd.toNewTimeFrame((AlertTimeFrame) objOLrzqt), null, null, null, null, 30, null);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Fragment implements Function1<C55276xgr, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            final AlertMarketCapUnit alertMarketCapUnit = (AlertMarketCapUnit) objOLrzqt;
            jGI.this.AYXKKw().EZpvd(alertMarketCapUnit);
            jGI.this.djBIcL();
            final TokenInfoForAlert tokenInfoForAlertAYXKKw = jGI.this.AYXKKw().AYXKKw();
            C32866mlf.onEvent$default("DEXMarket_Alert_AlertSwitchUnit_Click", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.jGI.Fragment.5
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                    copydefault(eventParamsList);
                    return Unit.INSTANCE;
                }

                public final void copydefault(EventParamsList eventParamsList) {
                    Intrinsics.checkNotNullParameter(eventParamsList, "");
                    TokenInfoForAlert tokenInfoForAlert = tokenInfoForAlertAYXKKw;
                    java.lang.String strValueOf = tokenInfoForAlert != null ? tokenInfoForAlert.valueOf() : null;
                    EventParamsList.put$default(eventParamsList, "token_address", strValueOf == null ? "" : strValueOf, false, 4, null);
                    TokenInfoForAlert tokenInfoForAlert2 = tokenInfoForAlertAYXKKw;
                    java.lang.String strDjBIcL = tokenInfoForAlert2 != null ? tokenInfoForAlert2.djBIcL() : null;
                    EventParamsList.put$default(eventParamsList, "token_symbol", strDjBIcL == null ? "" : strDjBIcL, false, 4, null);
                    EventParamsList.put$default(eventParamsList, "unit_switch", C33070mpX.AYXKKw(alertMarketCapUnit.getTitleResId()), false, 4, null);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final class Application implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ jGT.Fragment EZpvd;
        public final /* synthetic */ jGI KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(jGT.Fragment fragment, jGI jgi) {
            this.EZpvd = fragment;
            this.KWHzl = jgi;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            AEQbTJ(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(C55276xgr c55276xgr) {
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            PromptTypes promptTypes = (PromptTypes) objOLrzqt;
            AlertPromptType newAlertPromptType = this.EZpvd.EZpvd().toNewAlertPromptType(promptTypes);
            this.KWHzl.copydefault(newAlertPromptType, "", promptTypes.getAlertType());
            jGX.updateInputs$default(this.KWHzl.AYXKKw(), newAlertPromptType, promptTypes.getAlertType(), "", null, null, 24, null);
        }
    }

    public static final void OLrzqt(C22326hdJ c22326hdJ, jGI jgi, android.view.View view, boolean z) {
        c22326hdJ.valueOf.setSelected(z);
        if (z) {
            C55251xgS c55251xgS = c22326hdJ.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            c22326hdJ.fJNWhG.setOKDSStyle(6);
            c22326hdJ.fJNWhG.setText("--");
            return;
        }
        jgi.djBIcL();
    }

    public static final void copydefault(C22326hdJ c22326hdJ, android.view.View view, boolean z) {
        int iKWHzl;
        c22326hdJ.isConnected.setSelected(z);
        android.widget.TextView textView = c22326hdJ.ORxRYg;
        if (z || c22326hdJ.AuCTel.isConnected().length() > 0) {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        }
        textView.setTextColor(iKWHzl);
    }

    public static final void copydefault(C22326hdJ c22326hdJ, jGI jgi, android.view.View view, boolean z) {
        c22326hdJ.gEmmrt.setSelected(z);
        if (z) {
            C55251xgS c55251xgS = c22326hdJ.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(0);
            c22326hdJ.getFieldNames.setOKDSStyle(6);
            c22326hdJ.getFieldNames.setText("--");
            return;
        }
        jgi.valueOf();
    }

    public final void valueOf() {
        C22326hdJ c22326hdJ = this.gEmmrt;
        if (c22326hdJ != null) {
            java.lang.String strIsConnected = c22326hdJ.fIwbmz.isConnected();
            C55001xbh c55001xbh = c22326hdJ.fIwbmz;
            Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
            C55251xgS c55251xgS = c22326hdJ.getFieldNames;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            updatePercentageTag$default(this, strIsConnected, c55001xbh, c55251xgS, AYXKKw().djBIcL().getValue(), null, 16, null);
        }
    }

    public final void djBIcL() {
        C22326hdJ c22326hdJ = this.gEmmrt;
        if (c22326hdJ != null) {
            java.lang.String strIsConnected = c22326hdJ.ejfBZ.isConnected();
            C55001xbh c55001xbh = c22326hdJ.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
            C55251xgS c55251xgS = c22326hdJ.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            copydefault(strIsConnected, c55001xbh, c55251xgS, AYXKKw().AhwBna().getValue(), java.lang.Integer.valueOf(AYXKKw().KWHzl()));
        }
    }

    public static /* synthetic */ void updatePercentageTag$default(jGI jgi, java.lang.String str, C55001xbh c55001xbh, C55251xgS c55251xgS, java.lang.String str2, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        jgi.copydefault(str, c55001xbh, c55251xgS, str2, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(java.lang.String str, C55001xbh c55001xbh, C55251xgS c55251xgS, java.lang.String str2, java.lang.Integer num) {
        java.lang.String strMulCheckS$default;
        java.lang.String strDivCheckS$default;
        java.lang.String strSubS$default;
        java.lang.String strDivCheckS$default2;
        if (this.gEmmrt != null) {
            if (str.length() != 0 && str2.length() != 0) {
                int i = 6;
                if (c55001xbh.hasFocus()) {
                    c55251xgS.setVisibility(0);
                    c55251xgS.setOKDSStyle(6);
                    c55251xgS.setText("--");
                    return;
                }
                c55251xgS.setVisibility(0);
                if (num == null) {
                    java.lang.Double dAuCTel = C59443zhD.AuCTel(str);
                    strSubS$default = (dAuCTel == null || (strDivCheckS$default2 = C23313hvq.divCheckS$default(dAuCTel, str2, null, null, null, 14, null)) == null) ? null : C33129mqd.subS$default(strDivCheckS$default2, "1", null, null, null, 14, null);
                } else {
                    java.lang.Double dAuCTel2 = C59443zhD.AuCTel(str);
                    if (dAuCTel2 != null && (strMulCheckS$default = C23313hvq.mulCheckS$default(dAuCTel2, num, null, null, null, 14, null)) != null && (strDivCheckS$default = C23313hvq.divCheckS$default(strMulCheckS$default, str2, null, null, null, 14, null)) != null) {
                        strSubS$default = C33129mqd.subS$default(strDivCheckS$default, "1", null, null, null, 14, null);
                    }
                }
                java.lang.String str3 = strSubS$default;
                if (!KWHzl(str3)) {
                    i = C33129mqd.AEQbTJ(str3, "0") ? 14 : 13;
                }
                c55251xgS.setOKDSStyle(i);
                if (str3 != null) {
                    c55251xgS.setText(kLY.formatPercentage$default(str3, DisplaySign.EXCEPT_ZERO, true, null, null, 12, null));
                    return;
                }
                return;
            }
            c55251xgS.setVisibility(8);
        }
    }

    public final boolean KWHzl(java.lang.String str) {
        if (!Intrinsics.EZpvd((java.lang.Object) (str != null ? C23311hvo.formatPercent$default(str, false, 0, 0, null, null, 31, null) : null), (java.lang.Object) "0%")) {
            if (!Intrinsics.EZpvd((java.lang.Object) (str != null ? C23311hvo.formatPercent$default(str, false, 0, 0, null, null, 31, null) : null), (java.lang.Object) "-0%")) {
                return false;
            }
        }
        return true;
    }

    public final void OLrzqt(AlertRepeatType alertRepeatType) {
        if (AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
            if (AYXKKw().OLrzqt().getValue() instanceof jGT.Fragment) {
                jGT value = AYXKKw().OLrzqt().getValue();
                Intrinsics.copydefault(value, "");
                if (((jGT.Fragment) value).AEQbTJ() == alertRepeatType) {
                    return;
                }
            }
            jGX.updateInputs$default(AYXKKw(), null, null, null, alertRepeatType, null, 23, null);
        }
    }

    public final void AEQbTJ(final TokenInfoForAlert tokenInfoForAlert) {
        C22326hdJ c22326hdJ = this.gEmmrt;
        if (c22326hdJ != null) {
            c22326hdJ.fIwbmz.setText("");
            AYXKKw().OLrzqt(tokenInfoForAlert);
            C32866mlf.onEvent$default("DEXMarket_Token_Fromwatchlist_Click", (TrackChannel[]) null, new Function1() { // from class: o.jGM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return jGI.OLrzqt(tokenInfoForAlert, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) tokenInfoForAlert.AhwBna());
            android.widget.TextView textView = c22326hdJ.fARcdN;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(zOLrzqt ? 0 : 8);
            android.widget.TextView textView2 = c22326hdJ.gHZMYf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(zOLrzqt ? 0 : 8);
            if (zOLrzqt) {
                this.AhwBna = true;
                int iOLrzqt = jHS.EZpvd.OLrzqt(tokenInfoForAlert.AhwBna());
                this.djBIcL = iOLrzqt;
                c22326hdJ.fIwbmz.setMaxDecimalValue(iOLrzqt);
            } else {
                this.AhwBna = false;
                this.djBIcL = 16;
            }
            boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) tokenInfoForAlert.OLrzqt());
            android.widget.TextView textView3 = c22326hdJ.wlaJM;
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setVisibility(zOLrzqt2 ? 0 : 8);
            android.widget.TextView textView4 = c22326hdJ.AxsJAY;
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setVisibility(zOLrzqt2 ? 0 : 8);
            if (zOLrzqt2) {
                android.widget.TextView textView5 = c22326hdJ.wlaJM;
                textView5.setPaintFlags(textView5.getPaintFlags() | 8);
                c22326hdJ.wlaJM.setText(C21949hSh.EZpvd.AEQbTJ(tokenInfoForAlert.OLrzqt()));
            }
        }
    }

    public static final Unit OLrzqt(TokenInfoForAlert tokenInfoForAlert, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_address", tokenInfoForAlert.valueOf(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_symbol", tokenInfoForAlert.djBIcL(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class IntentFilter<T> implements FlowCollector {

        /* JADX INFO: loaded from: classes18.dex */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[AlertPromptType.values().length];
                try {
                    iArr[AlertPromptType.LOSS_EXCEEDS_5MIN.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[AlertPromptType.GAIN_EXCEEDS_5MIN.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[AlertPromptType.LOSS_EXCEEDS_1H.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[AlertPromptType.GAIN_EXCEEDS_1H.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[AlertPromptType.LOSS_EXCEEDS_4H.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[AlertPromptType.GAIN_EXCEEDS_4H.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[AlertPromptType.LOSS_EXCEEDS_24H.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[AlertPromptType.GAIN_EXCEEDS_24H.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[AlertPromptType.PRICE_REACHES.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr[AlertPromptType.PRICE_MOVE_BELOW.ordinal()] = 10;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr[AlertPromptType.PRICE_MOVE_ABOVE.ordinal()] = 11;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                copydefault = iArr;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentFilter() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jGT jgt, Continuation<? super Unit> continuation) {
            Function1 function1;
            Function1 function12;
            FragmentActivity activity = jGI.this.getActivity();
            java.lang.String strAYXKKw = "";
            Intrinsics.copydefault(activity, "");
            ((AbstractActivityC33041mov) activity).dismissLoading();
            if (jgt instanceof jGT.ActionBar) {
                FragmentActivity activity2 = jGI.this.getActivity();
                Intrinsics.copydefault(activity2, "");
                ((AbstractActivityC33041mov) activity2).showLoading();
            } else {
                boolean z = true;
                if (jgt instanceof jGT.Fragment) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) jGI.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    C22326hdJ c22326hdJ = jGI.this.gEmmrt;
                    if (c22326hdJ != null) {
                        jGI jgi = jGI.this;
                        c22326hdJ.copydefault.setVisibility(0);
                        jGT.Fragment fragment = (jGT.Fragment) jgt;
                        c22326hdJ.zLjUOn.setText(fragment.AhwBna().djBIcL());
                        android.widget.ImageView imageView = c22326hdJ.zsXlph;
                        Intrinsics.checkNotNullExpressionValue(imageView, "");
                        C25386ivj.loadImageWithBorder$default(imageView, fragment.AhwBna().gEmmrt(), null, 2, null);
                        android.widget.ImageView imageView2 = c22326hdJ.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(imageView2, "");
                        C33054mpH.AEQbTJ(imageView2, fragment.AhwBna().KWHzl());
                        c22326hdJ.uzCIH.setText("$");
                        c22326hdJ.zuBGHE.setText("$");
                        c22326hdJ.sSMYrx.setText(C33070mpX.AYXKKw(fragment.AYXKKw().getTitleResId()));
                        c22326hdJ.AuCTelauCTel.setText(C33070mpX.AYXKKw(fragment.EZpvd().getTextTitle(fragment.copydefault())));
                        AlertPromptType alertPromptTypeEZpvd = fragment.EZpvd();
                        int[] iArr = Activity.copydefault;
                        switch (iArr[alertPromptTypeEZpvd.ordinal()]) {
                            case 9:
                            case 10:
                            case 11:
                                if (fragment.copydefault() == AlertType.PRICE) {
                                    android.widget.LinearLayout linearLayout = c22326hdJ.AkhnZx;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                                    linearLayout.setVisibility(0);
                                    android.widget.LinearLayout linearLayout2 = c22326hdJ.DbNXlk;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                                    linearLayout2.setVisibility(8);
                                    android.widget.LinearLayout linearLayout3 = c22326hdJ.valueOf;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                                    linearLayout3.setVisibility(8);
                                    c22326hdJ.fIwbmz.setMaxDecimalValue(jgi.djBIcL);
                                } else {
                                    android.widget.LinearLayout linearLayout4 = c22326hdJ.AkhnZx;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                                    linearLayout4.setVisibility(8);
                                    android.widget.LinearLayout linearLayout5 = c22326hdJ.DbNXlk;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout5, "");
                                    linearLayout5.setVisibility(8);
                                    android.widget.LinearLayout linearLayout6 = c22326hdJ.valueOf;
                                    Intrinsics.checkNotNullExpressionValue(linearLayout6, "");
                                    linearLayout6.setVisibility(0);
                                    c22326hdJ.ejfBZ.setMaxDecimalValue(6);
                                }
                                break;
                            default:
                                android.widget.LinearLayout linearLayout7 = c22326hdJ.AkhnZx;
                                Intrinsics.checkNotNullExpressionValue(linearLayout7, "");
                                linearLayout7.setVisibility(8);
                                android.widget.LinearLayout linearLayout8 = c22326hdJ.DbNXlk;
                                Intrinsics.checkNotNullExpressionValue(linearLayout8, "");
                                linearLayout8.setVisibility(0);
                                android.widget.LinearLayout linearLayout9 = c22326hdJ.valueOf;
                                Intrinsics.checkNotNullExpressionValue(linearLayout9, "");
                                linearLayout9.setVisibility(8);
                                c22326hdJ.AuCTel.setMaxDecimalValue(2);
                                android.widget.TextView textView = c22326hdJ.AwvSrB;
                                switch (iArr[fragment.EZpvd().ordinal()]) {
                                    case 1:
                                    case 2:
                                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DuQ);
                                        break;
                                    case 3:
                                    case 4:
                                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sSi);
                                        break;
                                    case 5:
                                    case 6:
                                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.ZGRCNj);
                                        break;
                                    case 7:
                                    case 8:
                                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.ZNPcth);
                                        break;
                                }
                                textView.setText(strAYXKKw);
                                break;
                        }
                        c22326hdJ.AEQbTJ.setSelected(fragment.AEQbTJ() == AlertRepeatType.ONCE);
                        c22326hdJ.KWHzl.setSelected(fragment.AEQbTJ() == AlertRepeatType.REPEAT);
                        C52794wYp c52794wYpCopydefault = c22326hdJ.EZpvd.copydefault();
                        if (c52794wYpCopydefault != null) {
                            c52794wYpCopydefault.setEnabled(fragment.KWHzl());
                        }
                        C52794wYp c52794wYpAEQbTJ = c22326hdJ.EZpvd.AEQbTJ();
                        if (c52794wYpAEQbTJ != null) {
                            if (jgi.EZpvd() == null && !fragment.djBIcL()) {
                                z = false;
                            }
                            c52794wYpAEQbTJ.setEnabled(z);
                        }
                    }
                } else if (jgt instanceof jGT.StateListAnimator) {
                    TokenInfoForAlert tokenInfoForAlertAYXKKw = jGI.this.AYXKKw().AYXKKw();
                    if (tokenInfoForAlertAYXKKw != null && (function12 = jGI.this.valueOf) != null) {
                        function12.invoke(new AlertGroupUiItem(tokenInfoForAlertAYXKKw.valueOf(), tokenInfoForAlertAYXKKw.copydefault(), tokenInfoForAlertAYXKKw.valueOf(), tokenInfoForAlertAYXKKw.djBIcL(), "", tokenInfoForAlertAYXKKw.gEmmrt(), tokenInfoForAlertAYXKKw.KWHzl(), C56402yEa.EZpvd(((jGT.StateListAnimator) jgt).OLrzqt()), false, false, false, false, false, 7680, null));
                    }
                    jGI.this.dismissAllowingStateLoss();
                } else if (jgt instanceof jGT.Application) {
                    AlertDataUiItem alertDataUiItemEZpvd = jGI.this.EZpvd();
                    if (alertDataUiItemEZpvd != null && (function1 = jGI.this.valueOf) != null) {
                        function1.invoke(alertDataUiItemEZpvd);
                    }
                    jGI.this.dismissAllowingStateLoss();
                } else if (jgt instanceof jGT.Activity) {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.OfWYUE, 0, 1, (java.lang.Object) null);
                } else {
                    if (!(jgt instanceof jGT.TaskDescription)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.shErWi, 0, 1, (java.lang.Object) null);
                }
            }
            jGI.this.AYXKKw().valueOf();
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt(), null, new IntentFilter(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().djBIcL(), null, new ServiceConnection(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().AhwBna(), null, new IntentSender(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().gEmmrt(), null, new SharedPreferences(), 2, null);
    }

    public static final class ServiceConnection<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ServiceConnection() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.String str, Continuation<? super Unit> continuation) {
            C22326hdJ c22326hdJ = jGI.this.gEmmrt;
            if (c22326hdJ != null) {
                jGI jgi = jGI.this;
                boolean z = !(str.length() == 0);
                android.widget.TextView textView = c22326hdJ.gHZMYf;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
                android.widget.TextView textView2 = c22326hdJ.fARcdN;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(z ? 0 : 8);
                if (z) {
                    android.widget.TextView textView3 = c22326hdJ.fARcdN;
                    textView3.setPaintFlags(textView3.getPaintFlags() | 8);
                    c22326hdJ.fARcdN.setText(C21949hSh.EZpvd.KWHzl(str));
                    if (!jgi.AhwBna) {
                        jgi.AhwBna = true;
                        jgi.djBIcL = jHS.EZpvd.OLrzqt(str);
                        c22326hdJ.fIwbmz.setMaxDecimalValue(jgi.djBIcL);
                    }
                } else {
                    android.widget.TextView textView4 = c22326hdJ.fARcdN;
                    textView4.setPaintFlags(textView4.getPaintFlags() & (-9));
                    c22326hdJ.fARcdN.setText("--");
                }
            }
            jGI.this.valueOf();
            return Unit.INSTANCE;
        }
    }

    public static final class IntentSender<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentSender() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.String str, Continuation<? super Unit> continuation) {
            C22326hdJ c22326hdJ = jGI.this.gEmmrt;
            if (c22326hdJ != null) {
                boolean z = str.length() == 0;
                android.widget.TextView textView = c22326hdJ.wlaJM;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                boolean z2 = !z;
                textView.setVisibility(z2 ? 0 : 8);
                android.widget.TextView textView2 = c22326hdJ.AxsJAY;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(z2 ? 0 : 8);
                if (z) {
                    android.widget.TextView textView3 = c22326hdJ.wlaJM;
                    textView3.setPaintFlags(textView3.getPaintFlags() & (-9));
                    c22326hdJ.wlaJM.setText("--");
                } else {
                    android.widget.TextView textView4 = c22326hdJ.wlaJM;
                    textView4.setPaintFlags(textView4.getPaintFlags() | 8);
                    c22326hdJ.wlaJM.setText(C21949hSh.EZpvd.AEQbTJ(str));
                }
            }
            jGI.this.djBIcL();
            return Unit.INSTANCE;
        }
    }

    public static final class SharedPreferences<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedPreferences() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC25800jGv interfaceC25800jGv, Continuation<? super Unit> continuation) {
            if (interfaceC25800jGv instanceof InterfaceC25800jGv.StateListAnimator) {
                InterfaceC25800jGv.StateListAnimator stateListAnimator = (InterfaceC25800jGv.StateListAnimator) interfaceC25800jGv;
                if (stateListAnimator.EZpvd()) {
                    jGI.this.AEQbTJ(stateListAnimator.copydefault());
                } else {
                    C55326xho.toast$default(C33069mpW.copydefault(C22366hdx.StateListAnimator.AuCTelauCTel, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", stateListAnimator.copydefault().djBIcL()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
            } else if (interfaceC25800jGv instanceof InterfaceC25800jGv.Application) {
                C55326xho.toast$default(C23274hvD.Fragment.RbMRq, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            jGI.this.AYXKKw().isConnected();
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.gEmmrt = null;
    }

    private final void fetchVPNInfo() {
        if (EZpvd() != null) {
            C32866mlf.onEvent$default("DEXMarket_Token_Alert_Edit_Alert_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        } else {
            C32866mlf.onEvent$default("DEXMarket_Token_Alert_Add_Alert_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jGI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AlertPromptType AEQbTJ() {
            return jGI.copydefault;
        }

        public final AlertType copydefault() {
            return jGI.OLrzqt;
        }

        public static /* synthetic */ jGI newInstance$default(TaskDescription taskDescription, TokenInfoForAlert tokenInfoForAlert, AlertDataUiItem alertDataUiItem, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                alertDataUiItem = null;
            }
            return taskDescription.EZpvd(tokenInfoForAlert, alertDataUiItem);
        }

        public final jGI EZpvd(@NotNull TokenInfoForAlert tokenInfoForAlert, AlertDataUiItem alertDataUiItem) {
            Intrinsics.checkNotNullParameter(tokenInfoForAlert, "");
            jGI jgi = new jGI();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("token_info_for_alert", tokenInfoForAlert);
            bundle.putParcelable("alert_data_item", alertDataUiItem);
            jgi.setArguments(bundle);
            return jgi;
        }
    }
}
