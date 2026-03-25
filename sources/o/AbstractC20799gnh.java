package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.core.formatter.WalletCurrencyBean;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC20809gnr;
import o.AbstractDialogInterfaceOnKeyListenerC57208yeA;
import o.C13754dXa;
import o.C21205gvP;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gnh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC20799gnh<T extends AbstractC20809gnr> extends AbstractC20518giR {
    public AbstractC16654enx AEQbTJ;
    public T valueOf;
    public java.lang.String OLrzqt = "";
    public final Function2<C55033xcM, java.lang.CharSequence, Unit> EZpvd = new Function2() { // from class: o.gng
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return AbstractC20799gnh.OLrzqt(this.EZpvd, (C55033xcM) obj, (java.lang.CharSequence) obj2);
        }
    };
    public final Observer<AbstractC20809gnr.ActionBar> AhwBna = new Observer() { // from class: o.gno
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            AbstractC20799gnh.KWHzl(this.KWHzl, (AbstractC20809gnr.ActionBar) obj);
        }
    };
    public java.lang.String KWHzl = "";

    /* JADX INFO: renamed from: o.gnh$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        this.valueOf = t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.KWHzl;
    }

    public abstract boolean AYXKKw(boolean z);

    public abstract void AkhnZx();

    public abstract void EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull AbstractC16654enx abstractC16654enx) {
        Intrinsics.checkNotNullParameter(abstractC16654enx, "");
        this.AEQbTJ = abstractC16654enx;
    }

    public abstract void copydefault(@NotNull C20863gos c20863gos);

    public abstract void djBIcL();

    public abstract void gEmmrt();

    public final T AhwBna() {
        T t = this.valueOf;
        if (t != null) {
            return t;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final AbstractC16654enx valueOf() {
        AbstractC16654enx abstractC16654enx = this.AEQbTJ;
        if (abstractC16654enx != null) {
            return abstractC16654enx;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final Unit OLrzqt(AbstractC20799gnh abstractC20799gnh, C55033xcM c55033xcM, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(c55033xcM, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        if (c55033xcM.AEQbTJ() != 0) {
            java.lang.String strValueOf = c55033xcM.valueOf();
            if (abstractC20799gnh.AhwBna().AuCTelauCTel()) {
                abstractC20799gnh.AhwBna().valueOf(abstractC20799gnh.AhwBna().gEmmrt(strValueOf));
                abstractC20799gnh.AhwBna().EZpvd(strValueOf);
            } else {
                abstractC20799gnh.AhwBna().valueOf(strValueOf);
                abstractC20799gnh.AhwBna().EZpvd(abstractC20799gnh.AhwBna().OLrzqt(strValueOf));
            }
            updateAmountAndCurrencyUI$default(abstractC20799gnh, charSequence, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(AbstractC20799gnh abstractC20799gnh, AbstractC20809gnr.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        if (abstractC20799gnh.isDetached()) {
            return;
        }
        abstractC20799gnh.copydefault(actionBar.copydefault(), actionBar.EZpvd());
    }

    @Override // o.AbstractC14668dpm
    public android.view.View AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        copydefault((AbstractC16654enx) DataBindingUtil.inflate(android.view.LayoutInflater.from(viewGroup.getContext()), C13754dXa.TaskDescription.invokespecialROgMPW, viewGroup, false));
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("from_address")) == null) {
            string = "";
        }
        this.KWHzl = string;
        android.content.Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        copydefault(context);
        djBIcL();
        gEmmrt();
        isConnected();
        fJNWhG();
        return valueOf().getRoot();
    }

    private final void copydefault(android.content.Context context) {
        valueOf().isConnected.setGravity(TextAlign.LEFT);
        valueOf().isConnected.setTextAlignment(5);
        valueOf().isConnected.setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.EZpvd));
    }

    @Override // o.AbstractC20518giR, o.AbstractC57212yeE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        valueOf().values.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        values();
        C32866mlf.onEvent$default("SendSetAmount_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    private final void isConnected() {
        C52794wYp c52794wYp = valueOf().copydefault;
        c52794wYp.setOnClickListener(new TaskDescription(c52794wYp, 1000L, this));
        android.widget.ImageView imageView = valueOf().AEQbTJ;
        imageView.setOnClickListener(new StateListAnimator(imageView, 300L, this));
        LinearLayoutCompat linearLayoutCompat = valueOf().AYXKKw;
        linearLayoutCompat.setOnClickListener(new Application(linearLayoutCompat, 1000L, this));
        AppCompatTextView appCompatTextView = valueOf().fetchVPNInfo;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        AppCompatTextView appCompatTextView2 = valueOf().DbNXlk;
        appCompatTextView2.setOnClickListener(new ActionBar(appCompatTextView2, 1000L, this));
    }

    private final void fJNWhG() {
        AhwBna().ejfBZ().observe(this, new LoaderManager(new Function1() { // from class: o.gnk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20799gnh.copydefault(this.OLrzqt, (C20863gos) obj);
            }
        }));
        AhwBna().getNewProxyInstance().observeForever(this.AhwBna);
    }

    public static final Unit copydefault(AbstractC20799gnh abstractC20799gnh, C20863gos c20863gos) {
        if (c20863gos == null) {
            return Unit.INSTANCE;
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC20799gnh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        abstractC20799gnh.copydefault(c20863gos);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        if (AhwBna().AuCTelauCTel()) {
            valueOf().isConnected.setMaxDecimalLength(AhwBna().fetchVPNInfo());
        } else {
            valueOf().isConnected.setMaxDecimalLength(AhwBna().values());
        }
        updateAmountAndCurrencyUI$default(this, null, true, 1, null);
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "switch");
    }

    /* JADX INFO: renamed from: o.gnh$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC20799gnh EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AbstractC20799gnh abstractC20799gnh) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = abstractC20799gnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if ((this.EZpvd.AhwBna().iwGUEr() || !this.EZpvd.AhwBna().zsXlph()) && this.EZpvd.AhwBna().AuCTelauCTel()) {
                    this.EZpvd.AuCTel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gnh$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ AbstractC20799gnh EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AbstractC20799gnh abstractC20799gnh) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = abstractC20799gnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if ((this.EZpvd.AhwBna().iwGUEr() || !this.EZpvd.AhwBna().zsXlph()) && this.EZpvd.AhwBna().AuCTelauCTel()) {
                    this.EZpvd.AuCTel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gnh$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ AbstractC20799gnh EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AbstractC20799gnh abstractC20799gnh) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = abstractC20799gnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if ((this.EZpvd.AhwBna().iwGUEr() || !this.EZpvd.AhwBna().zsXlph()) && !this.EZpvd.AhwBna().AuCTelauCTel()) {
                    this.EZpvd.AuCTel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gnh$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ AbstractC20799gnh OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AbstractC20799gnh abstractC20799gnh) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = abstractC20799gnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (!this.OLrzqt.AhwBna().zsXlph()) {
                    C55326xho.toast$default(C13754dXa.FragmentManager.dNCPSb, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                } else if (this.OLrzqt.AhwBna().iwGUEr()) {
                    this.OLrzqt.AhwBna().copydefault(!this.OLrzqt.AhwBna().AuCTelauCTel());
                    this.OLrzqt.fIwbmz();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.gnh$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ AbstractC20799gnh copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC20799gnh abstractC20799gnh) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = abstractC20799gnh;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.AkhnZx();
                C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "next_step");
            }
        }
    }

    public final void EZpvd(@NotNull C20863gos c20863gos) {
        java.lang.String valuation;
        java.lang.String amount;
        java.lang.String amount2;
        Intrinsics.checkNotNullParameter(c20863gos, "");
        valueOf().isConnected.setOnTextWillChange(this.EZpvd);
        valueOf().KWHzl.setEditable(valueOf().isConnected.KWHzl());
        if (AhwBna().iwGUEr() || !AhwBna().zsXlph()) {
            android.widget.ImageView imageView = valueOf().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            AppCompatTextView appCompatTextView = valueOf().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            AppCompatTextView appCompatTextView2 = valueOf().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
        } else {
            android.widget.ImageView imageView2 = valueOf().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            AppCompatTextView appCompatTextView3 = valueOf().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            AppCompatTextView appCompatTextView4 = valueOf().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
        if (!AhwBna().iwGUEr()) {
            AhwBna().copydefault(true);
        }
        java.lang.String str = "0";
        if (AhwBna().AuCTelauCTel()) {
            TransactionInfo transactionInfoFIwbmz = AhwBna().fIwbmz();
            if (transactionInfoFIwbmz != null && (amount2 = transactionInfoFIwbmz.getAmount()) != null) {
                str = amount2;
            }
            valueOf().isConnected.setMaxDecimalLength(AhwBna().fetchVPNInfo());
            AhwBna().valueOf(AhwBna().gEmmrt(str));
            AhwBna().EZpvd(str);
        } else {
            valueOf().isConnected.setMaxDecimalLength(AhwBna().values());
            TransactionInfo transactionInfoFIwbmz2 = AhwBna().fIwbmz();
            if (transactionInfoFIwbmz2 == null || (valuation = transactionInfoFIwbmz2.getValuation()) == null) {
                valuation = "0";
            }
            TransactionInfo transactionInfoFIwbmz3 = AhwBna().fIwbmz();
            if (transactionInfoFIwbmz3 != null && (amount = transactionInfoFIwbmz3.getAmount()) != null) {
                str = amount;
            }
            java.lang.String strOLrzqt = AhwBna().OLrzqt(valuation);
            AhwBna().valueOf(valuation);
            if (C33129mqd.AEQbTJ(str, 0)) {
                java.lang.String strDivS$default = C33129mqd.divS$default(strOLrzqt, str, null, null, null, 14, null);
                if (!C33129mqd.valueOf(strDivS$default, "1.02") || !C33129mqd.copydefault(strDivS$default, "0.98")) {
                    AhwBna().EZpvd(strOLrzqt);
                    ejfBZ();
                } else {
                    AhwBna().EZpvd(str);
                }
            } else {
                AhwBna().EZpvd(strOLrzqt);
            }
        }
        updateAmountAndCurrencyUI$default(this, null, true, 1, null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gnr.initTransaction$default(o.gnr, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.core.scan.TransactionInfo, java.lang.String, int, java.lang.String, java.lang.String, int, java.lang.String, com.okinc.business.defi.biz.net.bean.TxToastCheckBizAndPayloadInfo, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, boolean, java.util.ArrayList, int, java.lang.Object):void */
    private final void values() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            showLoading();
            AbstractC20809gnr abstractC20809gnrAhwBna = AhwBna();
            java.lang.String string = arguments.getString("wallet_id");
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = arguments.getString("coinId");
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String string3 = arguments.getString(MTAnalysisConstants.Account.KEY_ACCOUNT);
            if (string3 == null) {
                string3 = "";
            }
            java.lang.String string4 = arguments.getString("deposit_limit");
            if (string4 == null) {
                string4 = "0";
            }
            java.lang.String string5 = arguments.getString("exchange_account_name");
            if (string5 == null) {
                string5 = "";
            }
            TransactionInfo transactionInfo = (TransactionInfo) arguments.getParcelable("data");
            java.lang.String string6 = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
            if (string6 == null) {
                string6 = "";
            }
            int i = arguments.getInt("address_group", -1);
            java.lang.String str = this.KWHzl;
            TxToastCheckBizAndPayloadInfo txToastCheckBizAndPayloadInfo = new TxToastCheckBizAndPayloadInfo((java.lang.Integer) 0, (java.lang.String) null, 2, (DefaultConstructorMarker) null);
            java.lang.String string7 = arguments.getString("exchange_memo");
            java.lang.String str2 = string7 == null ? "" : string7;
            java.lang.String str3 = string2;
            java.lang.String str4 = string3;
            java.lang.String str5 = string4;
            java.lang.String str6 = string5;
            java.lang.String str7 = string6;
            java.lang.String str8 = str2;
            AbstractC20809gnr.initTransaction$default(abstractC20809gnrAhwBna, string, str3, str4, str5, str6, transactionInfo, str7, i, null, null, 1, str, txToastCheckBizAndPayloadInfo, str8, java.lang.Integer.valueOf(arguments.getInt("protocol_id", -1)), java.lang.Long.valueOf(arguments.getLong("general_chainid", -1L)), arguments.getString(RemoteMessageConst.Notification.TICKER), arguments.getBoolean("is_xlayer_prefix_to_address", false), arguments.getIntegerArrayList("tx_check_fail_list"), 768, null);
        }
    }

    public final void djBIcL(boolean z) {
        if (valueOf().copydefault.isEnabled() != z) {
            valueOf().copydefault.setEnabled(z);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gvP.Application.newInstance$default(o.gvP$Application, java.lang.String, java.util.HashSet, int, java.lang.Object):o.gvP */
    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        C21205gvP c21205gvPNewInstance$default = C21205gvP.Application.newInstance$default(C21205gvP.Companion, gEmmrt(false), null, 2, null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c21205gvPNewInstance$default.KWHzl(childFragmentManager, "SwitchCurrencyBottomSheetDialog", new AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity() { // from class: o.gnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractDialogInterfaceOnKeyListenerC57208yeA.Activity
            public final void copydefault(android.os.Bundle bundle) {
                AbstractC20799gnh.KWHzl(this.OLrzqt, bundle);
            }
        });
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "choose_flat_currency");
    }

    public static final void KWHzl(AbstractC20799gnh abstractC20799gnh, android.os.Bundle bundle) {
        WalletCurrencyBean walletCurrencyBean;
        if (bundle == null || (walletCurrencyBean = (WalletCurrencyBean) bundle.getParcelable("currencyData")) == null || C59449zhJ.gEmmrt(walletCurrencyBean.getIsoCode(), abstractC20799gnh.gEmmrt(false), true)) {
            return;
        }
        int iMin = java.lang.Math.min(walletCurrencyBean.getMinPrecision(), abstractC20799gnh.AhwBna().values());
        abstractC20799gnh.AhwBna().AEQbTJ(walletCurrencyBean);
        if (abstractC20799gnh.AhwBna().AuCTelauCTel()) {
            abstractC20799gnh.AhwBna().valueOf(abstractC20799gnh.AhwBna().gEmmrt(abstractC20799gnh.AhwBna().AuCTel()));
            updateAmountAndCurrencyUI$default(abstractC20799gnh, null, false, 3, null);
        } else {
            abstractC20799gnh.AhwBna().valueOf(C54862xYb.KWHzl(C33129mqd.EZpvd(abstractC20799gnh.AhwBna().fARcdN()), false, java.lang.Integer.valueOf(iMin), RoundingMode.DOWN));
            abstractC20799gnh.valueOf().isConnected.setMaxDecimalLength(abstractC20799gnh.AhwBna().values());
            abstractC20799gnh.AhwBna().EZpvd(abstractC20799gnh.AhwBna().OLrzqt(abstractC20799gnh.AhwBna().fARcdN()));
            updateAmountAndCurrencyUI$default(abstractC20799gnh, null, true, 1, null);
        }
    }

    private final void ejfBZ() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.setTitle(C13754dXa.FragmentManager.apAOXX);
        viewOnClickListenerC54939xaY.copydefault(C13754dXa.FragmentManager.DztXDE);
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.OEgNct, new View.OnClickListener() { // from class: o.gnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20799gnh.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
        viewOnClickListenerC54939xaY.setCancelable(false);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setHomeButtonEnabled);
        if (str.length() == 0) {
            str = strAYXKKw;
        }
        viewOnClickListenerC54939xaY.EZpvd(str);
        if (z) {
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DGUQLIdZmdUa, new View.OnClickListener() { // from class: o.gns
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractC20799gnh.OLrzqt(viewOnClickListenerC54939xaY, this, view);
                }
            });
        }
        viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.keySet, new View.OnClickListener() { // from class: o.gnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC20799gnh.AEQbTJ(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractC20799gnh abstractC20799gnh, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        abstractC20799gnh.values();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractC20799gnh abstractC20799gnh, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        FragmentActivity activity = abstractC20799gnh.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static /* synthetic */ void updateAmountAndCurrencyUI$default(AbstractC20799gnh abstractC20799gnh, java.lang.CharSequence charSequence, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAmountAndCurrencyUI");
        }
        if ((i & 1) != 0) {
            charSequence = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC20799gnh.AEQbTJ(charSequence, z);
    }

    public final void AEQbTJ(@NotNull java.lang.CharSequence charSequence, boolean z) {
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG;
        Intrinsics.checkNotNullParameter(charSequence, "");
        valueOf().isConnected.setOnTextWillChange(null);
        boolean z2 = z || charSequence.length() > 0 || ((abstractC8664bGwFJNWhG = AhwBna().fJNWhG()) != null && abstractC8664bGwFJNWhG.C_());
        if (AhwBna().AuCTelauCTel()) {
            if (z2) {
                if (charSequence.length() == 0) {
                    BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(AhwBna().AuCTel());
                    java.lang.String strKWHzl = C54862xYb.KWHzl(bigDecimalEZpvd, false, java.lang.Integer.valueOf(AhwBna().fetchVPNInfo()), RoundingMode.DOWN);
                    valueOf().isConnected.setPlainNumericText(strKWHzl);
                    charSequence = EZpvd(bigDecimalEZpvd, strKWHzl, new Function0() { // from class: o.gnl
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20799gnh.OLrzqt(this.KWHzl);
                        }
                    });
                }
                EZpvd(charSequence, C14731dqw.AEQbTJ.AEQbTJ(gEmmrt(true), 12));
                android.widget.ImageView imageView = valueOf().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
            }
            valueOf().fetchVPNInfo.setText(AhwBna().KWHzl(AhwBna().fARcdN()));
            valueOf().DbNXlk.setText(" " + gEmmrt(false));
            valueOf().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, (AhwBna().iwGUEr() || !AhwBna().zsXlph()) ? C52761wXj.TaskDescription.requestPostMessageChannelWithExtras : 0, 0);
        } else {
            if (z2) {
                if (charSequence.length() == 0) {
                    BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(AhwBna().fARcdN());
                    java.lang.String strKWHzl2 = C54862xYb.KWHzl(bigDecimalEZpvd2, false, java.lang.Integer.valueOf(AhwBna().values()), RoundingMode.DOWN);
                    valueOf().isConnected.setPlainNumericText(strKWHzl2);
                    charSequence = EZpvd(bigDecimalEZpvd2, strKWHzl2, new Function0() { // from class: o.gnn
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AbstractC20799gnh.AYXKKw(this.OLrzqt);
                        }
                    });
                }
                EZpvd(charSequence, gEmmrt(false));
                android.widget.ImageView imageView2 = valueOf().OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(AhwBna().iwGUEr() ? 0 : 8);
                valueOf().isConnected.requestLayout();
            }
            valueOf().fetchVPNInfo.setText(AhwBna().AEQbTJ(AhwBna().AuCTel()));
            valueOf().DbNXlk.setText(" " + C14731dqw.AEQbTJ.AEQbTJ(gEmmrt(true), 6));
            valueOf().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
        }
        valueOf().isConnected.setOnTextWillChange(this.EZpvd);
    }

    public static final java.lang.String OLrzqt(AbstractC20799gnh abstractC20799gnh) {
        java.lang.String strEZpvd;
        C10854bwM c10854bwMValueOf = abstractC20799gnh.AhwBna().valueOf();
        return (c10854bwMValueOf == null || (strEZpvd = C54870xYj.EZpvd("1", c10854bwMValueOf.valueOf(), c10854bwMValueOf.AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null)) == null) ? "" : strEZpvd;
    }

    public static final java.lang.String AYXKKw(AbstractC20799gnh abstractC20799gnh) {
        return abstractC20799gnh.AhwBna().KWHzl(abstractC20799gnh.AhwBna().fARcdN());
    }

    public final java.lang.String gEmmrt(boolean z) {
        java.lang.String strFJNWhG;
        if (z) {
            C10854bwM c10854bwMValueOf = AhwBna().valueOf();
            if (c10854bwMValueOf != null && (strFJNWhG = c10854bwMValueOf.fJNWhG()) != null) {
                return strFJNWhG;
            }
        } else {
            java.lang.String strDbNXlk = AhwBna().DbNXlk();
            if (strDbNXlk != null) {
                return strDbNXlk;
            }
        }
        return "";
    }

    public final java.lang.String EZpvd(BigDecimal bigDecimal, java.lang.String str, Function0<java.lang.String> function0) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") && bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            return function0.invoke();
        }
        return pTB.formatLocalized$default(str, null, 1, null);
    }

    @Override // o.AbstractC57212yeE, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AhwBna().getNewProxyInstance().removeObserver(this.AhwBna);
    }

    public void copydefault(int i, boolean z) {
        if (i != 1) {
            if (i == 3 && !z) {
                AYXKKw(false);
                EZpvd();
                return;
            }
            return;
        }
        if (AhwBna().iwGUEr()) {
            android.widget.ImageView imageView = valueOf().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            AppCompatTextView appCompatTextView = valueOf().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            AppCompatTextView appCompatTextView2 = valueOf().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
        } else {
            android.widget.ImageView imageView2 = valueOf().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            AppCompatTextView appCompatTextView3 = valueOf().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            appCompatTextView3.setVisibility(8);
            AppCompatTextView appCompatTextView4 = valueOf().DbNXlk;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            appCompatTextView4.setVisibility(8);
        }
        updateAmountAndCurrencyUI$default(this, null, false, 3, null);
        AYXKKw(false);
        EZpvd();
    }

    public final void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.OLrzqt)) {
            return;
        }
        this.OLrzqt = str;
        C32866mlf.onEvent$default("SendSetAmount_Btm_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.gnm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20799gnh.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("page_error", str, true));
        return Unit.INSTANCE;
    }

    private final void EZpvd(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        final android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        valueOf().isConnected.setAmountAndSymbol(charSequence, C33061mpO.setupSpanStyles$default(charSequence2, new java.lang.String[]{charSequence2.toString()}, 0, null, false, new Function1() { // from class: o.gnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC20799gnh.AEQbTJ(context, (java.util.List) obj);
            }
        }, 14, null));
    }

    public static final Unit AEQbTJ(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(context.getColor(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }
}
