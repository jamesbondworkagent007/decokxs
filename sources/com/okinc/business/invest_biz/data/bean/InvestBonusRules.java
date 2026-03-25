package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestBonusRules implements Parcelable {
    private final List<InvestTipInfoVo> bonusRulesTips;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestBonusRules> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BuiltinSerializersKt.getNullable(InvestTipInfoVo$$serializer.INSTANCE))};

    public static final class Creator implements Parcelable.Creator<InvestBonusRules> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestBonusRules createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readInt() == 0 ? null : InvestTipInfoVo.CREATOR.createFromParcel(parcel));
            }
            return new InvestBonusRules(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestBonusRules[] newArray(int i) {
            return new InvestBonusRules[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestBonusRules() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestBonusRules */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestBonusRules copy$default(InvestBonusRules investBonusRules, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investBonusRules.bonusRulesTips;
        }
        return investBonusRules.copy(list);
    }

    @SerialName("bonusRulesTips")
    public static /* synthetic */ void getBonusRulesTips$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> component1() {
        return this.bonusRulesTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestBonusRules copy(@NotNull List<InvestTipInfoVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestBonusRules(list);
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
        return (obj instanceof InvestBonusRules) && Intrinsics.EZpvd(this.bonusRulesTips, ((InvestBonusRules) obj).bonusRulesTips);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> getBonusRulesTips() {
        return this.bonusRulesTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.bonusRulesTips.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestBonusRules(bonusRulesTips=" + this.bonusRulesTips + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<InvestTipInfoVo> list = this.bonusRulesTips;
        parcel.writeInt(list.size());
        for (InvestTipInfoVo investTipInfoVo : list) {
            if (investTipInfoVo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                investTipInfoVo.writeToParcel(parcel, i);
            }
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestBonusRules.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestBonusRules> serializer() {
            return InvestBonusRules$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestBonusRules(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bonusRulesTips = yDY.AhwBna();
        } else {
            this.bonusRulesTips = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestBonusRules investBonusRules, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(investBonusRules.bonusRulesTips, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investBonusRules.bonusRulesTips);
    }

    public InvestBonusRules(@NotNull List<InvestTipInfoVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.bonusRulesTips = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:208)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestTipInfoVo>):void (m)] (LINE:206) call: com.okinc.business.invest_biz.data.bean.InvestBonusRules.<init>(java.util.List):void type: THIS */
    public /* synthetic */ InvestBonusRules(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
