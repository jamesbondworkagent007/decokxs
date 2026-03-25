package com.okinc.core.ok_app.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class LiteNavigationTabEnum implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LiteNavigationTabEnum[] $VALUES;
    public static final CREATOR CREATOR;
    public static final LiteNavigationTabEnum LITE_HOME = new LiteNavigationTabEnum("LITE_HOME", 0);
    public static final LiteNavigationTabEnum LITE_MARKET = new LiteNavigationTabEnum("LITE_MARKET", 1);
    public static final LiteNavigationTabEnum LITE_MOVE_MONEY = new LiteNavigationTabEnum("LITE_MOVE_MONEY", 2);
    public static final LiteNavigationTabEnum LITE_EARN = new LiteNavigationTabEnum("LITE_EARN", 3);
    public static final LiteNavigationTabEnum LITE_PORTFOLIO = new LiteNavigationTabEnum("LITE_PORTFOLIO", 4);
    public static final LiteNavigationTabEnum LITE_TRADE = new LiteNavigationTabEnum("LITE_TRADE", 5);
    public static final LiteNavigationTabEnum LITE_DISCOVER = new LiteNavigationTabEnum("LITE_DISCOVER", 6);
    public static final LiteNavigationTabEnum WEB3_PAY = new LiteNavigationTabEnum("WEB3_PAY", 7);
    public static final LiteNavigationTabEnum ACTIVITY = new LiteNavigationTabEnum("ACTIVITY", 8);
    public static final LiteNavigationTabEnum HERO = new LiteNavigationTabEnum("HERO", 9);
    public static final LiteNavigationTabEnum LITE_SIMPLE_ACTIVITY = new LiteNavigationTabEnum("LITE_SIMPLE_ACTIVITY", 10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LiteNavigationTabEnum[] $values() {
        return new LiteNavigationTabEnum[]{LITE_HOME, LITE_MARKET, LITE_MOVE_MONEY, LITE_EARN, LITE_PORTFOLIO, LITE_TRADE, LITE_DISCOVER, WEB3_PAY, ACTIVITY, HERO, LITE_SIMPLE_ACTIVITY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LiteNavigationTabEnum> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private LiteNavigationTabEnum(String str, int i) {
    }

    static {
        LiteNavigationTabEnum[] liteNavigationTabEnumArr$values = $values();
        $VALUES = liteNavigationTabEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(liteNavigationTabEnumArr$values);
        CREATOR = new CREATOR(null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(ordinal());
    }

    public static final class CREATOR implements Parcelable.Creator<LiteNavigationTabEnum> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.core.ok_app.api.bean.LiteNavigationTabEnum.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LiteNavigationTabEnum createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            switch (parcel.readInt()) {
            }
            return LiteNavigationTabEnum.LITE_HOME;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LiteNavigationTabEnum[] newArray(int i) {
            return new LiteNavigationTabEnum[i];
        }
    }

    public static LiteNavigationTabEnum valueOf(String str) {
        return (LiteNavigationTabEnum) Enum.valueOf(LiteNavigationTabEnum.class, str);
    }

    public static LiteNavigationTabEnum[] values() {
        return (LiteNavigationTabEnum[]) $VALUES.clone();
    }
}
