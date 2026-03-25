package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class RemainingRepaymentInfo implements Parcelable {
    private final InvestTokenWithAmount realRemainingRepayment;
    private final InvestTokenWithAmount remainingRepayment;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RemainingRepaymentInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RemainingRepaymentInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemainingRepaymentInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<InvestTokenWithAmount> creator = InvestTokenWithAmount.CREATOR;
            return new RemainingRepaymentInfo(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemainingRepaymentInfo[] newArray(int i) {
            return new RemainingRepaymentInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RemainingRepaymentInfo() {
        this((InvestTokenWithAmount) null, (InvestTokenWithAmount) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RemainingRepaymentInfo copy$default(RemainingRepaymentInfo remainingRepaymentInfo, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, int i, Object obj) {
        if ((i & 1) != 0) {
            investTokenWithAmount = remainingRepaymentInfo.remainingRepayment;
        }
        if ((i & 2) != 0) {
            investTokenWithAmount2 = remainingRepaymentInfo.realRemainingRepayment;
        }
        return remainingRepaymentInfo.copy(investTokenWithAmount, investTokenWithAmount2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component1() {
        return this.remainingRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount component2() {
        return this.realRemainingRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemainingRepaymentInfo copy(@NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTokenWithAmount investTokenWithAmount2) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        return new RemainingRepaymentInfo(investTokenWithAmount, investTokenWithAmount2);
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
        if (!(obj instanceof RemainingRepaymentInfo)) {
            return false;
        }
        RemainingRepaymentInfo remainingRepaymentInfo = (RemainingRepaymentInfo) obj;
        return Intrinsics.EZpvd(this.remainingRepayment, remainingRepaymentInfo.remainingRepayment) && Intrinsics.EZpvd(this.realRemainingRepayment, remainingRepaymentInfo.realRemainingRepayment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getRealRemainingRepayment() {
        return this.realRemainingRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getRemainingRepayment() {
        return this.remainingRepayment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.remainingRepayment.hashCode() * 31) + this.realRemainingRepayment.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RemainingRepaymentInfo(remainingRepayment=" + this.remainingRepayment + ", realRemainingRepayment=" + this.realRemainingRepayment + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.remainingRepayment.writeToParcel(parcel, i);
        this.realRemainingRepayment.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RemainingRepaymentInfo> serializer() {
            return RemainingRepaymentInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RemainingRepaymentInfo(int i, InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2, SerializationConstructorMarker serializationConstructorMarker) {
        this.remainingRepayment = (i & 1) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
        this.realRemainingRepayment = (i & 2) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount2;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(RemainingRepaymentInfo remainingRepaymentInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(remainingRepaymentInfo.remainingRepayment, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, InvestTokenWithAmount$$serializer.INSTANCE, remainingRepaymentInfo.remainingRepayment);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(remainingRepaymentInfo.realRemainingRepayment, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, InvestTokenWithAmount$$serializer.INSTANCE, remainingRepaymentInfo.realRemainingRepayment);
    }

    public RemainingRepaymentInfo(@NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull InvestTokenWithAmount investTokenWithAmount2) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
        this.remainingRepayment = investTokenWithAmount;
        this.realRemainingRepayment = investTokenWithAmount2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RemainingRepaymentInfo(com.okinc.business.invest_biz.data.models.InvestTokenWithAmount r35, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount r36, int r37, kotlin.jvm.internal.DefaultConstructorMarker r38) {
        /*
            r34 = this;
            r0 = r37 & 1
            if (r0 == 0) goto L3c
            com.okinc.business.invest_biz.data.models.InvestTokenWithAmount r0 = new com.okinc.business.invest_biz.data.models.InvestTokenWithAmount
            r1 = r0
            r2 = 0
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
            r31 = 268435455(0xfffffff, float:2.5243547E-29)
            r32 = 0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L3e
        L3c:
            r0 = r35
        L3e:
            r1 = r37 & 2
            if (r1 == 0) goto L7d
            com.okinc.business.invest_biz.data.models.InvestTokenWithAmount r1 = new com.okinc.business.invest_biz.data.models.InvestTokenWithAmount
            r2 = r1
            r3 = 0
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
            r32 = 268435455(0xfffffff, float:2.5243547E-29)
            r33 = 0
            r2.<init>(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = r34
            goto L81
        L7d:
            r2 = r34
            r1 = r36
        L81:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo.<init>(com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
