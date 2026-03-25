package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class DevAnalysisData {
    public final List<DevAnalysisCreatedTokens> devAnalysisDetailVOList;
    public final DevAnalysisTokenSummary devAnalysisSummaryVO;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DevAnalysisCreatedTokens$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DevAnalysisData() {
        this((List) null, (DevAnalysisTokenSummary) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.DevAnalysisData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevAnalysisData copy$default(DevAnalysisData devAnalysisData, List list, DevAnalysisTokenSummary devAnalysisTokenSummary, int i, Object obj) {
        if ((i & 1) != 0) {
            list = devAnalysisData.devAnalysisDetailVOList;
        }
        if ((i & 2) != 0) {
            devAnalysisTokenSummary = devAnalysisData.devAnalysisSummaryVO;
        }
        return devAnalysisData.AEQbTJ(list, devAnalysisTokenSummary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevAnalysisData AEQbTJ(@NotNull List<DevAnalysisCreatedTokens> list, @NotNull DevAnalysisTokenSummary devAnalysisTokenSummary) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(devAnalysisTokenSummary, "");
        return new DevAnalysisData(list, devAnalysisTokenSummary);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DevAnalysisCreatedTokens> AEQbTJ() {
        return this.devAnalysisDetailVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DevAnalysisTokenSummary copydefault() {
        return this.devAnalysisSummaryVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DevAnalysisData)) {
            return false;
        }
        DevAnalysisData devAnalysisData = (DevAnalysisData) obj;
        return Intrinsics.EZpvd(this.devAnalysisDetailVOList, devAnalysisData.devAnalysisDetailVOList) && Intrinsics.EZpvd(this.devAnalysisSummaryVO, devAnalysisData.devAnalysisSummaryVO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.devAnalysisDetailVOList.hashCode() * 31) + this.devAnalysisSummaryVO.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DevAnalysisData(devAnalysisDetailVOList=" + this.devAnalysisDetailVOList + ", devAnalysisSummaryVO=" + this.devAnalysisSummaryVO + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.DevAnalysisData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DevAnalysisData> serializer() {
            return DevAnalysisData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DevAnalysisData(int i, List list, DevAnalysisTokenSummary devAnalysisTokenSummary, SerializationConstructorMarker serializationConstructorMarker) {
        this.devAnalysisDetailVOList = (i & 1) == 0 ? yDY.AhwBna() : list;
        this.devAnalysisSummaryVO = (i & 2) == 0 ? new DevAnalysisTokenSummary((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null) : devAnalysisTokenSummary;
    }

    public static final /* synthetic */ void KWHzl(DevAnalysisData devAnalysisData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(devAnalysisData.devAnalysisDetailVOList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], devAnalysisData.devAnalysisDetailVOList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(devAnalysisData.devAnalysisSummaryVO, new DevAnalysisTokenSummary((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, DevAnalysisTokenSummary$$serializer.INSTANCE, devAnalysisData.devAnalysisSummaryVO);
    }

    public DevAnalysisData(@NotNull List<DevAnalysisCreatedTokens> list, @NotNull DevAnalysisTokenSummary devAnalysisTokenSummary) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(devAnalysisTokenSummary, "");
        this.devAnalysisDetailVOList = list;
        this.devAnalysisSummaryVO = devAnalysisTokenSummary;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DevAnalysisData(java.util.List r17, com.okinc.business.market.data.model.DevAnalysisTokenSummary r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r16 = this;
            r0 = r19 & 1
            if (r0 == 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt.EZpvd()
            goto Lb
        L9:
            r0 = r17
        Lb:
            r1 = r19 & 2
            if (r1 == 0) goto L26
            com.okinc.business.market.data.model.DevAnalysisTokenSummary r1 = new com.okinc.business.market.data.model.DevAnalysisTokenSummary
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 2047(0x7ff, float:2.868E-42)
            r15 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r16
            goto L2a
        L26:
            r2 = r16
            r1 = r18
        L2a:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.data.model.DevAnalysisData.<init>(java.util.List, com.okinc.business.market.data.model.DevAnalysisTokenSummary, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
