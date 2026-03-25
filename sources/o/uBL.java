package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.biz.TradeType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeuilib.widget.tradewith.TradeWithCryptoSelectDialog;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uBL extends android.widget.RelativeLayout {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public androidx.fragment.app.FragmentManager AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean AhwBna;
    public uBP AkhnZx;
    public boolean DbNXlk;
    public Function0<Unit> EZpvd;
    public BizInstrument KWHzl;
    public final AbstractC49619urv copydefault;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public TradeType gEmmrt;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uBL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uBL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final uBP copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFm(androidx.fragment.app.FragmentManager fragmentManager) {
        this.AEQbTJ = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSelectedCallback(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReminderText(java.lang.String str) {
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTradeQuoteCcyChange(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.uBL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ uBL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uBL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49511upt.StateListAnimator.QVAiDq, this, true);
        AbstractC49619urv abstractC49619urv = (AbstractC49619urv) viewDataBindingInflate;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C49511upt.Fragment.ORxRYg, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.QUSxYX, -1);
            if (resourceId != -1) {
                abstractC49619urv.EZpvd.setTextAppearance(resourceId);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C49511upt.Fragment.QOLQEE, -1);
            if (resourceId2 != -1) {
                abstractC49619urv.copydefault.setTextAppearance(resourceId2);
            }
            this.DbNXlk = typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.QVAiDq, false);
            this.AhwBna = typedArrayObtainStyledAttributes.getBoolean(C49511upt.Fragment.DTwDnp, true);
            if (this.DbNXlk) {
                this.AhwBna = false;
            }
            AppCompatImageView appCompatImageView = abstractC49619urv.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            android.widget.ImageView imageView = abstractC49619urv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            typedArrayObtainStyledAttributes.recycle();
            Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
            this.copydefault = abstractC49619urv;
            this.AhwBna = true;
            this.valueOf = true;
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uBL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.String OLrzqt() {
        java.util.List<java.lang.String> tradeQuoteCcyList;
        java.util.List<java.lang.String> tradeQuoteCcyList2;
        BizInstrument bizInstrument = this.KWHzl;
        if (bizInstrument == null || !bizInstrument.isSupportTradeReceive()) {
            BizInstrument bizInstrument2 = this.KWHzl;
            if (bizInstrument2 != null) {
                return bizInstrument2.getDisplayQuoteSymbol();
            }
            return null;
        }
        BizInstrument bizInstrument3 = this.KWHzl;
        if (bizInstrument3 != null && (tradeQuoteCcyList = bizInstrument3.getTradeQuoteCcyList()) != null && tradeQuoteCcyList.size() == 1) {
            BizInstrument bizInstrument4 = this.KWHzl;
            if (bizInstrument4 == null || (tradeQuoteCcyList2 = bizInstrument4.getTradeQuoteCcyList()) == null) {
                return null;
            }
            return (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(tradeQuoteCcyList2);
        }
        uBP ubp = this.AkhnZx;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (ubp != null ? ubp.EZpvd() : null))) {
            uBP ubp2 = this.AkhnZx;
            if (ubp2 != null) {
                return ubp2.EZpvd();
            }
            return null;
        }
        BizInstrument bizInstrument5 = this.KWHzl;
        if (bizInstrument5 != null) {
            return bizInstrument5.getDisplayQuoteSymbol();
        }
        return null;
    }

    public static /* synthetic */ void updateView$default(uBL ubl, ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, TradeType tradeType, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        ubl.copydefault(viewModelStoreOwner, bizInstrument, tradeType, z);
    }

    public final void copydefault(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType, boolean z) {
        java.lang.String quoteSymbol;
        java.util.List<java.lang.String> tradeQuoteCcyList;
        Intrinsics.checkNotNullParameter(tradeType, "");
        pUU.KWHzl("TradeWithSwitchView", "updateView " + bizInstrument + " side = " + tradeType);
        this.AkhnZx = viewModelStoreOwner != null ? (uBP) new ViewModelProvider(viewModelStoreOwner).get(uBP.class) : null;
        java.lang.String strEZpvd = xVB.OLrzqt.EZpvd(bizInstrument != null ? bizInstrument.getTradeQuoteCcyList() : null, bizInstrument != null && bizInstrument.isSupportTradeReceive());
        if (strEZpvd == null || strEZpvd.length() == 0) {
            uBP ubp = this.AkhnZx;
            if (ubp != null) {
                if (bizInstrument == null || (quoteSymbol = bizInstrument.getQuoteSymbol()) == null) {
                    quoteSymbol = "";
                }
                ubp.EZpvd(quoteSymbol);
            }
        } else {
            uBP ubp2 = this.AkhnZx;
            if (ubp2 != null) {
                ubp2.EZpvd(strEZpvd);
            }
        }
        this.copydefault.EZpvd.setText(tradeType == TradeType.BUY_OPEN ? C33070mpX.AYXKKw(C49511upt.Activity.dNCPSb) : C33070mpX.AYXKKw(C49511upt.Activity.djSkpj));
        android.widget.TextView textView = this.copydefault.copydefault;
        uBP ubp3 = this.AkhnZx;
        textView.setText(ubp3 != null ? ubp3.EZpvd() : null);
        android.widget.TextView textView2 = this.copydefault.copydefault;
        textView2.setOnClickListener(new Application(textView2, 1000L, this, bizInstrument, tradeType));
        android.widget.ImageView imageView = this.copydefault.OLrzqt;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this, bizInstrument, tradeType));
        boolean z2 = (bizInstrument == null || (tradeQuoteCcyList = bizInstrument.getTradeQuoteCcyList()) == null || tradeQuoteCcyList.size() <= 1) ? false : true;
        if (this.DbNXlk) {
            this.AhwBna = false;
        }
        if (z2) {
            AppCompatImageView appCompatImageView = this.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(this.DbNXlk ? 0 : 8);
            android.widget.ImageView imageView2 = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(this.AhwBna ? 0 : 8);
        } else {
            AppCompatImageView appCompatImageView2 = this.copydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(8);
            android.widget.ImageView imageView3 = this.copydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(8);
        }
        this.KWHzl = bizInstrument;
        this.gEmmrt = tradeType;
        Function0<Unit> function0 = this.EZpvd;
        if (function0 != null) {
            function0.invoke();
        }
        this.valueOf = z;
    }

    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ TradeType EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(TradeType tradeType) {
            this.EZpvd = tradeType;
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
            EventParamsList.put$default(eventParamsList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, this.EZpvd == TradeType.BUY_OPEN ? "buy" : "sell", false, 4, null);
        }
    }

    public static final class ActionBar implements Function1<EventParamsList, Unit> {
        public final /* synthetic */ TradeType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(TradeType tradeType) {
            this.copydefault = tradeType;
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
            EventParamsList.put$default(eventParamsList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, this.copydefault == TradeType.BUY_OPEN ? "buy" : "sell", false, 4, null);
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ uBL AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ TradeType KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ BizInstrument copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, uBL ubl, BizInstrument bizInstrument, TradeType tradeType) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = ubl;
            this.copydefault = bizInstrument;
            this.KWHzl = tradeType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                uBL ubl = this.AEQbTJ;
                BizInstrument bizInstrument = this.copydefault;
                ubl.copydefault(bizInstrument != null ? bizInstrument.getTradeQuoteCcyList() : null);
                C32866mlf.onEvent$default("TradePage_TradeWith_Dropdown_Click", (TrackChannel[]) null, new ActionBar(this.KWHzl), 1, (java.lang.Object) null);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ uBL EZpvd;
        public final /* synthetic */ BizInstrument KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ TradeType copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, uBL ubl, BizInstrument bizInstrument, TradeType tradeType) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = ubl;
            this.KWHzl = bizInstrument;
            this.copydefault = tradeType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                uBL ubl = this.EZpvd;
                BizInstrument bizInstrument = this.KWHzl;
                ubl.copydefault(bizInstrument != null ? bizInstrument.getTradeQuoteCcyList() : null);
                C32866mlf.onEvent$default("TradePage_TradeWith_Dropdown_Click", (TrackChannel[]) null, new StateListAnimator(this.copydefault), 1, (java.lang.Object) null);
            }
        }
    }

    public final void copydefault(java.util.List<java.lang.String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            return;
        }
        uBP ubp = this.AkhnZx;
        java.lang.String strEZpvd = ubp != null ? ubp.EZpvd() : null;
        TradeWithCryptoSelectDialog.Activity activity = TradeWithCryptoSelectDialog.Companion;
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        for (java.lang.String str : list) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            arrayList.add(new TradeWithCryptoSelectDialog.CryptoData(interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.valueOf(str) : null, str, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strEZpvd)));
        }
        TradeWithCryptoSelectDialog tradeWithCryptoSelectDialogKWHzl = activity.KWHzl(arrayList, new Function1() { // from class: o.uBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return uBL.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }, this.gEmmrt == TradeType.BUY_OPEN, this.AYXKKw, this.valueOf);
        tradeWithCryptoSelectDialogKWHzl.EZpvd(new Function0() { // from class: o.uBN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return uBL.OLrzqt(this.EZpvd);
            }
        });
        androidx.fragment.app.FragmentManager fragmentManager = this.AEQbTJ;
        if (fragmentManager == null) {
            return;
        }
        tradeWithCryptoSelectDialogKWHzl.show(fragmentManager);
        android.widget.ImageView imageView = this.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (imageView.getVisibility() == 0) {
            this.copydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.dUDNAs);
        }
    }

    public static final Unit copydefault(final uBL ubl, final java.lang.String str) {
        if (str != null) {
            uBP ubp = ubl.AkhnZx;
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (ubp != null ? ubp.EZpvd() : null))) {
                uBP ubp2 = ubl.AkhnZx;
                if (ubp2 != null) {
                    ubp2.EZpvd(str);
                }
                ubl.copydefault.copydefault.setText(str);
                xVB.OLrzqt.KWHzl(str);
                Function0<Unit> function0 = ubl.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
                C32866mlf.onEvent$default("TradePage_TradeWith_Dropdown_Click", (TrackChannel[]) null, new Function1() { // from class: o.uBR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return uBL.KWHzl(str, ubl, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                pUU.KWHzl("TradeWithSwitchView", "switch quote ccy = " + str);
            }
        }
        Function1<? super java.lang.String, Unit> function1 = ubl.djBIcL;
        if (function1 != null) {
            function1.invoke(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.String str, uBL ubl, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "coin_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, ubl.gEmmrt == TradeType.BUY_OPEN ? "buy" : "sell", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(uBL ubl) {
        android.widget.ImageView imageView = ubl.copydefault.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (imageView.getVisibility() == 0) {
            ubl.copydefault.OLrzqt.setImageResource(C52761wXj.TaskDescription.QSLkRj);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.EZpvd = null;
    }
}
