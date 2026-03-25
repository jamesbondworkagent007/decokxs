package com.okinc.affiliate.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class BindPayoutWalletInput implements Parcelable {
    private SetPayoutWalletFromPageEnum enterFrom;
    private boolean needEmptyPage;
    private boolean showLanding;
    private boolean showWalletList;
    private List<PayoutWalletAccount> walletAccounts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BindPayoutWalletInput> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(PayoutWalletAccount$$serializer.INSTANCE), null, null, null, SetPayoutWalletFromPageEnum.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<BindPayoutWalletInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindPayoutWalletInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PayoutWalletAccount.CREATOR.createFromParcel(parcel));
            }
            return new BindPayoutWalletInput(arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, SetPayoutWalletFromPageEnum.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindPayoutWalletInput[] newArray(int i) {
            return new BindPayoutWalletInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.affiliate.bean.BindPayoutWalletInput */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindPayoutWalletInput copy$default(BindPayoutWalletInput bindPayoutWalletInput, List list, boolean z, boolean z2, boolean z3, SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bindPayoutWalletInput.walletAccounts;
        }
        if ((i & 2) != 0) {
            z = bindPayoutWalletInput.showLanding;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = bindPayoutWalletInput.needEmptyPage;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = bindPayoutWalletInput.showWalletList;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            setPayoutWalletFromPageEnum = bindPayoutWalletInput.enterFrom;
        }
        return bindPayoutWalletInput.copy(list, z4, z5, z6, setPayoutWalletFromPageEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PayoutWalletAccount> component1() {
        return this.walletAccounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showLanding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.needEmptyPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showWalletList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetPayoutWalletFromPageEnum component5() {
        return this.enterFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindPayoutWalletInput copy(@NotNull List<PayoutWalletAccount> list, boolean z, boolean z2, boolean z3, @NotNull SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setPayoutWalletFromPageEnum, "");
        return new BindPayoutWalletInput(list, z, z2, z3, setPayoutWalletFromPageEnum);
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
        if (!(obj instanceof BindPayoutWalletInput)) {
            return false;
        }
        BindPayoutWalletInput bindPayoutWalletInput = (BindPayoutWalletInput) obj;
        return Intrinsics.EZpvd(this.walletAccounts, bindPayoutWalletInput.walletAccounts) && this.showLanding == bindPayoutWalletInput.showLanding && this.needEmptyPage == bindPayoutWalletInput.needEmptyPage && this.showWalletList == bindPayoutWalletInput.showWalletList && this.enterFrom == bindPayoutWalletInput.enterFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetPayoutWalletFromPageEnum getEnterFrom() {
        return this.enterFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedEmptyPage() {
        return this.needEmptyPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowLanding() {
        return this.showLanding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowWalletList() {
        return this.showWalletList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PayoutWalletAccount> getWalletAccounts() {
        return this.walletAccounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.walletAccounts.hashCode() * 31) + Boolean.hashCode(this.showLanding)) * 31) + Boolean.hashCode(this.needEmptyPage)) * 31) + Boolean.hashCode(this.showWalletList)) * 31) + this.enterFrom.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnterFrom(@NotNull SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum) {
        Intrinsics.checkNotNullParameter(setPayoutWalletFromPageEnum, "");
        this.enterFrom = setPayoutWalletFromPageEnum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedEmptyPage(boolean z) {
        this.needEmptyPage = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowLanding(boolean z) {
        this.showLanding = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowWalletList(boolean z) {
        this.showWalletList = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAccounts(@NotNull List<PayoutWalletAccount> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAccounts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BindPayoutWalletInput(walletAccounts=" + this.walletAccounts + ", showLanding=" + this.showLanding + ", needEmptyPage=" + this.needEmptyPage + ", showWalletList=" + this.showWalletList + ", enterFrom=" + this.enterFrom + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<PayoutWalletAccount> list = this.walletAccounts;
        parcel.writeInt(list.size());
        Iterator<PayoutWalletAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.showLanding ? 1 : 0);
        parcel.writeInt(this.needEmptyPage ? 1 : 0);
        parcel.writeInt(this.showWalletList ? 1 : 0);
        this.enterFrom.writeToParcel(parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.affiliate.bean.BindPayoutWalletInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BindPayoutWalletInput> serializer() {
            return BindPayoutWalletInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BindPayoutWalletInput(int i, List list, boolean z, boolean z2, boolean z3, SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum, SerializationConstructorMarker serializationConstructorMarker) {
        if (19 != (i & 19)) {
            PluginExceptionsKt.throwMissingFieldException(i, 19, BindPayoutWalletInput$$serializer.INSTANCE.getDescriptor());
        }
        this.walletAccounts = list;
        this.showLanding = z;
        if ((i & 4) == 0) {
            this.needEmptyPage = false;
        } else {
            this.needEmptyPage = z2;
        }
        if ((i & 8) == 0) {
            this.showWalletList = true;
        } else {
            this.showWalletList = z3;
        }
        this.enterFrom = setPayoutWalletFromPageEnum;
    }

    public static final /* synthetic */ void write$Self$OKAffiliate_affiliate_api(BindPayoutWalletInput bindPayoutWalletInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], bindPayoutWalletInput.walletAccounts);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, bindPayoutWalletInput.showLanding);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bindPayoutWalletInput.needEmptyPage) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, bindPayoutWalletInput.needEmptyPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !bindPayoutWalletInput.showWalletList) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, bindPayoutWalletInput.showWalletList);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], bindPayoutWalletInput.enterFrom);
    }

    public BindPayoutWalletInput(@NotNull List<PayoutWalletAccount> list, boolean z, boolean z2, boolean z3, @NotNull SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(setPayoutWalletFromPageEnum, "");
        this.walletAccounts = list;
        this.showLanding = z;
        this.needEmptyPage = z2;
        this.showWalletList = z3;
        this.enterFrom = setPayoutWalletFromPageEnum;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 java.util.List)
  (r8v0 boolean)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (r11v0 com.okinc.affiliate.bean.SetPayoutWalletFromPageEnum)
 A[MD:(java.util.List<com.okinc.affiliate.bean.PayoutWalletAccount>, boolean, boolean, boolean, com.okinc.affiliate.bean.SetPayoutWalletFromPageEnum):void (m)] (LINE:26) call: com.okinc.affiliate.bean.BindPayoutWalletInput.<init>(java.util.List, boolean, boolean, boolean, com.okinc.affiliate.bean.SetPayoutWalletFromPageEnum):void type: THIS */
    public /* synthetic */ BindPayoutWalletInput(List list, boolean z, boolean z2, boolean z3, SetPayoutWalletFromPageEnum setPayoutWalletFromPageEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? true : z3, setPayoutWalletFromPageEnum);
    }
}
