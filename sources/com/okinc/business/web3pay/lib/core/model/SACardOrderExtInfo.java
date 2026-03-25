package com.okinc.business.web3pay.lib.core.model;

import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.C31267lqm;
import o.C33489mxS;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class SACardOrderExtInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final SACardTransactionAmountFiat acquirerAmount;
    public final SaCardFundDirection fundDirection;
    public final String merchantName;
    public final SACardTransactionAmountFiat transactionAmountFiat;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SACardOrderExtInfo copy$default(SACardOrderExtInfo sACardOrderExtInfo, String str, SACardTransactionAmountFiat sACardTransactionAmountFiat, SACardTransactionAmountFiat sACardTransactionAmountFiat2, SaCardFundDirection saCardFundDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sACardOrderExtInfo.merchantName;
        }
        if ((i & 2) != 0) {
            sACardTransactionAmountFiat = sACardOrderExtInfo.transactionAmountFiat;
        }
        if ((i & 4) != 0) {
            sACardTransactionAmountFiat2 = sACardOrderExtInfo.acquirerAmount;
        }
        if ((i & 8) != 0) {
            saCardFundDirection = sACardOrderExtInfo.fundDirection;
        }
        return sACardOrderExtInfo.OLrzqt(str, sACardTransactionAmountFiat, sACardTransactionAmountFiat2, saCardFundDirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SACardOrderExtInfo OLrzqt(@NotNull String str, @NotNull SACardTransactionAmountFiat sACardTransactionAmountFiat, SACardTransactionAmountFiat sACardTransactionAmountFiat2, SaCardFundDirection saCardFundDirection) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sACardTransactionAmountFiat, "");
        return new SACardOrderExtInfo(str, sACardTransactionAmountFiat, sACardTransactionAmountFiat2, saCardFundDirection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SACardOrderExtInfo)) {
            return false;
        }
        SACardOrderExtInfo sACardOrderExtInfo = (SACardOrderExtInfo) obj;
        return Intrinsics.EZpvd((Object) this.merchantName, (Object) sACardOrderExtInfo.merchantName) && Intrinsics.EZpvd(this.transactionAmountFiat, sACardOrderExtInfo.transactionAmountFiat) && Intrinsics.EZpvd(this.acquirerAmount, sACardOrderExtInfo.acquirerAmount) && this.fundDirection == sACardOrderExtInfo.fundDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.merchantName.hashCode();
        int iHashCode2 = this.transactionAmountFiat.hashCode();
        SACardTransactionAmountFiat sACardTransactionAmountFiat = this.acquirerAmount;
        int iHashCode3 = sACardTransactionAmountFiat == null ? 0 : sACardTransactionAmountFiat.hashCode();
        SaCardFundDirection saCardFundDirection = this.fundDirection;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (saCardFundDirection != null ? saCardFundDirection.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SACardOrderExtInfo(merchantName=" + this.merchantName + ", transactionAmountFiat=" + this.transactionAmountFiat + ", acquirerAmount=" + this.acquirerAmount + ", fundDirection=" + this.fundDirection + ")";
    }

    public /* synthetic */ SACardOrderExtInfo(int i, String str, SACardTransactionAmountFiat sACardTransactionAmountFiat, SACardTransactionAmountFiat sACardTransactionAmountFiat2, SaCardFundDirection saCardFundDirection, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, SACardOrderExtInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.merchantName = str;
        this.transactionAmountFiat = sACardTransactionAmountFiat;
        if ((i & 4) == 0) {
            this.acquirerAmount = null;
        } else {
            this.acquirerAmount = sACardTransactionAmountFiat2;
        }
        this.fundDirection = saCardFundDirection;
    }

    public static final /* synthetic */ void KWHzl(SACardOrderExtInfo sACardOrderExtInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sACardOrderExtInfo.merchantName);
        SACardTransactionAmountFiat$$serializer sACardTransactionAmountFiat$$serializer = SACardTransactionAmountFiat$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, sACardTransactionAmountFiat$$serializer, sACardOrderExtInfo.transactionAmountFiat);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sACardOrderExtInfo.acquirerAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, sACardTransactionAmountFiat$$serializer, sACardOrderExtInfo.acquirerAmount);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C31267lqm.copydefault, sACardOrderExtInfo.fundDirection);
    }

    public SACardOrderExtInfo(@NotNull String str, @NotNull SACardTransactionAmountFiat sACardTransactionAmountFiat, SACardTransactionAmountFiat sACardTransactionAmountFiat2, SaCardFundDirection saCardFundDirection) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sACardTransactionAmountFiat, "");
        this.merchantName = str;
        this.transactionAmountFiat = sACardTransactionAmountFiat;
        this.acquirerAmount = sACardTransactionAmountFiat2;
        this.fundDirection = saCardFundDirection;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.SACardOrderExtInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SACardOrderExtInfo> serializer() {
            return SACardOrderExtInfo$$serializer.INSTANCE;
        }

        public final SACardOrderExtInfo OLrzqt(JsonObject jsonObject) {
            Object objM7377constructorimpl;
            if (jsonObject == null) {
                return null;
            }
            try {
                Result.Application application = Result.Companion;
                Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
                jsonAEQbTJ.getSerializersModule();
                objM7377constructorimpl = Result.m7377constructorimpl((SACardOrderExtInfo) jsonAEQbTJ.decodeFromJsonElement(SACardOrderExtInfo.Companion.serializer(), jsonObject));
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return (SACardOrderExtInfo) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
    }
}
