package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RechargeFromType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RechargeFromType[] $VALUES;
    public static final Parcelable.Creator<RechargeFromType> CREATOR;
    public static final Activity Companion;
    private final String fromSource;
    public static final RechargeFromType DEPOSIT_PAGE = new RechargeFromType("DEPOSIT_PAGE", 0, "deposit_page");
    public static final RechargeFromType ASSET_FUNDINGTAB_CRYPTODETAILS = new RechargeFromType("ASSET_FUNDINGTAB_CRYPTODETAILS", 1, "asset_fundingtab_cryptodetails");
    public static final RechargeFromType ENCOURAGE_PAGE = new RechargeFromType("ENCOURAGE_PAGE", 2, "encourage_page");
    public static final RechargeFromType ASSET_FUNDINGTAB_CANNOT_WITH_DRAW_ASSETS = new RechargeFromType("ASSET_FUNDINGTAB_CANNOT_WITH_DRAW_ASSETS", 3, "cannot_withdraw");
    public static final RechargeFromType INSUFFICIENT_FUND_FOR_FEE = new RechargeFromType("INSUFFICIENT_FUND_FOR_FEE", 4, "insufficient_fund_for_fee");
    public static final RechargeFromType HOME = new RechargeFromType("HOME", 5, "home_page");
    public static final RechargeFromType OVERVIEW = new RechargeFromType("OVERVIEW", 6, "overview");
    public static final RechargeFromType FUNDING = new RechargeFromType("FUNDING", 7, "funding");
    public static final RechargeFromType VIP_LANDING_PAGE = new RechargeFromType("VIP_LANDING_PAGE", 8, "viplandingpage");
    public static final RechargeFromType OTHER = new RechargeFromType("OTHER", 9, "other");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RechargeFromType[] $values() {
        return new RechargeFromType[]{DEPOSIT_PAGE, ASSET_FUNDINGTAB_CRYPTODETAILS, ENCOURAGE_PAGE, ASSET_FUNDINGTAB_CANNOT_WITH_DRAW_ASSETS, INSUFFICIENT_FUND_FOR_FEE, HOME, OVERVIEW, FUNDING, VIP_LANDING_PAGE, OTHER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RechargeFromType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSource() {
        return this.fromSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private RechargeFromType(String str, int i, String str2) {
        this.fromSource = str2;
    }

    static {
        RechargeFromType[] rechargeFromTypeArr$values = $values();
        $VALUES = rechargeFromTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(rechargeFromTypeArr$values);
        Companion = new Activity(null);
        CREATOR = new Parcelable.Creator<RechargeFromType>() { // from class: com.okinc.assets.api.model.RechargeFromType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RechargeFromType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return RechargeFromType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RechargeFromType[] newArray(int i) {
                return new RechargeFromType[i];
            }
        };
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.api.model.RechargeFromType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static RechargeFromType valueOf(String str) {
        return (RechargeFromType) Enum.valueOf(RechargeFromType.class, str);
    }

    public static RechargeFromType[] values() {
        return (RechargeFromType[]) $VALUES.clone();
    }
}
