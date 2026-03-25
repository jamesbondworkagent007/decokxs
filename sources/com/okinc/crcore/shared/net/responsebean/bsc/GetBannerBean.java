package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.GetBannerResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportBannerResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class GetBannerBean {
    private final List<SupportBannerBean> supportBanners;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SupportBannerBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetBannerBean() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetBannerBean copy$default(GetBannerBean getBannerBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getBannerBean.supportBanners;
        }
        return getBannerBean.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportBannerBean> component1() {
        return this.supportBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetBannerBean copy(@NotNull List<SupportBannerBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new GetBannerBean(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBannerBean) && Intrinsics.EZpvd(this.supportBanners, ((GetBannerBean) obj).supportBanners);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SupportBannerBean> getSupportBanners() {
        return this.supportBanners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.supportBanners.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetBannerBean(supportBanners=" + this.supportBanners + ")";
    }

    public /* synthetic */ GetBannerBean(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.supportBanners = yDY.AhwBna();
        } else {
            this.supportBanners = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(GetBannerBean getBannerBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(getBannerBean.supportBanners, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], getBannerBean.supportBanners);
    }

    public GetBannerBean(@NotNull List<SupportBannerBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.supportBanners = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.SupportBannerBean>):void (m)] (LINE:9) call: com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean.<init>(java.util.List):void type: THIS */
    public /* synthetic */ GetBannerBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.GetBannerBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetBannerBean> serializer() {
            return GetBannerBean$$serializer.INSTANCE;
        }

        public final GetBannerBean EZpvd(@NotNull GetBannerResponseBean getBannerResponseBean) {
            Intrinsics.checkNotNullParameter(getBannerResponseBean, "");
            List<SupportBannerResponseBean> supportBanners = getBannerResponseBean.getSupportBanners();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(supportBanners, 10));
            Iterator<T> it = supportBanners.iterator();
            while (it.hasNext()) {
                arrayList.add(SupportBannerBean.Companion.OLrzqt((SupportBannerResponseBean) it.next()));
            }
            return new GetBannerBean(arrayList);
        }
    }
}
