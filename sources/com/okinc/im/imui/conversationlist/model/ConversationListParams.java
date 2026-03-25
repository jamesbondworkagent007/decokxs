package com.okinc.im.imui.conversationlist.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.im.bean.ChatOrigin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ConversationListParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ConversationListParams> CREATOR = new Creator();
    private final boolean enableImBizCheck;
    private final boolean enableNotifyPermissionCheck;
    private final boolean isShowBackButton;
    private final boolean isShowSearchBar;
    private final boolean isShowStartFirstChatBanner;
    private final boolean isShowToolbar;
    private final ChatOrigin origin;
    private final int recyclerviewLastItemPadding;
    private final boolean showNotificationsItem;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ConversationListParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversationListParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConversationListParams((ChatOrigin) parcel.readParcelable(ConversationListParams.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConversationListParams[] newArray(int i) {
            return new ConversationListParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConversationListParams() {
        this(null, false, false, false, 0, false, false, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatOrigin component1() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.enableImBizCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.enableNotifyPermissionCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showNotificationsItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.recyclerviewLastItemPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isShowToolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isShowBackButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isShowStartFirstChatBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isShowSearchBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConversationListParams copy(@NotNull ChatOrigin chatOrigin, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        return new ConversationListParams(chatOrigin, z, z2, z3, i, z4, z5, z6, z7);
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
        if (!(obj instanceof ConversationListParams)) {
            return false;
        }
        ConversationListParams conversationListParams = (ConversationListParams) obj;
        return this.origin == conversationListParams.origin && this.enableImBizCheck == conversationListParams.enableImBizCheck && this.enableNotifyPermissionCheck == conversationListParams.enableNotifyPermissionCheck && this.showNotificationsItem == conversationListParams.showNotificationsItem && this.recyclerviewLastItemPadding == conversationListParams.recyclerviewLastItemPadding && this.isShowToolbar == conversationListParams.isShowToolbar && this.isShowBackButton == conversationListParams.isShowBackButton && this.isShowStartFirstChatBanner == conversationListParams.isShowStartFirstChatBanner && this.isShowSearchBar == conversationListParams.isShowSearchBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableImBizCheck() {
        return this.enableImBizCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableNotifyPermissionCheck() {
        return this.enableNotifyPermissionCheck;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatOrigin getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRecyclerviewLastItemPadding() {
        return this.recyclerviewLastItemPadding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowNotificationsItem() {
        return this.showNotificationsItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.origin.hashCode() * 31) + Boolean.hashCode(this.enableImBizCheck)) * 31) + Boolean.hashCode(this.enableNotifyPermissionCheck)) * 31) + Boolean.hashCode(this.showNotificationsItem)) * 31) + Integer.hashCode(this.recyclerviewLastItemPadding)) * 31) + Boolean.hashCode(this.isShowToolbar)) * 31) + Boolean.hashCode(this.isShowBackButton)) * 31) + Boolean.hashCode(this.isShowStartFirstChatBanner)) * 31) + Boolean.hashCode(this.isShowSearchBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowBackButton() {
        return this.isShowBackButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowSearchBar() {
        return this.isShowSearchBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowStartFirstChatBanner() {
        return this.isShowStartFirstChatBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowToolbar() {
        return this.isShowToolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConversationListParams(origin=" + this.origin + ", enableImBizCheck=" + this.enableImBizCheck + ", enableNotifyPermissionCheck=" + this.enableNotifyPermissionCheck + ", showNotificationsItem=" + this.showNotificationsItem + ", recyclerviewLastItemPadding=" + this.recyclerviewLastItemPadding + ", isShowToolbar=" + this.isShowToolbar + ", isShowBackButton=" + this.isShowBackButton + ", isShowStartFirstChatBanner=" + this.isShowStartFirstChatBanner + ", isShowSearchBar=" + this.isShowSearchBar + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.origin, i);
        parcel.writeInt(this.enableImBizCheck ? 1 : 0);
        parcel.writeInt(this.enableNotifyPermissionCheck ? 1 : 0);
        parcel.writeInt(this.showNotificationsItem ? 1 : 0);
        parcel.writeInt(this.recyclerviewLastItemPadding);
        parcel.writeInt(this.isShowToolbar ? 1 : 0);
        parcel.writeInt(this.isShowBackButton ? 1 : 0);
        parcel.writeInt(this.isShowStartFirstChatBanner ? 1 : 0);
        parcel.writeInt(this.isShowSearchBar ? 1 : 0);
    }

    public ConversationListParams(@NotNull ChatOrigin chatOrigin, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(chatOrigin, "");
        this.origin = chatOrigin;
        this.enableImBizCheck = z;
        this.enableNotifyPermissionCheck = z2;
        this.showNotificationsItem = z3;
        this.recyclerviewLastItemPadding = i;
        this.isShowToolbar = z4;
        this.isShowBackButton = z5;
        this.isShowStartFirstChatBanner = z6;
        this.isShowSearchBar = z7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:com.okinc.im.bean.ChatOrigin:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:11) com.okinc.im.bean.ChatOrigin.CHAT com.okinc.im.bean.ChatOrigin) : (r12v0 com.okinc.im.bean.ChatOrigin))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 boolean) : true)
 A[MD:(com.okinc.im.bean.ChatOrigin, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean):void (m)] (LINE:10) call: com.okinc.im.imui.conversationlist.model.ConversationListParams.<init>(com.okinc.im.bean.ChatOrigin, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ ConversationListParams(ChatOrigin chatOrigin, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ChatOrigin.CHAT : chatOrigin, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? false : z5, (i2 & 128) == 0 ? z6 : false, (i2 & 256) == 0 ? z7 : true);
    }
}
