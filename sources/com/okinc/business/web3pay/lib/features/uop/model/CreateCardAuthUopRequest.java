package com.okinc.business.web3pay.lib.features.uop.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateCardAuthUopRequest implements Parcelable {
    private final List<CardAuthAuthorizeInfo> authorizeList;
    private final int projectId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CreateCardAuthUopRequest> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CardAuthAuthorizeInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<CreateCardAuthUopRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateCardAuthUopRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CardAuthAuthorizeInfo.CREATOR.createFromParcel(parcel));
            }
            return new CreateCardAuthUopRequest(arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreateCardAuthUopRequest[] newArray(int i) {
            return new CreateCardAuthUopRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateCardAuthUopRequest copy$default(CreateCardAuthUopRequest createCardAuthUopRequest, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = createCardAuthUopRequest.authorizeList;
        }
        if ((i2 & 2) != 0) {
            i = createCardAuthUopRequest.projectId;
        }
        return createCardAuthUopRequest.copy(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardAuthAuthorizeInfo> component1() {
        return this.authorizeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateCardAuthUopRequest copy(@NotNull List<CardAuthAuthorizeInfo> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CreateCardAuthUopRequest(list, i);
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
        if (!(obj instanceof CreateCardAuthUopRequest)) {
            return false;
        }
        CreateCardAuthUopRequest createCardAuthUopRequest = (CreateCardAuthUopRequest) obj;
        return Intrinsics.EZpvd(this.authorizeList, createCardAuthUopRequest.authorizeList) && this.projectId == createCardAuthUopRequest.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardAuthAuthorizeInfo> getAuthorizeList() {
        return this.authorizeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.authorizeList.hashCode() * 31) + Integer.hashCode(this.projectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateCardAuthUopRequest(authorizeList=" + this.authorizeList + ", projectId=" + this.projectId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CardAuthAuthorizeInfo> list = this.authorizeList;
        parcel.writeInt(list.size());
        Iterator<CardAuthAuthorizeInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.projectId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateCardAuthUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateCardAuthUopRequest> serializer() {
            return CreateCardAuthUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateCardAuthUopRequest(int i, List list, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CreateCardAuthUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.authorizeList = list;
        this.projectId = i2;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateCardAuthUopRequest createCardAuthUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], createCardAuthUopRequest.authorizeList);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createCardAuthUopRequest.projectId);
    }

    public CreateCardAuthUopRequest(@NotNull List<CardAuthAuthorizeInfo> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.authorizeList = list;
        this.projectId = i;
    }
}
