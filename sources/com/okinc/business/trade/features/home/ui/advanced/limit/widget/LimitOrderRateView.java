package com.okinc.business.trade.features.home.ui.advanced.limit.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeLimitStatePool;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.p2p.api.OtcExtraKeys;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C19738gNm;
import o.C21775hLw;
import o.C22495hgT;
import o.C23271hvA;
import o.C23272hvB;
import o.C23274hvD;
import o.C23311hvo;
import o.C23313hvq;
import o.C23317hvu;
import o.C23322hvz;
import o.C24806ikl;
import o.C25352ivB;
import o.C25382ivf;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33134mqi;
import o.C52761wXj;
import o.C55001xbh;
import o.C55113xdn;
import o.C55296xhK;
import o.C55298xhM;
import o.C55320xhi;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.C57406yhn;
import o.C59449zhJ;
import o.InterfaceC56445yFq;
import o.ViewOnClickListenerC54939xaY;
import o.hGE;
import o.pTF;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public final class LimitOrderRateView extends ConstraintLayout {
    public C22495hgT AYXKKw;
    public String AhwBna;
    public final hGE EZpvd;
    public Function1<? super Boolean, Unit> KWHzl;
    public Function1<? super Pair<String, String>, Unit> OLrzqt;
    public final Function2<C55001xbh, String, Unit> copydefault;
    public boolean djBIcL;
    public Function1<? super Boolean, Unit> gEmmrt;
    public Function1<? super String, Unit> valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShowType.values().length];
            try {
                iArr[ShowType.SELL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowType.BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[LimitMarketPrice.QuoteState.values().length];
            try {
                iArr2[LimitMarketPrice.QuoteState.QuoteSuccess.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LimitMarketPrice.QuoteState.Quoting.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LimitMarketPrice.QuoteState.NoLiquidity.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LimitMarketPrice.QuoteState.NoLiquidityAtTheMoment.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LimitMarketPrice.QuoteState.QuoteFail.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LimitMarketPrice.QuoteState.QuoteHoneyPot.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitOrderRateView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.AhwBna = "";
        this.djBIcL = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingCallback(@NotNull Function1<? super Pair<String, String>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevelEventCallback(@NotNull Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimitContentViewModel(@NotNull C22495hgT c22495hgT) {
        Intrinsics.checkNotNullParameter(c22495hgT, "");
        this.AYXKKw = c22495hgT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFocusCallBack(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    public final void setRateTitle() {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:63) call: com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ LimitOrderRateView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitOrderRateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hGE hgeAEQbTJ = hGE.AEQbTJ(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(hgeAEQbTJ, "");
        this.EZpvd = hgeAEQbTJ;
        this.AhwBna = "";
        this.copydefault = new Function2() { // from class: o.lcn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LimitOrderRateView.KWHzl(this.KWHzl, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
        setBackgroundResource(C57406yhn.Activity.valueOf);
        int iOLrzqt = C55298xhM.OLrzqt(16, context);
        setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
        ejfBZ();
        AuCTel();
    }

    public static final class Application implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String strGEmmrt = C33129mqd.gEmmrt(editable);
            if (C33129mqd.OLrzqt((CharSequence) strGEmmrt)) {
                LimitOrderRateView.this.AEQbTJ(C23313hvq.divCheckD$default(strGEmmrt, 100, null, null, null, 14, null));
                Function1 function1 = LimitOrderRateView.this.valueOf;
                if (function1 != null) {
                    function1.invoke(DexTrackEventParameter.LevelValue.HIGH.getValue());
                }
            }
        }
    }

    public static final Unit KWHzl(LimitOrderRateView limitOrderRateView, C55001xbh c55001xbh, String str) {
        C22495hgT c22495hgT;
        TradeLimitStatePool tradeLimitStatePoolZuWLRA;
        MutableLiveData<ConsumeData<TradeInputGroup>> postValueLengthLimit;
        ConsumeData<TradeInputGroup> value;
        TradeInputGroup data;
        ConsumeData<ExchangeRateData> exchangeRateData;
        ExchangeRateData data2;
        String strDivCheckS$default = "";
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        limitOrderRateView.values();
        C22495hgT c22495hgT2 = limitOrderRateView.AYXKKw;
        if (c22495hgT2 != null && (postValueLengthLimit = c22495hgT2.getPostValueLengthLimit()) != null && (value = postValueLengthLimit.getValue()) != null && (data = value.getData()) != null && (exchangeRateData = data.getExchangeRateData()) != null && (data2 = exchangeRateData.getData()) != null) {
            C22495hgT c22495hgT3 = limitOrderRateView.AYXKKw;
            if ((c22495hgT3 != null ? c22495hgT3.AuCTelauCTel() : null) == ShowType.SELL) {
                strDivCheckS$default = C23311hvo.OLrzqt(str);
            } else if (C23311hvo.OLrzqt(str).length() != 0) {
                strDivCheckS$default = C23313hvq.divCheckS$default(1, C23311hvo.OLrzqt(str), null, null, null, 14, null);
            }
            data2.setCustomRate(strDivCheckS$default);
        }
        limitOrderRateView.AYXKKw();
        limitOrderRateView.DbNXlk();
        if (!C59449zhJ.endsWith$default(str, JwtUtilsKt.JWT_DELIMITER, false, 2, null) && !limitOrderRateView.djBIcL && (c22495hgT = limitOrderRateView.AYXKKw) != null && (tradeLimitStatePoolZuWLRA = c22495hgT.zuWLRA()) != null) {
            tradeLimitStatePoolZuWLRA.refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        return Unit.INSTANCE;
    }

    public final void setRateLockEventCallback(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.gEmmrt = function1;
        AEQbTJ();
    }

    public final Pair<Drawable, Integer> KWHzl(boolean z) {
        if (z) {
            return C56390yDp.OLrzqt(C33070mpX.KWHzl(C52761wXj.TaskDescription.hkDICb), Integer.valueOf(C52761wXj.Activity.fdOvFl));
        }
        return C56390yDp.OLrzqt(C33070mpX.KWHzl(C52761wXj.TaskDescription.ICustomTabsCallbackDefault), Integer.valueOf(C52761wXj.Activity.QwvEab));
    }

    public final void AEQbTJ() {
        boolean zAEQbTJ = C23317hvu.AEQbTJ();
        this.EZpvd.EZpvd.setSelected(zAEQbTJ);
        Function1<? super Boolean, Unit> function1 = this.gEmmrt;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(zAEQbTJ));
        }
        Pair<Drawable, Integer> pairKWHzl = KWHzl(zAEQbTJ);
        this.EZpvd.EZpvd.setBackgroundDrawable(pairKWHzl.getFirst());
        AppCompatImageView appCompatImageView = this.EZpvd.EZpvd;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        appCompatImageView.setImageTintList(ColorStateList.valueOf(C25382ivf.KWHzl(context, pairKWHzl.getSecond().intValue())));
    }

    private final void AuCTel() {
        EZpvd(this.EZpvd.DbNXlk);
        this.EZpvd.KWHzl.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lck
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                LimitOrderRateView.KWHzl(this.OLrzqt, view, z);
            }
        });
        FrameLayout frameLayout = this.EZpvd.gEmmrt;
        frameLayout.setOnClickListener(new StateListAnimator(frameLayout, 1000L, this));
        TextView textView = this.EZpvd.DbNXlk;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        TextView textView2 = this.EZpvd.valueOf;
        textView2.setOnClickListener(new FragmentManager(textView2, 1000L, this));
        TextView textView3 = this.EZpvd.AYXKKw;
        textView3.setOnClickListener(new PendingIntent(textView3, 1000L, this));
        C55001xbh c55001xbh = this.EZpvd.AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        c55001xbh.addTextChangedListener(new Application());
        AppCompatImageView appCompatImageView = this.EZpvd.OLrzqt;
        appCompatImageView.setOnClickListener(new Dialog(appCompatImageView, 1000L, this));
        this.EZpvd.KWHzl.setIsolateTextChangedListener(new Function2() { // from class: o.lco
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LimitOrderRateView.copydefault(this.OLrzqt, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
        C55320xhi c55320xhi = this.EZpvd.copydefault;
        c55320xhi.setOnClickListener(new Fragment(c55320xhi, 1000L, this));
        this.EZpvd.KWHzl.KWHzl(this.copydefault);
    }

    public static final void KWHzl(LimitOrderRateView limitOrderRateView, View view, boolean z) {
        if (z) {
            limitOrderRateView.EZpvd((View) null);
        }
        Function1<? super Boolean, Unit> function1 = limitOrderRateView.KWHzl;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ LimitOrderRateView copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, LimitOrderRateView limitOrderRateView) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = limitOrderRateView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.copydefault.copydefault();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ LimitOrderRateView KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, LimitOrderRateView limitOrderRateView) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = limitOrderRateView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C22495hgT c22495hgT = this.KWHzl.AYXKKw;
                if (c22495hgT != null) {
                    C22495hgT c22495hgT2 = this.KWHzl.AYXKKw;
                    ShowType showTypeAuCTelauCTel = c22495hgT2 != null ? c22495hgT2.AuCTelauCTel() : null;
                    ShowType showType = ShowType.BUY;
                    if (showTypeAuCTelauCTel == showType) {
                        showType = ShowType.SELL;
                    }
                    c22495hgT.AEQbTJ(showType);
                }
                LimitOrderRateView limitOrderRateView = this.KWHzl;
                C22495hgT c22495hgT3 = limitOrderRateView.AYXKKw;
                String strWlaJM = c22495hgT3 != null ? c22495hgT3.wlaJM() : null;
                if (strWlaJM == null) {
                    strWlaJM = "";
                }
                limitOrderRateView.AEQbTJ(strWlaJM, true);
                Function1 function1 = this.KWHzl.valueOf;
                if (function1 != null) {
                    function1.invoke(DexTrackEventParameter.ButtonName.DIRECTION.getValue());
                }
                Function1 function12 = this.KWHzl.OLrzqt;
                if (function12 != null) {
                    function12.invoke(C56390yDp.OLrzqt(ButtonType.OTHERS.getType(), TrackButtonName.LIMIT_RATE_SWITCH.getButtonName()));
                }
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ LimitOrderRateView EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, LimitOrderRateView limitOrderRateView) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = limitOrderRateView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String formatOriginValue;
            C21775hLw c21775hLwFinit;
            LimitPairRateResponse limitPairRateResponseAYXKKw;
            C21775hLw c21775hLwFinit2;
            LimitPairRateResponse limitPairRateResponseAYXKKw2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C22495hgT c22495hgT = this.EZpvd.AYXKKw;
                Boolean boolValueOf = (c22495hgT == null || (c21775hLwFinit2 = c22495hgT.finit()) == null || (limitPairRateResponseAYXKKw2 = c21775hLwFinit2.AYXKKw()) == null) ? null : Boolean.valueOf(limitPairRateResponseAYXKKw2.isHigh());
                C22495hgT c22495hgT2 = this.EZpvd.AYXKKw;
                if (c22495hgT2 == null || (c21775hLwFinit = c22495hgT2.finit()) == null || (limitPairRateResponseAYXKKw = c21775hLwFinit.AYXKKw()) == null || (formatOriginValue = limitPairRateResponseAYXKKw.getFormatOriginValue()) == null) {
                    formatOriginValue = "";
                }
                String str = formatOriginValue;
                C22495hgT c22495hgT3 = this.EZpvd.AYXKKw;
                if ((c22495hgT3 != null ? c22495hgT3.AuCTelauCTel() : null) == ShowType.SELL) {
                    if (Intrinsics.EZpvd(boolValueOf, Boolean.TRUE)) {
                        if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (Object) null)) {
                            this.EZpvd.EZpvd(C59449zhJ.replace$default(str, Marker.ANY_NON_NULL_MARKER, "", false, 4, (Object) null), C23274hvD.Fragment.ikEgkI);
                        }
                    } else if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null)) {
                        this.EZpvd.EZpvd(C59449zhJ.replace$default(str, "-", "", false, 4, (Object) null), C23274hvD.Fragment.zUtmHU);
                    }
                } else if (Intrinsics.EZpvd(boolValueOf, Boolean.TRUE)) {
                    if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (Object) null)) {
                        this.EZpvd.EZpvd(C59449zhJ.replace$default(str, Marker.ANY_NON_NULL_MARKER, "", false, 4, (Object) null), C23274hvD.Fragment.rsEnD);
                    }
                } else if (StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "-", false, 2, (Object) null)) {
                    this.EZpvd.EZpvd(C59449zhJ.replace$default(str, "-", "", false, 4, (Object) null), C23274hvD.Fragment.validateSHA256);
                }
                Function1 function1 = this.EZpvd.OLrzqt;
                if (function1 != null) {
                    function1.invoke(C56390yDp.OLrzqt(ButtonType.EXPLAIN.getType(), TrackButtonName.LIMIT_RATE_DIFF_EXPLAIN.getButtonName()));
                }
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ LimitOrderRateView AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, LimitOrderRateView limitOrderRateView) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = limitOrderRateView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LimitOrderRateView limitOrderRateView = this.AEQbTJ;
                limitOrderRateView.EZpvd(limitOrderRateView.EZpvd.valueOf);
                this.AEQbTJ.AhwBna();
                LimitOrderRateView limitOrderRateView2 = this.AEQbTJ;
                limitOrderRateView2.AEQbTJ(limitOrderRateView2.valueOf() ? 0.1d : 0.2d);
                Function1 function1 = this.AEQbTJ.valueOf;
                if (function1 != null) {
                    function1.invoke(DexTrackEventParameter.LevelValue.LOW.getValue());
                }
                this.AEQbTJ.OLrzqt();
                Function1 function12 = this.AEQbTJ.OLrzqt;
                if (function12 != null) {
                    function12.invoke(C56390yDp.OLrzqt(ButtonType.QUICK_BUTTON.getType(), TrackButtonName.CONDITION_QUICK_LOW.getButtonName()));
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ LimitOrderRateView OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(View view, long j, LimitOrderRateView limitOrderRateView) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = limitOrderRateView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                LimitOrderRateView limitOrderRateView = this.OLrzqt;
                limitOrderRateView.EZpvd(limitOrderRateView.EZpvd.AYXKKw);
                this.OLrzqt.AhwBna();
                LimitOrderRateView limitOrderRateView2 = this.OLrzqt;
                limitOrderRateView2.AEQbTJ(limitOrderRateView2.valueOf() ? 0.2d : 0.5d);
                Function1 function1 = this.OLrzqt.valueOf;
                if (function1 != null) {
                    function1.invoke(DexTrackEventParameter.LevelValue.MID.getValue());
                }
                this.OLrzqt.OLrzqt();
                Function1 function12 = this.OLrzqt.OLrzqt;
                if (function12 != null) {
                    function12.invoke(C56390yDp.OLrzqt(ButtonType.QUICK_BUTTON.getType(), TrackButtonName.CONDITION_QUICK_MID.getButtonName()));
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ LimitOrderRateView EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(View view, long j, LimitOrderRateView limitOrderRateView) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = limitOrderRateView;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                boolean z = !this.EZpvd.EZpvd.EZpvd.isSelected();
                if (z) {
                    C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.isAvailable));
                } else {
                    C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.gxJrGF));
                }
                this.EZpvd.EZpvd.EZpvd.setSelected(z);
                Pair pairKWHzl = this.EZpvd.KWHzl(z);
                this.EZpvd.EZpvd.EZpvd.setBackgroundDrawable((Drawable) pairKWHzl.getFirst());
                AppCompatImageView appCompatImageView = this.EZpvd.EZpvd.EZpvd;
                Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                appCompatImageView.setImageTintList(ColorStateList.valueOf(C25382ivf.KWHzl(context, ((Number) pairKWHzl.getSecond()).intValue())));
                C23317hvu.KWHzl(z);
                Function1 function1 = this.EZpvd.gEmmrt;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        }
    }

    public static final Unit copydefault(LimitOrderRateView limitOrderRateView, C55001xbh c55001xbh, String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (c55001xbh.hasFocus()) {
            limitOrderRateView.AhwBna();
            limitOrderRateView.setRateChange();
        }
        c55001xbh.setTextSize(C25352ivB.KWHzl(str.length()));
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        EZpvd(this.EZpvd.DbNXlk);
        AhwBna();
        AEQbTJ(AudioStats.AUDIO_AMPLITUDE_NONE);
        Function1<? super String, Unit> function1 = this.valueOf;
        if (function1 != null) {
            function1.invoke(DexTrackEventParameter.LevelValue.MARKET.getValue());
        }
        OLrzqt();
        Function1<? super Pair<String, String>, Unit> function12 = this.OLrzqt;
        if (function12 != null) {
            function12.invoke(C56390yDp.OLrzqt(ButtonType.QUICK_BUTTON.getType(), TrackButtonName.CONDITION_QUICK_MARKET.getButtonName()));
        }
    }

    public final void EZpvd(View view) {
        hGE hge = this.EZpvd;
        if (Intrinsics.EZpvd(view, hge.DbNXlk)) {
            hge.DbNXlk.setSelected(true);
            hge.valueOf.setSelected(false);
            hge.AYXKKw.setSelected(false);
            hge.AhwBna.setSelected(false);
            return;
        }
        if (Intrinsics.EZpvd(view, hge.valueOf)) {
            hge.DbNXlk.setSelected(false);
            hge.valueOf.setSelected(true);
            hge.AYXKKw.setSelected(false);
            hge.AhwBna.setSelected(false);
            return;
        }
        if (Intrinsics.EZpvd(view, hge.AYXKKw)) {
            hge.DbNXlk.setSelected(false);
            hge.valueOf.setSelected(false);
            hge.AYXKKw.setSelected(true);
            hge.AhwBna.setSelected(false);
            return;
        }
        if (Intrinsics.EZpvd(view, hge.AhwBna)) {
            hge.DbNXlk.setSelected(false);
            hge.valueOf.setSelected(false);
            hge.AYXKKw.setSelected(false);
            hge.AhwBna.setSelected(true);
            return;
        }
        hge.DbNXlk.setSelected(false);
        hge.valueOf.setSelected(false);
        hge.AYXKKw.setSelected(false);
        hge.AhwBna.setSelected(false);
    }

    public final boolean valueOf() {
        C22495hgT c22495hgT = this.AYXKKw;
        return (c22495hgT != null ? c22495hgT.AuCTelauCTel() : null) == ShowType.BUY;
    }

    private final void ejfBZ() {
        this.EZpvd.KWHzl.setHint(C23322hvz.toLocalizedNumber$default("0", false, (RoundingMode) null, false, false, 15, (Object) null));
        this.EZpvd.KWHzl.setMaxDecimalValue(C33129mqd.AhwBna("12"));
        final C55001xbh c55001xbh = this.EZpvd.AhwBna;
        setNormalBgStyle();
        c55001xbh.setCursorStyleWeb3();
        c55001xbh.setHintTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lci
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                LimitOrderRateView.copydefault(c55001xbh, this, view, z);
            }
        });
        isConnected();
        djBIcL();
    }

    public static final void copydefault(C55001xbh c55001xbh, LimitOrderRateView limitOrderRateView, View view, boolean z) {
        boolean zOLrzqt = C33129mqd.OLrzqt((CharSequence) c55001xbh.isConnected());
        AppCompatTextView appCompatTextView = limitOrderRateView.EZpvd.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility((z || zOLrzqt) ? 0 : 8);
        AppCompatTextView appCompatTextView2 = limitOrderRateView.EZpvd.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility((z || zOLrzqt) ? 0 : 8);
        limitOrderRateView.setNormalBgStyle();
        if (z) {
            limitOrderRateView.EZpvd(limitOrderRateView.EZpvd.AhwBna);
            limitOrderRateView.setRateChange();
            c55001xbh.setHintText("");
            AppCompatTextView appCompatTextView3 = limitOrderRateView.EZpvd.fetchVPNInfo;
            C22495hgT c22495hgT = limitOrderRateView.AYXKKw;
            appCompatTextView3.setText((c22495hgT != null ? c22495hgT.AuCTelauCTel() : null) == ShowType.BUY ? "-" : Marker.ANY_NON_NULL_MARKER);
        } else {
            c55001xbh.setHintText(C33070mpX.AYXKKw(C23274hvD.Fragment.iwGUEr));
        }
        Function1<? super Boolean, Unit> function1 = limitOrderRateView.KWHzl;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void EZpvd(@NotNull C19738gNm c19738gNm) {
        Intrinsics.checkNotNullParameter(c19738gNm, "");
        this.EZpvd.KWHzl.setEnabled(c19738gNm.AhwBna());
        this.EZpvd.DbNXlk.setEnabled(c19738gNm.copydefault());
        this.EZpvd.valueOf.setEnabled(c19738gNm.copydefault());
        this.EZpvd.AYXKKw.setEnabled(c19738gNm.copydefault());
        this.EZpvd.AhwBna.setEnabled(c19738gNm.copydefault());
        FrameLayout frameLayout = this.EZpvd.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(c19738gNm.OLrzqt() ? 0 : 8);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = true;
        AhwBna();
        values();
        this.EZpvd.KWHzl.setPlainNumericText(str);
    }

    public final void setRateChange() {
        C22495hgT c22495hgT = this.AYXKKw;
        if (c22495hgT != null) {
            c22495hgT.AEQbTJ(ChangeType.RateChange);
        }
    }

    public final void DbNXlk() {
        String toTokenPrice;
        String str;
        C21775hLw c21775hLwFinit;
        C21775hLw c21775hLwFinit2;
        C22495hgT c22495hgT = this.AYXKKw;
        LimitCalResult limitCalResultCopydefault = (c22495hgT == null || (c21775hLwFinit2 = c22495hgT.finit()) == null) ? null : c21775hLwFinit2.copydefault();
        C22495hgT c22495hgT2 = this.AYXKKw;
        LimitPairRateResponse limitPairRateResponseAYXKKw = (c22495hgT2 == null || (c21775hLwFinit = c22495hgT2.finit()) == null) ? null : c21775hLwFinit.AYXKKw();
        C22495hgT c22495hgT3 = this.AYXKKw;
        if ((c22495hgT3 != null ? c22495hgT3.AuCTelauCTel() : null) == ShowType.BUY) {
            if (limitPairRateResponseAYXKKw == null || (toTokenPrice = limitPairRateResponseAYXKKw.getFromTokenPrice()) == null) {
                if (limitCalResultCopydefault != null) {
                    toTokenPrice = limitCalResultCopydefault.getFromTokenPrice();
                }
                str = null;
            }
            str = toTokenPrice;
        } else {
            if (limitPairRateResponseAYXKKw == null || (toTokenPrice = limitPairRateResponseAYXKKw.getToTokenPrice()) == null) {
                if (limitCalResultCopydefault != null) {
                    toTokenPrice = limitCalResultCopydefault.getToTokenPrice();
                }
                str = null;
            }
            str = toTokenPrice;
        }
        String strIsConnected = this.EZpvd.KWHzl.isConnected();
        AppCompatTextView appCompatTextView = this.EZpvd.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility((C33129mqd.OLrzqt((CharSequence) str) && C33129mqd.OLrzqt((CharSequence) strIsConnected)) ? 0 : 8);
        String showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, C33129mqd.gEmmrt(str != null ? C23313hvq.mulCheckS$default(str, strIsConnected, null, null, null, 14, null) : null), false, false, RoundingMode.DOWN, false, 20, null);
        this.EZpvd.ejfBZ.setText("≈ " + showDataWithPrefix$default);
    }

    public final void setNormalBgStyle() {
        if (this.EZpvd.AhwBna.hasFocus()) {
            this.EZpvd.AhwBna.setBackgroundResource(C23274hvD.ActionBar.fetchVPNInfo);
            Function1<? super Pair<String, String>, Unit> function1 = this.OLrzqt;
            if (function1 != null) {
                function1.invoke(C56390yDp.OLrzqt(ButtonType.QUICK_BUTTON.getType(), TrackButtonName.CONDITION_QUICK_CUSTOM.getButtonName()));
                return;
            }
            return;
        }
        this.EZpvd.AhwBna.setBackgroundResource(C23274hvD.ActionBar.AkhnZx);
    }

    public final void isConnected() {
        String tokenSymbol;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ;
        String tokenSymbol2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq;
        C22495hgT c22495hgT = this.AYXKKw;
        String str = "";
        if (c22495hgT == null || (dexMultiTokenInfoBeanQKudOq = c22495hgT.QKudOq()) == null || (tokenSymbol = dexMultiTokenInfoBeanQKudOq.getTokenSymbol()) == null) {
            tokenSymbol = "";
        }
        C22495hgT c22495hgT2 = this.AYXKKw;
        if (c22495hgT2 != null && (dexMultiTokenInfoBeanOcIXYQ = c22495hgT2.OcIXYQ()) != null && (tokenSymbol2 = dexMultiTokenInfoBeanOcIXYQ.getTokenSymbol()) != null) {
            str = tokenSymbol2;
        }
        KWHzl(str, tokenSymbol);
    }

    public final void KWHzl(String str, String str2) {
        Pair pairOLrzqt;
        C22495hgT c22495hgT = this.AYXKKw;
        if ((c22495hgT != null ? c22495hgT.AuCTelauCTel() : null) == ShowType.BUY) {
            pairOLrzqt = C56390yDp.OLrzqt(str2, str);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(str, str2);
        }
        String str3 = (String) pairOLrzqt.component1();
        String str4 = (String) pairOLrzqt.component2();
        if (str3.length() == 0) {
            this.EZpvd.isConnected.setText("--");
        } else {
            this.EZpvd.isConnected.setText(C33069mpW.copydefault(C23274hvD.Fragment.aRClCA, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str3))));
        }
        if (str4.length() == 0) {
            this.EZpvd.values.setText("--");
        } else {
            this.EZpvd.values.setText(C25352ivB.AEQbTJ(str4));
        }
    }

    public final void setInputText(String str, String str2) {
        if (str2.length() == 0) {
            this.EZpvd.KWHzl.setTradeInputContent(str2);
            return;
        }
        hGE hge = this.EZpvd;
        hge.KWHzl.AEQbTJ(this.copydefault);
        hge.KWHzl.setTradeInputContent(str);
        hge.KWHzl.KWHzl(this.copydefault);
        if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "<", false, 2, (Object) null)) {
            return;
        }
        hge.KWHzl.setVisibility(8);
    }

    public final void AYXKKw() {
        String rateDiffAmountShow;
        String strWlaJM;
        C22495hgT c22495hgT;
        C21775hLw c21775hLwFinit;
        LimitPairRateResponse limitPairRateResponseAYXKKw;
        hGE hge = this.EZpvd;
        C22495hgT c22495hgT2 = this.AYXKKw;
        if (c22495hgT2 == null || (strWlaJM = c22495hgT2.wlaJM()) == null || (c22495hgT = this.AYXKKw) == null || (c21775hLwFinit = c22495hgT.finit()) == null || (limitPairRateResponseAYXKKw = c21775hLwFinit.AYXKKw()) == null) {
            rateDiffAmountShow = null;
        } else {
            C22495hgT c22495hgT3 = this.AYXKKw;
            Intrinsics.copydefault(c22495hgT3);
            rateDiffAmountShow = limitPairRateResponseAYXKKw.getRateDiffAmountShow(strWlaJM, c22495hgT3.AuCTelauCTel());
        }
        if (rateDiffAmountShow != null && rateDiffAmountShow.length() > 0) {
            hge.copydefault.setText(pTF.KWHzl.AEQbTJ(rateDiffAmountShow));
            hge.copydefault.setVisibility(0);
        } else {
            hge.copydefault.setVisibility(8);
        }
    }

    public static /* synthetic */ void switchSellBuy$default(LimitOrderRateView limitOrderRateView, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        limitOrderRateView.AEQbTJ(str, z);
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected();
        djBIcL();
        if (z) {
            AYXKKw();
        }
        if (str.length() == 0) {
            setInputText("", "");
            return;
        }
        C22495hgT c22495hgT = this.AYXKKw;
        ShowType showTypeAuCTelauCTel = c22495hgT != null ? c22495hgT.AuCTelauCTel() : null;
        int i = showTypeAuCTelauCTel == null ? -1 : Activity.OLrzqt[showTypeAuCTelauCTel.ordinal()];
        if (i == 1) {
            setInputText(C23271hvA.getSwapFormatAmount$default(C23271hvA.copydefault, str, null, 2, null), str);
        } else if (i == 2) {
            setInputText(C23271hvA.getSwapFormatAmount$default(C23271hvA.copydefault, C23313hvq.divCheckS$default(1, str, Integer.valueOf(C33129mqd.AhwBna("18")), null, RoundingMode.DOWN, 4, null), null, 2, null), str);
        }
        DbNXlk();
    }

    public final void djBIcL() {
        C22495hgT c22495hgT = this.AYXKKw;
        ShowType showTypeAuCTelauCTel = c22495hgT != null ? c22495hgT.AuCTelauCTel() : null;
        if (showTypeAuCTelauCTel != null && Activity.OLrzqt[showTypeAuCTelauCTel.ordinal()] == 2) {
            this.EZpvd.valueOf.setText(C23311hvo.formatPercentWithSymbol$default("-0.1", false, 0, 0, null, null, 31, null));
            this.EZpvd.AYXKKw.setText(C23311hvo.formatPercentWithSymbol$default("-0.2", false, 0, 0, null, null, 31, null));
            this.EZpvd.fetchVPNInfo.setText("-");
        } else {
            this.EZpvd.valueOf.setText(C23311hvo.formatPercentWithSymbol$default("0.2", false, 0, 0, null, null, 31, null));
            this.EZpvd.AYXKKw.setText(C23311hvo.formatPercentWithSymbol$default(SlippageConfigVo.MAX_SLIP, false, 0, 0, null, null, 31, null));
            this.EZpvd.fetchVPNInfo.setText(Marker.ANY_NON_NULL_MARKER);
        }
    }

    public final void AEQbTJ(double d) {
        EZpvd();
        setRateChange();
        C22495hgT c22495hgT = this.AYXKKw;
        if (c22495hgT != null) {
            c22495hgT.AhwBna(C33129mqd.gEmmrt(Double.valueOf(d)));
        }
        C24806ikl c24806ikl = this.EZpvd.KWHzl;
        String strAkhnZx = AkhnZx();
        if (strAkhnZx == null) {
            return;
        }
        c24806ikl.setPlainNumericText(strAkhnZx);
    }

    private final String AkhnZx() {
        C22495hgT c22495hgT = this.AYXKKw;
        if (c22495hgT == null) {
            return null;
        }
        String strODWQjV = c22495hgT.ODWQjV();
        String strOLrzqt = c22495hgT.finit().OLrzqt();
        if (strOLrzqt == null) {
            return null;
        }
        String strMulCheckS$default = C23313hvq.mulCheckS$default(strOLrzqt, Double.valueOf(C23313hvq.addCheckD$default("1", strODWQjV, null, null, null, 14, null)), null, null, null, 14, null);
        if (c22495hgT.AuCTelauCTel() != ShowType.SELL) {
            strMulCheckS$default = C23313hvq.divCheckS$default("1", strMulCheckS$default, null, null, null, 14, null);
        }
        return C23313hvq.formatCheckS$default(strMulCheckS$default, Integer.valueOf(C33129mqd.AhwBna("12")), null, null, 6, null);
    }

    public final void fetchVPNInfo() {
        String strAkhnZx = AkhnZx();
        if (strAkhnZx == null) {
            strAkhnZx = "";
        }
        AEQbTJ(strAkhnZx, false);
    }

    public final void EZpvd(String str, int i) {
        String strCopydefault = C33069mpW.copydefault(i, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", str)));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle("");
        viewOnClickListenerC54939xaY.EZpvd(strCopydefault);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public final void OLrzqt() {
        hGE hge = this.EZpvd;
        hge.KWHzl.clearFocus();
        hge.AhwBna.clearFocus();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.OLrzqt(context, hge.KWHzl);
    }

    public final void OLrzqt(@NotNull LimitMarketPrice.QuoteState quoteState, boolean z) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(quoteState, "");
        switch (Activity.KWHzl[quoteState.ordinal()]) {
            case 1:
                C24806ikl c24806ikl = this.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c24806ikl, "");
                c24806ikl.setVisibility(0);
                C55113xdn c55113xdn = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                c55113xdn.setVisibility(8);
                this.EZpvd.DbNXlk.setEnabled(z);
                this.EZpvd.valueOf.setEnabled(z);
                this.EZpvd.AYXKKw.setEnabled(z);
                this.EZpvd.AhwBna.setEnabled(z);
                C55001xbh c55001xbh = this.EZpvd.AhwBna;
                if (z) {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
                } else {
                    iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
                }
                c55001xbh.setHintTextColor(iCopydefault);
                if (KWHzl()) {
                    return;
                }
                this.AhwBna = "";
                fetchVPNInfo();
                return;
            case 2:
                C24806ikl c24806ikl2 = this.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c24806ikl2, "");
                c24806ikl2.setVisibility(4);
                C55113xdn c55113xdn2 = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn2, "");
                c55113xdn2.setVisibility(0);
                this.EZpvd.DbNXlk.setEnabled(false);
                this.EZpvd.valueOf.setEnabled(false);
                this.EZpvd.AYXKKw.setEnabled(false);
                this.EZpvd.AhwBna.setEnabled(false);
                return;
            case 3:
            case 4:
                C24806ikl c24806ikl3 = this.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c24806ikl3, "");
                c24806ikl3.setVisibility(0);
                C55113xdn c55113xdn3 = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn3, "");
                c55113xdn3.setVisibility(8);
                this.EZpvd.DbNXlk.setEnabled(false);
                this.EZpvd.valueOf.setEnabled(false);
                this.EZpvd.AYXKKw.setEnabled(false);
                this.EZpvd.AhwBna.setEnabled(false);
                if (KWHzl()) {
                    return;
                }
                this.AhwBna = "";
                AEQbTJ("", false);
                return;
            case 5:
            case 6:
                C24806ikl c24806ikl4 = this.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c24806ikl4, "");
                c24806ikl4.setVisibility(0);
                C55113xdn c55113xdn4 = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c55113xdn4, "");
                c55113xdn4.setVisibility(8);
                this.EZpvd.DbNXlk.setEnabled(false);
                this.EZpvd.valueOf.setEnabled(false);
                this.EZpvd.AYXKKw.setEnabled(false);
                this.EZpvd.AhwBna.setEnabled(false);
                if (KWHzl()) {
                    return;
                }
                this.AhwBna = "";
                AEQbTJ("", false);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean KWHzl() {
        String str;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ;
        String str2 = this.AhwBna;
        C22495hgT c22495hgT = this.AYXKKw;
        String str3 = null;
        if (c22495hgT == null || (dexMultiTokenInfoBeanOcIXYQ = c22495hgT.OcIXYQ()) == null) {
            str = null;
        } else {
            str = dexMultiTokenInfoBeanOcIXYQ.getChainId() + dexMultiTokenInfoBeanOcIXYQ.getTokenContractAddress();
        }
        C22495hgT c22495hgT2 = this.AYXKKw;
        if (c22495hgT2 != null && (dexMultiTokenInfoBeanQKudOq = c22495hgT2.QKudOq()) != null) {
            str3 = dexMultiTokenInfoBeanQKudOq.getChainId() + dexMultiTokenInfoBeanQKudOq.getTokenContractAddress();
        }
        return Intrinsics.EZpvd((Object) str2, (Object) (str + str3));
    }

    public final void values() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ2;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ3;
        C22495hgT c22495hgT = this.AYXKKw;
        String tokenContractAddress = null;
        String chainId = (c22495hgT == null || (dexMultiTokenInfoBeanOcIXYQ3 = c22495hgT.OcIXYQ()) == null) ? null : dexMultiTokenInfoBeanOcIXYQ3.getChainId();
        if (chainId == null || chainId.length() == 0) {
            return;
        }
        C22495hgT c22495hgT2 = this.AYXKKw;
        String chainId2 = (c22495hgT2 == null || (dexMultiTokenInfoBeanOcIXYQ2 = c22495hgT2.OcIXYQ()) == null) ? null : dexMultiTokenInfoBeanOcIXYQ2.getChainId();
        if (chainId2 == null) {
            chainId2 = "";
        }
        C22495hgT c22495hgT3 = this.AYXKKw;
        String tokenContractAddress2 = (c22495hgT3 == null || (dexMultiTokenInfoBeanOcIXYQ = c22495hgT3.OcIXYQ()) == null) ? null : dexMultiTokenInfoBeanOcIXYQ.getTokenContractAddress();
        if (tokenContractAddress2 == null) {
            tokenContractAddress2 = "";
        }
        C22495hgT c22495hgT4 = this.AYXKKw;
        String chainId3 = (c22495hgT4 == null || (dexMultiTokenInfoBeanQKudOq2 = c22495hgT4.QKudOq()) == null) ? null : dexMultiTokenInfoBeanQKudOq2.getChainId();
        if (chainId3 == null) {
            chainId3 = "";
        }
        C22495hgT c22495hgT5 = this.AYXKKw;
        if (c22495hgT5 != null && (dexMultiTokenInfoBeanQKudOq = c22495hgT5.QKudOq()) != null) {
            tokenContractAddress = dexMultiTokenInfoBeanQKudOq.getTokenContractAddress();
        }
        EZpvd(chainId2, tokenContractAddress2, chainId3, tokenContractAddress != null ? tokenContractAddress : "");
    }

    public final void EZpvd(String str, String str2, String str3, String str4) {
        this.AhwBna = str + str2 + str3 + str4;
    }

    public final void AhwBna() {
        hGE hge = this.EZpvd;
        hge.AhwBna.setPlainNumericText("");
        AppCompatTextView appCompatTextView = hge.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        AppCompatTextView appCompatTextView2 = hge.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(8);
    }

    public final void gEmmrt() {
        copydefault();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ShowType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ShowType[] $VALUES;
        public static final ShowType BUY = new ShowType("BUY", 0);
        public static final ShowType SELL = new ShowType("SELL", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ShowType[] $values() {
            return new ShowType[]{BUY, SELL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ShowType> getEntries() {
            return $ENTRIES;
        }

        private ShowType(String str, int i) {
        }

        static {
            ShowType[] showTypeArr$values = $values();
            $VALUES = showTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(showTypeArr$values);
        }

        public static ShowType valueOf(String str) {
            return (ShowType) Enum.valueOf(ShowType.class, str);
        }

        public static ShowType[] values() {
            return (ShowType[]) $VALUES.clone();
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
