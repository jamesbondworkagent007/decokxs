package com.okinc.business.market.data.model.smart_money;

import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C29481kuU;
import o.C33129mqd;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalOverviewOrActivityListRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public static final int DEFAULT_PAGE_SIZE = 6;
    public final String chainId;
    public final String lastEventTime;
    public final int pageSize;
    public final List<Integer> protocolIdList;
    public final List<Integer> signalLabelList;
    public final SignalMetricsFilterRequest signalMetricsFilterRequest;
    public final TokenMetricsFilterRequest tokenMetricsFilterRequest;
    public final String trend;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewOrActivityListRequest OLrzqt(int i, @NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3, @NotNull List<Integer> list2, @NotNull SignalMetricsFilterRequest signalMetricsFilterRequest, @NotNull TokenMetricsFilterRequest tokenMetricsFilterRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilterRequest, "");
        Intrinsics.checkNotNullParameter(tokenMetricsFilterRequest, "");
        return new SignalOverviewOrActivityListRequest(i, str, str2, list, str3, list2, signalMetricsFilterRequest, tokenMetricsFilterRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalOverviewOrActivityListRequest)) {
            return false;
        }
        SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest = (SignalOverviewOrActivityListRequest) obj;
        return this.pageSize == signalOverviewOrActivityListRequest.pageSize && Intrinsics.EZpvd((Object) this.lastEventTime, (Object) signalOverviewOrActivityListRequest.lastEventTime) && Intrinsics.EZpvd((Object) this.chainId, (Object) signalOverviewOrActivityListRequest.chainId) && Intrinsics.EZpvd(this.signalLabelList, signalOverviewOrActivityListRequest.signalLabelList) && Intrinsics.EZpvd((Object) this.trend, (Object) signalOverviewOrActivityListRequest.trend) && Intrinsics.EZpvd(this.protocolIdList, signalOverviewOrActivityListRequest.protocolIdList) && Intrinsics.EZpvd(this.signalMetricsFilterRequest, signalOverviewOrActivityListRequest.signalMetricsFilterRequest) && Intrinsics.EZpvd(this.tokenMetricsFilterRequest, signalOverviewOrActivityListRequest.tokenMetricsFilterRequest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.pageSize) * 31) + this.lastEventTime.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.signalLabelList.hashCode()) * 31) + this.trend.hashCode()) * 31) + this.protocolIdList.hashCode()) * 31) + this.signalMetricsFilterRequest.hashCode()) * 31) + this.tokenMetricsFilterRequest.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverviewOrActivityListRequest(pageSize=" + this.pageSize + ", lastEventTime=" + this.lastEventTime + ", chainId=" + this.chainId + ", signalLabelList=" + this.signalLabelList + ", trend=" + this.trend + ", protocolIdList=" + this.protocolIdList + ", signalMetricsFilterRequest=" + this.signalMetricsFilterRequest + ", tokenMetricsFilterRequest=" + this.tokenMetricsFilterRequest + ")";
    }

    public /* synthetic */ SignalOverviewOrActivityListRequest(int i, int i2, String str, String str2, List list, String str3, List list2, SignalMetricsFilterRequest signalMetricsFilterRequest, TokenMetricsFilterRequest tokenMetricsFilterRequest, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, SignalOverviewOrActivityListRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.pageSize = i2;
        this.lastEventTime = str;
        this.chainId = str2;
        this.signalLabelList = list;
        this.trend = str3;
        this.protocolIdList = list2;
        this.signalMetricsFilterRequest = signalMetricsFilterRequest;
        this.tokenMetricsFilterRequest = tokenMetricsFilterRequest;
    }

    public static final /* synthetic */ void OLrzqt(SignalOverviewOrActivityListRequest signalOverviewOrActivityListRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, signalOverviewOrActivityListRequest.pageSize);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signalOverviewOrActivityListRequest.lastEventTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, signalOverviewOrActivityListRequest.chainId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], signalOverviewOrActivityListRequest.signalLabelList);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, signalOverviewOrActivityListRequest.trend);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], signalOverviewOrActivityListRequest.protocolIdList);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, SignalMetricsFilterRequest$$serializer.INSTANCE, signalOverviewOrActivityListRequest.signalMetricsFilterRequest);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, TokenMetricsFilterRequest$$serializer.INSTANCE, signalOverviewOrActivityListRequest.tokenMetricsFilterRequest);
    }

    public SignalOverviewOrActivityListRequest(int i, @NotNull String str, @NotNull String str2, @NotNull List<Integer> list, @NotNull String str3, @NotNull List<Integer> list2, @NotNull SignalMetricsFilterRequest signalMetricsFilterRequest, @NotNull TokenMetricsFilterRequest tokenMetricsFilterRequest) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilterRequest, "");
        Intrinsics.checkNotNullParameter(tokenMetricsFilterRequest, "");
        this.pageSize = i;
        this.lastEventTime = str;
        this.chainId = str2;
        this.signalLabelList = list;
        this.trend = str3;
        this.protocolIdList = list2;
        this.signalMetricsFilterRequest = signalMetricsFilterRequest;
        this.tokenMetricsFilterRequest = tokenMetricsFilterRequest;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalOverviewOrActivityListRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SignalOverviewOrActivityListRequest> serializer() {
            return SignalOverviewOrActivityListRequest$$serializer.INSTANCE;
        }

        public static /* synthetic */ SignalOverviewOrActivityListRequest createRequest$default(Companion companion, String str, int i, C29481kuU c29481kuU, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "";
            }
            if ((i2 & 2) != 0) {
                i = 6;
            }
            return companion.EZpvd(str, i, c29481kuU);
        }

        public final SignalOverviewOrActivityListRequest EZpvd(@NotNull String str, int i, @NotNull C29481kuU c29481kuU) {
            String str2;
            String strValueOf = "";
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c29481kuU, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strValueOf2 = c29481kuU.copydefault().valueOf();
            List<SignalMultiSelectUiModel> listOLrzqt = c29481kuU.OLrzqt();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
            Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(C33129mqd.AhwBna(((SignalMultiSelectUiModel) it.next()).copydefault())));
            }
            List<String> listAEQbTJ = c29481kuU.AEQbTJ();
            SignalMetricsFilter signalMetricsFilterKWHzl = c29481kuU.KWHzl();
            SignalsFilter signalsFilterAhwBna = c29481kuU.AhwBna();
            String value = TxType.BUY.getValue();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
            Iterator<T> it2 = listAEQbTJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(C33129mqd.AhwBna((String) it2.next())));
            }
            SignalMetricsFilterRequest signalMetricsFilterRequest = new SignalMetricsFilterRequest(signalsFilterAhwBna.EZpvd().AhwBna(), signalsFilterAhwBna.EZpvd().KWHzl(), signalsFilterAhwBna.KWHzl().AhwBna(), signalsFilterAhwBna.KWHzl().KWHzl(), signalsFilterAhwBna.copydefault().AhwBna(), signalsFilterAhwBna.copydefault().KWHzl(), signalsFilterAhwBna.AEQbTJ().AhwBna(), signalsFilterAhwBna.AEQbTJ().KWHzl());
            String strAhwBna = signalMetricsFilterKWHzl.copydefault().AhwBna();
            String strKWHzl = signalMetricsFilterKWHzl.copydefault().KWHzl();
            String strAhwBna2 = signalMetricsFilterKWHzl.AhwBna().AhwBna();
            String strKWHzl2 = signalMetricsFilterKWHzl.AhwBna().KWHzl();
            String strAhwBna3 = signalMetricsFilterKWHzl.OLrzqt().AhwBna();
            String strKWHzl3 = signalMetricsFilterKWHzl.OLrzqt().KWHzl();
            if (signalMetricsFilterKWHzl.EZpvd().length() == 0) {
                str2 = "";
            } else {
                str2 = "";
                strValueOf = String.valueOf(jCurrentTimeMillis - (C33129mqd.valueOf(signalMetricsFilterKWHzl.EZpvd()) * TokenAgeType.Companion.copydefault(signalMetricsFilterKWHzl.gEmmrt())));
            }
            return new SignalOverviewOrActivityListRequest(i, str, strValueOf2, arrayList, value, arrayList2, signalMetricsFilterRequest, new TokenMetricsFilterRequest(strAhwBna, strKWHzl, strAhwBna2, strKWHzl2, strAhwBna3, strKWHzl3, strValueOf, signalMetricsFilterKWHzl.djBIcL().length() == 0 ? str2 : String.valueOf(jCurrentTimeMillis - (C33129mqd.valueOf(signalMetricsFilterKWHzl.djBIcL()) * TokenAgeType.Companion.copydefault(signalMetricsFilterKWHzl.gEmmrt()))), signalMetricsFilterKWHzl.valueOf().AhwBna(), signalMetricsFilterKWHzl.valueOf().KWHzl(), signalMetricsFilterKWHzl.KWHzl().AhwBna(), signalMetricsFilterKWHzl.KWHzl().KWHzl(), signalMetricsFilterKWHzl.AEQbTJ().AhwBna(), signalMetricsFilterKWHzl.AEQbTJ().KWHzl()));
        }
    }

    static {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(intSerializer), null, new ArrayListSerializer(intSerializer), null, null};
    }
}
