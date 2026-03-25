package com.okinc.buysell.ui.transaction.convert.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33070mpX;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class LiteStatusBadge extends AppCompatTextView {
    public final int KWHzl;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BadgeColour.values().length];
            try {
                iArr[BadgeColour.YELLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeColour.GREY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BadgeColour.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BadgeColour.GREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BadgeColour.BLUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiteStatusBadge(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiteStatusBadge(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: com.okinc.buysell.ui.transaction.convert.view.LiteStatusBadge.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ LiteStatusBadge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiteStatusBadge(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        int iOrdinal = BadgeColour.GREY.ordinal();
        this.KWHzl = iOrdinal;
        setGravity(17);
        setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.valueOf));
        setIncludeFontPadding(false);
        setLines(1);
        Resources resources = getResources();
        if (resources != null) {
            int dimension = (int) resources.getDimension(C52761wXj.StateListAnimator.giSNqX);
            int dimension2 = (int) resources.getDimension(C52761wXj.StateListAnimator.flVtFt);
            setPadding(dimension, dimension2, dimension, dimension2);
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C32113mPz.PendingIntent.OuxcSI);
            iOrdinal = typedArrayObtainStyledAttributes.getInt(C32113mPz.PendingIntent.DCUTEI, iOrdinal);
            typedArrayObtainStyledAttributes.recycle();
        }
        setBadgeColour(BadgeColour.values()[iOrdinal]);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class BadgeColour {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ BadgeColour[] $VALUES;
        public static final BadgeColour YELLOW = new BadgeColour("YELLOW", 0);
        public static final BadgeColour GREY = new BadgeColour("GREY", 1);
        public static final BadgeColour RED = new BadgeColour("RED", 2);
        public static final BadgeColour GREEN = new BadgeColour("GREEN", 3);
        public static final BadgeColour BLUE = new BadgeColour("BLUE", 4);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ BadgeColour[] $values() {
            return new BadgeColour[]{YELLOW, GREY, RED, GREEN, BLUE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<BadgeColour> getEntries() {
            return $ENTRIES;
        }

        private BadgeColour(String str, int i) {
        }

        static {
            BadgeColour[] badgeColourArr$values = $values();
            $VALUES = badgeColourArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(badgeColourArr$values);
        }

        public static BadgeColour valueOf(String str) {
            return (BadgeColour) Enum.valueOf(BadgeColour.class, str);
        }

        public static BadgeColour[] values() {
            return (BadgeColour[]) $VALUES.clone();
        }
    }

    public final void setBadgeColour(@NotNull BadgeColour badgeColour) {
        Intrinsics.checkNotNullParameter(badgeColour, "");
        int i = ActionBar.OLrzqt[badgeColour.ordinal()];
        if (i == 1) {
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.RSmiaq));
            setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.vqBjd));
            return;
        }
        if (i == 2) {
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.GqbzPL));
            setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.zHQtTQ));
            return;
        }
        if (i == 3) {
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.RSmiaq));
            setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.DDjgSw));
        } else if (i == 4) {
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.RSmiaq));
            setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.isInitInProgress));
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            setTextColor(C33070mpX.copydefault(C52761wXj.Activity.RSmiaq));
            setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.sVaiLC));
        }
    }
}
