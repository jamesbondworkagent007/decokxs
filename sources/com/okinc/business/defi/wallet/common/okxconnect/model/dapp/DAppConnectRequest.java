package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo$$serializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C15995eba;
import o.C56390yDp;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56548yJl;
import o.C59449zhJ;
import o.InterfaceC13987dcu;
import o.yDY;
import o.yEE;
import o.yEJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppConnectRequest {
    private static final KSerializer<Object>[] $childSerializers;
    private final String clientId;
    private final List<Request.RequestAccounts.ConnectRequestMethod> connectRequestMethods;
    private final DAppInfo dAppInfo;
    private final Request.TonAddress firstTonAddrRequest;
    private final Request.TonProof firstTonProofRequest;
    private final boolean hasCosmosRequest;
    private final boolean hasLegacyTonRequest;
    private final boolean isStarknetRequired;
    private final boolean isTonRequested;
    private final Integer newProtocolVersion;
    private final List<String> optionalCaipChains;
    private final int protocolVer;
    private final String redirect;
    private final String requestId;
    private final Set<Request> requests;
    private final List<String> requiredCaipChains;
    private final String topic;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @SerialName("protocolVersion")
    public static /* synthetic */ void getNewProtocolVersion$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.protocolVer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInfo component4() {
        return this.dAppInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Request> component6() {
        return this.requests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.newProtocolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppConnectRequest copy(int i, @NotNull String str, @NotNull String str2, @NotNull DAppInfo dAppInfo, @NotNull String str3, @NotNull Set<? extends Request> set, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dAppInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DAppConnectRequest(i, str, str2, dAppInfo, str3, set, str4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppConnectRequest)) {
            return false;
        }
        DAppConnectRequest dAppConnectRequest = (DAppConnectRequest) obj;
        return this.protocolVer == dAppConnectRequest.protocolVer && Intrinsics.EZpvd((Object) this.topic, (Object) dAppConnectRequest.topic) && Intrinsics.EZpvd((Object) this.clientId, (Object) dAppConnectRequest.clientId) && Intrinsics.EZpvd(this.dAppInfo, dAppConnectRequest.dAppInfo) && Intrinsics.EZpvd((Object) this.requestId, (Object) dAppConnectRequest.requestId) && Intrinsics.EZpvd(this.requests, dAppConnectRequest.requests) && Intrinsics.EZpvd((Object) this.redirect, (Object) dAppConnectRequest.redirect) && Intrinsics.EZpvd(this.newProtocolVersion, dAppConnectRequest.newProtocolVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Request.RequestAccounts.ConnectRequestMethod> getConnectRequestMethods() {
        return this.connectRequestMethods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInfo getDAppInfo() {
        return this.dAppInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Request.TonAddress getFirstTonAddrRequest() {
        return this.firstTonAddrRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Request.TonProof getFirstTonProofRequest() {
        return this.firstTonProofRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasCosmosRequest() {
        return this.hasCosmosRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasLegacyTonRequest() {
        return this.hasLegacyTonRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getNewProtocolVersion() {
        return this.newProtocolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOptionalCaipChains() {
        return this.optionalCaipChains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProtocolVer() {
        return this.protocolVer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<Request> getRequests() {
        return this.requests;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRequiredCaipChains() {
        return this.requiredCaipChains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.protocolVer);
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = this.clientId.hashCode();
        int iHashCode4 = this.dAppInfo.hashCode();
        int iHashCode5 = this.requestId.hashCode();
        int iHashCode6 = this.requests.hashCode();
        int iHashCode7 = this.redirect.hashCode();
        Integer num = this.newProtocolVersion;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStarknetRequired() {
        return this.isStarknetRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTonRequested() {
        return this.isTonRequested;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppConnectRequest(protocolVer=" + this.protocolVer + ", topic=" + this.topic + ", clientId=" + this.clientId + ", dAppInfo=" + this.dAppInfo + ", requestId=" + this.requestId + ", requests=" + this.requests + ", redirect=" + this.redirect + ", newProtocolVersion=" + this.newProtocolVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppConnectRequest> serializer() {
            return DAppConnectRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new LinkedHashSetSerializer(C15995eba.copydefault), null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, new ArrayListSerializer(DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer.INSTANCE), null, null};
    }

    public /* synthetic */ DAppConnectRequest(int i, int i2, String str, String str2, DAppInfo dAppInfo, String str3, Set set, String str4, Integer num, boolean z, List list, List list2, Request.TonAddress tonAddress, Request.TonProof tonProof, boolean z2, List list3, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        boolean z5;
        Request.TonAddress tonAddress2;
        Request.TonProof tonProof2;
        List arrayList;
        boolean z6;
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, DAppConnectRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.protocolVer = i2;
        this.topic = str;
        this.clientId = str2;
        this.dAppInfo = dAppInfo;
        this.requestId = str3;
        this.requests = set;
        this.redirect = str4;
        if ((i & 128) == 0) {
            this.newProtocolVersion = null;
        } else {
            this.newProtocolVersion = num;
        }
        boolean z7 = true;
        if ((i & 256) == 0) {
            Set<Request> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z5 = false;
            } else {
                for (Request request : set2) {
                    if ((request instanceof Request.TonAddress) || (request instanceof Request.TonProof)) {
                        z5 = true;
                        break;
                    }
                }
                z5 = false;
            }
        } else {
            z5 = z;
        }
        this.hasLegacyTonRequest = z5;
        if ((i & 512) == 0) {
            List<Request.RequestAccounts.Namespace> requiredNamespaces = getRequiredNamespaces();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = requiredNamespaces.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList2, ((Request.RequestAccounts.Namespace) it.next()).getChains());
            }
            this.requiredCaipChains = arrayList2;
        } else {
            this.requiredCaipChains = list;
        }
        if ((i & 1024) == 0) {
            List<Request.RequestAccounts.Namespace> optionalNamespaces = getOptionalNamespaces();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = optionalNamespaces.iterator();
            while (it2.hasNext()) {
                C56406yEe.KWHzl(arrayList3, ((Request.RequestAccounts.Namespace) it2.next()).getChains());
            }
            this.optionalCaipChains = arrayList3;
        } else {
            this.optionalCaipChains = list2;
        }
        if ((i & 2048) == 0) {
            Set<Request> allDistinctRequests = getAllDistinctRequests();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : allDistinctRequests) {
                if (obj instanceof Request.TonAddress) {
                    arrayList4.add(obj);
                }
            }
            tonAddress2 = (Request.TonAddress) CollectionsKt___CollectionsKt.firstOrNull(arrayList4);
        } else {
            tonAddress2 = tonAddress;
        }
        this.firstTonAddrRequest = tonAddress2;
        if ((i & 4096) == 0) {
            Set<Request> allDistinctRequests2 = getAllDistinctRequests();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : allDistinctRequests2) {
                if (obj2 instanceof Request.TonProof) {
                    arrayList5.add(obj2);
                }
            }
            tonProof2 = (Request.TonProof) CollectionsKt___CollectionsKt.firstOrNull(arrayList5);
        } else {
            tonProof2 = tonProof;
        }
        this.firstTonProofRequest = tonProof2;
        this.isTonRequested = (i & 8192) == 0 ? (this.firstTonAddrRequest == null && tonProof2 == null) ? false : true : z2;
        if ((i & 16384) == 0) {
            Set<Request> allDistinctRequests3 = getAllDistinctRequests();
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : allDistinctRequests3) {
                if (obj3 instanceof Request.RequestAccounts) {
                    arrayList6.add(obj3);
                }
            }
            arrayList = new ArrayList();
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                List<Request.RequestAccounts.ConnectRequestMethod> connectRequestMethods = ((Request.RequestAccounts) it3.next()).getConnectRequestMethods();
                if (connectRequestMethods == null) {
                    connectRequestMethods = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList, connectRequestMethods);
            }
        } else {
            arrayList = list3;
        }
        this.connectRequestMethods = arrayList;
        if ((32768 & i) == 0) {
            List<String> requestedCaipChains = getRequestedCaipChains();
            if ((requestedCaipChains instanceof Collection) && requestedCaipChains.isEmpty()) {
                z6 = false;
            } else {
                Iterator<T> it4 = requestedCaipChains.iterator();
                while (it4.hasNext()) {
                    if (C59449zhJ.startsWith$default((String) it4.next(), InterfaceC13987dcu.Fragment.Companion.copydefault(), false, 2, null)) {
                        z6 = true;
                        break;
                    }
                }
                z6 = false;
            }
        } else {
            z6 = z3;
        }
        this.hasCosmosRequest = z6;
        if ((i & 65536) != 0) {
            this.isStarknetRequired = z4;
            return;
        }
        List<String> list4 = this.requiredCaipChains;
        if ((list4 instanceof Collection) && list4.isEmpty()) {
            z7 = false;
        } else {
            Iterator<T> it5 = list4.iterator();
            while (it5.hasNext()) {
                if (C59449zhJ.startsWith$default((String) it5.next(), InterfaceC13987dcu.Fragment.Companion.AYXKKw(), false, 2, null)) {
                    break;
                }
            }
            z7 = false;
        }
        this.isStarknetRequired = z7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [18=9] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0187  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppConnectRequest dAppConnectRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z;
        boolean z2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        boolean z3 = false;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, dAppConnectRequest.protocolVer);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppConnectRequest.topic);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dAppConnectRequest.clientId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, DAppInfo$$serializer.INSTANCE, dAppConnectRequest.dAppInfo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dAppConnectRequest.requestId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], dAppConnectRequest.requests);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dAppConnectRequest.redirect);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dAppConnectRequest.newProtocolVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, dAppConnectRequest.newProtocolVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8)) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, dAppConnectRequest.hasLegacyTonRequest);
        } else {
            boolean z4 = dAppConnectRequest.hasLegacyTonRequest;
            Set<Request> set = dAppConnectRequest.requests;
            if ((set instanceof Collection) && set.isEmpty()) {
                z2 = false;
                if (z4 != z2) {
                }
            } else {
                for (Request request : set) {
                    if ((request instanceof Request.TonAddress) || (request instanceof Request.TonProof)) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                if (z4 != z2) {
                }
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], dAppConnectRequest.requiredCaipChains);
        } else {
            List<String> list = dAppConnectRequest.requiredCaipChains;
            List<Request.RequestAccounts.Namespace> requiredNamespaces = dAppConnectRequest.getRequiredNamespaces();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = requiredNamespaces.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(arrayList, ((Request.RequestAccounts.Namespace) it.next()).getChains());
            }
            if (!Intrinsics.EZpvd(list, arrayList)) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], dAppConnectRequest.optionalCaipChains);
        } else {
            List<String> list2 = dAppConnectRequest.optionalCaipChains;
            List<Request.RequestAccounts.Namespace> optionalNamespaces = dAppConnectRequest.getOptionalNamespaces();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = optionalNamespaces.iterator();
            while (it2.hasNext()) {
                C56406yEe.KWHzl(arrayList2, ((Request.RequestAccounts.Namespace) it2.next()).getChains());
            }
            if (!Intrinsics.EZpvd(list2, arrayList2)) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DAppConnectRequest$Request$TonAddress$$serializer.INSTANCE, dAppConnectRequest.firstTonAddrRequest);
        } else {
            Request.TonAddress tonAddress = dAppConnectRequest.firstTonAddrRequest;
            Set<Request> allDistinctRequests = dAppConnectRequest.getAllDistinctRequests();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : allDistinctRequests) {
                if (obj instanceof Request.TonAddress) {
                    arrayList3.add(obj);
                }
            }
            if (!Intrinsics.EZpvd(tonAddress, CollectionsKt___CollectionsKt.firstOrNull(arrayList3))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, DAppConnectRequest$Request$TonProof$$serializer.INSTANCE, dAppConnectRequest.firstTonProofRequest);
        } else {
            Request.TonProof tonProof = dAppConnectRequest.firstTonProofRequest;
            Set<Request> allDistinctRequests2 = dAppConnectRequest.getAllDistinctRequests();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : allDistinctRequests2) {
                if (obj2 instanceof Request.TonProof) {
                    arrayList4.add(obj2);
                }
            }
            if (!Intrinsics.EZpvd(tonProof, CollectionsKt___CollectionsKt.firstOrNull(arrayList4))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13)) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, dAppConnectRequest.isTonRequested);
        } else if (dAppConnectRequest.isTonRequested != ((dAppConnectRequest.firstTonAddrRequest == null && dAppConnectRequest.firstTonProofRequest == null) ? false : true)) {
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], dAppConnectRequest.connectRequestMethods);
        } else {
            List<Request.RequestAccounts.ConnectRequestMethod> list3 = dAppConnectRequest.connectRequestMethods;
            Set<Request> allDistinctRequests3 = dAppConnectRequest.getAllDistinctRequests();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : allDistinctRequests3) {
                if (obj3 instanceof Request.RequestAccounts) {
                    arrayList5.add(obj3);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                List<Request.RequestAccounts.ConnectRequestMethod> connectRequestMethods = ((Request.RequestAccounts) it3.next()).getConnectRequestMethods();
                if (connectRequestMethods == null) {
                    connectRequestMethods = yDY.AhwBna();
                }
                C56406yEe.KWHzl(arrayList6, connectRequestMethods);
            }
            if (!Intrinsics.EZpvd(list3, arrayList6)) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15)) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, dAppConnectRequest.hasCosmosRequest);
        } else {
            boolean z5 = dAppConnectRequest.hasCosmosRequest;
            List<String> requestedCaipChains = dAppConnectRequest.getRequestedCaipChains();
            if ((requestedCaipChains instanceof Collection) && requestedCaipChains.isEmpty()) {
                z = false;
                if (z5 != z) {
                }
            } else {
                Iterator<T> it4 = requestedCaipChains.iterator();
                while (it4.hasNext()) {
                    if (C59449zhJ.startsWith$default((String) it4.next(), InterfaceC13987dcu.Fragment.Companion.copydefault(), false, 2, null)) {
                        z = true;
                        break;
                    }
                }
                z = false;
                if (z5 != z) {
                }
            }
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16)) {
            boolean z6 = dAppConnectRequest.isStarknetRequired;
            List<String> list4 = dAppConnectRequest.requiredCaipChains;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator<T> it5 = list4.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        if (C59449zhJ.startsWith$default((String) it5.next(), InterfaceC13987dcu.Fragment.Companion.AYXKKw(), false, 2, null)) {
                            z3 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z6 == z3) {
                return;
            }
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 16, dAppConnectRequest.isStarknetRequired);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.Set<? extends com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request> */
    /* JADX WARN: Multi-variable type inference failed */
    public DAppConnectRequest(int i, @NotNull String str, @NotNull String str2, @NotNull DAppInfo dAppInfo, @NotNull String str3, @NotNull Set<? extends Request> set, @NotNull String str4, Integer num) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dAppInfo, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.protocolVer = i;
        this.topic = str;
        this.clientId = str2;
        this.dAppInfo = dAppInfo;
        this.requestId = str3;
        this.requests = set;
        this.redirect = str4;
        this.newProtocolVersion = num;
        Set<? extends Request> set2 = set;
        boolean z3 = false;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            z = false;
        } else {
            for (Request request : set2) {
                if ((request instanceof Request.TonAddress) || (request instanceof Request.TonProof)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.hasLegacyTonRequest = z;
        List<Request.RequestAccounts.Namespace> requiredNamespaces = getRequiredNamespaces();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = requiredNamespaces.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, ((Request.RequestAccounts.Namespace) it.next()).getChains());
        }
        this.requiredCaipChains = arrayList;
        List<Request.RequestAccounts.Namespace> optionalNamespaces = getOptionalNamespaces();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = optionalNamespaces.iterator();
        while (it2.hasNext()) {
            C56406yEe.KWHzl(arrayList2, ((Request.RequestAccounts.Namespace) it2.next()).getChains());
        }
        this.optionalCaipChains = arrayList2;
        Set<Request> allDistinctRequests = getAllDistinctRequests();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : allDistinctRequests) {
            if (obj instanceof Request.TonAddress) {
                arrayList3.add(obj);
            }
        }
        this.firstTonAddrRequest = (Request.TonAddress) CollectionsKt___CollectionsKt.firstOrNull(arrayList3);
        Set<Request> allDistinctRequests2 = getAllDistinctRequests();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : allDistinctRequests2) {
            if (obj2 instanceof Request.TonProof) {
                arrayList4.add(obj2);
            }
        }
        Request.TonProof tonProof = (Request.TonProof) CollectionsKt___CollectionsKt.firstOrNull(arrayList4);
        this.firstTonProofRequest = tonProof;
        this.isTonRequested = (this.firstTonAddrRequest == null && tonProof == null) ? false : true;
        Set<Request> allDistinctRequests3 = getAllDistinctRequests();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : allDistinctRequests3) {
            if (obj3 instanceof Request.RequestAccounts) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            List<Request.RequestAccounts.ConnectRequestMethod> connectRequestMethods = ((Request.RequestAccounts) it3.next()).getConnectRequestMethods();
            if (connectRequestMethods == null) {
                connectRequestMethods = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList6, connectRequestMethods);
        }
        this.connectRequestMethods = arrayList6;
        List<String> requestedCaipChains = getRequestedCaipChains();
        if ((requestedCaipChains instanceof Collection) && requestedCaipChains.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it4 = requestedCaipChains.iterator();
            while (it4.hasNext()) {
                if (C59449zhJ.startsWith$default((String) it4.next(), InterfaceC13987dcu.Fragment.Companion.copydefault(), false, 2, null)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        this.hasCosmosRequest = z2;
        List<String> list = this.requiredCaipChains;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (C59449zhJ.startsWith$default((String) it5.next(), InterfaceC13987dcu.Fragment.Companion.AYXKKw(), false, 2, null)) {
                        z3 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.isStarknetRequired = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r11v0 int)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo)
  (r15v0 java.lang.String)
  (r16v0 java.util.Set)
  (r17v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r18v0 java.lang.Integer))
 A[MD:(int, java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo, java.lang.String, java.util.Set<? extends com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request>, java.lang.String, java.lang.Integer):void (m)] (LINE:20) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.<init>(int, java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo, java.lang.String, java.util.Set, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ DAppConnectRequest(int i, String str, String str2, DAppInfo dAppInfo, String str3, Set set, String str4, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, dAppInfo, str3, set, str4, (i2 & 128) != 0 ? null : num);
    }

    public final List<Request.RequestAccounts.Namespace> getRequiredNamespaces() {
        Set<Request> set = this.requests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof Request.RequestAccounts) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<Request.RequestAccounts.Namespace> requiredNamespaces = ((Request.RequestAccounts) it.next()).getRequiredNamespaces();
            if (requiredNamespaces == null) {
                requiredNamespaces = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList2, requiredNamespaces);
        }
        return arrayList2;
    }

    public final List<Request.RequestAccounts.Namespace> getOptionalNamespaces() {
        Set<Request> set = this.requests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof Request.RequestAccounts) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<Request.RequestAccounts.Namespace> optionalNamespaces = ((Request.RequestAccounts) it.next()).getOptionalNamespaces();
            if (optionalNamespaces == null) {
                optionalNamespaces = yDY.AhwBna();
            }
            C56406yEe.KWHzl(arrayList2, optionalNamespaces);
        }
        return arrayList2;
    }

    public final List<String> getRequestedCaipChains() {
        Set<Request> set = this.requests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof Request.RequestAccounts) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<Request.RequestAccounts.Namespace> requestedNamespaces = ((Request.RequestAccounts) it.next()).getRequestedNamespaces();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = requestedNamespaces.iterator();
            while (it2.hasNext()) {
                C56406yEe.KWHzl(arrayList3, ((Request.RequestAccounts.Namespace) it2.next()).getChains());
            }
            C56406yEe.KWHzl(arrayList2, arrayList3);
        }
        return arrayList2;
    }

    private final Set<Request> getAllDistinctRequests() {
        Set<Request> set = this.requests;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof Request.RequestAccounts) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList2, ((Request.RequestAccounts) it.next()).getParamRequests());
        }
        return yEJ.KWHzl(set, CollectionsKt___CollectionsKt.QbewEr(arrayList2));
    }

    @Serializable(with = C15995eba.class)
    public interface Request {
        public static final Companion Companion = Companion.OLrzqt;

        String getName();

        public static final class Companion {
            public static final /* synthetic */ Companion OLrzqt = new Companion();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            public final KSerializer<Request> serializer() {
                return C15995eba.copydefault;
            }
        }

        @Serializable
        public static final class TonAddress implements Request {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String name;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TonAddress copy$default(TonAddress tonAddress, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tonAddress.name;
                }
                return tonAddress.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TonAddress copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TonAddress(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TonAddress) && Intrinsics.EZpvd((Object) this.name, (Object) ((TonAddress) obj).name);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request
            public String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.name.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TonAddress(name=" + this.name + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.TonAddress.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<TonAddress> serializer() {
                    return DAppConnectRequest$Request$TonAddress$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ TonAddress(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, DAppConnectRequest$Request$TonAddress$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
            }

            public TonAddress(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.name = str;
            }
        }

        @Serializable
        public static final class TonProof implements Request {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String name;
            private final String payload;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TonProof copy$default(TonProof tonProof, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = tonProof.name;
                }
                if ((i & 2) != 0) {
                    str2 = tonProof.payload;
                }
                return tonProof.copy(str, str2);
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
            public final TonProof copy(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new TonProof(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TonProof)) {
                    return false;
                }
                TonProof tonProof = (TonProof) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) tonProof.name) && Intrinsics.EZpvd((Object) this.payload, (Object) tonProof.payload);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request
            public String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getPayload() {
                return this.payload;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.name.hashCode() * 31) + this.payload.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "TonProof(name=" + this.name + ", payload=" + this.payload + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.TonProof.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<TonProof> serializer() {
                    return DAppConnectRequest$Request$TonProof$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ TonProof(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 3, DAppConnectRequest$Request$TonProof$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
                this.payload = str2;
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TonProof tonProof, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, tonProof.getName());
                compositeEncoder.encodeStringElement(serialDescriptor, 1, tonProof.payload);
            }

            public TonProof(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.name = str;
                this.payload = str2;
            }
        }

        @Serializable
        public static final class RequestAccounts implements Request {
            private static final KSerializer<Object>[] $childSerializers;
            private final List<ConnectRequestMethod> connectRequestMethods;
            private final String name;
            private final List<Namespace> optionalNamespaces;
            private final List<Request> paramRequests;
            private final List<Namespace> requestedNamespaces;
            private final List<Namespace> requiredNamespaces;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RequestAccounts copy$default(RequestAccounts requestAccounts, String str, List list, List list2, List list3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = requestAccounts.name;
                }
                if ((i & 2) != 0) {
                    list = requestAccounts.requiredNamespaces;
                }
                if ((i & 4) != 0) {
                    list2 = requestAccounts.optionalNamespaces;
                }
                if ((i & 8) != 0) {
                    list3 = requestAccounts.connectRequestMethods;
                }
                return requestAccounts.copy(str, list, list2, list3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Namespace> component2() {
                return this.requiredNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Namespace> component3() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<ConnectRequestMethod> component4() {
                return this.connectRequestMethods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RequestAccounts copy(@NotNull String str, List<Namespace> list, List<Namespace> list2, List<ConnectRequestMethod> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                return new RequestAccounts(str, list, list2, list3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RequestAccounts)) {
                    return false;
                }
                RequestAccounts requestAccounts = (RequestAccounts) obj;
                return Intrinsics.EZpvd((Object) this.name, (Object) requestAccounts.name) && Intrinsics.EZpvd(this.requiredNamespaces, requestAccounts.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, requestAccounts.optionalNamespaces) && Intrinsics.EZpvd(this.connectRequestMethods, requestAccounts.connectRequestMethods);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<ConnectRequestMethod> getConnectRequestMethods() {
                return this.connectRequestMethods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request
            public String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Namespace> getOptionalNamespaces() {
                return this.optionalNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Request> getParamRequests() {
                return this.paramRequests;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Namespace> getRequestedNamespaces() {
                return this.requestedNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Namespace> getRequiredNamespaces() {
                return this.requiredNamespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.name.hashCode();
                List<Namespace> list = this.requiredNamespaces;
                int iHashCode2 = list == null ? 0 : list.hashCode();
                List<Namespace> list2 = this.optionalNamespaces;
                int iHashCode3 = list2 == null ? 0 : list2.hashCode();
                List<ConnectRequestMethod> list3 = this.connectRequestMethods;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list3 != null ? list3.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RequestAccounts(name=" + this.name + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", connectRequestMethods=" + this.connectRequestMethods + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<RequestAccounts> serializer() {
                    return DAppConnectRequest$Request$RequestAccounts$$serializer.INSTANCE;
                }
            }

            static {
                DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer = DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer.INSTANCE;
                $childSerializers = new KSerializer[]{null, new ArrayListSerializer(dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer), new ArrayListSerializer(dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer), new ArrayListSerializer(DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer.INSTANCE), new ArrayListSerializer(dAppConnectRequest$Request$RequestAccounts$Namespace$$serializer), new ArrayListSerializer(C15995eba.copydefault)};
            }

            public /* synthetic */ RequestAccounts(int i, String str, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, DAppConnectRequest$Request$RequestAccounts$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
                if ((i & 2) == 0) {
                    this.requiredNamespaces = null;
                } else {
                    this.requiredNamespaces = list;
                }
                if ((i & 4) == 0) {
                    this.optionalNamespaces = null;
                } else {
                    this.optionalNamespaces = list2;
                }
                if ((i & 8) == 0) {
                    this.connectRequestMethods = null;
                } else {
                    this.connectRequestMethods = list3;
                }
                if ((i & 16) == 0) {
                    List<Namespace> listAhwBna = this.requiredNamespaces;
                    listAhwBna = listAhwBna == null ? yDY.AhwBna() : listAhwBna;
                    List<Namespace> list6 = this.optionalNamespaces;
                    List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna, (Iterable) (list6 == null ? yDY.AhwBna() : list6));
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listDjBIcL) {
                        String namespace = ((Namespace) obj).getNamespace();
                        Object arrayList = linkedHashMap.get(namespace);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(namespace, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list7 = (List) entry.getValue();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list7.iterator();
                        while (it.hasNext()) {
                            C56406yEe.KWHzl(arrayList3, ((Namespace) it.next()).getChains());
                        }
                        List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list7.iterator();
                        while (it2.hasNext()) {
                            List<String> methods = ((Namespace) it2.next()).getMethods();
                            if (methods == null) {
                                methods = yDY.AhwBna();
                            }
                            C56406yEe.KWHzl(arrayList4, methods);
                        }
                        List listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(arrayList4);
                        listQbewEr2 = listQbewEr2.isEmpty() ^ true ? listQbewEr2 : null;
                        ArrayList<Map.Entry> arrayList5 = new ArrayList();
                        Iterator it3 = list7.iterator();
                        while (it3.hasNext()) {
                            Map<String, Request> params = ((Namespace) it3.next()).getParams();
                            Set<Map.Entry<String, Request>> setEntrySet = params != null ? params.entrySet() : null;
                            if (setEntrySet == null) {
                                setEntrySet = yEE.copydefault();
                            }
                            C56406yEe.KWHzl(arrayList5, setEntrySet);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList5, 10)), 16));
                        for (Map.Entry entry2 : arrayList5) {
                            Pair pairOLrzqt = C56390yDp.OLrzqt(entry2.getKey(), entry2.getValue());
                            linkedHashMap2.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                        }
                        arrayList2.add(new Namespace(str2, listQbewEr, listQbewEr2, linkedHashMap2));
                    }
                    this.requestedNamespaces = arrayList2;
                } else {
                    this.requestedNamespaces = list4;
                }
                if ((i & 32) != 0) {
                    this.paramRequests = list5;
                    return;
                }
                List<Namespace> list8 = this.requestedNamespaces;
                ArrayList arrayList6 = new ArrayList();
                Iterator<T> it4 = list8.iterator();
                while (it4.hasNext()) {
                    Map<String, Request> params2 = ((Namespace) it4.next()).getParams();
                    Collection<Request> collectionValues = params2 != null ? params2.values() : null;
                    if (collectionValues == null) {
                        collectionValues = yDY.AhwBna();
                    }
                    C56406yEe.KWHzl(arrayList6, collectionValues);
                }
                this.paramRequests = arrayList6;
            }

            /* JADX WARN: Removed duplicated region for block: B:71:0x018d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RequestAccounts requestAccounts, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                compositeEncoder.encodeStringElement(serialDescriptor, 0, requestAccounts.getName());
                boolean z = true;
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || requestAccounts.requiredNamespaces != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], requestAccounts.requiredNamespaces);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || requestAccounts.optionalNamespaces != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], requestAccounts.optionalNamespaces);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || requestAccounts.connectRequestMethods != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], requestAccounts.connectRequestMethods);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4)) {
                    compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], requestAccounts.requestedNamespaces);
                } else {
                    List<Namespace> list = requestAccounts.requestedNamespaces;
                    List<Namespace> listAhwBna = requestAccounts.requiredNamespaces;
                    if (listAhwBna == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    List<Namespace> listAhwBna2 = requestAccounts.optionalNamespaces;
                    if (listAhwBna2 == null) {
                        listAhwBna2 = yDY.AhwBna();
                    }
                    List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) listAhwBna, (Iterable) listAhwBna2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listDjBIcL) {
                        String namespace = ((Namespace) obj).getNamespace();
                        Object arrayList = linkedHashMap.get(namespace);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            linkedHashMap.put(namespace, arrayList);
                        }
                        ((List) arrayList).add(obj);
                    }
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        List list2 = (List) entry.getValue();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            C56406yEe.KWHzl(arrayList3, ((Namespace) it.next()).getChains());
                        }
                        List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            List<String> methods = ((Namespace) it2.next()).getMethods();
                            if (methods == null) {
                                methods = yDY.AhwBna();
                            }
                            C56406yEe.KWHzl(arrayList4, methods);
                        }
                        List listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(arrayList4);
                        if (!(listQbewEr2.isEmpty() ^ z)) {
                            listQbewEr2 = null;
                        }
                        ArrayList<Map.Entry> arrayList5 = new ArrayList();
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Map<String, Request> params = ((Namespace) it3.next()).getParams();
                            Set<Map.Entry<String, Request>> setEntrySet = params != null ? params.entrySet() : null;
                            if (setEntrySet == null) {
                                setEntrySet = yEE.copydefault();
                            }
                            C56406yEe.KWHzl(arrayList5, setEntrySet);
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList5, 10)), 16));
                        for (Map.Entry entry2 : arrayList5) {
                            Pair pairOLrzqt = C56390yDp.OLrzqt(entry2.getKey(), entry2.getValue());
                            linkedHashMap2.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                        }
                        arrayList2.add(new Namespace(str, listQbewEr, listQbewEr2, linkedHashMap2));
                        z = true;
                    }
                    if (!Intrinsics.EZpvd(list, arrayList2)) {
                    }
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5)) {
                    List<Request> list3 = requestAccounts.paramRequests;
                    List<Namespace> list4 = requestAccounts.requestedNamespaces;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator<T> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        Map<String, Request> params2 = ((Namespace) it4.next()).getParams();
                        Collection<Request> collectionValues = params2 != null ? params2.values() : null;
                        if (collectionValues == null) {
                            collectionValues = yDY.AhwBna();
                        }
                        C56406yEe.KWHzl(arrayList6, collectionValues);
                    }
                    if (Intrinsics.EZpvd(list3, arrayList6)) {
                        return;
                    }
                }
                compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], requestAccounts.paramRequests);
            }

            public RequestAccounts(@NotNull String str, List<Namespace> list, List<Namespace> list2, List<ConnectRequestMethod> list3) {
                Intrinsics.checkNotNullParameter(str, "");
                this.name = str;
                this.requiredNamespaces = list;
                this.optionalNamespaces = list2;
                this.connectRequestMethods = list3;
                List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) (list == null ? yDY.AhwBna() : list), (Iterable) (list2 == null ? yDY.AhwBna() : list2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : listDjBIcL) {
                    String namespace = ((Namespace) obj).getNamespace();
                    Object arrayList = linkedHashMap.get(namespace);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(namespace, arrayList);
                    }
                    ((List) arrayList).add(obj);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list4 = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        C56406yEe.KWHzl(arrayList3, ((Namespace) it.next()).getChains());
                    }
                    List listQbewEr = CollectionsKt___CollectionsKt.QbewEr(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        List<String> methods = ((Namespace) it2.next()).getMethods();
                        if (methods == null) {
                            methods = yDY.AhwBna();
                        }
                        C56406yEe.KWHzl(arrayList4, methods);
                    }
                    List listQbewEr2 = CollectionsKt___CollectionsKt.QbewEr(arrayList4);
                    listQbewEr2 = listQbewEr2.isEmpty() ^ true ? listQbewEr2 : null;
                    ArrayList<Map.Entry> arrayList5 = new ArrayList();
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        Map<String, Request> params = ((Namespace) it3.next()).getParams();
                        Set<Map.Entry<String, Request>> setEntrySet = params != null ? params.entrySet() : null;
                        if (setEntrySet == null) {
                            setEntrySet = yEE.copydefault();
                        }
                        C56406yEe.KWHzl(arrayList5, setEntrySet);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList5, 10)), 16));
                    for (Map.Entry entry2 : arrayList5) {
                        Pair pairOLrzqt = C56390yDp.OLrzqt(entry2.getKey(), entry2.getValue());
                        linkedHashMap2.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                    }
                    arrayList2.add(new Namespace(str2, listQbewEr, listQbewEr2, linkedHashMap2));
                }
                this.requestedNamespaces = arrayList2;
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Map<String, Request> params2 = ((Namespace) it4.next()).getParams();
                    Collection<Request> collectionValues = params2 != null ? params2.values() : null;
                    if (collectionValues == null) {
                        collectionValues = yDY.AhwBna();
                    }
                    C56406yEe.KWHzl(arrayList6, collectionValues);
                }
                this.paramRequests = arrayList6;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$Namespace>, java.util.List<com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$Namespace>, java.util.List<com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod>):void (m)] (LINE:91) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.<init>(java.lang.String, java.util.List, java.util.List, java.util.List):void type: THIS */
            public /* synthetic */ RequestAccounts(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
            }

            @Serializable
            public static final class Namespace {
                private static final KSerializer<Object>[] $childSerializers;
                private final List<String> chains;
                private final List<String> methods;
                private final String namespace;
                private final Map<String, Request> params;
                public static final Companion Companion = new Companion(null);
                public static final int $stable = 8;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request$RequestAccounts$Namespace */
                /* JADX WARN: Multi-variable type inference failed */
                public static /* synthetic */ Namespace copy$default(Namespace namespace, String str, List list, List list2, Map map, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = namespace.namespace;
                    }
                    if ((i & 2) != 0) {
                        list = namespace.chains;
                    }
                    if ((i & 4) != 0) {
                        list2 = namespace.methods;
                    }
                    if ((i & 8) != 0) {
                        map = namespace.params;
                    }
                    return namespace.copy(str, list, list2, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.namespace;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component2() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> component3() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Request> component4() {
                    return this.params;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Namespace copy(@NotNull String str, @NotNull List<String> list, List<String> list2, Map<String, ? extends Request> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    return new Namespace(str, list, list2, map);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Namespace)) {
                        return false;
                    }
                    Namespace namespace = (Namespace) obj;
                    return Intrinsics.EZpvd((Object) this.namespace, (Object) namespace.namespace) && Intrinsics.EZpvd(this.chains, namespace.chains) && Intrinsics.EZpvd(this.methods, namespace.methods) && Intrinsics.EZpvd(this.params, namespace.params);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getChains() {
                    return this.chains;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final List<String> getMethods() {
                    return this.methods;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getNamespace() {
                    return this.namespace;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Map<String, Request> getParams() {
                    return this.params;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.namespace.hashCode();
                    int iHashCode2 = this.chains.hashCode();
                    List<String> list = this.methods;
                    int iHashCode3 = list == null ? 0 : list.hashCode();
                    Map<String, Request> map = this.params;
                    return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "Namespace(namespace=" + this.namespace + ", chains=" + this.chains + ", methods=" + this.methods + ", params=" + this.params + ")";
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.Namespace.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<Namespace> serializer() {
                        return DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer.INSTANCE;
                    }
                }

                static {
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    $childSerializers = new KSerializer[]{null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, C15995eba.copydefault)};
                }

                public /* synthetic */ Namespace(int i, String str, List list, List list2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
                    if (3 != (i & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 3, DAppConnectRequest$Request$RequestAccounts$Namespace$$serializer.INSTANCE.getDescriptor());
                    }
                    this.namespace = str;
                    this.chains = list;
                    if ((i & 4) == 0) {
                        this.methods = null;
                    } else {
                        this.methods = list2;
                    }
                    if ((i & 8) == 0) {
                        this.params = null;
                    } else {
                        this.params = map;
                    }
                }

                public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(Namespace namespace, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    KSerializer<Object>[] kSerializerArr = $childSerializers;
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, namespace.namespace);
                    compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], namespace.chains);
                    if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || namespace.methods != null) {
                        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], namespace.methods);
                    }
                    if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && namespace.params == null) {
                        return;
                    }
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], namespace.params);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request> */
                /* JADX WARN: Multi-variable type inference failed */
                public Namespace(@NotNull String str, @NotNull List<String> list, List<String> list2, Map<String, ? extends Request> map) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    this.namespace = str;
                    this.chains = list;
                    this.methods = list2;
                    this.params = map;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r5v0 java.util.Map))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.Map<java.lang.String, ? extends com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest$Request>):void (m)] (LINE:99) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.Namespace.<init>(java.lang.String, java.util.List, java.util.List, java.util.Map):void type: THIS */
                public /* synthetic */ Namespace(String str, List list, List list2, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : map);
                }
            }

            @Serializable
            public static final class ConnectRequestMethod {
                private final String caipChainId;
                private final String method;
                private final JsonObject params;
                public static final Companion Companion = new Companion(null);
                public static final int $stable = 8;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ ConnectRequestMethod copy$default(ConnectRequestMethod connectRequestMethod, String str, String str2, JsonObject jsonObject, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = connectRequestMethod.method;
                    }
                    if ((i & 2) != 0) {
                        str2 = connectRequestMethod.caipChainId;
                    }
                    if ((i & 4) != 0) {
                        jsonObject = connectRequestMethod.params;
                    }
                    return connectRequestMethod.copy(str, str2, jsonObject);
                }

                @SerialName("chainId")
                public static /* synthetic */ void getCaipChainId$annotations() {
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component1() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String component2() {
                    return this.caipChainId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonObject component3() {
                    return this.params;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final ConnectRequestMethod copy(@NotNull String str, @NotNull String str2, JsonObject jsonObject) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    return new ConnectRequestMethod(str, str2, jsonObject);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ConnectRequestMethod)) {
                        return false;
                    }
                    ConnectRequestMethod connectRequestMethod = (ConnectRequestMethod) obj;
                    return Intrinsics.EZpvd((Object) this.method, (Object) connectRequestMethod.method) && Intrinsics.EZpvd((Object) this.caipChainId, (Object) connectRequestMethod.caipChainId) && Intrinsics.EZpvd(this.params, connectRequestMethod.params);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getCaipChainId() {
                    return this.caipChainId;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final String getMethod() {
                    return this.method;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final JsonObject getParams() {
                    return this.params;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    int iHashCode = this.method.hashCode();
                    int iHashCode2 = this.caipChainId.hashCode();
                    JsonObject jsonObject = this.params;
                    return (((iHashCode * 31) + iHashCode2) * 31) + (jsonObject == null ? 0 : jsonObject.hashCode());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public String toString() {
                    return "ConnectRequestMethod(method=" + this.method + ", caipChainId=" + this.caipChainId + ", params=" + this.params + ")";
                }

                public static final class Companion {
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    private Companion() {
                    }

                    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod.Companion.<init>():void type: THIS */
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final KSerializer<ConnectRequestMethod> serializer() {
                        return DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ConnectRequestMethod(int i, String str, String str2, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
                    if (3 != (i & 3)) {
                        PluginExceptionsKt.throwMissingFieldException(i, 3, DAppConnectRequest$Request$RequestAccounts$ConnectRequestMethod$$serializer.INSTANCE.getDescriptor());
                    }
                    this.method = str;
                    this.caipChainId = str2;
                    if ((i & 4) == 0) {
                        this.params = null;
                    } else {
                        this.params = jsonObject;
                    }
                }

                public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ConnectRequestMethod connectRequestMethod, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                    compositeEncoder.encodeStringElement(serialDescriptor, 0, connectRequestMethod.method);
                    compositeEncoder.encodeStringElement(serialDescriptor, 1, connectRequestMethod.caipChainId);
                    if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && connectRequestMethod.params == null) {
                        return;
                    }
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, connectRequestMethod.params);
                }

                public ConnectRequestMethod(@NotNull String str, @NotNull String str2, JsonObject jsonObject) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    this.method = str;
                    this.caipChainId = str2;
                    this.params = jsonObject;
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r3v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void (m)] (LINE:108) call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod.<init>(java.lang.String, java.lang.String, kotlinx.serialization.json.JsonObject):void type: THIS */
                public /* synthetic */ ConnectRequestMethod(String str, String str2, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, str2, (i & 4) != 0 ? null : jsonObject);
                }
            }
        }

        @Serializable
        public static final class Unknown implements Request {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final String name;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unknown.name;
                }
                return unknown.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Unknown copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Unknown(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown) && Intrinsics.EZpvd((Object) this.name, (Object) ((Unknown) obj).name);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request
            public String getName() {
                return this.name;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.name.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Unknown(name=" + this.name + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest.Request.Unknown.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Unknown> serializer() {
                    return DAppConnectRequest$Request$Unknown$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Unknown(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    PluginExceptionsKt.throwMissingFieldException(i, 1, DAppConnectRequest$Request$Unknown$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
            }

            public Unknown(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.name = str;
            }
        }
    }
}
