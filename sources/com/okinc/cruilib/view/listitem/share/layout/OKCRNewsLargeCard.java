package com.okinc.cruilib.view.listitem.share.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.cruilib.view.listitem.share.layout.OKCRNewsLargeCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33054mpH;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.mGF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRNewsLargeCard extends ConstraintLayout {
    public Function1<? super ClickTarget, Unit> EZpvd;
    public final mGF KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKCRNewsLargeCard(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKCRNewsLargeCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCardElementClickListener(@NotNull Function1<? super ClickTarget, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:10) call: com.okinc.cruilib.view.listitem.share.layout.OKCRNewsLargeCard.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKCRNewsLargeCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCRNewsLargeCard(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        mGF mgfAEQbTJ = mGF.AEQbTJ(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(mgfAEQbTJ, "");
        this.KWHzl = mgfAEQbTJ;
        mgfAEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.mJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKCRNewsLargeCard.copydefault(this.KWHzl, view);
            }
        });
        mgfAEQbTJ.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.mJe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                OKCRNewsLargeCard.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void copydefault(OKCRNewsLargeCard oKCRNewsLargeCard, View view) {
        Function1<? super ClickTarget, Unit> function1 = oKCRNewsLargeCard.EZpvd;
        if (function1 != null) {
            function1.invoke(ClickTarget.IMAGE);
        }
    }

    public static final void AEQbTJ(OKCRNewsLargeCard oKCRNewsLargeCard, View view) {
        Function1<? super ClickTarget, Unit> function1 = oKCRNewsLargeCard.EZpvd;
        if (function1 != null) {
            function1.invoke(ClickTarget.TITLE);
        }
    }

    public final void setNewsRevampLargeCard(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        mGF mgf = this.KWHzl;
        mgf.copydefault.setText(str);
        if (str2.length() > 0) {
            ImageView imageView = mgf.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.loadUrl$default(imageView, str2, null, 0, 0, 14, null);
            return;
        }
        mgf.EZpvd.setVisibility(8);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ClickTarget {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ClickTarget[] $VALUES;
        public static final ClickTarget IMAGE = new ClickTarget("IMAGE", 0);
        public static final ClickTarget TITLE = new ClickTarget("TITLE", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ClickTarget[] $values() {
            return new ClickTarget[]{IMAGE, TITLE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ClickTarget> getEntries() {
            return $ENTRIES;
        }

        private ClickTarget(String str, int i) {
        }

        static {
            ClickTarget[] clickTargetArr$values = $values();
            $VALUES = clickTargetArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(clickTargetArr$values);
        }

        public static ClickTarget valueOf(String str) {
            return (ClickTarget) Enum.valueOf(ClickTarget.class, str);
        }

        public static ClickTarget[] values() {
            return (ClickTarget[]) $VALUES.clone();
        }
    }
}
