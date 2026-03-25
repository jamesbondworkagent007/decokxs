package com.okinc.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RankSortTextView extends AppCompatTextView {
    public RankSortType AEQbTJ;
    public final RankSortType[] EZpvd;
    public Drawable KWHzl;
    public Function2<? super RankSortTextView, ? super RankSortType, Unit> OLrzqt;
    public Drawable copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RankSortType.values().length];
            try {
                iArr[RankSortType.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RankSortType.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnSortTypeChangeListener(@NotNull Function2<? super RankSortTextView, ? super RankSortType, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt = function2;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RankSortType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RankSortType[] $VALUES;
        public static final RankSortType UP = new RankSortType("UP", 0, 0);
        public static final RankSortType DOWN = new RankSortType("DOWN", 1, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RankSortType[] $values() {
            return new RankSortType[]{UP, DOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RankSortType> getEntries() {
            return $ENTRIES;
        }

        private RankSortType(String str, int i, int i2) {
        }

        static {
            RankSortType[] rankSortTypeArr$values = $values();
            $VALUES = rankSortTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(rankSortTypeArr$values);
        }

        public static RankSortType valueOf(String str) {
            return (RankSortType) Enum.valueOf(RankSortType.class, str);
        }

        public static RankSortType[] values() {
            return (RankSortType[]) $VALUES.clone();
        }
    }

    public final void setMDownIndicator(Drawable drawable) {
        this.KWHzl = drawable;
        AEQbTJ(this.AEQbTJ);
    }

    public final void setMUpIndicator(Drawable drawable) {
        this.copydefault = drawable;
        AEQbTJ(this.AEQbTJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankSortTextView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        RankSortType rankSortType = RankSortType.UP;
        this.AEQbTJ = rankSortType;
        this.EZpvd = new RankSortType[]{rankSortType, RankSortType.DOWN};
        OLrzqt(context, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankSortTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        RankSortType rankSortType = RankSortType.UP;
        this.AEQbTJ = rankSortType;
        this.EZpvd = new RankSortType[]{rankSortType, RankSortType.DOWN};
        OLrzqt(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RankSortTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        RankSortType rankSortType = RankSortType.UP;
        this.AEQbTJ = rankSortType;
        this.EZpvd = new RankSortType[]{rankSortType, RankSortType.DOWN};
        OLrzqt(context, attributeSet);
    }

    private final void OLrzqt(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.heceqZ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setMUpIndicator(typedArrayObtainStyledAttributes.getDrawable(C32113mPz.PendingIntent.DaRZkR));
        setMDownIndicator(typedArrayObtainStyledAttributes.getDrawable(C32113mPz.PendingIntent.OTwTPd));
        int i = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.DNMMPQ, -1);
        if (i >= 0) {
            this.AEQbTJ = this.EZpvd[i];
        }
        setSortType$default(this, this.AEQbTJ, false, 2, null);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void setSortType$default(RankSortTextView rankSortTextView, RankSortType rankSortType, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        rankSortTextView.setSortType(rankSortType, z);
    }

    public final void setSortType(@NotNull RankSortType rankSortType, boolean z) {
        Function2<? super RankSortTextView, ? super RankSortType, Unit> function2;
        Intrinsics.checkNotNullParameter(rankSortType, "");
        this.AEQbTJ = rankSortType;
        AEQbTJ(rankSortType);
        if (!z || (function2 = this.OLrzqt) == null) {
            return;
        }
        function2.invoke(this, this.AEQbTJ);
    }

    public final void setDisableSort() {
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static /* synthetic */ void setSortSelf$default(RankSortTextView rankSortTextView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        rankSortTextView.setSortSelf(z);
    }

    public final void setSortSelf(boolean z) {
        Function2<? super RankSortTextView, ? super RankSortType, Unit> function2;
        RankSortType rankSortType = this.EZpvd[(yDV.gEmmrt(this.EZpvd, this.AEQbTJ) + 1) % 2];
        this.AEQbTJ = rankSortType;
        AEQbTJ(rankSortType);
        if (!z || (function2 = this.OLrzqt) == null) {
            return;
        }
        function2.invoke(this, this.AEQbTJ);
    }

    public final void AEQbTJ(RankSortType rankSortType) {
        Drawable drawable;
        int i = StateListAnimator.AEQbTJ[rankSortType.ordinal()];
        if (i == 1) {
            drawable = this.KWHzl;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            drawable = this.copydefault;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}
