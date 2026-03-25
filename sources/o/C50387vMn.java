package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50387vMn extends ConstraintLayout {
    public Function2<? super C47988uAv, ? super java.lang.String, Unit> AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public int KWHzl;
    public final C50891vch OLrzqt;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault;
    public java.util.List<java.lang.String> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPxChangeListener(Function2<? super C47988uAv, ? super java.lang.String, Unit> function2) {
        this.AEQbTJ = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50387vMn(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.djBIcL = yDY.AhwBna();
        this.KWHzl = 1;
        C50891vch c50891vchCopydefault = C50891vch.copydefault(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c50891vchCopydefault, "");
        this.OLrzqt = c50891vchCopydefault;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vMp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50387vMn.OLrzqt(this.copydefault);
            }
        });
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vMo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50387vMn.OLrzqt(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.copydefault = function2;
        C47988uAv c47988uAv = c50891vchCopydefault.KWHzl;
        c47988uAv.setOnTextChangeCallback(function2);
        c47988uAv.setMaxDecimal(this.KWHzl);
        c47988uAv.setInputUnit("%");
        setupChips();
    }

    private final java.util.List<wYS> EZpvd() {
        return (java.util.List) this.EZpvd.getValue();
    }

    public static final java.util.List OLrzqt(C50387vMn c50387vMn) {
        C50891vch c50891vch = c50387vMn.OLrzqt;
        return yDY.gEmmrt(c50891vch.AEQbTJ, c50891vch.OLrzqt, c50891vch.copydefault);
    }

    public static final Unit OLrzqt(C50387vMn c50387vMn, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = c50387vMn.AEQbTJ;
        if (function2 != null) {
            function2.invoke(c47988uAv, str);
        }
        c50387vMn.KWHzl(str);
        return Unit.INSTANCE;
    }

    public final void setupChips() {
        final int i = 0;
        for (java.lang.Object obj : EZpvd()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ((wYS) obj).setOnClickListener(new View.OnClickListener() { // from class: o.vMv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.KWHzl.AEQbTJ(i);
                }
            });
            i++;
        }
    }

    public final void AEQbTJ(int i) {
        if (i < 0 || i >= this.djBIcL.size()) {
            return;
        }
        int i2 = 0;
        for (java.lang.Object obj : EZpvd()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ((wYS) obj).setSelected(i2 == i);
            i2++;
        }
        java.lang.String str = this.djBIcL.get(i);
        this.OLrzqt.KWHzl.setOnTextChangeCallback(null);
        setInputContent(str);
        Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = this.AEQbTJ;
        if (function2 != null) {
            C47988uAv c47988uAv = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            function2.invoke(c47988uAv, str);
        }
        this.OLrzqt.KWHzl.setOnTextChangeCallback(this.copydefault);
    }

    public final void setPxPercentageData(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setInputContent(C33129mqd.mulS$default(str, 100, java.lang.Integer.valueOf(this.KWHzl), null, null, 12, null));
    }

    public final void setInputContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv.setInputContent$default(this.OLrzqt.KWHzl, str, false, false, 6, null);
    }

    public final void setRecommendValue(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.djBIcL = yDY.gEmmrt(C33129mqd.mulS$default(str, 100, java.lang.Integer.valueOf(this.KWHzl), null, null, 12, null), C33129mqd.mulS$default(str2, 100, java.lang.Integer.valueOf(this.KWHzl), null, null, 12, null), C33129mqd.mulS$default(str3, 100, java.lang.Integer.valueOf(this.KWHzl), null, null, 12, null));
        xMR xmr = xMR.copydefault;
        java.util.List listGEmmrt = yDY.gEmmrt(xMR.formatPercent$default(xmr, str, 1, null, 4, null), xMR.formatPercent$default(xmr, str2, 0, null, 4, null), xMR.formatPercent$default(xmr, str3, 0, null, 4, null));
        int i = 0;
        for (java.lang.Object obj : EZpvd()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            wYS wys = (wYS) obj;
            java.lang.String str4 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listGEmmrt, i);
            if (str4 == null) {
                str4 = "";
            }
            wys.setText(str4);
            wys.setSelected(false);
            i++;
        }
    }

    public final void copydefault() {
        if (!this.djBIcL.isEmpty()) {
            java.lang.String str = this.djBIcL.get(0);
            this.OLrzqt.KWHzl.setOnTextChangeCallback(null);
            setInputContent(str);
            Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = this.AEQbTJ;
            if (function2 != null) {
                C47988uAv c47988uAv = this.OLrzqt.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                function2.invoke(c47988uAv, str);
            }
            this.OLrzqt.KWHzl.setOnTextChangeCallback(this.copydefault);
            KWHzl(str);
        }
    }

    public final void setPercentDigit(int i) {
        this.KWHzl = i;
        this.OLrzqt.KWHzl.setMaxDecimal(i);
    }

    public final C47988uAv KWHzl() {
        C47988uAv c47988uAv = this.OLrzqt.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        return c47988uAv;
    }

    public final java.lang.String AEQbTJ() {
        return this.OLrzqt.KWHzl.AkhnZx();
    }

    public final void OLrzqt() {
        this.OLrzqt.KWHzl.setOnTextChangeCallback(null);
    }

    public final void KWHzl(java.lang.String str) {
        java.util.Iterator<java.lang.String> it = this.djBIcL.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C33129mqd.OLrzqt(it.next(), str)) {
                break;
            } else {
                i++;
            }
        }
        int i2 = 0;
        for (java.lang.Object obj : EZpvd()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ((wYS) obj).setSelected(i2 == i);
            i2++;
        }
    }
}
