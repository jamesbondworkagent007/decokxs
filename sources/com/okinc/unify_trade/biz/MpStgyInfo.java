package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class MpStgyInfo implements Parcelable {
    private LossInsurance lossInsurance;
    private MpStgyDetail stgyDetail;
    private MpStgyParam stgyParam;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MpStgyInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<MpStgyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MpStgyInfo(MpStgyParam.CREATOR.createFromParcel(parcel), MpStgyDetail.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LossInsurance.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpStgyInfo[] newArray(int i) {
            return new MpStgyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MpStgyInfo() {
        this((MpStgyParam) null, (MpStgyDetail) null, (LossInsurance) null, 7, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LossInsurance getLossInsurance() {
        return this.lossInsurance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpStgyDetail getStgyDetail() {
        return this.stgyDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpStgyParam getStgyParam() {
        return this.stgyParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLossInsurance(LossInsurance lossInsurance) {
        this.lossInsurance = lossInsurance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyDetail(@NotNull MpStgyDetail mpStgyDetail) {
        Intrinsics.checkNotNullParameter(mpStgyDetail, "");
        this.stgyDetail = mpStgyDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStgyParam(@NotNull MpStgyParam mpStgyParam) {
        Intrinsics.checkNotNullParameter(mpStgyParam, "");
        this.stgyParam = mpStgyParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.stgyParam.writeToParcel(parcel, i);
        this.stgyDetail.writeToParcel(parcel, i);
        LossInsurance lossInsurance = this.lossInsurance;
        if (lossInsurance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lossInsurance.writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.MpStgyInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MpStgyInfo> serializer() {
            return MpStgyInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MpStgyInfo(int i, MpStgyParam mpStgyParam, MpStgyDetail mpStgyDetail, LossInsurance lossInsurance, SerializationConstructorMarker serializationConstructorMarker) {
        this.stgyParam = (i & 1) == 0 ? new MpStgyParam((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (List) null, (Boolean) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, -1, -1, 3, (DefaultConstructorMarker) null) : mpStgyParam;
        this.stgyDetail = (i & 2) == 0 ? new MpStgyDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null) : mpStgyDetail;
        this.lossInsurance = (i & 4) == 0 ? null : lossInsurance;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(MpStgyInfo mpStgyInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, MpStgyParam$$serializer.INSTANCE, mpStgyInfo.stgyParam);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(mpStgyInfo.stgyParam, new MpStgyParam((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, (String) null, (String) null, (String) null, (TpSlTriggerParamReqResp) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (List) null, (Boolean) null, (String) null, (TrailingConfig) null, (TrailingConfig) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, -1, -1, 3, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(mpStgyInfo.stgyDetail, new MpStgyDetail((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, false, (ArrayList) null, (ArrayList) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, MpStgyDetail$$serializer.INSTANCE, mpStgyInfo.stgyDetail);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mpStgyInfo.lossInsurance == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LossInsurance$$serializer.INSTANCE, mpStgyInfo.lossInsurance);
    }

    public MpStgyInfo(@NotNull MpStgyParam mpStgyParam, @NotNull MpStgyDetail mpStgyDetail, LossInsurance lossInsurance) {
        Intrinsics.checkNotNullParameter(mpStgyParam, "");
        Intrinsics.checkNotNullParameter(mpStgyDetail, "");
        this.stgyParam = mpStgyParam;
        this.stgyDetail = mpStgyDetail;
        this.lossInsurance = lossInsurance;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MpStgyInfo(com.okinc.unify_trade.biz.MpStgyParam r73, com.okinc.unify_trade.biz.MpStgyDetail r74, com.okinc.unify_trade.biz.LossInsurance r75, int r76, kotlin.jvm.internal.DefaultConstructorMarker r77) {
        /*
            r72 = this;
            r0 = r76 & 1
            if (r0 == 0) goto L89
            com.okinc.unify_trade.biz.MpStgyParam r0 = new com.okinc.unify_trade.biz.MpStgyParam
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
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = -1
            r69 = -1
            r70 = 3
            r71 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            goto L8b
        L89:
            r0 = r73
        L8b:
            r1 = r76 & 2
            if (r1 == 0) goto La9
            com.okinc.unify_trade.biz.MpStgyDetail r1 = new com.okinc.unify_trade.biz.MpStgyDetail
            r2 = r1
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
            r17 = 16383(0x3fff, float:2.2957E-41)
            r18 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto Lab
        La9:
            r1 = r74
        Lab:
            r2 = r76 & 4
            if (r2 == 0) goto Lb3
            r2 = 0
            r3 = r72
            goto Lb7
        Lb3:
            r3 = r72
            r2 = r75
        Lb7:
            r3.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.unify_trade.biz.MpStgyInfo.<init>(com.okinc.unify_trade.biz.MpStgyParam, com.okinc.unify_trade.biz.MpStgyDetail, com.okinc.unify_trade.biz.LossInsurance, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
