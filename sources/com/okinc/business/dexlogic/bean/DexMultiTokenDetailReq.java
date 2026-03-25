package com.okinc.business.dexlogic.bean;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class DexMultiTokenDetailReq {
    private List<DexMultiTokenDetailParam> tokenDetailList;
    private String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DexMultiTokenDetailParam$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexMultiTokenDetailReq() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexMultiTokenDetailReq copy$default(DexMultiTokenDetailReq dexMultiTokenDetailReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexMultiTokenDetailReq.userUniqueId;
        }
        if ((i & 2) != 0) {
            list = dexMultiTokenDetailReq.tokenDetailList;
        }
        return dexMultiTokenDetailReq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenDetailParam> component2() {
        return this.tokenDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenDetailReq copy(@NotNull String str, @NotNull List<DexMultiTokenDetailParam> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new DexMultiTokenDetailReq(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexMultiTokenDetailReq)) {
            return false;
        }
        DexMultiTokenDetailReq dexMultiTokenDetailReq = (DexMultiTokenDetailReq) obj;
        return Intrinsics.EZpvd((Object) this.userUniqueId, (Object) dexMultiTokenDetailReq.userUniqueId) && Intrinsics.EZpvd(this.tokenDetailList, dexMultiTokenDetailReq.tokenDetailList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenDetailParam> getTokenDetailList() {
        return this.tokenDetailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.userUniqueId.hashCode() * 31) + this.tokenDetailList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenDetailList(@NotNull List<DexMultiTokenDetailParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tokenDetailList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserUniqueId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userUniqueId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexMultiTokenDetailReq(userUniqueId=" + this.userUniqueId + ", tokenDetailList=" + this.tokenDetailList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexMultiTokenDetailReq> serializer() {
            return DexMultiTokenDetailReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexMultiTokenDetailReq(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.userUniqueId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.tokenDetailList = new ArrayList();
        } else {
            this.tokenDetailList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexMultiTokenDetailReq dexMultiTokenDetailReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexMultiTokenDetailReq.userUniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexMultiTokenDetailReq.userUniqueId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(dexMultiTokenDetailReq.tokenDetailList, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], dexMultiTokenDetailReq.tokenDetailList);
    }

    public DexMultiTokenDetailReq(@NotNull String str, @NotNull List<DexMultiTokenDetailParam> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.userUniqueId = str;
        this.tokenDetailList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:331) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenDetailParam>):void (m)] (LINE:329) call: com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ DexMultiTokenDetailReq(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list);
    }
}
