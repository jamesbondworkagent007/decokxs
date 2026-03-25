package com.okinc.business.defi.wallet.common.tonconnect.model.request;

import android.net.Uri;
import android.os.Bundle;
import com.ibm.icu.text.DateFormat;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppInitialRequest {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final String AEQbTJ;
    public final int AYXKKw;
    public final String KWHzl;
    public final String OLrzqt;
    public final ConnectRequest copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DAppInitialRequest copy$default(DAppInitialRequest dAppInitialRequest, int i, String str, ConnectRequest connectRequest, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dAppInitialRequest.AYXKKw;
        }
        if ((i2 & 2) != 0) {
            str = dAppInitialRequest.AEQbTJ;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            connectRequest = dAppInitialRequest.copydefault;
        }
        ConnectRequest connectRequest2 = connectRequest;
        if ((i2 & 8) != 0) {
            str2 = dAppInitialRequest.OLrzqt;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = dAppInitialRequest.KWHzl;
        }
        return dAppInitialRequest.KWHzl(i, str4, connectRequest2, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInitialRequest KWHzl(int i, @NotNull String str, @NotNull ConnectRequest connectRequest, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(connectRequest, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DAppInitialRequest(i, str, connectRequest, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConnectRequest OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppInitialRequest)) {
            return false;
        }
        DAppInitialRequest dAppInitialRequest = (DAppInitialRequest) obj;
        return this.AYXKKw == dAppInitialRequest.AYXKKw && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) dAppInitialRequest.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, dAppInitialRequest.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) dAppInitialRequest.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) dAppInitialRequest.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.AYXKKw);
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        String str = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppInitialRequest(version=" + this.AYXKKw + ", id=" + this.AEQbTJ + ", connectRequest=" + this.copydefault + ", ret=" + this.OLrzqt + ", origin=" + this.KWHzl + ")";
    }

    public DAppInitialRequest(int i, @NotNull String str, @NotNull ConnectRequest connectRequest, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(connectRequest, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AYXKKw = i;
        this.AEQbTJ = str;
        this.copydefault = connectRequest;
        this.OLrzqt = str2;
        this.KWHzl = str3;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final DAppInitialRequest KWHzl(@NotNull Uri uri, @NotNull Json json, @NotNull String str) {
            Intrinsics.checkNotNullParameter(uri, "");
            Intrinsics.checkNotNullParameter(json, "");
            Intrinsics.checkNotNullParameter(str, "");
            String queryParameter = uri.getQueryParameter(DateFormat.ABBR_GENERIC_TZ);
            Integer num = null;
            Integer numValueOf = queryParameter != null ? Integer.valueOf(C33129mqd.AhwBna(queryParameter)) : null;
            if (numValueOf != null && numValueOf.intValue() == 2) {
                num = numValueOf;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                String queryParameter2 = uri.getQueryParameter("id");
                if (queryParameter2 == null) {
                    throw new IllegalArgumentException("id is required");
                }
                String queryParameter3 = uri.getQueryParameter("r");
                if (queryParameter3 != null) {
                    json.getSerializersModule();
                    ConnectRequest connectRequest = (ConnectRequest) json.decodeFromString(BuiltinSerializersKt.getNullable(ConnectRequest.Companion.serializer()), queryParameter3);
                    if (connectRequest != null) {
                        return new DAppInitialRequest(iIntValue, queryParameter2, connectRequest, uri.getQueryParameter("ret"), str);
                    }
                }
                throw new IllegalArgumentException("r is required");
            }
            throw new IllegalArgumentException("Only TonConnectV2 is supported");
        }

        public final DAppInitialRequest AEQbTJ(@NotNull Bundle bundle, @NotNull Json json, @NotNull String str) {
            Intrinsics.checkNotNullParameter(bundle, "");
            Intrinsics.checkNotNullParameter(json, "");
            Intrinsics.checkNotNullParameter(str, "");
            Integer numValueOf = Integer.valueOf(bundle.getInt(DateFormat.ABBR_GENERIC_TZ));
            if (numValueOf.intValue() != 2) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                String string = bundle.getString("id");
                if (string == null) {
                    throw new IllegalArgumentException("id is required");
                }
                String string2 = bundle.getString("r");
                if (string2 != null) {
                    json.getSerializersModule();
                    ConnectRequest connectRequest = (ConnectRequest) json.decodeFromString(BuiltinSerializersKt.getNullable(ConnectRequest.Companion.serializer()), string2);
                    if (connectRequest != null) {
                        return new DAppInitialRequest(iIntValue, string, connectRequest, bundle.getString("ret"), str);
                    }
                }
                throw new IllegalArgumentException("r is required");
            }
            throw new IllegalArgumentException("Only TonConnectV2 is supported");
        }
    }

    @Serializable
    public static final class ConnectRequest {
        private final List<Item> items;
        private final String manifestUrl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DAppInitialRequest$ConnectRequest$Item$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest$ConnectRequest */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConnectRequest copy$default(ConnectRequest connectRequest, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = connectRequest.manifestUrl;
            }
            if ((i & 2) != 0) {
                list = connectRequest.items;
            }
            return connectRequest.copy(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.manifestUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Item> component2() {
            return this.items;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConnectRequest copy(@NotNull String str, @NotNull List<Item> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new ConnectRequest(str, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectRequest)) {
                return false;
            }
            ConnectRequest connectRequest = (ConnectRequest) obj;
            return Intrinsics.EZpvd((Object) this.manifestUrl, (Object) connectRequest.manifestUrl) && Intrinsics.EZpvd(this.items, connectRequest.items);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Item> getItems() {
            return this.items;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getManifestUrl() {
            return this.manifestUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.manifestUrl.hashCode() * 31) + this.items.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConnectRequest(manifestUrl=" + this.manifestUrl + ", items=" + this.items + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest.ConnectRequest.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ConnectRequest> serializer() {
                return DAppInitialRequest$ConnectRequest$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ConnectRequest(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, DAppInitialRequest$ConnectRequest$$serializer.INSTANCE.getDescriptor());
            }
            this.manifestUrl = str;
            this.items = list;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ConnectRequest connectRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            compositeEncoder.encodeStringElement(serialDescriptor, 0, connectRequest.manifestUrl);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], connectRequest.items);
        }

        public ConnectRequest(@NotNull String str, @NotNull List<Item> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.manifestUrl = str;
            this.items = list;
        }

        @Serializable
        public static final class Item {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String name;
            private final String payload;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Item copy$default(Item item, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = item.name;
                }
                if ((i & 2) != 0) {
                    str2 = item.payload;
                }
                return item.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.payload;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Item copy(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Item(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Item)) {
                    return false;
                }
                Item item = (Item) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) item.name) && Intrinsics.EZpvd((Object) this.payload, (Object) item.payload);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPayload() {
                return this.payload;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.name.hashCode();
                String str = this.payload;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Item(name=" + this.name + ", payload=" + this.payload + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest.ConnectRequest.Item.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Item> serializer() {
                    return DAppInitialRequest$ConnectRequest$Item$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Item(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, DAppInitialRequest$ConnectRequest$Item$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
                if ((i & 2) == 0) {
                    this.payload = null;
                } else {
                    this.payload = str2;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Item item, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, item.name);
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && item.payload == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, item.payload);
            }

            public Item(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                this.name = str;
                this.payload = str2;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:62) call: com.okinc.business.defi.wallet.common.tonconnect.model.request.DAppInitialRequest.ConnectRequest.Item.<init>(java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ Item(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2);
            }

            public final boolean isTonAddr() {
                return Intrinsics.EZpvd((Object) this.name, (Object) "ton_addr");
            }

            public final boolean isTonProof() {
                return Intrinsics.EZpvd((Object) this.name, (Object) "ton_proof");
            }
        }
    }
}
