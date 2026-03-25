package com.okinc.dexkline.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class TokenBase implements Parcelable {
    public static final String COIN_DETAIL_TAB_AUDIT = "audit";
    public static final String COIN_DETAIL_TAB_CHARTS = "charts";
    public static final String COIN_DETAIL_TAB_DEFAULT = "default";
    public static final String COIN_DETAIL_TAB_EARN = "earn";
    public static final String COIN_DETAIL_TAB_FEEDS = "feeds";
    public static final String COIN_DETAIL_TAB_INFO = "info";
    public static final String SOURCE_CEFI_SEARCH = "cefi_search";
    public static final String SOURCE_DEFI_EARN = "defi_earn";
    public static final String SOURCE_HOT_SEARCH = "hot_search";
    public static final String SOURCE_K_HEAD = "view_details";
    public static final String SOURCE_MARKET_RANK_FULL = "full_list";
    public static final String SOURCE_MEME_MODE = "meme_mode";
    public static final String SOURCE_MODULE_LIST = "module_list";
    public static final String SOURCE_SEARCH_RESULT = "search";
    public static final String SOURCE_UNKNOWN = "Unknown";
    public static final String SOURCE_WALLET_ASSET = "wallet_asset";
    public static final String TYPE_ADVANCED_MODE = "type_cefi";
    public static final String TYPE_BRIDGE = "type_bridge";
    public static final String TYPE_LIMIT = "type_limit";
    public static final String TYPE_MEME_COIN = "type_meme";
    public static final String TYPE_MEME_MODE = "type_meme";
    public static final String TYPE_SWAP = "type_swap";
    private final String chainBWLogoUrl;
    private final String chainId;
    private final String chainLogoUrl;
    private String chainName;
    private final int decimals;
    private String eventSource;
    private final boolean fromTrading;
    private final int isCollected;
    private final int isCustomToken;
    private final boolean isHighRisk;
    private int isHoneypot;
    private String isLeveraged;
    private int isSafeMoonToken;
    private final int isSubscribe;
    private boolean localIsNeedRequestNet;
    private String marketTabName;
    private final String moduleNameEnglish;
    private final String referralCode;
    private final String riskControlLevel;
    private boolean showSourceAlert;
    private String source;
    private final String sourcePageName;
    private final int srcType;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSource;
    private final String tokenSymbol;
    private String type;
    private final String uniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenBase> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenBase> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenBase createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenBase(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenBase[] newArray(int i) {
            return new TokenBase[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenBase() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str) {
        this(str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741822, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2) {
        this(str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741820, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(str, str2, str3, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741816, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this(str, str2, str3, str4, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741808, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this(str, str2, str3, str4, str5, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741792, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        this(str, str2, str3, str4, str5, str6, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741760, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        this(str, str2, str3, str4, str5, str6, str7, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741696, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i) {
        this(str, str2, str3, str4, str5, str6, str7, i, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741568, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073741312, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073740800, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073739776, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073737728, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073733632, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073725440, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, (String) null, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073709056, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, (String) null, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073676288, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, 0, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073610752, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, 0, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073479680, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, false, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1073217536, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, (String) null, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1072693248, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, (String) null, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1071644672, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, false, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1069547520, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, false, (String) null, (String) null, 0, false, (String) null, (String) null, 1065353216, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, (String) null, (String) null, 0, false, (String) null, (String) null, 1056964608, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, str16, (String) null, 0, false, (String) null, (String) null, 1040187392, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16, @NotNull String str17) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, str16, str17, 0, false, (String) null, (String) null, 1006632960, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16, @NotNull String str17, int i7) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, str16, str17, i7, false, (String) null, (String) null, 939524096, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16, @NotNull String str17, int i7, boolean z4) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, str16, str17, i7, z4, (String) null, (String) null, C.ENCODING_PCM_32BIT, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16, @NotNull String str17, int i7, boolean z4, String str18) {
        this(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, str16, str17, i7, z4, str18, (String) null, 536870912, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.tokenSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.isLeveraged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.localIsNeedRequestNet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.eventSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.marketTabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.showSourceAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component24() {
        return this.fromTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.moduleNameEnglish;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.sourcePageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component27() {
        return this.srcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component28() {
        return this.isHighRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.isCollected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenBase copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16, @NotNull String str17, int i7, boolean z4, String str18, @NotNull String str19) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new TokenBase(str, str2, str3, str4, str5, str6, str7, i, i2, i3, i4, str8, str9, str10, str11, str12, str13, i5, i6, z, str14, str15, z2, z3, str16, str17, i7, z4, str18, str19);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenBase)) {
            return false;
        }
        TokenBase tokenBase = (TokenBase) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) tokenBase.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenBase.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) tokenBase.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) tokenBase.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) tokenBase.chainBWLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenBase.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenBase.tokenName) && this.isCollected == tokenBase.isCollected && this.decimals == tokenBase.decimals && this.isCustomToken == tokenBase.isCustomToken && this.isSubscribe == tokenBase.isSubscribe && Intrinsics.EZpvd((Object) this.uniqueId, (Object) tokenBase.uniqueId) && Intrinsics.EZpvd((Object) this.source, (Object) tokenBase.source) && Intrinsics.EZpvd((Object) this.tokenSource, (Object) tokenBase.tokenSource) && Intrinsics.EZpvd((Object) this.type, (Object) tokenBase.type) && Intrinsics.EZpvd((Object) this.chainName, (Object) tokenBase.chainName) && Intrinsics.EZpvd((Object) this.isLeveraged, (Object) tokenBase.isLeveraged) && this.isSafeMoonToken == tokenBase.isSafeMoonToken && this.isHoneypot == tokenBase.isHoneypot && this.localIsNeedRequestNet == tokenBase.localIsNeedRequestNet && Intrinsics.EZpvd((Object) this.eventSource, (Object) tokenBase.eventSource) && Intrinsics.EZpvd((Object) this.marketTabName, (Object) tokenBase.marketTabName) && this.showSourceAlert == tokenBase.showSourceAlert && this.fromTrading == tokenBase.fromTrading && Intrinsics.EZpvd((Object) this.moduleNameEnglish, (Object) tokenBase.moduleNameEnglish) && Intrinsics.EZpvd((Object) this.sourcePageName, (Object) tokenBase.sourcePageName) && this.srcType == tokenBase.srcType && this.isHighRisk == tokenBase.isHighRisk && Intrinsics.EZpvd((Object) this.referralCode, (Object) tokenBase.referralCode) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) tokenBase.riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainBWLogoUrl() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventSource() {
        return this.eventSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromTrading() {
        return this.fromTrading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalIsNeedRequestNet() {
        return this.localIsNeedRequestNet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketTabName() {
        return this.marketTabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModuleNameEnglish() {
        return this.moduleNameEnglish;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskControlLevel() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowSourceAlert() {
        return this.showSourceAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourcePageName() {
        return this.sourcePageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSrcType() {
        return this.srcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSource() {
        return this.tokenSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.tokenContractAddress.hashCode();
        int iHashCode3 = this.tokenLogoUrl.hashCode();
        int iHashCode4 = this.chainLogoUrl.hashCode();
        int iHashCode5 = this.chainBWLogoUrl.hashCode();
        int iHashCode6 = this.tokenSymbol.hashCode();
        int iHashCode7 = this.tokenName.hashCode();
        int iHashCode8 = Integer.hashCode(this.isCollected);
        int iHashCode9 = Integer.hashCode(this.decimals);
        int iHashCode10 = Integer.hashCode(this.isCustomToken);
        int iHashCode11 = Integer.hashCode(this.isSubscribe);
        int iHashCode12 = this.uniqueId.hashCode();
        int iHashCode13 = this.source.hashCode();
        int iHashCode14 = this.tokenSource.hashCode();
        int iHashCode15 = this.type.hashCode();
        int iHashCode16 = this.chainName.hashCode();
        int iHashCode17 = this.isLeveraged.hashCode();
        int iHashCode18 = Integer.hashCode(this.isSafeMoonToken);
        int iHashCode19 = Integer.hashCode(this.isHoneypot);
        int iHashCode20 = Boolean.hashCode(this.localIsNeedRequestNet);
        int iHashCode21 = this.eventSource.hashCode();
        int iHashCode22 = this.marketTabName.hashCode();
        int iHashCode23 = Boolean.hashCode(this.showSourceAlert);
        int iHashCode24 = Boolean.hashCode(this.fromTrading);
        int iHashCode25 = this.moduleNameEnglish.hashCode();
        int iHashCode26 = this.sourcePageName.hashCode();
        int iHashCode27 = Integer.hashCode(this.srcType);
        int iHashCode28 = Boolean.hashCode(this.isHighRisk);
        String str = this.referralCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.riskControlLevel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCollected() {
        return this.isCollected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCustomToken() {
        return this.isCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHighRisk() {
        return this.isHighRisk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isHoneypot() {
        return this.isHoneypot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHoneypotToken() {
        return this.isHoneypot == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isLeveraged() {
        return this.isLeveraged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNeedRequestNet() {
        return this.localIsNeedRequestNet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSafeMoonCoinToken() {
        return this.isSafeMoonToken == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSafeMoonToken() {
        return this.isSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isSubscribe() {
        return this.isSubscribe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoneypot(int i) {
        this.isHoneypot = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeveraged(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isLeveraged = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalIsNeedRequestNet(boolean z) {
        this.localIsNeedRequestNet = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketTabName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marketTabName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSafeMoonToken(int i) {
        this.isSafeMoonToken = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowSourceAlert(boolean z) {
        this.showSourceAlert = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenBase(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", isCollected=" + this.isCollected + ", decimals=" + this.decimals + ", isCustomToken=" + this.isCustomToken + ", isSubscribe=" + this.isSubscribe + ", uniqueId=" + this.uniqueId + ", source=" + this.source + ", tokenSource=" + this.tokenSource + ", type=" + this.type + ", chainName=" + this.chainName + ", isLeveraged=" + this.isLeveraged + ", isSafeMoonToken=" + this.isSafeMoonToken + ", isHoneypot=" + this.isHoneypot + ", localIsNeedRequestNet=" + this.localIsNeedRequestNet + ", eventSource=" + this.eventSource + ", marketTabName=" + this.marketTabName + ", showSourceAlert=" + this.showSourceAlert + ", fromTrading=" + this.fromTrading + ", moduleNameEnglish=" + this.moduleNameEnglish + ", sourcePageName=" + this.sourcePageName + ", srcType=" + this.srcType + ", isHighRisk=" + this.isHighRisk + ", referralCode=" + this.referralCode + ", riskControlLevel=" + this.riskControlLevel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.chainBWLogoUrl);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenName);
        parcel.writeInt(this.isCollected);
        parcel.writeInt(this.decimals);
        parcel.writeInt(this.isCustomToken);
        parcel.writeInt(this.isSubscribe);
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.source);
        parcel.writeString(this.tokenSource);
        parcel.writeString(this.type);
        parcel.writeString(this.chainName);
        parcel.writeString(this.isLeveraged);
        parcel.writeInt(this.isSafeMoonToken);
        parcel.writeInt(this.isHoneypot);
        parcel.writeInt(this.localIsNeedRequestNet ? 1 : 0);
        parcel.writeString(this.eventSource);
        parcel.writeString(this.marketTabName);
        parcel.writeInt(this.showSourceAlert ? 1 : 0);
        parcel.writeInt(this.fromTrading ? 1 : 0);
        parcel.writeString(this.moduleNameEnglish);
        parcel.writeString(this.sourcePageName);
        parcel.writeInt(this.srcType);
        parcel.writeInt(this.isHighRisk ? 1 : 0);
        parcel.writeString(this.referralCode);
        parcel.writeString(this.riskControlLevel);
    }

    public /* synthetic */ TokenBase(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, int i3, int i4, int i5, String str8, String str9, String str10, String str11, String str12, String str13, int i6, int i7, boolean z, String str14, String str15, boolean z2, boolean z3, String str16, String str17, int i8, boolean z4, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str3;
        }
        if ((i & 8) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str4;
        }
        if ((i & 16) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str5;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 64) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str7;
        }
        if ((i & 128) == 0) {
            this.isCollected = 0;
        } else {
            this.isCollected = i2;
        }
        if ((i & 256) == 0) {
            this.decimals = 0;
        } else {
            this.decimals = i3;
        }
        if ((i & 512) == 0) {
            this.isCustomToken = 0;
        } else {
            this.isCustomToken = i4;
        }
        if ((i & 1024) == 0) {
            this.isSubscribe = 0;
        } else {
            this.isSubscribe = i5;
        }
        if ((i & 2048) == 0) {
            this.uniqueId = "";
        } else {
            this.uniqueId = str8;
        }
        this.source = (i & 4096) == 0 ? "Unknown" : str9;
        if ((i & 8192) == 0) {
            this.tokenSource = "";
        } else {
            this.tokenSource = str10;
        }
        this.type = (i & 16384) == 0 ? "type_swap" : str11;
        if ((32768 & i) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str12;
        }
        if ((65536 & i) == 0) {
            this.isLeveraged = "";
        } else {
            this.isLeveraged = str13;
        }
        if ((131072 & i) == 0) {
            this.isSafeMoonToken = 0;
        } else {
            this.isSafeMoonToken = i6;
        }
        if ((262144 & i) == 0) {
            this.isHoneypot = 0;
        } else {
            this.isHoneypot = i7;
        }
        if ((524288 & i) == 0) {
            this.localIsNeedRequestNet = true;
        } else {
            this.localIsNeedRequestNet = z;
        }
        if ((1048576 & i) == 0) {
            this.eventSource = "";
        } else {
            this.eventSource = str14;
        }
        this.marketTabName = (2097152 & i) == 0 ? "default" : str15;
        if ((4194304 & i) == 0) {
            this.showSourceAlert = true;
        } else {
            this.showSourceAlert = z2;
        }
        if ((8388608 & i) == 0) {
            this.fromTrading = false;
        } else {
            this.fromTrading = z3;
        }
        if ((16777216 & i) == 0) {
            this.moduleNameEnglish = "";
        } else {
            this.moduleNameEnglish = str16;
        }
        if ((33554432 & i) == 0) {
            this.sourcePageName = "";
        } else {
            this.sourcePageName = str17;
        }
        if ((67108864 & i) == 0) {
            this.srcType = 0;
        } else {
            this.srcType = i8;
        }
        if ((134217728 & i) == 0) {
            this.isHighRisk = false;
        } else {
            this.isHighRisk = z4;
        }
        this.referralCode = (268435456 & i) == 0 ? null : str18;
        this.riskControlLevel = (i & 536870912) == 0 ? "0" : str19;
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_api(TokenBase tokenBase, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenBase.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenBase.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenBase.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenBase.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tokenBase.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tokenBase.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tokenBase.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tokenBase.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenBase.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tokenBase.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tokenBase.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenBase.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tokenBase.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tokenBase.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || tokenBase.isCollected != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, tokenBase.isCollected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || tokenBase.decimals != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, tokenBase.decimals);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || tokenBase.isCustomToken != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, tokenBase.isCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || tokenBase.isSubscribe != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, tokenBase.isSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tokenBase.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tokenBase.uniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tokenBase.source, (Object) "Unknown")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tokenBase.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tokenBase.tokenSource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tokenBase.tokenSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tokenBase.type, (Object) "type_swap")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tokenBase.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tokenBase.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tokenBase.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tokenBase.isLeveraged, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tokenBase.isLeveraged);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || tokenBase.isSafeMoonToken != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, tokenBase.isSafeMoonToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || tokenBase.isHoneypot != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 18, tokenBase.isHoneypot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !tokenBase.localIsNeedRequestNet) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, tokenBase.localIsNeedRequestNet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) tokenBase.eventSource, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, tokenBase.eventSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tokenBase.marketTabName, (Object) "default")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tokenBase.marketTabName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !tokenBase.showSourceAlert) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 22, tokenBase.showSourceAlert);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || tokenBase.fromTrading) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 23, tokenBase.fromTrading);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) tokenBase.moduleNameEnglish, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, tokenBase.moduleNameEnglish);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) tokenBase.sourcePageName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, tokenBase.sourcePageName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || tokenBase.srcType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 26, tokenBase.srcType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || tokenBase.isHighRisk) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 27, tokenBase.isHighRisk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || tokenBase.referralCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, tokenBase.referralCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && Intrinsics.EZpvd((Object) tokenBase.riskControlLevel, (Object) "0")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 29, tokenBase.riskControlLevel);
    }

    public TokenBase(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, int i2, int i3, int i4, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, int i5, int i6, boolean z, @NotNull String str14, @NotNull String str15, boolean z2, boolean z3, @NotNull String str16, @NotNull String str17, int i7, boolean z4, String str18, @NotNull String str19) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.tokenLogoUrl = str3;
        this.chainLogoUrl = str4;
        this.chainBWLogoUrl = str5;
        this.tokenSymbol = str6;
        this.tokenName = str7;
        this.isCollected = i;
        this.decimals = i2;
        this.isCustomToken = i3;
        this.isSubscribe = i4;
        this.uniqueId = str8;
        this.source = str9;
        this.tokenSource = str10;
        this.type = str11;
        this.chainName = str12;
        this.isLeveraged = str13;
        this.isSafeMoonToken = i5;
        this.isHoneypot = i6;
        this.localIsNeedRequestNet = z;
        this.eventSource = str14;
        this.marketTabName = str15;
        this.showSourceAlert = z2;
        this.fromTrading = z3;
        this.moduleNameEnglish = str16;
        this.sourcePageName = str17;
        this.srcType = i7;
        this.isHighRisk = z4;
        this.referralCode = str18;
        this.riskControlLevel = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0164: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r62v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r62v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r62v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r62v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r62v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r62v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r62v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r62v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r62v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r40v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r62v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r62v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r42v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r62v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r62v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("Unknown") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r62v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r62v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("type_swap") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r62v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r62v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0099: ARITH (r62v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r49v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r62v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r50v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00af: ARITH (r62v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? true : (r51v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bc: ARITH (r62v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c7: ARITH (r62v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("default") : (r53v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r62v0 int) & (4194304 int) A[WRAPPED]) == (0 int)) ? (r54v0 boolean) : true)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00db: ARITH (r62v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r55v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e6: ARITH (r62v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f1: ARITH (r62v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00fc: ARITH (r62v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r58v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0107: ARITH (r62v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? false : (r59v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0112: ARITH (r62v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011d: ARITH (r62v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("0") : (r61v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.dexkline.dex.api.bean.TokenBase.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenBase(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, int i4, String str8, String str9, String str10, String str11, String str12, String str13, int i5, int i6, boolean z, String str14, String str15, boolean z2, boolean z3, String str16, String str17, int i7, boolean z4, String str18, String str19, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? "" : str4, (i8 & 16) != 0 ? "" : str5, (i8 & 32) != 0 ? "" : str6, (i8 & 64) != 0 ? "" : str7, (i8 & 128) != 0 ? 0 : i, (i8 & 256) != 0 ? 0 : i2, (i8 & 512) != 0 ? 0 : i3, (i8 & 1024) != 0 ? 0 : i4, (i8 & 2048) != 0 ? "" : str8, (i8 & 4096) != 0 ? "Unknown" : str9, (i8 & 8192) != 0 ? "" : str10, (i8 & 16384) != 0 ? "type_swap" : str11, (i8 & 32768) != 0 ? "" : str12, (i8 & 65536) != 0 ? "" : str13, (i8 & 131072) != 0 ? 0 : i5, (i8 & 262144) != 0 ? 0 : i6, (i8 & 524288) != 0 ? true : z, (i8 & 1048576) != 0 ? "" : str14, (i8 & 2097152) != 0 ? "default" : str15, (i8 & 4194304) == 0 ? z2 : true, (i8 & 8388608) != 0 ? false : z3, (i8 & 16777216) != 0 ? "" : str16, (i8 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str17, (i8 & 67108864) != 0 ? 0 : i7, (i8 & 134217728) != 0 ? false : z4, (i8 & 268435456) != 0 ? null : str18, (i8 & 536870912) != 0 ? "0" : str19);
    }

    public final boolean isLeverage() {
        return Intrinsics.EZpvd((Object) this.isLeveraged, (Object) "1");
    }

    public final boolean isRiskToken() {
        return isLeverage();
    }

    public final boolean isMemeToken() {
        return Intrinsics.EZpvd((Object) this.type, (Object) "type_meme");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dex.api.bean.TokenBase.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TokenBase> serializer() {
            return TokenBase$$serializer.INSTANCE;
        }
    }
}
