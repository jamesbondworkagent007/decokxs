package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27300jsb extends ConstraintLayout {
    public Function0<Unit> AYXKKw;
    public C25480ixX AhwBna;
    public Function1<? super android.view.View, Unit> EZpvd;
    public iKJ KWHzl;
    public boolean OLrzqt;
    public InvestUniv3SubscribeActivity.AmountInputIndex copydefault;
    public boolean gEmmrt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return !this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGetFocusCallback(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenClickCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AYXKKw = function0;
    }

    /* JADX INFO: renamed from: o.jsb$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jsb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27300jsb(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
        this.copydefault = InvestUniv3SubscribeActivity.AmountInputIndex.First;
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27300jsb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
        this.copydefault = InvestUniv3SubscribeActivity.AmountInputIndex.First;
        EZpvd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27300jsb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
        this.copydefault = InvestUniv3SubscribeActivity.AmountInputIndex.First;
        EZpvd();
    }

    public final void EZpvd() {
        iKJ ikjCopydefault = iKJ.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
        this.KWHzl = ikjCopydefault;
        iKJ ikj = null;
        if (ikjCopydefault == null) {
            Intrinsics.gEmmrt("");
            ikjCopydefault = null;
        }
        ikjCopydefault.copydefault.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.jsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C27300jsb.KWHzl(this.AEQbTJ, view, z);
            }
        });
        iKJ ikj2 = this.KWHzl;
        if (ikj2 == null) {
            Intrinsics.gEmmrt("");
            ikj2 = null;
        }
        ikj2.copydefault.EZpvd(new Function2() { // from class: o.jrY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27300jsb.KWHzl(this.AEQbTJ, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
        iKJ ikj3 = this.KWHzl;
        if (ikj3 == null) {
            Intrinsics.gEmmrt("");
            ikj3 = null;
        }
        android.widget.ImageView imageView = ikj3.djBIcL;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        iKJ ikj4 = this.KWHzl;
        if (ikj4 == null) {
            Intrinsics.gEmmrt("");
            ikj4 = null;
        }
        android.widget.TextView textView = ikj4.AhwBna;
        textView.setOnClickListener(new TaskDescription(textView, 1000L, this));
        iKJ ikj5 = this.KWHzl;
        if (ikj5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikj = ikj5;
        }
        android.widget.ImageView imageView2 = ikj.KWHzl;
        imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this));
    }

    public static final void KWHzl(C27300jsb c27300jsb, android.view.View view, boolean z) {
        if (z) {
            c27300jsb.AEQbTJ();
            Function1<? super android.view.View, Unit> function1 = c27300jsb.EZpvd;
            if (function1 != null) {
                Intrinsics.copydefault(view);
                function1.invoke(view);
                return;
            }
            return;
        }
        c27300jsb.OLrzqt();
    }

    public static final Unit KWHzl(C27300jsb c27300jsb, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (c27300jsb.gEmmrt) {
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = c27300jsb.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKJ ikj = c27300jsb.KWHzl;
            iKJ ikj2 = null;
            if (ikj == null) {
                Intrinsics.gEmmrt("");
                ikj = null;
            }
            android.text.TextPaint paint = ikj.copydefault.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            android.content.Context context2 = c27300jsb.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            float fCopydefault = c27569jxf.copydefault(context, str, paint, C55298xhM.copydefault(210.0f, context2), 28.0f, 10.0f, 2.0f);
            iKJ ikj3 = c27300jsb.KWHzl;
            if (ikj3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikj2 = ikj3;
            }
            ikj2.copydefault.setTextSize(fCopydefault);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jsb$PendingIntent */
    public static final class PendingIntent implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public PendingIntent() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            if (C27300jsb.this.KWHzl()) {
                C27300jsb.this.OLrzqt = false;
            }
        }
    }

    public final void AEQbTJ(@NotNull C25480ixX c25480ixX) {
        Intrinsics.checkNotNullParameter(c25480ixX, "");
        this.AhwBna = c25480ixX;
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        iKJ ikj = this.KWHzl;
        iKJ ikj2 = null;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        android.widget.ImageView imageView = ikj.djBIcL;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf, imageView, c25480ixX.KWHzl(), 0, 0, 0.5f, 12, null);
        iKJ ikj3 = this.KWHzl;
        if (ikj3 == null) {
            Intrinsics.gEmmrt("");
            ikj3 = null;
        }
        ikj3.AhwBna.setText(c25480ixX.EZpvd());
        iKJ ikj4 = this.KWHzl;
        if (ikj4 == null) {
            Intrinsics.gEmmrt("");
            ikj4 = null;
        }
        ikj4.AEQbTJ.setText(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(c25480ixX.copydefault()), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null));
        iKJ ikj5 = this.KWHzl;
        if (ikj5 == null) {
            Intrinsics.gEmmrt("");
            ikj5 = null;
        }
        ikj5.valueOf.setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, c25480ixX.AhwBna(), 6, 2, false, false, 24, null));
        iKJ ikj6 = this.KWHzl;
        if (ikj6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikj2 = ikj6;
        }
        ikj2.copydefault.EZpvd(6);
        OLrzqt(c25480ixX);
        AhwBna();
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iKJ ikj = this.KWHzl;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        ikj.AEQbTJ.setText(C27586jxw.OLrzqt.KWHzl(C33129mqd.EZpvd(str), (46 & 2) != 0 ? 2 : 0, (46 & 4) == 0 ? 0 : 2, (46 & 8) != 0 ? DisplaySign.AUTO : null, (46 & 16) != 0 ? CurrencyDisplayStyle.CURRENCY_AMOUNT_ONLY : CurrencyDisplayStyle.CURRENCY_CODE_SUFFIX, (46 & 32) != 0 ? RoundingMode.DOWN : null));
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        C25480ixX c25480ixX = this.AhwBna;
        if (c25480ixX != null) {
            iKJ ikj = this.KWHzl;
            if (ikj == null) {
                Intrinsics.gEmmrt("");
                ikj = null;
            }
            Intrinsics.checkNotNullExpressionValue(ikj.copydefault, "");
            this.AhwBna = c25480ixX.EZpvd((6095 & 1) != 0 ? c25480ixX.OLrzqt : null, (6095 & 2) != 0 ? c25480ixX.EZpvd : null, (6095 & 4) != 0 ? c25480ixX.KWHzl : null, (6095 & 8) != 0 ? c25480ixX.AEQbTJ : null, (6095 & 16) != 0 ? c25480ixX.valueOf : z, (6095 & 32) != 0 ? c25480ixX.AYXKKw : z2, (6095 & 64) != 0 ? c25480ixX.AhwBna : false, (6095 & 128) != 0 ? c25480ixX.gEmmrt : false, (6095 & 256) != 0 ? c25480ixX.djBIcL : false, (6095 & 512) != 0 ? c25480ixX.values : null, (6095 & 1024) != 0 ? c25480ixX.fetchVPNInfo : 0, (6095 & 2048) != 0 ? c25480ixX.AkhnZx : str, (6095 & 4096) != 0 ? c25480ixX.copydefault : false);
            iKJ ikj2 = this.KWHzl;
            if (ikj2 == null) {
                Intrinsics.gEmmrt("");
                ikj2 = null;
            }
            ikj2.valueOf.setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, str, 6, 2, false, false, 24, null));
            AhwBna();
        }
    }

    public final void setClickablePromptListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        iKJ ikj = this.KWHzl;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        android.widget.TextView textView = ikj.OLrzqt;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, onClickListener));
    }

    public final void OLrzqt(C25480ixX c25480ixX) {
        if (c25480ixX.DbNXlk()) {
            return;
        }
        if (c25480ixX.AEQbTJ()) {
            AEQbTJ();
        }
        if (!this.gEmmrt || c25480ixX.AEQbTJ()) {
            iKJ ikj = null;
            if (C33129mqd.EZpvd(c25480ixX.OLrzqt()).compareTo(BigDecimal.ZERO) == 0) {
                iKJ ikj2 = this.KWHzl;
                if (ikj2 == null) {
                    Intrinsics.gEmmrt("");
                    ikj2 = null;
                }
                ikj2.copydefault.setHintText("0");
                iKJ ikj3 = this.KWHzl;
                if (ikj3 == null) {
                    Intrinsics.gEmmrt("");
                    ikj3 = null;
                }
                ikj3.copydefault.setText("");
            } else {
                iKJ ikj4 = this.KWHzl;
                if (ikj4 == null) {
                    Intrinsics.gEmmrt("");
                    ikj4 = null;
                }
                ikj4.copydefault.setText(c25480ixX.OLrzqt());
            }
            iKJ ikj5 = this.KWHzl;
            if (ikj5 == null) {
                Intrinsics.gEmmrt("");
                ikj5 = null;
            }
            ikj5.copydefault.setHorizontallyScrolling(true);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKJ ikj6 = this.KWHzl;
            if (ikj6 == null) {
                Intrinsics.gEmmrt("");
                ikj6 = null;
            }
            java.lang.String strValueOf = java.lang.String.valueOf(ikj6.copydefault.getText());
            iKJ ikj7 = this.KWHzl;
            if (ikj7 == null) {
                Intrinsics.gEmmrt("");
                ikj7 = null;
            }
            android.text.TextPaint paint = ikj7.copydefault.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            float fCopydefault = c27569jxf.copydefault(context, strValueOf, paint, C55298xhM.copydefault(210.0f, context2), 28.0f, 10.0f, 2.0f);
            iKJ ikj8 = this.KWHzl;
            if (ikj8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikj = ikj8;
            }
            ikj.copydefault.setTextSize(fCopydefault);
        }
    }

    public final void AhwBna() {
        C25480ixX c25480ixX = this.AhwBna;
        iKJ ikj = null;
        if (C33129mqd.gEmmrt(c25480ixX != null ? c25480ixX.AhwBna() : null, java.lang.Double.valueOf(1.0E-6d))) {
            iKJ ikj2 = this.KWHzl;
            if (ikj2 == null) {
                Intrinsics.gEmmrt("");
                ikj2 = null;
            }
            ikj2.OLrzqt.setText(getContext().getString(C25493ixk.FragmentManager.hrjNmC));
            iKJ ikj3 = this.KWHzl;
            if (ikj3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikj = ikj3;
            }
            ikj.OLrzqt.setTag(new kotlin.Pair(2, this.copydefault));
            return;
        }
        C25480ixX c25480ixX2 = this.AhwBna;
        if (c25480ixX2 == null || !c25480ixX2.valueOf()) {
            iKJ ikj4 = this.KWHzl;
            if (ikj4 == null) {
                Intrinsics.gEmmrt("");
                ikj4 = null;
            }
            ikj4.OLrzqt.setText(getContext().getString(C25493ixk.FragmentManager.awiJhF));
            iKJ ikj5 = this.KWHzl;
            if (ikj5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikj = ikj5;
            }
            ikj.OLrzqt.setTag(new kotlin.Pair(1, this.copydefault));
            return;
        }
        iKJ ikj6 = this.KWHzl;
        if (ikj6 == null) {
            Intrinsics.gEmmrt("");
            ikj6 = null;
        }
        ikj6.OLrzqt.setText(getContext().getString(C25493ixk.FragmentManager.hrjNmC));
        iKJ ikj7 = this.KWHzl;
        if (ikj7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikj = ikj7;
        }
        ikj.OLrzqt.setTag(new kotlin.Pair(2, this.copydefault));
    }

    /* JADX INFO: renamed from: o.jsb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C27300jsb OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C27300jsb c27300jsb) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.OLrzqt = c27300jsb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jsb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C27300jsb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C27300jsb c27300jsb) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c27300jsb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.copydefault.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jsb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ View.OnClickListener KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, View.OnClickListener onClickListener) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.onClick((android.widget.TextView) this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.jsb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C27300jsb OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C27300jsb c27300jsb) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c27300jsb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.AYXKKw;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final void setTagAndDelayedTextWatcher(@NotNull InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex, @NotNull final Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(amountInputIndex, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.copydefault = amountInputIndex;
        iKJ ikj = this.KWHzl;
        iKJ ikj2 = null;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        ikj.copydefault.setTag(amountInputIndex);
        iKJ ikj3 = this.KWHzl;
        if (ikj3 == null) {
            Intrinsics.gEmmrt("");
            ikj3 = null;
        }
        C27343jtR c27343jtR = ikj3.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27343jtR, "");
        c27343jtR.addTextChangedListener(new PendingIntent());
        iKJ ikj4 = this.KWHzl;
        if (ikj4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ikj2 = ikj4;
        }
        ikj2.copydefault.copydefault(new Function2() { // from class: o.jrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C27300jsb.OLrzqt(function2, this, (C55001xbh) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit OLrzqt(Function2 function2, C27300jsb c27300jsb, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        function2.invoke(c55001xbh, str);
        c27300jsb.OLrzqt = true;
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        if (this.gEmmrt) {
            this.gEmmrt = false;
            iKJ ikj = this.KWHzl;
            iKJ ikj2 = null;
            if (ikj == null) {
                Intrinsics.gEmmrt("");
                ikj = null;
            }
            if (C33129mqd.EZpvd(ikj.copydefault.isConnected()).compareTo(BigDecimal.ZERO) == 0) {
                iKJ ikj3 = this.KWHzl;
                if (ikj3 == null) {
                    Intrinsics.gEmmrt("");
                    ikj3 = null;
                }
                ikj3.copydefault.setHintText("0");
                iKJ ikj4 = this.KWHzl;
                if (ikj4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    ikj2 = ikj4;
                }
                ikj2.copydefault.setText("");
                return;
            }
            iKJ ikj5 = this.KWHzl;
            if (ikj5 == null) {
                Intrinsics.gEmmrt("");
                ikj5 = null;
            }
            C27343jtR c27343jtR = ikj5.copydefault;
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            iKJ ikj6 = this.KWHzl;
            if (ikj6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ikj2 = ikj6;
            }
            java.lang.String string = C33129mqd.EZpvd(java.lang.String.valueOf(ikj2.copydefault.getText())).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String str = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
            Intrinsics.checkNotNullExpressionValue(str, "");
            c27343jtR.setText(str);
        }
    }

    public final android.widget.EditText copydefault() {
        iKJ ikj = this.KWHzl;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        C27343jtR c27343jtR = ikj.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27343jtR, "");
        return c27343jtR;
    }

    public final void valueOf() {
        iKJ ikj = this.KWHzl;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        ikj.copydefault.clearFocus();
    }

    public final void setTokenArrowIconVisible(boolean z) {
        iKJ ikj = this.KWHzl;
        if (ikj == null) {
            Intrinsics.gEmmrt("");
            ikj = null;
        }
        ikj.KWHzl.setVisibility(z ? 0 : 8);
    }
}
