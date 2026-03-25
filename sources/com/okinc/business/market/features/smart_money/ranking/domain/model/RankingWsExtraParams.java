package com.okinc.business.market.features.smart_money.ranking.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class RankingWsExtraParams {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String rankEnd;
    public final String rankStart;
    public final RankingFilter rankingFilter;
    public final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankingWsExtraParams() {
        this((String) null, (String) null, (String) null, (RankingFilter) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankingWsExtraParams copy$default(RankingWsExtraParams rankingWsExtraParams, String str, String str2, String str3, RankingFilter rankingFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankingWsExtraParams.userWalletAddress;
        }
        if ((i & 2) != 0) {
            str2 = rankingWsExtraParams.rankEnd;
        }
        if ((i & 4) != 0) {
            str3 = rankingWsExtraParams.rankStart;
        }
        if ((i & 8) != 0) {
            rankingFilter = rankingWsExtraParams.rankingFilter;
        }
        return rankingWsExtraParams.copydefault(str, str2, str3, rankingFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingWsExtraParams copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, RankingFilter rankingFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RankingWsExtraParams(str, str2, str3, rankingFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankingWsExtraParams)) {
            return false;
        }
        RankingWsExtraParams rankingWsExtraParams = (RankingWsExtraParams) obj;
        return Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) rankingWsExtraParams.userWalletAddress) && Intrinsics.EZpvd((Object) this.rankEnd, (Object) rankingWsExtraParams.rankEnd) && Intrinsics.EZpvd((Object) this.rankStart, (Object) rankingWsExtraParams.rankStart) && Intrinsics.EZpvd(this.rankingFilter, rankingWsExtraParams.rankingFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.userWalletAddress.hashCode();
        int iHashCode2 = this.rankEnd.hashCode();
        int iHashCode3 = this.rankStart.hashCode();
        RankingFilter rankingFilter = this.rankingFilter;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (rankingFilter == null ? 0 : rankingFilter.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankingWsExtraParams(userWalletAddress=" + this.userWalletAddress + ", rankEnd=" + this.rankEnd + ", rankStart=" + this.rankStart + ", rankingFilter=" + this.rankingFilter + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.ranking.domain.model.RankingWsExtraParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankingWsExtraParams> serializer() {
            return RankingWsExtraParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RankingWsExtraParams(int i, String str, String str2, String str3, RankingFilter rankingFilter, SerializationConstructorMarker serializationConstructorMarker) {
        this.userWalletAddress = (i & 1) == 0 ? "" : str;
        this.rankEnd = (i & 2) == 0 ? "10" : str2;
        this.rankStart = (i & 4) == 0 ? "0" : str3;
        this.rankingFilter = (i & 8) == 0 ? new RankingFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null) : rankingFilter;
    }

    public static final /* synthetic */ void OLrzqt(RankingWsExtraParams rankingWsExtraParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rankingWsExtraParams.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rankingWsExtraParams.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rankingWsExtraParams.rankEnd, (Object) "10")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rankingWsExtraParams.rankEnd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rankingWsExtraParams.rankStart, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rankingWsExtraParams.rankStart);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(rankingWsExtraParams.rankingFilter, new RankingFilter((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 32767, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, RankingFilter$$serializer.INSTANCE, rankingWsExtraParams.rankingFilter);
    }

    public RankingWsExtraParams(@NotNull String str, @NotNull String str2, @NotNull String str3, RankingFilter rankingFilter) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.userWalletAddress = str;
        this.rankEnd = str2;
        this.rankStart = str3;
        this.rankingFilter = rankingFilter;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RankingWsExtraParams(java.lang.String r23, java.lang.String r24, java.lang.String r25, com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r22 = this;
            r0 = r27 & 1
            if (r0 == 0) goto L7
            java.lang.String r0 = ""
            goto L9
        L7:
            r0 = r23
        L9:
            r1 = r27 & 2
            if (r1 == 0) goto L10
            java.lang.String r1 = "10"
            goto L12
        L10:
            r1 = r24
        L12:
            r2 = r27 & 4
            if (r2 == 0) goto L19
            java.lang.String r2 = "0"
            goto L1b
        L19:
            r2 = r25
        L1b:
            r3 = r27 & 8
            if (r3 == 0) goto L3f
            com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter r3 = new com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter
            r4 = r3
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 32767(0x7fff, float:4.5916E-41)
            r21 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = r22
            goto L43
        L3f:
            r4 = r22
            r3 = r26
        L43:
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.market.features.smart_money.ranking.domain.model.RankingWsExtraParams.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
