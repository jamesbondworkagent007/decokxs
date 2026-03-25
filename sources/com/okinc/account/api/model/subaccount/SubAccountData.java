package com.okinc.account.api.model.subaccount;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class SubAccountData {
    private final Behavior behavior;
    private final ArrayList<SubAccount> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(SubAccount$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SubAccountData() {
        this((Behavior) null, (ArrayList) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.subaccount.SubAccountData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubAccountData copy$default(SubAccountData subAccountData, Behavior behavior, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            behavior = subAccountData.behavior;
        }
        if ((i & 2) != 0) {
            arrayList = subAccountData.list;
        }
        return subAccountData.copy(behavior, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Behavior component1() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubAccount> component2() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubAccountData copy(@NotNull Behavior behavior, @NotNull ArrayList<SubAccount> arrayList) {
        Intrinsics.checkNotNullParameter(behavior, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new SubAccountData(behavior, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubAccountData)) {
            return false;
        }
        SubAccountData subAccountData = (SubAccountData) obj;
        return Intrinsics.EZpvd(this.behavior, subAccountData.behavior) && Intrinsics.EZpvd(this.list, subAccountData.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Behavior getBehavior() {
        return this.behavior;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SubAccount> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.behavior.hashCode() * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubAccountData(behavior=" + this.behavior + ", list=" + this.list + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.subaccount.SubAccountData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubAccountData> serializer() {
            return SubAccountData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubAccountData(int i, Behavior behavior, ArrayList arrayList, SerializationConstructorMarker serializationConstructorMarker) {
        this.behavior = (i & 1) == 0 ? new Behavior(0, 0, 3, (DefaultConstructorMarker) null) : behavior;
        if ((i & 2) == 0) {
            this.list = new ArrayList<>();
        } else {
            this.list = arrayList;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(SubAccountData subAccountData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(subAccountData.behavior, new Behavior(0, 0, 3, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, Behavior$$serializer.INSTANCE, subAccountData.behavior);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(subAccountData.list, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], subAccountData.list);
    }

    public SubAccountData(@NotNull Behavior behavior, @NotNull ArrayList<SubAccount> arrayList) {
        Intrinsics.checkNotNullParameter(behavior, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.behavior = behavior;
        this.list = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.account.api.model.subaccount.Behavior:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.account.api.model.subaccount.Behavior:0x0009: CONSTRUCTOR 
  (0 int)
  (0 int)
  (3 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:9) call: com.okinc.account.api.model.subaccount.Behavior.<init>(int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r3v0 com.okinc.account.api.model.subaccount.Behavior))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0012: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:10) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r4v0 java.util.ArrayList))
 A[MD:(com.okinc.account.api.model.subaccount.Behavior, java.util.ArrayList<com.okinc.account.api.model.subaccount.SubAccount>):void (m)] (LINE:8) call: com.okinc.account.api.model.subaccount.SubAccountData.<init>(com.okinc.account.api.model.subaccount.Behavior, java.util.ArrayList):void type: THIS */
    public /* synthetic */ SubAccountData(Behavior behavior, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Behavior(0, 0, 3, (DefaultConstructorMarker) null) : behavior, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
