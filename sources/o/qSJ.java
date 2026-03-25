package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.okinc.market.ext.UpDownColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qSJ extends C40499qYc {
    public final C42923rfa KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.qSJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qSJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qSJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C42923rfa c42923rfaAEQbTJ = C42923rfa.AEQbTJ(android.view.LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(c42923rfaAEQbTJ, "");
        this.KWHzl = c42923rfaAEQbTJ;
        if (isInEditMode()) {
            setData$OKMarket_market_impl(true, false, "MOODENG", "", "", "0xb7...23s1", "$16.25M", "$10.46M", "$0.0000061", "+5.19%", UpDownColor.UP, false, "", new Function1() { // from class: o.qSF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qSJ.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: o.qSG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qSJ.OLrzqt((java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public final void setData$OKMarket_market_impl(boolean z, boolean z2, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, @NotNull java.lang.CharSequence charSequence3, @NotNull java.lang.CharSequence charSequence4, @NotNull java.lang.CharSequence charSequence5, @NotNull UpDownColor upDownColor, boolean z3, @NotNull java.lang.String str4, @NotNull Function1<? super java.lang.Boolean, Unit> function1, Function1<? super java.lang.String, Unit> function12) {
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        Intrinsics.checkNotNullParameter(charSequence3, "");
        Intrinsics.checkNotNullParameter(charSequence4, "");
        Intrinsics.checkNotNullParameter(charSequence5, "");
        Intrinsics.checkNotNullParameter(upDownColor, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl.KWHzl.setSelected(z);
        if (isInEditMode()) {
            this.KWHzl.OLrzqt.setImageResource(C52761wXj.TaskDescription.aHXSQp);
            this.KWHzl.copydefault.setImageResource(C52761wXj.TaskDescription.fERRXa);
        } else {
            AppCompatImageView appCompatImageView = this.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C46742tcs.AEQbTJ(appCompatImageView, str2 == null ? "" : str2);
            AppCompatImageView appCompatImageView2 = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            C57659ymb.loadBorderImage$default(appCompatImageView2, str3 == null ? "" : str3, C52761wXj.TaskDescription.fERRXa, 0.0f, 0, 8, (java.lang.Object) null);
        }
        if (isRtl()) {
            java.lang.CharSequence charSequenceUnicodeWrap = androidx.core.text.BidiFormatter.getInstance().unicodeWrap(charSequence3);
            str5 = ((java.lang.Object) androidx.core.text.BidiFormatter.getInstance().unicodeWrap(charSequence2)) + " • " + ((java.lang.Object) charSequenceUnicodeWrap);
        } else {
            str5 = ((java.lang.Object) charSequence3) + " • " + ((java.lang.Object) charSequence2);
        }
        C42950rgA c42950rgA = this.KWHzl.AEQbTJ;
        int iDjBIcL = C33570myu.djBIcL(getContext());
        int iDpInt$default = C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null);
        java.lang.String str6 = str5;
        C42950rgA.setData$OKMarket_market_impl$default(c42950rgA, z2, str, charSequence, str6, charSequence4, charSequence5, upDownColor, null, ((((iDjBIcL - iDpInt$default) - C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(28, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null)) - C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), false, false, z3, str4, function12, 1664, null);
        AppCompatImageView appCompatImageView3 = this.KWHzl.KWHzl;
        appCompatImageView3.setOnClickListener(new Application(appCompatImageView3, 1000L, function1, z));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function1 function1, boolean z) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = function1;
            this.KWHzl = z;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.invoke(java.lang.Boolean.valueOf(this.KWHzl));
            }
        }
    }
}
