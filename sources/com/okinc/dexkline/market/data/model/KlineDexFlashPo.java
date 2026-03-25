package com.okinc.dexkline.market.data.model;

import com.okinc.kline.news.data.KlineCampaignData;
import com.okinc.kline.news.data.KlineCampaignData$$serializer;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class KlineDexFlashPo {
    private final ArrayList<KlineCampaignData> contentFlash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(KlineCampaignData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineDexFlashPo() {
        this((ArrayList) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<KlineCampaignData> getContentFlash() {
        return this.contentFlash;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.KlineDexFlashPo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<KlineDexFlashPo> serializer() {
            return KlineDexFlashPo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KlineDexFlashPo(int i, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.contentFlash = null;
        } else {
            this.contentFlash = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(KlineDexFlashPo klineDexFlashPo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && klineDexFlashPo.contentFlash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], klineDexFlashPo.contentFlash);
    }

    public KlineDexFlashPo(ArrayList<KlineCampaignData> arrayList) {
        this.contentFlash = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r1v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.kline.news.data.KlineCampaignData>):void (m)] (LINE:9) call: com.okinc.dexkline.market.data.model.KlineDexFlashPo.<init>(java.util.ArrayList):void type: THIS */
    public /* synthetic */ KlineDexFlashPo(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList);
    }
}
