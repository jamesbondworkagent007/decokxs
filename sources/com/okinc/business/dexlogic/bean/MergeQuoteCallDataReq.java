package com.okinc.business.dexlogic.bean;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class MergeQuoteCallDataReq {
    private QuoteCallDataReq eoaQuoteCallDataReq;
    private final IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MergeQuoteCallDataReq() {
        this((QuoteCallDataReq) null, (IntentBridgeQuoteCallDataReq) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MergeQuoteCallDataReq copy$default(MergeQuoteCallDataReq mergeQuoteCallDataReq, QuoteCallDataReq quoteCallDataReq, IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq, int i, Object obj) {
        if ((i & 1) != 0) {
            quoteCallDataReq = mergeQuoteCallDataReq.eoaQuoteCallDataReq;
        }
        if ((i & 2) != 0) {
            intentBridgeQuoteCallDataReq = mergeQuoteCallDataReq.intentBridgeQuoteCallDataReq;
        }
        return mergeQuoteCallDataReq.copy(quoteCallDataReq, intentBridgeQuoteCallDataReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCallDataReq component1() {
        return this.eoaQuoteCallDataReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentBridgeQuoteCallDataReq component2() {
        return this.intentBridgeQuoteCallDataReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeQuoteCallDataReq copy(@NotNull QuoteCallDataReq quoteCallDataReq, @NotNull IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq) {
        Intrinsics.checkNotNullParameter(quoteCallDataReq, "");
        Intrinsics.checkNotNullParameter(intentBridgeQuoteCallDataReq, "");
        return new MergeQuoteCallDataReq(quoteCallDataReq, intentBridgeQuoteCallDataReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeQuoteCallDataReq)) {
            return false;
        }
        MergeQuoteCallDataReq mergeQuoteCallDataReq = (MergeQuoteCallDataReq) obj;
        return Intrinsics.EZpvd(this.eoaQuoteCallDataReq, mergeQuoteCallDataReq.eoaQuoteCallDataReq) && Intrinsics.EZpvd(this.intentBridgeQuoteCallDataReq, mergeQuoteCallDataReq.intentBridgeQuoteCallDataReq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCallDataReq getEoaQuoteCallDataReq() {
        return this.eoaQuoteCallDataReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntentBridgeQuoteCallDataReq getIntentBridgeQuoteCallDataReq() {
        return this.intentBridgeQuoteCallDataReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.eoaQuoteCallDataReq.hashCode() * 31) + this.intentBridgeQuoteCallDataReq.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEoaQuoteCallDataReq(@NotNull QuoteCallDataReq quoteCallDataReq) {
        Intrinsics.checkNotNullParameter(quoteCallDataReq, "");
        this.eoaQuoteCallDataReq = quoteCallDataReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MergeQuoteCallDataReq(eoaQuoteCallDataReq=" + this.eoaQuoteCallDataReq + ", intentBridgeQuoteCallDataReq=" + this.intentBridgeQuoteCallDataReq + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MergeQuoteCallDataReq> serializer() {
            return MergeQuoteCallDataReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MergeQuoteCallDataReq(int i, QuoteCallDataReq quoteCallDataReq, IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq, SerializationConstructorMarker serializationConstructorMarker) {
        this.eoaQuoteCallDataReq = (i & 1) == 0 ? new QuoteCallDataReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiMetaSaveOrderParam) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (Boolean) null, (ServiceFeeInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AccountInfo) null, (PresetRouteType) null, (SlippageMode) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null) : quoteCallDataReq;
        this.intentBridgeQuoteCallDataReq = (i & 2) == 0 ? new IntentBridgeQuoteCallDataReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : intentBridgeQuoteCallDataReq;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MergeQuoteCallDataReq mergeQuoteCallDataReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, QuoteCallDataReq$$serializer.INSTANCE, mergeQuoteCallDataReq.eoaQuoteCallDataReq);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(mergeQuoteCallDataReq.eoaQuoteCallDataReq, new QuoteCallDataReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (DexMultiMetaSaveOrderParam) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (Boolean) null, (ServiceFeeInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AccountInfo) null, (PresetRouteType) null, (SlippageMode) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null))) {
            }
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(mergeQuoteCallDataReq.intentBridgeQuoteCallDataReq, new IntentBridgeQuoteCallDataReq((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, IntentBridgeQuoteCallDataReq$$serializer.INSTANCE, mergeQuoteCallDataReq.intentBridgeQuoteCallDataReq);
    }

    public MergeQuoteCallDataReq(@NotNull QuoteCallDataReq quoteCallDataReq, @NotNull IntentBridgeQuoteCallDataReq intentBridgeQuoteCallDataReq) {
        Intrinsics.checkNotNullParameter(quoteCallDataReq, "");
        Intrinsics.checkNotNullParameter(intentBridgeQuoteCallDataReq, "");
        this.eoaQuoteCallDataReq = quoteCallDataReq;
        this.intentBridgeQuoteCallDataReq = intentBridgeQuoteCallDataReq;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MergeQuoteCallDataReq(com.okinc.business.dexlogic.bean.QuoteCallDataReq r35, com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r34 = this;
            r0 = r37 & 1
            if (r0 == 0) goto L3e
            com.okinc.business.dexlogic.bean.QuoteCallDataReq r0 = new com.okinc.business.dexlogic.bean.QuoteCallDataReq
            r1 = r0
            r2 = 0
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
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 1073741823(0x3fffffff, float:1.9999999)
            r33 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L40
        L3e:
            r0 = r35
        L40:
            r1 = r37 & 2
            if (r1 == 0) goto L59
            com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq r1 = new com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 511(0x1ff, float:7.16E-43)
            r13 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r34
            goto L5d
        L59:
            r2 = r34
            r1 = r36
        L5d:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq.<init>(com.okinc.business.dexlogic.bean.QuoteCallDataReq, com.okinc.business.dexlogic.bean.IntentBridgeQuoteCallDataReq, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getUserWalletAddress(boolean z, boolean z2) {
        if (z2) {
            String userWalletAddress = this.intentBridgeQuoteCallDataReq.getUserWalletAddress();
            return userWalletAddress == null ? "" : userWalletAddress;
        }
        return this.eoaQuoteCallDataReq.getUserWalletAddress();
    }
}
