package com.okinc.kyc.api.biz.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class BannerModelBean implements Parcelable {
    public static final int $stable = 0;
    private final BannerModelContentBean content;
    private final long contentId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BannerModelBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<BannerModelBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerModelBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BannerModelBean(parcel.readLong(), BannerModelContentBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerModelBean[] newArray(int i) {
            return new BannerModelBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerModelBean() {
        this(0L, (BannerModelContentBean) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BannerModelBean copy$default(BannerModelBean bannerModelBean, long j, BannerModelContentBean bannerModelContentBean, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bannerModelBean.contentId;
        }
        if ((i & 2) != 0) {
            bannerModelContentBean = bannerModelBean.content;
        }
        return bannerModelBean.copy(j, bannerModelContentBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerModelContentBean component2() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerModelBean copy(long j, @NotNull BannerModelContentBean bannerModelContentBean) {
        Intrinsics.checkNotNullParameter(bannerModelContentBean, "");
        return new BannerModelBean(j, bannerModelContentBean);
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
        if (!(obj instanceof BannerModelBean)) {
            return false;
        }
        BannerModelBean bannerModelBean = (BannerModelBean) obj;
        return this.contentId == bannerModelBean.contentId && Intrinsics.EZpvd(this.content, bannerModelBean.content);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerModelContentBean getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.contentId) * 31) + this.content.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerModelBean(contentId=" + this.contentId + ", content=" + this.content + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.contentId);
        this.content.writeToParcel(parcel, i);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.BannerModelBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerModelBean> serializer() {
            return BannerModelBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerModelBean(int i, long j, BannerModelContentBean bannerModelContentBean, SerializationConstructorMarker serializationConstructorMarker) {
        this.contentId = (i & 1) == 0 ? 0L : j;
        this.content = (i & 2) == 0 ? new BannerModelContentBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 1023, (DefaultConstructorMarker) null) : bannerModelContentBean;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(BannerModelBean bannerModelBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bannerModelBean.contentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, bannerModelBean.contentId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(bannerModelBean.content, new BannerModelContentBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 1023, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, BannerModelContentBean$$serializer.INSTANCE, bannerModelBean.content);
    }

    public BannerModelBean(long j, @NotNull BannerModelContentBean bannerModelContentBean) {
        Intrinsics.checkNotNullParameter(bannerModelContentBean, "");
        this.contentId = j;
        this.content = bannerModelContentBean;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BannerModelBean(long r17, com.okinc.kyc.api.biz.bean.BannerModelContentBean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r16 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L7
            r0 = 0
            goto L9
        L7:
            r0 = r17
        L9:
            r2 = r20 & 2
            if (r2 == 0) goto L23
            com.okinc.kyc.api.biz.bean.BannerModelContentBean r2 = new com.okinc.kyc.api.biz.bean.BannerModelContentBean
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
            r14 = 1023(0x3ff, float:1.434E-42)
            r15 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3 = r16
            goto L27
        L23:
            r3 = r16
            r2 = r19
        L27:
            r3.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okinc.kyc.api.biz.bean.BannerModelBean.<init>(long, com.okinc.kyc.api.biz.bean.BannerModelContentBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
