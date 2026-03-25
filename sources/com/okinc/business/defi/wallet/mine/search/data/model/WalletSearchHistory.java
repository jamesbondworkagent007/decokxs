package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.errorprone.annotations.Keep;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Serializable
public final class WalletSearchHistory {
    public final List<SearchHistoryItem> items;
    public final long lastUpdated;
    public final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SearchHistoryItem.Companion.serializer()), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletSearchHistory copy$default(WalletSearchHistory walletSearchHistory, String str, List list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSearchHistory.walletId;
        }
        if ((i & 2) != 0) {
            list = walletSearchHistory.items;
        }
        if ((i & 4) != 0) {
            j = walletSearchHistory.lastUpdated;
        }
        return walletSearchHistory.EZpvd(str, (List<? extends SearchHistoryItem>) list, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchHistoryItem> AEQbTJ() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchHistory EZpvd(@NotNull String str, @NotNull List<? extends SearchHistoryItem> list, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new WalletSearchHistory(str, list, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSearchHistory)) {
            return false;
        }
        WalletSearchHistory walletSearchHistory = (WalletSearchHistory) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletSearchHistory.walletId) && Intrinsics.EZpvd(this.items, walletSearchHistory.items) && this.lastUpdated == walletSearchHistory.lastUpdated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletId.hashCode() * 31) + this.items.hashCode()) * 31) + Long.hashCode(this.lastUpdated);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchHistory(walletId=" + this.walletId + ", items=" + this.items + ", lastUpdated=" + this.lastUpdated + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WalletSearchHistory> serializer() {
            return WalletSearchHistory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WalletSearchHistory(int i, String str, List list, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WalletSearchHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.walletId = str;
        if ((i & 2) == 0) {
            this.items = yDY.AhwBna();
        } else {
            this.items = list;
        }
        if ((i & 4) == 0) {
            this.lastUpdated = System.currentTimeMillis();
        } else {
            this.lastUpdated = j;
        }
    }

    public static final /* synthetic */ void EZpvd(WalletSearchHistory walletSearchHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, walletSearchHistory.walletId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(walletSearchHistory.items, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], walletSearchHistory.items);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && walletSearchHistory.lastUpdated == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, walletSearchHistory.lastUpdated);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem> */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletSearchHistory(@NotNull String str, @NotNull List<? extends SearchHistoryItem> list, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletId = str;
        this.items = list;
        this.lastUpdated = j;
    }
}
