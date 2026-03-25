package com.okinc.cruilib.view.section;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.mDC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OrderStatusView extends ConstraintLayout {
    public final ImageView AEQbTJ;
    public final TextView KWHzl;
    public final TextView OLrzqt;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStatus.values().length];
            try {
                iArr[OrderStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStatus.PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OrderStatus.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OrderStatus.REFUNDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OrderStatus.REVERSING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[OrderStatus.REVERSED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[OrderStatus.EXPIRED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[OrderStatus.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderStatusView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderStatusView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0009: SGET  A[WRAPPED] o.wXj.LoaderManager.iRxXKY int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: com.okinc.cruilib.view.section.OrderStatusView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OrderStatusView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C52761wXj.LoaderManager.iRxXKY : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusView(@NotNull Context context, AttributeSet attributeSet, int i) {
        OrderStatus orderStatus;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        LayoutInflater.from(context).inflate(mDC.TaskDescription.AubY, (ViewGroup) this, true);
        this.AEQbTJ = (ImageView) findViewById(mDC.ActionBar.RXzakW);
        this.KWHzl = (TextView) findViewById(mDC.ActionBar.UhxbNG);
        this.OLrzqt = (TextView) findViewById(mDC.ActionBar.Ufzxmz);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mDC.LoaderManager.fetchVPNInfo);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            int i2 = typedArrayObtainStyledAttributes.getInt(mDC.LoaderManager.fIwbmz, -1);
            if (i2 >= 0 && (orderStatus = (OrderStatus) CollectionsKt___CollectionsKt.AkhnZx(OrderStatus.getEntries(), i2)) != null) {
                setStatus(orderStatus);
            }
            String string = typedArrayObtainStyledAttributes.getString(mDC.LoaderManager.fJNWhG);
            if (string != null) {
                setDescription(string);
                Unit unit = Unit.INSTANCE;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void setStatus(@NotNull OrderStatus orderStatus) {
        Intrinsics.checkNotNullParameter(orderStatus, "");
        switch (StateListAnimator.EZpvd[orderStatus.ordinal()]) {
            case 1:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.AkhnZx);
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.Dmq);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.sIqKDg)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.AYXKKw));
                return;
            case 2:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.isConnected);
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.igXuih);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.AkhnZx));
                return;
            case 3:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.isConnected);
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.igXuih);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.isConnected));
                return;
            case 4:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.values);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKgMxgjU)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.alsFma);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.values));
                return;
            case 5:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.values);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DGGHxk)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.alsFma);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.djBIcL));
                return;
            case 6:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.values);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DGGHxk)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.ORrpqH);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.fetchVPNInfo));
                return;
            case 7:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.isConnected);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DGGHxk)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.ORrpqH);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.DbNXlk));
                return;
            case 8:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.values);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DGGHxk)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.OWSZPf);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.fARcdN));
                return;
            case 9:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.values);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKgMxgjU)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.alsFma);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.v)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.gEmmrt));
                return;
            case 10:
                this.AEQbTJ.setBackgroundResource(mDC.StateListAnimator.values);
                this.AEQbTJ.setBackgroundTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DGGHxk)));
                this.AEQbTJ.setImageResource(C52761wXj.TaskDescription.iMXFZQ);
                this.AEQbTJ.setImageTintList(ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.svhCHd)));
                this.KWHzl.setText(C33070mpX.AYXKKw(mDC.PendingIntent.AuCTel));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void setDescription(String str) {
        if (str != null && C33129mqd.OLrzqt((CharSequence) str)) {
            this.OLrzqt.setVisibility(0);
            this.OLrzqt.setText(str);
        } else {
            this.OLrzqt.setVisibility(8);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OrderStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OrderStatus[] $VALUES;
        public static final OrderStatus COMPLETED = new OrderStatus("COMPLETED", 0);
        public static final OrderStatus PROCESSING = new OrderStatus("PROCESSING", 1);
        public static final OrderStatus PENDING = new OrderStatus(CardSyncResponse.PENDING, 2);
        public static final OrderStatus FAILED = new OrderStatus(CardSyncResponse.FAILED, 3);
        public static final OrderStatus CANCELED = new OrderStatus("CANCELED", 4);
        public static final OrderStatus REFUNDED = new OrderStatus("REFUNDED", 5);
        public static final OrderStatus REVERSING = new OrderStatus("REVERSING", 6);
        public static final OrderStatus REVERSED = new OrderStatus("REVERSED", 7);
        public static final OrderStatus EXPIRED = new OrderStatus("EXPIRED", 8);
        public static final OrderStatus UNKNOWN = new OrderStatus("UNKNOWN", 9);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OrderStatus[] $values() {
            return new OrderStatus[]{COMPLETED, PROCESSING, PENDING, FAILED, CANCELED, REFUNDED, REVERSING, REVERSED, EXPIRED, UNKNOWN};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OrderStatus> getEntries() {
            return $ENTRIES;
        }

        private OrderStatus(String str, int i) {
        }

        static {
            OrderStatus[] orderStatusArr$values = $values();
            $VALUES = orderStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(orderStatusArr$values);
        }

        public static OrderStatus valueOf(String str) {
            return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
        }

        public static OrderStatus[] values() {
            return (OrderStatus[]) $VALUES.clone();
        }
    }
}
