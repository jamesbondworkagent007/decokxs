package com.okinc.uilab.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55298xhM;
import o.C55376xil;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKSortTextView extends C55376xil {
    public Drawable AEQbTJ;
    public SortType[] AYXKKw;
    public SortType EZpvd;
    public int KWHzl;
    public Drawable OLrzqt;
    public Drawable copydefault;
    public Drawable djBIcL;
    public Function2<? super OKSortTextView, ? super SortType, Unit> gEmmrt;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SortType.values().length];
            try {
                iArr[SortType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SortType.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SortType.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKSortTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKSortTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortType AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortType OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSortTypeChangeListener(@NotNull Function2<? super OKSortTextView, ? super SortType, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.gEmmrt = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPositionType(int i) {
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: com.okinc.uilab.view.OKSortTextView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKSortTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKSortTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        SortType sortType = SortType.NONE;
        this.EZpvd = sortType;
        this.AYXKKw = new SortType[]{sortType, SortType.UP, SortType.DOWN};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.compare);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setDefaultIndicator(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.UJpkuA));
        setUpIndicator(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OEsIKP));
        setDownIndicator(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.OmYuqg));
        setDisabledIndicator(typedArrayObtainStyledAttributes.getDrawable(C52761wXj.PictureInPictureParams.DDDCac));
        int i2 = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.QhYuFg, -1);
        this.KWHzl = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.DcNNRp, 2);
        if (i2 >= 0) {
            this.EZpvd = this.AYXKKw[i2];
        }
        setSortType$default(this, this.EZpvd, false, 2, null);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(C55298xhM.OLrzqt(-2, context));
    }

    public final void setDefaultIndicator(Drawable drawable) {
        this.copydefault = drawable;
        copydefault(this.EZpvd);
    }

    public final void setDownIndicator(Drawable drawable) {
        this.AEQbTJ = drawable;
        copydefault(this.EZpvd);
    }

    public final void setUpIndicator(Drawable drawable) {
        this.djBIcL = drawable;
        copydefault(this.EZpvd);
    }

    public final void setDisabledIndicator(Drawable drawable) {
        this.OLrzqt = drawable;
        copydefault(this.EZpvd);
    }

    private final void copydefault(SortType sortType) {
        Drawable drawable;
        if (isEnabled()) {
            int i = TaskDescription.EZpvd[sortType.ordinal()];
            if (i == 1) {
                drawable = this.copydefault;
            } else if (i == 2) {
                drawable = this.AEQbTJ;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                drawable = this.djBIcL;
            }
        } else {
            drawable = this.OLrzqt;
        }
        if (drawable != null) {
            setDrawable(drawable, this.KWHzl, copydefault(), KWHzl());
        }
        int i2 = this.KWHzl;
        if (i2 == 0) {
            setCompoundDrawablesRelative(drawable, null, null, null);
            return;
        }
        if (i2 == 1) {
            setCompoundDrawablesRelative(null, drawable, null, null);
        } else if (i2 == 2) {
            setCompoundDrawablesRelative(null, null, drawable, null);
        } else {
            if (i2 != 3) {
                return;
            }
            setCompoundDrawablesRelative(null, null, null, drawable);
        }
    }

    @Override // o.C55376xil, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        setMWidth(i);
        setMHeight(i2);
        copydefault(this.EZpvd);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        copydefault(this.EZpvd);
    }

    public final void setSortTypeOrderList(@NotNull SortType... sortTypeArr) {
        Intrinsics.checkNotNullParameter(sortTypeArr, "");
        if (yDV.QOLQEE(sortTypeArr).size() < sortTypeArr.length || sortTypeArr.length > 3) {
            throw new IllegalArgumentException("sortType can't repeat");
        }
        this.AYXKKw = (SortType[]) Arrays.copyOf(sortTypeArr, sortTypeArr.length);
    }

    public static /* synthetic */ void setSortType$default(OKSortTextView oKSortTextView, SortType sortType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        oKSortTextView.setSortType(sortType, z);
    }

    public final void setSortType(@NotNull SortType sortType, boolean z) {
        Function2<? super OKSortTextView, ? super SortType, Unit> function2;
        Intrinsics.checkNotNullParameter(sortType, "");
        this.EZpvd = sortType;
        copydefault(sortType);
        if (!z || (function2 = this.gEmmrt) == null) {
            return;
        }
        function2.invoke(this, this.EZpvd);
    }

    public final void setDisableSort() {
        setCompoundDrawablesRelative(null, null, null, null);
    }

    public static /* synthetic */ void setSortSelf$default(OKSortTextView oKSortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oKSortTextView.setSortSelf(z);
    }

    public final void setSortSelf(boolean z) {
        Function2<? super OKSortTextView, ? super SortType, Unit> function2;
        SortType sortType = this.AYXKKw[(yDV.gEmmrt(this.AYXKKw, this.EZpvd) + 1) % 3];
        this.EZpvd = sortType;
        copydefault(sortType);
        if (!z || (function2 = this.gEmmrt) == null) {
            return;
        }
        function2.invoke(this, this.EZpvd);
    }

    public static /* synthetic */ void setUpDownSortType$default(OKSortTextView oKSortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oKSortTextView.setUpDownSortType(z);
    }

    public final void setUpDownSortType(boolean z) {
        setSortType(KWHzl(this.EZpvd), z);
    }

    public final SortType KWHzl(SortType sortType) {
        int i = TaskDescription.EZpvd[sortType.ordinal()];
        if (i == 1) {
            return SortType.DOWN;
        }
        if (i == 2) {
            return SortType.UP;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortType.NONE;
    }

    public static /* synthetic */ void setNextSortType$default(OKSortTextView oKSortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        oKSortTextView.setNextSortType(z);
    }

    public final void setNextSortType(boolean z) {
        setSortType(AEQbTJ(this.EZpvd), z);
    }

    public final SortType AEQbTJ(SortType sortType) {
        int i = TaskDescription.EZpvd[sortType.ordinal()];
        if (i == 1) {
            return SortType.UP;
        }
        if (i == 2) {
            return SortType.NONE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortType.DOWN;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SortType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final SortType NONE = new SortType("NONE", 0);
        public static final SortType UP = new SortType("UP", 1);
        public static final SortType DOWN = new SortType("DOWN", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SortType[] $values() {
            return new SortType[]{NONE, UP, DOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SortType> getEntries() {
            return $ENTRIES;
        }

        private SortType(String str, int i) {
        }

        static {
            SortType[] sortTypeArr$values = $values();
            $VALUES = sortTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(sortTypeArr$values);
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }
    }
}
