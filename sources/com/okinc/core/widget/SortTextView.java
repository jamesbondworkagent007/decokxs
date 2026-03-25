package com.okinc.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SortTextView extends AppCompatTextView {
    public SortType AEQbTJ;
    public SortType[] AYXKKw;
    public Drawable EZpvd;
    public Drawable KWHzl;
    public Function2<? super SortTextView, ? super SortType, Unit> OLrzqt;
    public Drawable copydefault;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSortTypeChangeListener(@NotNull Function2<? super SortTextView, ? super SortType, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SortType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final SortType NONE = new SortType("NONE", 0, 0);
        public static final SortType UP = new SortType("UP", 1, 1);
        public static final SortType DOWN = new SortType("DOWN", 2, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ SortType[] $values() {
            return new SortType[]{NONE, UP, DOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<SortType> getEntries() {
            return $ENTRIES;
        }

        private SortType(String str, int i, int i2) {
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

    public final void setSortTypeOrderList(@NotNull SortType... sortTypeArr) {
        Intrinsics.checkNotNullParameter(sortTypeArr, "");
        if (yDV.QOLQEE(sortTypeArr).size() < sortTypeArr.length || sortTypeArr.length > 3) {
            throw new IllegalArgumentException("sortType can't repeat");
        }
        this.AYXKKw = (SortType[]) Arrays.copyOf(sortTypeArr, sortTypeArr.length);
    }

    public final void setMDefaultIndicator(Drawable drawable) {
        this.copydefault = drawable;
        KWHzl(this.AEQbTJ);
    }

    public final void setMDownIndicator(Drawable drawable) {
        this.EZpvd = drawable;
        KWHzl(this.AEQbTJ);
    }

    public final void setMUpIndicator(Drawable drawable) {
        this.KWHzl = drawable;
        KWHzl(this.AEQbTJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        SortType sortType = SortType.NONE;
        this.AEQbTJ = sortType;
        this.AYXKKw = new SortType[]{sortType, SortType.UP, SortType.DOWN};
        OLrzqt(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        SortType sortType = SortType.NONE;
        this.AEQbTJ = sortType;
        this.AYXKKw = new SortType[]{sortType, SortType.UP, SortType.DOWN};
        OLrzqt(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        SortType sortType = SortType.NONE;
        this.AEQbTJ = sortType;
        this.AYXKKw = new SortType[]{sortType, SortType.UP, SortType.DOWN};
        OLrzqt(context, attributeSet);
    }

    private final void OLrzqt(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.akftKQ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setMDefaultIndicator(typedArrayObtainStyledAttributes.getDrawable(C32113mPz.PendingIntent.aJFbMH));
        setMUpIndicator(typedArrayObtainStyledAttributes.getDrawable(C32113mPz.PendingIntent.fXHmeK));
        setMDownIndicator(typedArrayObtainStyledAttributes.getDrawable(C32113mPz.PendingIntent.UscePu));
        int i = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.aHXSQp, -1);
        if (i >= 0) {
            this.AEQbTJ = this.AYXKKw[i];
        }
        setSortType$default(this, this.AEQbTJ, false, 2, null);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void setSortType$default(SortTextView sortTextView, SortType sortType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        sortTextView.setSortType(sortType, z);
    }

    public final void setSortType(@NotNull SortType sortType, boolean z) {
        Function2<? super SortTextView, ? super SortType, Unit> function2;
        Intrinsics.checkNotNullParameter(sortType, "");
        this.AEQbTJ = sortType;
        KWHzl(sortType);
        if (!z || (function2 = this.OLrzqt) == null) {
            return;
        }
        function2.invoke(this, this.AEQbTJ);
    }

    public final void setDisableSort() {
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static /* synthetic */ void setSortSelf$default(SortTextView sortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        sortTextView.setSortSelf(z);
    }

    public final void setSortSelf(boolean z) {
        Function2<? super SortTextView, ? super SortType, Unit> function2;
        SortType sortType = this.AYXKKw[(yDV.gEmmrt(this.AYXKKw, this.AEQbTJ) + 1) % 3];
        this.AEQbTJ = sortType;
        KWHzl(sortType);
        if (!z || (function2 = this.OLrzqt) == null) {
            return;
        }
        function2.invoke(this, this.AEQbTJ);
    }

    public final void KWHzl(SortType sortType) {
        Drawable drawable;
        int i = Application.OLrzqt[sortType.ordinal()];
        if (i == 1) {
            drawable = this.copydefault;
        } else if (i == 2) {
            drawable = this.EZpvd;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            drawable = this.KWHzl;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }

    public static /* synthetic */ void setUpDownSortType$default(SortTextView sortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        sortTextView.setUpDownSortType(z);
    }

    public final void setUpDownSortType(boolean z) {
        setSortType(copydefault(this.AEQbTJ), z);
    }

    public final SortType copydefault(SortType sortType) {
        int i = Application.OLrzqt[sortType.ordinal()];
        if (i == 1) {
            return SortType.UP;
        }
        if (i == 2) {
            return SortType.UP;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return SortType.DOWN;
    }

    public static /* synthetic */ void setNextSortType$default(SortTextView sortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        sortTextView.setNextSortType(z);
    }

    public final void setNextSortType(boolean z) {
        setSortType(AEQbTJ(this.AEQbTJ), z);
    }

    public final SortType AEQbTJ(SortType sortType) {
        int i = Application.OLrzqt[sortType.ordinal()];
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

    public final SortType EZpvd() {
        SortType[] sortTypeArr = this.AYXKKw;
        int length = sortTypeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (sortTypeArr[i] == this.AEQbTJ) {
                break;
            }
            i++;
        }
        if (i < 0) {
            throw new IllegalArgumentException("mSortType:" + this.AEQbTJ + " not in sortTypeArray");
        }
        SortType[] sortTypeArr2 = this.AYXKKw;
        if (i == sortTypeArr2.length - 1) {
            return sortTypeArr2[0];
        }
        return sortTypeArr2[i + 1];
    }
}
