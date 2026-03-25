package com.okinc.business.invest_biz.data.logic;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MySupplyResponseState {
    public static final int $stable = 0;
    private final int errorCode;
    private final String errorMsg;
    private final MySupplyResponseStateType errorType;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.invest_biz.data.logic.MySupplyResponseStateType", MySupplyResponseStateType.values()), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MySupplyResponseState copy$default(MySupplyResponseState mySupplyResponseState, MySupplyResponseStateType mySupplyResponseStateType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mySupplyResponseStateType = mySupplyResponseState.errorType;
        }
        if ((i2 & 2) != 0) {
            i = mySupplyResponseState.errorCode;
        }
        if ((i2 & 4) != 0) {
            str = mySupplyResponseState.errorMsg;
        }
        return mySupplyResponseState.copy(mySupplyResponseStateType, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MySupplyResponseStateType component1() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MySupplyResponseState copy(@NotNull MySupplyResponseStateType mySupplyResponseStateType, int i, String str) {
        Intrinsics.checkNotNullParameter(mySupplyResponseStateType, "");
        return new MySupplyResponseState(mySupplyResponseStateType, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MySupplyResponseState)) {
            return false;
        }
        MySupplyResponseState mySupplyResponseState = (MySupplyResponseState) obj;
        return this.errorType == mySupplyResponseState.errorType && this.errorCode == mySupplyResponseState.errorCode && Intrinsics.EZpvd((Object) this.errorMsg, (Object) mySupplyResponseState.errorMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MySupplyResponseStateType getErrorType() {
        return this.errorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.errorType.hashCode();
        int iHashCode2 = Integer.hashCode(this.errorCode);
        String str = this.errorMsg;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MySupplyResponseState(errorType=" + this.errorType + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.logic.MySupplyResponseState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MySupplyResponseState> serializer() {
            return MySupplyResponseState$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MySupplyResponseState(int i, MySupplyResponseStateType mySupplyResponseStateType, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MySupplyResponseState$$serializer.INSTANCE.getDescriptor());
        }
        this.errorType = mySupplyResponseStateType;
        if ((i & 2) == 0) {
            this.errorCode = 0;
        } else {
            this.errorCode = i2;
        }
        if ((i & 4) == 0) {
            this.errorMsg = null;
        } else {
            this.errorMsg = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(MySupplyResponseState mySupplyResponseState, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], mySupplyResponseState.errorType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mySupplyResponseState.errorCode != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, mySupplyResponseState.errorCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mySupplyResponseState.errorMsg == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mySupplyResponseState.errorMsg);
    }

    public MySupplyResponseState(@NotNull MySupplyResponseStateType mySupplyResponseStateType, int i, String str) {
        Intrinsics.checkNotNullParameter(mySupplyResponseStateType, "");
        this.errorType = mySupplyResponseStateType;
        this.errorCode = i;
        this.errorMsg = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 com.okinc.business.invest_biz.data.logic.MySupplyResponseStateType)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.data.logic.MySupplyResponseStateType, int, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.invest_biz.data.logic.MySupplyResponseState.<init>(com.okinc.business.invest_biz.data.logic.MySupplyResponseStateType, int, java.lang.String):void type: THIS */
    public /* synthetic */ MySupplyResponseState(MySupplyResponseStateType mySupplyResponseStateType, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mySupplyResponseStateType, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}
