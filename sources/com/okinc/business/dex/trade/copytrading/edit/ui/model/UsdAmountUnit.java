package com.okinc.business.dex.trade.copytrading.edit.ui.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class UsdAmountUnit implements RangeFilterUnit {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UsdAmountUnit[] $VALUES;
    public static final Parcelable.Creator<UsdAmountUnit> CREATOR;
    public static final StateListAnimator Companion;
    public static final UsdAmountUnit K = new UsdAmountUnit("K", 0, "k", 1000, C23274hvD.Fragment.GLcwwN);
    private final long scale;
    private final int textResId;
    private final String unitValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UsdAmountUnit[] $values() {
        return new UsdAmountUnit[]{K};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UsdAmountUnit> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public long getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public String getUnitValue() {
        return this.unitValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private UsdAmountUnit(String str, int i, String str2, long j, int i2) {
        this.unitValue = str2;
        this.scale = j;
        this.textResId = i2;
    }

    static {
        UsdAmountUnit[] usdAmountUnitArr$values = $values();
        $VALUES = usdAmountUnitArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(usdAmountUnitArr$values);
        Companion = new StateListAnimator(null);
        CREATOR = new Parcelable.Creator<UsdAmountUnit>() { // from class: com.okinc.business.dex.trade.copytrading.edit.ui.model.UsdAmountUnit.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UsdAmountUnit createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return UsdAmountUnit.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UsdAmountUnit[] newArray(int i) {
                return new UsdAmountUnit[i];
            }
        };
    }

    @Override // com.okinc.business.dex.trade.copytrading.edit.ui.model.RangeFilterUnit
    public String getText(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        String string = context.getString(this.textResId);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.copytrading.edit.ui.model.UsdAmountUnit.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static UsdAmountUnit valueOf(String str) {
        return (UsdAmountUnit) Enum.valueOf(UsdAmountUnit.class, str);
    }

    public static UsdAmountUnit[] values() {
        return (UsdAmountUnit[]) $VALUES.clone();
    }
}
