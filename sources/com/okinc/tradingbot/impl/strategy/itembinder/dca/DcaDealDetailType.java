package com.okinc.tradingbot.impl.strategy.itembinder.dca;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcaDealDetailType extends TransDetailsData {
    public static final Parcelable.Creator<DcaDealDetailType> CREATOR = new Creator();
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<DcaDealDetailType> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaDealDetailType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DcaDealDetailType(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcaDealDetailType[] newArray(int i) {
            return new DcaDealDetailType[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.bot.data.TransDetailsData, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DcaDealDetailType(@NotNull String str) {
        super(str, "", "", new ArrayList(), null, null, null, null, 0, false, null, null, null, null, null, null, false, 0, 262128, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }
}
