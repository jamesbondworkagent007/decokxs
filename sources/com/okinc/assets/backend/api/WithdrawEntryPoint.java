package com.okinc.assets.backend.api;

import com.okinc.assets.backend.api.WithdrawEntryPoint;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC56387yDm;
import o.InterfaceC56551yJo;
import o.InterfaceC8231ayo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public abstract class WithdrawEntryPoint implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ayl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return WithdrawEntryPoint._init_$_anonymous_();
        }
    });

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.WithdrawEntryPoint.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WithdrawEntryPoint(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ void write$Self(WithdrawEntryPoint withdrawEntryPoint, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.WithdrawEntryPoint.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) WithdrawEntryPoint.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<WithdrawEntryPoint> serializer() {
            return KWHzl();
        }
    }

    private WithdrawEntryPoint() {
    }

    public /* synthetic */ WithdrawEntryPoint(int i, SerializationConstructorMarker serializationConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new SealedClassSerializer("com.okinc.assets.backend.api.WithdrawEntryPoint", C56524yIo.AEQbTJ(WithdrawEntryPoint.class), new InterfaceC56551yJo[0], new KSerializer[0], new Annotation[0]);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SelectCoin extends WithdrawEntryPoint {
        public static final int $stable = 0;
        public static final SelectCoin INSTANCE = new SelectCoin();

        private SelectCoin() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SelectWithdrawalMethod extends WithdrawEntryPoint {
        public static final int $stable = 0;
        private final Integer currencyId;
        private final String source;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SelectWithdrawalMethod() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SelectWithdrawalMethod copy$default(SelectWithdrawalMethod selectWithdrawalMethod, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = selectWithdrawalMethod.source;
            }
            if ((i & 2) != 0) {
                num = selectWithdrawalMethod.currencyId;
            }
            return selectWithdrawalMethod.copy(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelectWithdrawalMethod copy(String str, Integer num) {
            return new SelectWithdrawalMethod(str, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectWithdrawalMethod)) {
                return false;
            }
            SelectWithdrawalMethod selectWithdrawalMethod = (SelectWithdrawalMethod) obj;
            return Intrinsics.EZpvd((Object) this.source, (Object) selectWithdrawalMethod.source) && Intrinsics.EZpvd(this.currencyId, selectWithdrawalMethod.currencyId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSource() {
            return this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.source;
            int iHashCode = str == null ? 0 : str.hashCode();
            Integer num = this.currencyId;
            return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectWithdrawalMethod(source=" + this.source + ", currencyId=" + this.currencyId + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.assets.backend.api.WithdrawEntryPoint.SelectWithdrawalMethod.<init>(java.lang.String, java.lang.Integer):void type: THIS */
        public /* synthetic */ SelectWithdrawalMethod(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
        }

        public SelectWithdrawalMethod(String str, Integer num) {
            super(null);
            this.source = str;
            this.currencyId = num;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SelectCryptoWithdrawalMethod extends WithdrawEntryPoint {
        public static final int $stable = 0;
        private final int currencyId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SelectCryptoWithdrawalMethod copy$default(SelectCryptoWithdrawalMethod selectCryptoWithdrawalMethod, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = selectCryptoWithdrawalMethod.currencyId;
            }
            return selectCryptoWithdrawalMethod.copy(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelectCryptoWithdrawalMethod copy(int i) {
            return new SelectCryptoWithdrawalMethod(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectCryptoWithdrawalMethod) && this.currencyId == ((SelectCryptoWithdrawalMethod) obj).currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.currencyId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectCryptoWithdrawalMethod(currencyId=" + this.currencyId + ")";
        }

        public SelectCryptoWithdrawalMethod(int i) {
            super(null);
            this.currencyId = i;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class WithdrawlTradableInUnsupportedEntity extends WithdrawEntryPoint {
        public static final int $stable = 0;
        private final int currencyId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WithdrawlTradableInUnsupportedEntity copy$default(WithdrawlTradableInUnsupportedEntity withdrawlTradableInUnsupportedEntity, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = withdrawlTradableInUnsupportedEntity.currencyId;
            }
            return withdrawlTradableInUnsupportedEntity.copy(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WithdrawlTradableInUnsupportedEntity copy(int i) {
            return new WithdrawlTradableInUnsupportedEntity(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithdrawlTradableInUnsupportedEntity) && this.currencyId == ((WithdrawlTradableInUnsupportedEntity) obj).currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCurrencyId() {
            return this.currencyId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.currencyId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WithdrawlTradableInUnsupportedEntity(currencyId=" + this.currencyId + ")";
        }

        public WithdrawlTradableInUnsupportedEntity(int i) {
            super(null);
            this.currencyId = i;
        }
    }

    public static final class WithdrawalDetail extends WithdrawEntryPoint {
        public static final int $stable = 8;
        private final InterfaceC8231ayo currency;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WithdrawalDetail copy$default(WithdrawalDetail withdrawalDetail, InterfaceC8231ayo interfaceC8231ayo, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC8231ayo = withdrawalDetail.currency;
            }
            return withdrawalDetail.copy(interfaceC8231ayo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC8231ayo component1() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WithdrawalDetail copy(@NotNull InterfaceC8231ayo interfaceC8231ayo) {
            Intrinsics.checkNotNullParameter(interfaceC8231ayo, "");
            return new WithdrawalDetail(interfaceC8231ayo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WithdrawalDetail) && Intrinsics.EZpvd(this.currency, ((WithdrawalDetail) obj).currency);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC8231ayo getCurrency() {
            return this.currency;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.currency.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "WithdrawalDetail(currency=" + this.currency + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawalDetail(@NotNull InterfaceC8231ayo interfaceC8231ayo) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC8231ayo, "");
            this.currency = interfaceC8231ayo;
        }
    }
}
