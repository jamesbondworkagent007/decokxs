package com.okinc.crcore.coreapi.net.responsebean;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class NewCoinListResponseBean {
    private final ArrayList<NewCoinRankResponseBean> online;
    private final ArrayList<WaitOnlineRankResponseBean> waitOnlineNew;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(NewCoinRankResponseBean$$serializer.INSTANCE), new ArrayListSerializer(WaitOnlineRankResponseBean$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NewCoinListResponseBean() {
        this((ArrayList) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.NewCoinListResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewCoinListResponseBean copy$default(NewCoinListResponseBean newCoinListResponseBean, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = newCoinListResponseBean.online;
        }
        if ((i & 2) != 0) {
            arrayList2 = newCoinListResponseBean.waitOnlineNew;
        }
        return newCoinListResponseBean.copy(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NewCoinRankResponseBean> component1() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WaitOnlineRankResponseBean> component2() {
        return this.waitOnlineNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewCoinListResponseBean copy(@NotNull ArrayList<NewCoinRankResponseBean> arrayList, @NotNull ArrayList<WaitOnlineRankResponseBean> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new NewCoinListResponseBean(arrayList, arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewCoinListResponseBean)) {
            return false;
        }
        NewCoinListResponseBean newCoinListResponseBean = (NewCoinListResponseBean) obj;
        return Intrinsics.EZpvd(this.online, newCoinListResponseBean.online) && Intrinsics.EZpvd(this.waitOnlineNew, newCoinListResponseBean.waitOnlineNew);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<NewCoinRankResponseBean> getOnline() {
        return this.online;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<WaitOnlineRankResponseBean> getWaitOnlineNew() {
        return this.waitOnlineNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.online.hashCode() * 31) + this.waitOnlineNew.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewCoinListResponseBean(online=" + this.online + ", waitOnlineNew=" + this.waitOnlineNew + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.NewCoinListResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NewCoinListResponseBean> serializer() {
            return NewCoinListResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NewCoinListResponseBean(int i, ArrayList arrayList, ArrayList arrayList2, SerializationConstructorMarker serializationConstructorMarker) {
        this.online = (i & 1) == 0 ? new ArrayList() : arrayList;
        if ((i & 2) == 0) {
            this.waitOnlineNew = new ArrayList<>();
        } else {
            this.waitOnlineNew = arrayList2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(NewCoinListResponseBean newCoinListResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(newCoinListResponseBean.online, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], newCoinListResponseBean.online);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(newCoinListResponseBean.waitOnlineNew, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], newCoinListResponseBean.waitOnlineNew);
    }

    public NewCoinListResponseBean(@NotNull ArrayList<NewCoinRankResponseBean> arrayList, @NotNull ArrayList<WaitOnlineRankResponseBean> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.online = arrayList;
        this.waitOnlineNew = arrayList2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:11) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:12) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
 A[MD:(java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.NewCoinRankResponseBean>, java.util.ArrayList<com.okinc.crcore.coreapi.net.responsebean.WaitOnlineRankResponseBean>):void (m)] (LINE:10) call: com.okinc.crcore.coreapi.net.responsebean.NewCoinListResponseBean.<init>(java.util.ArrayList, java.util.ArrayList):void type: THIS */
    public /* synthetic */ NewCoinListResponseBean(ArrayList arrayList, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2);
    }
}
