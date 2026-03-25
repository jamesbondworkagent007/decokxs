package com.okinc.business.invest_biz.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.ui.widget.InvestUniv3PriceInputView;
import com.okinc.p2p.api.OtcExtraKeys;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27236jrQ;
import o.C25493ixk;
import o.C27315jsq;
import o.C27343jtR;
import o.C27492jwH;
import o.C27569jxf;
import o.C27586jxw;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55001xbh;
import o.C55298xhM;
import o.C56390yDp;
import o.C56423yEv;
import o.C56444yFp;
import o.C6832aWn;
import o.InterfaceC56445yFq;
import o.iKV;
import o.pTB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class InvestUniv3PriceInputView extends ConstraintLayout {
    public int AEQbTJ;
    public InputType AhwBna;
    public boolean EZpvd;
    public boolean KWHzl;
    public BigDecimal OLrzqt;
    public iKV copydefault;
    public AbstractC27236jrQ djBIcL;
    public BigDecimal gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.OLrzqt = bigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeCallback(AbstractC27236jrQ abstractC27236jrQ) {
        this.djBIcL = abstractC27236jrQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3PriceInputView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = InputType.MIN_PRICE;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.OLrzqt = bigDecimal;
        this.AEQbTJ = 6;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.gEmmrt = bigDecimal;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3PriceInputView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = InputType.MIN_PRICE;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.OLrzqt = bigDecimal;
        this.AEQbTJ = 6;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.gEmmrt = bigDecimal;
        AEQbTJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3PriceInputView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = InputType.MIN_PRICE;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.OLrzqt = bigDecimal;
        this.AEQbTJ = 6;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.gEmmrt = bigDecimal;
        AEQbTJ();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType MAX_PRICE = new InputType("MAX_PRICE", 0);
        public static final InputType MIN_PRICE = new InputType("MIN_PRICE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{MAX_PRICE, MIN_PRICE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<InputType> getEntries() {
            return $ENTRIES;
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(inputTypeArr$values);
        }

        private InputType(String str, int i) {
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    private final void KWHzl(C27315jsq c27315jsq) {
        if (!Intrinsics.EZpvd(this.OLrzqt, c27315jsq.EZpvd())) {
            BigDecimal bigDecimalEZpvd = c27315jsq.EZpvd();
            this.OLrzqt = bigDecimalEZpvd;
            setTextDisplay(bigDecimalEZpvd, this.EZpvd);
        }
        this.valueOf = c27315jsq.KWHzl();
    }

    public final void AEQbTJ() {
        iKV ikvOLrzqt = iKV.OLrzqt(LayoutInflater.from(getContext()), this, true);
        this.copydefault = ikvOLrzqt;
        iKV ikv = null;
        if (ikvOLrzqt == null) {
            Intrinsics.gEmmrt("");
            ikvOLrzqt = null;
        }
        ikvOLrzqt.getRoot().setFocusableInTouchMode(true);
        iKV ikv2 = this.copydefault;
        if (ikv2 == null) {
            Intrinsics.gEmmrt("");
            ikv2 = null;
        }
        ikv2.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.jrU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3PriceInputView.OLrzqt(this.KWHzl, view);
            }
        });
        iKV ikv3 = this.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
            ikv3 = null;
        }
        ikv3.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.jrW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                InvestUniv3PriceInputView.EZpvd(this.EZpvd, view);
            }
        });
        iKV ikv4 = this.copydefault;
        if (ikv4 == null) {
            Intrinsics.gEmmrt("");
            ikv4 = null;
        }
        ikv4.copydefault.setAlpha(0.0f);
        iKV ikv5 = this.copydefault;
        if (ikv5 == null) {
            Intrinsics.gEmmrt("");
            ikv5 = null;
        }
        TextView textView = ikv5.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        final Function2 function2 = new Function2() { // from class: o.jrT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestUniv3PriceInputView.copydefault(this.KWHzl, (C55001xbh) obj, (java.lang.String) obj2);
            }
        };
        iKV ikv6 = this.copydefault;
        if (ikv6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv = ikv6;
        }
        ikv.copydefault.setOnFocusChangeCallback(new Function2() { // from class: o.jrV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestUniv3PriceInputView.EZpvd(this.AEQbTJ, function2, (AppCompatEditText) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final void OLrzqt(InvestUniv3PriceInputView investUniv3PriceInputView, View view) {
        iKV ikv = investUniv3PriceInputView.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ikv.copydefault.clearFocus();
        Object objEZpvd = C6832aWn.EZpvd("input_method");
        Intrinsics.copydefault(objEZpvd, "");
        InputMethodManager inputMethodManager = (InputMethodManager) objEZpvd;
        iKV ikv3 = investUniv3PriceInputView.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv2 = ikv3;
        }
        inputMethodManager.hideSoftInputFromWindow(ikv2.copydefault.getWindowToken(), 0);
        AbstractC27236jrQ abstractC27236jrQ = investUniv3PriceInputView.djBIcL;
        if (abstractC27236jrQ != null) {
            C27315jsq c27315jsqAEQbTJ = abstractC27236jrQ.AEQbTJ(investUniv3PriceInputView.valueOf, true);
            if (investUniv3PriceInputView.AhwBna == InputType.MIN_PRICE) {
                investUniv3PriceInputView.KWHzl(abstractC27236jrQ.copydefault(c27315jsqAEQbTJ));
            } else {
                investUniv3PriceInputView.KWHzl(abstractC27236jrQ.EZpvd(c27315jsqAEQbTJ));
            }
            abstractC27236jrQ.EZpvd(false);
        }
    }

    public static final void EZpvd(InvestUniv3PriceInputView investUniv3PriceInputView, View view) {
        iKV ikv = investUniv3PriceInputView.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ikv.copydefault.clearFocus();
        Object objEZpvd = C6832aWn.EZpvd("input_method");
        Intrinsics.copydefault(objEZpvd, "");
        InputMethodManager inputMethodManager = (InputMethodManager) objEZpvd;
        iKV ikv3 = investUniv3PriceInputView.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv2 = ikv3;
        }
        inputMethodManager.hideSoftInputFromWindow(ikv2.copydefault.getWindowToken(), 0);
        AbstractC27236jrQ abstractC27236jrQ = investUniv3PriceInputView.djBIcL;
        if (abstractC27236jrQ != null) {
            C27315jsq c27315jsqAEQbTJ = abstractC27236jrQ.AEQbTJ(investUniv3PriceInputView.valueOf, false);
            if (investUniv3PriceInputView.AhwBna == InputType.MIN_PRICE) {
                investUniv3PriceInputView.KWHzl(abstractC27236jrQ.copydefault(c27315jsqAEQbTJ));
            } else {
                investUniv3PriceInputView.KWHzl(abstractC27236jrQ.EZpvd(c27315jsqAEQbTJ));
            }
            abstractC27236jrQ.EZpvd(false);
        }
    }

    public static final Unit copydefault(InvestUniv3PriceInputView investUniv3PriceInputView, C55001xbh c55001xbh, String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        investUniv3PriceInputView.KWHzl = true;
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(InvestUniv3PriceInputView investUniv3PriceInputView, Function2 function2, AppCompatEditText appCompatEditText, boolean z) {
        Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(appCompatEditText, "");
        iKV ikv = null;
        if (z) {
            if (Build.VERSION.SDK_INT >= 29 && (drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.getUriFromString)) != null) {
                iKV ikv2 = investUniv3PriceInputView.copydefault;
                if (ikv2 == null) {
                    Intrinsics.gEmmrt("");
                    ikv2 = null;
                }
                ikv2.copydefault.setTextSelectHandle(drawableKWHzl);
            }
            iKV ikv3 = investUniv3PriceInputView.copydefault;
            if (ikv3 == null) {
                Intrinsics.gEmmrt("");
                ikv3 = null;
            }
            ikv3.copydefault.setCursorStyleWeb3();
            AbstractC27236jrQ abstractC27236jrQ = investUniv3PriceInputView.djBIcL;
            if (abstractC27236jrQ != null) {
                abstractC27236jrQ.EZpvd(true);
            }
            iKV ikv4 = investUniv3PriceInputView.copydefault;
            if (ikv4 == null) {
                Intrinsics.gEmmrt("");
                ikv4 = null;
            }
            ViewGroup.LayoutParams layoutParams = ikv4.EZpvd.getLayoutParams();
            iKV ikv5 = investUniv3PriceInputView.copydefault;
            if (ikv5 == null) {
                Intrinsics.gEmmrt("");
                ikv5 = null;
            }
            layoutParams.height = ikv5.EZpvd.getHeight();
            iKV ikv6 = investUniv3PriceInputView.copydefault;
            if (ikv6 == null) {
                Intrinsics.gEmmrt("");
                ikv6 = null;
            }
            TextView textView = ikv6.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            iKV ikv7 = investUniv3PriceInputView.copydefault;
            if (ikv7 == null) {
                Intrinsics.gEmmrt("");
                ikv7 = null;
            }
            ikv7.copydefault.setAlpha(1.0f);
            investUniv3PriceInputView.KWHzl = false;
            investUniv3PriceInputView.KWHzl(investUniv3PriceInputView.OLrzqt);
            iKV ikv8 = investUniv3PriceInputView.copydefault;
            if (ikv8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikv = ikv8;
            }
            ikv.copydefault.EZpvd((Function2<? super C55001xbh, ? super String, Unit>) function2);
        } else {
            iKV ikv9 = investUniv3PriceInputView.copydefault;
            if (ikv9 == null) {
                Intrinsics.gEmmrt("");
                ikv9 = null;
            }
            ikv9.copydefault.KWHzl((Function2<? super C55001xbh, ? super String, Unit>) function2);
            if (investUniv3PriceInputView.KWHzl) {
                BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(new DecimalFormat().parse(C33129mqd.gEmmrt(appCompatEditText.getText()), new ParsePosition(0)));
                investUniv3PriceInputView.OLrzqt = bigDecimalEZpvd;
                AbstractC27236jrQ abstractC27236jrQ2 = investUniv3PriceInputView.djBIcL;
                if (abstractC27236jrQ2 != null) {
                    int iCopydefault = abstractC27236jrQ2.copydefault(bigDecimalEZpvd);
                    C27315jsq c27315jsq = new C27315jsq(abstractC27236jrQ2.AEQbTJ(iCopydefault), iCopydefault);
                    if (investUniv3PriceInputView.AhwBna == InputType.MIN_PRICE) {
                        abstractC27236jrQ2.copydefault(c27315jsq);
                    } else {
                        abstractC27236jrQ2.EZpvd(c27315jsq);
                    }
                }
            }
            AbstractC27236jrQ abstractC27236jrQ3 = investUniv3PriceInputView.djBIcL;
            if (abstractC27236jrQ3 != null) {
                abstractC27236jrQ3.EZpvd(false);
            }
            setTextDisplay$default(investUniv3PriceInputView, investUniv3PriceInputView.OLrzqt, false, 2, null);
            iKV ikv10 = investUniv3PriceInputView.copydefault;
            if (ikv10 == null) {
                Intrinsics.gEmmrt("");
                ikv10 = null;
            }
            TextView textView2 = ikv10.valueOf;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(0);
            iKV ikv11 = investUniv3PriceInputView.copydefault;
            if (ikv11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikv = ikv11;
            }
            ikv.copydefault.setAlpha(0.0f);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String getFormattedPriceText$default(InvestUniv3PriceInputView investUniv3PriceInputView, BigDecimal bigDecimal, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return investUniv3PriceInputView.OLrzqt(bigDecimal, z);
    }

    public final String OLrzqt(BigDecimal bigDecimal, boolean z) {
        return pTB.formatDownToFixed$default(bigDecimal, this.AEQbTJ, null, 2, null);
    }

    public static /* synthetic */ void setTextDisplay$default(InvestUniv3PriceInputView investUniv3PriceInputView, BigDecimal bigDecimal, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        investUniv3PriceInputView.setTextDisplay(bigDecimal, z);
    }

    public final void setTextDisplay(BigDecimal bigDecimal, boolean z) {
        String strOLrzqt;
        if (z) {
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            String plainString = bigDecimal.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            strOLrzqt = c27492jwH.valueOf(plainString);
        } else {
            strOLrzqt = OLrzqt(bigDecimal, true);
        }
        String str = strOLrzqt;
        iKV ikv = this.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ikv.valueOf.setText(str);
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        iKV ikv3 = this.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
            ikv3 = null;
        }
        TextPaint paint = ikv3.valueOf.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        iKV ikv4 = this.copydefault;
        if (ikv4 == null) {
            Intrinsics.gEmmrt("");
            ikv4 = null;
        }
        float fCopydefault = c27569jxf.copydefault(context, str, paint, ikv4.valueOf.getWidth(), 28.0f, 10.0f, 2.0f);
        iKV ikv5 = this.copydefault;
        if (ikv5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv2 = ikv5;
        }
        ikv2.valueOf.setTextSize(fCopydefault);
        AEQbTJ(bigDecimal);
    }

    public final void AEQbTJ(BigDecimal bigDecimal) {
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(this.gEmmrt);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int i = C25493ixk.FragmentManager.gkJEwt;
        C27586jxw c27586jxw = C27586jxw.OLrzqt;
        Intrinsics.copydefault(bigDecimalMultiply);
        String strKWHzl = C33069mpW.KWHzl(context, i, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C27586jxw.localizeCryptoPrice$default(c27586jxw, bigDecimalMultiply, false, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, 4, null))));
        iKV ikv = this.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ikv.djBIcL.setText(strKWHzl);
        iKV ikv3 = this.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv2 = ikv3;
        }
        TextView textView = ikv2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
    }

    private final void KWHzl(BigDecimal bigDecimal) {
        iKV ikv = null;
        String formattedPriceText$default = getFormattedPriceText$default(this, bigDecimal, false, 2, null);
        iKV ikv2 = this.copydefault;
        if (ikv2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv = ikv2;
        }
        ikv.copydefault.setText(formattedPriceText$default);
        AEQbTJ(formattedPriceText$default);
    }

    public final void AEQbTJ(String str) {
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        iKV ikv = this.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        TextPaint paint = ikv.copydefault.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        iKV ikv3 = this.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
            ikv3 = null;
        }
        float fCopydefault = c27569jxf.copydefault(context, str, paint, ikv3.valueOf.getWidth(), 28.0f, 10.0f, 2.0f);
        iKV ikv4 = this.copydefault;
        if (ikv4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv2 = ikv4;
        }
        ikv2.copydefault.setTextSize(fCopydefault);
    }

    public final void setType(@NotNull InputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "");
        this.AhwBna = inputType;
        iKV ikv = null;
        if (inputType == InputType.MIN_PRICE) {
            iKV ikv2 = this.copydefault;
            if (ikv2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikv = ikv2;
            }
            ikv.AYXKKw.setText(getContext().getString(C25493ixk.FragmentManager.UccSpe));
            return;
        }
        iKV ikv3 = this.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv = ikv3;
        }
        ikv.AYXKKw.setText(getContext().getString(C25493ixk.FragmentManager.RbVjfb));
    }

    public final void OLrzqt() {
        this.EZpvd = true;
        iKV ikv = this.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ImageView imageView = ikv.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        iKV ikv3 = this.copydefault;
        if (ikv3 == null) {
            Intrinsics.gEmmrt("");
            ikv3 = null;
        }
        ImageView imageView2 = ikv3.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        imageView2.setVisibility(8);
        iKV ikv4 = this.copydefault;
        if (ikv4 == null) {
            Intrinsics.gEmmrt("");
            ikv4 = null;
        }
        C27343jtR c27343jtR = ikv4.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27343jtR, "");
        c27343jtR.setVisibility(8);
        iKV ikv5 = this.copydefault;
        if (ikv5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikv2 = ikv5;
        }
        TextView textView = ikv2.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            marginLayoutParams.setMarginStart(C55298xhM.copydefault(20.0f, context));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            marginLayoutParams.setMarginEnd(C55298xhM.copydefault(20.0f, context2));
            textView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void setExchangeTypeText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iKV ikv = this.copydefault;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ikv.KWHzl.setText(str);
    }

    public void OLrzqt(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        if (this.AhwBna == InputType.MIN_PRICE) {
            KWHzl(c27315jsq);
        }
    }

    public void AEQbTJ(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        if (this.AhwBna == InputType.MAX_PRICE) {
            KWHzl(c27315jsq);
        }
    }

    public final void copydefault() {
        iKV ikv = this.copydefault;
        iKV ikv2 = null;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        if (ikv.copydefault.isFocused()) {
            iKV ikv3 = this.copydefault;
            if (ikv3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikv2 = ikv3;
            }
            ikv2.copydefault.clearFocus();
        }
    }

    public final void setMaxDecimal(int i) {
        this.AEQbTJ = i;
        iKV ikv = this.copydefault;
        if (ikv == null) {
            Intrinsics.gEmmrt("");
            ikv = null;
        }
        ikv.copydefault.EZpvd(i);
    }

    public final void setQuoteTokenPrice(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        this.gEmmrt = bigDecimal;
        AEQbTJ(this.OLrzqt);
    }
}
