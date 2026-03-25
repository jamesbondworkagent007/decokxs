package com.okinc.business.trade.features.home.ui.meme.data;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class MemeSearchBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<DexMultiTokenInfoBean> memeList;
    private final List<DexMultiTokenInfoBean> memeUnsupportList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeSearchBean() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> getMemeList() {
        return this.memeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> getMemeUnsupportList() {
        return this.memeUnsupportList;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.MemeSearchBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeSearchBean> serializer() {
            return MemeSearchBean$$serializer.INSTANCE;
        }
    }

    static {
        DexMultiTokenInfoBean$$serializer dexMultiTokenInfoBean$$serializer = DexMultiTokenInfoBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(dexMultiTokenInfoBean$$serializer), new ArrayListSerializer(dexMultiTokenInfoBean$$serializer)};
    }

    public /* synthetic */ MemeSearchBean(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.memeList = null;
        } else {
            this.memeList = list;
        }
        if ((i & 2) == 0) {
            this.memeUnsupportList = null;
        } else {
            this.memeUnsupportList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeSearchBean memeSearchBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || memeSearchBean.memeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], memeSearchBean.memeList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && memeSearchBean.memeUnsupportList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], memeSearchBean.memeUnsupportList);
    }

    public MemeSearchBean(List<DexMultiTokenInfoBean> list, List<DexMultiTokenInfoBean> list2) {
        this.memeList = list;
        this.memeUnsupportList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>, java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>):void (m)] (LINE:15) call: com.okinc.business.trade.features.home.ui.meme.data.MemeSearchBean.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ MemeSearchBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
