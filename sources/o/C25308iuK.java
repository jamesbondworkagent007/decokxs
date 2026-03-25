package o;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.InputStatus;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC25317iuT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iuK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25308iuK extends android.widget.LinearLayout {
    public yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public InputStatus AhwBna;
    public final java.util.ArrayList<C25302iuE> EZpvd;
    public C54997xbd KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public hFZ copydefault;
    public SlippageViewParam djBIcL;
    public final java.util.ArrayList<C25303iuF> gEmmrt;
    public InterfaceC25317iuT valueOf;

    /* JADX INFO: renamed from: o.iuK$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[InputStatus.values().length];
            try {
                iArr[InputStatus.WARNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[InputStatus.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[InputStatus.NORMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[InputStatus.NO_DATA.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[TradeMode.values().length];
            try {
                iArr2[TradeMode.SwapLimit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[SlippageMode.values().length];
            try {
                iArr3[SlippageMode.Dynamic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[SlippageMode.Fixed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr3;
        }
    }

    /* JADX INFO: renamed from: o.iuK$TaskDescription */
    public static final class TaskDescription implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            return this.EZpvd;
        }
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTrackingSettingsClickCallback(yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yho) {
        this.AEQbTJ = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC25317iuT interfaceC25317iuT) {
        if (interfaceC25317iuT != null) {
            this.valueOf = interfaceC25317iuT;
        }
    }

    private final kMM values() {
        return (kMM) this.OLrzqt.getValue();
    }

    public static final kMM AkhnZx(final C25308iuK c25308iuK) {
        C25304iuG c25304iuG = new C25304iuG(new Function2() { // from class: o.iuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C25308iuK.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C25302iuE) obj2);
            }
        });
        kMM kmm = new kMM();
        kmm.register(C25302iuE.class, c25304iuG);
        return kmm;
    }

    /* JADX INFO: renamed from: o.iuK$ActionBar */
    public static final class ActionBar implements android.text.TextWatcher {
        public final /* synthetic */ C55008xbo AEQbTJ;
        public final /* synthetic */ C25308iuK OLrzqt;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public ActionBar(C55008xbo c55008xbo, C25308iuK c25308iuK) {
            this.AEQbTJ = c55008xbo;
            this.OLrzqt = c25308iuK;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            DynamicParam dynamicParamCopydefault;
            kotlin.Pair pairOLrzqt;
            DynamicParam dynamicParamCopydefault2;
            java.lang.String strCopydefault;
            DynamicParam dynamicParamCopydefault3;
            DynamicParam dynamicParamCopydefault4;
            DynamicParam dynamicParamCopydefault5;
            DynamicParam dynamicParamCopydefault6;
            DynamicParam dynamicParamCopydefault7;
            C55001xbh c55001xbhAkhnZx = this.AEQbTJ.AkhnZx();
            java.lang.String strAEQbTJ = null;
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null);
            java.lang.String strDivCheckS$default = C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt) ? C23313hvq.divCheckS$default(strGEmmrt, 100, null, null, null, 14, null) : "";
            SlippageViewParam slippageViewParam = this.OLrzqt.djBIcL;
            java.lang.String strEZpvd = (slippageViewParam == null || (dynamicParamCopydefault7 = slippageViewParam.copydefault()) == null) ? null : dynamicParamCopydefault7.EZpvd();
            SlippageViewParam slippageViewParam2 = this.OLrzqt.djBIcL;
            java.lang.String strKWHzl = (slippageViewParam2 == null || (dynamicParamCopydefault6 = slippageViewParam2.copydefault()) == null) ? null : dynamicParamCopydefault6.KWHzl();
            SlippageViewParam slippageViewParam3 = this.OLrzqt.djBIcL;
            java.lang.String strAEQbTJ2 = (slippageViewParam3 == null || (dynamicParamCopydefault5 = slippageViewParam3.copydefault()) == null) ? null : dynamicParamCopydefault5.AEQbTJ();
            if (strAEQbTJ2 == null) {
                strAEQbTJ2 = "";
            }
            SlippageViewParam slippageViewParam4 = this.OLrzqt.djBIcL;
            java.lang.String strKWHzl2 = C31256lqb.KWHzl((slippageViewParam4 == null || (dynamicParamCopydefault4 = slippageViewParam4.copydefault()) == null) ? null : dynamicParamCopydefault4.gEmmrt(), new TaskDescription(strAEQbTJ2));
            InterfaceC25317iuT interfaceC25317iuT = this.OLrzqt.valueOf;
            if (interfaceC25317iuT == null || !interfaceC25317iuT.AEQbTJ()) {
                InterfaceC25317iuT interfaceC25317iuT2 = this.OLrzqt.valueOf;
                if (interfaceC25317iuT2 != null) {
                    C25308iuK c25308iuK = this.OLrzqt;
                    C55008xbo c55008xbo = this.AEQbTJ;
                    hFZ hfz = c25308iuK.copydefault;
                    Intrinsics.copydefault(hfz);
                    AppCompatTextView appCompatTextView = hfz.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    SlippageViewParam slippageViewParam5 = this.OLrzqt.djBIcL;
                    DynamicParam dynamicParamCopydefault8 = slippageViewParam5 != null ? slippageViewParam5.copydefault() : null;
                    Intrinsics.copydefault(dynamicParamCopydefault8);
                    interfaceC25317iuT2.copydefault(strDivCheckS$default, c25308iuK, c55008xbo, appCompatTextView, dynamicParamCopydefault8);
                }
            } else {
                if (strDivCheckS$default.length() == 0) {
                    pairOLrzqt = C56390yDp.OLrzqt(InputStatus.NORMAL, "");
                } else if (C23313hvq.KWHzl(strDivCheckS$default, strEZpvd)) {
                    pairOLrzqt = C56390yDp.OLrzqt(InputStatus.ERROR, C33069mpW.copydefault(C23274hvD.Fragment.setCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strEZpvd == null ? "" : strEZpvd, false, 0, 0, null, null, 31, null)))));
                } else if (C23313hvq.OLrzqt(strDivCheckS$default, strKWHzl)) {
                    SlippageViewParam slippageViewParam6 = this.OLrzqt.djBIcL;
                    if (slippageViewParam6 != null && (dynamicParamCopydefault3 = slippageViewParam6.copydefault()) != null && dynamicParamCopydefault3.fetchVPNInfo()) {
                        strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.setMetadata, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strKWHzl == null ? "" : strKWHzl, false, 0, 0, null, null, 31, null))));
                    } else {
                        strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.setActive, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strKWHzl == null ? "" : strKWHzl, false, 0, 0, null, null, 31, null))));
                    }
                    pairOLrzqt = C56390yDp.OLrzqt(InputStatus.ERROR, strCopydefault);
                } else if (C23313hvq.KWHzl(strDivCheckS$default, strKWHzl2)) {
                    pairOLrzqt = C56390yDp.OLrzqt(InputStatus.WARNING, C33069mpW.copydefault(C23274hvD.Fragment.setQueue, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strKWHzl2 == null ? "" : strKWHzl2, false, 0, 0, null, null, 31, null)))));
                } else {
                    InputStatus inputStatus = InputStatus.NORMAL;
                    SlippageViewParam slippageViewParam7 = this.OLrzqt.djBIcL;
                    pairOLrzqt = C56390yDp.OLrzqt(inputStatus, Intrinsics.EZpvd((java.lang.Object) ((slippageViewParam7 == null || (dynamicParamCopydefault2 = slippageViewParam7.copydefault()) == null) ? null : dynamicParamCopydefault2.OLrzqt()), (java.lang.Object) MemeTransactionSceneType.Limit.getValue()) ? C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.registerCallbackListener, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strDivCheckS$default, false, 0, 0, null, null, 31, null)))) : "");
                }
                C25308iuK.setInputStatus$default(this.OLrzqt, (InputStatus) pairOLrzqt.component1(), this.AEQbTJ, (java.lang.String) pairOLrzqt.component2(), false, 8, null);
            }
            InterfaceC25317iuT interfaceC25317iuT3 = this.OLrzqt.valueOf;
            if (interfaceC25317iuT3 != null) {
                SlippageViewParam slippageViewParam8 = this.OLrzqt.djBIcL;
                if (slippageViewParam8 != null && (dynamicParamCopydefault = slippageViewParam8.copydefault()) != null) {
                    strAEQbTJ = dynamicParamCopydefault.AEQbTJ();
                }
                interfaceC25317iuT3.EZpvd(new C25301iuD(strAEQbTJ, strDivCheckS$default, null, this.OLrzqt.AhwBna, SlippageMode.Dynamic, 4, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.iuK$Application */
    public static final class Application implements android.text.TextWatcher {
        public final /* synthetic */ C55008xbo AEQbTJ;
        public final /* synthetic */ C25308iuK EZpvd;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Application(C55008xbo c55008xbo, C25308iuK c25308iuK) {
            this.AEQbTJ = c55008xbo;
            this.EZpvd = c25308iuK;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.iuT.StateListAnimator.onFixedTextChanged$default(o.iuT, java.lang.String, o.iuK, o.xbo, androidx.appcompat.widget.AppCompatTextView, com.okinc.business.dexui.main.swap.widget.slippage.FixedParam, boolean, int, java.lang.Object):void */
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C55001xbh c55001xbhAkhnZx = this.AEQbTJ.AkhnZx();
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null);
            java.lang.String strDivCheckS$default = C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt) ? C23313hvq.divCheckS$default(strGEmmrt, 100, null, null, null, 14, null) : "";
            InterfaceC25317iuT interfaceC25317iuT = this.EZpvd.valueOf;
            if (interfaceC25317iuT != null) {
                C25308iuK c25308iuK = this.EZpvd;
                C55008xbo c55008xbo = this.AEQbTJ;
                hFZ hfz = c25308iuK.copydefault;
                Intrinsics.copydefault(hfz);
                AppCompatTextView appCompatTextView = hfz.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                SlippageViewParam slippageViewParam = this.EZpvd.djBIcL;
                FixedParam fixedParamEZpvd = slippageViewParam != null ? slippageViewParam.EZpvd() : null;
                Intrinsics.copydefault(fixedParamEZpvd);
                InterfaceC25317iuT.StateListAnimator.onFixedTextChanged$default(interfaceC25317iuT, strDivCheckS$default, c25308iuK, c55008xbo, appCompatTextView, fixedParamEZpvd, false, 32, null);
            }
            InterfaceC25317iuT interfaceC25317iuT2 = this.EZpvd.valueOf;
            if (interfaceC25317iuT2 != null) {
                interfaceC25317iuT2.EZpvd(new C25301iuD(strDivCheckS$default, null, SlippageFeeType.SlippageCustom, this.EZpvd.AhwBna, SlippageMode.Fixed));
            }
        }
    }

    public static final Unit AEQbTJ(C25308iuK c25308iuK, int i, C25302iuE c25302iuE) {
        Intrinsics.checkNotNullParameter(c25302iuE, "");
        c25308iuK.EZpvd(i);
        return Unit.INSTANCE;
    }

    private final kMM AuCTel() {
        return (kMM) this.AYXKKw.getValue();
    }

    public static final kMM fetchVPNInfo(final C25308iuK c25308iuK) {
        C25300iuC c25300iuC = new C25300iuC(new Function2() { // from class: o.iuV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C25308iuK.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue(), (C25303iuF) obj2);
            }
        });
        kMM kmm = new kMM();
        kmm.register(C25303iuF.class, c25300iuC);
        return kmm;
    }

    public static final Unit OLrzqt(C25308iuK c25308iuK, int i, C25303iuF c25303iuF) {
        Intrinsics.checkNotNullParameter(c25303iuF, "");
        c25308iuK.KWHzl(i, c25303iuF);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25308iuK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = InputStatus.NORMAL;
        this.gEmmrt = new java.util.ArrayList<>();
        this.EZpvd = new java.util.ArrayList<>();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iuP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25308iuK.AkhnZx(this.KWHzl);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.iuO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25308iuK.fetchVPNInfo(this.copydefault);
            }
        });
        AYXKKw();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25308iuK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25308iuK(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void AYXKKw() {
        C55320xhi c55320xhi;
        RecyclerView recyclerView;
        hFZ hfzOLrzqt = hFZ.OLrzqt(android.view.LayoutInflater.from(getContext()), this, true);
        this.copydefault = hfzOLrzqt;
        if (hfzOLrzqt != null && (recyclerView = hfzOLrzqt.AhwBna) != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
            recyclerView.addItemDecoration(new C33599mzW(3, C55298xhM.dpInt$default(8.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, false));
            recyclerView.setAdapter(values());
        }
        hFZ hfz = this.copydefault;
        if (hfz != null && (c55320xhi = hfz.AkhnZx) != null) {
            c55320xhi.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.setQueueTitle));
        }
        AhwBna();
        valueOf();
        gEmmrt();
    }

    public final void gEmmrt() {
        this.gEmmrt.add(new C25303iuF(true, AkhnZx(), SlippageMode.Dynamic));
        this.gEmmrt.add(new C25303iuF(false, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompat3), SlippageMode.Fixed));
    }

    public final void setLabelTextAppearance(C55008xbo c55008xbo, @androidx.annotation.StyleRes int i) {
        android.view.View viewIwGUEr = c55008xbo.iwGUEr();
        if (viewIwGUEr instanceof android.widget.TextView) {
            TextViewCompat.setTextAppearance((android.widget.TextView) viewIwGUEr, i);
        } else if (viewIwGUEr instanceof C55258xgZ) {
            ((C55258xgZ) viewIwGUEr).setTextAppearance(i);
        }
    }

    public final void setLabelTextColor(C55008xbo c55008xbo, @androidx.annotation.ColorInt int i) {
        android.view.View viewIwGUEr = c55008xbo.iwGUEr();
        if (viewIwGUEr instanceof android.widget.TextView) {
            ((android.widget.TextView) viewIwGUEr).setTextColor(i);
        } else if (viewIwGUEr instanceof C55258xgZ) {
            ((C55258xgZ) viewIwGUEr).setTextColor(i);
        }
    }

    public final void AhwBna() {
        final C55008xbo c55008xbo;
        final C55008xbo c55008xbo2;
        C54957xaq c54957xaqAEQbTJ;
        C55001xbh c55001xbh;
        hFZ hfz = this.copydefault;
        if (hfz != null && (c55008xbo2 = hfz.OLrzqt) != null) {
            C55001xbh c55001xbhAkhnZx = c55008xbo2.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.setMaxDecimalValue(2);
                c55001xbhAkhnZx.setShowThousandsSeparator(true);
                c55001xbhAkhnZx.setContentDescription("web3_dex_slippage_custom_input");
                c55001xbhAkhnZx.setImeOptions(6);
            }
            android.widget.LinearLayout linearLayoutAuCTel = c55008xbo2.AuCTel();
            if (linearLayoutAuCTel != null) {
                linearLayoutAuCTel.setMinimumWidth(0);
            }
            c55008xbo2.setLabelText(C33070mpX.AYXKKw(C23274hvD.Fragment.DsrFlB));
            c55008xbo2.setTitleType(0);
            setLabelTextAppearance(c55008xbo2, C52761wXj.LoaderManager.KWHzl);
            setLabelTextColor(c55008xbo2, ContextCompat.getColor(c55008xbo2.getContext(), C52761wXj.Activity.UlJrfe));
            C55009xbp c55009xbpFIwbmz = c55008xbo2.fIwbmz();
            if (c55009xbpFIwbmz != null && (c54957xaqAEQbTJ = c55009xbpFIwbmz.AEQbTJ()) != null && (c55001xbh = c54957xaqAEQbTJ.AEQbTJ) != null) {
                c55001xbh.setText("");
            }
            android.view.View view$default = getView$default(this, false, 1, null);
            C55009xbp c55009xbpFIwbmz2 = c55008xbo2.fIwbmz();
            if (c55009xbpFIwbmz2 != null) {
                c55009xbpFIwbmz2.EZpvd(view$default);
            }
            C55001xbh c55001xbhAkhnZx2 = c55008xbo2.AkhnZx();
            if (c55001xbhAkhnZx2 != null) {
                c55001xbhAkhnZx2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.iuS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(android.view.View view, boolean z) {
                        C25308iuK.EZpvd(this.OLrzqt, c55008xbo2, view, z);
                    }
                });
            }
            C55001xbh c55001xbhAkhnZx3 = c55008xbo2.AkhnZx();
            if (c55001xbhAkhnZx3 != null) {
                c55001xbhAkhnZx3.addTextChangedListener(new ActionBar(c55008xbo2, this));
            }
        }
        hFZ hfz2 = this.copydefault;
        if (hfz2 == null || (c55008xbo = hfz2.EZpvd) == null) {
            return;
        }
        android.view.View view$default2 = getView$default(this, false, 1, null);
        C55009xbp c55009xbpFIwbmz3 = c55008xbo.fIwbmz();
        if (c55009xbpFIwbmz3 != null) {
            c55009xbpFIwbmz3.EZpvd(view$default2);
        }
        C55001xbh c55001xbhAkhnZx4 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx4 != null) {
            c55001xbhAkhnZx4.setMaxDecimalValue(2);
            c55001xbhAkhnZx4.setShowThousandsSeparator(true);
            c55001xbhAkhnZx4.setContentDescription("web3_dex_slippage_custom_input");
            c55001xbhAkhnZx4.setImeOptions(6);
        }
        C55001xbh c55001xbhAkhnZx5 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx5 != null) {
            c55001xbhAkhnZx5.addTextChangedListener(new Application(c55008xbo, this));
        }
        C55001xbh c55001xbhAkhnZx6 = c55008xbo.AkhnZx();
        if (c55001xbhAkhnZx6 != null) {
            c55001xbhAkhnZx6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.iuR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C25308iuK.copydefault(this.copydefault, c55008xbo, view, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.iuK$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C25308iuK copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25308iuK c25308iuK) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c25308iuK;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                yHO yho = this.copydefault.AEQbTJ;
                if (yho != null) {
                    yho.invoke("slippage_explain", DexTrackEventParameter.ButtonType.EXPLAIN.getValue(), C56424yEw.KWHzl());
                }
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.KWHzl(this.copydefault.ejfBZ());
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.ihnvzI, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.iuK$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ hFZ AEQbTJ;
        public final /* synthetic */ C25308iuK KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C25308iuK c25308iuK, hFZ hfz) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c25308iuK;
            this.AEQbTJ = hfz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C54997xbd c54997xbd = this.KWHzl.KWHzl;
                if (c54997xbd != null && c54997xbd.isShowing()) {
                    C54997xbd c54997xbd2 = this.KWHzl.KWHzl;
                    if (c54997xbd2 != null) {
                        c54997xbd2.dismiss();
                        return;
                    }
                    return;
                }
                this.AEQbTJ.KWHzl.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
                this.KWHzl.fetchVPNInfo();
                this.KWHzl.KWHzl();
            }
        }
    }

    public static final void EZpvd(C25308iuK c25308iuK, C55008xbo c55008xbo, android.view.View view, boolean z) {
        AppCompatTextView appCompatTextView;
        c25308iuK.setLabelTextColor(c55008xbo, ContextCompat.getColor(c55008xbo.getContext(), z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
        InputStatus inputStatus = c25308iuK.AhwBna;
        hFZ hfz = c25308iuK.copydefault;
        setInputStatus$default(c25308iuK, inputStatus, c55008xbo, C33129mqd.gEmmrt((hfz == null || (appCompatTextView = hfz.gEmmrt) == null) ? null : appCompatTextView.getText()), false, 8, null);
    }

    public static final void copydefault(C25308iuK c25308iuK, C55008xbo c55008xbo, android.view.View view, boolean z) {
        java.lang.String strGEmmrt;
        AppCompatTextView appCompatTextView;
        FixedParam fixedParamEZpvd;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        java.lang.CharSequence text = null;
        if (z) {
            int i = StateListAnimator.EZpvd[c25308iuK.AhwBna.ordinal()];
            if (i == 1) {
                setWarningStyle$default(c25308iuK, c55008xbo, null, false, 6, null);
            } else if (i == 2) {
                setErrorStyle$default(c25308iuK, c55008xbo, null, false, 6, null);
            } else {
                setNormalBgStyle$default(c25308iuK, c55008xbo, null, 2, null);
            }
            hFZ hfz = c25308iuK.copydefault;
            if (hfz != null && (appCompatTextView3 = hfz.valueOf) != null) {
                appCompatTextView3.setVisibility(8);
            }
            int i2 = 0;
            for (java.lang.Object obj : c25308iuK.EZpvd) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                ((C25302iuE) obj).KWHzl(false);
                i2++;
            }
            c25308iuK.values().setItems(c25308iuK.EZpvd);
            c25308iuK.values().notifyDataSetChanged();
            c25308iuK.copydefault();
        }
        InterfaceC25317iuT interfaceC25317iuT = c25308iuK.valueOf;
        if (interfaceC25317iuT != null) {
            hFZ hfz2 = c25308iuK.copydefault;
            Intrinsics.copydefault(hfz2);
            AppCompatTextView appCompatTextView4 = hfz2.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView4, "");
            SlippageViewParam slippageViewParam = c25308iuK.djBIcL;
            FixedParam fixedParamEZpvd2 = slippageViewParam != null ? slippageViewParam.EZpvd() : null;
            Intrinsics.copydefault(fixedParamEZpvd2);
            interfaceC25317iuT.KWHzl(z, c25308iuK, c55008xbo, appCompatTextView4, fixedParamEZpvd2);
        }
        C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
        java.lang.String strIsConnected = c55001xbhAkhnZx != null ? c55001xbhAkhnZx.isConnected() : null;
        if (strIsConnected == null || strIsConnected.length() == 0) {
            if (z) {
                InputStatus inputStatus = InputStatus.NO_DATA;
                SlippageViewParam slippageViewParam2 = c25308iuK.djBIcL;
                if (Intrinsics.EZpvd((java.lang.Object) ((slippageViewParam2 == null || (fixedParamEZpvd = slippageViewParam2.EZpvd()) == null) ? null : fixedParamEZpvd.djBIcL()), (java.lang.Object) "7")) {
                    hFZ hfz3 = c25308iuK.copydefault;
                    if (hfz3 != null && (appCompatTextView = hfz3.gEmmrt) != null) {
                        text = appCompatTextView.getText();
                    }
                    strGEmmrt = C33129mqd.gEmmrt(text);
                } else {
                    strGEmmrt = "";
                }
                setInputStatus$default(c25308iuK, inputStatus, c55008xbo, strGEmmrt, false, 8, null);
            } else {
                setInputStatus$default(c25308iuK, InputStatus.ERROR, c55008xbo, C33070mpX.AYXKKw(C23274hvD.Fragment.previous), false, 8, null);
            }
            InterfaceC25317iuT interfaceC25317iuT2 = c25308iuK.valueOf;
            if (interfaceC25317iuT2 != null) {
                interfaceC25317iuT2.EZpvd(new C25301iuD("", null, SlippageFeeType.SlippageCustom, InputStatus.NO_DATA, SlippageMode.Fixed));
                return;
            }
            return;
        }
        InputStatus inputStatus2 = c25308iuK.AhwBna;
        hFZ hfz4 = c25308iuK.copydefault;
        if (hfz4 != null && (appCompatTextView2 = hfz4.gEmmrt) != null) {
            text = appCompatTextView2.getText();
        }
        setInputStatus$default(c25308iuK, inputStatus2, c55008xbo, C33129mqd.gEmmrt(text), false, 8, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        super.onAttachedToWindow();
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        if (activityOLrzqt == null || (lifecycleOwner = ViewTreeLifecycleOwner.get(this)) == null) {
            return;
        }
        C59541ziw.EZpvd(activityOLrzqt, lifecycleOwner, new InterfaceC59496ziD() { // from class: o.iuM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C25308iuK.KWHzl(this.KWHzl, z);
            }
        });
    }

    public static final void KWHzl(C25308iuK c25308iuK, boolean z) {
        C55008xbo c55008xbo;
        C55008xbo c55008xbo2;
        hFZ hfz = c25308iuK.copydefault;
        C55001xbh c55001xbhAkhnZx = null;
        C55001xbh c55001xbhAkhnZx2 = (hfz == null || (c55008xbo2 = hfz.EZpvd) == null) ? null : c55008xbo2.AkhnZx();
        hFZ hfz2 = c25308iuK.copydefault;
        if (hfz2 != null && (c55008xbo = hfz2.OLrzqt) != null) {
            c55001xbhAkhnZx = c55008xbo.AkhnZx();
        }
        if (z) {
            if ((c55001xbhAkhnZx2 == null || !c55001xbhAkhnZx2.hasFocus()) && (c55001xbhAkhnZx == null || !c55001xbhAkhnZx.hasFocus())) {
                return;
            }
            c25308iuK.copydefault();
            return;
        }
        if (c55001xbhAkhnZx2 != null && c55001xbhAkhnZx2.hasFocus()) {
            c55001xbhAkhnZx2.clearFocus();
        }
        if (c55001xbhAkhnZx == null || !c55001xbhAkhnZx.hasFocus()) {
            return;
        }
        c55001xbhAkhnZx.clearFocus();
    }

    public final void copydefault() {
        final AppCompatTextView appCompatTextView;
        hFZ hfz = this.copydefault;
        if (hfz == null || (appCompatTextView = hfz.gEmmrt) == null) {
            return;
        }
        appCompatTextView.post(new java.lang.Runnable() { // from class: o.iuJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25308iuK.KWHzl(appCompatTextView);
            }
        });
    }

    public static final void KWHzl(AppCompatTextView appCompatTextView) {
        appCompatTextView.requestRectangleOnScreen(new android.graphics.Rect(0, 0, appCompatTextView.getWidth(), appCompatTextView.getHeight()), true);
    }

    public final void valueOf() {
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            C55320xhi c55320xhi = hfz.AkhnZx;
            c55320xhi.setOnClickListener(new Activity(c55320xhi, 1000L, this));
            android.widget.LinearLayout linearLayout = hfz.AEQbTJ;
            linearLayout.setOnClickListener(new Dialog(linearLayout, 1000L, this, hfz));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int ejfBZ() {
        SlippageViewParam slippageViewParam = this.djBIcL;
        TradeMode tradeModeOLrzqt = slippageViewParam != null ? slippageViewParam.OLrzqt() : null;
        return (tradeModeOLrzqt != null && StateListAnimator.AEQbTJ[tradeModeOLrzqt.ordinal()] == 1) ? C23274hvD.Activity.OcIXYQ : C23274hvD.Activity.DjwCMv;
    }

    public final void KWHzl() {
        C55001xbh c55001xbhAkhnZx;
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            SlippageViewParam slippageViewParam = this.djBIcL;
            if ((slippageViewParam != null ? slippageViewParam.AEQbTJ() : null) == SlippageMode.Dynamic) {
                c55001xbhAkhnZx = hfz.OLrzqt.AkhnZx();
            } else {
                c55001xbhAkhnZx = hfz.EZpvd.AkhnZx();
            }
            C33054mpH.OLrzqt(context, c55001xbhAkhnZx);
        }
    }

    public static /* synthetic */ void setInputStatus$default(C25308iuK c25308iuK, InputStatus inputStatus, C55008xbo c55008xbo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c25308iuK.setInputStatus(inputStatus, c55008xbo, str, z);
    }

    public final void setInputStatus(@NotNull InputStatus inputStatus, C55008xbo c55008xbo, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(inputStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = inputStatus;
        if (this.copydefault != null) {
            int i = StateListAnimator.EZpvd[inputStatus.ordinal()];
            if (i == 1) {
                setWarningStyle(c55008xbo, str, z);
                return;
            }
            if (i == 2) {
                setErrorStyle(c55008xbo, str, z);
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                setNormalBgStyle(c55008xbo, str);
            }
        }
    }

    public final void KWHzl(int i, C25303iuF c25303iuF) {
        java.lang.String str;
        SlippageViewParam slippageViewParam = this.djBIcL;
        if (slippageViewParam != null) {
            slippageViewParam.EZpvd(c25303iuF.OLrzqt());
        }
        C54997xbd c54997xbd = this.KWHzl;
        if (c54997xbd != null) {
            c54997xbd.dismiss();
        }
        djBIcL();
        isConnected();
        setSelectModeTitle();
        java.util.Iterator<T> it = this.gEmmrt.iterator();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            C25303iuF c25303iuF2 = (C25303iuF) next;
            if (i2 != i) {
                z = false;
            }
            c25303iuF2.EZpvd(z);
            i2++;
        }
        int i3 = StateListAnimator.copydefault[c25303iuF.OLrzqt().ordinal()];
        if (i3 == 1) {
            str = "slippage_dynamic";
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "slippage_fixed";
        }
        yHO<? super java.lang.String, ? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, Unit> yho = this.AEQbTJ;
        if (yho != null) {
            yho.invoke(str, DexTrackEventParameter.ButtonType.TRADE.getValue(), C56424yEw.KWHzl());
        }
    }

    public final void djBIcL() {
        FixedParam fixedParamEZpvd;
        DynamicParam dynamicParamCopydefault;
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            SlippageViewParam slippageViewParam = this.djBIcL;
            if (slippageViewParam != null && (dynamicParamCopydefault = slippageViewParam.copydefault()) != null) {
                dynamicParamCopydefault.copydefault("");
            }
            SlippageViewParam slippageViewParam2 = this.djBIcL;
            if (slippageViewParam2 != null && (fixedParamEZpvd = slippageViewParam2.EZpvd()) != null) {
                fixedParamEZpvd.copydefault("");
            }
            hfz.OLrzqt.setText("");
            hfz.EZpvd.setText("");
        }
        SlippageViewParam slippageViewParam3 = this.djBIcL;
        if (slippageViewParam3 != null) {
            setData(slippageViewParam3);
            setListener(this.valueOf);
        }
    }

    public final void EZpvd(int i) {
        InterfaceC25317iuT interfaceC25317iuT;
        FixedParam fixedParamEZpvd;
        java.util.List<java.lang.String> listAhwBna;
        KWHzl();
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            SlippageFeeType slippageFeeTypeAEQbTJ = AEQbTJ(i);
            hfz.EZpvd.setText("");
            C55001xbh c55001xbhAkhnZx = hfz.EZpvd.AkhnZx();
            if (c55001xbhAkhnZx != null) {
                c55001xbhAkhnZx.clearFocus();
            }
            int i2 = 0;
            for (java.lang.Object obj : this.EZpvd) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                ((C25302iuE) obj).KWHzl(i2 == i);
                i2++;
            }
            values().setItems(this.EZpvd);
            values().notifyDataSetChanged();
            SlippageViewParam slippageViewParam = this.djBIcL;
            java.lang.String str = (slippageViewParam == null || (fixedParamEZpvd = slippageViewParam.EZpvd()) == null || (listAhwBna = fixedParamEZpvd.AhwBna()) == null) ? null : listAhwBna.get(i);
            if (str == null) {
                str = "";
            }
            hFZ hfz2 = this.copydefault;
            if (hfz2 != null && (interfaceC25317iuT = this.valueOf) != null) {
                C55008xbo c55008xbo = hfz2.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c55008xbo, "");
                AppCompatTextView appCompatTextView = hfz2.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                SlippageViewParam slippageViewParam2 = this.djBIcL;
                FixedParam fixedParamEZpvd2 = slippageViewParam2 != null ? slippageViewParam2.EZpvd() : null;
                Intrinsics.copydefault(fixedParamEZpvd2);
                interfaceC25317iuT.KWHzl(str, this, c55008xbo, appCompatTextView, fixedParamEZpvd2, true);
            }
            InterfaceC25317iuT interfaceC25317iuT2 = this.valueOf;
            if (interfaceC25317iuT2 != null) {
                interfaceC25317iuT2.EZpvd(new C25301iuD(str, null, slippageFeeTypeAEQbTJ, this.AhwBna, SlippageMode.Fixed));
            }
        }
    }

    public final void fetchVPNInfo() {
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C54997xbd c54997xbd = new C54997xbd(context, null, 0, 0, 14, null);
        c54997xbd.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.iuH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C25308iuK.isConnected(this.KWHzl);
            }
        });
        c54997xbd.EZpvd(android.view.LayoutInflater.from(c54997xbd.copydefault()).inflate(C23274hvD.Activity.putInt, (android.view.ViewGroup) this, false));
        this.KWHzl = c54997xbd;
        android.view.View viewKWHzl = c54997xbd.KWHzl();
        if (viewKWHzl != null && (recyclerView = (RecyclerView) viewKWHzl.findViewById(C23274hvD.Application.getState)) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(AuCTel());
            AuCTel().setItems(this.gEmmrt);
            AuCTel().notifyDataSetChanged();
        }
        C54997xbd c54997xbd2 = this.KWHzl;
        if (c54997xbd2 != null) {
            hFZ hfz = this.copydefault;
            c54997xbd2.showAsDropDown(hfz != null ? hfz.isConnected : null);
        }
        hFZ hfz2 = this.copydefault;
        if (hfz2 == null || (appCompatTextView = hfz2.isConnected) == null) {
            return;
        }
        appCompatTextView.setSelected(true);
    }

    public static final void isConnected(C25308iuK c25308iuK) {
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        hFZ hfz = c25308iuK.copydefault;
        if (hfz != null && (appCompatTextView = hfz.isConnected) != null) {
            appCompatTextView.setSelected(false);
        }
        hFZ hfz2 = c25308iuK.copydefault;
        if (hfz2 == null || (appCompatImageView = hfz2.KWHzl) == null) {
            return;
        }
        appCompatImageView.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void isConnected() {
        DynamicParam dynamicParamCopydefault;
        C55008xbo c55008xbo;
        C55001xbh c55001xbhAkhnZx;
        DynamicParam dynamicParamCopydefault2;
        java.lang.String strCopydefault;
        DynamicParam dynamicParamCopydefault3;
        java.lang.String strAhwBna;
        java.lang.String strMulCheckS$default;
        DynamicParam dynamicParamCopydefault4;
        java.lang.String strDjBIcL;
        java.lang.String strMulCheckS$default2;
        DynamicParam dynamicParamCopydefault5;
        java.lang.Object next;
        java.lang.String strCopydefault2;
        InterfaceC25317iuT interfaceC25317iuT;
        java.lang.Object next2;
        boolean z;
        FixedParam fixedParamEZpvd;
        FixedParam fixedParamEZpvd2;
        FixedParam fixedParamEZpvd3;
        java.lang.String strMulS$default;
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            SlippageViewParam slippageViewParam = this.djBIcL;
            SlippageMode slippageModeAEQbTJ = slippageViewParam != null ? slippageViewParam.AEQbTJ() : null;
            int i = slippageModeAEQbTJ == null ? -1 : StateListAnimator.copydefault[slippageModeAEQbTJ.ordinal()];
            if (i == 1) {
                setNormalBgStyle$default(this, hfz.OLrzqt, null, 2, null);
                C55008xbo c55008xbo2 = hfz.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c55008xbo2, "");
                SlippageViewParam slippageViewParam2 = this.djBIcL;
                c55008xbo2.setVisibility((slippageViewParam2 == null || (dynamicParamCopydefault5 = slippageViewParam2.copydefault()) == null || !dynamicParamCopydefault5.AkhnZx()) ? 8 : 0);
                int i2 = C23274hvD.Fragment.setPlaybackToRemote;
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                SlippageViewParam slippageViewParam3 = this.djBIcL;
                java.lang.String localized$default = (slippageViewParam3 == null || (dynamicParamCopydefault4 = slippageViewParam3.copydefault()) == null || (strDjBIcL = dynamicParamCopydefault4.djBIcL()) == null || (strMulCheckS$default2 = C23313hvq.mulCheckS$default(strDjBIcL, 100, null, null, null, 14, null)) == null) ? null : pTB.formatLocalized$default(strMulCheckS$default2, null, 1, null);
                if (localized$default == null) {
                    localized$default = "";
                }
                pairArr[0] = C56390yDp.OLrzqt("num1", localized$default);
                SlippageViewParam slippageViewParam4 = this.djBIcL;
                java.lang.String localized$default2 = (slippageViewParam4 == null || (dynamicParamCopydefault3 = slippageViewParam4.copydefault()) == null || (strAhwBna = dynamicParamCopydefault3.AhwBna()) == null || (strMulCheckS$default = C23313hvq.mulCheckS$default(strAhwBna, 100, null, null, null, 14, null)) == null) ? null : pTB.formatLocalized$default(strMulCheckS$default, null, 1, null);
                if (localized$default2 == null) {
                    localized$default2 = "";
                }
                pairArr[1] = C56390yDp.OLrzqt("num2", localized$default2);
                hfz.OLrzqt.setHintText(C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr)));
                SlippageViewParam slippageViewParam5 = this.djBIcL;
                if (slippageViewParam5 != null && (dynamicParamCopydefault2 = slippageViewParam5.copydefault()) != null && (strCopydefault = dynamicParamCopydefault2.copydefault()) != null) {
                    hfz.OLrzqt.setText(C33129mqd.OLrzqt((java.lang.CharSequence) strCopydefault) ? pTB.formatLocalized$default(C23313hvq.mulCheckS$default(strCopydefault, 100, null, null, null, 14, null), null, 1, null) : "");
                }
                android.widget.LinearLayout linearLayout = hfz.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                hFZ hfz2 = this.copydefault;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt((hfz2 == null || (c55008xbo = hfz2.OLrzqt) == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null) ? null : c55001xbhAkhnZx.isConnected());
                java.lang.String strDivCheckS$default = C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt) ? C23313hvq.divCheckS$default(strGEmmrt, 100, null, null, null, 14, null) : "";
                InterfaceC25317iuT interfaceC25317iuT2 = this.valueOf;
                if (interfaceC25317iuT2 != null) {
                    SlippageViewParam slippageViewParam6 = this.djBIcL;
                    if (slippageViewParam6 != null && (dynamicParamCopydefault = slippageViewParam6.copydefault()) != null) {
                        strAEQbTJ = dynamicParamCopydefault.AEQbTJ();
                    }
                    interfaceC25317iuT2.EZpvd(new C25301iuD(strAEQbTJ, strDivCheckS$default, null, this.AhwBna, SlippageMode.Dynamic, 4, null));
                    return;
                }
                return;
            }
            if (i != 2) {
                return;
            }
            C55008xbo c55008xbo3 = hfz.EZpvd;
            java.lang.String strOLrzqt = OLrzqt();
            java.lang.String localized$default3 = (strOLrzqt == null || (strMulS$default = C33129mqd.mulS$default(strOLrzqt, 100, null, null, null, 14, null)) == null) ? null : pTB.formatLocalized$default(strMulS$default, null, 1, null);
            c55008xbo3.setHintText(localized$default3 + " ~ " + pTB.formatLocalized$default(C33129mqd.mulS$default(DbNXlk(), 100, null, null, null, 14, null), null, 1, null));
            SlippageViewParam slippageViewParam7 = this.djBIcL;
            java.util.List<java.lang.String> listAhwBna = (slippageViewParam7 == null || (fixedParamEZpvd3 = slippageViewParam7.EZpvd()) == null) ? null : fixedParamEZpvd3.AhwBna();
            RecyclerView recyclerView = hfz.AhwBna;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            recyclerView.setVisibility(C33129mqd.KWHzl((java.util.Collection) listAhwBna) ? 0 : 8);
            this.EZpvd.clear();
            SlippageViewParam slippageViewParam8 = this.djBIcL;
            SlippageFeeType slippageFeeTypeValueOf = (slippageViewParam8 == null || (fixedParamEZpvd2 = slippageViewParam8.EZpvd()) == null) ? null : fixedParamEZpvd2.valueOf();
            SlippageViewParam slippageViewParam9 = this.djBIcL;
            java.lang.String strAEQbTJ = (slippageViewParam9 == null || (fixedParamEZpvd = slippageViewParam9.EZpvd()) == null) ? null : fixedParamEZpvd.AEQbTJ();
            if (listAhwBna != null) {
                int i3 = 0;
                for (java.lang.Object obj : listAhwBna) {
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    java.util.ArrayList<C25302iuE> arrayList = this.EZpvd;
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) || slippageFeeTypeValueOf != null) {
                        z = AEQbTJ(i3) == (slippageFeeTypeValueOf == null ? SlippageFeeType.SlippageLow : slippageFeeTypeValueOf);
                    }
                    arrayList.add(new C25302iuE(z, str));
                    i3++;
                }
            }
            values().setItems(this.EZpvd);
            values().notifyDataSetChanged();
            C55008xbo c55008xbo4 = hfz.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55008xbo4, "");
            c55008xbo4.setVisibility(8);
            android.widget.LinearLayout linearLayout2 = hfz.copydefault;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(0);
            if ((slippageFeeTypeValueOf == null || slippageFeeTypeValueOf == SlippageFeeType.SlippageCustom) && C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ)) {
                hfz.EZpvd.setText(strAEQbTJ != null ? C23313hvq.mulCheckS$default(strAEQbTJ, 100, null, null, null, 14, null) : null);
            } else {
                hFZ hfz3 = this.copydefault;
                if (hfz3 != null && (interfaceC25317iuT = this.valueOf) != null) {
                    java.util.Iterator<T> it = this.EZpvd.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = it.next();
                            if (((C25302iuE) next2).EZpvd()) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    C25302iuE c25302iuE = (C25302iuE) next2;
                    java.lang.String strCopydefault3 = c25302iuE != null ? c25302iuE.copydefault() : null;
                    if (strCopydefault3 == null) {
                        strCopydefault3 = "";
                    }
                    C55008xbo c55008xbo5 = hfz3.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c55008xbo5, "");
                    AppCompatTextView appCompatTextView = hfz3.gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                    SlippageViewParam slippageViewParam10 = this.djBIcL;
                    FixedParam fixedParamEZpvd4 = slippageViewParam10 != null ? slippageViewParam10.EZpvd() : null;
                    Intrinsics.copydefault(fixedParamEZpvd4);
                    interfaceC25317iuT.KWHzl(strCopydefault3, this, c55008xbo5, appCompatTextView, fixedParamEZpvd4, true);
                }
            }
            InterfaceC25317iuT interfaceC25317iuT3 = this.valueOf;
            if (interfaceC25317iuT3 != null) {
                if (slippageFeeTypeValueOf == SlippageFeeType.SlippageCustom) {
                    strCopydefault2 = strAEQbTJ;
                } else {
                    java.util.Iterator<T> it2 = this.EZpvd.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (((C25302iuE) next).EZpvd()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    C25302iuE c25302iuE2 = (C25302iuE) next;
                    strCopydefault2 = c25302iuE2 != null ? c25302iuE2.copydefault() : null;
                }
                interfaceC25317iuT3.EZpvd(new C25301iuD(strCopydefault2, null, slippageFeeTypeValueOf, this.AhwBna, SlippageMode.Fixed));
            }
        }
    }

    public final SlippageFeeType AEQbTJ(int i) {
        if (i == 0) {
            return SlippageFeeType.SlippageLow;
        }
        if (i == 1) {
            return SlippageFeeType.SlippageMid;
        }
        if (i == 2) {
            return SlippageFeeType.SlippageHigh;
        }
        return SlippageFeeType.SlippageCustom;
    }

    public final java.lang.String OLrzqt() {
        FixedParam fixedParamEZpvd;
        FixedParam fixedParamEZpvd2;
        FixedParam fixedParamEZpvd3;
        SlippageViewParam slippageViewParam = this.djBIcL;
        if (slippageViewParam == null || (fixedParamEZpvd2 = slippageViewParam.EZpvd()) == null || !fixedParamEZpvd2.AYXKKw()) {
            SlippageViewParam slippageViewParam2 = this.djBIcL;
            if (slippageViewParam2 != null && (fixedParamEZpvd = slippageViewParam2.EZpvd()) != null) {
                return fixedParamEZpvd.EZpvd();
            }
        } else {
            SlippageViewParam slippageViewParam3 = this.djBIcL;
            if (slippageViewParam3 != null && (fixedParamEZpvd3 = slippageViewParam3.EZpvd()) != null) {
                return fixedParamEZpvd3.KWHzl();
            }
        }
        return null;
    }

    private final java.lang.String DbNXlk() {
        FixedParam fixedParamEZpvd;
        FixedParam fixedParamEZpvd2;
        FixedParam fixedParamEZpvd3;
        SlippageViewParam slippageViewParam = this.djBIcL;
        if (slippageViewParam == null || (fixedParamEZpvd2 = slippageViewParam.EZpvd()) == null || !fixedParamEZpvd2.AYXKKw()) {
            SlippageViewParam slippageViewParam2 = this.djBIcL;
            if (slippageViewParam2 != null && (fixedParamEZpvd = slippageViewParam2.EZpvd()) != null) {
                return fixedParamEZpvd.copydefault();
            }
        } else {
            SlippageViewParam slippageViewParam3 = this.djBIcL;
            if (slippageViewParam3 != null && (fixedParamEZpvd3 = slippageViewParam3.EZpvd()) != null) {
                return fixedParamEZpvd3.OLrzqt();
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: byte */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setSelectModeTitle() {
        android.widget.LinearLayout linearLayout;
        DynamicParam dynamicParamCopydefault;
        AppCompatTextView appCompatTextView;
        java.lang.String strAkhnZx;
        DynamicParam dynamicParamCopydefault2;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView2;
        android.widget.LinearLayout linearLayout2;
        AppCompatTextView appCompatTextView3;
        android.widget.LinearLayout linearLayout3;
        android.widget.LinearLayout linearLayout4;
        AppCompatTextView appCompatTextView4;
        SlippageViewParam slippageViewParam = this.djBIcL;
        text = null;
        java.lang.CharSequence text = null;
        if (slippageViewParam == null) {
            hFZ hfz = this.copydefault;
            if (hfz != null && (appCompatTextView4 = hfz.isConnected) != null) {
                text = appCompatTextView4.getText();
            }
            java.lang.String strAkhnZx2 = AkhnZx();
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompat3);
            hFZ hfz2 = this.copydefault;
            if (hfz2 == null || (appCompatTextView3 = hfz2.isConnected) == null) {
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) text, (java.lang.Object) strAkhnZx2)) {
                hFZ hfz3 = this.copydefault;
                if (hfz3 != null && (linearLayout4 = hfz3.copydefault) != null) {
                    linearLayout4.setVisibility(0);
                }
                strAkhnZx2 = strAYXKKw;
            } else {
                hFZ hfz4 = this.copydefault;
                if (hfz4 != null && (linearLayout3 = hfz4.copydefault) != null) {
                    linearLayout3.setVisibility(8);
                }
            }
            appCompatTextView3.setText(strAkhnZx2);
            return;
        }
        if (slippageViewParam == null || (dynamicParamCopydefault2 = slippageViewParam.copydefault()) == null || !dynamicParamCopydefault2.isConnected()) {
            SlippageViewParam slippageViewParam2 = this.djBIcL;
            byte b = (slippageViewParam2 == null || (dynamicParamCopydefault = slippageViewParam2.copydefault()) == null || !dynamicParamCopydefault.values()) ? false : true;
            hFZ hfz5 = this.copydefault;
            if (hfz5 != null && (linearLayout = hfz5.AEQbTJ) != null) {
                linearLayout.setVisibility(b == true ? 0 : 8);
            }
        } else {
            hFZ hfz6 = this.copydefault;
            if (hfz6 != null && (linearLayout2 = hfz6.AEQbTJ) != null) {
                linearLayout2.setEnabled(false);
            }
            hFZ hfz7 = this.copydefault;
            if (hfz7 != null && (appCompatTextView2 = hfz7.isConnected) != null) {
                appCompatTextView2.setEnabled(false);
            }
            hFZ hfz8 = this.copydefault;
            if (hfz8 != null && (appCompatImageView = hfz8.KWHzl) != null) {
                appCompatImageView.setVisibility(8);
            }
        }
        hFZ hfz9 = this.copydefault;
        if (hfz9 == null || (appCompatTextView = hfz9.isConnected) == null) {
            return;
        }
        SlippageViewParam slippageViewParam3 = this.djBIcL;
        SlippageMode slippageModeAEQbTJ = slippageViewParam3 != null ? slippageViewParam3.AEQbTJ() : null;
        int i = slippageModeAEQbTJ == null ? -1 : StateListAnimator.copydefault[slippageModeAEQbTJ.ordinal()];
        if (i == 1) {
            strAkhnZx = AkhnZx();
        } else {
            strAkhnZx = i != 2 ? "" : C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompat3);
        }
        appCompatTextView.setText(strAkhnZx);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String AkhnZx() {
        boolean z;
        DynamicParam dynamicParamCopydefault;
        DynamicParam dynamicParamCopydefault2;
        DynamicParam dynamicParamCopydefault3;
        SlippageViewParam slippageViewParam = this.djBIcL;
        java.lang.String strGEmmrt = null;
        final java.lang.String strAEQbTJ = (slippageViewParam == null || (dynamicParamCopydefault3 = slippageViewParam.copydefault()) == null) ? null : dynamicParamCopydefault3.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        SlippageViewParam slippageViewParam2 = this.djBIcL;
        if (slippageViewParam2 != null && (dynamicParamCopydefault2 = slippageViewParam2.copydefault()) != null) {
            strGEmmrt = dynamicParamCopydefault2.gEmmrt();
        }
        java.lang.String strKWHzl = C31256lqb.KWHzl(strGEmmrt != null ? strGEmmrt : "", (Function0<java.lang.String>) new Function0() { // from class: o.iuU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25308iuK.OLrzqt(strAEQbTJ);
            }
        });
        SlippageViewParam slippageViewParam3 = this.djBIcL;
        if (slippageViewParam3 == null || (dynamicParamCopydefault = slippageViewParam3.copydefault()) == null) {
            z = false;
        } else {
            z = true;
            if (!dynamicParamCopydefault.AYXKKw()) {
            }
        }
        if (strKWHzl.length() == 0 || !z) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.setPlaybackToLocal);
        }
        return C33069mpW.copydefault(C23274hvD.Fragment.setPlaybackState, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C23311hvo.formatPercent$default(strKWHzl, false, 0, 0, null, null, 31, null))));
    }

    public final void setData(@NotNull SlippageViewParam slippageViewParam) {
        Intrinsics.checkNotNullParameter(slippageViewParam, "");
        this.djBIcL = slippageViewParam;
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            this.AhwBna = InputStatus.NORMAL;
            setSelectModeTitle();
            this.gEmmrt.clear();
            java.util.ArrayList<C25303iuF> arrayList = this.gEmmrt;
            SlippageMode slippageModeAEQbTJ = slippageViewParam.AEQbTJ();
            SlippageMode slippageMode = SlippageMode.Dynamic;
            arrayList.add(new C25303iuF(slippageModeAEQbTJ == slippageMode, AkhnZx(), slippageMode));
            java.util.ArrayList<C25303iuF> arrayList2 = this.gEmmrt;
            SlippageMode slippageModeAEQbTJ2 = slippageViewParam.AEQbTJ();
            SlippageMode slippageMode2 = SlippageMode.Fixed;
            arrayList2.add(new C25303iuF(slippageModeAEQbTJ2 == slippageMode2, C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompat3), slippageMode2));
            AppCompatTextView appCompatTextView = hfz.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            isConnected();
        }
        invalidate();
    }

    public static /* synthetic */ void setNormalBgStyle$default(C25308iuK c25308iuK, C55008xbo c55008xbo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c25308iuK.setNormalBgStyle(c55008xbo, str);
    }

    public final void setNormalBgStyle(final C55008xbo c55008xbo, java.lang.String str) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        AppCompatTextView appCompatTextView4;
        C55001xbh c55001xbhAkhnZx;
        final int i = (c55008xbo == null || (c55001xbhAkhnZx = c55008xbo.AkhnZx()) == null || !c55001xbhAkhnZx.hasFocus()) ? C57406yhn.Activity.AYXKKw : C23274hvD.ActionBar.fARcdN;
        hFZ hfz = this.copydefault;
        if (hfz != null && (appCompatTextView4 = hfz.gEmmrt) != null) {
            appCompatTextView4.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        }
        hFZ hfz2 = this.copydefault;
        if (hfz2 != null && (appCompatTextView3 = hfz2.gEmmrt) != null) {
            appCompatTextView3.setText(str);
        }
        hFZ hfz3 = this.copydefault;
        if (hfz3 != null && (appCompatTextView2 = hfz3.gEmmrt) != null) {
            appCompatTextView2.setVisibility(str.length() > 0 ? 0 : 8);
        }
        hFZ hfz4 = this.copydefault;
        if (hfz4 != null && (appCompatTextView = hfz4.valueOf) != null) {
            appCompatTextView.setVisibility(8);
        }
        if (c55008xbo != null) {
            c55008xbo.post(new java.lang.Runnable() { // from class: o.iuI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C25308iuK.setNormalBgStyle$lambda$47(c55008xbo, i);
                }
            });
        }
    }

    public static final void setNormalBgStyle$lambda$47(C55008xbo c55008xbo, int i) {
        c55008xbo.ejfBZ().setBackgroundResource(i);
    }

    public static /* synthetic */ void setWarningStyle$default(C25308iuK c25308iuK, C55008xbo c55008xbo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c25308iuK.setWarningStyle(c55008xbo, str, z);
    }

    public final void setWarningStyle(final C55008xbo c55008xbo, java.lang.String str, boolean z) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (z) {
            hFZ hfz = this.copydefault;
            if (hfz == null || (appCompatTextView2 = hfz.valueOf) == null) {
                return;
            }
            appCompatTextView2.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq));
            appCompatTextView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            appCompatTextView2.setVisibility(0);
            if (str != null) {
                appCompatTextView2.setText(str);
                return;
            }
            return;
        }
        hFZ hfz2 = this.copydefault;
        if (hfz2 != null && (appCompatTextView = hfz2.gEmmrt) != null) {
            appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.gdmIOq));
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            appCompatTextView.setVisibility(0);
            if (str != null) {
                appCompatTextView.setText(str);
            }
        }
        if (c55008xbo != null) {
            c55008xbo.post(new java.lang.Runnable() { // from class: o.iuL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C25308iuK.AEQbTJ(c55008xbo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(C55008xbo c55008xbo) {
        c55008xbo.ejfBZ().setBackgroundResource(C23274hvD.ActionBar.isConnected);
    }

    public static /* synthetic */ void setErrorStyle$default(C25308iuK c25308iuK, C55008xbo c55008xbo, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        c25308iuK.setErrorStyle(c55008xbo, str, z);
    }

    public final void setErrorStyle(final C55008xbo c55008xbo, java.lang.String str, boolean z) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (z) {
            hFZ hfz = this.copydefault;
            if (hfz == null || (appCompatTextView2 = hfz.valueOf) == null) {
                return;
            }
            appCompatTextView2.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fhUrPt));
            appCompatTextView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            appCompatTextView2.setVisibility(0);
            if (str != null) {
                appCompatTextView2.setText(str);
                return;
            }
            return;
        }
        hFZ hfz2 = this.copydefault;
        if (hfz2 != null && (appCompatTextView = hfz2.gEmmrt) != null) {
            appCompatTextView.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fhUrPt));
            appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            appCompatTextView.setVisibility(0);
            if (str != null) {
                appCompatTextView.setText(str);
            }
        }
        if (c55008xbo != null) {
            c55008xbo.post(new java.lang.Runnable() { // from class: o.iuN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C25308iuK.KWHzl(c55008xbo);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(C55008xbo c55008xbo) {
        c55008xbo.ejfBZ().setBackgroundResource(C23274hvD.ActionBar.EZpvd);
    }

    public static /* synthetic */ android.view.View getView$default(C25308iuK c25308iuK, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c25308iuK.OLrzqt(z);
    }

    public final android.view.View OLrzqt(boolean z) {
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.QsIRgs, (android.view.ViewGroup) null, z);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "");
        return viewInflate;
    }

    public final C55008xbo EZpvd() {
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            return hfz.OLrzqt;
        }
        return null;
    }

    public final C55008xbo AEQbTJ() {
        hFZ hfz = this.copydefault;
        if (hfz != null) {
            return hfz.EZpvd;
        }
        return null;
    }
}
