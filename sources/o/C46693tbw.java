package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C46693tbw;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46693tbw extends android.widget.FrameLayout {
    public boolean AEQbTJ;
    public final C55001xbh AYXKKw;
    public int AhwBna;
    public final android.widget.TextView EZpvd;
    public java.lang.String KWHzl;
    public boolean OLrzqt;
    public java.lang.String copydefault;
    public final C46658tbN djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final C46686tbp valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void copydefault(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55001xbh AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBasePrice(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceDigit(int i) {
        this.AhwBna = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46693tbw(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = 2;
        android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.QslYrK, this);
        this.EZpvd = (android.widget.TextView) findViewById(qZH.StateListAnimator.DcMfJKfNLfdT);
        C55001xbh c55001xbh = (C55001xbh) findViewById(qZH.StateListAnimator.hwXsuq);
        this.AYXKKw = c55001xbh;
        C46686tbp c46686tbp = (C46686tbp) findViewById(qZH.StateListAnimator.UCQKYV);
        this.valueOf = c46686tbp;
        C46658tbN c46658tbN = (C46658tbN) findViewById(qZH.StateListAnimator.RZMhtF);
        this.djBIcL = c46658tbN;
        this.gEmmrt = (LinearLayoutCompat) findViewById(qZH.StateListAnimator.fsw);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(qZH.StateListAnimator.QTtQrx);
        final View.OnFocusChangeListener onFocusChangeListener = c55001xbh != null ? c55001xbh.getOnFocusChangeListener() : null;
        if (c55001xbh != null) {
            c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.tbu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C46693tbw.KWHzl(onFocusChangeListener, this, view, z);
                }
            });
        }
        if (c55001xbh != null) {
            c55001xbh.setOnClickListener(new View.OnClickListener() { // from class: o.tby
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46693tbw.KWHzl(this.OLrzqt, view);
                }
            });
        }
        if (c55001xbh != null) {
            c55001xbh.addTextChangedListener(new AnonymousClass4());
        }
        if (c46686tbp != null) {
            c46686tbp.setOnProgressChangeListener(new Function1() { // from class: o.tbv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46693tbw.EZpvd(this.AEQbTJ, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        if (c46658tbN != null) {
            c46658tbN.setOnProgressChangeListener(new Function1() { // from class: o.tbD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46693tbw.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        addStatesFromChildren();
        this.values = "";
        this.copydefault = C33070mpX.AYXKKw(qZH.PendingIntent.avCqka);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46693tbw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = 2;
        android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.QslYrK, this);
        this.EZpvd = (android.widget.TextView) findViewById(qZH.StateListAnimator.DcMfJKfNLfdT);
        C55001xbh c55001xbh = (C55001xbh) findViewById(qZH.StateListAnimator.hwXsuq);
        this.AYXKKw = c55001xbh;
        C46686tbp c46686tbp = (C46686tbp) findViewById(qZH.StateListAnimator.UCQKYV);
        this.valueOf = c46686tbp;
        C46658tbN c46658tbN = (C46658tbN) findViewById(qZH.StateListAnimator.RZMhtF);
        this.djBIcL = c46658tbN;
        this.gEmmrt = (LinearLayoutCompat) findViewById(qZH.StateListAnimator.fsw);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(qZH.StateListAnimator.QTtQrx);
        final View.OnFocusChangeListener onFocusChangeListener = c55001xbh != null ? c55001xbh.getOnFocusChangeListener() : null;
        if (c55001xbh != null) {
            c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.tbu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C46693tbw.KWHzl(onFocusChangeListener, this, view, z);
                }
            });
        }
        if (c55001xbh != null) {
            c55001xbh.setOnClickListener(new View.OnClickListener() { // from class: o.tby
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46693tbw.KWHzl(this.OLrzqt, view);
                }
            });
        }
        if (c55001xbh != null) {
            c55001xbh.addTextChangedListener(new AnonymousClass4());
        }
        if (c46686tbp != null) {
            c46686tbp.setOnProgressChangeListener(new Function1() { // from class: o.tbv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46693tbw.EZpvd(this.AEQbTJ, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        if (c46658tbN != null) {
            c46658tbN.setOnProgressChangeListener(new Function1() { // from class: o.tbD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46693tbw.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        addStatesFromChildren();
        this.values = "";
        this.copydefault = C33070mpX.AYXKKw(qZH.PendingIntent.avCqka);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46693tbw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AhwBna = 2;
        android.view.LayoutInflater.from(getContext()).inflate(qZH.ActionBar.QslYrK, this);
        this.EZpvd = (android.widget.TextView) findViewById(qZH.StateListAnimator.DcMfJKfNLfdT);
        C55001xbh c55001xbh = (C55001xbh) findViewById(qZH.StateListAnimator.hwXsuq);
        this.AYXKKw = c55001xbh;
        C46686tbp c46686tbp = (C46686tbp) findViewById(qZH.StateListAnimator.UCQKYV);
        this.valueOf = c46686tbp;
        C46658tbN c46658tbN = (C46658tbN) findViewById(qZH.StateListAnimator.RZMhtF);
        this.djBIcL = c46658tbN;
        this.gEmmrt = (LinearLayoutCompat) findViewById(qZH.StateListAnimator.fsw);
        this.fetchVPNInfo = (android.widget.TextView) findViewById(qZH.StateListAnimator.QTtQrx);
        final View.OnFocusChangeListener onFocusChangeListener = c55001xbh != null ? c55001xbh.getOnFocusChangeListener() : null;
        if (c55001xbh != null) {
            c55001xbh.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.tbu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C46693tbw.KWHzl(onFocusChangeListener, this, view, z);
                }
            });
        }
        if (c55001xbh != null) {
            c55001xbh.setOnClickListener(new View.OnClickListener() { // from class: o.tby
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C46693tbw.KWHzl(this.OLrzqt, view);
                }
            });
        }
        if (c55001xbh != null) {
            c55001xbh.addTextChangedListener(new AnonymousClass4());
        }
        if (c46686tbp != null) {
            c46686tbp.setOnProgressChangeListener(new Function1() { // from class: o.tbv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46693tbw.EZpvd(this.AEQbTJ, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        if (c46658tbN != null) {
            c46658tbN.setOnProgressChangeListener(new Function1() { // from class: o.tbD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46693tbw.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        addStatesFromChildren();
        this.values = "";
        this.copydefault = C33070mpX.AYXKKw(qZH.PendingIntent.avCqka);
    }

    public static final void KWHzl(View.OnFocusChangeListener onFocusChangeListener, C46693tbw c46693tbw, android.view.View view, boolean z) {
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
        c46693tbw.copydefault(z);
        if (!c46693tbw.OLrzqt) {
            android.content.Context context = c46693tbw.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C33054mpH.OLrzqt(context, c46693tbw.AYXKKw);
            return;
        }
        c46693tbw.copydefault();
    }

    public static final void KWHzl(C46693tbw c46693tbw, android.view.View view) {
        c46693tbw.AYXKKw.setFocusable(true);
        c46693tbw.AYXKKw.requestFocus();
    }

    /* JADX INFO: renamed from: o.tbw$4, reason: invalid class name */
    public static final class AnonymousClass4 implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public AnonymousClass4() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (C46693tbw.this.AEQbTJ) {
                if (editable != null) {
                    C46693tbw.this.AEQbTJ().setSelection(editable.length());
                }
            } else {
                C55001xbh c55001xbhAEQbTJ = C46693tbw.this.AEQbTJ();
                final C46693tbw c46693tbw = C46693tbw.this;
                c55001xbhAEQbTJ.post(new java.lang.Runnable() { // from class: o.tbB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C46693tbw.AnonymousClass4.AEQbTJ(c46693tbw);
                    }
                });
            }
        }

        public static final void AEQbTJ(C46693tbw c46693tbw) {
            if (c46693tbw.AEQbTJ) {
                return;
            }
            c46693tbw.copydefault();
        }
    }

    public static final Unit EZpvd(C46693tbw c46693tbw, float f) {
        java.lang.String str = c46693tbw.KWHzl;
        if (str != null) {
            java.lang.String localized$default = pTB.formatLocalized$default(C33129mqd.mulS$default(str, java.lang.Float.valueOf(1 + (f / 100)), java.lang.Integer.valueOf(c46693tbw.AhwBna), null, null, 12, null), null, 1, null);
            c46693tbw.AEQbTJ = true;
            c46693tbw.AYXKKw.setText(localized$default);
            c46693tbw.AEQbTJ = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C46693tbw c46693tbw, float f) {
        java.lang.String localized$default = f == 0.0f ? "" : pTB.formatLocalized$default(C33129mqd.formatS$default(java.lang.Float.valueOf(f), 2, null, null, 6, null), null, 1, null);
        c46693tbw.AEQbTJ = true;
        c46693tbw.AYXKKw.setText(localized$default);
        c46693tbw.AEQbTJ = false;
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.content.Context context = getContext();
        AbstractActivityC33041mov abstractActivityC33041mov = context instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) context : null;
        if (abstractActivityC33041mov != null) {
            C59541ziw.EZpvd(abstractActivityC33041mov, abstractActivityC33041mov, new ActionBar());
        }
    }

    /* JADX INFO: renamed from: o.tbw$ActionBar */
    public static final class ActionBar implements InterfaceC59496ziD {
        public ActionBar() {
        }

        @Override // o.InterfaceC59496ziD
        public void OLrzqt(boolean z) {
            if (z) {
                return;
            }
            C46693tbw.this.OLrzqt();
        }
    }

    public final void setTimeClickListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        LinearLayoutCompat linearLayoutCompat = this.gEmmrt;
        if (linearLayoutCompat != null) {
            C55296xhK.singleClick$default(linearLayoutCompat, onClickListener, 0L, 2, (java.lang.Object) null);
        }
    }

    public final void OLrzqt() {
        C55001xbh c55001xbh = this.AYXKKw;
        if (c55001xbh != null) {
            c55001xbh.clearFocus();
        }
    }

    public final void copydefault() {
        C46686tbp c46686tbp = this.valueOf;
        if (c46686tbp != null) {
            c46686tbp.OLrzqt();
        }
    }

    public final void EZpvd() {
        C46658tbN c46658tbN = this.djBIcL;
        if (c46658tbN != null) {
            c46658tbN.copydefault();
        }
    }

    public final void setPercentageBarProgress(float f) {
        C46658tbN c46658tbN = this.djBIcL;
        if (c46658tbN != null) {
            c46658tbN.setProgress(f);
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.fetchVPNInfo;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        android.widget.TextView textView = this.EZpvd;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setHint(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        C55001xbh c55001xbh = this.AYXKKw;
        if (c55001xbh != null) {
            c55001xbh.setHint(str);
        }
    }

    public final void EZpvd(boolean z) {
        LinearLayoutCompat linearLayoutCompat = this.gEmmrt;
        if (linearLayoutCompat != null) {
            linearLayoutCompat.setVisibility(z ? 0 : 8);
        }
        C46658tbN c46658tbN = this.djBIcL;
        if (c46658tbN != null) {
            c46658tbN.setVisibility(z ? 0 : 8);
        }
        C46686tbp c46686tbp = this.valueOf;
        if (c46686tbp != null) {
            c46686tbp.setVisibility(z ^ true ? 0 : 8);
        }
    }
}
