package com.okinc.business.defi.wallet.interaction.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.wallet.interaction.view.DappItemFeeView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC17084ewC;
import o.C13754dXa;
import o.C33061mpO;
import o.C33070mpX;
import o.C52761wXj;
import o.C55298xhM;
import o.C56444yFp;
import o.C8003auW;
import o.InterfaceC56445yFq;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class DappItemFeeView extends ConstraintLayout {
    public AnimatorSet AEQbTJ;
    public final AbstractC17084ewC EZpvd;
    public AnimatorSet KWHzl;
    public Function0<Unit> OLrzqt;
    public Function0<Unit> copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FreeGasUIType.values().length];
            try {
                iArr[FreeGasUIType.TypeCurrencyStrikethrough.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FreeGasUIType.TypeFullStrikethrough.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DappItemFeeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:26) call: com.okinc.business.defi.wallet.interaction.view.DappItemFeeView.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ DappItemFeeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DappItemFeeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = (AbstractC17084ewC) DataBindingUtil.inflate(LayoutInflater.from(context), C13754dXa.TaskDescription.OHsvZP, this, true);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Function0<Unit> function0 = this.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setFeeText(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4, final boolean z, final boolean z2, final String str5, final Boolean bool, @NotNull final FreeGasUIType freeGasUIType, @NotNull final String str6, final Function0<Unit> function0) {
        int i;
        int iDpInt$default;
        SpannableStringBuilder spannableStringBuilder;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(freeGasUIType, "");
        Intrinsics.checkNotNullParameter(str6, "");
        if (getWidth() == 0) {
            this.copydefault = new Function0() { // from class: o.fiM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return DappItemFeeView.AEQbTJ(this.copydefault, str, str2, str3, str4, z, z2, str5, bool, freeGasUIType, str6, function0);
                }
            };
            return;
        }
        this.copydefault = null;
        this.EZpvd.fJNWhG.setText(str6);
        if (Intrinsics.EZpvd(bool, Boolean.TRUE)) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
            spannableStringBuilder2.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder2.length(), 33);
            int i2 = StateListAnimator.AEQbTJ[freeGasUIType.ordinal()];
            if (i2 == 1) {
                spannableStringBuilder = spannableStringBuilder2;
                i = 0;
                this.EZpvd.djBIcL.setVisibility(str2.length() == 0 ? 8 : 0);
                String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateImplListMenuDecorView);
                this.EZpvd.djBIcL.setText(C33061mpO.setupSpanStyles$default(String.valueOf(strAYXKKw), new String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.fiK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DappItemFeeView.OLrzqt(this.AEQbTJ, (java.util.List) obj);
                    }
                }, 14, null));
                this.EZpvd.AhwBna.setVisibility(8);
                this.EZpvd.gEmmrt.setVisibility(8);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                this.EZpvd.djBIcL.setVisibility(8);
                spannableStringBuilder = spannableStringBuilder2;
                i = 0;
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(C33061mpO.setupSpanStyles$default(str2, new String[]{str2}, 0, null, false, new Function1() { // from class: o.fiN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DappItemFeeView.AEQbTJ(this.KWHzl, (java.util.List) obj);
                    }
                }, 14, null));
                spannableStringBuilder3.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder3.length(), 33);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(C33061mpO.setupSpanStyles$default(" " + str3, new String[]{" " + str3}, 0, null, false, new Function1() { // from class: o.fiO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DappItemFeeView.djBIcL(this.KWHzl, (java.util.List) obj);
                    }
                }, 14, null));
                spannableStringBuilder4.setSpan(new StrikethroughSpan(), 0, spannableStringBuilder4.length(), 33);
                this.EZpvd.AhwBna.setVisibility(str2.length() == 0 ? 8 : 0);
                this.EZpvd.AhwBna.setText(spannableStringBuilder3);
                this.EZpvd.gEmmrt.setVisibility(str2.length() == 0 ? 8 : 0);
                this.EZpvd.gEmmrt.setText(spannableStringBuilder4);
            }
            this.EZpvd.valueOf.setVisibility(str4.length() == 0 ? 8 : i);
            this.EZpvd.valueOf.setText(spannableStringBuilder);
            this.EZpvd.OLrzqt.setText(str5);
            this.EZpvd.OLrzqt.setVisibility((str5 == null || str5.length() == 0) ? 8 : i);
        } else {
            i = 0;
            float width = this.EZpvd.fJNWhG.getWidth();
            float fMeasureText = this.EZpvd.djBIcL.getPaint().measureText(str + " " + str2);
            float fMeasureText2 = this.EZpvd.gEmmrt.getPaint().measureText("  " + str3);
            if (z) {
                iDpInt$default = C55298xhM.dpInt$default(32, (Context) null, 1, (Object) null);
            } else {
                iDpInt$default = C55298xhM.dpInt$default(54, (Context) null, 1, (Object) null);
            }
            if (width + fMeasureText + fMeasureText2 + iDpInt$default > (getWidth() - getPaddingStart()) - getPaddingEnd()) {
                this.EZpvd.djBIcL.setText(str);
                this.EZpvd.djBIcL.setVisibility(0);
                this.EZpvd.AhwBna.setText(str2);
            } else {
                this.EZpvd.djBIcL.setVisibility(8);
                this.EZpvd.AhwBna.setText(str + " " + str2);
            }
            this.EZpvd.gEmmrt.setText(" " + str3);
            this.EZpvd.valueOf.setText(str4);
            this.EZpvd.OLrzqt.setText(str5);
            if (str2.length() == 0) {
                this.EZpvd.djBIcL.setVisibility(8);
            }
            this.EZpvd.AhwBna.setVisibility(str2.length() == 0 ? 8 : 0);
            this.EZpvd.gEmmrt.setVisibility(str2.length() == 0 ? 8 : 0);
            this.EZpvd.fIwbmz.setVisibility(str2.length() == 0 ? 8 : 0);
            this.EZpvd.valueOf.setVisibility(str4.length() == 0 ? 8 : 0);
            this.EZpvd.OLrzqt.setVisibility((str5 == null || str5.length() == 0) ? 8 : 0);
        }
        if (z) {
            if (this.EZpvd.KWHzl.getVisibility() != 8) {
                this.EZpvd.KWHzl.setVisibility(8);
            }
        } else if (this.EZpvd.KWHzl.getVisibility() != 0) {
            this.EZpvd.KWHzl.setVisibility(i);
        }
        if (z2) {
            OLrzqt();
        }
        this.OLrzqt = function0;
        if (function0 != null) {
            this.EZpvd.AkhnZx.setVisibility(i);
            C8003auW.copydefault(this.EZpvd.AkhnZx).throttleFirst(500L, TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fiP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    DappItemFeeView.setFeeText$lambda$4(this.KWHzl, obj);
                }
            });
        } else {
            this.EZpvd.AkhnZx.setVisibility(8);
        }
    }

    public static final Unit AEQbTJ(DappItemFeeView dappItemFeeView, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, Boolean bool, FreeGasUIType freeGasUIType, String str6, Function0 function0) {
        dappItemFeeView.setFeeText(str, str2, str3, str4, z, z2, str5, bool, freeGasUIType, str6, function0);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DappItemFeeView dappItemFeeView, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(dappItemFeeView.getContext(), C13754dXa.LoaderManager.AhwBna));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DappItemFeeView dappItemFeeView, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(dappItemFeeView.getContext(), C52761wXj.LoaderManager.QHmsKR));
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(DappItemFeeView dappItemFeeView, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TextAppearanceSpan(dappItemFeeView.getContext(), C52761wXj.LoaderManager.QHmsKR));
        return Unit.INSTANCE;
    }

    public static final void setFeeText$lambda$4(DappItemFeeView dappItemFeeView, Object obj) {
        Function0<Unit> function0 = dappItemFeeView.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setFeeRedText(boolean z) {
        if (z) {
            this.EZpvd.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
            this.EZpvd.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
            this.EZpvd.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
            this.EZpvd.valueOf.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
            return;
        }
        this.EZpvd.djBIcL.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        this.EZpvd.AhwBna.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        this.EZpvd.gEmmrt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
        this.EZpvd.valueOf.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FreeGasUIType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FreeGasUIType[] $VALUES;
        public static final FreeGasUIType TypeCurrencyStrikethrough = new FreeGasUIType("TypeCurrencyStrikethrough", 0);
        public static final FreeGasUIType TypeFullStrikethrough = new FreeGasUIType("TypeFullStrikethrough", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FreeGasUIType[] $values() {
            return new FreeGasUIType[]{TypeCurrencyStrikethrough, TypeFullStrikethrough};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FreeGasUIType> getEntries() {
            return $ENTRIES;
        }

        private FreeGasUIType(String str, int i) {
        }

        static {
            FreeGasUIType[] freeGasUITypeArr$values = $values();
            $VALUES = freeGasUITypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(freeGasUITypeArr$values);
        }

        public static FreeGasUIType valueOf(String str) {
            return (FreeGasUIType) Enum.valueOf(FreeGasUIType.class, str);
        }

        public static FreeGasUIType[] values() {
            return (FreeGasUIType[]) $VALUES.clone();
        }
    }

    public final void OLrzqt() {
        if (this.AEQbTJ == null) {
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.EZpvd.AhwBna, "alpha", 1.0f, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.EZpvd.gEmmrt, "alpha", 1.0f, 0.0f));
            arrayList.add(ObjectAnimator.ofFloat(this.EZpvd.valueOf, "alpha", 1.0f, 0.0f));
            if (this.EZpvd.djBIcL.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(this.EZpvd.djBIcL, "alpha", 1.0f, 0.0f));
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(300L);
            animatorSet.addListener(new Application());
            this.AEQbTJ = animatorSet;
        }
        AnimatorSet animatorSet2 = this.AEQbTJ;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }

    public static final class Application implements Animator.AnimatorListener {

        public static final class Activity implements Animator.AnimatorListener {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
        }

        public Application() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "");
            if (DappItemFeeView.this.KWHzl == null) {
                DappItemFeeView dappItemFeeView = DappItemFeeView.this;
                AnimatorSet animatorSet = new AnimatorSet();
                DappItemFeeView dappItemFeeView2 = DappItemFeeView.this;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ObjectAnimator.ofFloat(dappItemFeeView2.EZpvd.AhwBna, "alpha", 0.0f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(dappItemFeeView2.EZpvd.gEmmrt, "alpha", 0.0f, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(dappItemFeeView2.EZpvd.valueOf, "alpha", 0.0f, 1.0f));
                if (dappItemFeeView2.EZpvd.djBIcL.getVisibility() == 0) {
                    arrayList.add(ObjectAnimator.ofFloat(dappItemFeeView2.EZpvd.djBIcL, "alpha", 0.0f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(300L);
                animatorSet.addListener(new Activity());
                dappItemFeeView.KWHzl = animatorSet;
            }
            AnimatorSet animatorSet2 = DappItemFeeView.this.KWHzl;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }
}
