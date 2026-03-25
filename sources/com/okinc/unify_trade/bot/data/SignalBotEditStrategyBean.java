package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SignalBotEditStrategyBean implements Parcelable {
    private final String algoId;
    private final List<String> instIds;
    private final ExitSignalOrderAmtParam signalBotOrderStopParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalBotEditStrategyBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<SignalBotEditStrategyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotEditStrategyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalBotEditStrategyBean(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : ExitSignalOrderAmtParam.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalBotEditStrategyBean[] newArray(int i) {
            return new SignalBotEditStrategyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalBotEditStrategyBean() {
        this((String) null, (List) null, (ExitSignalOrderAmtParam) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalBotEditStrategyBean copy$default(SignalBotEditStrategyBean signalBotEditStrategyBean, String str, List list, ExitSignalOrderAmtParam exitSignalOrderAmtParam, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signalBotEditStrategyBean.algoId;
        }
        if ((i & 2) != 0) {
            list = signalBotEditStrategyBean.instIds;
        }
        if ((i & 4) != 0) {
            exitSignalOrderAmtParam = signalBotEditStrategyBean.signalBotOrderStopParam;
        }
        return signalBotEditStrategyBean.copy(str, list, exitSignalOrderAmtParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam component3() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalBotEditStrategyBean copy(@NotNull String str, List<String> list, ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignalBotEditStrategyBean(str, list, exitSignalOrderAmtParam);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignalBotEditStrategyBean)) {
            return false;
        }
        SignalBotEditStrategyBean signalBotEditStrategyBean = (SignalBotEditStrategyBean) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) signalBotEditStrategyBean.algoId) && Intrinsics.EZpvd(this.instIds, signalBotEditStrategyBean.instIds) && Intrinsics.EZpvd(this.signalBotOrderStopParam, signalBotEditStrategyBean.signalBotOrderStopParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInstIds() {
        return this.instIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExitSignalOrderAmtParam getSignalBotOrderStopParam() {
        return this.signalBotOrderStopParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        List<String> list = this.instIds;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        return (((iHashCode * 31) + iHashCode2) * 31) + (exitSignalOrderAmtParam != null ? exitSignalOrderAmtParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalBotEditStrategyBean(algoId=" + this.algoId + ", instIds=" + this.instIds + ", signalBotOrderStopParam=" + this.signalBotOrderStopParam + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeStringList(this.instIds);
        ExitSignalOrderAmtParam exitSignalOrderAmtParam = this.signalBotOrderStopParam;
        if (exitSignalOrderAmtParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exitSignalOrderAmtParam.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignalBotEditStrategyBean> serializer() {
            return SignalBotEditStrategyBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignalBotEditStrategyBean(int i, String str, List list, ExitSignalOrderAmtParam exitSignalOrderAmtParam, SerializationConstructorMarker serializationConstructorMarker) {
        this.algoId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.instIds = null;
        } else {
            this.instIds = list;
        }
        if ((i & 4) == 0) {
            this.signalBotOrderStopParam = null;
        } else {
            this.signalBotOrderStopParam = exitSignalOrderAmtParam;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SignalBotEditStrategyBean signalBotEditStrategyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signalBotEditStrategyBean.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signalBotEditStrategyBean.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || signalBotEditStrategyBean.instIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], signalBotEditStrategyBean.instIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && signalBotEditStrategyBean.signalBotOrderStopParam == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ExitSignalOrderAmtParam$$serializer.INSTANCE, signalBotEditStrategyBean.signalBotOrderStopParam);
    }

    public SignalBotEditStrategyBean(@NotNull String str, List<String> list, ExitSignalOrderAmtParam exitSignalOrderAmtParam) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
        this.instIds = list;
        this.signalBotOrderStopParam = exitSignalOrderAmtParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:com.okinc.unify_trade.biz.ExitSignalOrderAmtParam:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ExitSignalOrderAmtParam) : (r4v0 com.okinc.unify_trade.biz.ExitSignalOrderAmtParam))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, com.okinc.unify_trade.biz.ExitSignalOrderAmtParam):void (m)] (LINE:754) call: com.okinc.unify_trade.bot.data.SignalBotEditStrategyBean.<init>(java.lang.String, java.util.List, com.okinc.unify_trade.biz.ExitSignalOrderAmtParam):void type: THIS */
    public /* synthetic */ SignalBotEditStrategyBean(String str, List list, ExitSignalOrderAmtParam exitSignalOrderAmtParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : exitSignalOrderAmtParam);
    }
}
